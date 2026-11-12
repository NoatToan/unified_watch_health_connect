package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class StatsDataSource implements DataSource {
    private final DataSource a;
    private long b;
    private Uri c = Uri.EMPTY;
    private Map<String, List<String>> d = Collections.emptyMap();

    public StatsDataSource(DataSource dataSource) {
        this.a = (DataSource) Assertions.checkNotNull(dataSource);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener transferListener) {
        Assertions.checkNotNull(transferListener);
        this.a.addTransferListener(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        this.a.close();
    }

    public long getBytesRead() {
        return this.b;
    }

    public Uri getLastOpenedUri() {
        return this.c;
    }

    public Map<String, List<String>> getLastResponseHeaders() {
        return this.d;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        return this.a.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        this.c = dataSpec.uri;
        this.d = Collections.emptyMap();
        long jOpen = this.a.open(dataSpec);
        this.c = (Uri) Assertions.checkNotNull(getUri());
        this.d = getResponseHeaders();
        return jOpen;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] buffer, int offset, int length) throws IOException {
        int i = this.a.read(buffer, offset, length);
        if (i != -1) {
            this.b += (long) i;
        }
        return i;
    }

    public void resetBytesRead() {
        this.b = 0L;
    }
}
