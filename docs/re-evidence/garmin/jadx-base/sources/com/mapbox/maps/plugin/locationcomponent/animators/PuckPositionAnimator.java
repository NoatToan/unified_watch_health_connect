package com.mapbox.maps.plugin.locationcomponent.animators;

import com.mapbox.geojson.Point;
import com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer;
import com.mapbox.maps.plugin.locationcomponent.OnIndicatorPositionChangedListener;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/animators/PuckPositionAnimator;", "Lcom/mapbox/maps/plugin/locationcomponent/animators/PuckAnimator;", "Lcom/mapbox/geojson/Point;", "indicatorPositionChangedListener", "Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorPositionChangedListener;", "(Lcom/mapbox/maps/plugin/locationcomponent/OnIndicatorPositionChangedListener;)V", "updateLayer", "", "fraction", "", "value", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PuckPositionAnimator extends PuckAnimator<Point> {
    private final OnIndicatorPositionChangedListener indicatorPositionChangedListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PuckPositionAnimator(OnIndicatorPositionChangedListener onIndicatorPositionChangedListener) {
        super(Evaluators.INSTANCE.getPOINT());
        onIndicatorPositionChangedListener.getClass();
        this.indicatorPositionChangedListener = onIndicatorPositionChangedListener;
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.animators.PuckAnimator
    public void updateLayer(float fraction, Point value) {
        value.getClass();
        LocationLayerRenderer locationRenderer = getLocationRenderer();
        if (locationRenderer != null) {
            locationRenderer.setLatLng(value);
        }
        this.indicatorPositionChangedListener.onIndicatorPositionChanged(value);
    }
}
