package com.xiaomi.hm.health.device.callback;

import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.model.HMVibrateType;
import com.xiaomi.hm.health.device.event.HMDeviceVibrateEvent;
import de.greenrobot.event.EventBus;

/* JADX INFO: loaded from: classes20.dex */
public class MyVibrateNotifyCallback extends HMCallback<HMVibrateType> {
    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onData(HMVibrateType hMVibrateType) {
        super.onData(hMVibrateType);
        EventBus.getDefault().post(new HMDeviceVibrateEvent(hMVibrateType));
    }
}
