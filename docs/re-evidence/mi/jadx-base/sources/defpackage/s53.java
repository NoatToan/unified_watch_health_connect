package defpackage;

import android.util.SparseArray;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public class s53<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray<b<T>> f33306a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b<T> f33307b;
    public b<T> c;

    public static class b<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b<I> f33308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f33309b;
        public LinkedList<I> c;
        public b<I> d;

        public String toString() {
            return "LinkedEntry(key: " + this.f33309b + ")";
        }

        public b(b<I> bVar, int i, LinkedList<I> linkedList, b<I> bVar2) {
            this.f33308a = bVar;
            this.f33309b = i;
            this.c = linkedList;
            this.d = bVar2;
        }
    }

    public synchronized T a(int i) {
        b<T> bVar = this.f33306a.get(i);
        if (bVar == null) {
            return null;
        }
        T tPollFirst = bVar.c.pollFirst();
        c(bVar);
        return tPollFirst;
    }

    public final void b(b<T> bVar) {
        if (bVar == null || !bVar.c.isEmpty()) {
            return;
        }
        d(bVar);
        this.f33306a.remove(bVar.f33309b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(b<T> bVar) {
        if (this.f33307b == bVar) {
            return;
        }
        d(bVar);
        b<T> bVar2 = this.f33307b;
        if (bVar2 == 0) {
            this.f33307b = bVar;
            this.c = bVar;
        } else {
            bVar.d = bVar2;
            bVar2.f33308a = bVar;
            this.f33307b = bVar;
        }
    }

    public final synchronized void d(b<T> bVar) {
        try {
            b bVar2 = (b<T>) bVar.f33308a;
            b bVar3 = (b<T>) bVar.d;
            if (bVar2 != null) {
                bVar2.d = bVar3;
            }
            if (bVar3 != null) {
                bVar3.f33308a = bVar2;
            }
            bVar.f33308a = null;
            bVar.d = null;
            if (bVar == this.f33307b) {
                this.f33307b = bVar3;
            }
            if (bVar == this.c) {
                this.c = bVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void e(int i, T t) {
        try {
            b<T> bVar = this.f33306a.get(i);
            if (bVar == null) {
                bVar = new b<>(null, i, new LinkedList(), null);
                this.f33306a.put(i, bVar);
            }
            bVar.c.addLast(t);
            c(bVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized T f() {
        b<T> bVar = this.c;
        if (bVar == null) {
            return null;
        }
        T tPollLast = bVar.c.pollLast();
        b(bVar);
        return tPollLast;
    }
}
