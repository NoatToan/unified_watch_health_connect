package com.xiaomi.fitness.repo.sleep.utils;

import com.xiaomi.fit.data.common.data.daily.SleepStateItem;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.item.DayNightSleepReport;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.repo.sleep.utils.DayNightSleepConverter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\u000b\u001a\u00020\fJ$\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH\u0002J\"\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0014H\u0002J\u0018\u0010\u0019\u001a\u0004\u0018\u00010\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH\u0002J\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/repo/sleep/utils/DayNightSleepConverter;", "", "<init>", "()V", "TAG", "", "LINE_LONG_SLEEP_DURATION", "", "LINE_NAP_SLEEP_WAKE_DURATION", "convertNightSleepReport", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "sleepReport", "Lcom/xiaomi/fit/fitness/export/data/item/DayNightSleepReport;", "convertDaytimeSleepReport", "", "mergeTwoSleepInNeed", "", "segList", "", "lineAwakeList", "Lcom/xiaomi/fit/data/common/data/daily/SleepStateItem;", "mergeTwoSleep", "seg1", "seg2", "wakeItem", "genSleepSegment", "sleepItems", "computeSleepDuration", "startTime", "", "endTime", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDayNightSleepConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DayNightSleepConverter.kt\ncom/xiaomi/fitness/repo/sleep/utils/DayNightSleepConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,234:1\n1863#2,2:235\n*S KotlinDebug\n*F\n+ 1 DayNightSleepConverter.kt\ncom/xiaomi/fitness/repo/sleep/utils/DayNightSleepConverter\n*L\n109#1:235,2\n*E\n"})
public final class DayNightSleepConverter {

    @NotNull
    public static final DayNightSleepConverter INSTANCE = new DayNightSleepConverter();
    private static final int LINE_LONG_SLEEP_DURATION = 180;
    private static final int LINE_NAP_SLEEP_WAKE_DURATION = 10;

    @NotNull
    private static final String TAG = "DayNightSleepConverter";

    private DayNightSleepConverter() {
    }

    private final int computeSleepDuration(long startTime, long endTime) {
        long j = 60;
        return (int) ((endTime / j) - (startTime / j));
    }

    private final SleepSegmentReport genSleepSegment(List<SleepStateItem> sleepItems) {
        List<SleepStateItem> list = sleepItems;
        if (list == null || list.isEmpty()) {
            return null;
        }
        long j = 0;
        long startTime = 0;
        long endTime = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (SleepStateItem sleepStateItem : sleepItems) {
            if (startTime <= j || sleepStateItem.getStartTime() < startTime) {
                startTime = sleepStateItem.getStartTime();
            }
            if (sleepStateItem.getEndTime() > endTime) {
                endTime = sleepStateItem.getEndTime();
            }
            long j2 = startTime;
            int iComputeSleepDuration = computeSleepDuration(sleepStateItem.getStartTime(), sleepStateItem.getEndTime());
            int sleepState = sleepStateItem.getSleepState();
            if (sleepState == 2) {
                i2 += iComputeSleepDuration;
            } else if (sleepState == 3) {
                i += iComputeSleepDuration;
            } else if (sleepState == 4) {
                i3 += iComputeSleepDuration;
            } else if (sleepState == 5) {
                i4++;
                i5 += iComputeSleepDuration;
            }
            startTime = j2;
            j = 0;
        }
        long j3 = j;
        if (startTime <= j3 || endTime <= j3 || startTime == endTime) {
            FitnessLogUtils.i(TAG, "invalid sleep(bedTime = " + startTime + ", wakeupTime = " + endTime + ")");
            return null;
        }
        SleepSegmentReport.Builder builderSleepDuration = new SleepSegmentReport.Builder().bedTime(startTime).wakeupTime(endTime).sleepDuration(computeSleepDuration(startTime, endTime));
        int i6 = (i > 0 ? 1 : 0) + (i2 > 0 ? 1 : 0) + (i3 > 0 ? 1 : 0) + (i5 > 0 ? 1 : 0);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(sleepItems);
        if (i6 < 2) {
            return builderSleepDuration.build();
        }
        builderSleepDuration.sleepDuration(i + i2 + i3).lightSleepDuration(i).deepSleepDuration(i2).remDuration(i3).wakeDuration(i5).wakeCount(i4).setSleepState(arrayList);
        return builderSleepDuration.build();
    }

