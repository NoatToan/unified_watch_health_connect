package com.google.zxing.oned.rss;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.oned.OneDReader;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractRSSReader extends OneDReader {
    private static final float g = 0.2f;
    private static final float h = 0.45f;
    private static final float i = 0.7916667f;
    private static final float j = 0.89285713f;
    private final int[] b;
    private final int[] e;
    private final int[] f;
    private final int[] a = new int[4];
    private final float[] c = new float[4];
    private final float[] d = new float[4];

    public AbstractRSSReader() {
        int[] iArr = new int[8];
        this.b = iArr;
        this.e = new int[iArr.length / 2];
        this.f = new int[iArr.length / 2];
    }

    @Deprecated
    public static int count(int[] iArr) {
        return MathUtils.sum(iArr);
    }

    public static void decrement(int[] iArr, float[] fArr) {
        int i2 = 0;
        float f = fArr[0];
        for (int i3 = 1; i3 < iArr.length; i3++) {
            if (fArr[i3] < f) {
                f = fArr[i3];
                i2 = i3;
            }
        }
        iArr[i2] = iArr[i2] - 1;
    }

    public static void increment(int[] iArr, float[] fArr) {
        int i2 = 0;
        float f = fArr[0];
        for (int i3 = 1; i3 < iArr.length; i3++) {
            if (fArr[i3] > f) {
                f = fArr[i3];
                i2 = i3;
            }
        }
        iArr[i2] = iArr[i2] + 1;
    }

    public static boolean isFinderPattern(int[] iArr) {
        int i2 = iArr[0] + iArr[1];
        float f = i2 / ((iArr[2] + i2) + iArr[3]);
        if (f >= i && f <= j) {
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            for (int i5 : iArr) {
                if (i5 > i4) {
                    i4 = i5;
                }
                if (i5 < i3) {
                    i3 = i5;
                }
            }
            if (i4 < i3 * 10) {
                return true;
            }
        }
        return false;
    }

    public static int parseFinderValue(int[] iArr, int[][] iArr2) throws NotFoundException {
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            if (OneDReader.patternMatchVariance(iArr, iArr2[i2], h) < 0.2f) {
                return i2;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final int[] getDataCharacterCounters() {
        return this.b;
    }

    public final int[] getDecodeFinderCounters() {
        return this.a;
    }

    public final int[] getEvenCounts() {
        return this.f;
    }

    public final float[] getEvenRoundingErrors() {
        return this.d;
    }

    public final int[] getOddCounts() {
        return this.e;
    }

    public final float[] getOddRoundingErrors() {
        return this.c;
    }
}
