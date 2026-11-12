package defpackage;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import java.io.Serializable;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class alz<K, V> extends ImmutableCollection<V> {
    private final ImmutableMap<K, V> d;

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return true;
    }

    public alz(ImmutableMap<K, V> immutableMap) {
        this.d = immutableMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.d.size();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<V> iterator() {
        return new UnmodifiableIterator<V>() { // from class: alz.4
            final UnmodifiableIterator<Map.Entry<K, V>> e;

            {
                this.e = alz.this.d.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.e.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                return this.e.next().getValue();
            }
        };
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return obj != null && Iterators.b(iterator(), obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<V> asList() {
        final ImmutableList<Map.Entry<K, V>> immutableListAsList = this.d.entrySet().asList();
        return new ImmutableList<V>(this) { // from class: alz.2
            @Override // com.google.common.collect.ImmutableCollection
            public boolean isPartialView() {
                return true;
            }

            @Override // java.util.List
            public V get(int i) {
                return (V) ((Map.Entry) immutableListAsList.get(i)).getValue();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return immutableListAsList.size();
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            public Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new b(this.d);
    }

    static class b<V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ImmutableMap<?, V> f523c;

        b(ImmutableMap<?, V> immutableMap) {
            this.f523c = immutableMap;
        }

        Object readResolve() {
            return this.f523c.values();
        }
    }
}
