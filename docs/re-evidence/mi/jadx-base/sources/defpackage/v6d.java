package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class v6d<K, V> extends ImmutableSet<Map.Entry<K, V>> {

    public static class a<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableMap<K, V> f36540a;

        public a(ImmutableMap<K, V> immutableMap) {
            this.f36540a = immutableMap;
        }

        public Object readResolve() {
            return this.f36540a.entrySet();
        }
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        V v = e().get(entry.getKey());
        return v != null && v.equals(entry.getValue());
    }

    public abstract ImmutableMap<K, V> e();

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return e().hashCode();
    }

    @Override // com.google.common.collect.ImmutableSet
    public boolean isHashCodeFast() {
        return e().isHashCodeFast();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return e().isPartialView();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return e().size();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new a(e());
    }
}
