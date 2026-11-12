package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes3.dex */
public final class CacheWriter {
    public static final int DEFAULT_BUFFER_SIZE_BYTES = 131072;
    private final CacheDataSource a;
    private final Cache b;
    private final DataSpec c;
    private final String d;
    private final byte[] e;

    @Nullable
    private final ProgressListener f;
    private long g;
    private long h;
    private long i;
    private volatile boolean j;

    public interface ProgressListener {
        void onProgress(long requestLength, long bytesCached, long newBytesCached);
    }

    public CacheWriter(CacheDataSource dataSource, DataSpec dataSpec, @Nullable byte[] temporaryBuffer, @Nullable ProgressListener progressListener) {
        this.a = dataSource;
        this.b = dataSource.getCache();
        this.c = dataSpec;
        this.e = temporaryBuffer == null ? new byte[131072] : temporaryBuffer;
        this.f = progressListener;
        this.d = dataSource.getCacheKeyFactory().buildCacheKey(dataSpec);
        this.g = dataSpec.position;
    }

    private long a() {
        long j = this.h;
        if (j == -1) {
            return -1L;
        }
        return j - this.c.position;
    }

    private void b(long newBytesCached) {
        this.i += newBytesCached;
        ProgressListener progressListener = this.f;
        if (progressListener != null) {
            progressListener.onProgress(a(), this.i, newBytesCached);
        }
    }

    private void c(long endPosition) {
        if (this.h == endPosition) {
            return;
        }
        this.h = endPosition;
        ProgressListener progressListener = this.f;
        if (progressListener != null) {
            progressListener.onProgress(a(), this.i, 0L);
        }
    }

    private long d(long position, long length) throws IOException {
        long jOpen;
        boolean z = true;
        boolean z2 = position + length == this.h || length == -1;
        if (length != -1) {
            try {
                jOpen = this.a.open(this.c.buildUpon().setPosition(position).setLength(length).build());
            } catch (IOException unused) {
                Util.closeQuietly(this.a);
                jOpen = -1;
                z = false;
            }
        } else {
            jOpen = -1;
            z = false;
        }
        if (!z) {
            e();
            try {
                jOpen = this.a.open(this.c.buildUpon().setPosition(position).setLength(-1L).build());
            } catch (IOException e) {
                Util.closeQuietly(this.a);
                throw e;
            }
        }
        if (z2 && jOpen != -1) {
            try {
                c(jOpen + position);
            } catch (IOException e2) {
                Util.closeQuietly(this.a);
                throw e2;
            }
        }
        int i = 0;
        int i2 = 0;
        while (i != -1) {
            e();
            CacheDataSource cacheDataSource = this.a;
            byte[] bArr = this.e;
            i = cacheDataSource.read(bArr, 0, bArr.length);
            if (i != -1) {
                b(i);
                i2 += i;
            }
        }
        if (z2) {
            c(position + ((long) i2));
        }
        this.a.close();
        return i2;
    }

    private void e() throws InterruptedIOException {
        if (this.j) {
            throw new InterruptedIOException();
        }
    }

    @WorkerThread
    public void cache() throws IOException {
        e();
        Cache cache = this.b;
        String str = this.d;
        DataSpec dataSpec = this.c;
        this.i = cache.getCachedBytes(str, dataSpec.position, dataSpec.length);
        DataSpec dataSpec2 = this.c;
        long j = dataSpec2.length;
        if (j != -1) {
            this.h = dataSpec2.position + j;
        } else {
            long jA = e.a(this.b.getContentMetadata(this.d));
            if (jA == -1) {
                jA = -1;
            }
            this.h = jA;
        }
        ProgressListener progressListener = this.f;
        if (progressListener != null) {
            progressListener.onProgress(a(), this.i, 0L);
        }
        while (true) {
            long j2 = this.h;
            if (j2 != -1 && this.g >= j2) {
                return;
            }
            e();
            long j3 = this.h;
            long cachedLength = this.b.getCachedLength(this.d, this.g, j3 == -1 ? Long.MAX_VALUE : j3 - this.g);
            if (cachedLength > 0) {
                this.g += cachedLength;
            } else {
                long j4 = -cachedLength;
                if (j4 == Long.MAX_VALUE) {
                    j4 = -1;
                }
                long j5 = this.g;
                this.g = j5 + d(j5, j4);
            }
        }
    }

    public void cancel() {
        this.j = true;
    }
}
