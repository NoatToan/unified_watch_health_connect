package com.xiaomi.fitness.health.physicalstatus;

import android.app.Application;
import android.content.Context;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyPhysicalStatusReport;
import com.xiaomi.fit.fitness.export.data.item.PhysicalStatusItem;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.chart.entrys.PhysicalStatusEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
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
import org.jetbrains.annotations.Nullable;
import org.joda.time.Days;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000e¢\u0006\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/health/physicalstatus/PhysicalStatusDataUtil;", "", "Lorg/joda/time/LocalDate;", "localDate", "indexEndLocalDate", "", "getWtlBarEntryType", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)I", "Landroid/content/Context;", "context", "level", "", "getPhysicalStatusTitle", "(Landroid/content/Context;I)Ljava/lang/String;", "", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "createHomeEntries", "(I)Ljava/util/List;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyPhysicalStatusReport;", "report", "mSelectDate", "dataType", "Lcom/xiaomi/fitness/chart/entrys/PhysicalStatusEntry;", "createDayEntries", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyPhysicalStatusReport;Lorg/joda/time/LocalDate;I)Ljava/util/List;", "todayWtl", "todayWtlLevel", "Lqpo;", "createTodayPhysicalStatusSummaryModelList", "(Landroid/content/Context;Ljava/lang/Integer;I)Ljava/util/List;", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView$LevelItem;", "getPhysicalStatusLevelList", "()Ljava/util/List;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class PhysicalStatusDataUtil {

    @NotNull
    public static final PhysicalStatusDataUtil INSTANCE = new PhysicalStatusDataUtil();

    private PhysicalStatusDataUtil() {
    }

    public static /* synthetic */ List createDayEntries$default(PhysicalStatusDataUtil physicalStatusDataUtil, DailyPhysicalStatusReport dailyPhysicalStatusReport, LocalDate localDate, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return physicalStatusDataUtil.createDayEntries(dailyPhysicalStatusReport, localDate, i);
    }

    private final int getWtlBarEntryType(LocalDate localDate, LocalDate indexEndLocalDate) {
        int iAbs = Math.abs(Days.daysBetween(localDate, indexEndLocalDate).getDays());
        return (iAbs % 7 == 0 || iAbs == 41) ? 2 : 3;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0078  */
    @NotNull
    public final List<PhysicalStatusEntry> createDayEntries(@Nullable DailyPhysicalStatusReport report, @NotNull LocalDate mSelectDate, int dataType) {
        Integer physicalFitnessStatus;
        int iIntValue;
        Integer physicalFitnessLevel;
        Integer trainingStress;
        Integer physicalFitnessStatus2;
        Integer fatigueLevel;
        Integer physicalFitnessLevel2;
        Integer fatigueLevel2;
        Integer physicalFitnessLevel3;
        LocalDate mSelectDate2 = mSelectDate;
        Intrinsics.checkNotNullParameter(mSelectDate2, "mSelectDate");
        ArrayList arrayList = new ArrayList();
        LocalDate localDateMinusDays = mSelectDate2.minusDays(41);
        HashMap map = new HashMap();
        List<PhysicalStatusItem> physicalStatusItemList = report != null ? report.getPhysicalStatusItemList() : null;
        if (!ArrayUtils.isEmpty(physicalStatusItemList)) {
            Intrinsics.checkNotNull(physicalStatusItemList);
            for (PhysicalStatusItem physicalStatusItem : physicalStatusItemList) {
                map.put(Long.valueOf(physicalStatusItem.getTime()), physicalStatusItem);
            }
        }
        int i = 0;
        LocalDate localDateMinusDays2 = mSelectDate2;
        while (!localDateMinusDays2.isBefore(localDateMinusDays)) {
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateMinusDays2);
            PhysicalStatusItem physicalStatusItem2 = (PhysicalStatusItem) map.get(Long.valueOf(jChangZeroOfTheDay));
            int physicalStatusLevel = -1;
            if (dataType != 0) {
                if (dataType != 1) {
                    if (dataType != 2) {
                        if (physicalStatusItem2 == null || (physicalFitnessLevel3 = physicalStatusItem2.getPhysicalFitnessLevel()) == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = physicalFitnessLevel3.intValue();
                        }
                    } else if (physicalStatusItem2 == null || (fatigueLevel2 = physicalStatusItem2.getFatigueLevel()) == null) {
                        iIntValue = -1;
                    } else {
                        iIntValue = fatigueLevel2.intValue();
                    }
                } else if (physicalStatusItem2 == null || (physicalFitnessLevel2 = physicalStatusItem2.getPhysicalFitnessLevel()) == null) {
                    iIntValue = -1;
                } else {
                    iIntValue = physicalFitnessLevel2.intValue();
                }
            } else if (physicalStatusItem2 == null || (physicalFitnessStatus = physicalStatusItem2.getPhysicalFitnessStatus()) == null) {
                iIntValue = -1;
            } else {
                iIntValue = physicalFitnessStatus.intValue();
            }
            PhysicalStatusEntry physicalStatusEntry = new PhysicalStatusEntry(i, iIntValue, jChangZeroOfTheDay, getWtlBarEntryType(mSelectDate2, localDateMinusDays2));
            if ((physicalStatusItem2 != null ? physicalStatusItem2.getPhysicalFitnessStatus() : null) == null) {
                physicalStatusEntry.validType = 1;
            }
            physicalStatusEntry.localDate = localDateMinusDays2;
            physicalStatusEntry.c = (physicalStatusItem2 == null || (fatigueLevel = physicalStatusItem2.getFatigueLevel()) == null) ? -1 : fatigueLevel.intValue();
            physicalStatusEntry.d = (physicalStatusItem2 == null || (physicalFitnessStatus2 = physicalStatusItem2.getPhysicalFitnessStatus()) == null) ? -1 : physicalFitnessStatus2.intValue();
            physicalStatusEntry.f11761b = (physicalStatusItem2 == null || (trainingStress = physicalStatusItem2.getTrainingStress()) == null) ? -1 : trainingStress.intValue();
            physicalStatusEntry.f11760a = (physicalStatusItem2 == null || (physicalFitnessLevel = physicalStatusItem2.getPhysicalFitnessLevel()) == null) ? -1 : physicalFitnessLevel.intValue();
            Application app = AppUtil.getApp();
            if (physicalStatusItem2 != null) {
                physicalStatusLevel = physicalStatusItem2.getPhysicalStatusLevel();
            }
            physicalStatusEntry.e = getPhysicalStatusTitle(app, physicalStatusLevel);
            ListExtKt.add(arrayList, physicalStatusEntry);
            localDateMinusDays2 = localDateMinusDays2.minusDays(1);
            i++;
            mSelectDate2 = mSelectDate;
        }
        return arrayList;
    }

    @NotNull
    public final List<RecyclerBarEntry> createHomeEntries(int level) {
        int[] iArr;
        if (level == 0) {
            iArr = new int[]{1, 0, 0, 0};
        } else if (level == 1) {
            iArr = new int[]{0, 1, 0, 0};
        } else if (level != 2) {
            iArr = level != 3 ? new int[]{0, 0, 0, 0} : new int[]{0, 0, 0, 1};
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
    public final List<qpo> createTodayPhysicalStatusSummaryModelList(@NotNull Context context, @Nullable Integer todayWtl, int todayWtlLevel) {
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        LinkedList linkedList = new LinkedList();
        String string2 = context.getString(c0j.mb);
        if (todayWtl == null || (string = todayWtl.toString()) == null) {
            string = "--";
        }
        linkedList.add(new qpo(string2, string, ""));
        linkedList.add(new qpo(context.getString(c0j.ao), getPhysicalStatusTitle(context, todayWtlLevel), ""));
        return linkedList;
    }

    @NotNull
    public final List<LevelBarView.LevelItem> getPhysicalStatusLevelList() {
        ArrayList arrayList = new ArrayList();
        int i = iji.r0;
        arrayList.add(new LevelBarView.LevelItem(iji.u2, i, c0j.jb));
        arrayList.add(new LevelBarView.LevelItem(iji.s2, i, c0j.kb));
        arrayList.add(new LevelBarView.LevelItem(iji.t2, i, c0j.hb));
        arrayList.add(new LevelBarView.LevelItem(iji.v2, i, c0j.ib));
        return arrayList;
    }

    @NotNull
    public final String getPhysicalStatusTitle(@NotNull Context context, int level) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (level == 0) {
            String string = context.getString(c0j.jb);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (level == 1) {
            String string2 = context.getString(c0j.kb);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (level == 2) {
            String string3 = context.getString(c0j.hb);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (level != 3) {
            return "--";
        }
        String string4 = context.getString(c0j.ib);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return string4;
    }
}
