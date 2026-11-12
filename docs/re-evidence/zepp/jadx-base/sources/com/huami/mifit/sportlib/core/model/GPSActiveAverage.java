package com.huami.mifit.sportlib.core.model;

/* JADX INFO: loaded from: classes11.dex */
public class GPSActiveAverage {
    private int a = 0;
    private int b = 0;

    public void add(int i) {
        this.a += i;
        this.b++;
    }

    public int avg() {
        int i;
        int i2 = this.a;
        if (i2 == 0 || (i = this.b) == 0) {
            return 0;
        }
        return i2 / i;
    }
}
