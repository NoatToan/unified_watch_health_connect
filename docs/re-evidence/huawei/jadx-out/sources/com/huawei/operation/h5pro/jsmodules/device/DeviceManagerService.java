package com.huawei.operation.h5pro.jsmodules.device;

import android.content.Intent;
import android.text.TextUtils;
import com.google.gson.internal.LinkedTreeMap;
import com.huawei.devicefeature.DeviceFeatureSupportApi;
import com.huawei.health.device.api.BacklogManagerApi;
import com.huawei.health.device.api.DeviceGeneralSettingApi;
import com.huawei.health.device.callback.BackLogCallback;
import com.huawei.health.device.callback.FactoryRestCallback;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.health.h5pro.service.anotation.H5ProCallback;
import com.huawei.health.h5pro.service.anotation.H5ProMethod;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSleepType;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.beans.VersionInfoBean;
import com.huawei.operation.h5pro.jsmodules.fallDetection.FallDetectionUtil;
import com.huawei.operation.h5pro.jsmodules.gesture.SmartGestureConstant;
import com.huawei.operation.h5pro.jsmodules.gesture.SmartGestureUtil;
import defpackage.coq;
import defpackage.ecu;
import defpackage.eeq;
import defpackage.eey;
import defpackage.qqt;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@H5ProService(name = DeviceManagerService.TAG, users = {"9ea3f06fe2dea3e2c7c21ea1ba1e07c370a786c68417a4a96cb986576883e10f"})
public class DeviceManagerService {
    private static final String TAG = "DeviceManager";

    @H5ProCallback
    interface IH5ProCallback<T> {
        void onFailure(int i, String str);

        void onSuccess(T t);
    }

