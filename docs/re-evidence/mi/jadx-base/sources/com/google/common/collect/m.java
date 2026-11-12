package com.google.common.collect;

import defpackage.ich;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class m<E> extends o<E> implements l0<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Comparator<? super E> f9199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient NavigableSet<E> f9200b;
    public transient Set<u.a<E>> c;

    public class a extends v.d<E> {
        public a() {
        }

        @Override // com.google.common.collect.v.d
        public u<E> i() {
            return m.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<u.a<E>> iterator() {
            return m.this.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return m.this.m().entrySet().size();
        }
    }

    @Override // com.google.common.collect.l0, defpackage.n4n
    public Comparator<? super E> comparator() {
        Comparator<? super E> comparator = this.f9199a;
        if (comparator != null) {
            return comparator;
        }
        ich ichVarH = ich.a(m().comparator()).h();
        this.f9199a = ichVarH;
        return ichVarH;
    }

    @Override // com.google.common.collect.l0
    public l0<E> descendingMultiset() {
        return m();
    }

    @Override // com.google.common.collect.o, com.google.common.collect.u
    public Set<u.a<E>> entrySet() {
        Set<u.a<E>> set = this.c;
        if (set != null) {
            return set;
        }
        Set<u.a<E>> setG = g();
        this.c = setG;
        return setG;
    }

    @Override // defpackage.i1a, defpackage.t1a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public u<E> delegate() {
        return m();
    }

    @Override // com.google.common.collect.l0
    public u.a<E> firstEntry() {
        return m().lastEntry();
    }

    public Set<u.a<E>> g() {
        return new a();
    }

    @Override // com.google.common.collect.l0
    public l0<E> headMultiset(E e, BoundType boundType) {
        return m().tailMultiset(e, boundType).descendingMultiset();
    }

    public abstract Iterator<u.a<E>> j();

    @Override // com.google.common.collect.l0
    public u.a<E> lastEntry() {
        return m().firstEntry();
    }

    public abstract l0<E> m();

    @Override // com.google.common.collect.l0
    public u.a<E> pollFirstEntry() {
        return m().pollLastEntry();
    }

    @Override // com.google.common.collect.l0
    public u.a<E> pollLastEntry() {
        return m().pollFirstEntry();
    }

    @Override // com.google.common.collect.l0
    public l0<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2) {
        return m().subMultiset(e2, boundType2, e, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.l0
    public l0<E> tailMultiset(E e, BoundType boundType) {
        return m().headMultiset(e, boundType).descendingMultiset();
    }

    @Override // defpackage.i1a, java.util.Collection
    public Object[] toArray() {
        return standardToArray();
    }

    @Override // defpackage.t1a
    public String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.u
    public NavigableSet<E> elementSet() {
        NavigableSet<E> navigableSet = this.f9200b;
        if (navigableSet != null) {
            return navigableSet;
        }
        m0.b bVar = new m0.b(this);
        this.f9200b = bVar;
        return bVar;
    }

    @Override // defpackage.i1a, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) standardToArray(tArr);
    }
}
