package com.huawei.operation.h5pro.jsmodules;

import android.webkit.JavascriptInterface;
import com.huawei.health.device.api.HwEarPairApi;
import com.huawei.health.device.callback.EarphoneInfoCallback;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ecu;
import defpackage.edj;
import defpackage.eey;
import defpackage.njy;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class EarphonePairJsApi extends JsBaseModule {
    public static final String TAG = "EarphonePairJsApi";

    @JavascriptInterface
    public void isSupportEarphonePair(final long j, String str) {
        ReleaseLogUtil.c(TAG, "isSupportEarphonePair callbackId ", Long.valueOf(j));
        HwGetDevicesParameter hwGetDevicesParameter = new HwGetDevicesParameter();
        hwGetDevicesParameter.setDeviceIdentify(str);
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.IDENTIFY_DEVICES, hwGetDevicesParameter, TAG);
        if (njy.e(deviceList)) {
            onFailureCallback(j, "deviceinfo is empty");
            return;
        }
        DeviceInfo deviceInfo = deviceList.get(0) != null ? deviceList.get(0) : null;
        if (!checkNeedShowEarphonePair(deviceInfo)) {
            LogUtil.a(TAG, "addEarphoneMatching not support.");
            onSuccessCallback(j, false);
        } else {
            ((HwEarPairApi) Services.b("EarPairApiManager", HwEarPairApi.class)).getEarphoneInfoFromCache(deviceInfo, new EarphoneInfoCallback() { // from class: com.huawei.operation.h5pro.jsmodules.EarphonePairJsApi.1
                @Override // com.huawei.health.device.callback.EarphoneInfoCallback
                public void onResponse(boolean z, edj edjVar) {
                    LogUtil.a(EarphonePairJsApi.TAG, "addEarphoneMatching isShow：", Boolean.valueOf(z));
                    EarphonePairJsApi.this.onSuccessCallback(j, Boolean.valueOf(z));
                }
            });
        }
    }

    private static boolean checkNeedShowEarphonePair(DeviceInfo deviceInfo) {
        LogUtil.a(TAG, "checkNeedShowEarphonePair in.");
        if (eey.d(deviceInfo, 112)) {
            return true;
        }
        LogUtil.j(TAG, "showEarphonePairToastView not support. ");
        return false;
    }

    @JavascriptInterface
    public void getEarphoneInfo(final long j, String str) {
        ReleaseLogUtil.c(TAG, "getEarphoneInfo callbackId ", Long.valueOf(j));
        HwGetDevicesParameter hwGetDevicesParameter = new HwGetDevicesParameter();
        hwGetDevicesParameter.setDeviceIdentify(str);
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.IDENTIFY_DEVICES, hwGetDevicesParameter, TAG);
        if (njy.e(deviceList)) {
            onFailureCallback(j, "deviceinfo is empty");
        } else {
            ((HwEarPairApi) Services.b("EarPairApiManager", HwEarPairApi.class)).getEarphoneInfoFromCache(deviceList.get(0) != null ? deviceList.get(0) : null, new EarphoneInfoCallback() { // from class: com.huawei.operation.h5pro.jsmodules.EarphonePairJsApi.2
                @Override // com.huawei.health.device.callback.EarphoneInfoCallback
                public void onResponse(boolean z, edj edjVar) {
                    LogUtil.a(EarphonePairJsApi.TAG, "addEarphoneMatching isShow：", Boolean.valueOf(z));
                    EarphonePairJsApi.this.onSuccessCallback(j, edjVar);
                }
            });
        }
    }
}
