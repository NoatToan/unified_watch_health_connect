package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes9.dex */
public class iqa {
    public void a(final Context context) {
        if (Utils.o() || Utils.i()) {
            LogUtil.d("LoginDateHelper", "scene that dont upload");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: iqi
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37966c.b(context);
                }
            });
        }
    }

    /* synthetic */ void b(Context context) {
        String strE = SharedPreferenceManager.e(context, String.valueOf(10000), "user_last_login_date");
        LogUtil.d("LoginDateHelper", "Try to get date record for marketing.");
        if (TextUtils.isEmpty(strE)) {
            LogUtil.d("LoginDateHelper", "loginDate is null. start login date record for marketing.");
            String strValueOf = String.valueOf(System.currentTimeMillis());
            LogUtil.d("LoginDateHelper", "set date record for marketing: ", strValueOf);
            SharedPreferenceManager.e(context, String.valueOf(10000), "user_last_login_date", strValueOf, null);
            SharedPreferenceManager.e(context, String.valueOf(10000), "user_last_login_days", String.valueOf(1), null);
        } else {
            LogUtil.d("LoginDateHelper", "date record for marketing: has the time. record count");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!e(Long.parseLong(strE), jCurrentTimeMillis)) {
                int iN = CommonUtil.n(context, SharedPreferenceManager.e(context, String.valueOf(10000), "user_last_login_days")) + 1;
                SharedPreferenceManager.e(context, String.valueOf(10000), "user_last_login_days", String.valueOf(iN), null);
                SharedPreferenceManager.e(context, String.valueOf(10000), "user_last_login_date", String.valueOf(jCurrentTimeMillis), null);
                LogUtil.d("LoginDateHelper", "date record for marketing: loginCount: ", Integer.valueOf(iN));
            }
            LogUtil.d("LoginDateHelper", "date record for marketing: ", strE);
        }
        HiUserPreference userPreference = HiHealthManager.d(context).getUserPreference("login_timestamp");
        if (userPreference == null || TextUtils.isEmpty(userPreference.getValue())) {
            LogUtil.d("LoginDateHelper", "start upload login_timestamp");
            HiUserPreference hiUserPreference = new HiUserPreference();
            hiUserPreference.setKey("login_timestamp");
            hiUserPreference.setValue(String.valueOf(System.currentTimeMillis()));
            LogUtil.d("LoginDateHelper", "upload login_timestamp status:", Boolean.valueOf(HiHealthManager.d(context).setUserPreference(hiUserPreference)));
        }
    }

    private Calendar e(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        return calendar;
    }

    private boolean e(long j, long j2) {
        Calendar calendarE = e(j);
        Calendar calendarE2 = e(j2);
        return calendarE.get(1) == calendarE2.get(1) && calendarE.get(2) == calendarE2.get(2) && calendarE.get(5) == calendarE2.get(5);
    }
}
