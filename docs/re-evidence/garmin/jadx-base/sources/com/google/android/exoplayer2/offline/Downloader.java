package com.google.android.exoplayer2.offline;

/* JADX INFO: loaded from: classes13.dex */
public interface Downloader {

    public interface ProgressListener {
        void onProgress(long j8, long j14, float f14);
    }

    void cancel();

    void download(ProgressListener progressListener);

    void remove();
}
