package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
class k4<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int a;
    private boolean d;
    private volatile j4 e;
    private List<h4> b = Collections.emptyList();
    private Map<K, V> c = Collections.emptyMap();
    private Map<K, V> f = Collections.emptyMap();

    private final int l(K k) {
        int size = this.b.size() - 1;
        int i = 0;
        if (size >= 0) {
            int iCompareTo = k.compareTo(this.b.get(size).a());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int iCompareTo2 = k.compareTo(this.b.get(i2).a());
            if (iCompareTo2 < 0) {
                size = i2 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i2;
                }
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V m(int i) {
        o();
        V v = (V) this.b.remove(i).getValue();
        if (!this.c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it2 = n().entrySet().iterator();
            List<h4> list = this.b;
            Map.Entry<K, V> next = it2.next();
            list.add(new h4(this, next.getKey(), next.getValue()));
            it2.remove();
        }
        return v;
    }

    private final SortedMap<K, V> n() {
        o();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        if (this.d) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.d) {
            return;
        }
        this.c = this.c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.c);
        this.f = this.f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f);
        this.d = true;
    }

    public final int c() {
        return this.b.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        o();
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        if (this.c.isEmpty()) {
            return;
        }
        this.c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return l(comparable) >= 0 || this.c.containsKey(comparable);
    }

    public final Iterable<Map.Entry<K, V>> d() {
        return this.c.isEmpty() ? g4.a() : this.c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new j4(this, null);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4)) {
            return super.equals(obj);
        }
        k4 k4Var = (k4) obj;
        int size = size();
        if (size != k4Var.size()) {
            return false;
        }
        int iC = c();
        if (iC != k4Var.c()) {
            return entrySet().equals(k4Var.entrySet());
        }
        for (int i = 0; i < iC; i++) {
            if (!h(i).equals(k4Var.h(i))) {
                return false;
            }
        }
        if (iC != size) {
            return this.c.equals(k4Var.c);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        o();
        int iL = l(k);
        if (iL >= 0) {
            return (V) this.b.get(iL).setValue(v);
        }
        o();
        if (this.b.isEmpty() && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(this.a);
        }
        int i = -(iL + 1);
        if (i >= this.a) {
            return n().put(k, v);
        }
        int size = this.b.size();
        int i2 = this.a;
        if (size == i2) {
            h4 h4VarRemove = this.b.remove(i2 - 1);
            n().put(h4VarRemove.a(), h4VarRemove.getValue());
        }
        this.b.add(i, new h4(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        return iL >= 0 ? (V) this.b.get(iL).getValue() : this.c.get(comparable);
    }

    public final Map.Entry<K, V> h(int i) {
        return this.b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iC = c();
        int iHashCode = 0;
        for (int i = 0; i < iC; i++) {
            iHashCode += this.b.get(i).hashCode();
        }
        return this.c.size() > 0 ? iHashCode + this.c.hashCode() : iHashCode;
    }

    public final boolean k() {
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        o();
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        if (iL >= 0) {
            return m(iL);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.b.size() + this.c.size();
    }
}
