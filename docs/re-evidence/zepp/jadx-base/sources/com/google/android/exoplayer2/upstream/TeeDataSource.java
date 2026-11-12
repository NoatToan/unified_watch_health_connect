package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class TeeDataSource implements DataSource {
    private final DataSource a;
    private final DataSink b;
    private boolean c;
    private long d;

    public TeeDataSource(DataSource upstream, DataSink dataSink) {
        this.a = (DataSource) Assertions.checkNotNull(upstream);
        this.b = (DataSink) Assertions.checkNotNull(dataSink);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener transferListener) {
        Assertions.checkNotNull(transferListener);
        this.a.addTransferListener(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        try {
            this.a.close();
        } finally {
            if (this.c) {
                this.c = false;
                this.b.close();
            }
        }
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
        long jOpen = this.a.open(dataSpec);
        this.d = jOpen;
        if (jOpen == 0) {
            return 0L;
        }
        if (dataSpec.length == -1 && jOpen != -1) {
            dataSpec = dataSpec.subrange(0L, jOpen);
        }
        this.c = true;
        this.b.open(dataSpec);
        return this.d;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] buffer, int offset, int length) throws IOException {
        if (this.d == 0) {
            return -1;
        }
        int i = this.a.read(buffer, offset, length);
        if (i > 0) {
            this.b.write(buffer, offset, i);
            long j = this.d;
            if (j != -1) {
                this.d = j - ((long) i);
            }
        }
        return i;
    }
}
