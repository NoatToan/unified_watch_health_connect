package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.appgallery.agd.api.AgdConstant;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class mpz {

    public static class d extends Handler {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<mpg> f42160c;

        public d(mpg mpgVar, Looper looper) {
            super(looper);
            this.f42160c = new WeakReference<>(mpgVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            WeakReference<mpg> weakReference = this.f42160c;
            if (weakReference == null) {
                LogUtil.j("HwBasicDataUtil", "HwFitnessManagerHandler mFitnessManager is null");
                return;
            }
            mpg mpgVar = weakReference.get();
            if (mpgVar == null) {
                LogUtil.j("HwBasicDataUtil", "HwFitnessManagerHandler hwFitnessManager is null");
            } else if (mpgVar.n == null) {
                LogUtil.j("HwBasicDataUtil", "HwFitnessManagerHandler mManagerHelper is null");
            } else {
                mpgVar.n.e(message);
            }
        }
    }

    public static boolean d() {
        int iE = CommonUtil.e(new SimpleDateFormat("HH").format(new Date()), -1);
        return iE >= 0 && iE < 6;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    public static boolean b(DeviceInfo deviceInfo) {
        boolean z;
        DeviceInfo deviceInfoB = b("HwBasicDataUtil");
        if (deviceInfo == null && deviceInfoB == null) {
            ReleaseLogUtil.d("Step_HwBasicDataUtil", "sync data wrong, no device connected.");
        } else {
            if (deviceInfo == null || !HwVersionManager.b(BaseApplication.getContext()).m(deviceInfo.getDeviceIdentify())) {
                LogUtil.j("HwBasicDataUtil", "syncFitnessDetailData is other.");
                z = true;
            } else {
                ReleaseLogUtil.d("Step_HwBasicDataUtil", "sync data wrong, device ota.");
            }
            if (!z) {
                g("com.huawei.health.fitness_detail_sync_fail");
            }
            return z;
        }
        z = false;
        if (!z) {
            g("com.huawei.health.fitness_detail_sync_fail");
        }
        return z;
    }

    public static void g(String str) {
        LogUtil.a("HwBasicDataUtil", "sendSyncCompleteBroadcastToHealth.", str);
        try {
            BroadcastManagerUtil.a(BaseApplication.getContext(), new Intent(str), LocalBroadcast.f36595c, true);
        } catch (Exception e) {
            ReleaseLogUtil.a("HwBasicDataUtil", "sendBroadcast RuntimeException", ExceptionUtils.c(e));
        }
    }

    public static void c(final DeviceInfo deviceInfo) {
        LogUtil.a("HwBasicDataUtil", "registerDeviceToHiHealth enter.");
        if (deviceInfo == null) {
            LogUtil.j("HwBasicDataUtil", "registerDeviceToHiHealth deviceInfo is null");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: mpz.1
                @Override // java.lang.Runnable
                public void run() {
                    myo.a(deviceInfo);
                }
            });
        }
    }

    public static long a(mpg mpgVar) {
        LogUtil.a("HwBasicDataUtil", "getLastSyncTime enter.");
        return new moz().c(mpgVar);
    }

    public static void a(long j, mpg mpgVar) {
        LogUtil.a("HwBasicDataUtil", "setLastSyncTime time :", Long.valueOf(j));
        moz mozVar = new moz();
        mqg mqgVar = new mqg();
        mqgVar.e(j);
        mozVar.c(mpgVar, mqgVar);
    }

    public static long c(long j) {
        String str = new SimpleDateFormat("yyyyMMdd").format(new Date(j * 1000));
        try {
            return new SimpleDateFormat("yyyyMMddhhmm").parse(str + AgdConstant.INSTALL_TYPE_DEFAULT).getTime() / 1000;
        } catch (ParseException e) {
            LogUtil.e("HwBasicDataUtil", "getBeginOfDate ParseException : ", ExceptionUtils.c(e));
            return j;
        }
    }

    public static void c(String str, int i) {
        LogUtil.a("HwBasicDataUtil", "setDefaultDeviceReportThreshold.");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwBasicDataUtil", "setDefaultDeviceReportThreshold deviceIdentify is null");
            return;
        }
        DeviceCapability deviceCapabilityC = c(str);
        if (deviceCapabilityC == null) {
            LogUtil.j("HwBasicDataUtil", "setDefaultDeviceReportThreshold deviceCapability is null");
        } else if (!deviceCapabilityC.isSupportThreshold()) {
            LogUtil.j("HwBasicDataUtil", "setDefaultDeviceReportThreshold is not support");
        } else {
            mpr.a(mhl.d(i));
        }
    }

    public static void a(int i, DeviceInfo deviceInfo) {
        LogUtil.a("HwBasicDataUtil", "getHealthDataByFrame dataIndex :", Integer.valueOf(i));
        if (d(deviceInfo) == 0) {
            mpr.c(i, deviceInfo);
        } else if (d(deviceInfo) == 1) {
            mpr.b(i, deviceInfo);
        } else {
            LogUtil.j("HwBasicDataUtil", "getHealthDataByFrame unknown type.");
        }
    }

    public static int d(DeviceInfo deviceInfo) {
        int fitnessFrameType = -1;
        if (deviceInfo == null) {
            return -1;
        }
        DeviceCapability deviceCapabilityC = c(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityC == null) {
            LogUtil.j("HwBasicDataUtil", "getDeviceDataType deviceCapability is null.");
        } else {
            fitnessFrameType = deviceCapabilityC.getFitnessFrameType();
        }
        LogUtil.d("HwBasicDataUtil", "getDeviceDataType deviceDataType :", Integer.valueOf(fitnessFrameType));
        return fitnessFrameType;
    }

    public static DeviceCapability c(String str) {
        DeviceCapability value = null;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwBasicDataUtil", "getCapability mac is null.");
            return null;
        }
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(2, str, "HwBasicDataUtil");
        if (mapQueryDeviceCapability != null && !mapQueryDeviceCapability.isEmpty()) {
            Iterator<Map.Entry<String, DeviceCapability>> it = mapQueryDeviceCapability.entrySet().iterator();
            while (it.hasNext() && (value = it.next().getValue()) == null) {
            }
        }
        return value;
    }

    public static boolean a(DeviceInfo deviceInfo) {
        return deviceInfo != null && deviceInfo.getProductType() == 7;
    }

    public static int e(DeviceInfo deviceInfo) {
        if (deviceInfo != null) {
            return deviceInfo.getDeviceProtocol();
        }
        return -1;
    }

    public static DeviceInfo a(String str) {
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_DEVICES, null, str);
        if (deviceList == null) {
            LogUtil.j("HwBasicDataUtil", "getActiveDeviceInfo deviceInfoList is null.", str);
            return null;
        }
        for (DeviceInfo deviceInfo2 : deviceList) {
            if (eel.d(deviceInfo2.getProductType())) {
                deviceInfo = deviceInfo2;
                break;
            }
        }
        LogUtil.a("HwBasicDataUtil", "getActiveDeviceInfo deviceInfo ", deviceInfo, ", tag is ", str);
        return deviceInfo;
    }

    public static String c() {
        DeviceInfo deviceInfoA = a("HwBasicDataUtil");
        if (deviceInfoA != null) {
            return deviceInfoA.getSecurityUuid() + "#ANDROID21";
        }
        return "";
    }

    public static DeviceInfo b(String str) {
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_AW70_DEVICES, null, str);
        if (deviceList != null && !deviceList.isEmpty()) {
            deviceInfo = deviceList.get(0);
        }
        LogUtil.a("HwBasicDataUtil", "getConnectAw70DeviceInfo() deviceInfo ", deviceInfo, " , tag is ", str);
        return deviceInfo;
    }

    public static DeviceInfo e(String str) {
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, str);
        if (deviceList != null && !deviceList.isEmpty()) {
            for (DeviceInfo deviceInfo2 : deviceList) {
                if (!eel.d(deviceInfo2.getProductType())) {
                    deviceInfo = deviceInfo2;
                    break;
                }
            }
        }
        LogUtil.a("HwBasicDataUtil", "getConnectDeviceInfo() deviceInfo ", deviceInfo, " , tag is ", str);
        return deviceInfo;
    }

    public static void a(boolean z) {
        LogUtil.a("HwBasicDataUtil", "setFitnessTemperatureControl() in isControlFlag = ", Boolean.valueOf(z));
        SharedPreferenceManager.a("fitness_module", "key_fitness_is_foreground", z);
    }

    public static boolean a() {
        return SharedPreferenceManager.b("fitness_module", "key_fitness_is_foreground", false);
    }

    public static void b(String str, long j) {
        LogUtil.a("HwBasicDataUtil", "setFitnessTodayTotalDataTime = ", Long.valueOf(j));
        SharedPreferenceManager.c("fitness_module", "key_fitness_today_data_time" + ckg.b(str), j);
    }

    public static long d(String str) {
        return SharedPreferenceManager.d("fitness_module", "key_fitness_today_data_time" + ckg.b(str), 0L);
    }

    public static boolean d(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return calendar.getTimeInMillis() == calendar2.getTimeInMillis();
    }
}
