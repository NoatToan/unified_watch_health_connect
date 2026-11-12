package com.xiaomi.hm.health.traininglib.util;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourse;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourseItem;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingAlarmUtils {
    public static final String TRAINING_ALARM_ACTION = "com.xiaomi.hm.health.training.alarm.trainingnotify";
    public static String TRAINING_COURSE = "TrainingCourse";
    public static String TRAINING_COURSE_ITEM = "TrainingCourseItem";
    private static final String a = "AlarmUtils";

    private static void a(Context context, TrainingCourse trainingCourse, TrainingCourseItem trainingCourseItem, Date date, int i, int i2) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent intent = new Intent();
        intent.setAction(TRAINING_ALARM_ACTION);
        intent.addFlags(16777216);
        intent.putExtra(TRAINING_COURSE, trainingCourse);
        intent.putExtra(TRAINING_COURSE_ITEM, trainingCourseItem);
        int i3 = Build.VERSION.SDK_INT;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, trainingCourseItem.dayIndex.intValue(), intent, i3 >= 23 ? 201326592 : AMapEngineUtils.HALF_MAX_P20_WIDTH);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, i);
        calendar.set(12, i2);
        calendar.set(13, 0);
        calendar.set(14, 0);
        HMLog.i(a, "设置了训练闹钟提醒,时间:" + TimeUtils.debugTime(calendar.getTimeInMillis()) + "    trainingCourse:" + trainingCourse.toString() + "    trainingCourseItem:" + trainingCourseItem.toString(), new Object[0]);
        if (i3 >= 23) {
            alarmManager.setExactAndAllowWhileIdle(0, calendar.getTimeInMillis(), broadcast);
        } else {
            alarmManager.setExact(0, calendar.getTimeInMillis(), broadcast);
        }
    }

    public static void setAlarmByCourse(Context context) {
        TrainingCourse trainingCourseQueryTrainedCourseFast;
        List<TrainingCourseItem> list;
        int hour = TrainingConfig.getHour();
        int minute = TrainingConfig.getMinute();
        boolean phoneEnable = TrainingConfig.getPhoneEnable();
        if (hour < 0 || minute < 0 || !phoneEnable || (trainingCourseQueryTrainedCourseFast = TrainingDBUtils.queryTrainedCourseFast()) == null || (list = trainingCourseQueryTrainedCourseFast.dayTrainingItems) == null || list.size() <= 0) {
            return;
        }
        for (TrainingCourseItem trainingCourseItem : trainingCourseQueryTrainedCourseFast.dayTrainingItems) {
            Date date = TrainingDateUtils.formatDate(trainingCourseQueryTrainedCourseFast.startDay, TrainingDateUtils.PATTERN_YMD);
            if (trainingCourseItem != null && trainingCourseItem.trainingId.longValue() > 0) {
                Date dateDaysAfter = TrainingDateUtils.daysAfter(date, trainingCourseItem.dayIndex.intValue());
                if (TrainingDateUtils.isAfterNow(dateDaysAfter, hour, minute) && (!trainingCourseItem.isFinished.booleanValue() || !TrainingDateUtils.isSameDay(dateDaysAfter, TrainingDateUtils.getNow()))) {
                    a(context, trainingCourseQueryTrainedCourseFast, trainingCourseItem, dateDaysAfter, hour, minute);
                }
            }
        }
    }
}
