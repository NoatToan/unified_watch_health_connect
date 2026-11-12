package com.xiaomi.fitness.repo.heartrate;

import com.xiaomi.fit.fitness.export.data.aggregation.DailyHrReport;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudHrReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.distribute.DailyHrDistribute;
import com.xiaomi.fit.fitness.export.data.item.AbnormalHrItem;
import com.xiaomi.fit.fitness.export.data.item.AbnormalItem;
import com.xiaomi.fit.fitness.export.data.item.DailyDataItemExtKt;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fit.fitness.export.data.item.RestHrItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.persist.server.data.RelativeDataModel;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.BigValueDistinct;
import com.xiaomi.fitness.repo.heartrate.HeartRateBiz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J<\u0010\u000f\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\n2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/repo/heartrate/HeartRateBiz;", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;", "<init>", "()V", "distinct", "Lcom/xiaomi/fitness/repo/BigValueDistinct;", "Lcom/xiaomi/fit/fitness/export/data/item/HrItem;", "convertServerAggregateReport", "time", "", CloudContract.COL_VIEW_TAG, "", "dataModel", "Lcom/xiaomi/fit/fitness/persist/server/data/RelativeDataModel;", "splitDailyReport", "sid", "timestamp", "itemMap", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHeartRateBiz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeartRateBiz.kt\ncom/xiaomi/fitness/repo/heartrate/HeartRateBiz\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,212:1\n216#2:213\n217#2:232\n216#2:233\n217#2:236\n216#2:242\n217#2:245\n216#2:246\n217#2:249\n774#3:214\n865#3,2:215\n774#3:217\n865#3,2:218\n774#3:220\n865#3,2:221\n774#3:223\n865#3,2:224\n774#3:226\n865#3,2:227\n774#3:229\n865#3,2:230\n1863#3,2:234\n1863#3,2:237\n774#3:239\n865#3,2:240\n1863#3,2:243\n1863#3,2:247\n*S KotlinDebug\n*F\n+ 1 HeartRateBiz.kt\ncom/xiaomi/fitness/repo/heartrate/HeartRateBiz\n*L\n72#1:213\n72#1:232\n146#1:233\n146#1:236\n177#1:242\n177#1:245\n198#1:246\n198#1:249\n77#1:214\n77#1:215,2\n79#1:217\n79#1:218,2\n81#1:220\n81#1:221,2\n85#1:223\n85#1:224,2\n92#1:226\n92#1:227,2\n101#1:229\n101#1:230,2\n150#1:234,2\n164#1:237,2\n174#1:239\n174#1:240,2\n181#1:243,2\n202#1:247,2\n*E\n"})
public final class HeartRateBiz extends BaseProcessBiz<DailyHrReport> {

