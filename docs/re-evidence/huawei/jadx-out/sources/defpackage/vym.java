package defpackage;

import android.content.Context;
import android.content.Intent;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.main.stories.messageremind.receiver.BloodPressureReminderReceiver;
import com.huawei.ui.main.stories.messageremind.receiver.SportReminderReceiver;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes19.dex */
public class vym {
    private static int b(int i) {
        return i - 1000;
    }

    public static void a(int i, long j, long j2) {
        Context contextB = BaseApplication.b();
        Intent intent = new Intent(contextB, (Class<?>) SportReminderReceiver.class);
        String accountInfo = LoginInit.getInstance(contextB).getAccountInfo(1011);
        intent.putExtra("reminderId", i);
        intent.putExtra("sportReminderHuid", accountInfo);
        intent.putExtra("sportReminderTime", j);
        int iB = b(i);
        b(j, iB, intent, j2, true);
        LogUtil.a("Track_ReminderHelper", "registerRepeatingReminder: ", Integer.valueOf(iB), ", time = ", DateFormatUtil.d(j, DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT));
    }

    public static void b(int i, long j, long j2) {
        if (Math.abs(j - SharedPreferenceManager.d("BloodPressure", "register_time", 0L)) <= 3600000) {
            LogUtil.a("Track_ReminderHelper", "registerBloodPressureReminder, the alarm has been set");
            return;
        }
        Intent intent = new Intent(BaseApplication.b(), (Class<?>) BloodPressureReminderReceiver.class);
        intent.putExtra("reminderId", i);
        intent.putExtra("sportReminderTime", j);
        b(j, i, intent, j2, false);
        SharedPreferenceManager.c("BloodPressure", "register_time", j);
        LogUtil.a("Track_ReminderHelper", "registerBloodPressureReminder: ", Integer.valueOf(i), ", time = ", DateFormatUtil.d(j, DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT));
    }

    private static void b(long j, int i, Intent intent, long j2, boolean z) {
        if (z) {
            xjk.a(i, intent, 201326592, 0, j, j2);
        } else {
            xjk.d(i, intent, 201326592, 0, j);
        }
        ReleaseLogUtil.c("Track_ReminderHelper", "registerReminder isRepeat ", Boolean.valueOf(z), " requestCode ", Integer.valueOf(i), " time ", Long.valueOf(j), " interval ", Long.valueOf(j2));
    }

    public static void c(int i) {
        LogUtil.a("Track_ReminderHelper", "cancelReminder enter ", Integer.valueOf(i));
        Intent intent = new Intent(BaseApplication.b(), (Class<?>) SportReminderReceiver.class);
        intent.setPackage(BaseApplication.d());
        xjk.d(b(i), intent, 201326592);
    }

    public static void d(int i) {
        LogUtil.a("Track_ReminderHelper", "cancelBloodPressureReminder enter ", Integer.valueOf(i));
        Intent intent = new Intent(BaseApplication.b(), (Class<?>) BloodPressureReminderReceiver.class);
        intent.setPackage(BaseApplication.d());
        xjk.d(b(i), intent, 201326592);
    }
}
