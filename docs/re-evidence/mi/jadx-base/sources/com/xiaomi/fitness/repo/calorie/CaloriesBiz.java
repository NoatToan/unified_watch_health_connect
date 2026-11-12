package com.xiaomi.fitness.repo.calorie;

import com.xiaomi.fit.fitness.export.data.aggregation.DailyCalorieReport;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudCaloriesReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.CalorieRecord;
import com.xiaomi.fit.fitness.export.data.item.CaloriesItem;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.persist.server.data.RelativeDataModel;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.IDistinctListener;
import com.xiaomi.fitness.repo.RepoUtils;
import com.xiaomi.fitness.repo.RepositoryManager;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J<\u0010\u000e\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012H\u0016J$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00132\u0006\u0010\u0017\u001a\u00020\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013H\u0002R\u0012\u0010\u0005\u001a\u00060\u0006R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/repo/calorie/CaloriesBiz;", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyCalorieReport;", "<init>", "()V", "calItemDistinct", "Lcom/xiaomi/fitness/repo/calorie/CaloriesBiz$BigCaloriesDistinct;", "convertServerAggregateReport", "time", "", CloudContract.COL_VIEW_TAG, "", "dataModel", "Lcom/xiaomi/fit/fitness/persist/server/data/RelativeDataModel;", "splitDailyReport", "sid", "timestamp", "itemMap", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "recomputeHomeDayRecord", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/CalorieRecord;", "day0time", "recordList", "BigCaloriesDistinct", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCaloriesBiz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaloriesBiz.kt\ncom/xiaomi/fitness/repo/calorie/CaloriesBiz\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n216#2,2:169\n216#2:173\n217#2:175\n216#2,2:178\n1863#3,2:171\n1863#3,2:176\n1#4:174\n*S KotlinDebug\n*F\n+ 1 CaloriesBiz.kt\ncom/xiaomi/fitness/repo/calorie/CaloriesBiz\n*L\n45#1:169,2\n104#1:173\n104#1:175\n145#1:178,2\n55#1:171,2\n133#1:176,2\n*E\n"})
public final class CaloriesBiz extends BaseProcessBiz<DailyCalorieReport> {

    @NotNull
    private final BigCaloriesDistinct calItemDistinct = new BigCaloriesDistinct();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/repo/calorie/CaloriesBiz$BigCaloriesDistinct;", "Lcom/xiaomi/fitness/repo/IDistinctListener;", "Lcom/xiaomi/fit/fitness/export/data/item/CaloriesItem;", "<init>", "(Lcom/xiaomi/fitness/repo/calorie/CaloriesBiz;)V", "distinct", "", "map", "", "", DeviceTagInterface.CUSTOM_TAG_TYPE, "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class BigCaloriesDistinct implements IDistinctListener<CaloriesItem> {
        public BigCaloriesDistinct() {
        }

        @Override // com.xiaomi.fitness.repo.IDistinctListener
        public void distinct(@NotNull Map<Long, CaloriesItem> map, @Nullable CaloriesItem t) {
            Intrinsics.checkNotNullParameter(map, "map");
            if (t == null) {
                return;
            }
            long timestamp = t.getTimestamp();
            CaloriesItem caloriesItem = map.get(Long.valueOf(timestamp));
            if (caloriesItem == null) {
                map.put(Long.valueOf(timestamp), t);
            } else if (caloriesItem.getCalories() < t.getCalories()) {
                map.put(Long.valueOf(timestamp), t);
            }
        }
    }

