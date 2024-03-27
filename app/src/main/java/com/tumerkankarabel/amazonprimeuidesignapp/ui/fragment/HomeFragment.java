package com.tumerkankarabel.amazonprimeuidesignapp.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tumerkankarabel.amazonprimeuidesignapp.data.entity.Series;
import com.tumerkankarabel.amazonprimeuidesignapp.databinding.FragmentHomeBinding;
import com.tumerkankarabel.amazonprimeuidesignapp.ui.adapter.ContinueWatchingAdapter;
import com.tumerkankarabel.amazonprimeuidesignapp.ui.adapter.OriginalsAdapter;
import com.tumerkankarabel.amazonprimeuidesignapp.ui.adapter.SeriesAdapter;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);

        binding.rvSeries.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));

        binding.rvContinueWatching.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));

        binding.rvOriginals.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));

        ArrayList<Series> seriesList = new ArrayList<>();
        ArrayList<Series> contWatchSeriesList = new ArrayList<>();
        ArrayList<Series> originalsSeriesList = new ArrayList<>();

        Series s1 = new Series(1,"euphoria");
        Series s2 = new Series(2,"thelordoftheringstheringsofpower");
        Series s3 = new Series(3,"voltairelist");
        Series s4 = new Series(4,"theperipheral");
        Series s5 = new Series(5,"themaininthehighcastle");
        Series s6 = new Series(6,"theboys");

        Series s7 = new Series(7,"supernatural");
        Series s8 = new Series(8,"fearthewalkingdead");
        Series s9 = new Series(9,"invincible");
        Series s10 = new Series(10,"goodomens");
        Series s11 = new Series(11,"redqueen");
        Series s12 = new Series(12,"thesummeriturnedpretty");

        Series s13 = new Series(13,"thewheeloftime");
        Series s14 = new Series(14,"upload");
        Series s15 = new Series(15,"vampirediaries");
        Series s16 = new Series(16,"succession");
        Series s17 = new Series(17,"zthebeginningofeverything");
        Series s18 = new Series(18,"fleabag");

        seriesList.add(s1);
        seriesList.add(s2);
        seriesList.add(s3);
        seriesList.add(s4);
        seriesList.add(s5);
        seriesList.add(s6);

        contWatchSeriesList.add(s7);
        contWatchSeriesList.add(s8);
        contWatchSeriesList.add(s9);
        contWatchSeriesList.add(s10);
        contWatchSeriesList.add(s11);
        contWatchSeriesList.add(s12);

        originalsSeriesList.add(s13);
        originalsSeriesList.add(s14);
        originalsSeriesList.add(s15);
        originalsSeriesList.add(s16);
        originalsSeriesList.add(s17);
        originalsSeriesList.add(s18);

        SeriesAdapter seriesAdapter = new SeriesAdapter(requireContext(),seriesList);
        binding.rvSeries.setAdapter(seriesAdapter);

        ContinueWatchingAdapter continueWatchingAdapter = new ContinueWatchingAdapter(requireContext(),contWatchSeriesList);
        binding.rvContinueWatching.setAdapter(continueWatchingAdapter);

        OriginalsAdapter originalsAdapter = new OriginalsAdapter(requireContext(),originalsSeriesList);
        binding.rvOriginals.setAdapter(originalsAdapter);

        return binding.getRoot();
    }
}