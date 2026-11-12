package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
public final class LinkedHashMultimap<K, V> extends p1<K, V> {
    private static final int j = 16;
    private static final int k = 2;

    @VisibleForTesting
    public static final double l = 1.0d;

    @GwtIncompatible
    private static final long serialVersionUID = 1;

    @VisibleForTesting
    public transient int h;
    private transient b<K, V> i;

    public class a implements Iterator<Map.Entry<K, V>> {
        public b<K, V> a;

        @NullableDecl
        public b<K, V> b;

        public a() {
            this.a = LinkedHashMultimap.this.i.h;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            b<K, V> bVar = this.a;
            this.b = bVar;
            this.a = bVar.h;
            return bVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a != LinkedHashMultimap.this.i;
        }

        @Override // java.util.Iterator
        public void remove() {
            u.e(this.b != null);
            LinkedHashMultimap.this.remove(this.b.getKey(), this.b.getValue());
            this.b = null;
        }
    }

    @VisibleForTesting
    public static final class b<K, V> extends d1<K, V> implements d<K, V> {
        public final int c;

        @NullableDecl
        public b<K, V> d;

        @NullableDecl
        public d<K, V> e;

        @NullableDecl
        public d<K, V> f;

        @NullableDecl
        public b<K, V> g;

        @NullableDecl
        public b<K, V> h;

