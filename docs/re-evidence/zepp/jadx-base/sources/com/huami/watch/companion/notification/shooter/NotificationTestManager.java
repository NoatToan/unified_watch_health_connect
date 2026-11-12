package com.huami.watch.companion.notification.shooter;

import android.app.Activity;
import android.content.Intent;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.R;
import com.huami.watch.companion.transport.CompanionModule;
import com.huami.watch.hmwatchmanager.bt_connect.BGService_msg;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.Transporter;

/* JADX INFO: loaded from: classes16.dex */
public class NotificationTestManager {
    public static final String NOTI_REQUEST_GET_MEDAL = "com.huami.notification.test.getmedal";
    public static final String NOTI_REQUEST_LOW_BATTERY = "com.huami.notification.test.lowbattery";
    public static final String NOTI_REQUEST_REACH_DAILY_GOAL = "com.huami.notification.test.reachgoal";
    public static final String NOTI_REQUEST_SCHEDULE_REMINDER = "com.huami.notification.test.schedulereminder";
    public static final String NOTI_REQUEST_SIT_TOO_LONG = "com.huami.notification.test.sittoolong";
    public static final String NOTI_REQUEST_WEATHER = "com.huami.notification.test.weather";

    public static void sendCallingNotification(Activity activity) {
        ((CompanionApplication) activity.getApplication()).getCallingWearHelper().handleCallingToWear(activity.getString(R.string.notification_tester), true);
    }

    public static void sendNotificationRequest(Activity activity, String str) {
        Intent intent = new Intent(activity, (Class<?>) BGService_msg.class);
        intent.setAction(str);
        intent.putExtra("url", str);
        activity.startService(intent);
    }

    public static void sendNotificationRequest(String str, Transporter transporter) {
        if (transporter != null) {
            DataBundle dataBundle = new DataBundle();
            dataBundle.putString("type", str);
            transporter.send(CompanionModule.ACTION_TEST_NOTIFICATION, dataBundle);
        }
    }
}
