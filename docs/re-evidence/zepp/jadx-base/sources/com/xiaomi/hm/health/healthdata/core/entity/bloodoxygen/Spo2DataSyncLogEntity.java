package com.xiaomi.hm.health.healthdata.core.entity.bloodoxygen;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.huami.sleepassistant.apilib.utils.WebConst;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Entity(indices = {@Index(unique = true, value = {"nextTime"})})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/Spo2DataSyncLogEntity;", "", "", "toString", "", "component1", "()Ljava/lang/Integer;", "", "component2", "()Ljava/lang/Long;", "id", "nextTime", "copy", "(Ljava/lang/Integer;Ljava/lang/Long;)Lcom/xiaomi/hm/health/healthdata/core/entity/bloodoxygen/Spo2DataSyncLogEntity;", "hashCode", "other", "", "equals", "a", "Ljava/lang/Integer;", "getId", WebConst.QueryParam.SET_ID, "(Ljava/lang/Integer;)V", "b", "Ljava/lang/Long;", "getNextTime", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Spo2DataSyncLogEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey(autoGenerate = true)
    @Nullable
    private Integer id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long nextTime;

    /* JADX WARN: Multi-variable type inference failed */
    public Spo2DataSyncLogEntity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public Spo2DataSyncLogEntity(@Nullable Integer num, @Nullable Long l) {
        this.id = num;
        this.nextTime = l;
    }

    public static /* synthetic */ Spo2DataSyncLogEntity copy$default(Spo2DataSyncLogEntity spo2DataSyncLogEntity, Integer num, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            num = spo2DataSyncLogEntity.id;
        }
        if ((i & 2) != 0) {
            l = spo2DataSyncLogEntity.nextTime;
        }
        return spo2DataSyncLogEntity.copy(num, l);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getNextTime() {
        return this.nextTime;
    }

    @NotNull
    public final Spo2DataSyncLogEntity copy(@Nullable Integer id, @Nullable Long nextTime) {
        return new Spo2DataSyncLogEntity(id, nextTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Spo2DataSyncLogEntity)) {
            return false;
        }
        Spo2DataSyncLogEntity spo2DataSyncLogEntity = (Spo2DataSyncLogEntity) other;
        return Intrinsics.areEqual(this.id, spo2DataSyncLogEntity.id) && Intrinsics.areEqual(this.nextTime, spo2DataSyncLogEntity.nextTime);
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final Long getNextTime() {
        return this.nextTime;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.nextTime;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final void setId(@Nullable Integer num) {
        this.id = num;
    }

    @NotNull
    public String toString() {
        return "Spo2DataSyncLogEntity(id=" + this.id + ", nextTime=" + this.nextTime + ")";
    }

    public /* synthetic */ Spo2DataSyncLogEntity(Integer num, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : l);
    }
}
