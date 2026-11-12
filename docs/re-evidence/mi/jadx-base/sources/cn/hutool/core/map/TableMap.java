package cn.hutool.core.map;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.map.TableMap;
import defpackage.b8f;
import defpackage.g4h;
import defpackage.hhe;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class TableMap<K, V> implements Map<K, V>, Iterable<Map.Entry<K, V>>, Serializable {
    private static final long serialVersionUID = 1;
    private final List<K> keys;
    private final List<V> values;

    public class a implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<K> f5553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<V> f5554b;

        public a() {
            this.f5553a = TableMap.this.keys.iterator();
            this.f5554b = TableMap.this.values.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return new b(this.f5553a.next(), this.f5554b.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f5553a.hasNext() && this.f5554b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f5553a.remove();
            this.f5554b.remove();
        }
    }

    public static class b<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f5555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final V f5556b;

        public b(K k2, V v) {
            this.f5555a = k2;
            this.f5556b = v;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return Objects.equals(this.f5555a, entry.getKey()) && Objects.equals(this.f5556b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f5555a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f5556b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return Objects.hashCode(this.f5555a) ^ Objects.hashCode(this.f5556b);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("setValue not supported.");
        }
    }

    public TableMap(int i) {
        this.keys = new ArrayList(i);
        this.values = new ArrayList(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getKeys$1(Object obj, Object obj2) {
        return g4h.g(obj2, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getValues$0(Object obj, Object obj2) {
        return g4h.g(obj2, obj);
    }

    @Override // java.util.Map
    public void clear() {
        this.keys.clear();
        this.values.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.keys.contains(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.values.contains(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i = 0; i < size(); i++) {
            linkedHashSet.add(new b(this.keys.get(i), this.values.get(i)));
        }
        return linkedHashSet;
    }

    @Override // java.util.Map
    public V get(Object obj) {
        int iIndexOf = this.keys.indexOf(obj);
        if (iIndexOf <= -1 || iIndexOf >= this.values.size()) {
            return null;
        }
        return this.values.get(iIndexOf);
    }

    public K getKey(V v) {
        int iIndexOf = this.values.indexOf(v);
        if (iIndexOf <= -1 || iIndexOf >= this.keys.size()) {
            return null;
        }
        return this.keys.get(iIndexOf);
    }

    public List<K> getKeys(final V v) {
        return CollUtil.f(this.keys, hhe.b(this.values, new b8f() { // from class: gzo
            @Override // defpackage.b8f
            public final boolean a(Object obj) {
                return TableMap.lambda$getKeys$1(v, obj);
            }
        }));
    }

    public List<V> getValues(final K k2) {
        return CollUtil.f(this.values, hhe.b(this.keys, new b8f() { // from class: hzo
            @Override // defpackage.b8f
            public final boolean a(Object obj) {
                return TableMap.lambda$getValues$0(k2, obj);
            }
        }));
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return CollUtil.h(this.keys);
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new a();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return new HashSet(this.keys);
    }

    @Override // java.util.Map
    public V put(K k2, V v) {
        this.keys.add(k2);
        this.values.add(v);
        return null;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        int iIndexOf = this.keys.indexOf(obj);
        if (iIndexOf <= -1) {
            return null;
        }
        this.keys.remove(iIndexOf);
        if (iIndexOf >= this.values.size()) {
            return null;
        }
        this.values.remove(iIndexOf);
        return null;
    }

    @Override // java.util.Map
    public int size() {
        return this.keys.size();
    }

    public String toString() {
        return "TableMap{keys=" + this.keys + ", values=" + this.values + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return Collections.unmodifiableList(this.values);
    }

    public TableMap(K[] kArr, V[] vArr) {
        this.keys = CollUtil.v(kArr);
        this.values = CollUtil.v(vArr);
    }
}
