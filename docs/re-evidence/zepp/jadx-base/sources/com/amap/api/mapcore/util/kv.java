package com.amap.api.mapcore.util;

import android.os.SystemClock;
import android.util.LongSparseArray;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kv {
    private static volatile kv g;
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

    private kv() {
    }

    public static kv a() {
        if (g == null) {
            synchronized (h) {
                if (g == null) {
                    g = new kv();
                }
            }
        }
        return g;
    }

    public final void a(List<ku> list) {
        if (list.isEmpty()) {
            return;
        }
        synchronized (this.e) {
            LongSparseArray<a> longSparseArray = this.a;
            LongSparseArray<a> longSparseArray2 = this.b;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            byte b = 0;
            if (longSparseArray.size() == 0) {
                for (ku kuVar : list) {
                    a aVar = new a(b);
                    aVar.a = kuVar.b();
                    aVar.b = jElapsedRealtime;
                    aVar.c = false;
                    longSparseArray2.put(kuVar.a(), aVar);
                }
            } else {
                for (ku kuVar2 : list) {
                    long jA = kuVar2.a();
                    a aVar2 = longSparseArray.get(jA);
                    if (aVar2 == null) {
                        aVar2 = new a(b);
                        aVar2.a = kuVar2.b();
                        aVar2.b = jElapsedRealtime;
                    } else {
                        if (aVar2.a != kuVar2.b()) {
                            aVar2.a = kuVar2.b();
                            aVar2.b = jElapsedRealtime;
                        }
                        longSparseArray2.put(jA, aVar2);
                    }
                    aVar2.c = true;
                    longSparseArray2.put(jA, aVar2);
                }
            }
            LongSparseArray<a> longSparseArray3 = this.a;
            this.a = this.b;
            this.b = longSparseArray3;
            longSparseArray3.clear();
        }
    }
}
