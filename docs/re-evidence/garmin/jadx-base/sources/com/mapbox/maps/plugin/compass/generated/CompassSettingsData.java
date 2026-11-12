package com.mapbox.maps.plugin.compass.generated;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.ImageHolder;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import r1.q2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\t\u00109\u001a\u00020\u0007HÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\t\u0010;\u001a\u00020\u0007HÆ\u0003J\t\u0010<\u001a\u00020\u0007HÆ\u0003J\t\u0010=\u001a\u00020\u0007HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u0083\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\t\u0010@\u001a\u00020\u0005HÖ\u0001J\u0013\u0010A\u001a\u00020\u00032\b\u0010B\u001a\u0004\u0018\u00010CHÖ\u0003J\t\u0010D\u001a\u00020\u0005HÖ\u0001J\t\u0010E\u001a\u00020FHÖ\u0001J\u0019\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010 \"\u0004\b0\u0010\"R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u0010\u0016¨\u0006L"}, d2 = {"Lcom/mapbox/maps/plugin/compass/generated/CompassSettingsData;", "Landroid/os/Parcelable;", "enabled", "", ModelSourceWrapper.POSITION, "", "marginLeft", "", "marginTop", "marginRight", "marginBottom", "opacity", "rotation", "visibility", "fadeWhenFacingNorth", "clickable", "image", "Lcom/mapbox/maps/ImageHolder;", "(ZIFFFFFFZZZLcom/mapbox/maps/ImageHolder;)V", "getClickable", "()Z", "setClickable", "(Z)V", "getEnabled", "setEnabled", "getFadeWhenFacingNorth", "setFadeWhenFacingNorth", "getImage", "()Lcom/mapbox/maps/ImageHolder;", "setImage", "(Lcom/mapbox/maps/ImageHolder;)V", "getMarginBottom", "()F", "setMarginBottom", "(F)V", "getMarginLeft", "setMarginLeft", "getMarginRight", "setMarginRight", "getMarginTop", "setMarginTop", "getOpacity", "setOpacity", "getPosition", "()I", "setPosition", "(I)V", "getRotation", "setRotation", "getVisibility", "setVisibility", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
final /* data */ class CompassSettingsData implements Parcelable {
    public static final Parcelable.Creator<CompassSettingsData> CREATOR = new Creator();
    private boolean clickable;
    private boolean enabled;
    private boolean fadeWhenFacingNorth;
    private ImageHolder image;
    private float marginBottom;
    private float marginLeft;
    private float marginRight;
    private float marginTop;
    private float opacity;
    private int position;
    private float rotation;
    private boolean visibility;

    public /* synthetic */ CompassSettingsData(boolean z14, int i14, float f14, float f15, float f16, float f17, float f18, float f19, boolean z15, boolean z16, boolean z17, ImageHolder imageHolder, int i15, j jVar) {
        this(z14, i14, f14, f15, f16, f17, f18, f19, z15, z16, z17, (i15 & 2048) != 0 ? null : imageHolder);
    }

    public static /* synthetic */ CompassSettingsData copy$default(CompassSettingsData compassSettingsData, boolean z14, int i14, float f14, float f15, float f16, float f17, float f18, float f19, boolean z15, boolean z16, boolean z17, ImageHolder imageHolder, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z14 = compassSettingsData.enabled;
        }
        if ((i15 & 2) != 0) {
            i14 = compassSettingsData.position;
        }
        if ((i15 & 4) != 0) {
            f14 = compassSettingsData.marginLeft;
        }
        if ((i15 & 8) != 0) {
            f15 = compassSettingsData.marginTop;
        }
        if ((i15 & 16) != 0) {
            f16 = compassSettingsData.marginRight;
        }
        if ((i15 & 32) != 0) {
            f17 = compassSettingsData.marginBottom;
        }
        if ((i15 & 64) != 0) {
            f18 = compassSettingsData.opacity;
        }
        if ((i15 & 128) != 0) {
            f19 = compassSettingsData.rotation;
        }
        if ((i15 & 256) != 0) {
            z15 = compassSettingsData.visibility;
        }
        if ((i15 & 512) != 0) {
            z16 = compassSettingsData.fadeWhenFacingNorth;
        }
        if ((i15 & 1024) != 0) {
            z17 = compassSettingsData.clickable;
        }
        if ((i15 & 2048) != 0) {
            imageHolder = compassSettingsData.image;
        }
        boolean z18 = z17;
        ImageHolder imageHolder2 = imageHolder;
        boolean z19 = z15;
        boolean z24 = z16;
        float f22 = f18;
        float f24 = f19;
        float f25 = f16;
        float f26 = f17;
        return compassSettingsData.copy(z14, i14, f14, f15, f25, f26, f22, f24, z19, z24, z18, imageHolder2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getFadeWhenFacingNorth() {
        return this.fadeWhenFacingNorth;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getClickable() {
        return this.clickable;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final ImageHolder getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getMarginLeft() {
        return this.marginLeft;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getMarginTop() {
        return this.marginTop;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getMarginRight() {
        return this.marginRight;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getMarginBottom() {
        return this.marginBottom;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getOpacity() {
        return this.opacity;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final float getRotation() {
        return this.rotation;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getVisibility() {
        return this.visibility;
    }

    public final CompassSettingsData copy(boolean enabled, int position, float marginLeft, float marginTop, float marginRight, float marginBottom, float opacity, float rotation, boolean visibility, boolean fadeWhenFacingNorth, boolean clickable, ImageHolder image) {
        return new CompassSettingsData(enabled, position, marginLeft, marginTop, marginRight, marginBottom, opacity, rotation, visibility, fadeWhenFacingNorth, clickable, image);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompassSettingsData)) {
            return false;
        }
        CompassSettingsData compassSettingsData = (CompassSettingsData) other;
        return this.enabled == compassSettingsData.enabled && this.position == compassSettingsData.position && Float.compare(this.marginLeft, compassSettingsData.marginLeft) == 0 && Float.compare(this.marginTop, compassSettingsData.marginTop) == 0 && Float.compare(this.marginRight, compassSettingsData.marginRight) == 0 && Float.compare(this.marginBottom, compassSettingsData.marginBottom) == 0 && Float.compare(this.opacity, compassSettingsData.opacity) == 0 && Float.compare(this.rotation, compassSettingsData.rotation) == 0 && this.visibility == compassSettingsData.visibility && this.fadeWhenFacingNorth == compassSettingsData.fadeWhenFacingNorth && this.clickable == compassSettingsData.clickable && s.g(this.image, compassSettingsData.image);
    }

    public final boolean getClickable() {
        return this.clickable;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getFadeWhenFacingNorth() {
        return this.fadeWhenFacingNorth;
    }

    public final ImageHolder getImage() {
        return this.image;
    }

    public final float getMarginBottom() {
        return this.marginBottom;
    }

    public final float getMarginLeft() {
        return this.marginLeft;
    }

    public final float getMarginRight() {
        return this.marginRight;
    }

    public final float getMarginTop() {
        return this.marginTop;
    }

    public final float getOpacity() {
        return this.opacity;
    }

    public final int getPosition() {
        return this.position;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final boolean getVisibility() {
        return this.visibility;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    public int hashCode() {
        boolean z14 = this.enabled;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int iD = f.d(this.rotation, f.d(this.opacity, f.d(this.marginBottom, f.d(this.marginRight, f.d(this.marginTop, f.d(this.marginLeft, q2.d(this.position, r14 * 31, 31), 31), 31), 31), 31), 31), 31);
        boolean z15 = this.visibility;
        ?? r15 = z15;
        if (z15) {
            r15 = 1;
        }
        int i14 = (iD + r15) * 31;
        boolean z16 = this.fadeWhenFacingNorth;
        ?? r16 = z16;
        if (z16) {
            r16 = 1;
        }
        int i15 = (i14 + r16) * 31;
        boolean z17 = this.clickable;
        int i16 = (i15 + (z17 ? 1 : z17)) * 31;
        ImageHolder imageHolder = this.image;
        return i16 + (imageHolder == null ? 0 : imageHolder.hashCode());
    }

    public final void setClickable(boolean z14) {
        this.clickable = z14;
    }

    public final void setEnabled(boolean z14) {
        this.enabled = z14;
    }

    public final void setFadeWhenFacingNorth(boolean z14) {
        this.fadeWhenFacingNorth = z14;
    }

    public final void setImage(ImageHolder imageHolder) {
        this.image = imageHolder;
    }

    public final void setMarginBottom(float f14) {
        this.marginBottom = f14;
    }

    public final void setMarginLeft(float f14) {
        this.marginLeft = f14;
    }

    public final void setMarginRight(float f14) {
        this.marginRight = f14;
    }

    public final void setMarginTop(float f14) {
        this.marginTop = f14;
    }

    public final void setOpacity(float f14) {
        this.opacity = f14;
    }

    public final void setPosition(int i14) {
        this.position = i14;
    }

    public final void setRotation(float f14) {
        this.rotation = f14;
    }

    public final void setVisibility(boolean z14) {
        this.visibility = z14;
    }

    public String toString() {
        return "CompassSettingsData(enabled=" + this.enabled + ", position=" + this.position + ", marginLeft=" + this.marginLeft + ", marginTop=" + this.marginTop + ", marginRight=" + this.marginRight + ", marginBottom=" + this.marginBottom + ", opacity=" + this.opacity + ", rotation=" + this.rotation + ", visibility=" + this.visibility + ", fadeWhenFacingNorth=" + this.fadeWhenFacingNorth + ", clickable=" + this.clickable + ", image=" + this.image + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeInt(this.enabled ? 1 : 0);
        parcel.writeInt(this.position);
        parcel.writeFloat(this.marginLeft);
        parcel.writeFloat(this.marginTop);
        parcel.writeFloat(this.marginRight);
        parcel.writeFloat(this.marginBottom);
        parcel.writeFloat(this.opacity);
        parcel.writeFloat(this.rotation);
        parcel.writeInt(this.visibility ? 1 : 0);
        parcel.writeInt(this.fadeWhenFacingNorth ? 1 : 0);
        parcel.writeInt(this.clickable ? 1 : 0);
        ImageHolder imageHolder = this.image;
        if (imageHolder == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageHolder.writeToParcel(parcel, flags);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CompassSettingsData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CompassSettingsData createFromParcel(Parcel parcel) {
            boolean z14;
            boolean z15;
            parcel.getClass();
            if (parcel.readInt() != 0) {
                z15 = false;
                z14 = true;
            } else {
                z14 = false;
                z15 = false;
            }
            int i14 = parcel.readInt();
            float f14 = parcel.readFloat();
            boolean z16 = z15;
            float f15 = parcel.readFloat();
            float f16 = parcel.readFloat();
            float f17 = parcel.readFloat();
            boolean z17 = true;
            float f18 = parcel.readFloat();
            boolean z18 = z16;
            float f19 = parcel.readFloat();
            if (parcel.readInt() == 0) {
                z17 = z18;
            }
            if (parcel.readInt() != 0) {
                z18 = true;
            }
            if (parcel.readInt() == 0) {
                z17 = z18;
            }
            return new CompassSettingsData(z14, i14, f14, f15, f16, f17, f18, f19, z17, z18, z17, parcel.readInt() == 0 ? null : ImageHolder.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CompassSettingsData[] newArray(int i14) {
            return new CompassSettingsData[i14];
        }
    }

    public CompassSettingsData(boolean z14, int i14, float f14, float f15, float f16, float f17, float f18, float f19, boolean z15, boolean z16, boolean z17, ImageHolder imageHolder) {
        this.enabled = z14;
        this.position = i14;
        this.marginLeft = f14;
        this.marginTop = f15;
        this.marginRight = f16;
        this.marginBottom = f17;
        this.opacity = f18;
        this.rotation = f19;
        this.visibility = z15;
        this.fadeWhenFacingNorth = z16;
        this.clickable = z17;
        this.image = imageHolder;
    }
}
