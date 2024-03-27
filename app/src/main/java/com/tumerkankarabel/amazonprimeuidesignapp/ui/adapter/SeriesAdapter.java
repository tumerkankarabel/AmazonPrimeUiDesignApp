package com.tumerkankarabel.amazonprimeuidesignapp.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tumerkankarabel.amazonprimeuidesignapp.data.entity.Series;
import com.tumerkankarabel.amazonprimeuidesignapp.databinding.CardDesignSeriesBinding;

import java.util.List;

public class SeriesAdapter extends RecyclerView.Adapter<SeriesAdapter.CardDesignHolder> {
    private Context mContext;
    private List<Series> seriesList;

    public SeriesAdapter(Context mContext, List<Series> seriesList) {
        this.mContext = mContext;
        this.seriesList = seriesList;
    }

    public class CardDesignHolder extends RecyclerView.ViewHolder {
        private CardDesignSeriesBinding designSeriesBinding;

        public CardDesignHolder(CardDesignSeriesBinding designSeriesBinding) {
            super(designSeriesBinding.getRoot());
            this.designSeriesBinding = designSeriesBinding;
        }
    }

    @NonNull
    @Override
    public CardDesignHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardDesignSeriesBinding binding = CardDesignSeriesBinding.inflate(
                LayoutInflater.from(mContext),parent, false);
        return new CardDesignHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardDesignHolder holder, int position) {
        Series serie = seriesList.get(position);
        CardDesignSeriesBinding d = holder.designSeriesBinding;

        d.imageViewSeries.setImageResource(
                mContext.getResources()
                        .getIdentifier(serie.getImg(),"drawable",mContext.getPackageName()));
    }

    @Override
    public int getItemCount() {
        return seriesList.size();
    }
}
