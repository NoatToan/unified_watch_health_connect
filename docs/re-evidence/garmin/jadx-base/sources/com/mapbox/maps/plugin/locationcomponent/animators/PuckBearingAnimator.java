package com.mapbox.maps.plugin.locationcomponent.animators;

import com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer;
import com.mapbox.maps.plugin.locationcomponent.OnIndicatorBearingChangedListener;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/animators/PuckBearingAnimator;", "Lcom/mapbox/maps/plugin/locationcomponent/animators/PuckAnimator;", "", "indicatorBearingChangedListener", "Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorBearingChangedListener;", "(Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorBearingChangedListener;)V", "enabled", "", "getEnabled$plugin_locationcomponent_release", "()Z", "setEnabled$plugin_locationcomponent_release", "(Z)V", "updateLayer", "", "fraction", "", "value", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PuckBearingAnimator extends PuckAnimator<Double> {
    private boolean enabled;
    private final OnIndicatorBearingChangedListener indicatorBearingChangedListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PuckBearingAnimator(OnIndicatorBearingChangedListener onIndicatorBearingChangedListener) {
        super(Evaluators.INSTANCE.getDOUBLE());
        onIndicatorBearingChangedListener.getClass();
        this.indicatorBearingChangedListener = onIndicatorBearingChangedListener;
        this.enabled = true;
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.animators.PuckAnimator
    /* JADX INFO: renamed from: getEnabled$plugin_locationcomponent_release, reason: from getter */
    public boolean getEnabled() {
        return this.enabled;
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.animators.PuckAnimator
    public void setEnabled$plugin_locationcomponent_release(boolean z14) {
        this.enabled = z14;
    }

    public void updateLayer(float fraction, double value) {
        if (getEnabled()) {
            LocationLayerRenderer locationRenderer = getLocationRenderer();
            if (locationRenderer != null) {
                locationRenderer.setBearing(value);
            }
            this.indicatorBearingChangedListener.onIndicatorBearingChanged(value);
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.animators.PuckAnimator
    public /* bridge */ /* synthetic */ void updateLayer(float f14, Double d14) {
        updateLayer(f14, d14.doubleValue());
    }
}
