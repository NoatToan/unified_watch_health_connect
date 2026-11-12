package com.xiaomi.fitness.repo.stress;

import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.item.StressItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0005J\"\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\tH\u0002¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/repo/stress/StressDistribute;", "", "<init>", "()V", "createStressDistribute", "", "", "map", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/StressItem;", "doCalcDistribute", "recordList", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimesDataRecordInt;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStressDistribute.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StressDistribute.kt\ncom/xiaomi/fitness/repo/stress/StressDistribute\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n216#2:74\n217#2:77\n1863#3,2:75\n*S KotlinDebug\n*F\n+ 1 StressDistribute.kt\ncom/xiaomi/fitness/repo/stress/StressDistribute\n*L\n18#1:74\n18#1:77\n22#1:75,2\n*E\n"})
public final class StressDistribute {

    @NotNull
    public static final StressDistribute INSTANCE = new StressDistribute();

    private StressDistribute() {
    }

    private final Map<Integer, Integer> doCalcDistribute(List<TimesDataRecordInt> recordList) {
        int i;
        int i2;
        int i3;
        int i4;
        List<TimesDataRecordInt> list = recordList;
        if (list == null || list.isEmpty()) {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        } else {
            Iterator<TimesDataRecordInt> it = recordList.iterator();
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            while (it.hasNext()) {
                int[] valueArray = it.next().getValueArray();
                Intrinsics.checkNotNull(valueArray);
                for (int i5 : valueArray) {
                    if (i5 >= 81) {
                        i++;
                    } else if (i5 >= 51) {
                        i2++;
                    } else if (i5 >= 26) {
                        i3++;
                    } else if (i5 > 0) {
                        i4++;
                    }
                }
            }
        }
        return MapsKt__MapsKt.mutableMapOf(TuplesKt.to(0, Integer.valueOf(i)), TuplesKt.to(1, Integer.valueOf(i2)), TuplesKt.to(2, Integer.valueOf(i3)), TuplesKt.to(3, Integer.valueOf(i4)));
    }

    @NotNull
    public final Map<Integer, Integer> createStressDistribute(@Nullable Map<Long, ? extends List<StressItem>> map) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4 = 0;
        if (map == null || map.isEmpty()) {
            iIntValue = 0;
            iIntValue2 = 0;
            iIntValue3 = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<Long, ? extends List<StressItem>> entry : map.entrySet()) {
                long jLongValue = entry.getKey().longValue();
                List<StressItem> value = entry.getValue();
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it = value.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(((StressItem) it.next()).getStress()));
                }
                arrayList.add(new TimesDataRecordInt(jLongValue, CollectionsKt___CollectionsKt.toIntArray(arrayList2)));
            }
            Map<Integer, Integer> mapDoCalcDistribute = doCalcDistribute(arrayList);
            Integer num = mapDoCalcDistribute.get(0);
            Intrinsics.checkNotNull(num);
            iIntValue4 = num.intValue();
            Integer num2 = mapDoCalcDistribute.get(1);
            Intrinsics.checkNotNull(num2);
            iIntValue2 = num2.intValue();
            Integer num3 = mapDoCalcDistribute.get(2);
            Intrinsics.checkNotNull(num3);
            iIntValue3 = num3.intValue();
            Integer num4 = mapDoCalcDistribute.get(3);
            Intrinsics.checkNotNull(num4);
            iIntValue = num4.intValue();
        }
        return MapsKt__MapsKt.mutableMapOf(TuplesKt.to(0, Integer.valueOf(iIntValue4)), TuplesKt.to(1, Integer.valueOf(iIntValue2)), TuplesKt.to(2, Integer.valueOf(iIntValue3)), TuplesKt.to(3, Integer.valueOf(iIntValue)));
    }
}
