package com.xiaomi.fit.fitness.export.data.aggregation;

import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u001a\n\u0010\u000b\u001a\u00020\u0005*\u00020\u0005\u001a\u0010\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r*\u00020\u0005\u001a\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r*\b\u0012\u0004\u0012\u00020\u00050\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\b\u001a\u00020\t*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"SPACE_MIN_DAYS", "", "SPACE_MIN_MILLS", "", "inDays", "Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;", "getInDays", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;)I", "isEnd", "", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;)Z", "copy", "toDeleteKey", "", "fitness-data-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCurseRecord.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurseRecord.kt\ncom/xiaomi/fit/fitness/export/data/aggregation/CurseRecordKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n1368#2:58\n1454#2,5:59\n*S KotlinDebug\n*F\n+ 1 CurseRecord.kt\ncom/xiaomi/fit/fitness/export/data/aggregation/CurseRecordKt\n*L\n38#1:58\n38#1:59,5\n*E\n"})
public final class CurseRecordKt {
    public static final int SPACE_MIN_DAYS = 5;
    public static final long SPACE_MIN_MILLS = 432000000;

    @NotNull
    public static final Record copy(@NotNull Record record) {
        Intrinsics.checkNotNullParameter(record, "<this>");
        return new Record(record.getStartMills(), record.getEndMills(), record.getUpdateTime(), record.getInterval(), record.getId());
    }

    public static final int getInDays(@NotNull Record record) {
        Intrinsics.checkNotNullParameter(record, "<this>");
        return (int) (((record.getEndMills() - record.getStartMills()) / 86400000) + 1);
    }

    public static final boolean isEnd(@NotNull Record record) {
        Intrinsics.checkNotNullParameter(record, "<this>");
        return record.getEndMills() <= FitnessDateUtils.getTodayZeroTimeInSec() * ((long) 1000);
    }

    @NotNull
    public static final List<Long> toDeleteKey(@NotNull Record record) {
        Intrinsics.checkNotNullParameter(record, "<this>");
        ArrayList arrayList = new ArrayList();
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        long j = 1000;
        long jChangeToDestZeroTimeOneDay = FitnessDateUtils.changeToDestZeroTimeOneDay(record.getStartMills() / j, currentTZOffsetInSec, 0);
        long jChangeToDestZeroTimeOneDay2 = FitnessDateUtils.changeToDestZeroTimeOneDay(record.getEndMills() / j, currentTZOffsetInSec, 0);
        long seconds = TimeUnit.DAYS.toSeconds(1L);
        if (seconds <= 0) {
            throw new IllegalArgumentException("Step must be positive, was: " + seconds + ".");
        }
        long progressionLastElement = ProgressionUtilKt.getProgressionLastElement(jChangeToDestZeroTimeOneDay, jChangeToDestZeroTimeOneDay2, seconds);
        if (jChangeToDestZeroTimeOneDay <= progressionLastElement) {
            while (true) {
                arrayList.add(Long.valueOf(jChangeToDestZeroTimeOneDay));
                if (jChangeToDestZeroTimeOneDay == progressionLastElement) {
                    break;
                }
                jChangeToDestZeroTimeOneDay += seconds;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Long> toDeleteKey(@NotNull List<Record> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, toDeleteKey((Record) it.next()));
        }
        return arrayList;
    }
}
