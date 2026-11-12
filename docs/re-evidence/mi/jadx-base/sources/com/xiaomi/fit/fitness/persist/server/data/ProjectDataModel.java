package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JQ\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\nHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018¨\u0006%"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/ProjectDataModel;", "", "sid", "", "key", CloudContract.COL_PROJECT_ID, "", "time", "value", CloudContract.COL_ZONE_OFFSET, "", "isDeleted", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;IZ)V", "getSid", "()Ljava/lang/String;", "getKey", "getProjectId", "()J", "getTime", "getValue", "getZoneOffset", "()I", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProjectDataModel {

    @SerializedName("deleted")
    private final boolean isDeleted;

    @SerializedName("key")
    @NotNull
    private final String key;

    @SerializedName("project_id")
    private final long projectId;

    @SerializedName("sid")
    @NotNull
    private final String sid;

    @SerializedName("time")
    private final long time;

    @SerializedName("value")
    @Nullable
    private final String value;

    @SerializedName("zone_offset")
    private final int zoneOffset;

    public ProjectDataModel(@NotNull String sid, @NotNull String key, long j, long j2, @Nullable String str, int i, boolean z) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(key, "key");
        this.sid = sid;
        this.key = key;
        this.projectId = j;
        this.time = j2;
        this.value = str;
        this.zoneOffset = i;
        this.isDeleted = z;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getProjectId() {
        return this.projectId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getZoneOffset() {
        return this.zoneOffset;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsDeleted() {
        return this.isDeleted;
    }

    @NotNull
    public final ProjectDataModel copy(@NotNull String sid, @NotNull String key, long projectId, long time, @Nullable String value, int zoneOffset, boolean isDeleted) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(key, "key");
        return new ProjectDataModel(sid, key, projectId, time, value, zoneOffset, isDeleted);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProjectDataModel)) {
            return false;
        }
        ProjectDataModel projectDataModel = (ProjectDataModel) other;
        return Intrinsics.areEqual(this.sid, projectDataModel.sid) && Intrinsics.areEqual(this.key, projectDataModel.key) && this.projectId == projectDataModel.projectId && this.time == projectDataModel.time && Intrinsics.areEqual(this.value, projectDataModel.value) && this.zoneOffset == projectDataModel.zoneOffset && this.isDeleted == projectDataModel.isDeleted;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final long getProjectId() {
        return this.projectId;
    }

    @NotNull
    public final String getSid() {
        return this.sid;
    }

    public final long getTime() {
        return this.time;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public final int getZoneOffset() {
        return this.zoneOffset;
    }

    public int hashCode() {
        int iHashCode = ((((((this.sid.hashCode() * 31) + this.key.hashCode()) * 31) + Long.hashCode(this.projectId)) * 31) + Long.hashCode(this.time)) * 31;
        String str = this.value;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.zoneOffset)) * 31) + Boolean.hashCode(this.isDeleted);
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    @NotNull
    public String toString() {
        return "ProjectDataModel(sid=" + this.sid + ", key=" + this.key + ", projectId=" + this.projectId + ", time=" + this.time + ", value=" + this.value + ", zoneOffset=" + this.zoneOffset + ", isDeleted=" + this.isDeleted + ")";
    }
}
