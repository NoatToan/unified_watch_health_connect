package com.xiaomi.hm.health.device.callback;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;
import com.xiaomi.hm.health.device.event.HMDeviceRealtimeStepEvent;
import de.greenrobot.event.EventBus;

/* JADX INFO: loaded from: classes20.dex */
public class MyRealtimeStepCallback extends HMCallback<RealtimeStep> {
    private final String a = "MyRealtimeStepCallback";
    private HMDeviceType b;

    public MyRealtimeStepCallback(HMDeviceType hMDeviceType) {
        this.b = HMDeviceType.MILI;
        this.b = hMDeviceType;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onData(RealtimeStep realtimeStep) {
        super.onData(realtimeStep);
        HMLog.i("MyRealtimeStepCallback", "type:" + this.b + ",step:" + realtimeStep, new Object[0]);
        EventBus.getDefault().postSticky(new HMDeviceRealtimeStepEvent(this.b, realtimeStep));
    }
}