    @H5ProMethod(name = "getCurrentDeviceId")
    public static void getCurrentDeviceId(IH5ProCallback<String> iH5ProCallback) {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
        if (deviceInfo == null) {
            iH5ProCallback.onFailure(-1, "currentDevice is null");
            return;
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (TextUtils.isEmpty(deviceIdentify)) {
            iH5ProCallback.onFailure(-1, "deviceId is empty");
        } else {
            iH5ProCallback.onSuccess(deviceIdentify);
        }
    }

    @H5ProMethod(name = "isMcuMode")
    public static void isMcuMode(IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.a(TAG, "isMcuMode enter");
        if (iH5ProCallback == null) {
            ReleaseLogUtil.e(TAG, "isMcuMode: callback is null");
            return;
        }
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
        if (deviceInfo == null) {
            ReleaseLogUtil.e(TAG, "isMcuMode: currentDevice is null");
            iH5ProCallback.onFailure(-1, "currentDevice is null");
            return;
        }
        boolean z = deviceInfo.getPowerSaveModel() == 1;
        LogUtil.a(TAG, "isMcuMode=" + z);
        iH5ProCallback.onSuccess(Boolean.valueOf(z));
    }

    @H5ProMethod(name = "queryDeviceCapability")
    public static void queryDeviceCapability(String str, IH5ProCallback<DeviceCapability> iH5ProCallback) {
        DeviceInfo deviceInfoById = getDeviceInfoById(str);
        if (deviceInfoById == null) {
            iH5ProCallback.onFailure(-1, "currentDevice is null");
        } else if (!Objects.equals(str, deviceInfoById.getDeviceIdentify())) {
            iH5ProCallback.onFailure(-1, "currentDevice changed");
        } else {
            iH5ProCallback.onSuccess(DeviceCapability.createDeviceCapability(deviceInfoById));
        }
    }

    @H5ProMethod(name = "setGestureRecognition")
    public static void setGestureRecognition(int i, IH5ProCallback<Boolean> iH5ProCallback) {
        if (iH5ProCallback == null) {
            ReleaseLogUtil.e(TAG, "setGestureRecognition: callback is null");
            return;
        }
        LogUtil.a(TAG, "setGestureRecognition status is ", Integer.valueOf(i));
        if (1 == i || i == 0) {
            DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
            if (deviceInfo == null) {
                iH5ProCallback.onFailure(-1, "setGestureRecognition eviceInfo is null");
                return;
            }
            if (deviceInfo.getDeviceConnectState() != 2) {
                iH5ProCallback.onFailure(-1, "setGestureRecognition device is not connected.");
                return;
            }
            boolean zSendGestureCommand = SmartGestureUtil.sendGestureCommand(deviceInfo, i);
            LogUtil.a(TAG, "setGestureRecognition isSuccess: ", Boolean.valueOf(zSendGestureCommand));
            iH5ProCallback.onSuccess(Boolean.valueOf(zSendGestureCommand));
            if (zSendGestureCommand) {
                SharedPreferenceManager.a(SmartGestureConstant.MODULE_ID, SmartGestureConstant.KEY_SMART_GESTURE_SWITCH_STATUS, i == 1);
                Intent intent = new Intent();
                intent.setAction(SmartGestureConstant.ACTION_SMART_GESTURE_STATUS);
                intent.setPackage(BaseApplication.getAppPackage());
                BaseApplication.getContext().sendBroadcast(intent);
                return;
            }
            return;
        }
        iH5ProCallback.onFailure(-1, "setGestureRecognition status is error");
    }

    @H5ProMethod(name = "getListDevices")
    public static void getListDevices(IH5ProCallback<String> iH5ProCallback) {
        if (iH5ProCallback == null) {
            ReleaseLogUtil.e(TAG, "getListDevices callback is null");
            return;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, TAG);
        if (!coq.d(deviceList)) {
            ReleaseLogUtil.d(TAG, "getListDevices callback.onSuccess and deviceList.size is ", Integer.valueOf(deviceList.size()));
            iH5ProCallback.onSuccess(GsonUtil.toJson(deviceList));
        } else {
            iH5ProCallback.onFailure(-1, "getListDevices deviceList is null");
        }
    }

    @H5ProMethod(name = "jumpToPage")
    public static void jumpToPage(LinkedTreeMap<String, String> linkedTreeMap, final IH5ProCallback<Integer> iH5ProCallback) {
        LogUtil.d(TAG, "obj:", qqt.b(linkedTreeMap));
        if (linkedTreeMap == null) {
            iH5ProCallback.onFailure(-1, "param is null");
            return;
        }
        final String str = linkedTreeMap.get(RemoteMessageConst.Notification.TAG);
        String str2 = linkedTreeMap.get(MatterDataContans.KEY_MAC_ADDRESS);
        LogUtil.a(TAG, "jumpToPage tag:", str, ",deviceMac:" + CommonUtil.n(str2));
        if (TextUtils.isEmpty(str)) {
            iH5ProCallback.onFailure(-1, "param is empty");
        } else {
            ((BacklogManagerApi) Services.b("ToDoCenter", BacklogManagerApi.class)).doEventClickAction(str2, str, new BackLogCallback<Integer>() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceManagerService.1
                @Override // com.huawei.health.device.callback.BackLogCallback
                public void onSuccess(Integer num) {
                    LogUtil.a(DeviceManagerService.TAG, "jumpToPage onSuccess tag:", str);
                    iH5ProCallback.onSuccess(num);
                }

                @Override // com.huawei.health.device.callback.BackLogCallback
                public void onFailure(int i, String str3) {
                    LogUtil.j(DeviceManagerService.TAG, "jumpToPage onFailure tag:", str, ",msg:", str3);
                    iH5ProCallback.onFailure(-1, str3);
                }
            });
        }
    }

    @H5ProMethod(name = "getDeviceInfo")
    public static void getDeviceInfo(String str, IH5ProCallback<VersionInfoBean> iH5ProCallback) {
        LogUtil.d(TAG, "enter getDeviceInfo");
        DeviceInfo deviceInfo = ((DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class)).getDeviceInfo(str);
        if (deviceInfo == null) {
            iH5ProCallback.onFailure(-1, "currentDevice is null");
        } else if (!Objects.equals(str, deviceInfo.getDeviceIdentify())) {
            iH5ProCallback.onFailure(-1, "currentDevice changed");
        } else {
            iH5ProCallback.onSuccess(getVersionInfoBean(deviceInfo));
        }
    }

    @H5ProMethod(name = "queryDeviceName")
    public static void queryDeviceName(String str, IH5ProCallback<String> iH5ProCallback) {
        LogUtil.d(TAG, "enter queryDeviceName");
        DeviceInfo deviceInfoById = getDeviceInfoById(str);
        if (deviceInfoById == null) {
            iH5ProCallback.onFailure(-1, "currentDevice is null");
        } else if (!Objects.equals(str, deviceInfoById.getDeviceIdentify())) {
            iH5ProCallback.onFailure(-1, "currentDevice changed");
        } else {
            iH5ProCallback.onSuccess(deviceInfoById.getDeviceName());
        }
    }

