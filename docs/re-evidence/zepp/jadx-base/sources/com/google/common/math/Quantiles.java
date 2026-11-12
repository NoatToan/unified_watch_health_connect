package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Ints;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtIncompatible
public final class Quantiles {

    public static final class Scale {
        private final int a;

        public ScaleAndIndex index(int i) {
            return new ScaleAndIndex(this.a, i);
        }

        public ScaleAndIndexes indexes(int... iArr) {
            return new ScaleAndIndexes(this.a, (int[]) iArr.clone());
        }

        private Scale(int i) {
            Preconditions.checkArgument(i > 0, "Quantile scale must be positive");
            this.a = i;
        }

        public ScaleAndIndexes indexes(Collection<Integer> collection) {
            return new ScaleAndIndexes(this.a, Ints.toArray(collection));
        }
    }

    public static final class ScaleAndIndex {
        private final int a;
        private final int b;

        public double compute(Collection<? extends Number> collection) {
            return computeInPlace(Doubles.toArray(collection));
        }

        public double computeInPlace(double... dArr) {
            Preconditions.checkArgument(dArr.length > 0, "Cannot calculate quantiles of an empty dataset");
            if (Quantiles.j(dArr)) {
                return Double.NaN;
            }
            long length = ((long) this.b) * ((long) (dArr.length - 1));
            int iDivide = (int) LongMath.divide(length, this.a, RoundingMode.DOWN);
            int i = (int) (length - (((long) iDivide) * ((long) this.a)));
            Quantiles.q(iDivide, dArr, 0, dArr.length - 1);
            if (i == 0) {
                return dArr[iDivide];
            }
            int i2 = iDivide + 1;
            Quantiles.q(i2, dArr, i2, dArr.length - 1);
            return Quantiles.k(dArr[iDivide], dArr[i2], i, this.a);
        }

        private ScaleAndIndex(int i, int i2) {
            Quantiles.h(i2, i);
            this.a = i;
            this.b = i2;
        }

        public double compute(double... dArr) {
            return computeInPlace((double[]) dArr.clone());
        }

        public double compute(long... jArr) {
            return computeInPlace(Quantiles.m(jArr));
        }

        public double compute(int... iArr) {
            return computeInPlace(Quantiles.l(iArr));
        }
    }

    public static final class ScaleAndIndexes {
        private final int a;
        private final int[] b;

        public Map<Integer, Double> compute(Collection<? extends Number> collection) {
            return computeInPlace(Doubles.toArray(collection));
        }

        public Map<Integer, Double> computeInPlace(double... dArr) {
            int i = 0;
            int i2 = 1;
            Preconditions.checkArgument(dArr.length > 0, "Cannot calculate quantiles of an empty dataset");
            if (Quantiles.j(dArr)) {
                HashMap map = new HashMap();
                int[] iArr = this.b;
                int length = iArr.length;
                while (i < length) {
                    map.put(Integer.valueOf(iArr[i]), Double.valueOf(Double.NaN));
                    i++;
                }
                return Collections.unmodifiableMap(map);
            }
            int[] iArr2 = this.b;
            int[] iArr3 = new int[iArr2.length];
            int[] iArr4 = new int[iArr2.length];
            int[] iArr5 = new int[iArr2.length * 2];
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int[] iArr6 = this.b;
                if (i3 >= iArr6.length) {
                    break;
                }
                long length2 = ((long) iArr6[i3]) * ((long) (dArr.length - i2));
                int iDivide = (int) LongMath.divide(length2, this.a, RoundingMode.DOWN);
                int i5 = i3;
                int i6 = (int) (length2 - (((long) iDivide) * ((long) this.a)));
                iArr3[i5] = iDivide;
                iArr4[i5] = i6;
                iArr5[i4] = iDivide;
                i4++;
                if (i6 != 0) {
                    iArr5[i4] = iDivide + 1;
                    i4++;
                }
                i3 = i5 + 1;
                i2 = 1;
            }
            Arrays.sort(iArr5, 0, i4);
            Quantiles.p(iArr5, 0, i4 - 1, dArr, 0, dArr.length - 1);
            HashMap map2 = new HashMap();
            while (true) {
                int[] iArr7 = this.b;
                if (i >= iArr7.length) {
                    return Collections.unmodifiableMap(map2);
                }
                int i7 = iArr3[i];
                int i8 = iArr4[i];
                if (i8 == 0) {
                    map2.put(Integer.valueOf(iArr7[i]), Double.valueOf(dArr[i7]));
                } else {
                    map2.put(Integer.valueOf(iArr7[i]), Double.valueOf(Quantiles.k(dArr[i7], dArr[i7 + 1], i8, this.a)));
                }
                i++;
            }
        }

