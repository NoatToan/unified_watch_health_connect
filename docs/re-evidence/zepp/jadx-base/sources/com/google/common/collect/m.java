package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
abstract class m<E> extends h<E> implements SortedMultiset<E> {

    @z0
    public final Comparator<? super E> c;

    @MonotonicNonNullDecl
    private transient SortedMultiset<E> d;

    public class a extends h0<E> {
        public a() {
        }

        @Override // com.google.common.collect.h0
        public Iterator<Multiset.Entry<E>> entryIterator() {
            return m.this.h();
        }

        @Override // com.google.common.collect.h0
        public SortedMultiset<E> f() {
            return m.this;
        }

        @Override // com.google.common.collect.h0, com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return m.this.descendingIterator();
        }
    }

    public m() {
        this(Ordering.natural());
    }

    public Comparator<? super E> comparator() {
        return this.c;
    }

    Iterator<E> descendingIterator() {
        return Multisets.h(descendingMultiset());
    }

    public SortedMultiset<E> descendingMultiset() {
        SortedMultiset<E> sortedMultiset = this.d;
        if (sortedMultiset != null) {
            return sortedMultiset;
        }
        SortedMultiset<E> sortedMultisetF = f();
        this.d = sortedMultisetF;
        return sortedMultisetF;
    }

    public SortedMultiset<E> f() {
        return new a();
    }

    public Multiset.Entry<E> firstEntry() {
        Iterator<Multiset.Entry<E>> itE = e();
        if (itE.hasNext()) {
            return itE.next();
        }
        return null;
    }

    @Override // com.google.common.collect.h
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public NavigableSet<E> a() {
        return new r2.b(this);
    }

    public abstract Iterator<Multiset.Entry<E>> h();

    public Multiset.Entry<E> lastEntry() {
        Iterator<Multiset.Entry<E>> itH = h();
        if (itH.hasNext()) {
            return itH.next();
        }
        return null;
    }

    public Multiset.Entry<E> pollFirstEntry() {
        Iterator<Multiset.Entry<E>> itE = e();
        if (!itE.hasNext()) {
            return null;
        }
        Multiset.Entry<E> next = itE.next();
        Multiset.Entry<E> entryImmutableEntry = Multisets.immutableEntry(next.getElement(), next.getCount());
        itE.remove();
        return entryImmutableEntry;
    }

    public Multiset.Entry<E> pollLastEntry() {
        Iterator<Multiset.Entry<E>> itH = h();
        if (!itH.hasNext()) {
            return null;
        }
        Multiset.Entry<E> next = itH.next();
        Multiset.Entry<E> entryImmutableEntry = Multisets.immutableEntry(next.getElement(), next.getCount());
        itH.remove();
        return entryImmutableEntry;
    }

    public SortedMultiset<E> subMultiset(@NullableDecl E e, BoundType boundType, @NullableDecl E e2, BoundType boundType2) {
        Preconditions.checkNotNull(boundType);
        Preconditions.checkNotNull(boundType2);
        return tailMultiset(e, boundType).headMultiset(e2, boundType2);
    }

    public m(Comparator<? super E> comparator) {
        this.c = (Comparator) Preconditions.checkNotNull(comparator);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.Multiset
    public NavigableSet<E> elementSet() {
        return (NavigableSet) super.elementSet();
    }
}
