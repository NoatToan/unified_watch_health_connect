package com.xiaomi.fitness.repo.healthconnect.biz.daily;

import com.xiaomi.fit.fitness.persist.db.internal.HealthConnectSyncDaoEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0003J/\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/UnAggregateAbleRecordsInfo;", "T", "", "records", "", "entities", "Lcom/xiaomi/fit/fitness/persist/db/internal/HealthConnectSyncDaoEntity;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getRecords", "()Ljava/util/List;", "getEntities", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UnAggregateAbleRecordsInfo<T> {

    @NotNull
    private final List<HealthConnectSyncDaoEntity> entities;

    @NotNull
    private final List<T> records;

    /* JADX WARN: Multi-variable type inference failed */
    public UnAggregateAbleRecordsInfo(@NotNull List<? extends T> records, @NotNull List<HealthConnectSyncDaoEntity> entities) {
        Intrinsics.checkNotNullParameter(records, "records");
        Intrinsics.checkNotNullParameter(entities, "entities");
        this.records = records;
        this.entities = entities;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnAggregateAbleRecordsInfo copy$default(UnAggregateAbleRecordsInfo unAggregateAbleRecordsInfo, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = unAggregateAbleRecordsInfo.records;
        }
        if ((i & 2) != 0) {
            list2 = unAggregateAbleRecordsInfo.entities;
        }
        return unAggregateAbleRecordsInfo.copy(list, list2);
    }

    @NotNull
    public final List<T> component1() {
        return this.records;
    }

    @NotNull
    public final List<HealthConnectSyncDaoEntity> component2() {
        return this.entities;
    }

    @NotNull
    public final UnAggregateAbleRecordsInfo<T> copy(@NotNull List<? extends T> records, @NotNull List<HealthConnectSyncDaoEntity> entities) {
        Intrinsics.checkNotNullParameter(records, "records");
        Intrinsics.checkNotNullParameter(entities, "entities");
        return new UnAggregateAbleRecordsInfo<>(records, entities);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnAggregateAbleRecordsInfo)) {
            return false;
        }
        UnAggregateAbleRecordsInfo unAggregateAbleRecordsInfo = (UnAggregateAbleRecordsInfo) other;
        return Intrinsics.areEqual(this.records, unAggregateAbleRecordsInfo.records) && Intrinsics.areEqual(this.entities, unAggregateAbleRecordsInfo.entities);
    }

    @NotNull
    public final List<HealthConnectSyncDaoEntity> getEntities() {
        return this.entities;
    }

    @NotNull
    public final List<T> getRecords() {
        return this.records;
    }

    public int hashCode() {
        return (this.records.hashCode() * 31) + this.entities.hashCode();
    }

    @NotNull
    public String toString() {
        return "UnAggregateAbleRecordsInfo(records=" + this.records + ", entities=" + this.entities + ")";
    }
}
