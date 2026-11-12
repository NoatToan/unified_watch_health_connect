package com.mapbox.maps.module.telemetry;

import am.j;
import android.annotation.SuppressLint;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0001\u0018\u0000 +2\u00020\u0001:\u0001+B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010%\u001a\u00020\u00152\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020\u0003H\u0016J\b\u0010)\u001a\u00020\fH\u0016J\b\u0010*\u001a\u00020\u0003H\u0016R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0016\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011R\u0016\u0010\u001e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\nR\u0016\u0010 \u001a\u00020\u00038\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0011R\u0016\u0010\"\u001a\u00020\u00038\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0011R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0011¨\u0006,"}, d2 = {"Lcom/mapbox/maps/module/telemetry/MapLoadEvent;", "Lcom/mapbox/maps/module/telemetry/MapBaseEvent;", "userId", "", "phoneState", "Lcom/mapbox/maps/module/telemetry/PhoneState;", "(Ljava/lang/String;Lcom/mapbox/maps/module/telemetry/PhoneState;)V", "accessibilityFontScale", "", "getAccessibilityFontScale", "()F", "batteryLevel", "", "getBatteryLevel", "()I", "carrier", "getCarrier", "()Ljava/lang/String;", "cellularNetworkType", "getCellularNetworkType", "isPluggedIn", "", "()Z", "isWifi", ModelSourceWrapper.TYPE, "getModel", "operatingSystem", "getOperatingSystem", ModelSourceWrapper.ORIENTATION, "getOrientation", "resolution", "getResolution", "sdkIdentifier", "getSdkIdentifier", RemoteConfigConstants.RequestFieldKey.SDK_VERSION, "getSdkVersion", "getUserId", "equals", "other", "", "getEventName", "hashCode", "toString", "Companion", "module-telemetry_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@SuppressLint({"ParcelCreator"})
public final class MapLoadEvent extends MapBaseEvent {
    private static final String EVENT_NAME = "map.load";

    @SerializedName("accessibilityFontScale")
    private final float accessibilityFontScale;

    @SerializedName("batteryLevel")
    private final int batteryLevel;

    @SerializedName("carrier")
    private final String carrier;

    @SerializedName("cellularNetworkType")
    private final String cellularNetworkType;

    @SerializedName("pluggedIn")
    private final boolean isPluggedIn;

    @SerializedName("wifi")
    private final boolean isWifi;

    @SerializedName(ModelSourceWrapper.TYPE)
    private final String model;

    @SerializedName("operatingSystem")
    private final String operatingSystem;

    @SerializedName(ModelSourceWrapper.ORIENTATION)
    private final String orientation;

    @SerializedName("resolution")
    private final float resolution;

    @SerializedName("sdkIdentifier")
    private final String sdkIdentifier;

    @SerializedName(RemoteConfigConstants.RequestFieldKey.SDK_VERSION)
    private final String sdkVersion;

    @SerializedName("userId")
    private final String userId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapLoadEvent(String str, PhoneState phoneState) {
        super(phoneState);
        phoneState.getClass();
        this.userId = str;
        this.operatingSystem = "Android - " + Build.VERSION.RELEASE;
        this.sdkIdentifier = com.mapbox.maps.base.BuildConfig.MAPBOX_SDK_IDENTIFIER;
        this.sdkVersion = com.mapbox.maps.base.BuildConfig.MAPBOX_SDK_VERSION;
        String str2 = Build.MODEL;
        str2.getClass();
        this.model = str2;
        this.carrier = phoneState.getCarrier();
        this.cellularNetworkType = phoneState.getCellularNetworkType();
        this.orientation = phoneState.getOrientation().getOrientation();
        this.resolution = phoneState.getResolution();
        this.accessibilityFontScale = phoneState.getAccessibilityFontScale();
        this.batteryLevel = phoneState.getBatteryLevel();
        this.isPluggedIn = phoneState.getIsPluggedIn();
        this.isWifi = phoneState.getIsWifi();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !MapLoadEvent.class.equals(other.getClass())) {
            return false;
        }
        MapLoadEvent mapLoadEvent = (MapLoadEvent) other;
        if (s.g(getEvent(), mapLoadEvent.getEvent()) && s.g(getCreated(), mapLoadEvent.getCreated()) && Float.compare(mapLoadEvent.resolution, this.resolution) == 0 && Float.compare(mapLoadEvent.accessibilityFontScale, this.accessibilityFontScale) == 0 && this.batteryLevel == mapLoadEvent.batteryLevel && this.isPluggedIn == mapLoadEvent.isPluggedIn && this.isWifi == mapLoadEvent.isWifi && s.g(this.operatingSystem, mapLoadEvent.operatingSystem) && s.g(this.sdkIdentifier, mapLoadEvent.sdkIdentifier) && s.g(this.sdkVersion, mapLoadEvent.sdkVersion) && s.g(this.model, mapLoadEvent.model) && s.g(this.userId, mapLoadEvent.userId) && s.g(this.carrier, mapLoadEvent.carrier) && s.g(this.cellularNetworkType, mapLoadEvent.cellularNetworkType)) {
            return s.g(this.orientation, mapLoadEvent.orientation);
        }
        return false;
    }

    public final float getAccessibilityFontScale() {
        return this.accessibilityFontScale;
    }

    public final int getBatteryLevel() {
        return this.batteryLevel;
    }

    public final String getCarrier() {
        return this.carrier;
    }

    public final String getCellularNetworkType() {
        return this.cellularNetworkType;
    }

    @Override // com.mapbox.maps.module.telemetry.MapBaseEvent
    public String getEventName() {
        return EVENT_NAME;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOperatingSystem() {
        return this.operatingSystem;
    }

    public final String getOrientation() {
        return this.orientation;
    }

    public final float getResolution() {
        return this.resolution;
    }

    public final String getSdkIdentifier() {
        return this.sdkIdentifier;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.operatingSystem;
        int iJ = g.j(g.j(g.j((getCreated().hashCode() + ((getEvent().hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31)) * 31, 31, this.sdkIdentifier), 31, this.sdkVersion), 31, this.model);
        String str2 = this.userId;
        int iHashCode = (iJ + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.carrier;
        int iHashCode2 = (iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.cellularNetworkType;
        int iJ2 = g.j((iHashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.orientation);
        float f14 = this.resolution;
        int iFloatToIntBits = (iJ2 + (f14 == 0.0f ? 0 : Float.floatToIntBits(f14))) * 31;
        float f15 = this.accessibilityFontScale;
        return ((((((iFloatToIntBits + (f15 != 0.0f ? Float.floatToIntBits(f15) : 0)) * 31) + this.batteryLevel) * 31) + (this.isPluggedIn ? 1 : 0)) * 31) + (this.isWifi ? 1 : 0);
    }

    /* JADX INFO: renamed from: isPluggedIn, reason: from getter */
    public final boolean getIsPluggedIn() {
        return this.isPluggedIn;
    }

    /* JADX INFO: renamed from: isWifi, reason: from getter */
    public final boolean getIsWifi() {
        return this.isWifi;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("MapLoadEvent{, operatingSystem='");
        sb3.append(this.operatingSystem);
        sb3.append("', sdkIdentifier='");
        sb3.append(this.sdkIdentifier);
        sb3.append("', sdkVersion='");
        sb3.append(this.sdkVersion);
        sb3.append("', model='");
        sb3.append(this.model);
        sb3.append("', userId='");
        sb3.append(this.userId);
        sb3.append("', carrier='");
        sb3.append(this.carrier);
        sb3.append("', cellularNetworkType='");
        sb3.append(this.cellularNetworkType);
        sb3.append("', orientation='");
        sb3.append(this.orientation);
        sb3.append("', resolution=");
        sb3.append(this.resolution);
        sb3.append(", accessibilityFontScale=");
        sb3.append(this.accessibilityFontScale);
        sb3.append(", batteryLevel=");
        sb3.append(this.batteryLevel);
        sb3.append(", pluggedIn=");
        sb3.append(this.isPluggedIn);
        sb3.append(", wifi=");
        return j.t(sb3, this.isWifi, CoreConstants.CURLY_RIGHT);
    }
}
