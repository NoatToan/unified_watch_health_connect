package com.xiaomi.fitness.health.runningindicator;

import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyRunningIndicatorReport;
import com.xiaomi.fit.fitness.export.data.item.RunningIndicatorItem;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.c0j;
import defpackage.iji;
import defpackage.qxi;
import defpackage.vfe;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.Days;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0015\u0010\u0014J+\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\f2\u0006\u0010\u001f\u001a\u00020\u0005¢\u0006\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/health/runningindicator/RunningIndicatorUtil;", "", "Lorg/joda/time/LocalDate;", "localDate", "indexEndLocalDate", "", "getRunningIndicatorBarEntryType", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)I", "runningIndicatorLevel", "", "getRunningAbilityLevelName", "(Ljava/lang/Integer;)Ljava/lang/String;", "", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView$LevelItem;", "getRunningAbilityIndicatorLevelItems", "()Ljava/util/List;", "getRunningAbilityEvaluationStr", "(I)Ljava/lang/String;", "Landroid/text/SpannableString;", "getRunningAbilityPredicationStr", "(Ljava/lang/Integer;)Landroid/text/SpannableString;", "getRunningFreqAdvice", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyRunningIndicatorReport;", "report", "", "isWeek", "Lvfe;", "attrs", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "getLineChartEntries", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyRunningIndicatorReport;ZLvfe;)Ljava/util/List;", "level", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "createHomeEntries", "(I)Ljava/util/List;", "TAG", "Ljava/lang/String;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RunningIndicatorUtil {

    @NotNull
    public static final RunningIndicatorUtil INSTANCE = new RunningIndicatorUtil();

    @NotNull
    public static final String TAG = "RunningIndicatorUtil";

    private RunningIndicatorUtil() {
    }

    private final int getRunningIndicatorBarEntryType(LocalDate localDate, LocalDate indexEndLocalDate) {
        int iAbs = Math.abs(Days.daysBetween(localDate, indexEndLocalDate).getDays());
        return (iAbs % 6 == 0 || iAbs == 29) ? 2 : 3;
    }

    @NotNull
    public final List<RecyclerBarEntry> createHomeEntries(int level) {
        int[] iArr;
        if (level == 0) {
            iArr = new int[]{0, 0, 0, 0, 0};
        } else if (level == 1) {
            iArr = new int[]{1, 0, 0, 0, 0};
        } else if (level == 2) {
            iArr = new int[]{1, 1, 0, 0, 0};
        } else if (level == 3) {
            iArr = new int[]{1, 1, 1, 0, 0};
        } else if (level != 4) {
            iArr = level != 5 ? new int[]{0, 0, 0, 0, 0} : new int[]{1, 1, 1, 1, 1};
        } else {
            iArr = new int[]{1, 1, 1, 1, 0};
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new RecyclerBarEntry(i, iArr[i], System.currentTimeMillis(), 3));
        }
        return arrayList;
    }

    @NotNull
    public final List<MaxMinEntry> getLineChartEntries(@NotNull DailyRunningIndicatorReport report, boolean isWeek, @NotNull vfe attrs) {
        LocalDate firstDayOfMonth;
        LocalDate localDatePlusMonths;
        Intrinsics.checkNotNullParameter(report, "report");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
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
        Logger.d(TAG, "getLineChartEntries startLocalDate=" + firstDayOfMonth + " endLocalDate=" + localDateTimestampToLocalDate);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<RunningIndicatorItem> itemList = report.getItemList();
        if (!ArrayUtils.isEmpty(itemList)) {
            Intrinsics.checkNotNull(itemList);
            for (RunningIndicatorItem runningIndicatorItem : itemList) {
                linkedHashMap.put(Long.valueOf(runningIndicatorItem.getTime()), Float.valueOf(runningIndicatorItem.getRunningIndicator()));
            }
        }
        int i = 0;
        while (!localDateMinusDays.isBefore(firstDayOfMonth)) {
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateMinusDays);
            Number number = (Float) linkedHashMap.get(Long.valueOf(jChangZeroOfTheDay));
            if (number == null) {
                number = 0;
            }
            MaxMinEntry maxMinEntry = new MaxMinEntry(i, number.floatValue(), jChangZeroOfTheDay, isWeek ? 2 : RecyclerBarEntry.INSTANCE.getMonthBarEntryType2(attrs, localDateMinusDays));
            maxMinEntry.localDate = localDateMinusDays;
            ListExtKt.add(arrayList, maxMinEntry);
            localDateMinusDays = localDateMinusDays.minusDays(1);
            i++;
        }
        return arrayList;
    }

    @NotNull
    public final String getRunningAbilityEvaluationStr(int runningIndicatorLevel) {
        if (runningIndicatorLevel == 1) {
            return ResourceExtKt.getString(c0j.nc);
        }
        if (runningIndicatorLevel == 2) {
            return ResourceExtKt.getString(c0j.mc);
        }
        if (runningIndicatorLevel == 3) {
            return ResourceExtKt.getString(c0j.kc);
        }
        if (runningIndicatorLevel != 4) {
            return runningIndicatorLevel != 5 ? "" : ResourceExtKt.getString(c0j.lc);
        }
        return ResourceExtKt.getString(c0j.jc);
    }

    @NotNull
    public final List<LevelBarView.LevelItem> getRunningAbilityIndicatorLevelItems() {
        ArrayList arrayList = new ArrayList();
        int i = iji.r0;
        arrayList.add(new LevelBarView.LevelItem(iji.H3, i, c0j.zc));
        arrayList.add(new LevelBarView.LevelItem(iji.G3, i, c0j.wc));
        arrayList.add(new LevelBarView.LevelItem(iji.C3, i, c0j.yc));
        arrayList.add(new LevelBarView.LevelItem(iji.B3, i, c0j.vc));
        arrayList.add(new LevelBarView.LevelItem(iji.F3, i, c0j.xc));
        return arrayList;
    }

    @NotNull
    public final String getRunningAbilityLevelName(@Nullable Integer runningIndicatorLevel) {
        if (runningIndicatorLevel != null && runningIndicatorLevel.intValue() == 1) {
            return ResourceExtKt.getString(c0j.zc);
        }
        if (runningIndicatorLevel != null && runningIndicatorLevel.intValue() == 2) {
            return ResourceExtKt.getString(c0j.wc);
        }
        if (runningIndicatorLevel != null && runningIndicatorLevel.intValue() == 3) {
            return ResourceExtKt.getString(c0j.yc);
        }
        if (runningIndicatorLevel != null && runningIndicatorLevel.intValue() == 4) {
            return ResourceExtKt.getString(c0j.vc);
        }
        return (runningIndicatorLevel != null && runningIndicatorLevel.intValue() == 5) ? ResourceExtKt.getString(c0j.xc) : "";
    }

    @NotNull
    public final SpannableString getRunningAbilityPredicationStr(@Nullable Integer runningIndicatorLevel) {
        String str;
        int iIndexOf$default;
        int length;
        String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.common_unit_kilometer, 10);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        String string = ResourceExtKt.getString(c0j.Fc);
        String string2 = ResourceExtKt.getString(c0j.Ec, quantityString);
        String string3 = ResourceExtKt.getString(c0j.Dc, quantityString);
        String string4 = ResourceExtKt.getString(c0j.Bc, string);
        String string5 = ResourceExtKt.getString(c0j.Ac, string);
        String string6 = ResourceExtKt.getString(c0j.Cc, string);
        if (runningIndicatorLevel != null && runningIndicatorLevel.intValue() == 1) {
            str = string2;
        } else if (runningIndicatorLevel != null && runningIndicatorLevel.intValue() == 2) {
            str = string3;
        } else if (runningIndicatorLevel != null && runningIndicatorLevel.intValue() == 3) {
            str = string4;
        } else if (runningIndicatorLevel != null && runningIndicatorLevel.intValue() == 4) {
            str = string5;
        } else {
            str = (runningIndicatorLevel != null && runningIndicatorLevel.intValue() == 5) ? string6 : "";
        }
        if (Intrinsics.areEqual(str, "")) {
            return new SpannableString("");
        }
        Intrinsics.checkNotNull(runningIndicatorLevel);
        if (runningIndicatorLevel.intValue() <= 2) {
            iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, quantityString, 0, false, 6, (Object) null);
            length = quantityString.length();
        } else {
            iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, string, 0, false, 6, (Object) null);
            length = string.length();
        }
        int i = length + iIndexOf$default;
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new RelativeSizeSpan(0.53f), iIndexOf$default, i, 17);
        return spannableString;
    }

    @NotNull
    public final SpannableString getRunningFreqAdvice(@Nullable Integer runningIndicatorLevel) {
        String quantityString;
        String str;
        String string;
        if (runningIndicatorLevel != null && runningIndicatorLevel.intValue() == 1) {
            quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.x1, 1);
            string = ResourceExtKt.getString(c0j.tc, ResourceExtKt.getString(c0j.oc), quantityString);
        } else if (runningIndicatorLevel != null && runningIndicatorLevel.intValue() == 2) {
            quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.x1, 2);
            string = ResourceExtKt.getString(c0j.tc, ResourceExtKt.getString(c0j.pc), quantityString);
        } else if (runningIndicatorLevel != null && runningIndicatorLevel.intValue() == 3) {
            quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.x1, 3);
            string = ResourceExtKt.getString(c0j.tc, ResourceExtKt.getString(c0j.qc), quantityString);
        } else {
            if (runningIndicatorLevel == null || runningIndicatorLevel.intValue() != 4) {
                if (runningIndicatorLevel != null && runningIndicatorLevel.intValue() == 5) {
                    quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.x1, 6);
                    string = ResourceExtKt.getString(c0j.tc, ResourceExtKt.getString(c0j.sc), quantityString);
                } else {
                    quantityString = "";
                    str = "";
                }
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, quantityString, 0, false, 6, (Object) null);
                int length = quantityString.length() + iIndexOf$default;
                SpannableString spannableString = new SpannableString(str);
                spannableString.setSpan(new RelativeSizeSpan(0.53f), iIndexOf$default, length, 17);
                return spannableString;
            }
            quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.x1, 6);
            string = ResourceExtKt.getString(c0j.tc, ResourceExtKt.getString(c0j.rc), quantityString);
        }
        str = string;
        int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, quantityString, 0, false, 6, (Object) null);
        int length2 = quantityString.length() + iIndexOf$default2;
        SpannableString spannableString2 = new SpannableString(str);
        spannableString2.setSpan(new RelativeSizeSpan(0.53f), iIndexOf$default2, length2, 17);
        return spannableString2;
    }
}
