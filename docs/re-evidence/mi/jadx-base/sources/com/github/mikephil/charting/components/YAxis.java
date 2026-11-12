package com.github.mikephil.charting.components;

import android.graphics.Paint;
import defpackage.fmq;
import defpackage.ft1;

/* JADX INFO: loaded from: classes4.dex */
public class YAxis extends ft1 {
    public AxisDependency m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7792a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7793b = true;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public int g = -7829368;
    public float h = 1.0f;
    public float i = 10.0f;
    public float j = 10.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public YAxisLabelPosition f7794k = YAxisLabelPosition.OUTSIDE_CHART;
    public float l = 0.0f;
    public float n = 0.0f;
    public float o = Float.POSITIVE_INFINITY;

    public enum AxisDependency {
        LEFT,
        RIGHT
    }

    public enum YAxisLabelPosition {
        OUTSIDE_CHART,
        INSIDE_CHART
    }

    public YAxis(AxisDependency axisDependency) {
        this.m = axisDependency;
        this.mYOffset = 0.0f;
    }

    public AxisDependency a() {
        return this.m;
    }

    public YAxisLabelPosition b() {
        return this.f7794k;
    }

    public float c() {
        return this.l;
    }

    @Override // defpackage.ft1
    public void calculate(float f, float f2) {
        if (f <= f2) {
            f2 = f;
            f = f2;
        } else {
            boolean z = this.mCustomAxisMax;
            if (!z || !this.mCustomAxisMin) {
                if (z) {
                    f = f2 < 0.0f ? 1.5f * f2 : 0.5f * f2;
                } else if (this.mCustomAxisMin) {
                    f2 = f;
                    f = f < 0.0f ? 0.5f * f : f * 1.5f;
                }
                f2 = f;
                f = f2;
            }
        }
        if (Math.abs(f - f2) == 0.0f) {
            f += 1.0f;
            f2 -= 1.0f;
        }
        float fAbs = Math.abs(f - f2);
        this.mAxisMinimum = this.mCustomAxisMin ? this.mAxisMinimum : f2 - ((fAbs / 100.0f) * h());
        float fI = this.mCustomAxisMax ? this.mAxisMaximum : f + ((fAbs / 100.0f) * i());
        this.mAxisMaximum = fI;
        this.mAxisRange = Math.abs(this.mAxisMinimum - fI);
    }

    public float d() {
        return this.o;
    }

    public float e() {
        return this.n;
    }

    public float f(Paint paint) {
        paint.setTextSize(this.mTextSize);
        return fmq.a(paint, getLongestLabel()) + (getYOffset() * 2.0f);
    }

    public float g(Paint paint) {
        paint.setTextSize(this.mTextSize);
        float fD = fmq.d(paint, getLongestLabel()) + (getXOffset() * 2.0f);
        float fE = e();
        float fD2 = d();
        if (fE > 0.0f) {
            fE = fmq.e(fE);
        }
        if (fD2 > 0.0f && fD2 != Float.POSITIVE_INFINITY) {
            fD2 = fmq.e(fD2);
        }
        if (fD2 <= 0.0d) {
            fD2 = fD;
        }
        return Math.max(fE, Math.min(fD, fD2));
    }

    public float h() {
        return this.j;
    }

    public float i() {
        return this.i;
    }

    public int j() {
        return this.g;
    }

    public float k() {
        return this.h;
    }

    public boolean l() {
        return this.f7792a;
    }

    public boolean m() {
        return this.f7793b;
    }

    public boolean n() {
        return this.d;
    }

    public boolean o() {
        return this.c;
    }

    public boolean p() {
        return isEnabled() && isDrawLabelsEnabled() && b() == YAxisLabelPosition.OUTSIDE_CHART;
    }

    public void q(boolean z) {
        this.d = z;
    }

    public void r(boolean z) {
        this.c = z;
    }

    public void s(float f) {
        this.l = f;
    }

    public void t(float f) {
        this.n = f;
    }

    public void u(YAxisLabelPosition yAxisLabelPosition) {
        this.f7794k = yAxisLabelPosition;
    }

    public void v(float f) {
        this.j = f;
    }

    public void w(float f) {
        this.i = f;
    }
}
