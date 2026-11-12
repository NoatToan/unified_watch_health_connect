package com.google.common.collect;

import defpackage.c6i;
import defpackage.ich;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

/* JADX INFO: loaded from: classes5.dex */
public abstract class h<E> extends e<E> implements l0<E> {
    final Comparator<? super E> comparator;
    private transient l0<E> descendingMultiset;

    public class a extends m<E> {
        public a() {
        }

        @Override // defpackage.i1a, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return h.this.descendingIterator();
        }

        @Override // com.google.common.collect.m
        public Iterator<u.a<E>> j() {
            return h.this.descendingEntryIterator();
        }

        @Override // com.google.common.collect.m
        public l0<E> m() {
            return h.this;
        }
    }

    public h() {
        this(ich.e());
    }

    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    public l0<E> createDescendingMultiset() {
        return new a();
    }

    public abstract Iterator<u.a<E>> descendingEntryIterator();

    public Iterator<E> descendingIterator() {
        return v.i(descendingMultiset());
    }

    public l0<E> descendingMultiset() {
        l0<E> l0Var = this.descendingMultiset;
        if (l0Var != null) {
            return l0Var;
        }
        l0<E> l0VarCreateDescendingMultiset = createDescendingMultiset();
        this.descendingMultiset = l0VarCreateDescendingMultiset;
        return l0VarCreateDescendingMultiset;
    }

    public u.a<E> firstEntry() {
        Iterator<u.a<E>> itEntryIterator = entryIterator();
        if (itEntryIterator.hasNext()) {
            return itEntryIterator.next();
        }
        return null;
    }

    public u.a<E> lastEntry() {
        Iterator<u.a<E>> itDescendingEntryIterator = descendingEntryIterator();
        if (itDescendingEntryIterator.hasNext()) {
            return itDescendingEntryIterator.next();
        }
        return null;
    }

    public u.a<E> pollFirstEntry() {
        Iterator<u.a<E>> itEntryIterator = entryIterator();
        if (!itEntryIterator.hasNext()) {
            return null;
        }
        u.a<E> next = itEntryIterator.next();
        u.a<E> aVarG = v.g(next.getElement(), next.getCount());
        itEntryIterator.remove();
        return aVarG;
    }

    public u.a<E> pollLastEntry() {
        Iterator<u.a<E>> itDescendingEntryIterator = descendingEntryIterator();
        if (!itDescendingEntryIterator.hasNext()) {
            return null;
        }
        u.a<E> next = itDescendingEntryIterator.next();
        u.a<E> aVarG = v.g(next.getElement(), next.getCount());
        itDescendingEntryIterator.remove();
        return aVarG;
    }

    public l0<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2) {
        c6i.o(boundType);
        c6i.o(boundType2);
        return tailMultiset(e, boundType).headMultiset(e2, boundType2);
    }

    public h(Comparator<? super E> comparator) {
        this.comparator = (Comparator) c6i.o(comparator);
    }

    @Override // com.google.common.collect.e
    public NavigableSet<E> createElementSet() {
        return new m0.b(this);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.u
    public NavigableSet<E> elementSet() {
        return (NavigableSet) super.elementSet();
    }
}
