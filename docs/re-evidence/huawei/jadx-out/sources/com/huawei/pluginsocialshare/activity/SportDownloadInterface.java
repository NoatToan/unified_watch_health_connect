package com.huawei.pluginsocialshare.activity;

import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import defpackage.gyf;

/* JADX INFO: loaded from: classes42.dex */
public interface SportDownloadInterface {
    void downloadedAllShareDataCallback(gyf gyfVar);

    void downloadedSingleCallback(ShareDataInfo shareDataInfo);
}
