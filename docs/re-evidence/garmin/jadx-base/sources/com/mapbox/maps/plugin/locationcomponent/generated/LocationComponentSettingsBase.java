package com.mapbox.maps.plugin.locationcomponent.generated;

import com.mapbox.maps.plugin.LocationPuck;
import com.mapbox.maps.plugin.PuckBearing;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H$¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u00020\u00068$@$X¤\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\u0010R$\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R$\u0010!\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u001c8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010'\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010*\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R$\u0010-\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u001c8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 R$\u00100\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u001c8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b.\u0010\u001e\"\u0004\b/\u0010 R(\u00106\u001a\u0004\u0018\u0001012\b\u0010\u0013\u001a\u0004\u0018\u0001018V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R(\u00109\u001a\u0004\u0018\u0001012\b\u0010\u0013\u001a\u0004\u0018\u0001018V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b7\u00103\"\u0004\b8\u00105R$\u0010<\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b:\u0010\u0015\"\u0004\b;\u0010\u0017R$\u0010B\u001a\u00020=2\u0006\u0010\u0013\u001a\u00020=8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR(\u0010E\u001a\u0004\u0018\u0001012\b\u0010\u0013\u001a\u0004\u0018\u0001018V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bC\u00103\"\u0004\bD\u00105R$\u0010K\u001a\u00020F2\u0006\u0010\u0013\u001a\u00020F8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006L"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettingsBase;", "Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettingsInterface;", "<init>", "()V", "", "applySettings", "Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings;", "getSettings", "()Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings;", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings$Builder;", "block", "updateSettings", "(Le23/l;)V", "getInternalSettings", "setInternalSettings", "(Lcom/mapbox/maps/plugin/locationcomponent/generated/LocationComponentSettings;)V", "internalSettings", "", "value", "getEnabled", "()Z", "setEnabled", "(Z)V", "enabled", "getPulsingEnabled", "setPulsingEnabled", "pulsingEnabled", "", "getPulsingColor", "()I", "setPulsingColor", "(I)V", "pulsingColor", "", "getPulsingMaxRadius", "()F", "setPulsingMaxRadius", "(F)V", "pulsingMaxRadius", "getShowAccuracyRing", "setShowAccuracyRing", "showAccuracyRing", "getAccuracyRingColor", "setAccuracyRingColor", "accuracyRingColor", "getAccuracyRingBorderColor", "setAccuracyRingBorderColor", "accuracyRingBorderColor", "", "getLayerAbove", "()Ljava/lang/String;", "setLayerAbove", "(Ljava/lang/String;)V", "layerAbove", "getLayerBelow", "setLayerBelow", "layerBelow", "getPuckBearingEnabled", "setPuckBearingEnabled", "puckBearingEnabled", "Lcom/mapbox/maps/plugin/PuckBearing;", "getPuckBearing", "()Lcom/mapbox/maps/plugin/PuckBearing;", "setPuckBearing", "(Lcom/mapbox/maps/plugin/PuckBearing;)V", "puckBearing", "getSlot", "setSlot", "slot", "Lcom/mapbox/maps/plugin/LocationPuck;", "getLocationPuck", "()Lcom/mapbox/maps/plugin/LocationPuck;", "setLocationPuck", "(Lcom/mapbox/maps/plugin/LocationPuck;)V", "locationPuck", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class LocationComponentSettingsBase implements LocationComponentSettingsInterface {
    public abstract void applySettings();

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsInterface
    public int getAccuracyRingBorderColor() {
        return getInternalSettings().getAccuracyRingBorderColor();
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsInterface
    public int getAccuracyRingColor() {
        return getInternalSettings().getAccuracyRingColor();
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsInterface
    public boolean getEnabled() {
        return getInternalSettings().getEnabled();
    }

    public abstract LocationComponentSettings getInternalSettings();

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsInterface
    public String getLayerAbove() {
        return getInternalSettings().getLayerAbove();
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsInterface
    public String getLayerBelow() {
        return getInternalSettings().getLayerBelow();
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsInterface
    public LocationPuck getLocationPuck() {
        return getInternalSettings().getLocationPuck();
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsInterface
    public PuckBearing getPuckBearing() {
        return getInternalSettings().getPuckBearing();
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsInterface
    public boolean getPuckBearingEnabled() {
        return getInternalSettings().getPuckBearingEnabled();
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsInterface
    public int getPulsingColor() {
        return getInternalSettings().getPulsingColor();
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsInterface
    public boolean getPulsingEnabled() {
        return getInternalSettings().getPulsingEnabled();
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsInterface
    public float getPulsingMaxRadius() {
        return getInternalSettings().getPulsingMaxRadius();
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsInterface
    public LocationComponentSettings getSettings() {
        return getInternalSettings().toBuilder().build();
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsInterface
    public boolean getShowAccuracyRing() {
        return getInternalSettings().getShowAccuracyRing();
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsInterface
    public String getSlot() {
        return getInternalSettings().getSlot();
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsInterface
    public void setAccuracyRingBorderColor(int i14) {
        if (getInternalSettings().getAccuracyRingBorderColor() != i14) {
            setInternalSettings(getInternalSettings().toBuilder().setAccuracyRingBorderColor(i14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsInterface
    public void setAccuracyRingColor(int i14) {
        if (getInternalSettings().getAccuracyRingColor() != i14) {
            setInternalSettings(getInternalSettings().toBuilder().setAccuracyRingColor(i14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsInterface
    public void setEnabled(boolean z14) {
        if (getInternalSettings().getEnabled() != z14) {
            setInternalSettings(getInternalSettings().toBuilder().setEnabled(z14).build());
            applySettings();
        }
    }

    public abstract void setInternalSettings(LocationComponentSettings locationComponentSettings);

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsInterface
    public void setLayerAbove(String str) {
        if (s.g(getInternalSettings().getLayerAbove(), str)) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setLayerAbove(str).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsInterface
    public void setLayerBelow(String str) {
        if (s.g(getInternalSettings().getLayerBelow(), str)) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setLayerBelow(str).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsInterface
    public void setLocationPuck(LocationPuck locationPuck) {
        locationPuck.getClass();
        if (s.g(getInternalSettings().getLocationPuck(), locationPuck)) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setLocationPuck(locationPuck).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsInterface
    public void setPuckBearing(PuckBearing puckBearing) {
        puckBearing.getClass();
        if (getInternalSettings().getPuckBearing() != puckBearing) {
            setInternalSettings(getInternalSettings().toBuilder().setPuckBearing(puckBearing).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsInterface
    public void setPuckBearingEnabled(boolean z14) {
        if (getInternalSettings().getPuckBearingEnabled() != z14) {
            setInternalSettings(getInternalSettings().toBuilder().setPuckBearingEnabled(z14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsInterface
    public void setPulsingColor(int i14) {
        if (getInternalSettings().getPulsingColor() != i14) {
            setInternalSettings(getInternalSettings().toBuilder().setPulsingColor(i14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsInterface
    public void setPulsingEnabled(boolean z14) {
        if (getInternalSettings().getPulsingEnabled() != z14) {
            setInternalSettings(getInternalSettings().toBuilder().setPulsingEnabled(z14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsInterface
    public void setPulsingMaxRadius(float f14) {
        if (getInternalSettings().getPulsingMaxRadius() == f14) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setPulsingMaxRadius(f14).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsInterface
    public void setShowAccuracyRing(boolean z14) {
        if (getInternalSettings().getShowAccuracyRing() != z14) {
            setInternalSettings(getInternalSettings().toBuilder().setShowAccuracyRing(z14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsInterface
    public void setSlot(String str) {
        if (s.g(getInternalSettings().getSlot(), str)) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setSlot(str).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettingsInterface
    public void updateSettings(l<? super LocationComponentSettings.Builder, Unit> block) {
        block.getClass();
        LocationComponentSettings.Builder builder = getInternalSettings().toBuilder();
        block.invoke(builder);
        setInternalSettings(builder.build());
        applySettings();
    }
}