        public b(@NullableDecl K k, @NullableDecl V v, int i, @NullableDecl b<K, V> bVar) {
            super(k, v);
            this.c = i;
            this.d = bVar;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.d
        public d<K, V> a() {
            return this.e;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.d
        public void b(d<K, V> dVar) {
            this.f = dVar;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.d
        public void c(d<K, V> dVar) {
            this.e = dVar;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.d
        public d<K, V> e() {
            return this.f;
        }

        public b<K, V> f() {
            return this.g;
        }

        public b<K, V> g() {
            return this.h;
        }

        public boolean h(@NullableDecl Object obj, int i) {
            return this.c == i && Objects.equal(getValue(), obj);
        }

        public void i(b<K, V> bVar) {
            this.g = bVar;
        }

        public void j(b<K, V> bVar) {
            this.h = bVar;
        }
    }

    @VisibleForTesting
    public final class c extends Sets.k<V> implements d<K, V> {
        private final K a;

        @VisibleForTesting
        public b<K, V>[] b;
        private int c = 0;
        private int d = 0;
        private d<K, V> e = this;
        private d<K, V> f = this;

        public class a implements Iterator<V> {
            public d<K, V> a;

            @NullableDecl
            public b<K, V> b;
            public int c;

            public a() {
                this.a = c.this.e;
                this.c = c.this.d;
            }

            private void a() {
                if (c.this.d != this.c) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                a();
                return this.a != c.this;
            }

            @Override // java.util.Iterator
            public V next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                b<K, V> bVar = (b) this.a;
                V value = bVar.getValue();
                this.b = bVar;
                this.a = bVar.e();
                return value;
            }

            @Override // java.util.Iterator
            public void remove() {
                a();
                u.e(this.b != null);
                c.this.remove(this.b.getValue());
                this.c = c.this.d;
                this.b = null;
            }
        }

        public c(K k, int i) {
            this.a = k;
            this.b = new b[b1.a(i, 1.0d)];
        }

        private int g() {
            return this.b.length - 1;
        }

        private void h() {
            if (b1.b(this.c, this.b.length, 1.0d)) {
                int length = this.b.length * 2;
                b<K, V>[] bVarArr = new b[length];
                this.b = bVarArr;
                int i = length - 1;
                for (d<K, V> dVarE = this.e; dVarE != this; dVarE = dVarE.e()) {
                    b<K, V> bVar = (b) dVarE;
                    int i2 = bVar.c & i;
                    bVar.d = bVarArr[i2];
                    bVarArr[i2] = bVar;
                }
            }
        }

        @Override // com.google.common.collect.LinkedHashMultimap.d
        public d<K, V> a() {
            return this.f;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(@NullableDecl V v) {
            int iD = b1.d(v);
            int iG = g() & iD;
            b<K, V> bVar = this.b[iG];
            for (b<K, V> bVar2 = bVar; bVar2 != null; bVar2 = bVar2.d) {
                if (bVar2.h(v, iD)) {
                    return false;
                }
            }
            b<K, V> bVar3 = new b<>(this.a, v, iD, bVar);
            LinkedHashMultimap.P(this.f, bVar3);
            LinkedHashMultimap.P(bVar3, this);
            LinkedHashMultimap.O(LinkedHashMultimap.this.i.f(), bVar3);
            LinkedHashMultimap.O(bVar3, LinkedHashMultimap.this.i);
            this.b[iG] = bVar3;
            this.c++;
            this.d++;
            h();
            return true;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.d
        public void b(d<K, V> dVar) {
            this.e = dVar;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.d
        public void c(d<K, V> dVar) {
            this.f = dVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Arrays.fill(this.b, (Object) null);
            this.c = 0;
            for (d<K, V> dVarE = this.e; dVarE != this; dVarE = dVarE.e()) {
                LinkedHashMultimap.M((b) dVarE);
            }
            LinkedHashMultimap.P(this, this);
            this.d++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            int iD = b1.d(obj);
            for (b<K, V> bVar = this.b[g() & iD]; bVar != null; bVar = bVar.d) {
                if (bVar.h(obj, iD)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.d
        public d<K, V> e() {
            return this.e;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        public boolean remove(@NullableDecl Object obj) {
            int iD = b1.d(obj);
            int iG = g() & iD;
            b<K, V> bVar = null;
            for (b<K, V> bVar2 = this.b[iG]; bVar2 != null; bVar2 = bVar2.d) {
                if (bVar2.h(obj, iD)) {
                    if (bVar == null) {
                        this.b[iG] = bVar2.d;
                    } else {
                        bVar.d = bVar2.d;
                    }
                    LinkedHashMultimap.N(bVar2);
                    LinkedHashMultimap.M(bVar2);
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
        d<K, V> a();

        void b(d<K, V> dVar);

        void c(d<K, V> dVar);

        d<K, V> e();
    }

    private LinkedHashMultimap(int i, int i2) {
        super(w1.e(i));
        this.h = 2;
        u.b(i2, "expectedValuesPerKey");
        this.h = i2;
        b<K, V> bVar = new b<>(null, null, 0, null);
        this.i = bVar;
        O(bVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void M(b<K, V> bVar) {
        O(bVar.f(), bVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void N(d<K, V> dVar) {
        P(dVar.a(), dVar.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void O(b<K, V> bVar, b<K, V> bVar2) {
        bVar.j(bVar2);
        bVar2.i(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void P(d<K, V> dVar, d<K, V> dVar2) {
        dVar.b(dVar2);
        dVar2.c(dVar);
    }

    public static <K, V> LinkedHashMultimap<K, V> create() {
        return new LinkedHashMultimap<>(16, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        b<K, V> bVar = new b<>(null, null, 0, null);
        this.i = bVar;
        O(bVar, bVar);
        this.h = 2;
        int i = objectInputStream.readInt();
        Map mapE = w1.e(12);
        for (int i2 = 0; i2 < i; i2++) {
            Object object = objectInputStream.readObject();
            mapE.put(object, u(object));
        }
        int i3 = objectInputStream.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            Object object2 = objectInputStream.readObject();
            ((Collection) mapE.get(object2)).add(objectInputStream.readObject());
        }
        B(mapE);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(keySet().size());
        Iterator<K> it2 = keySet().iterator();
        while (it2.hasNext()) {
            objectOutputStream.writeObject(it2.next());
        }
        objectOutputStream.writeInt(size());
        for (Map.Entry<K, V> entry : entries()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // com.google.common.collect.k, com.google.common.collect.d
    /* JADX INFO: renamed from: F */
    public Set<V> t() {
        return w1.f(this.h);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.g, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.d, com.google.common.collect.Multimap
    public void clear() {
        super.clear();
        b<K, V> bVar = this.i;
        O(bVar, bVar);
    }

    @Override // com.google.common.collect.g, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsEntry(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsKey(@NullableDecl Object obj) {
        return super.containsKey(obj);
    }

    @Override // com.google.common.collect.g, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsValue(@NullableDecl Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.g, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.k, com.google.common.collect.d, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Set get(@NullableDecl Object obj) {
        return super.get(obj);
    }

    @Override // com.google.common.collect.g, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.d, com.google.common.collect.g
    public Iterator<Map.Entry<K, V>> i() {
        return new a();
    }

    @Override // com.google.common.collect.g, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.d, com.google.common.collect.g
    public Iterator<V> j() {
        return Maps.Q(i());
    }

    @Override // com.google.common.collect.g, com.google.common.collect.Multimap
    public Set<K> keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.g, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Multiset keys() {
        return super.keys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.k, com.google.common.collect.d, com.google.common.collect.g, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean put(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.google.common.collect.g, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(Multimap multimap) {
        return super.putAll(multimap);
    }

    @Override // com.google.common.collect.g, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.d, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Set removeAll(@NullableDecl Object obj) {
        return super.removeAll(obj);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.g
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.d
    public Collection<V> u(K k2) {
        return new c(k2, this.h);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.g, com.google.common.collect.Multimap
    public Collection<V> values() {
        return super.values();
    }

    public static <K, V> LinkedHashMultimap<K, V> create(int i, int i2) {
        return new LinkedHashMultimap<>(Maps.k(i), Maps.k(i2));
    }

    @Override // com.google.common.collect.k, com.google.common.collect.d, com.google.common.collect.g, com.google.common.collect.Multimap
    public Set<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.g, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(@NullableDecl Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.d, com.google.common.collect.g, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public Set<V> replaceValues(@NullableDecl K k2, Iterable<? extends V> iterable) {
        return super.replaceValues((Object) k2, (Iterable) iterable);
    }

    public static <K, V> LinkedHashMultimap<K, V> create(Multimap<? extends K, ? extends V> multimap) {
        LinkedHashMultimap<K, V> linkedHashMultimapCreate = create(multimap.keySet().size(), 2);
        linkedHashMultimapCreate.putAll(multimap);
        return linkedHashMultimapCreate;
    }
}
