package com.xiaomi.fitness.repo.stress;

import android.text.TextUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStressReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.item.AbnormalItem;
import com.xiaomi.fit.fitness.export.data.item.DailyDataItemExtKt;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.export.data.item.StressItem;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.BigValueDistinct;
import com.xiaomi.fitness.repo.stress.StressBiz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J<\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/repo/stress/StressBiz;", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStressReport;", "<init>", "()V", "bigValueDistinct", "Lcom/xiaomi/fitness/repo/BigValueDistinct;", "Lcom/xiaomi/fit/fitness/export/data/item/StressItem;", "splitDailyReport", "sid", "", CloudContract.COL_VIEW_TAG, "timestamp", "", "itemMap", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStressBiz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StressBiz.kt\ncom/xiaomi/fitness/repo/stress/StressBiz\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,184:1\n216#2,2:185\n216#2:188\n217#2:191\n1#3:187\n1863#4,2:189\n1863#4,2:192\n*S KotlinDebug\n*F\n+ 1 StressBiz.kt\ncom/xiaomi/fitness/repo/stress/StressBiz\n*L\n60#1:185,2\n147#1:188\n147#1:191\n151#1:189,2\n174#1:192,2\n*E\n"})
public final class StressBiz extends BaseProcessBiz<DailyStressReport> {

