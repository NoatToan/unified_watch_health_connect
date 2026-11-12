package com.xiaomi.hm.health.bt.profile.dfu;

import com.xiaomi.hm.health.bt.profile.mili.model.Progress;

/* JADX INFO: loaded from: classes12.dex */
public interface IHMFirmwareUpgradeCallback {
    void onFwProgress(Progress progress);

    void onFwStart(int none);

    void onFwStop(boolean result);
}
