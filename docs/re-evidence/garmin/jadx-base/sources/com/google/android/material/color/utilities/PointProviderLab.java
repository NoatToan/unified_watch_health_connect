package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes14.dex */
public final class PointProviderLab implements PointProvider {
    @Override // com.google.android.material.color.utilities.PointProvider
    public double distance(double[] dArr, double[] dArr2) {
        double d14 = dArr[0] - dArr2[0];
        double d15 = dArr[1] - dArr2[1];
        double d16 = dArr[2] - dArr2[2];
        return (d16 * d16) + (d15 * d15) + (d14 * d14);
    }

    @Override // com.google.android.material.color.utilities.PointProvider
    public double[] fromInt(int i14) {
        double[] dArrLabFromArgb = ColorUtils.labFromArgb(i14);
        return new double[]{dArrLabFromArgb[0], dArrLabFromArgb[1], dArrLabFromArgb[2]};
    }

    @Override // com.google.android.material.color.utilities.PointProvider
    public int toInt(double[] dArr) {
        return ColorUtils.argbFromLab(dArr[0], dArr[1], dArr[2]);
    }
}
