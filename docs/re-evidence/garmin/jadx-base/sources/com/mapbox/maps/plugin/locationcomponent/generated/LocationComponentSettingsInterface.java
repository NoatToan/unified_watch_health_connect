package com.mapbox.maps.plugin.locationcomponent.generated;

import com.mapbox.maps.plugin.LocationPuck;
import com.mapbox.maps.plugin.PuckBearing;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0010\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0019\u001a\u00020\u00148&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001f\u001a\u00020\u001a8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\"\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR\u001c\u0010%\u001a\u00020\u00148&@&X¦\u000e¢\u0006\f\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001c\u0010(\u001a\u00020\u00148&@&X¦\u000e¢\u0006\f\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010\u0018R\u001e\u0010.\u001a\u0004\u0018\u00010)8&@&X¦\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001e\u00101\u001a\u0004\u0018\u00010)8&@&X¦\u000e¢\u0006\f\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\u001c\u00104\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b2\u0010\r\"\u0004\b3\u0010\u000fR\u001c\u0010:\u001a\u0002058&@&X¦\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001e\u0010=\u001a\u0004\u0018\u00010)8&@&X¦\u000e¢\u0006\f\u001a\u0004\b;\u0010+\"\u0004\b<\u0010-R\u001c\u0010C\u001a\u00020>8&@&X¦\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettingsInterface;", "", "Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings;", "getSettings", "()Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings;", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings$Builder;", "", "block", "updateSettings", "(Le23/l;)V", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "enabled", "getPulsingEnabled", "setPulsingEnabled", "pulsingEnabled", "", "getPulsingColor", "()I", "setPulsingColor", "(I)V", "pulsingColor", "", "getPulsingMaxRadius", "()F", "setPulsingMaxRadius", "(F)V", "pulsingMaxRadius", "getShowAccuracyRing", "setShowAccuracyRing", "showAccuracyRing", "getAccuracyRingColor", "setAccuracyRingColor", "accuracyRingColor", "getAccuracyRingBorderColor", "setAccuracyRingBorderColor", "accuracyRingBorderColor", "", "getLayerAbove", "()Ljava/lang/String;", "setLayerAbove", "(Ljava/lang/String;)V", "layerAbove", "getLayerBelow", "setLayerBelow", "layerBelow", "getPuckBearingEnabled", "setPuckBearingEnabled", "puckBearingEnabled", "Lcom/mapbox/maps/plugin/PuckBearing;", "getPuckBearing", "()Lcom/mapbox/maps/plugin/PuckBearing;", "setPuckBearing", "(Lcom/mapbox/maps/plugin/PuckBearing;)V", "puckBearing", "getSlot", "setSlot", "slot", "Lcom/mapbox/maps/plugin/LocationPuck;", "getLocationPuck", "()Lcom/mapbox/maps/plugin/LocationPuck;", "setLocationPuck", "(Lcom/mapbox/maps/plugin/LocationPuck;)V", "locationPuck", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface LocationComponentSettingsInterface {
    int getAccuracyRingBorderColor();

    int getAccuracyRingColor();

    boolean getEnabled();

    String getLayerAbove();

    String getLayerBelow();

    LocationPuck getLocationPuck();

    PuckBearing getPuckBearing();

    boolean getPuckBearingEnabled();

    int getPulsingColor();

    boolean getPulsingEnabled();

    float getPulsingMaxRadius();

    LocationComponentSettings getSettings();

    boolean getShowAccuracyRing();

    String getSlot();

    void setAccuracyRingBorderColor(int i14);

    void setAccuracyRingColor(int i14);

    void setEnabled(boolean z14);

    void setLayerAbove(String str);

    void setLayerBelow(String str);

    void setLocationPuck(LocationPuck locationPuck);

    void setPuckBearing(PuckBearing puckBearing);

    void setPuckBearingEnabled(boolean z14);

    void setPulsingColor(int i14);

    void setPulsingEnabled(boolean z14);

    void setPulsingMaxRadius(float f14);

    void setShowAccuracyRing(boolean z14);

    void setSlot(String str);

    void updateSettings(l<? super LocationComponentSettings.Builder, Unit> block);
}
