package com.xiaomi.fitness.health.hrm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.barchart.itemdecoration.EcgChartItemDecoration;
import com.xiaomi.fitness.chart.entrys.EcgEntry;
import com.xiaomi.fitness.chart.view.LineChartRecyclerView;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.data.valueformatter.RateHighLightMarkValueFormatter;
import defpackage.g8a;
import defpackage.onq;
import defpackage.q02;
import defpackage.rtr;
import defpackage.vbj;
import defpackage.vfe;
import defpackage.vqr;
import defpackage.yqr;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
public class HrmEcgFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g8a f12251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LineChartRecyclerView f12252b;
    public q02 c;
    public List<EcgEntry> d;
    public EcgChartItemDecoration e;
    public rtr f;
    public vqr g;
    public onq h;
    public int i;
    public vfe j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f12253k;

    private void A(int i) {
        vqr vqrVar = new vqr(this.j, i);
        this.g = vqrVar;
        this.c.setXAxis(vqrVar);
    }

    private void initData() {
        this.f12252b.post(new Runnable() { // from class: vdc
            @Override // java.lang.Runnable
            public final void run() {
                this.f36770a.y();
            }
        });
    }

    private void initView() {
        LineChartRecyclerView lineChartRecyclerView = this.f12251a.B;
        this.f12252b = lineChartRecyclerView;
        this.j = (vfe) lineChartRecyclerView.mAttrs;
    }

    private void w(List<EcgEntry> list) {
        List<EcgEntry> list2 = this.d;
        if (list2 == null) {
            this.d = new ArrayList();
        } else {
            list2.clear();
        }
        this.d.addAll(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y() {
        this.i = x();
        this.h = new yqr();
        this.d = new ArrayList();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.j);
        this.f = new rtr(this.j);
        this.g = new vqr(this.j, this.i, this.h);
        EcgChartItemDecoration ecgChartItemDecoration = new EcgChartItemDecoration(this.f, this.g, this.j);
        this.e = ecgChartItemDecoration;
        this.f12252b.addItemDecoration(ecgChartItemDecoration);
        q02 q02Var = new q02(getActivity(), this.d, this.f12252b, this.g, this.j, new RateHighLightMarkValueFormatter(0));
        this.c = q02Var;
        this.f12252b.setAdapter(q02Var);
        this.f12252b.setLayoutManager(speedRatioLayoutManager);
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(LocalDate.now().plusDays(1));
        int i = this.i;
        long j = jChangZeroOfTheDay - (((long) i) * 18000);
        this.f12253k = j;
        w(vbj.a(this.j, j, i * 5, this.d.size()));
        A(this.i);
        z();
    }

    private void z() {
        this.f12252b.scrollToPosition(0);
        rtr rtrVar = this.f;
        rtr rtrVarI = rtrVar.i(rtrVar);
        this.c.notifyDataSetChanged();
        if (rtrVarI != null) {
            this.f = rtrVarI;
            this.e.setYAxis(rtrVarI);
            this.c.setYAxis(this.f);
        }
        this.c.setYAxis(this.f);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    public View onInflateView(@Nullable LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Objects.requireNonNull(layoutInflater);
        g8a g8aVarA0 = g8a.A0(layoutInflater, viewGroup, false);
        this.f12251a = g8aVarA0;
        return g8aVarA0.getRoot();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        initView();
        initData();
    }

    public final int x() {
        return (int) ((this.f12252b.c() / (this.f12252b.a() / 6.0f)) * 5.0f);
    }
}
