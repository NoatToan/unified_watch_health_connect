package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class FileDataSourceFactory implements DataSource.Factory {
    private final FileDataSource.Factory a;

    public FileDataSourceFactory() {
        this(null);
    }

    public FileDataSourceFactory(@Nullable TransferListener listener) {
        this.a = new FileDataSource.Factory().setListener(listener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public FileDataSource createDataSource() {
        return this.a.createDataSource();
    }
}
