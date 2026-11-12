package defpackage;

import androidx.annotation.GuardedBy;
import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes4.dex */
public final class yzk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @GuardedBy("this")
    public final TreeSet<a> f40724a = new TreeSet<>(new Comparator() { // from class: xzk
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return yzk.d((yzk.a) obj, (yzk.a) obj2);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    public int f40725b;

    @GuardedBy("this")
    public int c;

    @GuardedBy("this")
    public boolean d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wzk f40726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f40727b;

        public a(wzk wzkVar, long j) {
            this.f40726a = wzkVar;
            this.f40727b = j;
        }
    }

    public yzk() {
        i();
    }

    public static int c(int i, int i2) {
        int iMin;
        int i3 = i - i2;
        if (Math.abs(i3) <= 1000 || (iMin = (Math.min(i, i2) - Math.max(i, i2)) + 65535) >= 1000) {
            return i3;
        }
        return i < i2 ? iMin : -iMin;
    }

    public static /* synthetic */ int d(a aVar, a aVar2) {
        return c(aVar.f40726a.g, aVar2.f40726a.g);
    }

    public static int e(int i) {
        return (i + 1) % 65535;
    }

    public static int h(int i) {
        if (i == 0) {
            return 65534;
        }
        return (i - 1) % 65535;
    }

    public final synchronized void b(a aVar) {
        this.f40725b = aVar.f40726a.g;
        this.f40724a.add(aVar);
    }

    public synchronized boolean f(wzk wzkVar, long j) {
        int i = wzkVar.g;
        if (!this.d) {
            i();
            this.c = h(i);
            this.d = true;
            b(new a(wzkVar, j));
            return true;
        }
        if (Math.abs(c(i, e(this.f40725b))) < 1000) {
            if (c(i, this.c) <= 0) {
                return false;
            }
            b(new a(wzkVar, j));
            return true;
        }
        this.c = h(i);
        this.f40724a.clear();
        b(new a(wzkVar, j));
        return true;
    }

    public synchronized wzk g(long j) {
        if (this.f40724a.isEmpty()) {
            return null;
        }
        a aVarFirst = this.f40724a.first();
        int i = aVarFirst.f40726a.g;
        if (i != e(this.c) && j < aVarFirst.f40727b) {
            return null;
        }
        this.f40724a.pollFirst();
        this.c = i;
        return aVarFirst.f40726a;
    }

    public synchronized void i() {
        this.f40724a.clear();
        this.d = false;
        this.c = -1;
        this.f40725b = -1;
    }
}
