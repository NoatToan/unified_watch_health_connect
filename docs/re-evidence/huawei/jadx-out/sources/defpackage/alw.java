package defpackage;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.IndexedImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class alw<K, V> extends IndexedImmutableSet<K> {
    private final ImmutableMap<K, V> e;

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return true;
    }

    public alw(ImmutableMap<K, V> immutableMap) {
        this.e = immutableMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.e.size();
    }

    @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<K> iterator() {
        return this.e.keyIterator();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return this.e.containsKey(obj);
    }

    @Override // com.google.common.collect.IndexedImmutableSet
    public K get(int i) {
        return this.e.entrySet().asList().get(i).getKey();
    }

    @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new a(this.e);
    }

    static class a<K> implements Serializable {
        private static final long serialVersionUID = 0;
        final ImmutableMap<K, ?> d;

        a(ImmutableMap<K, ?> immutableMap) {
            this.d = immutableMap;
        }

        Object readResolve() {
            return this.d.keySet();
        }
    }
}
