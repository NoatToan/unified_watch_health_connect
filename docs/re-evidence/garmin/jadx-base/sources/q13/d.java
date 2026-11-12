package q13;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u001d\b\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lq13/d;", "K", "V", "Lq13/a;", "", "Lq13/c;", "backing", "<init>", "(Lq13/c;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d<K, V> extends a<Map.Entry<K, V>, K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c<K, V> f142141a;

    public d(c<K, V> cVar) {
        cVar.getClass();
        this.f142141a = cVar;
    }

    @Override // p13.h
    public final int a() {
        return this.f142141a.f142129i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        ((Map.Entry) obj).getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // q13.a
    public final boolean b(Map.Entry<? extends K, ? extends V> entry) {
        entry.getClass();
        c<K, V> cVar = this.f142141a;
        cVar.getClass();
        int iH = cVar.h(entry.getKey());
        if (iH < 0) {
            return false;
        }
        V[] vArr = cVar.f142122b;
        vArr.getClass();
        return s.g(vArr[iH], entry.getValue());
    }

    @Override // q13.a
    public final boolean c(Map.Entry<K, V> entry) {
        entry.getClass();
        c<K, V> cVar = this.f142141a;
        cVar.getClass();
        cVar.c();
        int iH = cVar.h(entry.getKey());
        if (iH < 0) {
            return false;
        }
        V[] vArr = cVar.f142122b;
        vArr.getClass();
        if (!s.g(vArr[iH], entry.getValue())) {
            return false;
        }
        cVar.m(iH);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f142141a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        collection.getClass();
        return this.f142141a.e(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f142141a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        c<K, V> cVar = this.f142141a;
        cVar.getClass();
        return new c.b(cVar);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        collection.getClass();
        this.f142141a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        this.f142141a.c();
        return super.retainAll(collection);
    }
}
