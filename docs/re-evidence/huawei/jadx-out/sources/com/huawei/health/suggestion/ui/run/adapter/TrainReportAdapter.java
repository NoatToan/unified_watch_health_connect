package com.huawei.health.suggestion.ui.run.adapter;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.PlanRecord;
import com.huawei.health.plan.model.PlanStat;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.run.holder.BaseReportHolder;
import com.huawei.health.suggestion.ui.run.holder.ReportBestHolder;
import com.huawei.health.suggestion.ui.run.holder.ReportChartHolder;
import com.huawei.health.suggestion.ui.run.holder.ReportFootHolder;
import com.huawei.health.suggestion.ui.run.holder.ReportHeaderHolder;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.njy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class TrainReportAdapter extends RecyclerView.Adapter<BaseReportHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LayoutInflater f9995a;
    private List<Pair<Integer, Object>> d = new ArrayList(10);

    public TrainReportAdapter(Context context, Plan plan, PlanStat planStat, PlanRecord planRecord, List<WorkoutRecord> list) {
        this.f9995a = LayoutInflater.from(context);
        b(1, ReportHeaderHolder.b(context, plan, planRecord));
        b(2, ReportChartHolder.c(context, plan, list).toArray());
        b(3, ReportBestHolder.a(context, plan, planStat).toArray());
        if (plan.acquireType() != 3) {
            b(4, ReportFootHolder.b(context, plan, planStat, planRecord));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public BaseReportHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new ReportHeaderHolder(this.f9995a.inflate(R.layout.sug_report_rv_item_header, viewGroup, false));
        }
        if (i == 2) {
            return new ReportChartHolder(this.f9995a.inflate(R.layout.sug_item_report_chart, viewGroup, false));
        }
        if (i == 3) {
            return new ReportBestHolder(this.f9995a.inflate(R.layout.sug_item_report_best, viewGroup, false));
        }
        return new ReportFootHolder(this.f9995a.inflate(R.layout.sug_item_report_footer, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(BaseReportHolder baseReportHolder, int i) {
        if (baseReportHolder == null) {
            LogUtil.j("Suggestion_TrainReportAdapter", "onBindViewHolder holder == null");
        } else if (!njy.c(this.d, i)) {
            LogUtil.j("Suggestion_TrainReportAdapter", "out of position");
        } else {
            baseReportHolder.bindDataToView(this.d.get(i).second);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (njy.c(this.d, i)) {
            return ((Integer) this.d.get(i).first).intValue();
        }
        LogUtil.j("Suggestion_TrainReportAdapter", "getItemViewType out of position");
        return 0;
    }

    private void b(int i, Object... objArr) {
        for (Object obj : objArr) {
            this.d.add(new Pair<>(Integer.valueOf(i), obj));
        }
    }
}
