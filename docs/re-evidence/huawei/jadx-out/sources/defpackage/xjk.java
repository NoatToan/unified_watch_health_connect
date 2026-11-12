package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OpAnalyticsUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class xjk {
    private static AlarmManager c() {
        Object systemService = BaseApplication.b().getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (systemService instanceof AlarmManager) {
            return (AlarmManager) systemService;
        }
        ReleaseLogUtil.d("R_AlarmManagerUtil", "getAlarmManager object ", systemService);
        return null;
    }

    private static PendingIntent b(long j, int i, Intent intent, int i2) {
        if (intent == null) {
            ReleaseLogUtil.d("R_AlarmManagerUtil", "getPendingIntent intent is null flags ", Integer.valueOf(i2), " requestCode ", Integer.valueOf(i), " timeMillis ", Long.valueOf(j));
            return null;
        }
        intent.setPackage(BaseApplication.d());
        intent.putExtra("timeZoneId", TimeZone.getDefault().getID());
        intent.putExtra("timeMillis", j);
        return PendingIntent.getService(BaseApplication.b(), i, intent, i2);
    }

    private static PendingIntent c(long j, int i, Intent intent, int i2) {
        if (intent == null) {
            ReleaseLogUtil.d("R_AlarmManagerUtil", "getPendingIntent intent is null flags ", Integer.valueOf(i2), " requestCode ", Integer.valueOf(i), " timeMillis ", Long.valueOf(j));
            return null;
        }
        intent.setPackage(BaseApplication.d());
        intent.putExtra("timeZoneId", TimeZone.getDefault().getID());
        intent.putExtra("timeMillis", j);
        return PendingIntent.getBroadcast(BaseApplication.b(), i, intent, i2);
    }

    public static void d(int i, Intent intent, int i2) {
        PendingIntent broadcast = PendingIntent.getBroadcast(BaseApplication.b(), i, intent, i2);
        if (broadcast == null) {
            ReleaseLogUtil.d("R_AlarmManagerUtil", "cancel pendingIntent is null flags ", Integer.valueOf(i2), " requestCode ", Integer.valueOf(i), " intent ", intent);
            return;
        }
        AlarmManager alarmManagerC = c();
        if (alarmManagerC == null) {
            ReleaseLogUtil.d("R_AlarmManagerUtil", "cancel alarmManager is null flags ", Integer.valueOf(i2), " requestCode ", Integer.valueOf(i), " intent ", intent, " pendingIntent ", broadcast);
        } else {
            broadcast.cancel();
            alarmManagerC.cancel(broadcast);
        }
    }

    public static void d(int i, Intent intent, int i2, int i3, long j) {
        PendingIntent pendingIntentC = c(j, i, intent, i2);
        if (pendingIntentC == null) {
            ReleaseLogUtil.d("R_AlarmManagerUtil", "set pendingIntent is null requestCode ", Integer.valueOf(i), " flags ", Integer.valueOf(i2), " type ", Integer.valueOf(i3), " timeMillis ", Long.valueOf(j), " intent ", intent);
            return;
        }
        AlarmManager alarmManagerC = c();
        if (alarmManagerC == null) {
            ReleaseLogUtil.d("R_AlarmManagerUtil", "set alarmManager is null requestCode ", Integer.valueOf(i), " flags ", Integer.valueOf(i2), " type ", Integer.valueOf(i3), " timeMillis ", Long.valueOf(j), " intent ", intent, " pendingIntent ", pendingIntentC);
        } else {
            alarmManagerC.set(i3, j, pendingIntentC);
        }
    }

    public static void b(int i, Intent intent, int i2, int i3, long j) {
        PendingIntent pendingIntentC = c(j, i, intent, i2);
        if (pendingIntentC == null) {
            ReleaseLogUtil.d("R_AlarmManagerUtil", "setExact pendingIntent is null requestCode ", Integer.valueOf(i), " flags ", Integer.valueOf(i2), " type ", Integer.valueOf(i3), " timeMillis ", Long.valueOf(j), " intent ", intent);
            return;
        }
        AlarmManager alarmManagerC = c();
        if (alarmManagerC == null) {
            ReleaseLogUtil.d("R_AlarmManagerUtil", "setExact alarmManager is null requestCode ", Integer.valueOf(i), " flags ", Integer.valueOf(i2), " type ", Integer.valueOf(i3), " timeMillis ", Long.valueOf(j), " intent ", intent, " pendingIntent ", pendingIntentC);
        } else {
            d(alarmManagerC, i3, j, pendingIntentC, "");
        }
    }

    public static void d(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent, String str) {
        if (alarmManager == null) {
            ReleaseLogUtil.d("R_AlarmManagerUtil", "setExactForAlarmPermission alarmManager is null");
            return;
        }
        try {
            if (PermissionUtil.c()) {
                alarmManager.setExact(i, j, pendingIntent);
            } else {
                alarmManager.set(i, j, pendingIntent);
            }
        } catch (SecurityException e) {
            String str2 = str + " setExactForAlarmPermission exception " + e.getMessage();
            ReleaseLogUtil.d("R_AlarmManagerUtil", str2);
            OpAnalyticsUtil.getInstance().setProbabilityProblemEvent(OpAnalyticsConstants.OP_ALARM_PERMISSION_KEY, str2);
        }
    }

    public static void e(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent, String str) {
        if (alarmManager == null) {
            ReleaseLogUtil.d("R_AlarmManagerUtil", "setExactForAlarmPermission alarmManager is null");
            return;
        }
        try {
            if (PermissionUtil.c()) {
                alarmManager.setExactAndAllowWhileIdle(i, j, pendingIntent);
            } else {
                alarmManager.setAndAllowWhileIdle(i, j, pendingIntent);
            }
        } catch (SecurityException e) {
            String str2 = str + " setExactAndAllowWhileIdle exception " + e.getMessage();
            ReleaseLogUtil.c("R_AlarmManagerUtil", str2);
            OpAnalyticsUtil.getInstance().setProbabilityProblemEvent(OpAnalyticsConstants.OP_ALARM_PERMISSION_KEY, str2);
        }
    }

    public static void c(int i, Intent intent, int i2, int i3, long j) {
        PendingIntent pendingIntentC = c(j, i, intent, i2);
        if (pendingIntentC == null) {
            ReleaseLogUtil.d("R_AlarmManagerUtil", "setExactAndAllowWhileIdle pendingIntent is null requestCode ", Integer.valueOf(i), " flags ", Integer.valueOf(i2), " type ", Integer.valueOf(i3), " timeMillis ", Long.valueOf(j), " intent ", intent);
            return;
        }
        AlarmManager alarmManagerC = c();
        if (alarmManagerC == null) {
            ReleaseLogUtil.d("R_AlarmManagerUtil", "setExactAndAllowWhileIdle alarmManager is null requestCode ", Integer.valueOf(i), " flags ", Integer.valueOf(i2), " type ", Integer.valueOf(i3), " timeMillis ", Long.valueOf(j), " intent ", intent, " pendingIntent ", pendingIntentC);
        } else {
            e(alarmManagerC, i3, j, pendingIntentC, "");
        }
    }

    public static void a(int i, Intent intent, int i2, int i3, long j, long j2) {
        PendingIntent pendingIntentC = c(j, i, intent, i2);
        if (pendingIntentC == null) {
            ReleaseLogUtil.d("R_AlarmManagerUtil", "setRepeating pendingIntent is null requestCode ", Integer.valueOf(i), " flags ", Integer.valueOf(i2), " type ", Integer.valueOf(i3), " timeMillis ", Long.valueOf(j), " intervalTimeMillis ", Long.valueOf(j2), " intent ", intent);
            return;
        }
        AlarmManager alarmManagerC = c();
        if (alarmManagerC == null) {
            ReleaseLogUtil.d("R_AlarmManagerUtil", "setRepeating alarmManager is null requestCode ", Integer.valueOf(i), " flags ", Integer.valueOf(i2), " type ", Integer.valueOf(i3), " timeMillis ", Long.valueOf(j), " intervalTimeMillis ", Long.valueOf(j2), " intent ", intent, " pendingIntent ", pendingIntentC);
        } else {
            alarmManagerC.setRepeating(i3, j, j2, pendingIntentC);
        }
    }

    public static void d(int i, Intent intent, int i2, int i3, long j, long j2) {
        PendingIntent pendingIntentB = b(j, i, intent, i2);
        if (pendingIntentB == null) {
            ReleaseLogUtil.d("R_AlarmManagerUtil", "setRepeatingForService pendingIntent is null requestCode ", Integer.valueOf(i), " flags ", Integer.valueOf(i2), " type ", Integer.valueOf(i3), " timeMillis ", Long.valueOf(j), " intervalTimeMillis ", Long.valueOf(j2), " intent ", intent);
            return;
        }
        AlarmManager alarmManagerC = c();
        if (alarmManagerC == null) {
            ReleaseLogUtil.d("R_AlarmManagerUtil", "setRepeatingForService alarmManager is null requestCode ", Integer.valueOf(i), " flags ", Integer.valueOf(i2), " type ", Integer.valueOf(i3), " timeMillis ", Long.valueOf(j), " intervalTimeMillis ", Long.valueOf(j2), " intent ", intent, " pendingIntent ", pendingIntentB);
        } else {
            alarmManagerC.setRepeating(i3, j, j2, pendingIntentB);
        }
    }

    public static TimeZone b(Intent intent) {
        if (intent == null || !intent.hasExtra("timeZoneId")) {
            ReleaseLogUtil.d("R_AlarmManagerUtil", "getTimeZoneForIntent intent ", intent);
            return null;
        }
        String stringExtra = intent.getStringExtra("timeZoneId");
        if (TextUtils.isEmpty(stringExtra)) {
            ReleaseLogUtil.d("R_AlarmManagerUtil", "getTimeZoneForIntent timeZoneId ", stringExtra, " intent ", intent);
            return null;
        }
        return TimeZone.getTimeZone(stringExtra);
    }

    public static int a(TimeZone timeZone) {
        int offset;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (timeZone == null) {
            ReleaseLogUtil.d("R_AlarmManagerUtil", "getOffsetDifferent sourceTimeZone is null");
            offset = 0;
        } else {
            offset = timeZone.getOffset(jCurrentTimeMillis);
        }
        return TimeZone.getDefault().getOffset(jCurrentTimeMillis) - offset;
    }

    public static int e(Intent intent) {
        TimeZone timeZoneB = b(intent);
        if (timeZoneB == null) {
            ReleaseLogUtil.d("R_AlarmManagerUtil", "getOffsetDifferent timeZone is null intent ", intent);
            return 0;
        }
        return a(timeZoneB);
    }

    public static boolean d(Intent intent) {
        return e(intent) != 0;
    }

    public static long e(Intent intent, int i, int i2) {
        Calendar calendarA = a(intent);
        if (calendarA == null) {
            ReleaseLogUtil.d("R_AlarmManagerUtil", "getTimeMillisForResetAlarmManager calendar is null");
            return 0L;
        }
        long timeInMillis = calendarA.getTimeInMillis();
        if (timeInMillis > System.currentTimeMillis()) {
            return timeInMillis;
        }
        calendarA.add(i, i2);
        return calendarA.getTimeInMillis();
    }

    public static Calendar c(TimeZone timeZone, long j) {
        if (timeZone == null || j <= 0) {
            ReleaseLogUtil.d("R_AlarmManagerUtil", "getConvertCalendar timeZone ", timeZone, " timeMillis ", Long.valueOf(j));
            return null;
        }
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(11, calendar.get(11));
        calendar2.set(12, calendar.get(12));
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return calendar2;
    }

    public static Calendar a(Intent intent) {
        if (intent == null || !intent.hasExtra("timeZoneId") || !intent.hasExtra("timeMillis")) {
            ReleaseLogUtil.d("R_AlarmManagerUtil", "getConvertCalendar intent ", intent);
            return null;
        }
        String stringExtra = intent.getStringExtra("timeZoneId");
        if (TextUtils.isEmpty(stringExtra)) {
            ReleaseLogUtil.d("R_AlarmManagerUtil", "getConvertCalendar sourceTimeZoneId ", stringExtra, " intent ", intent);
            return null;
        }
        return c(TimeZone.getTimeZone(stringExtra), intent.getLongExtra("timeMillis", 0L));
    }

    public static long c(Intent intent) {
        long timeInMillis;
        Calendar calendarA = a(intent);
        if (calendarA == null) {
            ReleaseLogUtil.d("R_AlarmManagerUtil", "getConvertTimeMillis calendar is null intent ", intent);
            timeInMillis = 0;
        } else {
            timeInMillis = calendarA.getTimeInMillis();
        }
        if (timeInMillis > 0) {
            return timeInMillis;
        }
        long longExtra = intent.getLongExtra("timeMillis", 0L);
        ReleaseLogUtil.d("R_AlarmManagerUtil", "getConvertTimeMillis timeMillis ", Long.valueOf(longExtra), " calendar ", calendarA, " intent ", intent);
        return longExtra;
    }
}
