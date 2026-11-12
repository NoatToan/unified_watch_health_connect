package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.huawei.appgallery.agd.api.AgdConstant;
import com.huawei.datatype.RunPaceZoneConfig;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.healthdatamgr.api.HealthDataMgrApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import com.huawei.hwcommonmodel.fitnessdatatype.MotionGoal;
import com.huawei.hwcommonmodel.fitnessdatatype.StudentHeartRateZoneMgr;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.up.model.UserInfomation;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lxl {
    public static void c(Context context) {
        if (context == null) {
            LogUtil.j("HwFitnessManagerRunnable", "sendDetailSyncSuccessBroadcastToHealth context is null");
            return;
        }
        LogUtil.a("05", 1, "HwFitnessManagerRunnable", "sendDetailSyncSuccessBroadcastToHealth.");
        Intent intent = new Intent("com.huawei.health.fitness_detail_sync_success");
        intent.setPackage(BaseApplication.getContext().getPackageName());
        context.sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    public static void b(Context context) {
        if (context == null) {
            LogUtil.j("HwFitnessManagerRunnable", "sendDetailSyncFailBroadcastToHealth context is null");
            return;
        }
        LogUtil.a("05", 1, "HwFitnessManagerRunnable", "sendDetailSyncFailBroadcastToHealth.");
        Intent intent = new Intent("com.huawei.health.fitness_detail_sync_fail");
        intent.setPackage(BaseApplication.getContext().getPackageName());
        context.sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    public static void j(DeviceInfo deviceInfo) {
        LogUtil.a("05", 1, "HwFitnessManagerRunnable", "registerDeviceToHiHealth enter.");
        if (deviceInfo != null) {
            mga.h(deviceInfo);
        } else {
            LogUtil.j("HwFitnessManagerRunnable", "registerDeviceToHiHealth deviceInfo is null");
        }
    }

    public static void c(DeviceInfo deviceInfo) {
        if (deviceInfo != null && lxc.c() && lxc.a(deviceInfo.getDeviceIdentify())) {
            lxw.b(deviceInfo);
        }
    }

    public static long d(long j2) {
        String str = new SimpleDateFormat("yyyyMMdd").format(new Date(j2 * 1000));
        try {
            return new SimpleDateFormat("yyyyMMddhhmm").parse(str + AgdConstant.INSTALL_TYPE_DEFAULT).getTime() / 1000;
        } catch (ParseException e2) {
            LogUtil.e("HwFitnessManagerRunnable", "getBeginOfDate ParseException : ", ExceptionUtils.c(e2));
            return j2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004a  */
    public static boolean c(DeviceInfo deviceInfo, Context context) {
        boolean z;
        DeviceInfo deviceInfoD = mgi.d("HwFitnessManagerRunnable");
        if (deviceInfo == null && deviceInfoD == null) {
            ReleaseLogUtil.d("R_HeartRate_HwFitnessManagerRunnable", "sync data wrong, no device connected.");
        } else {
            if (deviceInfo == null || !HwVersionManager.b(BaseApplication.getContext()).m(deviceInfo.getDeviceIdentify())) {
                z = true;
                LogUtil.j("05", 1, "HwFitnessManagerRunnable", "syncFitnessDetailData is other.");
            } else {
                ReleaseLogUtil.d("R_HeartRate_HwFitnessManagerRunnable", "sync data wrong, device ota.");
            }
            if (!z) {
                b(context);
            }
            return z;
        }
        z = false;
        if (!z) {
            b(context);
        }
        return z;
    }

    public static long a(lxg lxgVar) {
        LogUtil.a("05", 1, "HwFitnessManagerRunnable", "getLastSyncTime enter.");
        return new lxj().e(lxgVar);
    }

    public static void a(long j2, lxg lxgVar) {
        LogUtil.a("HwFitnessManagerRunnable", "setLastSyncTime time :", Long.valueOf(j2));
        lxj lxjVar = new lxj();
        lyl lylVar = new lyl();
        lylVar.b(j2);
        lxjVar.b(lxgVar, lylVar);
    }

    public static void a(final UserInfomation userInfomation) {
        LogUtil.a("05", 1, "setDeviceUserInfo.");
        ((HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class)).getLastVo2maxForMaxMet(new IBaseResponseCallback() { // from class: lxl.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "HwFitnessManagerRunnable");
                if (deviceList == null || deviceList.isEmpty()) {
                    LogUtil.j("HwFitnessManagerRunnable", "setDeviceUserInfo deviceInfoList is null");
                    return;
                }
                for (int i2 = 0; i2 < deviceList.size(); i2++) {
                    DeviceInfo deviceInfo = deviceList.get(i2);
                    if (deviceInfo != null) {
                        lxl.c(obj, userInfomation, deviceInfo);
                    } else {
                        LogUtil.j("HwFitnessManagerRunnable", "ACTION_FITNESS_USERINFO_UPDATED currentInfo is null");
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Object obj, UserInfomation userInfomation, DeviceInfo deviceInfo) {
        if (obj instanceof String) {
            String str = (String) obj;
            String[] strArrSplit = str.split(Constants.LINK);
            if (strArrSplit.length < 2) {
                LogUtil.j("HwFitnessManagerRunnable", "data.length < 2");
                return;
            }
            if (str.contains(Constants.LINK)) {
                try {
                    userInfomation.setMaxVo2(Integer.parseInt(strArrSplit[1]));
                    userInfomation.setVo2Time(Long.parseLong(strArrSplit[0]) / 1000);
                } catch (NumberFormatException e2) {
                    LogUtil.e("HwFitnessManagerRunnable", "setDeviceUserInfo Exception : ", ExceptionUtils.c(e2));
                }
                LogUtil.a("HwFitnessManagerRunnable", "setDeviceUserInfo information setMaxVo2 :", strArrSplit[1], ", setVo2Time :", strArrSplit[0]);
                lxw.e(userInfomation, deviceInfo);
                lyv.c(userInfomation);
                return;
            }
            lxw.e(userInfomation, deviceInfo);
            lyv.c(userInfomation);
            LogUtil.a("HwFitnessManagerRunnable", "setDeviceUserInfo getVo2MaxValue not contains split symble.");
            return;
        }
        lxw.e(userInfomation, deviceInfo);
        lyv.c(userInfomation);
        LogUtil.j("HwFitnessManagerRunnable", "setDeviceUserInfo objectData is not string.");
    }

    public static int e(DeviceInfo deviceInfo) {
        if (deviceInfo != null) {
            return deviceInfo.getDeviceProtocol();
        }
        return -1;
    }

    public static int e() {
        int fitnessFrameType;
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC == null) {
            LogUtil.j("HwFitnessManagerRunnable", "getDeviceDataType deviceCapability is null.");
            fitnessFrameType = -1;
        } else {
            fitnessFrameType = deviceCapabilityC.getFitnessFrameType();
        }
        LogUtil.d("HwFitnessManagerRunnable", "getDeviceDataType deviceDataType :", Integer.valueOf(fitnessFrameType));
        return fitnessFrameType;
    }

    public static boolean d(DeviceInfo deviceInfo) {
        return deviceInfo != null && deviceInfo.getProductType() == 7;
    }

    public static RunPaceZoneConfig b() {
        LogUtil.a("HwFitnessManagerRunnable", "getRunPaceZoneConfig enter.");
        gzf gzfVarC = hcc.c();
        RunPaceZoneConfig runPaceZoneConfig = new RunPaceZoneConfig();
        runPaceZoneConfig.setEasyPaceZoneMinValue(gzfVarC.g());
        runPaceZoneConfig.setMarathonPaceZoneMinValue(gzfVarC.a());
        runPaceZoneConfig.setLactatePaceZoneMinValue(gzfVarC.b());
        runPaceZoneConfig.setAnaerobicPaceZoneMinValue(gzfVarC.e());
        runPaceZoneConfig.setMaxOxygenPaceZoneMinValue(gzfVarC.d());
        runPaceZoneConfig.setMaxOxygenPaceZoneMaxValue(gzfVarC.c());
        return runPaceZoneConfig;
    }

    public static void c(int i, IBaseResponseCallback iBaseResponseCallback, Context context) {
        LogUtil.a("HwFitnessManagerRunnable", "saveCoreSleepButton enable :", Integer.valueOf(i));
        lxf.d(context, i, iBaseResponseCallback);
    }

    public static void a(int i, IBaseResponseCallback iBaseResponseCallback, Context context) {
        LogUtil.a("HwFitnessManagerRunnable", "saveHeartRateButton enable :", Integer.valueOf(i));
        lxf.a(context, i, iBaseResponseCallback);
    }

    public static void b(boolean z, Context context) {
        LogUtil.a("05", 1, "HwFitnessManagerRunnable", "changeCoreSleepButtonStatusValue isEnabled: ", Boolean.valueOf(z));
        c(z ? 1 : 0, new IBaseResponseCallback() { // from class: lxl.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 0) {
                    LogUtil.a("HwFitnessManagerRunnable", "changeCoreSleepButtonStatusValue saveCoreSleepButton success.");
                    mfd.a().e();
                }
            }
        }, context);
    }

    public static void j() {
        LogUtil.a("HwFitnessManagerRunnable", "processRunPaceZoneConfig enter");
        DeviceInfo deviceInfoC = mgg.c("HwFitnessManagerRunnable");
        if (deviceInfoC == null || deviceInfoC.getDeviceConnectState() != 2) {
            LogUtil.j("HwFitnessManagerRunnable", "processRunPaceZoneConfig deviceInfo is null or disconnected.");
        } else {
            h();
        }
    }

    public static void h() {
        LogUtil.a("HwFitnessManagerRunnable", "enter setRunPaceZone");
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC == null || !deviceCapabilityC.isSupportRunPaceSetCapability()) {
            LogUtil.j("HwFitnessManagerRunnable", "run pace deviceCapability is null or not support.");
        } else {
            mit.b("HwFitnessManagerRunnable", new d());
        }
    }

    static class d implements Runnable {
        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            lxw.c(lxl.b());
        }
    }

    public static class a implements Runnable {
        private int d;
        private Object e;

        a(int i, Object obj) {
            this.d = i;
            this.e = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            LogUtil.a("05", 1, "HwFitnessManagerRunnable", "setDeviceFitnessGoal objectData :", this.e);
            if (this.d == 0) {
                Object obj = this.e;
                if (obj instanceof MotionGoal) {
                    ArrayList arrayList = new ArrayList(16);
                    arrayList.add((MotionGoal) obj);
                    lxw.b(arrayList);
                }
            }
        }
    }

    public static void d(int i, DeviceInfo deviceInfo) {
        LogUtil.a("05", 1, "HwFitnessManagerRunnable", "getHealthDataByFrame dataIndex :", Integer.valueOf(i));
        if (e() == 0) {
            lxw.a(i, deviceInfo);
        } else if (e() == 1) {
            lxw.d(i, deviceInfo);
        } else {
            LogUtil.j("HwFitnessManagerRunnable", "getHealthDataByFrame unknown type.");
        }
    }

    public static class e extends Handler {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<lxg> f41088c;

        e(lxg lxgVar, Looper looper) {
            super(looper);
            this.f41088c = new WeakReference<>(lxgVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            WeakReference<lxg> weakReference = this.f41088c;
            if (weakReference == null) {
                LogUtil.j("HwFitnessManagerRunnable", "HwFitnessManagerHandler mFitnessManager is null");
                return;
            }
            lxg lxgVar = weakReference.get();
            if (lxgVar == null) {
                LogUtil.j("HwFitnessManagerRunnable", "HwFitnessManagerHandler hwFitnessManager is null");
            } else if (lxgVar.w == null) {
                LogUtil.j("HwFitnessManagerRunnable", "HwFitnessManagerHandler mManagerHelper is null");
            } else {
                lxgVar.w.d(message);
            }
        }
    }

    public static class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private DeviceInfo f41089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IBaseResponseCallback f41090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<lxg> f41091c;

        j(lxg lxgVar, IBaseResponseCallback iBaseResponseCallback, DeviceInfo deviceInfo) {
            this.f41090b = null;
            this.f41091c = new WeakReference<>(lxgVar);
            this.f41090b = iBaseResponseCallback;
            this.f41089a = deviceInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            lxg lxgVar = this.f41091c.get();
            if (lxgVar != null) {
                lxgVar.a(this.f41090b, this.f41089a);
            }
        }
    }

    public static class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            DeviceInfo deviceInfoD;
            LogUtil.a("05", 1, "HwFitnessManagerRunnable", "SetDeviceHeartRateZoneConfigurationRunnable enter.");
            DeviceCapability deviceCapabilityC = eej.c();
            if (deviceCapabilityC == null || !deviceCapabilityC.isSupportHeartRateZone()) {
                LogUtil.j("HwFitnessManagerRunnable", "deviceCapability is null or not support.");
                return;
            }
            HealthDataMgrApi healthDataMgrApi = (HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class);
            if (healthDataMgrApi == null) {
                ReleaseLogUtil.e("R_HeartRate_HwFitnessManagerRunnable", "SetDeviceHeartRateZoneConfigurationRunnable healthDataMgrApi is null.");
                xjt.p("SetDeviceHeartRateZoneConfigurationRunnable healthDataMgrApi is null.");
                return;
            }
            HeartZoneConf heartZoneConfForBluetoothSend = healthDataMgrApi.getHeartZoneConfForBluetoothSend();
            if (heartZoneConfForBluetoothSend == null) {
                LogUtil.j("HwFitnessManagerRunnable", "timeout, object is null.");
                return;
            }
            if (lxc.e() && (deviceInfoD = mgg.d("HwFitnessManagerRunnable")) != null && lxc.a(deviceInfoD.getDeviceIdentify())) {
                LogUtil.j("HwFitnessManagerRunnable", "SetDeviceHeartRateZoneConfigurationRunnable fara is family pair mode");
            } else {
                LogUtil.d("HwFitnessManagerRunnable", "SetDeviceHeartRateZoneConfigurationRunnable hrZoneConf :", heartZoneConfForBluetoothSend);
                lxw.b(heartZoneConfForBluetoothSend, (StudentHeartRateZoneMgr) null, false);
            }
        }
    }

    public static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<lxg> f41086a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f41087c;
        private IBaseResponseCallback d;
        private DeviceInfo e;

        c(lxg lxgVar, IBaseResponseCallback iBaseResponseCallback, boolean z, DeviceInfo deviceInfo) {
            LogUtil.a("05", 1, "HwFitnessManagerRunnable", " SyncFitnessDetailDataRunnable :", Boolean.valueOf(z));
            this.f41086a = new WeakReference<>(lxgVar);
            this.d = iBaseResponseCallback;
            this.f41087c = z;
            this.e = deviceInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            lxg lxgVar = this.f41086a.get();
            if (lxgVar != null) {
                lxgVar.w.b(this.d, this.f41087c, this.e);
            }
        }
    }

    public static void c() {
        LogUtil.a("HwFitnessManagerRunnable", "Enter handleStudentInfoUpdate.");
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "HwFitnessManagerRunnable");
        if (deviceList == null || deviceList.isEmpty()) {
            return;
        }
        for (int i = 0; i < deviceList.size(); i++) {
            DeviceInfo deviceInfo = deviceList.get(i);
            if (deviceInfo != null && lxc.a(deviceInfo.getDeviceIdentify())) {
                lxw.c(lxc.b(), deviceInfo);
            }
        }
    }

    public static void d() {
        LogUtil.a("05", 1, "HwFitnessManagerRunnable", "handleUserInfoChange enter.");
        LoginInit.getInstance(BaseApplication.getContext()).getUserInfoFromDb(new IBaseResponseCallback() { // from class: lxk
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                lxl.d(i, obj);
            }
        });
    }

    static /* synthetic */ void d(int i, Object obj) {
        if (i != 0 || !(obj instanceof UserInfomation)) {
            LogUtil.j("HwFitnessManagerRunnable", "handleUserInfoChange userInfo is null");
        } else {
            LogUtil.a("HwFitnessManagerRunnable", "handleUserInfoChange getUserInfo onResponse userInfomation");
            a((UserInfomation) obj);
        }
    }

    public static void b(boolean z) {
        LogUtil.a("HwFitnessManagerRunnable", "setFitnessTemperatureControl() in isControlFlag = ", Boolean.valueOf(z));
        SharedPreferenceManager.a("fitness_module", "key_fitness_is_foreground", z);
    }

    public static boolean a() {
        DeviceInfo deviceInfoD = mgg.d("HwFitnessManagerRunnable");
        if (deviceInfoD == null) {
            LogUtil.j("HwFitnessManagerRunnable", "isSupportGoalListSync deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfoD, 137);
    }

    public static boolean a(DeviceInfo deviceInfo) {
        return eey.d(deviceInfo, 137);
    }

    public static boolean i() {
        DeviceInfo deviceInfoD = mgg.d("HwFitnessManagerRunnable");
        if (deviceInfoD != null) {
            return eey.d(deviceInfoD, 154) || eey.d(deviceInfoD, 156);
        }
        LogUtil.j("HwFitnessManagerRunnable", "isSupportSportGoalDataSync deviceInfo is null");
        return false;
    }

    public static boolean b(DeviceInfo deviceInfo) {
        return eey.d(deviceInfo, 154) || eey.d(deviceInfo, 156);
    }

    public static boolean g() {
        for (DeviceInfo deviceInfo : ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HwFitnessManagerRunnable")) {
            if (eey.d(deviceInfo, 154) || eey.d(deviceInfo, 156)) {
                return true;
            }
        }
        return false;
    }
}
