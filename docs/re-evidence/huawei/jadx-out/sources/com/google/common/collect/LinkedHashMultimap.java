package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import defpackage.alx;
import defpackage.aly;
import defpackage.amz;
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
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class LinkedHashMultimap<K, V> extends LinkedHashMultimapGwtSerializationDependencies<K, V> {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient b<K, V> f4410a;
    transient int e;

    interface ValueSetLink<K, V> {
        ValueSetLink<K, V> getPredecessorInValueSet();

        ValueSetLink<K, V> getSuccessorInValueSet();

        void setPredecessorInValueSet(ValueSetLink<K, V> valueSetLink);

        void setSuccessorInValueSet(ValueSetLink<K, V> valueSetLink);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsEntry(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsKey(@CheckForNull Object obj) {
        return super.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsValue(@CheckForNull Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Set get(@ParametricNullness Object obj) {
        return super.get(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ Multiset keys() {
        return super.keys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean put(@ParametricNullness Object obj, @ParametricNullness Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean putAll(Multimap multimap) {
        return super.putAll(multimap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean putAll(@ParametricNullness Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ Set removeAll(@CheckForNull Object obj) {
        return super.removeAll(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.AbstractMultimap
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void e(ValueSetLink<K, V> valueSetLink, ValueSetLink<K, V> valueSetLink2) {
        valueSetLink.setSuccessorInValueSet(valueSetLink2);
        valueSetLink2.setPredecessorInValueSet(valueSetLink);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void a(b<K, V> bVar, b<K, V> bVar2) {
        bVar.a(bVar2);
        bVar2.b(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void b(ValueSetLink<K, V> valueSetLink) {
        e(valueSetLink.getPredecessorInValueSet(), valueSetLink.getSuccessorInValueSet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void b(b<K, V> bVar) {
        a(bVar.d(), bVar.c());
    }

    static final class b<K, V> extends alx<K, V> implements ValueSetLink<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        b<K, V> f4412b;

        @CheckForNull
        private b<K, V> d;
        final int e;

        @CheckForNull
        private ValueSetLink<K, V> f;

        @CheckForNull
        private b<K, V> g;

        @CheckForNull
        private ValueSetLink<K, V> j;

        b(@ParametricNullness K k, @ParametricNullness V v, int i, @CheckForNull b<K, V> bVar) {
            super(k, v);
            this.e = i;
            this.f4412b = bVar;
        }

        static <K, V> b<K, V> e() {
            return new b<>(null, null, 0, null);
        }

        boolean e(@CheckForNull Object obj, int i) {
            return this.e == i && Objects.equal(getValue(), obj);
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public ValueSetLink<K, V> getPredecessorInValueSet() {
            return (ValueSetLink) java.util.Objects.requireNonNull(this.f);
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public ValueSetLink<K, V> getSuccessorInValueSet() {
            return (ValueSetLink) java.util.Objects.requireNonNull(this.j);
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public void setPredecessorInValueSet(ValueSetLink<K, V> valueSetLink) {
            this.f = valueSetLink;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public void setSuccessorInValueSet(ValueSetLink<K, V> valueSetLink) {
            this.j = valueSetLink;
        }

        public b<K, V> d() {
            return (b) java.util.Objects.requireNonNull(this.d);
        }

        public b<K, V> c() {
            return (b) java.util.Objects.requireNonNull(this.g);
        }

        public void a(b<K, V> bVar) {
            this.g = bVar;
        }

        public void b(b<K, V> bVar) {
            this.d = bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public Set<V> createCollection() {
        return amz.e(this.e);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    Collection<V> createCollection(@ParametricNullness K k) {
        return new e(k, this.e);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Set<V> replaceValues(@ParametricNullness K k, Iterable<? extends V> iterable) {
        return super.replaceValues((Object) k, (Iterable) iterable);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Set<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Set<K> keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Collection<V> values() {
        return super.values();
    }

    final class e extends Sets.ImprovedAbstractSet<V> implements ValueSetLink<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        b<K, V>[] f4414b;

        @ParametricNullness
        private final K e;
        private int f = 0;
        private int g = 0;
        private ValueSetLink<K, V> d = this;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ValueSetLink<K, V> f4413a = this;

        e(K k, int i) {
            this.e = k;
            this.f4414b = new b[aly.a(i, 1.0d)];
        }

        private int e() {
            return this.f4414b.length - 1;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public ValueSetLink<K, V> getPredecessorInValueSet() {
            return this.f4413a;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public ValueSetLink<K, V> getSuccessorInValueSet() {
            return this.d;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public void setPredecessorInValueSet(ValueSetLink<K, V> valueSetLink) {
            this.f4413a = valueSetLink;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        public void setSuccessorInValueSet(ValueSetLink<K, V> valueSetLink) {
            this.d = valueSetLink;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return new Iterator<V>() { // from class: com.google.common.collect.LinkedHashMultimap.e.3

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f4417b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                ValueSetLink<K, V> f4418c;

                @CheckForNull
                b<K, V> e;

                {
                    this.f4418c = e.this.d;
                    this.f4417b = e.this.g;
                }

                private void b() {
                    if (e.this.g != this.f4417b) {
                        throw new ConcurrentModificationException();
                    }
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    b();
                    return this.f4418c != e.this;
                }

                @Override // java.util.Iterator
                @ParametricNullness
                public V next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    b<K, V> bVar = (b) this.f4418c;
                    V value = bVar.getValue();
                    this.e = bVar;
                    this.f4418c = bVar.getSuccessorInValueSet();
                    return value;
                }

                @Override // java.util.Iterator
                public void remove() {
                    b();
                    Preconditions.checkState(this.e != null, "no calls to next() since the last call to remove()");
                    e.this.remove(this.e.getValue());
                    this.f4417b = e.this.g;
                    this.e = null;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            int iC = aly.c(obj);
            for (b<K, V> bVar = this.f4414b[e() & iC]; bVar != null; bVar = bVar.f4412b) {
                if (bVar.e(obj, iC)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(@ParametricNullness V v) {
            int iC = aly.c(v);
            int iE = e() & iC;
            b<K, V> bVar = this.f4414b[iE];
            for (b<K, V> bVar2 = bVar; bVar2 != null; bVar2 = bVar2.f4412b) {
                if (bVar2.e(v, iC)) {
                    return false;
                }
            }
            b<K, V> bVar3 = new b<>(this.e, v, iC, bVar);
            LinkedHashMultimap.e(this.f4413a, bVar3);
            LinkedHashMultimap.e(bVar3, this);
            LinkedHashMultimap.a(LinkedHashMultimap.this.f4410a.d(), bVar3);
            LinkedHashMultimap.a(bVar3, LinkedHashMultimap.this.f4410a);
            this.f4414b[iE] = bVar3;
            this.f++;
            this.g++;
            c();
            return true;
        }

        private void c() {
            if (aly.d(this.f, this.f4414b.length, 1.0d)) {
                int length = this.f4414b.length * 2;
                b<K, V>[] bVarArr = new b[length];
                this.f4414b = bVarArr;
                for (ValueSetLink<K, V> successorInValueSet = this.d; successorInValueSet != this; successorInValueSet = successorInValueSet.getSuccessorInValueSet()) {
                    b<K, V> bVar = (b) successorInValueSet;
                    int i = bVar.e & (length - 1);
                    bVar.f4412b = bVarArr[i];
                    bVarArr[i] = bVar;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            int iC = aly.c(obj);
            int iE = e() & iC;
            b<K, V> bVar = null;
            for (b<K, V> bVar2 = this.f4414b[iE]; bVar2 != null; bVar2 = bVar2.f4412b) {
                if (bVar2.e(obj, iC)) {
                    if (bVar == null) {
                        this.f4414b[iE] = bVar2.f4412b;
                    } else {
                        bVar.f4412b = bVar2.f4412b;
                    }
                    LinkedHashMultimap.b((ValueSetLink) bVar2);
                    LinkedHashMultimap.b((b) bVar2);
                    this.f--;
                    this.g++;
                    return true;
                }
                bVar = bVar2;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Arrays.fill(this.f4414b, (Object) null);
            this.f = 0;
            for (ValueSetLink<K, V> successorInValueSet = this.d; successorInValueSet != this; successorInValueSet = successorInValueSet.getSuccessorInValueSet()) {
                LinkedHashMultimap.b((b) successorInValueSet);
            }
            LinkedHashMultimap.e(this, this);
            this.g++;
        }
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
    Iterator<Map.Entry<K, V>> entryIterator() {
        return new Iterator<Map.Entry<K, V>>() { // from class: com.google.common.collect.LinkedHashMultimap.4
            b<K, V> d;

            @CheckForNull
            b<K, V> e;

            {
                this.d = LinkedHashMultimap.this.f4410a.c();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.d != LinkedHashMultimap.this.f4410a;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                b<K, V> bVar = this.d;
                this.e = bVar;
                this.d = bVar.c();
                return bVar;
            }

            @Override // java.util.Iterator
            public void remove() {
                Preconditions.checkState(this.e != null, "no calls to next() since the last call to remove()");
                LinkedHashMultimap.this.remove(this.e.getKey(), this.e.getValue());
                this.e = null;
            }
        };
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
    Iterator<V> valueIterator() {
        return Maps.b(entryIterator());
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public void clear() {
        super.clear();
        b<K, V> bVar = this.f4410a;
        a(bVar, bVar);
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

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        b<K, V> bVarE = b.e();
        this.f4410a = bVarE;
        a(bVarE, bVarE);
        this.e = 2;
        int i = objectInputStream.readInt();
        Map mapD = amz.d(12);
        for (int i2 = 0; i2 < i; i2++) {
            Object object = objectInputStream.readObject();
            mapD.put(object, createCollection(object));
        }
        int i3 = objectInputStream.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            ((Collection) java.util.Objects.requireNonNull((Collection) mapD.get(objectInputStream.readObject()))).add(objectInputStream.readObject());
        }
        setMap(mapD);
    }
}
