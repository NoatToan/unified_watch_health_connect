package com.google.common.collect;

import defpackage.f98;
import defpackage.nag;
import defpackage.uaq;
import defpackage.wge;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements wge<K, V> {
    private static final long serialVersionUID = 0;
    private transient ImmutableListMultimap<V, K> inverse;

    public static final class a<K, V> extends ImmutableMultimap.c<K, V> {
        public ImmutableListMultimap<K, V> h() {
            return (ImmutableListMultimap) super.a();
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

        public a<K, V> m(K k2, V... vArr) {
            super.g(k2, vArr);
            return this;
        }
    }

    public ImmutableListMultimap(ImmutableMap<K, ImmutableList<V>> immutableMap, int i) {
        super(immutableMap, i);
    }

    public static <K, V> a<K, V> builder() {
        return new a<>();
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(nag<? extends K, ? extends V> nagVar) {
        if (nagVar.isEmpty()) {
            return of();
        }
        if (nagVar instanceof ImmutableListMultimap) {
            ImmutableListMultimap<K, V> immutableListMultimap = (ImmutableListMultimap) nagVar;
            if (!immutableListMultimap.isPartialView()) {
                return immutableListMultimap;
            }
        }
        return fromMapEntries(nagVar.asMap().entrySet(), null);
    }

    public static <K, V> ImmutableListMultimap<K, V> fromMapEntries(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        ImmutableMap.b bVar = new ImmutableMap.b(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            ImmutableList immutableListCopyOf = comparator == null ? ImmutableList.copyOf((Collection) value) : ImmutableList.sortedCopyOf(comparator, value);
            if (!immutableListCopyOf.isEmpty()) {
                bVar.g(key, immutableListCopyOf);
                size += immutableListCopyOf.size();
            }
        }
        return new ImmutableListMultimap<>(bVar.d(), size);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ImmutableListMultimap<V, K> invert() {
        a aVarBuilder = builder();
        uaq it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            aVarBuilder.c(entry.getValue(), entry.getKey());
        }
        ImmutableListMultimap<V, K> immutableListMultimapH = aVarBuilder.h();
        immutableListMultimapH.inverse = this;
        return immutableListMultimapH;
    }

    public static <K, V> ImmutableListMultimap<K, V> of() {
        return f98.f17548a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
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
            ImmutableList.a aVarBuilder = ImmutableList.builder();
            for (int i5 = 0; i5 < i4; i5++) {
                aVarBuilder.a(objectInputStream.readObject());
            }
            bVarBuilder.g(object, aVarBuilder.k());
            i2 += i4;
        }
        try {
            ImmutableMultimap.e.f9045a.b(this, bVarBuilder.d());
            ImmutableMultimap.e.f9046b.a(this, i2);
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        g0.j(this, objectOutputStream);
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k2, V v) {
        a aVarBuilder = builder();
        aVarBuilder.c(k2, v);
        return aVarBuilder.h();
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public ImmutableListMultimap<V, K> inverse() {
        ImmutableListMultimap<V, K> immutableListMultimap = this.inverse;
        if (immutableListMultimap != null) {
            return immutableListMultimap;
        }
        ImmutableListMultimap<V, K> immutableListMultimapInvert = invert();
        this.inverse = immutableListMultimapInvert;
        return immutableListMultimapInvert;
    }

    @Override // com.google.common.collect.ImmutableMultimap, defpackage.nag
    public ImmutableList<V> get(K k2) {
        ImmutableList<V> immutableList = (ImmutableList) this.map.get(k2);
        return immutableList == null ? ImmutableList.of() : immutableList;
    }

    @Override // com.google.common.collect.ImmutableMultimap, defpackage.nag
    @Deprecated
    public final ImmutableList<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.d
    @Deprecated
    public final ImmutableList<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k2, V v, K k3, V v2) {
        a aVarBuilder = builder();
        aVarBuilder.c(k2, v);
        aVarBuilder.c(k3, v2);
        return aVarBuilder.h();
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new a().k(iterable).h();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3) {
        a aVarBuilder = builder();
        aVarBuilder.c(k2, v);
        aVarBuilder.c(k3, v2);
        aVarBuilder.c(k4, v3);
        return aVarBuilder.h();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4) {
        a aVarBuilder = builder();
        aVarBuilder.c(k2, v);
        aVarBuilder.c(k3, v2);
        aVarBuilder.c(k4, v3);
        aVarBuilder.c(k5, v4);
        return aVarBuilder.h();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4, K k6, V v5) {
        a aVarBuilder = builder();
        aVarBuilder.c(k2, v);
        aVarBuilder.c(k3, v2);
        aVarBuilder.c(k4, v3);
        aVarBuilder.c(k5, v4);
        aVarBuilder.c(k6, v5);
        return aVarBuilder.h();
    }
}
