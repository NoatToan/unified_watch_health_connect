package com.huawei.ui.homewear21.home;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import defpackage.ecu;
import defpackage.loj;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class HealthMonitorPretreatmentService implements PretreatmentService {
    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        String queryParameter;
        Uri uriO = guidepost.o();
        String deviceIdentify = "";
        if (uriO == null) {
            queryParameter = "";
        } else {
            queryParameter = uriO.getQueryParameter("device");
        }
        LogUtil.a("HealthMonitorPretreatmentService", "startHealthMonitoring deviceParam:", queryParameter);
        if (TextUtils.isEmpty(queryParameter) || "main".equals(queryParameter)) {
            DeviceInfo deviceInfoA = a("DEVMGR_HealthMonitorPretreatmentService");
            if (deviceInfoA == null) {
                ReleaseLogUtil.e("DEVMGR_HealthMonitorPretreatmentService", "onPretreatment currentDeviceInfo is null");
                return false;
            }
            deviceIdentify = deviceInfoA.getDeviceIdentify();
        }
        if (TextUtils.isEmpty(deviceIdentify)) {
            ReleaseLogUtil.e("DEVMGR_HealthMonitorPretreatmentService", "onPretreatment deviceMac is empty");
            return false;
        }
        if (!b(deviceIdentify)) {
            ReleaseLogUtil.e("DEVMGR_HealthMonitorPretreatmentService", "onPretreatment isSupportHealthMonitoring is false");
            return false;
        }
        guidepost.c("device_id", deviceIdentify);
        LogUtil.a("HealthMonitorPretreatmentService", "startHealthMonitoring start");
        return true;
    }

    private boolean b(String str) {
        DeviceCapability deviceCapabilityE = DeviceSettingsInteractors.e(BaseApplication.b()).e(str);
        if (deviceCapabilityE == null) {
            ReleaseLogUtil.e("DEVMGR_HealthMonitorPretreatmentService", "isSupportHealthMonitoring deviceCapability is null");
            return false;
        }
        if ((deviceCapabilityE.isSupportCoreSleep() && loj.c(58)) || deviceCapabilityE.isActivityReminder() || deviceCapabilityE.isSupportContinueHeartRate()) {
            return true;
        }
        if ((deviceCapabilityE.isSupportHeartRateEnable() && !deviceCapabilityE.isSupportContinueHeartRate()) || deviceCapabilityE.isSupportPressAutoMonitor()) {
            return true;
        }
        ReleaseLogUtil.e("DEVMGR_HealthMonitorPretreatmentService", "isSupportHealthMonitoring is false");
        return false;
    }

    public static DeviceInfo a(String str) {
        DeviceInfo next = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, str);
        if (deviceList != null && !deviceList.isEmpty()) {
            Iterator<DeviceInfo> it = deviceList.iterator();
            if (it.hasNext()) {
                next = it.next();
            }
        }
        LogUtil.a("HealthMonitorPretreatmentService", "getConnectMainDevice() deviceInfo ", next, ", tag:", str);
        return next;
    }
}
