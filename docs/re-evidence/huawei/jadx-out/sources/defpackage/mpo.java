package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;

/* JADX INFO: loaded from: classes11.dex */
public class mpo {
    public static void a(long j) {
        StorageParams storageParams = new StorageParams();
        LogUtil.a("FitnessManagerAw70SharePreference", "setLastStatusTime: lastTimeStamp: ", Long.valueOf(j));
        SharedPreferenceManager.e(BaseApplication.getContext(), "100007", "kStorage_FitnessMgr_Long_LastStatusTimeStamp", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011) + "|" + mpz.c() + "|" + Long.toString(j), storageParams);
    }

    public static long c() {
        long j;
        int i;
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "100007", "kStorage_FitnessMgr_Long_LastStatusTimeStamp");
        if (TextUtils.isEmpty(strE)) {
            j = 0;
        } else {
            String[] strArrSplit = strE.split("\\|");
            String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
            try {
                if (strArrSplit.length == 3 && strArrSplit[0].equals(accountInfo) && strArrSplit[1].equals(mpz.c())) {
                    i = Integer.parseInt(strArrSplit[2]);
                } else if (strArrSplit.length == 2 && strArrSplit[0].equals(mpz.c())) {
                    i = Integer.parseInt(strArrSplit[1]);
                } else {
                    LogUtil.j("FitnessManagerAw70SharePreference", "getLastStatusTime(): do nothing.");
                    j = 0;
                }
                j = i;
            } catch (NumberFormatException e) {
                LogUtil.e("FitnessManagerAw70SharePreference", "getLastStatusTime Exception : ", ExceptionUtils.c(e));
            }
        }
        LogUtil.a("FitnessManagerAw70SharePreference", "getLastStatusTime: lastTimeStamp: ", Long.valueOf(j));
        return j;
    }
}
