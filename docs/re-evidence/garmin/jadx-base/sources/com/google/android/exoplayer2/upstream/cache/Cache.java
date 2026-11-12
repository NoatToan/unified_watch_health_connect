package com.google.android.exoplayer2.upstream.cache;

import java.io.File;
import java.io.IOException;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public interface Cache {
    public static final long UID_UNSET = -1;

    public interface Listener {
        void onSpanAdded(Cache cache, CacheSpan cacheSpan);

        void onSpanRemoved(Cache cache, CacheSpan cacheSpan);

        void onSpanTouched(Cache cache, CacheSpan cacheSpan, CacheSpan cacheSpan2);
    }

    NavigableSet<CacheSpan> addListener(String str, Listener listener);

    void applyContentMetadataMutations(String str, ContentMetadataMutations contentMetadataMutations);

    void commitFile(File file, long j8);

    long getCacheSpace();

    long getCachedBytes(String str, long j8, long j14);

    long getCachedLength(String str, long j8, long j14);

    NavigableSet<CacheSpan> getCachedSpans(String str);

    ContentMetadata getContentMetadata(String str);

    Set<String> getKeys();

    long getUid();

    boolean isCached(String str, long j8, long j14);

    void release();

    void releaseHoleSpan(CacheSpan cacheSpan);

    void removeListener(String str, Listener listener);

    void removeResource(String str);

    void removeSpan(CacheSpan cacheSpan);

    File startFile(String str, long j8, long j14);

    CacheSpan startReadWrite(String str, long j8, long j14);

    CacheSpan startReadWriteNonBlocking(String str, long j8, long j14);

    public static class CacheException extends IOException {
        public CacheException(String str) {
            super(str);
        }

        public CacheException(Throwable th3) {
            super(th3);
        }

        public CacheException(String str, Throwable th3) {
            super(str, th3);
        }
    }
}
