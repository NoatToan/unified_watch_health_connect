package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Entity(primaryKeys = {"sid", "idBytes"}, tableName = "fds_data_id")
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u001d\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010*\u001a\u00020\u001f2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0013HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\t\"\u0004\b%\u0010&¨\u0006."}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/FDSDataIdEntity;", "", "sid", "", "idBytes", "", "<init>", "(Ljava/lang/String;[B)V", "getSid", "()Ljava/lang/String;", "getIdBytes", "()[B", "time", "", "getTime", "()J", "setTime", "(J)V", "dailyType", "", "getDailyType", "()I", "setDailyType", "(I)V", DailyRecordKey.sportType, "getSportType", "setSportType", "fileType", "getFileType", "setFileType", "isUpload", "", "()Z", "setUpload", "(Z)V", "extra", "getExtra", "setExtra", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FDSDataIdEntity {
    private int dailyType;

    @Nullable
    private String extra;
    private int fileType;

    @ColumnInfo(typeAffinity = 5)
    @NotNull
    private final byte[] idBytes;

    @ColumnInfo(name = "isUpload")
    private boolean isUpload;

    @NotNull
    private final String sid;
    private int sportType;
    private long time;

    public FDSDataIdEntity(@NotNull String sid, @NotNull byte[] idBytes) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(idBytes, "idBytes");
        this.sid = sid;
        this.idBytes = idBytes;
    }

    public static /* synthetic */ FDSDataIdEntity copy$default(FDSDataIdEntity fDSDataIdEntity, String str, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fDSDataIdEntity.sid;
        }
        if ((i & 2) != 0) {
            bArr = fDSDataIdEntity.idBytes;
        }
        return fDSDataIdEntity.copy(str, bArr);
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

    @NotNull
    public final FDSDataIdEntity copy(@NotNull String sid, @NotNull byte[] idBytes) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(idBytes, "idBytes");
        return new FDSDataIdEntity(sid, idBytes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FDSDataIdEntity)) {
            return false;
        }
        FDSDataIdEntity fDSDataIdEntity = (FDSDataIdEntity) other;
        return Intrinsics.areEqual(this.sid, fDSDataIdEntity.sid) && Intrinsics.areEqual(this.idBytes, fDSDataIdEntity.idBytes);
    }

    public final int getDailyType() {
        return this.dailyType;
    }

    @Nullable
    public final String getExtra() {
        return this.extra;
    }

    public final int getFileType() {
        return this.fileType;
    }

    @NotNull
    public final byte[] getIdBytes() {
        return this.idBytes;
    }

    @NotNull
    public final String getSid() {
        return this.sid;
    }

    public final int getSportType() {
        return this.sportType;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (this.sid.hashCode() * 31) + Arrays.hashCode(this.idBytes);
    }

    /* JADX INFO: renamed from: isUpload, reason: from getter */
    public final boolean getIsUpload() {
        return this.isUpload;
    }

    public final void setDailyType(int i) {
        this.dailyType = i;
    }

    public final void setExtra(@Nullable String str) {
        this.extra = str;
    }

    public final void setFileType(int i) {
        this.fileType = i;
    }

    public final void setSportType(int i) {
        this.sportType = i;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setUpload(boolean z) {
        this.isUpload = z;
    }

    @NotNull
    public String toString() {
        return "FDSDataIdEntity(sid=" + this.sid + ", idBytes=" + Arrays.toString(this.idBytes) + ")";
    }
}
