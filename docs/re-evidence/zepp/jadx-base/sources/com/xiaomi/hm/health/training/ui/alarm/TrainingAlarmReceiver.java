package com.xiaomi.hm.health.training.ui.alarm;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.DrawableRes;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourse;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourseItem;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.ui.activity.TrainedCourseActivity;
import com.xiaomi.hm.health.traininglib.TrainingLib;
import com.xiaomi.hm.health.traininglib.delegate.TrainingDelegate;
import com.xiaomi.hm.health.traininglib.util.TrainingAlarmUtils;
import com.xiaomi.hm.health.traininglib.util.TrainingConfig;
import com.xiaomi.hm.health.traininglib.util.TrainingDBUtils;
import com.xiaomi.hm.health.traininglib.util.TrainingDateUtils;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class TrainingAlarmReceiver extends BroadcastReceiver {
    private static final String a = TrainingAlarmReceiver.class.getSimpleName();
    private static final String b = "com.xiaomi.hm.health.training.alarm.trainingnotify.clicked";
    private static final int c = 4662;

    private Notification a(Context context, String str, String str2, @DrawableRes int i, boolean z, boolean z2, PendingIntent pendingIntent) {
        Uri defaultUri = RingtoneManager.getDefaultUri(2);
        String simpleName = TrainingAlarmReceiver.class.getSimpleName();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(SleepHomeActivity.FROM_NOTIFICATION);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(simpleName, str, 2);
            notificationChannel.setSound(null, null);
            notificationChannel.setDescription(str2);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        NotificationCompat.Builder contentIntent = new NotificationCompat.Builder(context).setSmallIcon(i).setContentTitle(str).setContentText(str2).setAutoCancel(z).setSound(defaultUri).setContentIntent(pendingIntent);
        if (i2 >= 26) {
            contentIntent.setChannelId(simpleName);
        }
        contentIntent.setColor(ContextCompat.getColor(context, R.color.black30));
        contentIntent.setSmallIcon(i);
        if (z2) {
            contentIntent.setVibrate(new long[]{100, 500});
        }
        return contentIntent.build();
    }

    private boolean b(TrainingCourseItem trainingCourseItem, Date date) {
        if (trainingCourseItem == null) {
            return false;
        }
        return TrainingDateUtils.isSameDay(TrainingDateUtils.daysAfter(date, trainingCourseItem.dayIndex.intValue()), TrainingDateUtils.getNow());
    }

    private void c(Context context, TrainingCourse trainingCourse, TrainingCourseItem trainingCourseItem) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(SleepHomeActivity.FROM_NOTIFICATION);
        if (notificationManager == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) TrainingAlarmReceiver.class);
        intent.setAction(b);
        intent.putExtra(TrainingAlarmUtils.TRAINING_COURSE, trainingCourse);
        int i = AMapEngineUtils.HALF_MAX_P20_WIDTH;
        if (Build.VERSION.SDK_INT >= 23) {
            i = 201326592;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, i);
        String quantityString = context.getResources().getQuantityString(R.plurals.training_notify_content, trainingCourseItem.dayIndex.intValue() + 1, Integer.valueOf(trainingCourseItem.dayIndex.intValue() + 1), Integer.valueOf((int) Math.ceil(((double) trainingCourseItem.time.intValue()) / 60000.0d)), trainingCourseItem.name);
        HMLog.i("TrainingAlarm", "训练课程提醒通知:" + quantityString, new Object[0]);
        Notification notificationA = a(context, context.getString(R.string.app_name), quantityString, R.drawable.training_notification_icon, true, false, broadcast);
        notificationA.flags = 16;
        notificationA.priority = 1;
        notificationManager.notify(trainingCourseItem.dayIndex.intValue() + c, notificationA);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        List<TrainingCourseItem> list;
        if (TrainingConfig.getPhoneEnable()) {
            HMLog.d(a, "onReceive", new Object[0]);
            if (!TrainingAlarmUtils.TRAINING_ALARM_ACTION.equals(intent.getAction())) {
                if (b.equals(intent.getAction())) {
                    TrainingDelegate trainingDelegate = TrainingLib.getTrainingDelegate();
                    if (trainingDelegate == null || trainingDelegate.allowToJumpToCoursePageWhenRemindCourse()) {
                        TrainingCourse trainingCourseQueryTrainedCourseFast = (TrainingCourse) intent.getSerializableExtra(TrainingAlarmUtils.TRAINING_COURSE);
                        if (trainingCourseQueryTrainedCourseFast == null) {
                            trainingCourseQueryTrainedCourseFast = TrainingDBUtils.queryTrainedCourseFast();
                        }
                        Intent intent2 = new Intent(context, (Class<?>) TrainedCourseActivity.class);
                        intent2.setFlags(335544320);
                        intent2.putExtra("TRAINING_COURSE", trainingCourseQueryTrainedCourseFast);
                        context.startActivity(intent2);
                        return;
                    }
                    return;
                }
                return;
            }
            TrainingCourse trainingCourse = (TrainingCourse) intent.getSerializableExtra(TrainingAlarmUtils.TRAINING_COURSE);
            TrainingCourseItem trainingCourseItem = (TrainingCourseItem) intent.getSerializableExtra(TrainingAlarmUtils.TRAINING_COURSE_ITEM);
            if (trainingCourse != null && trainingCourseItem != null) {
                if (TrainingDBUtils.isTrainedCourseFinish(trainingCourse.trainingPlanId.longValue(), trainingCourseItem.dayIndex) || !b(trainingCourseItem, TrainingDateUtils.formatDate(trainingCourse.startDay, TrainingDateUtils.PATTERN_YMD))) {
                    return;
                }
                c(context.getApplicationContext(), trainingCourse, trainingCourseItem);
                return;
            }
            TrainingCourse trainingCourseQueryTrainedCourseFast2 = TrainingDBUtils.queryTrainedCourseFast();
            if (trainingCourseQueryTrainedCourseFast2 == null || (list = trainingCourseQueryTrainedCourseFast2.dayTrainingItems) == null || list.size() <= 0) {
                return;
            }
            Date date = TrainingDateUtils.formatDate(trainingCourseQueryTrainedCourseFast2.startDay, TrainingDateUtils.PATTERN_YMD);
            for (TrainingCourseItem trainingCourseItem2 : trainingCourseQueryTrainedCourseFast2.dayTrainingItems) {
                if (trainingCourseItem2 != null && trainingCourseItem2.trainingId.longValue() > 0 && !trainingCourseItem2.isFinished.booleanValue() && b(trainingCourseItem2, date)) {
                    c(context.getApplicationContext(), trainingCourseQueryTrainedCourseFast2, trainingCourseItem2);
                    return;
                }
            }
        }
    }
}
