package com.google.android.material.color.utilities;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes14.dex */
public final class QuantizerWsmeans {
    private static final int MAX_ITERATIONS = 10;
    private static final double MIN_MOVEMENT_DISTANCE = 3.0d;

    public static final class Distance implements Comparable<Distance> {
        int index = -1;
        double distance = -1.0d;

        @Override // java.lang.Comparable
        public int compareTo(Distance distance) {
            return Double.valueOf(this.distance).compareTo(Double.valueOf(distance.distance));
        }
    }

    private QuantizerWsmeans() {
    }

    public static Map<Integer, Integer> quantize(int[] iArr, int[] iArr2, int i14) {
        char c14;
        double[] dArr;
        Random random = new Random(272008L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        double[][] dArr2 = new double[iArr.length][];
        int[] iArr3 = new int[iArr.length];
        PointProviderLab pointProviderLab = new PointProviderLab();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            c14 = 1;
            if (i15 >= iArr.length) {
                break;
            }
            int i17 = iArr[i15];
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i17));
            if (num == null) {
                dArr2[i16] = pointProviderLab.fromInt(i17);
                iArr3[i16] = i17;
                i16++;
                linkedHashMap.put(Integer.valueOf(i17), 1);
            } else {
                linkedHashMap.put(Integer.valueOf(i17), Integer.valueOf(num.intValue() + 1));
            }
            i15++;
        }
        int[] iArr4 = new int[i16];
        for (int i18 = 0; i18 < i16; i18++) {
            iArr4[i18] = ((Integer) linkedHashMap.get(Integer.valueOf(iArr3[i18]))).intValue();
        }
        int iMin = Math.min(i14, i16);
        if (iArr2.length != 0) {
            iMin = Math.min(iMin, iArr2.length);
        }
        double[][] dArr3 = new double[iMin][];
        int i19 = 0;
        for (int i24 = 0; i24 < iArr2.length; i24++) {
            dArr3[i24] = pointProviderLab.fromInt(iArr2[i24]);
            i19++;
        }
        int i25 = iMin - i19;
        if (i25 > 0) {
            for (int i26 = 0; i26 < i25; i26++) {
            }
        }
        int[] iArr5 = new int[i16];
        for (int i27 = 0; i27 < i16; i27++) {
            iArr5[i27] = random.nextInt(iMin);
        }
        int[][] iArr6 = new int[iMin][];
        for (int i28 = 0; i28 < iMin; i28++) {
            iArr6[i28] = new int[iMin];
        }
        Distance[][] distanceArr = new Distance[iMin][];
        for (int i29 = 0; i29 < iMin; i29++) {
            distanceArr[i29] = new Distance[iMin];
            for (int i30 = 0; i30 < iMin; i30++) {
                distanceArr[i29][i30] = new Distance();
            }
        }
        int[] iArr7 = new int[iMin];
        int i34 = 0;
        while (i34 < 10) {
            int i35 = 0;
            while (i35 < iMin) {
                int i36 = i35 + 1;
                int i37 = i36;
                while (i37 < iMin) {
                    int[] iArr8 = iArr4;
                    double dDistance = pointProviderLab.distance(dArr3[i35], dArr3[i37]);
                    Distance distance = distanceArr[i37][i35];
                    distance.distance = dDistance;
                    distance.index = i35;
                    Distance distance2 = distanceArr[i35][i37];
                    distance2.distance = dDistance;
                    distance2.index = i37;
                    i37++;
                    iArr4 = iArr8;
                    iArr5 = iArr5;
                    c14 = c14;
                }
                int[] iArr9 = iArr4;
                int[] iArr10 = iArr5;
                char c15 = c14;
                Arrays.sort(distanceArr[i35]);
                for (int i38 = 0; i38 < iMin; i38++) {
                    iArr6[i35][i38] = distanceArr[i35][i38].index;
                }
                iArr4 = iArr9;
                iArr5 = iArr10;
                i35 = i36;
                c14 = c15;
            }
            int[] iArr11 = iArr4;
            int[] iArr12 = iArr5;
            char c16 = c14;
            int i39 = 0;
            int i44 = 0;
            while (i39 < i16) {
                double[] dArr4 = dArr2[i39];
                int i45 = iArr12[i39];
                double dDistance2 = pointProviderLab.distance(dArr4, dArr3[i45]);
                int i46 = i39;
                double d14 = dDistance2;
                int i47 = -1;
                int i48 = 0;
                while (i48 < iMin) {
                    int i49 = i44;
                    int[][] iArr13 = iArr6;
                    if (distanceArr[i45][i48].distance < 4.0d * dDistance2) {
                        double dDistance3 = pointProviderLab.distance(dArr4, dArr3[i48]);
                        if (dDistance3 < d14) {
                            d14 = dDistance3;
                            i47 = i48;
                        }
                    }
                    i48++;
                    iArr6 = iArr13;
                    i44 = i49;
                }
                int i54 = i44;
                int[][] iArr14 = iArr6;
                if (i47 == -1 || Math.abs(Math.sqrt(d14) - Math.sqrt(dDistance2)) <= 3.0d) {
                    i44 = i54;
                } else {
                    i44 = i54 + 1;
                    iArr12[i46] = i47;
                }
                i39 = i46 + 1;
                iArr6 = iArr14;
            }
            int[][] iArr15 = iArr6;
            if (i44 == 0 && i34 != 0) {
                break;
            }
            double[] dArr5 = new double[iMin];
            double[] dArr6 = new double[iMin];
            double[] dArr7 = new double[iMin];
            boolean z14 = false;
            Arrays.fill(iArr7, 0);
            int i55 = 0;
            while (i55 < i16) {
                int i56 = iArr12[i55];
                double[] dArr8 = dArr2[i55];
                boolean z15 = z14;
                int i57 = iArr11[i55];
                iArr7[i56] = iArr7[i56] + i57;
                double d15 = i57;
                dArr5[i56] = (dArr8[z15 ? 1 : 0] * d15) + dArr5[i56];
                dArr6[i56] = (dArr8[c16] * d15) + dArr6[i56];
                dArr7[i56] = (dArr8[2] * d15) + dArr7[i56];
                i55++;
                z14 = false;
            }
            int i58 = 0;
            while (i58 < iMin) {
                int i59 = iArr7[i58];
                if (i59 == 0) {
                    dArr3[i58] = new double[]{0.0d, 0.0d, 0.0d};
                    dArr = dArr6;
                } else {
                    double d16 = dArr5[i58];
                    dArr = dArr6;
                    double d17 = i59;
                    double d18 = d16 / d17;
                    double d19 = dArr[i58] / d17;
                    double d24 = dArr7[i58] / d17;
                    double[] dArr9 = dArr3[i58];
                    dArr9[0] = d18;
                    dArr9[c16] = d19;
                    dArr9[2] = d24;
                }
                i58++;
                dArr5 = dArr5;
                dArr6 = dArr;
            }
            i34++;
            iArr4 = iArr11;
            iArr5 = iArr12;
            c14 = c16;
            iArr6 = iArr15;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (int i64 = 0; i64 < iMin; i64++) {
            int i65 = iArr7[i64];
            if (i65 != 0) {
                int i66 = pointProviderLab.toInt(dArr3[i64]);
                if (!linkedHashMap2.containsKey(Integer.valueOf(i66))) {
                    linkedHashMap2.put(Integer.valueOf(i66), Integer.valueOf(i65));
                }
            }
        }
        return linkedHashMap2;
    }
}
