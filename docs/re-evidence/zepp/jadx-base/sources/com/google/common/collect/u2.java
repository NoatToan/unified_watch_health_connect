package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Supplier;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
class u2<R, C, V> extends o<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;

    @z0
    public final Map<R, Map<C, V>> c;

    @z0
    public final Supplier<? extends Map<C, V>> d;

    @MonotonicNonNullDecl
    private transient Set<C> e;

    @MonotonicNonNullDecl
    private transient Map<R, Map<C, V>> f;

    @MonotonicNonNullDecl
    private transient u2<R, C, V>.f g;

    public class b implements Iterator<Table.Cell<R, C, V>> {
        public final Iterator<Map.Entry<R, Map<C, V>>> a;

        @NullableDecl
        public Map.Entry<R, Map<C, V>> b;
        public Iterator<Map.Entry<C, V>> c;

        private b() {
            this.a = u2.this.c.entrySet().iterator();
            this.c = Iterators.h();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Table.Cell<R, C, V> next() {
            if (!this.c.hasNext()) {
                Map.Entry<R, Map<C, V>> next = this.a.next();
                this.b = next;
                this.c = next.getValue().entrySet().iterator();
            }
            Map.Entry<C, V> next2 = this.c.next();
            return Tables.immutableCell(this.b.getKey(), next2.getKey(), next2.getValue());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext() || this.c.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.c.remove();
            if (this.b.getValue().isEmpty()) {
                this.a.remove();
                this.b = null;
            }
        }
    }

    public class c extends Maps.q0<R, V> {
        public final C d;

        public class a extends Sets.k<Map.Entry<R, V>> {
            private a() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                c.this.e(Predicates.alwaysTrue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return u2.this.i(entry.getKey(), c.this.d, entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                c cVar = c.this;
                return !u2.this.containsColumn(cVar.d);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, V>> iterator() {
                return new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return u2.this.o(entry.getKey(), c.this.d, entry.getValue());
            }

            @Override // com.google.common.collect.Sets.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return c.this.e(Predicates.not(Predicates.in(collection)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator<Map<C, V>> it2 = u2.this.c.values().iterator();
                int i = 0;
                while (it2.hasNext()) {
                    if (it2.next().containsKey(c.this.d)) {
                        i++;
                    }
                }
                return i;
            }
        }

        public class b extends AbstractIterator<Map.Entry<R, V>> {
            public final Iterator<Map.Entry<R, Map<C, V>>> c;

            public class a extends com.google.common.collect.f<R, V> {
                public final /* synthetic */ Map.Entry a;

                public a(Map.Entry entry) {
                    this.a = entry;
                }

                @Override // com.google.common.collect.f, java.util.Map.Entry
                public R getKey() {
                    return (R) this.a.getKey();
                }

                @Override // com.google.common.collect.f, java.util.Map.Entry
                public V getValue() {
                    return (V) ((Map) this.a.getValue()).get(c.this.d);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.collect.f, java.util.Map.Entry
                public V setValue(V v) {
                    return (V) ((Map) this.a.getValue()).put(c.this.d, Preconditions.checkNotNull(v));
                }
            }

            private b() {
                this.c = u2.this.c.entrySet().iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<R, V> computeNext() {
                while (this.c.hasNext()) {
                    Map.Entry<R, Map<C, V>> next = this.c.next();
                    if (next.getValue().containsKey(c.this.d)) {
                        return new a(next);
                    }
                }
                return endOfData();
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.u2$c$c, reason: collision with other inner class name */
        public class C0201c extends Maps.a0<R, V> {
            public C0201c() {
                super(c.this);
            }

            @Override // com.google.common.collect.Maps.a0, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                c cVar = c.this;
                return u2.this.contains(obj, cVar.d);
            }

            @Override // com.google.common.collect.Maps.a0, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                c cVar = c.this;
                return u2.this.remove(obj, cVar.d) != null;
            }

            @Override // com.google.common.collect.Sets.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return c.this.e(Maps.y(Predicates.not(Predicates.in(collection))));
            }
        }

        public class d extends Maps.p0<R, V> {
            public d() {
                super(c.this);
            }

            @Override // com.google.common.collect.Maps.p0, java.util.AbstractCollection, java.util.Collection
            public boolean remove(Object obj) {
                return obj != null && c.this.e(Maps.S(Predicates.equalTo(obj)));
            }

            @Override // com.google.common.collect.Maps.p0, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                return c.this.e(Maps.S(Predicates.in(collection)));
            }

            @Override // com.google.common.collect.Maps.p0, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                return c.this.e(Maps.S(Predicates.not(Predicates.in(collection))));
            }
        }

        public c(C c) {
            this.d = (C) Preconditions.checkNotNull(c);
        }

        @Override // com.google.common.collect.Maps.q0
        public Set<Map.Entry<R, V>> a() {
            return new a();
        }

        @Override // com.google.common.collect.Maps.q0
        /* JADX INFO: renamed from: c */
        public Set<R> h() {
            return new C0201c();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return u2.this.contains(obj, this.d);
        }

        @Override // com.google.common.collect.Maps.q0
        public Collection<V> d() {
            return new d();
        }

        @CanIgnoreReturnValue
        public boolean e(Predicate<? super Map.Entry<R, V>> predicate) {
            Iterator<Map.Entry<R, Map<C, V>>> it2 = u2.this.c.entrySet().iterator();
            boolean z = false;
            while (it2.hasNext()) {
                Map.Entry<R, Map<C, V>> next = it2.next();
                Map<C, V> value = next.getValue();
                V v = value.get(this.d);
                if (v != null && predicate.apply(Maps.immutableEntry(next.getKey(), v))) {
                    value.remove(this.d);
                    z = true;
                    if (value.isEmpty()) {
                        it2.remove();
                    }
                }
            }
            return z;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            return (V) u2.this.get(obj, this.d);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(R r, V v) {
            return (V) u2.this.put(r, this.d, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            return (V) u2.this.remove(obj, this.d);
        }
    }

    public class d extends AbstractIterator<C> {
        public final Map<C, V> c;
        public final Iterator<Map<C, V>> d;
        public Iterator<Map.Entry<C, V>> e;

        private d() {
            this.c = u2.this.d.get();
            this.d = u2.this.c.values().iterator();
            this.e = Iterators.f();
        }

        @Override // com.google.common.collect.AbstractIterator
        public C computeNext() {
            while (true) {
                if (this.e.hasNext()) {
                    Map.Entry<C, V> next = this.e.next();
                    if (!this.c.containsKey(next.getKey())) {
                        this.c.put(next.getKey(), next.getValue());
                        return next.getKey();
                    }
                } else {
                    if (!this.d.hasNext()) {
                        return endOfData();
                    }
                    this.e = this.d.next().entrySet().iterator();
                }
            }
        }
    }

    public class e extends u2<R, C, V>.i<C> {
        private e() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return u2.this.containsColumn(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<C> iterator() {
            return u2.this.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            boolean z = false;
            if (obj == null) {
                return false;
            }
            Iterator<Map<C, V>> it2 = u2.this.c.values().iterator();
            while (it2.hasNext()) {
                Map<C, V> next = it2.next();
                if (next.keySet().remove(obj)) {
                    z = true;
                    if (next.isEmpty()) {
                        it2.remove();
                    }
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Sets.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            Preconditions.checkNotNull(collection);
            Iterator<Map<C, V>> it2 = u2.this.c.values().iterator();
            boolean z = false;
            while (it2.hasNext()) {
                Map<C, V> next = it2.next();
                if (Iterators.removeAll(next.keySet().iterator(), collection)) {
                    z = true;
                    if (next.isEmpty()) {
                        it2.remove();
                    }
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Sets.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            Preconditions.checkNotNull(collection);
            Iterator<Map<C, V>> it2 = u2.this.c.values().iterator();
            boolean z = false;
            while (it2.hasNext()) {
                Map<C, V> next = it2.next();
                if (next.keySet().retainAll(collection)) {
                    z = true;
                    if (next.isEmpty()) {
                        it2.remove();
                    }
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Iterators.size(iterator());
        }
    }

    public class f extends Maps.q0<C, Map<R, V>> {

        public class a extends u2<R, C, V>.i<Map.Entry<C, Map<R, V>>> {

            /* JADX INFO: renamed from: com.google.common.collect.u2$f$a$a, reason: collision with other inner class name */
            public class C0202a implements Function<C, Map<R, V>> {
                public C0202a() {
                }

                @Override // com.google.common.base.Function
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Map<R, V> apply(C c) {
                    return u2.this.column(c);
                }
            }

            public a() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!u2.this.containsColumn(entry.getKey())) {
                    return false;
                }
                return f.this.get(entry.getKey()).equals(entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<C, Map<R, V>>> iterator() {
                return Maps.i(u2.this.columnKeySet(), new C0202a());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                u2.this.n(((Map.Entry) obj).getKey());
                return true;
            }

            @Override // com.google.common.collect.Sets.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                Preconditions.checkNotNull(collection);
                return Sets.e(this, collection.iterator());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Sets.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                Preconditions.checkNotNull(collection);
                boolean z = false;
                for (Object obj : Lists.newArrayList(u2.this.columnKeySet().iterator())) {
                    if (!collection.contains(Maps.immutableEntry(obj, u2.this.column(obj)))) {
                        u2.this.n(obj);
                        z = true;
                    }
                }
                return z;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return u2.this.columnKeySet().size();
            }
        }

        public class b extends Maps.p0<C, Map<R, V>> {
            public b() {
                super(f.this);
            }

            @Override // com.google.common.collect.Maps.p0, java.util.AbstractCollection, java.util.Collection
            public boolean remove(Object obj) {
                for (Map.Entry<C, Map<R, V>> entry : f.this.entrySet()) {
                    if (entry.getValue().equals(obj)) {
                        u2.this.n(entry.getKey());
                        return true;
                    }
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Maps.p0, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                Preconditions.checkNotNull(collection);
                boolean z = false;
                for (Object obj : Lists.newArrayList(u2.this.columnKeySet().iterator())) {
                    if (collection.contains(u2.this.column(obj))) {
                        u2.this.n(obj);
                        z = true;
                    }
                }
                return z;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Maps.p0, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                Preconditions.checkNotNull(collection);
                boolean z = false;
                for (Object obj : Lists.newArrayList(u2.this.columnKeySet().iterator())) {
                    if (!collection.contains(u2.this.column(obj))) {
                        u2.this.n(obj);
                        z = true;
                    }
                }
                return z;
            }
        }

        private f() {
        }

        @Override // com.google.common.collect.Maps.q0
        public Set<Map.Entry<C, Map<R, V>>> a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return u2.this.containsColumn(obj);
        }

        @Override // com.google.common.collect.Maps.q0
        public Collection<Map<R, V>> d() {
            return new b();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map<R, V> get(Object obj) {
            if (u2.this.containsColumn(obj)) {
                return u2.this.column(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map<R, V> remove(Object obj) {
            if (u2.this.containsColumn(obj)) {
                return u2.this.n(obj);
            }
            return null;
        }

        @Override // com.google.common.collect.Maps.q0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<C> keySet() {
            return u2.this.columnKeySet();
        }
    }

    public class g extends Maps.z<C, V> {
        public final R a;

        @NullableDecl
        public Map<C, V> b;

        public class a implements Iterator<Map.Entry<C, V>> {
            public final /* synthetic */ Iterator a;

            public a(Iterator it2) {
                this.a = it2;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<C, V> next() {
                return g.this.f((Map.Entry) this.a.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.a.remove();
                g.this.e();
            }
        }

        public class b extends ForwardingMapEntry<C, V> {
            public final /* synthetic */ Map.Entry a;

            public b(Map.Entry entry) {
                this.a = entry;
            }

            @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
            public boolean equals(Object obj) {
                return standardEquals(obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
            public V setValue(V v) {
                return (V) super.setValue(Preconditions.checkNotNull(v));
            }

            @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
            public Map.Entry<C, V> delegate() {
                return this.a;
            }
        }

        public g(R r) {
            this.a = (R) Preconditions.checkNotNull(r);
        }

        @Override // com.google.common.collect.Maps.z
        public Iterator<Map.Entry<C, V>> a() {
            Map<C, V> mapC = c();
            return mapC == null ? Iterators.h() : new a(mapC.entrySet().iterator());
        }

        public Map<C, V> c() {
            Map<C, V> map = this.b;
            if (map != null && (!map.isEmpty() || !u2.this.c.containsKey(this.a))) {
                return this.b;
            }
            Map<C, V> mapD = d();
            this.b = mapD;
            return mapD;
        }

        @Override // com.google.common.collect.Maps.z, java.util.AbstractMap, java.util.Map
        public void clear() {
            Map<C, V> mapC = c();
            if (mapC != null) {
                mapC.clear();
            }
            e();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            Map<C, V> mapC = c();
            return (obj == null || mapC == null || !Maps.F(mapC, obj)) ? false : true;
        }

        public Map<C, V> d() {
            return u2.this.c.get(this.a);
        }

        public void e() {
            if (c() == null || !this.b.isEmpty()) {
                return;
            }
            u2.this.c.remove(this.a);
            this.b = null;
        }

        public Map.Entry<C, V> f(Map.Entry<C, V> entry) {
            return new b(entry);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            Map<C, V> mapC = c();
            if (obj == null || mapC == null) {
                return null;
            }
            return (V) Maps.G(mapC, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(C c, V v) {
            Preconditions.checkNotNull(c);
            Preconditions.checkNotNull(v);
            Map<C, V> map = this.b;
            return (map == null || map.isEmpty()) ? (V) u2.this.put(this.a, c, v) : this.b.put(c, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            Map<C, V> mapC = c();
            if (mapC == null) {
                return null;
            }
            V v = (V) Maps.H(mapC, obj);
            e();
            return v;
        }

        @Override // com.google.common.collect.Maps.z, java.util.AbstractMap, java.util.Map
        public int size() {
            Map<C, V> mapC = c();
            if (mapC == null) {
                return 0;
            }
            return mapC.size();
        }
    }

    public class h extends Maps.q0<R, Map<C, V>> {

        public class a extends u2<R, C, V>.i<Map.Entry<R, Map<C, V>>> {

            /* JADX INFO: renamed from: com.google.common.collect.u2$h$a$a, reason: collision with other inner class name */
            public class C0203a implements Function<R, Map<C, V>> {
                public C0203a() {
                }

                @Override // com.google.common.base.Function
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Map<C, V> apply(R r) {
                    return u2.this.row(r);
                }
            }

            public a() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return entry.getKey() != null && (entry.getValue() instanceof Map) && Collections2.g(u2.this.c.entrySet(), entry);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, Map<C, V>>> iterator() {
                return Maps.i(u2.this.c.keySet(), new C0203a());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return entry.getKey() != null && (entry.getValue() instanceof Map) && u2.this.c.entrySet().remove(entry);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return u2.this.c.size();
            }
        }

        public h() {
        }

        @Override // com.google.common.collect.Maps.q0
        public Set<Map.Entry<R, Map<C, V>>> a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return u2.this.containsRow(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map<C, V> get(Object obj) {
            if (u2.this.containsRow(obj)) {
                return u2.this.row(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map<C, V> remove(Object obj) {
            if (obj == null) {
                return null;
            }
            return u2.this.c.remove(obj);
        }
    }

    public abstract class i<T> extends Sets.k<T> {
        private i() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            u2.this.c.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return u2.this.c.isEmpty();
        }
    }

    public u2(Map<R, Map<C, V>> map, Supplier<? extends Map<C, V>> supplier) {
        this.c = map;
        this.d = supplier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(Object obj, Object obj2, Object obj3) {
        return obj3 != null && obj3.equals(get(obj, obj2));
    }

    private Map<C, V> m(R r) {
        Map<C, V> map = this.c.get(r);
        if (map != null) {
            return map;
        }
        Map<C, V> map2 = this.d.get();
        this.c.put(r, map2);
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CanIgnoreReturnValue
    public Map<R, V> n(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<R, Map<C, V>>> it2 = this.c.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<R, Map<C, V>> next = it2.next();
            V vRemove = next.getValue().remove(obj);
            if (vRemove != null) {
                linkedHashMap.put(next.getKey(), vRemove);
                if (next.getValue().isEmpty()) {
                    it2.remove();
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o(Object obj, Object obj2, Object obj3) {
        if (!i(obj, obj2, obj3)) {
            return false;
        }
        remove(obj, obj2);
        return true;
    }

    @Override // com.google.common.collect.o
    public Iterator<Table.Cell<R, C, V>> a() {
        return new b();
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    public Set<Table.Cell<R, C, V>> cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    public void clear() {
        this.c.clear();
    }

    @Override // com.google.common.collect.Table
    public Map<R, V> column(C c2) {
        return new c(c2);
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    public Set<C> columnKeySet() {
        Set<C> set = this.e;
        if (set != null) {
            return set;
        }
        e eVar = new e();
        this.e = eVar;
        return eVar;
    }

    @Override // com.google.common.collect.Table
    public Map<C, Map<R, V>> columnMap() {
        u2<R, C, V>.f fVar = this.g;
        if (fVar != null) {
            return fVar;
        }
        u2<R, C, V>.f fVar2 = new f();
        this.g = fVar2;
        return fVar2;
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    public boolean contains(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return (obj == null || obj2 == null || !super.contains(obj, obj2)) ? false : true;
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    public boolean containsColumn(@NullableDecl Object obj) {
        if (obj == null) {
            return false;
        }
        Iterator<Map<C, V>> it2 = this.c.values().iterator();
        while (it2.hasNext()) {
            if (Maps.F(it2.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    public boolean containsRow(@NullableDecl Object obj) {
        return obj != null && Maps.F(this.c, obj);
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    public boolean containsValue(@NullableDecl Object obj) {
        return obj != null && super.containsValue(obj);
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    public V get(@NullableDecl Object obj, @NullableDecl Object obj2) {
        if (obj == null || obj2 == null) {
            return null;
        }
        return (V) super.get(obj, obj2);
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    public Iterator<C> j() {
        return new d();
    }

    public Map<R, Map<C, V>> k() {
        return new h();
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    @CanIgnoreReturnValue
    public V put(R r, C c2, V v) {
        Preconditions.checkNotNull(r);
        Preconditions.checkNotNull(c2);
        Preconditions.checkNotNull(v);
        return m(r).put(c2, v);
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    @CanIgnoreReturnValue
    public V remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Map map;
        if (obj == null || obj2 == null || (map = (Map) Maps.G(this.c, obj)) == null) {
            return null;
        }
        V v = (V) map.remove(obj2);
        if (map.isEmpty()) {
            this.c.remove(obj);
        }
        return v;
    }

    @Override // com.google.common.collect.Table
    public Map<C, V> row(R r) {
        return new g(r);
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    public Set<R> rowKeySet() {
        return rowMap().keySet();
    }

    @Override // com.google.common.collect.Table
    public Map<R, Map<C, V>> rowMap() {
        Map<R, Map<C, V>> map = this.f;
        if (map != null) {
            return map;
        }
        Map<R, Map<C, V>> mapK = k();
        this.f = mapK;
        return mapK;
    }

    @Override // com.google.common.collect.Table
    public int size() {
        Iterator<Map<C, V>> it2 = this.c.values().iterator();
        int size = 0;
        while (it2.hasNext()) {
            size += it2.next().size();
        }
        return size;
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    public Collection<V> values() {
        return super.values();
    }
}
