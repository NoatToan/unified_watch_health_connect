package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.MapMaker;
import com.google.common.math.IntMath;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
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

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtIncompatible
public abstract class Striped<L> {
    private static final int a = 1024;
    private static final Supplier<ReadWriteLock> b = new e();
    private static final Supplier<ReadWriteLock> c = new f();
    private static final int d = -1;

    public static class a implements Supplier<Lock> {
        @Override // com.google.common.base.Supplier
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Lock get() {
            return new i();
        }
    }

    public static class b implements Supplier<Lock> {
        @Override // com.google.common.base.Supplier
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Lock get() {
            return new ReentrantLock(false);
        }
    }

    public static class c implements Supplier<Semaphore> {
        public final /* synthetic */ int a;

        public c(int i) {
            this.a = i;
        }

        @Override // com.google.common.base.Supplier
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Semaphore get() {
            return new j(this.a);
        }
    }

    public static class d implements Supplier<Semaphore> {
        public final /* synthetic */ int a;

        public d(int i) {
            this.a = i;
        }

        @Override // com.google.common.base.Supplier
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Semaphore get() {
            return new Semaphore(this.a, false);
        }
    }

    public static class e implements Supplier<ReadWriteLock> {
        @Override // com.google.common.base.Supplier
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ReadWriteLock get() {
            return new ReentrantReadWriteLock();
        }
    }

    public static class f implements Supplier<ReadWriteLock> {
        @Override // com.google.common.base.Supplier
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ReadWriteLock get() {
            return new o();
        }
    }

    public static class g<L> extends k<L> {
        private final Object[] f;

        public /* synthetic */ g(int i, Supplier supplier, a aVar) {
            this(i, supplier);
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i) {
            return (L) this.f[i];
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.f.length;
        }

        private g(int i, Supplier<L> supplier) {
            super(i);
            int i2 = 0;
            Preconditions.checkArgument(i <= 1073741824, "Stripes must be <= 2^30)");
            this.f = new Object[this.e + 1];
            while (true) {
                Object[] objArr = this.f;
                if (i2 >= objArr.length) {
                    return;
                }
                objArr[i2] = supplier.get();
                i2++;
            }
        }
    }

    @VisibleForTesting
    public static class h<L> extends k<L> {
        public final ConcurrentMap<Integer, L> f;
        public final Supplier<L> g;
        public final int h;

        public h(int i, Supplier<L> supplier) {
            super(i);
            int i2 = this.e;
            this.h = i2 == -1 ? Integer.MAX_VALUE : i2 + 1;
            this.g = supplier;
            this.f = new MapMaker().weakValues().makeMap();
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i) {
            if (this.h != Integer.MAX_VALUE) {
                Preconditions.checkElementIndex(i, size());
            }
            L l = this.f.get(Integer.valueOf(i));
            if (l != null) {
                return l;
            }
            L l2 = this.g.get();
            return (L) MoreObjects.firstNonNull(this.f.putIfAbsent(Integer.valueOf(i), l2), l2);
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.h;
        }
    }

    public static class i extends ReentrantLock {
        public long a;
        public long b;
        public long c;

        public i() {
            super(false);
        }
    }

    public static class j extends Semaphore {
        public long a;
        public long b;
        public long c;

        public j(int i) {
            super(i, false);
        }
    }

    public static abstract class k<L> extends Striped<L> {
        public final int e;

        public k(int i) {
            super(null);
            Preconditions.checkArgument(i > 0, "Stripes must be positive");
            this.e = i > 1073741824 ? -1 : Striped.c(i) - 1;
        }

        @Override // com.google.common.util.concurrent.Striped
        public final int e(Object obj) {
            return Striped.g(obj.hashCode()) & this.e;
        }

        @Override // com.google.common.util.concurrent.Striped
        public final L get(Object obj) {
            return getAt(e(obj));
        }
    }

    @VisibleForTesting
    public static class l<L> extends k<L> {
        public final AtomicReferenceArray<a<? extends L>> f;
        public final Supplier<L> g;
        public final int h;
        public final ReferenceQueue<L> i;

        public static final class a<L> extends WeakReference<L> {
            public final int a;

            public a(L l, int i, ReferenceQueue<L> referenceQueue) {
                super(l, referenceQueue);
                this.a = i;
            }
        }

