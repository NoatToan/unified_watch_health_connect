package com.xiaomi.fitness.watch.face.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/watch/face/data/RecentOnlineListData;", "", "id", "", "time", "", "<init>", "(Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getTime", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecentOnlineListData {

    @NotNull
    private final String id;

    @SerializedName("online_time")
    private final long time;

    public RecentOnlineListData(@NotNull String id, long j) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.time = j;
    }

    public static /* synthetic */ RecentOnlineListData copy$default(RecentOnlineListData recentOnlineListData, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recentOnlineListData.id;
        }
        if ((i & 2) != 0) {
            j = recentOnlineListData.time;
        }
        return recentOnlineListData.copy(str, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final RecentOnlineListData copy(@NotNull String id, long time) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new RecentOnlineListData(id, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecentOnlineListData)) {
            return false;
        }
        RecentOnlineListData recentOnlineListData = (RecentOnlineListData) other;
        return Intrinsics.areEqual(this.id, recentOnlineListData.id) && this.time == recentOnlineListData.time;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + Long.hashCode(this.time);
    }

    @NotNull
    public String toString() {
        return "RecentOnlineListData(id=" + this.id + ", time=" + this.time + ")";
    }
}
