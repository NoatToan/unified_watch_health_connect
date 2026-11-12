package com.huawei.hwdevice.outofprocess.impl;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.health.devicemgr.api.DeviceMgrApi;
import com.huawei.health.devicemgr.api.constant.DataCallbackType;
import com.huawei.health.devicemgr.api.constant.DeviceStateConstants;
import com.huawei.health.devicemgr.api.constant.ExecuteMode;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.api.constant.HwGetSetingItemConstants;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.outofprocess.impl.DeviceMgrImpl;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import defpackage.dmx;
import defpackage.ecy;
import defpackage.edb;
import defpackage.edn;
import defpackage.lug;
import defpackage.lvb;
import defpackage.lvi;
import defpackage.lvl;
import defpackage.lwr;
import defpackage.lwt;
import defpackage.lwz;
import defpackage.lxg;
import defpackage.lxw;
import defpackage.lys;
import defpackage.lza;
import defpackage.med;
import defpackage.mel;
import defpackage.mes;
import defpackage.mev;
import defpackage.mfb;
import defpackage.mfy;
import defpackage.mga;
import defpackage.mgd;
import defpackage.mgg;
import defpackage.mgj;
import defpackage.mgt;
import defpackage.mhs;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentUtils;
import health.compact.a.ProcessUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes38.dex */
public class DeviceMgrImpl implements DeviceMgrApi {
    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void registerDataCallback(IBaseResponseCallback iBaseResponseCallback, DataCallbackType dataCallbackType, String str) {
        LogUtil.a("DeviceMgrImpl", "registerDataCallback DeviceMgrImpl tag:", str);
        if (dataCallbackType == DataCallbackType.FITNESS_POSTURE_MANAGER) {
            lys.b(BaseApplication.getContext()).d(iBaseResponseCallback);
            return;
        }
        if (dataCallbackType == DataCallbackType.EXERCISE_ADVICE_MANAGER) {
            lwz.e().c(iBaseResponseCallback);
            return;
        }
        if (dataCallbackType == DataCallbackType.DEVICE_FONT_MANAGER) {
            lza.d().b(iBaseResponseCallback);
        } else if (dataCallbackType == DataCallbackType.SUGGESTION_AIDL) {
            lug.i();
        } else {
            LogUtil.a("DeviceMgrImpl", "registerDataCallback The type does not match tag:", str);
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void unregisterDataCallback(int i) {
        if (i == 0) {
            lys.b(BaseApplication.getContext()).e();
        } else if (i == 1) {
            lwz.e().d();
        } else {
            LogUtil.a("DeviceMgrImpl", "unregisterDataCallback The type does not match");
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void pushFitRunCourseData(FitWorkout fitWorkout) {
        lwz.e().d(fitWorkout);
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public DeviceInfo getDeviceInfo(GetDeviceInfoMode getDeviceInfoMode, HwGetDevicesParameter hwGetDevicesParameter, String str) {
        LogUtil.a("DeviceMgrImpl", "getDeviceInfo, mode:", getDeviceInfoMode, " , tag: ", str);
        if (getDeviceInfoMode == GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70) {
            return mgg.d(str);
        }
        if (getDeviceInfoMode == GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70) {
            return mgg.c(str);
        }
        LogUtil.a("DeviceMgrImpl", "getDeviceInfo not support:", getDeviceInfoMode, " , tag: ", str);
        return null;
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public List<DeviceInfo> getDeviceList(HwGetDevicesMode hwGetDevicesMode, HwGetDevicesParameter hwGetDevicesParameter, String str) {
        LogUtil.a("DeviceMgrImpl", "getDeviceList, mode: ", hwGetDevicesMode, " , tag: ", str);
        if (EnvironmentUtils.e()) {
            return edb.d().getDeviceList(hwGetDevicesMode, hwGetDevicesParameter, str);
        }
        return lvb.e().a(hwGetDevicesMode, hwGetDevicesParameter, str);
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public Map<String, DeviceCapability> queryDeviceCapability(int i, String str, String str2) {
        LogUtil.a("DeviceMgrImpl", "queryDeviceCapability, queryType: ", Integer.valueOf(i), " , tag: ", str2);
        return lvb.e().d(i, str, str2);
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void getDevicesFromCloud(String str, IBaseResponseCallback iBaseResponseCallback) {
        mel.e().d(str, iBaseResponseCallback);
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void sendDeviceData(int i, int i2, Map<Integer, String> map, DeviceInfo deviceInfo, String str) {
        LogUtil.a("DeviceMgrImpl", "sendDeviceData serviceID:", Integer.valueOf(i), ", commandId:", Integer.valueOf(i2), " from :", str);
        if (i == 7) {
            lxw.b(i2, map, deviceInfo);
        }
        if (i == 36 && i2 == 12 && map != null) {
            lys.b(BaseApplication.getContext()).a(CommonUtil.v(map.get(1)), CommonUtil.v(map.get(2)));
        }
        if (i == 36 && ((i2 == 7 || i2 == 5) && map != null)) {
            lys.b(BaseApplication.getContext()).a(i2, CommonUtil.v(map.get(1)), CommonUtil.v(map.get(2)));
        }
        if (i == 1 && i2 == 33) {
            mes.b().e(deviceInfo);
        }
        if (i == 1 && i2 == 8) {
            mev.d().b(deviceInfo.getDeviceIdentify());
        }
        if (i == 22 && i2 == 12) {
            lwz.e().c();
        }
        if (i == 12 && i2 == 2) {
            lza.d().a();
        }
        if (i == 5055 && i2 == 900100001) {
            lwt.d().c(deviceInfo, null, str);
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public int getDeviceStateById(DeviceStateConstants deviceStateConstants, String str, String str2, String str3) {
        LogUtil.a("DeviceMgrImpl", "getDeviceStateById: type: ", deviceStateConstants.name(), " mac: ", CommonUtil.n(str), " , tag: ", str3);
        int i = AnonymousClass3.f17409c[deviceStateConstants.ordinal()];
        if (i == 1) {
            return mgt.b(str);
        }
        if (i == 2) {
            return lwr.e().e(str);
        }
        if (i != 3) {
            return -1;
        }
        lvi.c(str2);
        return -1;
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public edn getDeviceInfoUx(int i, String str) {
        LogUtil.a("DeviceMgrImpl", "getDeviceInfoUx: type: ", Integer.valueOf(i), " , tag: ", str);
        return lvi.a(i);
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public String getDeviceSettingItemById(HwGetSetingItemConstants hwGetSetingItemConstants, String str, String str2) {
        LogUtil.a("DeviceMgrImpl", "getDeviceSettingItemById: deviceIdentify: ", CommonUtil.n(str), " , tag: ", str2);
        if (hwGetSetingItemConstants == HwGetSetingItemConstants.RIM_SIZE) {
            return med.c().d(str);
        }
        return "";
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void downloadDeviceResources(List<String> list, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("DeviceMgrImpl", "downloadDeviceResources");
        ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).downloadIndexByUuidList(list, new c(iBaseResponseCallback));
    }

    static class c implements DownloadDeviceInfoCallBack {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final IBaseResponseCallback f17410a;

        public c(IBaseResponseCallback iBaseResponseCallback) {
            this.f17410a = iBaseResponseCallback;
        }

        @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack
        public void onSuccess() {
            LogUtil.a("DeviceMgrImpl", "downloadDeviceResources onSuccess");
            this.f17410a.a(0, null);
        }

        @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack
        public void onFailure(int i) {
            LogUtil.a("DeviceMgrImpl", "downloadDeviceResources onFailure status = ", Integer.valueOf(i));
            this.f17410a.a(i, null);
        }

        @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack
        public void netWorkError() {
            LogUtil.a("DeviceMgrImpl", "downloadDeviceResources netWorkError");
        }

        @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack
        public void onDownload(int i) {
            this.f17410a.a(20000, Integer.valueOf(i));
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void cancelDownloadDeviceResources() {
        LogUtil.a("DeviceMgrImpl", "cancelDownloadDeviceResources");
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void executeDeviceRelatedLogic(ExecuteMode executeMode, ecy ecyVar, String str) {
        LogUtil.a("DeviceMgrImpl", "executeDeviceRelatedLogic mode:", executeMode, " param:", ecyVar == null ? "" : ecyVar.toString(), " , tag: ", str);
        int i = AnonymousClass3.f17408a[executeMode.ordinal()];
        if (i == 1) {
            mfy.b(2, false);
            return;
        }
        if (i == 2) {
            lvb.e().f();
            return;
        }
        if (i == 3) {
            d(ecyVar, str);
            return;
        }
        if (i == 4) {
            if (ecyVar == null || TextUtils.isEmpty(ecyVar.b())) {
                return;
            }
            a(ecyVar.b(), str);
            return;
        }
        LogUtil.a("DeviceMgrImpl", "executeDeviceRelatedLogic no suport mode:", executeMode, " , tag: ", str);
    }

    /* JADX INFO: renamed from: com.huawei.hwdevice.outofprocess.impl.DeviceMgrImpl$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17408a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f17409c;

        static {
            int[] iArr = new int[ExecuteMode.values().length];
            f17408a = iArr;
            try {
                iArr[ExecuteMode.CLEAR_AM_16_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17408a[ExecuteMode.FORCE_INIT_PHONE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17408a[ExecuteMode.NOTIFY_SEIZE_DEVICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17408a[ExecuteMode.NOTIFY_CONNECT_DEVICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[DeviceStateConstants.values().length];
            f17409c = iArr2;
            try {
                iArr2[DeviceStateConstants.BATTERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17409c[DeviceStateConstants.WEAR_PLACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17409c[DeviceStateConstants.GET_BT_TYPE_BY_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void unPair(List<String> list, boolean z) {
        try {
            lvb.e().d(list, z);
        } catch (RemoteException unused) {
            LogUtil.j("DeviceMgrImpl", "unPair RemoteException ");
        }
    }

    private void d(ecy ecyVar, String str) {
        if (ecyVar == null) {
            LogUtil.j("DeviceMgrImpl", "notifySeizeDevice param is null.");
            return;
        }
        LogUtil.a("DeviceMgrImpl", "notifySeizeDevice set device enable.");
        List<DeviceInfo> deviceList = getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, str);
        for (DeviceInfo deviceInfo : deviceList) {
            if (deviceInfo != null && deviceInfo.getDeviceIdentify().contains(ecyVar.b())) {
                deviceInfo.setDeviceActiveState(1);
                deviceInfo.setDeviceConnectState(1);
            }
        }
        lvl.a(deviceList, ecyVar.b());
    }

    private void a(String str, String str2) {
        LogUtil.a("DeviceMgrImpl", "connectParts enter,", " , tag: ", str2);
        List<DeviceInfo> deviceList = getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, str2);
        if (deviceList == null || deviceList.size() == 0) {
            LogUtil.j("DeviceMgrImpl", "deviceInfoList is invalid.", Boolean.valueOf(deviceList == null), " , tag: ", str2);
            return;
        }
        for (DeviceInfo deviceInfo : deviceList) {
            if (str.equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
                LogUtil.a("DeviceMgrImpl", "connectParts connectState: ", Integer.valueOf(deviceInfo.getDeviceConnectState()), " , tag: ", str2);
                if (deviceInfo.getDeviceConnectState() != 2) {
                    try {
                        lvb.e().d(deviceList, str);
                        return;
                    } catch (RemoteException unused) {
                        LogUtil.a("DeviceMgrImpl", "executeDeviceRelatedLogic NOTIFY_CONNECT_DEVICE RemoteException. ", str2);
                        return;
                    }
                }
            }
        }
        LogUtil.a("DeviceMgrImpl", "connectParts end,", " , tag: ", str2);
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void startSleepBreatheDetectionPage() {
        BaseApplication.getActivity().runOnUiThread(new Runnable() { // from class: mgy
            @Override // java.lang.Runnable
            public final void run() {
                DeviceMgrImpl.c();
            }
        });
    }

    public static /* synthetic */ void c() {
        try {
            ReleaseLogUtil.c("R_DeviceMgrImpl", "startSleepBreatheDetectionPage runOnUiThread");
            Intent intent = new Intent();
            intent.setClassName(BaseApplication.getContext(), "com.huawei.ui.device.activity.sleepbreathe.SleepBreatheActivity");
            intent.setFlags(268435456);
            BaseApplication.getContext().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("DeviceMgrImpl", "startSleepBreatheDetectionPage ActivityNotFoundException.");
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void setSleepBreatheDetectionState(boolean z, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("DeviceMgrImpl", "isChecked ", Boolean.valueOf(z));
        mhs.a().setSwitchSetting("sleep_breathe_key", String.valueOf(z), new IBaseResponseCallback() { // from class: mgv
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                DeviceMgrImpl.d(iBaseResponseCallback, i, obj);
            }
        });
    }

    public static /* synthetic */ void d(IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
        LogUtil.a("DeviceMgrImpl", "setSleepBreatheDetectionState, errorCode: ", Integer.valueOf(i));
        iBaseResponseCallback.a(i, null);
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void getSleepBreatheDetectionState(final IBaseResponseCallback iBaseResponseCallback) {
        mhs.a().getSwitchSetting("sleep_breathe_key", new IBaseResponseCallback() { // from class: mgw
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                DeviceMgrImpl.a(iBaseResponseCallback, i, obj);
            }
        });
    }

    public static /* synthetic */ void a(IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
        LogUtil.a("DeviceMgrImpl", " getSleepBreatheDetectionState, errorCode = ", Integer.valueOf(i));
        if (i == 0 && "1".equals(obj)) {
            obj = "true";
        }
        iBaseResponseCallback.a(i, obj);
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public String getSwitchSetting(String str, String str2) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final String[] strArr = {""};
        mhs.a().getSwitchSetting(str2, str, new IBaseResponseCallback() { // from class: mgx
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                DeviceMgrImpl.e(strArr, countDownLatch, i, obj);
            }
        });
        try {
            LogUtil.a("DeviceMgrImpl", "getSwitchSetting isSuccess:", Boolean.valueOf(countDownLatch.await(3L, TimeUnit.SECONDS)));
        } catch (InterruptedException unused) {
            LogUtil.e("DeviceMgrImpl", "getSwitchSetting InterruptedException");
        }
        return strArr[0];
    }

    public static /* synthetic */ void e(String[] strArr, CountDownLatch countDownLatch, int i, Object obj) {
        LogUtil.a("DeviceMgrImpl", "getSwitchSetting onResponse errorCode:", Integer.valueOf(i), ", objData:", obj);
        if (i == 0 && (obj instanceof String)) {
            strArr[0] = (String) obj;
        }
        countDownLatch.countDown();
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public int getDeviceTypeId(DeviceInfo deviceInfo) {
        HiDeviceInfo hiDeviceInfoE = mga.e(deviceInfo);
        if (hiDeviceInfoE != null) {
            return hiDeviceInfoE.getDeviceType();
        }
        return 1;
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public boolean isBindPhoneService() {
        return lug.c() != null;
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void getHealthSwitch(List<String> list, IBaseResponseCallback iBaseResponseCallback) {
        mfb.b(list, iBaseResponseCallback);
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void setHealthSwitch(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        mfb.c(jSONObject, iBaseResponseCallback);
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void getEmotionAutoMonitorSwitch(IBaseResponseCallback iBaseResponseCallback) {
        mgd.b(iBaseResponseCallback);
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void getStressAutoMonitorSwitch(IBaseResponseCallback iBaseResponseCallback) {
        mgd.c(iBaseResponseCallback);
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void setEmotionAutoMonitorSwitch(String str) {
        mgd.e(str);
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void checkBindPhoneService() {
        if (isBindPhoneService()) {
            return;
        }
        if (ProcessUtil.b()) {
            lug.e(BaseApplication.getContext());
        } else {
            LogUtil.j("DeviceMgrImpl", "checkBindPhoneService failed");
        }
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void setEmotionRiskWarningSwitch(String str) {
        mgd.b(str);
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void getEmotionRiskWarningSwitch(IBaseResponseCallback iBaseResponseCallback) {
        mgd.a(iBaseResponseCallback);
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public boolean startToSyncByH5(String str) {
        return lvb.e().b("dic_sync", mgg.d("DeviceMgrImpl"), 0, str);
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public dmx<Long> getMatterTimeInfo(DeviceInfo deviceInfo, int i) {
        return lvb.e().d(deviceInfo, i);
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void setMenstrualPredictSwitch(String str) {
        mgj.a(str);
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void getMenstrualPredictSwitch(IBaseResponseCallback iBaseResponseCallback) {
        mgj.a(iBaseResponseCallback);
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public dmx<?> getCommonData(DeviceInfo deviceInfo, String str, String str2) {
        return lvb.e().e(deviceInfo, str, str2);
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void changeContinueMeasureHeartRateStatus(int i) {
        lxg.c(BaseApplication.getContext()).c(i);
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void changeCycleMeasureHeartRateStatus(int i) {
        lxg.c(BaseApplication.getContext()).d(i);
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void getSwitchSetting(String str, IBaseResponseCallback iBaseResponseCallback) {
        mhs.a().getSwitchSetting(str, iBaseResponseCallback);
    }

    @Override // com.huawei.health.devicemgr.api.DeviceMgrApi
    public void changeHeartRateBtValue(boolean z) {
        lxg.c(BaseApplication.getContext()).c(z);
    }
}
