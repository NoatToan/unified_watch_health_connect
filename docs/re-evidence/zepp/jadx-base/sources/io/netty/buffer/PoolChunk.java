package io.netty.buffer;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: loaded from: classes22.dex */
final class PoolChunk<T> implements PoolChunkMetric {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int BITMAP_IDX_BIT_LENGTH = 32;
    private static final int INUSED_BIT_LENGTH = 1;
    public static final int IS_SUBPAGE_SHIFT = 32;
    public static final int IS_USED_SHIFT = 33;
    public static final int RUN_OFFSET_SHIFT = 49;
    private static final int SIZE_BIT_LENGTH = 15;
    public static final int SIZE_SHIFT = 34;
    private static final int SUBPAGE_BIT_LENGTH = 1;
    public final PoolArena<T> arena;
    public final Object base;
    private final Deque<ByteBuffer> cachedNioBuffers;
    private final int chunkSize;
    public int freeBytes;
    public final T memory;
    public PoolChunk<T> next;
    private final int pageShifts;
    private final int pageSize;
    public PoolChunkList<T> parent;
    public int pinnedBytes;
    public PoolChunk<T> prev;
    private final LongPriorityQueue[] runsAvail;
    private final LongLongHashMap runsAvailMap;
    private final PoolSubpage<T>[] subpages;
    public final boolean unpooled;

    public PoolChunk(PoolArena<T> poolArena, Object obj, T t, int i, int i2, int i3, int i4) {
        this.unpooled = false;
        this.arena = poolArena;
        this.base = obj;
        this.memory = t;
        this.pageSize = i;
        this.pageShifts = i2;
        this.chunkSize = i3;
        this.freeBytes = i3;
        this.runsAvail = newRunsAvailqueueArray(i4);
        this.runsAvailMap = new LongLongHashMap(-1L);
        int i5 = i3 >> i2;
        this.subpages = new PoolSubpage[i5];
        insertAvailRun(0, i5, ((long) i5) << 34);
        this.cachedNioBuffers = new ArrayDeque(8);
    }

    private long allocateRun(int i) {
        int i2 = i >> this.pageShifts;
        int iPages2pageIdx = this.arena.pages2pageIdx(i2);
        synchronized (this.runsAvail) {
            int iRunFirstBestFit = runFirstBestFit(iPages2pageIdx);
            if (iRunFirstBestFit == -1) {
                return -1L;
            }
            LongPriorityQueue longPriorityQueue = this.runsAvail[iRunFirstBestFit];
            long jPoll = longPriorityQueue.poll();
            removeAvailRun(longPriorityQueue, jPoll);
            if (jPoll != -1) {
                jPoll = splitLargeRun(jPoll, i2);
            }
            int iRunSize = runSize(this.pageShifts, jPoll);
            this.freeBytes -= iRunSize;
            this.pinnedBytes += iRunSize;
            return jPoll;
        }
    }

    private long allocateSubpage(int i) {
        PoolSubpage<T> poolSubpageFindSubpagePoolHead = this.arena.findSubpagePoolHead(i);
        synchronized (poolSubpageFindSubpagePoolHead) {
            long jAllocateRun = allocateRun(calculateRunSize(i));
            if (jAllocateRun < 0) {
                return -1L;
            }
            int iRunOffset = runOffset(jAllocateRun);
            int iSizeIdx2size = this.arena.sizeIdx2size(i);
            int i2 = this.pageShifts;
            PoolSubpage<T> poolSubpage = new PoolSubpage<>(poolSubpageFindSubpagePoolHead, this, i2, iRunOffset, runSize(i2, jAllocateRun), iSizeIdx2size);
            this.subpages[iRunOffset] = poolSubpage;
            return poolSubpage.allocate();
        }
    }

    public static int bitmapIdx(long j) {
        return (int) j;
    }

    private int calculateRunSize(int i) {
        int i2;
        int i3 = 1 << (this.pageShifts - 4);
        int iSizeIdx2size = this.arena.sizeIdx2size(i);
        int i4 = 0;
        do {
            i4 += this.pageSize;
            i2 = i4 / iSizeIdx2size;
            if (i2 >= i3) {
                break;
            }
        } while (i4 != i2 * iSizeIdx2size);
        while (i2 > i3) {
            i4 -= this.pageSize;
            i2 = i4 / iSizeIdx2size;
        }
        return i4;
    }

