package defpackage;

import com.google.common.collect.BoundType;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.ParametricNullness;
import com.google.common.collect.SortedMultiset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class anl {

    static class e<E> extends Multisets.ElementSet<E> implements SortedSet<E> {
        private final SortedMultiset<E> e;

        e(SortedMultiset<E> sortedMultiset) {
            this.e = sortedMultiset;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Multisets.ElementSet
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SortedMultiset<E> multiset() {
            return this.e;
        }

        @Override // com.google.common.collect.Multisets.ElementSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return Multisets.d(multiset().entrySet().iterator());
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return multiset().comparator();
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(@ParametricNullness E e, @ParametricNullness E e2) {
            return multiset().subMultiset(e, BoundType.CLOSED, e2, BoundType.OPEN).elementSet();
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(@ParametricNullness E e) {
            return multiset().headMultiset(e, BoundType.OPEN).elementSet();
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(@ParametricNullness E e) {
            return multiset().tailMultiset(e, BoundType.CLOSED).elementSet();
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public E first() {
            return (E) anl.d(multiset().firstEntry());
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public E last() {
            return (E) anl.d(multiset().lastEntry());
        }
    }

    public static class a<E> extends e<E> implements NavigableSet<E> {
        public a(SortedMultiset<E> sortedMultiset) {
            super(sortedMultiset);
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E lower(@ParametricNullness E e) {
            return (E) anl.c(multiset().headMultiset(e, BoundType.OPEN).lastEntry());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E floor(@ParametricNullness E e) {
            return (E) anl.c(multiset().headMultiset(e, BoundType.CLOSED).lastEntry());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E ceiling(@ParametricNullness E e) {
            return (E) anl.c(multiset().tailMultiset(e, BoundType.CLOSED).firstEntry());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E higher(@ParametricNullness E e) {
            return (E) anl.c(multiset().tailMultiset(e, BoundType.OPEN).firstEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return new a(multiset().descendingMultiset());
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollFirst() {
            return (E) anl.c(multiset().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        @CheckForNull
        public E pollLast() {
            return (E) anl.c(multiset().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@ParametricNullness E e, boolean z, @ParametricNullness E e2, boolean z2) {
            return new a(multiset().subMultiset(e, BoundType.forBoolean(z), e2, BoundType.forBoolean(z2)));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@ParametricNullness E e, boolean z) {
            return new a(multiset().headMultiset(e, BoundType.forBoolean(z)));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@ParametricNullness E e, boolean z) {
            return new a(multiset().tailMultiset(e, BoundType.forBoolean(z)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> E d(@CheckForNull Multiset.Entry<E> entry) {
        if (entry == null) {
            throw new NoSuchElementException();
        }
        return entry.getElement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CheckForNull
    public static <E> E c(@CheckForNull Multiset.Entry<E> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getElement();
    }
}
