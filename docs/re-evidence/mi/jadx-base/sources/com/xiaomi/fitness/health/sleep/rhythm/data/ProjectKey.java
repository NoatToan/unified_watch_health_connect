package com.xiaomi.fitness.health.sleep.rhythm.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/data/ProjectKey;", "", "sid", "", "project_id", "", "time", "value", "Lcom/xiaomi/fitness/health/sleep/rhythm/data/valueItem;", "<init>", "(Ljava/lang/String;JJLcom/xiaomi/fitness/health/sleep/rhythm/data/valueItem;)V", "getSid", "()Ljava/lang/String;", "getProject_id", "()J", "getTime", "getValue", "()Lcom/xiaomi/fitness/health/sleep/rhythm/data/valueItem;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProjectKey {

    @SerializedName("project_id")
    private final long project_id;

    @SerializedName("sid")
    @NotNull
    private final String sid;

    @SerializedName("time")
    private final long time;

    @SerializedName("value")
    @NotNull
    private final valueItem value;

    public ProjectKey(@NotNull String sid, long j, long j2, @NotNull valueItem value) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(value, "value");
        this.sid = sid;
        this.project_id = j;
        this.time = j2;
        this.value = value;
    }

    public static /* synthetic */ ProjectKey copy$default(ProjectKey projectKey, String str, long j, long j2, valueItem valueitem, int i, Object obj) {
        if ((i & 1) != 0) {
            str = projectKey.sid;
        }
        if ((i & 2) != 0) {
            j = projectKey.project_id;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = projectKey.time;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            valueitem = projectKey.value;
        }
        return projectKey.copy(str, j3, j4, valueitem);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getProject_id() {
        return this.project_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final valueItem getValue() {
        return this.value;
    }

    @NotNull
    public final ProjectKey copy(@NotNull String sid, long project_id, long time, @NotNull valueItem value) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(value, "value");
        return new ProjectKey(sid, project_id, time, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProjectKey)) {
            return false;
        }
        ProjectKey projectKey = (ProjectKey) other;
        return Intrinsics.areEqual(this.sid, projectKey.sid) && this.project_id == projectKey.project_id && this.time == projectKey.time && Intrinsics.areEqual(this.value, projectKey.value);
    }

    public final long getProject_id() {
        return this.project_id;
    }

    @NotNull
    public final String getSid() {
        return this.sid;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final valueItem getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((this.sid.hashCode() * 31) + Long.hashCode(this.project_id)) * 31) + Long.hashCode(this.time)) * 31) + this.value.hashCode();
    }

    @NotNull
    public String toString() {
        return "ProjectKey(sid=" + this.sid + ", project_id=" + this.project_id + ", time=" + this.time + ", value=" + this.value + ")";
    }
}
