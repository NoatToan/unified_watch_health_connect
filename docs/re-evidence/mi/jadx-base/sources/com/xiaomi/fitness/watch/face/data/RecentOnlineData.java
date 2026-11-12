package com.xiaomi.fitness.watch.face.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.watch.face.schema.FaceSchema;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/watch/face/data/RecentOnlineData;", "", "hasRecent", "", "list", "", "Lcom/xiaomi/fitness/watch/face/data/RecentOnlineListData;", FaceSchema.FACE_PAGE_TAB, "Lcom/xiaomi/fitness/watch/face/data/RecentOnlineTabData;", "<init>", "(ZLjava/util/List;Lcom/xiaomi/fitness/watch/face/data/RecentOnlineTabData;)V", "getHasRecent", "()Z", "getList", "()Ljava/util/List;", "getTab", "()Lcom/xiaomi/fitness/watch/face/data/RecentOnlineTabData;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecentOnlineData {

    @SerializedName("is_recent_online")
    private final boolean hasRecent;

    @SerializedName("recent_online_list")
    @Nullable
    private final List<RecentOnlineListData> list;

    @SerializedName("recent_online_tab")
    @Nullable
    private final RecentOnlineTabData tab;

    public RecentOnlineData(boolean z, @Nullable List<RecentOnlineListData> list, @Nullable RecentOnlineTabData recentOnlineTabData) {
        this.hasRecent = z;
        this.list = list;
        this.tab = recentOnlineTabData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecentOnlineData copy$default(RecentOnlineData recentOnlineData, boolean z, List list, RecentOnlineTabData recentOnlineTabData, int i, Object obj) {
        if ((i & 1) != 0) {
            z = recentOnlineData.hasRecent;
        }
        if ((i & 2) != 0) {
            list = recentOnlineData.list;
        }
        if ((i & 4) != 0) {
            recentOnlineTabData = recentOnlineData.tab;
        }
        return recentOnlineData.copy(z, list, recentOnlineTabData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHasRecent() {
        return this.hasRecent;
    }

    @Nullable
    public final List<RecentOnlineListData> component2() {
        return this.list;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RecentOnlineTabData getTab() {
        return this.tab;
    }

    @NotNull
    public final RecentOnlineData copy(boolean hasRecent, @Nullable List<RecentOnlineListData> list, @Nullable RecentOnlineTabData tab) {
        return new RecentOnlineData(hasRecent, list, tab);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecentOnlineData)) {
            return false;
        }
        RecentOnlineData recentOnlineData = (RecentOnlineData) other;
        return this.hasRecent == recentOnlineData.hasRecent && Intrinsics.areEqual(this.list, recentOnlineData.list) && Intrinsics.areEqual(this.tab, recentOnlineData.tab);
    }

    public final boolean getHasRecent() {
        return this.hasRecent;
    }

    @Nullable
    public final List<RecentOnlineListData> getList() {
        return this.list;
    }

    @Nullable
    public final RecentOnlineTabData getTab() {
        return this.tab;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.hasRecent) * 31;
        List<RecentOnlineListData> list = this.list;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        RecentOnlineTabData recentOnlineTabData = this.tab;
        return iHashCode2 + (recentOnlineTabData != null ? recentOnlineTabData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RecentOnlineData(hasRecent=" + this.hasRecent + ", list=" + this.list + ", tab=" + this.tab + ")";
    }
}
