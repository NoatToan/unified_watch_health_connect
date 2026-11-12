package f4;

import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf4/j0;", "T", "", "Lf4/w;", "set", "", "iterator", "<init>", "(Lf4/w;Ljava/util/Iterator;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j0<T> implements Iterator<T>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w<T> f68763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator<T> f68764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f68765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T f68766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f68767e;

    /* JADX WARN: Multi-variable type inference failed */
    public j0(w<T> wVar, Iterator<? extends T> it) {
        this.f68763a = wVar;
        this.f68764b = it;
        k0 k0Var = wVar.f68837a;
        k0Var.getClass();
        this.f68767e = ((k0) l.g(k0Var)).f68772d;
        this.f68765c = this.f68766d;
        this.f68766d = it.hasNext() ? (T) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f68766d != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        k0 k0Var = this.f68763a.f68837a;
        k0Var.getClass();
        if (((k0) l.g(k0Var)).f68772d != this.f68767e) {
            org.apache.commons.lang3.e.h();
            return null;
        }
        this.f68765c = this.f68766d;
        Iterator<T> it = this.f68764b;
        this.f68766d = it.hasNext() ? it.next() : null;
        T t7 = this.f68765c;
        if (t7 != null) {
            return t7;
        }
        j20.x.h();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        w<T> wVar = this.f68763a;
        k0 k0Var = wVar.f68837a;
        k0Var.getClass();
        if (((k0) l.g(k0Var)).f68772d != this.f68767e) {
            org.apache.commons.lang3.e.h();
            return;
        }
        T t7 = this.f68765c;
        if (t7 == null) {
            j20.x.h();
            return;
        }
        wVar.remove(t7);
        this.f68765c = null;
        Unit unit = Unit.INSTANCE;
        k0 k0Var2 = wVar.f68837a;
        k0Var2.getClass();
        this.f68767e = ((k0) l.g(k0Var2)).f68772d;
    }
}
