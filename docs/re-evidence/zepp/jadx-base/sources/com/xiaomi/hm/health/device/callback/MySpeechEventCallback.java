package com.xiaomi.hm.health.device.callback;

import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.speech.HMSpeechEvent;
import com.xiaomi.hm.health.device.event.HMDeviceSpeechEvent;
import de.greenrobot.event.EventBus;

/* JADX INFO: loaded from: classes20.dex */
public class MySpeechEventCallback extends HMCallback<HMSpeechEvent> {
    private HMDeviceSource a;

    public MySpeechEventCallback(HMDeviceSource hMDeviceSource) {
        this.a = HMDeviceSource.VDEVICE;
        this.a = hMDeviceSource;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onData(HMSpeechEvent hMSpeechEvent) {
        EventBus.getDefault().post(new HMDeviceSpeechEvent(this.a, hMSpeechEvent));
    }
}
