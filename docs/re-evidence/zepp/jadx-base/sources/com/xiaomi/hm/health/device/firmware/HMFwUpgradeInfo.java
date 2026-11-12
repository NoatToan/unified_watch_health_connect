package com.xiaomi.hm.health.device.firmware;

import android.content.Context;
import com.alipay.sdk.m.u.i;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import java.io.File;

/* JADX INFO: loaded from: classes20.dex */
public class HMFwUpgradeInfo implements IHMFwUpgradeInfo {
    private HMDeviceSource a;
    private int b;
    private String c;
    private Context d;
    private boolean e;
    private String f;
    private String g;
    private boolean h;
    private HMFirmwareType i;

    public HMFwUpgradeInfo(Context context, HMDeviceSource hMDeviceSource, int i, String str, String str2) {
        this.c = null;
        boolean z = false;
        this.e = false;
        this.f = null;
        this.i = HMFirmwareType.FIRMWARE;
        this.a = hMDeviceSource;
        this.b = i;
        this.c = str;
        this.d = context;
        this.g = str2;
        if (hMDeviceSource != HMDeviceSource.MILI_PEYTO && hMDeviceSource != HMDeviceSource.MILI_WUHAN && hMDeviceSource != HMDeviceSource.MILI_TEMPO) {
            z = true;
        }
        this.h = z;
    }

    @Override // com.xiaomi.hm.health.device.firmware.IHMFwUpgradeInfo
    public boolean deleteFwFile() {
        if (this.f == null) {
            return false;
        }
        return new File(this.f).delete();
    }

    @Override // com.xiaomi.hm.health.device.firmware.IHMFwUpgradeInfo
    public Context getContext() {
        return this.d;
    }

    @Override // com.xiaomi.hm.health.device.firmware.IHMFwUpgradeInfo
    public HMDeviceSource getDeviceSource() {
        return this.a;
    }

    @Override // com.xiaomi.hm.health.device.firmware.IHMFwUpgradeInfo
    public HMFirmwareType getFirmwareType() {
        return this.i;
    }

    @Override // com.xiaomi.hm.health.device.firmware.IHMFwUpgradeInfo
    public String getFwFilePath() {
        return this.f;
    }

    public String getFwName() {
        return this.c;
    }

    @Override // com.xiaomi.hm.health.device.firmware.IHMFwUpgradeInfo
    public int getFwType() {
        return this.b;
    }

    @Override // com.xiaomi.hm.health.device.firmware.IHMFwUpgradeInfo
    public String getFwVersionName() {
        return this.g;
    }

    public boolean getIsFromFileFw() {
        return this.e;
    }

    @Override // com.xiaomi.hm.health.device.firmware.IHMFwUpgradeInfo
    public boolean isForceUpgrade() {
        return this.h;
    }

    public void setFirmwareType(HMFirmwareType hMFirmwareType) {
        this.i = hMFirmwareType;
    }

    public void setForceUpgrade(boolean z) {
        this.h = z;
    }

    public String toString() {
        return "HMFwUpgradeInfo{mDeviceSource=" + this.a + ", mFwType=" + this.b + ", mFwNameInAssets='" + this.c + "', mContext=" + this.d + ", isFromFileFw = " + this.e + ", mFwFilePath = " + this.f + ", isForceUpgrade = " + this.h + i.d;
    }

    public HMFwUpgradeInfo(Context context, HMDeviceSource hMDeviceSource, int i, boolean z, String str, String str2, boolean z2) {
        this.c = null;
        this.e = false;
        this.f = null;
        this.i = HMFirmwareType.FIRMWARE;
        this.a = hMDeviceSource;
        this.b = i;
        this.f = str;
        this.e = z;
        this.d = context;
        this.g = str2;
        this.h = z2;
    }
}
