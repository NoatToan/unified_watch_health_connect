package com.huami.mifit.sportlib.utils;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class RunUtils {

    public static class a {
        public int a;
        public long b;

        public a(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public int a() {
            return this.a;
        }

        public long b() {
            return this.b;
        }
    }

    private static a a(long j, List<Long> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int size = list.size() - 1;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (z) {
            if (i2 == size) {
                z = false;
            }
            if (size - i2 == 1) {
                if (list.get(size).longValue() - j > j - list.get(i2).longValue()) {
                    size = i2;
                }
                return new a(size, list.get(size).longValue());
            }
            i = (i2 + size) / 2;
            if (list.get(i).longValue() < j) {
                i2 = i;
            } else if (list.get(i).longValue() > j) {
                size = i;
            } else {
                z = false;
            }
        }
        return new a(i, list.get(i).longValue());
    }

    private static a b(long j, List<Long> list, int i) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int size = list.size() - 1;
        boolean z = true;
        int i2 = 0;
        while (z) {
            if (i == size) {
                z = false;
            }
            if (size - i == 1) {
                if (list.get(size).longValue() - j <= j - list.get(i).longValue()) {
                    i = size;
                }
                return new a(i, list.get(i).longValue());
            }
            i2 = (i + size) / 2;
            if (list.get(i2).longValue() < j) {
                i = i2;
            } else if (list.get(i2).longValue() > j) {
                size = i2;
            } else {
                z = false;
            }
        }
        return new a(i2, list.get(i2).longValue());
    }

    public static int getIndex(long j, List<Long> list, int i) {
        a aVarB = b(j, list, i);
        if (aVarB != null) {
            return aVarB.a();
        }
        return -1;
    }

    public static long getKey(HashMap<Long, ?> map) {
        return map.keySet().iterator().next().longValue();
    }

    public static <T> T getValue(List<HashMap<Long, T>> list, List<T> list2, int i) {
        if (!list.isEmpty()) {
            HashMap<Long, T> map = list.get(i);
            return map.get(Long.valueOf(getKey(map)));
        }
        if (i >= list2.size() || i < 0) {
            return null;
        }
        return list2.get(i);
    }

    public static int getValueFromHashMapList(List<Long> list, List<Integer> list2, long j) {
        int iA;
        a aVarA = a(j, list);
        if (aVarA != null && (iA = aVarA.a()) >= 0 && iA < list2.size()) {
            return list2.get(iA).intValue();
        }
        return -1;
    }

    public static boolean isAltiMeterValid(int i) {
        return i > -10000 && i < 10000;
    }

    public static boolean isAltiTotalValid(int i) {
        return i >= 0;
    }

    public static boolean isAltiValid(int i) {
        return i > -1000000 && i < 1000000;
    }

    public static boolean isHeartRateValid(int i) {
        return (i == -1 || i == 0) ? false : true;
    }

    public static boolean isMaxMinPaceValid(float f, float f2) {
        return isPaceValid(f) && (f2 == 0.0f || isPaceValid(f2));
    }

    public static boolean isPaceValid(float f) {
        return f > 1.0E-4f;
    }

    public static boolean isSpeedValid(float f) {
        return (f == Float.MAX_VALUE || f == -1.0f) ? false : true;
    }

    public static boolean isStepFreqValid(int i) {
        return i > 0;
    }

    public static boolean isStepValid(int i) {
        return i > 0;
    }

    public static boolean isValid(float f) {
        return Math.abs(f - 0.0f) > 1.0E-5f;
    }

    public static double scaleDouble(double d, int i) {
        return new BigDecimal(d).setScale(i, 4).doubleValue();
    }

    public static float scaleFloat(float f, int i) {
        return new BigDecimal(f).setScale(i, 4).floatValue();
    }
}
