package com.huawei.health.versionmgr.betaversionmgr;

import android.content.Context;

/* JADX INFO: loaded from: classes32.dex */
public interface BetaVersionMgrApi {
    void checkBetaAppVersion(CheckBetaUpdateCallBack checkBetaUpdateCallBack);

    void showNewBetaVersionDialog(Context context, boolean z);
}
