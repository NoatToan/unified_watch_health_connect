package com.huami.chart.data;

/* JADX INFO: loaded from: classes6.dex */
public class SectionLineDataExtend {
    private int a;
    private int[] b;

    public SectionLineDataExtend(int i, int[] iArr) {
        this.a = i;
        this.b = iArr;
    }

    public int getLineColor() {
        return this.a;
    }

    public int[] getShadowColors() {
        return this.b;
    }

    public void setLineColor(int i) {
        this.a = i;
    }

    public void setShadowColors(int[] iArr) {
        this.b = iArr;
    }
}
