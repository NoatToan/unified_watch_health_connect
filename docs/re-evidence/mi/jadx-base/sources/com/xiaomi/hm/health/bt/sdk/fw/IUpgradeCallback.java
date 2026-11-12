package com.xiaomi.hm.health.bt.sdk.fw;

import com.xiaomi.hm.health.bt.profile.mili.model.Progress;

/* JADX INFO: loaded from: classes11.dex */
public interface IUpgradeCallback {
    void onFinish(boolean z);

    void onProgress(Progress progress);
}
