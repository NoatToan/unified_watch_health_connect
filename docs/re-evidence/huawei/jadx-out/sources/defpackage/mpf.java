package defpackage;

import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.CommonUtil;
import health.compact.a.StorageParams;

/* JADX INFO: loaded from: classes11.dex */
public class mpf {
    public static void a(mpg mpgVar, long j) {
        if (mpgVar == null) {
            LogUtil.j("BasicMgrSharePreference", "setLastStatusTime fitnessManager is null");
            return;
        }
        StorageParams storageParams = new StorageParams();
        LogUtil.a("05", 1, "BasicMgrSharePreference", "setLastStatusTime lastTimestamp:", Long.valueOf(j));
        mpgVar.setSharedPreference("kStorage_FitnessMgr_Long_LastStatusTimeStamp", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011) + "|" + myo.b() + "|" + j, storageParams);
    }

    public static long e(mpg mpgVar) {
        int iE;
        long j = 0;
        if (mpgVar == null) {
            LogUtil.j("BasicMgrSharePreference", "getLastStatusTime fitnessManager is null");
            return 0L;
        }
        String sharedPreference = mpgVar.getSharedPreference("kStorage_FitnessMgr_Long_LastStatusTimeStamp");
        if (sharedPreference != null && !TextUtils.isEmpty(sharedPreference)) {
            String[] strArrSplit = sharedPreference.split("\\|");
            String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
            if (strArrSplit.length == 3 && strArrSplit[0].equals(accountInfo) && strArrSplit[1].equals(myo.b())) {
                iE = CommonUtil.e(strArrSplit[2], 0);
            } else if (strArrSplit.length != 2 || !strArrSplit[0].equals(myo.b())) {
                LogUtil.j("BasicMgrSharePreference", "lastStatusTime is 0");
            } else {
                iE = CommonUtil.e(strArrSplit[1], 0);
            }
            j = iE;
        }
        LogUtil.a("05", 1, "BasicMgrSharePreference", "getLastStatusTime lastStatusTime:", Long.valueOf(j));
        return j;
    }

    public static long c(mpg mpgVar) {
        long jA = 0;
        if (mpgVar == null) {
            LogUtil.j("BasicMgrSharePreference", "getLastDesTime fitnessManager is null");
            return 0L;
        }
        String sharedPreference = mpgVar.getSharedPreference("kStorage_FitnessMgr_Long_LastDesTimeStamp");
        if (sharedPreference != null && !TextUtils.isEmpty(sharedPreference)) {
            jA = a(0L, sharedPreference.split("\\|"));
        }
        LogUtil.a("05", 1, "BasicMgrSharePreference", "getLastDesTime desTimestamp:", Long.valueOf(jA));
        return jA;
    }

    public static void c(mpg mpgVar, long j) {
        if (mpgVar == null) {
            LogUtil.j("BasicMgrSharePreference", "setLastDesTime fitnessManager is null");
            return;
        }
        StorageParams storageParams = new StorageParams();
        LogUtil.a("05", 1, "BasicMgrSharePreference", "setLastDesTime lastTimestamp:", Long.valueOf(j));
        mpgVar.setSharedPreference("kStorage_FitnessMgr_Long_LastDesTimeStamp", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011) + "|" + myo.b() + "|" + j, storageParams);
    }

    public static long b(mpg mpgVar) {
        long jA = 0;
        if (mpgVar == null) {
            LogUtil.j("BasicMgrSharePreference", "getLastSecondDesTime fitnessManager is null");
            return 0L;
        }
        String sharedPreference = mpgVar.getSharedPreference("kStorage_FitnessMgr_Long_LastDesTimeStamp2");
        if (sharedPreference != null && !TextUtils.isEmpty(sharedPreference)) {
            jA = a(0L, sharedPreference.split("\\|"));
        }
        LogUtil.a("05", 1, "BasicMgrSharePreference", "getLastSecondDesTime desTimestamp:", Long.valueOf(jA));
        return jA;
    }

    private static long a(long j, String[] strArr) {
        return (strArr.length == 3 && strArr[0].equals(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011)) && strArr[1].equals(myo.b())) ? CommonUtil.e(strArr[2], 0) : j;
    }

    public static void b(mpg mpgVar, long j) {
        if (mpgVar == null) {
            LogUtil.j("BasicMgrSharePreference", "setLastSecondDesTime fitnessManager is null");
            return;
        }
        StorageParams storageParams = new StorageParams();
        LogUtil.a("05", 1, "BasicMgrSharePreference", "setLastSecondDesTime lastTimestamp:", Long.valueOf(j));
        mpgVar.setSharedPreference("kStorage_FitnessMgr_Long_LastDesTimeStamp2", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011) + "|" + myo.b() + "|" + j, storageParams);
    }
}
