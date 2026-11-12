package com.huawei.ui.main.stories.fitness.views.bloodsugar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import defpackage.njy;
import defpackage.qrs;
import defpackage.umd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class BloodSugarAnalysisSportAdapter extends RecyclerView.Adapter<BloodSugarAnalysisSportHolder> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<umd> f27198c = new ArrayList();

    public void d(List<umd> list) {
        if (njy.e(list)) {
            LogUtil.j("BloodSugarAnalysisSportAdapter", " setData list is null!");
            return;
        }
        this.f27198c.clear();
        this.f27198c.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public BloodSugarAnalysisSportHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewInflate;
        if (qrs.ac()) {
            viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.health_data_blood_sugar_analysis_sport_large, viewGroup, false);
        } else {
            viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.health_data_blood_sugar_analysis_sport_item, viewGroup, false);
        }
        return new BloodSugarAnalysisSportHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(BloodSugarAnalysisSportHolder bloodSugarAnalysisSportHolder, int i) {
        if (njy.e(this.f27198c)) {
            LogUtil.j("BloodSugarAnalysisSportAdapter", " mDataList is null!");
        } else {
            if (i < 0 || this.f27198c.size() <= i) {
                return;
            }
            bloodSugarAnalysisSportHolder.a(this.f27198c.get(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f27198c.size();
    }
}
