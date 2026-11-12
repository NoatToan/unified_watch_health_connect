package com.xiaomi.fitness.health.hrm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.EcgEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.data.valueformatter.RateHighLightMarkValueFormatter;
import defpackage.e8a;
import defpackage.onq;
import defpackage.q02;
import defpackage.r02;
import defpackage.rtr;
import defpackage.s02;
import defpackage.vbj;
import defpackage.vqr;
import defpackage.yqr;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
public class HrmEcgBarFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e8a f12248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BarChartRecyclerView f12249b;
    public q02 c;
    public List<EcgEntry> d;
    public s02 e;
    public rtr f;
    public vqr g;
    public onq h;
    public int i;
    public r02 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f12250k;

    private void initData() {
        this.f12249b.post(new Runnable() { // from class: udc
            @Override // java.lang.Runnable
            public final void run() {
                this.f35657a.x();
            }
        });
    }

    private void initView() {
        BarChartRecyclerView barChartRecyclerView = this.f12248a.B;
        this.f12249b = barChartRecyclerView;
        this.j = (r02) barChartRecyclerView.mAttrs;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    public View onInflateView(@Nullable LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Objects.requireNonNull(layoutInflater);
        e8a e8aVarA0 = e8a.A0(layoutInflater, viewGroup, false);
        this.f12248a = e8aVarA0;
        return e8aVarA0.getRoot();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        initView();
        initData();
    }

    public final void w(List<EcgEntry> list) {
        List<EcgEntry> list2 = this.d;
        if (list2 == null) {
            this.d = new ArrayList();
        } else {
            list2.clear();
        }
        this.d.addAll(list);
    }

    public final /* synthetic */ void x() {
        this.i = 100;
        this.h = new yqr();
        this.d = new ArrayList();
        SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(getActivity(), this.j);
        this.f = new rtr(this.j);
        vqr vqrVar = new vqr(this.j, this.i, this.h);
        this.g = vqrVar;
        s02 s02Var = new s02(this.f, vqrVar, this.j);
        this.e = s02Var;
        this.f12249b.addItemDecoration(s02Var);
        q02 q02Var = new q02(getActivity(), this.d, this.f12249b, this.g, this.j, new RateHighLightMarkValueFormatter(0));
        this.c = q02Var;
        this.f12249b.setAdapter(q02Var);
        this.f12249b.setLayoutManager(speedRatioLayoutManager);
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(LocalDate.now().plusDays(1));
        int i = this.i;
        long j = jChangZeroOfTheDay - (((long) i) * 18000);
        this.f12250k = j;
        w(vbj.a(this.j, j, i * 5, this.d.size()));
        z(this.i);
        y();
    }

    public final void y() {
        this.f12249b.scrollToPosition(0);
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

    public final void z(int i) {
        vqr vqrVar = new vqr(this.j, i);
        this.g = vqrVar;
        this.c.setXAxis(vqrVar);
    }
}
