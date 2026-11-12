package com.google.common.collect;

import defpackage.c6i;
import defpackage.d44;
import defpackage.dua;
import defpackage.nag;
import defpackage.pyp;
import defpackage.spo;
import defpackage.wge;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class t {

    public static final class a<K, V> extends s.r<K, Collection<V>> {
        public final nag<K, V> d;

        /* JADX INFO: renamed from: com.google.common.collect.t$a$a, reason: collision with other inner class name */
        public class C0240a extends s.j<K, Collection<V>> {

            /* JADX INFO: renamed from: com.google.common.collect.t$a$a$a, reason: collision with other inner class name */
            public class C0241a implements dua<K, Collection<V>> {
                public C0241a() {
                }

                @Override // defpackage.dua
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Collection<V> apply(K k2) {
                    return a.this.d.get(k2);
                }
            }

            public C0240a() {
            }

            @Override // com.google.common.collect.s.j
            public Map<K, Collection<V>> i() {
                return a.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return s.c(a.this.d.keySet(), new C0241a());
            }

            @Override // com.google.common.collect.s.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                a.this.j(entry.getKey());
                return true;
            }
        }

        public a(nag<K, V> nagVar) {
            this.d = (nag) c6i.o(nagVar);
        }

        @Override // com.google.common.collect.s.r
        public Set<Map.Entry<K, Collection<V>>> a() {
            return new C0240a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.d.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.d.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            if (containsKey(obj)) {
                return this.d.get(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            if (containsKey(obj)) {
                return this.d.removeAll(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.d.isEmpty();
        }

        public void j(Object obj) {
            this.d.keySet().remove(obj);
        }

        @Override // com.google.common.collect.s.r, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet */
        public Set<K> l() {
            return this.d.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.d.keySet().size();
        }
    }

    public static class b<K, V> extends com.google.common.collect.a<K, V> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public transient spo<? extends List<V>> f9248a;

        public b(Map<K, Collection<V>> map, spo<? extends List<V>> spoVar) {
            super(map);
            this.f9248a = (spo) c6i.o(spoVar);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f9248a = (spo) objectInputStream.readObject();
            setMap((Map) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f9248a);
            objectOutputStream.writeObject(backingMap());
        }

        @Override // com.google.common.collect.b, com.google.common.collect.d
        public Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        @Override // com.google.common.collect.b, com.google.common.collect.d
        public Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        @Override // com.google.common.collect.a, com.google.common.collect.b
        public List<V> createCollection() {
            return this.f9248a.get();
        }
    }

    public static abstract class c<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return e().containsEntry(entry.getKey(), entry.getValue());
        }

        public abstract nag<K, V> e();

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return e().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return e().size();
        }
    }

    public static class d<K, V> extends e<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nag<K, V> f9249a;

        public class a extends pyp<Map.Entry<K, Collection<V>>, u.a<K>> {

            /* JADX INFO: renamed from: com.google.common.collect.t$d$a$a, reason: collision with other inner class name */
            public class C0242a extends v.b<K> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Map.Entry f9250a;

                public C0242a(a aVar, Map.Entry entry) {
                    this.f9250a = entry;
                }

                @Override // com.google.common.collect.u.a
                public int getCount() {
                    return ((Collection) this.f9250a.getValue()).size();
                }

                @Override // com.google.common.collect.u.a
                public K getElement() {
                    return (K) this.f9250a.getKey();
                }
            }

            public a(d dVar, Iterator it) {
                super(it);
            }

            @Override // defpackage.pyp
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public u.a<K> a(Map.Entry<K, Collection<V>> entry) {
                return new C0242a(this, entry);
            }
        }

        public d(nag<K, V> nagVar) {
            this.f9249a = nagVar;
        }

        @Override // com.google.common.collect.e, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f9249a.clear();
        }

        @Override // com.google.common.collect.e, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u
        public boolean contains(Object obj) {
            return this.f9249a.containsKey(obj);
        }

        @Override // com.google.common.collect.u
        public int count(Object obj) {
            Collection collection = (Collection) s.v(this.f9249a.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // com.google.common.collect.e
        public int distinctElements() {
            return this.f9249a.asMap().size();
        }

        @Override // com.google.common.collect.e
        public Iterator<K> elementIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.e, com.google.common.collect.u
        public Set<K> elementSet() {
            return this.f9249a.keySet();
        }

        @Override // com.google.common.collect.e
        public Iterator<u.a<K>> entryIterator() {
            return new a(this, this.f9249a.asMap().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return s.l(this.f9249a.entries().iterator());
        }

        @Override // com.google.common.collect.e, com.google.common.collect.u
        public int remove(Object obj, int i) {
            d44.b(i, "occurrences");
            if (i == 0) {
                return count(obj);
            }
            Collection collection = (Collection) s.v(this.f9249a.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i >= size) {
                collection.clear();
            } else {
                Iterator it = collection.iterator();
                for (int i2 = 0; i2 < i; i2++) {
                    it.next();
                    it.remove();
                }
            }
            return size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u
        public int size() {
            return this.f9249a.size();
        }
    }

    public static boolean a(nag<?, ?> nagVar, Object obj) {
        if (obj == nagVar) {
            return true;
        }
        if (obj instanceof nag) {
            return nagVar.asMap().equals(((nag) obj).asMap());
        }
        return false;
    }

    public static <K, V> wge<K, V> b(Map<K, Collection<V>> map, spo<? extends List<V>> spoVar) {
        return new b(map, spoVar);
    }
}
