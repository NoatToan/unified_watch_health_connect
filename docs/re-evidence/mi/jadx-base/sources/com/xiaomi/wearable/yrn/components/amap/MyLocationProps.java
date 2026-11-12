package com.xiaomi.wearable.yrn.components.amap;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003Jf\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\bHÖ\u0001J\t\u0010-\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006."}, d2 = {"Lcom/xiaomi/wearable/yrn/components/amap/MyLocationProps;", "", "anchorU", "", "anchorV", "myLocationIcon", "", "radiusFillColor", "", "strokeColor", "strokeWidth", "myLocationType", "showMyLocation", "", "<init>", "(DDLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;IZ)V", "getAnchorU", "()D", "getAnchorV", "getMyLocationIcon", "()Ljava/lang/String;", "getRadiusFillColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStrokeColor", "getStrokeWidth", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMyLocationType", "()I", "getShowMyLocation", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(DDLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;IZ)Lcom/xiaomi/wearable/yrn/components/amap/MyLocationProps;", "equals", "other", "hashCode", "toString", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MyLocationProps {
    private final double anchorU;
    private final double anchorV;

    @Nullable
    private final String myLocationIcon;
    private final int myLocationType;

    @Nullable
    private final Integer radiusFillColor;
    private final boolean showMyLocation;

    @Nullable
    private final Integer strokeColor;

    @Nullable
    private final Double strokeWidth;

    public MyLocationProps(double d, double d2, @Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Double d3, int i, boolean z) {
        this.anchorU = d;
        this.anchorV = d2;
        this.myLocationIcon = str;
        this.radiusFillColor = num;
        this.strokeColor = num2;
        this.strokeWidth = d3;
        this.myLocationType = i;
        this.showMyLocation = z;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getAnchorU() {
        return this.anchorU;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getAnchorV() {
        return this.anchorV;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMyLocationIcon() {
        return this.myLocationIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getRadiusFillColor() {
        return this.radiusFillColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getStrokeColor() {
        return this.strokeColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getStrokeWidth() {
        return this.strokeWidth;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getMyLocationType() {
        return this.myLocationType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getShowMyLocation() {
        return this.showMyLocation;
    }

    @NotNull
    public final MyLocationProps copy(double anchorU, double anchorV, @Nullable String myLocationIcon, @Nullable Integer radiusFillColor, @Nullable Integer strokeColor, @Nullable Double strokeWidth, int myLocationType, boolean showMyLocation) {
        return new MyLocationProps(anchorU, anchorV, myLocationIcon, radiusFillColor, strokeColor, strokeWidth, myLocationType, showMyLocation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MyLocationProps)) {
            return false;
        }
        MyLocationProps myLocationProps = (MyLocationProps) other;
        return Double.compare(this.anchorU, myLocationProps.anchorU) == 0 && Double.compare(this.anchorV, myLocationProps.anchorV) == 0 && Intrinsics.areEqual(this.myLocationIcon, myLocationProps.myLocationIcon) && Intrinsics.areEqual(this.radiusFillColor, myLocationProps.radiusFillColor) && Intrinsics.areEqual(this.strokeColor, myLocationProps.strokeColor) && Intrinsics.areEqual((Object) this.strokeWidth, (Object) myLocationProps.strokeWidth) && this.myLocationType == myLocationProps.myLocationType && this.showMyLocation == myLocationProps.showMyLocation;
    }

    public final double getAnchorU() {
        return this.anchorU;
    }

    public final double getAnchorV() {
        return this.anchorV;
    }

    @Nullable
    public final String getMyLocationIcon() {
        return this.myLocationIcon;
    }

    public final int getMyLocationType() {
        return this.myLocationType;
    }

    @Nullable
    public final Integer getRadiusFillColor() {
        return this.radiusFillColor;
    }

    public final boolean getShowMyLocation() {
        return this.showMyLocation;
    }

    @Nullable
    public final Integer getStrokeColor() {
        return this.strokeColor;
    }

    @Nullable
    public final Double getStrokeWidth() {
        return this.strokeWidth;
    }

    public int hashCode() {
        int iHashCode = ((Double.hashCode(this.anchorU) * 31) + Double.hashCode(this.anchorV)) * 31;
        String str = this.myLocationIcon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.radiusFillColor;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.strokeColor;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this.strokeWidth;
        return ((((iHashCode4 + (d != null ? d.hashCode() : 0)) * 31) + Integer.hashCode(this.myLocationType)) * 31) + Boolean.hashCode(this.showMyLocation);
    }

    @NotNull
    public String toString() {
        return "MyLocationProps(anchorU=" + this.anchorU + ", anchorV=" + this.anchorV + ", myLocationIcon=" + this.myLocationIcon + ", radiusFillColor=" + this.radiusFillColor + ", strokeColor=" + this.strokeColor + ", strokeWidth=" + this.strokeWidth + ", myLocationType=" + this.myLocationType + ", showMyLocation=" + this.showMyLocation + ")";
    }
}
