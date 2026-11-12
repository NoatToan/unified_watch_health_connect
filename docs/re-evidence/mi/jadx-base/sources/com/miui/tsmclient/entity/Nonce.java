package com.miui.tsmclient.entity;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class Nonce {
    private static final int DISTANCES_NUMBER = 3;
    private static final int INVALID_DISTANCES_NUMBER = 0;

    @SerializedName("deviation")
    private int mDeviation;

    @SerializedName("distances")
    private int[] mDistances;

    @SerializedName("distancesNumber")
    private int mDistancesNumber = 3;

    @SerializedName("median")
    private int mMedian;

    public int getDeviation() {
        return this.mDeviation;
    }

    public int[] getDistances() {
        return this.mDistances;
    }

    public int getDistancesNumber() {
        return this.mDistancesNumber;
    }

    public int getMedian() {
        return this.mMedian;
    }

    public void setDeviation(int i) {
        this.mDeviation = i;
    }

    public void setDistances(int[] iArr) {
        this.mDistances = iArr;
    }

    public void setDistancesNumber(int i) {
        if (i > 0) {
            this.mDistancesNumber = i;
        }
    }

    public void setMedian(int i) {
        this.mMedian = i;
    }

    public void standardDeviation() {
        int i;
        int i2;
        if (this.mDistances == null) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i = this.mDistancesNumber;
            if (i4 >= i) {
                break;
            }
            i5 += this.mDistances[i4];
            i4++;
        }
        double d = i5 / i;
        double d2 = 0.0d;
        while (true) {
            i2 = this.mDistancesNumber;
            if (i3 >= i2) {
                break;
            }
            int i6 = this.mDistances[i3];
            d2 += (((double) i6) - d) * (((double) i6) - d);
            i3++;
        }
        double dSqrt = Math.sqrt(d2 / ((double) i2));
        this.mDeviation = (int) dSqrt;
        if (dSqrt <= 0.0d || dSqrt >= 1.0d) {
            return;
        }
        this.mDeviation = 1;
    }
}
