package com.xiaomi.fitness.repo.bloodpressure;

import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodPressureReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.item.BloodPressureItem;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.IPointTimeData;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J<\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0016¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/repo/bloodpressure/BloodPressureBiz;", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodPressureReport;", "<init>", "()V", "splitDailyReport", "sid", "", CloudContract.COL_VIEW_TAG, "timestamp", "", "itemMap", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBloodPressureBiz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodPressureBiz.kt\ncom/xiaomi/fitness/repo/bloodpressure/BloodPressureBiz\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n216#2:112\n217#2:115\n1863#3,2:113\n*S KotlinDebug\n*F\n+ 1 BloodPressureBiz.kt\ncom/xiaomi/fitness/repo/bloodpressure/BloodPressureBiz\n*L\n84#1:112\n84#1:115\n90#1:113,2\n*E\n"})
public final class BloodPressureBiz extends BaseProcessBiz<DailyBloodPressureReport> {
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    public /* bridge */ /* synthetic */ DailyBloodPressureReport splitDailyReport(String str, String str2, long j, Map map) {
        return splitDailyReport(str, str2, j, (Map<String, ? extends List<? extends DailyRecordItem>>) map);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code duplicated, block: B:59:0x0111  */
    /* JADX WARN: Code duplicated, block: B:60:0x0113  */
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    @NotNull
    public DailyBloodPressureReport splitDailyReport(@Nullable String sid, @NotNull String viewTag, long timestamp, @NotNull Map<String, ? extends List<? extends DailyRecordItem>> itemMap) {
        int i;
        int i2;
        Map mapGroupByHalfHour$default;
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(itemMap, "itemMap");
        if (itemMap.isEmpty()) {
            return new DailyBloodPressureReport(timestamp, viewTag);
        }
        ArrayList arrayList = new ArrayList();
        List<? extends DailyRecordItem> list = itemMap.get("blood_pressure");
        List<? extends DailyRecordItem> list2 = itemMap.get(FitnessPersistKey.BloodPressureMedical);
        List<? extends DailyRecordItem> list3 = list;
        if (list3 != null && !list3.isEmpty()) {
            arrayList.addAll(list3);
        }
        List<? extends DailyRecordItem> list4 = list2;
        if (list4 != null && !list4.isEmpty()) {
            arrayList.addAll(list4);
        }
        if (arrayList.isEmpty()) {
            return new DailyBloodPressureReport(timestamp, viewTag);
        }
        int maxSecondaryValue = getMaxSecondaryValue(arrayList);
        int maxPrimaryValue = getMaxPrimaryValue(arrayList);
        int minSecondaryValue = getMinSecondaryValue(arrayList);
        int minPrimaryValue = getMinPrimaryValue(arrayList);
        int size = arrayList.size();
        Iterator<? extends IPointTimeData> it = arrayList.iterator();
        int lowPressure = 0;
        int highPressure = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (it.hasNext()) {
            DailyRecordItem dailyRecordItem = (DailyRecordItem) it.next();
            Iterator<? extends IPointTimeData> it2 = it;
            Intrinsics.checkNotNull(dailyRecordItem, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.BloodPressureItem");
            BloodPressureItem bloodPressureItem = (BloodPressureItem) dailyRecordItem;
            lowPressure += bloodPressureItem.getLowPressure();
            highPressure += bloodPressureItem.getHighPressure();
            Integer pulse = bloodPressureItem.getPulse();
            int iIntValue = pulse != null ? pulse.intValue() : 0;
            if (iIntValue > 0) {
                i4 += iIntValue;
                i3++;
                if (iIntValue > i6) {
                    i6 = iIntValue;
                }
                if (i5 == 0 || iIntValue < i5) {
                    i5 = iIntValue;
                }
            }
            it = it2;
        }
        if (size > 0) {
            i2 = lowPressure / size;
            i = highPressure / size;
        } else {
            i = 0;
            i2 = 0;
        }
        int i7 = i3 > 0 ? i4 / i3 : 0;
        switch (viewTag) {
            case "months":
                mapGroupByHalfHour$default = BaseProcessBiz.groupByDay$default(this, timestamp, arrayList, null, 4, null);
                break;
            case "days":
                mapGroupByHalfHour$default = BaseProcessBiz.groupByHalfHour$default(this, timestamp, arrayList, null, 4, null);
                break;
            case "home":
                mapGroupByHalfHour$default = BaseProcessBiz.groupByHour$default(this, timestamp, arrayList, null, 4, null);
                break;
            case "weeks":
                mapGroupByHalfHour$default = BaseProcessBiz.groupByDay$default(this, timestamp, arrayList, null, 4, null);
                break;
            default:
                mapGroupByHalfHour$default = null;
                break;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (mapGroupByHalfHour$default != null) {
            Iterator it3 = mapGroupByHalfHour$default.entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry entry = (Map.Entry) it3.next();
                long jLongValue = ((Number) entry.getKey()).longValue();
                Object value = entry.getValue();
                Iterator it4 = it3;
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.BloodPressureItem>");
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                int i8 = i5;
                ArrayList arrayList7 = new ArrayList();
                Iterator it5 = ((List) value).iterator();
                while (it5.hasNext()) {
                    BloodPressureItem bloodPressureItem2 = (BloodPressureItem) it5.next();
                    Iterator it6 = it5;
                    if (!arrayList5.contains(Integer.valueOf(bloodPressureItem2.getLowPressure()))) {
                        arrayList5.add(Integer.valueOf(bloodPressureItem2.getLowPressure()));
                    }
                    if (!arrayList6.contains(Integer.valueOf(bloodPressureItem2.getHighPressure()))) {
                        arrayList6.add(Integer.valueOf(bloodPressureItem2.getHighPressure()));
                    }
                    if (bloodPressureItem2.getPulse() != null && !CollectionsKt___CollectionsKt.contains(arrayList7, bloodPressureItem2.getPulse())) {
                        Integer pulse2 = bloodPressureItem2.getPulse();
                        Intrinsics.checkNotNull(pulse2);
                        arrayList7.add(pulse2);
                    }
                    it5 = it6;
                }
                arrayList2.add(new TimesDataRecordInt(jLongValue, CollectionsKt___CollectionsKt.toIntArray(arrayList5)));
                arrayList3.add(new TimesDataRecordInt(jLongValue, CollectionsKt___CollectionsKt.toIntArray(arrayList6)));
                arrayList4.add(new TimesDataRecordInt(jLongValue, CollectionsKt___CollectionsKt.toIntArray(arrayList7)));
                it3 = it4;
                i5 = i8;
            }
        }
        return new DailyBloodPressureReport(timestamp, viewTag, i, maxPrimaryValue, minPrimaryValue, i2, maxSecondaryValue, minSecondaryValue, i7, i6, i5, arrayList3, arrayList2, arrayList4, arrayList);
    }
}
