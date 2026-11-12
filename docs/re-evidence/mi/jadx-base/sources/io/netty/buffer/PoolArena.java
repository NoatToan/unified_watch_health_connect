package io.netty.buffer;

import androidx.work.WorkInfo;
import io.netty.util.internal.LongCounter;
import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.StringUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
abstract class PoolArena<T> implements PoolArenaMetric {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final boolean HAS_UNSAFE = PlatformDependent.hasUnsafe();
    static final int numTinySubpagePools = 32;
    private long allocationsNormal;
    private final List<PoolChunkListMetric> chunkListMetrics;
    final int chunkSize;
    private long deallocationsNormal;
    private long deallocationsSmall;
    private long deallocationsTiny;
    final int directMemoryCacheAlignment;
    final int directMemoryCacheAlignmentMask;
    private final int maxOrder;
    final int numSmallSubpagePools;
    final int pageShifts;
    final int pageSize;
    final PooledByteBufAllocator parent;
    private final PoolChunkList<T> q000;
    private final PoolChunkList<T> q025;
    private final PoolChunkList<T> q050;
    private final PoolChunkList<T> q075;
    private final PoolChunkList<T> q100;
    private final PoolChunkList<T> qInit;
    private final PoolSubpage<T>[] smallSubpagePools;
    final int subpageOverflowMask;
    private final LongCounter allocationsTiny = PlatformDependent.newLongCounter();
    private final LongCounter allocationsSmall = PlatformDependent.newLongCounter();
    private final LongCounter allocationsHuge = PlatformDependent.newLongCounter();
    private final LongCounter activeBytesHuge = PlatformDependent.newLongCounter();
    private final LongCounter deallocationsHuge = PlatformDependent.newLongCounter();
    final AtomicInteger numThreadCaches = new AtomicInteger();
    private final PoolSubpage<T>[] tinySubpagePools = newSubpagePoolArray(32);

