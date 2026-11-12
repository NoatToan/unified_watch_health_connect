package com.huawei.health.browseraction.jumpstrategy;

import android.content.Context;
import com.huawei.devicefeature.DeviceFeatureSupportApi;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.R;
import com.huawei.health.device.api.DeviceGeneralSettingApi;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import defpackage.ecu;
import defpackage.qpx;
import defpackage.yls;
import health.compact.a.Services;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class JumpDeviceStrategy implements JumpStrategy {
    private static final String TAG = "JumpDeviceStrategy";
    public Context mContext = BaseApplication.j();
    protected final DeviceFeatureSupportApi featureSupportApi = (DeviceFeatureSupportApi) Services.d("Module_Device_Feature", DeviceFeatureSupportApi.class);
    protected final DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);

    protected abstract boolean checkSupportCapability(DeviceInfo deviceInfo);

    protected abstract boolean onPretreatment();

    public DeviceInfo getJumpDeviceInfo() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
        if (checkSupportCapability(deviceInfo)) {
            return deviceInfo;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, TAG);
        if (yls.c(deviceList)) {
            return null;
        }
        for (DeviceInfo deviceInfo2 : deviceList) {
            if (checkSupportCapability(deviceInfo2)) {
                return deviceInfo2;
            }
        }
        return null;
    }

    protected boolean isConnected() {
        return !yls.c(ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, TAG));
    }

    public void processAndJump() {
        if (onPretreatment()) {
            jump();
        }
    }

    protected void showUnsupportedToast() {
        qpx.e(this.mContext, R.string.IDS_device_no_function);
    }

    protected void showNotConnectedToast() {
        qpx.e(this.mContext, R.string.IDS_depends_device_connect);
    }
}
