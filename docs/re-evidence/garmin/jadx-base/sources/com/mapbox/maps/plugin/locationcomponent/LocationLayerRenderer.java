package com.mapbox.maps.plugin.locationcomponent;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MapboxStyleManager;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\bH&J\b\u0010\u000f\u001a\u00020\u0003H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u0003H&J\u0012\u0010\u001a\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"H&J)\u0010#\u001a\u00020\u00032\b\b\u0001\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u00122\b\u0010&\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0002\u0010'J\u0010\u0010(\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&¨\u0006)"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/LocationLayerRenderer;", "", "addLayers", "", "positionManager", "Lcom/mapbox/maps/plugin/locationcomponent/LocationComponentPositionManager;", "adjustPulsingCircleLayerVisibility", "visible", "", "clearBitmaps", "hide", "initializeComponents", TtmlNode.TAG_STYLE, "Lcom/mapbox/maps/MapboxStyleManager;", "isRendererInitialised", "removeLayers", "setAccuracyRadius", "accuracy", "", "setBearing", "bearing", "", "setLatLng", "latLng", "Lcom/mapbox/geojson/Point;", "show", "slot", "", "styleAccuracy", "accuracyColor", "", "accuracyBorderColor", "styleScaling", "scaleExpression", "Lcom/mapbox/bindgen/Value;", "updatePulsingUi", "pulsingColorInt", "radius", "opacity", "(IFLjava/lang/Float;)V", "updateStyle", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface LocationLayerRenderer {
    void addLayers(LocationComponentPositionManager positionManager);

    void adjustPulsingCircleLayerVisibility(boolean visible);

    void clearBitmaps();

    void hide();

    void initializeComponents(MapboxStyleManager style);

    boolean isRendererInitialised();

    void removeLayers();

    void setAccuracyRadius(float accuracy);

    void setBearing(double bearing);

    void setLatLng(Point latLng);

    void show();

    void slot(String slot);

    void styleAccuracy(int accuracyColor, int accuracyBorderColor);

    void styleScaling(Value scaleExpression);

    void updatePulsingUi(int pulsingColorInt, float radius, Float opacity);

    void updateStyle(MapboxStyleManager style);
}
