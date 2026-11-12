package defpackage;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class x6d<K, V> extends ImmutableCollection<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableMap<K, V> f38748a;

    public class a extends uaq<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final uaq<Map.Entry<K, V>> f38749a;

        public a() {
            this.f38749a = x6d.this.f38748a.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f38749a.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return this.f38749a.next().getValue();
        }
    }

    public class b extends ImmutableList<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ImmutableList f38751a;

        public b(x6d x6dVar, ImmutableList immutableList) {
            this.f38751a = immutableList;
        }

        @Override // java.util.List
        public V get(int i) {
            return (V) ((Map.Entry) this.f38751a.get(i)).getValue();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f38751a.size();
        }
    }

    public static class c<V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableMap<?, V> f38752a;

        public c(ImmutableMap<?, V> immutableMap) {
            this.f38752a = immutableMap;
        }

        public Object readResolve() {
            return this.f38752a.values();
        }
    }

    public x6d(ImmutableMap<K, V> immutableMap) {
        this.f38748a = immutableMap;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<V> asList() {
        return new b(this, this.f38748a.entrySet().asList());
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return obj != null && epd.f(iterator(), obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f38748a.size();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new c(this.f38748a);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public uaq<V> iterator() {
        return new a();
    }
}
