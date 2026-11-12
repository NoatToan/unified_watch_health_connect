package com.mapbox.maps.plugin.attribution.generated;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;
import q6.f;
import r1.q2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b'\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003JY\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001J\u0013\u0010.\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\u0005HÖ\u0001J\t\u00102\u001a\u000203HÖ\u0001J\u0019\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017¨\u00069"}, d2 = {"Lcom/mapbox/maps/plugin/attribution/generated/AttributionSettingsData;", "Landroid/os/Parcelable;", "enabled", "", "iconColor", "", ModelSourceWrapper.POSITION, "marginLeft", "", "marginTop", "marginRight", "marginBottom", "clickable", "(ZIIFFFFZ)V", "getClickable", "()Z", "setClickable", "(Z)V", "getEnabled", "setEnabled", "getIconColor", "()I", "setIconColor", "(I)V", "getMarginBottom", "()F", "setMarginBottom", "(F)V", "getMarginLeft", "setMarginLeft", "getMarginRight", "setMarginRight", "getMarginTop", "setMarginTop", "getPosition", "setPosition", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
final /* data */ class AttributionSettingsData implements Parcelable {
    public static final Parcelable.Creator<AttributionSettingsData> CREATOR = new Creator();
    private boolean clickable;
    private boolean enabled;
    private int iconColor;
    private float marginBottom;
    private float marginLeft;
    private float marginRight;
    private float marginTop;
    private int position;

    public AttributionSettingsData(boolean z14, int i14, int i15, float f14, float f15, float f16, float f17, boolean z15) {
        this.enabled = z14;
        this.iconColor = i14;
        this.position = i15;
        this.marginLeft = f14;
        this.marginTop = f15;
        this.marginRight = f16;
        this.marginBottom = f17;
        this.clickable = z15;
    }

    public static /* synthetic */ AttributionSettingsData copy$default(AttributionSettingsData attributionSettingsData, boolean z14, int i14, int i15, float f14, float f15, float f16, float f17, boolean z15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            z14 = attributionSettingsData.enabled;
        }
        if ((i16 & 2) != 0) {
            i14 = attributionSettingsData.iconColor;
        }
        if ((i16 & 4) != 0) {
            i15 = attributionSettingsData.position;
        }
        if ((i16 & 8) != 0) {
            f14 = attributionSettingsData.marginLeft;
        }
        if ((i16 & 16) != 0) {
            f15 = attributionSettingsData.marginTop;
        }
        if ((i16 & 32) != 0) {
            f16 = attributionSettingsData.marginRight;
        }
        if ((i16 & 64) != 0) {
            f17 = attributionSettingsData.marginBottom;
        }
        if ((i16 & 128) != 0) {
            z15 = attributionSettingsData.clickable;
        }
        float f18 = f17;
        boolean z16 = z15;
        float f19 = f15;
        float f22 = f16;
        return attributionSettingsData.copy(z14, i14, i15, f14, f19, f22, f18, z16);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIconColor() {
        return this.iconColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getMarginLeft() {
        return this.marginLeft;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getMarginTop() {
        return this.marginTop;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getMarginRight() {
        return this.marginRight;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getMarginBottom() {
        return this.marginBottom;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getClickable() {
        return this.clickable;
    }

    public final AttributionSettingsData copy(boolean enabled, int iconColor, int position, float marginLeft, float marginTop, float marginRight, float marginBottom, boolean clickable) {
        return new AttributionSettingsData(enabled, iconColor, position, marginLeft, marginTop, marginRight, marginBottom, clickable);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttributionSettingsData)) {
            return false;
        }
        AttributionSettingsData attributionSettingsData = (AttributionSettingsData) other;
        return this.enabled == attributionSettingsData.enabled && this.iconColor == attributionSettingsData.iconColor && this.position == attributionSettingsData.position && Float.compare(this.marginLeft, attributionSettingsData.marginLeft) == 0 && Float.compare(this.marginTop, attributionSettingsData.marginTop) == 0 && Float.compare(this.marginRight, attributionSettingsData.marginRight) == 0 && Float.compare(this.marginBottom, attributionSettingsData.marginBottom) == 0 && this.clickable == attributionSettingsData.clickable;
    }

    public final boolean getClickable() {
        return this.clickable;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getIconColor() {
        return this.iconColor;
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

    public final int getPosition() {
        return this.position;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z14 = this.enabled;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int iD = f.d(this.marginBottom, f.d(this.marginRight, f.d(this.marginTop, f.d(this.marginLeft, q2.d(this.position, q2.d(this.iconColor, r14 * 31, 31), 31), 31), 31), 31), 31);
        boolean z15 = this.clickable;
        return iD + (z15 ? 1 : z15);
    }

    public final void setClickable(boolean z14) {
        this.clickable = z14;
    }

    public final void setEnabled(boolean z14) {
        this.enabled = z14;
    }

    public final void setIconColor(int i14) {
        this.iconColor = i14;
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

    public final void setPosition(int i14) {
        this.position = i14;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("AttributionSettingsData(enabled=");
        sb3.append(this.enabled);
        sb3.append(", iconColor=");
        sb3.append(this.iconColor);
        sb3.append(", position=");
        sb3.append(this.position);
        sb3.append(", marginLeft=");
        sb3.append(this.marginLeft);
        sb3.append(", marginTop=");
        sb3.append(this.marginTop);
        sb3.append(", marginRight=");
        sb3.append(this.marginRight);
        sb3.append(", marginBottom=");
        sb3.append(this.marginBottom);
        sb3.append(", clickable=");
        return j.t(sb3, this.clickable, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeInt(this.enabled ? 1 : 0);
        parcel.writeInt(this.iconColor);
        parcel.writeInt(this.position);
        parcel.writeFloat(this.marginLeft);
        parcel.writeFloat(this.marginTop);
        parcel.writeFloat(this.marginRight);
        parcel.writeFloat(this.marginBottom);
        parcel.writeInt(this.clickable ? 1 : 0);
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AttributionSettingsData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AttributionSettingsData createFromParcel(Parcel parcel) {
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
            int i15 = parcel.readInt();
            boolean z16 = z15;
            float f14 = parcel.readFloat();
            float f15 = parcel.readFloat();
            boolean z17 = z16;
            float f16 = parcel.readFloat();
            float f17 = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z17 = true;
            }
            return new AttributionSettingsData(z14, i14, i15, f14, f15, f16, f17, z17);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AttributionSettingsData[] newArray(int i14) {
            return new AttributionSettingsData[i14];
        }
    }
}
