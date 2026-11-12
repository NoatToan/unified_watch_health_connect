package com.google.common.math;

import am.j;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Ints;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class Quantiles {
    /* JADX INFO: Access modifiers changed from: private */
    public static void checkIndex(int i14, int i15) {
        if (i14 < 0 || i14 > i15) {
            h.s(j.h(i15, "Quantile indexes must be between 0 and the scale, which is "));
        }
    }

    private static int chooseNextSelection(int[] iArr, int i14, int i15, int i16, int i17) {
        if (i14 == i15) {
            return i14;
        }
        int i18 = i16 + i17;
        int i19 = i18 >>> 1;
        while (i15 > i14 + 1) {
            int i24 = (i14 + i15) >>> 1;
            int i25 = iArr[i24];
            if (i25 > i19) {
                i15 = i24;
            } else {
                if (i25 >= i19) {
                    return i24;
                }
                i14 = i24;
            }
        }
        return (i18 - iArr[i14]) - iArr[i15] > 0 ? i15 : i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean containsNaN(double... dArr) {
        for (double d14 : dArr) {
            if (Double.isNaN(d14)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double interpolate(double d14, double d15, double d16, double d17) {
        if (d14 == Double.NEGATIVE_INFINITY) {
            return d15 == Double.POSITIVE_INFINITY ? Double.NaN : Double.NEGATIVE_INFINITY;
        }
        if (d15 == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        }
        return (((d15 - d14) * d16) / d17) + d14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double[] intsToDoubles(int[] iArr) {
        int length = iArr.length;
        double[] dArr = new double[length];
        for (int i14 = 0; i14 < length; i14++) {
            dArr[i14] = iArr[i14];
        }
        return dArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double[] longsToDoubles(long[] jArr) {
        int length = jArr.length;
        double[] dArr = new double[length];
        for (int i14 = 0; i14 < length; i14++) {
            dArr[i14] = jArr[i14];
        }
        return dArr;
    }

    public static ScaleAndIndex median() {
        return scale(2).index(1);
    }

    private static void movePivotToStartOfSlice(double[] dArr, int i14, int i15) {
        int i16 = (i14 + i15) >>> 1;
        double d14 = dArr[i15];
        double d15 = dArr[i16];
        boolean z14 = d14 < d15;
        double d16 = dArr[i14];
        boolean z15 = d15 < d16;
        boolean z16 = d14 < d16;
        if (z14 == z15) {
            swap(dArr, i16, i14);
        } else if (z14 != z16) {
            swap(dArr, i14, i15);
        }
    }

    private static int partition(double[] dArr, int i14, int i15) {
        movePivotToStartOfSlice(dArr, i14, i15);
        double d14 = dArr[i14];
        int i16 = i15;
        while (i15 > i14) {
            if (dArr[i15] > d14) {
                swap(dArr, i16, i15);
                i16--;
            }
            i15--;
        }
        swap(dArr, i14, i16);
        return i16;
    }

    public static Scale percentiles() {
        return scale(100);
    }

    public static Scale quartiles() {
        return scale(4);
    }

    public static Scale scale(int i14) {
        return new Scale(i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void selectAllInPlace(int[] iArr, int i14, int i15, double[] dArr, int i16, int i17) {
        int iChooseNextSelection = chooseNextSelection(iArr, i14, i15, i16, i17);
        int i18 = iArr[iChooseNextSelection];
        selectInPlace(i18, dArr, i16, i17);
        int i19 = iChooseNextSelection - 1;
        while (i19 >= i14 && iArr[i19] == i18) {
            i19--;
        }
        if (i19 >= i14) {
            selectAllInPlace(iArr, i14, i19, dArr, i16, i18 - 1);
        }
        int i24 = iChooseNextSelection + 1;
        while (i24 <= i15 && iArr[i24] == i18) {
            i24++;
        }
        if (i24 <= i15) {
            selectAllInPlace(iArr, i24, i15, dArr, i18 + 1, i17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void selectInPlace(int i14, double[] dArr, int i15, int i16) {
        if (i14 != i15) {
            while (i16 > i15) {
                int iPartition = partition(dArr, i15, i16);
                if (iPartition >= i14) {
                    i16 = iPartition - 1;
                }
                if (iPartition <= i14) {
                    i15 = iPartition + 1;
                }
            }
            return;
        }
        int i17 = i15;
        for (int i18 = i15 + 1; i18 <= i16; i18++) {
            if (dArr[i17] > dArr[i18]) {
                i17 = i18;
            }
        }
        if (i17 != i15) {
            swap(dArr, i17, i15);
        }
    }

    private static void swap(double[] dArr, int i14, int i15) {
        double d14 = dArr[i14];
        dArr[i14] = dArr[i15];
        dArr[i15] = d14;
    }

    public static final class ScaleAndIndex {
        private final int index;
        private final int scale;

        private ScaleAndIndex(int i14, int i15) {
            Quantiles.checkIndex(i15, i14);
            this.scale = i14;
            this.index = i15;
        }

        public double compute(double... dArr) {
            return computeInPlace((double[]) dArr.clone());
        }

        public double computeInPlace(double... dArr) {
            Preconditions.checkArgument(dArr.length > 0, "Cannot calculate quantiles of an empty dataset");
            if (Quantiles.containsNaN(dArr)) {
                return Double.NaN;
            }
            long length = ((long) this.index) * ((long) (dArr.length - 1));
            int iDivide = (int) LongMath.divide(length, this.scale, RoundingMode.DOWN);
            int i14 = (int) (length - (((long) iDivide) * ((long) this.scale)));
            Quantiles.selectInPlace(iDivide, dArr, 0, dArr.length - 1);
            if (i14 == 0) {
                return dArr[iDivide];
            }
            int i15 = iDivide + 1;
            Quantiles.selectInPlace(i15, dArr, i15, dArr.length - 1);
            return Quantiles.interpolate(dArr[iDivide], dArr[i15], i14, this.scale);
        }

        public double compute(Collection<? extends Number> collection) {
            return computeInPlace(Doubles.toArray(collection));
        }

        public double compute(long... jArr) {
            return computeInPlace(Quantiles.longsToDoubles(jArr));
        }

        public double compute(int... iArr) {
            return computeInPlace(Quantiles.intsToDoubles(iArr));
        }
    }

    public static final class ScaleAndIndexes {
        private final int[] indexes;
        private final int scale;

        private ScaleAndIndexes(int i14, int[] iArr) {
            for (int i15 : iArr) {
                Quantiles.checkIndex(i15, i14);
            }
            Preconditions.checkArgument(iArr.length > 0, "Indexes must be a non empty array");
            this.scale = i14;
            this.indexes = iArr;
        }

        public Map<Integer, Double> compute(double... dArr) {
            return computeInPlace((double[]) dArr.clone());
        }

        public Map<Integer, Double> computeInPlace(double... dArr) {
            int i14 = 0;
            Preconditions.checkArgument(dArr.length > 0, "Cannot calculate quantiles of an empty dataset");
            if (Quantiles.containsNaN(dArr)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int[] iArr = this.indexes;
                int length = iArr.length;
                while (i14 < length) {
                    linkedHashMap.put(Integer.valueOf(iArr[i14]), Double.valueOf(Double.NaN));
                    i14++;
                }
                return Collections.unmodifiableMap(linkedHashMap);
            }
            int[] iArr2 = this.indexes;
            int[] iArr3 = new int[iArr2.length];
            int[] iArr4 = new int[iArr2.length];
            int[] iArr5 = new int[iArr2.length * 2];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr6 = this.indexes;
                if (i15 >= iArr6.length) {
                    break;
                }
                long length2 = ((long) iArr6[i15]) * ((long) (dArr.length - 1));
                int iDivide = (int) LongMath.divide(length2, this.scale, RoundingMode.DOWN);
                int i17 = (int) (length2 - (((long) iDivide) * ((long) this.scale)));
                iArr3[i15] = iDivide;
                iArr4[i15] = i17;
                iArr5[i16] = iDivide;
                int i18 = i16 + 1;
                if (i17 != 0) {
                    iArr5[i18] = iDivide + 1;
                    i16 += 2;
                } else {
                    i16 = i18;
                }
                i15++;
            }
            Arrays.sort(iArr5, 0, i16);
            Quantiles.selectAllInPlace(iArr5, 0, i16 - 1, dArr, 0, dArr.length - 1);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            while (true) {
                int[] iArr7 = this.indexes;
                if (i14 >= iArr7.length) {
                    return Collections.unmodifiableMap(linkedHashMap2);
                }
                int i19 = iArr3[i14];
                int i24 = iArr4[i14];
                if (i24 == 0) {
                    linkedHashMap2.put(Integer.valueOf(iArr7[i14]), Double.valueOf(dArr[i19]));
                } else {
                    linkedHashMap2.put(Integer.valueOf(iArr7[i14]), Double.valueOf(Quantiles.interpolate(dArr[i19], dArr[i19 + 1], i24, this.scale)));
                }
                i14++;
            }
        }

        public Map<Integer, Double> compute(Collection<? extends Number> collection) {
            return computeInPlace(Doubles.toArray(collection));
        }

        public Map<Integer, Double> compute(long... jArr) {
            return computeInPlace(Quantiles.longsToDoubles(jArr));
        }

        public Map<Integer, Double> compute(int... iArr) {
            return computeInPlace(Quantiles.intsToDoubles(iArr));
        }
    }

    public static final class Scale {
        private final int scale;

        private Scale(int i14) {
            Preconditions.checkArgument(i14 > 0, "Quantile scale must be positive");
            this.scale = i14;
        }

        public ScaleAndIndex index(int i14) {
            return new ScaleAndIndex(this.scale, i14);
        }

        public ScaleAndIndexes indexes(int... iArr) {
            return new ScaleAndIndexes(this.scale, (int[]) iArr.clone());
        }

        public ScaleAndIndexes indexes(Collection<Integer> collection) {
            return new ScaleAndIndexes(this.scale, Ints.toArray(collection));
        }
    }
}
