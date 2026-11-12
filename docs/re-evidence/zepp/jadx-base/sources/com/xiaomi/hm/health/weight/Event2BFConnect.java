package com.xiaomi.hm.health.weight;

import com.xiaomi.hm.health.bodyfat.event.BFDeviceConnectionEvent;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import de.greenrobot.event.EventBus;

/* JADX INFO: loaded from: classes22.dex */
public class Event2BFConnect {
    public void onEventMainThread(HMDeviceConnectionEvent event) {
        EventBus.getDefault().post(new BFDeviceConnectionEvent(event.getConnectionType(), event.getDeviceType()));
    }

    public void register() {
        EventBus.getDefault().register(this);
    }

    public void unregister() {
        EventBus.getDefault().unregister(this);
    }
}
