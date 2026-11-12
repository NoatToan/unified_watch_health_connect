package com.google.common.util.concurrent;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.MapMaker;
import com.google.common.util.concurrent.Striped;
import defpackage.aml;
import defpackage.apn;
import defpackage.arj;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class Striped<L> {
    private static final int ALL_SET = -1;
    private static final int LARGE_LAZY_CUTOFF = 1024;

    /* JADX INFO: Access modifiers changed from: private */
    public static int smear(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 ^ (i2 >>> 7)) ^ (i2 >>> 4);
    }

    public abstract L get(Object obj);

    public abstract L getAt(int i);

    abstract int indexFor(Object obj);

    public abstract int size();

    private Striped() {
    }

    public Iterable<L> bulkGet(Iterable<? extends Object> iterable) {
        ArrayList arrayListA = aml.a(iterable);
        if (arrayListA.isEmpty()) {
            return ImmutableList.of();
        }
        int[] iArr = new int[arrayListA.size()];
        for (int i = 0; i < arrayListA.size(); i++) {
            iArr[i] = indexFor(arrayListA.get(i));
        }
        Arrays.sort(iArr);
        int i2 = iArr[0];
        arrayListA.set(0, getAt(i2));
        for (int i3 = 1; i3 < arrayListA.size(); i3++) {
            int i4 = iArr[i3];
            if (i4 == i2) {
                arrayListA.set(i3, arrayListA.get(i3 - 1));
            } else {
                arrayListA.set(i3, getAt(i4));
                i2 = i4;
            }
        }
        return Collections.unmodifiableList(arrayListA);
    }

    static <L> Striped<L> custom(int i, Supplier<L> supplier) {
        return new d(i, supplier);
    }

    public static Striped<Lock> lock(int i) {
        return custom(i, new Supplier() { // from class: arf
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return new Striped.e();
            }
        });
    }

    public static /* synthetic */ Lock lambda$lazyWeakLock$0() {
        return new ReentrantLock(false);
    }

    public static Striped<Lock> lazyWeakLock(int i) {
        return lazy(i, new Supplier() { // from class: arh
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return Striped.lambda$lazyWeakLock$0();
            }
        });
    }

    private static <L> Striped<L> lazy(int i, Supplier<L> supplier) {
        if (i < 1024) {
            return new c(i, supplier);
        }
        return new a(i, supplier);
    }

    public static /* synthetic */ Semaphore lambda$semaphore$1(int i) {
        return new b(i);
    }

    public static Striped<Semaphore> semaphore(int i, final int i2) {
        return custom(i, new Supplier() { // from class: are
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return Striped.lambda$semaphore$1(i2);
            }
        });
    }

    public static /* synthetic */ Semaphore lambda$lazyWeakSemaphore$2(int i) {
        return new Semaphore(i, false);
    }

    public static Striped<Semaphore> lazyWeakSemaphore(int i, final int i2) {
        return lazy(i, new Supplier() { // from class: ari
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return Striped.lambda$lazyWeakSemaphore$2(i2);
            }
        });
    }

    public static Striped<ReadWriteLock> readWriteLock(int i) {
        return custom(i, new Supplier() { // from class: arg
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return new ReentrantReadWriteLock();
            }
        });
    }

    public static Striped<ReadWriteLock> lazyWeakReadWriteLock(int i) {
        return lazy(i, new Supplier() { // from class: ard
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return new Striped.h();
            }
        });
    }

    public static final class h implements ReadWriteLock {
        private final ReadWriteLock d = new ReentrantReadWriteLock();

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock readLock() {
            return new j(this.d.readLock(), this);
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock writeLock() {
            return new j(this.d.writeLock(), this);
        }
    }

    static final class j extends ForwardingLock {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Lock f4725c;
        private final h d;

        j(Lock lock, h hVar) {
            this.f4725c = lock;
            this.d = hVar;
        }

        @Override // com.google.common.util.concurrent.ForwardingLock
        Lock delegate() {
            return this.f4725c;
        }

        @Override // com.google.common.util.concurrent.ForwardingLock, java.util.concurrent.locks.Lock
        public Condition newCondition() {
            return new g(this.f4725c.newCondition(), this.d);
        }
    }

    static final class g extends ForwardingCondition {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Condition f4724b;
        private final h d;

        g(Condition condition, h hVar) {
            this.f4724b = condition;
            this.d = hVar;
        }

        @Override // com.google.common.util.concurrent.ForwardingCondition
        Condition delegate() {
            return this.f4724b;
        }
    }

    static abstract class PowerOfTwoStriped<L> extends Striped<L> {
        final int mask;

        PowerOfTwoStriped(int i) {
            super();
            Preconditions.checkArgument(i > 0, "Stripes must be positive");
            this.mask = i > 1073741824 ? -1 : Striped.ceilToPowerOfTwo(i) - 1;
        }

        @Override // com.google.common.util.concurrent.Striped
        final int indexFor(Object obj) {
            return Striped.smear(obj.hashCode()) & this.mask;
        }

        @Override // com.google.common.util.concurrent.Striped
        public final L get(Object obj) {
            return getAt(indexFor(obj));
        }
    }

    static class d<L> extends PowerOfTwoStriped<L> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object[] f4723b;

        private d(int i, Supplier<L> supplier) {
            super(i);
            int i2 = 0;
            Preconditions.checkArgument(i <= 1073741824, "Stripes must be <= 2^30)");
            this.f4723b = new Object[this.mask + 1];
            while (true) {
                Object[] objArr = this.f4723b;
                if (i2 >= objArr.length) {
                    return;
                }
                objArr[i2] = supplier.get();
                i2++;
            }
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i) {
            return (L) this.f4723b[i];
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.f4723b.length;
        }
    }

    static class c<L> extends PowerOfTwoStriped<L> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f4720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ReferenceQueue<L> f4721c;
        final AtomicReferenceArray<e<? extends L>> d;
        final Supplier<L> e;

        c(int i, Supplier<L> supplier) {
            super(i);
            this.f4721c = new ReferenceQueue<>();
            int i2 = this.mask == -1 ? Integer.MAX_VALUE : this.mask + 1;
            this.f4720b = i2;
            this.d = new AtomicReferenceArray<>(i2);
            this.e = supplier;
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i) {
            if (this.f4720b != Integer.MAX_VALUE) {
                Preconditions.checkElementIndex(i, size());
            }
            e<? extends L> eVar = this.d.get(i);
            L l = eVar == null ? null : (L) eVar.get();
            if (l != null) {
                return l;
            }
            L l2 = this.e.get();
            e eVar2 = new e(l2, i, this.f4721c);
            while (!arj.b(this.d, i, eVar, eVar2)) {
                eVar = this.d.get(i);
                L l3 = eVar == null ? null : (L) eVar.get();
                if (l3 != null) {
                    return l3;
                }
            }
            a();
            return l2;
        }

        private void a() {
            while (true) {
                Reference<? extends L> referencePoll = this.f4721c.poll();
                if (referencePoll == null) {
                    return;
                }
                e eVar = (e) referencePoll;
                arj.b(this.d, eVar.f4722a, eVar, null);
            }
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.f4720b;
        }

        static final class e<L> extends WeakReference<L> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final int f4722a;

            e(L l, int i, ReferenceQueue<L> referenceQueue) {
                super(l, referenceQueue);
                this.f4722a = i;
            }
        }
    }

    static class a<L> extends PowerOfTwoStriped<L> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Supplier<L> f4718b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ConcurrentMap<Integer, L> f4719c;
        final int d;

        a(int i, Supplier<L> supplier) {
            super(i);
            this.d = this.mask == -1 ? Integer.MAX_VALUE : this.mask + 1;
            this.f4718b = supplier;
            this.f4719c = new MapMaker().i().g();
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i) {
            if (this.d != Integer.MAX_VALUE) {
                Preconditions.checkElementIndex(i, size());
            }
            L l = this.f4719c.get(Integer.valueOf(i));
            if (l != null) {
                return l;
            }
            L l2 = this.f4718b.get();
            return (L) MoreObjects.firstNonNull(this.f4719c.putIfAbsent(Integer.valueOf(i), l2), l2);
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ceilToPowerOfTwo(int i) {
        return 1 << apn.b(i, RoundingMode.CEILING);
    }

    public static class e extends ReentrantLock {
        public e() {
            super(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static class b extends Semaphore {
        b(int i) {
            super(i, false);
        }
    }
}
