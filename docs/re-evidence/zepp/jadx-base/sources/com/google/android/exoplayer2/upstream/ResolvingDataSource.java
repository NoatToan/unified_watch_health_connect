package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ResolvingDataSource implements DataSource {
    private final DataSource a;
    private final Resolver b;
    private boolean c;

    public static final class Factory implements DataSource.Factory {
        private final DataSource.Factory a;
        private final Resolver b;

        public Factory(DataSource.Factory upstreamFactory, Resolver resolver) {
            this.a = upstreamFactory;
            this.b = resolver;
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public ResolvingDataSource createDataSource() {
            return new ResolvingDataSource(this.a.createDataSource(), this.b);
        }
    }

    public interface Resolver {
        DataSpec resolveDataSpec(DataSpec dataSpec) throws IOException;

        Uri resolveReportedUri(Uri uri);
    }

    public ResolvingDataSource(DataSource upstreamDataSource, Resolver resolver) {
        this.a = upstreamDataSource;
        this.b = resolver;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener transferListener) {
        Assertions.checkNotNull(transferListener);
        this.a.addTransferListener(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        if (this.c) {
            this.c = false;
            this.a.close();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        Uri uri = this.a.getUri();
        if (uri == null) {
            return null;
        }
        return this.b.resolveReportedUri(uri);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        DataSpec dataSpecResolveDataSpec = this.b.resolveDataSpec(dataSpec);
        this.c = true;
        return this.a.open(dataSpecResolveDataSpec);
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] buffer, int offset, int length) throws IOException {
        return this.a.read(buffer, offset, length);
    }
}
