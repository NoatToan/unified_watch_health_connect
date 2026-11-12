package com.huawei.health.suggestion.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.suggestion.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.pdx;

/* JADX INFO: loaded from: classes9.dex */
public class RunPlanReportDisplayFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthRecycleView f9010a;
    private RunPlanReportAdapter e;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a("RunPlanReportDisplayFragment", "onCreateView");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_run_plan_report_layout, viewGroup, false);
        b(viewInflate);
        return viewInflate;
    }

    private void b(View view) {
        HealthRecycleView healthRecycleView = (HealthRecycleView) view.findViewById(R.id.detail_report_display_rcy);
        this.f9010a = healthRecycleView;
        healthRecycleView.setItemAnimator(null);
        this.f9010a.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        this.f9010a.setLayoutManager(linearLayoutManager);
    }

    public void a(UiCallback uiCallback) {
        RunPlanReportAdapter runPlanReportAdapter = this.e;
        if (runPlanReportAdapter != null) {
            runPlanReportAdapter.c(uiCallback);
        } else {
            LogUtil.e("RunPlanReportDisplayFragment", "mRunPlanReportAdapter is  null");
        }
    }

    public void d(pdx pdxVar) {
        if (pdxVar == null) {
            LogUtil.e("RunPlanReportDisplayFragment", "trainReportBean is null");
            return;
        }
        int i = pdxVar.j() == null ? 1 : 0;
        if (isAdded()) {
            if (this.e == null) {
                RunPlanReportAdapter runPlanReportAdapter = new RunPlanReportAdapter(i, getContext());
                this.e = runPlanReportAdapter;
                this.f9010a.setAdapter(runPlanReportAdapter);
            }
            this.e.d(pdxVar);
        }
    }
}
