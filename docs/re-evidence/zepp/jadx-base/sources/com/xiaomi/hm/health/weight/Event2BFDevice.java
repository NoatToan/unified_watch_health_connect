package com.xiaomi.hm.health.weight;

import com.xiaomi.hm.health.bodyfat.event.BFDeviceBatteryEvent;
import com.xiaomi.hm.health.bodyfat.event.BFDeviceWeightValueEvent;
import com.xiaomi.hm.health.bodyfat.event.BFEventBluetooth;
import com.xiaomi.hm.health.device.event.HMDeviceBatteryEvent;
import com.xiaomi.hm.health.device.event.HMDeviceWeightValueEvent;
import com.xiaomi.hm.health.eventbus.EventBluetooth;
import de.greenrobot.event.EventBus;

/* JADX INFO: loaded from: classes22.dex */
public class Event2BFDevice {
    public void onEventMainThread(EventBluetooth eventBluetooth) {
        EventBus.getDefault().post(new BFEventBluetooth(eventBluetooth.isOn));
    }

    public void register() {
        EventBus.getDefault().register(this);
    }

    public void unregister() {
        EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(HMDeviceWeightValueEvent event) {
        EventBus.getDefault().post(new BFDeviceWeightValueEvent(event.getWeightAdvData(), event.isBoundValue()));
    }

    public void onEventMainThread(HMDeviceBatteryEvent event) {
        EventBus.getDefault().post(new BFDeviceBatteryEvent(event.getDeviceType(), event.getBatteryInfo()));
    }
}
