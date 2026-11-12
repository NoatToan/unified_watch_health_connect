package com.google.android.exoplayer2.upstream;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultDataSourceFactory implements DataSource.Factory {
    private final Context a;

    @Nullable
    private final TransferListener b;
    private final DataSource.Factory c;

    public DefaultDataSourceFactory(Context context) {
        this(context, (String) null, (TransferListener) null);
    }

    public DefaultDataSourceFactory(Context context, @Nullable String userAgent) {
        this(context, userAgent, (TransferListener) null);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public DefaultDataSource createDataSource() {
        DefaultDataSource defaultDataSource = new DefaultDataSource(this.a, this.c.createDataSource());
        TransferListener transferListener = this.b;
        if (transferListener != null) {
            defaultDataSource.addTransferListener(transferListener);
        }
        return defaultDataSource;
    }

    public DefaultDataSourceFactory(Context context, @Nullable String userAgent, @Nullable TransferListener listener) {
        this(context, listener, new DefaultHttpDataSource.Factory().setUserAgent(userAgent));
    }

    public DefaultDataSourceFactory(Context context, DataSource.Factory baseDataSourceFactory) {
        this(context, (TransferListener) null, baseDataSourceFactory);
    }

    public DefaultDataSourceFactory(Context context, @Nullable TransferListener listener, DataSource.Factory baseDataSourceFactory) {
        this.a = context.getApplicationContext();
        this.b = listener;
        this.c = baseDataSourceFactory;
    }
}
