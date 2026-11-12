package androidx.health.platform.client.proto;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class y1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<y1<K, V>.e> f2556b;
    public Map<K, V> c;
    public boolean d;
    public volatile y1<K, V>.g e;
    public Map<K, V> f;
    public volatile y1<K, V>.c g;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    public class a<FieldDescriptorType> extends y1<FieldDescriptorType, Object> {
        public a(int i) {
            super(i, null);
        }

        @Override // androidx.health.platform.client.proto.y1
        public void v() {
            if (!t()) {
                for (int i = 0; i < o(); i++) {
                    Map.Entry<FieldDescriptorType, Object> entryN = n(i);
                    if (((c0.b) entryN.getKey()).isRepeated()) {
                        entryN.setValue(Collections.unmodifiableList((List) entryN.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : q()) {
                    if (((c0.b) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.v();
        }
    }

    public class c extends y1<K, V>.g {
        public c() {
            super(y1.this, null);
        }

        @Override // androidx.health.platform.client.proto.y1.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(y1.this, null);
        }

        public /* synthetic */ c(y1 y1Var, a aVar) {
            this();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Iterator<Object> f2560a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Iterable<Object> f2561b = new b();

        public class a implements Iterator<Object> {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.f2560a;
            }
        }

        public static <T> Iterable<T> b() {
            return (Iterable<T>) f2561b;
        }
    }

    public class e implements Map.Entry<K, V>, Comparable<y1<K, V>.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f2562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public V f2563b;

        public e(y1 y1Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(y1<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        public final boolean b(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f2562a;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b(this.f2562a, entry.getKey()) && b(this.f2563b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f2563b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k2 = this.f2562a;
            int iHashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f2563b;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            y1.this.j();
            V v2 = this.f2563b;
            this.f2563b = v;
            return v2;
        }

        public String toString() {
            return this.f2562a + "=" + this.f2563b;
        }

        public e(K k2, V v) {
            this.f2562a = k2;
            this.f2563b = v;
        }
    }

    public class g extends AbstractSet<Map.Entry<K, V>> {
        public g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            y1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = y1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            y1.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(y1.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            y1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return y1.this.size();
        }

        public /* synthetic */ g(y1 y1Var, a aVar) {
            this();
        }
    }

    public /* synthetic */ y1(int i, a aVar) {
        this(i);
    }

    public static <FieldDescriptorType extends c0.b<FieldDescriptorType>> y1<FieldDescriptorType, Object> w(int i) {
        return new a(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        j();
        if (!this.f2556b.isEmpty()) {
            this.f2556b.clear();
        }
        if (this.c.isEmpty()) {
            return;
        }
        this.c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return g(comparable) >= 0 || this.c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new g(this, null);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return super.equals(obj);
        }
        y1 y1Var = (y1) obj;
        int size = size();
        if (size != y1Var.size()) {
            return false;
        }
        int iO = o();
        if (iO != y1Var.o()) {
            return entrySet().equals(y1Var.entrySet());
        }
        for (int i = 0; i < iO; i++) {
            if (!n(i).equals(y1Var.n(i))) {
                return false;
            }
        }
        if (iO != size) {
            return this.c.equals(y1Var.c);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    public final int g(K k2) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.f2556b.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = k2.compareTo(this.f2556b.get(i3).getKey());
                if (iCompareTo < 0) {
                    i4 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = k2.compareTo(this.f2556b.get(i4).getKey());
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = k2.compareTo(this.f2556b.get(i3).getKey());
                    if (iCompareTo < 0) {
                        i4 = i3 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i3;
                        }
                        i = i3 + 1;
                    }
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        return iG >= 0 ? this.f2556b.get(iG).getValue() : this.c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iO = o();
        int iHashCode = 0;
        for (int i = 0; i < iO; i++) {
            iHashCode += this.f2556b.get(i).hashCode();
        }
        return p() > 0 ? iHashCode + this.c.hashCode() : iHashCode;
    }

    public final void j() {
        if (this.d) {
            throw new UnsupportedOperationException();
        }
    }

    public Set<Map.Entry<K, V>> l() {
        if (this.g == null) {
            this.g = new c(this, null);
        }
        return this.g;
    }

    public final void m() {
        j();
        if (!this.f2556b.isEmpty() || (this.f2556b instanceof ArrayList)) {
            return;
        }
        this.f2556b = new ArrayList(this.f2555a);
    }

    public Map.Entry<K, V> n(int i) {
        return this.f2556b.get(i);
    }

    public int o() {
        return this.f2556b.size();
    }

    public int p() {
        return this.c.size();
    }

    public Iterable<Map.Entry<K, V>> q() {
        return this.c.isEmpty() ? d.b() : this.c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        j();
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        if (iG >= 0) {
            return y(iG);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    public final SortedMap<K, V> s() {
        j();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f2556b.size() + this.c.size();
    }

    public boolean t() {
        return this.d;
    }

    public void v() {
        if (this.d) {
            return;
        }
        this.c = this.c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.c);
        this.f = this.f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f);
        this.d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public V put(K k2, V v) {
        j();
        int iG = g(k2);
        if (iG >= 0) {
            return this.f2556b.get(iG).setValue(v);
        }
        m();
        int i = -(iG + 1);
        if (i >= this.f2555a) {
            return s().put(k2, v);
        }
        int size = this.f2556b.size();
        int i2 = this.f2555a;
        if (size == i2) {
            y1<K, V>.e eVarRemove = this.f2556b.remove(i2 - 1);
            s().put(eVarRemove.getKey(), eVarRemove.getValue());
        }
        this.f2556b.add(i, new e(k2, v));
        return null;
    }

    public final V y(int i) {
        j();
        V value = this.f2556b.remove(i).getValue();
        if (!this.c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = s().entrySet().iterator();
            this.f2556b.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    public class b implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f2558b;

        public b() {
            this.f2557a = y1.this.f2556b.size();
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f2558b == null) {
                this.f2558b = y1.this.f.entrySet().iterator();
            }
            return this.f2558b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (a().hasNext()) {
                return a().next();
            }
            List list = y1.this.f2556b;
            int i = this.f2557a - 1;
            this.f2557a = i;
            return (Map.Entry) list.get(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.f2557a;
            return (i > 0 && i <= y1.this.f2556b.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ b(y1 y1Var, a aVar) {
            this();
        }
    }

    public class f implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2565b;
        public Iterator<Map.Entry<K, V>> c;

        public f() {
            this.f2564a = -1;
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.c == null) {
                this.c = y1.this.c.entrySet().iterator();
            }
            return this.c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f2565b = true;
            int i = this.f2564a + 1;
            this.f2564a = i;
            return i < y1.this.f2556b.size() ? (Map.Entry) y1.this.f2556b.get(this.f2564a) : a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f2564a + 1 >= y1.this.f2556b.size()) {
                return !y1.this.c.isEmpty() && a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f2565b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f2565b = false;
            y1.this.j();
            if (this.f2564a >= y1.this.f2556b.size()) {
                a().remove();
                return;
            }
            y1 y1Var = y1.this;
            int i = this.f2564a;
            this.f2564a = i - 1;
            y1Var.y(i);
        }

        public /* synthetic */ f(y1 y1Var, a aVar) {
            this();
        }
    }

    public y1(int i) {
        this.f2555a = i;
        this.f2556b = Collections.emptyList();
        this.c = Collections.emptyMap();
        this.f = Collections.emptyMap();
    }
}
