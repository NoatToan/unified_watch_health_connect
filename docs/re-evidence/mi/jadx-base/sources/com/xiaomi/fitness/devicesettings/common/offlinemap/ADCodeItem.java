package com.xiaomi.fitness.devicesettings.common.offlinemap;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/offlinemap/ADCodeItem;", "", "minX", "", "minY", "maxX", "maxY", "zoom", "adcode", "", "<init>", "(IIIIILjava/lang/String;)V", "getMinX", "()I", "getMinY", "getMaxX", "getMaxY", "getZoom", "getAdcode", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ADCodeItem {

    @NotNull
    private final String adcode;
    private final int maxX;
    private final int maxY;
    private final int minX;
    private final int minY;
    private final int zoom;

    public ADCodeItem(int i, int i2, int i3, int i4, int i5, @NotNull String adcode) {
        Intrinsics.checkNotNullParameter(adcode, "adcode");
        this.minX = i;
        this.minY = i2;
        this.maxX = i3;
        this.maxY = i4;
        this.zoom = i5;
        this.adcode = adcode;
    }

    public static /* synthetic */ ADCodeItem copy$default(ADCodeItem aDCodeItem, int i, int i2, int i3, int i4, int i5, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = aDCodeItem.minX;
        }
        if ((i6 & 2) != 0) {
            i2 = aDCodeItem.minY;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = aDCodeItem.maxX;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = aDCodeItem.maxY;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = aDCodeItem.zoom;
        }
        int i10 = i5;
        if ((i6 & 32) != 0) {
            str = aDCodeItem.adcode;
        }
        return aDCodeItem.copy(i, i7, i8, i9, i10, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMinX() {
        return this.minX;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMinY() {
        return this.minY;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMaxX() {
        return this.maxX;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMaxY() {
        return this.maxY;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getZoom() {
        return this.zoom;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAdcode() {
        return this.adcode;
    }

    @NotNull
    public final ADCodeItem copy(int minX, int minY, int maxX, int maxY, int zoom, @NotNull String adcode) {
        Intrinsics.checkNotNullParameter(adcode, "adcode");
        return new ADCodeItem(minX, minY, maxX, maxY, zoom, adcode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ADCodeItem)) {
            return false;
        }
        ADCodeItem aDCodeItem = (ADCodeItem) other;
        return this.minX == aDCodeItem.minX && this.minY == aDCodeItem.minY && this.maxX == aDCodeItem.maxX && this.maxY == aDCodeItem.maxY && this.zoom == aDCodeItem.zoom && Intrinsics.areEqual(this.adcode, aDCodeItem.adcode);
    }

    @NotNull
    public final String getAdcode() {
        return this.adcode;
    }

    public final int getMaxX() {
        return this.maxX;
    }

    public final int getMaxY() {
        return this.maxY;
    }

    public final int getMinX() {
        return this.minX;
    }

    public final int getMinY() {
        return this.minY;
    }

    public final int getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.minX) * 31) + Integer.hashCode(this.minY)) * 31) + Integer.hashCode(this.maxX)) * 31) + Integer.hashCode(this.maxY)) * 31) + Integer.hashCode(this.zoom)) * 31) + this.adcode.hashCode();
    }

    @NotNull
    public String toString() {
        return "ADCodeItem(minX=" + this.minX + ", minY=" + this.minY + ", maxX=" + this.maxX + ", maxY=" + this.maxY + ", zoom=" + this.zoom + ", adcode=" + this.adcode + ")";
    }
}