    @H5ProMethod(name = "isSmartWatch")
    public static void isSmartWatch(String str, IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.d(TAG, "enter isSmartWatch");
        DeviceInfo deviceInfoById = getDeviceInfoById(str);
        if (deviceInfoById == null) {
            iH5ProCallback.onFailure(-1, "currentDevice is null");
        } else if (!Objects.equals(str, deviceInfoById.getDeviceIdentify())) {
            iH5ProCallback.onFailure(-1, "currentDevice changed");
        } else {
            iH5ProCallback.onSuccess(Boolean.valueOf(deviceInfoById.getSportVersion() == 1));
        }
    }

    @H5ProMethod(name = "factoryReset")
    public static void factoryReset(String str, int i, final IH5ProCallback<Number> iH5ProCallback) {
        LogUtil.d(TAG, "enter factoryReset ：", Integer.valueOf(i));
        if (i == 1 || i == 2) {
            ((DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class)).factoryReset(str, i, new FactoryRestCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceManagerService.2
                @Override // com.huawei.health.device.callback.FactoryRestCallback
                public void onSuccess(int i2) {
                    IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                    if (iH5ProCallback2 != null) {
                        iH5ProCallback2.onSuccess(Integer.valueOf(i2));
                    }
                }

                @Override // com.huawei.health.device.callback.FactoryRestCallback
                public void onFail(String str2) {
                    IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                    if (iH5ProCallback2 != null) {
                        iH5ProCallback2.onFailure(-1, str2);
                    }
                }
            });
            return;
        }
        iH5ProCallback.onFailure(-1, "factoryReset errr:" + i);
    }

    @H5ProMethod(name = "isStoreDemoPhone")
    public static void isStoreDemoPhone(IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.d(TAG, "enter isStoreDemoPhone");
        iH5ProCallback.onSuccess(Boolean.valueOf(Utils.n()));
    }

    private static VersionInfoBean getVersionInfoBean(DeviceInfo deviceInfo) {
        String certModel;
        VersionInfoBean versionInfoBean = new VersionInfoBean();
        versionInfoBean.setBtVersion(deviceInfo.getBluetoothVersion());
        versionInfoBean.setDeviceSoftVersion(deviceInfo.getDeviceOStVersion());
        versionInfoBean.setDeviceVersion(deviceInfo.getSoftVersion());
        versionInfoBean.setDeviceType(deviceInfo.getProductType());
        if (deviceInfo.getProductType() >= 34) {
            LogUtil.a(TAG, "CertModel = ", deviceInfo.getCertModel(), " DeviceModel = ", deviceInfo.getDeviceModel());
            if (TextUtils.isEmpty(deviceInfo.getCertModel())) {
                certModel = deviceInfo.getDeviceModel();
            } else {
                certModel = deviceInfo.getCertModel();
            }
            if (deviceInfo.getProductType() == 75) {
                certModel = deviceInfo.getDeviceModel();
            }
            versionInfoBean.setModel(certModel);
            String deviceSn = getDeviceSn(deviceInfo);
            if (deviceSn != null && !TextUtils.isEmpty(deviceSn.trim())) {
                versionInfoBean.setSn(deviceSn);
            }
        }
        if (deviceInfo.getProductType() != 10) {
            versionInfoBean.setBtMac(deviceInfo.getDeviceIdentify());
        }
        versionInfoBean.setProdId(deviceInfo.getProductId());
        return versionInfoBean;
    }

    private static DeviceInfo getDeviceInfoById(String str) {
        HwGetDevicesParameter hwGetDevicesParameter = new HwGetDevicesParameter();
        hwGetDevicesParameter.setDeviceIdentify(str);
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.IDENTIFY_DEVICES, hwGetDevicesParameter, TAG);
        if (coq.d(deviceList)) {
            return null;
        }
        return deviceList.get(0);
    }

    public static String getDeviceSn(DeviceInfo deviceInfo) {
        if (deviceInfo.getDeviceIdType() == 1) {
            return eeq.d(deviceInfo.getUuid());
        }
        if (deviceInfo.getDeviceIdType() == 10) {
            return deviceInfo.getUuid();
        }
        return eeq.d(deviceInfo.getUuid());
    }

    @H5ProMethod(name = "queryEmergencyContactsNumber")
    public static void queryEmergencyContactsNumber(IH5ProCallback<Number> iH5ProCallback) {
        int iQueryEmergencyContactsNumber = FallDetectionUtil.queryEmergencyContactsNumber();
        LogUtil.d(TAG, "enter queryEmergencyContactsNumber contactsNumber is ", Integer.valueOf(iQueryEmergencyContactsNumber));
        iH5ProCallback.onSuccess(Integer.valueOf(iQueryEmergencyContactsNumber));
    }

    static class DeviceCapability {
        private boolean isSupportCustomWatchFace;
        private boolean isSupportDiyStickerLayout;
        private boolean isSupportLiveVideoWindow;
        private boolean isSupportNotificationLiveLevel;
        private boolean isSupportNotificationLiveType;
        private boolean isSupportSosHelpSetting;
        private boolean isSupportWheelchairSwitch;

        private DeviceCapability() {
        }

        public boolean isSupportCustomWatchFace() {
            return this.isSupportCustomWatchFace;
        }

        public void setSupportCustomWatchFace(boolean z) {
            this.isSupportCustomWatchFace = z;
        }

        public boolean isSupportLiveVideoWindow() {
            return this.isSupportLiveVideoWindow;
        }

        public void setSupportLiveVideoWindow(boolean z) {
            this.isSupportLiveVideoWindow = z;
        }

        public boolean isSupportNotificationLiveType() {
            return this.isSupportNotificationLiveType;
        }

        public void setSupportNotificationLiveType(boolean z) {
            this.isSupportNotificationLiveType = z;
        }

        public boolean isSupportNotificationLiveLevel() {
            return this.isSupportNotificationLiveLevel;
        }

        public void setSupportNotificationLiveLevel(boolean z) {
            this.isSupportNotificationLiveLevel = z;
        }

        public boolean isSupportDiyStickerLayout() {
            return this.isSupportDiyStickerLayout;
        }

        public void setSupportDiyStickerLayout(boolean z) {
            this.isSupportDiyStickerLayout = z;
        }

        public boolean isSupportSosHelpSetting() {
            return this.isSupportSosHelpSetting;
        }

        public void setSupportSosHelpSetting(boolean z) {
            this.isSupportSosHelpSetting = z;
        }

        public boolean isSupportWheelchairSwitch() {
            return this.isSupportWheelchairSwitch;
        }

        public void setSupportWheelchairSwitch(boolean z) {
            this.isSupportWheelchairSwitch = z;
        }

        public static DeviceCapability createDeviceCapability(DeviceInfo deviceInfo) {
            DeviceCapability deviceCapability = new DeviceCapability();
            deviceCapability.isSupportCustomWatchFace = eey.d(deviceInfo, a.D);
            deviceCapability.isSupportLiveVideoWindow = eey.d(deviceInfo, FitnessSleepType.HW_FITNESS_NOON);
            deviceCapability.isSupportNotificationLiveType = eey.d(deviceInfo, 176);
            deviceCapability.isSupportNotificationLiveLevel = eey.d(deviceInfo, 219);
            deviceCapability.isSupportDiyStickerLayout = eey.d(deviceInfo, OldToNewMotionPath.SPORT_TYPE_OTHER_SPORT);
            deviceCapability.isSupportSosHelpSetting = eey.d(deviceInfo, OldToNewMotionPath.SPORT_TYPE_PINGPONG);
            DeviceFeatureSupportApi deviceFeatureSupportApi = (DeviceFeatureSupportApi) Services.d("Module_Device_Feature", DeviceFeatureSupportApi.class);
            deviceCapability.isSupportWheelchairSwitch = deviceFeatureSupportApi != null && deviceFeatureSupportApi.isSupportWheelchair(deviceInfo);
            return deviceCapability;
        }
    }

    @H5ProMethod(name = "syncEmergencyContacts")
    public static void syncEmergencyContacts(IH5ProCallback<Number> iH5ProCallback) {
        LogUtil.a(TAG, "syncEmergencyContacts");
        iH5ProCallback.onSuccess(0);
    }
}
