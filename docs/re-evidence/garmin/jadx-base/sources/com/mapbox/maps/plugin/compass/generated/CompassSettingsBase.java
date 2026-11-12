package com.mapbox.maps.plugin.compass.generated;

import com.mapbox.maps.ImageHolder;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H$¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u00020\u00068$@$X¤\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\u0010R$\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010'\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R$\u0010*\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R$\u0010-\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R$\u00100\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#R$\u00103\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b1\u0010!\"\u0004\b2\u0010#R$\u00106\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b4\u0010\u0015\"\u0004\b5\u0010\u0017R$\u00109\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b7\u0010\u0015\"\u0004\b8\u0010\u0017R$\u0010<\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b:\u0010\u0015\"\u0004\b;\u0010\u0017R(\u0010B\u001a\u0004\u0018\u00010=2\b\u0010\u0013\u001a\u0004\u0018\u00010=8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lcom/mapbox/maps/plugin/compass/generated/CompassSettingsBase;", "Lcom/mapbox/maps/plugin/compass/generated/CompassSettingsInterface;", "<init>", "()V", "", "applySettings", "Lcom/mapbox/maps/plugin/compass/generated/CompassSettings;", "getSettings", "()Lcom/mapbox/maps/plugin/compass/generated/CompassSettings;", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/compass/generated/CompassSettings$Builder;", "block", "updateSettings", "(Le23/l;)V", "getInternalSettings", "setInternalSettings", "(Lcom/mapbox/maps/plugin/compass/generated/CompassSettings;)V", "internalSettings", "", "value", "getEnabled", "()Z", "setEnabled", "(Z)V", "enabled", "", "getPosition", "()I", "setPosition", "(I)V", ModelSourceWrapper.POSITION, "", "getMarginLeft", "()F", "setMarginLeft", "(F)V", "marginLeft", "getMarginTop", "setMarginTop", "marginTop", "getMarginRight", "setMarginRight", "marginRight", "getMarginBottom", "setMarginBottom", "marginBottom", "getOpacity", "setOpacity", "opacity", "getRotation", "setRotation", "rotation", "getVisibility", "setVisibility", "visibility", "getFadeWhenFacingNorth", "setFadeWhenFacingNorth", "fadeWhenFacingNorth", "getClickable", "setClickable", "clickable", "Lcom/mapbox/maps/ImageHolder;", "getImage", "()Lcom/mapbox/maps/ImageHolder;", "setImage", "(Lcom/mapbox/maps/ImageHolder;)V", "image", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class CompassSettingsBase implements CompassSettingsInterface {
    public abstract void applySettings();

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public boolean getClickable() {
        return getInternalSettings().getClickable();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public boolean getEnabled() {
        return getInternalSettings().getEnabled();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public boolean getFadeWhenFacingNorth() {
        return getInternalSettings().getFadeWhenFacingNorth();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public ImageHolder getImage() {
        return getInternalSettings().getImage();
    }

    public abstract CompassSettings getInternalSettings();

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public float getMarginBottom() {
        return getInternalSettings().getMarginBottom();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public float getMarginLeft() {
        return getInternalSettings().getMarginLeft();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public float getMarginRight() {
        return getInternalSettings().getMarginRight();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public float getMarginTop() {
        return getInternalSettings().getMarginTop();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public float getOpacity() {
        return getInternalSettings().getOpacity();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public int getPosition() {
        return getInternalSettings().getPosition();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public float getRotation() {
        return getInternalSettings().getRotation();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public CompassSettings getSettings() {
        return getInternalSettings().toBuilder().build();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public boolean getVisibility() {
        return getInternalSettings().getVisibility();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public void setClickable(boolean z14) {
        if (getInternalSettings().getClickable() != z14) {
            setInternalSettings(getInternalSettings().toBuilder().setClickable(z14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public void setEnabled(boolean z14) {
        if (getInternalSettings().getEnabled() != z14) {
            setInternalSettings(getInternalSettings().toBuilder().setEnabled(z14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public void setFadeWhenFacingNorth(boolean z14) {
        if (getInternalSettings().getFadeWhenFacingNorth() != z14) {
            setInternalSettings(getInternalSettings().toBuilder().setFadeWhenFacingNorth(z14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public void setImage(ImageHolder imageHolder) {
        if (s.g(getInternalSettings().getImage(), imageHolder)) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setImage(imageHolder).build());
        applySettings();
    }

    public abstract void setInternalSettings(CompassSettings compassSettings);

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public void setMarginBottom(float f14) {
        if (getInternalSettings().getMarginBottom() == f14) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setMarginBottom(f14).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public void setMarginLeft(float f14) {
        if (getInternalSettings().getMarginLeft() == f14) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setMarginLeft(f14).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public void setMarginRight(float f14) {
        if (getInternalSettings().getMarginRight() == f14) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setMarginRight(f14).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public void setMarginTop(float f14) {
        if (getInternalSettings().getMarginTop() == f14) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setMarginTop(f14).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public void setOpacity(float f14) {
        if (getInternalSettings().getOpacity() == f14) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setOpacity(f14).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public void setPosition(int i14) {
        if (getInternalSettings().getPosition() != i14) {
            setInternalSettings(getInternalSettings().toBuilder().setPosition(i14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public void setRotation(float f14) {
        if (getInternalSettings().getRotation() == f14) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setRotation(f14).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public void setVisibility(boolean z14) {
        if (getInternalSettings().getVisibility() != z14) {
            setInternalSettings(getInternalSettings().toBuilder().setVisibility(z14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.compass.generated.CompassSettingsInterface
    public void updateSettings(l<? super CompassSettings.Builder, Unit> block) {
        block.getClass();
        CompassSettings.Builder builder = getInternalSettings().toBuilder();
        block.invoke(builder);
        setInternalSettings(builder.build());
        applySettings();
    }
}
