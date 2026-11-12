package com.huami.watch.companion.firstbeat;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class FitnessLevelHelper {
    private static final int[] a = {24, 29, 34, 39, 44, 49, 54, 59, 65};
    private static final int[][] b = {new int[]{31, 37, 43, 50, 56, 62}, new int[]{30, 35, 42, 48, 53, 59}, new int[]{28, 34, 40, 45, 51, 56}, new int[]{27, 32, 38, 43, 48, 54}, new int[]{25, 31, 35, 41, 46, 51}, new int[]{24, 29, 34, 39, 43, 48}, new int[]{23, 27, 32, 36, 41, 46}, new int[]{21, 26, 30, 34, 39, 43}, new int[]{20, 24, 28, 32, 36, 40}};
    private static final int[][] c = {new int[]{26, 31, 36, 41, 46, 51}, new int[]{25, 30, 35, 40, 44, 49}, new int[]{24, 29, 33, 37, 42, 46}, new int[]{23, 27, 31, 35, 40, 44}, new int[]{21, 25, 29, 33, 37, 41}, new int[]{20, 23, 27, 31, 35, 38}, new int[]{18, 22, 25, 29, 32, 36}, new int[]{17, 20, 23, 27, 30, 33}, new int[]{15, 18, 21, 24, 27, 30}};
    private static final Map<Integer, int[][]> d = new a();

    public class a extends HashMap<Integer, int[][]> {
        public a() {
            put(1, FitnessLevelHelper.b);
            put(0, FitnessLevelHelper.c);
        }
    }

    public static int[] c(int i, int i2) {
        int[] iArr = new int[2];
        if (d.get(Integer.valueOf(i)) == null) {
            return iArr;
        }
        int i3 = 0;
        while (true) {
            int[] iArr2 = a;
            if (i3 >= iArr2.length) {
                break;
            }
            if (i2 <= iArr2[i3]) {
                Map<Integer, int[][]> map = d;
                iArr[0] = map.get(Integer.valueOf(i))[i3][0] - 5;
                iArr[1] = map.get(Integer.valueOf(i))[i3][map.get(Integer.valueOf(i))[i3].length - 1] + 6;
                break;
            }
            i3++;
        }
        return iArr;
    }

    public static int d(int i, int i2, int i3) {
        if (d.get(Integer.valueOf(i)) == null) {
            return 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = a;
            if (i4 >= iArr.length) {
                return i5;
            }
            if (i2 <= iArr[i4]) {
                Map<Integer, int[][]> map = d;
                if (i3 > map.get(Integer.valueOf(i))[i4][map.get(Integer.valueOf(i))[i4].length - 1]) {
                    return map.get(Integer.valueOf(i))[i4].length + 1;
                }
                int i6 = 0;
                while (true) {
                    Map<Integer, int[][]> map2 = d;
                    if (i6 >= map2.get(Integer.valueOf(i))[i4].length) {
                        break;
                    }
                    if (i3 <= map2.get(Integer.valueOf(i))[i4][i6]) {
                        i5 = i6 + 1;
                        break;
                    }
                    i6++;
                }
                if (i5 != 0) {
                    return i5;
                }
            }
            i4++;
        }
    }

    public static int[] e(int i, int i2) {
        int[] iArr = new int[8];
        if (d.get(Integer.valueOf(i)) == null) {
            return iArr;
        }
        int i3 = 0;
        while (true) {
            int[] iArr2 = a;
            if (i3 >= iArr2.length) {
                break;
            }
            if (i2 <= iArr2[i3]) {
                Map<Integer, int[][]> map = d;
                iArr[0] = map.get(Integer.valueOf(i))[i3][0] - 5;
                iArr[7] = map.get(Integer.valueOf(i))[i3][map.get(Integer.valueOf(i))[i3].length - 1] + 6;
                System.arraycopy(map.get(Integer.valueOf(i))[i3], 0, iArr, 1, 6);
                break;
            }
            i3++;
        }
        return iArr;
    }
}
