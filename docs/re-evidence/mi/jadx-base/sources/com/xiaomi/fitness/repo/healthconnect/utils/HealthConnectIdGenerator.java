package com.xiaomi.fitness.repo.healthconnect.utils;

import com.xiaomi.fit.fitness.persist.db.internal.HealthConnectSyncDaoEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/repo/healthconnect/utils/HealthConnectIdGenerator;", "", "<init>", "()V", "generateTimeRangeClientRecordId", "", "uid", "dataType", "", "type", "startTime", "", "endTime", "entity", "Lcom/xiaomi/fit/fitness/persist/db/internal/HealthConnectSyncDaoEntity;", "generateClientRecordId", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HealthConnectIdGenerator {

    @NotNull
    public static final HealthConnectIdGenerator INSTANCE = new HealthConnectIdGenerator();

    private HealthConnectIdGenerator() {
    }

    @NotNull
    public final String generateClientRecordId(@NotNull HealthConnectSyncDaoEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return entity.getUid() + "-" + entity.getDataType() + "-" + entity.getType() + "-" + entity.getTime() + "-" + entity.getTimeZoneOffset();
    }

    @NotNull
    public final String generateTimeRangeClientRecordId(@NotNull String uid, int dataType, @NotNull String type, long startTime, long endTime) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(type, "type");
        return uid + "-" + dataType + "-" + type + "-" + startTime + "-" + endTime;
    }

    @NotNull
    public final String generateTimeRangeClientRecordId(@NotNull HealthConnectSyncDaoEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return entity.getUid() + "-" + entity.getDataType() + "-" + entity.getType() + "-" + entity.getStartTime() + "-" + entity.getEndTime();
    }
}
