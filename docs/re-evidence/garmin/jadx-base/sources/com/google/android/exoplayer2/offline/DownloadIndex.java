package com.google.android.exoplayer2.offline;

/* JADX INFO: loaded from: classes13.dex */
public interface DownloadIndex {
    Download getDownload(String str);

    DownloadCursor getDownloads(int... iArr);
}
