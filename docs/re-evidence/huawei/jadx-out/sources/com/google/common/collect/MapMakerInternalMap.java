package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.Preconditions;
import com.google.common.collect.MapMakerInternalMap.InternalEntry;
import com.google.common.collect.MapMakerInternalMap.Segment;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.concurrent.LazyInit;
import defpackage.ale;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
class MapMakerInternalMap<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    static final WeakValueReference<Object, Object, e> d = new WeakValueReference<Object, Object, e>() { // from class: com.google.common.collect.MapMakerInternalMap.4
        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        @CheckForNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e getEntry() {
            return null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public void clear() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public WeakValueReference<Object, Object, e> copyFor(ReferenceQueue<Object> referenceQueue, e eVar) {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        @CheckForNull
        public Object get() {
            return null;
        }
    };
    private static final long serialVersionUID = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final transient InternalEntryHelper<K, V, E, S> f4422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Equivalence<Object> f4423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f4424c;

    @CheckForNull
    @LazyInit
    transient Set<Map.Entry<K, V>> e;
    final transient int f;
    final transient int g;

    @CheckForNull
    @LazyInit
    transient Set<K> h;
    final transient Segment<K, V, E, S>[] i;

    @CheckForNull
    @LazyInit
    transient Collection<V> j;

    interface InternalEntry<K, V, E extends InternalEntry<K, V, E>> {
        int getHash();

        K getKey();

        E getNext();

        V getValue();
    }

    interface InternalEntryHelper<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> {
        E copy(S s, E e, @CheckForNull E e2);

        Strength keyStrength();

        E newEntry(S s, K k, int i, @CheckForNull E e);

        S newSegment(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i);

        void setValue(S s, E e, V v);

        Strength valueStrength();
    }

    enum Strength {
        STRONG { // from class: com.google.common.collect.MapMakerInternalMap.Strength.1
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            Equivalence<Object> defaultEquivalence() {
                return Equivalence.equals();
            }
        },
        WEAK { // from class: com.google.common.collect.MapMakerInternalMap.Strength.2
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            Equivalence<Object> defaultEquivalence() {
                return Equivalence.identity();
            }
        };

        abstract Equivalence<Object> defaultEquivalence();
    }

    interface StrongValueEntry<K, V, E extends InternalEntry<K, V, E>> extends InternalEntry<K, V, E> {
    }

    interface WeakValueEntry<K, V, E extends InternalEntry<K, V, E>> extends InternalEntry<K, V, E> {
        WeakValueReference<K, V, E> getValueReference();
    }

    interface WeakValueReference<K, V, E extends InternalEntry<K, V, E>> {
        void clear();

        WeakValueReference<K, V, E> copyFor(ReferenceQueue<V> referenceQueue, E e);

        @CheckForNull
        V get();

        E getEntry();
    }

    static int b(int i2) {
        int i3 = i2 + ((i2 << 15) ^ (-12931));
        int i4 = i3 ^ (i3 >>> 10);
        int i5 = i4 + (i4 << 3);
        int i6 = i5 ^ (i5 >>> 6);
        int i7 = i6 + (i6 << 2) + (i6 << 14);
        return i7 ^ (i7 >>> 16);
    }

    private MapMakerInternalMap(MapMaker mapMaker, InternalEntryHelper<K, V, E, S> internalEntryHelper) {
        this.f4424c = Math.min(mapMaker.b(), 65536);
        this.f4423b = mapMaker.a();
        this.f4422a = internalEntryHelper;
        int iMin = Math.min(mapMaker.c(), 1073741824);
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        int i5 = 1;
        while (i5 < this.f4424c) {
            i4++;
            i5 <<= 1;
        }
        this.f = 32 - i4;
        this.g = i5 - 1;
        this.i = c(i5);
        int i6 = iMin / i5;
        while (i3 < (i5 * i6 < iMin ? i6 + 1 : i6)) {
            i3 <<= 1;
        }
        while (true) {
            Segment<K, V, E, S>[] segmentArr = this.i;
            if (i2 >= segmentArr.length) {
                return;
            }
            segmentArr[i2] = d(i3);
            i2++;
        }
    }

    static <K, V> MapMakerInternalMap<K, V, ? extends InternalEntry<K, V, ?>, ?> c(MapMaker mapMaker) {
        if (mapMaker.d() == Strength.STRONG && mapMaker.e() == Strength.STRONG) {
            return new MapMakerInternalMap<>(mapMaker, h.e.e());
        }
        if (mapMaker.d() == Strength.STRONG && mapMaker.e() == Strength.WEAK) {
            return new MapMakerInternalMap<>(mapMaker, g.d.b());
        }
        if (mapMaker.d() == Strength.WEAK && mapMaker.e() == Strength.STRONG) {
            return new MapMakerInternalMap<>(mapMaker, l.d.c());
        }
        if (mapMaker.d() == Strength.WEAK && mapMaker.e() == Strength.WEAK) {
            return new MapMakerInternalMap<>(mapMaker, k.d.e());
        }
        throw new AssertionError();
    }

    static abstract class AbstractStrongKeyEntry<K, V, E extends InternalEntry<K, V, E>> implements InternalEntry<K, V, E> {
        final int hash;
        final K key;

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        @CheckForNull
        public E getNext() {
            return null;
        }

        AbstractStrongKeyEntry(K k, int i) {
            this.key = k;
            this.hash = i;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final K getKey() {
            return this.key;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final int getHash() {
            return this.hash;
        }
    }

    static <K, V, E extends InternalEntry<K, V, E>> WeakValueReference<K, V, E> e() {
        return (WeakValueReference<K, V, E>) d;
    }

    static class h<K, V> extends AbstractStrongKeyEntry<K, V, h<K, V>> implements StrongValueEntry<K, V, h<K, V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        private volatile V f4430c;

        private h(K k, int i) {
            super(k, i);
            this.f4430c = null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        @CheckForNull
        public final V getValue() {
            return this.f4430c;
        }

        static final class a<K, V> extends h<K, V> {
            private final h<K, V> e;

            a(K k, int i, h<K, V> hVar) {
                super(k, i);
                this.e = hVar;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public h<K, V> getNext() {
                return this.e;
            }
        }

        static final class e<K, V> implements InternalEntryHelper<K, V, h<K, V>, f<K, V>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final e<?, ?> f4431b = new e<>();

            e() {
            }

            static <K, V> e<K, V> e() {
                return (e<K, V>) f4431b;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength keyStrength() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength valueStrength() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public f<K, V> newSegment(MapMakerInternalMap<K, V, h<K, V>, f<K, V>> mapMakerInternalMap, int i) {
                return new f<>(mapMakerInternalMap, i);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public h<K, V> copy(f<K, V> fVar, h<K, V> hVar, @CheckForNull h<K, V> hVar2) {
                h<K, V> hVarNewEntry = newEntry(fVar, hVar.key, hVar.hash, hVar2);
                ((h) hVarNewEntry).f4430c = ((h) hVar).f4430c;
                return hVarNewEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void setValue(f<K, V> fVar, h<K, V> hVar, V v) {
                ((h) hVar).f4430c = v;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public h<K, V> newEntry(f<K, V> fVar, K k, int i, @CheckForNull h<K, V> hVar) {
                if (hVar == null) {
                    return new h<>(k, i);
                }
                return new a(k, i, hVar);
            }
        }
    }

    static class g<K, V> extends AbstractStrongKeyEntry<K, V, g<K, V>> implements WeakValueEntry<K, V, g<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile WeakValueReference<K, V, g<K, V>> f4427a;

        private g(K k, int i) {
            super(k, i);
            this.f4427a = MapMakerInternalMap.e();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        @CheckForNull
        public final V getValue() {
            return this.f4427a.get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public final WeakValueReference<K, V, g<K, V>> getValueReference() {
            return this.f4427a;
        }

        static final class e<K, V> extends g<K, V> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final g<K, V> f4429c;

            e(K k, int i, g<K, V> gVar) {
                super(k, i);
                this.f4429c = gVar;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractStrongKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g<K, V> getNext() {
                return this.f4429c;
            }
        }

        static final class d<K, V> implements InternalEntryHelper<K, V, g<K, V>, i<K, V>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final d<?, ?> f4428c = new d<>();

            d() {
            }

            static <K, V> d<K, V> b() {
                return (d<K, V>) f4428c;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength keyStrength() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength valueStrength() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public i<K, V> newSegment(MapMakerInternalMap<K, V, g<K, V>, i<K, V>> mapMakerInternalMap, int i) {
                return new i<>(mapMakerInternalMap, i);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            @CheckForNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g<K, V> copy(i<K, V> iVar, g<K, V> gVar, @CheckForNull g<K, V> gVar2) {
                if (Segment.isCollected(gVar)) {
                    return null;
                }
                g<K, V> gVarNewEntry = newEntry(iVar, gVar.key, gVar.hash, gVar2);
                ((g) gVarNewEntry).f4427a = ((g) gVar).f4427a.copyFor(((i) iVar).e, gVarNewEntry);
                return gVarNewEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void setValue(i<K, V> iVar, g<K, V> gVar, V v) {
                WeakValueReference weakValueReference = ((g) gVar).f4427a;
                ((g) gVar).f4427a = new t(((i) iVar).e, v, gVar);
                weakValueReference.clear();
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g<K, V> newEntry(i<K, V> iVar, K k, int i, @CheckForNull g<K, V> gVar) {
                if (gVar == null) {
                    return new g<>(k, i);
                }
                return new e(k, i, gVar);
            }
        }
    }

    static abstract class AbstractWeakKeyEntry<K, V, E extends InternalEntry<K, V, E>> extends WeakReference<K> implements InternalEntry<K, V, E> {
        final int hash;

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        @CheckForNull
        public E getNext() {
            return null;
        }

        AbstractWeakKeyEntry(ReferenceQueue<K> referenceQueue, K k, int i) {
            super(k, referenceQueue);
            this.hash = i;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final K getKey() {
            return (K) get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final int getHash() {
            return this.hash;
        }
    }

    static class l<K, V> extends AbstractWeakKeyEntry<K, V, l<K, V>> implements StrongValueEntry<K, V, l<K, V>> {

        @CheckForNull
        private volatile V d;

        private l(ReferenceQueue<K> referenceQueue, K k, int i) {
            super(referenceQueue, k, i);
            this.d = null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        @CheckForNull
        public final V getValue() {
            return this.d;
        }

        static final class c<K, V> extends l<K, V> {
            private final l<K, V> d;

            private c(ReferenceQueue<K> referenceQueue, K k, int i, l<K, V> lVar) {
                super(referenceQueue, k, i);
                this.d = lVar;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public l<K, V> getNext() {
                return this.d;
            }
        }

        static final class d<K, V> implements InternalEntryHelper<K, V, l<K, V>, o<K, V>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final d<?, ?> f4434b = new d<>();

            d() {
            }

            static <K, V> d<K, V> c() {
                return (d<K, V>) f4434b;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength keyStrength() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength valueStrength() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public o<K, V> newSegment(MapMakerInternalMap<K, V, l<K, V>, o<K, V>> mapMakerInternalMap, int i) {
                return new o<>(mapMakerInternalMap, i);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            @CheckForNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public l<K, V> copy(o<K, V> oVar, l<K, V> lVar, @CheckForNull l<K, V> lVar2) {
                K key = lVar.getKey();
                if (key == null) {
                    return null;
                }
                l<K, V> lVarNewEntry = newEntry(oVar, key, lVar.hash, lVar2);
                ((l) lVarNewEntry).d = ((l) lVar).d;
                return lVarNewEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void setValue(o<K, V> oVar, l<K, V> lVar, V v) {
                ((l) lVar).d = v;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public l<K, V> newEntry(o<K, V> oVar, K k, int i, @CheckForNull l<K, V> lVar) {
                if (lVar == null) {
                    return new l<>(((o) oVar).e, k, i);
                }
                return new c(((o) oVar).e, k, i, lVar);
            }
        }
    }

    static class k<K, V> extends AbstractWeakKeyEntry<K, V, k<K, V>> implements WeakValueEntry<K, V, k<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile WeakValueReference<K, V, k<K, V>> f4432b;

        k(ReferenceQueue<K> referenceQueue, K k, int i) {
            super(referenceQueue, k, i);
            this.f4432b = MapMakerInternalMap.e();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public final V getValue() {
            return this.f4432b.get();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueEntry
        public final WeakValueReference<K, V, k<K, V>> getValueReference() {
            return this.f4432b;
        }

        static final class c<K, V> extends k<K, V> {
            private final k<K, V> d;

            c(ReferenceQueue<K> referenceQueue, K k, int i, k<K, V> kVar) {
                super(referenceQueue, k, i);
                this.d = kVar;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.AbstractWeakKeyEntry, com.google.common.collect.MapMakerInternalMap.InternalEntry
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public k<K, V> getNext() {
                return this.d;
            }
        }

        static final class d<K, V> implements InternalEntryHelper<K, V, k<K, V>, p<K, V>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final d<?, ?> f4433c = new d<>();

            d() {
            }

            static <K, V> d<K, V> e() {
                return (d<K, V>) f4433c;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength keyStrength() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            public Strength valueStrength() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public p<K, V> newSegment(MapMakerInternalMap<K, V, k<K, V>, p<K, V>> mapMakerInternalMap, int i) {
                return new p<>(mapMakerInternalMap, i);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            @CheckForNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public k<K, V> copy(p<K, V> pVar, k<K, V> kVar, @CheckForNull k<K, V> kVar2) {
                K key = kVar.getKey();
                if (key == null || Segment.isCollected(kVar)) {
                    return null;
                }
                k<K, V> kVarNewEntry = newEntry(pVar, key, kVar.hash, kVar2);
                ((k) kVarNewEntry).f4432b = ((k) kVar).f4432b.copyFor(((p) pVar).f4436a, kVarNewEntry);
                return kVarNewEntry;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void setValue(p<K, V> pVar, k<K, V> kVar, V v) {
                WeakValueReference weakValueReference = ((k) kVar).f4432b;
                ((k) kVar).f4432b = new t(((p) pVar).f4436a, v, kVar);
                weakValueReference.clear();
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InternalEntryHelper
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public k<K, V> newEntry(p<K, V> pVar, K k, int i, @CheckForNull k<K, V> kVar) {
                if (kVar == null) {
                    return new k<>(((p) pVar).f4437b, k, i);
                }
                return new c(((p) pVar).f4437b, k, i, kVar);
            }
        }
    }

    static final class e implements InternalEntry<Object, Object, e> {
        private e() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e getNext() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public int getHash() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InternalEntry
        public Object getValue() {
            throw new AssertionError();
        }
    }

    static final class t<K, V, E extends InternalEntry<K, V, E>> extends WeakReference<V> implements WeakValueReference<K, V, E> {
        final E d;

        t(ReferenceQueue<V> referenceQueue, V v, E e) {
            super(v, referenceQueue);
            this.d = e;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public E getEntry() {
            return this.d;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.WeakValueReference
        public WeakValueReference<K, V, E> copyFor(ReferenceQueue<V> referenceQueue, E e) {
            return new t(referenceQueue, get(), e);
        }
    }

    int b(Object obj) {
        return b(this.f4423b.hash(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    void a(WeakValueReference<K, V, E> weakValueReference) {
        InternalEntry entry = weakValueReference.getEntry();
        int hash = entry.getHash();
        e(hash).reclaimValue(entry.getKey(), hash, weakValueReference);
    }

    void e(E e2) {
        int hash = e2.getHash();
        e(hash).reclaimKey(e2, hash);
    }

    Segment<K, V, E, S> e(int i2) {
        return this.i[(i2 >>> this.f) & this.g];
    }

    Segment<K, V, E, S> d(int i2) {
        return this.f4422a.newSegment(this, i2);
    }

    @CheckForNull
    V d(E e2) {
        if (e2.getKey() == null) {
            return null;
        }
        return (V) e2.getValue();
    }

    final Segment<K, V, E, S>[] c(int i2) {
        return new Segment[i2];
    }

    static abstract class Segment<K, V, E extends InternalEntry<K, V, E>, S extends Segment<K, V, E, S>> extends ReentrantLock {
        volatile int count;
        final MapMakerInternalMap<K, V, E, S> map;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();

        @CheckForNull
        volatile AtomicReferenceArray<E> table;
        int threshold;

        abstract E castForTesting(InternalEntry<K, V, ?> internalEntry);

        void maybeClearReferenceQueues() {
        }

        void maybeDrainReferenceQueues() {
        }

        abstract S self();

        Segment(MapMakerInternalMap<K, V, E, S> mapMakerInternalMap, int i) {
            this.map = mapMakerInternalMap;
            initTable(newEntryArray(i));
        }

        void setValue(E e, V v) {
            this.map.f4422a.setValue(self(), e, v);
        }

        @CheckForNull
        E copyEntry(E e, E e2) {
            return (E) this.map.f4422a.copy(self(), e, e2);
        }

        AtomicReferenceArray<E> newEntryArray(int i) {
            return new AtomicReferenceArray<>(i);
        }

        void initTable(AtomicReferenceArray<E> atomicReferenceArray) {
            this.threshold = (atomicReferenceArray.length() * 3) / 4;
            this.table = atomicReferenceArray;
        }

        ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            throw new AssertionError();
        }

        ReferenceQueue<V> getValueReferenceQueueForTesting() {
            throw new AssertionError();
        }

        WeakValueReference<K, V, E> getWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry) {
            throw new AssertionError();
        }

        WeakValueReference<K, V, E> newWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry, V v) {
            throw new AssertionError();
        }

        void setWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry, WeakValueReference<K, V, ? extends InternalEntry<K, V, ?>> weakValueReference) {
            throw new AssertionError();
        }

        void setTableEntryForTesting(int i, InternalEntry<K, V, ?> internalEntry) {
            this.table.set(i, (E) castForTesting(internalEntry));
        }

        E copyForTesting(InternalEntry<K, V, ?> internalEntry, @CheckForNull InternalEntry<K, V, ?> internalEntry2) {
            return (E) this.map.f4422a.copy(self(), castForTesting(internalEntry), castForTesting(internalEntry2));
        }

        void setValueForTesting(InternalEntry<K, V, ?> internalEntry, V v) {
            this.map.f4422a.setValue(self(), castForTesting(internalEntry), v);
        }

        E newEntryForTesting(K k, int i, @CheckForNull InternalEntry<K, V, ?> internalEntry) {
            return (E) this.map.f4422a.newEntry(self(), k, i, castForTesting(internalEntry));
        }

        boolean removeTableEntryForTesting(InternalEntry<K, V, ?> internalEntry) {
            return removeEntryForTesting(castForTesting(internalEntry));
        }

        @CheckForNull
        E removeFromChainForTesting(InternalEntry<K, V, ?> internalEntry, InternalEntry<K, V, ?> internalEntry2) {
            return (E) removeFromChain(castForTesting(internalEntry), castForTesting(internalEntry2));
        }

        @CheckForNull
        V getLiveValueForTesting(InternalEntry<K, V, ?> internalEntry) {
            return getLiveValue(castForTesting(internalEntry));
        }

        void tryDrainReferenceQueues() {
            if (tryLock()) {
                try {
                    maybeDrainReferenceQueues();
                } finally {
                    unlock();
                }
            }
        }

        void drainKeyReferenceQueue(ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends K> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.map.e((InternalEntry) referencePoll);
                i++;
            } while (i != 16);
        }

        void drainValueReferenceQueue(ReferenceQueue<V> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends V> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.map.a((WeakValueReference) referencePoll);
                i++;
            } while (i != 16);
        }

        <T> void clearReferenceQueue(ReferenceQueue<T> referenceQueue) {
            while (referenceQueue.poll() != null) {
            }
        }

        @CheckForNull
        E getFirst(int i) {
            AtomicReferenceArray<E> atomicReferenceArray = this.table;
            return atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        @CheckForNull
        E getEntry(Object obj, int i) {
            if (this.count == 0) {
                return null;
            }
            for (E e = (E) getFirst(i); e != null; e = (E) e.getNext()) {
                if (e.getHash() == i) {
                    Object key = e.getKey();
                    if (key == null) {
                        tryDrainReferenceQueues();
                    } else if (this.map.f4423b.equivalent(obj, key)) {
                        return e;
                    }
                }
            }
            return null;
        }

        @CheckForNull
        E getLiveEntry(Object obj, int i) {
            return (E) getEntry(obj, i);
        }

        @CheckForNull
        V get(Object obj, int i) {
            try {
                InternalEntry liveEntry = getLiveEntry(obj, i);
                if (liveEntry != null) {
                    V v = (V) liveEntry.getValue();
                    if (v == null) {
                        tryDrainReferenceQueues();
                    }
                    return v;
                }
                return null;
            } finally {
                postReadCleanup();
            }
        }

        boolean containsKey(Object obj, int i) {
            try {
                boolean z = false;
                if (this.count == 0) {
                    return false;
                }
                InternalEntry liveEntry = getLiveEntry(obj, i);
                if (liveEntry != null && liveEntry.getValue() != null) {
                    z = true;
                }
                return z;
            } finally {
                postReadCleanup();
            }
        }

        boolean containsValue(Object obj) {
            try {
                if (this.count != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.table;
                    int length = atomicReferenceArray.length();
                    for (int i = 0; i < length; i++) {
                        for (E next = atomicReferenceArray.get(i); next != null; next = next.getNext()) {
                            V liveValue = getLiveValue(next);
                            if (liveValue != null && this.map.b().equivalent(obj, liveValue)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            } finally {
                postReadCleanup();
            }
        }

        @CheckForNull
        V put(K k, int i, V v, boolean z) {
            lock();
            try {
                preWriteCleanup();
                int i2 = this.count + 1;
                if (i2 > this.threshold) {
                    expand();
                    i2 = this.count + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InternalEntry next = e; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.f4423b.equivalent(k, key)) {
                        V v2 = (V) next.getValue();
                        if (v2 == null) {
                            this.modCount++;
                            setValue(next, v);
                            this.count = this.count;
                            return null;
                        }
                        if (z) {
                            return v2;
                        }
                        this.modCount++;
                        setValue(next, v);
                        return v2;
                    }
                }
                this.modCount++;
                InternalEntry internalEntryNewEntry = this.map.f4422a.newEntry(self(), k, i, e);
                setValue(internalEntryNewEntry, v);
                atomicReferenceArray.set(length, (E) internalEntryNewEntry);
                this.count = i2;
                return null;
            } finally {
                unlock();
            }
        }

        void expand() {
            AtomicReferenceArray<E> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.count;
            AtomicReferenceArray<E> atomicReferenceArrayNewEntryArray = newEntryArray(length << 1);
            this.threshold = (atomicReferenceArrayNewEntryArray.length() * 3) / 4;
            int length2 = atomicReferenceArrayNewEntryArray.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                E next = atomicReferenceArray.get(i2);
                if (next != null) {
                    InternalEntry next2 = next.getNext();
                    int hash = next.getHash() & length2;
                    if (next2 == null) {
                        atomicReferenceArrayNewEntryArray.set(hash, next);
                    } else {
                        InternalEntry internalEntry = next;
                        while (next2 != null) {
                            int hash2 = next2.getHash() & length2;
                            if (hash2 != hash) {
                                internalEntry = next2;
                                hash = hash2;
                            }
                            next2 = next2.getNext();
                        }
                        atomicReferenceArrayNewEntryArray.set(hash, internalEntry);
                        while (next != internalEntry) {
                            int hash3 = next.getHash() & length2;
                            InternalEntry internalEntryCopyEntry = copyEntry(next, (InternalEntry) atomicReferenceArrayNewEntryArray.get(hash3));
                            if (internalEntryCopyEntry != null) {
                                atomicReferenceArrayNewEntryArray.set(hash3, internalEntryCopyEntry);
                            } else {
                                i--;
                            }
                            next = next.getNext();
                        }
                    }
                }
            }
            this.table = atomicReferenceArrayNewEntryArray;
            this.count = i;
        }

        boolean replace(K k, int i, V v, V v2) {
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InternalEntry next = e; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.f4423b.equivalent(k, key)) {
                        Object value = next.getValue();
                        if (value == null) {
                            if (isCollected(next)) {
                                this.modCount++;
                                InternalEntry internalEntryRemoveFromChain = removeFromChain(e, next);
                                int i2 = this.count;
                                atomicReferenceArray.set(length, (E) internalEntryRemoveFromChain);
                                this.count = i2 - 1;
                            }
                            return false;
                        }
                        if (!this.map.b().equivalent(v, value)) {
                            return false;
                        }
                        this.modCount++;
                        setValue(next, v2);
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        @CheckForNull
        V replace(K k, int i, V v) {
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InternalEntry next = e; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.f4423b.equivalent(k, key)) {
                        V v2 = (V) next.getValue();
                        if (v2 == null) {
                            if (isCollected(next)) {
                                this.modCount++;
                                InternalEntry internalEntryRemoveFromChain = removeFromChain(e, next);
                                int i2 = this.count;
                                atomicReferenceArray.set(length, (E) internalEntryRemoveFromChain);
                                this.count = i2 - 1;
                            }
                            return null;
                        }
                        this.modCount++;
                        setValue(next, v);
                        return v2;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        @CheckForNull
        V remove(Object obj, int i) {
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InternalEntry next = e; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.f4423b.equivalent(obj, key)) {
                        V v = (V) next.getValue();
                        if (v == null && !isCollected(next)) {
                            return null;
                        }
                        this.modCount++;
                        InternalEntry internalEntryRemoveFromChain = removeFromChain(e, next);
                        int i2 = this.count;
                        atomicReferenceArray.set(length, (E) internalEntryRemoveFromChain);
                        this.count = i2 - 1;
                        return v;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        boolean remove(Object obj, int i, Object obj2) {
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                InternalEntry next = e;
                while (true) {
                    boolean z = false;
                    if (next == null) {
                        return false;
                    }
                    Object key = next.getKey();
                    if (next.getHash() != i || key == null || !this.map.f4423b.equivalent(obj, key)) {
                        next = next.getNext();
                    } else {
                        if (this.map.b().equivalent(obj2, next.getValue())) {
                            z = true;
                        } else if (!isCollected(next)) {
                            return false;
                        }
                        this.modCount++;
                        InternalEntry internalEntryRemoveFromChain = removeFromChain(e, next);
                        int i2 = this.count;
                        atomicReferenceArray.set(length, (E) internalEntryRemoveFromChain);
                        this.count = i2 - 1;
                        return z;
                    }
                }
            } finally {
                unlock();
            }
        }

        void clear() {
            if (this.count != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.table;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    maybeClearReferenceQueues();
                    this.readCount.set(0);
                    this.modCount++;
                    this.count = 0;
                } finally {
                    unlock();
                }
            }
        }

        @CheckForNull
        E removeFromChain(E e, E e2) {
            int i = this.count;
            E e3 = (E) e2.getNext();
            while (e != e2) {
                InternalEntry internalEntryCopyEntry = copyEntry(e, e3);
                if (internalEntryCopyEntry != null) {
                    e3 = (E) internalEntryCopyEntry;
                } else {
                    i--;
                }
                e = (E) e.getNext();
            }
            this.count = i;
            return e3;
        }

        boolean reclaimKey(E e, int i) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                E e2 = atomicReferenceArray.get(length);
                for (InternalEntry next = e2; next != null; next = next.getNext()) {
                    if (next == e) {
                        this.modCount++;
                        InternalEntry internalEntryRemoveFromChain = removeFromChain(e2, next);
                        int i2 = this.count;
                        atomicReferenceArray.set(length, (E) internalEntryRemoveFromChain);
                        this.count = i2 - 1;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        boolean reclaimValue(K k, int i, WeakValueReference<K, V, E> weakValueReference) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InternalEntry next = e; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.f4423b.equivalent(k, key)) {
                        if (((WeakValueEntry) next).getValueReference() != weakValueReference) {
                            return false;
                        }
                        this.modCount++;
                        InternalEntry internalEntryRemoveFromChain = removeFromChain(e, next);
                        int i2 = this.count;
                        atomicReferenceArray.set(length, (E) internalEntryRemoveFromChain);
                        this.count = i2 - 1;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        boolean clearValueForTesting(K k, int i, WeakValueReference<K, V, ? extends InternalEntry<K, V, ?>> weakValueReference) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (InternalEntry next = e; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.map.f4423b.equivalent(k, key)) {
                        if (((WeakValueEntry) next).getValueReference() != weakValueReference) {
                            return false;
                        }
                        atomicReferenceArray.set(length, (E) removeFromChain(e, next));
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        boolean removeEntryForTesting(E e) {
            int hash = e.getHash();
            AtomicReferenceArray<E> atomicReferenceArray = this.table;
            int length = hash & (atomicReferenceArray.length() - 1);
            E e2 = atomicReferenceArray.get(length);
            for (InternalEntry next = e2; next != null; next = next.getNext()) {
                if (next == e) {
                    this.modCount++;
                    InternalEntry internalEntryRemoveFromChain = removeFromChain(e2, next);
                    int i = this.count;
                    atomicReferenceArray.set(length, (E) internalEntryRemoveFromChain);
                    this.count = i - 1;
                    return true;
                }
            }
            return false;
        }

        static <K, V, E extends InternalEntry<K, V, E>> boolean isCollected(E e) {
            return e.getValue() == null;
        }

        @CheckForNull
        V getLiveValue(E e) {
            if (e.getKey() == null) {
                tryDrainReferenceQueues();
                return null;
            }
            V v = (V) e.getValue();
            if (v != null) {
                return v;
            }
            tryDrainReferenceQueues();
            return null;
        }

        void postReadCleanup() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                runCleanup();
            }
        }

        void preWriteCleanup() {
            runLockedCleanup();
        }

        void runCleanup() {
            runLockedCleanup();
        }

        void runLockedCleanup() {
            if (tryLock()) {
                try {
                    maybeDrainReferenceQueues();
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }
    }

    static final class f<K, V> extends Segment<K, V, h<K, V>, f<K, V>> {
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public f<K, V> self() {
            return this;
        }

        f(MapMakerInternalMap<K, V, h<K, V>, f<K, V>> mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        @CheckForNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h<K, V> castForTesting(@CheckForNull InternalEntry<K, V, ?> internalEntry) {
            return (h) internalEntry;
        }
    }

    static final class i<K, V> extends Segment<K, V, g<K, V>, i<K, V>> {
        private final ReferenceQueue<V> e;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public i<K, V> self() {
            return this;
        }

        i(MapMakerInternalMap<K, V, g<K, V>, i<K, V>> mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
            this.e = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        ReferenceQueue<V> getValueReferenceQueueForTesting() {
            return this.e;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        @CheckForNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g<K, V> castForTesting(@CheckForNull InternalEntry<K, V, ?> internalEntry) {
            return (g) internalEntry;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakValueReference<K, V, g<K, V>> getWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry) {
            return castForTesting(internalEntry).getValueReference();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakValueReference<K, V, g<K, V>> newWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry, V v) {
            return new t(this.e, v, castForTesting(internalEntry));
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void setWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry, WeakValueReference<K, V, ? extends InternalEntry<K, V, ?>> weakValueReference) {
            g<K, V> gVarCastForTesting = castForTesting(internalEntry);
            WeakValueReference weakValueReference2 = ((g) gVarCastForTesting).f4427a;
            ((g) gVarCastForTesting).f4427a = weakValueReference;
            weakValueReference2.clear();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void maybeDrainReferenceQueues() {
            drainValueReferenceQueue(this.e);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void maybeClearReferenceQueues() {
            clearReferenceQueue(this.e);
        }
    }

    static final class o<K, V> extends Segment<K, V, l<K, V>, o<K, V>> {
        private final ReferenceQueue<K> e;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public o<K, V> self() {
            return this;
        }

        o(MapMakerInternalMap<K, V, l<K, V>, o<K, V>> mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
            this.e = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            return this.e;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l<K, V> castForTesting(InternalEntry<K, V, ?> internalEntry) {
            return (l) internalEntry;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.e);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void maybeClearReferenceQueues() {
            clearReferenceQueue(this.e);
        }
    }

    static final class p<K, V> extends Segment<K, V, k<K, V>, p<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ReferenceQueue<V> f4436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ReferenceQueue<K> f4437b;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p<K, V> self() {
            return this;
        }

        p(MapMakerInternalMap<K, V, k<K, V>, p<K, V>> mapMakerInternalMap, int i) {
            super(mapMakerInternalMap, i);
            this.f4437b = new ReferenceQueue<>();
            this.f4436a = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        ReferenceQueue<K> getKeyReferenceQueueForTesting() {
            return this.f4437b;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        ReferenceQueue<V> getValueReferenceQueueForTesting() {
            return this.f4436a;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        @CheckForNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k<K, V> castForTesting(@CheckForNull InternalEntry<K, V, ?> internalEntry) {
            return (k) internalEntry;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakValueReference<K, V, k<K, V>> getWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry) {
            return castForTesting(internalEntry).getValueReference();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public WeakValueReference<K, V, k<K, V>> newWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry, V v) {
            return new t(this.f4436a, v, castForTesting(internalEntry));
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        public void setWeakValueReferenceForTesting(InternalEntry<K, V, ?> internalEntry, WeakValueReference<K, V, ? extends InternalEntry<K, V, ?>> weakValueReference) {
            k<K, V> kVarCastForTesting = castForTesting(internalEntry);
            WeakValueReference weakValueReference2 = ((k) kVarCastForTesting).f4432b;
            ((k) kVarCastForTesting).f4432b = weakValueReference;
            weakValueReference2.clear();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void maybeDrainReferenceQueues() {
            drainKeyReferenceQueue(this.f4437b);
            drainValueReferenceQueue(this.f4436a);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        void maybeClearReferenceQueues() {
            clearReferenceQueue(this.f4437b);
        }
    }

    Equivalence<Object> b() {
        return this.f4422a.valueStrength().defaultEquivalence();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        Segment<K, V, E, S>[] segmentArr = this.i;
        long j2 = 0;
        for (int i2 = 0; i2 < segmentArr.length; i2++) {
            if (segmentArr[i2].count != 0) {
                return false;
            }
            j2 += (long) segmentArr[i2].modCount;
        }
        if (j2 == 0) {
            return true;
        }
        for (int i3 = 0; i3 < segmentArr.length; i3++) {
            if (segmentArr[i3].count != 0) {
                return false;
            }
            j2 -= (long) segmentArr[i3].modCount;
        }
        return j2 == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j2 = 0;
        for (Segment<K, V, E, S> segment : this.i) {
            j2 += (long) segment.count;
        }
        return Ints.a(j2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        if (obj == null) {
            return null;
        }
        int iB = b(obj);
        return e(iB).get(obj, iB);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        if (obj == null) {
            return false;
        }
        int iB = b(obj);
        return e(iB).containsKey(obj, iB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        Segment<K, V, E, S>[] segmentArr = this.i;
        long j2 = -1;
        int i2 = 0;
        while (i2 < 3) {
            int length = segmentArr.length;
            long j3 = 0;
            for (?? r10 = z; r10 < length; r10++) {
                Segment<K, V, E, S> segment = segmentArr[r10];
                int i3 = segment.count;
                AtomicReferenceArray<E> atomicReferenceArray = segment.table;
                for (?? r13 = z; r13 < atomicReferenceArray.length(); r13++) {
                    for (E next = atomicReferenceArray.get(r13); next != null; next = next.getNext()) {
                        V liveValue = segment.getLiveValue(next);
                        if (liveValue != null && b().equivalent(obj, liveValue)) {
                            return true;
                        }
                    }
                }
                j3 += (long) segment.modCount;
                z = false;
            }
            if (j3 == j2) {
                return false;
            }
            i2++;
            j2 = j3;
            z = false;
        }
        return z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V put(K k2, V v) {
        Preconditions.checkNotNull(k2);
        Preconditions.checkNotNull(v);
        int iB = b(k2);
        return e(iB).put(k2, iB, v, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CheckForNull
    public V putIfAbsent(K k2, V v) {
        Preconditions.checkNotNull(k2);
        Preconditions.checkNotNull(v);
        int iB = b(k2);
        return e(iB).put(k2, iB, v, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V remove(@CheckForNull Object obj) {
        if (obj == null) {
            return null;
        }
        int iB = b(obj);
        return e(iB).remove(obj, iB);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iB = b(obj);
        return e(iB).remove(obj, iB, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k2, @CheckForNull V v, V v2) {
        Preconditions.checkNotNull(k2);
        Preconditions.checkNotNull(v2);
        if (v == null) {
            return false;
        }
        int iB = b(k2);
        return e(iB).replace(k2, iB, v, v2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CheckForNull
    public V replace(K k2, V v) {
        Preconditions.checkNotNull(k2);
        Preconditions.checkNotNull(v);
        int iB = b(k2);
        return e(iB).replace(k2, iB, v);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (Segment<K, V, E, S> segment : this.i) {
            segment.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.h;
        if (set != null) {
            return set;
        }
        a aVar = new a();
        this.h = aVar;
        return aVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.j;
        if (collection != null) {
            return collection;
        }
        n nVar = new n();
        this.j = nVar;
        return nVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.e;
        if (set != null) {
            return set;
        }
        c cVar = new c();
        this.e = cVar;
        return cVar;
    }

    abstract class HashIterator<T> implements Iterator<T> {

        @CheckForNull
        Segment<K, V, E, S> currentSegment;

        @CheckForNull
        AtomicReferenceArray<E> currentTable;

        @CheckForNull
        MapMakerInternalMap<K, V, E, S>.r lastReturned;

        @CheckForNull
        E nextEntry;

        @CheckForNull
        MapMakerInternalMap<K, V, E, S>.r nextExternal;
        int nextSegmentIndex;
        int nextTableIndex = -1;

        @Override // java.util.Iterator
        public abstract T next();

        HashIterator() {
            this.nextSegmentIndex = MapMakerInternalMap.this.i.length - 1;
            advance();
        }

        final void advance() {
            this.nextExternal = null;
            if (nextInChain() || nextInTable()) {
                return;
            }
            while (this.nextSegmentIndex >= 0) {
                Segment<K, V, E, S>[] segmentArr = MapMakerInternalMap.this.i;
                int i = this.nextSegmentIndex;
                this.nextSegmentIndex = i - 1;
                Segment<K, V, E, S> segment = segmentArr[i];
                this.currentSegment = segment;
                if (segment.count != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.currentSegment.table;
                    this.currentTable = atomicReferenceArray;
                    this.nextTableIndex = atomicReferenceArray.length() - 1;
                    if (nextInTable()) {
                        return;
                    }
                }
            }
        }

        boolean nextInChain() {
            E e = this.nextEntry;
            if (e == null) {
                return false;
            }
            while (true) {
                E e2 = (E) e.getNext();
                this.nextEntry = e2;
                if (e2 == null) {
                    return false;
                }
                if (advanceTo(e2)) {
                    return true;
                }
                e = this.nextEntry;
            }
        }

        boolean nextInTable() {
            while (true) {
                int i = this.nextTableIndex;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.currentTable;
                this.nextTableIndex = i - 1;
                E e = atomicReferenceArray.get(i);
                this.nextEntry = e;
                if (e != null && (advanceTo(e) || nextInChain())) {
                    return true;
                }
            }
        }

        boolean advanceTo(E e) {
            Segment<K, V, E, S> segment;
            try {
                Object key = e.getKey();
                Object objD = MapMakerInternalMap.this.d(e);
                if (objD == null) {
                    return false;
                }
                this.nextExternal = new r(key, objD);
                return true;
            } finally {
                this.currentSegment.postReadCleanup();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.nextExternal != null;
        }

        MapMakerInternalMap<K, V, E, S>.r nextEntry() {
            MapMakerInternalMap<K, V, E, S>.r rVar = this.nextExternal;
            if (rVar == null) {
                throw new NoSuchElementException();
            }
            this.lastReturned = rVar;
            advance();
            return this.lastReturned;
        }

        @Override // java.util.Iterator
        public void remove() {
            ale.b(this.lastReturned != null);
            MapMakerInternalMap.this.remove(this.lastReturned.getKey());
            this.lastReturned = null;
        }
    }

    final class d extends MapMakerInternalMap<K, V, E, S>.HashIterator<K> {
        d(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public K next() {
            return nextEntry().getKey();
        }
    }

    final class m extends MapMakerInternalMap<K, V, E, S>.HashIterator<V> {
        m(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        public V next() {
            return nextEntry().getValue();
        }
    }

    final class r extends AbstractMapEntry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        V f4438a;
        final K e;

        r(K k, V v) {
            this.e = k;
            this.f4438a = v;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public K getKey() {
            return this.e;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V getValue() {
            return this.f4438a;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.e.equals(entry.getKey()) && this.f4438a.equals(entry.getValue());
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public int hashCode() {
            return this.e.hashCode() ^ this.f4438a.hashCode();
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V setValue(V v) {
            V v2 = (V) MapMakerInternalMap.this.put(this.e, v);
            this.f4438a = v;
            return v2;
        }
    }

    final class b extends MapMakerInternalMap<K, V, E, S>.HashIterator<Map.Entry<K, V>> {
        b(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.HashIterator, java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return nextEntry();
        }
    }

    final class a extends SafeToArraySet<K> {
        a() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new d(MapMakerInternalMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return MapMakerInternalMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return MapMakerInternalMap.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            MapMakerInternalMap.this.clear();
        }
    }

    final class n extends AbstractCollection<V> {
        n() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new m(MapMakerInternalMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return MapMakerInternalMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return MapMakerInternalMap.b((Collection) this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) MapMakerInternalMap.b((Collection) this).toArray(tArr);
        }
    }

    final class c extends SafeToArraySet<Map.Entry<K, V>> {
        c() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(MapMakerInternalMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = MapMakerInternalMap.this.get(key)) != null && MapMakerInternalMap.this.b().equivalent(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && MapMakerInternalMap.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return MapMakerInternalMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            MapMakerInternalMap.this.clear();
        }
    }

    static abstract class SafeToArraySet<E> extends AbstractSet<E> {
        private SafeToArraySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return MapMakerInternalMap.b((Collection) this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) MapMakerInternalMap.b((Collection) this).toArray(tArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ArrayList<E> b(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        Iterators.a(arrayList, collection.iterator());
        return arrayList;
    }

    Object writeReplace() {
        return new j(this.f4422a.keyStrength(), this.f4422a.valueStrength(), this.f4423b, this.f4422a.valueStrength().defaultEquivalence(), this.f4424c, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializationProxy");
    }

    static abstract class AbstractSerializationProxy<K, V> extends ForwardingConcurrentMap<K, V> implements Serializable {
        private static final long serialVersionUID = 3;
        final int concurrencyLevel;
        transient ConcurrentMap<K, V> delegate;
        final Equivalence<Object> keyEquivalence;
        final Strength keyStrength;
        final Equivalence<Object> valueEquivalence;
        final Strength valueStrength;

        AbstractSerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i, ConcurrentMap<K, V> concurrentMap) {
            this.keyStrength = strength;
            this.valueStrength = strength2;
            this.keyEquivalence = equivalence;
            this.valueEquivalence = equivalence2;
            this.concurrencyLevel = i;
            this.delegate = concurrentMap;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingConcurrentMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public ConcurrentMap<K, V> delegate() {
            return this.delegate;
        }

        void writeMapTo(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeInt(this.delegate.size());
            for (Map.Entry<K, V> entry : this.delegate.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }

        MapMaker readMapMaker(ObjectInputStream objectInputStream) throws IOException {
            return new MapMaker().b(objectInputStream.readInt()).c(this.keyStrength).d(this.valueStrength).c(this.keyEquivalence).c(this.concurrencyLevel);
        }

        void readEntries(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            while (true) {
                Object object = objectInputStream.readObject();
                if (object == null) {
                    return;
                }
                this.delegate.put((K) object, (V) objectInputStream.readObject());
            }
        }
    }

    static final class j<K, V> extends AbstractSerializationProxy<K, V> {
        private static final long serialVersionUID = 3;

        j(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i, ConcurrentMap<K, V> concurrentMap) {
            super(strength, strength2, equivalence, equivalence2, i, concurrentMap);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            writeMapTo(objectOutputStream);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.delegate = readMapMaker(objectInputStream).g();
            readEntries(objectInputStream);
        }

        private Object readResolve() {
            return this.delegate;
        }
    }
}
