package com.xiaomi.fit.fitness.db.dao;

import androidx.room.Entity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Entity(primaryKeys = {"did", "time", "dataType"}, tableName = "cgm_glucose")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fit/fitness/db/dao/CgmGlucoseEntity;", "", "did", "", "time", "", "dataType", "", "value", "<init>", "(Ljava/lang/String;JILjava/lang/String;)V", "getDid", "()Ljava/lang/String;", "getTime", "()J", "getDataType", "()I", "getValue", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CgmGlucoseEntity {
    private final int dataType;

    @NotNull
    private final String did;
    private final long time;

    @NotNull
    private final String value;

    public CgmGlucoseEntity(@NotNull String did, long j, int i, @NotNull String value) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(value, "value");
        this.did = did;
        this.time = j;
        this.dataType = i;
        this.value = value;
    }

    public static /* synthetic */ CgmGlucoseEntity copy$default(CgmGlucoseEntity cgmGlucoseEntity, String str, long j, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cgmGlucoseEntity.did;
        }
        if ((i2 & 2) != 0) {
            j = cgmGlucoseEntity.time;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            i = cgmGlucoseEntity.dataType;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str2 = cgmGlucoseEntity.value;
        }
        return cgmGlucoseEntity.copy(str, j2, i3, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final CgmGlucoseEntity copy(@NotNull String did, long time, int dataType, @NotNull String value) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(value, "value");
        return new CgmGlucoseEntity(did, time, dataType, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CgmGlucoseEntity)) {
            return false;
        }
        CgmGlucoseEntity cgmGlucoseEntity = (CgmGlucoseEntity) other;
        return Intrinsics.areEqual(this.did, cgmGlucoseEntity.did) && this.time == cgmGlucoseEntity.time && this.dataType == cgmGlucoseEntity.dataType && Intrinsics.areEqual(this.value, cgmGlucoseEntity.value);
    }

    public final int getDataType() {
        return this.dataType;
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((this.did.hashCode() * 31) + Long.hashCode(this.time)) * 31) + Integer.hashCode(this.dataType)) * 31) + this.value.hashCode();
    }

    @NotNull
    public String toString() {
        return "CgmGlucoseEntity(did=" + this.did + ", time=" + this.time + ", dataType=" + this.dataType + ", value=" + this.value + ")";
    }
}
