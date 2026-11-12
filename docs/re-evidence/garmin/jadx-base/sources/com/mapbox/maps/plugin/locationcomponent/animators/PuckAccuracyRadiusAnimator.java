package com.mapbox.maps.plugin.locationcomponent.animators;

import com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer;
import com.mapbox.maps.plugin.locationcomponent.OnIndicatorAccuracyRadiusChangedListener;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/animators/PuckAccuracyRadiusAnimator;", "Lcom/mapbox/maps/plugin/locationcomponent/animators/PuckAnimator;", "", "accuracyRadiusChangedListener", "Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorAccuracyRadiusChangedListener;", "(Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorAccuracyRadiusChangedListener;)V", "accuracyCircleBorderColor", "", "getAccuracyCircleBorderColor$plugin_locationcomponent_release", "()I", "setAccuracyCircleBorderColor$plugin_locationcomponent_release", "(I)V", "accuracyCircleColor", "getAccuracyCircleColor$plugin_locationcomponent_release", "setAccuracyCircleColor$plugin_locationcomponent_release", "updateLayer", "", "fraction", "", "value", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PuckAccuracyRadiusAnimator extends PuckAnimator<Double> {
    private int accuracyCircleBorderColor;
    private int accuracyCircleColor;
    private final OnIndicatorAccuracyRadiusChangedListener accuracyRadiusChangedListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PuckAccuracyRadiusAnimator(OnIndicatorAccuracyRadiusChangedListener onIndicatorAccuracyRadiusChangedListener) {
        super(Evaluators.INSTANCE.getDOUBLE());
        onIndicatorAccuracyRadiusChangedListener.getClass();
        this.accuracyRadiusChangedListener = onIndicatorAccuracyRadiusChangedListener;
        this.accuracyCircleColor = -16776961;
        this.accuracyCircleBorderColor = -16776961;
    }

    /* JADX INFO: renamed from: getAccuracyCircleBorderColor$plugin_locationcomponent_release, reason: from getter */
    public final int getAccuracyCircleBorderColor() {
        return this.accuracyCircleBorderColor;
    }

    /* JADX INFO: renamed from: getAccuracyCircleColor$plugin_locationcomponent_release, reason: from getter */
    public final int getAccuracyCircleColor() {
        return this.accuracyCircleColor;
    }

    public final void setAccuracyCircleBorderColor$plugin_locationcomponent_release(int i14) {
        this.accuracyCircleBorderColor = i14;
    }

    public final void setAccuracyCircleColor$plugin_locationcomponent_release(int i14) {
        this.accuracyCircleColor = i14;
    }

    public void updateLayer(float fraction, double value) {
        if (!getEnabled()) {
            LocationLayerRenderer locationRenderer = getLocationRenderer();
            if (locationRenderer != null) {
                locationRenderer.setAccuracyRadius(0.0f);
                return;
            }
            return;
        }
        float f14 = (float) value;
        float f15 = 0.0f < f14 ? f14 : 0.0f;
        LocationLayerRenderer locationRenderer2 = getLocationRenderer();
        if (locationRenderer2 != null) {
            locationRenderer2.setAccuracyRadius(f15);
        }
        LocationLayerRenderer locationRenderer3 = getLocationRenderer();
        if (locationRenderer3 != null) {
            locationRenderer3.styleAccuracy(this.accuracyCircleColor, this.accuracyCircleBorderColor);
        }
        this.accuracyRadiusChangedListener.onIndicatorAccuracyRadiusChanged(value);
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.animators.PuckAnimator
    public /* bridge */ /* synthetic */ void updateLayer(float f14, Double d14) {
        updateLayer(f14, d14.doubleValue());
    }
}
