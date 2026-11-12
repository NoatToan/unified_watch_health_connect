package com.xiaomi.fitness.repo.teperature;

import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyTempReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordFloat;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.TemperatureItem;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.teperature.TemperatureBiz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J<\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0016J.\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0002H\u0002J\u001e\u0010\u0013\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/repo/teperature/TemperatureBiz;", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTempReport;", "<init>", "()V", "splitDailyReport", "sid", "", CloudContract.COL_VIEW_TAG, "timestamp", "", "itemMap", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "computeTimeDiffValueRecords", "", "tempList", "report", "computeSummaryData", "temperatureList", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureItem;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTemperatureBiz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TemperatureBiz.kt\ncom/xiaomi/fitness/repo/teperature/TemperatureBiz\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,132:1\n774#2:133\n865#2,2:134\n1863#2,2:137\n1863#2,2:140\n216#3:136\n217#3:139\n*S KotlinDebug\n*F\n+ 1 TemperatureBiz.kt\ncom/xiaomi/fitness/repo/teperature/TemperatureBiz\n*L\n28#1:133\n28#1:134,2\n68#1:137,2\n103#1:140,2\n65#1:136\n65#1:139\n*E\n"})
public final class TemperatureBiz extends BaseProcessBiz<DailyTempReport> {
    private final void computeSummaryData(List<TemperatureItem> temperatureList, DailyTempReport report) {
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        int i2 = 0;
        for (TemperatureItem temperatureItem : temperatureList) {
            if (temperatureItem.getBodyTemp() != null) {
                Float bodyTemp = temperatureItem.getBodyTemp();
                Intrinsics.checkNotNull(bodyTemp);
                if (bodyTemp.floatValue() > 0.0f) {
                    Float bodyTemp2 = temperatureItem.getBodyTemp();
                    Intrinsics.checkNotNull(bodyTemp2);
                    float fFloatValue = bodyTemp2.floatValue();
                    i++;
                    f += fFloatValue;
                    if (fFloatValue > report.getMaxBodyTemp()) {
                        report.setMaxBodyTemp(fFloatValue);
                    }
                    if (report.getMinBodyTemp() == 0.0f || fFloatValue < report.getMinBodyTemp()) {
                        report.setMinBodyTemp(fFloatValue);
                    }
                }
            }
            if (temperatureItem.getSkinTemp() != null) {
                Float skinTemp = temperatureItem.getSkinTemp();
                Intrinsics.checkNotNull(skinTemp);
                if (skinTemp.floatValue() > 0.0f) {
                    Float skinTemp2 = temperatureItem.getSkinTemp();
                    Intrinsics.checkNotNull(skinTemp2);
                    float fFloatValue2 = skinTemp2.floatValue();
                    i2++;
                    f2 += fFloatValue2;
                    if (fFloatValue2 > report.getMaxSkinTemp()) {
                        report.setMaxSkinTemp(fFloatValue2);
                    }
                    if (report.getMinSkinTemp() == 0.0f || fFloatValue2 < report.getMinSkinTemp()) {
                        report.setMinSkinTemp(fFloatValue2);
                    }
                }
            }
        }
        report.setAvgBodyTemp(i == 0 ? 0.0f : f / i);
        report.setAvgSkinTemp(i2 != 0 ? f2 / i2 : 0.0f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0040  */
    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    private final void computeTimeDiffValueRecords(List<? extends DailyRecordItem> tempList, String viewTag, long timestamp, DailyTempReport report) {
        Map mapGroupByHalfHour$default;
        switch (viewTag) {
            case "months":
                mapGroupByHalfHour$default = BaseProcessBiz.groupByDay$default(this, timestamp, tempList, null, 4, null);
                break;
            case "days":
                mapGroupByHalfHour$default = BaseProcessBiz.groupByHalfHour$default(this, timestamp, tempList, null, 4, null);
                break;
            case "home":
                mapGroupByHalfHour$default = BaseProcessBiz.groupByHour$default(this, timestamp, tempList, null, 4, null);
                break;
            case "weeks":
                mapGroupByHalfHour$default = BaseProcessBiz.groupByDay$default(this, timestamp, tempList, null, 4, null);
                break;
            default:
                mapGroupByHalfHour$default = null;
                break;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (mapGroupByHalfHour$default != null) {
            for (Map.Entry entry : mapGroupByHalfHour$default.entrySet()) {
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (DailyRecordItem dailyRecordItem : (Iterable) entry.getValue()) {
                    float fFloatValue = dailyRecordItem.getPrimaryValue().floatValue();
                    if (fFloatValue > 0.0f && !arrayList3.contains(Float.valueOf(fFloatValue))) {
                        arrayList3.add(Float.valueOf(fFloatValue));
                    }
                    float fFloatValue2 = dailyRecordItem.getSecondaryValue().floatValue();
                    if (fFloatValue2 > 0.0f && !arrayList4.contains(Float.valueOf(fFloatValue2))) {
                        arrayList4.add(Float.valueOf(fFloatValue2));
                    }
                }
                if (!arrayList3.isEmpty()) {
                    arrayList.add(new TimesDataRecordFloat(((Number) entry.getKey()).longValue(), CollectionsKt___CollectionsKt.toFloatArray(arrayList3)));
                }
                if (!arrayList4.isEmpty()) {
                    arrayList2.add(new TimesDataRecordFloat(((Number) entry.getKey()).longValue(), CollectionsKt___CollectionsKt.toFloatArray(arrayList4)));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            report.setSkinTempRecords(arrayList);
        }
        if (!arrayList2.isEmpty()) {
            report.setBodyTempRecords(arrayList2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int splitDailyReport$lambda$3$lambda$1(TemperatureItem temperatureItem, TemperatureItem temperatureItem2) {
        return Intrinsics.compare(temperatureItem2.getTime(), temperatureItem.getTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int splitDailyReport$lambda$3$lambda$2(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    public /* bridge */ /* synthetic */ DailyTempReport splitDailyReport(String str, String str2, long j, Map map) {
        return splitDailyReport(str, str2, j, (Map<String, ? extends List<? extends DailyRecordItem>>) map);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    @NotNull
    public DailyTempReport splitDailyReport(@Nullable String sid, @NotNull String viewTag, long timestamp, @NotNull Map<String, ? extends List<? extends DailyRecordItem>> itemMap) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(itemMap, "itemMap");
        DailyTempReport dailyTempReport = new DailyTempReport(timestamp, viewTag);
        if (itemMap.isEmpty()) {
            return dailyTempReport;
        }
        List<? extends DailyRecordItem> list = itemMap.get(FitnessPersistKey.ManualTemperature);
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.TemperatureItem>");
        List<? extends DailyRecordItem> list2 = list;
        if (list2.isEmpty()) {
            return dailyTempReport;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            TemperatureItem temperatureItem = (TemperatureItem) obj;
            if (temperatureItem.getPrimaryValue().floatValue() > 0.0f || temperatureItem.getSecondaryValue().floatValue() > 0.0f) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
        if (arrayList.isEmpty()) {
            return dailyTempReport;
        }
        dailyTempReport.setDailyAllTempDatas(arrayList);
        List<TemperatureItem> dailyAllTempDatas = dailyTempReport.getDailyAllTempDatas();
        if (dailyAllTempDatas != null) {
            final Function2 function2 = new Function2() { // from class: v2p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return Integer.valueOf(TemperatureBiz.splitDailyReport$lambda$3$lambda$1((TemperatureItem) obj2, (TemperatureItem) obj3));
                }
            };
            Collections.sort(dailyAllTempDatas, new Comparator() { // from class: w2p
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return TemperatureBiz.splitDailyReport$lambda$3$lambda$2(function2, obj2, obj3);
                }
            });
        }
        computeSummaryData(arrayList, dailyTempReport);
        computeTimeDiffValueRecords(arrayList, viewTag, timestamp, dailyTempReport);
        return dailyTempReport;
    }
}
