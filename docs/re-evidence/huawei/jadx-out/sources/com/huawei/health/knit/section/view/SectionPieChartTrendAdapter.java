package com.huawei.health.knit.section.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.chart.HealthTrendBarChart;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.njy;
import defpackage.qsp;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SectionPieChartTrendAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<a> f7878a = new ArrayList();
    private final Context e;

    public SectionPieChartTrendAdapter(Context context) {
        this.e = context;
    }

    public void b(List<a> list) {
        this.f7878a.clear();
        this.f7878a.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.e).inflate(R.layout.section_pie_trend_row, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        if (njy.e(this.f7878a, i)) {
            return;
        }
        viewHolder.a(this.f7878a.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f7878a.size();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f7881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HealthTrendBarChart.e f7882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f7883c;
        private final HealthTrendBarChart.e e;

        public a(String str, String str2, HealthTrendBarChart.e eVar, HealthTrendBarChart.e eVar2) {
            this.f7883c = str;
            this.f7881a = str2;
            this.e = eVar;
            this.f7882b = eVar2;
        }
    }

    protected static final class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HealthTrendBarChart f7879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HealthTextView f7880b;
        private final HealthTextView d;

        public ViewHolder(View view) {
            super(view);
            this.f7880b = (HealthTextView) view.findViewById(R.id.title);
            this.d = (HealthTextView) view.findViewById(R.id.subTitle);
            this.f7879a = (HealthTrendBarChart) view.findViewById(R.id.barChart);
        }

        public void a(a aVar) {
            qsp.b(this.f7880b, aVar.f7883c);
            qsp.b(this.d, aVar.f7881a);
            HealthTrendBarChart healthTrendBarChart = this.f7879a;
            if (healthTrendBarChart != null) {
                healthTrendBarChart.setValues(aVar.e, aVar.f7882b);
            }
        }
    }
}