    /* JADX INFO: renamed from: io.netty.buffer.PoolArena$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$buffer$PoolArena$SizeClass;

        static {
            int[] iArr = new int[SizeClass.values().length];
            $SwitchMap$io$netty$buffer$PoolArena$SizeClass = iArr;
            try {
                iArr[SizeClass.Normal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$netty$buffer$PoolArena$SizeClass[SizeClass.Small.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$netty$buffer$PoolArena$SizeClass[SizeClass.Tiny.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class DirectArena extends PoolArena<ByteBuffer> {
        public DirectArena(PooledByteBufAllocator pooledByteBufAllocator, int i, int i2, int i3, int i4, int i5) {
            super(pooledByteBufAllocator, i, i2, i3, i4, i5);
        }

        private static ByteBuffer allocateDirect(int i) {
            return PlatformDependent.useDirectBufferNoCleaner() ? PlatformDependent.allocateDirectNoCleaner(i) : ByteBuffer.allocateDirect(i);
        }

        @Override // io.netty.buffer.PoolArena
        public void destroyChunk(PoolChunk<ByteBuffer> poolChunk) {
            if (PlatformDependent.useDirectBufferNoCleaner()) {
                PlatformDependent.freeDirectNoCleaner(poolChunk.memory);
            } else {
                PlatformDependent.freeDirectBuffer(poolChunk.memory);
            }
        }

        @Override // io.netty.buffer.PoolArena
        public boolean isDirect() {
            return true;
        }

        @Override // io.netty.buffer.PoolArena
        public PooledByteBuf<ByteBuffer> newByteBuf(int i) {
            return PoolArena.HAS_UNSAFE ? PooledUnsafeDirectByteBuf.newInstance(i) : PooledDirectByteBuf.newInstance(i);
        }

        @Override // io.netty.buffer.PoolArena
        public PoolChunk<ByteBuffer> newChunk(int i, int i2, int i3, int i4) {
            int i5 = this.directMemoryCacheAlignment;
            if (i5 == 0) {
                return new PoolChunk<>(this, allocateDirect(i4), i, i2, i3, i4, 0);
            }
            ByteBuffer byteBufferAllocateDirect = allocateDirect(i5 + i4);
            return new PoolChunk<>(this, byteBufferAllocateDirect, i, i2, i3, i4, offsetCacheLine(byteBufferAllocateDirect));
        }

        @Override // io.netty.buffer.PoolArena
        public PoolChunk<ByteBuffer> newUnpooledChunk(int i) {
            int i2 = this.directMemoryCacheAlignment;
            if (i2 == 0) {
                return new PoolChunk<>(this, allocateDirect(i), i, 0);
            }
            ByteBuffer byteBufferAllocateDirect = allocateDirect(i2 + i);
            return new PoolChunk<>(this, byteBufferAllocateDirect, i, offsetCacheLine(byteBufferAllocateDirect));
        }

        public int offsetCacheLine(ByteBuffer byteBuffer) {
            return this.directMemoryCacheAlignment - (PoolArena.HAS_UNSAFE ? (int) (PlatformDependent.directBufferAddress(byteBuffer) & ((long) this.directMemoryCacheAlignmentMask)) : 0);
        }

        @Override // io.netty.buffer.PoolArena
        public void memoryCopy(ByteBuffer byteBuffer, int i, PooledByteBuf<ByteBuffer> pooledByteBuf, int i2) {
            if (i2 == 0) {
                return;
            }
            if (PoolArena.HAS_UNSAFE) {
                PlatformDependent.copyMemory(PlatformDependent.directBufferAddress(byteBuffer) + ((long) i), PlatformDependent.directBufferAddress(pooledByteBuf.memory) + ((long) pooledByteBuf.offset), i2);
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            ByteBuffer byteBufferInternalNioBuffer = pooledByteBuf.internalNioBuffer();
            byteBufferDuplicate.position(i).limit(i + i2);
            byteBufferInternalNioBuffer.position(pooledByteBuf.offset);
            byteBufferInternalNioBuffer.put(byteBufferDuplicate);
        }
    }

    public static final class HeapArena extends PoolArena<byte[]> {
        public HeapArena(PooledByteBufAllocator pooledByteBufAllocator, int i, int i2, int i3, int i4, int i5) {
            super(pooledByteBufAllocator, i, i2, i3, i4, i5);
        }

        private static byte[] newByteArray(int i) {
            return PlatformDependent.allocateUninitializedArray(i);
        }

        @Override // io.netty.buffer.PoolArena
        public void destroyChunk(PoolChunk<byte[]> poolChunk) {
        }

        @Override // io.netty.buffer.PoolArena
        public boolean isDirect() {
            return false;
        }

        @Override // io.netty.buffer.PoolArena
        public PooledByteBuf<byte[]> newByteBuf(int i) {
            return PoolArena.HAS_UNSAFE ? PooledUnsafeHeapByteBuf.newUnsafeInstance(i) : PooledHeapByteBuf.newInstance(i);
        }

        @Override // io.netty.buffer.PoolArena
        public PoolChunk<byte[]> newChunk(int i, int i2, int i3, int i4) {
            return new PoolChunk<>(this, newByteArray(i4), i, i2, i3, i4, 0);
        }

        @Override // io.netty.buffer.PoolArena
        public PoolChunk<byte[]> newUnpooledChunk(int i) {
            return new PoolChunk<>(this, newByteArray(i), i, 0);
        }

        @Override // io.netty.buffer.PoolArena
        public void memoryCopy(byte[] bArr, int i, PooledByteBuf<byte[]> pooledByteBuf, int i2) {
            if (i2 == 0) {
                return;
            }
            System.arraycopy(bArr, i, pooledByteBuf.memory, pooledByteBuf.offset, i2);
        }
    }

    public enum SizeClass {
        Tiny,
        Small,
        Normal
    }

    public PoolArena(PooledByteBufAllocator pooledByteBufAllocator, int i, int i2, int i3, int i4, int i5) {
        this.parent = pooledByteBufAllocator;
        this.pageSize = i;
        this.maxOrder = i2;
        this.pageShifts = i3;
        this.chunkSize = i4;
        this.directMemoryCacheAlignment = i5;
        this.directMemoryCacheAlignmentMask = i5 - 1;
        this.subpageOverflowMask = ~(i - 1);
        int i6 = 0;
        int i7 = 0;
        while (true) {
            PoolSubpage<T>[] poolSubpageArr = this.tinySubpagePools;
            if (i7 >= poolSubpageArr.length) {
                break;
            }
            poolSubpageArr[i7] = newSubpagePoolHead(i);
            i7++;
        }
        int i8 = i3 - 9;
        this.numSmallSubpagePools = i8;
        this.smallSubpagePools = newSubpagePoolArray(i8);
        while (true) {
            PoolSubpage<T>[] poolSubpageArr2 = this.smallSubpagePools;
            if (i6 >= poolSubpageArr2.length) {
                PoolChunkList<T> poolChunkList = new PoolChunkList<>(this, null, 100, Integer.MAX_VALUE, i4);
                this.q100 = poolChunkList;
                PoolChunkList<T> poolChunkList2 = new PoolChunkList<>(this, poolChunkList, 75, 100, i4);
                this.q075 = poolChunkList2;
                PoolChunkList<T> poolChunkList3 = new PoolChunkList<>(this, poolChunkList2, 50, 100, i4);
                this.q050 = poolChunkList3;
                PoolChunkList<T> poolChunkList4 = new PoolChunkList<>(this, poolChunkList3, 25, 75, i4);
                this.q025 = poolChunkList4;
                PoolChunkList<T> poolChunkList5 = new PoolChunkList<>(this, poolChunkList4, 1, 50, i4);
                this.q000 = poolChunkList5;
                PoolChunkList<T> poolChunkList6 = new PoolChunkList<>(this, poolChunkList5, Integer.MIN_VALUE, 25, i4);
                this.qInit = poolChunkList6;
                poolChunkList.prevList(poolChunkList2);
                poolChunkList2.prevList(poolChunkList3);
                poolChunkList3.prevList(poolChunkList4);
                poolChunkList4.prevList(poolChunkList5);
                poolChunkList5.prevList(null);
                poolChunkList6.prevList(poolChunkList6);
                ArrayList arrayList = new ArrayList(6);
                arrayList.add(poolChunkList6);
                arrayList.add(poolChunkList5);
                arrayList.add(poolChunkList4);
                arrayList.add(poolChunkList3);
                arrayList.add(poolChunkList2);
                arrayList.add(poolChunkList);
                this.chunkListMetrics = Collections.unmodifiableList(arrayList);
                return;
            }
            poolSubpageArr2[i6] = newSubpagePoolHead(i);
            i6++;
        }
    }

    private void allocateHuge(PooledByteBuf<T> pooledByteBuf, int i) {
        PoolChunk<T> poolChunkNewUnpooledChunk = newUnpooledChunk(i);
        this.activeBytesHuge.add(poolChunkNewUnpooledChunk.chunkSize());
        pooledByteBuf.initUnpooled(poolChunkNewUnpooledChunk, i);
        this.allocationsHuge.increment();
    }

    private void allocateNormal(PooledByteBuf<T> pooledByteBuf, int i, int i2) {
        if (this.q050.allocate(pooledByteBuf, i, i2) || this.q025.allocate(pooledByteBuf, i, i2) || this.q000.allocate(pooledByteBuf, i, i2) || this.qInit.allocate(pooledByteBuf, i, i2) || this.q075.allocate(pooledByteBuf, i, i2)) {
            return;
        }
        PoolChunk<T> poolChunkNewChunk = newChunk(this.pageSize, this.maxOrder, this.pageShifts, this.chunkSize);
        poolChunkNewChunk.allocate(pooledByteBuf, i, i2);
        this.qInit.add(poolChunkNewChunk);
    }

    private static void appendPoolSubPages(StringBuilder sb, PoolSubpage<?>[] poolSubpageArr) {
        for (int i = 0; i < poolSubpageArr.length; i++) {
            PoolSubpage<?> poolSubpage = poolSubpageArr[i];
            if (poolSubpage.next != poolSubpage) {
                sb.append(StringUtil.NEWLINE);
                sb.append(i);
                sb.append(": ");
                PoolSubpage poolSubpage2 = poolSubpage.next;
                do {
                    sb.append(poolSubpage2);
                    poolSubpage2 = poolSubpage2.next;
                } while (poolSubpage2 != poolSubpage);
            }
        }
    }

    private void destroyPoolChunkLists(PoolChunkList<T>... poolChunkListArr) {
        for (PoolChunkList<T> poolChunkList : poolChunkListArr) {
            poolChunkList.destroy(this);
        }
    }

    private static void destroyPoolSubPages(PoolSubpage<?>[] poolSubpageArr) {
        for (PoolSubpage<?> poolSubpage : poolSubpageArr) {
            poolSubpage.destroy();
        }
    }

    private void incTinySmallAllocation(boolean z) {
        if (z) {
            this.allocationsTiny.increment();
        } else {
            this.allocationsSmall.increment();
        }
    }

    public static boolean isTiny(int i) {
        return (i & WorkInfo.STOP_REASON_UNKNOWN) == 0;
    }

    private PoolSubpage<T>[] newSubpagePoolArray(int i) {
        return new PoolSubpage[i];
    }

    private PoolSubpage<T> newSubpagePoolHead(int i) {
        PoolSubpage<T> poolSubpage = new PoolSubpage<>(i);
        poolSubpage.prev = poolSubpage;
        poolSubpage.next = poolSubpage;
        return poolSubpage;
    }

    private SizeClass sizeClass(int i) {
        if (isTinyOrSmall(i)) {
            return isTiny(i) ? SizeClass.Tiny : SizeClass.Small;
        }
        return SizeClass.Normal;
    }

    public static int smallIdx(int i) {
        int i2 = i >>> 10;
        int i3 = 0;
        while (i2 != 0) {
            i2 >>>= 1;
            i3++;
        }
        return i3;
    }

    private static List<PoolSubpageMetric> subPageMetricList(PoolSubpage<?>[] poolSubpageArr) {
        ArrayList arrayList = new ArrayList();
        for (PoolSubpage<?> poolSubpage : poolSubpageArr) {
            PoolSubpage poolSubpage2 = poolSubpage.next;
            if (poolSubpage2 != poolSubpage) {
                do {
                    arrayList.add(poolSubpage2);
                    poolSubpage2 = poolSubpage2.next;
                } while (poolSubpage2 != poolSubpage);
            }
        }
        return arrayList;
    }

    public static int tinyIdx(int i) {
        return i >>> 4;
    }

    public int alignCapacity(int i) {
        int i2 = this.directMemoryCacheAlignmentMask & i;
        return i2 == 0 ? i : (i + this.directMemoryCacheAlignment) - i2;
    }

    public PooledByteBuf<T> allocate(PoolThreadCache poolThreadCache, int i, int i2) {
        PooledByteBuf<T> pooledByteBufNewByteBuf = newByteBuf(i2);
        allocate(poolThreadCache, pooledByteBufNewByteBuf, i);
        return pooledByteBufNewByteBuf;
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public List<PoolChunkListMetric> chunkLists() {
        return this.chunkListMetrics;
    }

    public abstract void destroyChunk(PoolChunk<T> poolChunk);

    public final void finalize() throws Throwable {
        try {
            super.finalize();
            destroyPoolSubPages(this.smallSubpagePools);
            destroyPoolSubPages(this.tinySubpagePools);
            destroyPoolChunkLists(this.qInit, this.q000, this.q025, this.q050, this.q075, this.q100);
        } catch (Throwable th) {
            destroyPoolSubPages(this.smallSubpagePools);
            destroyPoolSubPages(this.tinySubpagePools);
            destroyPoolChunkLists(this.qInit, this.q000, this.q025, this.q050, this.q075, this.q100);
            throw th;
        }
    }

    public PoolSubpage<T> findSubpagePoolHead(int i) {
        PoolSubpage<T>[] poolSubpageArr;
        int i2;
        if (isTiny(i)) {
            i2 = i >>> 4;
            poolSubpageArr = this.tinySubpagePools;
        } else {
            int i3 = i >>> 10;
            int i4 = 0;
            while (i3 != 0) {
                i3 >>>= 1;
                i4++;
            }
            int i5 = i4;
            poolSubpageArr = this.smallSubpagePools;
            i2 = i5;
        }
        return poolSubpageArr[i2];
    }

    public void free(PoolChunk<T> poolChunk, ByteBuffer byteBuffer, long j, int i, PoolThreadCache poolThreadCache) {
        if (poolChunk.unpooled) {
            int iChunkSize = poolChunk.chunkSize();
            destroyChunk(poolChunk);
            this.activeBytesHuge.add(-iChunkSize);
            this.deallocationsHuge.increment();
            return;
        }
        SizeClass sizeClass = sizeClass(i);
        if (poolThreadCache == null || !poolThreadCache.add(this, poolChunk, byteBuffer, j, i, sizeClass)) {
            freeChunk(poolChunk, j, sizeClass, byteBuffer, false);
        }
    }

    public void freeChunk(PoolChunk<T> poolChunk, long j, SizeClass sizeClass, ByteBuffer byteBuffer, boolean z) {
        boolean z2;
        synchronized (this) {
            if (!z) {
                try {
                    int i = AnonymousClass1.$SwitchMap$io$netty$buffer$PoolArena$SizeClass[sizeClass.ordinal()];
                    if (i == 1) {
                        this.deallocationsNormal++;
                    } else if (i == 2) {
                        this.deallocationsSmall++;
                    } else {
                        if (i != 3) {
                            throw new Error();
                        }
                        this.deallocationsTiny++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z2 = !poolChunk.parent.free(poolChunk, j, byteBuffer);
        }
        if (z2) {
            destroyChunk(poolChunk);
        }
    }

    public abstract boolean isDirect();

    public boolean isTinyOrSmall(int i) {
        return (i & this.subpageOverflowMask) == 0;
    }

    public abstract void memoryCopy(T t, int i, PooledByteBuf<T> pooledByteBuf, int i2);

    public abstract PooledByteBuf<T> newByteBuf(int i);

    public abstract PoolChunk<T> newChunk(int i, int i2, int i3, int i4);

    public abstract PoolChunk<T> newUnpooledChunk(int i);

    public int normalizeCapacity(int i) {
        ObjectUtil.checkPositiveOrZero(i, "reqCapacity");
        if (i >= this.chunkSize) {
            return this.directMemoryCacheAlignment == 0 ? i : alignCapacity(i);
        }
        if (isTiny(i)) {
            if (this.directMemoryCacheAlignment > 0) {
                return alignCapacity(i);
            }
            return (i & 15) == 0 ? i : (i & (-16)) + 16;
        }
        int i2 = i - 1;
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        int i7 = (i6 | (i6 >>> 16)) + 1;
        return i7 < 0 ? i7 >>> 1 : i7;
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numActiveAllocations() {
        long j;
        long jValue = ((this.allocationsTiny.value() + this.allocationsSmall.value()) + this.allocationsHuge.value()) - this.deallocationsHuge.value();
        synchronized (this) {
            j = jValue + (this.allocationsNormal - ((this.deallocationsTiny + this.deallocationsSmall) + this.deallocationsNormal));
        }
        return Math.max(j, 0L);
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numActiveBytes() {
        long jValue = this.activeBytesHuge.value();
        synchronized (this) {
            for (int i = 0; i < this.chunkListMetrics.size(); i++) {
                try {
                    Iterator<PoolChunkMetric> it = this.chunkListMetrics.get(i).iterator();
                    while (it.hasNext()) {
                        jValue += (long) it.next().chunkSize();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Math.max(0L, jValue);
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numActiveHugeAllocations() {
        return Math.max(numHugeAllocations() - numHugeDeallocations(), 0L);
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numActiveNormalAllocations() {
        long j;
        synchronized (this) {
            j = this.allocationsNormal - this.deallocationsNormal;
        }
        return Math.max(j, 0L);
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numActiveSmallAllocations() {
        return Math.max(numSmallAllocations() - numSmallDeallocations(), 0L);
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numActiveTinyAllocations() {
        return Math.max(numTinyAllocations() - numTinyDeallocations(), 0L);
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numAllocations() {
        long j;
        synchronized (this) {
            j = this.allocationsNormal;
        }
        return this.allocationsTiny.value() + this.allocationsSmall.value() + j + this.allocationsHuge.value();
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public int numChunkLists() {
        return this.chunkListMetrics.size();
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numDeallocations() {
        long j;
        synchronized (this) {
            j = this.deallocationsTiny + this.deallocationsSmall + this.deallocationsNormal;
        }
        return j + this.deallocationsHuge.value();
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numHugeAllocations() {
        return this.allocationsHuge.value();
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numHugeDeallocations() {
        return this.deallocationsHuge.value();
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public synchronized long numNormalAllocations() {
        return this.allocationsNormal;
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public synchronized long numNormalDeallocations() {
        return this.deallocationsNormal;
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numSmallAllocations() {
        return this.allocationsSmall.value();
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public synchronized long numSmallDeallocations() {
        return this.deallocationsSmall;
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public int numSmallSubpages() {
        return this.smallSubpagePools.length;
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public int numThreadCaches() {
        return this.numThreadCaches.get();
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numTinyAllocations() {
        return this.allocationsTiny.value();
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public synchronized long numTinyDeallocations() {
        return this.deallocationsTiny;
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public int numTinySubpages() {
        return this.tinySubpagePools.length;
    }

    public void reallocate(PooledByteBuf<T> pooledByteBuf, int i, boolean z) {
        int i2 = pooledByteBuf.length;
        if (i2 == i) {
            return;
        }
        PoolChunk<T> poolChunk = pooledByteBuf.chunk;
        ByteBuffer byteBuffer = pooledByteBuf.tmpNioBuf;
        long j = pooledByteBuf.handle;
        T t = pooledByteBuf.memory;
        int i3 = pooledByteBuf.offset;
        int i4 = pooledByteBuf.maxLength;
        allocate(this.parent.threadCache(), pooledByteBuf, i);
        if (i > i2) {
            i = i2;
        } else {
            pooledByteBuf.trimIndicesToCapacity(i);
        }
        memoryCopy(t, i3, pooledByteBuf, i);
        if (z) {
            free(poolChunk, byteBuffer, j, i4, pooledByteBuf.cache);
        }
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public List<PoolSubpageMetric> smallSubpages() {
        return subPageMetricList(this.smallSubpagePools);
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public List<PoolSubpageMetric> tinySubpages() {
        return subPageMetricList(this.tinySubpagePools);
    }

    public synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append("Chunk(s) at 0~25%:");
        String str = StringUtil.NEWLINE;
        sb.append(str);
        sb.append(this.qInit);
        sb.append(str);
        sb.append("Chunk(s) at 0~50%:");
        sb.append(str);
        sb.append(this.q000);
        sb.append(str);
        sb.append("Chunk(s) at 25~75%:");
        sb.append(str);
        sb.append(this.q025);
        sb.append(str);
        sb.append("Chunk(s) at 50~100%:");
        sb.append(str);
        sb.append(this.q050);
        sb.append(str);
        sb.append("Chunk(s) at 75~100%:");
        sb.append(str);
        sb.append(this.q075);
        sb.append(str);
        sb.append("Chunk(s) at 100%:");
        sb.append(str);
        sb.append(this.q100);
        sb.append(str);
        sb.append("tiny subpages:");
        appendPoolSubPages(sb, this.tinySubpagePools);
        sb.append(str);
        sb.append("small subpages:");
        appendPoolSubPages(sb, this.smallSubpagePools);
        sb.append(str);
        return sb.toString();
    }

    private void allocate(PoolThreadCache poolThreadCache, PooledByteBuf<T> pooledByteBuf, int i) {
        int iSmallIdx;
        PoolSubpage<T>[] poolSubpageArr;
        int iNormalizeCapacity = normalizeCapacity(i);
        if (isTinyOrSmall(iNormalizeCapacity)) {
            boolean zIsTiny = isTiny(iNormalizeCapacity);
            if (zIsTiny) {
                if (poolThreadCache.allocateTiny(this, pooledByteBuf, i, iNormalizeCapacity)) {
                    return;
                }
                iSmallIdx = tinyIdx(iNormalizeCapacity);
                poolSubpageArr = this.tinySubpagePools;
            } else {
                if (poolThreadCache.allocateSmall(this, pooledByteBuf, i, iNormalizeCapacity)) {
                    return;
                }
                iSmallIdx = smallIdx(iNormalizeCapacity);
                poolSubpageArr = this.smallSubpagePools;
            }
            PoolSubpage<T> poolSubpage = poolSubpageArr[iSmallIdx];
            synchronized (poolSubpage) {
                try {
                    PoolSubpage<T> poolSubpage2 = poolSubpage.next;
                    if (poolSubpage2 != poolSubpage) {
                        poolSubpage2.chunk.initBufWithSubpage(pooledByteBuf, null, poolSubpage2.allocate(), i);
                        incTinySmallAllocation(zIsTiny);
                        return;
                    } else {
                        synchronized (this) {
                            allocateNormal(pooledByteBuf, i, iNormalizeCapacity);
                        }
                        incTinySmallAllocation(zIsTiny);
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (iNormalizeCapacity <= this.chunkSize) {
            if (poolThreadCache.allocateNormal(this, pooledByteBuf, i, iNormalizeCapacity)) {
                return;
            }
            synchronized (this) {
                allocateNormal(pooledByteBuf, i, iNormalizeCapacity);
                this.allocationsNormal++;
            }
            return;
        }
        allocateHuge(pooledByteBuf, i);
    }
}
