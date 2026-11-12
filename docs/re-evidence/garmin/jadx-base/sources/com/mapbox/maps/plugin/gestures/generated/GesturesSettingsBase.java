package com.mapbox.maps.plugin.gestures.generated;

import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.plugin.ScrollMode;
import e23.l;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0007\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H$¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u00020\u00068$@$X¤\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\u0010R$\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R$\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R$\u0010!\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R$\u0010$\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R$\u0010*\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020%8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010-\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010\u0017R$\u00100\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b.\u0010\u0015\"\u0004\b/\u0010\u0017R$\u00103\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b1\u0010\u0015\"\u0004\b2\u0010\u0017R(\u00109\u001a\u0004\u0018\u0001042\b\u0010\u0013\u001a\u0004\u0018\u0001048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010<\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b:\u0010\u0015\"\u0004\b;\u0010\u0017R$\u0010?\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b=\u0010\u0015\"\u0004\b>\u0010\u0017R$\u0010B\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b@\u0010\u0015\"\u0004\bA\u0010\u0017R*\u0010F\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0097\u000e¢\u0006\u0012\u0012\u0004\bE\u0010\u0003\u001a\u0004\bC\u0010\u0015\"\u0004\bD\u0010\u0017R$\u0010I\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bG\u0010\u0015\"\u0004\bH\u0010\u0017R$\u0010O\u001a\u00020J2\u0006\u0010\u0013\u001a\u00020J8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010R\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bP\u0010\u0015\"\u0004\bQ\u0010\u0017¨\u0006S"}, d2 = {"Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettingsBase;", "Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettingsInterface;", "<init>", "()V", "", "applySettings", "Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings;", "getSettings", "()Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings;", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings$Builder;", "block", "updateSettings", "(Le23/l;)V", "getInternalSettings", "setInternalSettings", "(Lcom/mapbox/maps/plugin/gestures/generated/GesturesSettings;)V", "internalSettings", "", "value", "getRotateEnabled", "()Z", "setRotateEnabled", "(Z)V", "rotateEnabled", "getPinchToZoomEnabled", "setPinchToZoomEnabled", "pinchToZoomEnabled", "getScrollEnabled", "setScrollEnabled", "scrollEnabled", "getSimultaneousRotateAndPinchToZoomEnabled", "setSimultaneousRotateAndPinchToZoomEnabled", "simultaneousRotateAndPinchToZoomEnabled", "getPitchEnabled", "setPitchEnabled", "pitchEnabled", "Lcom/mapbox/maps/plugin/ScrollMode;", "getScrollMode", "()Lcom/mapbox/maps/plugin/ScrollMode;", "setScrollMode", "(Lcom/mapbox/maps/plugin/ScrollMode;)V", "scrollMode", "getDoubleTapToZoomInEnabled", "setDoubleTapToZoomInEnabled", "doubleTapToZoomInEnabled", "getDoubleTouchToZoomOutEnabled", "setDoubleTouchToZoomOutEnabled", "doubleTouchToZoomOutEnabled", "getQuickZoomEnabled", "setQuickZoomEnabled", "quickZoomEnabled", "Lcom/mapbox/maps/ScreenCoordinate;", "getFocalPoint", "()Lcom/mapbox/maps/ScreenCoordinate;", "setFocalPoint", "(Lcom/mapbox/maps/ScreenCoordinate;)V", "focalPoint", "getPinchToZoomDecelerationEnabled", "setPinchToZoomDecelerationEnabled", "pinchToZoomDecelerationEnabled", "getRotateDecelerationEnabled", "setRotateDecelerationEnabled", "rotateDecelerationEnabled", "getScrollDecelerationEnabled", "setScrollDecelerationEnabled", "scrollDecelerationEnabled", "getIncreaseRotateThresholdWhenPinchingToZoom", "setIncreaseRotateThresholdWhenPinchingToZoom", "getIncreaseRotateThresholdWhenPinchingToZoom$annotations", "increaseRotateThresholdWhenPinchingToZoom", "getIncreasePinchToZoomThresholdWhenRotating", "setIncreasePinchToZoomThresholdWhenRotating", "increasePinchToZoomThresholdWhenRotating", "", "getZoomAnimationAmount", "()F", "setZoomAnimationAmount", "(F)V", "zoomAnimationAmount", "getPinchScrollEnabled", "setPinchScrollEnabled", "pinchScrollEnabled", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class GesturesSettingsBase implements GesturesSettingsInterface {
    @e
    public static /* synthetic */ void getIncreaseRotateThresholdWhenPinchingToZoom$annotations() {
    }

    public abstract void applySettings();

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public boolean getDoubleTapToZoomInEnabled() {
        return getInternalSettings().getDoubleTapToZoomInEnabled();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public boolean getDoubleTouchToZoomOutEnabled() {
        return getInternalSettings().getDoubleTouchToZoomOutEnabled();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public ScreenCoordinate getFocalPoint() {
        return getInternalSettings().getFocalPoint();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public boolean getIncreasePinchToZoomThresholdWhenRotating() {
        return getInternalSettings().getIncreasePinchToZoomThresholdWhenRotating();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public boolean getIncreaseRotateThresholdWhenPinchingToZoom() {
        return getInternalSettings().getIncreaseRotateThresholdWhenPinchingToZoom();
    }

    public abstract GesturesSettings getInternalSettings();

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public boolean getPinchScrollEnabled() {
        return getInternalSettings().getPinchScrollEnabled();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public boolean getPinchToZoomDecelerationEnabled() {
        return getInternalSettings().getPinchToZoomDecelerationEnabled();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public boolean getPinchToZoomEnabled() {
        return getInternalSettings().getPinchToZoomEnabled();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public boolean getPitchEnabled() {
        return getInternalSettings().getPitchEnabled();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public boolean getQuickZoomEnabled() {
        return getInternalSettings().getQuickZoomEnabled();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public boolean getRotateDecelerationEnabled() {
        return getInternalSettings().getRotateDecelerationEnabled();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public boolean getRotateEnabled() {
        return getInternalSettings().getRotateEnabled();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public boolean getScrollDecelerationEnabled() {
        return getInternalSettings().getScrollDecelerationEnabled();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public boolean getScrollEnabled() {
        return getInternalSettings().getScrollEnabled();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public ScrollMode getScrollMode() {
        return getInternalSettings().getScrollMode();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public GesturesSettings getSettings() {
        return getInternalSettings().toBuilder().build();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public boolean getSimultaneousRotateAndPinchToZoomEnabled() {
        return getInternalSettings().getSimultaneousRotateAndPinchToZoomEnabled();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public float getZoomAnimationAmount() {
        return getInternalSettings().getZoomAnimationAmount();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setDoubleTapToZoomInEnabled(boolean z14) {
        if (getInternalSettings().getDoubleTapToZoomInEnabled() != z14) {
            setInternalSettings(getInternalSettings().toBuilder().setDoubleTapToZoomInEnabled(z14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setDoubleTouchToZoomOutEnabled(boolean z14) {
        if (getInternalSettings().getDoubleTouchToZoomOutEnabled() != z14) {
            setInternalSettings(getInternalSettings().toBuilder().setDoubleTouchToZoomOutEnabled(z14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setFocalPoint(ScreenCoordinate screenCoordinate) {
        if (s.g(getInternalSettings().getFocalPoint(), screenCoordinate)) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setFocalPoint(screenCoordinate).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setIncreasePinchToZoomThresholdWhenRotating(boolean z14) {
        if (getInternalSettings().getIncreasePinchToZoomThresholdWhenRotating() != z14) {
            setInternalSettings(getInternalSettings().toBuilder().setIncreasePinchToZoomThresholdWhenRotating(z14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setIncreaseRotateThresholdWhenPinchingToZoom(boolean z14) {
        if (getInternalSettings().getIncreaseRotateThresholdWhenPinchingToZoom() != z14) {
            setInternalSettings(getInternalSettings().toBuilder().setIncreaseRotateThresholdWhenPinchingToZoom(z14).build());
            applySettings();
        }
    }

    public abstract void setInternalSettings(GesturesSettings gesturesSettings);

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setPinchScrollEnabled(boolean z14) {
        if (getInternalSettings().getPinchScrollEnabled() != z14) {
            setInternalSettings(getInternalSettings().toBuilder().setPinchScrollEnabled(z14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setPinchToZoomDecelerationEnabled(boolean z14) {
        if (getInternalSettings().getPinchToZoomDecelerationEnabled() != z14) {
            setInternalSettings(getInternalSettings().toBuilder().setPinchToZoomDecelerationEnabled(z14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setPinchToZoomEnabled(boolean z14) {
        if (getInternalSettings().getPinchToZoomEnabled() != z14) {
            setInternalSettings(getInternalSettings().toBuilder().setPinchToZoomEnabled(z14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setPitchEnabled(boolean z14) {
        if (getInternalSettings().getPitchEnabled() != z14) {
            setInternalSettings(getInternalSettings().toBuilder().setPitchEnabled(z14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setQuickZoomEnabled(boolean z14) {
        if (getInternalSettings().getQuickZoomEnabled() != z14) {
            setInternalSettings(getInternalSettings().toBuilder().setQuickZoomEnabled(z14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setRotateDecelerationEnabled(boolean z14) {
        if (getInternalSettings().getRotateDecelerationEnabled() != z14) {
            setInternalSettings(getInternalSettings().toBuilder().setRotateDecelerationEnabled(z14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setRotateEnabled(boolean z14) {
        if (getInternalSettings().getRotateEnabled() != z14) {
            setInternalSettings(getInternalSettings().toBuilder().setRotateEnabled(z14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setScrollDecelerationEnabled(boolean z14) {
        if (getInternalSettings().getScrollDecelerationEnabled() != z14) {
            setInternalSettings(getInternalSettings().toBuilder().setScrollDecelerationEnabled(z14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setScrollEnabled(boolean z14) {
        if (getInternalSettings().getScrollEnabled() != z14) {
            setInternalSettings(getInternalSettings().toBuilder().setScrollEnabled(z14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setScrollMode(ScrollMode scrollMode) {
        scrollMode.getClass();
        if (getInternalSettings().getScrollMode() != scrollMode) {
            setInternalSettings(getInternalSettings().toBuilder().setScrollMode(scrollMode).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setSimultaneousRotateAndPinchToZoomEnabled(boolean z14) {
        if (getInternalSettings().getSimultaneousRotateAndPinchToZoomEnabled() != z14) {
            setInternalSettings(getInternalSettings().toBuilder().setSimultaneousRotateAndPinchToZoomEnabled(z14).build());
            applySettings();
        }
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void setZoomAnimationAmount(float f14) {
        if (getInternalSettings().getZoomAnimationAmount() == f14) {
            return;
        }
        setInternalSettings(getInternalSettings().toBuilder().setZoomAnimationAmount(f14).build());
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.gestures.generated.GesturesSettingsInterface
    public void updateSettings(l<? super GesturesSettings.Builder, Unit> block) {
        block.getClass();
        GesturesSettings.Builder builder = getInternalSettings().toBuilder();
        block.invoke(builder);
        setInternalSettings(builder.build());
        applySettings();
    }
}
