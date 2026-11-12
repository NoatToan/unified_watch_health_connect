package com.xiaomi.fitness.repo.energy;

import android.text.TextUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyEnergyReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.EnergyStateRecord;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.EnergyItem;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.energy.EnergyBiz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J<\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0016¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/repo/energy/EnergyBiz;", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyEnergyReport;", "<init>", "()V", "splitDailyReport", "sid", "", CloudContract.COL_VIEW_TAG, "timestamp", "", "itemMap", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEnergyBiz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnergyBiz.kt\ncom/xiaomi/fitness/repo/energy/EnergyBiz\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,158:1\n216#2:159\n217#2:162\n216#2,2:163\n1863#3,2:160\n*S KotlinDebug\n*F\n+ 1 EnergyBiz.kt\ncom/xiaomi/fitness/repo/energy/EnergyBiz\n*L\n74#1:159\n74#1:162\n89#1:163,2\n78#1:160,2\n*E\n"})
public final class EnergyBiz extends BaseProcessBiz<DailyEnergyReport> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean splitDailyReport$lambda$0(DailyRecordItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return (item instanceof EnergyItem) && ((EnergyItem) item).getEnergy() > 0;
    }

    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    public /* bridge */ /* synthetic */ DailyEnergyReport splitDailyReport(String str, String str2, long j, Map map) {
        return splitDailyReport(str, str2, j, (Map<String, ? extends List<? extends DailyRecordItem>>) map);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code duplicated, block: B:101:0x0293  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x013e A[PHI: r11 r14 r15 r21 r22 r28
      0x013e: PHI (r11v12 java.lang.Object) = (r11v1 java.lang.Object), (r11v2 java.lang.Object), (r11v13 java.lang.Object) binds: [B:48:0x013c, B:44:0x011f, B:34:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r14v10 java.lang.Object) = (r14v0 java.lang.Object), (r14v1 java.lang.Object), (r14v11 java.lang.Object) binds: [B:48:0x013c, B:44:0x011f, B:34:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r15v8 java.lang.Object) = (r15v0 java.lang.Object), (r15v1 java.lang.Object), (r15v9 java.lang.Object) binds: [B:48:0x013c, B:44:0x011f, B:34:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r21v9 java.util.ArrayList) = (r21v0 java.util.ArrayList), (r21v1 java.util.ArrayList), (r21v10 java.util.ArrayList) binds: [B:48:0x013c, B:44:0x011f, B:34:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r22v7 com.xiaomi.fit.fitness.export.data.item.EnergyItem) = 
      (r22v0 com.xiaomi.fit.fitness.export.data.item.EnergyItem)
      (r22v1 com.xiaomi.fit.fitness.export.data.item.EnergyItem)
      (r22v8 com.xiaomi.fit.fitness.export.data.item.EnergyItem)
     binds: [B:48:0x013c, B:44:0x011f, B:34:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r28v11 int) = (r28v1 int), (r28v2 int), (r28v12 int) binds: [B:48:0x013c, B:44:0x011f, B:34:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x015d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0184  */
    /* JADX WARN: Code duplicated, block: B:58:0x019a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0278  */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x00ca. Please report as an issue. */
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    @NotNull
    public DailyEnergyReport splitDailyReport(@Nullable String sid, @NotNull String viewTag, long timestamp, @NotNull Map<String, ? extends List<? extends DailyRecordItem>> itemMap) {
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList arrayList;
        int i;
        EnergyItem energyItem;
        Map mapGroupByHalfHour$default;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i2;
        int i3;
        int i4;
        Iterator it;
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(itemMap, "itemMap");
        if (!Intrinsics.areEqual(viewTag, "home") && TextUtils.isEmpty(sid)) {
            throw new IllegalArgumentException("sid cannot be null or empty");
        }
        if (itemMap.isEmpty()) {
            return new DailyEnergyReport(timestamp, viewTag, null);
        }
        Pair pairSpiltRecordList$default = BaseProcessBiz.spiltRecordList$default(this, itemMap, new Function1() { // from class: la8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj4) {
                return Boolean.valueOf(EnergyBiz.splitDailyReport$lambda$0((DailyRecordItem) obj4));
            }
        }, null, 4, null);
        if (Intrinsics.areEqual(viewTag, "home")) {
            str = (String) pairSpiltRecordList$default.getFirst();
        } else {
            Intrinsics.checkNotNull(sid);
            str = sid;
        }
        List<EnergyItem> list = (List) ((Map) pairSpiltRecordList$default.getSecond()).get(str);
        List<EnergyItem> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            FitnessLogUtils.i(getTAG(), "there is no data for sid: " + str);
            return new DailyEnergyReport(timestamp, viewTag, str);
        }
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.EnergyItem>");
        String str2 = (String) pairSpiltRecordList$default.getFirst();
        EnergyItem energyItem2 = null;
        int energy = 0;
        long time = Long.MIN_VALUE;
        for (EnergyItem energyItem3 : list) {
            energy += energyItem3.getEnergy();
            if (time < energyItem3.getTime()) {
                time = energyItem3.getTime();
                energyItem2 = energyItem3;
            }
        }
        int size = list.isEmpty() ^ true ? energy / list.size() : 0;
        ArrayList arrayList4 = new ArrayList();
        switch (viewTag.hashCode()) {
            case -1068487181:
                obj = "weeks";
                obj2 = "days";
                obj3 = "months";
                arrayList = arrayList4;
                i = 1;
                energyItem = energyItem2;
                if (viewTag.equals(obj3)) {
                    mapGroupByHalfHour$default = BaseProcessBiz.groupByDay$default(this, timestamp, list, null, 4, null);
                    for (Map.Entry entry : mapGroupByHalfHour$default.entrySet()) {
                        long jLongValue = ((Number) entry.getKey()).longValue();
                        List<EnergyItem> list3 = (List) entry.getValue();
                        arrayList3 = new ArrayList();
                        for (EnergyItem energyItem4 : list3) {
                            Map map = mapGroupByHalfHour$default;
                            if (!arrayList3.contains(Integer.valueOf(energyItem4.getEnergy()))) {
                                arrayList3.add(Integer.valueOf(energyItem4.getEnergy()));
                            }
                            mapGroupByHalfHour$default = map;
                        }
                        arrayList.add(new TimesDataRecordInt(jLongValue, CollectionsKt___CollectionsKt.toIntArray(arrayList3)));
                        mapGroupByHalfHour$default = mapGroupByHalfHour$default;
                    }
                    arrayList2 = arrayList;
                } else {
                    arrayList2 = arrayList;
                    mapGroupByHalfHour$default = null;
                }
                break;
            case 3076183:
                obj = "weeks";
                obj2 = "days";
                obj3 = "months";
                arrayList = arrayList4;
                i = 1;
                energyItem = energyItem2;
                if (viewTag.equals(obj2)) {
                    mapGroupByHalfHour$default = BaseProcessBiz.groupByHalfHour$default(this, timestamp, list, null, 4, null);
                    arrayList2 = arrayList;
                } else {
                    arrayList2 = arrayList;
                    mapGroupByHalfHour$default = null;
                }
                break;
            case 3208415:
                if (viewTag.equals("home")) {
                    obj = "weeks";
                    obj2 = "days";
                    obj3 = "months";
                    arrayList = arrayList4;
                    i = 1;
                    energyItem = energyItem2;
                    mapGroupByHalfHour$default = BaseProcessBiz.groupByHour$default(this, timestamp, list, null, 4, null);
                    arrayList2 = arrayList;
                }
                obj = "weeks";
                obj2 = "days";
                obj3 = "months";
                arrayList = arrayList4;
                i = 1;
                energyItem = energyItem2;
                arrayList2 = arrayList;
                mapGroupByHalfHour$default = null;
                break;
            case 113008383:
                if (viewTag.equals("weeks")) {
                    obj = "weeks";
                    obj2 = "days";
                    obj3 = "months";
                    arrayList = arrayList4;
                    i = 1;
                    energyItem = energyItem2;
                    mapGroupByHalfHour$default = BaseProcessBiz.groupByDay$default(this, timestamp, list, null, 4, null);
                    while (r5.hasNext()) {
                        long jLongValue2 = ((Number) entry.getKey()).longValue();
                        List<EnergyItem> list4 = (List) entry.getValue();
                        arrayList3 = new ArrayList();
                        while (r6.hasNext()) {
                            Map map2 = mapGroupByHalfHour$default;
                            if (!arrayList3.contains(Integer.valueOf(energyItem4.getEnergy()))) {
                                arrayList3.add(Integer.valueOf(energyItem4.getEnergy()));
                            }
                            mapGroupByHalfHour$default = map2;
                        }
                        arrayList.add(new TimesDataRecordInt(jLongValue2, CollectionsKt___CollectionsKt.toIntArray(arrayList3)));
                        mapGroupByHalfHour$default = mapGroupByHalfHour$default;
                    }
                    arrayList2 = arrayList;
                }
                obj = "weeks";
                obj2 = "days";
                obj3 = "months";
                arrayList = arrayList4;
                i = 1;
                energyItem = energyItem2;
                arrayList2 = arrayList;
                mapGroupByHalfHour$default = null;
                break;
            default:
                obj = "weeks";
                obj2 = "days";
                obj3 = "months";
                arrayList = arrayList4;
                i = 1;
                energyItem = energyItem2;
                arrayList2 = arrayList;
                mapGroupByHalfHour$default = null;
                break;
        }
        if (mapGroupByHalfHour$default != null) {
            Iterator it2 = mapGroupByHalfHour$default.entrySet().iterator();
            int iMax = Integer.MIN_VALUE;
            int iMin = Integer.MAX_VALUE;
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                List<EnergyItem> list5 = (List) entry2.getValue();
                List list6 = list5;
                if (list6 == null || list6.isEmpty()) {
                    it = it2;
                } else {
                    int iMin2 = Integer.MAX_VALUE;
                    int iMax2 = Integer.MIN_VALUE;
                    EnergyItem energyItem5 = null;
                    long time2 = Long.MIN_VALUE;
                    for (EnergyItem energyItem6 : list5) {
                        if (time2 < energyItem6.getTime()) {
                            time2 = energyItem6.getTime();
                            energyItem5 = energyItem6;
                        }
                        iMin2 = Math.min(iMin2, energyItem6.getEnergy());
                        iMax2 = Math.max(iMax2, energyItem6.getEnergy());
                        it2 = it2;
                    }
                    it = it2;
                    int energy2 = energyItem5 != null ? energyItem5.getEnergy() : 0;
                    if (energy2 > 0) {
                        iMax = Math.max(iMax, energy2);
                        iMin = Math.min(iMin, energy2);
                    }
                    int i5 = iMax;
                    int i6 = iMin;
                    TimesDataRecordInt timesDataRecordInt = new TimesDataRecordInt(((Number) entry2.getKey()).longValue(), new int[]{0});
                    switch (viewTag.hashCode()) {
                        case -1068487181:
                            if (viewTag.equals(obj3)) {
                                timesDataRecordInt = new TimesDataRecordInt(((Number) entry2.getKey()).longValue(), new int[]{iMin2, iMax2});
                            }
                            break;
                        case 3076183:
                            if (viewTag.equals(obj2)) {
                                timesDataRecordInt = new TimesDataRecordInt(((Number) entry2.getKey()).longValue(), new int[]{energy2});
                            }
                            break;
                        case 3208415:
                            if (viewTag.equals("home")) {
                                timesDataRecordInt = new TimesDataRecordInt(((Number) entry2.getKey()).longValue(), new int[]{energy2});
                            }
                            break;
                        case 113008383:
                            if (viewTag.equals(obj)) {
                                timesDataRecordInt = new TimesDataRecordInt(((Number) entry2.getKey()).longValue(), new int[]{iMin2, iMax2});
                            }
                            break;
                    }
                    arrayList2.add(timesDataRecordInt);
                    iMax = i5;
                    iMin = i6;
                }
                it2 = it;
            }
            i3 = iMax;
            i2 = iMin;
        } else {
            i2 = Integer.MAX_VALUE;
            i3 = Integer.MIN_VALUE;
        }
        ArrayList arrayList5 = new ArrayList();
        if (Intrinsics.areEqual(viewTag, obj2)) {
            for (Map.Entry entry3 : BaseProcessBiz.groupByHalfHour$default(this, timestamp, list, null, 4, null).entrySet()) {
                long jLongValue3 = ((Number) entry3.getKey()).longValue();
                Map<Integer, Integer> mapCalcHalfHourStateValue = EnergyDistribute.INSTANCE.calcHalfHourStateValue((List) entry3.getValue());
                Integer num = mapCalcHalfHourStateValue.get(Integer.valueOf(i));
                Intrinsics.checkNotNull(num);
                int iIntValue = num.intValue();
                Integer num2 = mapCalcHalfHourStateValue.get(3);
                Intrinsics.checkNotNull(num2);
                int iIntValue2 = num2.intValue();
                Integer num3 = mapCalcHalfHourStateValue.get(2);
                Intrinsics.checkNotNull(num3);
                int iIntValue3 = num3.intValue();
                if (iIntValue != 0) {
                    i4 = i;
                    arrayList5.add(new EnergyStateRecord(jLongValue3, i4, iIntValue));
                } else {
                    i4 = i;
                }
                if (iIntValue2 != 0) {
                    arrayList5.add(new EnergyStateRecord(jLongValue3, 3, iIntValue2));
                }
                if (iIntValue3 != 0) {
                    arrayList5.add(new EnergyStateRecord(jLongValue3, 2, iIntValue3));
                }
                i = i4;
            }
        }
        int i7 = i;
        Map<Integer, Integer> mapCalcDuration = EnergyDistribute.INSTANCE.calcDuration(list);
        Integer num4 = mapCalcDuration.get(Integer.valueOf(i7));
        Intrinsics.checkNotNull(num4);
        int iIntValue4 = num4.intValue();
        Integer num5 = mapCalcDuration.get(3);
        Intrinsics.checkNotNull(num5);
        int iIntValue5 = num5.intValue();
        Integer num6 = mapCalcDuration.get(2);
        Intrinsics.checkNotNull(num6);
        DailyEnergyReport dailyEnergyReport = new DailyEnergyReport(timestamp, viewTag, str2, size, i3, i2, iIntValue4, iIntValue5, num6.intValue(), arrayList2, arrayList5);
        dailyEnergyReport.setLatestEnergyRecord(energyItem);
        return dailyEnergyReport;
    }
}
