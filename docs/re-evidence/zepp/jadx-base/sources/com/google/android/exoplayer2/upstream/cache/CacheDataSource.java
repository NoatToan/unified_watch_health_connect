package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.DummyDataSource;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.PriorityDataSource;
import com.google.android.exoplayer2.upstream.TeeDataSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.Util;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class CacheDataSource implements DataSource {
    public static final int CACHE_IGNORED_REASON_ERROR = 0;
    public static final int CACHE_IGNORED_REASON_UNSET_LENGTH = 1;
    public static final int FLAG_BLOCK_ON_CACHE = 1;
    public static final int FLAG_IGNORE_CACHE_FOR_UNSET_LENGTH_REQUESTS = 4;
    public static final int FLAG_IGNORE_CACHE_ON_ERROR = 2;
    private static final int v = -1;
    private static final long w = 102400;
    private final Cache a;
    private final DataSource b;

    @Nullable
    private final DataSource c;
    private final DataSource d;
    private final CacheKeyFactory e;

    @Nullable
    private final EventListener f;
    private final boolean g;
    private final boolean h;
    private final boolean i;

    @Nullable
    private Uri j;

    @Nullable
    private DataSpec k;

    @Nullable
    private DataSpec l;

    @Nullable
    private DataSource m;
    private long n;
    private long o;
    private long p;

    @Nullable
    private CacheSpan q;
    private boolean r;
    private boolean s;
    private long t;
    private long u;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface CacheIgnoredReason {
    }

    public interface EventListener {
        void onCacheIgnored(int reason);

        void onCachedBytesRead(long cacheSizeBytes, long cachedBytesRead);
    }

    public static final class Factory implements DataSource.Factory {
        private Cache a;

        @Nullable
        private DataSink.Factory c;
        private boolean e;

        @Nullable
        private DataSource.Factory f;

        @Nullable
        private PriorityTaskManager g;
        private int h;
        private int i;

        @Nullable
        private EventListener j;
        private DataSource.Factory b = new FileDataSource.Factory();
        private CacheKeyFactory d = CacheKeyFactory.DEFAULT;

        private CacheDataSource a(@Nullable DataSource upstreamDataSource, int flags, int upstreamPriority) {
            DataSink dataSinkCreateDataSink;
            Cache cache = (Cache) Assertions.checkNotNull(this.a);
            if (this.e || upstreamDataSource == null) {
                dataSinkCreateDataSink = null;
            } else {
                DataSink.Factory factory = this.c;
                dataSinkCreateDataSink = factory != null ? factory.createDataSink() : new CacheDataSink.Factory().setCache(cache).createDataSink();
            }
            return new CacheDataSource(cache, upstreamDataSource, this.b.createDataSource(), dataSinkCreateDataSink, this.d, flags, this.g, upstreamPriority, this.j);
        }

        public CacheDataSource createDataSourceForDownloading() {
            DataSource.Factory factory = this.f;
            return a(factory != null ? factory.createDataSource() : null, this.i | 1, -1000);
        }

        public CacheDataSource createDataSourceForRemovingDownload() {
            return a(null, this.i | 1, -1000);
        }

        @Nullable
        public Cache getCache() {
            return this.a;
        }

        public CacheKeyFactory getCacheKeyFactory() {
            return this.d;
        }

        @Nullable
        public PriorityTaskManager getUpstreamPriorityTaskManager() {
            return this.g;
        }

        public Factory setCache(Cache cache) {
            this.a = cache;
            return this;
        }

        public Factory setCacheKeyFactory(CacheKeyFactory cacheKeyFactory) {
            this.d = cacheKeyFactory;
            return this;
        }

        public Factory setCacheReadDataSourceFactory(DataSource.Factory cacheReadDataSourceFactory) {
            this.b = cacheReadDataSourceFactory;
            return this;
        }

        public Factory setCacheWriteDataSinkFactory(@Nullable DataSink.Factory cacheWriteDataSinkFactory) {
            this.c = cacheWriteDataSinkFactory;
            this.e = cacheWriteDataSinkFactory == null;
            return this;
        }

        public Factory setEventListener(@Nullable EventListener eventListener) {
            this.j = eventListener;
            return this;
        }

        public Factory setFlags(int flags) {
            this.i = flags;
            return this;
        }

        public Factory setUpstreamDataSourceFactory(@Nullable DataSource.Factory upstreamDataSourceFactory) {
            this.f = upstreamDataSourceFactory;
            return this;
        }

        public Factory setUpstreamPriority(int upstreamPriority) {
            this.h = upstreamPriority;
            return this;
        }

        public Factory setUpstreamPriorityTaskManager(@Nullable PriorityTaskManager upstreamPriorityTaskManager) {
            this.g = upstreamPriorityTaskManager;
            return this;
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public CacheDataSource createDataSource() {
            DataSource.Factory factory = this.f;
            return a(factory != null ? factory.createDataSource() : null, this.i, this.h);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c() throws IOException {
        DataSource dataSource = this.m;
        if (dataSource == null) {
            return;
        }
        try {
            dataSource.close();
        } finally {
            this.l = null;
            this.m = null;
            CacheSpan cacheSpan = this.q;
            if (cacheSpan != null) {
                this.a.releaseHoleSpan(cacheSpan);
                this.q = null;
            }
        }
    }

    private static Uri d(Cache cache, String key, Uri defaultUri) {
        Uri uriB = e.b(cache.getContentMetadata(key));
        return uriB != null ? uriB : defaultUri;
    }

    private void e(Throwable exception) {
        if (g() || (exception instanceof Cache.CacheException)) {
            this.r = true;
        }
    }

    private boolean f() {
        return this.m == this.d;
    }

    private boolean g() {
        return this.m == this.b;
    }

    private boolean h() {
        return !g();
    }

    private boolean i() {
        return this.m == this.c;
    }

    private void j() {
        EventListener eventListener = this.f;
        if (eventListener == null || this.t <= 0) {
            return;
        }
        eventListener.onCachedBytesRead(this.a.getCacheSpace(), this.t);
        this.t = 0L;
    }

    private void k(int reason) {
        EventListener eventListener = this.f;
        if (eventListener != null) {
            eventListener.onCacheIgnored(reason);
        }
    }

    private void l(DataSpec requestDataSpec, boolean checkCache) throws IOException {
        CacheSpan cacheSpanStartReadWrite;
        long jMin;
        DataSpec dataSpecBuild;
        DataSource dataSource;
        String str = (String) Util.castNonNull(requestDataSpec.key);
        if (this.s) {
            cacheSpanStartReadWrite = null;
        } else if (this.g) {
            try {
                cacheSpanStartReadWrite = this.a.startReadWrite(str, this.o, this.p);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            cacheSpanStartReadWrite = this.a.startReadWriteNonBlocking(str, this.o, this.p);
        }
        if (cacheSpanStartReadWrite == null) {
            dataSource = this.d;
            dataSpecBuild = requestDataSpec.buildUpon().setPosition(this.o).setLength(this.p).build();
        } else if (cacheSpanStartReadWrite.isCached) {
            Uri uriFromFile = Uri.fromFile((File) Util.castNonNull(cacheSpanStartReadWrite.file));
            long j = cacheSpanStartReadWrite.position;
            long j2 = this.o - j;
            long jMin2 = cacheSpanStartReadWrite.length - j2;
            long j3 = this.p;
            if (j3 != -1) {
                jMin2 = Math.min(jMin2, j3);
            }
            dataSpecBuild = requestDataSpec.buildUpon().setUri(uriFromFile).setUriPositionOffset(j).setPosition(j2).setLength(jMin2).build();
            dataSource = this.b;
        } else {
            if (cacheSpanStartReadWrite.isOpenEnded()) {
                jMin = this.p;
            } else {
                jMin = cacheSpanStartReadWrite.length;
                long j4 = this.p;
                if (j4 != -1) {
                    jMin = Math.min(jMin, j4);
                }
            }
            dataSpecBuild = requestDataSpec.buildUpon().setPosition(this.o).setLength(jMin).build();
            dataSource = this.c;
            if (dataSource == null) {
                dataSource = this.d;
                this.a.releaseHoleSpan(cacheSpanStartReadWrite);
                cacheSpanStartReadWrite = null;
            }
        }
        this.u = (this.s || dataSource != this.d) ? Long.MAX_VALUE : this.o + w;
        if (checkCache) {
            Assertions.checkState(f());
            if (dataSource == this.d) {
                return;
            }
            try {
                c();
            } catch (Throwable th) {
                if (!((CacheSpan) Util.castNonNull(cacheSpanStartReadWrite)).isHoleSpan()) {
                    throw th;
                }
                this.a.releaseHoleSpan(cacheSpanStartReadWrite);
                throw th;
            }
        }
        if (cacheSpanStartReadWrite != null && cacheSpanStartReadWrite.isHoleSpan()) {
            this.q = cacheSpanStartReadWrite;
        }
        this.m = dataSource;
        this.l = dataSpecBuild;
        this.n = 0L;
        long jOpen = dataSource.open(dataSpecBuild);
        ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
        if (dataSpecBuild.length == -1 && jOpen != -1) {
            this.p = jOpen;
            ContentMetadataMutations.setContentLength(contentMetadataMutations, this.o + jOpen);
        }
        if (h()) {
            Uri uri = dataSource.getUri();
            this.j = uri;
            ContentMetadataMutations.setRedirectedUri(contentMetadataMutations, requestDataSpec.uri.equals(uri) ^ true ? this.j : null);
        }
        if (i()) {
            this.a.applyContentMetadataMutations(str, contentMetadataMutations);
        }
    }

    private void m(String key) throws IOException {
        this.p = 0L;
        if (i()) {
            ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
            ContentMetadataMutations.setContentLength(contentMetadataMutations, this.o);
            this.a.applyContentMetadataMutations(key, contentMetadataMutations);
        }
    }

    private int n(DataSpec dataSpec) {
        if (this.h && this.r) {
            return 0;
        }
        return (this.i && dataSpec.length == -1) ? 1 : -1;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener transferListener) {
        Assertions.checkNotNull(transferListener);
        this.b.addTransferListener(transferListener);
        this.d.addTransferListener(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        this.k = null;
        this.j = null;
        this.o = 0L;
        j();
        try {
            c();
        } catch (Throwable th) {
            e(th);
            throw th;
        }
    }

    public Cache getCache() {
        return this.a;
    }

    public CacheKeyFactory getCacheKeyFactory() {
        return this.e;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        return h() ? this.d.getResponseHeaders() : Collections.emptyMap();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        return this.j;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        try {
            String strBuildCacheKey = this.e.buildCacheKey(dataSpec);
            DataSpec dataSpecBuild = dataSpec.buildUpon().setKey(strBuildCacheKey).build();
            this.k = dataSpecBuild;
            this.j = d(this.a, strBuildCacheKey, dataSpecBuild.uri);
            this.o = dataSpec.position;
            int iN = n(dataSpec);
            boolean z = iN != -1;
            this.s = z;
            if (z) {
                k(iN);
            }
            if (this.s) {
                this.p = -1L;
            } else {
                long jA = e.a(this.a.getContentMetadata(strBuildCacheKey));
                this.p = jA;
                if (jA != -1) {
                    long j = jA - dataSpec.position;
                    this.p = j;
                    if (j < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            }
            long jMin = dataSpec.length;
            if (jMin != -1) {
                long j2 = this.p;
                if (j2 != -1) {
                    jMin = Math.min(j2, jMin);
                }
                this.p = jMin;
            }
            long j3 = this.p;
            if (j3 > 0 || j3 == -1) {
                l(dataSpecBuild, false);
            }
            long j4 = dataSpec.length;
            return j4 != -1 ? j4 : this.p;
        } catch (Throwable th) {
            e(th);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0079 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:8:0x001e, B:10:0x0026, B:11:0x002a, B:13:0x003a, B:15:0x0040, B:16:0x0046, B:18:0x0057, B:19:0x005b, B:21:0x0061, B:23:0x0067, B:25:0x006d, B:26:0x0079, B:32:0x0085), top: B:37:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0083  */
    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] buffer, int offset, int length) throws IOException {
        long j;
        DataSpec dataSpec = (DataSpec) Assertions.checkNotNull(this.k);
        DataSpec dataSpec2 = (DataSpec) Assertions.checkNotNull(this.l);
        if (length == 0) {
            return 0;
        }
        if (this.p == 0) {
            return -1;
        }
        try {
            if (this.o >= this.u) {
                l(dataSpec, true);
            }
            int i = ((DataSource) Assertions.checkNotNull(this.m)).read(buffer, offset, length);
            if (i != -1) {
                if (g()) {
                    this.t += (long) i;
                }
                long j2 = i;
                this.o += j2;
                this.n += j2;
                long j3 = this.p;
                if (j3 != -1) {
                    this.p = j3 - j2;
                }
            } else {
                if (!h()) {
                    j = this.p;
                    if (j <= 0) {
                        if (j == -1) {
                        }
                    }
                    c();
                    l(dataSpec, false);
                    return read(buffer, offset, length);
                }
                long j4 = dataSpec2.length;
                if (j4 != -1 && this.n >= j4) {
                    j = this.p;
                    if (j <= 0) {
                        if (j == -1) {
                        }
                    }
                    c();
                    l(dataSpec, false);
                    return read(buffer, offset, length);
                }
                m((String) Util.castNonNull(dataSpec.key));
            }
            return i;
        } catch (Throwable th) {
            e(th);
            throw th;
        }
    }

    public CacheDataSource(Cache cache, @Nullable DataSource upstreamDataSource) {
        this(cache, upstreamDataSource, 0);
    }

    public CacheDataSource(Cache cache, @Nullable DataSource upstreamDataSource, int flags) {
        this(cache, upstreamDataSource, new FileDataSource(), new CacheDataSink(cache, CacheDataSink.DEFAULT_FRAGMENT_SIZE), flags, null);
    }

    public CacheDataSource(Cache cache, @Nullable DataSource upstreamDataSource, DataSource cacheReadDataSource, @Nullable DataSink cacheWriteDataSink, int flags, @Nullable EventListener eventListener) {
        this(cache, upstreamDataSource, cacheReadDataSource, cacheWriteDataSink, flags, eventListener, null);
    }

    public CacheDataSource(Cache cache, @Nullable DataSource upstreamDataSource, DataSource cacheReadDataSource, @Nullable DataSink cacheWriteDataSink, int flags, @Nullable EventListener eventListener, @Nullable CacheKeyFactory cacheKeyFactory) {
        this(cache, upstreamDataSource, cacheReadDataSource, cacheWriteDataSink, cacheKeyFactory, flags, null, 0, eventListener);
    }

    private CacheDataSource(Cache cache, @Nullable DataSource upstreamDataSource, DataSource cacheReadDataSource, @Nullable DataSink cacheWriteDataSink, @Nullable CacheKeyFactory cacheKeyFactory, int flags, @Nullable PriorityTaskManager upstreamPriorityTaskManager, int upstreamPriority, @Nullable EventListener eventListener) {
        this.a = cache;
        this.b = cacheReadDataSource;
        this.e = cacheKeyFactory == null ? CacheKeyFactory.DEFAULT : cacheKeyFactory;
        this.g = (flags & 1) != 0;
        this.h = (flags & 2) != 0;
        this.i = (flags & 4) != 0;
        if (upstreamDataSource != null) {
            upstreamDataSource = upstreamPriorityTaskManager != null ? new PriorityDataSource(upstreamDataSource, upstreamPriorityTaskManager, upstreamPriority) : upstreamDataSource;
            this.d = upstreamDataSource;
            this.c = cacheWriteDataSink != null ? new TeeDataSource(upstreamDataSource, cacheWriteDataSink) : null;
        } else {
            this.d = DummyDataSource.INSTANCE;
            this.c = null;
        }
        this.f = eventListener;
    }
}
