package com.google.android.exoplayer2.upstream.crypto;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class AesCipherDataSink implements DataSink {
    private final DataSink a;
    private final byte[] b;

    @Nullable
    private final byte[] c;

    @Nullable
    private AesFlushingCipher d;

    public AesCipherDataSink(byte[] secretKey, DataSink wrappedDataSink) {
        this(secretKey, wrappedDataSink, null);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void close() throws IOException {
        this.d = null;
        this.a.close();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void open(DataSpec dataSpec) throws IOException {
        this.a.open(dataSpec);
        long jA = a.a(dataSpec.key);
        this.d = new AesFlushingCipher(1, this.b, jA, dataSpec.position + dataSpec.uriPositionOffset);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void write(byte[] buffer, int offset, int length) throws IOException {
        if (this.c == null) {
            ((AesFlushingCipher) Util.castNonNull(this.d)).updateInPlace(buffer, offset, length);
            this.a.write(buffer, offset, length);
            return;
        }
        int i = 0;
        while (i < length) {
            int iMin = Math.min(length - i, this.c.length);
            ((AesFlushingCipher) Util.castNonNull(this.d)).update(buffer, offset + i, iMin, this.c, 0);
            this.a.write(this.c, 0, iMin);
            i += iMin;
        }
    }

    public AesCipherDataSink(byte[] secretKey, DataSink wrappedDataSink, @Nullable byte[] scratch) {
        this.a = wrappedDataSink;
        this.b = secretKey;
        this.c = scratch;
    }
}
