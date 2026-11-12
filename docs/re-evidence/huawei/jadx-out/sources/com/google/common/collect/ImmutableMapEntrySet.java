package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class ImmutableMapEntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {
    protected abstract ImmutableMap<K, V> map();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return map().size();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        V v = map().get(entry.getKey());
        return v != null && v.equals(entry.getValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return map().isPartialView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableSet
    protected boolean isHashCodeFast() {
        return map().isHashCodeFast();
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return map().hashCode();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new a(map());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    static class a<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        final ImmutableMap<K, V> e;

        a(ImmutableMap<K, V> immutableMap) {
            this.e = immutableMap;
        }

        Object readResolve() {
            return this.e.entrySet();
        }
    }
}
