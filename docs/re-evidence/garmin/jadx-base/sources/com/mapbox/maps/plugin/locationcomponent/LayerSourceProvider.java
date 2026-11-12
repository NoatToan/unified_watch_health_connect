package com.mapbox.maps.plugin.locationcomponent;

import android.content.Context;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLocationComponentException;
import com.mapbox.maps.plugin.LocationPuck2D;
import com.mapbox.maps.plugin.LocationPuck3D;
import com.mapbox.maps.plugin.ModelScaleMode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.y;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0014"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/LayerSourceProvider;", "", "()V", "getLocationIndicatorLayer", "Lcom/mapbox/maps/plugin/locationcomponent/LocationIndicatorLayerWrapper;", "getLocationIndicatorLayerRenderer", "Lcom/mapbox/maps/plugin/locationcomponent/LocationIndicatorLayerRenderer;", "puckOptions", "Lcom/mapbox/maps/plugin/LocationPuck2D;", "weakContext", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "getModelLayer", "Lcom/mapbox/maps/plugin/locationcomponent/ModelLayerWrapper;", "locationModelLayerOptions", "Lcom/mapbox/maps/plugin/LocationPuck3D;", "getModelLayerRenderer", "Lcom/mapbox/maps/plugin/locationcomponent/ModelLayerRenderer;", "getModelSource", "Lcom/mapbox/maps/plugin/locationcomponent/ModelSourceWrapper;", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LayerSourceProvider {
    public static final LayerSourceProvider INSTANCE = new LayerSourceProvider();

    private LayerSourceProvider() {
    }

    public final LocationIndicatorLayerWrapper getLocationIndicatorLayer() {
        return new LocationIndicatorLayerWrapper(LocationComponentConstants.LOCATION_INDICATOR_LAYER);
    }

    public final LocationIndicatorLayerRenderer getLocationIndicatorLayerRenderer(LocationPuck2D puckOptions, WeakReference<Context> weakContext) {
        puckOptions.getClass();
        weakContext.getClass();
        return new LocationIndicatorLayerRenderer(puckOptions, weakContext, null, 4, null);
    }

    public final ModelLayerWrapper getModelLayer(LocationPuck3D locationModelLayerOptions) {
        Value value;
        Value value2;
        Value value3;
        Value value4;
        locationModelLayerOptions.getClass();
        List<Float> modelScale = locationModelLayerOptions.getModelScale();
        ArrayList arrayList = new ArrayList(y.r(modelScale, 10));
        Iterator<T> it = modelScale.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(((Number) it.next()).floatValue()));
        }
        List<Float> modelRotation = locationModelLayerOptions.getModelRotation();
        ArrayList arrayList2 = new ArrayList(y.r(modelRotation, 10));
        Iterator<T> it3 = modelRotation.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Double.valueOf(((Number) it3.next()).floatValue()));
        }
        String modelRotationExpression = locationModelLayerOptions.getModelRotationExpression();
        Value value5 = null;
        if (modelRotationExpression != null) {
            Expected<String, Value> expectedFromJson = Value.fromJson(modelRotationExpression);
            expectedFromJson.getClass();
            String error = expectedFromJson.getError();
            if (error != null) {
                throw new MapboxLocationComponentException(error);
            }
            Value value6 = expectedFromJson.getValue();
            if (value6 == null) {
                throw new MapboxLocationComponentException("Error in parsing expression.");
            }
            value = value6;
        } else {
            value = null;
        }
        List<Float> modelTranslation = locationModelLayerOptions.getModelTranslation();
        ArrayList arrayList3 = new ArrayList(y.r(modelTranslation, 10));
        Iterator<T> it4 = modelTranslation.iterator();
        while (it4.hasNext()) {
            arrayList3.add(Double.valueOf(((Number) it4.next()).floatValue()));
        }
        boolean modelCastShadows = locationModelLayerOptions.getModelCastShadows();
        boolean modelReceiveShadows = locationModelLayerOptions.getModelReceiveShadows();
        double modelOpacity = locationModelLayerOptions.getModelOpacity();
        String modelOpacityExpression = locationModelLayerOptions.getModelOpacityExpression();
        if (modelOpacityExpression != null) {
            Expected<String, Value> expectedFromJson2 = Value.fromJson(modelOpacityExpression);
            expectedFromJson2.getClass();
            String error2 = expectedFromJson2.getError();
            if (error2 != null) {
                throw new MapboxLocationComponentException(error2);
            }
            Value value7 = expectedFromJson2.getValue();
            if (value7 == null) {
                throw new MapboxLocationComponentException("Error in parsing expression.");
            }
            value2 = value7;
        } else {
            value2 = null;
        }
        ModelScaleMode modelScaleMode = locationModelLayerOptions.getModelScaleMode();
        double modelEmissiveStrength = locationModelLayerOptions.getModelEmissiveStrength();
        String modelEmissiveStrengthExpression = locationModelLayerOptions.getModelEmissiveStrengthExpression();
        if (modelEmissiveStrengthExpression != null) {
            Expected<String, Value> expectedFromJson3 = Value.fromJson(modelEmissiveStrengthExpression);
            expectedFromJson3.getClass();
            String error3 = expectedFromJson3.getError();
            if (error3 != null) {
                throw new MapboxLocationComponentException(error3);
            }
            Value value8 = expectedFromJson3.getValue();
            if (value8 == null) {
                throw new MapboxLocationComponentException("Error in parsing expression.");
            }
            value3 = value8;
        } else {
            value3 = null;
        }
        int modelColor = locationModelLayerOptions.getModelColor();
        String modelColorExpression = locationModelLayerOptions.getModelColorExpression();
        if (modelColorExpression != null) {
            Expected<String, Value> expectedFromJson4 = Value.fromJson(modelColorExpression);
            expectedFromJson4.getClass();
            String error4 = expectedFromJson4.getError();
            if (error4 != null) {
                throw new MapboxLocationComponentException(error4);
            }
            Value value9 = expectedFromJson4.getValue();
            if (value9 == null) {
                throw new MapboxLocationComponentException("Error in parsing expression.");
            }
            value4 = value9;
        } else {
            value4 = null;
        }
        double modelColorMixIntensity = locationModelLayerOptions.getModelColorMixIntensity();
        String modelColorMixIntensityExpression = locationModelLayerOptions.getModelColorMixIntensityExpression();
        if (modelColorMixIntensityExpression != null) {
            Expected<String, Value> expectedFromJson5 = Value.fromJson(modelColorMixIntensityExpression);
            expectedFromJson5.getClass();
            String error5 = expectedFromJson5.getError();
            if (error5 != null) {
                throw new MapboxLocationComponentException(error5);
            }
            Value value10 = expectedFromJson5.getValue();
            if (value10 == null) {
                throw new MapboxLocationComponentException("Error in parsing expression.");
            }
            value5 = value10;
        }
        return new ModelLayerWrapper(LocationComponentConstants.MODEL_LAYER, LocationComponentConstants.MODEL_SOURCE, arrayList, arrayList2, value, arrayList3, modelCastShadows, modelReceiveShadows, modelOpacity, value2, modelScaleMode, modelEmissiveStrength, value3, modelColor, value4, modelColorMixIntensity, value5, locationModelLayerOptions.getModelElevationReference());
    }

    public final ModelLayerRenderer getModelLayerRenderer(LocationPuck3D locationModelLayerOptions) {
        locationModelLayerOptions.getClass();
        return new ModelLayerRenderer(this, locationModelLayerOptions);
    }

    public final ModelSourceWrapper getModelSource(LocationPuck3D locationModelLayerOptions) {
        locationModelLayerOptions.getClass();
        if (locationModelLayerOptions.getModelUri().length() == 0) {
            h.s("Model Url must not be empty!");
            return null;
        }
        String modelUri = locationModelLayerOptions.getModelUri();
        List<Float> position = locationModelLayerOptions.getPosition();
        ArrayList arrayList = new ArrayList(y.r(position, 10));
        Iterator<T> it = position.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(((Number) it.next()).floatValue()));
        }
        return new ModelSourceWrapper(LocationComponentConstants.MODEL_SOURCE, modelUri, arrayList, locationModelLayerOptions.getMaterialOverrides(), locationModelLayerOptions.getNodeOverrides());
    }
}
