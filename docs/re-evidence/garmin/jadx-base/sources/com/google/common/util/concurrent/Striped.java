package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.MapMaker;
import com.google.common.math.IntMath;
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

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
@J2ktIncompatible
public abstract class Striped<L> {
    private static final int ALL_SET = -1;
    private static final int LARGE_LAZY_CUTOFF = 1024;

    public static class CompactStriped<L> extends PowerOfTwoStriped<L> {
        private final Object[] array;

        private CompactStriped(int i14, Supplier<L> supplier) {
            super(i14);
            int i15 = 0;
            Preconditions.checkArgument(i14 <= 1073741824, "Stripes must be <= 2^30)");
            this.array = new Object[this.mask + 1];
            while (true) {
                Object[] objArr = this.array;
                if (i15 >= objArr.length) {
                    return;
                }
                objArr[i15] = supplier.get();
                i15++;
            }
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i14) {
            return (L) this.array[i14];
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.array.length;
        }
    }

    @VisibleForTesting
    public static class LargeLazyStriped<L> extends PowerOfTwoStriped<L> {
        final ConcurrentMap<Integer, L> locks;
        final int size;
        final Supplier<L> supplier;

        public LargeLazyStriped(int i14, Supplier<L> supplier) {
            super(i14);
            int i15 = this.mask;
            this.size = i15 == -1 ? Integer.MAX_VALUE : i15 + 1;
            this.supplier = supplier;
            this.locks = new MapMaker().weakValues().makeMap();
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i14) {
            if (this.size != Integer.MAX_VALUE) {
                Preconditions.checkElementIndex(i14, size());
            }
            L l14 = this.locks.get(Integer.valueOf(i14));
            if (l14 != null) {
                return l14;
            }
            L l15 = this.supplier.get();
            return (L) MoreObjects.firstNonNull(this.locks.putIfAbsent(Integer.valueOf(i14), l15), l15);
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.size;
        }
    }

    public static class PaddedLock extends ReentrantLock {
        long unused1;
        long unused2;
        long unused3;

        public PaddedLock() {
            super(false);
        }
    }

    public static class PaddedSemaphore extends Semaphore {
        long unused1;
        long unused2;
        long unused3;

        public PaddedSemaphore(int i14) {
            super(i14, false);
        }
    }

    public static abstract class PowerOfTwoStriped<L> extends Striped<L> {
        final int mask;

        public PowerOfTwoStriped(int i14) {
            super();
            Preconditions.checkArgument(i14 > 0, "Stripes must be positive");
            this.mask = i14 > 1073741824 ? -1 : Striped.ceilToPowerOfTwo(i14) - 1;
        }

        @Override // com.google.common.util.concurrent.Striped
        public final L get(Object obj) {
            return getAt(indexFor(obj));
        }

        @Override // com.google.common.util.concurrent.Striped
        public final int indexFor(Object obj) {
            return Striped.smear(obj.hashCode()) & this.mask;
        }
    }

    @VisibleForTesting
    public static class SmallLazyStriped<L> extends PowerOfTwoStriped<L> {
        final AtomicReferenceArray<ArrayReference<? extends L>> locks;
        final ReferenceQueue<L> queue;
        final int size;
        final Supplier<L> supplier;

        public static final class ArrayReference<L> extends WeakReference<L> {
            final int index;

            public ArrayReference(L l14, int i14, ReferenceQueue<L> referenceQueue) {
                super(l14, referenceQueue);
                this.index = i14;
            }
        }

        public SmallLazyStriped(int i14, Supplier<L> supplier) {
            super(i14);
            this.queue = new ReferenceQueue<>();
            int i15 = this.mask;
            int i16 = i15 == -1 ? Integer.MAX_VALUE : i15 + 1;
            this.size = i16;
            this.locks = new AtomicReferenceArray<>(i16);
            this.supplier = supplier;
        }

        private void drainQueue() {
            while (true) {
                Reference<? extends L> referencePoll = this.queue.poll();
                if (referencePoll == null) {
                    return;
                }
                ArrayReference<? extends L> arrayReference = (ArrayReference) referencePoll;
                AtomicReferenceArray<ArrayReference<? extends L>> atomicReferenceArray = this.locks;
                int i14 = arrayReference.index;
                while (!atomicReferenceArray.compareAndSet(i14, arrayReference, null) && atomicReferenceArray.get(i14) == arrayReference) {
                }
            }
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i14) {
            L l14;
            if (this.size != Integer.MAX_VALUE) {
                Preconditions.checkElementIndex(i14, size());
            }
            ArrayReference<? extends L> arrayReference = this.locks.get(i14);
            L l15 = arrayReference == null ? null : arrayReference.get();
            if (l15 != null) {
                return l15;
            }
            L l16 = this.supplier.get();
            ArrayReference<? extends L> arrayReference2 = new ArrayReference<>(l16, i14, this.queue);
            do {
                AtomicReferenceArray<ArrayReference<? extends L>> atomicReferenceArray = this.locks;
                do {
                    if (atomicReferenceArray.compareAndSet(i14, arrayReference, arrayReference2)) {
                        drainQueue();
                        return l16;
                    }
                } while (atomicReferenceArray.get(i14) == arrayReference);
                arrayReference = this.locks.get(i14);
                l14 = arrayReference == null ? null : arrayReference.get();
            } while (l14 == null);
            return l14;
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.size;
        }
    }

