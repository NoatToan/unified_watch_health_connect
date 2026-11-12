package l53;

import java.util.Iterator;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll53/g;", "K", "V", "", "Lp13/h;", "Ll53/d;", "builder", "<init>", "(Ll53/d;)V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g<K, V> extends p13.h<K> implements Set<K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d<K, V> f110419a;

    public g(d<K, V> dVar) {
        dVar.getClass();
        this.f110419a = dVar;
    }

    @Override // p13.h
    public final int a() {
        return this.f110419a.f110412d.getF102978f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(K k14) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f110419a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f110419a.f110412d.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        return new h(this.f110419a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        d<K, V> dVar = this.f110419a;
        if (!dVar.f110412d.containsKey(obj)) {
            return false;
        }
        dVar.remove(obj);
        return true;
    }
}
