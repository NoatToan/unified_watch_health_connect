package com.google.common.collect;

import com.google.common.base.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingMap<K, V> extends ForwardingObject implements Map<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    public abstract Map<K, V> delegate();

    public int size() {
        return delegate().size();
    }

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    @CheckForNull
    public V remove(@CheckForNull Object obj) {
        return delegate().remove(obj);
    }

    public void clear() {
        delegate().clear();
    }

    public boolean containsKey(@CheckForNull Object obj) {
        return delegate().containsKey(obj);
    }

    public boolean containsValue(@CheckForNull Object obj) {
        return delegate().containsValue(obj);
    }

    @CheckForNull
    public V get(@CheckForNull Object obj) {
        return delegate().get(obj);
    }

    @CheckForNull
    public V put(@ParametricNullness K k, @ParametricNullness V v) {
        return delegate().put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    public Set<K> keySet() {
        return delegate().keySet();
    }

    public Collection<V> values() {
        return delegate().values();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return delegate().entrySet();
    }

    public boolean equals(@CheckForNull Object obj) {
        return obj == this || delegate().equals(obj);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    protected void standardPutAll(Map<? extends K, ? extends V> map) {
        Maps.c((Map) this, (Map) map);
    }

    @CheckForNull
    protected V standardRemove(@CheckForNull Object obj) {
        Iterator<Map.Entry<K, V>> it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (Objects.equal(next.getKey(), obj)) {
                V value = next.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    protected void standardClear() {
        Iterators.d(entrySet().iterator());
    }

    protected boolean standardContainsKey(@CheckForNull Object obj) {
        return Maps.b(this, obj);
    }

    public boolean standardContainsValue(@CheckForNull Object obj) {
        return Maps.d(this, obj);
    }

    /* JADX INFO: loaded from: classes21.dex */
    protected abstract class StandardEntrySet extends Maps.EntrySet<K, V> {
        protected StandardEntrySet() {
        }

        @Override // com.google.common.collect.Maps.EntrySet
        Map<K, V> map() {
            return ForwardingMap.this;
        }
    }

    protected boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    public boolean standardEquals(@CheckForNull Object obj) {
        return Maps.e(this, obj);
    }

    public int standardHashCode() {
        return Sets.d(entrySet());
    }

    protected String standardToString() {
        return Maps.a(this);
    }
}
