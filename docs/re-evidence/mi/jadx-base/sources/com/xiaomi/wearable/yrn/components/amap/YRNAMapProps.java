package com.xiaomi.wearable.yrn.components.amap;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J~\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0010R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\t\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0010¨\u0006&"}, d2 = {"Lcom/xiaomi/wearable/yrn/components/amap/YRNAMapProps;", "", "isZoomControlsEnabled", "", "isCompassEnabled", "isRotateGesturesEnabled", "isZoomGesturesEnabled", "isScrollGesturesEnabled", "isTiltGesturesEnabled", "isAllGesturesEnabled", "isMyLocationButtonEnabled", "isIndoorSwitchEnabled", "isZoomInByScreenCenter", "isCenterIconShow", "<init>", "(ZZZZZZLjava/lang/Boolean;ZZZZ)V", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(ZZZZZZLjava/lang/Boolean;ZZZZ)Lcom/xiaomi/wearable/yrn/components/amap/YRNAMapProps;", "equals", "other", "hashCode", "", "toString", "", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class YRNAMapProps {

    @Nullable
    private final Boolean isAllGesturesEnabled;
    private final boolean isCenterIconShow;
    private final boolean isCompassEnabled;
    private final boolean isIndoorSwitchEnabled;
    private final boolean isMyLocationButtonEnabled;
    private final boolean isRotateGesturesEnabled;
    private final boolean isScrollGesturesEnabled;
    private final boolean isTiltGesturesEnabled;
    private final boolean isZoomControlsEnabled;
    private final boolean isZoomGesturesEnabled;
    private final boolean isZoomInByScreenCenter;

    public YRNAMapProps(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, @Nullable Boolean bool, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.isZoomControlsEnabled = z;
        this.isCompassEnabled = z2;
        this.isRotateGesturesEnabled = z3;
        this.isZoomGesturesEnabled = z4;
        this.isScrollGesturesEnabled = z5;
        this.isTiltGesturesEnabled = z6;
        this.isAllGesturesEnabled = bool;
        this.isMyLocationButtonEnabled = z7;
        this.isIndoorSwitchEnabled = z8;
        this.isZoomInByScreenCenter = z9;
        this.isCenterIconShow = z10;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsZoomControlsEnabled() {
        return this.isZoomControlsEnabled;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsZoomInByScreenCenter() {
        return this.isZoomInByScreenCenter;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsCenterIconShow() {
        return this.isCenterIconShow;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsCompassEnabled() {
        return this.isCompassEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsRotateGesturesEnabled() {
        return this.isRotateGesturesEnabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsZoomGesturesEnabled() {
        return this.isZoomGesturesEnabled;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsScrollGesturesEnabled() {
        return this.isScrollGesturesEnabled;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsTiltGesturesEnabled() {
        return this.isTiltGesturesEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsAllGesturesEnabled() {
        return this.isAllGesturesEnabled;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsMyLocationButtonEnabled() {
        return this.isMyLocationButtonEnabled;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsIndoorSwitchEnabled() {
        return this.isIndoorSwitchEnabled;
    }

    @NotNull
    public final YRNAMapProps copy(boolean isZoomControlsEnabled, boolean isCompassEnabled, boolean isRotateGesturesEnabled, boolean isZoomGesturesEnabled, boolean isScrollGesturesEnabled, boolean isTiltGesturesEnabled, @Nullable Boolean isAllGesturesEnabled, boolean isMyLocationButtonEnabled, boolean isIndoorSwitchEnabled, boolean isZoomInByScreenCenter, boolean isCenterIconShow) {
        return new YRNAMapProps(isZoomControlsEnabled, isCompassEnabled, isRotateGesturesEnabled, isZoomGesturesEnabled, isScrollGesturesEnabled, isTiltGesturesEnabled, isAllGesturesEnabled, isMyLocationButtonEnabled, isIndoorSwitchEnabled, isZoomInByScreenCenter, isCenterIconShow);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YRNAMapProps)) {
            return false;
        }
        YRNAMapProps yRNAMapProps = (YRNAMapProps) other;
        return this.isZoomControlsEnabled == yRNAMapProps.isZoomControlsEnabled && this.isCompassEnabled == yRNAMapProps.isCompassEnabled && this.isRotateGesturesEnabled == yRNAMapProps.isRotateGesturesEnabled && this.isZoomGesturesEnabled == yRNAMapProps.isZoomGesturesEnabled && this.isScrollGesturesEnabled == yRNAMapProps.isScrollGesturesEnabled && this.isTiltGesturesEnabled == yRNAMapProps.isTiltGesturesEnabled && Intrinsics.areEqual(this.isAllGesturesEnabled, yRNAMapProps.isAllGesturesEnabled) && this.isMyLocationButtonEnabled == yRNAMapProps.isMyLocationButtonEnabled && this.isIndoorSwitchEnabled == yRNAMapProps.isIndoorSwitchEnabled && this.isZoomInByScreenCenter == yRNAMapProps.isZoomInByScreenCenter && this.isCenterIconShow == yRNAMapProps.isCenterIconShow;
    }

    public int hashCode() {
        int iHashCode = ((((((((((Boolean.hashCode(this.isZoomControlsEnabled) * 31) + Boolean.hashCode(this.isCompassEnabled)) * 31) + Boolean.hashCode(this.isRotateGesturesEnabled)) * 31) + Boolean.hashCode(this.isZoomGesturesEnabled)) * 31) + Boolean.hashCode(this.isScrollGesturesEnabled)) * 31) + Boolean.hashCode(this.isTiltGesturesEnabled)) * 31;
        Boolean bool = this.isAllGesturesEnabled;
        return ((((((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.isMyLocationButtonEnabled)) * 31) + Boolean.hashCode(this.isIndoorSwitchEnabled)) * 31) + Boolean.hashCode(this.isZoomInByScreenCenter)) * 31) + Boolean.hashCode(this.isCenterIconShow);
    }

    @Nullable
    public final Boolean isAllGesturesEnabled() {
        return this.isAllGesturesEnabled;
    }

    public final boolean isCenterIconShow() {
        return this.isCenterIconShow;
    }

    public final boolean isCompassEnabled() {
        return this.isCompassEnabled;
    }

    public final boolean isIndoorSwitchEnabled() {
        return this.isIndoorSwitchEnabled;
    }

    public final boolean isMyLocationButtonEnabled() {
        return this.isMyLocationButtonEnabled;
    }

    public final boolean isRotateGesturesEnabled() {
        return this.isRotateGesturesEnabled;
    }

    public final boolean isScrollGesturesEnabled() {
        return this.isScrollGesturesEnabled;
    }

    public final boolean isTiltGesturesEnabled() {
        return this.isTiltGesturesEnabled;
    }

    public final boolean isZoomControlsEnabled() {
        return this.isZoomControlsEnabled;
    }

    public final boolean isZoomGesturesEnabled() {
        return this.isZoomGesturesEnabled;
    }

    public final boolean isZoomInByScreenCenter() {
        return this.isZoomInByScreenCenter;
    }

    @NotNull
    public String toString() {
        return "YRNAMapProps(isZoomControlsEnabled=" + this.isZoomControlsEnabled + ", isCompassEnabled=" + this.isCompassEnabled + ", isRotateGesturesEnabled=" + this.isRotateGesturesEnabled + ", isZoomGesturesEnabled=" + this.isZoomGesturesEnabled + ", isScrollGesturesEnabled=" + this.isScrollGesturesEnabled + ", isTiltGesturesEnabled=" + this.isTiltGesturesEnabled + ", isAllGesturesEnabled=" + this.isAllGesturesEnabled + ", isMyLocationButtonEnabled=" + this.isMyLocationButtonEnabled + ", isIndoorSwitchEnabled=" + this.isIndoorSwitchEnabled + ", isZoomInByScreenCenter=" + this.isZoomInByScreenCenter + ", isCenterIconShow=" + this.isCenterIconShow + ")";
    }
}
