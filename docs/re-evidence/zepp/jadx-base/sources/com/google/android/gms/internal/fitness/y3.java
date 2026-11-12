package com.google.android.gms.internal.fitness;

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
class y3<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int a;
    private List<h4> b;
    private Map<K, V> c;
    private boolean d;
    private volatile j4 e;
    private Map<K, V> f;
    private volatile d4 g;

    private y3(int i) {
        this.a = i;
        this.b = Collections.emptyList();
        this.c = Collections.emptyMap();
        this.f = Collections.emptyMap();
    }

    private final int c(K k) {
        int size = this.b.size() - 1;
        if (size >= 0) {
            int iCompareTo = k.compareTo((Comparable) this.b.get(size).getKey());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int iCompareTo2 = k.compareTo((Comparable) this.b.get(i2).getKey());
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

    public static <FieldDescriptorType extends zzgv<FieldDescriptorType>> y3<FieldDescriptorType, Object> g(int i) {
        return new b4(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V i(int i) {
        q();
        V v = (V) this.b.remove(i).getValue();
        if (!this.c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it2 = r().entrySet().iterator();
            this.b.add(new h4(this, it2.next()));
            it2.remove();
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        if (this.d) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> r() {
        q();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    public final boolean a() {
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        q();
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        if (this.c.isEmpty()) {
            return;
        }
        this.c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return c(comparable) >= 0 || this.c.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        q();
        int iC = c(k);
        if (iC >= 0) {
            return (V) this.b.get(iC).setValue(v);
        }
        q();
        if (this.b.isEmpty() && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(this.a);
        }
        int i = -(iC + 1);
        if (i >= this.a) {
            return r().put(k, v);
        }
        int size = this.b.size();
        int i2 = this.a;
        if (size == i2) {
            h4 h4VarRemove = this.b.remove(i2 - 1);
            r().put((Comparable) h4VarRemove.getKey(), h4VarRemove.getValue());
        }
        this.b.add(i, new h4(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new j4(this, null);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3)) {
            return super.equals(obj);
        }
        y3 y3Var = (y3) obj;
        int size = size();
        if (size != y3Var.size()) {
            return false;
        }
        int iN = n();
        if (iN != y3Var.n()) {
            return entrySet().equals(y3Var.entrySet());
        }
        for (int i = 0; i < iN; i++) {
            if (!h(i).equals(y3Var.h(i))) {
                return false;
            }
        }
        if (iN != size) {
            return this.c.equals(y3Var.c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iC = c(comparable);
        return iC >= 0 ? (V) this.b.get(iC).getValue() : this.c.get(comparable);
    }

    public final Map.Entry<K, V> h(int i) {
        return this.b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iN = n();
        int iHashCode = 0;
        for (int i = 0; i < iN; i++) {
            iHashCode += this.b.get(i).hashCode();
        }
        return this.c.size() > 0 ? iHashCode + this.c.hashCode() : iHashCode;
    }

    public void j() {
        if (this.d) {
            return;
        }
        this.c = this.c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.c);
        this.f = this.f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f);
        this.d = true;
    }

    public final int n() {
        return this.b.size();
    }

    public final Iterable<Map.Entry<K, V>> o() {
        return this.c.isEmpty() ? c4.a() : this.c.entrySet();
    }

    public final Set<Map.Entry<K, V>> p() {
        if (this.g == null) {
            this.g = new d4(this, null);
        }
        return this.g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        q();
        Comparable comparable = (Comparable) obj;
        int iC = c(comparable);
        if (iC >= 0) {
            return i(iC);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.b.size() + this.c.size();
    }

    public /* synthetic */ y3(int i, b4 b4Var) {
        this(i);
    }
}
