package m53;

import j20.x;
import java.util.Iterator;
import k53.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.y0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm53/e;", "E", "Lm53/d;", "", "Lm53/c;", "builder", "<init>", "(Lm53/c;)V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e<E> extends d<E> implements Iterator<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c<E> f116797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public E f116798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f116799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f116800g;

    /* JADX WARN: Illegal instructions before constructor call */
    public e(c<E> cVar) {
        cVar.getClass();
        Object obj = cVar.f116791b;
        f<E, a> fVar = cVar.f116793d;
        super(obj, fVar);
        this.f116797d = cVar;
        this.f116800g = fVar.f102977e;
    }

    @Override // m53.d, java.util.Iterator
    public final E next() {
        if (this.f116797d.f116793d.f102977e != this.f116800g) {
            org.apache.commons.lang3.e.h();
            return null;
        }
        E e4 = (E) super.next();
        this.f116798e = e4;
        this.f116799f = true;
        return e4;
    }

    @Override // m53.d, java.util.Iterator
    public final void remove() {
        if (!this.f116799f) {
            x.h();
            return;
        }
        E e4 = this.f116798e;
        c<E> cVar = this.f116797d;
        y0.a(cVar).remove(e4);
        this.f116798e = null;
        this.f116799f = false;
        this.f116800g = cVar.f116793d.f102977e;
        this.f116796c--;
    }
}
