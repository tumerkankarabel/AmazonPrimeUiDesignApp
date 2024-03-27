package com.tumerkankarabel.amazonprimeuidesignapp.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tumerkankarabel.amazonprimeuidesignapp.data.entity.Series;
import com.tumerkankarabel.amazonprimeuidesignapp.databinding.CardDesignOriginalsBinding;

import java.util.List;

public class OriginalsAdapter extends RecyclerView.Adapter<OriginalsAdapter.CardDesignHolder> {
    private Context mContext;
    private List<Series> seriesList;

    public OriginalsAdapter(Context mContext, List<Series> seriesList) {
        this.mContext = mContext;
        this.seriesList = seriesList;
    }

    public class CardDesignHolder extends RecyclerView.ViewHolder {
        private CardDesignOriginalsBinding designOriginalsBinding;

        public CardDesignHolder(CardDesignOriginalsBinding designOriginalsBinding) {
            super(designOriginalsBinding.getRoot());
            this.designOriginalsBinding = designOriginalsBinding;
        }
    }

    @NonNull
    @Override
    public CardDesignHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardDesignOriginalsBinding binding = CardDesignOriginalsBinding.inflate(
                LayoutInflater.from(mContext),parent, false);
        return new CardDesignHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardDesignHolder holder, int position) {
        Series serie = seriesList.get(position);
        CardDesignOriginalsBinding d = holder.designOriginalsBinding;

        d.imageViewOriginals.setImageResource(
                mContext.getResources()
                        .getIdentifier(serie.getImg(),"drawable",mContext.getPackageName()));
    }

    @Override
    public int getItemCount() {
        return seriesList.size();
    }
}
