package p13;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.text.StringSubstitutor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\fB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lp13/d;", "K", "V", "", "<init>", "()V", "", "_keys", "Ljava/util/Set;", "", "_values", "Ljava/util/Collection;", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d<K, V> implements Map<K, V>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f134923a = 0;
    private volatile Set<? extends K> _keys;
    private volatile Collection<? extends V> _values;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"p13/d$b", "Lp13/i;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends i<K> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d<K, V> f134924b;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"p13/d$b$a", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Iterator<K>, f23.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Iterator<Map.Entry<K, V>> f134925a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f134925a = it;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f134925a.hasNext();
            }

            @Override // java.util.Iterator
            public final K next() {
                return this.f134925a.next().getKey();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(d<K, ? extends V> dVar) {
            this.f134924b = dVar;
        }

        @Override // p13.a
        /* JADX INFO: renamed from: a */
        public final int getF168272d() {
            return this.f134924b.getF102965c();
        }

        @Override // p13.a, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            return this.f134924b.containsKey(obj);
        }

        @Override // p13.i, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this.f134924b.b().iterator());
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"p13/d$c", "Lp13/a;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends p13.a<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d<K, V> f134926a;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"p13/d$c$a", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Iterator<V>, f23.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Iterator<Map.Entry<K, V>> f134927a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.f134927a = it;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f134927a.hasNext();
            }

            @Override // java.util.Iterator
            public final V next() {
                return this.f134927a.next().getValue();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(d<K, ? extends V> dVar) {
            this.f134926a = dVar;
        }

        @Override // p13.a
        /* JADX INFO: renamed from: a */
        public final int getF168272d() {
            return this.f134926a.getF102965c();
        }

        @Override // p13.a, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            return this.f134926a.containsValue(obj);
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new a(this.f134926a.b().iterator());
        }
    }

    static {
        new a(null);
    }

    public abstract Set<Map.Entry<K, V>> b();

    public Set<K> c() {
        if (this._keys == null) {
            this._keys = new b(this);
        }
        Set<? extends K> set = this._keys;
        set.getClass();
        return set;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return g(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> setB = b();
        if (setB.isEmpty()) {
            return false;
        }
        Iterator<T> it = setB.iterator();
        while (it.hasNext()) {
            if (p005kotlin.jvm.internal.s.g(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public int getF102965c() {
        return b().size();
    }

    public Collection<V> e() {
        if (this._values == null) {
            this._values = new c(this);
        }
        Collection<? extends V> collection = this._values;
        collection.getClass();
        return collection;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return b();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (getF102965c() != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                V v14 = get(key);
                if (p005kotlin.jvm.internal.s.g(value, v14) && (v14 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    public final Map.Entry<K, V> g(K k14) {
        Object next;
        Iterator<T> it = b().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (p005kotlin.jvm.internal.s.g(((Map.Entry) next).getKey(), k14)) {
                return (Map.Entry) next;
            }
        }
        next = null;
        return (Map.Entry) next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        Map.Entry<K, V> entryG = g(obj);
        if (entryG != null) {
            return entryG.getValue();
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return b().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return getF102965c() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return c();
    }

    @Override // java.util.Map
    public final V put(K k14, V v14) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getF102965c();
    }

    public final String toString() {
        return h0.k0(b(), ", ", "{", StringSubstitutor.DEFAULT_VAR_END, new nw0.f(this, 29), 24);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return e();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp13/d$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
