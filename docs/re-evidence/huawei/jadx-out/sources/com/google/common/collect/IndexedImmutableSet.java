package com.google.common.collect;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class IndexedImmutableSet<E> extends ImmutableSet<E> {
    protected abstract E get(int i);

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
        return asList().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableCollection
    protected int copyIntoArray(Object[] objArr, int i) {
        return asList().copyIntoArray(objArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableSet
    public ImmutableList<E> createAsList() {
        return new ImmutableList<E>() { // from class: com.google.common.collect.IndexedImmutableSet.3
            @Override // java.util.List
            public E get(int i) {
                return (E) IndexedImmutableSet.this.get(i);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.ImmutableCollection
            public boolean isPartialView() {
                return IndexedImmutableSet.this.isPartialView();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return IndexedImmutableSet.this.size();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            public Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
