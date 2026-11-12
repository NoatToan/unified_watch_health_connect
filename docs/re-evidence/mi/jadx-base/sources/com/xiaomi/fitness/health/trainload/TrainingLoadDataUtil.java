package com.xiaomi.fitness.health.trainload;

import android.content.Context;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyTrainingLoadReport;
import com.xiaomi.fit.fitness.export.data.item.TrainingLoadItem;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.c0j;
import defpackage.iji;
import defpackage.qpo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Days;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0011J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\t¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\t2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/health/trainload/TrainingLoadDataUtil;", "", "Lorg/joda/time/LocalDate;", "localDate", "indexEndLocalDate", "", "getWtlBarEntryType", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)I", "level", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "createHomeEntries", "(I)Ljava/util/List;", "Landroid/content/Context;", "context", "", "getTrainingLoadTitle", "(Landroid/content/Context;I)Ljava/lang/String;", "getTrainingLoadGradeShortTitle", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView$LevelItem;", "getTrainLoadLevelList", "()Ljava/util/List;", "todayWtl", "todayWtlLevel", "Lqpo;", "createTodayWtlSummaryModelList", "(Landroid/content/Context;II)Ljava/util/List;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTrainingLoadReport;", "report", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "getLineChartEntries", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTrainingLoadReport;)Ljava/util/List;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TrainingLoadDataUtil {

    @NotNull
    public static final TrainingLoadDataUtil INSTANCE = new TrainingLoadDataUtil();

    private TrainingLoadDataUtil() {
    }

    private final int getWtlBarEntryType(LocalDate localDate, LocalDate indexEndLocalDate) {
        int iAbs = Math.abs(Days.daysBetween(localDate, indexEndLocalDate).getDays());
        return (iAbs % 7 == 0 || iAbs == 27) ? 2 : 3;
    }

    @NotNull
    public final List<RecyclerBarEntry> createHomeEntries(int level) {
        int[] iArr;
        if (level == 0) {
            iArr = new int[]{0, 0, 0, 0};
        } else if (level == 1) {
            iArr = new int[]{1, 0, 0, 0};
        } else if (level == 2) {
            iArr = new int[]{0, 1, 0, 0};
        } else if (level != 3) {
            iArr = level != 4 ? new int[]{0, 0, 0, 0} : new int[]{0, 0, 0, 1};
        } else {
            iArr = new int[]{0, 0, 1, 0};
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 4; i++) {
            arrayList.add(new RecyclerBarEntry(i, iArr[i], System.currentTimeMillis(), 3));
        }
        return arrayList;
    }

    @NotNull
    public final List<qpo> createTodayWtlSummaryModelList(@NotNull Context context, int todayWtl, int todayWtlLevel) {
        Intrinsics.checkNotNullParameter(context, "context");
        LinkedList linkedList = new LinkedList();
        linkedList.add(new qpo(context.getString(c0j.Zn), todayWtl > 0 ? String.valueOf(todayWtl) : "--", ""));
        linkedList.add(new qpo(context.getString(c0j.ao), getTrainingLoadGradeShortTitle(context, todayWtlLevel), ""));
        return linkedList;
    }

    @NotNull
    public final List<MaxMinEntry> getLineChartEntries(@NotNull DailyTrainingLoadReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        ArrayList arrayList = new ArrayList();
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(report.getTime());
        LocalDate localDateMinusDays = localDateTimestampToLocalDate.minusDays(27);
        HashMap map = new HashMap();
        List<TrainingLoadItem> dayTLList = report.getDayTLList();
        if (!ArrayUtils.isEmpty(dayTLList)) {
            Intrinsics.checkNotNull(dayTLList);
            for (TrainingLoadItem trainingLoadItem : dayTLList) {
                map.put(Long.valueOf(trainingLoadItem.getTime()), Integer.valueOf(trainingLoadItem.getWtlSum()));
            }
        }
        int i = 0;
        LocalDate localDateMinusDays2 = localDateTimestampToLocalDate;
        while (!localDateMinusDays2.isBefore(localDateMinusDays)) {
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateMinusDays2);
            Integer num = (Integer) map.get(Long.valueOf(jChangZeroOfTheDay));
            MaxMinEntry maxMinEntry = new MaxMinEntry(i, num != null ? num.intValue() : 0, jChangZeroOfTheDay, getWtlBarEntryType(localDateTimestampToLocalDate, localDateMinusDays2));
            maxMinEntry.localDate = localDateMinusDays2;
            ListExtKt.add(arrayList, maxMinEntry);
            localDateMinusDays2 = localDateMinusDays2.minusDays(1);
            i++;
        }
        return arrayList;
    }

    @NotNull
    public final List<LevelBarView.LevelItem> getTrainLoadLevelList() {
        ArrayList arrayList = new ArrayList();
        int i = iji.r0;
        arrayList.add(new LevelBarView.LevelItem(iji.u2, i, c0j.m8));
        arrayList.add(new LevelBarView.LevelItem(iji.s2, i, c0j.j8));
        arrayList.add(new LevelBarView.LevelItem(iji.t2, i, c0j.o8));
        arrayList.add(new LevelBarView.LevelItem(iji.v2, i, c0j.p8));
        return arrayList;
    }

    @NotNull
    public final String getTrainingLoadGradeShortTitle(@NotNull Context context, int level) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (level == 1) {
            String string = context.getString(c0j.l8);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (level == 2) {
            String string2 = context.getString(c0j.k8);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (level == 3) {
            String string3 = context.getString(c0j.q8);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (level != 4) {
            return "--";
        }
        String string4 = context.getString(c0j.n8);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return string4;
    }

    @NotNull
    public final String getTrainingLoadTitle(@NotNull Context context, int level) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (level == 0) {
            String string = context.getString(c0j.Zn);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (level == 1) {
            String string2 = context.getString(c0j.f0do);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (level == 2) {
            String string3 = context.getString(c0j.bo);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (level == 3) {
            String string4 = context.getString(c0j.co);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            return string4;
        }
        if (level != 4) {
            String string5 = context.getString(c0j.f0do);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            return string5;
        }
        String string6 = context.getString(c0j.eo);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        return string6;
    }
}
