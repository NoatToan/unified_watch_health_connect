package com.google.android.exoplayer2.offline;

/* JADX INFO: loaded from: classes13.dex */
public interface WritableDownloadIndex extends DownloadIndex {
    void putDownload(Download download);

    void removeDownload(String str);

    void setDownloadingStatesToQueued();

    void setStatesToRemoving();

    void setStopReason(int i14);

    void setStopReason(String str, int i14);
}
