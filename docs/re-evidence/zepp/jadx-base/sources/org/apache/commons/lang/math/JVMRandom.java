package org.apache.commons.lang.math;

import java.util.Random;

/* JADX INFO: loaded from: classes23.dex */
public final class JVMRandom extends Random {
    private static final Random b = new Random();
    private static final long serialVersionUID = 1;
    private boolean a;

    public JVMRandom() {
        this.a = false;
        this.a = true;
    }

    private static int a(long j) {
        int i = 0;
        long j2 = j;
        while (j >= 0) {
            if (j2 == 0) {
                return i;
            }
            i++;
            j <<= 1;
            j2 >>= 1;
        }
        return 64 - i;
    }

    private static long b() {
        return b.nextLong() & Long.MAX_VALUE;
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return b.nextBoolean();
    }

    @Override // java.util.Random
    public void nextBytes(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Random
    public double nextDouble() {
        return b.nextDouble();
    }

    @Override // java.util.Random
    public float nextFloat() {
        return b.nextFloat();
    }

    @Override // java.util.Random
    public synchronized double nextGaussian() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Random
    public int nextInt() {
        return nextInt(Integer.MAX_VALUE);
    }

    @Override // java.util.Random
    public long nextLong() {
        return nextLong(Long.MAX_VALUE);
    }

    @Override // java.util.Random
    public synchronized void setSeed(long j) {
        if (this.a) {
            throw new UnsupportedOperationException();
        }
    }

    public static long nextLong(long j) {
        long jB;
        long j2;
        if (j <= 0) {
            throw new IllegalArgumentException("Upper bound for nextInt must be positive");
        }
        if (((-j) & j) == j) {
            return b() >> (63 - a(j - 1));
        }
        do {
            jB = b();
            j2 = jB % j;
        } while ((jB - j2) + (j - 1) < 0);
        return j2;
    }

    @Override // java.util.Random
    public int nextInt(int i) {
        return b.nextInt(i);
    }
}
