package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class wvf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SharedPreferences f52534a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Context f52535c;
    private static final Object d = new Object();
    private static wvf e;

    private wvf() {
    }

    public static wvf e() {
        wvf wvfVar;
        synchronized (d) {
            if (f52535c == null) {
                f52535c = BaseApplication.getContext();
            }
            if (e == null) {
                e = new wvf();
                f52534a = f52535c.getSharedPreferences("sleep_shared_pref_smart_msg", 0);
            }
            wvfVar = e;
        }
        return wvfVar;
    }

    public void b(long j) {
        if (a()) {
            f52534a.edit().putLong("today_zero_clock_time", j).commit();
            LogUtil.a("SharedPreferenceUtils", "set time completed!!! time is : ", Long.valueOf(j));
        }
    }

    public long f() {
        if (a()) {
            return f52534a.getLong("today_zero_clock_time", 0L);
        }
        return 0L;
    }

    public void b(boolean z) {
        if (a()) {
            f52534a.edit().putBoolean("today_is_first_create_smart_card", z).commit();
            LogUtil.a("SharedPreferenceUtils", "set isFirst completed!!!  is : ", Boolean.valueOf(z));
        }
    }

    public boolean b() {
        if (a()) {
            return f52534a.getBoolean("today_is_first_create_smart_card", true);
        }
        return true;
    }

    public void e(boolean z) {
        if (a()) {
            f52534a.edit().putBoolean("is_first_create_questionnaire", z).commit();
            LogUtil.a("SharedPreferenceUtils", "set isFirst completed!!!  is : ", Boolean.valueOf(z));
        }
    }

    public boolean g() {
        if (a()) {
            return f52534a.getBoolean("is_first_create_questionnaire", true);
        }
        return true;
    }

    public void d(final boolean z) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().a("setHeightIsNotSet", new Runnable() { // from class: wvf.5
                @Override // java.lang.Runnable
                public void run() {
                    wvf.this.d(z);
                }
            });
            return;
        }
        if (f52535c == null) {
            LogUtil.d("SharedPreferenceUtils", "setHeightIsNotSet mContext is null");
            return;
        }
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey("height_is_not_set");
        hiUserPreference.setValue(String.valueOf(z));
        HiHealthManager.d(f52535c).setUserPreference(hiUserPreference);
    }

    public boolean c() {
        Context context = f52535c;
        if (context == null) {
            LogUtil.d("SharedPreferenceUtils", "getHeightIsNotSet mContext is null");
            return false;
        }
        HiUserPreference userPreference = HiHealthManager.d(context).getUserPreference("height_is_not_set");
        if (userPreference != null) {
            return "true".equals(userPreference.getValue());
        }
        LogUtil.d("SharedPreferenceUtils", "getHeightIsNotSet userPreference is null");
        SharedPreferences sharedPreferences = f52534a;
        if (sharedPreferences == null) {
            LogUtil.d("SharedPreferenceUtils", "getHeightIsNotSet mSharedPreferences is null");
            return false;
        }
        boolean z = sharedPreferences.getBoolean("height_is_not_set", true);
        d(z);
        return z;
    }

    public String a(String str) {
        return !a() ? "" : f52534a.getString(str, "");
    }

    public void b(String str, String str2) {
        SharedPreferences sharedPreferences = f52534a;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString(str2, str).commit();
        } else {
            LogUtil.c("SharedPreferenceUtils", "mSharedPreferences is null");
        }
    }

    public void c(boolean z) {
        if (a()) {
            f52534a.edit().putBoolean("fasting_lite_open_notice", z).commit();
            LogUtil.a("SharedPreferenceUtils", "set fastingLiteOpenNotice completed!!!  is : ", Boolean.valueOf(z));
        }
    }

    public boolean d() {
        if (a()) {
            return f52534a.getBoolean("fasting_lite_open_notice", true);
        }
        return true;
    }

    public String d(int i) {
        if (!a()) {
            return "";
        }
        return f52534a.getString("fasting_lite_remind_last_time_" + i, "");
    }

    public void d(int i, String str) {
        if (f52535c == null || str == null) {
            LogUtil.d("SharedPreferenceUtils", "mContext or remindLastTime is null");
            return;
        }
        SharedPreferences sharedPreferences = f52534a;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("fasting_lite_remind_last_time_" + i, str).commit();
            LogUtil.a("SharedPreferenceUtils", "set remindLastTime is : ", str);
        }
    }

    public boolean a() {
        if (f52535c != null && f52534a != null) {
            return true;
        }
        LogUtil.c("SharedPreferenceUtils", "mContext or mSharedPreferences is null");
        return false;
    }

    public static boolean a(String str, String str2, long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - SharedPreferenceManager.d(str, str2, 0L) <= j) {
            return false;
        }
        SharedPreferenceManager.c(str, str2, jCurrentTimeMillis);
        return true;
    }
}
