package com.xiaomi.fitness.sport_export.data;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000e\u001a\u00020\u0003H\u0016J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/sport_export/data/StartPoint;", "Ljava/io/Serializable;", "name", "", "latitude", "", "longitude", "<init>", "(Ljava/lang/String;DD)V", "getName", "()Ljava/lang/String;", "getLatitude", "()D", "getLongitude", "toString", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "sport-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StartPoint implements Serializable {

    /* JADX INFO: renamed from: latitude, reason: from kotlin metadata and from toString */
    @SerializedName("latitude")
    private final double x;

    /* JADX INFO: renamed from: longitude, reason: from kotlin metadata and from toString */
    @SerializedName("longitude")
    private final double y;

    @SerializedName("name")
    @NotNull
    private final String name;

    public StartPoint(@NotNull String name, double d, double d2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.x = d;
        this.y = d2;
    }

    public static /* synthetic */ StartPoint copy$default(StartPoint startPoint, String str, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = startPoint.name;
        }
        if ((i & 2) != 0) {
            d = startPoint.x;
        }
        double d3 = d;
        if ((i & 4) != 0) {
            d2 = startPoint.y;
        }
        return startPoint.copy(str, d3, d2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getY() {
        return this.y;
    }

    @NotNull
    public final StartPoint copy(@NotNull String name, double latitude, double longitude) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new StartPoint(name, latitude, longitude);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartPoint)) {
            return false;
        }
        StartPoint startPoint = (StartPoint) other;
        return Intrinsics.areEqual(this.name, startPoint.name) && Double.compare(this.x, startPoint.x) == 0 && Double.compare(this.y, startPoint.y) == 0;
    }

    public final double getLatitude() {
        return this.x;
    }

    public final double getLongitude() {
        return this.y;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + Double.hashCode(this.x)) * 31) + Double.hashCode(this.y);
    }

    @NotNull
    public String toString() {
        return "StartPoint(name='" + this.name + "', x=" + this.x + ", y=" + this.y + ")";
    }
}
