package com.mapbox.maps.plugin.locationcomponent;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.plugin.ModelElevationReference;
import com.mapbox.maps.plugin.ModelScaleMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B±\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u001a\u001a\u00020\u001b¢\u0006\u0002\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0002J\u000e\u0010\u001a\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u000f\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0007J\u0014\u0010\b\u001a\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\u0005\u001a\u00020!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020!2\u0006\u0010\u0011\u001a\u00020\u0012J\u0014\u0010\u000b\u001a\u00020!2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010(\u001a\u00020!2\b\u0010(\u001a\u0004\u0018\u00010\u0003¨\u0006)"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/ModelLayerWrapper;", "Lcom/mapbox/maps/plugin/locationcomponent/LocationLayerWrapper;", "layerId", "", "sourceId", "modelScale", "", "", "modelRotation", "modelRotationExpression", "Lcom/mapbox/bindgen/Value;", "modelTranslation", "modelCastShadows", "", "modelReceiveShadows", "modelOpacity", "modelOpacityExpression", "modelScaleMode", "Lcom/mapbox/maps/plugin/ModelScaleMode;", "modelEmissiveStrength", "modelEmissiveStrengthExpression", "modelColor", "", "modelColorExpression", "modelColorMixIntensity", "modelColorMixIntensityExpression", "modelElevationReference", "Lcom/mapbox/maps/plugin/ModelElevationReference;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/mapbox/bindgen/Value;Ljava/util/List;ZZDLcom/mapbox/bindgen/Value;Lcom/mapbox/maps/plugin/ModelScaleMode;DLcom/mapbox/bindgen/Value;ILcom/mapbox/bindgen/Value;DLcom/mapbox/bindgen/Value;Lcom/mapbox/maps/plugin/ModelElevationReference;)V", "buildTransition", "delay", "", "duration", "", "opacity", "rotation", "scale", "modelScaleExpression", "scaleExpression", "translation", "slot", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ModelLayerWrapper extends LocationLayerWrapper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModelLayerWrapper(String str, String str2, List<Double> list, List<Double> list2, Value value, List<Double> list3, boolean z14, boolean z15, double d14, Value value2, ModelScaleMode modelScaleMode, double d15, Value value3, int i14, Value value4, double d16, Value value5, ModelElevationReference modelElevationReference) {
        super(str);
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        modelScaleMode.getClass();
        modelElevationReference.getClass();
        getLayerProperties().put(TtmlNode.ATTR_ID, new Value(str));
        getLayerProperties().put(NotificationConstants.KEY_DATA_MIME_TYPE, new Value(ModelSourceWrapper.TYPE));
        getLayerProperties().put("source", new Value(str2));
        getLayerProperties().put("model-type", new Value("location-indicator"));
        HashMap<String, Value> layerProperties = getLayerProperties();
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Value(((Number) it.next()).doubleValue()));
        }
        layerProperties.put("model-scale", new Value((List<Value>) arrayList));
        HashMap<String, Value> layerProperties2 = getLayerProperties();
        if (value == null) {
            ArrayList arrayList2 = new ArrayList(y.r(list2, 10));
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(new Value(((Number) it3.next()).doubleValue()));
            }
            value = new Value((List<Value>) arrayList2);
        }
        layerProperties2.put("model-rotation", value);
        HashMap<String, Value> layerProperties3 = getLayerProperties();
        ArrayList arrayList3 = new ArrayList(y.r(list3, 10));
        Iterator<T> it4 = list3.iterator();
        while (it4.hasNext()) {
            arrayList3.add(new Value(((Number) it4.next()).doubleValue()));
        }
        layerProperties3.put("model-translation", new Value((List<Value>) arrayList3));
        getLayerProperties().put("model-cast-shadows", new Value(z14));
        getLayerProperties().put("model-receive-shadows", new Value(z15));
        getLayerProperties().put("model-opacity", value2 == null ? new Value(d14) : value2);
        getLayerProperties().put("model-scale-mode", new Value(modelScaleMode.getValue()));
        getLayerProperties().put("model-scale-transition", buildTransition(0L, 0L));
        getLayerProperties().put("model-rotation-transition", buildTransition(0L, 0L));
        getLayerProperties().put("model-emissive-strength", value3 == null ? new Value(d15) : value3);
        getLayerProperties().put("model-color", value4 == null ? ColorUtils.INSTANCE.colorIntToRgbaExpression(i14) : value4);
        getLayerProperties().put("model-color-mix-intensity", value5 == null ? new Value(d16) : value5);
        getLayerProperties().put("model-elevation-reference", new Value(modelElevationReference.getValue()));
    }

    private final Value buildTransition(long delay, long duration) {
        HashMap map = new HashMap();
        map.put("delay", new Value(delay));
        map.put("duration", new Value(duration));
        return new Value((HashMap<String, Value>) map);
    }

    public final void modelElevationReference(ModelElevationReference modelElevationReference) {
        modelElevationReference.getClass();
        updateProperty("model-elevation-reference", new Value(modelElevationReference.getValue()));
    }

    public final void modelOpacity(double opacity) {
        updateProperty("model-opacity", new Value(opacity));
    }

    public final void modelRotation(List<Double> rotation) {
        rotation.getClass();
        ArrayList arrayList = new ArrayList(y.r(rotation, 10));
        Iterator<T> it = rotation.iterator();
        while (it.hasNext()) {
            arrayList.add(new Value(((Number) it.next()).doubleValue()));
        }
        updateProperty("model-rotation", new Value((List<Value>) arrayList));
    }

    public final void modelScale(List<Double> scale) {
        scale.getClass();
        ArrayList arrayList = new ArrayList(y.r(scale, 10));
        Iterator<T> it = scale.iterator();
        while (it.hasNext()) {
            arrayList.add(new Value(((Number) it.next()).doubleValue()));
        }
        updateProperty("model-scale", new Value((List<Value>) arrayList));
    }

    public final void modelScaleExpression(Value scaleExpression) {
        scaleExpression.getClass();
        updateProperty("model-scale", scaleExpression);
    }

    public final void modelScaleMode(ModelScaleMode modelScaleMode) {
        modelScaleMode.getClass();
        updateProperty("model-scale-mode", new Value(modelScaleMode.getValue()));
    }

    public final void modelTranslation(List<Double> translation) {
        translation.getClass();
        ArrayList arrayList = new ArrayList(y.r(translation, 10));
        Iterator<T> it = translation.iterator();
        while (it.hasNext()) {
            arrayList.add(new Value(((Number) it.next()).doubleValue()));
        }
        updateProperty("model-translation", new Value((List<Value>) arrayList));
    }

    public final void slot(String slot) {
        if (slot == null) {
            slot = "";
        }
        updateProperty("slot", new Value(slot));
    }
}
