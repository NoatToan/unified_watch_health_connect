package com.huami.watch.transport.httpsupport;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.huami.watch.transport.httpsupport.global.ConnectionReceiver;
import java.util.Calendar;

/* JADX INFO: loaded from: classes6.dex */
public class AlarmDriver {
    public static void cancelAlarmDriver(Context context, PendingIntent pendingIntent) {
        if (context == null || pendingIntent == null) {
            return;
        }
        ((AlarmManager) context.getSystemService("alarm")).cancel(pendingIntent);
    }

    public static PendingIntent inject(Context context, int i, long j, Intent intent, int i2) {
        if (context == null) {
            return null;
        }
        Log.i("HmAlarm", ".setCustomRepeatAlarm :  intervalTime : " + j + " Intent : " + intent);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(13, (int) (j / 1000));
        PendingIntent broadcast = PendingIntent.getBroadcast(context, i2, intent, Build.VERSION.SDK_INT >= 23 ? 335544320 : 268435456);
        ((AlarmManager) context.getSystemService("alarm")).set(i, calendar.getTimeInMillis(), broadcast);
        return broadcast;
    }

    public static PendingIntent startAlarmDriver(Context context, long j) {
        if (context == null || j < 0) {
            return null;
        }
        Intent intent = new Intent(ConnectionReceiver.ACTION_CALL_OF_DUTY);
        intent.putExtra(ConnectionReceiver.KEY_INTERVAL, j);
        return inject(context, 1, j, intent, 0);
    }

    public static void inject(Context context, int i, int i2, int i3, int i4, long j, Intent intent, int i5) {
        if (context != null) {
            Log.i("HmAlarm", "setCustomRepeatAlarm : time : " + i2 + i3 + i4 + " intervalTime : " + j + " Intent : " + intent);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.set(11, i2);
            calendar2.set(12, i3);
            calendar2.set(13, i4);
            while (calendar2.getTimeInMillis() < calendar.getTimeInMillis()) {
                Log.i("HmAlarm", "alarmCalendar.before(currentCalendar)");
                calendar2.add(13, (int) (j / 1000));
            }
            ((AlarmManager) context.getSystemService("alarm")).setRepeating(i, calendar2.getTimeInMillis(), j, PendingIntent.getBroadcast(context, i5, intent, Build.VERSION.SDK_INT >= 23 ? 335544320 : 268435456));
        }
    }
}
