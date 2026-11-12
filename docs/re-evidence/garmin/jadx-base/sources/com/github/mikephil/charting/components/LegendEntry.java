package com.github.mikephil.charting.components;

import android.graphics.DashPathEffect;

/* JADX INFO: loaded from: classes13.dex */
public class LegendEntry {
    public Legend.LegendForm form;
    public int formColor;
    public DashPathEffect formLineDashEffect;
    public float formLineWidth;
    public float formSize;
    public String label;

    public LegendEntry() {
        this.form = Legend.LegendForm.DEFAULT;
        this.formSize = Float.NaN;
        this.formLineWidth = Float.NaN;
        this.formLineDashEffect = null;
        this.formColor = 1122867;
    }

    public LegendEntry(String str, Legend.LegendForm legendForm, float f14, float f15, DashPathEffect dashPathEffect, int i14) {
        Legend.LegendForm legendForm2 = Legend.LegendForm.NONE;
        this.label = str;
        this.form = legendForm;
        this.formSize = f14;
        this.formLineWidth = f15;
        this.formLineDashEffect = dashPathEffect;
        this.formColor = i14;
    }
}
