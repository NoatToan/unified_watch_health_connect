package com.github.mikephil.charting.components;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import defpackage.fmq;
import defpackage.ka4;

/* JADX INFO: loaded from: classes4.dex */
public class LimitLine extends ka4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f7788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f7789b;
    public int c;
    public Paint.Style d;
    public String e;
    public DashPathEffect f;
    public LimitLabelPosition g;

    public enum LimitLabelPosition {
        LEFT_TOP,
        LEFT_BOTTOM,
        RIGHT_TOP,
        RIGHT_BOTTOM
    }

    public LimitLine(float f) {
        this.f7788a = 0.0f;
        this.f7789b = 2.0f;
        this.c = Color.rgb(237, 91, 91);
        this.d = Paint.Style.FILL_AND_STROKE;
        this.e = "";
        this.f = null;
        this.g = LimitLabelPosition.RIGHT_TOP;
        this.f7788a = f;
    }

    public void a(float f, float f2, float f3) {
        this.f = new DashPathEffect(new float[]{f, f2}, f3);
    }

    public DashPathEffect b() {
        return this.f;
    }

    public String c() {
        return this.e;
    }

    public LimitLabelPosition d() {
        return this.g;
    }

    public float e() {
        return this.f7788a;
    }

    public int f() {
        return this.c;
    }

    public float g() {
        return this.f7789b;
    }

    public Paint.Style h() {
        return this.d;
    }

    public void i(String str) {
        this.e = str;
    }

    public void j(LimitLabelPosition limitLabelPosition) {
        this.g = limitLabelPosition;
    }

    public void k(int i) {
        this.c = i;
    }

    public void l(float f) {
        if (f < 0.2f) {
            f = 0.2f;
        }
        if (f > 12.0f) {
            f = 12.0f;
        }
        this.f7789b = fmq.e(f);
    }

    public LimitLine(float f, String str) {
        this.f7788a = 0.0f;
        this.f7789b = 2.0f;
        this.c = Color.rgb(237, 91, 91);
        this.d = Paint.Style.FILL_AND_STROKE;
        this.e = "";
        this.f = null;
        this.g = LimitLabelPosition.RIGHT_TOP;
        this.f7788a = f;
        this.e = str;
    }
}
