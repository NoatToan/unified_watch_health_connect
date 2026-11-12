package com.huami.chart.util;

import android.graphics.Color;

/* JADX INFO: loaded from: classes6.dex */
public class ChartGradientColor {
    private HMColor a;
    private HMColor b;

    public ChartGradientColor(String str, String str2) {
        this(new HMColor(Color.parseColor(str)), new HMColor(Color.parseColor(str2)));
    }

    public HMColor getEndColor() {
        return this.b;
    }

    public HMColor getStartColor() {
        return this.a;
    }

    public ChartGradientColor(HMColor hMColor, HMColor hMColor2) {
        this.a = hMColor;
        this.b = hMColor2;
    }
}
