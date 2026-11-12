package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes14.dex */
public interface TransferListener {
    void onBytesTransferred(DataSource dataSource, DataSpec dataSpec, boolean z14, int i14);

    void onTransferEnd(DataSource dataSource, DataSpec dataSpec, boolean z14);

    void onTransferInitializing(DataSource dataSource, DataSpec dataSpec, boolean z14);

    void onTransferStart(DataSource dataSource, DataSpec dataSpec, boolean z14);
}
