package m53;

import java.util.Iterator;
import java.util.Set;
import k53.f;
import lr2.o;
import p005kotlin.Metadata;
import p13.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm53/c;", "E", "Lp13/h;", "Li53/h$a;", "Lm53/b;", "set", "<init>", "(Lm53/b;)V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c<E> extends h<E> implements i53.h.a<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f116789e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b<E> f116790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f116791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f116792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f<E, a> f116793d;

    public c(b<E> bVar) {
        bVar.getClass();
        this.f116790a = bVar;
        this.f116791b = bVar.f116786b;
        this.f116792c = bVar.f116787c;
        k53.d<E, a> dVar = bVar.f116788d;
        dVar.getClass();
        this.f116793d = new f<>(dVar);
    }

    @Override // p13.h
    public final int a() {
        return this.f116793d.getF102978f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e4) {
        f<E, a> fVar = this.f116793d;
        if (fVar.containsKey(e4)) {
            return false;
        }
        this.f116790a = null;
        if (isEmpty()) {
            this.f116791b = e4;
            this.f116792c = e4;
            fVar.put(e4, new a());
            return true;
        }
        a aVar = fVar.get(this.f116792c);
        aVar.getClass();
        fVar.put((E) this.f116792c, new a(aVar.f116782a, e4));
        fVar.put(e4, new a(this.f116792c));
        this.f116792c = e4;
        return true;
    }

    @Override // i53.h.a
    public final b build() {
        b<E> bVar = this.f116790a;
        f<E, a> fVar = this.f116793d;
        if (bVar != null) {
            k53.d<E, a> dVar = fVar.f102973a;
            return bVar;
        }
        k53.d<E, a> dVar2 = fVar.f102973a;
        b<E> bVar2 = new b<>(this.f116791b, this.f116792c, fVar.build());
        this.f116790a = bVar2;
        return bVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        f<E, a> fVar = this.f116793d;
        if (!fVar.isEmpty()) {
            this.f116790a = null;
        }
        fVar.clear();
        n53.b bVar = n53.b.f123788a;
        this.f116791b = bVar;
        this.f116792c = bVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f116793d.containsKey(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (a() != set.size()) {
            return false;
        }
        boolean z14 = set instanceof b;
        f<E, a> fVar = this.f116793d;
        if (z14) {
            return fVar.f102975c.g(((b) obj).f116788d.f102964b, new o(17));
        }
        return set instanceof c ? fVar.f102975c.g(((c) obj).f116793d.f102975c, new o(18)) : super.equals(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new e(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        f<E, a> fVar = this.f116793d;
        a aVarRemove = fVar.remove(obj);
        if (aVarRemove == null) {
            return false;
        }
        Object obj2 = aVarRemove.f116783b;
        Object obj3 = aVarRemove.f116782a;
        this.f116790a = null;
        n53.b bVar = n53.b.f123788a;
        if (obj3 != bVar) {
            a aVar = fVar.get(obj3);
            aVar.getClass();
            fVar.put((E) obj3, new a(aVar.f116782a, obj2));
        } else {
            this.f116791b = obj2;
        }
        if (obj2 == bVar) {
            this.f116792c = obj3;
            return true;
        }
        a aVar2 = fVar.get(obj2);
        aVar2.getClass();
        fVar.put((E) obj2, new a(obj3, aVar2.f116783b));
        return true;
    }
}
