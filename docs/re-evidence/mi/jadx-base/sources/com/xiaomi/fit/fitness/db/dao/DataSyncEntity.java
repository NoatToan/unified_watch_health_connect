package com.xiaomi.fit.fitness.db.dao;

import androidx.room.Entity;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Entity(primaryKeys = {"sid", "idBytes"}, tableName = "device_sync")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Lcom/xiaomi/fit/fitness/db/dao/DataSyncEntity;", "", "sid", "", "idBytes", "", "syncStatus", "", "forceSync", "", "<init>", "(Ljava/lang/String;[BIZ)V", "getSid", "()Ljava/lang/String;", "getIdBytes", "()[B", "getSyncStatus", "()I", "setSyncStatus", "(I)V", "getForceSync", "()Z", "setForceSync", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DataSyncEntity {
    private boolean forceSync;

    @NotNull
    private final byte[] idBytes;

    @NotNull
    private final String sid;
    private int syncStatus;

    public DataSyncEntity(@NotNull String sid, @NotNull byte[] idBytes, @SyncStatus int i, boolean z) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(idBytes, "idBytes");
        this.sid = sid;
        this.idBytes = idBytes;
        this.syncStatus = i;
        this.forceSync = z;
    }

    public static /* synthetic */ DataSyncEntity copy$default(DataSyncEntity dataSyncEntity, String str, byte[] bArr, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dataSyncEntity.sid;
        }
        if ((i2 & 2) != 0) {
            bArr = dataSyncEntity.idBytes;
        }
        if ((i2 & 4) != 0) {
            i = dataSyncEntity.syncStatus;
        }
        if ((i2 & 8) != 0) {
            z = dataSyncEntity.forceSync;
        }
        return dataSyncEntity.copy(str, bArr, i, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte[] getIdBytes() {
        return this.idBytes;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSyncStatus() {
        return this.syncStatus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getForceSync() {
        return this.forceSync;
    }

    @NotNull
    public final DataSyncEntity copy(@NotNull String sid, @NotNull byte[] idBytes, @SyncStatus int syncStatus, boolean forceSync) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(idBytes, "idBytes");
        return new DataSyncEntity(sid, idBytes, syncStatus, forceSync);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataSyncEntity)) {
            return false;
        }
        DataSyncEntity dataSyncEntity = (DataSyncEntity) other;
        return Intrinsics.areEqual(this.sid, dataSyncEntity.sid) && Intrinsics.areEqual(this.idBytes, dataSyncEntity.idBytes) && this.syncStatus == dataSyncEntity.syncStatus && this.forceSync == dataSyncEntity.forceSync;
    }

    public final boolean getForceSync() {
        return this.forceSync;
    }

    @NotNull
    public final byte[] getIdBytes() {
        return this.idBytes;
    }

    @NotNull
    public final String getSid() {
        return this.sid;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    public int hashCode() {
        return (((((this.sid.hashCode() * 31) + Arrays.hashCode(this.idBytes)) * 31) + Integer.hashCode(this.syncStatus)) * 31) + Boolean.hashCode(this.forceSync);
    }

    public final void setForceSync(boolean z) {
        this.forceSync = z;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    @NotNull
    public String toString() {
        return "DataSyncEntity(sid=" + this.sid + ", idBytes=" + Arrays.toString(this.idBytes) + ", syncStatus=" + this.syncStatus + ", forceSync=" + this.forceSync + ")";
    }

    public /* synthetic */ DataSyncEntity(String str, byte[] bArr, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bArr, i, (i2 & 8) != 0 ? true : z);
    }
}
