package com.xiaomi.fitness.repo.spo2;

import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.DailySpo2Report;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudSpo2Report;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.item.AbnormalItem;
import com.xiaomi.fit.fitness.export.data.item.DailyDataItemExtKt;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.export.data.item.Spo2Item;
import com.xiaomi.fit.fitness.persist.server.data.RelativeDataModel;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.spo2.Spo2Biz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J<\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00072\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010H\u0016¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/repo/spo2/Spo2Biz;", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailySpo2Report;", "<init>", "()V", "convertServerAggregateReport", "time", "", CloudContract.COL_VIEW_TAG, "", "dataModel", "Lcom/xiaomi/fit/fitness/persist/server/data/RelativeDataModel;", "splitDailyReport", "sid", "timestamp", "itemMap", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSpo2Biz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Spo2Biz.kt\ncom/xiaomi/fitness/repo/spo2/Spo2Biz\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n216#2:128\n217#2:135\n216#2:140\n217#2:143\n774#3:129\n865#3,2:130\n774#3:132\n865#3,2:133\n774#3:137\n865#3,2:138\n1863#3,2:141\n1863#3,2:144\n1#4:136\n*S KotlinDebug\n*F\n+ 1 Spo2Biz.kt\ncom/xiaomi/fitness/repo/spo2/Spo2Biz\n*L\n50#1:128\n50#1:135\n102#1:140\n102#1:143\n57#1:129\n57#1:130,2\n61#1:132\n61#1:133,2\n92#1:137\n92#1:138,2\n106#1:141,2\n117#1:144,2\n*E\n"})
public final class Spo2Biz extends BaseProcessBiz<DailySpo2Report> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int splitDailyReport$lambda$4$lambda$2(SegmentItem segmentItem, SegmentItem segmentItem2) {
        return Intrinsics.compare(segmentItem2.getTimestamp(), segmentItem.getTimestamp());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int splitDailyReport$lambda$4$lambda$3(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int splitDailyReport$lambda$6(Spo2Item it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getSpo2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int splitDailyReport$lambda$7(Spo2Item it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getSpo2();
    }

    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    public /* bridge */ /* synthetic */ DailySpo2Report splitDailyReport(String str, String str2, long j, Map map) {
        return splitDailyReport(str, str2, j, (Map<String, ? extends List<? extends DailyRecordItem>>) map);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    @NotNull
    public DailySpo2Report convertServerAggregateReport(long time, @NotNull String viewTag, @Nullable RelativeDataModel dataModel) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        if (dataModel == null) {
            return new DailySpo2Report(time, viewTag);
        }
        CloudSpo2Report cloudSpo2Report = (CloudSpo2Report) FitnessPersistUtils.INSTANCE.fromJson(dataModel.getValue(), CloudSpo2Report.class);
        if (cloudSpo2Report == null) {
            return new DailySpo2Report(time, viewTag);
        }
        DailySpo2Report dailySpo2Report = new DailySpo2Report(time, viewTag, cloudSpo2Report.getAvgSpo2(), cloudSpo2Report.getMaxSpo2(), cloudSpo2Report.getMinSpo2(), 0, CollectionsKt__CollectionsKt.emptyList());
        dailySpo2Report.setLatestSpoRecord(cloudSpo2Report.getLatestSpo2());
        return dailySpo2Report;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code duplicated, block: B:128:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0085  */
    /* JADX WARN: Code duplicated, block: B:85:0x01dc  */
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    @NotNull
    public DailySpo2Report splitDailyReport(@Nullable String sid, @NotNull String viewTag, long timestamp, @NotNull Map<String, ? extends List<? extends DailyRecordItem>> itemMap) {
        Map mapGroupByHalfHour$default;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(itemMap, "itemMap");
        if (itemMap.isEmpty()) {
            return new DailySpo2Report(timestamp, viewTag);
        }
        ArrayList<Spo2Item> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry<String, ? extends List<? extends DailyRecordItem>> entry : itemMap.entrySet()) {
            List<? extends DailyRecordItem> value = entry.getValue();
            String key = entry.getKey();
            int iHashCode = key.hashCode();
            if (iHashCode != -1823210805) {
                if (iHashCode != -1731749289) {
                    if (iHashCode == 3537088 && key.equals("spo2")) {
                        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.Spo2Item>");
                        arrayList = new ArrayList();
                        for (Object obj : value) {
                            if (((Spo2Item) obj).getSpo2() > 0) {
                                arrayList.add(obj);
                            }
                        }
                        arrayList2.addAll(arrayList);
                    }
                } else if (key.equals(FitnessPersistKey.ManualSpo2)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.Spo2Item>");
                    arrayList = new ArrayList();
                    while (r2.hasNext()) {
                        if (((Spo2Item) obj).getSpo2() > 0) {
                            arrayList.add(obj);
                        }
                    }
                    arrayList2.addAll(arrayList);
                }
            } else if (key.equals("low_spo2")) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.AbnormalRecordItem>");
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : value) {
                    List<AbnormalItem> items = ((SegmentItem) obj2).getItems();
                    if (!(items == null || items.isEmpty())) {
                        arrayList4.add(obj2);
                    }
                }
                arrayList3.addAll(arrayList4);
                final Function2 function2 = new Function2() { // from class: q7n
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return Integer.valueOf(Spo2Biz.splitDailyReport$lambda$4$lambda$2((SegmentItem) obj3, (SegmentItem) obj4));
                    }
                };
                Collections.sort(arrayList3, new Comparator() { // from class: r7n
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return Spo2Biz.splitDailyReport$lambda$4$lambda$3(function2, obj3, obj4);
                    }
                });
            }
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            List<AbnormalItem> items2 = ((SegmentItem) it.next()).getItems();
            if (items2 != null) {
                Iterator<AbnormalItem> it2 = items2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(DailyDataItemExtKt.toSpo2Item(it2.next()));
                }
            }
        }
        Object objMaxOfOrDefault = ListExtKt.maxOfOrDefault(arrayList2, 0, new Function1() { // from class: s7n
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj3) {
                return Integer.valueOf(Spo2Biz.splitDailyReport$lambda$6((Spo2Item) obj3));
            }
        });
        Intrinsics.checkNotNull(objMaxOfOrDefault);
        int iIntValue = ((Number) objMaxOfOrDefault).intValue();
        Object objMinOfOrDefault = ListExtKt.minOfOrDefault(arrayList2, 0, new Function1() { // from class: t7n
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj3) {
                return Integer.valueOf(Spo2Biz.splitDailyReport$lambda$7((Spo2Item) obj3));
            }
        });
        Intrinsics.checkNotNull(objMinOfOrDefault);
        int iIntValue2 = ((Number) objMinOfOrDefault).intValue();
        Iterator it3 = arrayList2.iterator();
        int spo2 = 0;
        while (it3.hasNext()) {
            spo2 += ((Spo2Item) it3.next()).getSpo2();
        }
        int size = arrayList2.size() > 0 ? spo2 / arrayList2.size() : 0;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (((Spo2Item) obj3).getSpo2() < 90) {
                arrayList5.add(obj3);
            }
        }
        int size2 = arrayList5.size();
        switch (viewTag) {
            case "months":
                mapGroupByHalfHour$default = BaseProcessBiz.groupByDay$default(this, timestamp, arrayList2, null, 4, null);
                break;
            case "days":
                mapGroupByHalfHour$default = BaseProcessBiz.groupByHalfHour$default(this, timestamp, arrayList2, null, 4, null);
                break;
            case "home":
                mapGroupByHalfHour$default = BaseProcessBiz.groupByHour$default(this, timestamp, arrayList2, null, 4, null);
                break;
            case "weeks":
                mapGroupByHalfHour$default = BaseProcessBiz.groupByDay$default(this, timestamp, arrayList2, null, 4, null);
                break;
            default:
                mapGroupByHalfHour$default = null;
                break;
        }
        ArrayList arrayList6 = new ArrayList();
        if (mapGroupByHalfHour$default != null) {
            for (Map.Entry entry2 : mapGroupByHalfHour$default.entrySet()) {
                long jLongValue = ((Number) entry2.getKey()).longValue();
                List<Spo2Item> list = (List) entry2.getValue();
                ArrayList arrayList7 = new ArrayList();
                for (Spo2Item spo2Item : list) {
                    if (!arrayList7.contains(Integer.valueOf(spo2Item.getSpo2()))) {
                        arrayList7.add(Integer.valueOf(spo2Item.getSpo2()));
                    }
                }
                arrayList6.add(new TimesDataRecordInt(jLongValue, CollectionsKt___CollectionsKt.toIntArray(arrayList7)));
            }
        }
        DailySpo2Report dailySpo2Report = new DailySpo2Report(timestamp, viewTag, size, iIntValue, iIntValue2, size2, arrayList6);
        long time = Long.MIN_VALUE;
        Spo2Item spo2Item2 = null;
        for (Spo2Item spo2Item3 : arrayList2) {
            if (time < spo2Item3.getTime()) {
                time = spo2Item3.getTime();
                spo2Item2 = spo2Item3;
            }
        }
        dailySpo2Report.setLatestSpoRecord(spo2Item2);
        dailySpo2Report.setAbnormalSpo2Records(arrayList3);
        return dailySpo2Report;
    }
}
