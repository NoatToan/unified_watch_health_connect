package com.xiaomi.fitness.chart.barchart;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.a52;

/* JADX INFO: loaded from: classes7.dex */
public class SpeedRatioLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a52 f11744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f11745b;
    public double c;

    public SpeedRatioLayoutManager(Context context, a52 a52Var) {
        super(context);
        this.c = -1.0d;
        this.f11744a = a52Var;
        setOrientation(a52Var.i);
        Logger.d("SpeedRatioLayoutManager", "layoutManagerReverseLayout:" + this.f11744a.j);
        setReverseLayout(this.f11744a.j);
        this.f11745b = this.f11744a.h;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollVertically() {
        return false;
    }

    public void k() {
        double d = this.c;
        if (d > -1.0d) {
            this.f11745b = d;
        } else {
            this.f11745b = this.f11744a.h;
        }
    }

    public void l(double d) {
        this.f11745b = d;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int scrollHorizontallyBy(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        double d = i;
        int iScrollHorizontallyBy = super.scrollHorizontallyBy((int) (this.f11745b * d), uVar, zVar);
        return iScrollHorizontallyBy == ((int) (this.f11745b * d)) ? i : iScrollHorizontallyBy;
    }

    public SpeedRatioLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = -1.0d;
    }
}
