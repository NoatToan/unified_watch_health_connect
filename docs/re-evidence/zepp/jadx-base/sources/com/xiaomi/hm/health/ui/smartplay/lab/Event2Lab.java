package com.xiaomi.hm.health.ui.smartplay.lab;

import androidx.annotation.NonNull;
import com.huami.account.event.EventAccountStatus;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.eventbus.EventBluetooth;
import com.xiaomi.hm.health.lab.init.LabEventAccountStatus;
import com.xiaomi.hm.health.lab.init.LabEventBluetooth;
import com.xiaomi.hm.health.lab.init.LabEventManager;
import com.xiaomi.hm.health.lab.init.LabHMDeviceConnectionEvent;
import de.greenrobot.event.EventBus;

/* JADX INFO: loaded from: classes22.dex */
public class Event2Lab {
    public void onEventMainThread(@NonNull EventBluetooth eventBluetooth) {
        LabEventManager.getInstance().post(new LabEventBluetooth(eventBluetooth.isOn));
    }

    public void register() {
        if (EventBus.getDefault().isRegistered(this)) {
            return;
        }
        EventBus.getDefault().register(this);
    }

    public void unregister() {
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
    }

    public void onEventMainThread(@NonNull HMDeviceConnectionEvent event) {
        LabEventManager.getInstance().post(new LabHMDeviceConnectionEvent(event.getConnectionType(), event.getDeviceType()));
    }

    public void onEventMainThread(@NonNull EventAccountStatus event) {
        LabEventManager.getInstance().post(new LabEventAccountStatus(event.getStatus()));
    }
}
