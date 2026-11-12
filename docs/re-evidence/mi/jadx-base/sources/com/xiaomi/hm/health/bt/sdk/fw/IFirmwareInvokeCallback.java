package com.xiaomi.hm.health.bt.sdk.fw;

import com.xiaomi.hm.health.bt.profile.mili.model.Progress;

/* JADX INFO: loaded from: classes11.dex */
public interface IFirmwareInvokeCallback {
    void onError(int i);

    void onFwProgress(Progress progress);

    void onFwStart();

    void onFwStop(boolean z);

    void upgradingProgress(FwType fwType, Progress progress);
}
