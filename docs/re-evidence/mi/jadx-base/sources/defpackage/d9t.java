package defpackage;

import android.os.SystemClock;
import android.util.LongSparseArray;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class d9t {
    public static volatile d9t g;
    public static Object h = new Object();
    public Object e = new Object();
    public Object f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LongSparseArray<a> f15279a = new LongSparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LongSparseArray<a> f15280b = new LongSparseArray<>();
    public LongSparseArray<a> c = new LongSparseArray<>();
    public LongSparseArray<a> d = new LongSparseArray<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f15282b;
        public boolean c;

        public a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static d9t a() {
        if (g == null) {
            synchronized (h) {
                try {
                    if (g == null) {
                        g = new d9t();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    public static short c(LongSparseArray<a> longSparseArray, long j) {
        synchronized (longSparseArray) {
            try {
                a aVar = longSparseArray.get(j);
                if (aVar == null) {
                    return (short) 0;
                }
                short sMax = (short) Math.max(1L, Math.min(32767L, (f() - aVar.f15282b) / 1000));
                if (!aVar.c) {
                    sMax = (short) (-sMax);
                }
                return sMax;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void e(List<a9t> list, LongSparseArray<a> longSparseArray, LongSparseArray<a> longSparseArray2) {
        long jF = f();
        byte b2 = 0;
        if (longSparseArray.size() == 0) {
            for (a9t a9tVar : list) {
                a aVar = new a(b2);
                aVar.f15281a = a9tVar.b();
                aVar.f15282b = jF;
                aVar.c = false;
                longSparseArray2.put(a9tVar.a(), aVar);
            }
            return;
        }
        for (a9t a9tVar2 : list) {
            long jA = a9tVar2.a();
            a aVar2 = longSparseArray.get(jA);
            if (aVar2 == null) {
                aVar2 = new a(b2);
                aVar2.f15281a = a9tVar2.b();
                aVar2.f15282b = jF;
                aVar2.c = true;
            } else if (aVar2.f15281a != a9tVar2.b()) {
                aVar2.f15281a = a9tVar2.b();
                aVar2.f15282b = jF;
                aVar2.c = true;
            }
            longSparseArray2.put(jA, aVar2);
        }
    }

    public static long f() {
        return SystemClock.elapsedRealtime();
    }

    public final short b(long j) {
        return c(this.f15279a, j);
    }

    public final void d(List<a9t> list) {
        if (list.isEmpty()) {
            return;
        }
        synchronized (this.e) {
            e(list, this.f15279a, this.f15280b);
            LongSparseArray<a> longSparseArray = this.f15279a;
            this.f15279a = this.f15280b;
            this.f15280b = longSparseArray;
            longSparseArray.clear();
        }
    }

    public final short g(long j) {
        return c(this.c, j);
    }

    public final void h(List<a9t> list) {
        if (list.isEmpty()) {
            return;
        }
        synchronized (this.f) {
            e(list, this.c, this.d);
            LongSparseArray<a> longSparseArray = this.c;
            this.c = this.d;
            this.d = longSparseArray;
            longSparseArray.clear();
        }
    }
}
