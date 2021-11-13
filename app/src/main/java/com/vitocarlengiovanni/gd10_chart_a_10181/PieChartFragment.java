package com.vitocarlengiovanni.gd10_chart_a_10181;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.anychart.AnyChart;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.chart.common.listener.Event;
import com.anychart.chart.common.listener.ListenersInterface;
import com.anychart.charts.Pie;
import com.anychart.enums.Align;
import com.anychart.enums.LegendLayout;

import java.util.ArrayList;
import java.util.List;

public class PieChartFragment extends TemplateFragment {
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // objek pie chartnya
        Pie pie = AnyChart.pie();

        pie.setOnClickListener(new ListenersInterface.OnClickListener(new String[]{"x", "value"}) {
            @Override
            public void onClick(Event event) {
                String str = event.getData().get("x") + ":" + event.getData().get("value");
                Toast.makeText(getContext(), str, Toast.LENGTH_SHORT).show();
            }
        });

        // buat data dummy nya
        List<DataEntry> data = new ArrayList<>();

        data.add(new ValueDataEntry("Peer korea", 15000));
        data.add(new ValueDataEntry("Apel China", 17500));
        data.add(new ValueDataEntry("Anggur Australia", 10000));
        data.add(new ValueDataEntry("Pisang Cavendish", 20000));
        data.add(new ValueDataEntry("Jeruk Mandarin", 275000));

        pie.data(data);

        pie.title("Total Buah Import pada Tahun 2077 (kg)");
        pie.labels().position("outside");
        pie.legend().title().enabled(true);
        pie.legend().title().text("Nama Buah").padding(0d, 0d, 10d, 0d);

        pie.legend().position("center-bottom").itemsLayout(LegendLayout.HORIZONTAL).align(Align.CENTER);

        // disini baru pie chartnya dipasang ke bindingnya
        binding.chart.setChart(pie);
    }
}
