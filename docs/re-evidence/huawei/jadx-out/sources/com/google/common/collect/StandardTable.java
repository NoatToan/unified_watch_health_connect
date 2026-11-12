package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Supplier;
import com.google.errorprone.annotations.concurrent.LazyInit;
import defpackage.alf;
import defpackage.aml;
import defpackage.ams;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public class StandardTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @CheckForNull
    @LazyInit
    private transient Set<C> f4484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GwtTransient
    final Supplier<? extends Map<C, V>> f4485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    @LazyInit
    private transient StandardTable<R, C, V>.e f4486c;

    @CheckForNull
    @LazyInit
    private transient Map<R, Map<C, V>> d;

    @GwtTransient
    final Map<R, Map<C, V>> e;

    public StandardTable(Map<R, Map<C, V>> map, Supplier<? extends Map<C, V>> supplier) {
        this.e = map;
        this.f4485b = supplier;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean contains(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return (obj == null || obj2 == null || !super.contains(obj, obj2)) ? false : true;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsColumn(@CheckForNull Object obj) {
        if (obj == null) {
            return false;
        }
        Iterator<Map<C, V>> it = this.e.values().iterator();
        while (it.hasNext()) {
            if (Maps.c((Map<?, ?>) it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsRow(@CheckForNull Object obj) {
        return obj != null && Maps.c((Map<?, ?>) this.e, obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsValue(@CheckForNull Object obj) {
        return obj != null && super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CheckForNull
    public V get(@CheckForNull Object obj, @CheckForNull Object obj2) {
        if (obj == null || obj2 == null) {
            return null;
        }
        return (V) super.get(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean isEmpty() {
        return this.e.isEmpty();
    }

    @Override // com.google.common.collect.Table
    public int size() {
        Iterator<Map<C, V>> it = this.e.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public void clear() {
        this.e.clear();
    }

    private Map<C, V> e(R r) {
        Map<C, V> map = this.e.get(r);
        if (map != null) {
            return map;
        }
        Map<C, V> map2 = this.f4485b.get();
        this.e.put(r, map2);
        return map2;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CheckForNull
    public V put(R r, C c2, V v) {
        Preconditions.checkNotNull(r);
        Preconditions.checkNotNull(c2);
        Preconditions.checkNotNull(v);
        return e(r).put(c2, v);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CheckForNull
    public V remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Map map;
        if (obj == null || obj2 == null || (map = (Map) Maps.a(this.e, obj)) == null) {
            return null;
        }
        V v = (V) map.remove(obj2);
        if (map.isEmpty()) {
            this.e.remove(obj);
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<R, V> d(@CheckForNull Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<R, Map<C, V>>> it = this.e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<R, Map<C, V>> next = it.next();
            V vRemove = next.getValue().remove(obj);
            if (vRemove != null) {
                linkedHashMap.put(next.getKey(), vRemove);
                if (next.getValue().isEmpty()) {
                    it.remove();
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(@CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3) {
        return obj3 != null && obj3.equals(get(obj, obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(@CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull Object obj3) {
        if (!c(obj, obj2, obj3)) {
            return false;
        }
        remove(obj, obj2);
        return true;
    }

    abstract class TableSet<T> extends Sets.ImprovedAbstractSet<T> {
        private TableSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return StandardTable.this.e.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            StandardTable.this.e.clear();
        }
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Set<Table.Cell<R, C, V>> cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.AbstractTable
    Iterator<Table.Cell<R, C, V>> cellIterator() {
        return new a();
    }

    class a implements Iterator<Table.Cell<R, C, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @CheckForNull
        Map.Entry<R, Map<C, V>> f4487a;
        final Iterator<Map.Entry<R, Map<C, V>>> d;
        Iterator<Map.Entry<C, V>> e;

        private a() {
            this.d = StandardTable.this.e.entrySet().iterator();
            this.e = Iterators.a();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.d.hasNext() || this.e.hasNext();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Table.Cell<R, C, V> next() {
            if (!this.e.hasNext()) {
                Map.Entry<R, Map<C, V>> next = this.d.next();
                this.f4487a = next;
                this.e = next.getValue().entrySet().iterator();
            }
            Objects.requireNonNull(this.f4487a);
            Map.Entry<C, V> next2 = this.e.next();
            return Tables.c(this.f4487a.getKey(), next2.getKey(), next2.getValue());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.e.remove();
            if (((Map) ((Map.Entry) Objects.requireNonNull(this.f4487a)).getValue()).isEmpty()) {
                this.d.remove();
                this.f4487a = null;
            }
        }
    }

    @Override // com.google.common.collect.Table
    public Map<C, V> row(R r) {
        return new h(r);
    }

    class h extends Maps.IteratorBasedAbstractMap<C, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final R f4502a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        Map<C, V> f4504c;

        h(R r) {
            this.f4502a = (R) Preconditions.checkNotNull(r);
        }

        final void b() {
            Map<C, V> map = this.f4504c;
            if (map == null || (map.isEmpty() && StandardTable.this.e.containsKey(this.f4502a))) {
                this.f4504c = a();
            }
        }

        @CheckForNull
        Map<C, V> a() {
            return StandardTable.this.e.get(this.f4502a);
        }

        void c() {
            b();
            Map<C, V> map = this.f4504c;
            if (map == null || !map.isEmpty()) {
                return;
            }
            StandardTable.this.e.remove(this.f4502a);
            this.f4504c = null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            Map<C, V> map;
            b();
            return (obj == null || (map = this.f4504c) == null || !Maps.c((Map<?, ?>) map, obj)) ? false : true;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V get(@CheckForNull Object obj) {
            Map<C, V> map;
            b();
            if (obj == null || (map = this.f4504c) == null) {
                return null;
            }
            return (V) Maps.a(map, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V put(C c2, V v) {
            Preconditions.checkNotNull(c2);
            Preconditions.checkNotNull(v);
            Map<C, V> map = this.f4504c;
            if (map != null && !map.isEmpty()) {
                return this.f4504c.put(c2, v);
            }
            return (V) StandardTable.this.put(this.f4502a, c2, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V remove(@CheckForNull Object obj) {
            b();
            Map<C, V> map = this.f4504c;
            if (map == null) {
                return null;
            }
            V v = (V) Maps.h(map, obj);
            c();
            return v;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            b();
            Map<C, V> map = this.f4504c;
            if (map != null) {
                map.clear();
            }
            c();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            b();
            Map<C, V> map = this.f4504c;
            if (map == null) {
                return 0;
            }
            return map.size();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        Iterator<Map.Entry<C, V>> entryIterator() {
            b();
            Map<C, V> map = this.f4504c;
            if (map == null) {
                return Iterators.a();
            }
            final Iterator<Map.Entry<C, V>> it = map.entrySet().iterator();
            return new Iterator<Map.Entry<C, V>>() { // from class: com.google.common.collect.StandardTable.h.4
                @Override // java.util.Iterator
                public boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public Map.Entry<C, V> next() {
                    return h.this.e((Map.Entry) it.next());
                }

                @Override // java.util.Iterator
                public void remove() {
                    it.remove();
                    h.this.c();
                }
            };
        }

        Map.Entry<C, V> e(final Map.Entry<C, V> entry) {
            return new ForwardingMapEntry<C, V>(this) { // from class: com.google.common.collect.StandardTable.h.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                public Map.Entry<C, V> delegate() {
                    return entry;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                public V setValue(V v) {
                    return (V) super.setValue(Preconditions.checkNotNull(v));
                }

                @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                public boolean equals(@CheckForNull Object obj) {
                    return standardEquals(obj);
                }
            };
        }
    }

    @Override // com.google.common.collect.Table
    public Map<R, V> column(C c2) {
        return new b(c2);
    }

    class b extends Maps.ViewCachingAbstractMap<R, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final C f4489b;

        b(C c2) {
            this.f4489b = (C) Preconditions.checkNotNull(c2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V put(R r, V v) {
            return (V) StandardTable.this.put(r, this.f4489b, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V get(@CheckForNull Object obj) {
            return (V) StandardTable.this.get(obj, this.f4489b);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return StandardTable.this.contains(obj, this.f4489b);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V remove(@CheckForNull Object obj) {
            return (V) StandardTable.this.remove(obj, this.f4489b);
        }

        boolean e(Predicate<? super Map.Entry<R, V>> predicate) {
            Iterator<Map.Entry<R, Map<C, V>>> it = StandardTable.this.e.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<R, Map<C, V>> next = it.next();
                Map<C, V> value = next.getValue();
                V v = value.get(this.f4489b);
                if (v != null && predicate.apply(Maps.c(next.getKey(), v))) {
                    value.remove(this.f4489b);
                    if (value.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        Set<Map.Entry<R, V>> createEntrySet() {
            return new e();
        }

        class e extends Sets.ImprovedAbstractSet<Map.Entry<R, V>> {
            private e() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, V>> iterator() {
                return new c();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator<Map<C, V>> it = StandardTable.this.e.values().iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (it.next().containsKey(b.this.f4489b)) {
                        i++;
                    }
                }
                return i;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return !StandardTable.this.containsColumn(b.this.f4489b);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                b.this.e(Predicates.alwaysTrue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return StandardTable.this.c(entry.getKey(), b.this.f4489b, entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@CheckForNull Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return StandardTable.this.d(entry.getKey(), b.this.f4489b, entry.getValue());
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return b.this.e(Predicates.not(Predicates.in(collection)));
            }
        }

        class c extends AbstractIterator<Map.Entry<R, V>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final Iterator<Map.Entry<R, Map<C, V>>> f4492b;

            private c() {
                this.f4492b = StandardTable.this.e.entrySet().iterator();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<R, V> computeNext() {
                while (this.f4492b.hasNext()) {
                    Map.Entry<R, Map<C, V>> next = this.f4492b.next();
                    if (next.getValue().containsKey(b.this.f4489b)) {
                        return new C0047c(next);
                    }
                }
                return endOfData();
            }

            /* JADX INFO: renamed from: com.google.common.collect.StandardTable$b$c$c, reason: collision with other inner class name */
            class C0047c extends AbstractMapEntry<R, V> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Map.Entry f4493c;

                C0047c(Map.Entry entry) {
                    this.f4493c = entry;
                }

                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                public R getKey() {
                    return (R) this.f4493c.getKey();
                }

                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                public V getValue() {
                    return (V) ((Map) this.f4493c.getValue()).get(b.this.f4489b);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                public V setValue(V v) {
                    return (V) ams.e(((Map) this.f4493c.getValue()).put(b.this.f4489b, Preconditions.checkNotNull(v)));
                }
            }
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* JADX INFO: renamed from: createKeySet */
        Set<R> d() {
            return new a();
        }

        class a extends Maps.c<R, V> {
            a() {
                super(b.this);
            }

            @Override // com.google.common.collect.Maps.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                return StandardTable.this.contains(obj, b.this.f4489b);
            }

            @Override // com.google.common.collect.Maps.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@CheckForNull Object obj) {
                return StandardTable.this.remove(obj, b.this.f4489b) != null;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return b.this.e(Maps.a(Predicates.not(Predicates.in(collection))));
            }
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        Collection<V> createValues() {
            return new d();
        }

        class d extends Maps.g<R, V> {
            d() {
                super(b.this);
            }

            @Override // com.google.common.collect.Maps.g, java.util.AbstractCollection, java.util.Collection
            public boolean remove(@CheckForNull Object obj) {
                return obj != null && b.this.e(Maps.e(Predicates.equalTo(obj)));
            }

            @Override // com.google.common.collect.Maps.g, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                return b.this.e(Maps.e(Predicates.in(collection)));
            }

            @Override // com.google.common.collect.Maps.g, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                return b.this.e(Maps.e(Predicates.not(Predicates.in(collection))));
            }
        }
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Set<R> rowKeySet() {
        return rowMap().keySet();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Set<C> columnKeySet() {
        Set<C> set = this.f4484a;
        if (set != null) {
            return set;
        }
        d dVar = new d();
        this.f4484a = dVar;
        return dVar;
    }

    class d extends StandardTable<R, C, V>.TableSet<C> {
        private d() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<C> iterator() {
            return StandardTable.this.a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Iterators.j(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            boolean z = false;
            if (obj == null) {
                return false;
            }
            Iterator<Map<C, V>> it = StandardTable.this.e.values().iterator();
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (next.keySet().remove(obj)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            Preconditions.checkNotNull(collection);
            Iterator<Map<C, V>> it = StandardTable.this.e.values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (Iterators.d((Iterator<?>) next.keySet().iterator(), collection)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            Preconditions.checkNotNull(collection);
            Iterator<Map<C, V>> it = StandardTable.this.e.values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (next.keySet().retainAll(collection)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return StandardTable.this.containsColumn(obj);
        }
    }

    Iterator<C> a() {
        return new c();
    }

    class c extends AbstractIterator<C> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<C, V> f4496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Iterator<Map.Entry<C, V>> f4497b;
        final Iterator<Map<C, V>> d;

        private c() {
            this.f4496a = StandardTable.this.f4485b.get();
            this.d = StandardTable.this.e.values().iterator();
            this.f4497b = Iterators.e();
        }

        @Override // com.google.common.collect.AbstractIterator
        @CheckForNull
        protected C computeNext() {
            while (true) {
                if (this.f4497b.hasNext()) {
                    Map.Entry<C, V> next = this.f4497b.next();
                    if (!this.f4496a.containsKey(next.getKey())) {
                        this.f4496a.put(next.getKey(), next.getValue());
                        return next.getKey();
                    }
                } else if (this.d.hasNext()) {
                    this.f4497b = this.d.next().entrySet().iterator();
                } else {
                    return endOfData();
                }
            }
        }
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.Table
    public Map<R, Map<C, V>> rowMap() {
        Map<R, Map<C, V>> map = this.d;
        if (map != null) {
            return map;
        }
        Map<R, Map<C, V>> mapD = d();
        this.d = mapD;
        return mapD;
    }

    Map<R, Map<C, V>> d() {
        return new g();
    }

    class g extends Maps.ViewCachingAbstractMap<R, Map<C, V>> {
        g() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return StandardTable.this.containsRow(obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map<C, V> get(@CheckForNull Object obj) {
            if (StandardTable.this.containsRow(obj)) {
                return StandardTable.this.row(Objects.requireNonNull(obj));
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map<C, V> remove(@CheckForNull Object obj) {
            if (obj == null) {
                return null;
            }
            return StandardTable.this.e.remove(obj);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected Set<Map.Entry<R, Map<C, V>>> createEntrySet() {
            return new e();
        }

        final class e extends StandardTable<R, C, V>.TableSet<Map.Entry<R, Map<C, V>>> {
            private e() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, Map<C, V>>> iterator() {
                return Maps.e(StandardTable.this.e.keySet(), new Function<R, Map<C, V>>() { // from class: com.google.common.collect.StandardTable.g.e.5
                    @Override // com.google.common.base.Function
                    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                    public Map<C, V> apply(R r) {
                        return StandardTable.this.row(r);
                    }
                });
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return StandardTable.this.e.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return entry.getKey() != null && (entry.getValue() instanceof Map) && alf.a(StandardTable.this.e.entrySet(), entry);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@CheckForNull Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return entry.getKey() != null && (entry.getValue() instanceof Map) && StandardTable.this.e.entrySet().remove(entry);
            }
        }
    }

    @Override // com.google.common.collect.Table
    public Map<C, Map<R, V>> columnMap() {
        StandardTable<R, C, V>.e eVar = this.f4486c;
        if (eVar != null) {
            return eVar;
        }
        StandardTable<R, C, V>.e eVar2 = new e();
        this.f4486c = eVar2;
        return eVar2;
    }

    class e extends Maps.ViewCachingAbstractMap<C, Map<R, V>> {
        private e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map<R, V> get(@CheckForNull Object obj) {
            if (StandardTable.this.containsColumn(obj)) {
                return StandardTable.this.column(Objects.requireNonNull(obj));
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return StandardTable.this.containsColumn(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map<R, V> remove(@CheckForNull Object obj) {
            if (StandardTable.this.containsColumn(obj)) {
                return StandardTable.this.d(obj);
            }
            return null;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<Map.Entry<C, Map<R, V>>> createEntrySet() {
            return new b();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public Set<C> keySet() {
            return StandardTable.this.columnKeySet();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        Collection<Map<R, V>> createValues() {
            return new a();
        }

        final class b extends StandardTable<R, C, V>.TableSet<Map.Entry<C, Map<R, V>>> {
            private b() {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<C, Map<R, V>>> iterator() {
                return Maps.e(StandardTable.this.columnKeySet(), new Function<C, Map<R, V>>() { // from class: com.google.common.collect.StandardTable.e.b.3
                    @Override // com.google.common.base.Function
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public Map<R, V> apply(C c2) {
                        return StandardTable.this.column(c2);
                    }
                });
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return StandardTable.this.columnKeySet().size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (StandardTable.this.containsColumn(entry.getKey())) {
                    return ((Map) Objects.requireNonNull(e.this.get(entry.getKey()))).equals(entry.getValue());
                }
                return false;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@CheckForNull Object obj) {
                if (!contains(obj) || !(obj instanceof Map.Entry)) {
                    return false;
                }
                StandardTable.this.d(((Map.Entry) obj).getKey());
                return true;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                Preconditions.checkNotNull(collection);
                return Sets.c(this, collection.iterator());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                Preconditions.checkNotNull(collection);
                boolean z = false;
                for (Object obj : aml.a(StandardTable.this.columnKeySet().iterator())) {
                    if (!collection.contains(Maps.c(obj, StandardTable.this.column(obj)))) {
                        StandardTable.this.d(obj);
                        z = true;
                    }
                }
                return z;
            }
        }

        class a extends Maps.g<C, Map<R, V>> {
            a() {
                super(e.this);
            }

            @Override // com.google.common.collect.Maps.g, java.util.AbstractCollection, java.util.Collection
            public boolean remove(@CheckForNull Object obj) {
                for (Map.Entry<C, Map<R, V>> entry : e.this.entrySet()) {
                    if (entry.getValue().equals(obj)) {
                        StandardTable.this.d(entry.getKey());
                        return true;
                    }
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Maps.g, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                Preconditions.checkNotNull(collection);
                boolean z = false;
                for (Object obj : aml.a(StandardTable.this.columnKeySet().iterator())) {
                    if (collection.contains(StandardTable.this.column(obj))) {
                        StandardTable.this.d(obj);
                        z = true;
                    }
                }
                return z;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.Maps.g, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                Preconditions.checkNotNull(collection);
                boolean z = false;
                for (Object obj : aml.a(StandardTable.this.columnKeySet().iterator())) {
                    if (!collection.contains(StandardTable.this.column(obj))) {
                        StandardTable.this.d(obj);
                        z = true;
                    }
                }
                return z;
            }
        }
    }
}