        private ScaleAndIndexes(int i, int[] iArr) {
            for (int i2 : iArr) {
                Quantiles.h(i2, i);
            }
            this.a = i;
            this.b = iArr;
        }

        public Map<Integer, Double> compute(double... dArr) {
            return computeInPlace((double[]) dArr.clone());
        }

        public Map<Integer, Double> compute(long... jArr) {
            return computeInPlace(Quantiles.m(jArr));
        }

        public Map<Integer, Double> compute(int... iArr) {
            return computeInPlace(Quantiles.l(iArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IllegalArgumentException("Quantile indexes must be between 0 and the scale, which is " + i2);
        }
    }

    private static int i(int[] iArr, int i, int i2, int i3, int i4) {
        if (i == i2) {
            return i;
        }
        int i5 = i3 + i4;
        int i6 = i5 >>> 1;
        while (i2 > i + 1) {
            int i7 = (i + i2) >>> 1;
            if (iArr[i7] > i6) {
                i2 = i7;
            } else {
                if (iArr[i7] >= i6) {
                    return i7;
                }
                i = i7;
            }
        }
        return (i5 - iArr[i]) - iArr[i2] > 0 ? i2 : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j(double... dArr) {
        for (double d : dArr) {
            if (Double.isNaN(d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double k(double d, double d2, double d3, double d4) {
        if (d == Double.NEGATIVE_INFINITY) {
            return d2 == Double.POSITIVE_INFINITY ? Double.NaN : Double.NEGATIVE_INFINITY;
        }
        if (d2 == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        }
        return d + (((d2 - d) * d3) / d4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double[] l(int[] iArr) {
        int length = iArr.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = iArr[i];
        }
        return dArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double[] m(long[] jArr) {
        int length = jArr.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = jArr[i];
        }
        return dArr;
    }

    public static ScaleAndIndex median() {
        return scale(2).index(1);
    }

    private static void n(double[] dArr, int i, int i2) {
        int i3 = (i + i2) >>> 1;
        boolean z = dArr[i2] < dArr[i3];
        boolean z2 = dArr[i3] < dArr[i];
        boolean z3 = dArr[i2] < dArr[i];
        if (z == z2) {
            r(dArr, i3, i);
        } else if (z != z3) {
            r(dArr, i, i2);
        }
    }

    private static int o(double[] dArr, int i, int i2) {
        n(dArr, i, i2);
        double d = dArr[i];
        int i3 = i2;
        while (i2 > i) {
            if (dArr[i2] > d) {
                r(dArr, i3, i2);
                i3--;
            }
            i2--;
        }
        r(dArr, i, i3);
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void p(int[] iArr, int i, int i2, double[] dArr, int i3, int i4) {
        int i5 = i(iArr, i, i2, i3, i4);
        int i6 = iArr[i5];
        q(i6, dArr, i3, i4);
        int i7 = i5 - 1;
        while (i7 >= i && iArr[i7] == i6) {
            i7--;
        }
        if (i7 >= i) {
            p(iArr, i, i7, dArr, i3, i6 - 1);
        }
        int i8 = i5 + 1;
        while (i8 <= i2 && iArr[i8] == i6) {
            i8++;
        }
        if (i8 <= i2) {
            p(iArr, i8, i2, dArr, i6 + 1, i4);
        }
    }

    public static Scale percentiles() {
        return scale(100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(int i, double[] dArr, int i2, int i3) {
        if (i != i2) {
            while (i3 > i2) {
                int iO = o(dArr, i2, i3);
                if (iO >= i) {
                    i3 = iO - 1;
                }
                if (iO <= i) {
                    i2 = iO + 1;
                }
            }
            return;
        }
        int i4 = i2;
        for (int i5 = i2 + 1; i5 <= i3; i5++) {
            if (dArr[i4] > dArr[i5]) {
                i4 = i5;
            }
        }
        if (i4 != i2) {
            r(dArr, i4, i2);
        }
    }

    public static Scale quartiles() {
        return scale(4);
    }

    private static void r(double[] dArr, int i, int i2) {
        double d = dArr[i];
        dArr[i] = dArr[i2];
        dArr[i2] = d;
    }

    public static Scale scale(int i) {
        return new Scale(i);
    }
}
