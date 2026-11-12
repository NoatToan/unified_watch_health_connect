package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSourceUtil;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public abstract class DataChunk extends Chunk {
    private static final int READ_GRANULARITY = 16384;
    private byte[] data;
    private volatile boolean loadCanceled;

    public DataChunk(DataSource dataSource, DataSpec dataSpec, int i14, Format format, int i15, Object obj, byte[] bArr) {
        super(dataSource, dataSpec, i14, format, i15, obj, C.TIME_UNSET, C.TIME_UNSET);
        this.data = bArr == null ? Util.EMPTY_BYTE_ARRAY : bArr;
    }

    private void maybeExpandData(int i14) {
        byte[] bArr = this.data;
        if (bArr.length < i14 + 16384) {
            this.data = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public final void cancelLoad() {
        this.loadCanceled = true;
    }

    public abstract void consume(byte[] bArr, int i14);

    public byte[] getDataHolder() {
        return this.data;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public final void load() {
        try {
            this.dataSource.open(this.dataSpec);
            int i14 = 0;
            int i15 = 0;
            while (i14 != -1 && !this.loadCanceled) {
                maybeExpandData(i15);
                i14 = this.dataSource.read(this.data, i15, 16384);
                if (i14 != -1) {
                    i15 += i14;
                }
            }
            if (!this.loadCanceled) {
                consume(this.data, i15);
            }
        } finally {
            DataSourceUtil.closeQuietly(this.dataSource);
        }
    }
}
