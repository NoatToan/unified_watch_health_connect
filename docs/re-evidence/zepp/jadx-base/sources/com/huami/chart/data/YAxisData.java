package com.huami.chart.data;

import com.huami.chart.util.HMColor;

/* JADX INFO: loaded from: classes6.dex */
public class YAxisData {
    private static final String g = "";
    private static final String h = "";
    private float a;
    private String b;
    private String c;
    private HMColor d;
    private HMColor e;
    private int f;

    public YAxisData(float f) {
        this(f, "", "");
    }

    public String getSubTitle() {
        return this.c;
    }

    public String getTitle() {
        return this.b;
    }

    public float getValue() {
        return this.a;
    }

    public HMColor getYLabelColor() {
        return this.d;
    }

    public HMColor getYScaleLineColor() {
        return this.e;
    }

    public int getYScaleLineStyle() {
        return this.f;
    }

    public void setYScaleLineColor(HMColor hMColor) {
        this.e = hMColor;
    }

    public void setYScaleLineStyle(int i) {
        this.f = i;
    }

    public String toString() {
        return "(" + this.a + " : " + this.b + ", " + this.c + ")";
    }

    public YAxisData(float f, String str) {
        this(f, str, "");
    }

    public YAxisData(float f, String str, String str2) {
        this.e = null;
        this.f = 1;
        this.a = f;
        this.b = str;
        this.c = "";
    }

    public YAxisData(float f, String str, HMColor hMColor) {
        this.e = null;
        this.f = 1;
        this.a = f;
        this.b = str;
        this.c = "";
        this.d = hMColor;
    }
}
