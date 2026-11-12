package com.xiaomi.fitness.watch.face.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/watch/face/data/RecentOnlineTabData;", "", "type", "", "id", "", "route", "name", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()I", "getId", "()Ljava/lang/String;", "getRoute", "getName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecentOnlineTabData {

    @SerializedName("operation_id")
    @NotNull
    private final String id;

    @NotNull
    private final String name;

    @NotNull
    private final String route;

    @SerializedName("operation_type")
    private final int type;

    public RecentOnlineTabData(int i, @NotNull String id, @NotNull String route, @NotNull String name) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(name, "name");
        this.type = i;
        this.id = id;
        this.route = route;
        this.name = name;
    }

    public static /* synthetic */ RecentOnlineTabData copy$default(RecentOnlineTabData recentOnlineTabData, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = recentOnlineTabData.type;
        }
        if ((i2 & 2) != 0) {
            str = recentOnlineTabData.id;
        }
        if ((i2 & 4) != 0) {
            str2 = recentOnlineTabData.route;
        }
        if ((i2 & 8) != 0) {
            str3 = recentOnlineTabData.name;
        }
        return recentOnlineTabData.copy(i, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final RecentOnlineTabData copy(int type, @NotNull String id, @NotNull String route, @NotNull String name) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(name, "name");
        return new RecentOnlineTabData(type, id, route, name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecentOnlineTabData)) {
            return false;
        }
        RecentOnlineTabData recentOnlineTabData = (RecentOnlineTabData) other;
        return this.type == recentOnlineTabData.type && Intrinsics.areEqual(this.id, recentOnlineTabData.id) && Intrinsics.areEqual(this.route, recentOnlineTabData.route) && Intrinsics.areEqual(this.name, recentOnlineTabData.name);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getRoute() {
        return this.route;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.type) * 31) + this.id.hashCode()) * 31) + this.route.hashCode()) * 31) + this.name.hashCode();
    }

    @NotNull
    public String toString() {
        return "RecentOnlineTabData(type=" + this.type + ", id=" + this.id + ", route=" + this.route + ", name=" + this.name + ")";
    }
}
