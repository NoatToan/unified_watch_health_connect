package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/ProjectDataKey;", "", "key", "", "sid", CloudContract.COL_PROJECT_ID, "", "time", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJ)V", "getKey", "()Ljava/lang/String;", "getSid", "getProjectId", "()J", "getTime", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProjectDataKey {

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

    public ProjectDataKey(@NotNull String key, @NotNull String sid, long j, long j2) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sid, "sid");
        this.key = key;
        this.sid = sid;
        this.projectId = j;
        this.time = j2;
    }

    public static /* synthetic */ ProjectDataKey copy$default(ProjectDataKey projectDataKey, String str, String str2, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = projectDataKey.key;
        }
        if ((i & 2) != 0) {
            str2 = projectDataKey.sid;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            j = projectDataKey.projectId;
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = projectDataKey.time;
        }
        return projectDataKey.copy(str, str3, j3, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getProjectId() {
        return this.projectId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final ProjectDataKey copy(@NotNull String key, @NotNull String sid, long projectId, long time) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sid, "sid");
        return new ProjectDataKey(key, sid, projectId, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProjectDataKey)) {
            return false;
        }
        ProjectDataKey projectDataKey = (ProjectDataKey) other;
        return Intrinsics.areEqual(this.key, projectDataKey.key) && Intrinsics.areEqual(this.sid, projectDataKey.sid) && this.projectId == projectDataKey.projectId && this.time == projectDataKey.time;
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

    public int hashCode() {
        return (((((this.key.hashCode() * 31) + this.sid.hashCode()) * 31) + Long.hashCode(this.projectId)) * 31) + Long.hashCode(this.time);
    }

    @NotNull
    public String toString() {
        return "ProjectDataKey(key=" + this.key + ", sid=" + this.sid + ", projectId=" + this.projectId + ", time=" + this.time + ")";
    }
}
