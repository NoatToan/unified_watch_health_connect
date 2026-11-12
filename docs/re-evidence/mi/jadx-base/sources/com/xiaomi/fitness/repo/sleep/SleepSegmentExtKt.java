package com.xiaomi.fitness.repo.sleep;

import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u0003\u001a\u0010\u0010\n\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\b0\u0007\u001a\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u0003\u001a\u0010\u0010\f\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\b0\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"LINE_LONG_SLEEP_DURATION", "", "TIME_4_HOURS", "", "TIME_7_HOURS", "TIME_20_HOURS", "filterLongSleepBedBetween20to7", "", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "zeroTime", "sumWakeCount", "filterNapBedBetween7to20", "sumSleepDuration", "fitness-data-core_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepSegmentExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepSegmentExt.kt\ncom/xiaomi/fitness/repo/sleep/SleepSegmentExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,19:1\n774#2:20\n865#2,2:21\n774#2:24\n865#2,2:25\n1#3:23\n*S KotlinDebug\n*F\n+ 1 SleepSegmentExt.kt\ncom/xiaomi/fitness/repo/sleep/SleepSegmentExtKt\n*L\n12#1:20\n12#1:21,2\n17#1:24\n17#1:25,2\n*E\n"})
public final class SleepSegmentExtKt {
    private static final int LINE_LONG_SLEEP_DURATION = 180;
    private static final long TIME_20_HOURS;
    private static final long TIME_4_HOURS;
    private static final long TIME_7_HOURS;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        TIME_4_HOURS = timeUnit.toSeconds(4L);
        TIME_7_HOURS = timeUnit.toSeconds(7L);
        TIME_20_HOURS = timeUnit.toSeconds(20L);
    }

    @NotNull
    public static final List<SleepSegmentReport> filterLongSleepBedBetween20to7(@NotNull List<SleepSegmentReport> list, long j) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            SleepSegmentReport sleepSegmentReport = (SleepSegmentReport) obj;
            if (sleepSegmentReport.getSleepDuration() >= 180 && sleepSegmentReport.getBedTime() >= j - TIME_4_HOURS && sleepSegmentReport.getBedTime() <= TIME_7_HOURS + j) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<SleepSegmentReport> filterNapBedBetween7to20(@NotNull List<SleepSegmentReport> list, long j) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            SleepSegmentReport sleepSegmentReport = (SleepSegmentReport) obj;
            if (sleepSegmentReport.getSleepDuration() < 180 && sleepSegmentReport.getBedTime() > TIME_7_HOURS + j && sleepSegmentReport.getBedTime() < TIME_20_HOURS + j) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final int sumSleepDuration(@NotNull List<SleepSegmentReport> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator<T> it = list.iterator();
        int sleepDuration = 0;
        while (it.hasNext()) {
            sleepDuration += ((SleepSegmentReport) it.next()).getSleepDuration();
        }
        return sleepDuration;
    }

    public static final int sumWakeCount(@NotNull List<SleepSegmentReport> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator<T> it = list.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            Integer wakeCount = ((SleepSegmentReport) it.next()).getWakeCount();
            iIntValue += wakeCount != null ? wakeCount.intValue() : 0;
        }
        return iIntValue;
    }
}
