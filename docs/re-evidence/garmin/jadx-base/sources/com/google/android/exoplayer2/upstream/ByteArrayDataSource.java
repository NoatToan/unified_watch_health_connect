package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.util.Assertions;

/* JADX INFO: loaded from: classes14.dex */
public final class ByteArrayDataSource extends BaseDataSource {
    private int bytesRemaining;
    private final byte[] data;
    private boolean opened;
    private int readPosition;
    private Uri uri;

    public ByteArrayDataSource(byte[] bArr) {
        super(false);
        Assertions.checkNotNull(bArr);
        Assertions.checkArgument(bArr.length > 0);
        this.data = bArr;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        if (this.opened) {
            this.opened = false;
            transferEnded();
        }
        this.uri = null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Uri getUri() {
        return this.uri;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws DataSourceException {
        this.uri = dataSpec.uri;
        transferInitializing(dataSpec);
        long j8 = dataSpec.position;
        byte[] bArr = this.data;
        if (j8 > bArr.length) {
            throw new DataSourceException(2008);
        }
        this.readPosition = (int) j8;
        int length = bArr.length - ((int) j8);
        this.bytesRemaining = length;
        long j14 = dataSpec.length;
        if (j14 != -1) {
            this.bytesRemaining = (int) Math.min(length, j14);
        }
        this.opened = true;
        transferStarted(dataSpec);
        long j15 = dataSpec.length;
        return j15 != -1 ? j15 : this.bytesRemaining;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i14, int i15) {
        if (i15 == 0) {
            return 0;
        }
        int i16 = this.bytesRemaining;
        if (i16 == 0) {
            return -1;
        }
        int iMin = Math.min(i15, i16);
        System.arraycopy(this.data, this.readPosition, bArr, i14, iMin);
        this.readPosition += iMin;
        this.bytesRemaining -= iMin;
        bytesTransferred(iMin);
        return iMin;
    }
}
