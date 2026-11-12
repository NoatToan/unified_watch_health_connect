package com.xiaomi.fitness.repo.healthconnect.utils;

import com.xiaomi.fit.fitness.persist.db.internal.HealthConnectSyncDaoEntity;
import com.xiaomi.fitness.aggregation.health.dao.TimeZoneUtil;
import com.xiaomi.fitness.repo.healthconnect.biz.HealthConnectPreference;
import com.xiaomi.fitness.repo.healthconnect.biz.daily.TimeRange;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bJ$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bH\u0002J\"\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n0\u00052\u0006\u0010\r\u001a\u00020\bH\u0002J \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005J\u0006\u0010\u0015\u001a\u00020\u000b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/repo/healthconnect/utils/HealthConnectTimeUtils;", "", "<init>", "()V", "divideTimeByDay", "", "Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/TimeRange;", "offsetDays", "", "calcTimeRange", "Lkotlin/Pair;", "", "timeStampInSecond", "durationInMinute", "buildTimeRangeList", "getMinAndMaxTimeStampWithInTimeRangeList", "timeRanges", "calcTimeRangeByUnSyncRecords", "Ljava/util/LinkedList;", "records", "Lcom/xiaomi/fit/fitness/persist/db/internal/HealthConnectSyncDaoEntity;", "getTodayBeginTimeIn0ZoneInMinute", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHealthConnectTimeUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthConnectTimeUtils.kt\ncom/xiaomi/fitness/repo/healthconnect/utils/HealthConnectTimeUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,112:1\n1863#2,2:113\n1863#2,2:115\n1863#2,2:117\n216#3,2:119\n*S KotlinDebug\n*F\n+ 1 HealthConnectTimeUtils.kt\ncom/xiaomi/fitness/repo/healthconnect/utils/HealthConnectTimeUtils\n*L\n47#1:113,2\n78#1:115,2\n92#1:117,2\n96#1:119,2\n*E\n"})
public final class HealthConnectTimeUtils {

    @NotNull
    public static final HealthConnectTimeUtils INSTANCE = new HealthConnectTimeUtils();

    private HealthConnectTimeUtils() {
    }

    private final List<Pair<Integer, Integer>> buildTimeRangeList(int durationInMinute) {
        if (durationInMinute == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int i = 60 / durationInMinute;
        int i2 = 0;
        while (i2 < i) {
            Integer numValueOf = Integer.valueOf(i2 * durationInMinute);
            i2++;
            arrayList.add(new Pair(numValueOf, Integer.valueOf((i2 * durationInMinute) - 1)));
        }
        return arrayList;
    }

    private final Pair<Long, Long> calcTimeRange(long timeStampInSecond, int durationInMinute) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZoneUtil.INSTANCE.getTimeZone(0));
        long j = 1000;
        calendar.setTimeInMillis(timeStampInSecond * j);
        int i = calendar.get(12);
        Iterator<T> it = buildTimeRangeList(durationInMinute).iterator();
        int iIntValue = 59;
        int iIntValue2 = 0;
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (i >= ((Number) pair.getFirst()).intValue() && i <= ((Number) pair.getSecond()).intValue()) {
                iIntValue2 = ((Number) pair.getFirst()).intValue();
                iIntValue = ((Number) pair.getSecond()).intValue();
            }
        }
        calendar.set(12, iIntValue2);
        calendar.set(13, 0);
        long timeInMillis = calendar.getTimeInMillis() / j;
        calendar.set(12, iIntValue);
        calendar.set(13, 59);
        return new Pair<>(Long.valueOf(timeInMillis), Long.valueOf(calendar.getTimeInMillis() / j));
    }

    @NotNull
    public final LinkedList<TimeRange> calcTimeRangeByUnSyncRecords(@NotNull List<HealthConnectSyncDaoEntity> records) {
        Intrinsics.checkNotNullParameter(records, "records");
        LinkedList<TimeRange> linkedList = new LinkedList<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = records.iterator();
        while (it.hasNext()) {
            Pair<Long, Long> pairCalcTimeRange = INSTANCE.calcTimeRange(((HealthConnectSyncDaoEntity) it.next()).getTime(), 30);
            linkedHashMap.put(pairCalcTimeRange.getFirst(), pairCalcTimeRange.getSecond());
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedList.add(new TimeRange(((Number) entry.getKey()).longValue(), ((Number) entry.getValue()).longValue()));
        }
        return linkedList;
    }

    @NotNull
    public final List<TimeRange> divideTimeByDay(int offsetDays) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(HealthConnectPreference.INSTANCE.getKEY_LAST_START_SYNC_TIME());
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < offsetDays; i++) {
            long timeInMillis = calendar.getTimeInMillis();
            calendar.add(5, -1);
            linkedList.add(new TimeRange(timeInMillis, calendar.getTimeInMillis()));
        }
        return linkedList;
    }

    @NotNull
    public final Pair<Long, Long> getMinAndMaxTimeStampWithInTimeRangeList(@NotNull List<TimeRange> timeRanges) {
        Intrinsics.checkNotNullParameter(timeRanges, "timeRanges");
        long endTimeStamp = Long.MIN_VALUE;
        long startTimeStamp = Long.MAX_VALUE;
        for (TimeRange timeRange : timeRanges) {
            if (timeRange.getStartTimeStamp() < startTimeStamp) {
                startTimeStamp = timeRange.getStartTimeStamp();
            }
            if (timeRange.getEndTimeStamp() > endTimeStamp) {
                endTimeStamp = timeRange.getEndTimeStamp();
            }
        }
        return new Pair<>(Long.valueOf(startTimeStamp), Long.valueOf(endTimeStamp));
    }

    public final long getTodayBeginTimeIn0ZoneInMinute() {
        Calendar calendar = Calendar.getInstance(TimeZoneUtil.INSTANCE.getTimeZone(0));
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }
}
