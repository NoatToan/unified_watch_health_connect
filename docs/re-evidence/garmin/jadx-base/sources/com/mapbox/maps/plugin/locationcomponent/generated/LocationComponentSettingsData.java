package com.mapbox.maps.plugin.locationcomponent.generated;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.plugin.LocationPuck;
import com.mapbox.maps.plugin.PuckBearing;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import r1.q2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0011HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010@\u001a\u00020\u0014HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0006HÆ\u0003J\t\u0010C\u001a\u00020\bHÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0006HÆ\u0003J\t\u0010F\u001a\u00020\u0006HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0091\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001J\t\u0010J\u001a\u00020\u0006HÖ\u0001J\u0013\u0010K\u001a\u00020\u00032\b\u0010L\u001a\u0004\u0018\u00010MHÖ\u0003J\t\u0010N\u001a\u00020\u0006HÖ\u0001J\t\u0010O\u001a\u00020\rHÖ\u0001J\u0019\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0017\"\u0004\b1\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001d\"\u0004\b3\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001d\"\u0004\b9\u0010\u001fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010!\"\u0004\b;\u0010#¨\u0006U"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettingsData;", "Landroid/os/Parcelable;", "enabled", "", "pulsingEnabled", "pulsingColor", "", "pulsingMaxRadius", "", "showAccuracyRing", "accuracyRingColor", "accuracyRingBorderColor", "layerAbove", "", "layerBelow", "puckBearingEnabled", "puckBearing", "Lcom/mapbox/maps/plugin/PuckBearing;", "slot", "locationPuck", "Lcom/mapbox/maps/plugin/LocationPuck;", "(ZZIFZIILjava/lang/String;Ljava/lang/String;ZLcom/mapbox/maps/plugin/PuckBearing;Ljava/lang/String;Lcom/mapbox/maps/plugin/LocationPuck;)V", "getAccuracyRingBorderColor", "()I", "setAccuracyRingBorderColor", "(I)V", "getAccuracyRingColor", "setAccuracyRingColor", "getEnabled", "()Z", "setEnabled", "(Z)V", "getLayerAbove", "()Ljava/lang/String;", "setLayerAbove", "(Ljava/lang/String;)V", "getLayerBelow", "setLayerBelow", "getLocationPuck", "()Lcom/mapbox/maps/plugin/LocationPuck;", "setLocationPuck", "(Lcom/mapbox/maps/plugin/LocationPuck;)V", "getPuckBearing", "()Lcom/mapbox/maps/plugin/PuckBearing;", "setPuckBearing", "(Lcom/mapbox/maps/plugin/PuckBearing;)V", "getPuckBearingEnabled", "setPuckBearingEnabled", "getPulsingColor", "setPulsingColor", "getPulsingEnabled", "setPulsingEnabled", "getPulsingMaxRadius", "()F", "setPulsingMaxRadius", "(F)V", "getShowAccuracyRing", "setShowAccuracyRing", "getSlot", "setSlot", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
final /* data */ class LocationComponentSettingsData implements Parcelable {
    public static final Parcelable.Creator<LocationComponentSettingsData> CREATOR = new Creator();
    private int accuracyRingBorderColor;
    private int accuracyRingColor;
    private boolean enabled;
    private String layerAbove;
    private String layerBelow;
    private LocationPuck locationPuck;
    private PuckBearing puckBearing;
    private boolean puckBearingEnabled;
    private int pulsingColor;
    private boolean pulsingEnabled;
    private float pulsingMaxRadius;
    private boolean showAccuracyRing;
    private String slot;

    public /* synthetic */ LocationComponentSettingsData(boolean z14, boolean z15, int i14, float f14, boolean z16, int i15, int i16, String str, String str2, boolean z17, PuckBearing puckBearing, String str3, LocationPuck locationPuck, int i17, j jVar) {
        this(z14, z15, i14, f14, z16, i15, i16, (i17 & 128) != 0 ? null : str, (i17 & 256) != 0 ? null : str2, z17, puckBearing, (i17 & 2048) != 0 ? null : str3, locationPuck);
    }

    public static /* synthetic */ LocationComponentSettingsData copy$default(LocationComponentSettingsData locationComponentSettingsData, boolean z14, boolean z15, int i14, float f14, boolean z16, int i15, int i16, String str, String str2, boolean z17, PuckBearing puckBearing, String str3, LocationPuck locationPuck, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            z14 = locationComponentSettingsData.enabled;
        }
        return locationComponentSettingsData.copy(z14, (i17 & 2) != 0 ? locationComponentSettingsData.pulsingEnabled : z15, (i17 & 4) != 0 ? locationComponentSettingsData.pulsingColor : i14, (i17 & 8) != 0 ? locationComponentSettingsData.pulsingMaxRadius : f14, (i17 & 16) != 0 ? locationComponentSettingsData.showAccuracyRing : z16, (i17 & 32) != 0 ? locationComponentSettingsData.accuracyRingColor : i15, (i17 & 64) != 0 ? locationComponentSettingsData.accuracyRingBorderColor : i16, (i17 & 128) != 0 ? locationComponentSettingsData.layerAbove : str, (i17 & 256) != 0 ? locationComponentSettingsData.layerBelow : str2, (i17 & 512) != 0 ? locationComponentSettingsData.puckBearingEnabled : z17, (i17 & 1024) != 0 ? locationComponentSettingsData.puckBearing : puckBearing, (i17 & 2048) != 0 ? locationComponentSettingsData.slot : str3, (i17 & 4096) != 0 ? locationComponentSettingsData.locationPuck : locationPuck);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getPuckBearingEnabled() {
        return this.puckBearingEnabled;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final PuckBearing getPuckBearing() {
        return this.puckBearing;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSlot() {
        return this.slot;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final LocationPuck getLocationPuck() {
        return this.locationPuck;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getPulsingEnabled() {
        return this.pulsingEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPulsingColor() {
        return this.pulsingColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getPulsingMaxRadius() {
        return this.pulsingMaxRadius;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getShowAccuracyRing() {
        return this.showAccuracyRing;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getAccuracyRingColor() {
        return this.accuracyRingColor;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getAccuracyRingBorderColor() {
        return this.accuracyRingBorderColor;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLayerAbove() {
        return this.layerAbove;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLayerBelow() {
        return this.layerBelow;
    }

    public final LocationComponentSettingsData copy(boolean enabled, boolean pulsingEnabled, int pulsingColor, float pulsingMaxRadius, boolean showAccuracyRing, int accuracyRingColor, int accuracyRingBorderColor, String layerAbove, String layerBelow, boolean puckBearingEnabled, PuckBearing puckBearing, String slot, LocationPuck locationPuck) {
        puckBearing.getClass();
        locationPuck.getClass();
        return new LocationComponentSettingsData(enabled, pulsingEnabled, pulsingColor, pulsingMaxRadius, showAccuracyRing, accuracyRingColor, accuracyRingBorderColor, layerAbove, layerBelow, puckBearingEnabled, puckBearing, slot, locationPuck);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationComponentSettingsData)) {
            return false;
        }
        LocationComponentSettingsData locationComponentSettingsData = (LocationComponentSettingsData) other;
        return this.enabled == locationComponentSettingsData.enabled && this.pulsingEnabled == locationComponentSettingsData.pulsingEnabled && this.pulsingColor == locationComponentSettingsData.pulsingColor && Float.compare(this.pulsingMaxRadius, locationComponentSettingsData.pulsingMaxRadius) == 0 && this.showAccuracyRing == locationComponentSettingsData.showAccuracyRing && this.accuracyRingColor == locationComponentSettingsData.accuracyRingColor && this.accuracyRingBorderColor == locationComponentSettingsData.accuracyRingBorderColor && s.g(this.layerAbove, locationComponentSettingsData.layerAbove) && s.g(this.layerBelow, locationComponentSettingsData.layerBelow) && this.puckBearingEnabled == locationComponentSettingsData.puckBearingEnabled && this.puckBearing == locationComponentSettingsData.puckBearing && s.g(this.slot, locationComponentSettingsData.slot) && s.g(this.locationPuck, locationComponentSettingsData.locationPuck);
    }

    public final int getAccuracyRingBorderColor() {
        return this.accuracyRingBorderColor;
    }

    public final int getAccuracyRingColor() {
        return this.accuracyRingColor;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getLayerAbove() {
        return this.layerAbove;
    }

    public final String getLayerBelow() {
        return this.layerBelow;
    }

    public final LocationPuck getLocationPuck() {
        return this.locationPuck;
    }

    public final PuckBearing getPuckBearing() {
        return this.puckBearing;
    }

    public final boolean getPuckBearingEnabled() {
        return this.puckBearingEnabled;
    }

    public final int getPulsingColor() {
        return this.pulsingColor;
    }

    public final boolean getPulsingEnabled() {
        return this.pulsingEnabled;
    }

    public final float getPulsingMaxRadius() {
        return this.pulsingMaxRadius;
    }

    public final boolean getShowAccuracyRing() {
        return this.showAccuracyRing;
    }

    public final String getSlot() {
        return this.slot;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v5, types: [int] */
    public int hashCode() {
        boolean z14 = this.enabled;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int i14 = r14 * 31;
        boolean z15 = this.pulsingEnabled;
        ?? r15 = z15;
        if (z15) {
            r15 = 1;
        }
        int iD = f.d(this.pulsingMaxRadius, q2.d(this.pulsingColor, (i14 + r15) * 31, 31), 31);
        boolean z16 = this.showAccuracyRing;
        ?? r16 = z16;
        if (z16) {
            r16 = 1;
        }
        int iD2 = q2.d(this.accuracyRingBorderColor, q2.d(this.accuracyRingColor, (iD + r16) * 31, 31), 31);
        String str = this.layerAbove;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.layerBelow;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z17 = this.puckBearingEnabled;
        int iHashCode3 = (this.puckBearing.hashCode() + ((iHashCode2 + (z17 ? 1 : z17)) * 31)) * 31;
        String str3 = this.slot;
        return this.locationPuck.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final void setAccuracyRingBorderColor(int i14) {
        this.accuracyRingBorderColor = i14;
    }

    public final void setAccuracyRingColor(int i14) {
        this.accuracyRingColor = i14;
    }

    public final void setEnabled(boolean z14) {
        this.enabled = z14;
    }

    public final void setLayerAbove(String str) {
        this.layerAbove = str;
    }

    public final void setLayerBelow(String str) {
        this.layerBelow = str;
    }

    public final void setLocationPuck(LocationPuck locationPuck) {
        locationPuck.getClass();
        this.locationPuck = locationPuck;
    }

    public final void setPuckBearing(PuckBearing puckBearing) {
        puckBearing.getClass();
        this.puckBearing = puckBearing;
    }

    public final void setPuckBearingEnabled(boolean z14) {
        this.puckBearingEnabled = z14;
    }

    public final void setPulsingColor(int i14) {
        this.pulsingColor = i14;
    }

    public final void setPulsingEnabled(boolean z14) {
        this.pulsingEnabled = z14;
    }

    public final void setPulsingMaxRadius(float f14) {
        this.pulsingMaxRadius = f14;
    }

    public final void setShowAccuracyRing(boolean z14) {
        this.showAccuracyRing = z14;
    }

    public final void setSlot(String str) {
        this.slot = str;
    }

    public String toString() {
        return "LocationComponentSettingsData(enabled=" + this.enabled + ", pulsingEnabled=" + this.pulsingEnabled + ", pulsingColor=" + this.pulsingColor + ", pulsingMaxRadius=" + this.pulsingMaxRadius + ", showAccuracyRing=" + this.showAccuracyRing + ", accuracyRingColor=" + this.accuracyRingColor + ", accuracyRingBorderColor=" + this.accuracyRingBorderColor + ", layerAbove=" + this.layerAbove + ", layerBelow=" + this.layerBelow + ", puckBearingEnabled=" + this.puckBearingEnabled + ", puckBearing=" + this.puckBearing + ", slot=" + this.slot + ", locationPuck=" + this.locationPuck + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeInt(this.enabled ? 1 : 0);
        parcel.writeInt(this.pulsingEnabled ? 1 : 0);
        parcel.writeInt(this.pulsingColor);
        parcel.writeFloat(this.pulsingMaxRadius);
        parcel.writeInt(this.showAccuracyRing ? 1 : 0);
        parcel.writeInt(this.accuracyRingColor);
        parcel.writeInt(this.accuracyRingBorderColor);
        parcel.writeString(this.layerAbove);
        parcel.writeString(this.layerBelow);
        parcel.writeInt(this.puckBearingEnabled ? 1 : 0);
        parcel.writeString(this.puckBearing.name());
        parcel.writeString(this.slot);
        parcel.writeParcelable(this.locationPuck, flags);
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LocationComponentSettingsData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocationComponentSettingsData createFromParcel(Parcel parcel) {
            boolean z14;
            boolean z15;
            parcel.getClass();
            boolean z16 = false;
            boolean z17 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z16 = true;
                z14 = true;
            } else {
                z14 = true;
            }
            int i14 = parcel.readInt();
            float f14 = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z15 = false;
            } else {
                z14 = false;
                z15 = false;
            }
            int i15 = parcel.readInt();
            boolean z18 = z14;
            int i16 = parcel.readInt();
            boolean z19 = z15;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z19 = z18;
            }
            return new LocationComponentSettingsData(z17, z16, i14, f14, z14, i15, i16, string, string2, z19, PuckBearing.valueOf(parcel.readString()), parcel.readString(), (LocationPuck) parcel.readParcelable(LocationComponentSettingsData.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocationComponentSettingsData[] newArray(int i14) {
            return new LocationComponentSettingsData[i14];
        }
    }

    public LocationComponentSettingsData(boolean z14, boolean z15, int i14, float f14, boolean z16, int i15, int i16, String str, String str2, boolean z17, PuckBearing puckBearing, String str3, LocationPuck locationPuck) {
        puckBearing.getClass();
        locationPuck.getClass();
        this.enabled = z14;
        this.pulsingEnabled = z15;
        this.pulsingColor = i14;
        this.pulsingMaxRadius = f14;
        this.showAccuracyRing = z16;
        this.accuracyRingColor = i15;
        this.accuracyRingBorderColor = i16;
        this.layerAbove = str;
        this.layerBelow = str2;
        this.puckBearingEnabled = z17;
        this.puckBearing = puckBearing;
        this.slot = str3;
        this.locationPuck = locationPuck;
    }
}
