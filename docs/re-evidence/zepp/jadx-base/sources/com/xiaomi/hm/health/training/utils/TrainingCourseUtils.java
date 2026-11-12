package com.xiaomi.hm.health.training.utils;

import android.content.Context;
import androidx.annotation.Nullable;
import com.xiaomi.hm.health.calendar.utils.DateBeanWrapper;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourse;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourseItem;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.traininglib.util.TrainingDateUtils;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingCourseUtils {
    public static DateBeanWrapper<TrainingCourseItem> getDateTraining(List<DateBeanWrapper<TrainingCourseItem>> list, Date date) {
        for (DateBeanWrapper<TrainingCourseItem> dateBeanWrapper : list) {
            if (dateBeanWrapper.getExtraData() != null && TrainingDateUtils.isSameDay(dateBeanWrapper.getDate(), date)) {
                return dateBeanWrapper;
            }
        }
        return null;
    }

    public static String getDifficulityDegree(Context context, String str) {
        String[] stringArray = context.getResources().getStringArray(R.array.difficulty_title);
        String str2 = stringArray[0];
        if ("JUNIOR_LEVEL".equals(str)) {
            return stringArray[0];
        }
        if ("MIDDLE_LEVEL".equals(str)) {
            return stringArray[1];
        }
        return "HIGH_LEVEL".equals(str) ? stringArray[2] : str2;
    }

    public static DateBeanWrapper<TrainingCourseItem> getFirstDay(List<DateBeanWrapper<TrainingCourseItem>> list) {
        for (DateBeanWrapper<TrainingCourseItem> dateBeanWrapper : list) {
            if (dateBeanWrapper.getExtraData() != null) {
                return dateBeanWrapper;
            }
        }
        return null;
    }

    public static DateBeanWrapper<TrainingCourseItem> getToday(List<DateBeanWrapper<TrainingCourseItem>> list) {
        for (DateBeanWrapper<TrainingCourseItem> dateBeanWrapper : list) {
            if (dateBeanWrapper.getExtraData() != null && TrainingDateUtils.isSameDay(dateBeanWrapper.getDate(), TrainingDateUtils.getNow())) {
                return dateBeanWrapper;
            }
        }
        return null;
    }

    public static int getTodayWeekIndex(List<DateBeanWrapper<TrainingCourseItem>> list, Date date) {
        Iterator<DateBeanWrapper<TrainingCourseItem>> it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            i++;
            if (TrainingDateUtils.isSameDay(it2.next().getDate(), date)) {
                break;
            }
        }
        return i / 7;
    }

    public static DateBeanWrapper<TrainingCourseItem> getlastDay(List<DateBeanWrapper<TrainingCourseItem>> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).getExtraData() != null) {
                return list.get(size);
            }
        }
        return null;
    }

    public static boolean isOutOfDate(@Nullable TrainingCourse trainingCourse) {
        if (trainingCourse == null) {
            return false;
        }
        Date now = TrainingDateUtils.getNow();
        Date date = TrainingDateUtils.formatDate(trainingCourse.startDay, TrainingDateUtils.PATTERN_YMD);
        if (date != null) {
            return TrainingDateUtils.isAfterDay(now, TrainingDateUtils.daysAfter(date, trainingCourse.totalDays - 1));
        }
        return false;
    }

    public static String getDifficulityDegree(Context context, int i) {
        return context.getResources().getStringArray(R.array.difficulty_title)[i - 1];
    }
}
