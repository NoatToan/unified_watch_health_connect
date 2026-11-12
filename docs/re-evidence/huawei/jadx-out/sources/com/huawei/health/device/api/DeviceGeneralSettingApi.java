package com.huawei.health.device.api;

import android.content.Intent;
import com.huawei.health.device.callback.DeleteDeviceCallback;
import com.huawei.health.device.callback.DeviceGeneralSettingCallback;
import com.huawei.health.device.callback.FactoryRestCallback;
import com.huawei.health.device.callback.QueryBackLogDataCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.networkclient.ResultCallback;

/* JADX INFO: loaded from: classes.dex */
public interface DeviceGeneralSettingApi {
    void deleteDevice(String str, String str2, boolean z, DeleteDeviceCallback deleteDeviceCallback);

    void exclusiveServiceSupport(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void factoryReset(String str, int i, FactoryRestCallback factoryRestCallback);

    DeviceInfo getDeviceInfo(String str);

    void getDeviceShape(String str, ResultCallback<Number> resultCallback);

    void isHonorDevice(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    boolean isSupportExclusiveGuardianFromLocal(String str);

    void jumpWearSmartDetect(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void onActivityResult(int i, int i2, Intent intent);

    void pullUpAppWithWant(Object obj, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void queryAutoLightScreenStatus(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void queryBacklogEvents(String str, QueryBackLogDataCallback queryBackLogDataCallback);

    void queryBenefitData(DeviceInfo deviceInfo, QueryBackLogDataCallback queryBackLogDataCallback);

    void queryBluetoothOffAlertStatus(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void queryLeftRightHandWearModeStatus(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void queryNoDisturbStatus(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void queryRotateSwitchScreenStatus(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void querySupportAutoLightScreen(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void querySupportBetaFeedback(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void querySupportBluetoothOffAlert(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void querySupportCalendar(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void querySupportCustomBand(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void querySupportDetection(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void querySupportDeviceInfo(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void querySupportDiagnosticAnalysis(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void querySupportDoublePhone(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void querySupportFactoryReset(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void querySupportHonorPrivacy(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void querySupportLeftRightHandWearMode(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void querySupportLiveWindow(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void querySupportLogFeedback(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void querySupportMyHW(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void querySupportNewEsim(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void querySupportNoDisturb(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void querySupportOtaUpdate(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void querySupportRotateSwitchScreen(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void querySupportSatellite(DeviceInfo deviceInfo, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void querySupportScreenshotSetting(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void querySupportServiceHotline(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void querySupportSyncWifi(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void querySupportWallet(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void querySupportWeather(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void querySyncWifiConfigStatus(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void setAutoLightScreen(String str, Boolean bool, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void setBluetoothOffAlert(String str, Boolean bool, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void setFallDetection(String str, int i, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void setLeftRightHandWearMode(String str, Boolean bool, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void setRotateSwitchScreen(String str, Boolean bool, DeviceGeneralSettingCallback deviceGeneralSettingCallback);

    void setSyncWifiConfigStatus(String str, Boolean bool, DeviceGeneralSettingCallback deviceGeneralSettingCallback);
}
