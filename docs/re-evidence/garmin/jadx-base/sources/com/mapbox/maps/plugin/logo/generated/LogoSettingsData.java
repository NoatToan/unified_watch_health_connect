package com.mapbox.maps.plugin.logo.generated;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;
import q6.f;
import r1.q2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003JE\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\u0013\u0010&\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001J\u0019\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u00061"}, d2 = {"Lcom/mapbox/maps/plugin/logo/generated/LogoSettingsData;", "Landroid/os/Parcelable;", "enabled", "", ModelSourceWrapper.POSITION, "", "marginLeft", "", "marginTop", "marginRight", "marginBottom", "(ZIFFFF)V", "getEnabled", "()Z", "setEnabled", "(Z)V", "getMarginBottom", "()F", "setMarginBottom", "(F)V", "getMarginLeft", "setMarginLeft", "getMarginRight", "setMarginRight", "getMarginTop", "setMarginTop", "getPosition", "()I", "setPosition", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
final /* data */ class LogoSettingsData implements Parcelable {
    public static final Parcelable.Creator<LogoSettingsData> CREATOR = new Creator();
    private boolean enabled;
    private float marginBottom;
    private float marginLeft;
    private float marginRight;
    private float marginTop;
    private int position;

    public LogoSettingsData(boolean z14, int i14, float f14, float f15, float f16, float f17) {
        this.enabled = z14;
        this.position = i14;
        this.marginLeft = f14;
        this.marginTop = f15;
        this.marginRight = f16;
        this.marginBottom = f17;
    }

    public static /* synthetic */ LogoSettingsData copy$default(LogoSettingsData logoSettingsData, boolean z14, int i14, float f14, float f15, float f16, float f17, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z14 = logoSettingsData.enabled;
        }
        if ((i15 & 2) != 0) {
            i14 = logoSettingsData.position;
        }
        if ((i15 & 4) != 0) {
            f14 = logoSettingsData.marginLeft;
        }
        if ((i15 & 8) != 0) {
            f15 = logoSettingsData.marginTop;
        }
        if ((i15 & 16) != 0) {
            f16 = logoSettingsData.marginRight;
        }
        if ((i15 & 32) != 0) {
            f17 = logoSettingsData.marginBottom;
        }
        float f18 = f16;
        float f19 = f17;
        return logoSettingsData.copy(z14, i14, f14, f15, f18, f19);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
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

    public final LogoSettingsData copy(boolean enabled, int position, float marginLeft, float marginTop, float marginRight, float marginBottom) {
        return new LogoSettingsData(enabled, position, marginLeft, marginTop, marginRight, marginBottom);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogoSettingsData)) {
            return false;
        }
        LogoSettingsData logoSettingsData = (LogoSettingsData) other;
        return this.enabled == logoSettingsData.enabled && this.position == logoSettingsData.position && Float.compare(this.marginLeft, logoSettingsData.marginLeft) == 0 && Float.compare(this.marginTop, logoSettingsData.marginTop) == 0 && Float.compare(this.marginRight, logoSettingsData.marginRight) == 0 && Float.compare(this.marginBottom, logoSettingsData.marginBottom) == 0;
    }

    public final boolean getEnabled() {
        return this.enabled;
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
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public int hashCode() {
        boolean z14 = this.enabled;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        return Float.hashCode(this.marginBottom) + f.d(this.marginRight, f.d(this.marginTop, f.d(this.marginLeft, q2.d(this.position, r14 * 31, 31), 31), 31), 31);
    }

    public final void setEnabled(boolean z14) {
        this.enabled = z14;
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
        StringBuilder sb3 = new StringBuilder("LogoSettingsData(enabled=");
        sb3.append(this.enabled);
        sb3.append(", position=");
        sb3.append(this.position);
        sb3.append(", marginLeft=");
        sb3.append(this.marginLeft);
        sb3.append(", marginTop=");
        sb3.append(this.marginTop);
        sb3.append(", marginRight=");
        sb3.append(this.marginRight);
        sb3.append(", marginBottom=");
        return f.p(sb3, this.marginBottom, CoreConstants.RIGHT_PARENTHESIS_CHAR);
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
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LogoSettingsData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LogoSettingsData createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new LogoSettingsData(parcel.readInt() != 0, parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LogoSettingsData[] newArray(int i14) {
            return new LogoSettingsData[i14];
        }
    }
}
