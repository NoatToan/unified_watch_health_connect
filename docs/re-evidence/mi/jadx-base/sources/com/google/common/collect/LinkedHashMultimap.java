package com.google.common.collect;

import defpackage.c6i;
import defpackage.d0i;
import defpackage.d44;
import defpackage.j4h;
import defpackage.nag;
import defpackage.qlb;
import defpackage.rge;
import defpackage.t6d;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class LinkedHashMultimap<K, V> extends rge<K, V> {
    private static final int DEFAULT_KEY_CAPACITY = 16;
    private static final int DEFAULT_VALUE_SET_CAPACITY = 2;
    static final double VALUE_SET_LOAD_FACTOR = 1.0d;
    private static final long serialVersionUID = 1;
    private transient b<K, V> multimapHeaderEntry;
    transient int valueSetCapacity;

    public class a implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b<K, V> f9086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b<K, V> f9087b;

        public a() {
            this.f9086a = LinkedHashMultimap.this.multimapHeaderEntry.b();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            b<K, V> bVar = this.f9086a;
            this.f9087b = bVar;
            this.f9086a = bVar.b();
            return bVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9086a != LinkedHashMultimap.this.multimapHeaderEntry;
        }

        @Override // java.util.Iterator
        public void remove() {
            c6i.u(this.f9087b != null, "no calls to next() since the last call to remove()");
            LinkedHashMultimap.this.remove(this.f9087b.getKey(), this.f9087b.getValue());
            this.f9087b = null;
        }
    }

    public static final class b<K, V> extends t6d<K, V> implements d<K, V> {
        public final int c;
        public b<K, V> d;
        public d<K, V> e;
        public d<K, V> f;
        public b<K, V> g;
        public b<K, V> h;

        public b(K k2, V v, int i, b<K, V> bVar) {
            super(k2, v);
            this.c = i;
            this.d = bVar;
        }

        public static <K, V> b<K, V> d() {
            return new b<>(null, null, 0, null);
        }

        public b<K, V> a() {
            b<K, V> bVar = this.g;
            Objects.requireNonNull(bVar);
            return bVar;
        }

        public b<K, V> b() {
            b<K, V> bVar = this.h;
            Objects.requireNonNull(bVar);
            return bVar;
        }

        public boolean c(Object obj, int i) {
            return this.c == i && j4h.a(getValue(), obj);
        }

        @Override // com.google.common.collect.LinkedHashMultimap.d
        public d<K, V> e() {
            d<K, V> dVar = this.e;
            Objects.requireNonNull(dVar);
            return dVar;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.d
        public void f(d<K, V> dVar) {
            this.f = dVar;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.d
        public void g(d<K, V> dVar) {
            this.e = dVar;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.d
        public d<K, V> h() {
            d<K, V> dVar = this.f;
            Objects.requireNonNull(dVar);
            return dVar;
        }

        public void i(b<K, V> bVar) {
            this.g = bVar;
        }

        public void j(b<K, V> bVar) {
            this.h = bVar;
        }
    }

    public final class c extends i0.b<V> implements d<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f9088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b<K, V>[] f9089b;
        public int c = 0;
        public int d = 0;
        public d<K, V> e = this;
        public d<K, V> f = this;

        public class a implements Iterator<V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public d<K, V> f9090a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public b<K, V> f9091b;
            public int c;

            public a() {
                this.f9090a = c.this.e;
                this.c = c.this.d;
            }

            public final void a() {
                if (c.this.d != this.c) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                a();
                return this.f9090a != c.this;
            }

            @Override // java.util.Iterator
            public V next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                b<K, V> bVar = (b) this.f9090a;
                V value = bVar.getValue();
                this.f9091b = bVar;
                this.f9090a = bVar.h();
                return value;
            }

            @Override // java.util.Iterator
            public void remove() {
                a();
                c6i.u(this.f9091b != null, "no calls to next() since the last call to remove()");
                c.this.remove(this.f9091b.getValue());
                this.c = c.this.d;
                this.f9091b = null;
            }
        }

        public c(K k2, int i) {
            this.f9088a = k2;
            this.f9089b = new b[qlb.a(i, 1.0d)];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(V v) {
            int iD = qlb.d(v);
            int iK = k() & iD;
            b<K, V> bVar = this.f9089b[iK];
            for (b<K, V> bVar2 = bVar; bVar2 != null; bVar2 = bVar2.d) {
                if (bVar2.c(v, iD)) {
                    return false;
                }
            }
            b<K, V> bVar3 = new b<>(this.f9088a, v, iD, bVar);
            LinkedHashMultimap.succeedsInValueSet(this.f, bVar3);
            LinkedHashMultimap.succeedsInValueSet(bVar3, this);
            LinkedHashMultimap.succeedsInMultimap(LinkedHashMultimap.this.multimapHeaderEntry.a(), bVar3);
            LinkedHashMultimap.succeedsInMultimap(bVar3, LinkedHashMultimap.this.multimapHeaderEntry);
            this.f9089b[iK] = bVar3;
            this.c++;
            this.d++;
            l();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Arrays.fill(this.f9089b, (Object) null);
            this.c = 0;
            for (d<K, V> dVarH = this.e; dVarH != this; dVarH = dVarH.h()) {
                LinkedHashMultimap.deleteFromMultimap((b) dVarH);
            }
            LinkedHashMultimap.succeedsInValueSet(this, this);
            this.d++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            int iD = qlb.d(obj);
            for (b<K, V> bVar = this.f9089b[k() & iD]; bVar != null; bVar = bVar.d) {
                if (bVar.c(obj, iD)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.d
        public d<K, V> e() {
            return this.f;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.d
        public void f(d<K, V> dVar) {
            this.e = dVar;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.d
        public void g(d<K, V> dVar) {
            this.f = dVar;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.d
        public d<K, V> h() {
            return this.e;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return new a();
        }

        public final int k() {
            return this.f9089b.length - 1;
        }

        public final void l() {
            if (qlb.b(this.c, this.f9089b.length, 1.0d)) {
                int length = this.f9089b.length * 2;
                b<K, V>[] bVarArr = new b[length];
                this.f9089b = bVarArr;
                int i = length - 1;
                for (d<K, V> dVarH = this.e; dVarH != this; dVarH = dVarH.h()) {
                    b<K, V> bVar = (b) dVarH;
                    int i2 = bVar.c & i;
                    bVar.d = bVarArr[i2];
                    bVarArr[i2] = bVar;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iD = qlb.d(obj);
            int iK = k() & iD;
            b<K, V> bVar = null;
            for (b<K, V> bVar2 = this.f9089b[iK]; bVar2 != null; bVar2 = bVar2.d) {
                if (bVar2.c(obj, iD)) {
                    if (bVar == null) {
                        this.f9089b[iK] = bVar2.d;
                    } else {
                        bVar.d = bVar2.d;
                    }
                    LinkedHashMultimap.deleteFromValueSet(bVar2);
                    LinkedHashMultimap.deleteFromMultimap(bVar2);
                    this.c--;
                    this.d++;
                    return true;
                }
                bVar = bVar2;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.c;
        }
    }

    public interface d<K, V> {
        d<K, V> e();

        void f(d<K, V> dVar);

        void g(d<K, V> dVar);

        d<K, V> h();
    }

    private LinkedHashMultimap(int i, int i2) {
        super(d0i.e(i));
        this.valueSetCapacity = 2;
        d44.b(i2, "expectedValuesPerKey");
        this.valueSetCapacity = i2;
        b<K, V> bVarD = b.d();
        this.multimapHeaderEntry = bVarD;
        succeedsInMultimap(bVarD, bVarD);
    }

    public static <K, V> LinkedHashMultimap<K, V> create() {
        return new LinkedHashMultimap<>(16, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void deleteFromMultimap(b<K, V> bVar) {
        succeedsInMultimap(bVar.a(), bVar.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void deleteFromValueSet(d<K, V> dVar) {
        succeedsInValueSet(dVar.e(), dVar.h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        b<K, V> bVarD = b.d();
        this.multimapHeaderEntry = bVarD;
        succeedsInMultimap(bVarD, bVarD);
        this.valueSetCapacity = 2;
        int i = objectInputStream.readInt();
        Map mapE = d0i.e(12);
        for (int i2 = 0; i2 < i; i2++) {
            Object object = objectInputStream.readObject();
            mapE.put(object, createCollection(object));
        }
        int i3 = objectInputStream.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            Object object2 = objectInputStream.readObject();
            Object object3 = objectInputStream.readObject();
            Collection collection = (Collection) mapE.get(object2);
            Objects.requireNonNull(collection);
            collection.add(object3);
        }
        setMap(mapE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void succeedsInMultimap(b<K, V> bVar, b<K, V> bVar2) {
        bVar.j(bVar2);
        bVar2.i(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void succeedsInValueSet(d<K, V> dVar, d<K, V> dVar2) {
        dVar.f(dVar2);
        dVar2.g(dVar);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(keySet().size());
        Iterator<K> it = keySet().iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
        objectOutputStream.writeInt(size());
        for (Map.Entry<K, V> entry : entries()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // com.google.common.collect.g, com.google.common.collect.d, defpackage.nag
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.b, defpackage.nag
    public void clear() {
        super.clear();
        b<K, V> bVar = this.multimapHeaderEntry;
        succeedsInMultimap(bVar, bVar);
    }

    @Override // com.google.common.collect.d, defpackage.nag
    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.b, defpackage.nag
    public /* bridge */ /* synthetic */ boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // com.google.common.collect.d
    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.b, com.google.common.collect.d
    public Iterator<Map.Entry<K, V>> entryIterator() {
        return new a();
    }

    @Override // com.google.common.collect.g, com.google.common.collect.d
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.g, com.google.common.collect.b, defpackage.nag
    public /* bridge */ /* synthetic */ Set get(Object obj) {
        return super.get(obj);
    }

    @Override // com.google.common.collect.d
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.d, defpackage.nag
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.d, defpackage.nag
    public Set<K> keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.d
    public /* bridge */ /* synthetic */ u keys() {
        return super.keys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.g, com.google.common.collect.b, com.google.common.collect.d, defpackage.nag
    public /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.google.common.collect.d
    public /* bridge */ /* synthetic */ boolean putAll(nag nagVar) {
        return super.putAll(nagVar);
    }

    @Override // com.google.common.collect.d, defpackage.nag
    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.g, com.google.common.collect.b, defpackage.nag
    public /* bridge */ /* synthetic */ Set removeAll(Object obj) {
        return super.removeAll(obj);
    }

    @Override // com.google.common.collect.b, defpackage.nag
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.d
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.b, com.google.common.collect.d
    public Iterator<V> valueIterator() {
        return s.D(entryIterator());
    }

    @Override // com.google.common.collect.b, com.google.common.collect.d, defpackage.nag
    public Collection<V> values() {
        return super.values();
    }

    public static <K, V> LinkedHashMultimap<K, V> create(int i, int i2) {
        return new LinkedHashMultimap<>(s.d(i), s.d(i2));
    }

    @Override // com.google.common.collect.g, com.google.common.collect.b
    public Set<V> createCollection() {
        return d0i.f(this.valueSetCapacity);
    }

    @Override // com.google.common.collect.g, com.google.common.collect.b, com.google.common.collect.d, defpackage.nag
    public Set<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.d
    public /* bridge */ /* synthetic */ boolean putAll(Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    @Override // com.google.common.collect.g, com.google.common.collect.b, com.google.common.collect.d
    public Set<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        return super.replaceValues((Object) k2, (Iterable) iterable);
    }

    @Override // com.google.common.collect.b
    public Collection<V> createCollection(K k2) {
        return new c(k2, this.valueSetCapacity);
    }

    public static <K, V> LinkedHashMultimap<K, V> create(nag<? extends K, ? extends V> nagVar) {
        LinkedHashMultimap<K, V> linkedHashMultimapCreate = create(nagVar.keySet().size(), 2);
        linkedHashMultimapCreate.putAll(nagVar);
        return linkedHashMultimapCreate;
    }
}
