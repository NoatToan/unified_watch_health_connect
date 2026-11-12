package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ReusableBufferedOutputStream;
import com.google.android.exoplayer2.util.Util;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class CacheDataSink implements DataSink {
    public static final int DEFAULT_BUFFER_SIZE = 20480;
    public static final long DEFAULT_FRAGMENT_SIZE = 5242880;
    private static final long k = 2097152;
    private static final String l = "CacheDataSink";
    private final Cache a;
    private final long b;
    private final int c;

    @Nullable
    private DataSpec d;
    private long e;

    @Nullable
    private File f;

    @Nullable
    private OutputStream g;
    private long h;
    private long i;
    private ReusableBufferedOutputStream j;

    public static final class CacheDataSinkException extends Cache.CacheException {
        public CacheDataSinkException(IOException cause) {
            super(cause);
        }
    }

    public static final class Factory implements DataSink.Factory {
        private Cache a;
        private long b = CacheDataSink.DEFAULT_FRAGMENT_SIZE;
        private int c = CacheDataSink.DEFAULT_BUFFER_SIZE;

        @Override // com.google.android.exoplayer2.upstream.DataSink.Factory
        public DataSink createDataSink() {
            return new CacheDataSink((Cache) Assertions.checkNotNull(this.a), this.b, this.c);
        }

        public Factory setBufferSize(int bufferSize) {
            this.c = bufferSize;
            return this;
        }

        public Factory setCache(Cache cache) {
            this.a = cache;
            return this;
        }

        public Factory setFragmentSize(long fragmentSize) {
            this.b = fragmentSize;
            return this;
        }
    }

    public CacheDataSink(Cache cache, long fragmentSize) {
        this(cache, fragmentSize, DEFAULT_BUFFER_SIZE);
    }

    private void a() throws IOException {
        OutputStream outputStream = this.g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            Util.closeQuietly(this.g);
            this.g = null;
            File file = (File) Util.castNonNull(this.f);
            this.f = null;
            this.a.commitFile(file, this.h);
        } catch (Throwable th) {
            Util.closeQuietly(this.g);
            this.g = null;
            File file2 = (File) Util.castNonNull(this.f);
            this.f = null;
            file2.delete();
            throw th;
        }
    }

    private void b(DataSpec dataSpec) throws IOException {
        long j = dataSpec.length;
        this.f = this.a.startFile((String) Util.castNonNull(dataSpec.key), dataSpec.position + this.i, j != -1 ? Math.min(j - this.i, this.e) : -1L);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f);
        if (this.c > 0) {
            ReusableBufferedOutputStream reusableBufferedOutputStream = this.j;
            if (reusableBufferedOutputStream == null) {
                this.j = new ReusableBufferedOutputStream(fileOutputStream, this.c);
            } else {
                reusableBufferedOutputStream.reset(fileOutputStream);
            }
            this.g = this.j;
        } else {
            this.g = fileOutputStream;
        }
        this.h = 0L;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void close() throws CacheDataSinkException {
        if (this.d == null) {
            return;
        }
        try {
            a();
        } catch (IOException e) {
            throw new CacheDataSinkException(e);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void open(DataSpec dataSpec) throws CacheDataSinkException {
        Assertions.checkNotNull(dataSpec.key);
        if (dataSpec.length == -1 && dataSpec.isFlagSet(2)) {
            this.d = null;
            return;
        }
        this.d = dataSpec;
        this.e = dataSpec.isFlagSet(4) ? this.b : Long.MAX_VALUE;
        this.i = 0L;
        try {
            b(dataSpec);
        } catch (IOException e) {
            throw new CacheDataSinkException(e);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void write(byte[] buffer, int offset, int length) throws CacheDataSinkException {
        DataSpec dataSpec = this.d;
        if (dataSpec == null) {
            return;
        }
        int i = 0;
        while (i < length) {
            try {
                if (this.h == this.e) {
                    a();
                    b(dataSpec);
                }
                int iMin = (int) Math.min(length - i, this.e - this.h);
                ((OutputStream) Util.castNonNull(this.g)).write(buffer, offset + i, iMin);
                i += iMin;
                long j = iMin;
                this.h += j;
                this.i += j;
            } catch (IOException e) {
                throw new CacheDataSinkException(e);
            }
        }
    }

    public CacheDataSink(Cache cache, long fragmentSize, int bufferSize) {
        Assertions.checkState(fragmentSize > 0 || fragmentSize == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (fragmentSize != -1 && fragmentSize < 2097152) {
            Log.w(l, "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.a = (Cache) Assertions.checkNotNull(cache);
        this.b = fragmentSize == -1 ? Long.MAX_VALUE : fragmentSize;
        this.c = bufferSize;
    }
}
