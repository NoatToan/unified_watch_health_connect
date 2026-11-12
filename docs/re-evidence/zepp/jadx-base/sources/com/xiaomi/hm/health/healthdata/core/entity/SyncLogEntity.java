package com.xiaomi.hm.health.healthdata.core.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Entity
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0006J\t\u0010\r\u001a\u00020\fHÆ\u0003J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010Jb\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0016\u001a\u00020\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0006R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010\u001e\u001a\u0004\b+\u0010\u0006R\u0019\u0010\u0016\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\u0016\u0010.R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0010¨\u00064"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/entity/SyncLogEntity;", "", "", "toString", "", "component1", "()Ljava/lang/Integer;", "component2", "Ljava/util/Date;", "component3", "component4", "component5", "", "component6", "", "component7", "()Ljava/lang/Long;", "id", "userId", "startTime", "finishTime", "dataSize", "isFinished", "nextTime", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Integer;ZLjava/lang/Long;)Lcom/xiaomi/hm/health/healthdata/core/entity/SyncLogEntity;", "hashCode", "other", "equals", "a", "Ljava/lang/Integer;", "getId", "b", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "c", "Ljava/util/Date;", "getStartTime", "()Ljava/util/Date;", GoogleApiAvailabilityLight.a, "getFinishTime", "e", "getDataSize", "f", "Z", "()Z", "g", "Ljava/lang/Long;", "getNextTime", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Integer;ZLjava/lang/Long;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SyncLogEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey(autoGenerate = true)
    @Nullable
    private final Integer id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final String userId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Date startTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Date finishTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final Integer dataSize;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final boolean isFinished;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private final Long nextTime;

    public SyncLogEntity(@Nullable Integer num, @Nullable String str, @Nullable Date date, @Nullable Date date2, @Nullable Integer num2, boolean z, @Nullable Long l) {
        this.id = num;
        this.userId = str;
        this.startTime = date;
        this.finishTime = date2;
        this.dataSize = num2;
        this.isFinished = z;
        this.nextTime = l;
    }

    public static /* synthetic */ SyncLogEntity copy$default(SyncLogEntity syncLogEntity, Integer num, String str, Date date, Date date2, Integer num2, boolean z, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            num = syncLogEntity.id;
        }
        if ((i & 2) != 0) {
            str = syncLogEntity.userId;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            date = syncLogEntity.startTime;
        }
        Date date3 = date;
        if ((i & 8) != 0) {
            date2 = syncLogEntity.finishTime;
        }
        Date date4 = date2;
        if ((i & 16) != 0) {
            num2 = syncLogEntity.dataSize;
        }
        Integer num3 = num2;
        if ((i & 32) != 0) {
            z = syncLogEntity.isFinished;
        }
        boolean z2 = z;
        if ((i & 64) != 0) {
            l = syncLogEntity.nextTime;
        }
        return syncLogEntity.copy(num, str2, date3, date4, num3, z2, l);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getFinishTime() {
        return this.finishTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getDataSize() {
        return this.dataSize;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsFinished() {
        return this.isFinished;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getNextTime() {
        return this.nextTime;
    }

    @NotNull
    public final SyncLogEntity copy(@Nullable Integer id, @Nullable String userId, @Nullable Date startTime, @Nullable Date finishTime, @Nullable Integer dataSize, boolean isFinished, @Nullable Long nextTime) {
        return new SyncLogEntity(id, userId, startTime, finishTime, dataSize, isFinished, nextTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncLogEntity)) {
            return false;
        }
        SyncLogEntity syncLogEntity = (SyncLogEntity) other;
        return Intrinsics.areEqual(this.id, syncLogEntity.id) && Intrinsics.areEqual(this.userId, syncLogEntity.userId) && Intrinsics.areEqual(this.startTime, syncLogEntity.startTime) && Intrinsics.areEqual(this.finishTime, syncLogEntity.finishTime) && Intrinsics.areEqual(this.dataSize, syncLogEntity.dataSize) && this.isFinished == syncLogEntity.isFinished && Intrinsics.areEqual(this.nextTime, syncLogEntity.nextTime);
    }

    @Nullable
    public final Integer getDataSize() {
        return this.dataSize;
    }

    @Nullable
    public final Date getFinishTime() {
        return this.finishTime;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final Long getNextTime() {
        return this.nextTime;
    }

    @Nullable
    public final Date getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v20 */
    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.userId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Date date = this.startTime;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.finishTime;
        int iHashCode4 = (iHashCode3 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Integer num2 = this.dataSize;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        boolean z = this.isFinished;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode5 + r2) * 31;
        Long l = this.nextTime;
        return i + (l != null ? l.hashCode() : 0);
    }

    public final boolean isFinished() {
        return this.isFinished;
    }

    @NotNull
    public String toString() {
        return "SyncLogEntity(id=" + this.id + ", startTime=" + this.startTime + ", finishTime=" + this.finishTime + ", isFinished=" + this.isFinished + ")";
    }

    public /* synthetic */ SyncLogEntity(Integer num, String str, Date date, Date date2, Integer num2, boolean z, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, str, (i & 4) != 0 ? null : date, (i & 8) != 0 ? null : date2, (i & 16) != 0 ? 0 : num2, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : l);
    }
}
