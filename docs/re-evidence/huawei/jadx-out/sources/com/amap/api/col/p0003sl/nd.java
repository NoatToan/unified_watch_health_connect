package com.amap.api.col.p0003sl;

import android.os.SystemClock;
import android.util.LongSparseArray;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class nd {
    private static volatile nd g;
    private static Object h = new Object();
    private Object e = new Object();
    private Object f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LongSparseArray<a> f3212a = new LongSparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LongSparseArray<a> f3213b = new LongSparseArray<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LongSparseArray<a> f3214c = new LongSparseArray<>();
    private LongSparseArray<a> d = new LongSparseArray<>();

    public static nd a() {
        if (g == null) {
            synchronized (h) {
                if (g == null) {
                    g = new nd();
                }
            }
        }
        return g;
    }

    private nd() {
    }

    final void a(List<nc> list) {
        if (list.isEmpty()) {
            return;
        }
        synchronized (this.e) {
            a(list, this.f3212a, this.f3213b);
            LongSparseArray<a> longSparseArray = this.f3212a;
            this.f3212a = this.f3213b;
            this.f3213b = longSparseArray;
            longSparseArray.clear();
        }
    }

    final short a(long j) {
        return a(this.f3212a, j);
    }

    final void b(List<nc> list) {
        if (list.isEmpty()) {
            return;
        }
        synchronized (this.f) {
            a(list, this.f3214c, this.d);
            LongSparseArray<a> longSparseArray = this.f3214c;
            this.f3214c = this.d;
            this.d = longSparseArray;
            longSparseArray.clear();
        }
    }

    final short b(long j) {
        return a(this.f3214c, j);
    }

    private static void a(List<nc> list, LongSparseArray<a> longSparseArray, LongSparseArray<a> longSparseArray2) {
        long jB = b();
        byte b2 = 0;
        if (longSparseArray.size() == 0) {
            for (nc ncVar : list) {
                a aVar = new a(b2);
                aVar.f3215a = ncVar.b();
                aVar.f3216b = jB;
                aVar.f3217c = false;
                longSparseArray2.put(ncVar.a(), aVar);
            }
            return;
        }
        for (nc ncVar2 : list) {
            long jA = ncVar2.a();
            a aVar2 = longSparseArray.get(jA);
            if (aVar2 == null) {
                aVar2 = new a(b2);
                aVar2.f3215a = ncVar2.b();
                aVar2.f3216b = jB;
                aVar2.f3217c = true;
            } else if (aVar2.f3215a != ncVar2.b()) {
                aVar2.f3215a = ncVar2.b();
                aVar2.f3216b = jB;
                aVar2.f3217c = true;
            }
            longSparseArray2.put(jA, aVar2);
        }
    }

    private static short a(LongSparseArray<a> longSparseArray, long j) {
        synchronized (longSparseArray) {
            a aVar = longSparseArray.get(j);
            if (aVar == null) {
                return (short) 0;
            }
            short sMax = (short) Math.max(1L, Math.min(32767L, (b() - aVar.f3216b) / 1000));
            if (!aVar.f3217c) {
                sMax = (short) (-sMax);
            }
            return sMax;
        }
    }

    private static long b() {
        return SystemClock.elapsedRealtime();
    }

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f3216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f3217c;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }
}
