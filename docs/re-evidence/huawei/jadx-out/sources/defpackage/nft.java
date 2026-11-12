package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.service.HandleIntentService;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.time.Instant;
import java.time.ZoneId;
import java.time.zone.ZoneOffsetTransition;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes11.dex */
public class nft {
    private static long e;

    public static long a() {
        long epochSecond;
        LogUtil.a("UpdateTimeFreezeUtils", "getChange start.");
        ZoneId zoneIdOf = ZoneId.of(TimeZone.getDefault().getID());
        ZoneOffsetTransition zoneOffsetTransitionNextTransition = zoneIdOf.getRules().nextTransition(Instant.now());
        LogUtil.a("UpdateTimeFreezeUtils", "madridZoneId: ", zoneIdOf);
        if (zoneOffsetTransitionNextTransition != null) {
            epochSecond = zoneOffsetTransitionNextTransition.toEpochSecond();
        } else {
            LogUtil.j("UpdateTimeFreezeUtils", "nextTransition is null.");
            epochSecond = 0;
        }
        long jCurrentTimeMillis = epochSecond - (System.currentTimeMillis() / 1000);
        LogUtil.a("UpdateTimeFreezeUtils", "TIME change seconds: ", Long.valueOf(jCurrentTimeMillis));
        return jCurrentTimeMillis;
    }

    public static void c(long j) {
        Context context = BaseApplication.getContext();
        Intent intent = new Intent(context, (Class<?>) HandleIntentService.class);
        intent.putExtra("type_time_change", 1000);
        long jCurrentTimeMillis = System.currentTimeMillis() + (j * 1000) + 300000;
        if (Math.abs(jCurrentTimeMillis - e) < 120000) {
            LogUtil.j("UpdateTimeFreezeUtils", "AlarmManager cannot be triggered, the interval is less than 2 minutes.");
            return;
        }
        PendingIntent service = PendingIntent.getService(context, 1000, intent, 201326592);
        Object systemService = context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (!(systemService instanceof AlarmManager)) {
            LogUtil.j("UpdateTimeFreezeUtils", "alarmManagerObject is not AlarmManager");
            return;
        }
        try {
            ((AlarmManager) systemService).setExactAndAllowWhileIdle(0, jCurrentTimeMillis, service);
        } catch (SecurityException e2) {
            ReleaseLogUtil.e("DEVMGR_UpdateTimeFreezeUtils", "Summer Camp enableAlarmManger exception ", e2.getMessage());
        }
        e = jCurrentTimeMillis;
    }
}
