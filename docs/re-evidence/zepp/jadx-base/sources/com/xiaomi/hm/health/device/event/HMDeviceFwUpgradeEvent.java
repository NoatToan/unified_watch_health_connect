package com.xiaomi.hm.health.device.event;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;

/* JADX INFO: loaded from: classes20.dex */
public class HMDeviceFwUpgradeEvent extends HMDeviceEvent {
    public static final int PROGRESS = 1;
    public static final int START = 0;
    public static final int STOP = 2;
    private int b;
    private Progress c;
    private boolean d;
    private String e;
    private HMDeviceSource f;
    private HMFirmwareType g;
    private int h;
    private String i;
    private boolean j;
    private boolean k;
    private int l;
    private long m;

    public HMDeviceFwUpgradeEvent(HMDeviceSource hMDeviceSource, HMFirmwareType hMFirmwareType, int i) {
        super(hMDeviceSource.getType());
        this.b = 0;
        this.c = new Progress();
        this.d = false;
        this.e = "";
        this.f = HMDeviceSource.MILI;
        this.g = HMFirmwareType.FIRMWARE;
        this.h = -1;
        this.i = null;
        this.j = false;
        this.k = false;
        this.l = 1;
        this.m = System.currentTimeMillis();
        this.f = hMDeviceSource;
        this.b = i;
        this.g = hMFirmwareType;
    }

    public HMDeviceSource getDeviceSource() {
        return this.f;
    }

    public int getErrorCode() {
        return this.l;
    }

    public long getEventCreateTime() {
        return this.m;
    }

    public HMFirmwareType getFirmwareType() {
        return this.g;
    }

    public String getFwVersion() {
        return this.e;
    }

    public Progress getProgress() {
        return this.c;
    }

    public boolean getResult() {
        return this.d;
    }

    public int getmFwType() {
        return this.h;
    }

    public String getmUpgradeLog() {
        return this.i;
    }

    public boolean isContinuousUpgrade() {
        return this.j;
    }

    public boolean isProgress() {
        return this.b == 1;
    }

    public boolean isStart() {
        return this.b == 0;
    }

    public boolean isStop() {
        return this.b == 2;
    }

    public boolean isSupportPresetFirmwareInformation() {
        return this.k;
    }

    public void setContinuousUpgrade(boolean z) {
        this.j = z;
    }

    public void setErrorCode(int i) {
        this.l = i;
    }

    public void setFwVersion(String str) {
        this.e = str;
    }

    public void setProgress(Progress progress) {
        this.c = progress;
    }

    public void setSupportPresetFirmwareInformation(boolean z) {
        this.k = z;
    }

    public void setmFwType(int i) {
        this.h = i;
    }

    public void setmUpgradeLog(String str) {
        this.i = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HMDeviceFwUpgradeEvent{fwType=");
        sb.append(this.g);
        sb.append(", mSyncEvent=");
        sb.append(this.b);
        sb.append(", deviceType=");
        sb.append(getDeviceType().name());
        sb.append(", isUpdating=");
        int i = this.b;
        boolean z = true;
        if (i != 0 && i != 1) {
            z = false;
        }
        sb.append(z);
        sb.append(", mProgress=");
        sb.append(this.c);
        sb.append(", mResult=");
        sb.append(this.d);
        sb.append(", mFwVersion='");
        sb.append(this.e);
        sb.append('\'');
        sb.append(", errorCode='");
        sb.append(this.l);
        sb.append("', eventCreateTime=");
        sb.append(this.m);
        sb.append('}');
        return sb.toString();
    }

    public HMDeviceFwUpgradeEvent(HMDeviceSource hMDeviceSource, HMFirmwareType hMFirmwareType, int i, boolean z) {
        super(hMDeviceSource.getType());
        this.b = 0;
        this.c = new Progress();
        this.d = false;
        this.e = "";
        this.f = HMDeviceSource.MILI;
        this.g = HMFirmwareType.FIRMWARE;
        this.h = -1;
        this.i = null;
        this.j = false;
        this.k = false;
        this.l = 1;
        this.m = System.currentTimeMillis();
        this.f = hMDeviceSource;
        this.b = i;
        this.d = z;
        this.g = hMFirmwareType;
    }

    public HMDeviceFwUpgradeEvent(HMDeviceSource hMDeviceSource, HMFirmwareType hMFirmwareType, Progress progress) {
        super(hMDeviceSource.getType());
        this.b = 0;
        this.c = new Progress();
        this.d = false;
        this.e = "";
        this.f = HMDeviceSource.MILI;
        this.g = HMFirmwareType.FIRMWARE;
        this.h = -1;
        this.i = null;
        this.j = false;
        this.k = false;
        this.l = 1;
        this.m = System.currentTimeMillis();
        this.f = hMDeviceSource;
        this.b = 1;
        this.c = progress;
        this.g = hMFirmwareType;
    }
}
