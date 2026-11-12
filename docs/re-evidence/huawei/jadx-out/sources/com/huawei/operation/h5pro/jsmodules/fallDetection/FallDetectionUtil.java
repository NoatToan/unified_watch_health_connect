package com.huawei.operation.h5pro.jsmodules.fallDetection;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.operation.h5pro.jsmodules.device.DeviceGeneralSettingManagerService;
import com.huawei.operation.h5pro.jsmodules.device.DeviceManagerService;
import defpackage.cjk;
import defpackage.ddv;
import defpackage.edc;
import defpackage.eef;
import defpackage.eeg;
import defpackage.iof;
import defpackage.njy;
import defpackage.qhq;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class FallDetectionUtil {
    private static final String H5_PATH_FOR_SOS = "#/sosHelpDetial";
    private static final String TAG = "FallDetectionUtil";
    private static final String TAG_RELEASE = "DEVMGR_FallDetectionUtil";

    public static void jumpEmergencySosH5(DeviceInfo deviceInfo) {
        ReleaseLogUtil.d(TAG_RELEASE, "jumpEmergencySosH5 is enter");
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        ddv ddvVarB = ddv.b();
        builder.addPath("#/sosHelpDetial?deviceId=" + deviceInfo.getDeviceIdentify());
        builder.addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi"));
        builder.addCustomizeJsModule("BasePairManager", BasePairManagerJsApi.class);
        builder.addCustomizeJsModule("device", ddvVarB.getCommonJsModule("device"));
        builder.setForceDarkMode(1);
        builder.setImmerse().showStatusBar();
        ddvVarB.initH5Pro();
        H5ProClient.getServiceManager().registerService(DeviceManagerService.class);
        H5ProClient.getServiceManager().registerService(DeviceGeneralSettingManagerService.class);
        H5ProClient.startH5MiniProgram(BaseApplication.getContext(), "com.huawei.health.h5.dm-ccbk", builder.build());
    }

    public static int queryEmergencyContactsNumber() {
        iof emergencyInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getEmergencyInfo();
        if (emergencyInfo == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "queryEmergencyContactsNumber emergencyInfo is null");
            return 0;
        }
        ArrayList<iof.b> arrayListA = emergencyInfo.a();
        int size = njy.e(arrayListA) ? 0 : arrayListA.size();
        ReleaseLogUtil.d(TAG_RELEASE, "queryEmergencyContactsNumber contactList is ", Integer.valueOf(size));
        return size;
    }

    public static boolean isHasPermissions(String str) {
        Map<String, Boolean> mapRequestPermissionsForSoS = cjk.a().requestPermissionsForSoS(str);
        Objects.isNull(mapRequestPermissionsForSoS);
        if (mapRequestPermissionsForSoS == null || mapRequestPermissionsForSoS.isEmpty()) {
            ReleaseLogUtil.e(TAG_RELEASE, "getPermissionsForSOS permissionMap is null");
            return false;
        }
        Stream<Boolean> stream = mapRequestPermissionsForSoS.values().stream();
        final Boolean bool = Boolean.TRUE;
        Objects.requireNonNull(bool);
        boolean zAllMatch = stream.allMatch(new Predicate() { // from class: com.huawei.operation.h5pro.jsmodules.fallDetection.FallDetectionUtil$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return bool.equals((Boolean) obj);
            }
        });
        ReleaseLogUtil.d(TAG_RELEASE, "getPermissionsForSOS permissionMap allMatch is ", Boolean.valueOf(zAllMatch));
        return zAllMatch;
    }

    public static void registerLocalBroadcast(BroadcastReceiver broadcastReceiver) {
        BroadcastManagerUtil.b(BaseApplication.getContext(), broadcastReceiver, new IntentFilter(FallDetectionConstant.ACTION_FALL_DETECTION_STATUS));
    }

    public static void unRegisterLocalBroadcast(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null) {
            BaseApplication.getContext().unregisterReceiver(broadcastReceiver);
        }
    }

    public static void getSwitchStatusFromCloud(final IBaseResponseCallback iBaseResponseCallback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(FallDetectionConstant.CONFIG_ID_STRING);
        qhq.b("9005", arrayList, new HiDataReadResultListener() { // from class: com.huawei.operation.h5pro.jsmodules.fallDetection.FallDetectionUtil.1
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                ReleaseLogUtil.d(FallDetectionUtil.TAG_RELEASE, "getSwitchStatusFromCloud errorCode: ", Integer.valueOf(i), ", data: ", obj);
                if (i != 0) {
                    iBaseResponseCallback.a(0, 0);
                    return;
                }
                if (!njy.b(obj, HiSampleConfig.class)) {
                    iBaseResponseCallback.a(0, 0);
                    ReleaseLogUtil.e(FallDetectionUtil.TAG_RELEASE, "getSwitchStatusFromCloud isListTypeMatch false");
                    return;
                }
                List list = (List) obj;
                if (njy.e(list)) {
                    iBaseResponseCallback.a(0, -1);
                    ReleaseLogUtil.e(FallDetectionUtil.TAG_RELEASE, "getSwitchStatusFromCloud list isEmpty");
                    return;
                }
                HiSampleConfig hiSampleConfig = (HiSampleConfig) list.get(0);
                if (hiSampleConfig == null) {
                    iBaseResponseCallback.a(0, 0);
                    ReleaseLogUtil.e(FallDetectionUtil.TAG_RELEASE, "getSwitchStatusFromCloud hiSampleConfig is null");
                    return;
                }
                String configData = hiSampleConfig.getConfigData();
                ReleaseLogUtil.d(FallDetectionUtil.TAG_RELEASE, "getSwitchStatusFromCloud configData is ", configData);
                FallDetectionBean fallDetectionBean = (FallDetectionBean) HiJsonUtil.d(configData, FallDetectionBean.class);
                if (fallDetectionBean == null) {
                    iBaseResponseCallback.a(0, 0);
                    ReleaseLogUtil.e(FallDetectionUtil.TAG_RELEASE, "getSwitchStatusFromCloud fallDetectionBean is null");
                } else {
                    iBaseResponseCallback.a(0, Integer.valueOf(fallDetectionBean.getFallDetectionSwitch()));
                }
            }
        });
    }

    public static boolean sendSampleConfigToDevice(boolean z, DeviceInfo deviceInfo, int i, long j) {
        eef eefVar = new eef();
        eefVar.setSrcPkgName(FallDetectionConstant.SRC_PKG_NAME);
        eefVar.setWearPkgName(FallDetectionConstant.WEAR_PKG_NAME);
        eefVar.setCommandId(1);
        eeg eegVar = new eeg();
        eegVar.b(FallDetectionConstant.CONFIG_ID);
        eegVar.b(z ? 1 : 2);
        if (z) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(FallDetectionConstant.EXTRA_FALL_DETECTION_SWITCH, i);
                jSONObject.put("timeStamp", j);
                ReleaseLogUtil.d(TAG_RELEASE, "sendSampleConfigToDevice json is ", jSONObject.toString());
                eegVar.d(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
            } catch (JSONException unused) {
                ReleaseLogUtil.a(TAG_RELEASE, "sendSampleConfigToDevice JSONException");
            }
        }
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(eegVar);
        eefVar.setConfigInfoList(arrayList);
        boolean zSendSampleConfigCommand = edc.e().sendSampleConfigCommand(deviceInfo, eefVar, TAG);
        ReleaseLogUtil.d(TAG_RELEASE, "sendSampleConfigToDevice isSendSuccess ", Boolean.valueOf(zSendSampleConfigCommand), " isSetting ", Boolean.valueOf(z));
        return zSendSampleConfigCommand;
    }
}
