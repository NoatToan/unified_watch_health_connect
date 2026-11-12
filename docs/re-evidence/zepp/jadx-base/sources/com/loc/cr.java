package com.loc;

import android.os.SystemClock;
import android.util.LongSparseArray;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class cr {
    private static volatile cr g;
    private static Object h = new Object();
    private Object e = new Object();
    private Object f = new Object();
    private LongSparseArray<a> a = new LongSparseArray<>();
    private LongSparseArray<a> b = new LongSparseArray<>();
    private LongSparseArray<a> c = new LongSparseArray<>();
    private LongSparseArray<a> d = new LongSparseArray<>();

    public static class a {
        public int a;
        public long b;
        public boolean c;

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    private cr() {
    }

    public static cr a() {
        if (g == null) {
            synchronized (h) {
                if (g == null) {
                    g = new cr();
                }
            }
        }
        return g;
    }

    private static short a(LongSparseArray<a> longSparseArray, long j) {
        synchronized (longSparseArray) {
            a aVar = longSparseArray.get(j);
            if (aVar == null) {
                return (short) 0;
            }
            short sMax = (short) Math.max(1L, Math.min(32767L, (SystemClock.elapsedRealtime() - aVar.b) / 1000));
            if (!aVar.c) {
                sMax = (short) (-sMax);
            }
            return sMax;
        }
    }

    private static void a(List<cq> list, LongSparseArray<a> longSparseArray, LongSparseArray<a> longSparseArray2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int size = longSparseArray.size();
        byte b = 0;
        Iterator<cq> it2 = list.iterator();
        if (size == 0) {
            while (it2.hasNext()) {
                cq next = it2.next();
                a aVar = new a(b);
                aVar.a = next.b();
                aVar.b = jElapsedRealtime;
                aVar.c = false;
                longSparseArray2.put(next.a(), aVar);
            }
            return;
        }
        while (it2.hasNext()) {
            cq next2 = it2.next();
            long jA = next2.a();
            a aVar2 = longSparseArray.get(jA);
            if (aVar2 == null) {
                aVar2 = new a(b);
            } else {
                if (aVar2.a != next2.b()) {
                }
                longSparseArray2.put(jA, aVar2);
            }
            aVar2.a = next2.b();
            aVar2.b = jElapsedRealtime;
            aVar2.c = true;
            longSparseArray2.put(jA, aVar2);
        }
    }

    public final short a(long j) {
        return a(this.a, j);
    }

    public final void a(List<cq> list) {
        if (list.isEmpty()) {
            return;
        }
        synchronized (this.e) {
            a(list, this.a, this.b);
            LongSparseArray<a> longSparseArray = this.a;
            this.a = this.b;
            this.b = longSparseArray;
            longSparseArray.clear();
        }
    }

    public final short b(long j) {
        return a(this.c, j);
    }

    public final void b(List<cq> list) {
        if (list.isEmpty()) {
            return;
        }
        synchronized (this.f) {
            a(list, this.c, this.d);
            LongSparseArray<a> longSparseArray = this.c;
            this.c = this.d;
            this.d = longSparseArray;
            longSparseArray.clear();
        }
    }
}
