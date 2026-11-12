package com.huawei.openalliance.ad.download.ag;

import com.huawei.openalliance.ad.download.DownloadTask;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.inter.data.AppInfo;

/* JADX INFO: loaded from: classes12.dex */
public class RemoteAppDownloadTask {
    private boolean autoOpenInLandingPage;
    private String contentId;
    private long downloadedSize;
    private long fileTotalSize;
    private int pauseReason;
    private int progress;
    private String sha256;
    private String slotId;
    private int status;
    private String url;

    public AppDownloadTask a(AppInfo appInfo) {
        AppDownloadTask appDownloadTaskA = new AppDownloadTask.a().a(appInfo).a();
        if (appDownloadTaskA == null) {
            appDownloadTaskA = new AppDownloadTask();
            appDownloadTaskA.a(appInfo);
        }
        appDownloadTaskA.m(this.contentId);
        appDownloadTaskA.b(this.progress);
        appDownloadTaskA.a(com.huawei.openalliance.ad.download.e.a(this.status));
        appDownloadTaskA.b(this.downloadedSize);
        appDownloadTaskA.a(this.fileTotalSize);
        appDownloadTaskA.a(this.url);
        appDownloadTaskA.c(this.sha256);
        appDownloadTaskA.k(this.slotId);
        appDownloadTaskA.a(DownloadTask.c.a(this.pauseReason));
        appDownloadTaskA.f(this.autoOpenInLandingPage);
        return appDownloadTaskA;
    }
}
