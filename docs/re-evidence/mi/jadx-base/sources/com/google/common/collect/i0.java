package com.google.common.collect;

import defpackage.b10;
import defpackage.c6i;
import defpackage.epd;
import defpackage.uaq;
import defpackage.y1a;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
public final class i0 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    public class a<E> extends c<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set f9179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Set f9180b;

        /* JADX INFO: renamed from: com.google.common.collect.i0$a$a, reason: collision with other inner class name */
        public class C0234a extends b10<E> {
            public final Iterator<E> c;

            public C0234a() {
                this.c = a.this.f9179a.iterator();
            }

            @Override // defpackage.b10
            public E a() {
                while (this.c.hasNext()) {
                    E next = this.c.next();
                    if (a.this.f9180b.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Set set, Set set2) {
            super(null);
            this.f9179a = set;
            this.f9180b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f9179a.contains(obj) && this.f9180b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f9179a.containsAll(collection) && this.f9180b.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public uaq<E> iterator() {
            return new C0234a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f9180b, this.f9179a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f9179a.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (this.f9180b.contains(it.next())) {
                    i++;
                }
            }
            return i;
        }
    }

    public static abstract class b<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return i0.g(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) c6i.o(collection));
        }
    }

    public static abstract class c<E> extends AbstractSet<E> {
        public /* synthetic */ c(h0 h0Var) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public c() {
        }
    }

    public static final class d<E> extends y1a<E> implements NavigableSet<E>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NavigableSet<E> f9181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SortedSet<E> f9182b;
        public transient d<E> c;

        public d(NavigableSet<E> navigableSet) {
            this.f9181a = (NavigableSet) c6i.o(navigableSet);
            this.f9182b = Collections.unmodifiableSortedSet(navigableSet);
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e) {
            return this.f9181a.ceiling(e);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return epd.x(this.f9181a.descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            d<E> dVar = this.c;
            if (dVar != null) {
                return dVar;
            }
            d<E> dVar2 = new d<>(this.f9181a.descendingSet());
            this.c = dVar2;
            dVar2.c = this;
            return dVar2;
        }

        @Override // defpackage.w1a, defpackage.i1a, defpackage.t1a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public SortedSet<E> delegate() {
            return this.f9182b;
        }

        @Override // java.util.NavigableSet
        public E floor(E e) {
            return this.f9181a.floor(e);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e, boolean z) {
            return i0.i(this.f9181a.headSet(e, z));
        }

        @Override // java.util.NavigableSet
        public E higher(E e) {
            return this.f9181a.higher(e);
        }

        @Override // java.util.NavigableSet
        public E lower(E e) {
            return this.f9181a.lower(e);
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return i0.i(this.f9181a.subSet(e, z, e2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e, boolean z) {
            return i0.i(this.f9181a.tailSet(e, z));
        }
    }

    public static boolean a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static int b(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static <E> c<E> c(Set<E> set, Set<?> set2) {
        c6i.p(set, "set1");
        c6i.p(set2, "set2");
        return new a(set, set2);
    }

    public static <E> HashSet<E> d() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> e(int i) {
        return new HashSet<>(s.d(i));
    }

    public static <E> Set<E> f() {
        return Collections.newSetFromMap(s.q());
    }

    public static boolean g(Set<?> set, Collection<?> collection) {
        c6i.o(collection);
        if (collection instanceof u) {
            collection = ((u) collection).elementSet();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? h(set, collection.iterator()) : epd.r(set.iterator(), collection);
    }

    public static boolean h(Set<?> set, Iterator<?> it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static <E> NavigableSet<E> i(NavigableSet<E> navigableSet) {
        return ((navigableSet instanceof ImmutableCollection) || (navigableSet instanceof d)) ? navigableSet : new d(navigableSet);
    }
}
