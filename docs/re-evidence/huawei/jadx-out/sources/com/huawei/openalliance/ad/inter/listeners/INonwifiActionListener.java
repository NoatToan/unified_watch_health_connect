package com.huawei.openalliance.ad.inter.listeners;

import com.huawei.openalliance.ad.inter.data.AppInfo;

/* JADX INFO: loaded from: classes12.dex */
public interface INonwifiActionListener {
    boolean onAppDownload(AppInfo appInfo, long j);

    boolean onVideoPlay(long j);
}
