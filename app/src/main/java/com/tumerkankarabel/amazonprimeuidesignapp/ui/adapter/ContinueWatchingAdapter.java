package com.tumerkankarabel.amazonprimeuidesignapp.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.tumerkankarabel.amazonprimeuidesignapp.data.entity.Series;
import com.tumerkankarabel.amazonprimeuidesignapp.databinding.CardDesignContinueBinding;

import java.util.List;

public class ContinueWatchingAdapter extends RecyclerView.Adapter<ContinueWatchingAdapter.CardDesignHolder> {
    private Context mContext;
    private List<Series> seriesList;

    public ContinueWatchingAdapter(Context mContext, List<Series> seriesList) {
        this.mContext = mContext;
        this.seriesList = seriesList;
    }

    public class CardDesignHolder extends RecyclerView.ViewHolder {
        private CardDesignContinueBinding designContinueBinding;

        public CardDesignHolder(CardDesignContinueBinding designContinueBinding) {
            super(designContinueBinding.getRoot());
            this.designContinueBinding = designContinueBinding;
        }
    }

    @NonNull
    @Override
    public CardDesignHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardDesignContinueBinding binding = CardDesignContinueBinding.inflate(
                LayoutInflater.from(mContext),parent, false);
        return new CardDesignHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardDesignHolder holder, int position) {
        Series serie = seriesList.get(position);
        CardDesignContinueBinding d = holder.designContinueBinding;

        d.imageViewContinue.setImageResource(
                mContext.getResources()
                        .getIdentifier(serie.getImg(),"drawable",mContext.getPackageName()));
    }

    @Override
    public int getItemCount() {
        return seriesList.size();
    }
}
