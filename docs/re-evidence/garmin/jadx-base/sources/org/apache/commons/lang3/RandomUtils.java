package org.apache.commons.lang3;

import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public class RandomUtils {
    private static final Random RANDOM = new Random();

    public static boolean nextBoolean() {
        return RANDOM.nextBoolean();
    }

    public static byte[] nextBytes(int i14) {
        Validate.isTrue(i14 >= 0, "Count cannot be negative.", new Object[0]);
        byte[] bArr = new byte[i14];
        RANDOM.nextBytes(bArr);
        return bArr;
    }

    public static double nextDouble(double d14, double d15) {
        Validate.isTrue(d15 >= d14, "Start value must be smaller or equal to end value.", new Object[0]);
        Validate.isTrue(d14 >= 0.0d, "Both range values must be non-negative.", new Object[0]);
        if (d14 == d15) {
            return d14;
        }
        return (RANDOM.nextDouble() * (d15 - d14)) + d14;
    }

    public static float nextFloat(float f14, float f15) {
        Validate.isTrue(f15 >= f14, "Start value must be smaller or equal to end value.", new Object[0]);
        Validate.isTrue(f14 >= 0.0f, "Both range values must be non-negative.", new Object[0]);
        if (f14 == f15) {
            return f14;
        }
        return (RANDOM.nextFloat() * (f15 - f14)) + f14;
    }

    public static int nextInt(int i14, int i15) {
        Validate.isTrue(i15 >= i14, "Start value must be smaller or equal to end value.", new Object[0]);
        Validate.isTrue(i14 >= 0, "Both range values must be non-negative.", new Object[0]);
        return i14 == i15 ? i14 : RANDOM.nextInt(i15 - i14) + i14;
    }

    public static long nextLong(long j8, long j14) {
        Validate.isTrue(j14 >= j8, "Start value must be smaller or equal to end value.", new Object[0]);
        Validate.isTrue(j8 >= 0, "Both range values must be non-negative.", new Object[0]);
        return j8 == j14 ? j8 : j8 + nextLong(j14 - j8);
    }

    public static int nextInt() {
        return nextInt(0, Integer.MAX_VALUE);
    }

    public static long nextLong() {
        return nextLong(Long.MAX_VALUE);
    }

    private static long nextLong(long j8) {
        long jNextLong;
        long j14;
        do {
            jNextLong = RANDOM.nextLong() >>> 1;
            j14 = jNextLong % j8;
        } while ((j8 - 1) + (jNextLong - j14) < 0);
        return j14;
    }

    public static float nextFloat() {
        return nextFloat(0.0f, Float.MAX_VALUE);
    }

    public static double nextDouble() {
        return nextDouble(0.0d, Double.MAX_VALUE);
    }
}