    private final SleepSegmentReport mergeTwoSleep(SleepSegmentReport seg1, SleepSegmentReport seg2, SleepStateItem wakeItem) {
        ArrayList arrayList = new ArrayList();
        if (seg1.getSleepItems() != null) {
            List<SleepStateItem> sleepItems = seg1.getSleepItems();
            Intrinsics.checkNotNull(sleepItems);
            arrayList.addAll(sleepItems);
        }
        arrayList.add(wakeItem);
        if (seg2.getSleepItems() != null) {
            List<SleepStateItem> sleepItems2 = seg2.getSleepItems();
            Intrinsics.checkNotNull(sleepItems2);
            arrayList.addAll(sleepItems2);
        }
        return genSleepSegment(arrayList);
    }

    private final void mergeTwoSleepInNeed(List<SleepSegmentReport> segList, List<SleepStateItem> lineAwakeList) {
        List<SleepStateItem> list;
        SleepSegmentReport sleepSegmentReportMergeTwoSleep;
        if (segList.size() <= 1 || (list = lineAwakeList) == null || list.isEmpty()) {
            return;
        }
        for (SleepStateItem sleepStateItem : lineAwakeList) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(segList, new Comparator() { // from class: dr5
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DayNightSleepConverter.mergeTwoSleepInNeed$lambda$1((SleepSegmentReport) obj, (SleepSegmentReport) obj2);
                }
            });
            int i = 0;
            while (i < segList.size() - 1) {
                SleepSegmentReport sleepSegmentReport = segList.get(i);
                i++;
                SleepSegmentReport sleepSegmentReport2 = segList.get(i);
                if (sleepSegmentReport.getWakeupTime() == sleepStateItem.getStartTime() && sleepSegmentReport2.getBedTime() == sleepStateItem.getEndTime() && sleepSegmentReport.getSleepDuration() + sleepSegmentReport2.getSleepDuration() >= 180 && (sleepSegmentReportMergeTwoSleep = mergeTwoSleep(sleepSegmentReport, sleepSegmentReport2, sleepStateItem)) != null) {
                    segList.remove(sleepSegmentReport);
                    segList.remove(sleepSegmentReport2);
                    segList.add(sleepSegmentReportMergeTwoSleep);
                    break;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mergeTwoSleepInNeed$lambda$1(SleepSegmentReport sleepSegmentReport, SleepSegmentReport sleepSegmentReport2) {
        return (int) (sleepSegmentReport.getBedTime() - sleepSegmentReport2.getBedTime());
    }

    @NotNull
    public final List<SleepSegmentReport> convertDaytimeSleepReport(@NotNull DayNightSleepReport sleepReport) {
        SleepSegmentReport sleepSegmentReportGenSleepSegment;
        SleepSegmentReport sleepSegmentReportGenSleepSegment2;
        Intrinsics.checkNotNullParameter(sleepReport, "sleepReport");
        List<SleepStateItem> sleepItems = sleepReport.getSleepItems();
        if (sleepItems == null || sleepItems.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<SleepStateItem> sleepItems2 = sleepReport.getSleepItems();
        Intrinsics.checkNotNull(sleepItems2);
        Collections.sort(sleepItems2);
        ArrayList<SleepStateItem> arrayList = new ArrayList();
        List<SleepStateItem> sleepItems3 = sleepReport.getSleepItems();
        Intrinsics.checkNotNull(sleepItems3);
        SleepStateItem sleepStateItem = null;
        for (SleepStateItem sleepStateItem2 : sleepItems3) {
            if (sleepStateItem != null && sleepStateItem.getEndTime() < sleepStateItem2.getStartTime()) {
                arrayList.add(new SleepStateItem(sleepStateItem.getEndTime(), sleepStateItem2.getStartTime(), 0));
            }
            arrayList.add(sleepStateItem2);
            sleepStateItem = sleepStateItem2;
        }
        ArrayList<SleepSegmentReport> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (SleepStateItem sleepStateItem3 : arrayList) {
            if (sleepStateItem3.getSleepState() == 0) {
                SleepSegmentReport sleepSegmentReportGenSleepSegment3 = genSleepSegment(arrayList3);
                if (sleepSegmentReportGenSleepSegment3 != null) {
                    arrayList2.add(sleepSegmentReportGenSleepSegment3);
                    arrayList3.clear();
                }
            } else if (sleepStateItem3.getSleepState() != 5 || computeSleepDuration(sleepStateItem3.getStartTime(), sleepStateItem3.getEndTime()) <= 10 || (sleepSegmentReportGenSleepSegment2 = genSleepSegment(arrayList3)) == null) {
                arrayList3.add(sleepStateItem3);
            } else {
                arrayList4.add(sleepStateItem3);
                arrayList2.add(sleepSegmentReportGenSleepSegment2);
                arrayList3.clear();
            }
        }
        if ((!arrayList3.isEmpty()) && (sleepSegmentReportGenSleepSegment = genSleepSegment(arrayList3)) != null) {
            arrayList2.add(sleepSegmentReportGenSleepSegment);
        }
        if (!arrayList4.isEmpty()) {
            mergeTwoSleepInNeed(arrayList2, arrayList4);
        }
        for (SleepSegmentReport sleepSegmentReport : arrayList2) {
            sleepSegmentReport.setSid(sleepReport.getSid());
            sleepSegmentReport.setTzIn15Min(sleepReport.getTzIn15Min());
            sleepSegmentReport.setDbTime(sleepReport.getDbTime());
            sleepSegmentReport.setDbKey(FitnessPersistKey.DaytimeSleep);
            sleepSegmentReport.setTimestamp(sleepReport.getTime());
        }
        return arrayList2;
    }

    @Nullable
    public final SleepSegmentReport convertNightSleepReport(@NotNull DayNightSleepReport sleepReport) {
        Intrinsics.checkNotNullParameter(sleepReport, "sleepReport");
        if (!sleepReport.isValidSleep()) {
            return null;
        }
        SleepSegmentReport.Builder builder = new SleepSegmentReport.Builder();
        builder.tzOffsetIn15Min(Integer.valueOf(sleepReport.getTzIn15Min()));
        builder.sleepDuration(sleepReport.getSleepDuration());
        builder.bedTime(sleepReport.getBedTime());
        builder.wakeupTime(sleepReport.getWakeUpTime());
        builder.setSleepState(sleepReport.getSleepItems());
        if (sleepReport.getDeepDuration() != null) {
            Integer deepDuration = sleepReport.getDeepDuration();
            Intrinsics.checkNotNull(deepDuration);
            builder.deepSleepDuration(deepDuration.intValue());
        }
        if (sleepReport.getLightDuration() != null) {
            Integer lightDuration = sleepReport.getLightDuration();
            Intrinsics.checkNotNull(lightDuration);
            builder.lightSleepDuration(lightDuration.intValue());
        }
        if (sleepReport.getAwakeDuration() != null) {
            Integer awakeDuration = sleepReport.getAwakeDuration();
            Intrinsics.checkNotNull(awakeDuration);
            builder.wakeDuration(awakeDuration.intValue());
        }
        if (sleepReport.getRemDuration() != null) {
            Integer remDuration = sleepReport.getRemDuration();
            Intrinsics.checkNotNull(remDuration);
            builder.remDuration(remDuration.intValue());
        }
        if (sleepReport.getAwakeCount() != null) {
            Integer awakeCount = sleepReport.getAwakeCount();
            Intrinsics.checkNotNull(awakeCount);
            builder.wakeCount(awakeCount.intValue());
        }
        if (sleepReport.getBreathQuality() != null) {
            Integer breathQuality = sleepReport.getBreathQuality();
            Intrinsics.checkNotNull(breathQuality);
            if (breathQuality.intValue() > 0) {
                Integer breathQuality2 = sleepReport.getBreathQuality();
                Intrinsics.checkNotNull(breathQuality2);
                builder.breathQuality(breathQuality2.intValue());
            }
        }
        SleepSegmentReport sleepSegmentReportBuild = builder.build();
        sleepSegmentReportBuild.setSid(sleepReport.getSid());
        sleepSegmentReportBuild.setDbTime(sleepReport.getDbTime());
        sleepSegmentReportBuild.setDbKey(FitnessPersistKey.NightSleep);
        sleepSegmentReportBuild.setTimestamp(sleepReport.getTime());
        return sleepSegmentReportBuild;
    }
}
