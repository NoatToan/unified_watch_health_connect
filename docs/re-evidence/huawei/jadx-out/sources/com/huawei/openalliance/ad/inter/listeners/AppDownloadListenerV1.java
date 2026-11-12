package com.huawei.openalliance.ad.inter.listeners;

import com.huawei.openalliance.ad.download.app.AppStatusV1;
import com.huawei.openalliance.ad.inter.data.AppInfo;

/* JADX INFO: loaded from: classes12.dex */
public interface AppDownloadListenerV1 {
    void onNewAppOpen(AppInfo appInfo);

    void onNewAppOpen(String str);

    void onNewDownloadProgress(AppInfo appInfo, int i);

    void onNewStatusChanged(AppStatusV1 appStatusV1, int i, AppInfo appInfo);
}
