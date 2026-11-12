package com.xiaomi.hm.health.device.event;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.speech.HMSpeechEvent;

/* JADX INFO: loaded from: classes20.dex */
public class HMDeviceSpeechEvent {
    private HMDeviceSource a;
    private HMSpeechEvent b;

    public HMDeviceSpeechEvent(HMDeviceSource hMDeviceSource, HMSpeechEvent hMSpeechEvent) {
        this.a = HMDeviceSource.VDEVICE;
        this.b = null;
        this.a = hMDeviceSource;
        this.b = hMSpeechEvent;
    }

    public HMSpeechEvent getEvent() {
        return this.b;
    }

    public HMDeviceSource getSource() {
        return this.a;
    }

    public void setEvent(HMSpeechEvent hMSpeechEvent) {
        this.b = hMSpeechEvent;
    }

    public void setSource(HMDeviceSource hMDeviceSource) {
        this.a = hMDeviceSource;
    }
}
