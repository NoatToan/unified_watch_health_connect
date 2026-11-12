package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.cache.CacheSpan;
import com.google.android.exoplayer2.upstream.cache.LeastRecentlyUsedCacheEvictor;
import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public final class LeastRecentlyUsedCacheEvictor implements CacheEvictor {
    private final long a;
    private final TreeSet<CacheSpan> b = new TreeSet<>(new Comparator() { // from class: em4
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return LeastRecentlyUsedCacheEvictor.b((CacheSpan) obj, (CacheSpan) obj2);
        }
    });
    private long c;

    public LeastRecentlyUsedCacheEvictor(long maxBytes) {
        this.a = maxBytes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(CacheSpan lhs, CacheSpan rhs) {
        long j = lhs.lastTouchTimestamp;
        long j2 = rhs.lastTouchTimestamp;
        if (j - j2 == 0) {
            return lhs.compareTo(rhs);
        }
        return j < j2 ? -1 : 1;
    }

    private void c(Cache cache, long requiredSpace) {
        while (this.c + requiredSpace > this.a && !this.b.isEmpty()) {
            cache.removeSpan(this.b.first());
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public void onCacheInitialized() {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanAdded(Cache cache, CacheSpan span) {
        this.b.add(span);
        this.c += span.length;
        c(cache, 0L);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanRemoved(Cache cache, CacheSpan span) {
        this.b.remove(span);
        this.c -= span.length;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanTouched(Cache cache, CacheSpan oldSpan, CacheSpan newSpan) {
        onSpanRemoved(cache, oldSpan);
        onSpanAdded(cache, newSpan);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public void onStartFile(Cache cache, String key, long position, long length) {
        if (length != -1) {
            c(cache, length);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public boolean requiresCacheSpanTouches() {
        return true;
    }
}
