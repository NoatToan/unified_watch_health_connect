package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.DataSourceUtil;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes14.dex */
public final class CacheWriter {
    public static final int DEFAULT_BUFFER_SIZE_BYTES = 131072;
    private long bytesCached;
    private final Cache cache;
    private final String cacheKey;
    private final CacheDataSource dataSource;
    private final DataSpec dataSpec;
    private long endPosition;
    private volatile boolean isCanceled;
    private long nextPosition;
    private final ProgressListener progressListener;
    private final byte[] temporaryBuffer;

    public interface ProgressListener {
        void onProgress(long j8, long j14, long j15);
    }

    public CacheWriter(CacheDataSource cacheDataSource, DataSpec dataSpec, byte[] bArr, ProgressListener progressListener) {
        this.dataSource = cacheDataSource;
        this.cache = cacheDataSource.getCache();
        this.dataSpec = dataSpec;
        this.temporaryBuffer = bArr == null ? new byte[131072] : bArr;
        this.progressListener = progressListener;
        this.cacheKey = cacheDataSource.getCacheKeyFactory().buildCacheKey(dataSpec);
        this.nextPosition = dataSpec.position;
    }

    private long getLength() {
        long j8 = this.endPosition;
        if (j8 == -1) {
            return -1L;
        }
        return j8 - this.dataSpec.position;
    }

    private void onNewBytesCached(long j8) {
        this.bytesCached += j8;
        ProgressListener progressListener = this.progressListener;
        if (progressListener != null) {
            progressListener.onProgress(getLength(), this.bytesCached, j8);
        }
    }

    private void onRequestEndPosition(long j8) {
        if (this.endPosition == j8) {
            return;
        }
        this.endPosition = j8;
        ProgressListener progressListener = this.progressListener;
        if (progressListener != null) {
            progressListener.onProgress(getLength(), this.bytesCached, 0L);
        }
    }

    private long readBlockToCache(long j8, long j14) throws IOException {
        long jOpen;
        boolean z14 = true;
        boolean z15 = j8 + j14 == this.endPosition || j14 == -1;
        if (j14 != -1) {
            try {
                jOpen = this.dataSource.open(this.dataSpec.buildUpon().setPosition(j8).setLength(j14).build());
            } catch (IOException unused) {
                DataSourceUtil.closeQuietly(this.dataSource);
                z14 = false;
                jOpen = -1;
            }
        } else {
            z14 = false;
            jOpen = -1;
        }
        if (!z14) {
            throwIfCanceled();
            try {
                jOpen = this.dataSource.open(this.dataSpec.buildUpon().setPosition(j8).setLength(-1L).build());
            } catch (IOException e4) {
                DataSourceUtil.closeQuietly(this.dataSource);
                throw e4;
            }
        }
        if (z15 && jOpen != -1) {
            try {
                onRequestEndPosition(jOpen + j8);
            } catch (IOException e14) {
                DataSourceUtil.closeQuietly(this.dataSource);
                throw e14;
            }
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 != -1) {
            throwIfCanceled();
            CacheDataSource cacheDataSource = this.dataSource;
            byte[] bArr = this.temporaryBuffer;
            i14 = cacheDataSource.read(bArr, 0, bArr.length);
            if (i14 != -1) {
                onNewBytesCached(i14);
                i15 += i14;
            }
        }
        if (z15) {
            onRequestEndPosition(j8 + ((long) i15));
        }
        this.dataSource.close();
        return i15;
    }

    private void throwIfCanceled() throws InterruptedIOException {
        if (this.isCanceled) {
            throw new InterruptedIOException();
        }
    }

    public void cache() {
        throwIfCanceled();
        Cache cache = this.cache;
        String str = this.cacheKey;
        DataSpec dataSpec = this.dataSpec;
        this.bytesCached = cache.getCachedBytes(str, dataSpec.position, dataSpec.length);
        DataSpec dataSpec2 = this.dataSpec;
        long j8 = dataSpec2.length;
        if (j8 != -1) {
            this.endPosition = dataSpec2.position + j8;
        } else {
            long contentLength = ContentMetadata.getContentLength(this.cache.getContentMetadata(this.cacheKey));
            if (contentLength == -1) {
                contentLength = -1;
            }
            this.endPosition = contentLength;
        }
        ProgressListener progressListener = this.progressListener;
        if (progressListener != null) {
            progressListener.onProgress(getLength(), this.bytesCached, 0L);
        }
        while (true) {
            long j14 = this.endPosition;
            if (j14 != -1 && this.nextPosition >= j14) {
                return;
            }
            throwIfCanceled();
            long j15 = this.endPosition;
            long cachedLength = this.cache.getCachedLength(this.cacheKey, this.nextPosition, j15 == -1 ? Long.MAX_VALUE : j15 - this.nextPosition);
            if (cachedLength > 0) {
                this.nextPosition += cachedLength;
            } else {
                long j16 = -cachedLength;
                if (j16 == Long.MAX_VALUE) {
                    j16 = -1;
                }
                long j17 = this.nextPosition;
                this.nextPosition = j17 + readBlockToCache(j17, j16);
            }
        }
    }

    public void cancel() {
        this.isCanceled = true;
    }
}
