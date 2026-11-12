package com.huami.moving.device;

import com.huami.mifit.sportlib.devicekit.ISportDeviceCallback;

/* JADX INFO: loaded from: classes11.dex */
public class SportDeviceProxy implements ISportDeviceCallback {
    private ISportDeviceCallback a;

    public static class a {
        private static final SportDeviceProxy a = new SportDeviceProxy();

        private a() {
        }
    }

    private SportDeviceProxy() {
    }

    public static SportDeviceProxy getInstance() {
        return a.a;
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void deviceServicePause(int i) {
        ISportDeviceCallback iSportDeviceCallback = this.a;
        if (iSportDeviceCallback != null) {
            iSportDeviceCallback.deviceServicePause(i);
        }
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void deviceServiceResume(int i) {
        ISportDeviceCallback iSportDeviceCallback = this.a;
        if (iSportDeviceCallback != null) {
            iSportDeviceCallback.deviceServiceResume(i);
        }
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void deviceServiceStop(int i) {
        ISportDeviceCallback iSportDeviceCallback = this.a;
        if (iSportDeviceCallback != null) {
            iSportDeviceCallback.deviceServiceStop(i);
        }
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public String formatDeviceToString() {
        ISportDeviceCallback iSportDeviceCallback = this.a;
        return iSportDeviceCallback != null ? iSportDeviceCallback.formatDeviceToString() : "";
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public boolean hasBaroMeter() {
        ISportDeviceCallback iSportDeviceCallback = this.a;
        if (iSportDeviceCallback != null) {
            return iSportDeviceCallback.hasBaroMeter();
        }
        return false;
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void sendDataToDevice(String str) {
        ISportDeviceCallback iSportDeviceCallback = this.a;
        if (iSportDeviceCallback != null) {
            iSportDeviceCallback.sendDataToDevice(str);
        }
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void sendPaceToDevice(int i, float f) {
        ISportDeviceCallback iSportDeviceCallback = this.a;
        if (iSportDeviceCallback != null) {
            iSportDeviceCallback.sendPaceToDevice(i, f);
        }
    }

    public void setSecondaryProxy(ISportDeviceCallback iSportDeviceCallback) {
        this.a = iSportDeviceCallback;
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void sportPause(int i) {
        ISportDeviceCallback iSportDeviceCallback = this.a;
        if (iSportDeviceCallback != null) {
            iSportDeviceCallback.sportPause(i);
        }
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void sportResume(int i) {
        ISportDeviceCallback iSportDeviceCallback = this.a;
        if (iSportDeviceCallback != null) {
            iSportDeviceCallback.sportResume(i);
        }
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void sportStart(int i) {
        ISportDeviceCallback iSportDeviceCallback = this.a;
        if (iSportDeviceCallback != null) {
            iSportDeviceCallback.sportStart(i);
        }
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void sportStop(int i) {
        ISportDeviceCallback iSportDeviceCallback = this.a;
        if (iSportDeviceCallback != null) {
            iSportDeviceCallback.sportStop(i);
        }
    }
}