    @NotNull
    private final BigValueDistinct<HrItem> distinct = new BigValueDistinct<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static final int splitDailyReport$lambda$10$lambda$5(SegmentItem segmentItem, SegmentItem segmentItem2) {
        return Intrinsics.compare(segmentItem2.getTimestamp(), segmentItem.getTimestamp());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int splitDailyReport$lambda$10$lambda$6(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int splitDailyReport$lambda$10$lambda$8(SegmentItem segmentItem, SegmentItem segmentItem2) {
        return Intrinsics.compare(segmentItem2.getTimestamp(), segmentItem.getTimestamp());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int splitDailyReport$lambda$10$lambda$9(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int splitDailyReport$lambda$11(RestHrItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getRestHr();
    }

    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    public /* bridge */ /* synthetic */ DailyHrReport splitDailyReport(String str, String str2, long j, Map map) {
        return splitDailyReport(str, str2, j, (Map<String, ? extends List<? extends DailyRecordItem>>) map);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    @NotNull
    public DailyHrReport convertServerAggregateReport(long time, @NotNull String viewTag, @Nullable RelativeDataModel dataModel) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        if (dataModel == null) {
            return new DailyHrReport(time, viewTag);
        }
        CloudHrReport cloudHrReport = (CloudHrReport) FitnessPersistUtils.INSTANCE.fromJson(dataModel.getValue(), CloudHrReport.class);
        if (cloudHrReport == null) {
            return new DailyHrReport(time, viewTag);
        }
        DailyHrReport dailyHrReport = new DailyHrReport(time, viewTag, cloudHrReport.getAvgRestHr(), cloudHrReport.getAvgHr(), cloudHrReport.getMaxHr(), cloudHrReport.getMinHr(), CollectionsKt__CollectionsKt.emptyList(), null, null, null, 896, null);
        dailyHrReport.setLatestHrRecord(cloudHrReport.getLatestHr());
        if (cloudHrReport.getWarmUpHrDuration() != null || cloudHrReport.getFatBurningHrDuration() != null || cloudHrReport.getAnaerobicHrDuration() != null || cloudHrReport.getAerobicHrDuration() != null || cloudHrReport.getExtremeHrDuration() != null) {
            DailyHrDistribute dailyHrDistribute = new DailyHrDistribute();
            Integer extremeHrDuration = cloudHrReport.getExtremeHrDuration();
            dailyHrDistribute.setExtremeDuration(extremeHrDuration != null ? extremeHrDuration.intValue() : 0);
            Integer anaerobicHrDuration = cloudHrReport.getAnaerobicHrDuration();
            dailyHrDistribute.setAnaerobicDuration(anaerobicHrDuration != null ? anaerobicHrDuration.intValue() : 0);
            Integer aerobicHrDuration = cloudHrReport.getAerobicHrDuration();
            dailyHrDistribute.setAerobicDuration(aerobicHrDuration != null ? aerobicHrDuration.intValue() : 0);
            Integer fatBurningHrDuration = cloudHrReport.getFatBurningHrDuration();
            dailyHrDistribute.setFatBurningDuration(fatBurningHrDuration != null ? fatBurningHrDuration.intValue() : 0);
            Integer warmUpHrDuration = cloudHrReport.getWarmUpHrDuration();
            dailyHrDistribute.setWarmUpDuration(warmUpHrDuration != null ? warmUpHrDuration.intValue() : 0);
            dailyHrReport.setHrDistribute(dailyHrDistribute);
        }
        return dailyHrReport;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code duplicated, block: B:126:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:64:0x018e  */
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    @NotNull
    public DailyHrReport splitDailyReport(@Nullable String sid, @NotNull String viewTag, long timestamp, @NotNull Map<String, ? extends List<? extends DailyRecordItem>> itemMap) {
        Map mapGroupByHalfHour;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(itemMap, "itemMap");
        if (itemMap.isEmpty()) {
            return new DailyHrReport(timestamp, viewTag);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<HrItem> arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList<AbnormalHrItem> arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        Iterator<Map.Entry<String, ? extends List<? extends DailyRecordItem>>> it = itemMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, ? extends List<? extends DailyRecordItem>> next = it.next();
            next.getKey();
            List<? extends DailyRecordItem> value = next.getValue();
            Iterator<Map.Entry<String, ? extends List<? extends DailyRecordItem>>> it2 = it;
            switch (next.getKey()) {
                case "single_heart_rate":
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.HrItem>");
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj : value) {
                        if (((HrItem) obj).getHr() > 0) {
                            arrayList10.add(obj);
                        }
                    }
                    arrayList4.addAll(arrayList10);
                    Unit unit = Unit.INSTANCE;
                    break;
                case "high_heart_rate":
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.AbnormalRecordItem>");
                    ArrayList arrayList11 = new ArrayList();
                    for (Object obj2 : value) {
                        List<AbnormalItem> items = ((SegmentItem) obj2).getItems();
                        if (!(items == null || items.isEmpty())) {
                            arrayList11.add(obj2);
                        }
                    }
                    arrayList8.addAll(arrayList11);
                    final Function2 function2 = new Function2() { // from class: h5c
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            return Integer.valueOf(HeartRateBiz.splitDailyReport$lambda$10$lambda$5((SegmentItem) obj3, (SegmentItem) obj4));
                        }
                    };
                    Collections.sort(arrayList8, new Comparator() { // from class: i5c
                        @Override // java.util.Comparator
                        public final int compare(Object obj3, Object obj4) {
                            return HeartRateBiz.splitDailyReport$lambda$10$lambda$6(function2, obj3, obj4);
                        }
                    });
                    Unit unit2 = Unit.INSTANCE;
                    break;
                case "low_heart_rate":
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.AbnormalRecordItem>");
                    ArrayList arrayList12 = new ArrayList();
                    for (Object obj3 : value) {
                        List<AbnormalItem> items2 = ((SegmentItem) obj3).getItems();
                        if (!(items2 == null || items2.isEmpty())) {
                            arrayList12.add(obj3);
                        }
                    }
                    arrayList9.addAll(arrayList12);
                    final Function2 function3 = new Function2() { // from class: j5c
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            return Integer.valueOf(HeartRateBiz.splitDailyReport$lambda$10$lambda$8((SegmentItem) obj4, (SegmentItem) obj5));
                        }
                    };
                    Collections.sort(arrayList9, new Comparator() { // from class: k5c
                        @Override // java.util.Comparator
                        public final int compare(Object obj4, Object obj5) {
                            return HeartRateBiz.splitDailyReport$lambda$10$lambda$9(function3, obj4, obj5);
                        }
                    });
                case "abnormal_heart_beat":
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem>");
                    arrayList6.addAll(value);
                    Unit unit3 = Unit.INSTANCE;
                    break;
                case "abnormal_heart_rate":
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.AbnormalHrItem>");
                    ArrayList arrayList13 = new ArrayList();
                    for (Object obj4 : value) {
                        if (((AbnormalHrItem) obj4).getHr() > 0) {
                            arrayList13.add(obj4);
                        }
                    }
                    arrayList7.addAll(arrayList13);
                    Unit unit4 = Unit.INSTANCE;
                    break;
                case "resting_heart_rate":
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.RestHrItem>");
                    ArrayList arrayList14 = new ArrayList();
                    for (Object obj5 : value) {
                        if (((RestHrItem) obj5).getRestHr() > 0) {
                            arrayList14.add(obj5);
                        }
                    }
                    arrayList5.addAll(arrayList14);
                    Unit unit5 = Unit.INSTANCE;
                    break;
                case "heart_rate":
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.HrItem>");
                    ArrayList arrayList15 = new ArrayList();
                    for (Object obj6 : value) {
                        if (((HrItem) obj6).getHr() > 0) {
                            arrayList15.add(obj6);
                        }
                    }
                    arrayList3.addAll(arrayList15);
                    Unit unit6 = Unit.INSTANCE;
                    break;
                default:
                    Unit unit7 = Unit.INSTANCE;
                    break;
            }
            it = it2;
        }
        arrayList2.addAll(arrayList3);
        arrayList3.addAll(arrayList4);
        for (AbnormalHrItem abnormalHrItem : arrayList7) {
            arrayList3.add(new HrItem(abnormalHrItem.getTime(), abnormalHrItem.getHr()));
            arrayList9 = arrayList9;
        }
        ArrayList arrayList16 = arrayList9;
        Iterator it3 = arrayList8.iterator();
        while (it3.hasNext()) {
            arrayList3.addAll(DailyDataItemExtKt.toHrItemList((SegmentItem) it3.next()));
        }
        Iterator it4 = arrayList16.iterator();
        while (it4.hasNext()) {
            arrayList3.addAll(DailyDataItemExtKt.toHrItemList((SegmentItem) it4.next()));
        }
        Integer num = (Integer) ListExtKt.minOfOrDefault(arrayList5, null, new Function1() { // from class: l5c
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj7) {
                return Integer.valueOf(HeartRateBiz.splitDailyReport$lambda$11((RestHrItem) obj7));
            }
        });
        int avgPrimaryValue = getAvgPrimaryValue(arrayList3);
        int maxPrimaryValue = getMaxPrimaryValue(arrayList3);
        int minPrimaryValue = getMinPrimaryValue(arrayList3);
        switch (viewTag) {
            case "months":
                mapGroupByHalfHour = groupByDay(timestamp, arrayList3, this.distinct);
                break;
            case "days":
                mapGroupByHalfHour = groupByHalfHour(timestamp, arrayList3, this.distinct);
                break;
            case "home":
                mapGroupByHalfHour = groupByHour(timestamp, arrayList3, this.distinct);
                break;
            case "hours":
                mapGroupByHalfHour = groupByMinute(timestamp, arrayList3, this.distinct);
                break;
            case "weeks":
                mapGroupByHalfHour = groupByDay(timestamp, arrayList3, this.distinct);
                break;
            default:
                mapGroupByHalfHour = null;
                break;
        }
        ArrayList arrayList17 = new ArrayList();
        if (mapGroupByHalfHour != null) {
            Iterator it5 = mapGroupByHalfHour.entrySet().iterator();
            while (it5.hasNext()) {
                Map.Entry entry = (Map.Entry) it5.next();
                ArrayList arrayList18 = arrayList8;
                long jLongValue = ((Number) entry.getKey()).longValue();
                List list = (List) entry.getValue();
                Iterator it6 = it5;
                ArrayList arrayList19 = new ArrayList();
                Iterator it7 = list.iterator();
                while (it7.hasNext()) {
                    HrItem hrItem = (HrItem) it7.next();
                    Iterator it8 = it7;
                    if (!arrayList19.contains(Integer.valueOf(hrItem.getHr()))) {
                        arrayList19.add(Integer.valueOf(hrItem.getHr()));
                    }
                    it7 = it8;
                }
                arrayList17.add(new TimesDataRecordInt(jLongValue, CollectionsKt___CollectionsKt.toIntArray(arrayList19)));
                it5 = it6;
                arrayList8 = arrayList18;
            }
            arrayList = arrayList8;
            Unit unit8 = Unit.INSTANCE;
        } else {
            arrayList = arrayList8;
        }
        ArrayList arrayList20 = arrayList;
        DailyHrReport dailyHrReport = new DailyHrReport(timestamp, viewTag, num, avgPrimaryValue, maxPrimaryValue, minPrimaryValue, arrayList17, arrayList4, null, arrayList6);
        long time = Long.MIN_VALUE;
        HrItem hrItem2 = null;
        for (HrItem hrItem3 : arrayList3) {
            if (time < hrItem3.getTime()) {
                time = hrItem3.getTime();
                hrItem2 = hrItem3;
            }
        }
        dailyHrReport.setLatestHrRecord(hrItem2);
        dailyHrReport.setAbnormalHrHighRecords(arrayList20);
        dailyHrReport.setAbnormalHrLowRecords(arrayList16);
        ArrayList arrayList21 = new ArrayList();
        for (Object obj7 : arrayList3) {
            Integer hrType = ((HrItem) obj7).getHrType();
            if (hrType != null && hrType.intValue() == 1) {
                arrayList21.add(obj7);
            }
        }
        Map mapGroupByHalfHour2 = groupByHalfHour(timestamp, arrayList21, this.distinct);
        ArrayList arrayList22 = new ArrayList();
        for (Map.Entry entry2 : mapGroupByHalfHour2.entrySet()) {
            long jLongValue2 = ((Number) entry2.getKey()).longValue();
            List<HrItem> list2 = (List) entry2.getValue();
            ArrayList arrayList23 = new ArrayList();
            for (HrItem hrItem4 : list2) {
                if (!arrayList23.contains(Integer.valueOf(hrItem4.getHr()))) {
                    arrayList23.add(Integer.valueOf(hrItem4.getHr()));
                }
            }
            arrayList22.add(new TimesDataRecordInt(jLongValue2, CollectionsKt___CollectionsKt.toIntArray(arrayList23)));
        }
        int avgPrimaryValue2 = getAvgPrimaryValue(arrayList21);
        if (!arrayList21.isEmpty()) {
            dailyHrReport.setStepHrRecords(arrayList22);
            dailyHrReport.setStepAvgHr(Integer.valueOf(avgPrimaryValue2));
        }
        if (Intrinsics.areEqual("days", viewTag)) {
            Map mapGroupByDay = groupByDay(timestamp, arrayList2, this.distinct);
            ArrayList arrayList24 = new ArrayList();
            for (Map.Entry entry3 : mapGroupByDay.entrySet()) {
                long jLongValue3 = ((Number) entry3.getKey()).longValue();
                List list3 = (List) entry3.getValue();
                ArrayList arrayList25 = new ArrayList();
                Iterator it9 = list3.iterator();
                while (it9.hasNext()) {
                    arrayList25.add(Integer.valueOf(((HrItem) it9.next()).getHr()));
                }
                arrayList24.add(new TimesDataRecordInt(jLongValue3, CollectionsKt___CollectionsKt.toIntArray(arrayList25)));
            }
            dailyHrReport.setHrDistribute(HeartRateDistribute.INSTANCE.computeHrDistribute(arrayList24));
        }
        return dailyHrReport;
    }
}
