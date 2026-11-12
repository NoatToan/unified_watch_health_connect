package com.huami.femalehealth.logiclib.db.po;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgData;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Entity(tableName = "DeletedMenstruationSection")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ:\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\t\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001b\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\b¨\u0006$"}, d2 = {"Lcom/huami/femalehealth/logiclib/db/po/DeletedMenstruationSection;", "", "", "component1", "", "component2", "component3", "component4", "()Ljava/lang/Long;", "serverId", "startTime", "endTime", EcgData.TIMESTAMP_SERVER_UPDATED, "copy", "(Ljava/lang/String;JJLjava/lang/Long;)Lcom/huami/femalehealth/logiclib/db/po/DeletedMenstruationSection;", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getServerId", "()Ljava/lang/String;", "b", "J", "getStartTime", "()J", "c", "getEndTime", GoogleApiAvailabilityLight.a, "Ljava/lang/Long;", "getUpdateTime", "<init>", "(Ljava/lang/String;JJLjava/lang/Long;)V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DeletedMenstruationSection {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey
    @NotNull
    private final String serverId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long startTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long endTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long updateTime;

    public DeletedMenstruationSection(@NotNull String str, long j, long j2, @Nullable Long l) {
        this.serverId = str;
        this.startTime = j;
        this.endTime = j2;
        this.updateTime = l;
    }

    public static /* synthetic */ DeletedMenstruationSection copy$default(DeletedMenstruationSection deletedMenstruationSection, String str, long j, long j2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deletedMenstruationSection.serverId;
        }
        if ((i & 2) != 0) {
            j = deletedMenstruationSection.startTime;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = deletedMenstruationSection.endTime;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            l = deletedMenstruationSection.updateTime;
        }
        return deletedMenstruationSection.copy(str, j3, j4, l);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getServerId() {
        return this.serverId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    public final DeletedMenstruationSection copy(@NotNull String serverId, long startTime, long endTime, @Nullable Long updateTime) {
        return new DeletedMenstruationSection(serverId, startTime, endTime, updateTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeletedMenstruationSection)) {
            return false;
        }
        DeletedMenstruationSection deletedMenstruationSection = (DeletedMenstruationSection) other;
        return Intrinsics.areEqual(this.serverId, deletedMenstruationSection.serverId) && this.startTime == deletedMenstruationSection.startTime && this.endTime == deletedMenstruationSection.endTime && Intrinsics.areEqual(this.updateTime, deletedMenstruationSection.updateTime);
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final String getServerId() {
        return this.serverId;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        int iHashCode = ((((this.serverId.hashCode() * 31) + b.a(this.startTime)) * 31) + b.a(this.endTime)) * 31;
        Long l = this.updateTime;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    @NotNull
    public String toString() {
        return "DeletedMenstruationSection(serverId=" + this.serverId + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", updateTime=" + this.updateTime + ')';
    }
}
