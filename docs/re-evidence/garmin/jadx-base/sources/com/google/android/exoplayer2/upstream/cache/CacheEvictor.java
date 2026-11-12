package com.google.android.exoplayer2.upstream.cache;

/* JADX INFO: loaded from: classes14.dex */
public interface CacheEvictor extends Cache.Listener {
    void onCacheInitialized();

    void onStartFile(Cache cache, String str, long j8, long j14);

    boolean requiresCacheSpanTouches();
}
