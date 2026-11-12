package com.xiaomi.fitness.util;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyVo2MaxReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.item.Vo2MaxItem;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.VO2MaxEntry;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.repo.RepositoryManager;
import defpackage.a52;
import defpackage.c0j;
import defpackage.iji;
import defpackage.n9f;
import defpackage.qpo;
import defpackage.vqr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bH\u0010FJ%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J9\u0010\u001d\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J3\u0010'\u001a\b\u0012\u0004\u0012\u00020\"0\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u000e¢\u0006\u0004\b'\u0010(JK\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00062\b\u0010)\u001a\u0004\u0018\u00010\u00022\u0006\u0010*\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020,\u0018\u00010+¢\u0006\u0004\b/\u00100J+\u00102\u001a\b\u0012\u0004\u0012\u00020.0\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00101\u001a\u00020,2\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b2\u00103JK\u00106\u001a\b\u0012\u0004\u0012\u00020.0\u00062\b\u0010)\u001a\u0004\u0018\u00010\u00022\u0006\u0010*\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020,\u0018\u00010+2\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J+\u00108\u001a\b\u0012\u0004\u0012\u00020.0\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00101\u001a\u00020,2\u0006\u00105\u001a\u000204¢\u0006\u0004\b8\u00109J\u0013\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u0006¢\u0006\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010>R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010G\u001a\u00020\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\bE\u0010F\u001a\u0004\bC\u0010D¨\u0006I"}, d2 = {"Lcom/xiaomi/fitness/util/VO2MaxDataUtil;", "", "Lorg/joda/time/LocalDate;", "localDate", "", "level", "", "Lcom/xiaomi/fitness/chart/entrys/VO2MaxEntry;", "createDayEntriesHome", "(Lorg/joda/time/LocalDate;I)Ljava/util/List;", "Lcom/xiaomi/fit/fitness/export/data/item/Vo2MaxItem;", "vo2MaxItem", "getLevel", "(Lcom/xiaomi/fit/fitness/export/data/item/Vo2MaxItem;)I", "", "getLevelString", "(I)Ljava/lang/String;", "age", "Ln9f;", "getFemaleMaxMin", "(I)Ln9f;", "getMaleMaxMin", "La52;", "attrs", "index", "", "startTime", "endTime", "currentDate", "getVo2MaxDayBarEntryType", "(La52;IJJLorg/joda/time/LocalDate;)I", "Landroid/content/Context;", "context", "value", "Lqpo;", "createSummaryModelList", "(Landroid/content/Context;II)Ljava/util/List;", "changeValue", "tag", "createWeekMonthSummaryModelList", "(Landroid/content/Context;IILjava/lang/String;)Ljava/util/List;", "startLocalDate", "endLocalDate", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyVo2MaxReport;", "reportMap", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "createDayEntries", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;La52;Ljava/util/Map;)Ljava/util/List;", "report", "createDayLineChartEntries", "(La52;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyVo2MaxReport;Lorg/joda/time/LocalDate;)Ljava/util/List;", "", "isWeek", "createWeekMonthEntries", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;La52;Ljava/util/Map;Z)Ljava/util/List;", "fillWeekMonthMaxMinEntry", "(La52;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyVo2MaxReport;Z)Ljava/util/List;", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView$LevelItem;", "getVo2MaxLevelItems", "()Ljava/util/List;", "VO2MAX_LEVEL_COUNT", "I", "MIN_MAX_OFFSET", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "userInfoMgr", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "getMaxMinModel", "()Ln9f;", "getMaxMinModel$annotations", "()V", "maxMinModel", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nVO2MaxDataUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VO2MaxDataUtil.kt\ncom/xiaomi/fitness/util/VO2MaxDataUtil\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,491:1\n37#2:492\n36#2,3:493\n*S KotlinDebug\n*F\n+ 1 VO2MaxDataUtil.kt\ncom/xiaomi/fitness/util/VO2MaxDataUtil\n*L\n319#1:492\n319#1:493,3\n*E\n"})
public final class VO2MaxDataUtil {
    public static final int MIN_MAX_OFFSET = 5;
    public static final int VO2MAX_LEVEL_COUNT = 7;

