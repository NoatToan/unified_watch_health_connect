package com.huawei.operation.h5pro.jsmodules.device;

import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.device.api.DeviceGeneralSettingApi;
import com.huawei.health.device.callback.DeviceGeneralSettingCallback;
import com.huawei.health.h5pro.service.anotation.H5ProCallback;
import com.huawei.health.h5pro.service.anotation.H5ProMethod;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.h5pro.jsmodules.fallDetection.FallDetectionUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@H5ProService(name = DeviceGeneralSettingManagerService.TAG)
public class DeviceGeneralSettingManagerService {
    private static final int LEFT_HAND_WEAR = 1;
    private static final int RIGHT_HAND_WEAR = 0;
    private static final int SWITCH_MODE_OFF = 0;
    private static final int SWITCH_MODE_ON = 1;
    private static final String TAG = "DeviceGeneralSettingManager";
    private static final String TAG_RELEASE = "DEVMGR_DeviceGeneralSettingManager";

    @H5ProCallback
    interface IH5ProCallback<T> {
        void onFailure(int i, String str);

        void onSuccess(T t);
    }

    @H5ProMethod(name = "querySupportAutoLightScreen")
    public static void querySupportAutoLightScreen(String str, final IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.a(TAG, "enter querySupportAutoLightScreen");
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "DeviceGeneralSettingApi is null.");
            if (iH5ProCallback != null) {
                iH5ProCallback.onSuccess(false);
                return;
            }
            return;
        }
        deviceGeneralSettingApi.querySupportAutoLightScreen(str, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.1
            @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
            public void onResult(boolean z) {
                LogUtil.a(DeviceGeneralSettingManagerService.TAG, "querySupportAutoLightScreen result:", Boolean.valueOf(z));
                IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                if (iH5ProCallback2 != null) {
                    iH5ProCallback2.onSuccess(Boolean.valueOf(z));
                }
            }
        });
    }

    @H5ProMethod(name = "querySupportBluetoothOffAlert")
    public static void querySupportBluetoothOffAlert(String str, final IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.a(TAG, "enter querySupportBluetoothOffAlert");
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "DeviceGeneralSettingApi is null.");
            iH5ProCallback.onSuccess(false);
        } else {
            deviceGeneralSettingApi.querySupportBluetoothOffAlert(str, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.2
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public void onResult(boolean z) {
                    LogUtil.a(DeviceGeneralSettingManagerService.TAG, "querySupportBluetoothOffAlert result:", Boolean.valueOf(z));
                    IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                    if (iH5ProCallback2 != null) {
                        iH5ProCallback2.onSuccess(Boolean.valueOf(z));
                    }
                }
            });
        }
    }

    @H5ProMethod(name = "queryAutoLightScreenStatus")
    public static void queryAutoLightScreenStatus(String str, final IH5ProCallback<Integer> iH5ProCallback) {
        LogUtil.a(TAG, "enter queryAutoLightScreenStatus");
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "DeviceGeneralSettingApi is null.");
            iH5ProCallback.onSuccess(1);
        } else {
            deviceGeneralSettingApi.queryAutoLightScreenStatus(str, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.3
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public void onResult(boolean z) {
                    LogUtil.a(DeviceGeneralSettingManagerService.TAG, "queryAutoLightScreenStatus result:", Boolean.valueOf(z));
                    IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                    if (iH5ProCallback2 != null) {
                        iH5ProCallback2.onSuccess(Integer.valueOf(z ? 1 : 0));
                    }
                }
            });
        }
    }

    @H5ProMethod(name = "queryBluetoothOffAlertStatus")
    public static void queryBluetoothOffAlertStatus(String str, final IH5ProCallback<Integer> iH5ProCallback) {
        LogUtil.a(TAG, "enter queryBluetoothOffAlertStatus");
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "DeviceGeneralSettingApi is null.");
            iH5ProCallback.onSuccess(1);
        } else {
            deviceGeneralSettingApi.queryBluetoothOffAlertStatus(str, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.4
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public void onResult(boolean z) {
                    LogUtil.a(DeviceGeneralSettingManagerService.TAG, "queryBluetoothOffAlertStatus result:", Boolean.valueOf(z));
                    IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                    if (iH5ProCallback2 != null) {
                        iH5ProCallback2.onSuccess(Integer.valueOf(z ? 1 : 0));
                    }
                }
            });
        }
    }

    @H5ProMethod(name = "setAutoLightScreen")
    public static void setAutoLightScreen(String str, Number number, final IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.a(TAG, "enter setAutoLightScreen deviceId:", str, ",mode:" + number);
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "DeviceGeneralSettingApi is null.");
        } else {
            deviceGeneralSettingApi.setAutoLightScreen(str, Boolean.valueOf(number.intValue() == 1), new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.5
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public void onResult(boolean z) {
                    LogUtil.a(DeviceGeneralSettingManagerService.TAG, "setAutoLightScreen result:", Boolean.valueOf(z));
                    iH5ProCallback.onSuccess(Boolean.valueOf(z));
                }
            });
        }
    }

    @H5ProMethod(name = "setBluetoothOffAlert")
    public static void setBluetoothOffAlert(String str, Number number, final IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.a(TAG, "enter setAutoLightScreen deviceId:", str, ",mode:" + number);
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "DeviceGeneralSettingApi is null.");
        } else {
            deviceGeneralSettingApi.setBluetoothOffAlert(str, Boolean.valueOf(number.intValue() == 1), new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.6
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public void onResult(boolean z) {
                    LogUtil.a(DeviceGeneralSettingManagerService.TAG, "setAutoLightScreen result:", Boolean.valueOf(z));
                    iH5ProCallback.onSuccess(Boolean.valueOf(z));
                }
            });
        }
    }

    @H5ProMethod(name = "querySupportSyncWifi")
    public static void querySupportSyncWifi(String str, final IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.a(TAG, "enter querySupportSyncWifi");
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "DeviceGeneralSettingApi is null.");
            iH5ProCallback.onSuccess(false);
        } else {
            deviceGeneralSettingApi.querySupportSyncWifi(str, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.7
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public void onResult(boolean z) {
                    LogUtil.a(DeviceGeneralSettingManagerService.TAG, "querySupportSyncWifi result:", Boolean.valueOf(z));
                    IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                    if (iH5ProCallback2 != null) {
                        iH5ProCallback2.onSuccess(Boolean.valueOf(z));
                    }
                }
            });
        }
    }

    @H5ProMethod(name = "querySyncWifiConfigStatus")
    public static void querySyncWifiConfigStatus(String str, final IH5ProCallback<Integer> iH5ProCallback) {
        LogUtil.a(TAG, "enter querySyncWifiConfigStatus");
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "DeviceGeneralSettingApi is null.");
            iH5ProCallback.onSuccess(0);
        } else {
            deviceGeneralSettingApi.querySyncWifiConfigStatus(str, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.8
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public void onResult(boolean z) {
                    LogUtil.a(DeviceGeneralSettingManagerService.TAG, "querySyncWifiConfigStatus result:", Boolean.valueOf(z));
                    IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                    if (iH5ProCallback2 != null) {
                        iH5ProCallback2.onSuccess(Integer.valueOf(z ? 1 : 0));
                    }
                }
            });
        }
    }

    @H5ProMethod(name = "setSyncWifiConfigStatus")
    public static void setSyncWifiConfigStatus(String str, Number number, final IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.a(TAG, "enter setSyncWifiConfigStatus deviceId:", str, ",mode:" + number);
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "DeviceGeneralSettingApi is null.");
        } else {
            deviceGeneralSettingApi.setSyncWifiConfigStatus(str, Boolean.valueOf(number.intValue() == 1), new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.9
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public void onResult(boolean z) {
                    LogUtil.a(DeviceGeneralSettingManagerService.TAG, "setSyncWifiConfigStatus result:", Boolean.valueOf(z));
                    iH5ProCallback.onSuccess(Boolean.valueOf(z));
                }
            });
        }
    }

    @H5ProMethod(name = "querySupportNewEsim")
    public static void querySupportNewEsim(String str, final IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.a(TAG, "enter querySupportNewEsim");
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "DeviceGeneralSettingApi is null.");
            iH5ProCallback.onSuccess(false);
        } else {
            deviceGeneralSettingApi.querySupportNewEsim(str, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.10
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public void onResult(boolean z) {
                    LogUtil.a(DeviceGeneralSettingManagerService.TAG, "querySupportNewEsim result:", Boolean.valueOf(z));
                    IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                    if (iH5ProCallback2 != null) {
                        iH5ProCallback2.onSuccess(Boolean.valueOf(z));
                    }
                }
            });
        }
    }

    @H5ProMethod(name = "querySupportOtaUpdate")
    public static void querySupportOtaUpdate(String str, final IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.a(TAG, "enter querySupportOtaUpdate");
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "DeviceGeneralSettingApi is null.");
            iH5ProCallback.onSuccess(false);
        } else {
            deviceGeneralSettingApi.querySupportOtaUpdate(str, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.11
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public void onResult(boolean z) {
                    LogUtil.a(DeviceGeneralSettingManagerService.TAG, "querySupportOtaUpdate result:", Boolean.valueOf(z));
                    IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                    if (iH5ProCallback2 != null) {
                        iH5ProCallback2.onSuccess(Boolean.valueOf(z));
                    }
                }
            });
        }
    }

    @H5ProMethod(name = "querySupportDeviceInfo")
    public static void querySupportDeviceInfo(String str, final IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.a(TAG, "enter querySupportDeviceInfo");
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "DeviceGeneralSettingApi is null.");
            iH5ProCallback.onSuccess(false);
        } else {
            deviceGeneralSettingApi.querySupportDeviceInfo(str, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.12
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public void onResult(boolean z) {
                    LogUtil.a(DeviceGeneralSettingManagerService.TAG, "querySupportDeviceInfo result:", Boolean.valueOf(z));
                    IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                    if (iH5ProCallback2 != null) {
                        iH5ProCallback2.onSuccess(Boolean.valueOf(z));
                    }
                }
            });
        }
    }

    @H5ProMethod(name = "querySupportFactoryReset")
    public static void querySupportFactoryReset(String str, final IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.a(TAG, "enter querySupportFactoryReset");
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "DeviceGeneralSettingApi is null.");
            iH5ProCallback.onSuccess(false);
        } else {
            deviceGeneralSettingApi.querySupportFactoryReset(str, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.13
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public void onResult(boolean z) {
                    LogUtil.a(DeviceGeneralSettingManagerService.TAG, "querySupportFactoryReset result:", Boolean.valueOf(z));
                    IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                    if (iH5ProCallback2 != null) {
                        iH5ProCallback2.onSuccess(Boolean.valueOf(z));
                    }
                }
            });
        }
    }

    @H5ProMethod(name = "jumpWearSmartDetect")
    public static void jumpWearSmartDetect(String str, IH5ProCallback iH5ProCallback) {
        ReleaseLogUtil.d(TAG_RELEASE, "jumpWearSmartDetect");
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "DeviceGeneralSettingApi is null.");
        } else {
            deviceGeneralSettingApi.jumpWearSmartDetect(str, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.14
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public void onResult(boolean z) {
                    LogUtil.a(DeviceGeneralSettingManagerService.TAG, "querySupportFactoryReset result:", Boolean.valueOf(z));
                }
            });
        }
    }

    @H5ProMethod(name = "querySupportDetection")
    public static void querySupportDetection(Object obj, final IH5ProCallback<Boolean> iH5ProCallback) {
        String string;
        LogUtil.a(TAG, "enter querySupportDetection");
        Objects.isNull(obj);
        if (obj == null || !(obj instanceof Map)) {
            ReleaseLogUtil.d(TAG_RELEASE, "querySupportDetection params is null");
            iH5ProCallback.onSuccess(false);
            return;
        }
        Map map = (Map) obj;
        if (!map.containsKey("deviceId")) {
            string = "";
        } else {
            string = map.get("deviceId").toString();
        }
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "DeviceGeneralSettingApi is null.");
            iH5ProCallback.onSuccess(false);
        } else {
            deviceGeneralSettingApi.querySupportDetection(string, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.15
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public void onResult(boolean z) {
                    LogUtil.a(DeviceGeneralSettingManagerService.TAG, "querySupportDetection result:", Boolean.valueOf(z));
                    IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                    if (iH5ProCallback2 != null) {
                        iH5ProCallback2.onSuccess(Boolean.valueOf(z));
                    }
                }
            });
        }
    }

    @H5ProMethod(name = "pullUpAppWithWant")
    public static void pullUpAppWithWant(Object obj, final IH5ProCallback<Boolean> iH5ProCallback) {
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "DeviceGeneralSettingApi is null.");
            iH5ProCallback.onSuccess(false);
        } else {
            deviceGeneralSettingApi.pullUpAppWithWant(obj, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.16
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public void onResult(boolean z) {
                    LogUtil.a(DeviceGeneralSettingManagerService.TAG, "querySupportFactoryReset result:", Boolean.valueOf(z));
                    IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                    if (iH5ProCallback2 != null) {
                        iH5ProCallback2.onSuccess(Boolean.valueOf(z));
                    }
                }
            });
        }
    }

    @H5ProMethod(name = "querySupportServiceHotline")
    public static void querySupportServiceHotline(String str, final IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.a(TAG, "enter querySupportServiceHotline");
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "DeviceGeneralSettingApi is null.");
            iH5ProCallback.onSuccess(false);
        } else {
            deviceGeneralSettingApi.querySupportServiceHotline(str, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.17
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public void onResult(boolean z) {
                    LogUtil.a(DeviceGeneralSettingManagerService.TAG, "querySupportServiceHotline result:", Boolean.valueOf(z));
                    IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                    if (iH5ProCallback2 != null) {
                        iH5ProCallback2.onSuccess(Boolean.valueOf(z));
                    }
                }
            });
        }
    }

    @H5ProMethod(name = "querySupportMyHW")
    public static void querySupportMyHW(String str, final IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.a(TAG, "enter querySupportMyHW");
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "DeviceGeneralSettingApi is null.");
            iH5ProCallback.onSuccess(false);
        } else {
            deviceGeneralSettingApi.querySupportMyHW(str, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.18
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public void onResult(boolean z) {
                    LogUtil.a(DeviceGeneralSettingManagerService.TAG, "querySupportMyHW result:", Boolean.valueOf(z));
                    IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                    if (iH5ProCallback2 != null) {
                        iH5ProCallback2.onSuccess(Boolean.valueOf(z));
                    }
                }
            });
        }
    }

    @H5ProMethod(name = "querySupportLogFeedback")
    public static void querySupportLogFeedback(String str, final IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.a(TAG, "enter querySupportLogFeedback");
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "DeviceGeneralSettingApi is null.");
            iH5ProCallback.onSuccess(false);
        } else {
            deviceGeneralSettingApi.querySupportLogFeedback(str, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.19
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public void onResult(boolean z) {
                    LogUtil.a(DeviceGeneralSettingManagerService.TAG, "querySupportLogFeedback result:", Boolean.valueOf(z));
                    IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                    if (iH5ProCallback2 != null) {
                        iH5ProCallback2.onSuccess(Boolean.valueOf(z));
                    }
                }
            });
        }
    }

    @H5ProMethod(name = "querySupportLeftRightHandWearMode")
    public static void querySupportLeftRightHandWearMode(String str, final IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.a(TAG, "enter querySupportLeftRightHandWearMode");
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "DeviceGeneralSettingApi is null.");
            if (iH5ProCallback != null) {
                iH5ProCallback.onSuccess(false);
                return;
            }
            return;
        }
        deviceGeneralSettingApi.querySupportLeftRightHandWearMode(str, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.20
            @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
            public void onResult(boolean z) {
                LogUtil.a(DeviceGeneralSettingManagerService.TAG, "querySupportLeftRightHandWearMode result:", Boolean.valueOf(z));
                IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                if (iH5ProCallback2 != null) {
                    iH5ProCallback2.onSuccess(Boolean.valueOf(z));
                }
            }
        });
    }

    @H5ProMethod(name = "queryLeftRightHandWearModeStatus")
    public static void queryLeftRightHandWearModeStatus(String str, final IH5ProCallback<Integer> iH5ProCallback) {
        LogUtil.a(TAG, "enter queryLeftRightHandWearModeStatus");
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "DeviceGeneralSettingApi is null.");
            iH5ProCallback.onSuccess(0);
        } else {
            deviceGeneralSettingApi.queryLeftRightHandWearModeStatus(str, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.21
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public void onResult(boolean z) {
                    LogUtil.a(DeviceGeneralSettingManagerService.TAG, "queryLeftRightHandWearModeStatus result:", Boolean.valueOf(z));
                    IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                    if (iH5ProCallback2 != null) {
                        iH5ProCallback2.onSuccess(Integer.valueOf(z ? 1 : 0));
                    }
                }
            });
        }
    }

    @H5ProMethod(name = "setLeftRightHandWearMode")
    public static void setLeftRightHandWearMode(String str, Number number, final IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.a(TAG, "enter setLeftRightHandWearMode deviceId:", str, ",mode:" + number);
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "DeviceGeneralSettingApi is null.");
        } else {
            deviceGeneralSettingApi.setLeftRightHandWearMode(str, Boolean.valueOf(number.intValue() == 1), new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.22
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public void onResult(boolean z) {
                    LogUtil.a(DeviceGeneralSettingManagerService.TAG, "setLeftRightHandWearMode result:", Boolean.valueOf(z));
                    iH5ProCallback.onSuccess(Boolean.valueOf(z));
                }
            });
        }
    }

    @H5ProMethod(name = "querySupportRotateSwitchScreen")
    public static void querySupportRotateSwitchScreen(String str, final IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.a(TAG, "enter querySupportRotateSwitchScreen");
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "DeviceGeneralSettingApi is null.");
            if (iH5ProCallback != null) {
                iH5ProCallback.onSuccess(false);
                return;
            }
            return;
        }
        deviceGeneralSettingApi.querySupportRotateSwitchScreen(str, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.23
            @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
            public void onResult(boolean z) {
                LogUtil.a(DeviceGeneralSettingManagerService.TAG, "querySupportRotateSwitchScreen result:", Boolean.valueOf(z));
                IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                if (iH5ProCallback2 != null) {
                    iH5ProCallback2.onSuccess(Boolean.valueOf(z));
                }
            }
        });
    }

    @H5ProMethod(name = "queryRotateSwitchScreenStatus")
    public static void queryRotateSwitchScreenStatus(String str, final IH5ProCallback<Integer> iH5ProCallback) {
        LogUtil.a(TAG, "enter queryRotateSwitchScreenStatus");
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "DeviceGeneralSettingApi is null.");
            iH5ProCallback.onSuccess(0);
        } else {
            deviceGeneralSettingApi.queryRotateSwitchScreenStatus(str, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.24
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public void onResult(boolean z) {
                    LogUtil.a(DeviceGeneralSettingManagerService.TAG, "queryRotateSwitchScreenStatus result:", Boolean.valueOf(z));
                    IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                    if (iH5ProCallback2 != null) {
                        iH5ProCallback2.onSuccess(Integer.valueOf(z ? 1 : 0));
                    }
                }
            });
        }
    }

    @H5ProMethod(name = "setRotateSwitchScreen")
    public static void setRotateSwitchScreen(String str, Number number, final IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.a(TAG, "enter setRotateSwitchScreen deviceId:", str, ",mode:" + number);
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "DeviceGeneralSettingApi is null.");
        } else {
            deviceGeneralSettingApi.setRotateSwitchScreen(str, Boolean.valueOf(number.intValue() == 1), new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.25
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public void onResult(boolean z) {
                    LogUtil.a(DeviceGeneralSettingManagerService.TAG, "setRotateSwitchScreen result:", Boolean.valueOf(z));
                    iH5ProCallback.onSuccess(Boolean.valueOf(z));
                }
            });
        }
    }

    @H5ProMethod(name = "querySupportNoDisturb")
    public static void querySupportNoDisturb(String str, final IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.a(TAG, "enter querySupportNoDisturb");
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "DeviceGeneralSettingApi is null.");
            if (iH5ProCallback != null) {
                iH5ProCallback.onSuccess(false);
                return;
            }
            return;
        }
        deviceGeneralSettingApi.querySupportNoDisturb(str, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.26
            @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
            public void onResult(boolean z) {
                LogUtil.a(DeviceGeneralSettingManagerService.TAG, "querySupportNoDisturb result:", Boolean.valueOf(z));
                IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                if (iH5ProCallback2 != null) {
                    iH5ProCallback2.onSuccess(Boolean.valueOf(z));
                }
            }
        });
    }

    @H5ProMethod(name = "queryNoDisturbStatus")
    public static void queryNoDisturbStatus(String str, final IH5ProCallback<Integer> iH5ProCallback) {
        LogUtil.a(TAG, "enter queryNoDisturbStatus");
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "DeviceGeneralSettingApi is null.");
            iH5ProCallback.onSuccess(0);
        } else {
            deviceGeneralSettingApi.queryNoDisturbStatus(str, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.27
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public void onResult(boolean z) {
                    LogUtil.a(DeviceGeneralSettingManagerService.TAG, "queryNoDisturbStatus result:", Boolean.valueOf(z));
                    IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                    if (iH5ProCallback2 != null) {
                        iH5ProCallback2.onSuccess(Integer.valueOf(z ? 1 : 0));
                    }
                }
            });
        }
    }

    @H5ProMethod(name = "querySupportCustomBand")
    public static void querySupportCustomBand(String str, final IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.a(TAG, "enter querySupportCustomBand");
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "DeviceGeneralSettingApi is null.");
            if (iH5ProCallback != null) {
                iH5ProCallback.onSuccess(false);
                return;
            }
            return;
        }
        deviceGeneralSettingApi.querySupportCustomBand(str, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.28
            @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
            public void onResult(boolean z) {
                LogUtil.a(DeviceGeneralSettingManagerService.TAG, "querySupportCustomBand result:", Boolean.valueOf(z));
                IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                if (iH5ProCallback2 != null) {
                    iH5ProCallback2.onSuccess(Boolean.valueOf(z));
                }
            }
        });
    }

    @H5ProMethod(name = "querySupportDoublePhone")
    public static void querySupportDoublePhone(String str, final IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.a(TAG, "enter querySupportDoublePhone");
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "DeviceGeneralSettingApi is null.");
            if (iH5ProCallback != null) {
                iH5ProCallback.onSuccess(false);
                return;
            }
            return;
        }
        deviceGeneralSettingApi.querySupportDoublePhone(str, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.29
            @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
            public void onResult(boolean z) {
                LogUtil.a(DeviceGeneralSettingManagerService.TAG, "querySupportDoublePhone result:", Boolean.valueOf(z));
                IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                if (iH5ProCallback2 != null) {
                    iH5ProCallback2.onSuccess(Boolean.valueOf(z));
                }
            }
        });
    }

    @H5ProMethod(name = "querySupportDiagnosticAnalysis")
    public static void querySupportDiagnosticAnalysis(String str, final IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.a(TAG, "enter querySupportDiagnosticAnalysis");
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "querySupportDiagnosticAnalysis is null.");
            if (iH5ProCallback != null) {
                iH5ProCallback.onSuccess(false);
                return;
            }
            return;
        }
        deviceGeneralSettingApi.querySupportDiagnosticAnalysis(str, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.30
            @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
            public void onResult(boolean z) {
                LogUtil.a(DeviceGeneralSettingManagerService.TAG, "querySupportDiagnosticAnalysis result:", Boolean.valueOf(z));
                IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                if (iH5ProCallback2 != null) {
                    iH5ProCallback2.onSuccess(Boolean.valueOf(z));
                }
            }
        });
    }

    @H5ProMethod(name = "queryFallDetectionStatus")
    public static void queryFallDetectionStatus(String str, final IH5ProCallback<Number> iH5ProCallback) {
        FallDetectionUtil.getSwitchStatusFromCloud(new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService$$ExternalSyntheticLambda1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                DeviceGeneralSettingManagerService.lambda$queryFallDetectionStatus$0(iH5ProCallback, i, obj);
            }
        });
    }

    static /* synthetic */ void lambda$queryFallDetectionStatus$0(IH5ProCallback iH5ProCallback, int i, Object obj) {
        LogUtil.a(TAG, "queryFallDetectionStatus objData:", obj);
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            iH5ProCallback.onSuccess(Integer.valueOf(num.intValue() != 1 ? 0 : 1));
            LogUtil.a(TAG, "queryFallDetectionStatus switchStatus:", num);
        }
    }

    @H5ProMethod(name = "setFallDetection")
    public static void setFallDetection(String str, Number number, IH5ProCallback iH5ProCallback) {
        LogUtil.a(TAG, "setFallDetection mode:", number);
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.a(TAG, "setFallDetection api is null");
        } else {
            deviceGeneralSettingApi.setFallDetection(str, number.intValue(), new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService$$ExternalSyntheticLambda0
                @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
                public final void onResult(boolean z) {
                    LogUtil.a(DeviceGeneralSettingManagerService.TAG, "setFallDetection isSuccess is ", Boolean.valueOf(z));
                }
            });
        }
    }

    @H5ProMethod(name = "querySupportBetaFeedback")
    public static void querySupportBetaFeedback(String str, final IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.a(TAG, "enter querySupportBetaFeedback");
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "querySupportBetaFeedback is null.");
            if (iH5ProCallback != null) {
                iH5ProCallback.onSuccess(false);
                return;
            }
            return;
        }
        deviceGeneralSettingApi.querySupportBetaFeedback(str, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.31
            @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
            public void onResult(boolean z) {
                LogUtil.a(DeviceGeneralSettingManagerService.TAG, "querySupportBetaFeedback result:", Boolean.valueOf(z));
                IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                if (iH5ProCallback2 != null) {
                    iH5ProCallback2.onSuccess(Boolean.valueOf(z));
                }
            }
        });
    }

    @H5ProMethod(name = "querySupportHonorPrivacy")
    public static void querySupportHonorPrivacy(String str, final IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.a(TAG, "enter querySupportHonorPrivacy");
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "querySupportHonorPrivacy is null.");
            if (iH5ProCallback != null) {
                iH5ProCallback.onSuccess(false);
                return;
            }
            return;
        }
        deviceGeneralSettingApi.querySupportHonorPrivacy(str, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.32
            @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
            public void onResult(boolean z) {
                LogUtil.a(DeviceGeneralSettingManagerService.TAG, "querySupportHonorPrivacy result:", Boolean.valueOf(z));
                IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                if (iH5ProCallback2 != null) {
                    iH5ProCallback2.onSuccess(Boolean.valueOf(z));
                }
            }
        });
    }

    @H5ProMethod(name = "querySupportLiveWindow")
    public static void querySupportLiveWindow(String str, final IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.a(TAG, "enter querySupportLiveWindow");
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "querySupportLiveWindow api is null.");
            if (iH5ProCallback != null) {
                iH5ProCallback.onSuccess(false);
                return;
            }
            return;
        }
        deviceGeneralSettingApi.querySupportLiveWindow(str, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.33
            @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
            public void onResult(boolean z) {
                LogUtil.a(DeviceGeneralSettingManagerService.TAG, "querySupportLiveWindow result:", Boolean.valueOf(z));
                IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                if (iH5ProCallback2 != null) {
                    iH5ProCallback2.onSuccess(Boolean.valueOf(z));
                }
            }
        });
    }

    @H5ProMethod(name = "querySupportScreenshotSetting")
    public static void querySupportScreenshotSetting(String str, final IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.a(TAG, "enter querySupportScreenshotSetting");
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "querySupportScreenshotSetting is null.");
            if (iH5ProCallback != null) {
                iH5ProCallback.onSuccess(false);
                return;
            }
            return;
        }
        deviceGeneralSettingApi.querySupportScreenshotSetting(str, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.34
            @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
            public void onResult(boolean z) {
                LogUtil.a(DeviceGeneralSettingManagerService.TAG, "querySupportScreenshotSetting result:", Boolean.valueOf(z));
                IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                if (iH5ProCallback2 != null) {
                    iH5ProCallback2.onSuccess(Boolean.valueOf(z));
                }
            }
        });
    }

    @H5ProMethod(name = "getDeviceShape")
    public static void getDeviceShape(String str, final IH5ProCallback<Number> iH5ProCallback) {
        LogUtil.a(TAG, "enter getDeviceShape");
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        final int i = -1;
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "getDeviceShape api is null.");
            if (iH5ProCallback != null) {
                iH5ProCallback.onSuccess(-1);
                return;
            }
            return;
        }
        deviceGeneralSettingApi.getDeviceShape(str, new ResultCallback<Number>() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.35
            @Override // com.huawei.networkclient.ResultCallback
            public void onSuccess(Number number) {
                LogUtil.j(DeviceGeneralSettingManagerService.TAG, "getDeviceShape onSuccess:", number);
                iH5ProCallback.onSuccess(number);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.j(DeviceGeneralSettingManagerService.TAG, "getDeviceShape onFailure:", ExceptionUtils.c(th));
                iH5ProCallback.onSuccess(Integer.valueOf(i));
            }
        });
    }

    @H5ProMethod(name = "isHonorDevice")
    public static void isHonorDevice(String str, final IH5ProCallback<Boolean> iH5ProCallback) {
        LogUtil.a(TAG, "enter isHonorDevice");
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi == null) {
            LogUtil.j(TAG, "isHonorDevice api is null.");
            if (iH5ProCallback != null) {
                iH5ProCallback.onSuccess(false);
                return;
            }
            return;
        }
        deviceGeneralSettingApi.isHonorDevice(str, new DeviceGeneralSettingCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService.36
            @Override // com.huawei.health.device.callback.DeviceGeneralSettingCallback
            public void onResult(boolean z) {
                LogUtil.a(DeviceGeneralSettingManagerService.TAG, "isHonorDevice result:", Boolean.valueOf(z));
                IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                if (iH5ProCallback2 != null) {
                    iH5ProCallback2.onSuccess(Boolean.valueOf(z));
                }
            }
        });
    }
}
