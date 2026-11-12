package com.xiaomi.fitness.repo.healthconnect.biz.daily;

import androidx.health.connect.client.records.Record;
import com.xiaomi.fit.fitness.persist.db.internal.HealthConnectSyncDaoEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J1\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/repo/healthconnect/biz/daily/AggregateAbleRecordsInfo;", "T", "Landroidx/health/connect/client/records/Record;", "", "records", "", "entities", "Lcom/xiaomi/fit/fitness/persist/db/internal/HealthConnectSyncDaoEntity;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getRecords", "()Ljava/util/List;", "getEntities", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AggregateAbleRecordsInfo<T extends Record> {

    @Nullable
    private final List<HealthConnectSyncDaoEntity> entities;

    @NotNull
    private final List<T> records;

    /* JADX WARN: Multi-variable type inference failed */
    public AggregateAbleRecordsInfo(@NotNull List<? extends T> records, @Nullable List<HealthConnectSyncDaoEntity> list) {
        Intrinsics.checkNotNullParameter(records, "records");
        this.records = records;
        this.entities = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AggregateAbleRecordsInfo copy$default(AggregateAbleRecordsInfo aggregateAbleRecordsInfo, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = aggregateAbleRecordsInfo.records;
        }
        if ((i & 2) != 0) {
            list2 = aggregateAbleRecordsInfo.entities;
        }
        return aggregateAbleRecordsInfo.copy(list, list2);
    }

    @NotNull
    public final List<T> component1() {
        return this.records;
    }

    @Nullable
    public final List<HealthConnectSyncDaoEntity> component2() {
        return this.entities;
    }

    @NotNull
    public final AggregateAbleRecordsInfo<T> copy(@NotNull List<? extends T> records, @Nullable List<HealthConnectSyncDaoEntity> entities) {
        Intrinsics.checkNotNullParameter(records, "records");
        return new AggregateAbleRecordsInfo<>(records, entities);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AggregateAbleRecordsInfo)) {
            return false;
        }
        AggregateAbleRecordsInfo aggregateAbleRecordsInfo = (AggregateAbleRecordsInfo) other;
        return Intrinsics.areEqual(this.records, aggregateAbleRecordsInfo.records) && Intrinsics.areEqual(this.entities, aggregateAbleRecordsInfo.entities);
    }

    @Nullable
    public final List<HealthConnectSyncDaoEntity> getEntities() {
        return this.entities;
    }

    @NotNull
    public final List<T> getRecords() {
        return this.records;
    }

    public int hashCode() {
        int iHashCode = this.records.hashCode() * 31;
        List<HealthConnectSyncDaoEntity> list = this.entities;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "AggregateAbleRecordsInfo(records=" + this.records + ", entities=" + this.entities + ")";
    }

    public /* synthetic */ AggregateAbleRecordsInfo(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : list2);
    }
}
