package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractSequentialIterator;
import com.google.common.collect.BoundType;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ImmutableAsList;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class amx<C extends Comparable> extends ContiguousSet<C> {
    private static final long serialVersionUID = 0;
    private final amv<C> d;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    public amx(amv<C> amvVar, DiscreteDomain<C> discreteDomain) {
        super(discreteDomain);
        this.d = amvVar;
    }

    private ContiguousSet<C> d(amv<C> amvVar) {
        if (this.d.e(amvVar)) {
            return ContiguousSet.create(this.d.c(amvVar), this.domain);
        }
        return new alq(this.domain);
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public ContiguousSet<C> headSetImpl(C c2, boolean z) {
        return d(amv.d((Comparable) c2, BoundType.forBoolean(z)));
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public ContiguousSet<C> subSetImpl(C c2, boolean z, C c3, boolean z2) {
        if (c2.compareTo(c3) == 0 && !z && !z2) {
            return new alq(this.domain);
        }
        return d(amv.b(c2, BoundType.forBoolean(z), c3, BoundType.forBoolean(z2)));
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public ContiguousSet<C> tailSetImpl(C c2, boolean z) {
        return d(amv.a(c2, BoundType.forBoolean(z)));
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public int indexOf(@CheckForNull Object obj) {
        if (contains(obj)) {
            return (int) this.domain.distance(first(), (Comparable) Objects.requireNonNull(obj));
        }
        return -1;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<C> iterator() {
        return new AbstractSequentialIterator<C>(first()) { // from class: amx.1
            final C d;

            {
                this.d = (C) amx.this.last();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractSequentialIterator
            @CheckForNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C computeNext(C c2) {
                if (amx.b(c2, this.d)) {
                    return null;
                }
                return (C) amx.this.domain.next(c2);
            }
        };
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public UnmodifiableIterator<C> descendingIterator() {
        return new AbstractSequentialIterator<C>(last()) { // from class: amx.5

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final C f573a;

            {
                this.f573a = (C) amx.this.first();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractSequentialIterator
            @CheckForNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C computeNext(C c2) {
                if (amx.b(c2, this.f573a)) {
                    return null;
                }
                return (C) amx.this.domain.previous(c2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Comparable<?> comparable, @CheckForNull Comparable<?> comparable2) {
        return comparable2 != null && amv.b(comparable, comparable2) == 0;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public C first() {
        return (C) Objects.requireNonNull(this.d.f568c.leastValueAbove(this.domain));
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C last() {
        return (C) Objects.requireNonNull(this.d.f567b.greatestValueBelow(this.domain));
    }

    @Override // com.google.common.collect.ImmutableSet
    public ImmutableList<C> createAsList() {
        if (this.domain.supportsFastOffset) {
            return new ImmutableAsList<C>() { // from class: amx.3
                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // com.google.common.collect.ImmutableAsList
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public ImmutableSortedSet<C> delegateCollection() {
                    return amx.this;
                }

                @Override // java.util.List
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public C get(int i) {
                    Preconditions.checkElementIndex(i, size());
                    return (C) amx.this.domain.offset(amx.this.first(), i);
                }

                @Override // com.google.common.collect.ImmutableAsList, com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                public Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }
        return super.createAsList();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        long jDistance = this.domain.distance(first(), last());
        if (jDistance >= 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return ((int) jDistance) + 1;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.d.i((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        return alf.a((Collection<?>) this, collection);
    }

    @Override // com.google.common.collect.ContiguousSet
    public ContiguousSet<C> intersection(ContiguousSet<C> contiguousSet) {
        Preconditions.checkNotNull(contiguousSet);
        Preconditions.checkArgument(this.domain.equals(contiguousSet.domain));
        if (contiguousSet.isEmpty()) {
            return contiguousSet;
        }
        Comparable comparable = (Comparable) Ordering.natural().max(first(), contiguousSet.first());
        Comparable comparable2 = (Comparable) Ordering.natural().min(last(), contiguousSet.last());
        if (comparable.compareTo(comparable2) <= 0) {
            return ContiguousSet.create(amv.d(comparable, comparable2), this.domain);
        }
        return new alq(this.domain);
    }

    @Override // com.google.common.collect.ContiguousSet
    public amv<C> range() {
        return range(BoundType.CLOSED, BoundType.CLOSED);
    }

    @Override // com.google.common.collect.ContiguousSet
    public amv<C> range(BoundType boundType, BoundType boundType2) {
        return amv.c(this.d.f568c.withLowerBoundType(boundType, this.domain), this.d.f567b.withUpperBoundType(boundType2, this.domain));
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amx) {
            amx amxVar = (amx) obj;
            if (this.domain.equals(amxVar.domain)) {
                return first().equals(amxVar.first()) && last().equals(amxVar.last());
            }
        }
        return super.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return Sets.d(this);
    }

    static final class a<C extends Comparable> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final amv<C> f574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final DiscreteDomain<C> f575c;

        private a(amv<C> amvVar, DiscreteDomain<C> discreteDomain) {
            this.f574b = amvVar;
            this.f575c = discreteDomain;
        }

        private Object readResolve() {
            return new amx(this.f574b, this.f575c);
        }
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new a(this.d, this.domain);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
