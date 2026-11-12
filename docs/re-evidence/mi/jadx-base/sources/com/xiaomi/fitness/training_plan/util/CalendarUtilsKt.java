package com.xiaomi.fitness.training_plan.util;

import android.content.Context;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.device.manager.internal.extetions.LogExtKt;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.khi;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a\u0012\u0010\r\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a\u0014\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u001a\u0014\u0010\u0012\u001a\u00020\u000f*\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u001a\u0012\u0010\u0013\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010\u001a\u0012\u0010\u0014\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010\u001a\n\u0010\u0015\u001a\u00020\u0001*\u00020\n\u001a\n\u0010\u0016\u001a\u00020\u0010*\u00020\n\u001a\n\u0010\u0017\u001a\u00020\u0001*\u00020\n\u001a\u0012\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f\u001a\u0012\u0010\u0019\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f\u001a\n\u0010\u001a\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u001a\u001a\u00020\u0001*\u00020\u001b\u001a\u0016\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"TAG", "", "trainingPlanDateFormat", "Ljava/text/SimpleDateFormat;", "getTrainingPlanDateFormat", "()Ljava/text/SimpleDateFormat;", "CHINESE_WEEK", "", "addDays", "Lcom/xiaomi/fitness/training_plan/util/DateInfo;", "Ljava/util/Calendar;", "dayCount", "", "minusDays", "isDayBefore", "", "Ljava/util/Date;", DialWidgetType.DATE, "isDayAfter", "isSameYear", "isSameWeek", "getFormatDate", "getDate", "getFormatDayOfMonth", "addDay", "minusDay", "getDayOfMonth", "", "getDayOfWeekStr", "context", "Landroid/content/Context;", "dayOfWeek", "training-plan_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCalendarUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarUtils.kt\ncom/xiaomi/fitness/training_plan/util/CalendarUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,341:1\n1#2:342\n*E\n"})
public final class CalendarUtilsKt {

    @NotNull
    private static final String TAG = "CalendarUtils";

    @NotNull
    private static final SimpleDateFormat trainingPlanDateFormat = new SimpleDateFormat("yyyy-MM-dd", new Locale(LocaleUtil.getCurrentLocale()));

    @NotNull
    private static final char[] CHINESE_WEEK = {19968, 20108, 19977, 22235, 20116, 20845, 26085};

    @NotNull
    public static final String addDay(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat simpleDateFormat = trainingPlanDateFormat;
            Date date = simpleDateFormat.parse(str);
            Intrinsics.checkNotNull(date);
            calendar.setTime(date);
            Intrinsics.checkNotNull(calendar);
            DateInfo dateInfoAddDays = addDays(calendar, i);
            String str2 = simpleDateFormat.format(new Date(dateInfoAddDays.getYear(), dateInfoAddDays.getMonth(), dateInfoAddDays.getDay()));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            return str2;
        } catch (Exception e) {
            LogExtKt.loge(TAG, "addDay exception with " + str + " - " + i + " " + e.getMessage());
            return "";
        }
    }

    @NotNull
    public static final DateInfo addDays(@NotNull Calendar calendar, int i) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        calendar.add(6, i);
        return new DateInfo(calendar.get(1), calendar.get(2), calendar.get(5));
    }

    @NotNull
    public static final Date getDate(@NotNull Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        return new Date(calendar.get(1), calendar.get(2), calendar.get(5));
    }

    @NotNull
    public static final String getDayOfMonth(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Calendar calendar = Calendar.getInstance();
            Date date = trainingPlanDateFormat.parse(str);
            Intrinsics.checkNotNull(date);
            calendar.setTime(date);
            return String.valueOf(calendar.get(5));
        } catch (Exception e) {
            LogExtKt.loge(TAG, "getDayOfMonth exception with " + str + " - " + e.getMessage());
            return "-1";
        }
    }

    @NotNull
    public static final String getDayOfWeekStr(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        String[] stringArray = ResourceExtKt.getStringArray(context, khi.common_week_array);
        return i == 7 ? stringArray[0] : stringArray[i];
    }

    @NotNull
    public static final String getFormatDate(@NotNull Calendar calendar) {
        Object objValueOf;
        Object objValueOf2;
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        StringBuilder sb = new StringBuilder(i);
        sb.append("-");
        if (i2 > 9) {
            objValueOf = Integer.valueOf(i2);
        } else {
            objValueOf = "0" + i2;
        }
        sb.append(objValueOf);
        sb.append("-");
        if (i3 > 9) {
            objValueOf2 = Integer.valueOf(i3);
        } else {
            objValueOf2 = "0" + i3;
        }
        sb.append(objValueOf2);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public static final String getFormatDayOfMonth(@NotNull Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        int i = calendar.get(5);
        if (i > 9) {
            return String.valueOf(i);
        }
        return "0" + i;
    }

    @NotNull
    public static final SimpleDateFormat getTrainingPlanDateFormat() {
        return trainingPlanDateFormat;
    }

    public static final boolean isDayAfter(@NotNull Date date, @Nullable Date date2) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        if (date2 == null) {
            LogExtKt.logi("Date_compare", "isDayAfter with empty date");
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return calendar2.get(6) - calendar.get(6) > 0;
    }

    public static final boolean isDayBefore(@NotNull Date date, @Nullable Date date2) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        if (date2 == null) {
            LogExtKt.logi("Date_compare", "isDayBefore with empty date");
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return calendar2.get(6) - calendar.get(6) < 0;
    }

    public static final boolean isSameWeek(@NotNull Date date, @NotNull Date date2) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Intrinsics.checkNotNullParameter(date2, "date");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return calendar.get(1) == calendar2.get(1) && calendar.get(3) == calendar2.get(3);
    }

    public static final boolean isSameYear(@NotNull Date date, @NotNull Date date2) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Intrinsics.checkNotNullParameter(date2, "date");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i = calendar.get(1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return i == calendar2.get(1);
    }

    @NotNull
    public static final String minusDay(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat simpleDateFormat = trainingPlanDateFormat;
            Date date = simpleDateFormat.parse(str);
            Intrinsics.checkNotNull(date);
            calendar.setTime(date);
            Intrinsics.checkNotNull(calendar);
            DateInfo dateInfoMinusDays = minusDays(calendar, i);
            String str2 = simpleDateFormat.format(new Date(dateInfoMinusDays.getYear(), dateInfoMinusDays.getMonth(), dateInfoMinusDays.getDay()));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            return str2;
        } catch (Exception e) {
            LogExtKt.loge(TAG, "addDay exception with " + str + " - " + i + " " + e.getMessage());
            return "";
        }
    }

    @NotNull
    public static final DateInfo minusDays(@NotNull Calendar calendar, int i) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        calendar.add(6, -i);
        return new DateInfo(calendar.get(1), calendar.get(2), calendar.get(5));
    }

    @NotNull
    public static final String getDayOfMonth(long j) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date(((long) 1000) * j));
            return String.valueOf(calendar.get(5));
        } catch (Exception e) {
            LogExtKt.loge(TAG, "getDayOfMonth exception with " + j + " - " + e.getMessage());
            return "-1";
        }
    }
}
