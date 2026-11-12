package com.huawei.health.device.connectivity.comm;

import android.text.TextUtils;
import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.dmu;
import defpackage.dsa;
import defpackage.dxw;
import defpackage.dym;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MeasurableDevice extends HealthDevice {
    protected static final int OP_CODE_BOND = 1;
    protected static final int OP_CODE_CONNECTED = 3;
    protected static final int OP_CODE_UNBOND = 2;
    private static final String TAG = "MeasurableDevice";
    private String mDeviceName;
    private String mExtra;
    private boolean mIsAutoDevice;
    private HealthDevice.HealthDeviceKind mKind;
    private String mMeasureKitUuid;
    private String mProductId;
    private String mSerialNumber;
    private int mShowInList;

    public abstract boolean connectAsync(IHealthDeviceCallback iHealthDeviceCallback);

    public abstract boolean connectSync(int i);

    public abstract void disconnect();

    public abstract boolean doCreateBond(IDeviceEventHandler iDeviceEventHandler);

    public abstract boolean doRemoveBond();

    public HealthDevice.HealthDeviceKind getKind() {
        return (HealthDevice.HealthDeviceKind) dym.d(this.mKind);
    }

    public void setKind(HealthDevice.HealthDeviceKind healthDeviceKind) {
        this.mKind = (HealthDevice.HealthDeviceKind) dym.d(healthDeviceKind);
    }

    public boolean isAutoDevice() {
        return this.mIsAutoDevice;
    }

    public void setAutoDevice(boolean z) {
        this.mIsAutoDevice = ((Boolean) dym.d(Boolean.valueOf(z))).booleanValue();
    }

    public void cancelBinding(MeasurableDevice measurableDevice) {
        if (measurableDevice instanceof dmu) {
            ((dmu) measurableDevice).c();
        }
    }

    public void setDeviceName(String str) {
        this.mDeviceName = (String) dym.d(str);
    }

    @Override // com.huawei.health.device.model.HealthDevice
    public String getDeviceName() {
        return (String) dym.d(this.mDeviceName);
    }

    public void setMeasureKitUuid(String str) {
        this.mMeasureKitUuid = (String) dym.d(str);
    }

    public String getMeasureKitUuid() {
        return (String) dym.d(this.mMeasureKitUuid);
    }

    public String getProductId() {
        return this.mProductId;
    }

    public void setProductId(String str) {
        this.mProductId = str;
    }

    public String getSerialNumber() {
        return this.mSerialNumber;
    }

    public void setSerialNumber(String str) {
        this.mSerialNumber = str;
    }

    public int getShowInList() {
        return this.mShowInList;
    }

    public void setShowInList(int i) {
        this.mShowInList = i;
    }

    public String getExtra() {
        return this.mExtra;
    }

    public void setExtra(String str) {
        this.mExtra = str;
    }

    public void updateDeviceUsedTime(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "updateDeviceUsedTime address is null");
            return;
        }
        dsa dsaVar = new dsa("deviceUsedTime");
        if (i == 2) {
            dsaVar.e(dxw.d(), str);
        } else if (i == 1 || i == 3) {
            dsaVar.b(dxw.d(), str, System.currentTimeMillis());
        } else {
            LogUtil.j(TAG, "updateDeviceUsedTime opCode = ", Integer.valueOf(i));
        }
    }
}
