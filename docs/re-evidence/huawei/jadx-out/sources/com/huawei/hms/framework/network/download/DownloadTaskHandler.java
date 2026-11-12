package com.huawei.hms.framework.network.download;

/* JADX INFO: loaded from: classes33.dex */
public interface DownloadTaskHandler {
    void onCompleted(DownloadTaskBean downloadTaskBean);

    void onException(DownloadTaskBean downloadTaskBean, DownloadException downloadException);

    void onProgress(DownloadTaskBean downloadTaskBean);

    void updateTaskBean(DownloadTaskBean downloadTaskBean);
}
