package defpackage;

import com.google.common.collect.ImmutableMap;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class w6d<K, V> extends r7d<K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableMap<K, V> f37655a;

    public static class a<K> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableMap<K, ?> f37656a;

        public a(ImmutableMap<K, ?> immutableMap) {
            this.f37656a = immutableMap;
        }

        public Object readResolve() {
            return this.f37656a.keySet();
        }
    }

    public w6d(ImmutableMap<K, V> immutableMap) {
        this.f37655a = immutableMap;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f37655a.containsKey(obj);
    }

    @Override // defpackage.r7d
    public K get(int i) {
        return this.f37655a.entrySet().asList().get(i).getKey();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f37655a.size();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new a(this.f37655a);
    }

    @Override // defpackage.r7d, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public uaq<K> iterator() {
        return this.f37655a.keyIterator();
    }
}
