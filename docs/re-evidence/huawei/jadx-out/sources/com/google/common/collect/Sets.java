package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.errorprone.annotations.concurrent.LazyInit;
import defpackage.alf;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Sets {

    static abstract class ImprovedAbstractSet<E> extends AbstractSet<E> {
        ImprovedAbstractSet() {
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return Sets.c(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) Preconditions.checkNotNull(collection));
        }
    }

    public static <E> HashSet<E> a() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> a(int i) {
        return new HashSet<>(Maps.b(i));
    }

    public static <E> Set<E> c() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static <E> LinkedHashSet<E> b() {
        return new LinkedHashSet<>();
    }

    public static <E> Set<E> d() {
        return Collections.newSetFromMap(Maps.b());
    }

    public static abstract class SetView<E> extends AbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract UnmodifiableIterator<E> iterator();

        private SetView() {
        }

        public ImmutableSet<E> immutableCopy() {
            return ImmutableSet.copyOf((Collection) this);
        }

        public <S extends Set<E>> S copyInto(S s) {
            s.addAll(this);
            return s;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(@ParametricNullness E e) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(@CheckForNull Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
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

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }
    }

    public static <E> SetView<E> a(final Set<? extends E> set, final Set<? extends E> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new SetView<E>() { // from class: com.google.common.collect.Sets.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                int size = set.size();
                Iterator<E> it = set2.iterator();
                while (it.hasNext()) {
                    if (!set.contains(it.next())) {
                        size++;
                    }
                }
                return size;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return set.isEmpty() && set2.isEmpty();
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<E> iterator() {
                return new AbstractIterator<E>() { // from class: com.google.common.collect.Sets.2.3

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final Iterator<? extends E> f4476a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final Iterator<? extends E> f4477b;

                    {
                        this.f4477b = set.iterator();
                        this.f4476a = set2.iterator();
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    @CheckForNull
                    protected E computeNext() {
                        if (this.f4477b.hasNext()) {
                            return this.f4477b.next();
                        }
                        while (this.f4476a.hasNext()) {
                            E next = this.f4476a.next();
                            if (!set.contains(next)) {
                                return next;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                return set.contains(obj) || set2.contains(obj);
            }

            @Override // com.google.common.collect.Sets.SetView
            public <S extends Set<E>> S copyInto(S s) {
                s.addAll(set);
                s.addAll(set2);
                return s;
            }

            @Override // com.google.common.collect.Sets.SetView
            public ImmutableSet<E> immutableCopy() {
                return new ImmutableSet.b().addAll(set).addAll(set2).build();
            }
        };
    }

    public static <E> SetView<E> c(final Set<E> set, final Set<?> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new SetView<E>() { // from class: com.google.common.collect.Sets.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<E> iterator() {
                return new AbstractIterator<E>() { // from class: com.google.common.collect.Sets.5.5

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final Iterator<E> f4482a;

                    {
                        this.f4482a = set.iterator();
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    @CheckForNull
                    protected E computeNext() {
                        while (this.f4482a.hasNext()) {
                            E next = this.f4482a.next();
                            if (set2.contains(next)) {
                                return next;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator<E> it = set.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (set2.contains(it.next())) {
                        i++;
                    }
                }
                return i;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return Collections.disjoint(set2, set);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                return set.contains(obj) && set2.contains(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean containsAll(Collection<?> collection) {
                return set.containsAll(collection) && set2.containsAll(collection);
            }
        };
    }

    public static <E> SetView<E> b(final Set<E> set, final Set<?> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new SetView<E>() { // from class: com.google.common.collect.Sets.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<E> iterator() {
                return new AbstractIterator<E>() { // from class: com.google.common.collect.Sets.4.3

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final Iterator<E> f4480a;

                    {
                        this.f4480a = set.iterator();
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    @CheckForNull
                    protected E computeNext() {
                        while (this.f4480a.hasNext()) {
                            E next = this.f4480a.next();
                            if (!set2.contains(next)) {
                                return next;
                            }
                        }
                        return endOfData();
                    }
                };
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator<E> it = set.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (!set2.contains(it.next())) {
                        i++;
                    }
                }
                return i;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return set2.containsAll(set);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                return set.contains(obj) && !set2.contains(obj);
            }
        };
    }

    public static <E> Set<E> b(Set<E> set, Predicate<? super E> predicate) {
        if (set instanceof SortedSet) {
            return d((SortedSet) set, predicate);
        }
        if (set instanceof c) {
            c cVar = (c) set;
            return new c((Set) cVar.f501c, Predicates.and(cVar.f500b, predicate));
        }
        return new c((Set) Preconditions.checkNotNull(set), (Predicate) Preconditions.checkNotNull(predicate));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> d(SortedSet<E> sortedSet, Predicate<? super E> predicate) {
        if (sortedSet instanceof c) {
            c cVar = (c) sortedSet;
            return new b((SortedSet) cVar.f501c, Predicates.and(cVar.f500b, predicate));
        }
        return new b((SortedSet) Preconditions.checkNotNull(sortedSet), (Predicate) Preconditions.checkNotNull(predicate));
    }

    static class c<E> extends alf.c<E> implements Set<E> {
        c(Set<E> set, Predicate<? super E> predicate) {
            super(set, predicate);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@CheckForNull Object obj) {
            return Sets.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.d(this);
        }
    }

    static class b<E> extends c<E> implements SortedSet<E> {
        b(SortedSet<E> sortedSet, Predicate<? super E> predicate) {
            super(sortedSet, predicate);
        }

        @Override // java.util.SortedSet
        @CheckForNull
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f501c).comparator();
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(@ParametricNullness E e, @ParametricNullness E e2) {
            return new b(((SortedSet) this.f501c).subSet(e, e2), this.f500b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(@ParametricNullness E e) {
            return new b(((SortedSet) this.f501c).headSet(e), this.f500b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(@ParametricNullness E e) {
            return new b(((SortedSet) this.f501c).tailSet(e), this.f500b);
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public E first() {
            return (E) Iterators.a((Iterator) this.f501c.iterator(), (Predicate) this.f500b);
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f501c;
            while (true) {
                E e = (Object) sortedSetHeadSet.last();
                if (this.f500b.apply(e)) {
                    return e;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e);
            }
        }
    }

    public static int d(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    static boolean a(Set<?> set, @CheckForNull Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <E> NavigableSet<E> a(NavigableSet<E> navigableSet) {
        return ((navigableSet instanceof ImmutableCollection) || (navigableSet instanceof d)) ? navigableSet : new d(navigableSet);
    }

    /* JADX INFO: loaded from: classes21.dex */
    static final class d<E> extends ForwardingSortedSet<E> implements NavigableSet<E>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final SortedSet<E> f4483c;
        private final NavigableSet<E> d;

        @CheckForNull
        @LazyInit
        private transient d<E> e;

        d(NavigableSet<E> navigableSet) {
            this.d = (NavigableSet) Preconditions.checkNotNull(navigableSet);
            this.f4483c = Collections.unmodifiableSortedSet(navigableSet);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public SortedSet<E> delegate() {
            return this.f4483c;
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E lower(@ParametricNullness E e) {
            return this.d.lower(e);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E floor(@ParametricNullness E e) {
            return this.d.floor(e);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E ceiling(@ParametricNullness E e) {
            return this.d.ceiling(e);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E higher(@ParametricNullness E e) {
            return this.d.higher(e);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollFirst() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollLast() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            d<E> dVar = this.e;
            if (dVar != null) {
                return dVar;
            }
            d<E> dVar2 = new d<>(this.d.descendingSet());
            this.e = dVar2;
            dVar2.e = this;
            return dVar2;
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return Iterators.i(this.d.descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@ParametricNullness E e, boolean z, @ParametricNullness E e2, boolean z2) {
            return Sets.a(this.d.subSet(e, z, e2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@ParametricNullness E e, boolean z) {
            return Sets.a(this.d.headSet(e, z));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@ParametricNullness E e, boolean z) {
            return Sets.a(this.d.tailSet(e, z));
        }
    }

    static boolean c(Set<?> set, Iterator<?> it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    static boolean c(Set<?> set, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).elementSet();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            return Iterators.d(set.iterator(), collection);
        }
        return c(set, collection.iterator());
    }
}
