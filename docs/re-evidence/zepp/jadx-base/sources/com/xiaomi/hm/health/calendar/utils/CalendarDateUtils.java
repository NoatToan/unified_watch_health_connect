package com.xiaomi.hm.health.calendar.utils;

import com.xiaomi.hm.health.databases.model.trainning.TrainingCourse;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourseItem;
import com.xiaomi.hm.health.traininglib.util.TrainingDateUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class CalendarDateUtils {
    private static final int a = 300;
    private static final int b = 480;
    private static final int c = 660;
    private static final int d = 780;
    private static final int e = 1080;
    private static final int f = 1440;

    private static TrainingCourseItem a(int i, TrainingCourse trainingCourse) {
        ArrayList arrayList = new ArrayList();
        for (TrainingCourseItem trainingCourseItem : trainingCourse.dayTrainingItems) {
            if (trainingCourseItem.trainingId.longValue() == 0) {
                arrayList.add(trainingCourseItem);
            }
        }
        int size = arrayList.size();
        if (size > 0) {
            return (TrainingCourseItem) arrayList.get(i % size);
        }
        TrainingCourseItem trainingCourseItem2 = new TrainingCourseItem();
        trainingCourseItem2.trainingId = 0L;
        return trainingCourseItem2;
    }

    public static boolean containsNewMonth(List<DateBeanWrapper<TrainingCourseItem>> list, int i) {
        int i2 = i / 7;
        if (i2 == 0) {
            return true;
        }
        for (int i3 = 0; i3 < 7; i3++) {
            if (getDay(list.get((i2 * 7) + i3)) == 1) {
                return true;
            }
        }
        return false;
    }

    public static List<DateBeanWrapper<TrainingCourseItem>> getAllCalenderDates(TrainingCourse trainingCourse) {
        List<TrainingCourseItem> list = trainingCourse.dayTrainingItems;
        if (list == null || list.size() <= 0) {
            return null;
        }
        Date now = TrainingDateUtils.getNow();
        Date date = TrainingDateUtils.formatDate(trainingCourse.startDay, TrainingDateUtils.PATTERN_YMD);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(6, trainingCourse.totalDays - 1);
        Date time = calendar.getTime();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
        if (TrainingDateUtils.isBeforeDay(now, date)) {
            calendar2.setTime(now);
        } else {
            calendar2.setTime(date);
        }
        calendar2.set(5, (calendar2.get(5) + 1) - calendar2.get(7));
        Date time2 = calendar2.getTime();
        calendar2.clear();
        calendar2.setTime(time);
        calendar2.set(5, (calendar2.get(5) + 7) - calendar2.get(7));
        Date time3 = calendar2.getTime();
        ArrayList arrayList = new ArrayList();
        calendar2.clear();
        calendar2.setTime(time2);
        int i = 0;
        while (!TrainingDateUtils.isAfterDay(calendar2.getTime(), time3)) {
            Date time4 = calendar2.getTime();
            calendar2.add(5, 1);
            DateBeanWrapper dateBeanWrapper = new DateBeanWrapper();
            dateBeanWrapper.setDate(time4);
            if (TrainingDateUtils.isBeforeDay(time4, now.getTime() < date.getTime() ? now : date)) {
                dateBeanWrapper.setBeforeFirst(true);
            } else if (TrainingDateUtils.isAfterDay(time4, time)) {
                dateBeanWrapper.setAfterLast(true);
            } else {
                int iDayAmount = (int) TrainingDateUtils.dayAmount(time4, date);
                if (iDayAmount > 0) {
                    dateBeanWrapper.setWaitDays(iDayAmount);
                    dateBeanWrapper.setWaitingDay(true);
                    dateBeanWrapper.setExtraData(a(iDayAmount, trainingCourse));
                } else if (i < list.size()) {
                    dateBeanWrapper.setExtraData(list.get(i));
                    i++;
                }
            }
            arrayList.add(dateBeanWrapper);
        }
        return arrayList;
    }

    public static int getDay(DateBeanWrapper<TrainingCourseItem> dateBeanWrapper) {
        if (dateBeanWrapper == null) {
            return 0;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateBeanWrapper.getDate());
        return calendar.get(5);
    }

    public static int getMonth(DateBeanWrapper<TrainingCourseItem> dateBeanWrapper) {
        if (dateBeanWrapper == null) {
            return 0;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateBeanWrapper.getDate());
        return calendar.get(2) + 1;
    }
}
