package com.xiaomi.hm.health.bt.sdk;

import com.xiaomi.hm.health.bt.sdk.data.DeviceBatteryInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public interface IBatteryChangeCallback extends Serializable {
    public static final long serialVersionUID = 1;

    void onBatteryInfo(DeviceBatteryInfo deviceBatteryInfo);
}
