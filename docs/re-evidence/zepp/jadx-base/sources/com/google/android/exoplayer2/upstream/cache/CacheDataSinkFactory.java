package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.DataSink;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class CacheDataSinkFactory implements DataSink.Factory {
    private final Cache a;
    private final long b;
    private final int c;

    public CacheDataSinkFactory(Cache cache, long fragmentSize) {
        this(cache, fragmentSize, CacheDataSink.DEFAULT_BUFFER_SIZE);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink.Factory
    public DataSink createDataSink() {
        return new CacheDataSink(this.a, this.b, this.c);
    }

    public CacheDataSinkFactory(Cache cache, long fragmentSize, int bufferSize) {
        this.a = cache;
        this.b = fragmentSize;
        this.c = bufferSize;
    }
}
