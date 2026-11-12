package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class mfd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f41568c = new Object();
    private static mfd e;
    private boolean d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private mhs f41569a = mhs.a();

    private mfd() {
    }

    public static mfd a() {
        mfd mfdVar;
        synchronized (f41568c) {
            if (e == null) {
                e = new mfd();
            }
            mfdVar = e;
        }
        return mfdVar;
    }

    public void b(int i, String str) {
        DeviceInfo deviceInfoC = mgg.c(str, "HwHeartRateHelper");
        if ("M0A7".equals(deviceInfoC.getHiLinkDeviceId()) || "0A8".equals(deviceInfoC.getHiLinkDeviceId())) {
            LogUtil.a("HwHeartRateHelper", "deviceInfo is molly, send intelligent mode");
            a(i);
        } else if ((i & 2) == 2) {
            this.f41569a.setSwitchSetting("heart_rate_mode", Integer.toString(0), null);
            this.f41569a.setSwitchSetting("continue_heart_rate", "1", null);
            LogUtil.a("HwHeartRateHelper", "send continue heart rate ", 1);
        } else if ((i & 8) == 8) {
            a(i);
        }
    }

    private void a(int i) {
        if (lxg.c(BaseApplication.getContext()).c()) {
            LogUtil.a("HwHeartRateHelper", "send cycle heart rate isFamilyMode result is:", Integer.valueOf(i));
            lxg.c(BaseApplication.getContext()).d(CommonUtil.n(BaseApplication.getContext(), "1"));
        } else {
            this.f41569a.setSwitchSetting("heart_rate_mode", Integer.toString(1), null);
            this.f41569a.setSwitchSetting("heart_rate_button", "1", null);
            this.f41569a.setSwitchSetting("continue_heart_rate", "1", null);
            LogUtil.a("HwHeartRateHelper", "send cycle heart rate ", 1);
        }
    }

    public void b(int i) {
        if ((i & 2) == 2) {
            lxw.a(1);
        } else if ((i & 8) == 8) {
            lxw.e(1);
        }
        c(i);
    }

    public void d(int i) {
        if ((i & 1) == 1) {
            lxw.d(1);
        }
    }

    private void c(final int i) {
        c(new IBaseResponseCallback() { // from class: mfd.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                if (i2 != -1) {
                    mfd.this.h();
                    return;
                }
                int i3 = i;
                int i4 = ((i3 & 2) == 2 || (i3 & 8) == 8) ? 1 : 0;
                DeviceCapability deviceCapabilityC = eej.c();
                Semaphore semaphore = new Semaphore(1);
                try {
                    if (deviceCapabilityC.isSupportHeartRateRaiseAlarm()) {
                        semaphore.acquire();
                        mfd.this.c(semaphore, 2, i4);
                    }
                    if (deviceCapabilityC.isSupportHeartRateDownAlarm()) {
                        semaphore.acquire();
                        mfd.this.a(semaphore, 2, i4);
                    }
                } catch (InterruptedException unused) {
                    LogUtil.e("HwHeartRateHelper", "reportHeartRateRemindHandle InterruptedException");
                }
            }
        });
        Intent intent = new Intent();
        intent.setAction("com.huawei.bone.action.CONTINUE_HEART_RATE_SWITCH");
        intent.putExtra("continue_heart_rate", true);
        BroadcastManagerUtil.a(BaseApplication.getContext(), intent);
    }

    private void c(final IBaseResponseCallback iBaseResponseCallback) {
        if (lxg.c(BaseApplication.getContext()).c()) {
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "104", "custom.heart_rate_raise_remind");
            String strE2 = SharedPreferenceManager.e(BaseApplication.getContext(), "105", "custom.heart_rate_down_remind");
            if (strE == null || strE2 == null) {
                ReleaseLogUtil.d("DEVMGR_HwHeartRateHelper", "neverDefaultOpenHeartRateRemind raiseValue or downValue is null");
                iBaseResponseCallback.a(-1, null);
                return;
            } else {
                iBaseResponseCallback.a(1, null);
                return;
            }
        }
        ArrayList arrayList = new ArrayList(16);
        arrayList.add("custom.heart_rate_raise_remind");
        arrayList.add("custom.heart_rate_down_remind");
        this.f41569a.getSwitchSetting(arrayList, new IBaseResponseCallback() { // from class: mfd.6
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj == null) {
                    ReleaseLogUtil.d("DEVMGR_HwHeartRateHelper", "neverDefaultOpenHeartRateRemind objectData is null");
                    iBaseResponseCallback.a(-1, null);
                    return;
                }
                List list = (List) obj;
                String strE3 = mfd.e((List<HiUserPreference>) list, "custom.heart_rate_raise_remind");
                String strE4 = mfd.e((List<HiUserPreference>) list, "custom.heart_rate_down_remind");
                if (strE3 == null || strE4 == null) {
                    ReleaseLogUtil.d("DEVMGR_HwHeartRateHelper", "neverDefaultOpenHeartRateRemind raiseNumber and downNumber is null");
                    iBaseResponseCallback.a(-1, null);
                } else {
                    iBaseResponseCallback.a(1, null);
                }
            }
        });
    }

    public static String e(List<HiUserPreference> list, String str) {
        LogUtil.a("HwHeartRateHelper", "getSettingItem enter");
        if (list == null) {
            LogUtil.j("HwHeartRateHelper", "getSettingItem userPreferenceList is null");
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            HiUserPreference hiUserPreference = list.get(i);
            if (hiUserPreference == null) {
                LogUtil.j("HwHeartRateHelper", "getSettingItem userPreference error");
            } else if (str.equals(hiUserPreference.getKey())) {
                LogUtil.a("HwHeartRateHelper", "userPreference is:", hiUserPreference.toString());
                return hiUserPreference.getValue();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (lxg.c(BaseApplication.getContext()).c()) {
            f();
            i();
        } else {
            k();
            n();
        }
    }

    private void i() {
        lxg lxgVarC = lxg.c(BaseApplication.getContext());
        int iN = CommonUtil.n(BaseApplication.getContext(), SharedPreferenceManager.e(BaseApplication.getContext(), "105", "custom.heart_rate_down_remind"));
        if (iN == 0) {
            lxgVarC.c(0, 0, false);
        } else {
            lxgVarC.c(1, iN, false);
        }
    }

    private void f() {
        lxg lxgVarC = lxg.c(BaseApplication.getContext());
        int iN = CommonUtil.n(BaseApplication.getContext(), SharedPreferenceManager.e(BaseApplication.getContext(), "104", "custom.heart_rate_raise_remind"));
        if (iN == 0) {
            lxgVarC.a(0, 0, false);
        } else {
            lxgVarC.a(1, iN, false);
        }
    }

    private void k() {
        this.f41569a.getSwitchSetting("custom.heart_rate_raise_remind", new IBaseResponseCallback() { // from class: mfd.9
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                int i2;
                LogUtil.a("HwHeartRateHelper", "reportHeartRateRaiseRemind err_code = ", Integer.valueOf(i));
                lxg lxgVarC = lxg.c(BaseApplication.getContext());
                if (i == 0 && (obj instanceof String)) {
                    try {
                        i2 = Integer.parseInt((String) obj);
                    } catch (NumberFormatException unused) {
                        LogUtil.e("HwHeartRateHelper", "reportHeartRateRaiseRemind NumberFormatException");
                        i2 = 0;
                    }
                } else {
                    i2 = 0;
                }
                if (i2 == 0) {
                    lxgVarC.a(0, 0, false);
                } else {
                    lxgVarC.a(1, i2, false);
                }
            }
        });
    }

    private void n() {
        this.f41569a.getSwitchSetting("custom.heart_rate_down_remind", new IBaseResponseCallback() { // from class: mfd.11
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                int i2;
                LogUtil.a("HwHeartRateHelper", "result watch auto open continue heart rate getHeartRateDownRemindNumber err_code = ", Integer.valueOf(i));
                lxg lxgVarC = lxg.c(BaseApplication.getContext());
                if (i == 0 && (obj instanceof String)) {
                    try {
                        i2 = Integer.parseInt((String) obj);
                    } catch (NumberFormatException unused) {
                        LogUtil.e("HwHeartRateHelper", "reportHeartRateDownRemind NumberFormatException");
                        i2 = 0;
                    }
                } else {
                    i2 = 0;
                }
                if (i2 == 0) {
                    lxgVarC.c(0, 0, false);
                } else {
                    lxgVarC.c(1, i2, false);
                }
            }
        });
    }

    public void d(int i, Object obj, int i2) {
        LogUtil.a("HwHeartRateHelper", "HEART_RATE_MODE err_code = ", Integer.valueOf(i));
        int iN = (i == 0 && (obj instanceof String)) ? CommonUtil.n(BaseApplication.getContext(), (String) obj) : 1;
        LogUtil.a("HwHeartRateHelper", "HEART_RATE_MODE status : " + iN);
        if (iN == 0) {
            LogUtil.a("HwHeartRateHelper", "init click continue click");
            lxw.a(i2);
        } else if (iN == 1) {
            LogUtil.a("HwHeartRateHelper", "init cycle continue click");
            lxw.e(i2);
        } else {
            LogUtil.a("HwHeartRateHelper", "not get heart rate from cloud");
        }
    }

    public void a(final int[] iArr, final Semaphore semaphore) {
        LogUtil.a("HwHeartRateHelper", "reLink send continue cycle heart rate");
        this.f41569a.getSwitchSetting("continue_heart_rate", new IBaseResponseCallback() { // from class: mfd.15
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                final int i2;
                LogUtil.a("HwHeartRateHelper", "CONTINUE_MEASURE_HEART_RATE err_code = ", Integer.valueOf(i));
                if (i == 0 && (obj instanceof String)) {
                    try {
                        i2 = Integer.parseInt((String) obj);
                    } catch (NumberFormatException e2) {
                        LogUtil.e("HwHeartRateHelper", "store format cannot to number", e2.getMessage());
                        i2 = 0;
                    }
                } else {
                    i2 = 0;
                }
                iArr[0] = i2;
                LogUtil.a("HwHeartRateHelper", "CONTINUE_MEASURE_HEART_RATE status : " + i2);
                mfd.this.f41569a.getSwitchSetting("heart_rate_mode", new IBaseResponseCallback() { // from class: mfd.15.5
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i3, Object obj2) {
                        mfd.this.d(i3, obj2, i2);
                    }
                });
                semaphore.release();
            }
        });
    }

    public void e(final int[] iArr, final Semaphore semaphore) {
        LogUtil.a("HwHeartRateHelper", "getWearCommonSetting enter");
        this.f41569a.getSwitchSetting("continue_heart_rate", new IBaseResponseCallback() { // from class: mfd.14
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                int i2;
                LogUtil.a("HwHeartRateHelper", "getWearCommonSetting err_code = ", Integer.valueOf(i));
                if (i == 0 && (obj instanceof String)) {
                    try {
                        i2 = Integer.parseInt((String) obj);
                    } catch (NumberFormatException e2) {
                        LogUtil.e("HwHeartRateHelper", e2.getMessage());
                        i2 = 0;
                    }
                } else {
                    i2 = 0;
                }
                iArr[0] = i2;
                LogUtil.a("HwHeartRateHelper", "getWearCommonSetting status : " + i2);
                lxw.a(i2);
                semaphore.release();
            }
        });
    }

    public void d(final int[] iArr, final Semaphore semaphore) {
        this.f41569a.getSwitchSetting("custom.heart_rate_raise_remind", new IBaseResponseCallback() { // from class: mfd.12
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                int i2;
                LogUtil.a("HwHeartRateHelper", "supportHeartRateRaise errorCode = ", Integer.valueOf(i));
                try {
                    if (semaphore.tryAcquire(3L, TimeUnit.SECONDS)) {
                        LogUtil.a("HwHeartRateHelper", "semaphore tryAcquire()");
                    } else {
                        LogUtil.a("HwHeartRateHelper", "semaphore tryAcquire() fail");
                    }
                } catch (InterruptedException e2) {
                    LogUtil.e("HwHeartRateHelper", e2.getMessage());
                }
                lxg lxgVarC = lxg.c(BaseApplication.getContext());
                int i3 = iArr[0];
                if (i3 != 1) {
                    if (i3 == 0) {
                        lxgVarC.a(0, 0, false);
                        LogUtil.a("HwHeartRateHelper", "continueHeartRateEnable[0] == 0");
                        return;
                    } else {
                        LogUtil.a("HwHeartRateHelper", "continueHeartRateEnable[0] != 0 & != 1");
                        return;
                    }
                }
                if (i == 0 && (obj instanceof String)) {
                    try {
                        i2 = Integer.parseInt((String) obj);
                    } catch (NumberFormatException unused) {
                        LogUtil.e("HwHeartRateHelper", "supportHeartRateRaise NumberFormatException");
                        i2 = 0;
                    }
                } else {
                    i2 = 0;
                }
                if (i2 == 0) {
                    LogUtil.a("HwHeartRateHelper", "close heart rate raise remind.");
                    lxgVarC.a(0, 0, false);
                } else {
                    LogUtil.a("HwHeartRateHelper", "open heart rate heart rate number is " + i2);
                    lxgVarC.a(1, i2, false);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final Semaphore semaphore, final int i, final int i2) {
        if (lxg.c(BaseApplication.getContext()).c()) {
            a(i2, SharedPreferenceManager.e(BaseApplication.getContext(), "104", "custom.heart_rate_raise_remind"), i);
            semaphore.release();
        } else {
            this.f41569a.getSwitchSetting("custom.heart_rate_raise_remind", new IBaseResponseCallback() { // from class: mfd.13
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i3, Object obj) {
                    LogUtil.a("HwHeartRateHelper", "heartRateRiseDefaultOpen errorCode ", Integer.valueOf(i3));
                    mfd.this.a(i2, obj, i);
                    semaphore.release();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Object obj, int i2) {
        lxg lxgVarC = lxg.c(BaseApplication.getContext());
        int iN = obj instanceof String ? CommonUtil.n(BaseApplication.getContext(), (String) obj) : 0;
        if (i != 1) {
            if (i2 == 1 || iN == 0) {
                lxgVarC.a(0, 0, false);
            } else {
                lxgVarC.a(1, iN, false);
            }
            LogUtil.a("HwHeartRateHelper", "heartRateRiseDefaultOpen heartRate is closed");
            return;
        }
        if (obj == null) {
            iN = 120;
        }
        if (iN == 0) {
            lxgVarC.a(0, 0, true);
        } else {
            lxgVarC.a(1, iN, true);
        }
    }

    private void e(int i) {
        if ((i & 1) != 1) {
            this.f41569a.setSwitchSettingToLocal("core_sleep_Default", "1", PrebakedEffectId.RT_COIN_DROP);
            return;
        }
        LogUtil.a("HwHeartRateHelper", "set CoreSleep switch open");
        this.f41569a.setSwitchSettingToLocal("core_sleep_Default", "0", PrebakedEffectId.RT_COIN_DROP);
        Intent intent = new Intent();
        intent.setAction("com.huawei.bone.action.CORE_SLEEP_DEFAULT_SWITCH");
        intent.putExtra("coreSleep_value", true);
        BroadcastManagerUtil.a(BaseApplication.getContext(), intent);
        this.f41569a.setSwitchSetting("core_sleep_button", "1", null);
        mhw.c("1");
    }

    public void a(int i, String str) {
        ReleaseLogUtil.d("DEVMGR_HwHeartRateHelper", " enter handleDefaultSwitch result :", Integer.valueOf(i));
        DeviceInfo deviceInfoD = mgg.d("HwHeartRateHelper");
        if (deviceInfoD == null) {
            ReleaseLogUtil.e("DEVMGR_HwHeartRateHelper", "handleDefaultSwitch deviceInfo is null");
            return;
        }
        g(i);
        String strE = nio.e(deviceInfoD.getDeviceIdentify());
        LogUtil.a("HwHeartRateHelper", "encryptedDeviceIndetify is ", strE);
        String strE2 = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(PrebakedEffectId.RT_COIN_DROP), strE);
        LogUtil.a("HwHeartRateHelper", "sharedPreferenceResult is ", strE2);
        if ("".equals(strE2)) {
            ReleaseLogUtil.d("DEVMGR_HwHeartRateHelper", " enter handleDefaultSwitch sharedPreferenceResult is empty");
            e(i);
            b(i, str);
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(PrebakedEffectId.RT_COIN_DROP), strE, "0", new StorageParams(0));
            mfn.e().c(new mfm("heart_rate_switch", 2, i, e));
            mfn.e().c(new mfl("core_sleep_switch", 2, i, e));
            mfn.e().b();
        }
        if ((i & 4) == 4) {
            LogUtil.a("HwHeartRateHelper", "support run course true");
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(PrebakedEffectId.RT_COIN_DROP), "new_run_course", "0", new StorageParams(0));
        } else {
            LogUtil.a("HwHeartRateHelper", "support run course false");
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(PrebakedEffectId.RT_COIN_DROP), "new_run_course", "1", new StorageParams(0));
        }
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC == null || !deviceCapabilityC.isSupportCycleBloodOxygenSwitch()) {
            return;
        }
        g();
    }

    private void g() {
        DeviceInfo deviceInfoC = mgg.c("HwHeartRateHelper");
        if (deviceInfoC == null) {
            LogUtil.j("HwHeartRateHelper", "info is null");
        } else if (mgb.d(deviceInfoC.getDeviceIdentify()) == 2) {
            j();
        } else {
            d();
        }
    }

    private void j() {
        int iN = CommonUtil.n(BaseApplication.getContext(), SharedPreferenceManager.e(BaseApplication.getContext(), "100", "custom.blood.oxygen.switch"));
        int iN2 = CommonUtil.n(BaseApplication.getContext(), SharedPreferenceManager.e(BaseApplication.getContext(), "103", "custom.blood.oxygen.remind"));
        lxg lxgVarC = lxg.c(BaseApplication.getContext());
        if (iN == 0) {
            LogUtil.a("HwHeartRateHelper", "handleFamilyBloodOxygen blood switch status is closed");
            lxgVarC.d(0, iN2, false);
            return;
        }
        LogUtil.a("HwHeartRateHelper", "handleFamilyBloodOxygen blood switch status is open");
        if (iN2 == 0) {
            lxgVarC.d(0, iN2, true);
        } else {
            lxgVarC.d(1, iN2, true);
        }
    }

    private void g(int i) {
        if ((i & 16) == 16) {
            mff.a().e(true);
            LogUtil.a("HwHeartRateHelper", "setIsOpenRaiseAndDownHeartRate is true");
        } else {
            mff.a().e(false);
            LogUtil.j("HwHeartRateHelper", "setIsOpenRaiseAndDownHeartRate is false");
        }
    }

    public void b(final int[] iArr, final Semaphore semaphore) {
        this.f41569a.getSwitchSetting("custom.heart_rate_down_remind", new IBaseResponseCallback() { // from class: mfd.18
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                int i2;
                LogUtil.a("HwHeartRateHelper", "getHeartRateDownRemindNumber err_code = ", Integer.valueOf(i));
                try {
                    LogUtil.a("HwHeartRateHelper", "getHeartRateDownRemindNumber semaphore tryAcquire() is success:", Boolean.valueOf(semaphore.tryAcquire(3L, TimeUnit.SECONDS)));
                } catch (InterruptedException e2) {
                    LogUtil.e("HwHeartRateHelper", e2.getMessage());
                }
                lxg lxgVarC = lxg.c(BaseApplication.getContext());
                int i3 = iArr[0];
                if (i3 != 1) {
                    if (i3 == 0) {
                        lxgVarC.c(0, 0, false);
                        LogUtil.a("HwHeartRateHelper", "continueHeartrateEnable[0] is 0");
                        return;
                    } else {
                        LogUtil.a("HwHeartRateHelper", "continueHeartrateEnable[0] != 0 & != 1");
                        return;
                    }
                }
                if (i == 0 && (obj instanceof String)) {
                    try {
                        i2 = Integer.parseInt((String) obj);
                    } catch (NumberFormatException unused) {
                        LogUtil.e("HwHeartRateHelper", "supportHeartRateDown NumberFormatException");
                        i2 = 0;
                    }
                } else {
                    i2 = 0;
                }
                if (i2 == 0) {
                    LogUtil.a("HwHeartRateHelper", "close heart rate down remind.");
                    lxgVarC.c(0, 0, false);
                } else {
                    LogUtil.a("HwHeartRateHelper", "open heart rate raise remind. heart rate number is ", Integer.valueOf(i2));
                    lxgVarC.c(1, i2, false);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Semaphore semaphore, final int i, final int i2) {
        if (lxg.c(BaseApplication.getContext()).c()) {
            e(i2, SharedPreferenceManager.e(BaseApplication.getContext(), "105", "custom.heart_rate_down_remind"), i);
            semaphore.release();
        } else {
            this.f41569a.getSwitchSetting("custom.heart_rate_down_remind", new IBaseResponseCallback() { // from class: mfd.3
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i3, Object obj) {
                    LogUtil.a("HwHeartRateHelper", "heartRateDownDefaultOpen err_code ", Integer.valueOf(i3));
                    mfd.this.e(i2, obj, i);
                    semaphore.release();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, Object obj, int i2) {
        lxg lxgVarC = lxg.c(BaseApplication.getContext());
        int iN = obj instanceof String ? CommonUtil.n(BaseApplication.getContext(), (String) obj) : 0;
        if (i != 1) {
            if (i2 == 1 || iN == 0) {
                lxgVarC.c(0, 0, false);
            } else {
                lxgVarC.c(1, iN, false);
            }
            LogUtil.a("HwHeartRateHelper", "heartRateDownDefaultOpen heartRate is closed");
            return;
        }
        if (obj == null) {
            iN = 40;
        }
        if (iN == 0) {
            lxgVarC.c(0, 0, true);
        } else {
            lxgVarC.c(1, iN, true);
        }
    }

    public void e() {
        LogUtil.a("HwHeartRateHelper", "syncCoreSleepButtonEnable");
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC == null) {
            LogUtil.j("HwFitnessManager", "syncCoreSleepButtonEnable deviceCapability is null");
        } else if (!deviceCapabilityC.isSupportCoreSleep()) {
            LogUtil.j("HwFitnessManager", "syncCoreSleepButtonEnable is not support");
        } else {
            this.f41569a.getSwitchSetting("core_sleep_button", new IBaseResponseCallback() { // from class: mfd.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    int i2;
                    LogUtil.a("HwFitnessManager", "CORE_SLEEP_BUTTON errorCode:", Integer.valueOf(i));
                    if (i == 0 && obj != null && (obj instanceof String)) {
                        try {
                            i2 = Integer.parseInt((String) obj);
                        } catch (NumberFormatException unused) {
                            LogUtil.e("HwFitnessManager", "NumberFormatException");
                            i2 = 0;
                        }
                    } else {
                        i2 = 0;
                    }
                    LogUtil.a("HwFitnessManager", "syncCoreSleepButtonEnable status:", Integer.valueOf(i2));
                    lxw.d(i2);
                }
            });
        }
    }

    public void c() {
        LogUtil.a("HwHeartRateHelper", "syncHeartRateButtonEnable enter.");
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC == null) {
            LogUtil.j("HwFitnessManager", "syncHeartRateButtonEnable deviceCapability is null");
            return;
        }
        if (!deviceCapabilityC.isSupportHeartRateEnable()) {
            LogUtil.j("HwFitnessManager", "syncHeartRateButtonEnable is not support");
            return;
        }
        if (!deviceCapabilityC.isSupportHeartRateEnable() || deviceCapabilityC.isSupportContinueHeartRate()) {
            return;
        }
        if (lxg.c(BaseApplication.getContext()).c()) {
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "102", "heart_rate_button");
            LogUtil.a("HwHeartRateHelper", "syncHeartRateButtonEnable familyStatus is:", strE);
            lxw.e(CommonUtil.j(strE));
            return;
        }
        this.f41569a.getSwitchSetting("heart_rate_button", new IBaseResponseCallback() { // from class: mfd.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                int iA;
                LogUtil.a("HwFitnessManager", "HEART_RATE_BUTTON errorCode :", Integer.valueOf(i));
                if (obj instanceof String) {
                    iA = lsk.a((String) obj, 10);
                    LogUtil.a("05", 1, "HwFitnessManager", "syncHeartRateButtonEnable btValue:", Integer.valueOf(iA));
                } else {
                    iA = 0;
                }
                lxw.e(iA);
            }
        });
    }

    public void b(final DeviceCapability deviceCapability) {
        LogUtil.a("HwHeartRateHelper", "enter autoSendHeartRateCommand");
        if (deviceCapability == null) {
            return;
        }
        LogUtil.a("HwHeartRateHelper", "heart rate remind default open flag ", Integer.valueOf(mff.a().d("heartRateRemindKey")));
        final int[] iArr = new int[1];
        c(new IBaseResponseCallback() { // from class: mfd.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == -1) {
                    mfd.this.c(deviceCapability, iArr);
                } else {
                    mfd.this.e(deviceCapability, iArr);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(DeviceCapability deviceCapability, int[] iArr) {
        LogUtil.a("HwHeartRateHelper", "enter handleHeartRateRemindDefaultOpen");
        Semaphore semaphore = new Semaphore(1);
        try {
            semaphore.acquire();
            if (deviceCapability.isSupportContinueHeartRate()) {
                if (deviceCapability.isSupportHeartRateEnable()) {
                    a(iArr, semaphore);
                } else {
                    LogUtil.a("HwHeartRateHelper", "handleHeartRateRemindDefaultOpen reLink send continue heart rate");
                    e(iArr, semaphore);
                }
            } else {
                c(iArr, semaphore);
            }
            lxg lxgVarC = lxg.c(BaseApplication.getContext());
            if (deviceCapability.isSupportHeartRateRaiseAlarm()) {
                LogUtil.a("HwHeartRateHelper", "handleHeartRateRemindDefaultOpen 5.7.28 is open. check heart rate raise remind number.");
                if (lxg.c(BaseApplication.getContext()).c()) {
                    e(lxgVarC);
                } else {
                    semaphore.acquire();
                    c(semaphore, 1, iArr[0]);
                }
            }
            if (deviceCapability.isSupportHeartRateDownAlarm()) {
                LogUtil.a("HwHeartRateHelper", "handleHeartRateRemindDefaultOpen 5.7.34 is open. check heart rate down remind number.");
                if (lxg.c(BaseApplication.getContext()).c()) {
                    a(lxgVarC);
                } else {
                    semaphore.acquire();
                    a(semaphore, 1, iArr[0]);
                }
            }
        } catch (InterruptedException unused) {
            LogUtil.e("HwHeartRateHelper", "handleHeartRateRemindDefaultOpen InterruptedException ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(DeviceCapability deviceCapability, int[] iArr) {
        LogUtil.a("HwHeartRateHelper", "enter handleOriginHeartRate");
        Semaphore semaphore = new Semaphore(0);
        if (deviceCapability.isSupportContinueHeartRate()) {
            if (deviceCapability.isSupportHeartRateEnable()) {
                a(iArr, semaphore);
            } else {
                LogUtil.a("HwHeartRateHelper", "reLink send continue heart rate");
                e(iArr, semaphore);
            }
        } else {
            c(iArr, semaphore);
        }
        lxg lxgVarC = lxg.c(BaseApplication.getContext());
        if (deviceCapability.isSupportHeartRateRaiseAlarm()) {
            LogUtil.a("HwHeartRateHelper", "5.7.28 is open. check heart rate raise remind number.");
            if (lxg.c(BaseApplication.getContext()).c()) {
                e(lxgVarC);
            } else {
                d(iArr, semaphore);
            }
        }
        if (deviceCapability.isSupportHeartRateDownAlarm()) {
            LogUtil.a("HwHeartRateHelper", "5.7.34 is open. check heart rate down remind number.");
            if (lxg.c(BaseApplication.getContext()).c()) {
                a(lxgVarC);
            } else {
                b(iArr, semaphore);
            }
        }
    }

    private void e(lxg lxgVar) {
        int iN = CommonUtil.n(BaseApplication.getContext(), SharedPreferenceManager.e(BaseApplication.getContext(), "104", "custom.heart_rate_raise_remind"));
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "102", "heart_rate_button");
        LogUtil.a("HwHeartRateHelper", "setFamilyHeartRateRaise status : ", strE, ",heartRateRaiseNumber : ", Integer.valueOf(iN));
        if (CommonUtil.j(strE) == 0) {
            lxgVar.a(0, 0, false);
            LogUtil.a("HwHeartRateHelper", "setFamilyHeartRateDown is close");
        } else if (iN == 0) {
            LogUtil.a("HwHeartRateHelper", "setFamilyHeartRateDown close heart rate raise remind.");
            lxgVar.a(0, 0, false);
        } else {
            LogUtil.a("HwHeartRateHelper", "open heart rate raise remind. heart rate number is ", Integer.valueOf(iN));
            lxgVar.a(1, iN, false);
        }
    }

    private void a(lxg lxgVar) {
        int iN = CommonUtil.n(BaseApplication.getContext(), SharedPreferenceManager.e(BaseApplication.getContext(), "105", "custom.heart_rate_down_remind"));
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "102", "heart_rate_button");
        LogUtil.a("HwHeartRateHelper", "setFamilyHeartRateDown status : ", strE, ",heartRateDownNumber : ", Integer.valueOf(iN));
        if (CommonUtil.j(strE) == 0) {
            lxgVar.c(0, 0, false);
            LogUtil.a("HwHeartRateHelper", "setFamilyHeartRateDown is close");
        } else if (iN == 0) {
            LogUtil.a("HwHeartRateHelper", "setFamilyHeartRateDown close heart rate raise remind.");
            lxgVar.c(0, 0, false);
        } else {
            LogUtil.a("HwHeartRateHelper", "open heart rate down remind. heart rate number is ", Integer.valueOf(iN));
            lxgVar.c(1, iN, false);
        }
    }

    private void d() {
        LogUtil.a("HwHeartRateHelper", "enter handleBloodOxygen");
        lxg lxgVarC = lxg.c(BaseApplication.getContext());
        final int[] iArr = new int[1];
        final Semaphore semaphore = new Semaphore(1);
        try {
            semaphore.acquire();
            d(lxgVarC, iArr, semaphore);
            semaphore.acquire();
            this.f41569a.getSwitchSetting("custom.blood.oxygen.remind", new IBaseResponseCallback() { // from class: mfd.10
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("HwHeartRateHelper", "handleBloodOxygen errorCode = ", Integer.valueOf(i));
                    int i2 = 0;
                    int iMin = (i == 0 && (obj instanceof String)) ? Math.min(CommonUtil.b(BaseApplication.getContext(), (String) obj, 0), 90) : 0;
                    DeviceCapability deviceCapabilityC = eej.c();
                    if (deviceCapabilityC == null || !deviceCapabilityC.isSupportBloodOxygenDownRemind()) {
                        LogUtil.j("HwHeartRateHelper", "handleBloodOxygen deviceCapability is null or deviceCapability is not support");
                        semaphore.release();
                        return;
                    }
                    if (iArr[0] != 0 && iMin != 0) {
                        LogUtil.a("HwHeartRateHelper", "handleBloodOxygen blood switch status is open");
                        i2 = 1;
                    }
                    lxw.b(i2, iMin);
                    semaphore.release();
                }
            });
        } catch (InterruptedException unused) {
            LogUtil.e("HwHeartRateHelper", "handleBloodOxygen InterruptedException");
        }
    }

    private void d(final lxg lxgVar, final int[] iArr, final Semaphore semaphore) {
        this.f41569a.getSwitchSetting("custom.blood.oxygen.switch", new IBaseResponseCallback() { // from class: mfd.7
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("HwHeartRateHelper", "getBloodOxygenSwitch errorCode = ", Integer.valueOf(i));
                int iB = (i == 0 && (obj instanceof String)) ? CommonUtil.b(BaseApplication.getContext(), (String) obj, 0) : 0;
                iArr[0] = iB;
                lxgVar.b(iB);
                semaphore.release();
            }
        });
    }

    private void c(final int[] iArr, final Semaphore semaphore) {
        LogUtil.a("HwHeartRateHelper", "syncHeartRateButtonEnableHandleLock enter.");
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC == null) {
            LogUtil.j("HwFitnessManager", "syncHeartRateButtonEnableHandleLock deviceCapability is null");
            semaphore.release();
            return;
        }
        if (!deviceCapabilityC.isSupportHeartRateEnable()) {
            LogUtil.j("HwFitnessManager", "syncHeartRateButtonEnableHandleLock is not support");
            semaphore.release();
        } else {
            if (!deviceCapabilityC.isSupportHeartRateEnable() || deviceCapabilityC.isSupportContinueHeartRate()) {
                return;
            }
            if (lxg.c(BaseApplication.getContext()).c()) {
                lxw.e(CommonUtil.j(SharedPreferenceManager.e(BaseApplication.getContext(), "102", "heart_rate_button")));
            } else {
                this.f41569a.getSwitchSetting("heart_rate_button", new IBaseResponseCallback() { // from class: mfd.8
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        int iA;
                        LogUtil.a("HwFitnessManager", "HEART_RATE_BUTTON errorCode: ", Integer.valueOf(i));
                        if (obj instanceof String) {
                            iA = lsk.a((String) obj, 10);
                            LogUtil.a("05", 1, "HwFitnessManager", "syncHeartRateButtonEnableHandleLock btValue:", Integer.valueOf(iA));
                        } else {
                            iA = 0;
                        }
                        iArr[0] = iA;
                        lxw.e(iA);
                        semaphore.release();
                    }
                });
            }
        }
    }

    public void d(DeviceInfo deviceInfo) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
            return;
        }
        mfn.e().c(new mfp("heart_rate_switch", 1, a(), eej.a(deviceInfo.getDeviceIdentify())));
        mfn.e().c(new mfo("core_sleep_switch", 1, a()));
        mfn.e().d(1);
    }

    public void b() {
        LogUtil.a("HwHeartRateHelper", "syncToSendHeartSwitch enter");
        DeviceInfo deviceInfoD = mgg.d("HwHeartRateHelper");
        if (deviceInfoD == null || TextUtils.isEmpty(deviceInfoD.getDeviceIdentify())) {
            LogUtil.a("HwHeartRateHelper", "syncToSendHeartSwitch deviceInfo error");
            return;
        }
        mfn.e().c(new mfp("heart_rate_switch", 1, a(), eej.a(deviceInfoD.getDeviceIdentify())));
        mfn.e().d(1);
    }
}
