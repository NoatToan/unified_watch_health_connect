package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class ByteArrayDataSource extends BaseDataSource {
    private final byte[] e;

    @Nullable
    private Uri f;
    private int g;
    private int h;
    private boolean i;

    public ByteArrayDataSource(byte[] data) {
        super(false);
        Assertions.checkNotNull(data);
        Assertions.checkArgument(data.length > 0);
        this.e = data;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        if (this.i) {
            this.i = false;
            transferEnded();
        }
        this.f = null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        return this.f;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        this.f = dataSpec.uri;
        transferInitializing(dataSpec);
        long j = dataSpec.position;
        byte[] bArr = this.e;
        if (j > bArr.length) {
            throw new DataSourceException(2008);
        }
        this.g = (int) j;
        int length = bArr.length - ((int) j);
        this.h = length;
        long j2 = dataSpec.length;
        if (j2 != -1) {
            this.h = (int) Math.min(length, j2);
        }
        this.i = true;
        transferStarted(dataSpec);
        long j3 = dataSpec.length;
        return j3 != -1 ? j3 : this.h;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] buffer, int offset, int length) {
        if (length == 0) {
            return 0;
        }
        int i = this.h;
        if (i == 0) {
            return -1;
        }
        int iMin = Math.min(length, i);
        System.arraycopy(this.e, this.g, buffer, offset, iMin);
        this.g += iMin;
        this.h -= iMin;
        bytesTransferred(iMin);
        return iMin;
    }
}
