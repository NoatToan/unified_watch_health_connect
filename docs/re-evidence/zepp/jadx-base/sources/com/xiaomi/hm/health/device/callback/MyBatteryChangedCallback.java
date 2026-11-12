package com.xiaomi.hm.health.device.callback;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.device.event.HMDeviceBatteryEvent;
import de.greenrobot.event.EventBus;

/* JADX INFO: loaded from: classes20.dex */
public class MyBatteryChangedCallback extends HMCallback<BatteryInfo> {
    private static final String b = "MyBatteryChangedCallback";
    private HMDeviceType a;

    public MyBatteryChangedCallback(HMDeviceType hMDeviceType) {
        this.a = null;
        this.a = hMDeviceType;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onData(BatteryInfo batteryInfo) {
        HMLog.i(b, "batteryInfo: " + batteryInfo + "\n deviceType: " + this.a, new Object[0]);
        super.onData(batteryInfo);
        EventBus.getDefault().post(new HMDeviceBatteryEvent(this.a, batteryInfo));
    }
}
