package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
final class IcyDataSource implements DataSource {
    private int bytesUntilMetadata;
    private final Listener listener;
    private final int metadataIntervalBytes;
    private final byte[] metadataLengthByteHolder;
    private final DataSource upstream;

    public interface Listener {
        void onIcyMetadata(ParsableByteArray parsableByteArray);
    }

    public IcyDataSource(DataSource dataSource, int i14, Listener listener) {
        Assertions.checkArgument(i14 > 0);
        this.upstream = dataSource;
        this.metadataIntervalBytes = i14;
        this.listener = listener;
        this.metadataLengthByteHolder = new byte[1];
        this.bytesUntilMetadata = i14;
    }

    private boolean readMetadata() {
        if (this.upstream.read(this.metadataLengthByteHolder, 0, 1) == -1) {
            return false;
        }
        int i14 = (this.metadataLengthByteHolder[0] & 255) << 4;
        if (i14 == 0) {
            return true;
        }
        byte[] bArr = new byte[i14];
        int i15 = i14;
        int i16 = 0;
        while (i15 > 0) {
            int i17 = this.upstream.read(bArr, i16, i15);
            if (i17 == -1) {
                return false;
            }
            i16 += i17;
            i15 -= i17;
        }
        while (i14 > 0 && bArr[i14 - 1] == 0) {
            i14--;
        }
        if (i14 > 0) {
            this.listener.onIcyMetadata(new ParsableByteArray(bArr, i14));
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener transferListener) {
        Assertions.checkNotNull(transferListener);
        this.upstream.addTransferListener(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        return this.upstream.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Uri getUri() {
        return this.upstream.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i14, int i15) {
        if (this.bytesUntilMetadata == 0) {
            if (!readMetadata()) {
                return -1;
            }
            this.bytesUntilMetadata = this.metadataIntervalBytes;
        }
        int i16 = this.upstream.read(bArr, i14, Math.min(this.bytesUntilMetadata, i15));
        if (i16 != -1) {
            this.bytesUntilMetadata -= i16;
        }
        return i16;
    }
}
