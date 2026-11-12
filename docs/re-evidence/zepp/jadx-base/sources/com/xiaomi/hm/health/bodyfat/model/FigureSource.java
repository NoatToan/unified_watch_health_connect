package com.xiaomi.hm.health.bodyfat.model;

/* JADX INFO: loaded from: classes19.dex */
public class FigureSource {
    private float[] a;
    private String[] b;
    private int[] c;

    public FigureSource(float[] fArr, String[] strArr, int[] iArr) {
        this.a = fArr;
        this.b = strArr;
        this.c = iArr;
    }

    public int[] getColors() {
        return this.c;
    }

    public String[] getLabels() {
        return this.b;
    }

    public float[] getValues() {
        return this.a;
    }

    public void setColors(int[] iArr) {
        this.c = iArr;
    }

    public void setLabels(String[] strArr) {
        this.b = strArr;
    }

    public void setValues(float[] fArr) {
        this.a = fArr;
    }
}
