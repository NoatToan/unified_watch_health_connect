package x3;

import j20.x;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.y0;
import w3.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lx3/e;", "E", "Lx3/d;", "", "Lx3/c;", "builder", "<init>", "(Lx3/c;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e<E> extends d<E> implements Iterator<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c<E> f188558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public E f188559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f188560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f188561g;

    /* JADX WARN: Illegal instructions before constructor call */
    public e(c<E> cVar) {
        Object obj = cVar.f188552b;
        f<E, a> fVar = cVar.f188554d;
        super(obj, fVar);
        this.f188558d = cVar;
        this.f188561g = fVar.f181796e;
    }

    @Override // x3.d, java.util.Iterator
    public final E next() {
        if (this.f188558d.f188554d.f181796e != this.f188561g) {
            org.apache.commons.lang3.e.h();
            return null;
        }
        E e4 = (E) super.next();
        this.f188559e = e4;
        this.f188560f = true;
        return e4;
    }

    @Override // x3.d, java.util.Iterator
    public final void remove() {
        if (!this.f188560f) {
            x.h();
            return;
        }
        E e4 = this.f188559e;
        c<E> cVar = this.f188558d;
        y0.a(cVar).remove(e4);
        this.f188559e = null;
        this.f188560f = false;
        this.f188561g = cVar.f188554d.f181796e;
        this.f188557c--;
    }
}
