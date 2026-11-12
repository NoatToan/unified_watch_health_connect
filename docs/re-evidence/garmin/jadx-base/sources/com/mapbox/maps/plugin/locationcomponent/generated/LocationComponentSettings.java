package com.mapbox.maps.plugin.locationcomponent.generated;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.plugin.LocationPuck;
import com.mapbox.maps.plugin.PuckBearing;
import d53.n;
import java.util.Objects;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u00016Bu\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\t\u0010)\u001a\u00020\u0006HÖ\u0001J\u0013\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010,H\u0096\u0002J\b\u0010-\u001a\u00020\u0006H\u0016J\u0006\u0010.\u001a\u00020/J\b\u00100\u001a\u00020\rH\u0016J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001c¨\u00067"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings;", "Landroid/os/Parcelable;", "enabled", "", "pulsingEnabled", "pulsingColor", "", "pulsingMaxRadius", "", "showAccuracyRing", "accuracyRingColor", "accuracyRingBorderColor", "layerAbove", "", "layerBelow", "puckBearingEnabled", "puckBearing", "Lcom/mapbox/maps/plugin/PuckBearing;", "slot", "locationPuck", "Lcom/mapbox/maps/plugin/LocationPuck;", "(ZZIFZIILjava/lang/String;Ljava/lang/String;ZLcom/mapbox/maps/plugin/PuckBearing;Ljava/lang/String;Lcom/mapbox/maps/plugin/LocationPuck;)V", "getAccuracyRingBorderColor", "()I", "getAccuracyRingColor", "getEnabled", "()Z", "getLayerAbove", "()Ljava/lang/String;", "getLayerBelow", "getLocationPuck", "()Lcom/mapbox/maps/plugin/LocationPuck;", "getPuckBearing", "()Lcom/mapbox/maps/plugin/PuckBearing;", "getPuckBearingEnabled", "getPulsingColor", "getPulsingEnabled", "getPulsingMaxRadius", "()F", "getShowAccuracyRing", "getSlot", "describeContents", "equals", "other", "", "hashCode", "toBuilder", "Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings$Builder;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LocationComponentSettings implements Parcelable {
    public static final Parcelable.Creator<LocationComponentSettings> CREATOR = new Creator();
    private final int accuracyRingBorderColor;
    private final int accuracyRingColor;
    private final boolean enabled;
    private final String layerAbove;
    private final String layerBelow;
    private final LocationPuck locationPuck;
    private final PuckBearing puckBearing;
    private final boolean puckBearingEnabled;
    private final int pulsingColor;
    private final boolean pulsingEnabled;
    private final float pulsingMaxRadius;
    private final boolean showAccuracyRing;
    private final String slot;

    private LocationComponentSettings(boolean z14, boolean z15, int i14, float f14, boolean z16, int i15, int i16, String str, String str2, boolean z17, PuckBearing puckBearing, String str3, LocationPuck locationPuck) {
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

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!LocationComponentSettings.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        LocationComponentSettings locationComponentSettings = (LocationComponentSettings) other;
        return this.enabled == locationComponentSettings.enabled && this.pulsingEnabled == locationComponentSettings.pulsingEnabled && this.pulsingColor == locationComponentSettings.pulsingColor && Float.compare(this.pulsingMaxRadius, locationComponentSettings.pulsingMaxRadius) == 0 && this.showAccuracyRing == locationComponentSettings.showAccuracyRing && this.accuracyRingColor == locationComponentSettings.accuracyRingColor && this.accuracyRingBorderColor == locationComponentSettings.accuracyRingBorderColor && s.g(this.layerAbove, locationComponentSettings.layerAbove) && s.g(this.layerBelow, locationComponentSettings.layerBelow) && this.puckBearingEnabled == locationComponentSettings.puckBearingEnabled && this.puckBearing == locationComponentSettings.puckBearing && s.g(this.slot, locationComponentSettings.slot) && s.g(this.locationPuck, locationComponentSettings.locationPuck);
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

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.enabled), Boolean.valueOf(this.pulsingEnabled), Integer.valueOf(this.pulsingColor), Float.valueOf(this.pulsingMaxRadius), Boolean.valueOf(this.showAccuracyRing), Integer.valueOf(this.accuracyRingColor), Integer.valueOf(this.accuracyRingBorderColor), this.layerAbove, this.layerBelow, Boolean.valueOf(this.puckBearingEnabled), this.puckBearing, this.slot, this.locationPuck);
    }

    public final Builder toBuilder() {
        return new Builder(this.locationPuck).setEnabled(this.enabled).setPulsingEnabled(this.pulsingEnabled).setPulsingColor(this.pulsingColor).setPulsingMaxRadius(this.pulsingMaxRadius).setShowAccuracyRing(this.showAccuracyRing).setAccuracyRingColor(this.accuracyRingColor).setAccuracyRingBorderColor(this.accuracyRingBorderColor).setLayerAbove(this.layerAbove).setLayerBelow(this.layerBelow).setPuckBearingEnabled(this.puckBearingEnabled).setPuckBearing(this.puckBearing).setSlot(this.slot).setLocationPuck(this.locationPuck);
    }

    public String toString() {
        return n.c("LocationComponentSettings(enabled=" + this.enabled + ",\n      pulsingEnabled=" + this.pulsingEnabled + ", pulsingColor=" + this.pulsingColor + ",\n      pulsingMaxRadius=" + this.pulsingMaxRadius + ", showAccuracyRing=" + this.showAccuracyRing + ",\n      accuracyRingColor=" + this.accuracyRingColor + ", accuracyRingBorderColor=" + this.accuracyRingBorderColor + ",\n      layerAbove=" + this.layerAbove + ", layerBelow=" + this.layerBelow + ", puckBearingEnabled=" + this.puckBearingEnabled + ",\n      puckBearing=" + this.puckBearing + ", slot=" + this.slot + ", locationPuck=" + this.locationPuck + CoreConstants.RIGHT_PARENTHESIS_CHAR);
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

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010<\u001a\u00020=J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fJ\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u000fJ\u000e\u0010,\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0006J\u000e\u0010/\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u000fJ\u000e\u00104\u001a\u00020\u00002\u0006\u00101\u001a\u000200J\u000e\u00108\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u000fJ\u0010\u0010;\u001a\u00020\u00002\b\u00109\u001a\u0004\u0018\u00010\u0015R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0015@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0015@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u0004R$\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020!@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010'\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014R$\u0010*\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\t\"\u0004\b,\u0010\u000bR$\u0010-\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u0010\u0014R$\u00101\u001a\u0002002\u0006\u0010\u0005\u001a\u000200@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00106\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0012\"\u0004\b8\u0010\u0014R(\u00109\u001a\u0004\u0018\u00010\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0015@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0018\"\u0004\b;\u0010\u001a¨\u0006>"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings$Builder;", "", "locationPuck", "Lcom/mapbox/maps/plugin/LocationPuck;", "(Lcom/mapbox/maps/plugin/LocationPuck;)V", "<set-?>", "", "accuracyRingBorderColor", "getAccuracyRingBorderColor", "()I", "setAccuracyRingBorderColor", "(I)V", "accuracyRingColor", "getAccuracyRingColor", "setAccuracyRingColor", "", "enabled", "getEnabled", "()Z", "setEnabled", "(Z)V", "", "layerAbove", "getLayerAbove", "()Ljava/lang/String;", "setLayerAbove", "(Ljava/lang/String;)V", "layerBelow", "getLayerBelow", "setLayerBelow", "getLocationPuck", "()Lcom/mapbox/maps/plugin/LocationPuck;", "setLocationPuck", "Lcom/mapbox/maps/plugin/PuckBearing;", "puckBearing", "getPuckBearing", "()Lcom/mapbox/maps/plugin/PuckBearing;", "setPuckBearing", "(Lcom/mapbox/maps/plugin/PuckBearing;)V", "puckBearingEnabled", "getPuckBearingEnabled", "setPuckBearingEnabled", "pulsingColor", "getPulsingColor", "setPulsingColor", "pulsingEnabled", "getPulsingEnabled", "setPulsingEnabled", "", "pulsingMaxRadius", "getPulsingMaxRadius", "()F", "setPulsingMaxRadius", "(F)V", "showAccuracyRing", "getShowAccuracyRing", "setShowAccuracyRing", "slot", "getSlot", "setSlot", "build", "Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {
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

        public Builder(LocationPuck locationPuck) {
            locationPuck.getClass();
            this.locationPuck = locationPuck;
            this.pulsingColor = Color.parseColor("#4A90E2");
            this.pulsingMaxRadius = 10.0f;
            this.accuracyRingColor = Color.parseColor("#4d89cff0");
            this.accuracyRingBorderColor = Color.parseColor("#4d89cff0");
            this.puckBearing = PuckBearing.HEADING;
        }

        public final LocationComponentSettings build() {
            return new LocationComponentSettings(this.enabled, this.pulsingEnabled, this.pulsingColor, this.pulsingMaxRadius, this.showAccuracyRing, this.accuracyRingColor, this.accuracyRingBorderColor, this.layerAbove, this.layerBelow, this.puckBearingEnabled, this.puckBearing, this.slot, this.locationPuck, null);
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

        /* JADX INFO: renamed from: setAccuracyRingBorderColor, reason: collision with other method in class */
        public final /* synthetic */ void m279setAccuracyRingBorderColor(int i14) {
            this.accuracyRingBorderColor = i14;
        }

        /* JADX INFO: renamed from: setAccuracyRingColor, reason: collision with other method in class */
        public final /* synthetic */ void m280setAccuracyRingColor(int i14) {
            this.accuracyRingColor = i14;
        }

        /* JADX INFO: renamed from: setEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m281setEnabled(boolean z14) {
            this.enabled = z14;
        }

        /* JADX INFO: renamed from: setLayerAbove, reason: collision with other method in class */
        public final /* synthetic */ void m282setLayerAbove(String str) {
            this.layerAbove = str;
        }

        /* JADX INFO: renamed from: setLayerBelow, reason: collision with other method in class */
        public final /* synthetic */ void m283setLayerBelow(String str) {
            this.layerBelow = str;
        }

        /* JADX INFO: renamed from: setLocationPuck, reason: collision with other method in class */
        public final /* synthetic */ void m284setLocationPuck(LocationPuck locationPuck) {
            locationPuck.getClass();
            this.locationPuck = locationPuck;
        }

        /* JADX INFO: renamed from: setPuckBearing, reason: collision with other method in class */
        public final /* synthetic */ void m285setPuckBearing(PuckBearing puckBearing) {
            puckBearing.getClass();
            this.puckBearing = puckBearing;
        }

        /* JADX INFO: renamed from: setPuckBearingEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m286setPuckBearingEnabled(boolean z14) {
            this.puckBearingEnabled = z14;
        }

        /* JADX INFO: renamed from: setPulsingColor, reason: collision with other method in class */
        public final /* synthetic */ void m287setPulsingColor(int i14) {
            this.pulsingColor = i14;
        }

        /* JADX INFO: renamed from: setPulsingEnabled, reason: collision with other method in class */
        public final /* synthetic */ void m288setPulsingEnabled(boolean z14) {
            this.pulsingEnabled = z14;
        }

        /* JADX INFO: renamed from: setPulsingMaxRadius, reason: collision with other method in class */
        public final /* synthetic */ void m289setPulsingMaxRadius(float f14) {
            this.pulsingMaxRadius = f14;
        }

        /* JADX INFO: renamed from: setShowAccuracyRing, reason: collision with other method in class */
        public final /* synthetic */ void m290setShowAccuracyRing(boolean z14) {
            this.showAccuracyRing = z14;
        }

        /* JADX INFO: renamed from: setSlot, reason: collision with other method in class */
        public final /* synthetic */ void m291setSlot(String str) {
            this.slot = str;
        }

        public final Builder setAccuracyRingBorderColor(int accuracyRingBorderColor) {
            this.accuracyRingBorderColor = accuracyRingBorderColor;
            return this;
        }

        public final Builder setAccuracyRingColor(int accuracyRingColor) {
            this.accuracyRingColor = accuracyRingColor;
            return this;
        }

        public final Builder setEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public final Builder setLayerAbove(String layerAbove) {
            this.layerAbove = layerAbove;
            return this;
        }

        public final Builder setLayerBelow(String layerBelow) {
            this.layerBelow = layerBelow;
            return this;
        }

        public final Builder setPuckBearingEnabled(boolean puckBearingEnabled) {
            this.puckBearingEnabled = puckBearingEnabled;
            return this;
        }

        public final Builder setPulsingColor(int pulsingColor) {
            this.pulsingColor = pulsingColor;
            return this;
        }

        public final Builder setPulsingEnabled(boolean pulsingEnabled) {
            this.pulsingEnabled = pulsingEnabled;
            return this;
        }

        public final Builder setPulsingMaxRadius(float pulsingMaxRadius) {
            this.pulsingMaxRadius = pulsingMaxRadius;
            return this;
        }

        public final Builder setShowAccuracyRing(boolean showAccuracyRing) {
            this.showAccuracyRing = showAccuracyRing;
            return this;
        }

        public final Builder setSlot(String slot) {
            this.slot = slot;
            return this;
        }

        public final Builder setLocationPuck(LocationPuck locationPuck) {
            locationPuck.getClass();
            this.locationPuck = locationPuck;
            return this;
        }

        public final Builder setPuckBearing(PuckBearing puckBearing) {
            puckBearing.getClass();
            this.puckBearing = puckBearing;
            return this;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LocationComponentSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocationComponentSettings createFromParcel(Parcel parcel) {
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
            return new LocationComponentSettings(z17, z16, i14, f14, z14, i15, i16, string, string2, z19, PuckBearing.valueOf(parcel.readString()), parcel.readString(), (LocationPuck) parcel.readParcelable(LocationComponentSettings.class.getClassLoader()), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocationComponentSettings[] newArray(int i14) {
            return new LocationComponentSettings[i14];
        }
    }

    public /* synthetic */ LocationComponentSettings(boolean z14, boolean z15, int i14, float f14, boolean z16, int i15, int i16, String str, String str2, boolean z17, PuckBearing puckBearing, String str3, LocationPuck locationPuck, j jVar) {
        this(z14, z15, i14, f14, z16, i15, i16, str, str2, z17, puckBearing, str3, locationPuck);
    }
}
