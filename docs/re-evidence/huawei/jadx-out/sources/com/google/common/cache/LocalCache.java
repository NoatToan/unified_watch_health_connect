package com.google.common.cache;

import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.google.common.collect.AbstractSequentialIterator;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.primitives.Ints;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.errorprone.annotations.concurrent.LazyInit;
import defpackage.ajo;
import defpackage.aju;
import defpackage.aqp;
import defpackage.aqt;
import defpackage.aqx;
import defpackage.arb;
import defpackage.arn;
import defpackage.aro;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes21.dex */
public class LocalCache<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f4227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    final CacheLoader<? super K, V> f4228c;
    final AbstractCache.StatsCounter f;
    final long g;

    @CheckForNull
    @LazyInit
    Set<Map.Entry<K, V>> h;
    final EntryFactory i;
    final long j;

    @CheckForNull
    @LazyInit
    Set<K> k;
    final Equivalence<Object> l;
    final Strength m;
    final long n;
    final long o;
    final o<K, V>[] p;
    final Queue<aju<K, V>> q;
    final RemovalListener<K, V> r;
    final int s;
    final int t;
    final Equivalence<Object> u;
    final Weigher<K, V> v;
    final Strength w;

    @CheckForNull
    @LazyInit
    Collection<V> x;
    final Ticker y;
    static final Logger d = Logger.getLogger(LocalCache.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final ValueReference<Object, Object> f4226a = new ValueReference<Object, Object>() { // from class: com.google.common.cache.LocalCache.1
        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<Object, Object> copyFor(ReferenceQueue<Object> referenceQueue, @CheckForNull Object obj, ReferenceEntry<Object, Object> referenceEntry) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        @CheckForNull
        public Object get() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        @CheckForNull
        public ReferenceEntry<Object, Object> getEntry() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 0;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(Object obj) {
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        @CheckForNull
        public Object waitForValue() {
            return null;
        }
    };
    static final Queue<?> e = new AbstractQueue<Object>() { // from class: com.google.common.cache.LocalCache.2
        @Override // java.util.Queue
        public boolean offer(Object obj) {
            return true;
        }

        @Override // java.util.Queue
        @CheckForNull
        public Object peek() {
            return null;
        }

        @Override // java.util.Queue
        @CheckForNull
        public Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return ImmutableSet.of().iterator();
        }
    };

    enum NullEntry implements ReferenceEntry<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return 0L;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
            return 0;
        }

        @Override // com.google.common.cache.ReferenceEntry
        @CheckForNull
        public Object getKey() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        @CheckForNull
        public ReferenceEntry<Object, Object> getNext() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getNextInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getNextInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getPreviousInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getPreviousInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        @CheckForNull
        public ValueReference<Object, Object> getValueReference() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return 0L;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(ValueReference<Object, Object> valueReference) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j) {
        }
    }

    enum Strength {
        STRONG { // from class: com.google.common.cache.LocalCache.Strength.1
            @Override // com.google.common.cache.LocalCache.Strength
            <K, V> ValueReference<K, V> referenceValue(o<K, V> oVar, ReferenceEntry<K, V> referenceEntry, V v, int i) {
                if (i == 1) {
                    return new r(v);
                }
                return new ac(v, i);
            }

            @Override // com.google.common.cache.LocalCache.Strength
            Equivalence<Object> defaultEquivalence() {
                return Equivalence.equals();
            }
        },
        SOFT { // from class: com.google.common.cache.LocalCache.Strength.2
            @Override // com.google.common.cache.LocalCache.Strength
            <K, V> ValueReference<K, V> referenceValue(o<K, V> oVar, ReferenceEntry<K, V> referenceEntry, V v, int i) {
                if (i == 1) {
                    return new m(oVar.l, v, referenceEntry);
                }
                return new w(oVar.l, v, referenceEntry, i);
            }

            @Override // com.google.common.cache.LocalCache.Strength
            Equivalence<Object> defaultEquivalence() {
                return Equivalence.identity();
            }
        },
        WEAK { // from class: com.google.common.cache.LocalCache.Strength.3
            @Override // com.google.common.cache.LocalCache.Strength
            <K, V> ValueReference<K, V> referenceValue(o<K, V> oVar, ReferenceEntry<K, V> referenceEntry, V v, int i) {
                if (i == 1) {
                    return new x(oVar.l, v, referenceEntry);
                }
                return new ab(oVar.l, v, referenceEntry, i);
            }

            @Override // com.google.common.cache.LocalCache.Strength
            Equivalence<Object> defaultEquivalence() {
                return Equivalence.identity();
            }
        };

        abstract Equivalence<Object> defaultEquivalence();

        abstract <K, V> ValueReference<K, V> referenceValue(o<K, V> oVar, ReferenceEntry<K, V> referenceEntry, V v, int i);
    }

    interface ValueReference<K, V> {
        ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, @CheckForNull V v, ReferenceEntry<K, V> referenceEntry);

        @CheckForNull
        V get();

        @CheckForNull
        ReferenceEntry<K, V> getEntry();

        int getWeight();

        boolean isActive();

        boolean isLoading();

        void notifyNewValue(@CheckForNull V v);

        V waitForValue() throws ExecutionException;
    }

    static int a(int i2) {
        int i3 = i2 + ((i2 << 15) ^ (-12931));
        int i4 = i3 ^ (i3 >>> 10);
        int i5 = i4 + (i4 << 3);
        int i6 = i5 ^ (i5 >>> 6);
        int i7 = i6 + (i6 << 2) + (i6 << 14);
        return i7 ^ (i7 >>> 16);
    }

    LocalCache(CacheBuilder<? super K, ? super V> cacheBuilder, @CheckForNull CacheLoader<? super K, V> cacheLoader) {
        Queue<aju<K, V>> concurrentLinkedQueue;
        this.f4227b = Math.min(cacheBuilder.d(), 65536);
        Strength strengthJ = cacheBuilder.j();
        this.m = strengthJ;
        this.w = cacheBuilder.l();
        this.l = cacheBuilder.g();
        this.u = cacheBuilder.n();
        long jF = cacheBuilder.f();
        this.o = jF;
        this.v = (Weigher<K, V>) cacheBuilder.k();
        this.g = cacheBuilder.b();
        this.j = cacheBuilder.c();
        this.n = cacheBuilder.i();
        CacheBuilder.NullListener nullListener = (RemovalListener<K, V>) cacheBuilder.m();
        this.r = nullListener;
        if (nullListener == CacheBuilder.NullListener.INSTANCE) {
            concurrentLinkedQueue = d();
        } else {
            concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        }
        this.q = concurrentLinkedQueue;
        this.y = cacheBuilder.a(o());
        this.i = EntryFactory.getFactory(strengthJ, m(), p());
        this.f = cacheBuilder.o().get();
        this.f4228c = cacheLoader;
        int iMin = Math.min(cacheBuilder.h(), 1073741824);
        if (g() && !b()) {
            iMin = (int) Math.min(iMin, jF);
        }
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        int i5 = 1;
        while (i5 < this.f4227b && (!g() || ((long) i5) * 20 <= this.o)) {
            i4++;
            i5 <<= 1;
        }
        this.s = 32 - i4;
        this.t = i5 - 1;
        this.p = e(i5);
        int i6 = iMin / i5;
        while (i3 < (i6 * i5 < iMin ? i6 + 1 : i6)) {
            i3 <<= 1;
        }
        if (g()) {
            long j2 = this.o;
            long j3 = i5;
            long j4 = (j2 / j3) + 1;
            while (true) {
                o<K, V>[] oVarArr = this.p;
                if (i2 >= oVarArr.length) {
                    return;
                }
                if (i2 == j2 % j3) {
                    j4--;
                }
                oVarArr[i2] = d(i3, j4, cacheBuilder.o().get());
                i2++;
            }
        } else {
            while (true) {
                o<K, V>[] oVarArr2 = this.p;
                if (i2 >= oVarArr2.length) {
                    return;
                }
                oVarArr2[i2] = d(i3, -1L, cacheBuilder.o().get());
                i2++;
            }
        }
    }

    boolean g() {
        return this.o >= 0;
    }

    boolean b() {
        return this.v != CacheBuilder.OneWeigher.INSTANCE;
    }

    boolean h() {
        return this.j > 0;
    }

    boolean f() {
        return this.g > 0;
    }

    boolean l() {
        return this.n > 0;
    }

    boolean r() {
        return f() || g();
    }

    boolean s() {
        return h();
    }

    boolean n() {
        return h() || l();
    }

    boolean k() {
        return f();
    }

    boolean o() {
        return n() || k();
    }

    boolean p() {
        return s() || n();
    }

    boolean m() {
        return r() || k();
    }

    boolean q() {
        return this.m != Strength.STRONG;
    }

    boolean t() {
        return this.w != Strength.STRONG;
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.google.common.cache.LocalCache$EntryFactory, still in use, count: 1, list:
      (r0v0 com.google.common.cache.LocalCache$EntryFactory) from 0x0058: FILLED_NEW_ARRAY 
      (r0v0 com.google.common.cache.LocalCache$EntryFactory)
      (r1v1 com.google.common.cache.LocalCache$EntryFactory)
      (r3v1 com.google.common.cache.LocalCache$EntryFactory)
      (r5v1 com.google.common.cache.LocalCache$EntryFactory)
      (r7v1 com.google.common.cache.LocalCache$EntryFactory)
      (r9v1 com.google.common.cache.LocalCache$EntryFactory)
      (r11v1 com.google.common.cache.LocalCache$EntryFactory)
      (r13v1 com.google.common.cache.LocalCache$EntryFactory)
     A[WRAPPED] (LINE:576) elemType: com.google.common.cache.LocalCache$EntryFactory
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static abstract class EntryFactory {
        STRONG { // from class: com.google.common.cache.LocalCache.EntryFactory.1
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> ReferenceEntry<K, V> newEntry(o<K, V> oVar, K k, int i, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new n(k, i, referenceEntry);
            }
        },
        STRONG_ACCESS { // from class: com.google.common.cache.LocalCache.EntryFactory.2
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> ReferenceEntry<K, V> newEntry(o<K, V> oVar, K k, int i, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new k(k, i, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> ReferenceEntry<K, V> copyEntry(o<K, V> oVar, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(oVar, referenceEntry, referenceEntry2, k);
                copyAccessEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        },
        STRONG_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.3
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> ReferenceEntry<K, V> newEntry(o<K, V> oVar, K k, int i, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new p(k, i, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> ReferenceEntry<K, V> copyEntry(o<K, V> oVar, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(oVar, referenceEntry, referenceEntry2, k);
                copyWriteEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        },
        STRONG_ACCESS_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.4
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> ReferenceEntry<K, V> newEntry(o<K, V> oVar, K k, int i, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new l(k, i, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> ReferenceEntry<K, V> copyEntry(o<K, V> oVar, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(oVar, referenceEntry, referenceEntry2, k);
                copyAccessEntry(referenceEntry, referenceEntryCopyEntry);
                copyWriteEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        },
        WEAK { // from class: com.google.common.cache.LocalCache.EntryFactory.5
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> ReferenceEntry<K, V> newEntry(o<K, V> oVar, K k, int i, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new u(oVar.d, k, i, referenceEntry);
            }
        },
        WEAK_ACCESS { // from class: com.google.common.cache.LocalCache.EntryFactory.6
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> ReferenceEntry<K, V> newEntry(o<K, V> oVar, K k, int i, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new s(oVar.d, k, i, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> ReferenceEntry<K, V> copyEntry(o<K, V> oVar, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(oVar, referenceEntry, referenceEntry2, k);
                copyAccessEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        },
        WEAK_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.7
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> ReferenceEntry<K, V> newEntry(o<K, V> oVar, K k, int i, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new v(oVar.d, k, i, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> ReferenceEntry<K, V> copyEntry(o<K, V> oVar, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(oVar, referenceEntry, referenceEntry2, k);
                copyWriteEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        },
        WEAK_ACCESS_WRITE { // from class: com.google.common.cache.LocalCache.EntryFactory.8
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> ReferenceEntry<K, V> newEntry(o<K, V> oVar, K k, int i, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new y(oVar.d, k, i, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> ReferenceEntry<K, V> copyEntry(o<K, V> oVar, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(oVar, referenceEntry, referenceEntry2, k);
                copyAccessEntry(referenceEntry, referenceEntryCopyEntry);
                copyWriteEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        };

        static final int ACCESS_MASK = 1;
        static final int WEAK_MASK = 4;
        static final int WRITE_MASK = 2;
        static final EntryFactory[] factories = {new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.1
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> ReferenceEntry<K, V> newEntry(o<K, V> oVar, K k, int i, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new n(k, i, referenceEntry);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.2
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> ReferenceEntry<K, V> newEntry(o<K, V> oVar, K k, int i, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new k(k, i, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> ReferenceEntry<K, V> copyEntry(o<K, V> oVar, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(oVar, referenceEntry, referenceEntry2, k);
                copyAccessEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.3
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> ReferenceEntry<K, V> newEntry(o<K, V> oVar, K k, int i, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new p(k, i, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> ReferenceEntry<K, V> copyEntry(o<K, V> oVar, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(oVar, referenceEntry, referenceEntry2, k);
                copyWriteEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.4
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> ReferenceEntry<K, V> newEntry(o<K, V> oVar, K k, int i, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new l(k, i, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> ReferenceEntry<K, V> copyEntry(o<K, V> oVar, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(oVar, referenceEntry, referenceEntry2, k);
                copyAccessEntry(referenceEntry, referenceEntryCopyEntry);
                copyWriteEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.5
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> ReferenceEntry<K, V> newEntry(o<K, V> oVar, K k, int i, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new u(oVar.d, k, i, referenceEntry);
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.6
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> ReferenceEntry<K, V> newEntry(o<K, V> oVar, K k, int i, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new s(oVar.d, k, i, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> ReferenceEntry<K, V> copyEntry(o<K, V> oVar, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(oVar, referenceEntry, referenceEntry2, k);
                copyAccessEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.7
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> ReferenceEntry<K, V> newEntry(o<K, V> oVar, K k, int i, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new v(oVar.d, k, i, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> ReferenceEntry<K, V> copyEntry(o<K, V> oVar, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(oVar, referenceEntry, referenceEntry2, k);
                copyWriteEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        }, new EntryFactory() { // from class: com.google.common.cache.LocalCache.EntryFactory.8
            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> ReferenceEntry<K, V> newEntry(o<K, V> oVar, K k, int i, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
                return new y(oVar.d, k, i, referenceEntry);
            }

            @Override // com.google.common.cache.LocalCache.EntryFactory
            <K, V> ReferenceEntry<K, V> copyEntry(o<K, V> oVar, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k) {
                ReferenceEntry<K, V> referenceEntryCopyEntry = super.copyEntry(oVar, referenceEntry, referenceEntry2, k);
                copyAccessEntry(referenceEntry, referenceEntryCopyEntry);
                copyWriteEntry(referenceEntry, referenceEntryCopyEntry);
                return referenceEntryCopyEntry;
            }
        }};

        abstract <K, V> ReferenceEntry<K, V> newEntry(o<K, V> oVar, K k, int i, @CheckForNull ReferenceEntry<K, V> referenceEntry);

        private EntryFactory(String str, int i) {
            super(str, i);
        }

        public static EntryFactory valueOf(String str) {
            return (EntryFactory) Enum.valueOf(EntryFactory.class, str);
        }

        public static EntryFactory[] values() {
            return (EntryFactory[]) $VALUES.clone();
        }

        static {
        }

        /* JADX WARN: Multi-variable type inference failed */
        static EntryFactory getFactory(Strength strength, boolean z, boolean z2) {
            return factories[((strength == Strength.WEAK ? (char) 4 : (char) 0) | (z ? 1 : 0) ? 1 : 0) | (z2 ? 2 : 0)];
        }

        <K, V> ReferenceEntry<K, V> copyEntry(o<K, V> oVar, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k) {
            return newEntry(oVar, k, referenceEntry.getHash(), referenceEntry2);
        }

        <K, V> void copyAccessEntry(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            referenceEntry2.setAccessTime(referenceEntry.getAccessTime());
            LocalCache.b(referenceEntry.getPreviousInAccessQueue(), referenceEntry2);
            LocalCache.b(referenceEntry2, referenceEntry.getNextInAccessQueue());
            LocalCache.a((ReferenceEntry) referenceEntry);
        }

        <K, V> void copyWriteEntry(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            referenceEntry2.setWriteTime(referenceEntry.getWriteTime());
            LocalCache.c(referenceEntry.getPreviousInWriteQueue(), referenceEntry2);
            LocalCache.c(referenceEntry2, referenceEntry.getNextInWriteQueue());
            LocalCache.e(referenceEntry);
        }
    }

    static <K, V> ValueReference<K, V> a() {
        return (ValueReference<K, V>) f4226a;
    }

    static abstract class AbstractReferenceEntry<K, V> implements ReferenceEntry<K, V> {
        AbstractReferenceEntry() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ValueReference<K, V> getValueReference() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(ValueReference<K, V> valueReference) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNext() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public K getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }
    }

    static <K, V> ReferenceEntry<K, V> c() {
        return NullEntry.INSTANCE;
    }

    static <E> Queue<E> d() {
        return (Queue<E>) e;
    }

    static class n<K, V> extends AbstractReferenceEntry<K, V> {

        @CheckForNull
        final ReferenceEntry<K, V> f;
        final K g;
        final int h;
        volatile ValueReference<K, V> i = LocalCache.a();

        n(K k, int i, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
            this.g = k;
            this.h = i;
            this.f = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public K getKey() {
            return this.g;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ValueReference<K, V> getValueReference() {
            return this.i;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setValueReference(ValueReference<K, V> valueReference) {
            this.i = valueReference;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public int getHash() {
            return this.h;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNext() {
            return this.f;
        }
    }

    static final class k<K, V> extends n<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ReferenceEntry<K, V> f4247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ReferenceEntry<K, V> f4248c;
        volatile long d;

        k(K k, int i, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
            super(k, i, referenceEntry);
            this.d = Long.MAX_VALUE;
            this.f4248c = LocalCache.c();
            this.f4247b = LocalCache.c();
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return this.d;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j) {
            this.d = j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.f4248c;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f4248c = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.f4247b;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f4247b = referenceEntry;
        }
    }

    static final class p<K, V> extends n<K, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ReferenceEntry<K, V> f4256c;
        volatile long d;
        ReferenceEntry<K, V> e;

        p(K k, int i, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
            super(k, i, referenceEntry);
            this.d = Long.MAX_VALUE;
            this.e = LocalCache.c();
            this.f4256c = LocalCache.c();
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return this.d;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j) {
            this.d = j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.e;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.e = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.f4256c;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f4256c = referenceEntry;
        }
    }

    static final class l<K, V> extends n<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile long f4249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ReferenceEntry<K, V> f4250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ReferenceEntry<K, V> f4251c;
        ReferenceEntry<K, V> d;
        ReferenceEntry<K, V> e;
        volatile long j;

        l(K k, int i, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
            super(k, i, referenceEntry);
            this.f4249a = Long.MAX_VALUE;
            this.f4250b = LocalCache.c();
            this.e = LocalCache.c();
            this.j = Long.MAX_VALUE;
            this.f4251c = LocalCache.c();
            this.d = LocalCache.c();
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return this.f4249a;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j) {
            this.f4249a = j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.f4250b;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f4250b = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.e;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.e = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return this.j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j) {
            this.j = j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.f4251c;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f4251c = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.d;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.d = referenceEntry;
        }
    }

    static class u<K, V> extends WeakReference<K> implements ReferenceEntry<K, V> {
        final int f;

        @CheckForNull
        final ReferenceEntry<K, V> g;
        volatile ValueReference<K, V> i;

        u(ReferenceQueue<K> referenceQueue, K k, int i, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
            super(k, referenceQueue);
            this.i = LocalCache.a();
            this.f = i;
            this.g = referenceEntry;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public K getKey() {
            return (K) get();
        }

        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        public void setAccessTime(long j) {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ValueReference<K, V> getValueReference() {
            return this.i;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(ValueReference<K, V> valueReference) {
            this.i = valueReference;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
            return this.f;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNext() {
            return this.g;
        }
    }

    static final class s<K, V> extends u<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ReferenceEntry<K, V> f4258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ReferenceEntry<K, V> f4259c;
        volatile long d;

        s(ReferenceQueue<K> referenceQueue, K k, int i, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k, i, referenceEntry);
            this.d = Long.MAX_VALUE;
            this.f4258b = LocalCache.c();
            this.f4259c = LocalCache.c();
        }

        @Override // com.google.common.cache.LocalCache.u, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return this.d;
        }

        @Override // com.google.common.cache.LocalCache.u, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j) {
            this.d = j;
        }

        @Override // com.google.common.cache.LocalCache.u, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.f4258b;
        }

        @Override // com.google.common.cache.LocalCache.u, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f4258b = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.u, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.f4259c;
        }

        @Override // com.google.common.cache.LocalCache.u, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f4259c = referenceEntry;
        }
    }

    static final class v<K, V> extends u<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ReferenceEntry<K, V> f4260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile long f4261b;
        ReferenceEntry<K, V> d;

        v(ReferenceQueue<K> referenceQueue, K k, int i, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k, i, referenceEntry);
            this.f4261b = Long.MAX_VALUE;
            this.d = LocalCache.c();
            this.f4260a = LocalCache.c();
        }

        @Override // com.google.common.cache.LocalCache.u, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return this.f4261b;
        }

        @Override // com.google.common.cache.LocalCache.u, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j) {
            this.f4261b = j;
        }

        @Override // com.google.common.cache.LocalCache.u, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.d;
        }

        @Override // com.google.common.cache.LocalCache.u, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.d = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.u, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.f4260a;
        }

        @Override // com.google.common.cache.LocalCache.u, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f4260a = referenceEntry;
        }
    }

    static final class y<K, V> extends u<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ReferenceEntry<K, V> f4263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ReferenceEntry<K, V> f4264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ReferenceEntry<K, V> f4265c;
        volatile long d;
        ReferenceEntry<K, V> e;
        volatile long j;

        y(ReferenceQueue<K> referenceQueue, K k, int i, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k, i, referenceEntry);
            this.d = Long.MAX_VALUE;
            this.e = LocalCache.c();
            this.f4264b = LocalCache.c();
            this.j = Long.MAX_VALUE;
            this.f4263a = LocalCache.c();
            this.f4265c = LocalCache.c();
        }

        @Override // com.google.common.cache.LocalCache.u, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return this.d;
        }

        @Override // com.google.common.cache.LocalCache.u, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j) {
            this.d = j;
        }

        @Override // com.google.common.cache.LocalCache.u, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.e;
        }

        @Override // com.google.common.cache.LocalCache.u, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.e = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.u, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.f4264b;
        }

        @Override // com.google.common.cache.LocalCache.u, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f4264b = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.u, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return this.j;
        }

        @Override // com.google.common.cache.LocalCache.u, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j) {
            this.j = j;
        }

        @Override // com.google.common.cache.LocalCache.u, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.f4263a;
        }

        @Override // com.google.common.cache.LocalCache.u, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f4263a = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.u, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.f4265c;
        }

        @Override // com.google.common.cache.LocalCache.u, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.f4265c = referenceEntry;
        }
    }

    static class x<K, V> extends WeakReference<V> implements ValueReference<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ReferenceEntry<K, V> f4262b;

        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V v) {
        }

        x(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            super(v, referenceQueue);
            this.f4262b = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<K, V> getEntry() {
            return this.f4262b;
        }

        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return new x(referenceQueue, v, referenceEntry);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
            return get();
        }
    }

    static class m<K, V> extends SoftReference<V> implements ValueReference<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ReferenceEntry<K, V> f4252a;

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V v) {
        }

        m(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            super(v, referenceQueue);
            this.f4252a = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<K, V> getEntry() {
            return this.f4252a;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return new m(referenceQueue, v, referenceEntry);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
            return get();
        }
    }

    static class r<K, V> implements ValueReference<K, V> {
        final V d;

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<K, V> getEntry() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V v) {
        }

        r(V v) {
            this.d = v;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V get() {
            return this.d;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() {
            return get();
        }
    }

    static final class ab<K, V> extends x<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f4233a;

        ab(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry, int i) {
            super(referenceQueue, v, referenceEntry);
            this.f4233a = i;
        }

        @Override // com.google.common.cache.LocalCache.x, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return this.f4233a;
        }

        @Override // com.google.common.cache.LocalCache.x, com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return new ab(referenceQueue, v, referenceEntry, this.f4233a);
        }
    }

    static final class w<K, V> extends m<K, V> {
        final int e;

        w(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry, int i) {
            super(referenceQueue, v, referenceEntry);
            this.e = i;
        }

        @Override // com.google.common.cache.LocalCache.m, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return this.e;
        }

        @Override // com.google.common.cache.LocalCache.m, com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return new w(referenceQueue, v, referenceEntry, this.e);
        }
    }

    static final class ac<K, V> extends r<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f4234a;

        ac(V v, int i) {
            super(v);
            this.f4234a = i;
        }

        @Override // com.google.common.cache.LocalCache.r, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return this.f4234a;
        }
    }

    int a(@CheckForNull Object obj) {
        return a(this.l.hash(obj));
    }

    void c(ValueReference<K, V> valueReference) {
        ReferenceEntry<K, V> entry = valueReference.getEntry();
        int hash = entry.getHash();
        d(hash).a(entry.getKey(), hash, valueReference);
    }

    void c(ReferenceEntry<K, V> referenceEntry) {
        int hash = referenceEntry.getHash();
        d(hash).d((ReferenceEntry) referenceEntry, hash);
    }

    o<K, V> d(int i2) {
        return this.p[(i2 >>> this.s) & this.t];
    }

    o<K, V> d(int i2, long j2, AbstractCache.StatsCounter statsCounter) {
        return new o<>(this, i2, j2, statsCounter);
    }

    @CheckForNull
    V c(ReferenceEntry<K, V> referenceEntry, long j2) {
        V v2;
        if (referenceEntry.getKey() == null || (v2 = referenceEntry.getValueReference().get()) == null || a(referenceEntry, j2)) {
            return null;
        }
        return v2;
    }

    boolean a(ReferenceEntry<K, V> referenceEntry, long j2) {
        Preconditions.checkNotNull(referenceEntry);
        if (!f() || j2 - referenceEntry.getAccessTime() < this.g) {
            return h() && j2 - referenceEntry.getWriteTime() >= this.j;
        }
        return true;
    }

    static <K, V> void b(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        referenceEntry.setNextInAccessQueue(referenceEntry2);
        referenceEntry2.setPreviousInAccessQueue(referenceEntry);
    }

    static <K, V> void a(ReferenceEntry<K, V> referenceEntry) {
        ReferenceEntry<K, V> referenceEntryC = c();
        referenceEntry.setNextInAccessQueue(referenceEntryC);
        referenceEntry.setPreviousInAccessQueue(referenceEntryC);
    }

    static <K, V> void c(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        referenceEntry.setNextInWriteQueue(referenceEntry2);
        referenceEntry2.setPreviousInWriteQueue(referenceEntry);
    }

    static <K, V> void e(ReferenceEntry<K, V> referenceEntry) {
        ReferenceEntry<K, V> referenceEntryC = c();
        referenceEntry.setNextInWriteQueue(referenceEntryC);
        referenceEntry.setPreviousInWriteQueue(referenceEntryC);
    }

    void j() {
        while (true) {
            aju<K, V> ajuVarPoll = this.q.poll();
            if (ajuVarPoll == null) {
                return;
            }
            try {
                this.r.onRemoval(ajuVarPoll);
            } catch (Throwable th) {
                d.log(Level.WARNING, "Exception thrown by removal listener", th);
            }
        }
    }

    final o<K, V>[] e(int i2) {
        return new o[i2];
    }

    public static class o<K, V> extends ReentrantLock {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f4253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Queue<ReferenceEntry<K, V>> f4254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final LocalCache<K, V> f4255c;

        @CheckForNull
        final ReferenceQueue<K> d;
        volatile int e;

        @CheckForNull
        volatile AtomicReferenceArray<ReferenceEntry<K, V>> f;
        final AbstractCache.StatsCounter g;
        final AtomicInteger h = new AtomicInteger();
        int i;
        final Queue<ReferenceEntry<K, V>> j;
        final Queue<ReferenceEntry<K, V>> k;

        @CheckForNull
        final ReferenceQueue<V> l;
        long m;
        int n;

        o(LocalCache<K, V> localCache, int i, long j, AbstractCache.StatsCounter statsCounter) {
            this.f4255c = localCache;
            this.f4253a = j;
            this.g = (AbstractCache.StatsCounter) Preconditions.checkNotNull(statsCounter);
            a(c(i));
            this.d = localCache.q() ? new ReferenceQueue<>() : null;
            this.l = localCache.t() ? new ReferenceQueue<>() : null;
            this.j = localCache.r() ? new ConcurrentLinkedQueue<>() : LocalCache.d();
            this.k = localCache.s() ? new aa<>() : LocalCache.d();
            this.f4254b = localCache.r() ? new e<>() : LocalCache.d();
        }

        AtomicReferenceArray<ReferenceEntry<K, V>> c(int i) {
            return new AtomicReferenceArray<>(i);
        }

        void a(AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray) {
            this.n = (atomicReferenceArray.length() * 3) / 4;
            if (!this.f4255c.b()) {
                int i = this.n;
                if (i == this.f4253a) {
                    this.n = i + 1;
                }
            }
            this.f = atomicReferenceArray;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        ReferenceEntry<K, V> b(K k, int i, @CheckForNull ReferenceEntry<K, V> referenceEntry) {
            return this.f4255c.i.newEntry(this, Preconditions.checkNotNull(k), i, referenceEntry);
        }

        @CheckForNull
        ReferenceEntry<K, V> e(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            K key = referenceEntry.getKey();
            if (key == null) {
                return null;
            }
            ValueReference<K, V> valueReference = referenceEntry.getValueReference();
            V v = valueReference.get();
            if (v == null && valueReference.isActive()) {
                return null;
            }
            ReferenceEntry<K, V> referenceEntryCopyEntry = this.f4255c.i.copyEntry(this, referenceEntry, referenceEntry2, key);
            referenceEntryCopyEntry.setValueReference(valueReference.copyFor(this.l, v, referenceEntryCopyEntry));
            return referenceEntryCopyEntry;
        }

        void d(ReferenceEntry<K, V> referenceEntry, K k, V v, long j) {
            ValueReference<K, V> valueReference = referenceEntry.getValueReference();
            int iWeigh = this.f4255c.v.weigh(k, v);
            Preconditions.checkState(iWeigh >= 0, "Weights must be non-negative");
            referenceEntry.setValueReference(this.f4255c.w.referenceValue(this, referenceEntry, v, iWeigh));
            d(referenceEntry, iWeigh, j);
            valueReference.notifyNewValue(v);
        }

        V e(K k, int i, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            ReferenceEntry<K, V> referenceEntryB;
            Preconditions.checkNotNull(k);
            Preconditions.checkNotNull(cacheLoader);
            try {
                try {
                    if (this.e != 0 && (referenceEntryB = b(k, i)) != null) {
                        long j = this.f4255c.y.read();
                        V vD = d(referenceEntryB, j);
                        if (vD != null) {
                            e(referenceEntryB, j);
                            this.g.recordHits(1);
                            V vC = c(referenceEntryB, k, i, vD, j, cacheLoader);
                            k();
                            return vC;
                        }
                        ValueReference<K, V> valueReference = referenceEntryB.getValueReference();
                        if (valueReference.isLoading()) {
                            V vD2 = d(referenceEntryB, k, valueReference);
                            k();
                            return vD2;
                        }
                    }
                    V vB = b((Object) k, i, (CacheLoader) cacheLoader);
                    k();
                    return vB;
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    if (cause instanceof Error) {
                        throw new aqp((Error) cause);
                    }
                    if (cause instanceof RuntimeException) {
                        throw new arn(cause);
                    }
                    throw e;
                }
            } catch (Throwable th) {
                k();
                throw th;
            }
        }

        @CheckForNull
        V d(Object obj, int i) {
            try {
                if (this.e != 0) {
                    long j = this.f4255c.y.read();
                    ReferenceEntry<K, V> referenceEntryE = e(obj, i, j);
                    if (referenceEntryE == null) {
                        return null;
                    }
                    V v = referenceEntryE.getValueReference().get();
                    if (v != null) {
                        e(referenceEntryE, j);
                        return c(referenceEntryE, referenceEntryE.getKey(), i, v, j, this.f4255c.f4228c);
                    }
                    l();
                }
                return null;
            } finally {
                k();
            }
        }

        V b(K k, int i, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            h<K, V> hVar;
            boolean z;
            ValueReference<K, V> valueReference;
            lock();
            try {
                long j = this.f4255c.y.read();
                e(j);
                int i2 = this.e;
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f;
                int length = i & (atomicReferenceArray.length() - 1);
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry<K, V> referenceEntryB = referenceEntry;
                while (true) {
                    hVar = null;
                    if (referenceEntryB == null) {
                        z = true;
                        valueReference = null;
                        break;
                    }
                    K key = referenceEntryB.getKey();
                    if (referenceEntryB.getHash() != i || key == null || !this.f4255c.l.equivalent(k, key)) {
                        referenceEntryB = referenceEntryB.getNext();
                    } else {
                        ValueReference<K, V> valueReference2 = referenceEntryB.getValueReference();
                        if (valueReference2.isLoading()) {
                            z = false;
                        } else {
                            V v = valueReference2.get();
                            if (v == null) {
                                a(key, i, v, valueReference2.getWeight(), RemovalCause.COLLECTED);
                            } else if (this.f4255c.a(referenceEntryB, j)) {
                                a(key, i, v, valueReference2.getWeight(), RemovalCause.EXPIRED);
                            } else {
                                b(referenceEntryB, j);
                                this.g.recordHits(1);
                                unlock();
                                n();
                                return v;
                            }
                            this.k.remove(referenceEntryB);
                            this.f4254b.remove(referenceEntryB);
                            this.e = i2 - 1;
                            z = true;
                        }
                        valueReference = valueReference2;
                        break;
                    }
                }
                if (z) {
                    hVar = new h<>();
                    if (referenceEntryB == null) {
                        referenceEntryB = b((Object) k, i, (ReferenceEntry) referenceEntry);
                        referenceEntryB.setValueReference(hVar);
                        atomicReferenceArray.set(length, referenceEntryB);
                    } else {
                        referenceEntryB.setValueReference(hVar);
                    }
                }
                unlock();
                n();
                if (z) {
                    try {
                        return d((Object) k, i, (h) hVar, (CacheLoader) cacheLoader);
                    } finally {
                        this.g.recordMisses(1);
                    }
                }
                return d(referenceEntryB, k, valueReference);
            } catch (Throwable th) {
                unlock();
                n();
                throw th;
            }
        }

        V d(ReferenceEntry<K, V> referenceEntry, K k, ValueReference<K, V> valueReference) throws ExecutionException {
            if (!valueReference.isLoading()) {
                throw new AssertionError();
            }
            if (valueReference instanceof h) {
                Preconditions.checkState(((h) valueReference).a() != Thread.currentThread(), "Recursive load of: %s", k);
            }
            try {
                V vWaitForValue = valueReference.waitForValue();
                if (vWaitForValue == null) {
                    throw new CacheLoader.b("CacheLoader returned null for key " + k + ".");
                }
                e(referenceEntry, this.f4255c.y.read());
                this.g.recordMisses(1);
                return vWaitForValue;
            } catch (Throwable th) {
                this.g.recordMisses(1);
                throw th;
            }
        }

        V d(K k, int i, h<K, V> hVar, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            return c(k, i, hVar, hVar.b(k, cacheLoader));
        }

        ListenableFuture<V> a(final K k, final int i, final h<K, V> hVar, CacheLoader<? super K, V> cacheLoader) {
            final ListenableFuture<V> listenableFutureB = hVar.b(k, cacheLoader);
            listenableFutureB.addListener(new Runnable() { // from class: ajv
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b(k, i, hVar, listenableFutureB);
                }
            }, aqx.e());
            return listenableFutureB;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ void b(Object obj, int i, h hVar, ListenableFuture listenableFuture) {
            try {
                c(obj, i, hVar, listenableFuture);
            } catch (Throwable th) {
                LocalCache.d.log(Level.WARNING, "Exception thrown during refresh", th);
                hVar.b(th);
            }
        }

        V c(K k, int i, h<K, V> hVar, ListenableFuture<V> listenableFuture) throws Throwable {
            V v;
            try {
                v = (V) aro.d(listenableFuture);
                try {
                    if (v == null) {
                        throw new CacheLoader.b("CacheLoader returned null for key " + k + ".");
                    }
                    this.g.recordLoadSuccess(hVar.b());
                    d(k, i, hVar, v);
                    if (v == null) {
                        this.g.recordLoadException(hVar.b());
                        c(k, i, hVar);
                    }
                    return v;
                } catch (Throwable th) {
                    th = th;
                    if (v == null) {
                        this.g.recordLoadException(hVar.b());
                        c(k, i, hVar);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                v = null;
            }
        }

        V c(ReferenceEntry<K, V> referenceEntry, K k, int i, V v, long j, CacheLoader<? super K, V> cacheLoader) {
            V vA;
            return (!this.f4255c.l() || j - referenceEntry.getWriteTime() <= this.f4255c.n || referenceEntry.getValueReference().isLoading() || (vA = a((Object) k, i, (CacheLoader) cacheLoader, true)) == null) ? v : vA;
        }

        @CheckForNull
        V a(K k, int i, CacheLoader<? super K, V> cacheLoader, boolean z) {
            h<K, V> hVarC = c(k, i, z);
            if (hVarC == null) {
                return null;
            }
            ListenableFuture<V> listenableFutureA = a(k, i, hVarC, cacheLoader);
            if (listenableFutureA.isDone()) {
                try {
                    return (V) aro.d(listenableFutureA);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        @CheckForNull
        h<K, V> c(K k, int i, boolean z) {
            lock();
            try {
                long j = this.f4255c.y.read();
                e(j);
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f;
                int length = (atomicReferenceArray.length() - 1) & i;
                ReferenceEntry<K, V> referenceEntry = (ReferenceEntry) atomicReferenceArray.get(length);
                for (ReferenceEntry next = referenceEntry; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.getHash() == i && key != null && this.f4255c.l.equivalent(k, key)) {
                        ValueReference<K, V> valueReference = next.getValueReference();
                        if (!valueReference.isLoading() && (!z || j - next.getWriteTime() >= this.f4255c.n)) {
                            this.i++;
                            h<K, V> hVar = new h<>(valueReference);
                            next.setValueReference(hVar);
                            return hVar;
                        }
                        return null;
                    }
                }
                this.i++;
                h<K, V> hVar2 = new h<>();
                ReferenceEntry<K, V> referenceEntryB = b((Object) k, i, (ReferenceEntry) referenceEntry);
                referenceEntryB.setValueReference(hVar2);
                atomicReferenceArray.set(length, referenceEntryB);
                return hVar2;
            } finally {
                unlock();
                n();
            }
        }

        void l() {
            if (tryLock()) {
                try {
                    h();
                } finally {
                    unlock();
                }
            }
        }

        void h() {
            if (this.f4255c.q()) {
                j();
            }
            if (this.f4255c.t()) {
                g();
            }
        }

        void j() {
            int i = 0;
            do {
                Reference<? extends K> referencePoll = this.d.poll();
                if (referencePoll == null) {
                    return;
                }
                this.f4255c.c((ReferenceEntry) referencePoll);
                i++;
            } while (i != 16);
        }

        void g() {
            int i = 0;
            do {
                Reference<? extends V> referencePoll = this.l.poll();
                if (referencePoll == null) {
                    return;
                }
                this.f4255c.c((ValueReference) referencePoll);
                i++;
            } while (i != 16);
        }

        void d() {
            if (this.f4255c.q()) {
                a();
            }
            if (this.f4255c.t()) {
                e();
            }
        }

        void a() {
            while (this.d.poll() != null) {
            }
        }

        void e() {
            while (this.l.poll() != null) {
            }
        }

        void e(ReferenceEntry<K, V> referenceEntry, long j) {
            if (this.f4255c.k()) {
                referenceEntry.setAccessTime(j);
            }
            this.j.add(referenceEntry);
        }

        void b(ReferenceEntry<K, V> referenceEntry, long j) {
            if (this.f4255c.k()) {
                referenceEntry.setAccessTime(j);
            }
            this.f4254b.add(referenceEntry);
        }

        void d(ReferenceEntry<K, V> referenceEntry, int i, long j) {
            f();
            this.m += (long) i;
            if (this.f4255c.k()) {
                referenceEntry.setAccessTime(j);
            }
            if (this.f4255c.n()) {
                referenceEntry.setWriteTime(j);
            }
            this.f4254b.add(referenceEntry);
            this.k.add(referenceEntry);
        }

        void f() {
            while (true) {
                ReferenceEntry<K, V> referenceEntryPoll = this.j.poll();
                if (referenceEntryPoll == null) {
                    return;
                }
                if (this.f4254b.contains(referenceEntryPoll)) {
                    this.f4254b.add(referenceEntryPoll);
                }
            }
        }

        void d(long j) {
            if (tryLock()) {
                try {
                    c(j);
                } finally {
                    unlock();
                }
            }
        }

        void c(long j) {
            ReferenceEntry<K, V> referenceEntryPeek;
            ReferenceEntry<K, V> referenceEntryPeek2;
            f();
            do {
                referenceEntryPeek = this.k.peek();
                if (referenceEntryPeek == null || !this.f4255c.a(referenceEntryPeek, j)) {
                    do {
                        referenceEntryPeek2 = this.f4254b.peek();
                        if (referenceEntryPeek2 == null || !this.f4255c.a(referenceEntryPeek2, j)) {
                            return;
                        }
                    } while (a(referenceEntryPeek2, referenceEntryPeek2.getHash(), RemovalCause.EXPIRED));
                    throw new AssertionError();
                }
            } while (a(referenceEntryPeek, referenceEntryPeek.getHash(), RemovalCause.EXPIRED));
            throw new AssertionError();
        }

        void a(@CheckForNull K k, int i, @CheckForNull V v, int i2, RemovalCause removalCause) {
            this.m -= (long) i2;
            if (removalCause.wasEvicted()) {
                this.g.recordEviction();
            }
            if (this.f4255c.q != LocalCache.e) {
                this.f4255c.q.offer(aju.e(k, v, removalCause));
            }
        }

        void b(ReferenceEntry<K, V> referenceEntry) {
            if (this.f4255c.g()) {
                f();
                if (referenceEntry.getValueReference().getWeight() > this.f4253a && !a(referenceEntry, referenceEntry.getHash(), RemovalCause.SIZE)) {
                    throw new AssertionError();
                }
                while (this.m > this.f4253a) {
                    ReferenceEntry<K, V> referenceEntryM = m();
                    if (!a(referenceEntryM, referenceEntryM.getHash(), RemovalCause.SIZE)) {
                        throw new AssertionError();
                    }
                }
            }
        }

        ReferenceEntry<K, V> m() {
            for (ReferenceEntry<K, V> referenceEntry : this.f4254b) {
                if (referenceEntry.getValueReference().getWeight() > 0) {
                    return referenceEntry;
                }
            }
            throw new AssertionError();
        }

        ReferenceEntry<K, V> e(int i) {
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f;
            return atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        @CheckForNull
        ReferenceEntry<K, V> b(Object obj, int i) {
            for (ReferenceEntry<K, V> referenceEntryE = e(i); referenceEntryE != null; referenceEntryE = referenceEntryE.getNext()) {
                if (referenceEntryE.getHash() == i) {
                    K key = referenceEntryE.getKey();
                    if (key == null) {
                        l();
                    } else if (this.f4255c.l.equivalent(obj, key)) {
                        return referenceEntryE;
                    }
                }
            }
            return null;
        }

        @CheckForNull
        ReferenceEntry<K, V> e(Object obj, int i, long j) {
            ReferenceEntry<K, V> referenceEntryB = b(obj, i);
            if (referenceEntryB == null) {
                return null;
            }
            if (!this.f4255c.a(referenceEntryB, j)) {
                return referenceEntryB;
            }
            d(j);
            return null;
        }

        V d(ReferenceEntry<K, V> referenceEntry, long j) {
            if (referenceEntry.getKey() == null) {
                l();
                return null;
            }
            V v = referenceEntry.getValueReference().get();
            if (v == null) {
                l();
                return null;
            }
            if (!this.f4255c.a(referenceEntry, j)) {
                return v;
            }
            d(j);
            return null;
        }

        boolean c(Object obj, int i) {
            try {
                if (this.e == 0) {
                    return false;
                }
                ReferenceEntry<K, V> referenceEntryE = e(obj, i, this.f4255c.y.read());
                if (referenceEntryE == null) {
                    return false;
                }
                return referenceEntryE.getValueReference().get() != null;
            } finally {
                k();
            }
        }

        @CheckForNull
        V e(K k, int i, V v, boolean z) {
            int i2;
            lock();
            try {
                long j = this.f4255c.y.read();
                e(j);
                if (this.e + 1 > this.n) {
                    i();
                }
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f;
                int length = i & (atomicReferenceArray.length() - 1);
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                for (ReferenceEntry<K, V> next = referenceEntry; next != null; next = next.getNext()) {
                    K key = next.getKey();
                    if (next.getHash() == i && key != null && this.f4255c.l.equivalent(k, key)) {
                        ValueReference<K, V> valueReference = next.getValueReference();
                        V v2 = valueReference.get();
                        if (v2 != null) {
                            if (z) {
                                b(next, j);
                            } else {
                                this.i++;
                                a(k, i, v2, valueReference.getWeight(), RemovalCause.REPLACED);
                                d(next, k, v, j);
                                b(next);
                            }
                            return v2;
                        }
                        this.i++;
                        if (valueReference.isActive()) {
                            a(k, i, v2, valueReference.getWeight(), RemovalCause.COLLECTED);
                            d(next, k, v, j);
                            i2 = this.e;
                        } else {
                            d(next, k, v, j);
                            i2 = this.e + 1;
                        }
                        this.e = i2;
                        b(next);
                        return null;
                    }
                }
                this.i++;
                ReferenceEntry<K, V> referenceEntryB = b((Object) k, i, (ReferenceEntry) referenceEntry);
                d(referenceEntryB, k, v, j);
                atomicReferenceArray.set(length, referenceEntryB);
                this.e++;
                b(referenceEntryB);
                return null;
            } finally {
                unlock();
                n();
            }
        }

        void i() {
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.e;
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArrayC = c(length << 1);
            this.n = (atomicReferenceArrayC.length() * 3) / 4;
            int length2 = atomicReferenceArrayC.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                ReferenceEntry<K, V> next = atomicReferenceArray.get(i2);
                if (next != null) {
                    ReferenceEntry<K, V> next2 = next.getNext();
                    int hash = next.getHash() & length2;
                    if (next2 == null) {
                        atomicReferenceArrayC.set(hash, next);
                    } else {
                        ReferenceEntry<K, V> referenceEntry = next;
                        while (next2 != null) {
                            int hash2 = next2.getHash() & length2;
                            if (hash2 != hash) {
                                referenceEntry = next2;
                                hash = hash2;
                            }
                            next2 = next2.getNext();
                        }
                        atomicReferenceArrayC.set(hash, referenceEntry);
                        while (next != referenceEntry) {
                            int hash3 = next.getHash() & length2;
                            ReferenceEntry<K, V> referenceEntryE = e(next, atomicReferenceArrayC.get(hash3));
                            if (referenceEntryE != null) {
                                atomicReferenceArrayC.set(hash3, referenceEntryE);
                            } else {
                                a(next);
                                i--;
                            }
                            next = next.getNext();
                        }
                    }
                }
            }
            this.f = atomicReferenceArrayC;
            this.e = i;
        }

        boolean b(K k, int i, V v, V v2) {
            lock();
            try {
                long j = this.f4255c.y.read();
                e(j);
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f;
                int length = i & (atomicReferenceArray.length() - 1);
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                for (ReferenceEntry<K, V> next = referenceEntry; next != null; next = next.getNext()) {
                    K key = next.getKey();
                    if (next.getHash() == i && key != null) {
                        if (this.f4255c.l.equivalent(k, key)) {
                            ValueReference<K, V> valueReference = next.getValueReference();
                            V v3 = valueReference.get();
                            if (v3 == null) {
                                if (!valueReference.isActive()) {
                                    break;
                                }
                                this.i++;
                                ReferenceEntry<K, V> referenceEntryD = d(referenceEntry, next, key, i, v3, valueReference, RemovalCause.COLLECTED);
                                int i2 = this.e;
                                atomicReferenceArray.set(length, referenceEntryD);
                                this.e = i2 - 1;
                                break;
                            }
                            if (this.f4255c.u.equivalent(v, v3)) {
                                this.i++;
                                a(k, i, v3, valueReference.getWeight(), RemovalCause.REPLACED);
                                d(next, k, v2, j);
                                b(next);
                                return true;
                            }
                            b(next, j);
                            break;
                        }
                    }
                }
                return false;
            } finally {
                unlock();
                n();
            }
        }

        @CheckForNull
        V b(K k, int i, V v) {
            lock();
            try {
                long j = this.f4255c.y.read();
                e(j);
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f;
                int length = i & (atomicReferenceArray.length() - 1);
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                for (ReferenceEntry<K, V> next = referenceEntry; next != null; next = next.getNext()) {
                    K key = next.getKey();
                    if (next.getHash() == i && key != null) {
                        if (this.f4255c.l.equivalent(k, key)) {
                            ValueReference<K, V> valueReference = next.getValueReference();
                            V v2 = valueReference.get();
                            if (v2 == null) {
                                if (!valueReference.isActive()) {
                                    break;
                                }
                                this.i++;
                                ReferenceEntry<K, V> referenceEntryD = d(referenceEntry, next, key, i, v2, valueReference, RemovalCause.COLLECTED);
                                int i2 = this.e;
                                atomicReferenceArray.set(length, referenceEntryD);
                                this.e = i2 - 1;
                                break;
                            }
                            this.i++;
                            a(k, i, v2, valueReference.getWeight(), RemovalCause.REPLACED);
                            d(next, k, v, j);
                            b(next);
                            return v2;
                        }
                    }
                }
                return null;
            } finally {
                unlock();
                n();
            }
        }

        @CheckForNull
        V e(Object obj, int i) {
            RemovalCause removalCause;
            lock();
            try {
                e(this.f4255c.y.read());
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f;
                int length = (atomicReferenceArray.length() - 1) & i;
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                for (ReferenceEntry<K, V> next = referenceEntry; next != null; next = next.getNext()) {
                    K key = next.getKey();
                    if (next.getHash() == i && key != null && this.f4255c.l.equivalent(obj, key)) {
                        ValueReference<K, V> valueReference = next.getValueReference();
                        V v = valueReference.get();
                        if (v != null) {
                            removalCause = RemovalCause.EXPLICIT;
                        } else {
                            if (!valueReference.isActive()) {
                                break;
                            }
                            removalCause = RemovalCause.COLLECTED;
                        }
                        RemovalCause removalCause2 = removalCause;
                        this.i++;
                        ReferenceEntry<K, V> referenceEntryD = d(referenceEntry, next, key, i, v, valueReference, removalCause2);
                        int i2 = this.e;
                        atomicReferenceArray.set(length, referenceEntryD);
                        this.e = i2 - 1;
                        return v;
                    }
                }
                return null;
            } finally {
                unlock();
                n();
            }
        }

        boolean d(Object obj, int i, Object obj2) {
            RemovalCause removalCause;
            lock();
            try {
                e(this.f4255c.y.read());
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f;
                int length = (atomicReferenceArray.length() - 1) & i;
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                for (ReferenceEntry<K, V> next = referenceEntry; next != null; next = next.getNext()) {
                    K key = next.getKey();
                    if (next.getHash() == i && key != null && this.f4255c.l.equivalent(obj, key)) {
                        ValueReference<K, V> valueReference = next.getValueReference();
                        V v = valueReference.get();
                        if (this.f4255c.u.equivalent(obj2, v)) {
                            removalCause = RemovalCause.EXPLICIT;
                        } else {
                            if (v != null || !valueReference.isActive()) {
                                break;
                                break;
                            }
                            removalCause = RemovalCause.COLLECTED;
                        }
                        this.i++;
                        ReferenceEntry<K, V> referenceEntryD = d(referenceEntry, next, key, i, v, valueReference, removalCause);
                        int i2 = this.e;
                        atomicReferenceArray.set(length, referenceEntryD);
                        this.e = i2 - 1;
                        return removalCause == RemovalCause.EXPLICIT;
                    }
                }
                return false;
            } finally {
                unlock();
                n();
            }
        }

        boolean d(K k, int i, h<K, V> hVar, V v) {
            lock();
            try {
                long j = this.f4255c.y.read();
                e(j);
                int i2 = this.e + 1;
                if (i2 > this.n) {
                    i();
                    i2 = this.e + 1;
                }
                int i3 = i2;
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f;
                int length = i & (atomicReferenceArray.length() - 1);
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                for (ReferenceEntry<K, V> next = referenceEntry; next != null; next = next.getNext()) {
                    K key = next.getKey();
                    if (next.getHash() == i && key != null && this.f4255c.l.equivalent(k, key)) {
                        ValueReference<K, V> valueReference = next.getValueReference();
                        V v2 = valueReference.get();
                        if (hVar != valueReference && (v2 != null || valueReference == LocalCache.f4226a)) {
                            a(k, i, v, 0, RemovalCause.REPLACED);
                            return false;
                        }
                        this.i++;
                        if (hVar.isActive()) {
                            a(k, i, v2, hVar.getWeight(), v2 == null ? RemovalCause.COLLECTED : RemovalCause.REPLACED);
                            i3--;
                        }
                        d(next, k, v, j);
                        this.e = i3;
                        b(next);
                        return true;
                    }
                }
                this.i++;
                ReferenceEntry<K, V> referenceEntryB = b((Object) k, i, (ReferenceEntry) referenceEntry);
                d(referenceEntryB, k, v, j);
                atomicReferenceArray.set(length, referenceEntryB);
                this.e = i3;
                b(referenceEntryB);
                return true;
            } finally {
                unlock();
                n();
            }
        }

        void b() {
            if (this.e != 0) {
                lock();
                try {
                    e(this.f4255c.y.read());
                    AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        for (ReferenceEntry<K, V> next = atomicReferenceArray.get(i); next != null; next = next.getNext()) {
                            if (next.getValueReference().isActive()) {
                                K key = next.getKey();
                                V v = next.getValueReference().get();
                                a(key, next.getHash(), v, next.getValueReference().getWeight(), (key == null || v == null) ? RemovalCause.COLLECTED : RemovalCause.EXPLICIT);
                            }
                        }
                    }
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    d();
                    this.k.clear();
                    this.f4254b.clear();
                    this.h.set(0);
                    this.i++;
                    this.e = 0;
                } finally {
                    unlock();
                    n();
                }
            }
        }

        @CheckForNull
        ReferenceEntry<K, V> d(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, @CheckForNull K k, int i, V v, ValueReference<K, V> valueReference, RemovalCause removalCause) {
            a(k, i, v, valueReference.getWeight(), removalCause);
            this.k.remove(referenceEntry2);
            this.f4254b.remove(referenceEntry2);
            if (valueReference.isLoading()) {
                valueReference.notifyNewValue(null);
                return referenceEntry;
            }
            return c(referenceEntry, referenceEntry2);
        }

        @CheckForNull
        ReferenceEntry<K, V> c(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            int i = this.e;
            ReferenceEntry<K, V> next = referenceEntry2.getNext();
            while (referenceEntry != referenceEntry2) {
                ReferenceEntry<K, V> referenceEntryE = e(referenceEntry, next);
                if (referenceEntryE != null) {
                    next = referenceEntryE;
                } else {
                    a(referenceEntry);
                    i--;
                }
                referenceEntry = referenceEntry.getNext();
            }
            this.e = i;
            return next;
        }

        void a(ReferenceEntry<K, V> referenceEntry) {
            a(referenceEntry.getKey(), referenceEntry.getHash(), referenceEntry.getValueReference().get(), referenceEntry.getValueReference().getWeight(), RemovalCause.COLLECTED);
            this.k.remove(referenceEntry);
            this.f4254b.remove(referenceEntry);
        }

        boolean d(ReferenceEntry<K, V> referenceEntry, int i) {
            lock();
            try {
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f;
                int length = (atomicReferenceArray.length() - 1) & i;
                ReferenceEntry<K, V> referenceEntry2 = atomicReferenceArray.get(length);
                for (ReferenceEntry<K, V> next = referenceEntry2; next != null; next = next.getNext()) {
                    if (next == referenceEntry) {
                        this.i++;
                        ReferenceEntry<K, V> referenceEntryD = d(referenceEntry2, next, next.getKey(), i, next.getValueReference().get(), next.getValueReference(), RemovalCause.COLLECTED);
                        int i2 = this.e;
                        atomicReferenceArray.set(length, referenceEntryD);
                        this.e = i2 - 1;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
                n();
            }
        }

        boolean a(K k, int i, ValueReference<K, V> valueReference) {
            lock();
            try {
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f;
                int length = (atomicReferenceArray.length() - 1) & i;
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                for (ReferenceEntry<K, V> next = referenceEntry; next != null; next = next.getNext()) {
                    K key = next.getKey();
                    if (next.getHash() == i && key != null && this.f4255c.l.equivalent(k, key)) {
                        if (next.getValueReference() != valueReference) {
                            return false;
                        }
                        this.i++;
                        ReferenceEntry<K, V> referenceEntryD = d(referenceEntry, next, key, i, valueReference.get(), valueReference, RemovalCause.COLLECTED);
                        int i2 = this.e;
                        atomicReferenceArray.set(length, referenceEntryD);
                        this.e = i2 - 1;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    n();
                }
            }
        }

        boolean c(K k, int i, h<K, V> hVar) {
            lock();
            try {
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f;
                int length = (atomicReferenceArray.length() - 1) & i;
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                for (ReferenceEntry<K, V> next = referenceEntry; next != null; next = next.getNext()) {
                    K key = next.getKey();
                    if (next.getHash() == i && key != null && this.f4255c.l.equivalent(k, key)) {
                        if (next.getValueReference() != hVar) {
                            break;
                        }
                        if (hVar.isActive()) {
                            next.setValueReference(hVar.d());
                        } else {
                            atomicReferenceArray.set(length, c(referenceEntry, next));
                        }
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
                n();
            }
        }

        boolean a(ReferenceEntry<K, V> referenceEntry, int i, RemovalCause removalCause) {
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.f;
            int length = (atomicReferenceArray.length() - 1) & i;
            ReferenceEntry<K, V> referenceEntry2 = atomicReferenceArray.get(length);
            for (ReferenceEntry<K, V> next = referenceEntry2; next != null; next = next.getNext()) {
                if (next == referenceEntry) {
                    this.i++;
                    ReferenceEntry<K, V> referenceEntryD = d(referenceEntry2, next, next.getKey(), i, next.getValueReference().get(), next.getValueReference(), removalCause);
                    int i2 = this.e;
                    atomicReferenceArray.set(length, referenceEntryD);
                    this.e = i2 - 1;
                    return true;
                }
            }
            return false;
        }

        void k() {
            if ((this.h.incrementAndGet() & 63) == 0) {
                c();
            }
        }

        void e(long j) {
            b(j);
        }

        void n() {
            o();
        }

        void c() {
            b(this.f4255c.y.read());
            o();
        }

        void b(long j) {
            if (tryLock()) {
                try {
                    h();
                    c(j);
                    this.h.set(0);
                } finally {
                    unlock();
                }
            }
        }

        void o() {
            if (isHeldByCurrentThread()) {
                return;
            }
            this.f4255c.j();
        }
    }

    public static class h<K, V> implements ValueReference<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Stopwatch f4242a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final arb<V> f4243c;
        volatile ValueReference<K, V> d;
        final Thread e;

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, @CheckForNull V v, ReferenceEntry<K, V> referenceEntry) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<K, V> getEntry() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return true;
        }

        public h() {
            this(LocalCache.a());
        }

        public h(ValueReference<K, V> valueReference) {
            this.f4243c = arb.a();
            this.f4242a = Stopwatch.createUnstarted();
            this.d = valueReference;
            this.e = Thread.currentThread();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return this.d.isActive();
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return this.d.getWeight();
        }

        public boolean a(@CheckForNull V v) {
            return this.f4243c.set(v);
        }

        public boolean b(Throwable th) {
            return this.f4243c.setException(th);
        }

        private ListenableFuture<V> e(Throwable th) {
            return aqt.a(th);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(@CheckForNull V v) {
            if (v != null) {
                a(v);
            } else {
                this.d = LocalCache.a();
            }
        }

        public ListenableFuture<V> b(K k, CacheLoader<? super K, V> cacheLoader) {
            try {
                this.f4242a.start();
                V v = this.d.get();
                if (v == null) {
                    V vLoad = cacheLoader.load(k);
                    return a(vLoad) ? this.f4243c : aqt.a(vLoad);
                }
                ListenableFuture<V> listenableFutureReload = cacheLoader.reload(k, v);
                if (listenableFutureReload == null) {
                    return aqt.a((Object) null);
                }
                return aqt.d(listenableFutureReload, new Function() { // from class: ajq
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        return this.e.b(obj);
                    }
                }, aqx.e());
            } catch (Throwable th) {
                ListenableFuture<V> listenableFutureE = b(th) ? this.f4243c : e(th);
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return listenableFutureE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ Object b(Object obj) {
            a(obj);
            return obj;
        }

        public long b() {
            return this.f4242a.elapsed(TimeUnit.NANOSECONDS);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V waitForValue() throws ExecutionException {
            return (V) aro.d(this.f4243c);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V get() {
            return this.d.get();
        }

        public ValueReference<K, V> d() {
            return this.d;
        }

        Thread a() {
            return this.e;
        }
    }

    static final class aa<K, V> extends AbstractQueue<ReferenceEntry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ReferenceEntry<K, V> f4229b = new AbstractReferenceEntry<K, V>(this) { // from class: com.google.common.cache.LocalCache.aa.1

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            ReferenceEntry<K, V> f4231c = this;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            ReferenceEntry<K, V> f4230b = this;

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public long getWriteTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setWriteTime(long j) {
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public ReferenceEntry<K, V> getNextInWriteQueue() {
                return this.f4231c;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
                this.f4231c = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public ReferenceEntry<K, V> getPreviousInWriteQueue() {
                return this.f4230b;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
                this.f4230b = referenceEntry;
            }
        };

        aa() {
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean offer(ReferenceEntry<K, V> referenceEntry) {
            LocalCache.c(referenceEntry.getPreviousInWriteQueue(), referenceEntry.getNextInWriteQueue());
            LocalCache.c(this.f4229b.getPreviousInWriteQueue(), referenceEntry);
            LocalCache.c(referenceEntry, this.f4229b);
            return true;
        }

        @Override // java.util.Queue
        @CheckForNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ReferenceEntry<K, V> peek() {
            ReferenceEntry<K, V> nextInWriteQueue = this.f4229b.getNextInWriteQueue();
            if (nextInWriteQueue == this.f4229b) {
                return null;
            }
            return nextInWriteQueue;
        }

        @Override // java.util.Queue
        @CheckForNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public ReferenceEntry<K, V> poll() {
            ReferenceEntry<K, V> nextInWriteQueue = this.f4229b.getNextInWriteQueue();
            if (nextInWriteQueue == this.f4229b) {
                return null;
            }
            remove(nextInWriteQueue);
            return nextInWriteQueue;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry<K, V> previousInWriteQueue = referenceEntry.getPreviousInWriteQueue();
            ReferenceEntry<K, V> nextInWriteQueue = referenceEntry.getNextInWriteQueue();
            LocalCache.c(previousInWriteQueue, nextInWriteQueue);
            LocalCache.e(referenceEntry);
            return nextInWriteQueue != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((ReferenceEntry) obj).getNextInWriteQueue() != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f4229b.getNextInWriteQueue() == this.f4229b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i = 0;
            for (ReferenceEntry<K, V> nextInWriteQueue = this.f4229b.getNextInWriteQueue(); nextInWriteQueue != this.f4229b; nextInWriteQueue = nextInWriteQueue.getNextInWriteQueue()) {
                i++;
            }
            return i;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            ReferenceEntry<K, V> nextInWriteQueue = this.f4229b.getNextInWriteQueue();
            while (true) {
                ReferenceEntry<K, V> referenceEntry = this.f4229b;
                if (nextInWriteQueue != referenceEntry) {
                    ReferenceEntry<K, V> nextInWriteQueue2 = nextInWriteQueue.getNextInWriteQueue();
                    LocalCache.e(nextInWriteQueue);
                    nextInWriteQueue = nextInWriteQueue2;
                } else {
                    referenceEntry.setNextInWriteQueue(referenceEntry);
                    ReferenceEntry<K, V> referenceEntry2 = this.f4229b;
                    referenceEntry2.setPreviousInWriteQueue(referenceEntry2);
                    return;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<ReferenceEntry<K, V>> iterator() {
            return new AbstractSequentialIterator<ReferenceEntry<K, V>>(peek()) { // from class: com.google.common.cache.LocalCache.aa.3
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractSequentialIterator
                @CheckForNull
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public ReferenceEntry<K, V> computeNext(ReferenceEntry<K, V> referenceEntry) {
                    ReferenceEntry<K, V> nextInWriteQueue = referenceEntry.getNextInWriteQueue();
                    if (nextInWriteQueue == aa.this.f4229b) {
                        return null;
                    }
                    return nextInWriteQueue;
                }
            };
        }
    }

    static final class e<K, V> extends AbstractQueue<ReferenceEntry<K, V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ReferenceEntry<K, V> f4238c = new AbstractReferenceEntry<K, V>(this) { // from class: com.google.common.cache.LocalCache.e.3
            ReferenceEntry<K, V> e = this;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            ReferenceEntry<K, V> f4239b = this;

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public long getAccessTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setAccessTime(long j) {
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public ReferenceEntry<K, V> getNextInAccessQueue() {
                return this.e;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
                this.e = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public ReferenceEntry<K, V> getPreviousInAccessQueue() {
                return this.f4239b;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
                this.f4239b = referenceEntry;
            }
        };

        e() {
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean offer(ReferenceEntry<K, V> referenceEntry) {
            LocalCache.b(referenceEntry.getPreviousInAccessQueue(), referenceEntry.getNextInAccessQueue());
            LocalCache.b(this.f4238c.getPreviousInAccessQueue(), referenceEntry);
            LocalCache.b(referenceEntry, this.f4238c);
            return true;
        }

        @Override // java.util.Queue
        @CheckForNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public ReferenceEntry<K, V> peek() {
            ReferenceEntry<K, V> nextInAccessQueue = this.f4238c.getNextInAccessQueue();
            if (nextInAccessQueue == this.f4238c) {
                return null;
            }
            return nextInAccessQueue;
        }

        @Override // java.util.Queue
        @CheckForNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ReferenceEntry<K, V> poll() {
            ReferenceEntry<K, V> nextInAccessQueue = this.f4238c.getNextInAccessQueue();
            if (nextInAccessQueue == this.f4238c) {
                return null;
            }
            remove(nextInAccessQueue);
            return nextInAccessQueue;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry<K, V> previousInAccessQueue = referenceEntry.getPreviousInAccessQueue();
            ReferenceEntry<K, V> nextInAccessQueue = referenceEntry.getNextInAccessQueue();
            LocalCache.b(previousInAccessQueue, nextInAccessQueue);
            LocalCache.a(referenceEntry);
            return nextInAccessQueue != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((ReferenceEntry) obj).getNextInAccessQueue() != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f4238c.getNextInAccessQueue() == this.f4238c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i = 0;
            for (ReferenceEntry<K, V> nextInAccessQueue = this.f4238c.getNextInAccessQueue(); nextInAccessQueue != this.f4238c; nextInAccessQueue = nextInAccessQueue.getNextInAccessQueue()) {
                i++;
            }
            return i;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            ReferenceEntry<K, V> nextInAccessQueue = this.f4238c.getNextInAccessQueue();
            while (true) {
                ReferenceEntry<K, V> referenceEntry = this.f4238c;
                if (nextInAccessQueue != referenceEntry) {
                    ReferenceEntry<K, V> nextInAccessQueue2 = nextInAccessQueue.getNextInAccessQueue();
                    LocalCache.a((ReferenceEntry) nextInAccessQueue);
                    nextInAccessQueue = nextInAccessQueue2;
                } else {
                    referenceEntry.setNextInAccessQueue(referenceEntry);
                    ReferenceEntry<K, V> referenceEntry2 = this.f4238c;
                    referenceEntry2.setPreviousInAccessQueue(referenceEntry2);
                    return;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<ReferenceEntry<K, V>> iterator() {
            return new AbstractSequentialIterator<ReferenceEntry<K, V>>(peek()) { // from class: com.google.common.cache.LocalCache.e.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractSequentialIterator
                @CheckForNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public ReferenceEntry<K, V> computeNext(ReferenceEntry<K, V> referenceEntry) {
                    ReferenceEntry<K, V> nextInAccessQueue = referenceEntry.getNextInAccessQueue();
                    if (nextInAccessQueue == e.this.f4238c) {
                        return null;
                    }
                    return nextInAccessQueue;
                }
            };
        }
    }

    public void e() {
        for (o<K, V> oVar : this.p) {
            oVar.c();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        o<K, V>[] oVarArr = this.p;
        long j2 = 0;
        for (o<K, V> oVar : oVarArr) {
            if (oVar.e != 0) {
                return false;
            }
            j2 += (long) oVar.i;
        }
        if (j2 == 0) {
            return true;
        }
        for (o<K, V> oVar2 : oVarArr) {
            if (oVar2.e != 0) {
                return false;
            }
            j2 -= (long) oVar2.i;
        }
        return j2 == 0;
    }

    long i() {
        long jMax = 0;
        for (o<K, V> oVar : this.p) {
            jMax += (long) Math.max(0, oVar.e);
        }
        return jMax;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return Ints.a(i());
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        if (obj == null) {
            return null;
        }
        int iA = a(obj);
        return d(iA).d(obj, iA);
    }

    V d(K k2, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
        int iA = a(Preconditions.checkNotNull(k2));
        return d(iA).e(k2, iA, cacheLoader);
    }

    @CheckForNull
    public V d(Object obj) {
        int iA = a(Preconditions.checkNotNull(obj));
        V vD = d(iA).d(obj, iA);
        if (vD == null) {
            this.f.recordMisses(1);
            return vD;
        }
        this.f.recordHits(1);
        return vD;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CheckForNull
    public V getOrDefault(@CheckForNull Object obj, @CheckForNull V v2) {
        V v3 = get(obj);
        return v3 != null ? v3 : v2;
    }

    V b(K k2) throws ExecutionException {
        return d(k2, this.f4228c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    ImmutableMap<K, V> a(Iterable<?> iterable) {
        ImmutableMap.b bVarBuilder = ImmutableMap.builder();
        int i2 = 0;
        int i3 = 0;
        for (Object obj : iterable) {
            V v2 = get(obj);
            if (v2 == null) {
                i3++;
            } else {
                bVarBuilder.c(obj, v2);
                i2++;
            }
        }
        this.f.recordHits(i2);
        this.f.recordMisses(i3);
        return bVarBuilder.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    ImmutableMap<K, V> e(Iterable<? extends K> iterable) throws ExecutionException {
        LinkedHashMap linkedHashMapC = Maps.c();
        LinkedHashSet linkedHashSetB = Sets.b();
        int i2 = 0;
        int i3 = 0;
        for (K k2 : iterable) {
            Object obj = get(k2);
            if (!linkedHashMapC.containsKey(k2)) {
                linkedHashMapC.put(k2, obj);
                if (obj == null) {
                    i2++;
                    linkedHashSetB.add(k2);
                } else {
                    i3++;
                }
            }
        }
        try {
            if (!linkedHashSetB.isEmpty()) {
                try {
                    Map mapC = c(Collections.unmodifiableSet(linkedHashSetB), this.f4228c);
                    for (Object obj2 : linkedHashSetB) {
                        Object obj3 = mapC.get(obj2);
                        if (obj3 == null) {
                            throw new CacheLoader.b("loadAll failed to return a value for " + obj2);
                        }
                        linkedHashMapC.put(obj2, obj3);
                    }
                } catch (CacheLoader.e unused) {
                    for (Object obj4 : linkedHashSetB) {
                        i2--;
                        linkedHashMapC.put(obj4, d(obj4, this.f4228c));
                    }
                }
            }
            ImmutableMap<K, V> immutableMapCopyOf = ImmutableMap.copyOf((Map) linkedHashMapC);
            this.f.recordHits(i3);
            this.f.recordMisses(i2);
            return immutableMapCopyOf;
        } catch (Throwable th) {
            this.f.recordHits(i3);
            this.f.recordMisses(i2);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    @CheckForNull
    Map<K, V> c(Set<? extends K> set, CacheLoader<? super K, V> cacheLoader) throws Throwable {
        Preconditions.checkNotNull(cacheLoader);
        Preconditions.checkNotNull(set);
        Stopwatch stopwatchCreateStarted = Stopwatch.createStarted();
        boolean z = true;
        boolean z2 = false;
        try {
            try {
                try {
                    Map<? super K, V> mapLoadAll = cacheLoader.loadAll(set);
                    if (mapLoadAll == null) {
                        this.f.recordLoadException(stopwatchCreateStarted.elapsed(TimeUnit.NANOSECONDS));
                        throw new CacheLoader.b(cacheLoader + " returned null map from loadAll");
                    }
                    stopwatchCreateStarted.stop();
                    for (Map.Entry<K, V> entry : mapLoadAll.entrySet()) {
                        K key = entry.getKey();
                        V value = entry.getValue();
                        if (key == null || value == null) {
                            z2 = true;
                        } else {
                            put(key, value);
                        }
                    }
                    if (z2) {
                        this.f.recordLoadException(stopwatchCreateStarted.elapsed(TimeUnit.NANOSECONDS));
                        throw new CacheLoader.b(cacheLoader + " returned null keys or values from loadAll");
                    }
                    this.f.recordLoadSuccess(stopwatchCreateStarted.elapsed(TimeUnit.NANOSECONDS));
                    return mapLoadAll;
                } catch (RuntimeException e2) {
                    throw new arn(e2);
                } catch (Exception e3) {
                    throw new ExecutionException(e3);
                }
            } catch (CacheLoader.e e4) {
                try {
                    throw e4;
                } catch (Throwable th) {
                    th = th;
                    if (!z) {
                        this.f.recordLoadException(stopwatchCreateStarted.elapsed(TimeUnit.NANOSECONDS));
                    }
                    throw th;
                }
            } catch (Error e5) {
                throw new aqp(e5);
            } catch (InterruptedException e6) {
                Thread.currentThread().interrupt();
                throw new ExecutionException(e6);
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
            if (!z) {
                this.f.recordLoadException(stopwatchCreateStarted.elapsed(TimeUnit.NANOSECONDS));
            }
            throw th;
        }
    }

    void c(K k2) {
        int iA = a(Preconditions.checkNotNull(k2));
        d(iA).a((Object) k2, iA, (CacheLoader) this.f4228c, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        if (obj == null) {
            return false;
        }
        int iA = a(obj);
        return d(iA).c(obj, iA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        long j2 = this.y.read();
        o<K, V>[] oVarArr = this.p;
        long j3 = -1;
        int i2 = 0;
        while (i2 < 3) {
            int length = oVarArr.length;
            long j4 = 0;
            for (?? r12 = z; r12 < length; r12++) {
                o<K, V> oVar = oVarArr[r12];
                int i3 = oVar.e;
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = oVar.f;
                for (?? r15 = z; r15 < atomicReferenceArray.length(); r15++) {
                    ReferenceEntry<K, V> next = atomicReferenceArray.get(r15);
                    while (next != null) {
                        o<K, V>[] oVarArr2 = oVarArr;
                        V vD = oVar.d(next, j2);
                        long j5 = j2;
                        if (vD != null && this.u.equivalent(obj, vD)) {
                            return true;
                        }
                        next = next.getNext();
                        oVarArr = oVarArr2;
                        j2 = j5;
                    }
                }
                j4 += (long) oVar.i;
                j2 = j2;
                z = false;
            }
            long j6 = j2;
            o<K, V>[] oVarArr3 = oVarArr;
            if (j4 == j3) {
                return false;
            }
            i2++;
            j3 = j4;
            oVarArr = oVarArr3;
            j2 = j6;
            z = false;
        }
        return z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V put(K k2, V v2) {
        Preconditions.checkNotNull(k2);
        Preconditions.checkNotNull(v2);
        int iA = a(k2);
        return d(iA).e(k2, iA, v2, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CheckForNull
    public V putIfAbsent(K k2, V v2) {
        Preconditions.checkNotNull(k2);
        Preconditions.checkNotNull(v2);
        int iA = a(k2);
        return d(iA).e(k2, iA, v2, true);
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
        int iA = a(obj);
        return d(iA).e(obj, iA);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iA = a(obj);
        return d(iA).d(obj, iA, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k2, @CheckForNull V v2, V v3) {
        Preconditions.checkNotNull(k2);
        Preconditions.checkNotNull(v3);
        if (v2 == null) {
            return false;
        }
        int iA = a(k2);
        return d(iA).b(k2, iA, v2, v3);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CheckForNull
    public V replace(K k2, V v2) {
        Preconditions.checkNotNull(k2);
        Preconditions.checkNotNull(v2);
        int iA = a(k2);
        return d(iA).b(k2, iA, v2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (o<K, V> oVar : this.p) {
            oVar.b();
        }
    }

    void b(Iterable<?> iterable) {
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.k;
        if (set != null) {
            return set;
        }
        a aVar = new a();
        this.k = aVar;
        return aVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.x;
        if (collection != null) {
            return collection;
        }
        q qVar = new q();
        this.x = qVar;
        return qVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.h;
        if (set != null) {
            return set;
        }
        b bVar = new b();
        this.h = bVar;
        return bVar;
    }

    abstract class HashIterator<T> implements Iterator<T> {

        @CheckForNull
        o<K, V> currentSegment;

        @CheckForNull
        AtomicReferenceArray<ReferenceEntry<K, V>> currentTable;

        @CheckForNull
        LocalCache<K, V>.ad lastReturned;

        @CheckForNull
        ReferenceEntry<K, V> nextEntry;

        @CheckForNull
        LocalCache<K, V>.ad nextExternal;
        int nextSegmentIndex;
        int nextTableIndex = -1;

        @Override // java.util.Iterator
        public abstract T next();

        HashIterator() {
            this.nextSegmentIndex = LocalCache.this.p.length - 1;
            advance();
        }

        final void advance() {
            this.nextExternal = null;
            if (nextInChain() || nextInTable()) {
                return;
            }
            while (this.nextSegmentIndex >= 0) {
                o<K, V>[] oVarArr = LocalCache.this.p;
                int i = this.nextSegmentIndex;
                this.nextSegmentIndex = i - 1;
                o<K, V> oVar = oVarArr[i];
                this.currentSegment = oVar;
                if (oVar.e != 0) {
                    AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.currentSegment.f;
                    this.currentTable = atomicReferenceArray;
                    this.nextTableIndex = atomicReferenceArray.length() - 1;
                    if (nextInTable()) {
                        return;
                    }
                }
            }
        }

        boolean nextInChain() {
            ReferenceEntry<K, V> referenceEntry = this.nextEntry;
            if (referenceEntry == null) {
                return false;
            }
            while (true) {
                ReferenceEntry<K, V> next = referenceEntry.getNext();
                this.nextEntry = next;
                if (next == null) {
                    return false;
                }
                if (advanceTo(next)) {
                    return true;
                }
                referenceEntry = this.nextEntry;
            }
        }

        boolean nextInTable() {
            while (true) {
                int i = this.nextTableIndex;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.currentTable;
                this.nextTableIndex = i - 1;
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(i);
                this.nextEntry = referenceEntry;
                if (referenceEntry != null && (advanceTo(referenceEntry) || nextInChain())) {
                    return true;
                }
            }
        }

        boolean advanceTo(ReferenceEntry<K, V> referenceEntry) {
            o<K, V> oVar;
            try {
                long j = LocalCache.this.y.read();
                K key = referenceEntry.getKey();
                Object objC = LocalCache.this.c(referenceEntry, j);
                if (objC == null) {
                    return false;
                }
                this.nextExternal = new ad(key, objC);
                return true;
            } finally {
                this.currentSegment.k();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.nextExternal != null;
        }

        LocalCache<K, V>.ad nextEntry() {
            LocalCache<K, V>.ad adVar = this.nextExternal;
            if (adVar == null) {
                throw new NoSuchElementException();
            }
            this.lastReturned = adVar;
            advance();
            return this.lastReturned;
        }

        @Override // java.util.Iterator
        public void remove() {
            Preconditions.checkState(this.lastReturned != null);
            LocalCache.this.remove(this.lastReturned.getKey());
            this.lastReturned = null;
        }
    }

    final class d extends LocalCache<K, V>.HashIterator<K> {
        d(LocalCache localCache) {
            super();
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public K next() {
            return nextEntry().getKey();
        }
    }

    final class t extends LocalCache<K, V>.HashIterator<V> {
        t(LocalCache localCache) {
            super();
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        public V next() {
            return nextEntry().getValue();
        }
    }

    final class ad implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        V f4235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final K f4236c;

        ad(K k, V v) {
            this.f4236c = k;
            this.f4235b = v;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f4236c;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f4235b;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f4236c.equals(entry.getKey()) && this.f4235b.equals(entry.getValue());
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f4236c.hashCode() ^ this.f4235b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = (V) LocalCache.this.put(this.f4236c, v);
            this.f4235b = v;
            return v2;
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class c extends LocalCache<K, V>.HashIterator<Map.Entry<K, V>> {
        c(LocalCache localCache) {
            super();
        }

        @Override // com.google.common.cache.LocalCache.HashIterator, java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return nextEntry();
        }
    }

    abstract class AbstractCacheSet<T> extends AbstractSet<T> {
        AbstractCacheSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LocalCache.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return LocalCache.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LocalCache.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return LocalCache.c((Collection) this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <E> E[] toArray(E[] eArr) {
            return (E[]) LocalCache.c((Collection) this).toArray(eArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ArrayList<E> c(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        Iterators.a(arrayList, collection.iterator());
        return arrayList;
    }

    final class a extends LocalCache<K, V>.AbstractCacheSet<K> {
        a() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new d(LocalCache.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LocalCache.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return LocalCache.this.remove(obj) != null;
        }
    }

    final class q extends AbstractCollection<V> {
        q() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return LocalCache.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return LocalCache.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            LocalCache.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new t(LocalCache.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return LocalCache.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return LocalCache.c((Collection) this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <E> E[] toArray(E[] eArr) {
            return (E[]) LocalCache.c((Collection) this).toArray(eArr);
        }
    }

    final class b extends LocalCache<K, V>.AbstractCacheSet<Map.Entry<K, V>> {
        b() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new c(LocalCache.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = LocalCache.this.get(key)) != null && LocalCache.this.u.equivalent(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && LocalCache.this.remove(key, entry.getValue());
        }
    }

    static class j<K, V> extends ForwardingCache<K, V> implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f4244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        transient Cache<K, V> f4245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f4246c;
        final long e;
        final Strength f;
        final Equivalence<Object> g;
        final RemovalListener<? super K, ? super V> h;
        final CacheLoader<? super K, V> i;
        final long j;
        final Weigher<K, V> k;
        final Strength l;
        final Equivalence<Object> n;

        @CheckForNull
        final Ticker o;

        j(LocalCache<K, V> localCache) {
            this(localCache.m, localCache.w, localCache.l, localCache.u, localCache.j, localCache.g, localCache.o, localCache.v, localCache.f4227b, localCache.r, localCache.y, localCache.f4228c);
        }

        private j(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, long j, long j2, long j3, Weigher<K, V> weigher, int i, RemovalListener<? super K, ? super V> removalListener, Ticker ticker, CacheLoader<? super K, V> cacheLoader) {
            this.f = strength;
            this.l = strength2;
            this.g = equivalence;
            this.n = equivalence2;
            this.f4246c = j;
            this.e = j2;
            this.j = j3;
            this.k = weigher;
            this.f4244a = i;
            this.h = removalListener;
            this.o = (ticker == Ticker.systemTicker() || ticker == CacheBuilder.d) ? null : ticker;
            this.i = cacheLoader;
        }

        CacheBuilder<K, V> c() {
            CacheBuilder<K, V> cacheBuilder = (CacheBuilder<K, V>) CacheBuilder.a().b(this.f).a(this.l).a(this.g).c(this.n).b(this.f4244a).e(this.h);
            cacheBuilder.r = false;
            long j = this.f4246c;
            if (j > 0) {
                cacheBuilder.c(j, TimeUnit.NANOSECONDS);
            }
            long j2 = this.e;
            if (j2 > 0) {
                cacheBuilder.e(j2, TimeUnit.NANOSECONDS);
            }
            if (this.k != CacheBuilder.OneWeigher.INSTANCE) {
                cacheBuilder.a(this.k);
                long j3 = this.j;
                if (j3 != -1) {
                    cacheBuilder.d(j3);
                }
            } else {
                long j4 = this.j;
                if (j4 != -1) {
                    cacheBuilder.e(j4);
                }
            }
            Ticker ticker = this.o;
            if (ticker != null) {
                cacheBuilder.e(ticker);
            }
            return cacheBuilder;
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f4245b = (Cache<K, V>) c().e();
        }

        private Object readResolve() {
            return this.f4245b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        public Cache<K, V> delegate() {
            return this.f4245b;
        }
    }

    static final class i<K, V> extends j<K, V> implements LoadingCache<K, V>, Serializable {
        private static final long serialVersionUID = 1;

        @CheckForNull
        transient LoadingCache<K, V> d;

        i(LocalCache<K, V> localCache) {
            super(localCache);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.d = (LoadingCache<K, V>) c().b(this.i);
        }

        @Override // com.google.common.cache.LoadingCache
        public V get(K k) throws ExecutionException {
            return this.d.get(k);
        }

        @Override // com.google.common.cache.LoadingCache
        public V getUnchecked(K k) {
            return this.d.getUnchecked(k);
        }

        @Override // com.google.common.cache.LoadingCache
        public ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
            return this.d.getAll(iterable);
        }

        @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
        public V apply(K k) {
            return this.d.apply(k);
        }

        @Override // com.google.common.cache.LoadingCache
        public void refresh(K k) {
            this.d.refresh(k);
        }

        private Object readResolve() {
            return this.d;
        }
    }

    static class g<K, V> implements Cache<K, V>, Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final LocalCache<K, V> f4240a;

        g(CacheBuilder<? super K, ? super V> cacheBuilder) {
            this(new LocalCache(cacheBuilder, null));
        }

        private g(LocalCache<K, V> localCache) {
            this.f4240a = localCache;
        }

        @Override // com.google.common.cache.Cache
        @CheckForNull
        public V getIfPresent(Object obj) {
            return this.f4240a.d(obj);
        }

        @Override // com.google.common.cache.Cache
        public V get(K k, final Callable<? extends V> callable) throws ExecutionException {
            Preconditions.checkNotNull(callable);
            return this.f4240a.d(k, new CacheLoader<Object, V>(this) { // from class: com.google.common.cache.LocalCache.g.2
                @Override // com.google.common.cache.CacheLoader
                public V load(Object obj) throws Exception {
                    return (V) callable.call();
                }
            });
        }

        @Override // com.google.common.cache.Cache
        public ImmutableMap<K, V> getAllPresent(Iterable<?> iterable) {
            return this.f4240a.a(iterable);
        }

        @Override // com.google.common.cache.Cache
        public void put(K k, V v) {
            this.f4240a.put(k, v);
        }

        @Override // com.google.common.cache.Cache
        public void putAll(Map<? extends K, ? extends V> map) {
            this.f4240a.putAll(map);
        }

        @Override // com.google.common.cache.Cache
        public void invalidate(Object obj) {
            Preconditions.checkNotNull(obj);
            this.f4240a.remove(obj);
        }

        @Override // com.google.common.cache.Cache
        public void invalidateAll(Iterable<?> iterable) {
            this.f4240a.b(iterable);
        }

        @Override // com.google.common.cache.Cache
        public void invalidateAll() {
            this.f4240a.clear();
        }

        @Override // com.google.common.cache.Cache
        public long size() {
            return this.f4240a.i();
        }

        @Override // com.google.common.cache.Cache
        public ConcurrentMap<K, V> asMap() {
            return this.f4240a;
        }

        @Override // com.google.common.cache.Cache
        public ajo stats() {
            AbstractCache.c cVar = new AbstractCache.c();
            cVar.a(this.f4240a.f);
            for (o<K, V> oVar : this.f4240a.p) {
                cVar.a(oVar.g);
            }
            return cVar.snapshot();
        }

        @Override // com.google.common.cache.Cache
        public void cleanUp() {
            this.f4240a.e();
        }

        Object writeReplace() {
            return new j(this.f4240a);
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use ManualSerializationProxy");
        }
    }

    static class f<K, V> extends g<K, V> implements LoadingCache<K, V> {
        private static final long serialVersionUID = 1;

        f(CacheBuilder<? super K, ? super V> cacheBuilder, CacheLoader<? super K, V> cacheLoader) {
            super();
        }

        @Override // com.google.common.cache.LoadingCache
        public V get(K k) throws ExecutionException {
            return this.f4240a.b(k);
        }

        @Override // com.google.common.cache.LoadingCache
        public V getUnchecked(K k) {
            try {
                return get(k);
            } catch (ExecutionException e) {
                throw new arn(e.getCause());
            }
        }

        @Override // com.google.common.cache.LoadingCache
        public ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
            return this.f4240a.e(iterable);
        }

        @Override // com.google.common.cache.LoadingCache
        public void refresh(K k) {
            this.f4240a.c(k);
        }

        @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
        public final V apply(K k) {
            return getUnchecked(k);
        }

        @Override // com.google.common.cache.LocalCache.g
        Object writeReplace() {
            return new i(this.f4240a);
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use LoadingSerializationProxy");
        }
    }
}
