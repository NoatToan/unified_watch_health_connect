package defpackage;

import com.google.common.collect.BoundType;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Ordering;
import com.google.common.collect.UnmodifiableIterator;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class alq<C extends Comparable> extends ContiguousSet<C> {
    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return 0;
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public ContiguousSet<C> headSetImpl(C c2, boolean z) {
        return this;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public int indexOf(@CheckForNull Object obj) {
        return -1;
    }

    @Override // com.google.common.collect.ContiguousSet
    public ContiguousSet<C> intersection(ContiguousSet<C> contiguousSet) {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableSet
    public boolean isHashCodeFast() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 0;
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public ContiguousSet<C> subSetImpl(C c2, boolean z, C c3, boolean z2) {
        return this;
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public ContiguousSet<C> tailSetImpl(C c2, boolean z) {
        return this;
    }

    public alq(DiscreteDomain<C> discreteDomain) {
        super(discreteDomain);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public C first() {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C last() {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.ContiguousSet
    public amv<C> range() {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.ContiguousSet
    public amv<C> range(BoundType boundType, BoundType boundType2) {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<C> iterator() {
        return Iterators.e();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public UnmodifiableIterator<C> descendingIterator() {
        return Iterators.e();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public ImmutableList<C> asList() {
        return ImmutableList.of();
    }

    @Override // com.google.common.collect.ContiguousSet, java.util.AbstractCollection
    public String toString() {
        return "[]";
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    static final class b<C extends Comparable> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DiscreteDomain<C> f514a;

        private b(DiscreteDomain<C> discreteDomain) {
            this.f514a = discreteDomain;
        }

        private Object readResolve() {
            return new alq(this.f514a);
        }
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new b(this.domain);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<C> createDescendingSet() {
        return ImmutableSortedSet.emptySet(Ordering.natural().reverse());
    }
}
