package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public final class CachedRegionTracker implements Cache.Listener {
    public static final int CACHED_TO_END = -2;
    public static final int NOT_CACHED = -1;
    private static final String f = "CachedRegionTracker";
    private final Cache a;
    private final String b;
    private final ChunkIndex c;
    private final TreeSet<a> d = new TreeSet<>();
    private final a e = new a(0, 0);

    public static class a implements Comparable<a> {
        public long a;
        public long b;
        public int c;

        public a(long position, long endOffset) {
            this.a = position;
            this.b = endOffset;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a another) {
            return Util.compareLong(this.a, another.a);
        }
    }

    public CachedRegionTracker(Cache cache, String cacheKey, ChunkIndex chunkIndex) {
        this.a = cache;
        this.b = cacheKey;
        this.c = chunkIndex;
        synchronized (this) {
            Iterator<CacheSpan> itDescendingIterator = cache.addListener(cacheKey, this).descendingIterator();
            while (itDescendingIterator.hasNext()) {
                a(itDescendingIterator.next());
            }
        }
    }

    private void a(CacheSpan span) {
        long j = span.position;
        a aVar = new a(j, span.length + j);
        a aVarFloor = this.d.floor(aVar);
        a aVarCeiling = this.d.ceiling(aVar);
        boolean zB = b(aVarFloor, aVar);
        if (b(aVar, aVarCeiling)) {
            if (zB) {
                aVarFloor.b = aVarCeiling.b;
                aVarFloor.c = aVarCeiling.c;
            } else {
                aVar.b = aVarCeiling.b;
                aVar.c = aVarCeiling.c;
                this.d.add(aVar);
            }
            this.d.remove(aVarCeiling);
            return;
        }
        if (!zB) {
            int iBinarySearch = Arrays.binarySearch(this.c.offsets, aVar.b);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            aVar.c = iBinarySearch;
            this.d.add(aVar);
            return;
        }
        aVarFloor.b = aVar.b;
        int i = aVarFloor.c;
        while (true) {
            ChunkIndex chunkIndex = this.c;
            if (i >= chunkIndex.length - 1) {
                break;
            }
            int i2 = i + 1;
            if (chunkIndex.offsets[i2] > aVarFloor.b) {
                break;
            } else {
                i = i2;
            }
        }
        aVarFloor.c = i;
    }

    private boolean b(@Nullable a lower, @Nullable a upper) {
        return (lower == null || upper == null || lower.b != upper.a) ? false : true;
    }

    public synchronized int getRegionEndTimeMs(long byteOffset) {
        int i;
        a aVar = this.e;
        aVar.a = byteOffset;
        a aVarFloor = this.d.floor(aVar);
        if (aVarFloor != null) {
            long j = aVarFloor.b;
            if (byteOffset <= j && (i = aVarFloor.c) != -1) {
                ChunkIndex chunkIndex = this.c;
                if (i == chunkIndex.length - 1) {
                    if (j == chunkIndex.offsets[i] + ((long) chunkIndex.sizes[i])) {
                        return -2;
                    }
                }
                return (int) ((chunkIndex.timesUs[i] + ((chunkIndex.durationsUs[i] * (j - chunkIndex.offsets[i])) / ((long) chunkIndex.sizes[i]))) / 1000);
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public synchronized void onSpanAdded(Cache cache, CacheSpan span) {
        a(span);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public synchronized void onSpanRemoved(Cache cache, CacheSpan span) {
        long j = span.position;
        a aVar = new a(j, span.length + j);
        a aVarFloor = this.d.floor(aVar);
        if (aVarFloor == null) {
            Log.e(f, "Removed a span we were not aware of");
            return;
        }
        this.d.remove(aVarFloor);
        long j2 = aVarFloor.a;
        long j3 = aVar.a;
        if (j2 < j3) {
            a aVar2 = new a(j2, j3);
            int iBinarySearch = Arrays.binarySearch(this.c.offsets, aVar2.b);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            aVar2.c = iBinarySearch;
            this.d.add(aVar2);
        }
        long j4 = aVarFloor.b;
        long j5 = aVar.b;
        if (j4 > j5) {
            a aVar3 = new a(j5 + 1, j4);
            aVar3.c = aVarFloor.c;
            this.d.add(aVar3);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanTouched(Cache cache, CacheSpan oldSpan, CacheSpan newSpan) {
    }

    public void release() {
        this.a.removeListener(this.b, this);
    }
}
