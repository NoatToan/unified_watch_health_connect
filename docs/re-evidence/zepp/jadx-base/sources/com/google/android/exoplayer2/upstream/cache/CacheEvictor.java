package com.google.android.exoplayer2.upstream.cache;

/* JADX INFO: loaded from: classes3.dex */
public interface CacheEvictor extends Cache.Listener {
    void onCacheInitialized();

    void onStartFile(Cache cache, String key, long position, long length);

    boolean requiresCacheSpanTouches();
}
