package com.huami.mifit.sportlib.devicekit;

import com.huami.mifit.sportlib.defpractice.DefDeviceClient;

/* JADX INFO: loaded from: classes11.dex */
public class SportDeviceKit implements ISportDeviceCallback {
    public static final int DEVICE_TYPE_BLUEMONKEY = 45;
    public static final int DEVICE_TYPE_MILI_BAND = 42;
    public static final int DEVICE_TYPE_PHONE_SENSOR_HUB = 43;
    public static final int DEVICE_TYPE_SHOES = 44;
    private static volatile SportDeviceKit c;
    private ISportDeviceCallback a;
    private DefDeviceClient b;

    private SportDeviceKit() {
    }

    public static SportDeviceKit getInstance() {
        if (c == null) {
            synchronized (SportDeviceKit.class) {
                if (c == null) {
                    c = new SportDeviceKit();
                }
            }
        }
        return c;
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
        return iSportDeviceCallback != null ? iSportDeviceCallback.formatDeviceToString() : this.b.formatDeviceToString();
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

    public void setDeviceClient(ISportDeviceCallback iSportDeviceCallback) {
        this.a = iSportDeviceCallback;
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void sportPause(int i) {
        ISportDeviceCallback iSportDeviceCallback = this.a;
        if (iSportDeviceCallback != null) {
            iSportDeviceCallback.sportPause(i);
        } else {
            this.b.sportPause(i);
        }
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void sportResume(int i) {
        ISportDeviceCallback iSportDeviceCallback = this.a;
        if (iSportDeviceCallback != null) {
            iSportDeviceCallback.sportResume(i);
        } else {
            this.b.sportResume(i);
        }
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void sportStart(int i) {
        ISportDeviceCallback iSportDeviceCallback = this.a;
        if (iSportDeviceCallback != null) {
            iSportDeviceCallback.sportStart(i);
            return;
        }
        DefDeviceClient defDeviceClient = DefDeviceClient.getInstance();
        this.b = defDeviceClient;
        defDeviceClient.sportStart(i);
    }

    @Override // com.huami.mifit.sportlib.devicekit.ISportDeviceCallback
    public void sportStop(int i) {
        ISportDeviceCallback iSportDeviceCallback = this.a;
        if (iSportDeviceCallback != null) {
            iSportDeviceCallback.sportStop(i);
        } else {
            this.b.sportStop(i);
        }
    }
}
