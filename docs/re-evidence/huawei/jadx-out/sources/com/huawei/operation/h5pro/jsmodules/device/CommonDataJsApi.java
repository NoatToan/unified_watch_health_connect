package com.huawei.operation.h5pro.jsmodules.device;

import com.huawei.health.device.api.DeviceInfoUtilsApi;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hms.network.file.core.util.Utils;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.dmx;
import defpackage.ecu;
import defpackage.eeq;
import defpackage.njy;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class CommonDataJsApi extends JsBaseModule {
    private static final String KEY_END_TIME = "endTime";
    private static final String KEY_POINT_INFO = "pointInfo";
    private static final String KEY_START_TIME = "startTime";
    private static final String KEY_TYPE_ID = "typeId";
    private static final String TAG = "CommonDataJsApi";
    private static final int TYPE_ACTIVATE_TIME = 3;
    private static final int TYPE_REMAINING_PREHEATING_TIME = 2;
    private static final int TYPE_REMAINING_SERVICE_TIME = 1;

    public void getDeviceInfo(long j, String str) {
        ReleaseLogUtil.c(TAG, "getDeviceInfo callbackId ", Long.valueOf(j));
        DeviceInfo deviceInfo = getDeviceInfo(str);
        if (deviceInfo == null) {
            onFailureCallback(j, "targetDevice is null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            dmx<Long> matterTimeInfo = ecu.d().getMatterTimeInfo(deviceInfo, 3);
            dmx<Long> matterTimeInfo2 = ecu.d().getMatterTimeInfo(deviceInfo, 1);
            dmx<Long> matterTimeInfo3 = ecu.d().getMatterTimeInfo(deviceInfo, 2);
            LogUtil.a(TAG, "getDeviceInfo serviceTimeResult:", matterTimeInfo2.a(), " preheatingTimeResult:", matterTimeInfo3.a());
            long jLongValue = matterTimeInfo2.a().intValue() == 0 ? matterTimeInfo2.c().longValue() : 0L;
            long jLongValue2 = matterTimeInfo3.a().intValue() == 0 ? matterTimeInfo3.c().longValue() : 0L;
            long jLongValue3 = matterTimeInfo.a().intValue() == 0 ? matterTimeInfo.c().longValue() : 0L;
            jSONObject.put("remainingServiceTime", jLongValue);
            jSONObject.put("remainingPreheatingTime", jLongValue2);
            jSONObject.put("activationTime", jLongValue3);
            jSONObject.put(Utils.REQUEST_TIME, System.currentTimeMillis());
            jSONObject.put("mac", deviceInfo.getDeviceIdentify());
            jSONObject.put("sn", getDeviceSn(deviceInfo));
            jSONObject.put("softwareVersion", deviceInfo.getSoftVersion());
            jSONObject.put("deviceName", deviceInfo.getDeviceName());
            jSONObject.put("model", deviceInfo.getDeviceModel());
            onSuccessCallback(j, jSONObject);
        } catch (JSONException unused) {
            onFailureCallback(j, "data Exception");
        }
    }

    protected DeviceInfo getDeviceInfo(String str) {
        String deviceMac = DevicePairUtils.getDeviceMac(str);
        HwGetDevicesParameter hwGetDevicesParameter = new HwGetDevicesParameter();
        hwGetDevicesParameter.setDeviceIdentify(deviceMac);
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.IDENTIFY_DEVICES, hwGetDevicesParameter, TAG);
        if (njy.e(deviceList)) {
            LogUtil.j(TAG, "getDeviceInfo deviceInfoList is null");
            return null;
        }
        return deviceList.get(0);
    }

    protected DeviceInfo getMacaDeviceInfo() {
        List<DeviceInfo> wearDeviceList = ((DeviceInfoUtilsApi) Services.b("PluginDeviceOpenModule", DeviceInfoUtilsApi.class)).getWearDeviceList();
        if (wearDeviceList == null) {
            return null;
        }
        for (DeviceInfo deviceInfo : wearDeviceList) {
            if (deviceInfo.getProductType() == 275) {
                return deviceInfo;
            }
        }
        return null;
    }

    private String getDeviceSn(DeviceInfo deviceInfo) {
        if (deviceInfo.getDeviceIdType() == 1) {
            return eeq.d(deviceInfo.getUuid());
        }
        if (deviceInfo.getDeviceIdType() == 10) {
            return deviceInfo.getUuid();
        }
        return eeq.d(deviceInfo.getUuid());
    }
}
