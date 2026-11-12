package com.xiaomi.wearable.yrn.components.amap;

import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\u0083\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\tHÆ\u0001J\u0013\u00100\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0003HÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001eR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0011\u0010\u0011\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001c¨\u00065"}, d2 = {"Lcom/xiaomi/wearable/yrn/components/amap/MarkerProps;", "", "id", "", "position", "Lcom/xiaomi/wearable/yrn/components/amap/Coordinate;", "icon", "Lcom/xiaomi/wearable/yrn/components/amap/MarkerIcon;", "anchorU", "", "anchorV", "isDraggable", "", "isVisible", "period", "isGps", "zIndex", SleepAnalyzerAlpha.NAME_ALPHA, "rotateAngle", "<init>", "(ILcom/xiaomi/wearable/yrn/components/amap/Coordinate;Lcom/xiaomi/wearable/yrn/components/amap/MarkerIcon;DDZZIZDDD)V", "getId", "()I", "getPosition", "()Lcom/xiaomi/wearable/yrn/components/amap/Coordinate;", "getIcon", "()Lcom/xiaomi/wearable/yrn/components/amap/MarkerIcon;", "getAnchorU", "()D", "getAnchorV", "()Z", "getPeriod", "getZIndex", "getAlpha", "getRotateAngle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "toString", "", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MarkerProps {
    private final double alpha;
    private final double anchorU;
    private final double anchorV;

    @Nullable
    private final MarkerIcon icon;
    private final int id;
    private final boolean isDraggable;
    private final boolean isGps;
    private final boolean isVisible;
    private final int period;

    @NotNull
    private final Coordinate position;
    private final double rotateAngle;
    private final double zIndex;

    public MarkerProps(int i, @NotNull Coordinate position, @Nullable MarkerIcon markerIcon, double d, double d2, boolean z, boolean z2, int i2, boolean z3, double d3, double d4, double d5) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.id = i;
        this.position = position;
        this.icon = markerIcon;
        this.anchorU = d;
        this.anchorV = d2;
        this.isDraggable = z;
        this.isVisible = z2;
        this.period = i2;
        this.isGps = z3;
        this.zIndex = d3;
        this.alpha = d4;
        this.rotateAngle = d5;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final double getZIndex() {
        return this.zIndex;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final double getAlpha() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final double getRotateAngle() {
        return this.rotateAngle;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Coordinate getPosition() {
        return this.position;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MarkerIcon getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getAnchorU() {
        return this.anchorU;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getAnchorV() {
        return this.anchorV;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsDraggable() {
        return this.isDraggable;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsGps() {
        return this.isGps;
    }

    @NotNull
    public final MarkerProps copy(int id, @NotNull Coordinate position, @Nullable MarkerIcon icon, double anchorU, double anchorV, boolean isDraggable, boolean isVisible, int period, boolean isGps, double zIndex, double alpha, double rotateAngle) {
        Intrinsics.checkNotNullParameter(position, "position");
        return new MarkerProps(id, position, icon, anchorU, anchorV, isDraggable, isVisible, period, isGps, zIndex, alpha, rotateAngle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarkerProps)) {
            return false;
        }
        MarkerProps markerProps = (MarkerProps) other;
        return this.id == markerProps.id && Intrinsics.areEqual(this.position, markerProps.position) && Intrinsics.areEqual(this.icon, markerProps.icon) && Double.compare(this.anchorU, markerProps.anchorU) == 0 && Double.compare(this.anchorV, markerProps.anchorV) == 0 && this.isDraggable == markerProps.isDraggable && this.isVisible == markerProps.isVisible && this.period == markerProps.period && this.isGps == markerProps.isGps && Double.compare(this.zIndex, markerProps.zIndex) == 0 && Double.compare(this.alpha, markerProps.alpha) == 0 && Double.compare(this.rotateAngle, markerProps.rotateAngle) == 0;
    }

    public final double getAlpha() {
        return this.alpha;
    }

    public final double getAnchorU() {
        return this.anchorU;
    }

    public final double getAnchorV() {
        return this.anchorV;
    }

    @Nullable
    public final MarkerIcon getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.id;
    }

    public final int getPeriod() {
        return this.period;
    }

    @NotNull
    public final Coordinate getPosition() {
        return this.position;
    }

    public final double getRotateAngle() {
        return this.rotateAngle;
    }

    public final double getZIndex() {
        return this.zIndex;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.id) * 31) + this.position.hashCode()) * 31;
        MarkerIcon markerIcon = this.icon;
        return ((((((((((((((((((iHashCode + (markerIcon == null ? 0 : markerIcon.hashCode())) * 31) + Double.hashCode(this.anchorU)) * 31) + Double.hashCode(this.anchorV)) * 31) + Boolean.hashCode(this.isDraggable)) * 31) + Boolean.hashCode(this.isVisible)) * 31) + Integer.hashCode(this.period)) * 31) + Boolean.hashCode(this.isGps)) * 31) + Double.hashCode(this.zIndex)) * 31) + Double.hashCode(this.alpha)) * 31) + Double.hashCode(this.rotateAngle);
    }

    public final boolean isDraggable() {
        return this.isDraggable;
    }

    public final boolean isGps() {
        return this.isGps;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    @NotNull
    public String toString() {
        return "MarkerProps(id=" + this.id + ", position=" + this.position + ", icon=" + this.icon + ", anchorU=" + this.anchorU + ", anchorV=" + this.anchorV + ", isDraggable=" + this.isDraggable + ", isVisible=" + this.isVisible + ", period=" + this.period + ", isGps=" + this.isGps + ", zIndex=" + this.zIndex + ", alpha=" + this.alpha + ", rotateAngle=" + this.rotateAngle + ")";
    }
}
