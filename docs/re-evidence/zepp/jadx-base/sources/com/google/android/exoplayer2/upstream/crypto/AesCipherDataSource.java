package com.google.android.exoplayer2.upstream.crypto;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AesCipherDataSource implements DataSource {
    private final DataSource a;
    private final byte[] b;

    @Nullable
    private AesFlushingCipher c;

    public AesCipherDataSource(byte[] secretKey, DataSource upstream) {
        this.a = upstream;
        this.b = secretKey;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener transferListener) {
        Assertions.checkNotNull(transferListener);
        this.a.addTransferListener(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        this.c = null;
        this.a.close();
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
        long jA = a.a(dataSpec.key);
        this.c = new AesFlushingCipher(2, this.b, jA, dataSpec.position + dataSpec.uriPositionOffset);
        return jOpen;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] buffer, int offset, int length) throws IOException {
        if (length == 0) {
            return 0;
        }
        int i = this.a.read(buffer, offset, length);
        if (i == -1) {
            return -1;
        }
        ((AesFlushingCipher) Util.castNonNull(this.c)).updateInPlace(buffer, offset, i);
        return i;
    }
}
