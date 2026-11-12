package com.mapbox.maps.plugin.locationcomponent;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.plugin.LocationPuck3D;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016J\b\u0010\u001f\u001a\u00020\u0018H\u0016J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010!\u001a\u00020\u001dH\u0002J\b\u0010\"\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\u001dH\u0002J\b\u0010$\u001a\u00020\u0018H\u0016J\u0010\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\bH\u0016J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\nH\u0016J\u0010\u0010,\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\bH\u0002J\u0010\u0010-\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\nH\u0002J\u0010\u0010.\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010/\u001a\u00020\u0018H\u0016J\u0012\u00100\u001a\u00020\u00182\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0018\u00102\u001a\u00020\u00182\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000204H\u0016J\u0010\u00106\u001a\u00020\u00182\u0006\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u00020\u0018H\u0002J'\u0010:\u001a\u00020\u00182\u0006\u0010;\u001a\u0002042\u0006\u0010<\u001a\u00020'2\b\u0010=\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0002\u0010>J\u0010\u0010?\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\t\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/ModelLayerRenderer;", "Lcom/mapbox/maps/plugin/locationcomponent/LocationLayerRenderer;", "layerSourceProvider", "Lcom/mapbox/maps/plugin/locationcomponent/LayerSourceProvider;", "locationModelLayerOptions", "Lcom/mapbox/maps/plugin/LocationPuck3D;", "(Lcom/mapbox/maps/plugin/locationcomponent/LayerSourceProvider;Lcom/mapbox/maps/plugin/LocationPuck3D;)V", "lastBearing", "", "lastLocation", "Lcom/mapbox/geojson/Point;", "getLastLocation$plugin_locationcomponent_release$annotations", "()V", "getLastLocation$plugin_locationcomponent_release", "()Lcom/mapbox/geojson/Point;", "setLastLocation$plugin_locationcomponent_release", "(Lcom/mapbox/geojson/Point;)V", "modelLayer", "Lcom/mapbox/maps/plugin/locationcomponent/ModelLayerWrapper;", "source", "Lcom/mapbox/maps/plugin/locationcomponent/ModelSourceWrapper;", TtmlNode.TAG_STYLE, "Lcom/mapbox/maps/MapboxStyleManager;", "addLayers", "", "positionManager", "Lcom/mapbox/maps/plugin/locationcomponent/LocationComponentPositionManager;", "adjustPulsingCircleLayerVisibility", "visible", "", "clearBitmaps", "hide", "initializeComponents", "isLayerInitialised", "isRendererInitialised", "isSourceInitialised", "removeLayers", "setAccuracyRadius", "accuracy", "", "setBearing", "bearing", "setLatLng", "latLng", "setLayerBearing", "setLayerLocation", "setLayerVisibility", "show", "slot", "", "styleAccuracy", "accuracyColor", "", "accuracyBorderColor", "styleScaling", "scaleExpression", "Lcom/mapbox/bindgen/Value;", "updateLocationOrBearing", "updatePulsingUi", "pulsingColorInt", "radius", "opacity", "(IFLjava/lang/Float;)V", "updateStyle", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ModelLayerRenderer implements LocationLayerRenderer {
    private double lastBearing;
    private Point lastLocation;
    private final LocationPuck3D locationModelLayerOptions;
    private ModelLayerWrapper modelLayer;
    private ModelSourceWrapper source;
    private MapboxStyleManager style;

    public ModelLayerRenderer(LayerSourceProvider layerSourceProvider, LocationPuck3D locationPuck3D) {
        layerSourceProvider.getClass();
        locationPuck3D.getClass();
        this.locationModelLayerOptions = locationPuck3D;
        this.modelLayer = layerSourceProvider.getModelLayer(locationPuck3D);
        this.source = layerSourceProvider.getModelSource(locationPuck3D);
    }

    public static /* synthetic */ void getLastLocation$plugin_locationcomponent_release$annotations() {
    }

    private final boolean isLayerInitialised() {
        MapboxStyleManager mapboxStyleManager = this.style;
        if (mapboxStyleManager != null) {
            return mapboxStyleManager.styleLayerExists(LocationComponentConstants.MODEL_LAYER);
        }
        return false;
    }

    private final boolean isSourceInitialised() {
        MapboxStyleManager mapboxStyleManager = this.style;
        if (mapboxStyleManager != null) {
            return mapboxStyleManager.styleSourceExists(LocationComponentConstants.MODEL_SOURCE);
        }
        return false;
    }

    private final void setLayerBearing(double bearing) {
        this.lastBearing = bearing;
        updateLocationOrBearing();
    }

    private final void setLayerLocation(Point latLng) {
        this.lastLocation = latLng;
        updateLocationOrBearing();
    }

    private final void setLayerVisibility(boolean visible) {
        this.modelLayer.visibility(visible);
    }

    private final void updateLocationOrBearing() {
        Double dValueOf = Double.valueOf(0.0d);
        Point point = this.lastLocation;
        if (point != null) {
            this.source.setPositionAndOrientation(x.k(Double.valueOf(point.longitude()), Double.valueOf(point.latitude())), x.k(dValueOf, dValueOf, Double.valueOf(this.lastBearing)));
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void addLayers(LocationComponentPositionManager positionManager) {
        positionManager.getClass();
        positionManager.addLayerToMap(this.modelLayer);
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void adjustPulsingCircleLayerVisibility(boolean visible) {
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void clearBitmaps() {
    }

    /* JADX INFO: renamed from: getLastLocation$plugin_locationcomponent_release, reason: from getter */
    public final Point getLastLocation() {
        return this.lastLocation;
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void hide() {
        setLayerVisibility(false);
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void initializeComponents(MapboxStyleManager style) {
        style.getClass();
        this.style = style;
        this.source.bindTo(style);
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public boolean isRendererInitialised() {
        return isLayerInitialised() && isSourceInitialised();
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void removeLayers() {
        MapboxStyleManager mapboxStyleManager = this.style;
        if (mapboxStyleManager != null) {
            mapboxStyleManager.removeStyleLayer(this.modelLayer.getLayerId());
        }
        MapboxStyleManager mapboxStyleManager2 = this.style;
        if (mapboxStyleManager2 != null) {
            mapboxStyleManager2.removeStyleSource(this.source.getSourceId());
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void setAccuracyRadius(float accuracy) {
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void setBearing(double bearing) {
        setLayerBearing(bearing);
    }

    public final void setLastLocation$plugin_locationcomponent_release(Point point) {
        this.lastLocation = point;
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void setLatLng(Point latLng) {
        latLng.getClass();
        setLayerLocation(latLng);
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void show() {
        setLayerVisibility(true);
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void slot(String slot) {
        this.modelLayer.slot(slot);
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void styleAccuracy(int accuracyColor, int accuracyBorderColor) {
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void styleScaling(Value scaleExpression) {
        scaleExpression.getClass();
        this.modelLayer.modelScaleExpression(scaleExpression);
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void updatePulsingUi(int pulsingColorInt, float radius, Float opacity) {
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void updateStyle(MapboxStyleManager style) {
        style.getClass();
        this.style = style;
        this.modelLayer.updateStyle(style);
        this.source.updateStyle(style);
    }
}
