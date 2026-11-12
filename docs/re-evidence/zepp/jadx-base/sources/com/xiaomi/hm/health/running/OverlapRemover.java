package com.xiaomi.hm.health.running;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\\\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0007J\\\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/running/OverlapRemover;", "", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "", "source", "target", "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/running/TimeRange;", "getSourceTimeRange", "getTargetTimeRange", "removeOverlaps", "removeAllOverlaps", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class OverlapRemover {

    @NotNull
    public static final OverlapRemover INSTANCE = new OverlapRemover();

    private OverlapRemover() {
    }

    @NotNull
    public final <S, T> List<S> removeAllOverlaps(@NotNull List<? extends S> source, @NotNull List<? extends T> target, @NotNull final Function1<? super S, TimeRange> getSourceTimeRange, @NotNull final Function1<? super T, TimeRange> getTargetTimeRange) {
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(source, new Comparator() { // from class: com.xiaomi.hm.health.running.OverlapRemover$removeAllOverlaps$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((TimeRange) getSourceTimeRange.invoke(t)).getStartTime()), Long.valueOf(((TimeRange) getSourceTimeRange.invoke(t2)).getStartTime()));
            }
        });
        List listSortedWith2 = CollectionsKt___CollectionsKt.sortedWith(target, new Comparator() { // from class: com.xiaomi.hm.health.running.OverlapRemover$removeAllOverlaps$$inlined$sortedBy$2
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((TimeRange) getTargetTimeRange.invoke(t)).getStartTime()), Long.valueOf(((TimeRange) getTargetTimeRange.invoke(t2)).getStartTime()));
            }
        });
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < listSortedWith.size() && i2 < listSortedWith2.size()) {
            TimeRange timeRangeInvoke = getSourceTimeRange.invoke((Object) listSortedWith.get(i));
            TimeRange timeRangeInvoke2 = getTargetTimeRange.invoke((Object) listSortedWith2.get(i2));
            long startTime = timeRangeInvoke.getStartTime();
            long endTime = timeRangeInvoke.getEndTime();
            long startTime2 = timeRangeInvoke2.getStartTime();
            if (startTime <= startTime2 && startTime2 <= endTime) {
                arrayList.add(listSortedWith.get(i));
            } else {
                long startTime3 = timeRangeInvoke2.getStartTime();
                long endTime2 = timeRangeInvoke2.getEndTime();
                long startTime4 = timeRangeInvoke.getStartTime();
                if (startTime3 <= startTime4 && startTime4 <= endTime2) {
                    long startTime5 = timeRangeInvoke2.getStartTime();
                    long endTime3 = timeRangeInvoke2.getEndTime();
                    long endTime4 = timeRangeInvoke.getEndTime();
                    if (!(startTime5 <= endTime4 && endTime4 <= endTime3)) {
                        arrayList.add(listSortedWith.get(i));
                    }
                } else if (timeRangeInvoke.getEndTime() < timeRangeInvoke2.getStartTime()) {
                    arrayList.add(listSortedWith.get(i));
                } else if (timeRangeInvoke.getStartTime() > timeRangeInvoke2.getEndTime()) {
                    i2++;
                }
            }
            i++;
        }
        while (i < listSortedWith.size()) {
            arrayList.add(listSortedWith.get(i));
            i++;
        }
        return arrayList;
    }

    @NotNull
    public final <S, T> List<S> removeOverlaps(@NotNull List<? extends S> source, @NotNull List<? extends T> target, @NotNull final Function1<? super S, TimeRange> getSourceTimeRange, @NotNull final Function1<? super T, TimeRange> getTargetTimeRange) {
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(source, new Comparator() { // from class: com.xiaomi.hm.health.running.OverlapRemover$removeOverlaps$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((TimeRange) getSourceTimeRange.invoke(t)).getStartTime()), Long.valueOf(((TimeRange) getSourceTimeRange.invoke(t2)).getStartTime()));
            }
        });
        List listSortedWith2 = CollectionsKt___CollectionsKt.sortedWith(target, new Comparator() { // from class: com.xiaomi.hm.health.running.OverlapRemover$removeOverlaps$$inlined$sortedBy$2
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((TimeRange) getTargetTimeRange.invoke(t)).getStartTime()), Long.valueOf(((TimeRange) getTargetTimeRange.invoke(t2)).getStartTime()));
            }
        });
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < listSortedWith.size() && i2 < listSortedWith2.size()) {
            TimeRange timeRangeInvoke = getSourceTimeRange.invoke((Object) listSortedWith.get(i));
            TimeRange timeRangeInvoke2 = getTargetTimeRange.invoke((Object) listSortedWith2.get(i2));
            long startTime = timeRangeInvoke.getStartTime();
            long endTime = timeRangeInvoke.getEndTime();
            long startTime2 = timeRangeInvoke2.getStartTime();
            if (!(startTime <= startTime2 && startTime2 <= endTime)) {
                long startTime3 = timeRangeInvoke2.getStartTime();
                long endTime2 = timeRangeInvoke2.getEndTime();
                long startTime4 = timeRangeInvoke.getStartTime();
                if (!(startTime3 <= startTime4 && startTime4 <= endTime2)) {
                    if (timeRangeInvoke.getEndTime() < timeRangeInvoke2.getStartTime()) {
                        arrayList.add(listSortedWith.get(i));
                    } else if (timeRangeInvoke.getStartTime() > timeRangeInvoke2.getEndTime()) {
                        i2++;
                    }
                }
            }
            i++;
        }
        while (i < listSortedWith.size()) {
            arrayList.add(listSortedWith.get(i));
            i++;
        }
        return arrayList;
    }
}
