package com.huami.moving.device;

import android.content.Context;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes11.dex */
public class SportUsingDeviceHandler implements ISportUsingDeviceDelegate {
    public static final int HR_STATE_DISCONNECTED = 2;
    public static final int HR_STATE_LOW_POWER = 3;
    public static final int HR_STATE_SUCC = 1;
    public static final int HR_STATE_TIME_OUT = 4;
    public ISportUsingDeviceDelegate a;

    public static class a {
        private static final SportUsingDeviceHandler a = new SportUsingDeviceHandler();

        private a() {
        }
    }

    private SportUsingDeviceHandler() {
    }

    public static SportUsingDeviceHandler getInstance() {
        return a.a;
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public int deviceIconResId(int i, boolean z) {
        ISportUsingDeviceDelegate iSportUsingDeviceDelegate = this.a;
        if (iSportUsingDeviceDelegate != null) {
            return iSportUsingDeviceDelegate.deviceIconResId(i, z);
        }
        return 0;
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public int getBandValue() {
        ISportUsingDeviceDelegate iSportUsingDeviceDelegate = this.a;
        if (iSportUsingDeviceDelegate != null) {
            return iSportUsingDeviceDelegate.getBandValue();
        }
        return 0;
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public String getDeviceId(int i) {
        ISportUsingDeviceDelegate iSportUsingDeviceDelegate = this.a;
        if (iSportUsingDeviceDelegate != null) {
            return iSportUsingDeviceDelegate.getDeviceId(i);
        }
        return null;
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public String getSN(int i) {
        ISportUsingDeviceDelegate iSportUsingDeviceDelegate = this.a;
        if (iSportUsingDeviceDelegate != null) {
            return iSportUsingDeviceDelegate.getSN(i);
        }
        return null;
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public int getShoeValue() {
        ISportUsingDeviceDelegate iSportUsingDeviceDelegate = this.a;
        if (iSportUsingDeviceDelegate != null) {
            return iSportUsingDeviceDelegate.getShoeValue();
        }
        return 0;
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public boolean hasBaroMeter() {
        ISportUsingDeviceDelegate iSportUsingDeviceDelegate = this.a;
        if (iSportUsingDeviceDelegate != null) {
            return iSportUsingDeviceDelegate.hasBaroMeter();
        }
        return false;
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public boolean hasValidDevices() {
        ISportUsingDeviceDelegate iSportUsingDeviceDelegate = this.a;
        if (iSportUsingDeviceDelegate != null) {
            return iSportUsingDeviceDelegate.hasValidDevices();
        }
        return false;
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public int heartRateState(int i) {
        ISportUsingDeviceDelegate iSportUsingDeviceDelegate = this.a;
        if (iSportUsingDeviceDelegate != null) {
            return iSportUsingDeviceDelegate.heartRateState(i);
        }
        return 0;
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public boolean isBandConnected() {
        ISportUsingDeviceDelegate iSportUsingDeviceDelegate = this.a;
        if (iSportUsingDeviceDelegate != null) {
            return iSportUsingDeviceDelegate.isBandConnected();
        }
        return false;
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public boolean isHrDevice(int i) {
        ISportUsingDeviceDelegate iSportUsingDeviceDelegate = this.a;
        if (iSportUsingDeviceDelegate != null) {
            return iSportUsingDeviceDelegate.isHrDevice(i);
        }
        return false;
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public boolean isHrDeviceConnected() {
        ISportUsingDeviceDelegate iSportUsingDeviceDelegate = this.a;
        if (iSportUsingDeviceDelegate != null) {
            return iSportUsingDeviceDelegate.isHrDeviceConnected();
        }
        return false;
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public boolean isShoeConnected() {
        ISportUsingDeviceDelegate iSportUsingDeviceDelegate = this.a;
        if (iSportUsingDeviceDelegate != null) {
            return iSportUsingDeviceDelegate.isShoeConnected();
        }
        return false;
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public boolean isSupportStep(Context context) {
        ISportUsingDeviceDelegate iSportUsingDeviceDelegate = this.a;
        if (iSportUsingDeviceDelegate != null) {
            return iSportUsingDeviceDelegate.isSupportStep(context);
        }
        return false;
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public boolean isValidHrDevices() {
        ISportUsingDeviceDelegate iSportUsingDeviceDelegate = this.a;
        if (iSportUsingDeviceDelegate != null) {
            return iSportUsingDeviceDelegate.isValidHrDevices();
        }
        return false;
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public void remindHRIfNeed(int i) {
        ISportUsingDeviceDelegate iSportUsingDeviceDelegate = this.a;
        if (iSportUsingDeviceDelegate != null) {
            iSportUsingDeviceDelegate.remindHRIfNeed(i);
        }
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public boolean remindPaceIfNeed(float f) {
        ISportUsingDeviceDelegate iSportUsingDeviceDelegate = this.a;
        if (iSportUsingDeviceDelegate != null) {
            return iSportUsingDeviceDelegate.remindPaceIfNeed(f);
        }
        return false;
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public boolean sendVerifyDisCmd2Device(long j, int i, int i2, int i3) {
        ISportUsingDeviceDelegate iSportUsingDeviceDelegate = this.a;
        if (iSportUsingDeviceDelegate != null) {
            return iSportUsingDeviceDelegate.sendVerifyDisCmd2Device(j, i, i2, i3);
        }
        return false;
    }

    public void setDelegate(ISportUsingDeviceDelegate iSportUsingDeviceDelegate) {
        this.a = iSportUsingDeviceDelegate;
    }

    @Override // com.huami.moving.device.ISportUsingDeviceDelegate
    public boolean setWebIcon(Context context, int i, ImageView imageView) {
        ISportUsingDeviceDelegate iSportUsingDeviceDelegate = this.a;
        if (iSportUsingDeviceDelegate != null) {
            return iSportUsingDeviceDelegate.setWebIcon(context, i, imageView);
        }
        return false;
    }
}
