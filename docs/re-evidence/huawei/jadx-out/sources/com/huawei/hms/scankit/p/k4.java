package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class k4 extends h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f16184a = {1, 1, 1, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f16185b = {3, 1, 1};

    @Override // com.huawei.hms.scankit.p.h5, com.huawei.hms.scankit.p.l8
    public s a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map) {
        if (barcodeFormat == BarcodeFormat.ITF) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got " + barcodeFormat);
    }

    @Override // com.huawei.hms.scankit.p.h5
    public boolean[] a(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        }
        if (length <= 80) {
            boolean[] zArr = new boolean[(length * 9) + 9];
            int iA = h5.a(zArr, 0, f16184a, true);
            for (int i = 0; i < length; i += 2) {
                int iDigit = Character.digit(str.charAt(i), 10);
                int iDigit2 = Character.digit(str.charAt(i + 1), 10);
                int[] iArr = new int[10];
                for (int i2 = 0; i2 < 5; i2++) {
                    int i3 = i2 * 2;
                    int[][] iArr2 = j4.f;
                    iArr[i3] = iArr2[iDigit][i2];
                    iArr[i3 + 1] = iArr2[iDigit2][i2];
                }
                iA += h5.a(zArr, iA, iArr, true);
            }
            h5.a(zArr, iA, f16185b, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length);
    }
}
