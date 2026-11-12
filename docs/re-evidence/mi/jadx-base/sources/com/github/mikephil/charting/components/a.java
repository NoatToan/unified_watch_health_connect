package com.github.mikephil.charting.components;

import android.graphics.DashPathEffect;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Legend.LegendForm f7796b;
    public float c;
    public float d;
    public DashPathEffect e;
    public int f;

    public a() {
        this.f7796b = Legend.LegendForm.DEFAULT;
        this.c = Float.NaN;
        this.d = Float.NaN;
        this.e = null;
        this.f = 1122867;
    }

    public a(String str, Legend.LegendForm legendForm, float f, float f2, DashPathEffect dashPathEffect, int i) {
        Legend.LegendForm legendForm2 = Legend.LegendForm.NONE;
        this.f7795a = str;
        this.f7796b = legendForm;
        this.c = f;
        this.d = f2;
        this.e = dashPathEffect;
        this.f = i;
    }
}
