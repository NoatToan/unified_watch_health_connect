package com.google.common.collect;

import defpackage.b10;
import defpackage.c6i;
import defpackage.d2h;
import defpackage.dua;
import defpackage.epd;
import defpackage.f10;
import defpackage.h6i;
import defpackage.k6i;
import defpackage.m44;
import defpackage.s1a;
import defpackage.spo;
import defpackage.xhe;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class p0<R, C, V> extends j<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final Map<R, Map<C, V>> backingMap;
    private transient Set<C> columnKeySet;
    private transient p0<R, C, V>.f columnMap;
    final spo<? extends Map<C, V>> factory;
    private transient Map<R, Map<C, V>> rowMap;

    public class b implements Iterator<q0.a<R, C, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<Map.Entry<R, Map<C, V>>> f9206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map.Entry<R, Map<C, V>> f9207b;
        public Iterator<Map.Entry<C, V>> c;

        public b() {
            this.f9206a = p0.this.backingMap.entrySet().iterator();
            this.c = epd.j();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public q0.a<R, C, V> next() {
            if (!this.c.hasNext()) {
                Map.Entry<R, Map<C, V>> next = this.f9206a.next();
                this.f9207b = next;
                this.c = next.getValue().entrySet().iterator();
            }
            Objects.requireNonNull(this.f9207b);
            Map.Entry<C, V> next2 = this.c.next();
            return r0.b(this.f9207b.getKey(), next2.getKey(), next2.getValue());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9206a.hasNext() || this.c.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.c.remove();
            Map.Entry<R, Map<C, V>> entry = this.f9207b;
            Objects.requireNonNull(entry);
            if (entry.getValue().isEmpty()) {
                this.f9206a.remove();
                this.f9207b = null;
            }
        }
    }

    public class c extends s.r<R, V> {
        public final C d;

        public class a extends i0.b<Map.Entry<R, V>> {
            public a() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                c.this.d(k6i.a());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return p0.this.containsMapping(entry.getKey(), c.this.d, entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                c cVar = c.this;
                return !p0.this.containsColumn(cVar.d);
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
                return p0.this.removeMapping(entry.getKey(), c.this.d, entry.getValue());
            }

            @Override // com.google.common.collect.i0.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return c.this.d(k6i.f(k6i.d(collection)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator<Map<C, V>> it = p0.this.backingMap.values().iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (it.next().containsKey(c.this.d)) {
                        i++;
                    }
                }
                return i;
            }
        }

        public class b extends b10<Map.Entry<R, V>> {
            public final Iterator<Map.Entry<R, Map<C, V>>> c;

            public class a extends f10<R, V> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Map.Entry f9209a;

                public a(Map.Entry entry) {
                    this.f9209a = entry;
                }

                @Override // defpackage.f10, java.util.Map.Entry
                public R getKey() {
                    return (R) this.f9209a.getKey();
                }

                @Override // defpackage.f10, java.util.Map.Entry
                public V getValue() {
                    return (V) ((Map) this.f9209a.getValue()).get(c.this.d);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.f10, java.util.Map.Entry
                public V setValue(V v) {
                    return (V) d2h.a(((Map) this.f9209a.getValue()).put(c.this.d, c6i.o(v)));
                }
            }

            public b() {
                this.c = p0.this.backingMap.entrySet().iterator();
            }

            @Override // defpackage.b10
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<R, V> a() {
                while (this.c.hasNext()) {
                    Map.Entry<R, Map<C, V>> next = this.c.next();
                    if (next.getValue().containsKey(c.this.d)) {
                        return new a(next);
                    }
                }
                return b();
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.p0$c$c, reason: collision with other inner class name */
        public class C0237c extends s.m<R, V> {
            public C0237c() {
                super(c.this);
            }

            @Override // com.google.common.collect.s.m, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                c cVar = c.this;
                return p0.this.contains(obj, cVar.d);
            }

            @Override // com.google.common.collect.s.m, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                c cVar = c.this;
                return p0.this.remove(obj, cVar.d) != null;
            }

            @Override // com.google.common.collect.i0.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return c.this.d(s.n(k6i.f(k6i.d(collection))));
            }
        }

        public class d extends s.q<R, V> {
            public d() {
                super(c.this);
            }

            @Override // com.google.common.collect.s.q, java.util.AbstractCollection, java.util.Collection
            public boolean remove(Object obj) {
                return obj != null && c.this.d(s.F(k6i.c(obj)));
            }

            @Override // com.google.common.collect.s.q, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                return c.this.d(s.F(k6i.d(collection)));
            }

            @Override // com.google.common.collect.s.q, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                return c.this.d(s.F(k6i.f(k6i.d(collection))));
            }
        }

        public c(C c) {
            this.d = (C) c6i.o(c);
        }

        @Override // com.google.common.collect.s.r
        public Set<Map.Entry<R, V>> a() {
            return new a();
        }

        @Override // com.google.common.collect.s.r
        /* JADX INFO: renamed from: b */
        public Set<R> j() {
            return new C0237c();
        }

        @Override // com.google.common.collect.s.r
        public Collection<V> c() {
            return new d();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return p0.this.contains(obj, this.d);
        }

        public boolean d(h6i<? super Map.Entry<R, V>> h6iVar) {
            Iterator<Map.Entry<R, Map<C, V>>> it = p0.this.backingMap.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<R, Map<C, V>> next = it.next();
                Map<C, V> value = next.getValue();
                V v = value.get(this.d);
                if (v != null && h6iVar.apply(s.i(next.getKey(), v))) {
                    value.remove(this.d);
                    if (value.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            return (V) p0.this.get(obj, this.d);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(R r2, V v) {
            return (V) p0.this.put(r2, this.d, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            return (V) p0.this.remove(obj, this.d);
        }
    }

    public class d extends b10<C> {
        public final Map<C, V> c;
        public final Iterator<Map<C, V>> d;
        public Iterator<Map.Entry<C, V>> e;

        public d() {
            this.c = p0.this.factory.get();
            this.d = p0.this.backingMap.values().iterator();
            this.e = epd.h();
        }

        @Override // defpackage.b10
        public C a() {
            while (true) {
                if (this.e.hasNext()) {
                    Map.Entry<C, V> next = this.e.next();
                    if (!this.c.containsKey(next.getKey())) {
                        this.c.put(next.getKey(), next.getValue());
                        return next.getKey();
                    }
                } else {
                    if (!this.d.hasNext()) {
                        return b();
                    }
                    this.e = this.d.next().entrySet().iterator();
                }
            }
        }
    }

    public class e extends p0<R, C, V>.i<C> {
        public e() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return p0.this.containsColumn(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<C> iterator() {
            return p0.this.createColumnKeyIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            boolean z = false;
            if (obj == null) {
                return false;
            }
            Iterator<Map<C, V>> it = p0.this.backingMap.values().iterator();
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

        @Override // com.google.common.collect.i0.b, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            c6i.o(collection);
            Iterator<Map<C, V>> it = p0.this.backingMap.values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map<C, V> next = it.next();
                if (epd.r(next.keySet().iterator(), collection)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.i0.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            c6i.o(collection);
            Iterator<Map<C, V>> it = p0.this.backingMap.values().iterator();
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
        public int size() {
            return epd.u(iterator());
        }
    }

    public class f extends s.r<C, Map<R, V>> {

        public class a extends p0<R, C, V>.i<Map.Entry<C, Map<R, V>>> {

            /* JADX INFO: renamed from: com.google.common.collect.p0$f$a$a, reason: collision with other inner class name */
            public class C0238a implements dua<C, Map<R, V>> {
                public C0238a() {
                }

                @Override // defpackage.dua
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Map<R, V> apply(C c) {
                    return p0.this.column(c);
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
                if (!p0.this.containsColumn(entry.getKey())) {
                    return false;
                }
                Map<R, V> map = f.this.get(entry.getKey());
                Objects.requireNonNull(map);
                return map.equals(entry.getValue());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<C, Map<R, V>>> iterator() {
                return s.c(p0.this.columnKeySet(), new C0238a());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj) || !(obj instanceof Map.Entry)) {
                    return false;
                }
                p0.this.removeColumn(((Map.Entry) obj).getKey());
                return true;
            }

            @Override // com.google.common.collect.i0.b, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                c6i.o(collection);
                return i0.h(this, collection.iterator());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.i0.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                c6i.o(collection);
                boolean z = false;
                for (Object obj : xhe.i(p0.this.columnKeySet().iterator())) {
                    if (!collection.contains(s.i(obj, p0.this.column(obj)))) {
                        p0.this.removeColumn(obj);
                        z = true;
                    }
                }
                return z;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return p0.this.columnKeySet().size();
            }
        }

        public class b extends s.q<C, Map<R, V>> {
            public b() {
                super(f.this);
            }

            @Override // com.google.common.collect.s.q, java.util.AbstractCollection, java.util.Collection
            public boolean remove(Object obj) {
                for (Map.Entry<C, Map<R, V>> entry : f.this.entrySet()) {
                    if (entry.getValue().equals(obj)) {
                        p0.this.removeColumn(entry.getKey());
                        return true;
                    }
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.s.q, java.util.AbstractCollection, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                c6i.o(collection);
                boolean z = false;
                for (Object obj : xhe.i(p0.this.columnKeySet().iterator())) {
                    if (collection.contains(p0.this.column(obj))) {
                        p0.this.removeColumn(obj);
                        z = true;
                    }
                }
                return z;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.s.q, java.util.AbstractCollection, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                c6i.o(collection);
                boolean z = false;
                for (Object obj : xhe.i(p0.this.columnKeySet().iterator())) {
                    if (!collection.contains(p0.this.column(obj))) {
                        p0.this.removeColumn(obj);
                        z = true;
                    }
                }
                return z;
            }
        }

        public f() {
        }

        @Override // com.google.common.collect.s.r
        public Set<Map.Entry<C, Map<R, V>>> a() {
            return new a();
        }

        @Override // com.google.common.collect.s.r
        public Collection<Map<R, V>> c() {
            return new b();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return p0.this.containsColumn(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map<R, V> get(Object obj) {
            if (!p0.this.containsColumn(obj)) {
                return null;
            }
            p0 p0Var = p0.this;
            Objects.requireNonNull(obj);
            return p0Var.column(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map<R, V> remove(Object obj) {
            if (p0.this.containsColumn(obj)) {
                return p0.this.removeColumn(obj);
            }
            return null;
        }

        @Override // com.google.common.collect.s.r, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet */
        public Set<C> l() {
            return p0.this.columnKeySet();
        }
    }

    public class g extends s.l<C, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final R f9217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<C, V> f9218b;

        public class a implements Iterator<Map.Entry<C, V>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Iterator f9219a;

            public a(Iterator it) {
                this.f9219a = it;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<C, V> next() {
                return g.this.f((Map.Entry) this.f9219a.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f9219a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f9219a.remove();
                g.this.c();
            }
        }

        public class b extends s1a<C, V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Map.Entry f9221a;

            public b(g gVar, Map.Entry entry) {
                this.f9221a = entry;
            }

            @Override // defpackage.s1a, java.util.Map.Entry
            public boolean equals(Object obj) {
                return standardEquals(obj);
            }

            @Override // defpackage.t1a
            /* JADX INFO: renamed from: f */
            public Map.Entry<C, V> delegate() {
                return this.f9221a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.s1a, java.util.Map.Entry
            public V setValue(V v) {
                return (V) super.setValue(c6i.o(v));
            }
        }

        public g(R r2) {
            this.f9217a = (R) c6i.o(r2);
        }

        @Override // com.google.common.collect.s.l
        public Iterator<Map.Entry<C, V>> a() {
            d();
            Map<C, V> map = this.f9218b;
            return map == null ? epd.j() : new a(map.entrySet().iterator());
        }

        public Map<C, V> b() {
            return p0.this.backingMap.get(this.f9217a);
        }

        public void c() {
            d();
            Map<C, V> map = this.f9218b;
            if (map == null || !map.isEmpty()) {
                return;
            }
            p0.this.backingMap.remove(this.f9217a);
            this.f9218b = null;
        }

        @Override // com.google.common.collect.s.l, java.util.AbstractMap, java.util.Map
        public void clear() {
            d();
            Map<C, V> map = this.f9218b;
            if (map != null) {
                map.clear();
            }
            c();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            Map<C, V> map;
            d();
            return (obj == null || (map = this.f9218b) == null || !s.u(map, obj)) ? false : true;
        }

        public final void d() {
            Map<C, V> map = this.f9218b;
            if (map == null || (map.isEmpty() && p0.this.backingMap.containsKey(this.f9217a))) {
                this.f9218b = b();
            }
        }

        public Map.Entry<C, V> f(Map.Entry<C, V> entry) {
            return new b(this, entry);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            Map<C, V> map;
            d();
            if (obj == null || (map = this.f9218b) == null) {
                return null;
            }
            return (V) s.v(map, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(C c, V v) {
            c6i.o(c);
            c6i.o(v);
            Map<C, V> map = this.f9218b;
            return (map == null || map.isEmpty()) ? (V) p0.this.put(this.f9217a, c, v) : this.f9218b.put(c, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            d();
            Map<C, V> map = this.f9218b;
            if (map == null) {
                return null;
            }
            V v = (V) s.w(map, obj);
            c();
            return v;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            d();
            Map<C, V> map = this.f9218b;
            if (map == null) {
                return 0;
            }
            return map.size();
        }
    }

    public class h extends s.r<R, Map<C, V>> {

        public class a extends p0<R, C, V>.i<Map.Entry<R, Map<C, V>>> {

            /* JADX INFO: renamed from: com.google.common.collect.p0$h$a$a, reason: collision with other inner class name */
            public class C0239a implements dua<R, Map<C, V>> {
                public C0239a() {
                }

                @Override // defpackage.dua
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Map<C, V> apply(R r2) {
                    return p0.this.row(r2);
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
                return entry.getKey() != null && (entry.getValue() instanceof Map) && m44.c(p0.this.backingMap.entrySet(), entry);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<R, Map<C, V>>> iterator() {
                return s.c(p0.this.backingMap.keySet(), new C0239a());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return entry.getKey() != null && (entry.getValue() instanceof Map) && p0.this.backingMap.entrySet().remove(entry);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return p0.this.backingMap.size();
            }
        }

        public h() {
        }

        @Override // com.google.common.collect.s.r
        public Set<Map.Entry<R, Map<C, V>>> a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return p0.this.containsRow(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map<C, V> get(Object obj) {
            if (!p0.this.containsRow(obj)) {
                return null;
            }
            p0 p0Var = p0.this;
            Objects.requireNonNull(obj);
            return p0Var.row(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map<C, V> remove(Object obj) {
            if (obj == null) {
                return null;
            }
            return p0.this.backingMap.remove(obj);
        }
    }

    public abstract class i<T> extends i0.b<T> {
        public i() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            p0.this.backingMap.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return p0.this.backingMap.isEmpty();
        }
    }

    public p0(Map<R, Map<C, V>> map, spo<? extends Map<C, V>> spoVar) {
        this.backingMap = map;
        this.factory = spoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean containsMapping(Object obj, Object obj2, Object obj3) {
        return obj3 != null && obj3.equals(get(obj, obj2));
    }

    private Map<C, V> getOrCreate(R r2) {
        Map<C, V> map = this.backingMap.get(r2);
        if (map != null) {
            return map;
        }
        Map<C, V> map2 = this.factory.get();
        this.backingMap.put(r2, map2);
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<R, V> removeColumn(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<R, Map<C, V>>> it = this.backingMap.entrySet().iterator();
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
    public boolean removeMapping(Object obj, Object obj2, Object obj3) {
        if (!containsMapping(obj, obj2, obj3)) {
            return false;
        }
        remove(obj, obj2);
        return true;
    }

    @Override // com.google.common.collect.j
    public Iterator<q0.a<R, C, V>> cellIterator() {
        return new b();
    }

    @Override // com.google.common.collect.j, com.google.common.collect.q0
    public Set<q0.a<R, C, V>> cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.j
    public void clear() {
        this.backingMap.clear();
    }

    public Map<R, V> column(C c2) {
        return new c(c2);
    }

    @Override // com.google.common.collect.j, com.google.common.collect.q0
    public Set<C> columnKeySet() {
        Set<C> set = this.columnKeySet;
        if (set != null) {
            return set;
        }
        e eVar = new e();
        this.columnKeySet = eVar;
        return eVar;
    }

    @Override // com.google.common.collect.q0
    public Map<C, Map<R, V>> columnMap() {
        p0<R, C, V>.f fVar = this.columnMap;
        if (fVar != null) {
            return fVar;
        }
        p0<R, C, V>.f fVar2 = new f();
        this.columnMap = fVar2;
        return fVar2;
    }

    @Override // com.google.common.collect.j
    public boolean contains(Object obj, Object obj2) {
        return (obj == null || obj2 == null || !super.contains(obj, obj2)) ? false : true;
    }

    @Override // com.google.common.collect.j
    public boolean containsColumn(Object obj) {
        if (obj == null) {
            return false;
        }
        Iterator<Map<C, V>> it = this.backingMap.values().iterator();
        while (it.hasNext()) {
            if (s.u(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.j
    public boolean containsRow(Object obj) {
        return obj != null && s.u(this.backingMap, obj);
    }

    @Override // com.google.common.collect.j
    public boolean containsValue(Object obj) {
        return obj != null && super.containsValue(obj);
    }

    public Iterator<C> createColumnKeyIterator() {
        return new d();
    }

    public Map<R, Map<C, V>> createRowMap() {
        return new h();
    }

    @Override // com.google.common.collect.j
    public V get(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return null;
        }
        return (V) super.get(obj, obj2);
    }

    @Override // com.google.common.collect.j
    public boolean isEmpty() {
        return this.backingMap.isEmpty();
    }

    @Override // com.google.common.collect.j
    public V put(R r2, C c2, V v) {
        c6i.o(r2);
        c6i.o(c2);
        c6i.o(v);
        return getOrCreate(r2).put(c2, v);
    }

    @Override // com.google.common.collect.j
    public V remove(Object obj, Object obj2) {
        Map map;
        if (obj == null || obj2 == null || (map = (Map) s.v(this.backingMap, obj)) == null) {
            return null;
        }
        V v = (V) map.remove(obj2);
        if (map.isEmpty()) {
            this.backingMap.remove(obj);
        }
        return v;
    }

    @Override // com.google.common.collect.q0
    public Map<C, V> row(R r2) {
        return new g(r2);
    }

    @Override // com.google.common.collect.j, com.google.common.collect.q0
    public Set<R> rowKeySet() {
        return rowMap().keySet();
    }

    @Override // com.google.common.collect.q0
    public Map<R, Map<C, V>> rowMap() {
        Map<R, Map<C, V>> map = this.rowMap;
        if (map != null) {
            return map;
        }
        Map<R, Map<C, V>> mapCreateRowMap = createRowMap();
        this.rowMap = mapCreateRowMap;
        return mapCreateRowMap;
    }

    @Override // com.google.common.collect.q0
    public int size() {
        Iterator<Map<C, V>> it = this.backingMap.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    @Override // com.google.common.collect.j
    public Collection<V> values() {
        return super.values();
    }
}
