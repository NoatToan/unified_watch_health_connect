package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes14.dex */
public interface DataSink {

    public interface Factory {
        DataSink createDataSink();
    }

    void close();

    void open(DataSpec dataSpec);

    void write(byte[] bArr, int i14, int i15);
}
