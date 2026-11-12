package com.xiaomi.hm.health.lab.init;

/* JADX INFO: loaded from: classes21.dex */
public class LabEventManager {
    private static LabEventManager b;
    private LabEventListener a;

    public static LabEventManager getInstance() {
        if (b == null) {
            b = new LabEventManager();
        }
        return b;
    }

    public void clearLabEventListener() {
        b = null;
    }

    public void post(LabEventBluetooth labEventBluetooth) {
        LabEventListener labEventListener = this.a;
        if (labEventListener != null) {
            labEventListener.onEvent(labEventBluetooth);
        }
    }

    public void setOnLabEventBluetoothListener(LabEventListener labEventListener) {
        this.a = labEventListener;
    }

    public void post(LabHMDeviceConnectionEvent labHMDeviceConnectionEvent) {
        LabEventListener labEventListener = this.a;
        if (labEventListener != null) {
            labEventListener.onEvent(labHMDeviceConnectionEvent);
        }
    }

    public void post(LabEventAccountStatus labEventAccountStatus) {
        LabEventListener labEventListener = this.a;
        if (labEventListener != null) {
            labEventListener.onEvent(labEventAccountStatus);
        }
    }
}
