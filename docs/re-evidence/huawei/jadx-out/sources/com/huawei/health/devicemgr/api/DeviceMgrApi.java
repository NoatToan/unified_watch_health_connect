package com.huawei.health.devicemgr.api;

import com.huawei.health.devicemgr.api.constant.DataCallbackType;
import com.huawei.health.devicemgr.api.constant.DeviceStateConstants;
import com.huawei.health.devicemgr.api.constant.ExecuteMode;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.api.constant.HwGetSetingItemConstants;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.pluginfitnessadvice.FitWorkout;
import defpackage.dmx;
import defpackage.ecy;
import defpackage.edn;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public interface DeviceMgrApi {
    void cancelDownloadDeviceResources();

    void changeContinueMeasureHeartRateStatus(int i);

    void changeCycleMeasureHeartRateStatus(int i);

    void changeHeartRateBtValue(boolean z);

    void checkBindPhoneService();

    void downloadDeviceResources(List<String> list, IBaseResponseCallback iBaseResponseCallback);

    void executeDeviceRelatedLogic(ExecuteMode executeMode, ecy ecyVar, String str);

    dmx<?> getCommonData(DeviceInfo deviceInfo, String str, String str2);

    DeviceInfo getDeviceInfo(GetDeviceInfoMode getDeviceInfoMode, HwGetDevicesParameter hwGetDevicesParameter, String str);

    edn getDeviceInfoUx(int i, String str);

    List<DeviceInfo> getDeviceList(HwGetDevicesMode hwGetDevicesMode, HwGetDevicesParameter hwGetDevicesParameter, String str);

    String getDeviceSettingItemById(HwGetSetingItemConstants hwGetSetingItemConstants, String str, String str2);

    int getDeviceStateById(DeviceStateConstants deviceStateConstants, String str, String str2, String str3);

    int getDeviceTypeId(DeviceInfo deviceInfo);

    void getDevicesFromCloud(String str, IBaseResponseCallback iBaseResponseCallback);

    void getEmotionAutoMonitorSwitch(IBaseResponseCallback iBaseResponseCallback);

    void getEmotionRiskWarningSwitch(IBaseResponseCallback iBaseResponseCallback);

    void getHealthSwitch(List<String> list, IBaseResponseCallback iBaseResponseCallback);

    dmx<Long> getMatterTimeInfo(DeviceInfo deviceInfo, int i);

    void getMenstrualPredictSwitch(IBaseResponseCallback iBaseResponseCallback);

    void getSleepBreatheDetectionState(IBaseResponseCallback iBaseResponseCallback);

    void getStressAutoMonitorSwitch(IBaseResponseCallback iBaseResponseCallback);

    String getSwitchSetting(String str, String str2);

    void getSwitchSetting(String str, IBaseResponseCallback iBaseResponseCallback);

    boolean isBindPhoneService();

    void pushFitRunCourseData(FitWorkout fitWorkout);

    Map<String, DeviceCapability> queryDeviceCapability(int i, String str, String str2);

    void registerDataCallback(IBaseResponseCallback iBaseResponseCallback, DataCallbackType dataCallbackType, String str);

    void sendDeviceData(int i, int i2, Map<Integer, String> map, DeviceInfo deviceInfo, String str);

    void setEmotionAutoMonitorSwitch(String str);

    void setEmotionRiskWarningSwitch(String str);

    void setHealthSwitch(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback);

    void setMenstrualPredictSwitch(String str);

    void setSleepBreatheDetectionState(boolean z, IBaseResponseCallback iBaseResponseCallback);

    void startSleepBreatheDetectionPage();

    boolean startToSyncByH5(String str);

    void unPair(List<String> list, boolean z);

    void unregisterDataCallback(int i);
}