    @NotNull
    private final BigValueDistinct<StressItem> bigValueDistinct = new BigValueDistinct<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean splitDailyReport$lambda$0(DailyRecordItem item) {
        List<AbnormalItem> items;
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof StressItem) {
            if (((StressItem) item).getStress() > 0) {
                return true;
            }
        } else if ((item instanceof SegmentItem) && (items = ((SegmentItem) item).getItems()) != null && !items.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int splitDailyReport$lambda$2(SegmentItem segmentItem, SegmentItem segmentItem2) {
        return Intrinsics.compare(segmentItem2.getTimestamp(), segmentItem.getTimestamp());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int splitDailyReport$lambda$3(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int splitDailyReport$lambda$5(StressItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getStress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int splitDailyReport$lambda$6(StressItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getStress();
    }

    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    public /* bridge */ /* synthetic */ DailyStressReport splitDailyReport(String str, String str2, long j, Map map) {
        return splitDailyReport(str, str2, j, (Map<String, ? extends List<? extends DailyRecordItem>>) map);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code duplicated, block: B:109:0x028f  */
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    @NotNull
    public DailyStressReport splitDailyReport(@Nullable String sid, @NotNull String viewTag, long timestamp, @NotNull Map<String, ? extends List<? extends DailyRecordItem>> itemMap) {
        Object first;
        int size;
        Map mapGroupByHalfHour;
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(itemMap, "itemMap");
        if (!Intrinsics.areEqual(viewTag, "home") && TextUtils.isEmpty(sid)) {
            return new DailyStressReport(timestamp, viewTag, "sid is null or empty");
        }
        if (itemMap.isEmpty()) {
            return new DailyStressReport(timestamp, viewTag, "source data is empty");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Pair pairSpiltRecordList$default = BaseProcessBiz.spiltRecordList$default(this, itemMap, new Function1() { // from class: ojo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(StressBiz.splitDailyReport$lambda$0((DailyRecordItem) obj));
            }
        }, null, 4, null);
        if (Intrinsics.areEqual(viewTag, "home")) {
            first = pairSpiltRecordList$default.getFirst();
        } else {
            Intrinsics.checkNotNull(sid);
            for (Map.Entry<String, ? extends List<? extends DailyRecordItem>> entry : itemMap.entrySet()) {
                String key = entry.getKey();
                List<? extends DailyRecordItem> value = entry.getValue();
                int iHashCode = key.hashCode();
                if (iHashCode != -2054887029) {
                    if (iHashCode != -891989580) {
                        if (iHashCode == -162515215 && key.equals(FitnessPersistKey.AbnormalStress)) {
                            for (DailyRecordItem dailyRecordItem : value) {
                                if (Intrinsics.areEqual(sid, dailyRecordItem.getSid())) {
                                    Intrinsics.checkNotNull(dailyRecordItem, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.AbnormalRecordItem");
                                    arrayList2.add((SegmentItem) dailyRecordItem);
                                }
                            }
                        } else {
                            FitnessLogUtils.e(getTAG(), "unknown stress key " + key);
                        }
                    } else if (key.equals("stress")) {
                        for (DailyRecordItem dailyRecordItem2 : value) {
                            if (Intrinsics.areEqual(sid, dailyRecordItem2.getSid())) {
                                Intrinsics.checkNotNull(dailyRecordItem2, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.StressItem");
                                StressItem stressItem = (StressItem) dailyRecordItem2;
                                if (stressItem.getStress() > 0) {
                                    arrayList3.add(stressItem);
                                }
                            }
                        }
                    } else {
                        FitnessLogUtils.e(getTAG(), "unknown stress key " + key);
                    }
                } else if (key.equals(FitnessPersistKey.ManualStress)) {
                    for (DailyRecordItem dailyRecordItem3 : value) {
                        if (Intrinsics.areEqual(sid, dailyRecordItem3.getSid())) {
                            Intrinsics.checkNotNull(dailyRecordItem3, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.StressItem");
                            StressItem stressItem2 = (StressItem) dailyRecordItem3;
                            if (stressItem2.getStress() > 0) {
                                arrayList.add(stressItem2);
                            }
                        }
                    }
                } else {
                    FitnessLogUtils.e(getTAG(), "unknown stress key " + key);
                }
            }
            final Function2 function2 = new Function2() { // from class: pjo
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(StressBiz.splitDailyReport$lambda$2((SegmentItem) obj, (SegmentItem) obj2));
                }
            };
            Collections.sort(arrayList2, new Comparator() { // from class: qjo
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return StressBiz.splitDailyReport$lambda$3(function2, obj, obj2);
                }
            });
            first = sid;
        }
        List<DailyRecordItem> list = (List) ((Map) pairSpiltRecordList$default.getSecond()).get(first);
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            Object obj = first;
            FitnessLogUtils.i(getTAG(), "pairList:no data to sid " + obj);
            return new DailyStressReport(timestamp, viewTag, (String) obj);
        }
        ArrayList<StressItem> arrayList4 = new ArrayList();
        for (DailyRecordItem dailyRecordItem4 : list) {
            if (dailyRecordItem4 instanceof StressItem) {
                if (((StressItem) dailyRecordItem4).getStress() > 0) {
                    arrayList4.add(dailyRecordItem4);
                }
            } else if (dailyRecordItem4 instanceof SegmentItem) {
                List<AbnormalItem> items = ((SegmentItem) dailyRecordItem4).getItems();
                if (items != null) {
                    for (AbnormalItem abnormalItem : items) {
                        if (abnormalItem.getValue() > 0) {
                            arrayList4.add(DailyDataItemExtKt.toStressItem(abnormalItem));
                        }
                    }
                }
            } else {
                FitnessLogUtils.e(getTAG(), "unknown stress type " + dailyRecordItem4);
            }
        }
        if (arrayList4.isEmpty()) {
            FitnessLogUtils.i(getTAG(), "allRecordList:no data to sid " + first);
            return new DailyStressReport(timestamp, viewTag, (String) first);
        }
        Object objMaxOfOrDefault = ListExtKt.maxOfOrDefault(arrayList4, 0, new Function1() { // from class: rjo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return Integer.valueOf(StressBiz.splitDailyReport$lambda$5((StressItem) obj2));
            }
        });
        Intrinsics.checkNotNull(objMaxOfOrDefault);
        int iIntValue = ((Number) objMaxOfOrDefault).intValue();
        Object objMinOfOrDefault = ListExtKt.minOfOrDefault(arrayList4, 0, new Function1() { // from class: sjo
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return Integer.valueOf(StressBiz.splitDailyReport$lambda$6((StressItem) obj2));
            }
        });
        Intrinsics.checkNotNull(objMinOfOrDefault);
        int iIntValue2 = ((Number) objMinOfOrDefault).intValue();
        if (!arrayList4.isEmpty()) {
            Iterator it = arrayList4.iterator();
            int stress = 0;
            while (it.hasNext()) {
                stress += ((StressItem) it.next()).getStress();
            }
            size = stress / arrayList4.size();
        } else {
            size = 0;
        }
        switch (viewTag) {
            case "months":
                mapGroupByHalfHour = groupByDay(timestamp, arrayList4, this.bigValueDistinct);
                break;
            case "days":
                mapGroupByHalfHour = groupByHalfHour(timestamp, arrayList4, this.bigValueDistinct);
                break;
            case "home":
                mapGroupByHalfHour = groupByHour(timestamp, arrayList4, this.bigValueDistinct);
                break;
            case "weeks":
                mapGroupByHalfHour = groupByDay(timestamp, arrayList4, this.bigValueDistinct);
                break;
            default:
                mapGroupByHalfHour = null;
                break;
        }
        ArrayList arrayList5 = new ArrayList();
        if (mapGroupByHalfHour != null) {
            Iterator it2 = mapGroupByHalfHour.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                Object obj2 = first;
                long jLongValue = ((Number) entry2.getKey()).longValue();
                List list3 = (List) entry2.getValue();
                Iterator it3 = it2;
                ArrayList arrayList6 = new ArrayList();
                Iterator it4 = list3.iterator();
                while (it4.hasNext()) {
                    int stress2 = ((StressItem) it4.next()).getStress();
                    ArrayList arrayList7 = arrayList2;
                    if (stress2 > 0 && !arrayList6.contains(Integer.valueOf(stress2))) {
                        arrayList6.add(Integer.valueOf(stress2));
                    }
                    arrayList2 = arrayList7;
                }
                arrayList5.add(new TimesDataRecordInt(jLongValue, CollectionsKt___CollectionsKt.toIntArray(arrayList6)));
                it2 = it3;
                first = obj2;
                arrayList2 = arrayList2;
            }
        }
        Object obj3 = first;
        ArrayList arrayList8 = arrayList2;
        Map<Integer, Integer> mapCreateStressDistribute = StressDistribute.INSTANCE.createStressDistribute(!Intrinsics.areEqual(viewTag, "home") ? groupByDay(timestamp, arrayList3, this.bigValueDistinct) : null);
        String str = (String) obj3;
        Integer num = mapCreateStressDistribute.get(0);
        Intrinsics.checkNotNull(num);
        int iIntValue3 = num.intValue();
        Integer num2 = mapCreateStressDistribute.get(1);
        Intrinsics.checkNotNull(num2);
        int iIntValue4 = num2.intValue();
        Integer num3 = mapCreateStressDistribute.get(2);
        Intrinsics.checkNotNull(num3);
        int iIntValue5 = num3.intValue();
        Integer num4 = mapCreateStressDistribute.get(3);
        Intrinsics.checkNotNull(num4);
        DailyStressReport dailyStressReport = new DailyStressReport(timestamp, viewTag, str, size, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, num4.intValue(), arrayList5, arrayList);
        long time = Long.MIN_VALUE;
        StressItem stressItem3 = null;
        for (StressItem stressItem4 : arrayList4) {
            if (time < stressItem4.getTime()) {
                time = stressItem4.getTime();
                stressItem3 = stressItem4;
            }
        }
        dailyStressReport.setLatestStressRecord(stressItem3);
        dailyStressReport.setAbnormalStressRecords(arrayList8);
        return dailyStressReport;
    }
}
