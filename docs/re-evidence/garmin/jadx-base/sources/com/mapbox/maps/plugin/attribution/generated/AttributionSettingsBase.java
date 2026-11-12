package com.mapbox.maps.plugin.attribution.generated;

import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0012\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H$¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u00020\u00068$@$X¤\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\u0010R$\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010!\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR$\u0010'\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010*\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R$\u0010-\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R$\u00100\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b.\u0010$\"\u0004\b/\u0010&R$\u00103\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b1\u0010\u0015\"\u0004\b2\u0010\u0017¨\u00064"}, d2 = {"Lcom/mapbox/maps/plugin/attribution/generated/AttributionSettingsBase;", "Lcom/mapbox/maps/plugin/attribution/generated/AttributionSettingsInterface;", "<init>", "()V", "", "applySettings", "Lcom/mapbox/maps/plugin/attribution/generated/AttributionSettings;", "getSettings", "()Lcom/mapbox/maps/plugin/attribution/generated/AttributionSettings;", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/attribution/generated/AttributionSettings$Builder;", "block", "updateSettings", "(Le23/l;)V", "getInternalSettings", "setInternalSettings", "(Lcom/mapbox/maps/plugin/attribution/generated/AttributionSettings;)V", "internalSettings", "", "value", "getEnabled", "()Z", "setEnabled", "(Z)V", "enabled", "", "getIconColor", "()I", "setIconColor", "(I)V", "iconColor", "getPosition", "setPosition", ModelSourceWrapper.POSITION, "", "getMarginLeft", "()F", "setMarginLeft", "(F)V", "marginLeft", "getMarginTop", "setMarginTop", "marginTop", "getMarginRight", "setMarginRight", "marginRight", "getMarginBottom", "setMarginBottom", "marginBottom", "getClickable", "setClickable", "clickable", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class AttributionSettingsBase implements AttributionSettingsInterface {
    public abstract void applySettings();

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public boolean getClickable() {
        return getInternalSettings().getClickable();
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public boolean getEnabled() {
        return getInternalSettings().getEnabled();
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public int getIconColor() {
        return getInternalSettings().getIconColor();
    }

    public abstract AttributionSettings getInternalSettings();

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public float getMarginBottom() {
        return getInternalSettings().getMarginBottom();
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public float getMarginLeft() {
        return getInternalSettings().getMarginLeft();
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public float getMarginRight() {
        return getInternalSettings().getMarginRight();
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public float getMarginTop() {
        return getInternalSettings().getMarginTop();
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public int getPosition() {
        return getInternalSettings().getPosition();
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public AttributionSettings getSettings() {
        return getInternalSettings().toBuilder().build();
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public void setClickable(boolean z14) {
        if (getInternalSettings().getClickable() != z14) {
            setInternalSettings(getInternalSettings().toBuilder().setClickable(z14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public void setEnabled(boolean z14) {
        if (getInternalSettings().getEnabled() != z14) {
            setInternalSettings(getInternalSettings().toBuilder().setEnabled(z14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public void setIconColor(int i14) {
        if (getInternalSettings().getIconColor() != i14) {
            setInternalSettings(getInternalSettings().toBuilder().setIconColor(i14).build());
            applySettings();
        }
    }

    public abstract void setInternalSettings(AttributionSettings attributionSettings);

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public void setMarginBottom(float f14) {
        if (getInternalSettings().getMarginBottom() == f14) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setMarginBottom(f14).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public void setMarginLeft(float f14) {
        if (getInternalSettings().getMarginLeft() == f14) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setMarginLeft(f14).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public void setMarginRight(float f14) {
        if (getInternalSettings().getMarginRight() == f14) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setMarginRight(f14).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public void setMarginTop(float f14) {
        if (getInternalSettings().getMarginTop() == f14) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setMarginTop(f14).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public void setPosition(int i14) {
        if (getInternalSettings().getPosition() != i14) {
            setInternalSettings(getInternalSettings().toBuilder().setPosition(i14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.attribution.generated.AttributionSettingsInterface
    public void updateSettings(l<? super AttributionSettings.Builder, Unit> block) {
        block.getClass();
        AttributionSettings.Builder builder = getInternalSettings().toBuilder();
        block.invoke(builder);
        setInternalSettings(builder.build());
        applySettings();
    }
}
