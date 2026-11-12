package defpackage;

import com.huawei.haf.bundle.AppBundlePluginProxy;
import com.huawei.health.devicemgr.api.DeviceMgrApi;
import com.huawei.health.devicemgr.api.constant.DataCallbackType;
import com.huawei.health.devicemgr.api.constant.DeviceStateConstants;
import com.huawei.health.devicemgr.api.constant.ExecuteMode;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.api.constant.HwGetSetingItemConstants;
import com.huawei.health.devicemgr.business.constant.ResultCodeMessage;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.pluginfitnessadvice.FitWorkout;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ecu extends AppBundlePluginProxy<DeviceMgrApi> implements DeviceMgrApi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile ecu f32758b;
    private DeviceMgrApi d;

    private ecu() {
        super("DeviceMgrProxy", "DeviceMgrProxy", "com.huawei.hwdevice.outofprocess.impl.DeviceMgrImpl");
        this.d = createPluginApi();
    }

    public static ecu d() {
        ecu ecuVar;
        if (f32758b == null) {
            synchronized (ecu.class) {
                if (f32758b == null) {
                    f32758b = new ecu();
                }
                ecuVar = f32758b;
            }
            return ecuVar;
        }
        return f32758b;
    }

    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public boolean isPluginAvaiable() {
        return this.d != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void initialize(DeviceMgrApi deviceMgrApi) {
        this.d = deviceMgrApi;
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void registerDataCallback(IBaseResponseCallback iBaseResponseCallback, DataCallbackType dataCallbackType, String str) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            deviceMgrApi.registerDataCallback(iBaseResponseCallback, dataCallbackType, str);
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void unregisterDataCallback(int i) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            deviceMgrApi.unregisterDataCallback(i);
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public DeviceInfo getDeviceInfo(GetDeviceInfoMode getDeviceInfoMode, HwGetDevicesParameter hwGetDevicesParameter, String str) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            return deviceMgrApi.getDeviceInfo(getDeviceInfoMode, hwGetDevicesParameter, str);
        }
        return null;
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    @Deprecated
    public void pushFitRunCourseData(FitWorkout fitWorkout) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            deviceMgrApi.pushFitRunCourseData(fitWorkout);
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public List<DeviceInfo> getDeviceList(HwGetDevicesMode hwGetDevicesMode, HwGetDevicesParameter hwGetDevicesParameter, String str) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            return deviceMgrApi.getDeviceList(hwGetDevicesMode, hwGetDevicesParameter, str);
        }
        return null;
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    @Deprecated
    public Map<String, DeviceCapability> queryDeviceCapability(int i, String str, String str2) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            return deviceMgrApi.queryDeviceCapability(i, str, str2);
        }
        return null;
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void getDevicesFromCloud(String str, IBaseResponseCallback iBaseResponseCallback) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            deviceMgrApi.getDevicesFromCloud(str, iBaseResponseCallback);
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void sendDeviceData(int i, int i2, Map<Integer, String> map, DeviceInfo deviceInfo, String str) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            deviceMgrApi.sendDeviceData(i, i2, map, deviceInfo, str);
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public int getDeviceStateById(DeviceStateConstants deviceStateConstants, String str, String str2, String str3) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            return deviceMgrApi.getDeviceStateById(deviceStateConstants, str, str2, str3);
        }
        return -1;
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public edn getDeviceInfoUx(int i, String str) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            return deviceMgrApi.getDeviceInfoUx(i, str);
        }
        return null;
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public String getDeviceSettingItemById(HwGetSetingItemConstants hwGetSetingItemConstants, String str, String str2) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            return deviceMgrApi.getDeviceSettingItemById(hwGetSetingItemConstants, str, str2);
        }
        return "";
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void downloadDeviceResources(List<String> list, IBaseResponseCallback iBaseResponseCallback) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            deviceMgrApi.downloadDeviceResources(list, iBaseResponseCallback);
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void cancelDownloadDeviceResources() {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            deviceMgrApi.cancelDownloadDeviceResources();
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void executeDeviceRelatedLogic(ExecuteMode executeMode, ecy ecyVar, String str) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            deviceMgrApi.executeDeviceRelatedLogic(executeMode, ecyVar, str);
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void startSleepBreatheDetectionPage() {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            deviceMgrApi.startSleepBreatheDetectionPage();
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void setSleepBreatheDetectionState(boolean z, IBaseResponseCallback iBaseResponseCallback) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            deviceMgrApi.setSleepBreatheDetectionState(z, iBaseResponseCallback);
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void getSleepBreatheDetectionState(IBaseResponseCallback iBaseResponseCallback) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            deviceMgrApi.getSleepBreatheDetectionState(iBaseResponseCallback);
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public String getSwitchSetting(String str, String str2) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            return deviceMgrApi.getSwitchSetting(str, str2);
        }
        return null;
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void unPair(List<String> list, boolean z) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            deviceMgrApi.unPair(list, z);
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public int getDeviceTypeId(DeviceInfo deviceInfo) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            return deviceMgrApi.getDeviceTypeId(deviceInfo);
        }
        return 1;
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public boolean isBindPhoneService() {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            return deviceMgrApi.isBindPhoneService();
        }
        return true;
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void getHealthSwitch(List<String> list, IBaseResponseCallback iBaseResponseCallback) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            deviceMgrApi.getHealthSwitch(list, iBaseResponseCallback);
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void setHealthSwitch(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            deviceMgrApi.setHealthSwitch(jSONObject, iBaseResponseCallback);
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void getEmotionAutoMonitorSwitch(IBaseResponseCallback iBaseResponseCallback) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            deviceMgrApi.getEmotionAutoMonitorSwitch(iBaseResponseCallback);
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void getEmotionRiskWarningSwitch(IBaseResponseCallback iBaseResponseCallback) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            deviceMgrApi.getEmotionRiskWarningSwitch(iBaseResponseCallback);
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public boolean startToSyncByH5(String str) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            return deviceMgrApi.startToSyncByH5(str);
        }
        return false;
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void getStressAutoMonitorSwitch(IBaseResponseCallback iBaseResponseCallback) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            deviceMgrApi.getStressAutoMonitorSwitch(iBaseResponseCallback);
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void setEmotionRiskWarningSwitch(String str) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            deviceMgrApi.setEmotionRiskWarningSwitch(str);
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void setEmotionAutoMonitorSwitch(String str) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            deviceMgrApi.setEmotionAutoMonitorSwitch(str);
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void checkBindPhoneService() {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            deviceMgrApi.checkBindPhoneService();
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public dmx<Long> getMatterTimeInfo(DeviceInfo deviceInfo, int i) {
        return this.d.getMatterTimeInfo(deviceInfo, i);
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void setMenstrualPredictSwitch(String str) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            deviceMgrApi.setMenstrualPredictSwitch(str);
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void getMenstrualPredictSwitch(IBaseResponseCallback iBaseResponseCallback) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            deviceMgrApi.getMenstrualPredictSwitch(iBaseResponseCallback);
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public dmx<?> getCommonData(DeviceInfo deviceInfo, String str, String str2) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            return deviceMgrApi.getCommonData(deviceInfo, str, str2);
        }
        return dmx.c(ResultCodeMessage.DEVICE_MGR_API_ERROR_CODE.value(), "mDeviceMgrApi is null");
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void changeContinueMeasureHeartRateStatus(int i) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            deviceMgrApi.changeContinueMeasureHeartRateStatus(i);
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void changeCycleMeasureHeartRateStatus(int i) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            deviceMgrApi.changeCycleMeasureHeartRateStatus(i);
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void getSwitchSetting(String str, IBaseResponseCallback iBaseResponseCallback) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            deviceMgrApi.getSwitchSetting(str, iBaseResponseCallback);
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void changeHeartRateBtValue(boolean z) {
        DeviceMgrApi deviceMgrApi = this.d;
        if (deviceMgrApi != null) {
            deviceMgrApi.changeHeartRateBtValue(z);
        }
    }
}