    private long collapseNext(long j) {
        while (true) {
            int iRunOffset = runOffset(j);
            int iRunPages = runPages(j);
            int i = iRunOffset + iRunPages;
            long availRunByOffset = getAvailRunByOffset(i);
            if (availRunByOffset == -1) {
                return j;
            }
            int iRunOffset2 = runOffset(availRunByOffset);
            int iRunPages2 = runPages(availRunByOffset);
            if (availRunByOffset == j || i != iRunOffset2) {
                return j;
            }
            removeAvailRun(availRunByOffset);
            j = toRunHandle(iRunOffset, iRunPages + iRunPages2, 0);
        }
    }

    private long collapsePast(long j) {
        while (true) {
            int iRunOffset = runOffset(j);
            int iRunPages = runPages(j);
            long availRunByOffset = getAvailRunByOffset(iRunOffset - 1);
            if (availRunByOffset == -1) {
                return j;
            }
            int iRunOffset2 = runOffset(availRunByOffset);
            int iRunPages2 = runPages(availRunByOffset);
            if (availRunByOffset == j || iRunOffset2 + iRunPages2 != iRunOffset) {
                return j;
            }
            removeAvailRun(availRunByOffset);
            j = toRunHandle(iRunOffset2, iRunPages2 + iRunPages, 0);
        }
    }

    private long collapseRuns(long j) {
        return collapseNext(collapsePast(j));
    }

    private long getAvailRunByOffset(int i) {
        return this.runsAvailMap.get(i);
    }

    private void insertAvailRun(int i, int i2, long j) {
        this.runsAvail[this.arena.pages2pageIdxFloor(i2)].offer(j);
        insertAvailRun0(i, j);
        if (i2 > 1) {
            insertAvailRun0(lastPage(i, i2), j);
        }
    }

    private void insertAvailRun0(int i, long j) {
        this.runsAvailMap.put(i, j);
    }

    public static boolean isRun(long j) {
        return !isSubpage(j);
    }

    public static boolean isSubpage(long j) {
        return ((j >> 32) & 1) == 1;
    }

    public static boolean isUsed(long j) {
        return ((j >> 33) & 1) == 1;
    }

    private static int lastPage(int i, int i2) {
        return (i + i2) - 1;
    }

    private static LongPriorityQueue[] newRunsAvailqueueArray(int i) {
        LongPriorityQueue[] longPriorityQueueArr = new LongPriorityQueue[i];
        for (int i2 = 0; i2 < i; i2++) {
            longPriorityQueueArr[i2] = new LongPriorityQueue();
        }
        return longPriorityQueueArr;
    }

    private void removeAvailRun(long j) {
        removeAvailRun(this.runsAvail[this.arena.pages2pageIdxFloor(runPages(j))], j);
    }

