package com.xiaomi.fitness.aggregation.health.entity;

import com.xiaomi.fit.fitness.persist.server.data.StatDataKey;
import com.xiaomi.fit.fitness.persist.server.data.StatDataModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002¨\u0006\u0005"}, d2 = {"toStatDataModel", "Lcom/xiaomi/fit/fitness/persist/server/data/StatDataModel;", "Lcom/xiaomi/fitness/aggregation/health/entity/StatDataEntity;", "toStatDataKey", "Lcom/xiaomi/fit/fitness/persist/server/data/StatDataKey;", "fitness-data-core_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class StatDataEntityKt {
    @NotNull
    public static final StatDataKey toStatDataKey(@NotNull StatDataEntity statDataEntity) {
        Intrinsics.checkNotNullParameter(statDataEntity, "<this>");
        return new StatDataKey(statDataEntity.getTag(), statDataEntity.getKey(), statDataEntity.getTime());
    }

    @NotNull
    public static final StatDataModel toStatDataModel(@NotNull StatDataEntity statDataEntity) {
        Intrinsics.checkNotNullParameter(statDataEntity, "<this>");
        return new StatDataModel(statDataEntity.getTag(), statDataEntity.getKey(), statDataEntity.getTime(), statDataEntity.getZoneOffset(), statDataEntity.getValue(), statDataEntity.getUpdateTime(), statDataEntity.getIsDeleted());
    }
}
