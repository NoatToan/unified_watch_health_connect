package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.CommonUtil;
import health.compact.a.StorageParams;

/* JADX INFO: loaded from: classes10.dex */
public class lxf {
    public static void c(lxg lxgVar, long j) {
        if (lxgVar == null) {
            LogUtil.j("FitnessMgrSharePreference", "setLastStatusTime fitnessManager is null");
            return;
        }
        StorageParams storageParams = new StorageParams();
        LogUtil.a("05", 1, "FitnessMgrSharePreference", "setLastStatusTime lastTimestamp:", Long.valueOf(j));
        lxgVar.setSharedPreference("kStorage_FitnessMgr_Long_LastStatusTimeStamp", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011) + "|" + mga.e() + "|" + Long.toString(j), storageParams);
    }

    public static long a(lxg lxgVar) {
        int iE;
        long j = 0;
        if (lxgVar == null) {
            LogUtil.j("FitnessMgrSharePreference", "getLastStatusTime fitnessManager is null");
            return 0L;
        }
        String sharedPreference = lxgVar.getSharedPreference("kStorage_FitnessMgr_Long_LastStatusTimeStamp");
        if (sharedPreference != null && !TextUtils.isEmpty(sharedPreference)) {
            String[] strArrSplit = sharedPreference.split("\\|");
            String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
            if (strArrSplit.length == 3 && strArrSplit[0].equals(accountInfo) && strArrSplit[1].equals(mga.e())) {
                iE = CommonUtil.e(strArrSplit[2], 0);
            } else if (strArrSplit.length != 2 || !strArrSplit[0].equals(mga.e())) {
                LogUtil.j("FitnessMgrSharePreference", "lastStatusTime is 0");
            } else {
                iE = CommonUtil.e(strArrSplit[1], 0);
            }
            j = iE;
        }
        LogUtil.a("05", 1, "FitnessMgrSharePreference", "getLastStatusTime lastStatusTime:", Long.valueOf(j));
        return j;
    }

    public static boolean d(lxg lxgVar) {
        if (lxgVar == null) {
            LogUtil.j("FitnessMgrSharePreference", "getReverseDataSyncEnable fitnessManager is null");
            return false;
        }
        LogUtil.a("FitnessMgrSharePreference", "getReverseDataSyncEnable reverseString:", lxgVar.getSharedPreference("kStorage_FitnessMgr_Boolean_ReverseSyncEnable"));
        return false;
    }

    public static void d(Context context, int i, IBaseResponseCallback iBaseResponseCallback) {
        if (context == null) {
            LogUtil.j("FitnessMgrSharePreference", "setCoreSleepButtonEnable context is null");
            return;
        }
        LogUtil.a("05", 1, "FitnessMgrSharePreference", "setCoreSleepButtonEnable enable:", Integer.valueOf(i));
        String string = Integer.toString(i);
        mhs mhsVarA = mhs.a();
        if (mhsVarA == null) {
            LogUtil.j("FitnessMgrSharePreference", "setCoreSleepButtonEnable switchSettingManager is null");
        } else {
            mhsVarA.setSwitchSetting("core_sleep_button", string, iBaseResponseCallback);
            mhw.c(string);
        }
    }

    public static void a(Context context, int i, IBaseResponseCallback iBaseResponseCallback) {
        if (context == null) {
            LogUtil.j("FitnessMgrSharePreference", "setHeartRateButtonEnable context is null");
            return;
        }
        LogUtil.a("05", 1, "FitnessMgrSharePreference", "setHeartRateButtonEnable:", Integer.valueOf(i));
        mhs mhsVarA = mhs.a();
        if (mhsVarA == null) {
            LogUtil.j("FitnessMgrSharePreference", "setHeartRateButtonEnable switchSettingManager is null");
            return;
        }
        String string = Integer.toString(i);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        mhsVarA.setSwitchSetting("heart_rate_button", string, iBaseResponseCallback);
    }

    public static long b(lxg lxgVar) {
        long jE = 0;
        if (lxgVar == null) {
            LogUtil.j("FitnessMgrSharePreference", "getLastDesTime fitnessManager is null");
            return 0L;
        }
        String sharedPreference = lxgVar.getSharedPreference("kStorage_FitnessMgr_Long_LastDesTimeStamp");
        if (sharedPreference != null && !TextUtils.isEmpty(sharedPreference)) {
            jE = e(0L, sharedPreference.split("\\|"));
        }
        LogUtil.a("05", 1, "FitnessMgrSharePreference", "getLastDesTime desTimestamp:", Long.valueOf(jE));
        return jE;
    }

    public static void a(lxg lxgVar, long j) {
        if (lxgVar == null) {
            LogUtil.j("FitnessMgrSharePreference", "setLastDesTime fitnessManager is null");
            return;
        }
        StorageParams storageParams = new StorageParams();
        LogUtil.a("05", 1, "FitnessMgrSharePreference", "setLastDesTime lastTimestamp:", Long.valueOf(j));
        lxgVar.setSharedPreference("kStorage_FitnessMgr_Long_LastDesTimeStamp", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011) + "|" + mga.e() + "|" + Long.toString(j), storageParams);
    }

    public static long c(lxg lxgVar) {
        long jE = 0;
        if (lxgVar == null) {
            LogUtil.j("FitnessMgrSharePreference", "getLastSecondDesTime fitnessManager is null");
            return 0L;
        }
        String sharedPreference = lxgVar.getSharedPreference("kStorage_FitnessMgr_Long_LastDesTimeStamp2");
        if (sharedPreference != null && !TextUtils.isEmpty(sharedPreference)) {
            jE = e(0L, sharedPreference.split("\\|"));
        }
        LogUtil.a("05", 1, "FitnessMgrSharePreference", "getLastSecondDesTime desTimestamp:", Long.valueOf(jE));
        return jE;
    }

    private static long e(long j, String[] strArr) {
        return (strArr.length == 3 && strArr[0].equals(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011)) && strArr[1].equals(mga.e())) ? CommonUtil.e(strArr[2], 0) : j;
    }

    public static void e(lxg lxgVar, long j) {
        if (lxgVar == null) {
            LogUtil.j("FitnessMgrSharePreference", "setLastSecondDesTime fitnessManager is null");
            return;
        }
        StorageParams storageParams = new StorageParams();
        LogUtil.a("05", 1, "FitnessMgrSharePreference", "setLastSecondDesTime lastTimestamp:", Long.valueOf(j));
        lxgVar.setSharedPreference("kStorage_FitnessMgr_Long_LastDesTimeStamp2", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011) + "|" + mga.e() + "|" + Long.toString(j), storageParams);
    }

    public static void b(int i) {
        mim.e(mil.c("FitnessMgrSharePreference"), "continuous_temp_monitoring", Integer.toString(i));
    }

    public static void b(int i, int i2) {
        mim.e(mil.c("FitnessMgrSharePreference"), "temperature_upper_remind", Float.toString(i2 / 10.0f));
    }

    public static void d(int i, int i2) {
        mim.e(mil.c("FitnessMgrSharePreference"), "temperature_lower_remind", Float.toString(i2 / 10.0f));
    }

    public static void c(final int i) {
        final mhs mhsVarA = mhs.a();
        if (mhsVarA == null) {
            LogUtil.j("FitnessMgrSharePreference", "setContinueHeartRateStatus switchSettingManager is null");
        } else {
            mhsVarA.setSwitchSetting("continue_heart_rate", Integer.toString(i), new IBaseResponseCallback() { // from class: lxf.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    if (i2 != 0) {
                        LogUtil.j("FitnessMgrSharePreference", "setContinueHeartRateStatus continue errorCode:", Integer.valueOf(i2));
                    } else {
                        mhsVarA.setSwitchSetting("heart_rate_mode", Integer.toString(0), new IBaseResponseCallback() { // from class: lxf.2.5
                            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                            /* JADX INFO: renamed from: onResponse */
                            public void a(int i3, Object obj2) {
                                LogUtil.a("FitnessMgrSharePreference", "setContinueHeartRateStatus errorCode :", Integer.valueOf(i3));
                                if (i3 == 0) {
                                    lxw.a(i);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public static void a(final int i) {
        final mhs mhsVarA = mhs.a();
        if (mhsVarA == null) {
            LogUtil.j("FitnessMgrSharePreference", "setCycleHeartRateStatus switchSettingManager is null");
        } else {
            mhsVarA.setSwitchSetting("continue_heart_rate", Integer.toString(i), new IBaseResponseCallback() { // from class: lxf.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    if (i2 != 0) {
                        LogUtil.j("FitnessMgrSharePreference", "setCycleHeartRateStatus continue errorCode:", Integer.valueOf(i2));
                    } else {
                        mhsVarA.setSwitchSetting("heart_rate_mode", Integer.toString(1), new IBaseResponseCallback() { // from class: lxf.1.1
                            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                            /* JADX INFO: renamed from: onResponse */
                            public void a(int i3, Object obj2) {
                                LogUtil.a("FitnessMgrSharePreference", "setCycleHeartRateStatus errorCode :", Integer.valueOf(i3));
                                if (i3 == 0) {
                                    lxw.e(i);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public static void e(final int i, int i2) {
        mhs mhsVarA = mhs.a();
        if (mhsVarA == null) {
            LogUtil.j("FitnessMgrSharePreference", "setBloodOxygenRemind switchSettingManager is null");
            return;
        }
        final int iMin = Math.min(i2, 90);
        mhsVarA.setSwitchSetting("custom.blood.oxygen.remind", iMin + "", new IBaseResponseCallback() { // from class: lxf.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i3, Object obj) {
                if (i3 == 0) {
                    lxw.b(i, iMin);
                }
            }
        });
    }

    public static void c(final int i, final int i2) {
        mhs mhsVarA = mhs.a();
        if (mhsVarA == null) {
            LogUtil.j("FitnessMgrSharePreference", "setHeartRateRaiseRemind switchSettingManager is null");
            return;
        }
        mhsVarA.setSwitchSetting("custom.heart_rate_raise_remind", i2 + "", new IBaseResponseCallback() { // from class: lxf.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i3, Object obj) {
                if (i3 == 0) {
                    LogUtil.a("FitnessMgrSharePreference", "heartRateRaiseRemind setSwitchSetting success.");
                    lxw.c(i, i2);
                }
            }
        });
    }

    public static void a(final int i, final int i2) {
        mhs mhsVarA = mhs.a();
        if (mhsVarA == null) {
            LogUtil.j("FitnessMgrSharePreference", "setHeartRateDownRemind switchSettingManager is null");
            return;
        }
        mhsVarA.setSwitchSetting("custom.heart_rate_down_remind", i2 + "", new IBaseResponseCallback() { // from class: lxf.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i3, Object obj) {
                if (i3 == 0) {
                    LogUtil.a("FitnessMgrSharePreference", "heartRateDownRemind setSwitchSetting success.");
                    lxw.a(i, i2);
                }
            }
        });
    }

    public static void e(final int i) {
        mhs mhsVarA = mhs.a();
        if (mhsVarA == null) {
            LogUtil.j("FitnessMgrSharePreference", "setBloodOxygenSwitch switchSettingManager is null");
            return;
        }
        mhsVarA.setSwitchSetting("custom.blood.oxygen.switch", i + "", new IBaseResponseCallback() { // from class: lxf.8
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                if (i2 == 0) {
                    lxw.b(i);
                }
            }
        });
    }
}
