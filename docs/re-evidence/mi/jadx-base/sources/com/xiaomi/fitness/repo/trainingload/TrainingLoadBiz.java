package com.xiaomi.fitness.repo.trainingload;

import android.text.TextUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyTrainingLoadReport;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.TrainingLoadItem;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J<\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0016¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/repo/trainingload/TrainingLoadBiz;", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyTrainingLoadReport;", "<init>", "()V", "splitDailyReport", "sid", "", CloudContract.COL_VIEW_TAG, "timestamp", "", "itemMap", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTrainingLoadBiz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainingLoadBiz.kt\ncom/xiaomi/fitness/repo/trainingload/TrainingLoadBiz\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n1863#2,2:50\n*S KotlinDebug\n*F\n+ 1 TrainingLoadBiz.kt\ncom/xiaomi/fitness/repo/trainingload/TrainingLoadBiz\n*L\n39#1:50,2\n*E\n"})
public final class TrainingLoadBiz extends BaseProcessBiz<DailyTrainingLoadReport> {
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    public /* bridge */ /* synthetic */ DailyTrainingLoadReport splitDailyReport(String str, String str2, long j, Map map) {
        return splitDailyReport(str, str2, j, (Map<String, ? extends List<? extends DailyRecordItem>>) map);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    @NotNull
    public DailyTrainingLoadReport splitDailyReport(@Nullable String sid, @NotNull String viewTag, long timestamp, @NotNull Map<String, ? extends List<? extends DailyRecordItem>> itemMap) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(itemMap, "itemMap");
        TrainingLoadItem trainingLoadItem = null;
        if (!Intrinsics.areEqual(viewTag, "home") && TextUtils.isEmpty(sid)) {
            FitnessLogUtils.i(getTAG(), "splitDailyTLReport: sid is null or empty");
            return new DailyTrainingLoadReport(timestamp, null);
        }
        List<? extends DailyRecordItem> list = itemMap.get(FitnessPersistKey.TrainingLoad);
        List<? extends DailyRecordItem> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            FitnessLogUtils.i(getTAG(), "splitDailyTLReport: source data is empty");
            return new DailyTrainingLoadReport(timestamp, null);
        }
        if (Intrinsics.areEqual(viewTag, "days")) {
            return ((TrainingLoadItem) CollectionsKt___CollectionsKt.first((List) list)).convertToDailyTLReport();
        }
        if (!Intrinsics.areEqual(viewTag, "home")) {
            FitnessLogUtils.i(getTAG(), "should not reach here, and return empty data");
            return new DailyTrainingLoadReport(timestamp, null);
        }
        if (list.size() == 1) {
            return ((TrainingLoadItem) list.get(0)).convertToDailyTLReport();
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            TrainingLoadItem trainingLoadItem2 = (TrainingLoadItem) it.next();
            if (trainingLoadItem == null || trainingLoadItem2.getWtlSum() >= trainingLoadItem.getWtlSum()) {
                trainingLoadItem = trainingLoadItem2;
            }
        }
        Intrinsics.checkNotNull(trainingLoadItem);
        return trainingLoadItem.convertToDailyTLReport();
    }
}
