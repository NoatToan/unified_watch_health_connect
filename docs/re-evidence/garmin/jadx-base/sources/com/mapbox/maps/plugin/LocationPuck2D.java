package com.mapbox.maps.plugin;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.ImageHolder;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003JC\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\"HÖ\u0001J\t\u0010(\u001a\u00020\u0007HÖ\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006."}, d2 = {"Lcom/mapbox/maps/plugin/LocationPuck2D;", "Lcom/mapbox/maps/plugin/LocationPuck;", "topImage", "Lcom/mapbox/maps/ImageHolder;", "bearingImage", "shadowImage", "scaleExpression", "", "opacity", "", "(Lcom/mapbox/maps/ImageHolder;Lcom/mapbox/maps/ImageHolder;Lcom/mapbox/maps/ImageHolder;Ljava/lang/String;F)V", "getBearingImage", "()Lcom/mapbox/maps/ImageHolder;", "setBearingImage", "(Lcom/mapbox/maps/ImageHolder;)V", "getOpacity", "()F", "setOpacity", "(F)V", "getScaleExpression", "()Ljava/lang/String;", "setScaleExpression", "(Ljava/lang/String;)V", "getShadowImage", "setShadowImage", "getTopImage", "setTopImage", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class LocationPuck2D extends LocationPuck {
    public static final Parcelable.Creator<LocationPuck2D> CREATOR = new Creator();
    private ImageHolder bearingImage;
    private float opacity;
    private String scaleExpression;
    private ImageHolder shadowImage;
    private ImageHolder topImage;

    public /* synthetic */ LocationPuck2D(ImageHolder imageHolder, ImageHolder imageHolder2, ImageHolder imageHolder3, String str, float f14, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : imageHolder, (i14 & 2) != 0 ? null : imageHolder2, (i14 & 4) != 0 ? null : imageHolder3, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? 1.0f : f14);
    }

    public static /* synthetic */ LocationPuck2D copy$default(LocationPuck2D locationPuck2D, ImageHolder imageHolder, ImageHolder imageHolder2, ImageHolder imageHolder3, String str, float f14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            imageHolder = locationPuck2D.topImage;
        }
        if ((i14 & 2) != 0) {
            imageHolder2 = locationPuck2D.bearingImage;
        }
        if ((i14 & 4) != 0) {
            imageHolder3 = locationPuck2D.shadowImage;
        }
        if ((i14 & 8) != 0) {
            str = locationPuck2D.scaleExpression;
        }
        if ((i14 & 16) != 0) {
            f14 = locationPuck2D.opacity;
        }
        float f15 = f14;
        ImageHolder imageHolder4 = imageHolder3;
        return locationPuck2D.copy(imageHolder, imageHolder2, imageHolder4, str, f15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ImageHolder getTopImage() {
        return this.topImage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ImageHolder getBearingImage() {
        return this.bearingImage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ImageHolder getShadowImage() {
        return this.shadowImage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getScaleExpression() {
        return this.scaleExpression;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getOpacity() {
        return this.opacity;
    }

    public final LocationPuck2D copy(ImageHolder topImage, ImageHolder bearingImage, ImageHolder shadowImage, String scaleExpression, float opacity) {
        return new LocationPuck2D(topImage, bearingImage, shadowImage, scaleExpression, opacity);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationPuck2D)) {
            return false;
        }
        LocationPuck2D locationPuck2D = (LocationPuck2D) other;
        return s.g(this.topImage, locationPuck2D.topImage) && s.g(this.bearingImage, locationPuck2D.bearingImage) && s.g(this.shadowImage, locationPuck2D.shadowImage) && s.g(this.scaleExpression, locationPuck2D.scaleExpression) && Float.compare(this.opacity, locationPuck2D.opacity) == 0;
    }

    public final ImageHolder getBearingImage() {
        return this.bearingImage;
    }

    public final float getOpacity() {
        return this.opacity;
    }

    public final String getScaleExpression() {
        return this.scaleExpression;
    }

    public final ImageHolder getShadowImage() {
        return this.shadowImage;
    }

    public final ImageHolder getTopImage() {
        return this.topImage;
    }

    public int hashCode() {
        ImageHolder imageHolder = this.topImage;
        int iHashCode = (imageHolder == null ? 0 : imageHolder.hashCode()) * 31;
        ImageHolder imageHolder2 = this.bearingImage;
        int iHashCode2 = (iHashCode + (imageHolder2 == null ? 0 : imageHolder2.hashCode())) * 31;
        ImageHolder imageHolder3 = this.shadowImage;
        int iHashCode3 = (iHashCode2 + (imageHolder3 == null ? 0 : imageHolder3.hashCode())) * 31;
        String str = this.scaleExpression;
        return Float.hashCode(this.opacity) + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final void setBearingImage(ImageHolder imageHolder) {
        this.bearingImage = imageHolder;
    }

    public final void setOpacity(float f14) {
        this.opacity = f14;
    }

    public final void setScaleExpression(String str) {
        this.scaleExpression = str;
    }

    public final void setShadowImage(ImageHolder imageHolder) {
        this.shadowImage = imageHolder;
    }

    public final void setTopImage(ImageHolder imageHolder) {
        this.topImage = imageHolder;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("LocationPuck2D(topImage=");
        sb3.append(this.topImage);
        sb3.append(", bearingImage=");
        sb3.append(this.bearingImage);
        sb3.append(", shadowImage=");
        sb3.append(this.shadowImage);
        sb3.append(", scaleExpression=");
        sb3.append(this.scaleExpression);
        sb3.append(", opacity=");
        return f.p(sb3, this.opacity, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.getClass();
        ImageHolder imageHolder = this.topImage;
        if (imageHolder == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageHolder.writeToParcel(parcel, flags);
        }
        ImageHolder imageHolder2 = this.bearingImage;
        if (imageHolder2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageHolder2.writeToParcel(parcel, flags);
        }
        ImageHolder imageHolder3 = this.shadowImage;
        if (imageHolder3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageHolder3.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.scaleExpression);
        parcel.writeFloat(this.opacity);
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LocationPuck2D> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocationPuck2D createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new LocationPuck2D(parcel.readInt() == 0 ? null : ImageHolder.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ImageHolder.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ImageHolder.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocationPuck2D[] newArray(int i14) {
            return new LocationPuck2D[i14];
        }
    }

    public LocationPuck2D(ImageHolder imageHolder) {
        this(imageHolder, null, null, null, 0.0f, 30, null);
    }

    public LocationPuck2D(ImageHolder imageHolder, ImageHolder imageHolder2) {
        this(imageHolder, imageHolder2, null, null, 0.0f, 28, null);
    }

    public LocationPuck2D(ImageHolder imageHolder, ImageHolder imageHolder2, ImageHolder imageHolder3) {
        this(imageHolder, imageHolder2, imageHolder3, null, 0.0f, 24, null);
    }

    public LocationPuck2D(ImageHolder imageHolder, ImageHolder imageHolder2, ImageHolder imageHolder3, String str) {
        this(imageHolder, imageHolder2, imageHolder3, str, 0.0f, 16, null);
    }

    public LocationPuck2D() {
        this(null, null, null, null, 0.0f, 31, null);
    }

    public LocationPuck2D(ImageHolder imageHolder, ImageHolder imageHolder2, ImageHolder imageHolder3, String str, float f14) {
        super(null);
        this.topImage = imageHolder;
        this.bearingImage = imageHolder2;
        this.shadowImage = imageHolder3;
        this.scaleExpression = str;
        this.opacity = f14;
    }
}