    private final List<CalorieRecord> recomputeHomeDayRecord(long day0time, List<CalorieRecord> recordList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (CalorieRecord calorieRecord : recordList) {
            long j = 3600;
            long time = (((calorieRecord.getTime() - day0time) / j) * j) + day0time;
            CalorieRecord calorieRecord2 = (CalorieRecord) linkedHashMap.get(Long.valueOf(time));
            if (calorieRecord2 == null) {
                calorieRecord2 = new CalorieRecord(time, 0);
                linkedHashMap.put(Long.valueOf(time), calorieRecord2);
            }
            calorieRecord2.setCalories(calorieRecord2.getCalories() + calorieRecord.getCalories());
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(((Map.Entry) it.next()).getValue());
        }
        return arrayList;
    }

    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    public /* bridge */ /* synthetic */ DailyCalorieReport splitDailyReport(String str, String str2, long j, Map map) {
        return splitDailyReport(str, str2, j, (Map<String, ? extends List<? extends DailyRecordItem>>) map);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    @NotNull
    public DailyCalorieReport convertServerAggregateReport(long time, @NotNull String viewTag, @Nullable RelativeDataModel dataModel) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        if (dataModel == null) {
            return new DailyCalorieReport(viewTag, time);
        }
        CloudCaloriesReport cloudCaloriesReport = (CloudCaloriesReport) FitnessPersistUtils.INSTANCE.fromJson(dataModel.getValue(), CloudCaloriesReport.class);
        return cloudCaloriesReport == null ? new DailyCalorieReport(viewTag, time) : new DailyCalorieReport(time, viewTag, cloudCaloriesReport.getCalories(), CollectionsKt__CollectionsKt.emptyList());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code duplicated, block: B:47:0x0140  */
    /* JADX WARN: Code duplicated, block: B:50:0x014f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0151  */
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    @NotNull
    public DailyCalorieReport splitDailyReport(@Nullable String sid, @NotNull String viewTag, long timestamp, @NotNull Map<String, ? extends List<? extends DailyRecordItem>> itemMap) {
        Map mapGroupByHalfHour;
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(itemMap, "itemMap");
        if (itemMap.isEmpty()) {
            return new DailyCalorieReport(viewTag, timestamp);
        }
        ArrayList<CaloriesItem> arrayList = new ArrayList();
        for (Map.Entry<String, ? extends List<? extends DailyRecordItem>> entry : itemMap.entrySet()) {
            if (Intrinsics.areEqual(entry.getKey(), "calories")) {
                List<? extends DailyRecordItem> value = entry.getValue();
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.CaloriesItem>");
                arrayList.addAll(value);
            }
        }
        if (arrayList.isEmpty()) {
            return new DailyCalorieReport(viewTag, timestamp);
        }
        long jMin = Long.MAX_VALUE;
        long jMax = Long.MIN_VALUE;
        for (CaloriesItem caloriesItem : arrayList) {
            jMin = Math.min(jMin, caloriesItem.getTime());
            jMax = Math.max(jMax, caloriesItem.getTime());
        }
        Map<String, List<DailyRecordItem>> mapGroupedBySid = RepoUtils.INSTANCE.groupedBySid(arrayList);
        if (!mapGroupedBySid.isEmpty()) {
            arrayList.clear();
        }
        Iterator<Map.Entry<String, List<DailyRecordItem>>> it = mapGroupedBySid.entrySet().iterator();
        while (it.hasNext()) {
            List<DailyRecordItem> value2 = it.next().getValue();
            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.CaloriesItem>");
            long j = jMax;
            for (Map.Entry entry2 : groupDataByGap(timestamp, RepositoryManager.GAP_X_MINUTE, value2, new IDistinctListener<CaloriesItem>() { // from class: com.xiaomi.fitness.repo.calorie.CaloriesBiz$splitDailyReport$gapedItemMap$1
                @Override // com.xiaomi.fitness.repo.IDistinctListener
                public void distinct(Map<Long, CaloriesItem> map, CaloriesItem t) {
                    Intrinsics.checkNotNullParameter(map, "map");
                    if (t != null) {
                        long timestamp2 = t.getTimestamp();
                        CaloriesItem caloriesItem2 = map.get(Long.valueOf(timestamp2));
                        if (caloriesItem2 != null) {
                            caloriesItem2.add(t);
                        } else {
                            map.put(Long.valueOf(timestamp2), t);
                        }
                    }
                }
            }).entrySet()) {
                long jLongValue = ((Number) entry2.getKey()).longValue();
                Iterator it2 = ((List) entry2.getValue()).iterator();
                float calories = 0.0f;
                while (it2.hasNext()) {
                    calories += ((CaloriesItem) it2.next()).getCalories();
                }
                arrayList.add(new CaloriesItem(jLongValue, calories));
            }
            jMax = j;
        }
        long j2 = jMax;
        switch (viewTag) {
            case "months":
                mapGroupByHalfHour = groupByDay(timestamp, arrayList, this.calItemDistinct);
                break;
            case "days":
            case "home":
                mapGroupByHalfHour = groupByHalfHour(timestamp, arrayList, this.calItemDistinct);
                break;
            case "weeks":
                mapGroupByHalfHour = groupByDay(timestamp, arrayList, this.calItemDistinct);
                break;
            default:
                mapGroupByHalfHour = null;
                break;
        }
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        if (mapGroupByHalfHour != null) {
            for (Map.Entry entry3 : mapGroupByHalfHour.entrySet()) {
                Iterator it3 = ((List) entry3.getValue()).iterator();
                double calories2 = 0.0d;
                while (it3.hasNext()) {
                    calories2 += (double) ((CaloriesItem) it3.next()).getCalories();
                    jMin = jMin;
                }
                long j3 = jMin;
                int iRoundToInt = MathKt__MathJVMKt.roundToInt(calories2);
                if (iRoundToInt > 0) {
                    arrayList2.add(new CalorieRecord(((Number) entry3.getKey()).longValue(), iRoundToInt));
                    i += iRoundToInt;
                }
                jMin = j3;
            }
        }
        long j4 = jMin;
        int i2 = i;
        if (Intrinsics.areEqual(viewTag, "home")) {
            List<CalorieRecord> listRecomputeHomeDayRecord = recomputeHomeDayRecord(timestamp, arrayList2);
            arrayList2.clear();
            arrayList2.addAll(listRecomputeHomeDayRecord);
        }
        DailyCalorieReport dailyCalorieReport = new DailyCalorieReport(timestamp, viewTag, i2, arrayList2);
        if (!arrayList.isEmpty()) {
            dailyCalorieReport.setMinStartTime(Long.valueOf(j4));
            dailyCalorieReport.setMaxEndTime(Long.valueOf(j2));
        }
        return dailyCalorieReport;
    }
}
