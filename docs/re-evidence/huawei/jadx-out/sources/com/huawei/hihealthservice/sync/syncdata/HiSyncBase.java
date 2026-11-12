package com.huawei.hihealthservice.sync.syncdata;

import defpackage.lif;

/* JADX INFO: loaded from: classes10.dex */
public interface HiSyncBase {
    void pullDataByTime(long j, long j2) throws lif;

    void pullDataByVersion() throws lif;

    void pushData() throws lif;
}
