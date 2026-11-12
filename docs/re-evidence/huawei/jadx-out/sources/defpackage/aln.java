package defpackage;

import com.google.common.collect.BoundType;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Multiset;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class aln<E> extends ImmutableSortedMultiset<E> {
    private final transient ImmutableSortedMultiset<E> e;

    public aln(ImmutableSortedMultiset<E> immutableSortedMultiset) {
        this.e = immutableSortedMultiset;
    }

    @Override // com.google.common.collect.Multiset
    public int count(@CheckForNull Object obj) {
        return this.e.count(obj);
    }

    @Override // com.google.common.collect.SortedMultiset
    @CheckForNull
    public Multiset.Entry<E> firstEntry() {
        return this.e.lastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    @CheckForNull
    public Multiset.Entry<E> lastEntry() {
        return this.e.firstEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return this.e.size();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset, com.google.common.collect.SortedMultiset, com.google.common.collect.SortedMultisetBridge
    public ImmutableSortedSet<E> elementSet() {
        return this.e.elementSet().descendingSet();
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public Multiset.Entry<E> getEntry(int i) {
        return this.e.entrySet().asList().reverse().get(i);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public ImmutableSortedMultiset<E> descendingMultiset() {
        return this.e;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public ImmutableSortedMultiset<E> headMultiset(E e, BoundType boundType) {
        return this.e.tailMultiset((Object) e, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public ImmutableSortedMultiset<E> tailMultiset(E e, BoundType boundType) {
        return this.e.headMultiset((Object) e, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return this.e.isPartialView();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
