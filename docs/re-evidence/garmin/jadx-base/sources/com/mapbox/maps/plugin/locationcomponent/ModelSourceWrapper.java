package com.mapbox.maps.plugin.locationcomponent;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLocationComponentException;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o13.p;
import p005kotlin.Metadata;
import p13.u0;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\nJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012J\"\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0006\u0010\u0018\u001a\u00020\u000fJ\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u000fH\u0002J\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR*\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u000ej\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f`\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/ModelSourceWrapper;", "", "sourceId", "", "url", ModelSourceWrapper.POSITION, "", "", ModelSourceWrapper.MATERIAL_OVERRIDES, ModelSourceWrapper.NODE_OVERRIDES, "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getSourceId", "()Ljava/lang/String;", "sourceProperties", "Ljava/util/HashMap;", "Lcom/mapbox/bindgen/Value;", "Lkotlin/collections/HashMap;", TtmlNode.TAG_STYLE, "Lcom/mapbox/maps/MapboxStyleManager;", "bindTo", "", "setPositionAndOrientation", "lngLat", ModelSourceWrapper.ORIENTATION, "toValue", "updateProperty", "propertyName", "value", "updateStyle", "Companion", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ModelSourceWrapper {
    public static final String DEFAULT_MODEL_NAME = "defaultModel";
    public static final String MATERIAL_OVERRIDES = "materialOverrides";
    public static final String MODELS = "models";
    public static final String NODE_OVERRIDES = "nodeOverrides";
    public static final String ORIENTATION = "orientation";
    public static final String POSITION = "position";
    private static final String TAG = "Mbgl-ModelSourceWrapper";
    public static final String TYPE = "model";
    public static final String URL = "uri";
    private final String sourceId;
    private HashMap<String, Value> sourceProperties;
    private MapboxStyleManager style;
    private String url;

    public ModelSourceWrapper(String str, String str2, List<Double> list, List<String> list2, List<String> list3) {
        Double dValueOf = Double.valueOf(0.0d);
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.sourceId = str;
        this.url = str2;
        this.sourceProperties = new HashMap<>();
        HashMap map = new HashMap();
        map.put("uri", new Value(this.url));
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Value(((Number) it.next()).doubleValue()));
        }
        map.put(POSITION, new Value((List<Value>) arrayList));
        List listK = x.k(dValueOf, dValueOf, dValueOf);
        ArrayList arrayList2 = new ArrayList(y.r(listK, 10));
        Iterator it3 = listK.iterator();
        while (it3.hasNext()) {
            arrayList2.add(new Value(((Number) it3.next()).doubleValue()));
        }
        map.put(ORIENTATION, new Value((List<Value>) arrayList2));
        ArrayList arrayList3 = new ArrayList(y.r(list2, 10));
        Iterator<T> it4 = list2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(new Value((String) it4.next()));
        }
        map.put(MATERIAL_OVERRIDES, new Value((List<Value>) arrayList3));
        ArrayList arrayList4 = new ArrayList(y.r(list3, 10));
        Iterator<T> it5 = list3.iterator();
        while (it5.hasNext()) {
            arrayList4.add(new Value((String) it5.next()));
        }
        map.put(NODE_OVERRIDES, new Value((List<Value>) arrayList4));
        HashMap map2 = new HashMap();
        map2.put(DEFAULT_MODEL_NAME, new Value((HashMap<String, Value>) map));
        this.sourceProperties.put(NotificationConstants.KEY_DATA_MIME_TYPE, new Value(TYPE));
        this.sourceProperties.put(MODELS, new Value((HashMap<String, Value>) map2));
    }

    private final void updateProperty(String propertyName, Value value) {
        String error;
        this.sourceProperties.put(propertyName, value);
        MapboxStyleManager mapboxStyleManager = this.style;
        if (mapboxStyleManager == null || (error = mapboxStyleManager.setStyleSourceProperty(this.sourceId, propertyName, value).getError()) == null) {
            return;
        }
        StringBuilder sbI = p6.b.i("Set source property \"", propertyName, "\" failed:\nError: ", error, "\nValue set: ");
        sbI.append(value);
        MapboxLogger.logE(TAG, sbI.toString());
    }

    public final void bindTo(MapboxStyleManager style) {
        style.getClass();
        this.style = style;
        String error = style.addStyleSource(this.sourceId, toValue()).getError();
        if (error == null) {
            return;
        }
        this.sourceProperties.toString();
        throw new MapboxLocationComponentException("Add source failed: ".concat(error));
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public final void setPositionAndOrientation(List<Double> lngLat, List<Double> orientation) {
        lngLat.getClass();
        orientation.getClass();
        ArrayList arrayList = new ArrayList(y.r(lngLat, 10));
        Iterator<T> it = lngLat.iterator();
        while (it.hasNext()) {
            arrayList.add(new Value(((Number) it.next()).doubleValue()));
        }
        p pVar = new p(POSITION, new Value((List<Value>) arrayList));
        ArrayList arrayList2 = new ArrayList(y.r(orientation, 10));
        Iterator<T> it3 = orientation.iterator();
        while (it3.hasNext()) {
            arrayList2.add(new Value(((Number) it3.next()).doubleValue()));
        }
        updateProperty(MODELS, new Value((HashMap<String, Value>) u0.d(new p(DEFAULT_MODEL_NAME, new Value((HashMap<String, Value>) u0.d(pVar, new p(ORIENTATION, new Value((List<Value>) arrayList2)), new p("uri", new Value(this.url))))))));
    }

    public final Value toValue() {
        return new Value(this.sourceProperties);
    }

    public final void updateStyle(MapboxStyleManager style) {
        style.getClass();
        this.style = style;
    }
}