    public static final class WeakSafeCondition extends ForwardingCondition {
        private final Condition delegate;
        private final WeakSafeReadWriteLock strongReference;

        public WeakSafeCondition(Condition condition, WeakSafeReadWriteLock weakSafeReadWriteLock) {
            this.delegate = condition;
            this.strongReference = weakSafeReadWriteLock;
        }

        @Override // com.google.common.util.concurrent.ForwardingCondition
        public Condition delegate() {
            return this.delegate;
        }
    }

    public static final class WeakSafeLock extends ForwardingLock {
        private final Lock delegate;
        private final WeakSafeReadWriteLock strongReference;

        public WeakSafeLock(Lock lock, WeakSafeReadWriteLock weakSafeReadWriteLock) {
            this.delegate = lock;
            this.strongReference = weakSafeReadWriteLock;
        }

        @Override // com.google.common.util.concurrent.ForwardingLock
        public Lock delegate() {
            return this.delegate;
        }

        @Override // com.google.common.util.concurrent.ForwardingLock, java.util.concurrent.locks.Lock
        public Condition newCondition() {
            return new WeakSafeCondition(this.delegate.newCondition(), this.strongReference);
        }
    }

    public static final class WeakSafeReadWriteLock implements ReadWriteLock {
        private final ReadWriteLock delegate = new ReentrantReadWriteLock();

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock readLock() {
            return new WeakSafeLock(this.delegate.readLock(), this);
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock writeLock() {
            return new WeakSafeLock(this.delegate.writeLock(), this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ceilToPowerOfTwo(int i14) {
        return 1 << IntMath.log2(i14, RoundingMode.CEILING);
    }

    public static <L> Striped<L> custom(int i14, Supplier<L> supplier) {
        return new CompactStriped(i14, supplier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Lock lambda$lazyWeakLock$0() {
        return new ReentrantLock(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Semaphore lambda$lazyWeakSemaphore$2(int i14) {
        return new Semaphore(i14, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Semaphore lambda$semaphore$1(int i14) {
        return new PaddedSemaphore(i14);
    }

    public static <L> Striped<L> lazyWeakCustom(int i14, Supplier<L> supplier) {
        return i14 < 1024 ? new SmallLazyStriped(i14, supplier) : new LargeLazyStriped(i14, supplier);
    }

    public static Striped<Lock> lazyWeakLock(int i14) {
        return lazyWeakCustom(i14, new p(2));
    }

    public static Striped<ReadWriteLock> lazyWeakReadWriteLock(int i14) {
        return lazyWeakCustom(i14, new p(0));
    }

    public static Striped<Semaphore> lazyWeakSemaphore(int i14, int i15) {
        return lazyWeakCustom(i14, new com.google.android.exoplayer2.mediacodec.b(i15, 3));
    }

    public static Striped<Lock> lock(int i14) {
        return custom(i14, new p(1));
    }

    public static Striped<ReadWriteLock> readWriteLock(int i14) {
        return custom(i14, new p(3));
    }

    public static Striped<Semaphore> semaphore(int i14, int i15) {
        return custom(i14, new com.google.android.exoplayer2.mediacodec.b(i15, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int smear(int i14) {
        int i15 = i14 ^ ((i14 >>> 20) ^ (i14 >>> 12));
        return (i15 >>> 4) ^ ((i15 >>> 7) ^ i15);
    }

    public Iterable<L> bulkGet(Iterable<? extends Object> iterable) {
        ArrayList arrayListNewArrayList = Lists.newArrayList(iterable);
        if (arrayListNewArrayList.isEmpty()) {
            return ImmutableList.of();
        }
        int[] iArr = new int[arrayListNewArrayList.size()];
        for (int i14 = 0; i14 < arrayListNewArrayList.size(); i14++) {
            iArr[i14] = indexFor(arrayListNewArrayList.get(i14));
        }
        Arrays.sort(iArr);
        int i15 = iArr[0];
        arrayListNewArrayList.set(0, getAt(i15));
        for (int i16 = 1; i16 < arrayListNewArrayList.size(); i16++) {
            int i17 = iArr[i16];
            if (i17 == i15) {
                arrayListNewArrayList.set(i16, arrayListNewArrayList.get(i16 - 1));
            } else {
                arrayListNewArrayList.set(i16, getAt(i17));
                i15 = i17;
            }
        }
        return Collections.unmodifiableList(arrayListNewArrayList);
    }

    public abstract L get(Object obj);

    public abstract L getAt(int i14);

    public abstract int indexFor(Object obj);

    public abstract int size();

    private Striped() {
    }
}
