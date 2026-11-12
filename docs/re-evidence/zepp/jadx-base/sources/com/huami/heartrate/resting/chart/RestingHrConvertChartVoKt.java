package com.huami.heartrate.resting.chart;

import android.util.SparseArray;
import com.huami.chart.data.ChartData;
import com.huami.heartrate.dto.RestingHeartRate;
import com.huami.heartrate.resting.ui.HrRestingChartFragment;
import com.huami.heartrate.vo.RestingHrLineVo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.ranges.IntRange;
import kotlin.ranges.e;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\"\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u001a\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¨\u0006\t"}, d2 = {"", "Lcom/huami/heartrate/dto/RestingHeartRate;", "data", "Ljava/util/Calendar;", "currentMonthCalendar", "Lcom/huami/heartrate/vo/RestingHrLineVo;", "convertChartVo", "", "a", "heartrate_release"}, k = 2, mv = {1, 5, 1})
public final class RestingHrConvertChartVoKt {
    private static final int a(Calendar calendar) {
        if (calendar == null) {
            return 0;
        }
        return (calendar.getActualMaximum(5) - calendar.getActualMinimum(5)) + 1;
    }

    @Nullable
    public static final RestingHrLineVo convertChartVo(@Nullable List<RestingHeartRate> list, @Nullable Calendar calendar) {
        Integer num;
        boolean z = false;
        if (list == null || list.isEmpty()) {
            return null;
        }
        IntRange intRange = new IntRange(1, a(calendar));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e.coerceAtLeast(q.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, 10)), 16));
        Iterator<Integer> it2 = intRange.iterator();
        while (it2.hasNext()) {
            linkedHashMap.put(Integer.valueOf(((IntIterator) it2).nextInt()), 0);
        }
        Map mutableMap = r.toMutableMap(linkedHashMap);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (RestingHeartRate restingHeartRate : list) {
            Date date = HrRestingChartFragment.parseDate(restingHeartRate.getDate());
            if (date == null) {
                num = null;
            } else {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTime(date);
                num = (Integer) mutableMap.put(Integer.valueOf(calendar2.get(5)), Integer.valueOf(restingHeartRate.getRestingHeartRate()));
            }
            arrayList.add(num);
        }
        SparseArray sparseArray = new SparseArray();
        List list2 = CollectionsKt___CollectionsKt.toList(mutableMap.values());
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            float fIntValue = ((Number) obj).intValue();
            if (fIntValue > 0.0f && !z) {
                z = true;
            }
            if (fIntValue > 0.0f) {
                sparseArray.put(i, new ChartData(i, fIntValue));
            }
            arrayList2.add(Unit.INSTANCE);
            i = i2;
        }
        RestingHrLineVo restingHrLineVo = new RestingHrLineVo(mutableMap.values().size() - 1, sparseArray);
        if (z) {
            return restingHrLineVo;
        }
        return null;
    }
}
