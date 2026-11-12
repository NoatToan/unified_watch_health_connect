package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.collect.BoundType;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import java.util.Comparator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class ang<E> extends ImmutableSortedMultiset<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient int f599a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient long[] f600c;
    final transient ani<E> d;
    private final transient int g;
    private static final long[] e = {0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ImmutableSortedMultiset<Comparable> f598b = new ang(Ordering.natural());

    public ang(Comparator<? super E> comparator) {
        this.d = ImmutableSortedSet.emptySet(comparator);
        this.f600c = e;
        this.g = 0;
        this.f599a = 0;
    }

    public ang(ani<E> aniVar, long[] jArr, int i, int i2) {
        this.d = aniVar;
        this.f600c = jArr;
        this.g = i;
        this.f599a = i2;
    }

    private int b(int i) {
        long[] jArr = this.f600c;
        int i2 = this.g + i;
        return (int) (jArr[i2 + 1] - jArr[i2]);
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public Multiset.Entry<E> getEntry(int i) {
        return Multisets.c(this.d.asList().get(i), b(i));
    }

    @Override // com.google.common.collect.SortedMultiset
    @CheckForNull
    public Multiset.Entry<E> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return getEntry(0);
    }

    @Override // com.google.common.collect.SortedMultiset
    @CheckForNull
    public Multiset.Entry<E> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return getEntry(this.f599a - 1);
    }

    @Override // com.google.common.collect.Multiset
    public int count(@CheckForNull Object obj) {
        int iIndexOf = this.d.indexOf(obj);
        if (iIndexOf >= 0) {
            return b(iIndexOf);
        }
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        long[] jArr = this.f600c;
        int i = this.g;
        return Ints.a(jArr[this.f599a + i] - jArr[i]);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset, com.google.common.collect.SortedMultiset, com.google.common.collect.SortedMultisetBridge
    public ImmutableSortedSet<E> elementSet() {
        return this.d;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public ImmutableSortedMultiset<E> headMultiset(E e2, BoundType boundType) {
        return a(0, this.d.e(e2, Preconditions.checkNotNull(boundType) == BoundType.CLOSED));
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public ImmutableSortedMultiset<E> tailMultiset(E e2, BoundType boundType) {
        return a(this.d.d(e2, Preconditions.checkNotNull(boundType) == BoundType.CLOSED), this.f599a);
    }

    ImmutableSortedMultiset<E> a(int i, int i2) {
        Preconditions.checkPositionIndexes(i, i2, this.f599a);
        if (i == i2) {
            return emptyMultiset(comparator());
        }
        return (i == 0 && i2 == this.f599a) ? this : new ang(this.d.a(i, i2), this.f600c, this.g + i, i2 - i);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return this.g > 0 || this.f599a < this.f600c.length - 1;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
