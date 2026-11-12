package com.xiaomi.wearable.yrn.components.amap;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJb\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0016\u0010\u000e¨\u0006%"}, d2 = {"Lcom/xiaomi/wearable/yrn/components/amap/ClusterOptions;", "", "radius", "", "minClusterSize", "maxZoomLevel", "clusterColor", "", "clusterTextColor", "clusterBorderColor", "clusterBorderWidth", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getRadius", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinClusterSize", "getMaxZoomLevel", "getClusterColor", "()Ljava/lang/String;", "getClusterTextColor", "getClusterBorderColor", "getClusterBorderWidth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/xiaomi/wearable/yrn/components/amap/ClusterOptions;", "equals", "", "other", "hashCode", "toString", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ClusterOptions {

    @Nullable
    private final String clusterBorderColor;

    @Nullable
    private final Integer clusterBorderWidth;

    @Nullable
    private final String clusterColor;

    @Nullable
    private final String clusterTextColor;

    @Nullable
    private final Integer maxZoomLevel;

    @Nullable
    private final Integer minClusterSize;

    @Nullable
    private final Integer radius;

    public ClusterOptions(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num4) {
        this.radius = num;
        this.minClusterSize = num2;
        this.maxZoomLevel = num3;
        this.clusterColor = str;
        this.clusterTextColor = str2;
        this.clusterBorderColor = str3;
        this.clusterBorderWidth = num4;
    }

    public static /* synthetic */ ClusterOptions copy$default(ClusterOptions clusterOptions, Integer num, Integer num2, Integer num3, String str, String str2, String str3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = clusterOptions.radius;
        }
        if ((i & 2) != 0) {
            num2 = clusterOptions.minClusterSize;
        }
        Integer num5 = num2;
        if ((i & 4) != 0) {
            num3 = clusterOptions.maxZoomLevel;
        }
        Integer num6 = num3;
        if ((i & 8) != 0) {
            str = clusterOptions.clusterColor;
        }
        String str4 = str;
        if ((i & 16) != 0) {
            str2 = clusterOptions.clusterTextColor;
        }
        String str5 = str2;
        if ((i & 32) != 0) {
            str3 = clusterOptions.clusterBorderColor;
        }
        String str6 = str3;
        if ((i & 64) != 0) {
            num4 = clusterOptions.clusterBorderWidth;
        }
        return clusterOptions.copy(num, num5, num6, str4, str5, str6, num4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getRadius() {
        return this.radius;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getMinClusterSize() {
        return this.minClusterSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getMaxZoomLevel() {
        return this.maxZoomLevel;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getClusterColor() {
        return this.clusterColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getClusterTextColor() {
        return this.clusterTextColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getClusterBorderColor() {
        return this.clusterBorderColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getClusterBorderWidth() {
        return this.clusterBorderWidth;
    }

    @NotNull
    public final ClusterOptions copy(@Nullable Integer radius, @Nullable Integer minClusterSize, @Nullable Integer maxZoomLevel, @Nullable String clusterColor, @Nullable String clusterTextColor, @Nullable String clusterBorderColor, @Nullable Integer clusterBorderWidth) {
        return new ClusterOptions(radius, minClusterSize, maxZoomLevel, clusterColor, clusterTextColor, clusterBorderColor, clusterBorderWidth);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClusterOptions)) {
            return false;
        }
        ClusterOptions clusterOptions = (ClusterOptions) other;
        return Intrinsics.areEqual(this.radius, clusterOptions.radius) && Intrinsics.areEqual(this.minClusterSize, clusterOptions.minClusterSize) && Intrinsics.areEqual(this.maxZoomLevel, clusterOptions.maxZoomLevel) && Intrinsics.areEqual(this.clusterColor, clusterOptions.clusterColor) && Intrinsics.areEqual(this.clusterTextColor, clusterOptions.clusterTextColor) && Intrinsics.areEqual(this.clusterBorderColor, clusterOptions.clusterBorderColor) && Intrinsics.areEqual(this.clusterBorderWidth, clusterOptions.clusterBorderWidth);
    }

    @Nullable
    public final String getClusterBorderColor() {
        return this.clusterBorderColor;
    }

    @Nullable
    public final Integer getClusterBorderWidth() {
        return this.clusterBorderWidth;
    }

    @Nullable
    public final String getClusterColor() {
        return this.clusterColor;
    }

    @Nullable
    public final String getClusterTextColor() {
        return this.clusterTextColor;
    }

    @Nullable
    public final Integer getMaxZoomLevel() {
        return this.maxZoomLevel;
    }

    @Nullable
    public final Integer getMinClusterSize() {
        return this.minClusterSize;
    }

    @Nullable
    public final Integer getRadius() {
        return this.radius;
    }

    public int hashCode() {
        Integer num = this.radius;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.minClusterSize;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.maxZoomLevel;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.clusterColor;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.clusterTextColor;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clusterBorderColor;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.clusterBorderWidth;
        return iHashCode6 + (num4 != null ? num4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ClusterOptions(radius=" + this.radius + ", minClusterSize=" + this.minClusterSize + ", maxZoomLevel=" + this.maxZoomLevel + ", clusterColor=" + this.clusterColor + ", clusterTextColor=" + this.clusterTextColor + ", clusterBorderColor=" + this.clusterBorderColor + ", clusterBorderWidth=" + this.clusterBorderWidth + ")";
    }
}
