package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes17.dex */
public class slq {
    public static void c(final boolean z) {
        LogUtil.a("HealthHeadLinesDataUtil", "saveIsShowToCloud");
        lsy.a(new Runnable() { // from class: slq.4
            @Override // java.lang.Runnable
            public void run() {
                SharedPreferenceManager.c(Integer.toString(10000), "ShowHealthHeadLinesData", String.valueOf(z));
                HiUserPreference hiUserPreference = new HiUserPreference();
                hiUserPreference.setKey("KHealthheadLines_isShowEntrance");
                hiUserPreference.setValue(String.valueOf(z));
                HiHealthManager.d(BaseApplication.b()).setUserPreference(hiUserPreference);
            }
        });
    }

    public static boolean a() {
        LogUtil.a("HealthHeadLinesDataUtil", "getIsShowFromCloud");
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.b()).getUserPreference("KHealthheadLines_isShowEntrance");
        LogUtil.a("HealthHeadLinesDataUtil", "getIsShowFromCloud ", userPreference);
        if (userPreference != null && !TextUtils.isEmpty(userPreference.getValue())) {
            LogUtil.a("HealthHeadLinesDataUtil", "getIsShowFromCloud ", userPreference.getValue());
            SharedPreferenceManager.c(Integer.toString(10000), "ShowHealthHeadLinesData", String.valueOf(!userPreference.getValue().equals("false")));
            return !userPreference.getValue().equals("false");
        }
        SharedPreferenceManager.c(Integer.toString(10000), "ShowHealthHeadLinesData", "true");
        return true;
    }

    public static void e(final boolean z) {
        LogUtil.a("HealthHeadLinesDataUtil", "saveIsLockToCloud");
        lsy.a(new Runnable() { // from class: slq.1
            @Override // java.lang.Runnable
            public void run() {
                HiUserPreference hiUserPreference = new HiUserPreference();
                hiUserPreference.setKey("KHealthheadLines_isEntranceBeResident");
                hiUserPreference.setValue(String.valueOf(z));
                HiHealthManager.d(BaseApplication.b()).setUserPreference(hiUserPreference);
            }
        });
    }
}
