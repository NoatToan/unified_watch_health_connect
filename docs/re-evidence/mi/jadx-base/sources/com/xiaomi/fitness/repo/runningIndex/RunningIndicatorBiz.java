package com.xiaomi.fitness.repo.runningIndex;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyRunningIndicatorReport;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.GradePredictionItem;
import com.xiaomi.fit.fitness.export.data.item.RunningIndicatorItem;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.BigValueDistinct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J<\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/repo/runningIndex/RunningIndicatorBiz;", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyRunningIndicatorReport;", "<init>", "()V", "itemDistinct", "Lcom/xiaomi/fitness/repo/BigValueDistinct;", "Lcom/xiaomi/fit/fitness/export/data/item/RunningIndicatorItem;", "splitDailyReport", "sid", "", CloudContract.COL_VIEW_TAG, "timestamp", "", "itemMap", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRunningIndicatorBiz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunningIndicatorBiz.kt\ncom/xiaomi/fitness/repo/runningIndex/RunningIndicatorBiz\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,68:1\n216#2,2:69\n*S KotlinDebug\n*F\n+ 1 RunningIndicatorBiz.kt\ncom/xiaomi/fitness/repo/runningIndex/RunningIndicatorBiz\n*L\n50#1:69,2\n*E\n"})
public final class RunningIndicatorBiz extends BaseProcessBiz<DailyRunningIndicatorReport> {

    @NotNull
    private final BigValueDistinct<RunningIndicatorItem> itemDistinct = new BigValueDistinct<>();

    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    public /* bridge */ /* synthetic */ DailyRunningIndicatorReport splitDailyReport(String str, String str2, long j, Map map) {
        return splitDailyReport(str, str2, j, (Map<String, ? extends List<? extends DailyRecordItem>>) map);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    @NotNull
    public DailyRunningIndicatorReport splitDailyReport(@Nullable String sid, @NotNull String viewTag, long timestamp, @NotNull Map<String, ? extends List<? extends DailyRecordItem>> itemMap) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(itemMap, "itemMap");
        GradePredictionItem gradePredictionItem = (GradePredictionItem) DailyRecordDaoUtils.INSTANCE.getRecentOneData(FitnessPersistKey.GradePrediction, null, System.currentTimeMillis() / ((long) 1000), FitnessDateUtils.getCurrentTZOffsetInSec());
        if (itemMap.isEmpty()) {
            FitnessLogUtils.i(getTAG(), "splitDailyRunningIndicatorReport: source data is empty");
            return new DailyRunningIndicatorReport(timestamp, viewTag, null, null, gradePredictionItem);
        }
        ArrayList arrayList = new ArrayList();
        if (itemMap.containsKey(FitnessPersistKey.RunningIndicator)) {
            List<? extends DailyRecordItem> list = itemMap.get(FitnessPersistKey.RunningIndicator);
            Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.RunningIndicatorItem?>");
            Iterator<? extends DailyRecordItem> it = list.iterator();
            while (it.hasNext()) {
                RunningIndicatorItem runningIndicatorItem = (RunningIndicatorItem) it.next();
                Intrinsics.checkNotNull(runningIndicatorItem, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.RunningIndicatorItem");
                if (runningIndicatorItem.getRunningIndicator() > 0.0f) {
                    arrayList.add(runningIndicatorItem);
                }
            }
        }
        Map<Long, List<T>> mapGroupByDay = groupByDay(timestamp, arrayList, this.itemDistinct);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = mapGroupByDay.entrySet().iterator();
        RunningIndicatorItem runningIndicatorItem2 = null;
        while (it2.hasNext()) {
            RunningIndicatorItem runningIndicatorItem3 = null;
            for (RunningIndicatorItem runningIndicatorItem4 : (List) ((Map.Entry) it2.next()).getValue()) {
                if (runningIndicatorItem3 == null || runningIndicatorItem4.getTime() > runningIndicatorItem3.getTime()) {
                    runningIndicatorItem3 = runningIndicatorItem4;
                }
            }
            if (runningIndicatorItem3 != null) {
                if (runningIndicatorItem2 == null || runningIndicatorItem3.getTime() > runningIndicatorItem2.getTime()) {
                    runningIndicatorItem2 = runningIndicatorItem3;
                }
                runningIndicatorItem3.setTimestamp(FitnessDateUtils.INSTANCE.changeZeroOfTheDay(runningIndicatorItem3.getTime()));
                arrayList2.add(runningIndicatorItem3);
            }
        }
        return new DailyRunningIndicatorReport(timestamp, viewTag, runningIndicatorItem2, arrayList2, gradePredictionItem);
    }
}
