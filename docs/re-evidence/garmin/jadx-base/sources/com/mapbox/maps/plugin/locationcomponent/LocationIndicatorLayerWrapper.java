package com.mapbox.maps.plugin.locationcomponent;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.bindgen.Value;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0007J\u0014\u0010\b\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0014\u0010\f\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0003J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000bJ\u001c\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002J\u0014\u0010\u0015\u001a\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u001a\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0007J\u0014\u0010\u0019\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\nJ\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0003J\u000e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u000bJ\u0010\u0010\u001e\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003J\u000e\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0003J\u000e\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u000b¨\u0006\""}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/LocationIndicatorLayerWrapper;", "Lcom/mapbox/maps/plugin/locationcomponent/LocationLayerWrapper;", "layerId", "", "(Ljava/lang/String;)V", "accuracyRadius", "", "", "accuracyRadiusBorderColor", "expression", "", "Lcom/mapbox/bindgen/Value;", "accuracyRadiusColor", "bearing", "bearingImage", "bearingImageSize", "bearingImageSizeExpression", "buildTransition", "delay", "", "duration", "emphasisCircleColor", "emphasisCircleColorExpression", "emphasisCircleColorTransition", "emphasisCircleRadius", FirebaseAnalytics.Param.LOCATION, "opacity", "shadowImage", "shadowImageSize", "shadowImageSizeExpression", "slot", "topImage", "topImageSize", "topImageSizeExpression", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LocationIndicatorLayerWrapper extends LocationLayerWrapper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationIndicatorLayerWrapper(String str) {
        super(str);
        str.getClass();
        getLayerProperties().put(TtmlNode.ATTR_ID, new Value(str));
        getLayerProperties().put(NotificationConstants.KEY_DATA_MIME_TYPE, new Value("location-indicator"));
        getLayerProperties().put("location-transition", buildTransition(0L, 0L));
        getLayerProperties().put("bearing-transition", buildTransition(0L, 0L));
        getLayerProperties().put("perspective-compensation", new Value(0.9d));
        getLayerProperties().put("image-pitch-displacement", new Value(4.0d));
    }

    private final Value buildTransition(long delay, long duration) {
        HashMap map = new HashMap();
        map.put("delay", new Value(delay));
        map.put("duration", new Value(duration));
        return new Value((HashMap<String, Value>) map);
    }

    public static /* synthetic */ Value buildTransition$default(LocationIndicatorLayerWrapper locationIndicatorLayerWrapper, long j8, long j14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            j8 = 0;
        }
        if ((i14 & 2) != 0) {
            j14 = 0;
        }
        return locationIndicatorLayerWrapper.buildTransition(j8, j14);
    }

    public static /* synthetic */ void emphasisCircleColorTransition$default(LocationIndicatorLayerWrapper locationIndicatorLayerWrapper, long j8, long j14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            j8 = 0;
        }
        if ((i14 & 2) != 0) {
            j14 = 0;
        }
        locationIndicatorLayerWrapper.emphasisCircleColorTransition(j8, j14);
    }

    public final void accuracyRadius(double accuracyRadius) {
        updateProperty("accuracy-radius", new Value(accuracyRadius));
    }

    public final void accuracyRadiusBorderColor(List<? extends Value> expression) {
        expression.getClass();
        updateProperty("accuracy-radius-border-color", new Value((List<Value>) expression));
    }

    public final void accuracyRadiusColor(List<? extends Value> expression) {
        expression.getClass();
        updateProperty("accuracy-radius-color", new Value((List<Value>) expression));
    }

    public final void bearing(double bearing) {
        updateProperty("bearing", new Value(bearing));
    }

    public final void bearingImage(String bearingImage) {
        bearingImage.getClass();
        updateProperty("bearing-image", new Value(bearingImage));
    }

    public final void bearingImageSize(Value bearingImageSizeExpression) {
        bearingImageSizeExpression.getClass();
        updateProperty("bearing-image-size", bearingImageSizeExpression);
    }

    public final void emphasisCircleColor(List<? extends Value> emphasisCircleColorExpression) {
        emphasisCircleColorExpression.getClass();
        updateProperty("emphasis-circle-color", new Value((List<Value>) emphasisCircleColorExpression));
    }

    public final void emphasisCircleColorTransition(long delay, long duration) {
        updateProperty("emphasis-circle-color-transition", buildTransition(delay, duration));
    }

    public final void emphasisCircleRadius(double emphasisCircleRadius) {
        updateProperty("emphasis-circle-radius", new Value(emphasisCircleRadius));
    }

    public final void location(List<Double> location) {
        location.getClass();
        ArrayList arrayList = new ArrayList(y.r(location, 10));
        Iterator<T> it = location.iterator();
        while (it.hasNext()) {
            arrayList.add(new Value(((Number) it.next()).doubleValue()));
        }
        updateProperty(FirebaseAnalytics.Param.LOCATION, new Value((List<Value>) arrayList));
    }

    public final void opacity(double opacity) {
        updateProperty("location-indicator-opacity", new Value(opacity));
    }

    public final void shadowImage(String shadowImage) {
        shadowImage.getClass();
        updateProperty("shadow-image", new Value(shadowImage));
    }

    public final void shadowImageSize(Value shadowImageSizeExpression) {
        shadowImageSizeExpression.getClass();
        updateProperty("shadow-image-size", shadowImageSizeExpression);
    }

    public final void slot(String slot) {
        if (slot == null) {
            slot = "";
        }
        updateProperty("slot", new Value(slot));
    }

    public final void topImage(String topImage) {
        topImage.getClass();
        updateProperty("top-image", new Value(topImage));
    }

    public final void topImageSize(Value topImageSizeExpression) {
        topImageSizeExpression.getClass();
        updateProperty("top-image-size", topImageSizeExpression);
    }
}
