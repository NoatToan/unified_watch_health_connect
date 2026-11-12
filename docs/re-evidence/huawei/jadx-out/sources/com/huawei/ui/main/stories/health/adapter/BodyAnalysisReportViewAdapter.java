package com.huawei.ui.main.stories.health.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.interactors.healthdata.BodyReportRecycleItem;
import defpackage.njy;
import defpackage.vfj;
import defpackage.vfm;
import health.compact.a.Utils;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class BodyAnalysisReportViewAdapter extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f27709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<BodyReportRecycleItem> f27710c;

    public BodyAnalysisReportViewAdapter(Context context, List<BodyReportRecycleItem> list) {
        this.f27709b = context;
        this.f27710c = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (viewGroup == null) {
            return null;
        }
        if (i == 0) {
            return new d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_body_analysis_report_item, viewGroup, false));
        }
        if (i == 1) {
            return new d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_body_analysis_oversea_report_item, viewGroup, false));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (!(viewHolder instanceof d) || njy.e(this.f27710c, i)) {
            return;
        }
        vfm vfmVarD = vfj.d(this.f27709b, this.f27710c.get(i));
        if (vfmVarD == null) {
            return;
        }
        d dVar = (d) viewHolder;
        dVar.f27711a.setText(vfmVarD.d());
        dVar.f27712c.setText(vfmVarD.b());
        View viewE = vfmVarD.e();
        if (viewE != null) {
            dVar.e.addView(viewE);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<BodyReportRecycleItem> list = this.f27710c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return (Utils.o() && njy.c(this.f27710c, i) && BodyReportRecycleItem.BodyReportType.BODY_ANALYSIS.equals(this.f27710c.get(i).e())) ? 1 : 0;
    }

    static class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f27711a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f27712c;
        private LinearLayout e;

        d(View view) {
            super(view);
            this.f27711a = (HealthTextView) view.findViewById(R.id.body_report_item_name);
            this.f27712c = (HealthTextView) view.findViewById(R.id.body_report_item_unit);
            this.e = (LinearLayout) view.findViewById(R.id.body_report_item_detail_container);
        }
    }
}
