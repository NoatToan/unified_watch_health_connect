package com.google.common.collect;

import defpackage.c6i;
import defpackage.d0i;
import defpackage.d8g;
import defpackage.g98;
import defpackage.ich;
import defpackage.nag;
import defpackage.uaq;
import defpackage.xyl;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class ImmutableSetMultimap<K, V> extends ImmutableMultimap<K, V> implements xyl<K, V> {
    private static final long serialVersionUID = 0;
    private final transient ImmutableSet<V> emptySet;
    private transient ImmutableSet<Map.Entry<K, V>> entries;
    private transient ImmutableSetMultimap<V, K> inverse;

    public static final class a<K, V> extends ImmutableMultimap.c<K, V> {
        @Override // com.google.common.collect.ImmutableMultimap.c
        public Collection<V> b() {
            return d0i.g();
        }

        public ImmutableSetMultimap<K, V> h() {
            Collection collectionEntrySet = this.f9042a.entrySet();
            Comparator<? super K> comparator = this.f9043b;
            if (comparator != null) {
                collectionEntrySet = ich.a(comparator).f().b(collectionEntrySet);
            }
            return ImmutableSetMultimap.fromMapEntries(collectionEntrySet, this.c);
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a<K, V> c(K k2, V v) {
            super.c(k2, v);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public a<K, V> d(Map.Entry<? extends K, ? extends V> entry) {
            super.d(entry);
            return this;
        }

        public a<K, V> k(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.e(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.c
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public a<K, V> f(K k2, Iterable<? extends V> iterable) {
            super.f(k2, iterable);
            return this;
        }
    }

    public static final class b<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final transient ImmutableSetMultimap<K, V> f9073a;

        public b(ImmutableSetMultimap<K, V> immutableSetMultimap) {
            this.f9073a = immutableSetMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f9073a.containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f9073a.size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public uaq<Map.Entry<K, V>> iterator() {
            return this.f9073a.entryIterator();
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g0.b<ImmutableSetMultimap> f9074a = g0.a(ImmutableSetMultimap.class, "emptySet");
    }

    public ImmutableSetMultimap(ImmutableMap<K, ImmutableSet<V>> immutableMap, int i, Comparator<? super V> comparator) {
        super(immutableMap, i);
        this.emptySet = emptySet(comparator);
    }

    public static <K, V> a<K, V> builder() {
        return new a<>();
    }

    public static <K, V> ImmutableSetMultimap<K, V> copyOf(nag<? extends K, ? extends V> nagVar) {
        return copyOf(nagVar, null);
    }

    private static <V> ImmutableSet<V> emptySet(Comparator<? super V> comparator) {
        return comparator == null ? ImmutableSet.of() : ImmutableSortedSet.emptySet(comparator);
    }

    public static <K, V> ImmutableSetMultimap<K, V> fromMapEntries(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        ImmutableMap.b bVar = new ImmutableMap.b(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            ImmutableSet immutableSetValueSet = valueSet(comparator, entry.getValue());
            if (!immutableSetValueSet.isEmpty()) {
                bVar.g(key, immutableSetValueSet);
                size += immutableSetValueSet.size();
            }
        }
        return new ImmutableSetMultimap<>(bVar.d(), size, comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ImmutableSetMultimap<V, K> invert() {
        a aVarBuilder = builder();
        uaq it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            aVarBuilder.c(entry.getValue(), entry.getKey());
        }
        ImmutableSetMultimap<V, K> immutableSetMultimapH = aVarBuilder.h();
        immutableSetMultimapH.inverse = this;
        return immutableSetMultimapH;
    }

    public static <K, V> ImmutableSetMultimap<K, V> of() {
        return g98.f18751a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Invalid key count ");
            sb.append(i);
            throw new InvalidObjectException(sb.toString());
        }
        ImmutableMap.b bVarBuilder = ImmutableMap.builder();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object object = objectInputStream.readObject();
            int i4 = objectInputStream.readInt();
            if (i4 <= 0) {
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("Invalid value count ");
                sb2.append(i4);
                throw new InvalidObjectException(sb2.toString());
            }
            ImmutableSet.a aVarValuesBuilder = valuesBuilder(comparator);
            for (int i5 = 0; i5 < i4; i5++) {
                aVarValuesBuilder.a(objectInputStream.readObject());
            }
            ImmutableSet immutableSetM = aVarValuesBuilder.m();
            if (immutableSetM.size() != i4) {
                String strValueOf = String.valueOf(object);
                StringBuilder sb3 = new StringBuilder(strValueOf.length() + 40);
                sb3.append("Duplicate key-value pairs exist for key ");
                sb3.append(strValueOf);
                throw new InvalidObjectException(sb3.toString());
            }
            bVarBuilder.g(object, immutableSetM);
            i2 += i4;
        }
        try {
            ImmutableMultimap.e.f9045a.b(this, bVarBuilder.d());
            ImmutableMultimap.e.f9046b.a(this, i2);
            c.f9074a.b(this, emptySet(comparator));
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private static <V> ImmutableSet<V> valueSet(Comparator<? super V> comparator, Collection<? extends V> collection) {
        return comparator == null ? ImmutableSet.copyOf((Collection) collection) : ImmutableSortedSet.copyOf((Comparator) comparator, (Collection) collection);
    }

    private static <V> ImmutableSet.a<V> valuesBuilder(Comparator<? super V> comparator) {
        return comparator == null ? new ImmutableSet.a<>() : new ImmutableSortedSet.a(comparator);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(valueComparator());
        g0.j(this, objectOutputStream);
    }

    public Comparator<? super V> valueComparator() {
        ImmutableSet<V> immutableSet = this.emptySet;
        if (immutableSet instanceof ImmutableSortedSet) {
            return ((ImmutableSortedSet) immutableSet).comparator();
        }
        return null;
    }

    public static <K, V> ImmutableSetMultimap<K, V> of(K k2, V v) {
        a aVarBuilder = builder();
        aVarBuilder.c(k2, v);
        return aVarBuilder.h();
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public ImmutableSetMultimap<V, K> inverse() {
        ImmutableSetMultimap<V, K> immutableSetMultimap = this.inverse;
        if (immutableSetMultimap != null) {
            return immutableSetMultimap;
        }
        ImmutableSetMultimap<V, K> immutableSetMultimapInvert = invert();
        this.inverse = immutableSetMultimapInvert;
        return immutableSetMultimapInvert;
    }

    private static <K, V> ImmutableSetMultimap<K, V> copyOf(nag<? extends K, ? extends V> nagVar, Comparator<? super V> comparator) {
        c6i.o(nagVar);
        if (nagVar.isEmpty() && comparator == null) {
            return of();
        }
        if (nagVar instanceof ImmutableSetMultimap) {
            ImmutableSetMultimap<K, V> immutableSetMultimap = (ImmutableSetMultimap) nagVar;
            if (!immutableSetMultimap.isPartialView()) {
                return immutableSetMultimap;
            }
        }
        return fromMapEntries(nagVar.asMap().entrySet(), comparator);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.d, defpackage.nag
    public ImmutableSet<Map.Entry<K, V>> entries() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.entries;
        if (immutableSet != null) {
            return immutableSet;
        }
        b bVar = new b(this);
        this.entries = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.ImmutableMultimap, defpackage.nag
    public ImmutableSet<V> get(K k2) {
        return (ImmutableSet) d8g.a((ImmutableSet) this.map.get(k2), this.emptySet);
    }

    @Override // com.google.common.collect.ImmutableMultimap, defpackage.nag
    @Deprecated
    public final ImmutableSet<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.d
    @Deprecated
    public final ImmutableSet<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> ImmutableSetMultimap<K, V> of(K k2, V v, K k3, V v2) {
        a aVarBuilder = builder();
        aVarBuilder.c(k2, v);
        aVarBuilder.c(k3, v2);
        return aVarBuilder.h();
    }

    public static <K, V> ImmutableSetMultimap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3) {
        a aVarBuilder = builder();
        aVarBuilder.c(k2, v);
        aVarBuilder.c(k3, v2);
        aVarBuilder.c(k4, v3);
        return aVarBuilder.h();
    }

    public static <K, V> ImmutableSetMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new a().k(iterable).h();
    }

    public static <K, V> ImmutableSetMultimap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4) {
        a aVarBuilder = builder();
        aVarBuilder.c(k2, v);
        aVarBuilder.c(k3, v2);
        aVarBuilder.c(k4, v3);
        aVarBuilder.c(k5, v4);
        return aVarBuilder.h();
    }

    public static <K, V> ImmutableSetMultimap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4, K k6, V v5) {
        a aVarBuilder = builder();
        aVarBuilder.c(k2, v);
        aVarBuilder.c(k3, v2);
        aVarBuilder.c(k4, v3);
        aVarBuilder.c(k5, v4);
        aVarBuilder.c(k6, v5);
        return aVarBuilder.h();
    }
}
