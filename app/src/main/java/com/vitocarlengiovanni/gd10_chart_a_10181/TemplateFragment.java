package com.vitocarlengiovanni.gd10_chart_a_10181;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vitocarlengiovanni.gd10_chart_a_10181.databinding.FragmentTemplateBinding;

public class TemplateFragment extends Fragment {

    // binding untuk fragment di initialize di onCreateView
    protected FragmentTemplateBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentTemplateBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.chart.setProgressBar(binding.progressbar);
    }

    // jangan lupa set binding menjadi null apabila digunakan di fragment
    // agar tidak terjadi memory leak
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}