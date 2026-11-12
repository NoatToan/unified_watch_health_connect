package com.xiaomi.fitness.repo.healthconnect.biz;

import com.xiaomi.fit.fitness.persist.db.internal.HealthConnectSyncDaoEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0007\u001a\u00020\u0004*\u00020\u0002¨\u0006\b"}, d2 = {"isSynced", "", "Lcom/xiaomi/fit/fitness/persist/db/internal/HealthConnectSyncDaoEntity;", "updateToSynced", "", "updateToUnSynced", "isDeleted", "updateToDeleted", "fitness-data-core_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HealthConnectExtKt {
    public static final boolean isDeleted(@NotNull HealthConnectSyncDaoEntity healthConnectSyncDaoEntity) {
        Intrinsics.checkNotNullParameter(healthConnectSyncDaoEntity, "<this>");
        return healthConnectSyncDaoEntity.isDeleted() == 1;
    }

    public static final boolean isSynced(@NotNull HealthConnectSyncDaoEntity healthConnectSyncDaoEntity) {
        Intrinsics.checkNotNullParameter(healthConnectSyncDaoEntity, "<this>");
        return healthConnectSyncDaoEntity.getStatus() == 1;
    }

    public static final void updateToDeleted(@NotNull HealthConnectSyncDaoEntity healthConnectSyncDaoEntity) {
        Intrinsics.checkNotNullParameter(healthConnectSyncDaoEntity, "<this>");
        healthConnectSyncDaoEntity.setDeleted(1);
    }

    public static final void updateToSynced(@NotNull HealthConnectSyncDaoEntity healthConnectSyncDaoEntity) {
        Intrinsics.checkNotNullParameter(healthConnectSyncDaoEntity, "<this>");
        healthConnectSyncDaoEntity.setStatus(1);
    }

    public static final void updateToUnSynced(@NotNull HealthConnectSyncDaoEntity healthConnectSyncDaoEntity) {
        Intrinsics.checkNotNullParameter(healthConnectSyncDaoEntity, "<this>");
        healthConnectSyncDaoEntity.setStatus(0);
    }
}
