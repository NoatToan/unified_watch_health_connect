package com.liulishuo.filedownloader;

import com.liulishuo.filedownloader.model.FileDownloadModel;

/* JADX INFO: loaded from: classes18.dex */
public interface IThreadPoolMonitor {
    int findRunningTaskIdBySameTempPath(String str, int i);

    boolean isDownloading(FileDownloadModel fileDownloadModel);
}
