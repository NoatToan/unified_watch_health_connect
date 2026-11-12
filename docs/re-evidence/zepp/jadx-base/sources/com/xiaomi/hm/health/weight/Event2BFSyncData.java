package com.xiaomi.hm.health.weight;

import com.huami.account.event.EventAccountStatus;
import com.xiaomi.hm.health.bodyfat.event.BFDeviceSyncDataEvent;
import com.xiaomi.hm.health.bodyfat.event.BFEventAccountStatus;
import com.xiaomi.hm.health.device.event.HMDeviceSyncDataEvent;
import de.greenrobot.event.EventBus;

/* JADX INFO: loaded from: classes22.dex */
public class Event2BFSyncData {
    public void onEventMainThread(HMDeviceSyncDataEvent event) {
        EventBus.getDefault().post(new BFDeviceSyncDataEvent(event.getDeviceType(), event.getSyncEvent(), event.getProgress()));
    }

    public void register() {
        EventBus.getDefault().register(this);
    }

    public void unregister() {
        EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(EventAccountStatus event) {
        EventBus.getDefault().post(new BFEventAccountStatus(event.getStatus()));
    }
}
