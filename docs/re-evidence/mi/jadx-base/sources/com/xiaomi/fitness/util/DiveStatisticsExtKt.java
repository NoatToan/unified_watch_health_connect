package com.xiaomi.fitness.util;

import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.Grouping;
import kotlin.collections.GroupingKt__GroupingJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\u0014\u0010\b\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\t"}, d2 = {"getMaxDivingDepth", "", "reportList", "", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getVisitedDivingPointCount", "", "getVisitedRegionCount", "getMostFrequentlyVisitedDivingPointId", "sport-record_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDiveStatisticsExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiveStatisticsExt.kt\ncom/xiaomi/fitness/util/DiveStatisticsExtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n1#2:28\n774#3:29\n865#3,2:30\n1663#3,8:32\n774#3:40\n865#3,2:41\n1663#3,8:43\n1544#3:51\n*S KotlinDebug\n*F\n+ 1 DiveStatisticsExt.kt\ncom/xiaomi/fitness/util/DiveStatisticsExtKt\n*L\n13#1:29\n13#1:30,2\n14#1:32,8\n19#1:40\n19#1:41,2\n20#1:43,8\n25#1:51\n*E\n"})
public final class DiveStatisticsExtKt {
    public static final float getMaxDivingDepth(@NotNull List<SportBasicReport> reportList) {
        Intrinsics.checkNotNullParameter(reportList, "reportList");
        if (reportList.isEmpty()) {
            return 0.0f;
        }
        Iterator<T> it = reportList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Float maxDivingDepth = ((SportBasicReport) it.next()).getMaxDivingDepth();
        float fFloatValue = maxDivingDepth != null ? maxDivingDepth.floatValue() : 0.0f;
        while (it.hasNext()) {
            Float maxDivingDepth2 = ((SportBasicReport) it.next()).getMaxDivingDepth();
            fFloatValue = Math.max(fFloatValue, maxDivingDepth2 != null ? maxDivingDepth2.floatValue() : 0.0f);
        }
        return fFloatValue;
    }

    public static final int getMostFrequentlyVisitedDivingPointId(@NotNull List<SportBasicReport> reportList) {
        Intrinsics.checkNotNullParameter(reportList, "reportList");
        if (reportList.isEmpty()) {
            return 0;
        }
        final List<SportBasicReport> list = reportList;
        Iterator it = GroupingKt__GroupingJVMKt.eachCount(new Grouping<SportBasicReport, Integer>() { // from class: com.xiaomi.fitness.util.DiveStatisticsExtKt$getMostFrequentlyVisitedDivingPointId$$inlined$groupingBy$1
            @Override // kotlin.collections.Grouping
            public Integer keyOf(SportBasicReport element) {
                return element.getDivingAreaId();
            }

            @Override // kotlin.collections.Grouping
            public Iterator<SportBasicReport> sourceIterator() {
                return list.iterator();
            }
        }).entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            int iIntValue = ((Number) ((Map.Entry) next).getValue()).intValue();
            do {
                Object next2 = it.next();
                int iIntValue2 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                if (iIntValue < iIntValue2) {
                    next = next2;
                    iIntValue = iIntValue2;
                }
            } while (it.hasNext());
        }
        Integer num = (Integer) ((Map.Entry) next).getKey();
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int getVisitedDivingPointCount(@NotNull List<SportBasicReport> reportList) {
        Intrinsics.checkNotNullParameter(reportList, "reportList");
        if (reportList.isEmpty()) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : reportList) {
            if (((SportBasicReport) obj).getDivingAreaId() != null) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((SportBasicReport) obj2).getDivingAreaId())) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2.size();
    }

    public static final int getVisitedRegionCount(@NotNull List<SportBasicReport> reportList) {
        Intrinsics.checkNotNullParameter(reportList, "reportList");
        if (reportList.isEmpty()) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : reportList) {
            if (((SportBasicReport) obj).getDivingCountryId() != null) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((SportBasicReport) obj2).getDivingCountryId())) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2.size();
    }
}
