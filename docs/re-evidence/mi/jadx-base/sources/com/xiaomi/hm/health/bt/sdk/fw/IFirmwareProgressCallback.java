package com.xiaomi.hm.health.bt.sdk.fw;

import com.xiaomi.hm.health.bt.profile.mili.model.Progress;

/* JADX INFO: loaded from: classes11.dex */
public interface IFirmwareProgressCallback {
    void onCancel();

    void onError(int i);

    void onFwFinish();

    void onFwProgress(Progress progress, FwType fwType);

    void onFwStart(FwType fwType);

    void onFwStop(boolean z, FwType fwType);

    void onTransmissionFinish();
}
