package com.xiaomi.fitness.repo.rainbow;

import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.persist.server.data.RelativeDataModel;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J<\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00072\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010H\u0016¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/repo/rainbow/RainbowBiz;", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "<init>", "()V", "convertServerAggregateReport", "time", "", CloudContract.COL_VIEW_TAG, "", "dataModel", "Lcom/xiaomi/fit/fitness/persist/server/data/RelativeDataModel;", "splitDailyReport", "sid", "timestamp", "itemMap", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RainbowBiz extends BaseProcessBiz<DailyGoalReport> {
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    public /* bridge */ /* synthetic */ DailyGoalReport splitDailyReport(String str, String str2, long j, Map map) {
        return splitDailyReport(str, str2, j, (Map<String, ? extends List<? extends DailyRecordItem>>) map);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    @NotNull
    public DailyGoalReport convertServerAggregateReport(long time, @NotNull String viewTag, @Nullable RelativeDataModel dataModel) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        if (dataModel == null) {
            return DailyGoalReport.INSTANCE.getRelativeEmptyReport(time);
        }
        DailyGoalReport relativeEmptyReport = (DailyGoalReport) FitnessPersistUtils.INSTANCE.fromJson(dataModel.getValue(), DailyGoalReport.class);
        if (relativeEmptyReport == null) {
            relativeEmptyReport = DailyGoalReport.INSTANCE.getRelativeEmptyReport(time);
        }
        relativeEmptyReport.setTime(time);
        return relativeEmptyReport;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    @NotNull
    public DailyGoalReport splitDailyReport(@Nullable String sid, @NotNull String viewTag, long timestamp, @NotNull Map<String, ? extends List<? extends DailyRecordItem>> itemMap) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(itemMap, "itemMap");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
