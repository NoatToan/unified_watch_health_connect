package com.xiaomi.fitness.training_plan.util;

import com.xiaomi.fitness.device.manager.internal.extetions.LogExtKt;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u001d\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\u000f\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\nJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\u0007J\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001b\u001a\u00020\u0005J-\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070 ¢\u0006\u0002\u0010!¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/training_plan/util/CalendarUtils;", "", "<init>", "()V", "calcWeekCount", "", "startDateStr", "", "endDateStr", "startDate", "Ljava/util/Date;", "endDate", "calcWeekDelta", "(Ljava/util/Date;Ljava/util/Date;)Ljava/lang/Integer;", "calcWeekCountFromNow", "calcCurDayOfWeek", "formatDatetime", "datetime", "", "calcDayOfWeek", "dateStr", DialWidgetType.DATE, "calcDayOfMonth", "buildDate", "syncPlanToCalendar", "", "weekIntToChinese", "week", "weeksIntToChinese", "", "weeks", "daysArray", "", "(Ljava/util/List;[Ljava/lang/String;)Ljava/util/List;", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCalendarUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarUtils.kt\ncom/xiaomi/fitness/training_plan/util/CalendarUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,341:1\n1#2:342\n1872#3,3:343\n*S KotlinDebug\n*F\n+ 1 CalendarUtils.kt\ncom/xiaomi/fitness/training_plan/util/CalendarUtils\n*L\n183#1:343,3\n*E\n"})
public final class CalendarUtils {

    @NotNull
    public static final CalendarUtils INSTANCE = new CalendarUtils();

    private CalendarUtils() {
    }

    @Nullable
    public final Date buildDate(@NotNull String dateStr) {
        Intrinsics.checkNotNullParameter(dateStr, "dateStr");
        try {
            return CalendarUtilsKt.getTrainingPlanDateFormat().parse(dateStr);
        } catch (Exception unused) {
            LogExtKt.loge("CalendarUtils", "can not parse date with:" + dateStr + "!!");
            return null;
        }
    }

    public final int calcCurDayOfWeek() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int i = calendar.get(7);
        if (i == 1) {
            return 7;
        }
        return i - 1;
    }

    public final int calcDayOfMonth(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(5);
    }

    public final int calcDayOfWeek(@NotNull String dateStr) {
        Intrinsics.checkNotNullParameter(dateStr, "dateStr");
        try {
            Calendar calendar = Calendar.getInstance();
            Date date = CalendarUtilsKt.getTrainingPlanDateFormat().parse(dateStr);
            Intrinsics.checkNotNull(date);
            calendar.setTime(date);
            int i = calendar.get(7);
            if (i == 1) {
                return 7;
            }
            return i - 1;
        } catch (Exception e) {
            LogExtKt.loge("CalendarUtils", "calcDayOfWeek with " + dateStr + " exception " + e.getMessage());
            return -1;
        }
    }

    public final int calcWeekCount(@NotNull String startDateStr, @NotNull String endDateStr) {
        Intrinsics.checkNotNullParameter(startDateStr, "startDateStr");
        Intrinsics.checkNotNullParameter(endDateStr, "endDateStr");
        try {
            Date date = CalendarUtilsKt.getTrainingPlanDateFormat().parse(startDateStr);
            Intrinsics.checkNotNull(date);
            Date date2 = CalendarUtilsKt.getTrainingPlanDateFormat().parse(endDateStr);
            Intrinsics.checkNotNull(date2);
            return calcWeekCount(date, date2);
        } catch (Exception e) {
            LogExtKt.loge("CalendarUtils", "calcWeekCount exception:" + e.getMessage());
            return -1;
        }
    }

    public final int calcWeekCountFromNow(@NotNull String startDateStr) {
        Intrinsics.checkNotNullParameter(startDateStr, "startDateStr");
        String str = CalendarUtilsKt.getTrainingPlanDateFormat().format(new Date());
        Intrinsics.checkNotNull(str);
        return calcWeekCount(startDateStr, str);
    }

    @Nullable
    public final Integer calcWeekDelta(@NotNull Date startDate, @NotNull Date endDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(startDate);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(endDate);
            if (CalendarUtilsKt.isSameYear(startDate, endDate)) {
                return Integer.valueOf(calendar2.get(3) - calendar.get(3));
            }
            int i = calendar.get(1);
            Calendar calendar3 = Calendar.getInstance();
            Date date = CalendarUtilsKt.getTrainingPlanDateFormat().parse(i + "-12-31");
            Intrinsics.checkNotNull(date);
            calendar3.setTime(date);
            return Integer.valueOf((calendar3.get(3) - calendar.get(3)) + calendar2.get(3));
        } catch (Exception e) {
            LogExtKt.loge("CalendarUtils", "calcWeekCount exception:" + e.getMessage());
            return null;
        }
    }

    @NotNull
    public final String formatDatetime(long datetime) {
        String str = CalendarUtilsKt.getTrainingPlanDateFormat().format(new Date(datetime));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final void syncPlanToCalendar() {
    }

    @Nullable
    public final String weekIntToChinese(int week) {
        if (1 > week || week >= 8) {
            return null;
        }
        return String.valueOf(CalendarUtilsKt.CHINESE_WEEK[week - 1]);
    }

    @NotNull
    public final List<String> weeksIntToChinese(@NotNull List<Integer> weeks, @NotNull String[] daysArray) {
        Intrinsics.checkNotNullParameter(weeks, "weeks");
        Intrinsics.checkNotNullParameter(daysArray, "daysArray");
        Collections.sort(weeks);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : weeks) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            int iIntValue = ((Number) obj).intValue();
            if (1 <= iIntValue && iIntValue < 8) {
                arrayList.add(daysArray[iIntValue - 1]);
            }
            i = i2;
        }
        return arrayList;
    }

    public final int calcDayOfWeek(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            int i = calendar.get(7);
            if (i == 1) {
                return 7;
            }
            return i - 1;
        } catch (Exception e) {
            LogExtKt.loge("CalendarUtils", "calcDayOfWeek with " + date + " exception " + e.getMessage());
            return -1;
        }
    }

    public final int calcWeekCount(@NotNull Date startDate, @NotNull Date endDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        try {
            int iCalcDayOfWeek = calcDayOfWeek(startDate);
            int iCalcDayOfWeek2 = calcDayOfWeek(endDate);
            int i = iCalcDayOfWeek > 1 ? iCalcDayOfWeek - 1 : 0;
            int i2 = iCalcDayOfWeek2 != 7 ? 7 - iCalcDayOfWeek2 : 0;
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(startDate);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(endDate);
            if (!CalendarUtilsKt.isSameYear(startDate, endDate)) {
                int i3 = calendar.get(1);
                Calendar calendar3 = Calendar.getInstance();
                Date date = CalendarUtilsKt.getTrainingPlanDateFormat().parse(i3 + "-12-31");
                Intrinsics.checkNotNull(date);
                calendar3.setTime(date);
                return (((((calendar3.get(6) - calendar.get(6)) + 1) + calendar2.get(6)) + i) + i2) / 7;
            }
            return ((((calendar2.get(6) - calendar.get(6)) + 1) + i) + i2) / 7;
        } catch (Exception e) {
            LogExtKt.loge("CalendarUtils", "calcWeekCount exception:" + e.getMessage());
            return -1;
        }
    }
}