        public l(int i, Supplier<L> supplier) {
            super(i);
            this.i = new ReferenceQueue<>();
            int i2 = this.e;
            int i3 = i2 == -1 ? Integer.MAX_VALUE : i2 + 1;
            this.h = i3;
            this.f = new AtomicReferenceArray<>(i3);
            this.g = supplier;
        }

        private void h() {
            while (true) {
                Reference<? extends L> referencePoll = this.i.poll();
                if (referencePoll == null) {
                    return;
                }
                a<? extends L> aVar = (a) referencePoll;
                this.f.compareAndSet(aVar.a, aVar, null);
            }
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i) {
            if (this.h != Integer.MAX_VALUE) {
                Preconditions.checkElementIndex(i, size());
            }
            a<? extends L> aVar = this.f.get(i);
            L l = aVar == null ? null : aVar.get();
            if (l != null) {
                return l;
            }
            L l2 = this.g.get();
            a<? extends L> aVar2 = new a<>(l2, i, this.i);
            while (!this.f.compareAndSet(i, aVar, aVar2)) {
                aVar = this.f.get(i);
                L l3 = aVar == null ? null : aVar.get();
                if (l3 != null) {
                    return l3;
                }
            }
            h();
            return l2;
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.h;
        }
    }

    public static final class m extends com.google.common.util.concurrent.h {
        private final Condition a;
        private final o b;

        public m(Condition condition, o oVar) {
            this.a = condition;
            this.b = oVar;
        }

        @Override // com.google.common.util.concurrent.h
        public Condition a() {
            return this.a;
        }
    }

    public static final class n extends com.google.common.util.concurrent.j {
        private final Lock a;
        private final o b;

        public n(Lock lock, o oVar) {
            this.a = lock;
            this.b = oVar;
        }

        @Override // com.google.common.util.concurrent.j
        public Lock a() {
            return this.a;
        }

        @Override // com.google.common.util.concurrent.j, java.util.concurrent.locks.Lock
        public Condition newCondition() {
            return new m(this.a.newCondition(), this.b);
        }
    }

    public static final class o implements ReadWriteLock {
        private final ReadWriteLock a = new ReentrantReadWriteLock();

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock readLock() {
            return new n(this.a.readLock(), this);
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock writeLock() {
            return new n(this.a.writeLock(), this);
        }
    }

    public /* synthetic */ Striped(a aVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(int i2) {
        return 1 << IntMath.log2(i2, RoundingMode.CEILING);
    }

    public static <L> Striped<L> d(int i2, Supplier<L> supplier) {
        return new g(i2, supplier, null);
    }

    private static <L> Striped<L> f(int i2, Supplier<L> supplier) {
        return i2 < 1024 ? new l(i2, supplier) : new h(i2, supplier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int g(int i2) {
        int i3 = i2 ^ ((i2 >>> 20) ^ (i2 >>> 12));
        return (i3 >>> 4) ^ ((i3 >>> 7) ^ i3);
    }

    public static Striped<Lock> lazyWeakLock(int i2) {
        return f(i2, new b());
    }

    public static Striped<ReadWriteLock> lazyWeakReadWriteLock(int i2) {
        return f(i2, c);
    }

    public static Striped<Semaphore> lazyWeakSemaphore(int i2, int i3) {
        return f(i2, new d(i3));
    }

    public static Striped<Lock> lock(int i2) {
        return d(i2, new a());
    }

    public static Striped<ReadWriteLock> readWriteLock(int i2) {
        return d(i2, b);
    }

    public static Striped<Semaphore> semaphore(int i2, int i3) {
        return d(i2, new c(i3));
    }

    public Iterable<L> bulkGet(Iterable<?> iterable) {
        Object[] array = Iterables.toArray(iterable, Object.class);
        if (array.length == 0) {
            return ImmutableList.of();
        }
        int[] iArr = new int[array.length];
        for (int i2 = 0; i2 < array.length; i2++) {
            iArr[i2] = e(array[i2]);
        }
        Arrays.sort(iArr);
        int i3 = iArr[0];
        array[0] = getAt(i3);
        for (int i4 = 1; i4 < array.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3) {
                array[i4] = array[i4 - 1];
            } else {
                array[i4] = getAt(i5);
                i3 = i5;
            }
        }
        return Collections.unmodifiableList(Arrays.asList(array));
    }

    public abstract int e(Object obj);

    public abstract L get(Object obj);

    public abstract L getAt(int i2);

    public abstract int size();

    private Striped() {
    }
}
