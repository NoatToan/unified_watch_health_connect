package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class DefaultHttpDataSourceFactory extends HttpDataSource.BaseFactory {

    @Nullable
    private final String b;

    @Nullable
    private final TransferListener c;
    private final int d;
    private final int e;
    private final boolean f;

    public DefaultHttpDataSourceFactory() {
        this(null);
    }

    public DefaultHttpDataSourceFactory(@Nullable String userAgent) {
        this(userAgent, null);
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource.BaseFactory
    public DefaultHttpDataSource createDataSourceInternal(HttpDataSource.RequestProperties defaultRequestProperties) {
        DefaultHttpDataSource defaultHttpDataSource = new DefaultHttpDataSource(this.b, this.d, this.e, this.f, defaultRequestProperties);
        TransferListener transferListener = this.c;
        if (transferListener != null) {
            defaultHttpDataSource.addTransferListener(transferListener);
        }
        return defaultHttpDataSource;
    }

    public DefaultHttpDataSourceFactory(@Nullable String userAgent, @Nullable TransferListener listener) {
        this(userAgent, listener, 8000, 8000, false);
    }

    public DefaultHttpDataSourceFactory(@Nullable String userAgent, int connectTimeoutMillis, int readTimeoutMillis, boolean allowCrossProtocolRedirects) {
        this(userAgent, null, connectTimeoutMillis, readTimeoutMillis, allowCrossProtocolRedirects);
    }

    public DefaultHttpDataSourceFactory(@Nullable String userAgent, @Nullable TransferListener listener, int connectTimeoutMillis, int readTimeoutMillis, boolean allowCrossProtocolRedirects) {
        this.b = userAgent;
        this.c = listener;
        this.d = connectTimeoutMillis;
        this.e = readTimeoutMillis;
        this.f = allowCrossProtocolRedirects;
    }
}
