package com.huawei.operation.h5pro.jsmodules.device;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcelable;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.core.H5ProBundle;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hwcommonmodel.application.BaseApplication;
import defpackage.ecu;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class DeviceStatusJsApi extends JsBaseModule {
    public static final String MODEL = "DeviceStatus";
    private static final String TAG = "DeviceStatusJsApi";
    private static final String TAG_RELEASE = "R_DeviceStatusJsApi";
    private DeviceStatusBroadcastReceiver mDeviceChangerBroadcastReceiver;

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule
    public void onCreate(H5ProBundle h5ProBundle) {
        ReleaseLogUtil.c(TAG_RELEASE, "enter onCreate");
        super.onCreate(h5ProBundle);
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onDestroy() {
        if (this.mDeviceChangerBroadcastReceiver != null) {
            ReleaseLogUtil.c(TAG_RELEASE, "unregister maca DeviceStatus");
            BroadcastManagerUtil.b(BaseApplication.getContext(), this.mDeviceChangerBroadcastReceiver);
            this.mDeviceChangerBroadcastReceiver = null;
        }
        super.onDestroy();
    }

    @JavascriptInterface
    public void registerDeviceStatus(long j, String str) {
        ReleaseLogUtil.c(TAG, "registerDeviceStatus ", Long.valueOf(j));
        String deviceMac = DevicePairUtils.getDeviceMac(str);
        if (TextUtils.isEmpty(deviceMac)) {
            onFailureCallback(j, " mac is empty");
            LogUtil.e(TAG, "mac is empty");
        }
        DeviceStatusBroadcastReceiver deviceStatusBroadcastReceiver = this.mDeviceChangerBroadcastReceiver;
        if (deviceStatusBroadcastReceiver != null) {
            if (deviceStatusBroadcastReceiver.mMac.equals(deviceMac)) {
                LogUtil.b(TAG, "receiver is not null");
                return;
            }
            BroadcastManagerUtil.b(BaseApplication.getContext(), this.mDeviceChangerBroadcastReceiver);
        }
        this.mDeviceChangerBroadcastReceiver = new DeviceStatusBroadcastReceiver(j, deviceMac);
        IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.setPriority(1000);
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.mDeviceChangerBroadcastReceiver, intentFilter, LocalBroadcast.f36595c, null);
        int deviceConnectState = 4;
        for (DeviceInfo deviceInfo : ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, TAG)) {
            if (Objects.equals(deviceInfo.getDeviceIdentify(), deviceMac)) {
                deviceConnectState = deviceInfo.getDeviceConnectState();
            }
        }
        onSuccessCallback(j);
        onSuccessCallback(j, Integer.valueOf(deviceConnectState));
    }

    @JavascriptInterface
    public void unregisterDeviceStatus(long j) {
        ReleaseLogUtil.c(TAG, "unregisterDeviceStatus ", Long.valueOf(j));
        if (this.mDeviceChangerBroadcastReceiver != null) {
            BroadcastManagerUtil.b(BaseApplication.getContext(), this.mDeviceChangerBroadcastReceiver);
            this.mDeviceChangerBroadcastReceiver = null;
        }
        onSuccessCallback(j);
    }

    /* JADX INFO: loaded from: classes13.dex */
    class DeviceStatusBroadcastReceiver extends BroadcastReceiver {
        long mCallbackId;
        String mMac;

        DeviceStatusBroadcastReceiver(long j, String str) {
            this.mMac = str;
            this.mCallbackId = j;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
            if (parcelableExtra instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) parcelableExtra;
                ReleaseLogUtil.c(DeviceStatusJsApi.TAG_RELEASE, "sendMsgConnectChange deviceName:", CommonUtil.n(deviceInfo.getDeviceName()), " Identify:", CommonUtil.n(deviceInfo.getDeviceIdentify()), " connectState:", Integer.valueOf(deviceInfo.getDeviceConnectState()));
                if (TextUtils.equals(this.mMac, deviceInfo.getDeviceIdentify())) {
                    DeviceStatusJsApi.this.onSuccessCallback(this.mCallbackId, Integer.valueOf(deviceInfo.getDeviceConnectState()));
                }
            }
        }
    }
}
