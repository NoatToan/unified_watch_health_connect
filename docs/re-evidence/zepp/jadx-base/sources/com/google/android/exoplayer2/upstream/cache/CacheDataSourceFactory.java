package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.FileDataSource;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class CacheDataSourceFactory implements DataSource.Factory {
    private final Cache a;
    private final DataSource.Factory b;
    private final DataSource.Factory c;
    private final int d;

    @Nullable
    private final DataSink.Factory e;

    @Nullable
    private final CacheDataSource.EventListener f;

    @Nullable
    private final CacheKeyFactory g;

    public CacheDataSourceFactory(Cache cache, DataSource.Factory upstreamFactory) {
        this(cache, upstreamFactory, 0);
    }

    public CacheDataSourceFactory(Cache cache, DataSource.Factory upstreamFactory, int flags) {
        this(cache, upstreamFactory, new FileDataSource.Factory(), new CacheDataSink.Factory().setCache(cache), flags, null);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public CacheDataSource createDataSource() {
        Cache cache = this.a;
        DataSource dataSourceCreateDataSource = this.b.createDataSource();
        DataSource dataSourceCreateDataSource2 = this.c.createDataSource();
        DataSink.Factory factory = this.e;
        return new CacheDataSource(cache, dataSourceCreateDataSource, dataSourceCreateDataSource2, factory == null ? null : factory.createDataSink(), this.d, this.f, this.g);
    }

    public CacheDataSourceFactory(Cache cache, DataSource.Factory upstreamFactory, DataSource.Factory cacheReadDataSourceFactory, @Nullable DataSink.Factory cacheWriteDataSinkFactory, int flags, @Nullable CacheDataSource.EventListener eventListener) {
        this(cache, upstreamFactory, cacheReadDataSourceFactory, cacheWriteDataSinkFactory, flags, eventListener, null);
    }

    public CacheDataSourceFactory(Cache cache, DataSource.Factory upstreamFactory, DataSource.Factory cacheReadDataSourceFactory, @Nullable DataSink.Factory cacheWriteDataSinkFactory, int flags, @Nullable CacheDataSource.EventListener eventListener, @Nullable CacheKeyFactory cacheKeyFactory) {
        this.a = cache;
        this.b = upstreamFactory;
        this.c = cacheReadDataSourceFactory;
        this.e = cacheWriteDataSinkFactory;
        this.d = flags;
        this.f = eventListener;
        this.g = cacheKeyFactory;
    }
}
