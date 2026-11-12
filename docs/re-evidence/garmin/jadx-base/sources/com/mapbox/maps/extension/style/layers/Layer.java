package com.mapbox.maps.extension.style.layers;

import am.j;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.MapboxStyleException;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.StyleContract;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.p;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import o13.l;
import o13.m;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import p13.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b&\u0018\u0000 [2\u00020\u0001:\u0001[B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H ¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000bH&¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0004H&¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ5\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b \u0010!J!\u0010 \u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b \u0010\"J#\u0010%\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0004\b$\u0010\"J\u000f\u0010&\u001a\u00020\u001bH\u0004¢\u0006\u0004\b&\u0010'J\u001b\u0010,\u001a\u00020\u001f2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030(H\u0000¢\u0006\u0004\b*\u0010+J\"\u00101\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010-\u0018\u00012\u0006\u0010.\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b/\u00100J\u0019\u00104\u001a\u0004\u0018\u00010\u000b2\u0006\u0010.\u001a\u00020\u0004H\u0000¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u00020\u0004H\u0016¢\u0006\u0004\b5\u0010\u0006J\u001b\u00106\u001a\u00020\u001f2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030(H\u0002¢\u0006\u0004\b6\u0010+J-\u00109\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010-2\u0006\u0010.\u001a\u00020\u00042\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u000007H\u0002¢\u0006\u0004\b9\u0010:R$\u0010;\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010?R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010!R$\u0010D\u001a\u0004\u0018\u00010\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010'\"\u0004\bG\u0010HR?\u0010O\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030(0Ij\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030(`J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010\u0006R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0016\u0010V\u001a\u0004\u0018\u00010\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010XR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010\u0006¨\u0006\\"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/Layer;", "Lcom/mapbox/maps/extension/style/StyleContract$StyleLayerExtension;", "<init>", "()V", "", "getType$extension_style_release", "()Ljava/lang/String;", "getType", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibility", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;)Lcom/mapbox/maps/extension/style/layers/Layer;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/layers/Layer;", "", "minZoom", "(D)Lcom/mapbox/maps/extension/style/layers/Layer;", "maxZoom", "slot", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/layers/Layer;", "Lcom/mapbox/maps/MapboxStyleManager;", "delegate", "Lcom/mapbox/maps/LayerPosition;", ModelSourceWrapper.POSITION, "Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/bindgen/None;", "addPersistentLayer", "(Lcom/mapbox/maps/MapboxStyleManager;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/bindgen/Value;", "propertiesValue", "addLayer", "(Lcom/mapbox/maps/MapboxStyleManager;Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;", "", "bindTo", "(Lcom/mapbox/maps/MapboxStyleManager;)V", "(Lcom/mapbox/maps/MapboxStyleManager;Lcom/mapbox/maps/LayerPosition;)V", TtmlNode.TAG_STYLE, "bindPersistentlyTo$extension_style_release", "bindPersistentlyTo", "getCachedLayerProperties", "()Lcom/mapbox/bindgen/Value;", "Lcom/mapbox/maps/extension/style/layers/properties/PropertyValue;", "property", "setProperty$extension_style_release", "(Lcom/mapbox/maps/extension/style/layers/properties/PropertyValue;)V", "setProperty", "T", "propertyName", "getPropertyValue$extension_style_release", "(Ljava/lang/String;)Ljava/lang/Object;", "getPropertyValue", "getPropertyValueAsExpressionOrLiteralExpression$extension_style_release", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getPropertyValueAsExpressionOrLiteralExpression", "toString", "updateProperty", "Ljava/lang/Class;", "clazz", "getPropertyValueWithType", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "internalSourceId", "Ljava/lang/String;", "getInternalSourceId$extension_style_release", "setInternalSourceId$extension_style_release", "(Ljava/lang/String;)V", "Lcom/mapbox/maps/MapboxStyleManager;", "getDelegate$extension_style_release", "()Lcom/mapbox/maps/MapboxStyleManager;", "setDelegate$extension_style_release", "appliedLayerPropertiesValue", "Lcom/mapbox/bindgen/Value;", "getAppliedLayerPropertiesValue$extension_style_release", "setAppliedLayerPropertiesValue$extension_style_release", "(Lcom/mapbox/bindgen/Value;)V", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "layerProperties$delegate", "Lo13/l;", "getLayerProperties", "()Ljava/util/HashMap;", "layerProperties", "getLayerId", "layerId", "getVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getVisibilityAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "visibilityAsExpression", "getMinZoom", "()Ljava/lang/Double;", "getMaxZoom", "getSlot", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class Layer implements StyleContract.StyleLayerExtension {
    private static final String TAG = "Mbgl-Layer";
    private Value appliedLayerPropertiesValue;
    private MapboxStyleManager delegate;
    private String internalSourceId;

    /* JADX INFO: renamed from: layerProperties$delegate, reason: from kotlin metadata */
    private final l layerProperties = m.b(new Layer$layerProperties$2(this));

    /* JADX INFO: renamed from: com.mapbox.maps.extension.style.layers.Layer$toString$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "propertyValue", "Lcom/mapbox/maps/extension/style/layers/properties/PropertyValue;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements e23.l<PropertyValue<?>, CharSequence> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // e23.l
        public final CharSequence invoke(PropertyValue<?> propertyValue) {
            propertyValue.getClass();
            return propertyValue.getPropertyName() + " = " + propertyValue.getValue();
        }
    }

    public static /* synthetic */ void bindPersistentlyTo$extension_style_release$default(Layer layer, MapboxStyleManager mapboxStyleManager, LayerPosition layerPosition, int i14, Object obj) {
        if (obj != null) {
            e.w("Super calls with default arguments not supported in this target, function: bindPersistentlyTo");
            return;
        }
        if ((i14 & 2) != 0) {
            layerPosition = null;
        }
        layer.bindPersistentlyTo$extension_style_release(mapboxStyleManager, layerPosition);
    }

    private final HashMap<String, PropertyValue<?>> getLayerProperties() {
        return (HashMap) this.layerProperties.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> T getPropertyValueWithType(String propertyName, Class<T> clazz) {
        MapboxStyleManager mapboxStyleManager = this.delegate;
        if (mapboxStyleManager == null) {
            p.n(j.m("Couldn't get ", propertyName, ": layer is not added to style yet."));
            return null;
        }
        try {
            return (T) TypeUtilsKt.unwrap(mapboxStyleManager.getStyleLayerProperty(getLayerId(), propertyName), clazz);
        } catch (RuntimeException e4) {
            if (s.g(clazz, Expression.class)) {
                return null;
            }
            getLayerId();
            e4.getMessage();
            Objects.toString(mapboxStyleManager.getStyleLayerProperty(getLayerId(), propertyName));
            return null;
        }
    }

    private final void updateProperty(PropertyValue<?> property) {
        String error;
        MapboxStyleManager mapboxStyleManager = this.delegate;
        if (mapboxStyleManager == null || (error = mapboxStyleManager.setStyleLayerProperty(getLayerId(), property.getPropertyName(), property.getValue()).getError()) == null) {
            return;
        }
        throw new MapboxStyleException("Set layer property \"" + property.getPropertyName() + "\" failed:\n" + error + '\n' + property.getValue());
    }

    public Expected<String, None> addLayer(MapboxStyleManager delegate, Value propertiesValue, LayerPosition position) {
        delegate.getClass();
        propertiesValue.getClass();
        return delegate.addStyleLayer(propertiesValue, position);
    }

    public Expected<String, None> addPersistentLayer(MapboxStyleManager delegate, LayerPosition position) {
        delegate.getClass();
        return delegate.addPersistentStyleLayer(getCachedLayerProperties(), position);
    }

    public final void bindPersistentlyTo$extension_style_release(MapboxStyleManager style, LayerPosition position) {
        style.getClass();
        this.delegate = style;
        String error = addPersistentLayer(style, position).getError();
        if (error == null) {
            return;
        }
        p.n("Add persistent layer failed: ".concat(error));
    }

    @Override // com.mapbox.maps.extension.style.StyleContract.StyleLayerExtension
    public void bindTo(MapboxStyleManager delegate, LayerPosition position) {
        delegate.getClass();
        this.delegate = delegate;
        Value cachedLayerProperties = this.appliedLayerPropertiesValue;
        if (cachedLayerProperties == null) {
            cachedLayerProperties = getCachedLayerProperties();
        }
        String error = addLayer(delegate, cachedLayerProperties, position).getError();
        if (error != null) {
            p.n("Add layer failed: ".concat(error));
            return;
        }
        if (this.appliedLayerPropertiesValue != null) {
            Collection<PropertyValue<?>> collectionValues = getLayerProperties().values();
            collectionValues.getClass();
            ArrayList<PropertyValue> arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                PropertyValue propertyValue = (PropertyValue) obj;
                if (!s.g(propertyValue.getPropertyName(), TtmlNode.ATTR_ID) && !s.g(propertyValue.getPropertyName(), NotificationConstants.KEY_DATA_MIME_TYPE) && !s.g(propertyValue.getPropertyName(), "source")) {
                    arrayList.add(obj);
                }
            }
            for (PropertyValue propertyValue2 : arrayList) {
                delegate.setStyleLayerProperty(getLayerId(), propertyValue2.getPropertyName(), propertyValue2.getValue());
            }
        }
    }

    /* JADX INFO: renamed from: getAppliedLayerPropertiesValue$extension_style_release, reason: from getter */
    public final Value getAppliedLayerPropertiesValue() {
        return this.appliedLayerPropertiesValue;
    }

    public final Value getCachedLayerProperties() {
        HashMap map = new HashMap();
        Collection<PropertyValue<?>> collectionValues = getLayerProperties().values();
        collectionValues.getClass();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            PropertyValue propertyValue = (PropertyValue) it.next();
            map.put(propertyValue.getPropertyName(), propertyValue.getValue());
        }
        return new Value((HashMap<String, Value>) map);
    }

    /* JADX INFO: renamed from: getDelegate$extension_style_release, reason: from getter */
    public final MapboxStyleManager getDelegate() {
        return this.delegate;
    }

    /* JADX INFO: renamed from: getInternalSourceId$extension_style_release, reason: from getter */
    public final String getInternalSourceId() {
        return this.internalSourceId;
    }

    public abstract String getLayerId();

    public abstract Double getMaxZoom();

    public abstract Double getMinZoom();

    public final <T> T getPropertyValue$extension_style_release(String propertyName) {
        propertyName.getClass();
        s.l();
        throw null;
    }

    public final Expression getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(String propertyName) {
        propertyName.getClass();
        MapboxStyleManager mapboxStyleManager = this.delegate;
        if (mapboxStyleManager == null) {
            p.n(j.m("Couldn't get ", propertyName, ": layer is not added to style yet."));
            return null;
        }
        try {
            return TypeUtilsKt.unwrapToExpressionOrLiteralExpression(mapboxStyleManager.getStyleLayerProperty(getLayerId(), propertyName));
        } catch (RuntimeException e4) {
            getLayerId();
            e4.getMessage();
            Objects.toString(mapboxStyleManager.getStyleLayerProperty(getLayerId(), propertyName));
            return null;
        }
    }

    public abstract String getSlot();

    public abstract String getType$extension_style_release();

    public abstract Visibility getVisibility();

    public abstract Expression getVisibilityAsExpression();

    public abstract Layer maxZoom(double maxZoom);

    public abstract Layer minZoom(double minZoom);

    public final void setAppliedLayerPropertiesValue$extension_style_release(Value value) {
        this.appliedLayerPropertiesValue = value;
    }

    public final void setDelegate$extension_style_release(MapboxStyleManager mapboxStyleManager) {
        this.delegate = mapboxStyleManager;
    }

    public final void setInternalSourceId$extension_style_release(String str) {
        this.internalSourceId = str;
    }

    public final void setProperty$extension_style_release(PropertyValue<?> property) {
        property.getClass();
        getLayerProperties().put(property.getPropertyName(), property);
        updateProperty(property);
    }

    public abstract Layer slot(String slot);

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[");
        Collection<PropertyValue<?>> collectionValues = getLayerProperties().values();
        collectionValues.getClass();
        return j.o(h0.k0(collectionValues, null, null, null, AnonymousClass1.INSTANCE, 31), "}]", sb3);
    }

    public abstract Layer visibility(Expression visibility);

    public abstract Layer visibility(Visibility visibility);

    public final void bindTo(MapboxStyleManager delegate) {
        delegate.getClass();
        bindTo(delegate, null);
    }
}