    private int runFirstBestFit(int i) {
        if (this.freeBytes == this.chunkSize) {
            return this.arena.nPSizes - 1;
        }
        while (i < this.arena.nPSizes) {
            LongPriorityQueue longPriorityQueue = this.runsAvail[i];
            if (longPriorityQueue != null && !longPriorityQueue.isEmpty()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int runOffset(long j) {
        return (int) (j >> 49);
    }

    public static int runPages(long j) {
        return (int) ((j >> 34) & 32767);
    }

    public static int runSize(int i, long j) {
        return runPages(j) << i;
    }

    private long splitLargeRun(long j, int i) {
        int iRunPages = runPages(j) - i;
        if (iRunPages <= 0) {
            return j | 8589934592L;
        }
        int iRunOffset = runOffset(j);
        int i2 = iRunOffset + i;
        insertAvailRun(i2, iRunPages, toRunHandle(i2, iRunPages, 0));
        return toRunHandle(iRunOffset, i, 1);
    }

    private static long toRunHandle(int i, int i2, int i3) {
        return (((long) i2) << 34) | (((long) i) << 49) | (((long) i3) << 33);
    }

    public boolean allocate(PooledByteBuf<T> pooledByteBuf, int i, int i2, PoolThreadCache poolThreadCache) {
        long jAllocateRun;
        PoolArena<T> poolArena = this.arena;
        if (i2 <= poolArena.smallMaxSizeIdx) {
            jAllocateRun = allocateSubpage(i2);
            if (jAllocateRun < 0) {
                return false;
            }
        } else {
            jAllocateRun = allocateRun(poolArena.sizeIdx2size(i2));
            if (jAllocateRun < 0) {
                return false;
            }
        }
        long j = jAllocateRun;
        Deque<ByteBuffer> deque = this.cachedNioBuffers;
        initBuf(pooledByteBuf, deque != null ? deque.pollLast() : null, j, i, poolThreadCache);
        return true;
    }

    @Override // io.netty.buffer.PoolChunkMetric
    public int chunkSize() {
        return this.chunkSize;
    }

    public void destroy() {
        this.arena.destroyChunk(this);
    }

    public void free(long j, int i, ByteBuffer byteBuffer) {
        Deque<ByteBuffer> deque;
        int iRunSize = runSize(this.pageShifts, j);
        this.pinnedBytes -= iRunSize;
        if (isSubpage(j)) {
            PoolSubpage<T> poolSubpageFindSubpagePoolHead = this.arena.findSubpagePoolHead(this.arena.size2SizeIdx(i));
            int iRunOffset = runOffset(j);
            PoolSubpage<T> poolSubpage = this.subpages[iRunOffset];
            synchronized (poolSubpageFindSubpagePoolHead) {
                if (poolSubpage.free(poolSubpageFindSubpagePoolHead, bitmapIdx(j))) {
                    return;
                } else {
                    this.subpages[iRunOffset] = null;
                }
            }
        }
        synchronized (this.runsAvail) {
            long jCollapseRuns = collapseRuns(j) & (-8589934593L) & (-4294967297L);
            insertAvailRun(runOffset(jCollapseRuns), runPages(jCollapseRuns), jCollapseRuns);
            this.freeBytes += iRunSize;
        }
        if (byteBuffer == null || (deque = this.cachedNioBuffers) == null || deque.size() >= PooledByteBufAllocator.DEFAULT_MAX_CACHED_BYTEBUFFERS_PER_CHUNK) {
            return;
        }
        this.cachedNioBuffers.offer(byteBuffer);
    }

    @Override // io.netty.buffer.PoolChunkMetric
    public int freeBytes() {
        int i;
        synchronized (this.arena) {
            i = this.freeBytes;
        }
        return i;
    }

    public void initBuf(PooledByteBuf<T> pooledByteBuf, ByteBuffer byteBuffer, long j, int i, PoolThreadCache poolThreadCache) {
        if (!isRun(j)) {
            initBufWithSubpage(pooledByteBuf, byteBuffer, j, i, poolThreadCache);
            return;
        }
        int iRunOffset = runOffset(j);
        int i2 = this.pageShifts;
        pooledByteBuf.init(this, byteBuffer, j, iRunOffset << i2, i, runSize(i2, j), this.arena.parent.threadCache());
    }

    public void initBufWithSubpage(PooledByteBuf<T> pooledByteBuf, ByteBuffer byteBuffer, long j, int i, PoolThreadCache poolThreadCache) {
        int iRunOffset = runOffset(j);
        int iBitmapIdx = bitmapIdx(j);
        PoolSubpage<T> poolSubpage = this.subpages[iRunOffset];
        int i2 = iRunOffset << this.pageShifts;
        int i3 = poolSubpage.elemSize;
        pooledByteBuf.init(this, byteBuffer, j, i2 + (iBitmapIdx * i3), i, i3, poolThreadCache);
    }

    public int pinnedBytes() {
        int i;
        synchronized (this.arena) {
            i = this.pinnedBytes;
        }
        return i;
    }

    public String toString() {
        int i;
        synchronized (this.arena) {
            i = this.freeBytes;
        }
        return "Chunk(" + Integer.toHexString(System.identityHashCode(this)) + ": " + usage(i) + "%, " + (this.chunkSize - i) + '/' + this.chunkSize + ')';
    }

    @Override // io.netty.buffer.PoolChunkMetric
    public int usage() {
        int i;
        synchronized (this.arena) {
            i = this.freeBytes;
        }
        return usage(i);
    }

    private void removeAvailRun(LongPriorityQueue longPriorityQueue, long j) {
        longPriorityQueue.remove(j);
        int iRunOffset = runOffset(j);
        int iRunPages = runPages(j);
        this.runsAvailMap.remove(iRunOffset);
        if (iRunPages > 1) {
            this.runsAvailMap.remove(lastPage(iRunOffset, iRunPages));
        }
    }

    private int usage(int i) {
        if (i == 0) {
            return 100;
        }
        int i2 = (int) ((((long) i) * 100) / ((long) this.chunkSize));
        if (i2 == 0) {
            return 99;
        }
        return 100 - i2;
    }

    public PoolChunk(PoolArena<T> poolArena, Object obj, T t, int i) {
        this.unpooled = true;
        this.arena = poolArena;
        this.base = obj;
        this.memory = t;
        this.pageSize = 0;
        this.pageShifts = 0;
        this.runsAvailMap = null;
        this.runsAvail = null;
        this.subpages = null;
        this.chunkSize = i;
        this.cachedNioBuffers = null;
    }
}
