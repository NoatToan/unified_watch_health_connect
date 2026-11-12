package com.google.android.exoplayer2.source.chunk;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DataChunk extends Chunk {
    private static final int c = 16384;
    private byte[] a;
    private volatile boolean b;

    public DataChunk(DataSource dataSource, DataSpec dataSpec, int type, Format trackFormat, int trackSelectionReason, @Nullable Object trackSelectionData, @Nullable byte[] data) {
        super(dataSource, dataSpec, type, trackFormat, trackSelectionReason, trackSelectionData, C.TIME_UNSET, C.TIME_UNSET);
        this.a = data == null ? Util.EMPTY_BYTE_ARRAY : data;
    }

    private void a(int limit) {
        byte[] bArr = this.a;
        if (bArr.length < limit + 16384) {
            this.a = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public final void cancelLoad() {
        this.b = true;
    }

    public abstract void consume(byte[] data, int limit) throws IOException;

    public byte[] getDataHolder() {
        return this.a;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public final void load() throws IOException {
        try {
            this.dataSource.open(this.dataSpec);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.b) {
                a(i2);
                i = this.dataSource.read(this.a, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.b) {
                consume(this.a, i2);
            }
        } finally {
            Util.closeQuietly(this.dataSource);
        }
    }
}
