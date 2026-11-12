package com.xiaomi.fitness.aggregation.health.entity;

import com.xiaomi.fit.fitness.persist.server.data.ProjectDataKey;
import com.xiaomi.fit.fitness.persist.server.data.ProjectDataModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002¨\u0006\u0005"}, d2 = {"toProjectDataModel", "Lcom/xiaomi/fit/fitness/persist/server/data/ProjectDataModel;", "Lcom/xiaomi/fitness/aggregation/health/entity/ProjectEntity;", "toProjectDataKey", "Lcom/xiaomi/fit/fitness/persist/server/data/ProjectDataKey;", "fitness-data-core_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ProjectEntityKt {
    @NotNull
    public static final ProjectDataKey toProjectDataKey(@NotNull ProjectEntity projectEntity) {
        Intrinsics.checkNotNullParameter(projectEntity, "<this>");
        return new ProjectDataKey(projectEntity.getKey(), projectEntity.getSid(), projectEntity.getProjectId(), projectEntity.getTime());
    }

    @NotNull
    public static final ProjectDataModel toProjectDataModel(@NotNull ProjectEntity projectEntity) {
        Intrinsics.checkNotNullParameter(projectEntity, "<this>");
        return new ProjectDataModel(projectEntity.getSid(), projectEntity.getKey(), projectEntity.getProjectId(), projectEntity.getTime(), projectEntity.getValue(), projectEntity.getZoneOffset(), projectEntity.getIsDeleted());
    }
}
