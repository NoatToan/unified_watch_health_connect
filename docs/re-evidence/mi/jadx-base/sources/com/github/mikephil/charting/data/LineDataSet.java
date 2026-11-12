package com.github.mikephil.charting.data;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import defpackage.ege;
import defpackage.fmq;
import defpackage.ktc;
import defpackage.msc;
import defpackage.zu5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class LineDataSet extends ege<Entry> implements ktc {
    public Mode F;
    public List<Integer> G;
    public int H;
    public float I;
    public float J;
    public float K;
    public DashPathEffect L;
    public msc M;
    public boolean N;
    public boolean O;

    public enum Mode {
        LINEAR,
        STEPPED,
        CUBIC_BEZIER,
        HORIZONTAL_BEZIER
    }

    public LineDataSet(List<Entry> list, String str) {
        super(list, str);
        this.F = Mode.LINEAR;
        this.G = null;
        this.H = -1;
        this.I = 8.0f;
        this.J = 4.0f;
        this.K = 0.2f;
        this.L = null;
        this.M = new zu5();
        this.N = true;
        this.O = true;
        if (this.G == null) {
            this.G = new ArrayList();
        }
        this.G.clear();
        this.G.add(Integer.valueOf(Color.rgb(140, 234, 255)));
    }

    public void A1(boolean z) {
        this.O = z;
    }

    @Override // defpackage.ktc
    public msc B() {
        return this.M;
    }

    @Override // defpackage.ktc
    public float B0() {
        return this.I;
    }

    public void B1(boolean z) {
        this.N = z;
    }

    public void C1(msc mscVar) {
        if (mscVar == null) {
            this.M = new zu5();
        } else {
            this.M = mscVar;
        }
    }

    public void D1(Mode mode) {
        this.F = mode;
    }

    @Override // defpackage.ktc
    public DashPathEffect F() {
        return this.L;
    }

    @Override // defpackage.ktc
    public int P(int i) {
        return this.G.get(i).intValue();
    }

    @Override // defpackage.ktc
    public boolean Q() {
        return this.N;
    }

    @Override // defpackage.ktc
    public boolean R0() {
        return this.O;
    }

    @Override // defpackage.ktc
    public float S() {
        return this.J;
    }

    @Override // defpackage.ktc
    public float c0() {
        return this.K;
    }

    @Override // defpackage.ktc
    public boolean d() {
        return this.L != null;
    }

    @Override // defpackage.ktc
    public int f() {
        return this.H;
    }

    @Override // defpackage.ktc
    public Mode getMode() {
        return this.F;
    }

    @Override // defpackage.ktc
    @Deprecated
    public boolean o0() {
        return this.F == Mode.STEPPED;
    }

    public void t1() {
        this.L = null;
    }

    public void u1() {
        if (this.G == null) {
            this.G = new ArrayList();
        }
        this.G.clear();
    }

    public void v1(int i) {
        u1();
        this.G.add(Integer.valueOf(i));
    }

    public void w1(int i) {
        this.H = i;
    }

    @Override // defpackage.ktc
    public int x() {
        return this.G.size();
    }

    public void x1(float f) {
        if (f >= 0.5f) {
            this.J = fmq.e(f);
        }
    }

    public void y1(float f) {
        if (f >= 1.0f) {
            this.I = fmq.e(f);
        }
    }

    public void z1(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f < 0.05f) {
            f = 0.05f;
        }
        this.K = f;
    }
}
