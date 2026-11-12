package com.mapbox.maps.plugin.scalebar.generated;

import com.garmin.android.gncs.settings.GNCSOptOutSettingsFragment;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b(\n\u0002\u0010\t\n\u0002\b\u000f\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H$¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u00020\u00068$@$X¤\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\u0010R$\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010'\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R$\u0010*\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R$\u0010-\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R$\u00100\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dR$\u00103\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010\u001dR$\u00106\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b4\u0010\u001b\"\u0004\b5\u0010\u001dR$\u00109\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b7\u0010!\"\u0004\b8\u0010#R$\u0010<\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b:\u0010!\"\u0004\b;\u0010#R$\u0010?\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b=\u0010!\"\u0004\b>\u0010#R$\u0010B\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b@\u0010!\"\u0004\bA\u0010#R$\u0010E\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bC\u0010!\"\u0004\bD\u0010#R$\u0010F\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bF\u0010\u0015\"\u0004\bG\u0010\u0017R$\u0010M\u001a\u00020H2\u0006\u0010\u0013\u001a\u00020H8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010P\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bN\u0010\u0015\"\u0004\bO\u0010\u0017R$\u0010S\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bQ\u0010!\"\u0004\bR\u0010#R$\u0010V\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bT\u0010\u0015\"\u0004\bU\u0010\u0017¨\u0006W"}, d2 = {"Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettingsBase;", "Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettingsInterface;", "<init>", "()V", "", "applySettings", "Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings;", "getSettings", "()Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings;", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings$Builder;", "block", "updateSettings", "(Le23/l;)V", "getInternalSettings", "setInternalSettings", "(Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings;)V", "internalSettings", "", "value", "getEnabled", "()Z", "setEnabled", "(Z)V", "enabled", "", "getPosition", "()I", "setPosition", "(I)V", ModelSourceWrapper.POSITION, "", "getMarginLeft", "()F", "setMarginLeft", "(F)V", "marginLeft", "getMarginTop", "setMarginTop", "marginTop", "getMarginRight", "setMarginRight", "marginRight", "getMarginBottom", "setMarginBottom", "marginBottom", "getTextColor", "setTextColor", GNCSOptOutSettingsFragment.EXTRA_TEXT_COLOR, "getPrimaryColor", "setPrimaryColor", "primaryColor", "getSecondaryColor", "setSecondaryColor", "secondaryColor", "getBorderWidth", "setBorderWidth", "borderWidth", "getHeight", "setHeight", "height", "getTextBarMargin", "setTextBarMargin", "textBarMargin", "getTextBorderWidth", "setTextBorderWidth", "textBorderWidth", "getTextSize", "setTextSize", "textSize", "isMetricUnits", "setMetricUnits", "", "getRefreshInterval", "()J", "setRefreshInterval", "(J)V", "refreshInterval", "getShowTextBorder", "setShowTextBorder", "showTextBorder", "getRatio", "setRatio", "ratio", "getUseContinuousRendering", "setUseContinuousRendering", "useContinuousRendering", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class ScaleBarSettingsBase implements ScaleBarSettingsInterface {
    public abstract void applySettings();

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public float getBorderWidth() {
        return getInternalSettings().getBorderWidth();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public boolean getEnabled() {
        return getInternalSettings().getEnabled();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public float getHeight() {
        return getInternalSettings().getHeight();
    }

    public abstract ScaleBarSettings getInternalSettings();

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public float getMarginBottom() {
        return getInternalSettings().getMarginBottom();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public float getMarginLeft() {
        return getInternalSettings().getMarginLeft();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public float getMarginRight() {
        return getInternalSettings().getMarginRight();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public float getMarginTop() {
        return getInternalSettings().getMarginTop();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public int getPosition() {
        return getInternalSettings().getPosition();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public int getPrimaryColor() {
        return getInternalSettings().getPrimaryColor();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public float getRatio() {
        return getInternalSettings().getRatio();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public long getRefreshInterval() {
        return getInternalSettings().getRefreshInterval();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public int getSecondaryColor() {
        return getInternalSettings().getSecondaryColor();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public ScaleBarSettings getSettings() {
        return getInternalSettings().toBuilder().build();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public boolean getShowTextBorder() {
        return getInternalSettings().getShowTextBorder();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public float getTextBarMargin() {
        return getInternalSettings().getTextBarMargin();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public float getTextBorderWidth() {
        return getInternalSettings().getTextBorderWidth();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public int getTextColor() {
        return getInternalSettings().getTextColor();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public float getTextSize() {
        return getInternalSettings().getTextSize();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public boolean getUseContinuousRendering() {
        return getInternalSettings().getUseContinuousRendering();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public boolean isMetricUnits() {
        return getInternalSettings().getIsMetricUnits();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setBorderWidth(float f14) {
        if (getInternalSettings().getBorderWidth() == f14) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setBorderWidth(f14).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setEnabled(boolean z14) {
        if (getInternalSettings().getEnabled() != z14) {
            setInternalSettings(getInternalSettings().toBuilder().setEnabled(z14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setHeight(float f14) {
        if (getInternalSettings().getHeight() == f14) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setHeight(f14).build());
        applySettings();
    }

    public abstract void setInternalSettings(ScaleBarSettings scaleBarSettings);

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setMarginBottom(float f14) {
        if (getInternalSettings().getMarginBottom() == f14) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setMarginBottom(f14).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setMarginLeft(float f14) {
        if (getInternalSettings().getMarginLeft() == f14) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setMarginLeft(f14).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setMarginRight(float f14) {
        if (getInternalSettings().getMarginRight() == f14) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setMarginRight(f14).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setMarginTop(float f14) {
        if (getInternalSettings().getMarginTop() == f14) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setMarginTop(f14).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setMetricUnits(boolean z14) {
        if (getInternalSettings().getIsMetricUnits() != z14) {
            setInternalSettings(getInternalSettings().toBuilder().setIsMetricUnits(z14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setPosition(int i14) {
        if (getInternalSettings().getPosition() != i14) {
            setInternalSettings(getInternalSettings().toBuilder().setPosition(i14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setPrimaryColor(int i14) {
        if (getInternalSettings().getPrimaryColor() != i14) {
            setInternalSettings(getInternalSettings().toBuilder().setPrimaryColor(i14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setRatio(float f14) {
        if (getInternalSettings().getRatio() == f14) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setRatio(f14).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setRefreshInterval(long j8) {
        if (getInternalSettings().getRefreshInterval() != j8) {
            setInternalSettings(getInternalSettings().toBuilder().setRefreshInterval(j8).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setSecondaryColor(int i14) {
        if (getInternalSettings().getSecondaryColor() != i14) {
            setInternalSettings(getInternalSettings().toBuilder().setSecondaryColor(i14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setShowTextBorder(boolean z14) {
        if (getInternalSettings().getShowTextBorder() != z14) {
            setInternalSettings(getInternalSettings().toBuilder().setShowTextBorder(z14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setTextBarMargin(float f14) {
        if (getInternalSettings().getTextBarMargin() == f14) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setTextBarMargin(f14).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setTextBorderWidth(float f14) {
        if (getInternalSettings().getTextBorderWidth() == f14) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setTextBorderWidth(f14).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setTextColor(int i14) {
        if (getInternalSettings().getTextColor() != i14) {
            setInternalSettings(getInternalSettings().toBuilder().setTextColor(i14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setTextSize(float f14) {
        if (getInternalSettings().getTextSize() == f14) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setTextSize(f14).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setUseContinuousRendering(boolean z14) {
        if (getInternalSettings().getUseContinuousRendering() != z14) {
            setInternalSettings(getInternalSettings().toBuilder().setUseContinuousRendering(z14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void updateSettings(l<? super ScaleBarSettings.Builder, Unit> block) {
        block.getClass();
        ScaleBarSettings.Builder builder = getInternalSettings().toBuilder();
        block.invoke(builder);
        setInternalSettings(builder.build());
        applySettings();
    }
}
