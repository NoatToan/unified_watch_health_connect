package com.xiaomi.fitness.detail.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016JN\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/detail/model/RouteInfo;", "", "id", "", "name", "", "icon", "length", "", "file", "score", "<init>", "(ILjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/Integer;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getIcon", "getLength", "()D", "getFile", "getScore", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ILjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/Integer;)Lcom/xiaomi/fitness/detail/model/RouteInfo;", "equals", "", "other", "hashCode", "toString", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteInfo {

    @SerializedName("file")
    @Nullable
    private final String file;

    @SerializedName("icon")
    @NotNull
    private final String icon;

    @SerializedName("id")
    private final int id;

    @SerializedName("length")
    private final double length;

    @SerializedName("name")
    @NotNull
    private final String name;

    @SerializedName("score")
    @Nullable
    private final Integer score;

    public RouteInfo(int i, @NotNull String name, @NotNull String icon, double d, @Nullable String str, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.id = i;
        this.name = name;
        this.icon = icon;
        this.length = d;
        this.file = str;
        this.score = num;
    }

    public static /* synthetic */ RouteInfo copy$default(RouteInfo routeInfo, int i, String str, String str2, double d, String str3, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = routeInfo.id;
        }
        if ((i2 & 2) != 0) {
            str = routeInfo.name;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = routeInfo.icon;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            d = routeInfo.length;
        }
        double d2 = d;
        if ((i2 & 16) != 0) {
            str3 = routeInfo.file;
        }
        String str6 = str3;
        if ((i2 & 32) != 0) {
            num = routeInfo.score;
        }
        return routeInfo.copy(i, str4, str5, d2, str6, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getLength() {
        return this.length;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFile() {
        return this.file;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getScore() {
        return this.score;
    }

    @NotNull
    public final RouteInfo copy(int id, @NotNull String name, @NotNull String icon, double length, @Nullable String file, @Nullable Integer score) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new RouteInfo(id, name, icon, length, file, score);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouteInfo)) {
            return false;
        }
        RouteInfo routeInfo = (RouteInfo) other;
        return this.id == routeInfo.id && Intrinsics.areEqual(this.name, routeInfo.name) && Intrinsics.areEqual(this.icon, routeInfo.icon) && Double.compare(this.length, routeInfo.length) == 0 && Intrinsics.areEqual(this.file, routeInfo.file) && Intrinsics.areEqual(this.score, routeInfo.score);
    }

    @Nullable
    public final String getFile() {
        return this.file;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.id;
    }

    public final double getLength() {
        return this.length;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getScore() {
        return this.score;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.icon.hashCode()) * 31) + Double.hashCode(this.length)) * 31;
        String str = this.file;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.score;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RouteInfo(id=" + this.id + ", name=" + this.name + ", icon=" + this.icon + ", length=" + this.length + ", file=" + this.file + ", score=" + this.score + ")";
    }
}
