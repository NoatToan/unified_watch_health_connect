package defpackage;

import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.healthdatamgr.api.HealthDataMgrApi;
import com.huawei.hihealth.data.model.HiStressMetaData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes38.dex */
public class mfb {
    public static void b(List<String> list, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.e("DEVMGR_HealthMonitorSwitchUtil", "getHealthMonitorSwitch callback is null");
            return;
        }
        if (list == null || list.size() == 0) {
            ReleaseLogUtil.e("DEVMGR_HealthMonitorSwitchUtil", "getHealthMonitorSwitch keys is error");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        DeviceInfo deviceInfoC = c("HealthMonitorSwitchUtil");
        if (deviceInfoC == null || deviceInfoC.getDeviceConnectState() != 2) {
            ReleaseLogUtil.e("DEVMGR_HealthMonitorSwitchUtil", "getHealthMonitorSwitch deviceInfo is null or not connected");
            iBaseResponseCallback.a(-2, null);
        } else {
            LogUtil.a("HealthMonitorSwitchUtil", "getHealthMonitorSwitch switchKeys:", list.toString());
            JSONObject jSONObject = new JSONObject();
            c(d(list, jSONObject), iBaseResponseCallback, jSONObject);
        }
    }

    private static void c(final List<String> list, final IBaseResponseCallback iBaseResponseCallback, final JSONObject jSONObject) {
        LogUtil.a("HealthMonitorSwitchUtil", "querySwitchSetting switchKeys:", list.toString());
        ThreadPoolManager.c().a("HealthMonitorSwitchUtil", new Runnable() { // from class: mfb.2
            @Override // java.lang.Runnable
            public void run() {
                List<String> listE = mfb.e((List<String>) list);
                if (listE.isEmpty()) {
                    ReleaseLogUtil.e("DEVMGR_HealthMonitorSwitchUtil", "getHealthMonitorSwitch querySwitchKeys is null or empty");
                    mfb.a(jSONObject, iBaseResponseCallback);
                    return;
                }
                for (String str : listE) {
                    LogUtil.a("HealthMonitorSwitchUtil", "querySwitchSetting key:", str);
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    mfb.e(str, new IBaseResponseCallback() { // from class: mfb.2.4
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public void a(int i, Object obj) {
                            if (obj instanceof String) {
                                String str2 = (String) obj;
                                LogUtil.a("HealthMonitorSwitchUtil", "querySwitchSetting queryKey:", str2, ", switchStatus:", Integer.valueOf(i));
                                try {
                                    jSONObject.put(mfb.e(str2), i);
                                } catch (JSONException unused) {
                                    ReleaseLogUtil.a("DEVMGR_HealthMonitorSwitchUtil", "querySwitchSetting JSONException");
                                }
                            }
                            countDownLatch.countDown();
                        }
                    });
                    try {
                        countDownLatch.await(500L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                        ReleaseLogUtil.a("DEVMGR_HealthMonitorSwitchUtil", "querySwitchSetting InterruptedException");
                    }
                }
                mfb.a(jSONObject, iBaseResponseCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(final String str, final IBaseResponseCallback iBaseResponseCallback) {
        mhs.a().getSwitchSetting(str, new IBaseResponseCallback() { // from class: mfb.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                int iJ = CommonUtil.j("0");
                ReleaseLogUtil.d("DEVMGR_HealthMonitorSwitchUtil", "getSwitchStatus key:", str, ", errorCode:", Integer.valueOf(i));
                if (i == 0 && (obj instanceof String)) {
                    String str2 = (String) obj;
                    LogUtil.a("HealthMonitorSwitchUtil", "getSwitchStatus switchValue:", str2);
                    if ("true".equals(str2) || "1".equals(str2)) {
                        iJ = CommonUtil.j("1");
                    } else if ("false".equals(str2) || "0".equals(str2)) {
                        iJ = CommonUtil.j("0");
                    } else {
                        LogUtil.j("HealthMonitorSwitchUtil", "getSwitchStatus key:", str, ", switchValue:", str2);
                    }
                }
                iBaseResponseCallback.a(iJ, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        if (jSONObject == null || jSONObject.length() == 0) {
            LogUtil.j("HealthMonitorSwitchUtil", "callbackResult error");
            iBaseResponseCallback.a(-1, null);
        } else {
            LogUtil.j("HealthMonitorSwitchUtil", "callbackResult success");
            iBaseResponseCallback.a(0, jSONObject);
        }
    }

    private static DeviceInfo c(String str) {
        DeviceInfo next = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, str);
        if (deviceList != null && !deviceList.isEmpty()) {
            Iterator<DeviceInfo> it = deviceList.iterator();
            if (it.hasNext()) {
                next = it.next();
            }
        }
        LogUtil.a("HealthMonitorSwitchUtil", "getConnectMainDevice() deviceInfo ", next, ", tag:", str);
        return next;
    }

    private static List<String> d(List<String> list, JSONObject jSONObject) {
        DeviceCapability deviceCapabilityC = eej.c();
        ArrayList arrayList = new ArrayList(16);
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                int iA = a(str, deviceCapabilityC);
                if (iA == -3) {
                    try {
                        jSONObject.put(str, -3);
                    } catch (JSONException unused) {
                        ReleaseLogUtil.a("DEVMGR_HealthMonitorSwitchUtil", "getSupportSwitch JSONException");
                    }
                } else if (iA == -4) {
                    jSONObject.put(str, -4);
                } else {
                    arrayList.add(str);
                }
            }
        }
        LogUtil.a("HealthMonitorSwitchUtil", "getSupportSwitch supportList:", arrayList.toString());
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    private static int a(String str, DeviceCapability deviceCapability) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "custom.blood.oxygen.switch":
                b2 = 0;
                break;
            case "core_sleep_button":
                b2 = 1;
                break;
            case "heart_rate_switch":
                b2 = 2;
                break;
            case "press_auto_monitor_switch_status":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            if (deviceCapability.isSupportCycleBloodOxygenSwitch()) {
                return 0;
            }
            ReleaseLogUtil.e("DEVMGR_HealthMonitorSwitchUtil", "isKeySupportCapability isSupportCycleBloodOxygenSwitch false");
            return -3;
        }
        if (b2 == 1) {
            if (deviceCapability.isSupportCoreSleep()) {
                return 0;
            }
            ReleaseLogUtil.e("DEVMGR_HealthMonitorSwitchUtil", "isKeySupportCapability isSupportCoreSleep false");
            return -3;
        }
        if (b2 == 2) {
            if (deviceCapability.isSupportContinueHeartRate() || deviceCapability.isSupportHeartRateEnable()) {
                return 0;
            }
            ReleaseLogUtil.e("DEVMGR_HealthMonitorSwitchUtil", "isKeySupportCapability isSupportHeartRate false");
            return -3;
        }
        if (b2 == 3) {
            if (deviceCapability.isSupportPressAutoMonitor()) {
                return 0;
            }
            ReleaseLogUtil.e("DEVMGR_HealthMonitorSwitchUtil", "isKeySupportCapability isSupportPressAutoMonitor false");
            return -3;
        }
        ReleaseLogUtil.e("DEVMGR_HealthMonitorSwitchUtil", "isKeySupportCapability other key false， not support");
        return -4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<String> e(List<String> list) {
        ArrayList arrayList = new ArrayList(16);
        for (String str : list) {
            if ("heart_rate_switch".equals(str)) {
                DeviceCapability deviceCapabilityC = eej.c();
                if (deviceCapabilityC.isSupportContinueHeartRate()) {
                    str = "continue_heart_rate";
                } else if (deviceCapabilityC.isSupportHeartRateEnable()) {
                    str = "heart_rate_button";
                } else {
                    LogUtil.j("HealthMonitorSwitchUtil", "replaceHeartRateKey other key false");
                }
                arrayList.add(str);
            } else {
                arrayList.add(str);
            }
        }
        LogUtil.a("HealthMonitorSwitchUtil", "replaceHeartRateKey resultSwitchKeys：", arrayList.toString());
        return arrayList;
    }

    public static void c(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.e("DEVMGR_HealthMonitorSwitchUtil", "setHealthMonitorSwitch callback is null");
            return;
        }
        if (jSONObject == null || jSONObject.length() == 0) {
            ReleaseLogUtil.e("DEVMGR_HealthMonitorSwitchUtil", "setHealthMonitorSwitch keyParam is error");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        DeviceInfo deviceInfoC = c("HealthMonitorSwitchUtil");
        if (deviceInfoC == null || deviceInfoC.getDeviceConnectState() != 2) {
            ReleaseLogUtil.e("DEVMGR_HealthMonitorSwitchUtil", "setHealthMonitorSwitch deviceInfo is null or not connected");
            iBaseResponseCallback.a(-2, null);
            return;
        }
        LogUtil.a("HealthMonitorSwitchUtil", "setHealthMonitorSwitch switchKeys:", jSONObject.toString());
        JSONObject jSONObject2 = new JSONObject();
        ArrayList arrayList = new ArrayList(16);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            arrayList.add(itKeys.next());
        }
        a(d(arrayList, jSONObject2), jSONObject, iBaseResponseCallback, jSONObject2);
    }

    private static void a(final List<String> list, final JSONObject jSONObject, final IBaseResponseCallback iBaseResponseCallback, final JSONObject jSONObject2) {
        LogUtil.a("HealthMonitorSwitchUtil", "saveAndSendHealthSwitch switchKeys:", list.toString(), ",keyParam :", jSONObject);
        ThreadPoolManager.c().a("HealthMonitorSwitchUtil", new Runnable() { // from class: mfb.4
            @Override // java.lang.Runnable
            public void run() {
                List<String> listE = mfb.e((List<String>) list);
                if (listE.isEmpty()) {
                    ReleaseLogUtil.e("DEVMGR_HealthMonitorSwitchUtil", "saveAndSendHealthSwitch setSwitchKeys is null or empty");
                    mfb.a(jSONObject2, iBaseResponseCallback);
                    return;
                }
                for (String str : listE) {
                    LogUtil.a("HealthMonitorSwitchUtil", "saveAndSendHealthSwitch key:", str);
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    mfb.c(str, jSONObject, new IBaseResponseCallback() { // from class: mfb.4.3
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public void a(int i, Object obj) {
                            if (obj instanceof String) {
                                String str2 = (String) obj;
                                LogUtil.a("HealthMonitorSwitchUtil", "saveAndSendHealthSwitch objectData:", str2);
                                try {
                                    jSONObject2.put(mfb.e(str2), i);
                                } catch (JSONException unused) {
                                    ReleaseLogUtil.a("DEVMGR_HealthMonitorSwitchUtil", "saveAndSendHealthSwitch JSONException");
                                }
                            }
                            countDownLatch.countDown();
                        }
                    });
                    try {
                        countDownLatch.await();
                    } catch (InterruptedException unused) {
                        ReleaseLogUtil.a("DEVMGR_HealthMonitorSwitchUtil", "saveAndSendHealthSwitch InterruptedException");
                    }
                }
                LogUtil.a("HealthMonitorSwitchUtil", "saveAndSendHealthSwitch responseResult:", jSONObject2.toString());
                mfb.a(jSONObject2, iBaseResponseCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        String strValueOf = String.valueOf(jSONObject.optInt(e(str)));
        LogUtil.a("HealthMonitorSwitchUtil", "setSwitchKey key:", str);
        if ("press_auto_monitor_switch_status".equals(str) && "1".equals(strValueOf)) {
            c(iBaseResponseCallback);
        } else {
            b(strValueOf, str, iBaseResponseCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final String str, final String str2, final IBaseResponseCallback iBaseResponseCallback) {
        if ("press_auto_monitor_switch_status".equals(str2)) {
            str = "1".equals(str) ? "true" : "false";
        }
        mhs.a().setSwitchSetting(str2, str, new IBaseResponseCallback() { // from class: mfb.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("HealthMonitorSwitchUtil", "updateAndSendSwitch onResponse key:", str2, ", switchStatus:", str, ", errorCode:", Integer.valueOf(i));
                if (i == 0) {
                    if ("continue_heart_rate".equals(str2)) {
                        mfb.d(str);
                    } else {
                        mfb.d(str2, str);
                    }
                } else {
                    ReleaseLogUtil.e("DEVMGR_HealthMonitorSwitchUtil", "updateAndSendSwitch setSwitchSetting error");
                }
                iBaseResponseCallback.a(i, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(String str) {
        return ("continue_heart_rate".equals(str) || "heart_rate_button".equals(str)) ? "heart_rate_switch" : str;
    }

    private static void c(final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HealthMonitorSwitchUtil", "getCalibratedStatus enter");
        a(new IBaseResponseCallback() { // from class: mfb.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("HealthMonitorSwitchUtil", "getCalibratedStatus errorCode:", Integer.valueOf(i));
                boolean zBooleanValue = (i != 0 || obj == null) ? false : ((Boolean) obj).booleanValue();
                ReleaseLogUtil.e("DEVMGR_HealthMonitorSwitchUtil", "getCalibratedStatus isCalibrated :", Boolean.valueOf(zBooleanValue));
                if (zBooleanValue) {
                    mfb.b("1", "press_auto_monitor_switch_status", iBaseResponseCallback);
                } else {
                    iBaseResponseCallback.a(-2, "press_auto_monitor_switch_status");
                }
            }
        });
    }

    private static void a(final IBaseResponseCallback iBaseResponseCallback) {
        ((HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class)).getUserPressureAdjustDatas(new IBaseResponseCallback() { // from class: mfb.9
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 0 && (obj instanceof String)) {
                    HiStressMetaData hiStressMetaDataA = mbs.a((String) obj);
                    if (hiStressMetaDataA == null) {
                        ReleaseLogUtil.e("DEVMGR_HealthMonitorSwitchUtil", "getUserPressureAdjustData metaData is null");
                        iBaseResponseCallback.a(-1, false);
                        return;
                    }
                    int iFetchStressCalibFlag = hiStressMetaDataA.fetchStressCalibFlag();
                    int iFetchStressScore = hiStressMetaDataA.fetchStressScore();
                    LogUtil.a("HealthMonitorSwitchUtil", "getUserPressureAdjustData calibrateFlag :", Integer.valueOf(iFetchStressCalibFlag), ", score:", Integer.valueOf(iFetchStressScore));
                    if (iFetchStressCalibFlag == 1 && iFetchStressScore > 0 && iFetchStressScore < 100) {
                        iBaseResponseCallback.a(0, true);
                        return;
                    } else {
                        ReleaseLogUtil.e("DEVMGR_HealthMonitorSwitchUtil", "getUserPressureAdjustData calibrateFlag or score is error");
                        iBaseResponseCallback.a(-1, false);
                        return;
                    }
                }
                ReleaseLogUtil.e("DEVMGR_HealthMonitorSwitchUtil", "getUserPressureAdjustData error");
                iBaseResponseCallback.a(-1, false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void d(String str, String str2) {
        byte b2 = 0;
        int iE = CommonUtil.e(str2, 0);
        str.hashCode();
        switch (str.hashCode()) {
            case -2104706991:
                if (!str.equals("custom.blood.oxygen.switch")) {
                    b2 = -1;
                }
                break;
            case -1981990342:
                if (!str.equals("core_sleep_button")) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case -1432899336:
                if (!str.equals("heart_rate_button")) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case -45309916:
                if (!str.equals("press_auto_monitor_switch_status")) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            lxw.b(iE);
            return;
        }
        if (b2 == 1) {
            lxw.d(iE);
            return;
        }
        if (b2 == 2) {
            lxw.e(iE);
        } else if (b2 == 3) {
            mbr.a().e("true".equals(str2) ? 1 : 2);
        } else {
            LogUtil.j("HealthMonitorSwitchUtil", "sendSwitchToDeviceMore other key false");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str) {
        final int iE = CommonUtil.e(str, 0);
        mhs.a().getSwitchSetting("heart_rate_mode", new IBaseResponseCallback() { // from class: mfb.10
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("DEVMGR_HealthMonitorSwitchUtil", "sendContinueHeartRate heart_rate_mode errorCode: ", Integer.valueOf(i));
                int iN = (i == 0 && (obj instanceof String)) ? CommonUtil.n(BaseApplication.getContext(), (String) obj) : 1;
                LogUtil.a("HealthMonitorSwitchUtil", "sendContinueHeartRate heart_rate_mode : ", Integer.valueOf(iN));
                if (iN == 0) {
                    lxw.a(iE);
                } else {
                    if (iN != 1) {
                        return;
                    }
                    lxw.e(iE);
                }
            }
        });
    }
}