    @NotNull
    public static final VO2MaxDataUtil INSTANCE = new VO2MaxDataUtil();

    @NotNull
    private static final UserInfoManager userInfoMgr = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE);

    private VO2MaxDataUtil() {
    }

    @JvmStatic
    @NotNull
    public static final List<VO2MaxEntry> createDayEntriesHome(@NotNull LocalDate localDate, int level) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        float[] fArr = {0.2f, 0.3f, 0.4f, 0.5f, 0.6f, 0.7f, 0.8f};
        int i = 0;
        int[] iArr = {0, 0, 0, 0, 0, 0, 0};
        switch (level) {
            case 1:
                iArr = new int[]{1, 0, 0, 0, 0, 0, 0};
                break;
            case 2:
                iArr = new int[]{1, 1, 0, 0, 0, 0, 0};
                break;
            case 3:
                iArr = new int[]{1, 1, 1, 0, 0, 0, 0};
                break;
            case 4:
                iArr = new int[]{1, 1, 1, 1, 0, 0, 0};
                break;
            case 5:
                iArr = new int[]{1, 1, 1, 1, 1, 0, 0};
                break;
            case 6:
                iArr = new int[]{1, 1, 1, 1, 1, 1, 0};
                break;
            case 7:
                iArr = new int[]{1, 1, 1, 1, 1, 1, 1};
                break;
        }
        ArrayList arrayList = new ArrayList();
        LocalDate localDatePlusDays = localDate.plusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        for (int i2 = 7; i < i2; i2 = 7) {
            VO2MaxEntry vO2MaxEntry = new VO2MaxEntry(i, iArr[i], jChangZeroOfTheDay - 10800, 3, i);
            vO2MaxEntry.localDate = localDate;
            vO2MaxEntry.d = fArr[i];
            arrayList.add(vO2MaxEntry);
            jChangZeroOfTheDay -= TimeDateUtil.TIME_HOUR;
            i++;
        }
        return arrayList;
    }

    private final n9f getFemaleMaxMin(int age) {
        if (age >= 60) {
            return new n9f(35.0f, 11.0f);
        }
        if (age >= 55) {
            return new n9f(38.0f, 13.0f);
        }
        if (age >= 50) {
            return new n9f(41.0f, 14.0f);
        }
        if (age >= 45) {
            return new n9f(43.0f, 16.0f);
        }
        if (age >= 40) {
            return new n9f(46.0f, 17.0f);
        }
        if (age >= 35) {
            return new n9f(49.0f, 19.0f);
        }
        if (age >= 30) {
            return new n9f(51.0f, 20.0f);
        }
        return age >= 25 ? new n9f(54.0f, 21.0f) : new n9f(56.0f, 22.0f);
    }

    @JvmStatic
    public static final int getLevel(@NotNull Vo2MaxItem vo2MaxItem) {
        Intrinsics.checkNotNullParameter(vo2MaxItem, "vo2MaxItem");
        int age = HealthUtil.getAge();
        int vo2MaxLevel = vo2MaxItem.getVo2MaxLevel(HealthUtil.isFemale(), age);
        Logger.i("VO2MaxDataUtils", "age=" + age + ", isFemale=" + HealthUtil.isFemale() + ", level=" + vo2MaxLevel);
        return vo2MaxLevel;
    }

    @JvmStatic
    @NotNull
    public static final String getLevelString(int level) {
        Application app = AppUtil.getApp();
        switch (level) {
            case 0:
            case 1:
                String string = app.getString(c0j.Lo);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            case 2:
                String string2 = app.getString(c0j.Ko);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            case 3:
                String string3 = app.getString(c0j.Io);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            case 4:
                String string4 = app.getString(c0j.Go);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return string4;
            case 5:
                String string5 = app.getString(c0j.Ho);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return string5;
            case 6:
                String string6 = app.getString(c0j.Fo);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                return string6;
            case 7:
                String string7 = app.getString(c0j.Jo);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                return string7;
            default:
                String string8 = app.getString(c0j.Lo);
                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                return string8;
        }
    }

    private final n9f getMaleMaxMin(int age) {
        if (age >= 60) {
            return new n9f(45.0f, 16.0f);
        }
        if (age >= 55) {
            return new n9f(48.0f, 17.0f);
        }
        if (age >= 50) {
            return new n9f(51.0f, 19.0f);
        }
        if (age >= 45) {
            return new n9f(53.0f, 20.0f);
        }
        if (age >= 40) {
            return new n9f(56.0f, 21.0f);
        }
        if (age >= 35) {
            return new n9f(59.0f, 23.0f);
        }
        if (age >= 30) {
            return new n9f(61.0f, 24.0f);
        }
        return age >= 25 ? new n9f(64.0f, 26.0f) : new n9f(67.0f, 27.0f);
    }

    @NotNull
    public static final n9f getMaxMinModel() {
        int age = HealthUtil.getAge();
        return HealthUtil.isFemale() ? INSTANCE.getFemaleMaxMin(age) : INSTANCE.getMaleMaxMin(age);
    }

    @JvmStatic
    public static /* synthetic */ void getMaxMinModel$annotations() {
    }

    private final int getVo2MaxDayBarEntryType(a52 attrs, int index, long startTime, long endTime, LocalDate currentDate) {
        if (index == 0) {
            long j = 1000;
            if (TimeUtils.INSTANCE.isSameDay(startTime * j, TimeDateUtil.localDateToTimestamp(currentDate) * j)) {
                return 6;
            }
        }
        if (attrs == null) {
            return 3;
        }
        boolean zIsEndHourOfTheDay = TimeDateUtil.isEndHourOfTheDay(endTime);
        int hourOfTheDay = TimeDateUtil.getHourOfTheDay(startTime);
        if (zIsEndHourOfTheDay && vqr.a(hourOfTheDay, attrs)) {
            return 4;
        }
        if (zIsEndHourOfTheDay) {
            return 1;
        }
        return vqr.a(hourOfTheDay, attrs) ? 2 : 3;
    }

    @NotNull
    public final List<MaxMinEntry> createDayEntries(@Nullable LocalDate startLocalDate, @NotNull LocalDate endLocalDate, @NotNull LocalDate currentDate, @NotNull a52 attrs, @Nullable Map<Long, DailyVo2MaxReport> reportMap) {
        Intrinsics.checkNotNullParameter(endLocalDate, "endLocalDate");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        LinkedList linkedList = new LinkedList();
        while (!endLocalDate.isBefore(startLocalDate)) {
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(endLocalDate);
            DailyVo2MaxReport dailyVo2MaxReport = reportMap != null ? reportMap.get(Long.valueOf(jChangZeroOfTheDay)) : null;
            if (dailyVo2MaxReport == null) {
                dailyVo2MaxReport = new DailyVo2MaxReport(jChangZeroOfTheDay, "days");
            }
            linkedList.addAll(createDayLineChartEntries(attrs, dailyVo2MaxReport, currentDate));
            endLocalDate = endLocalDate.minusDays(1);
        }
        return linkedList;
    }

    @NotNull
    public final List<MaxMinEntry> createDayLineChartEntries(@NotNull a52 attrs, @NotNull DailyVo2MaxReport report, @NotNull LocalDate currentDate) {
        long j;
        int[] valueArray;
        Integer num;
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(report, "report");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        ArrayList arrayList = new ArrayList();
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(report.getTime());
        LocalDate localDatePlusDays = localDateTimestampToLocalDate.plusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        int i = attrs.c;
        long jChangZeroOfTheDay2 = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate);
        HashMap map = new HashMap();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            j = RepositoryManager.GAP_X_MINUTE;
            if (i3 >= i) {
                break;
            }
            long j2 = jChangZeroOfTheDay2 + RepositoryManager.GAP_X_MINUTE;
            map.put(Long.valueOf(jChangZeroOfTheDay2), 0);
            i3++;
            jChangZeroOfTheDay2 = j2;
        }
        List<TimesDataRecordInt> vo2MaxList = report.getVo2MaxList();
        List<TimesDataRecordInt> list = vo2MaxList;
        if (ArrayUtils.isEmpty(list)) {
            Logger.i("VO2MaxDataUtil", "createDayLineChartEntries TimesDataRecordInt is null");
        } else {
            Intrinsics.checkNotNull(vo2MaxList);
            Logger.i("VO2MaxDataUtil", "createDayLineChartEntries TimesDataRecordInt:" + Arrays.toString(list.toArray(new TimesDataRecordInt[0])));
            for (TimesDataRecordInt timesDataRecordInt : vo2MaxList) {
                Intrinsics.checkNotNull(timesDataRecordInt);
                if (map.containsKey(Long.valueOf(timesDataRecordInt.getTime())) && (valueArray = timesDataRecordInt.getValueArray()) != null && valueArray.length > 0) {
                    map.put(Long.valueOf(timesDataRecordInt.getTime()), Integer.valueOf(valueArray[0]));
                }
            }
        }
        long j3 = jChangZeroOfTheDay;
        int i4 = 0;
        while (i4 < i) {
            long j4 = j3 - j;
            int i5 = i4;
            MaxMinEntry maxMinEntry = new MaxMinEntry(i5, (TimeDateUtil.isFuture(j4) || (num = (Integer) map.get(Long.valueOf(j4))) == null) ? i2 : num.intValue(), j4, getVo2MaxDayBarEntryType(attrs, i4, j4, j3, currentDate));
            maxMinEntry.localDate = localDateTimestampToLocalDate;
            arrayList.add(maxMinEntry);
            i4 = i5 + 1;
            j3 = j4;
            i2 = 0;
            j = RepositoryManager.GAP_X_MINUTE;
        }
        return arrayList;
    }

    @NotNull
    public final List<qpo> createSummaryModelList(@NotNull Context context, int value, int level) {
        Intrinsics.checkNotNullParameter(context, "context");
        LinkedList linkedList = new LinkedList();
        linkedList.add(new qpo(context.getString(c0j.oo), String.valueOf(value), context.getString(c0j.Oo)));
        linkedList.add(new qpo(context.getString(c0j.Eo), getLevelString(level), ""));
        return linkedList;
    }

    @NotNull
    public final List<MaxMinEntry> createWeekMonthEntries(@Nullable LocalDate startLocalDate, @NotNull LocalDate endLocalDate, @NotNull a52 attrs, @Nullable Map<Long, DailyVo2MaxReport> reportMap, boolean isWeek) {
        long jChangZeroOfTheDay;
        Intrinsics.checkNotNullParameter(endLocalDate, "endLocalDate");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        ArrayList arrayList = new ArrayList();
        while (!endLocalDate.isBefore(startLocalDate)) {
            if (isWeek) {
                LocalDate localDateMinusWeeks = endLocalDate.minusWeeks(1);
                Intrinsics.checkNotNullExpressionValue(localDateMinusWeeks, "minusWeeks(...)");
                jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateMinusWeeks) + 86400;
            } else {
                jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(TimeDateUtil.getFirstDayOfMonth(endLocalDate));
            }
            DailyVo2MaxReport dailyVo2MaxReport = reportMap != null ? reportMap.get(Long.valueOf(jChangZeroOfTheDay)) : null;
            if (dailyVo2MaxReport == null) {
                dailyVo2MaxReport = new DailyVo2MaxReport(jChangZeroOfTheDay, isWeek ? "weeks" : "months");
            }
            arrayList.addAll(fillWeekMonthMaxMinEntry(attrs, dailyVo2MaxReport, isWeek));
            endLocalDate = isWeek ? endLocalDate.minusWeeks(1) : endLocalDate.minusMonths(1);
        }
        return arrayList;
    }

    @NotNull
    public final List<qpo> createWeekMonthSummaryModelList(@NotNull Context context, int level, int changeValue, @NotNull String tag) {
        String strValueOf;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tag, "tag");
        LinkedList linkedList = new LinkedList();
        linkedList.add(new qpo(context.getString(c0j.Do), getLevelString(level), ""));
        int i = TextUtils.equals(tag, "weeks") ? c0j.Po : c0j.Mo;
        if (changeValue > 0) {
            strValueOf = Marker.ANY_NON_NULL_MARKER + changeValue;
        } else {
            strValueOf = String.valueOf(changeValue);
        }
        linkedList.add(new qpo(context.getString(i), strValueOf, context.getString(c0j.Oo)));
        return linkedList;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006b  */
    @NotNull
    public final List<MaxMinEntry> fillWeekMonthMaxMinEntry(@NotNull a52 attrs, @NotNull DailyVo2MaxReport report, boolean isWeek) {
        LocalDate firstDayOfMonth;
        LocalDate localDatePlusMonths;
        int i;
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(report, "report");
        ArrayList arrayList = new ArrayList();
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(report.getTime());
        if (isWeek) {
            firstDayOfMonth = TimeDateUtil.getWeekMonday(localDateTimestampToLocalDate);
            localDatePlusMonths = firstDayOfMonth.plusWeeks(1);
        } else {
            firstDayOfMonth = TimeDateUtil.getFirstDayOfMonth(localDateTimestampToLocalDate);
            localDatePlusMonths = firstDayOfMonth.plusMonths(1);
        }
        LocalDate localDateMinusDays = localDatePlusMonths.minusDays(1);
        HashMap map = new HashMap();
        List<TimesDataRecordInt> vo2MaxList = report.getVo2MaxList();
        if (!ArrayUtils.isEmpty(vo2MaxList)) {
            Intrinsics.checkNotNull(vo2MaxList);
            for (TimesDataRecordInt timesDataRecordInt : vo2MaxList) {
                int[] valueArray = timesDataRecordInt.getValueArray();
                if (valueArray == null) {
                    i = 0;
                } else if (!(valueArray.length == 0)) {
                    i = valueArray[0];
                } else {
                    i = 0;
                }
                map.put(Long.valueOf(timesDataRecordInt.getTime()), Integer.valueOf(i));
            }
        }
        int i2 = 0;
        while (!localDateMinusDays.isBefore(firstDayOfMonth)) {
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateMinusDays);
            Integer num = (Integer) map.get(Long.valueOf(jChangZeroOfTheDay));
            int iIntValue = num != null ? num.intValue() : 0;
            RecyclerBarEntry.Companion companion = RecyclerBarEntry.INSTANCE;
            MaxMinEntry maxMinEntry = new MaxMinEntry(i2, iIntValue, jChangZeroOfTheDay, isWeek ? companion.getWeekBarEntryType(localDateMinusDays) : companion.getMonthBarEntryType2(attrs, localDateMinusDays));
            maxMinEntry.localDate = localDateMinusDays;
            arrayList.add(maxMinEntry);
            localDateMinusDays = localDateMinusDays.minusDays(1);
            i2++;
        }
        return arrayList;
    }

    @NotNull
    public final List<LevelBarView.LevelItem> getVo2MaxLevelItems() {
        ArrayList arrayList = new ArrayList();
        int i = iji.r0;
        arrayList.add(new LevelBarView.LevelItem(iji.H3, i, c0j.Lo));
        arrayList.add(new LevelBarView.LevelItem(iji.G3, i, c0j.Ko));
        arrayList.add(new LevelBarView.LevelItem(iji.E3, i, c0j.Io));
        arrayList.add(new LevelBarView.LevelItem(iji.C3, i, c0j.Go));
        arrayList.add(new LevelBarView.LevelItem(iji.D3, i, c0j.Ho));
        arrayList.add(new LevelBarView.LevelItem(iji.B3, i, c0j.Fo));
        arrayList.add(new LevelBarView.LevelItem(iji.F3, i, c0j.Jo));
        return arrayList;
    }
}
