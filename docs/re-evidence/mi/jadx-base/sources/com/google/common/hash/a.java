package com.google.common.hash;

import defpackage.ahd;
import defpackage.c6i;
import defpackage.dse;
import defpackage.ore;
import defpackage.plb;
import defpackage.pre;
import defpackage.yre;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements BloomFilter.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f9271a = new C0243a("MURMUR128_MITZ_32", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9272b = new a("MURMUR128_MITZ_64", 1) { // from class: com.google.common.hash.a.b
        {
            C0243a c0243a = null;
        }

        @Override // com.google.common.hash.BloomFilter.c
        public <T> boolean R(T t, Funnel<? super T> funnel, int i, c cVar) {
            long jB = cVar.b();
            byte[] bArrG = plb.a().a(t, funnel).g();
            long jB2 = b(bArrG);
            long jC = c(bArrG);
            boolean zG = false;
            for (int i2 = 0; i2 < i; i2++) {
                zG |= cVar.g((Long.MAX_VALUE & jB2) % jB);
                jB2 += jC;
            }
            return zG;
        }

        public final long b(byte[] bArr) {
            return dse.d(bArr[7], bArr[6], bArr[5], bArr[4], bArr[3], bArr[2], bArr[1], bArr[0]);
        }

        public final long c(byte[] bArr) {
            return dse.d(bArr[15], bArr[14], bArr[13], bArr[12], bArr[11], bArr[10], bArr[9], bArr[8]);
        }

        @Override // com.google.common.hash.BloomFilter.c
        public <T> boolean l(T t, Funnel<? super T> funnel, int i, c cVar) {
            long jB = cVar.b();
            byte[] bArrG = plb.a().a(t, funnel).g();
            long jB2 = b(bArrG);
            long jC = c(bArrG);
            for (int i2 = 0; i2 < i; i2++) {
                if (!cVar.d((Long.MAX_VALUE & jB2) % jB)) {
                    return false;
                }
                jB2 += jC;
            }
            return true;
        }
    };
    public static final /* synthetic */ a[] c = a();

    /* JADX INFO: renamed from: com.google.common.hash.a$a, reason: collision with other inner class name */
    public final enum C0243a extends a {
        public C0243a(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.common.hash.BloomFilter.c
        public <T> boolean R(T t, Funnel<? super T> funnel, int i, c cVar) {
            long jB = cVar.b();
            long jC = plb.a().a(t, funnel).c();
            int i2 = (int) jC;
            int i3 = (int) (jC >>> 32);
            boolean zG = false;
            for (int i4 = 1; i4 <= i; i4++) {
                int i5 = (i4 * i3) + i2;
                if (i5 < 0) {
                    i5 = ~i5;
                }
                zG |= cVar.g(((long) i5) % jB);
            }
            return zG;
        }

        @Override // com.google.common.hash.BloomFilter.c
        public <T> boolean l(T t, Funnel<? super T> funnel, int i, c cVar) {
            long jB = cVar.b();
            long jC = plb.a().a(t, funnel).c();
            int i2 = (int) jC;
            int i3 = (int) (jC >>> 32);
            for (int i4 = 1; i4 <= i; i4++) {
                int i5 = (i4 * i3) + i2;
                if (i5 < 0) {
                    i5 = ~i5;
                }
                if (!cVar.d(((long) i5) % jB)) {
                    return false;
                }
            }
            return true;
        }
    }

    public a(String str, int i) {
        super(str, i);
    }

    public static /* synthetic */ a[] a() {
        return new a[]{f9271a, f9272b};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) c.clone();
    }

    public /* synthetic */ a(String str, int i, C0243a c0243a) {
        this(str, i);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicLongArray f9273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ore f9274b;

        public c(long j) {
            c6i.e(j > 0, "data length is zero!");
            this.f9273a = new AtomicLongArray(ahd.c(yre.b(j, 64L, RoundingMode.CEILING)));
            this.f9274b = pre.a();
        }

        public static long[] h(AtomicLongArray atomicLongArray) {
            int length = atomicLongArray.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = atomicLongArray.get(i);
            }
            return jArr;
        }

        public long a() {
            return this.f9274b.a();
        }

        public long b() {
            return ((long) this.f9273a.length()) * 64;
        }

        public c c() {
            return new c(h(this.f9273a));
        }

        public boolean d(long j) {
            return ((1 << ((int) j)) & this.f9273a.get((int) (j >>> 6))) != 0;
        }

        public void e(c cVar) {
            c6i.g(this.f9273a.length() == cVar.f9273a.length(), "BitArrays must be of equal length (%s != %s)", this.f9273a.length(), cVar.f9273a.length());
            for (int i = 0; i < this.f9273a.length(); i++) {
                f(i, cVar.f9273a.get(i));
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return Arrays.equals(h(this.f9273a), h(((c) obj).f9273a));
            }
            return false;
        }

        public void f(int i, long j) {
            long j2;
            long j3;
            do {
                j2 = this.f9273a.get(i);
                j3 = j2 | j;
                if (j2 == j3) {
                    return;
                }
            } while (!this.f9273a.compareAndSet(i, j2, j3));
            this.f9274b.add(Long.bitCount(j3) - Long.bitCount(j2));
        }

        public boolean g(long j) {
            long j2;
            long j3;
            if (d(j)) {
                return false;
            }
            int i = (int) (j >>> 6);
            long j4 = 1 << ((int) j);
            do {
                j2 = this.f9273a.get(i);
                j3 = j2 | j4;
                if (j2 == j3) {
                    return false;
                }
            } while (!this.f9273a.compareAndSet(i, j2, j3));
            this.f9274b.increment();
            return true;
        }

        public int hashCode() {
            return Arrays.hashCode(h(this.f9273a));
        }

        public c(long[] jArr) {
            c6i.e(jArr.length > 0, "data length is zero!");
            this.f9273a = new AtomicLongArray(jArr);
            this.f9274b = pre.a();
            long jBitCount = 0;
            for (long j : jArr) {
                jBitCount += (long) Long.bitCount(j);
            }
            this.f9274b.add(jBitCount);
        }
    }
}
