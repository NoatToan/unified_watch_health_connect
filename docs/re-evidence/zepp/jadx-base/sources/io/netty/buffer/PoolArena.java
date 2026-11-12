package io.netty.buffer;

import io.netty.util.internal.LongCounter;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.StringUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes22.dex */
abstract class PoolArena<T> extends SizeClasses implements PoolArenaMetric {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final boolean HAS_UNSAFE = PlatformDependent.hasUnsafe();
    private final LongCounter activeBytesHuge;
    private final LongCounter allocationsHuge;
    private long allocationsNormal;
    private final LongCounter allocationsSmall;
    private final List<PoolChunkListMetric> chunkListMetrics;
    private final LongCounter deallocationsHuge;
    private long deallocationsNormal;
    private long deallocationsSmall;
    public final int directMemoryCacheAlignment;
    public final int numSmallSubpagePools;
    public final AtomicInteger numThreadCaches;
    public final PooledByteBufAllocator parent;
    private final PoolChunkList<T> q000;
    private final PoolChunkList<T> q025;
    private final PoolChunkList<T> q050;
    private final PoolChunkList<T> q075;
    private final PoolChunkList<T> q100;
    private final PoolChunkList<T> qInit;
    private final PoolSubpage<T>[] smallSubpagePools;

    /* JADX INFO: renamed from: io.netty.buffer.PoolArena$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$io$netty$buffer$PoolArena$SizeClass;

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
        }
    }

    public static final class DirectArena extends PoolArena<ByteBuffer> {
        public DirectArena(PooledByteBufAllocator pooledByteBufAllocator, int i, int i2, int i3, int i4) {
            super(pooledByteBufAllocator, i, i2, i3, i4);
        }

        private static ByteBuffer allocateDirect(int i) {
            return PlatformDependent.useDirectBufferNoCleaner() ? PlatformDependent.allocateDirectNoCleaner(i) : ByteBuffer.allocateDirect(i);
        }

        @Override // io.netty.buffer.PoolArena
        public void destroyChunk(PoolChunk<ByteBuffer> poolChunk) {
            if (PlatformDependent.useDirectBufferNoCleaner()) {
                PlatformDependent.freeDirectNoCleaner((ByteBuffer) poolChunk.base);
            } else {
                PlatformDependent.freeDirectBuffer((ByteBuffer) poolChunk.base);
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
            int i5 = ((PoolArena) this).directMemoryCacheAlignment;
            if (i5 == 0) {
                ByteBuffer byteBufferAllocateDirect = allocateDirect(i4);
                return new PoolChunk<>(this, byteBufferAllocateDirect, byteBufferAllocateDirect, i, i3, i4, i2);
            }
            ByteBuffer byteBufferAllocateDirect2 = allocateDirect(i5 + i4);
            return new PoolChunk<>(this, byteBufferAllocateDirect2, PlatformDependent.alignDirectBuffer(byteBufferAllocateDirect2, ((PoolArena) this).directMemoryCacheAlignment), i, i3, i4, i2);
        }

        @Override // io.netty.buffer.PoolArena
        public PoolChunk<ByteBuffer> newUnpooledChunk(int i) {
            int i2 = ((PoolArena) this).directMemoryCacheAlignment;
            if (i2 == 0) {
                ByteBuffer byteBufferAllocateDirect = allocateDirect(i);
                return new PoolChunk<>(this, byteBufferAllocateDirect, byteBufferAllocateDirect, i);
            }
            ByteBuffer byteBufferAllocateDirect2 = allocateDirect(i2 + i);
            return new PoolChunk<>(this, byteBufferAllocateDirect2, PlatformDependent.alignDirectBuffer(byteBufferAllocateDirect2, ((PoolArena) this).directMemoryCacheAlignment), i);
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
        public HeapArena(PooledByteBufAllocator pooledByteBufAllocator, int i, int i2, int i3, int i4) {
            super(pooledByteBufAllocator, i, i2, i3, i4);
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
            return new PoolChunk<>(this, null, newByteArray(i4), i, i3, i4, i2);
        }

        @Override // io.netty.buffer.PoolArena
        public PoolChunk<byte[]> newUnpooledChunk(int i) {
            return new PoolChunk<>(this, null, newByteArray(i), i);
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
        Small,
        Normal
    }

    public PoolArena(PooledByteBufAllocator pooledByteBufAllocator, int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.allocationsSmall = PlatformDependent.newLongCounter();
        this.allocationsHuge = PlatformDependent.newLongCounter();
        this.activeBytesHuge = PlatformDependent.newLongCounter();
        this.deallocationsHuge = PlatformDependent.newLongCounter();
        this.numThreadCaches = new AtomicInteger();
        this.parent = pooledByteBufAllocator;
        this.directMemoryCacheAlignment = i4;
        int i5 = this.nSubpages;
        this.numSmallSubpagePools = i5;
        this.smallSubpagePools = newSubpagePoolArray(i5);
        int i6 = 0;
        while (true) {
            PoolSubpage<T>[] poolSubpageArr = this.smallSubpagePools;
            if (i6 >= poolSubpageArr.length) {
                PoolChunkList<T> poolChunkList = new PoolChunkList<>(this, null, 100, Integer.MAX_VALUE, i3);
                this.q100 = poolChunkList;
                PoolChunkList<T> poolChunkList2 = new PoolChunkList<>(this, poolChunkList, 75, 100, i3);
                this.q075 = poolChunkList2;
                PoolChunkList<T> poolChunkList3 = new PoolChunkList<>(this, poolChunkList2, 50, 100, i3);
                this.q050 = poolChunkList3;
                PoolChunkList<T> poolChunkList4 = new PoolChunkList<>(this, poolChunkList3, 25, 75, i3);
                this.q025 = poolChunkList4;
                PoolChunkList<T> poolChunkList5 = new PoolChunkList<>(this, poolChunkList4, 1, 50, i3);
                this.q000 = poolChunkList5;
                PoolChunkList<T> poolChunkList6 = new PoolChunkList<>(this, poolChunkList5, Integer.MIN_VALUE, 25, i3);
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
            poolSubpageArr[i6] = newSubpagePoolHead();
            i6++;
        }
    }

    private void allocateHuge(PooledByteBuf<T> pooledByteBuf, int i) {
        PoolChunk<T> poolChunkNewUnpooledChunk = newUnpooledChunk(i);
        this.activeBytesHuge.add(poolChunkNewUnpooledChunk.chunkSize());
        pooledByteBuf.initUnpooled(poolChunkNewUnpooledChunk, i);
        this.allocationsHuge.increment();
    }

    private void allocateNormal(PooledByteBuf<T> pooledByteBuf, int i, int i2, PoolThreadCache poolThreadCache) {
        if (this.q050.allocate(pooledByteBuf, i, i2, poolThreadCache) || this.q025.allocate(pooledByteBuf, i, i2, poolThreadCache) || this.q000.allocate(pooledByteBuf, i, i2, poolThreadCache) || this.qInit.allocate(pooledByteBuf, i, i2, poolThreadCache) || this.q075.allocate(pooledByteBuf, i, i2, poolThreadCache)) {
            return;
        }
        PoolChunk<T> poolChunkNewChunk = newChunk(this.pageSize, this.nPSizes, this.pageShifts, this.chunkSize);
        poolChunkNewChunk.allocate(pooledByteBuf, i, i2, poolThreadCache);
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

    private void incSmallAllocation() {
        this.allocationsSmall.increment();
    }

    private PoolSubpage<T>[] newSubpagePoolArray(int i) {
        return new PoolSubpage[i];
    }

    private PoolSubpage<T> newSubpagePoolHead() {
        PoolSubpage<T> poolSubpage = new PoolSubpage<>();
        poolSubpage.prev = poolSubpage;
        poolSubpage.next = poolSubpage;
        return poolSubpage;
    }

    private static SizeClass sizeClass(long j) {
        return PoolChunk.isSubpage(j) ? SizeClass.Small : SizeClass.Normal;
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

    private void tcacheAllocateNormal(PoolThreadCache poolThreadCache, PooledByteBuf<T> pooledByteBuf, int i, int i2) {
        if (poolThreadCache.allocateNormal(this, pooledByteBuf, i, i2)) {
            return;
        }
        synchronized (this) {
            allocateNormal(pooledByteBuf, i, i2, poolThreadCache);
            this.allocationsNormal++;
        }
    }

    private void tcacheAllocateSmall(PoolThreadCache poolThreadCache, PooledByteBuf<T> pooledByteBuf, int i, int i2) {
        boolean z;
        if (poolThreadCache.allocateSmall(this, pooledByteBuf, i, i2)) {
            return;
        }
        PoolSubpage<T> poolSubpage = this.smallSubpagePools[i2];
        synchronized (poolSubpage) {
            PoolSubpage<T> poolSubpage2 = poolSubpage.next;
            z = poolSubpage2 == poolSubpage;
            if (!z) {
                poolSubpage2.chunk.initBufWithSubpage(pooledByteBuf, null, poolSubpage2.allocate(), i, poolThreadCache);
            }
        }
        if (z) {
            synchronized (this) {
                allocateNormal(pooledByteBuf, i, i2, poolThreadCache);
            }
        }
        incSmallAllocation();
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
            destroyPoolChunkLists(this.qInit, this.q000, this.q025, this.q050, this.q075, this.q100);
        } catch (Throwable th) {
            destroyPoolSubPages(this.smallSubpagePools);
            destroyPoolChunkLists(this.qInit, this.q000, this.q025, this.q050, this.q075, this.q100);
            throw th;
        }
    }

    public PoolSubpage<T> findSubpagePoolHead(int i) {
        return this.smallSubpagePools[i];
    }

    public void free(PoolChunk<T> poolChunk, ByteBuffer byteBuffer, long j, int i, PoolThreadCache poolThreadCache) {
        if (poolChunk.unpooled) {
            int iChunkSize = poolChunk.chunkSize();
            destroyChunk(poolChunk);
            this.activeBytesHuge.add(-iChunkSize);
            this.deallocationsHuge.increment();
            return;
        }
        SizeClass sizeClass = sizeClass(j);
        if (poolThreadCache == null || !poolThreadCache.add(this, poolChunk, byteBuffer, j, i, sizeClass)) {
            freeChunk(poolChunk, j, i, sizeClass, byteBuffer, false);
        }
    }

    public void freeChunk(PoolChunk<T> poolChunk, long j, int i, SizeClass sizeClass, ByteBuffer byteBuffer, boolean z) {
        boolean z2;
        synchronized (this) {
            z2 = true;
            if (!z) {
                int i2 = AnonymousClass1.$SwitchMap$io$netty$buffer$PoolArena$SizeClass[sizeClass.ordinal()];
                if (i2 == 1) {
                    this.deallocationsNormal++;
                } else {
                    if (i2 != 2) {
                        throw new Error();
                    }
                    this.deallocationsSmall++;
                }
            }
            if (poolChunk.parent.free(poolChunk, j, i, byteBuffer)) {
                z2 = false;
            }
        }
        if (z2) {
            destroyChunk(poolChunk);
        }
    }

    public abstract boolean isDirect();

    public abstract void memoryCopy(T t, int i, PooledByteBuf<T> pooledByteBuf, int i2);

    public abstract PooledByteBuf<T> newByteBuf(int i);

    public abstract PoolChunk<T> newChunk(int i, int i2, int i3, int i4);

    public abstract PoolChunk<T> newUnpooledChunk(int i);

    @Override // io.netty.buffer.PoolArenaMetric
    public long numActiveAllocations() {
        long j;
        long jValue = (this.allocationsSmall.value() + this.allocationsHuge.value()) - this.deallocationsHuge.value();
        synchronized (this) {
            j = jValue + (this.allocationsNormal - (this.deallocationsSmall + this.deallocationsNormal));
        }
        return Math.max(j, 0L);
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numActiveBytes() {
        long jValue = this.activeBytesHuge.value();
        synchronized (this) {
            for (int i = 0; i < this.chunkListMetrics.size(); i++) {
                Iterator<PoolChunkMetric> it2 = this.chunkListMetrics.get(i).iterator();
                while (it2.hasNext()) {
                    jValue += (long) it2.next().chunkSize();
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
        return 0L;
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numAllocations() {
        long j;
        synchronized (this) {
            j = this.allocationsNormal;
        }
        return this.allocationsSmall.value() + j + this.allocationsHuge.value();
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public int numChunkLists() {
        return this.chunkListMetrics.size();
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numDeallocations() {
        long j;
        synchronized (this) {
            j = this.deallocationsSmall + this.deallocationsNormal;
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

    public long numPinnedBytes() {
        long jValue = this.activeBytesHuge.value();
        synchronized (this) {
            for (int i = 0; i < this.chunkListMetrics.size(); i++) {
                Iterator<PoolChunkMetric> it2 = this.chunkListMetrics.get(i).iterator();
                while (it2.hasNext()) {
                    jValue += (long) ((PoolChunk) it2.next()).pinnedBytes();
                }
            }
        }
        return Math.max(0L, jValue);
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
        return 0L;
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public long numTinyDeallocations() {
        return 0L;
    }

    @Override // io.netty.buffer.PoolArenaMetric
    public int numTinySubpages() {
        return 0;
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
        return Collections.emptyList();
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
        sb.append("small subpages:");
        appendPoolSubPages(sb, this.smallSubpagePools);
        sb.append(str);
        return sb.toString();
    }

    private void allocate(PoolThreadCache poolThreadCache, PooledByteBuf<T> pooledByteBuf, int i) {
        int iSize2SizeIdx = size2SizeIdx(i);
        if (iSize2SizeIdx <= this.smallMaxSizeIdx) {
            tcacheAllocateSmall(poolThreadCache, pooledByteBuf, i, iSize2SizeIdx);
        } else {
            if (iSize2SizeIdx < this.nSizes) {
                tcacheAllocateNormal(poolThreadCache, pooledByteBuf, i, iSize2SizeIdx);
                return;
            }
            if (this.directMemoryCacheAlignment > 0) {
                i = normalizeSize(i);
            }
            allocateHuge(pooledByteBuf, i);
        }
    }
}
