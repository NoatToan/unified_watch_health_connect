package com.xiaomi.fitness.health.curse.vm;

import com.xiaomi.fit.fitness.export.data.aggregation.Record;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.curse.data.CurseExtKt;
import com.xiaomi.fitness.health.curse.data.DayData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a/\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0006j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u00032\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\t\u001a$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e\u001a$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u000eH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0012\u001a\u00020\u0001*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"TAG_L", "", "getMonthPeriod", "Lkotlin/collections/LinkedHashMap;", "", "Lcom/xiaomi/fitness/health/curse/data/DayData;", "Ljava/util/LinkedHashMap;", "localDate", "Lorg/joda/time/LocalDate;", "(Lorg/joda/time/LocalDate;)Ljava/util/LinkedHashMap;", "fetchOperationMode", "", "millis", "records", "", "isMarkEndAvailable", "", "dayData", "operationModeStr", "getOperationModeStr", "(I)Ljava/lang/String;", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCurseMonthVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurseMonthVM.kt\ncom/xiaomi/fitness/health/curse/vm/CurseMonthVMKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n774#2:101\n865#2,2:102\n1#3:104\n*S KotlinDebug\n*F\n+ 1 CurseMonthVM.kt\ncom/xiaomi/fitness/health/curse/vm/CurseMonthVMKt\n*L\n40#1:101\n40#1:102,2\n*E\n"})
public final class CurseMonthVMKt {

    @NotNull
    private static final String TAG_L = "CurseMonthVM";

    public static final int fetchOperationMode(long j, @Nullable Map<Long, DayData> map) {
        int i;
        DayData dayData = map != null ? map.get(Long.valueOf(CurseExtKt.getZeroMills(j))) : null;
        if (dayData == null) {
            i = -1;
        } else if (dayData.getTime() > CurseExtKt.getZeroMills(System.currentTimeMillis())) {
            i = 0;
        } else if (dayData.isFirstDay() || dayData.isEndDay()) {
            i = 3;
        } else {
            i = (dayData.isIn() || isMarkEndAvailable(dayData, map)) ? 2 : 1;
        }
        Logger.i(TAG_L, "fetchOperationMode mode:" + i + ";str:" + getOperationModeStr(i) + ";dayData:" + dayData);
        return i;
    }

    @NotNull
    public static final LinkedHashMap<Long, DayData> getMonthPeriod(@NotNull LocalDate localDate) {
        Object next;
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        LinkedHashMap<Long, DayData> linkedHashMap = new LinkedHashMap<>();
        CurseExtKt.initMonthData(linkedHashMap, localDate);
        Set<Long> setKeySet = linkedHashMap.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
        Object objFirst = CollectionsKt___CollectionsKt.first(setKeySet);
        Intrinsics.checkNotNullExpressionValue(objFirst, "first(...)");
        long jLongValue = ((Number) objFirst).longValue();
        Object objLast = CollectionsKt___CollectionsKt.last(setKeySet);
        Intrinsics.checkNotNullExpressionValue(objLast, "last(...)");
        long jLongValue2 = ((Number) objLast).longValue();
        Logger.d(TAG_L, "reqMonthPeriod: date = " + localDate + "; start = " + new LocalDate(jLongValue) + "; end = " + new LocalDate(jLongValue2));
        List<Record> period = FitnessDataExtKt.getCurseApi().getPeriod(jLongValue, jLongValue2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : period) {
            if (((Record) obj).getStartMills() <= TimeUtils.getBeginOfToday()) {
                arrayList.add(obj);
            }
        }
        Logger.i(TAG_L, "reqMonthPeriod: records " + arrayList + "}");
        for (Map.Entry<Long, DayData> entry : linkedHashMap.entrySet()) {
            long jLongValue3 = entry.getKey().longValue();
            DayData value = entry.getValue();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Record record = (Record) next;
                long startMills = record.getStartMills();
                if (jLongValue3 <= record.getEndMills() && startMills <= jLongValue3) {
                    break;
                }
            }
            Record record2 = (Record) next;
            if (record2 != null) {
                value.setDaysIn(record2, TimeDateUtil.getIntervalDay(record2.getStartMills(), jLongValue3) + 1);
            }
        }
        return linkedHashMap;
    }

    private static final String getOperationModeStr(int i) {
        if (i == -1) {
            return "invalid";
        }
        if (i == 0) {
            return "future";
        }
        if (i == 1) {
            return "mark_start";
        }
        if (i != 2) {
            return i != 3 ? "others" : "mark_cancel";
        }
        return "mark_end";
    }

    private static final boolean isMarkEndAvailable(DayData dayData, Map<Long, DayData> map) {
        boolean z;
        long zeroMills = CurseExtKt.getZeroMills(dayData.getTime());
        int i = 1;
        while (true) {
            if (i >= 6) {
                z = false;
                break;
            }
            DayData dayData2 = map.get(Long.valueOf(zeroMills - (((long) i) * 86400000)));
            if (dayData2 != null && dayData2.isEndDay()) {
                z = true;
                break;
            }
            i++;
        }
        return !dayData.isIn() && z;
    }
}
