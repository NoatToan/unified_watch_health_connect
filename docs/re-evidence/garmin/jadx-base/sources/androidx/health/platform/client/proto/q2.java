package androidx.health.platform.client.proto;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class q2<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f7748g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<q2<K, V>.c> f7749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<K, V> f7750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile q2<K, V>.e f7752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<K, V> f7753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile q2<K, V>.b f7754f;

    private q2() {
        this.f7749a = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f7750b = map;
        this.f7753e = map;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(K k14) {
        int i14;
        int i15;
        int i16;
        int iCompareTo;
        int size = this.f7749a.size();
        int i17 = size - 1;
        if (i17 < 0) {
            i14 = 0;
            while (i14 <= i17) {
                i16 = (i14 + i17) / 2;
                iCompareTo = k14.compareTo(this.f7749a.get(i16).f7759a);
                if (iCompareTo < 0) {
                    i17 = i16 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i16;
                    }
                    i14 = i16 + 1;
                }
            }
            i15 = i14 + 1;
        } else {
            int iCompareTo2 = k14.compareTo(this.f7749a.get(i17).f7759a);
            if (iCompareTo2 > 0) {
                i15 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i17;
                }
                i14 = 0;
                while (i14 <= i17) {
                    i16 = (i14 + i17) / 2;
                    iCompareTo = k14.compareTo(this.f7749a.get(i16).f7759a);
                    if (iCompareTo < 0) {
                        i17 = i16 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i16;
                        }
                        i14 = i16 + 1;
                    }
                }
                i15 = i14 + 1;
            }
        }
        return -i15;
    }

    public final void b() {
        if (this.f7751c) {
            com.google.protobuf.a.m();
        }
    }

    public final Map.Entry<K, V> c(int i14) {
        return this.f7749a.get(i14);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f7749a.isEmpty()) {
            this.f7749a.clear();
        }
        if (this.f7750b.isEmpty()) {
            return;
        }
        this.f7750b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f7750b.containsKey(comparable);
    }

    public final Set d() {
        return this.f7750b.isEmpty() ? Collections.EMPTY_SET : this.f7750b.entrySet();
    }

    public final SortedMap<K, V> e() {
        b();
        if (this.f7750b.isEmpty() && !(this.f7750b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f7750b = treeMap;
            this.f7753e = treeMap.descendingMap();
        }
        return (SortedMap) this.f7750b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f7752d == null) {
            this.f7752d = new e(this, null);
        }
        return this.f7752d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return super.equals(obj);
        }
        q2 q2Var = (q2) obj;
        int size = size();
        if (size != q2Var.size()) {
            return false;
        }
        int size2 = this.f7749a.size();
        if (size2 != q2Var.f7749a.size()) {
            return entrySet().equals(q2Var.entrySet());
        }
        for (int i14 = 0; i14 < size2; i14++) {
            if (!c(i14).equals(q2Var.c(i14))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f7750b.equals(q2Var.f7750b);
        }
        return true;
    }

    public void g() {
        if (this.f7751c) {
            return;
        }
        this.f7750b = this.f7750b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f7750b);
        this.f7753e = this.f7753e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f7753e);
        this.f7751c = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? this.f7749a.get(iA).f7760b : this.f7750b.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final V put(K k14, V v14) {
        b();
        int iA = a(k14);
        if (iA >= 0) {
            return this.f7749a.get(iA).setValue(v14);
        }
        b();
        if (this.f7749a.isEmpty() && !(this.f7749a instanceof ArrayList)) {
            this.f7749a = new ArrayList(16);
        }
        int i14 = -(iA + 1);
        if (i14 >= 16) {
            return e().put(k14, v14);
        }
        if (this.f7749a.size() == 16) {
            q2<K, V>.c cVarRemove = this.f7749a.remove(15);
            e().put(cVarRemove.f7759a, cVarRemove.f7760b);
        }
        this.f7749a.add(i14, new c(k14, v14));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f7749a.size();
        int iHashCode = 0;
        for (int i14 = 0; i14 < size; i14++) {
            iHashCode += this.f7749a.get(i14).hashCode();
        }
        return this.f7750b.size() > 0 ? this.f7750b.hashCode() + iHashCode : iHashCode;
    }

    public final V i(int i14) {
        b();
        V v14 = this.f7749a.remove(i14).f7760b;
        if (!this.f7750b.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = e().entrySet().iterator();
            this.f7749a.add(new c(this, it.next()));
            it.remove();
        }
        return v14;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return i(iA);
        }
        if (this.f7750b.isEmpty()) {
            return null;
        }
        return this.f7750b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f7750b.size() + this.f7749a.size();
    }

    public class e extends AbstractSet<Map.Entry<K, V>> {
        private e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            q2.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            q2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = q2.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d(q2.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            q2.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return q2.this.size();
        }

        public /* synthetic */ e(q2 q2Var, p2 p2Var) {
            this();
        }
    }

    public class b extends q2<K, V>.e {
        private b() {
            super(q2.this, null);
        }

        @Override // androidx.health.platform.client.proto.q2.e, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a(q2.this, null);
        }

        public /* synthetic */ b(q2 q2Var, p2 p2Var) {
            this();
        }
    }

    public class d implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f7763b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f7764c;

        private d() {
            this.f7762a = -1;
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f7764c == null) {
                this.f7764c = q2.this.f7750b.entrySet().iterator();
            }
            return this.f7764c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i14 = this.f7762a + 1;
            q2 q2Var = q2.this;
            return i14 < q2Var.f7749a.size() || (!q2Var.f7750b.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f7763b = true;
            int i14 = this.f7762a + 1;
            this.f7762a = i14;
            q2 q2Var = q2.this;
            return i14 < q2Var.f7749a.size() ? q2Var.f7749a.get(this.f7762a) : a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f7763b) {
                vb.h.z("remove() was called before next()");
                return;
            }
            this.f7763b = false;
            int i14 = q2.f7748g;
            q2 q2Var = q2.this;
            q2Var.b();
            if (this.f7762a >= q2Var.f7749a.size()) {
                a().remove();
                return;
            }
            int i15 = this.f7762a;
            this.f7762a = i15 - 1;
            q2Var.i(i15);
        }

        public /* synthetic */ d(q2 q2Var, p2 p2Var) {
            this();
        }
    }

    public class a implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f7756b;

        private a() {
            this.f7755a = q2.this.f7749a.size();
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f7756b == null) {
                this.f7756b = q2.this.f7753e.entrySet().iterator();
            }
            return this.f7756b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i14 = this.f7755a;
            return (i14 > 0 && i14 <= q2.this.f7749a.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (a().hasNext()) {
                return a().next();
            }
            List<q2<K, V>.c> list = q2.this.f7749a;
            int i14 = this.f7755a - 1;
            this.f7755a = i14;
            return list.get(i14);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ a(q2 q2Var, p2 p2Var) {
            this();
        }
    }

    public class c implements Map.Entry<K, V>, Comparable<q2<K, V>.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f7759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public V f7760b;

        public c(q2 q2Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f7759a.compareTo(((c) obj).f7759a);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean zEquals;
            boolean zEquals2;
            if (obj != this) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    K k14 = this.f7759a;
                    if (k14 == null) {
                        zEquals = key == null;
                    } else {
                        zEquals = k14.equals(key);
                    }
                    if (zEquals) {
                        V v14 = this.f7760b;
                        Object value = entry.getValue();
                        if (v14 == null) {
                            zEquals2 = value == null;
                        } else {
                            zEquals2 = v14.equals(value);
                        }
                        if (zEquals2) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f7759a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f7760b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k14 = this.f7759a;
            int iHashCode = k14 == null ? 0 : k14.hashCode();
            V v14 = this.f7760b;
            return (v14 != null ? v14.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v14) {
            int i14 = q2.f7748g;
            q2.this.b();
            V v15 = this.f7760b;
            this.f7760b = v14;
            return v15;
        }

        public final String toString() {
            return this.f7759a + "=" + this.f7760b;
        }

        public c(K k14, V v14) {
            this.f7759a = k14;
            this.f7760b = v14;
        }
    }

    public /* synthetic */ q2(p2 p2Var) {
        this();
    }
}
