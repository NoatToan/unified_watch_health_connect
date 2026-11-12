package x3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p005kotlin.Metadata;
import p13.h;
import w3.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lx3/c;", "E", "Lp13/h;", "", "Lx3/b;", "set", "<init>", "(Lx3/b;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c<E> extends h<E> implements Set, Collection, f23.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b<E> f188551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f188552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f188553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f<E, a> f188554d;

    public c(b<E> bVar) {
        this.f188551a = bVar;
        this.f188552b = bVar.f188548b;
        this.f188553c = bVar.f188549c;
        this.f188554d = bVar.f188550d.builder();
    }

    @Override // p13.h
    public final int a() {
        return this.f188554d.getF102978f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e4) {
        f<E, a> fVar = this.f188554d;
        if (fVar.containsKey(e4)) {
            return false;
        }
        if (isEmpty()) {
            this.f188552b = e4;
            this.f188553c = e4;
            fVar.put(e4, new a());
            return true;
        }
        a aVar = fVar.get(this.f188553c);
        aVar.getClass();
        fVar.put((E) this.f188553c, new a(aVar.f188544a, e4));
        fVar.put(e4, new a(this.f188553c));
        this.f188553c = e4;
        return true;
    }

    public final b b() {
        w3.d<E, a> dVarE = this.f188554d.e();
        b<E> bVar = this.f188551a;
        if (dVarE != bVar.f188550d) {
            bVar = new b<>(this.f188552b, this.f188553c, dVarE);
        }
        this.f188551a = bVar;
        return bVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f188554d.clear();
        y3.b bVar = y3.b.f194361a;
        this.f188552b = bVar;
        this.f188553c = bVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f188554d.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new e(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        f<E, a> fVar = this.f188554d;
        a aVarRemove = fVar.remove(obj);
        if (aVarRemove == null) {
            return false;
        }
        Object obj2 = aVarRemove.f188545b;
        Object obj3 = aVarRemove.f188544a;
        y3.b bVar = y3.b.f194361a;
        if (obj3 != bVar) {
            a aVar = fVar.get(obj3);
            aVar.getClass();
            fVar.put((E) obj3, new a(aVar.f188544a, obj2));
        } else {
            this.f188552b = obj2;
        }
        if (obj2 == bVar) {
            this.f188553c = obj3;
            return true;
        }
        a aVar2 = fVar.get(obj2);
        aVar2.getClass();
        fVar.put((E) obj2, new a(obj3, aVar2.f188545b));
        return true;
    }
}
