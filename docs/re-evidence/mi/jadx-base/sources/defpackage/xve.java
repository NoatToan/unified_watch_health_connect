package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class xve<T, Y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<T, a<Y>> f39504a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39505b;
    public long c;
    public long d;

    public static final class a<Y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Y f39506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f39507b;

        public a(Y y, int i) {
            this.f39506a = y;
            this.f39507b = i;
        }
    }

    public xve(long j) {
        this.f39505b = j;
        this.c = j;
    }

    public void clearMemory() {
        k(0L);
    }

    public final void d() {
        k(this.c);
    }

    public synchronized Y e(T t) {
        a<Y> aVar;
        aVar = this.f39504a.get(t);
        return aVar != null ? aVar.f39506a : null;
    }

    public synchronized long f() {
        return this.c;
    }

    public int g(Y y) {
        return 1;
    }

    public void h(T t, Y y) {
    }

    public synchronized Y i(T t, Y y) {
        int iG = g(y);
        long j = iG;
        if (j >= this.c) {
            h(t, y);
            return null;
        }
        if (y != null) {
            this.d += j;
        }
        a<Y> aVarPut = this.f39504a.put(t, y == null ? null : new a<>(y, iG));
        if (aVarPut != null) {
            this.d -= (long) aVarPut.f39507b;
            if (!aVarPut.f39506a.equals(y)) {
                h(t, aVarPut.f39506a);
            }
        }
        d();
        return aVarPut != null ? aVarPut.f39506a : null;
    }

    public synchronized Y j(T t) {
        a<Y> aVarRemove = this.f39504a.remove(t);
        if (aVarRemove == null) {
            return null;
        }
        this.d -= (long) aVarRemove.f39507b;
        return aVarRemove.f39506a;
    }

    public synchronized void k(long j) {
        while (this.d > j) {
            Iterator<Map.Entry<T, a<Y>>> it = this.f39504a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it.next();
            a<Y> value = next.getValue();
            this.d -= (long) value.f39507b;
            T key = next.getKey();
            it.remove();
            h(key, value.f39506a);
        }
    }
}
