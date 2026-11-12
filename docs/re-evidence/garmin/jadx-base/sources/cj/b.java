package cj;

import qj.l;
import wi.u;

/* JADX INFO: loaded from: classes7.dex */
public class b<T> implements u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f27730a;

    public b(T t7) {
        l.c(t7, "Argument must not be null");
        this.f27730a = t7;
    }

    @Override // wi.u
    public final Class<T> a() {
        return (Class<T>) this.f27730a.getClass();
    }

    @Override // wi.u
    public final void b() {
    }

    @Override // wi.u
    public final T get() {
        return this.f27730a;
    }

    @Override // wi.u
    public final int getSize() {
        return 1;
    }
}
