package com.mapbox.maps.extension.style.sources;

import am.j;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleException;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.StylePropertyValueKind;
import com.mapbox.maps.extension.style.StyleContract;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.sources.generated.RasterArraySource;
import com.mapbox.maps.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o13.l;
import o13.m;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u0000 72\u00020\u0001:\u00017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\r2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0002H ¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001d\u001a\u00020\r2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001c\u0010\u000fJ\u001b\u0010 \u001a\u00020\r2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\"\u0010%\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010!\u0018\u00012\u0006\u0010\"\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0011R?\u0010/\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0)j\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t`*8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R?\u00102\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0)j\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t`*8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010.R$\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u0010\u001b¨\u00068"}, d2 = {"Lcom/mapbox/maps/extension/style/sources/Source;", "Lcom/mapbox/maps/extension/style/StyleContract$StyleSourceExtension;", "", "sourceId", "<init>", "(Ljava/lang/String;)V", "Lcom/mapbox/bindgen/Value;", "getCachedSourceProperties", "()Lcom/mapbox/bindgen/Value;", "Lcom/mapbox/maps/extension/style/layers/properties/PropertyValue;", "property", "", "throwRuntimeException", "", "updateProperty", "(Lcom/mapbox/maps/extension/style/layers/properties/PropertyValue;Z)V", "getType$extension_style_release", "()Ljava/lang/String;", "getType", "Lcom/mapbox/maps/MapboxStyleManager;", TtmlNode.TAG_STYLE, "Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/bindgen/None;", "addSource", "(Lcom/mapbox/maps/MapboxStyleManager;)Lcom/mapbox/bindgen/Expected;", "delegate", "bindTo", "(Lcom/mapbox/maps/MapboxStyleManager;)V", "setProperty$extension_style_release", "setProperty", "setVolatileProperty$extension_style_release", "(Lcom/mapbox/maps/extension/style/layers/properties/PropertyValue;)V", "setVolatileProperty", "T", "propertyName", "getPropertyValue$extension_style_release", "(Ljava/lang/String;)Ljava/lang/Object;", "getPropertyValue", "toString", "Ljava/lang/String;", "getSourceId", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "sourceProperties$delegate", "Lo13/l;", "getSourceProperties$extension_style_release", "()Ljava/util/HashMap;", "sourceProperties", "volatileSourceProperties$delegate", "getVolatileSourceProperties$extension_style_release", "volatileSourceProperties", "Lcom/mapbox/maps/MapboxStyleManager;", "getDelegate$extension_style_release", "()Lcom/mapbox/maps/MapboxStyleManager;", "setDelegate$extension_style_release", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class Source implements StyleContract.StyleSourceExtension {
    private static final String TAG = "Mbgl-Source";
    private MapboxStyleManager delegate;
    private final String sourceId;

    /* JADX INFO: renamed from: sourceProperties$delegate, reason: from kotlin metadata */
    private final l sourceProperties;

    /* JADX INFO: renamed from: volatileSourceProperties$delegate, reason: from kotlin metadata */
    private final l volatileSourceProperties;

    /* JADX INFO: renamed from: com.mapbox.maps.extension.style.sources.Source$toString$1, reason: invalid class name */
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

    public Source(String str) {
        str.getClass();
        this.sourceId = str;
        this.sourceProperties = m.b(new Source$sourceProperties$2(this));
        this.volatileSourceProperties = m.b(Source$volatileSourceProperties$2.INSTANCE);
    }

    private final Value getCachedSourceProperties() {
        HashMap map = new HashMap();
        Collection<PropertyValue<?>> collectionValues = getSourceProperties$extension_style_release().values();
        collectionValues.getClass();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            PropertyValue propertyValue = (PropertyValue) it.next();
            map.put(propertyValue.getPropertyName(), propertyValue.getValue());
        }
        return new Value((HashMap<String, Value>) map);
    }

    public static /* synthetic */ void setProperty$extension_style_release$default(Source source, PropertyValue propertyValue, boolean z14, int i14, Object obj) {
        if (obj != null) {
            e.w("Super calls with default arguments not supported in this target, function: setProperty");
            return;
        }
        if ((i14 & 2) != 0) {
            z14 = true;
        }
        source.setProperty$extension_style_release(propertyValue, z14);
    }

    private final void updateProperty(PropertyValue<?> property, boolean throwRuntimeException) {
        MapboxStyleManager mapboxStyleManager = this.delegate;
        if (mapboxStyleManager != null) {
            try {
                String error = mapboxStyleManager.setStyleSourceProperty(this.sourceId, property.getPropertyName(), property.getValue()).getError();
                if (error != null) {
                    String str = "Set source property \"" + property.getPropertyName() + "\" failed:\nError: " + error + "\nValue set: " + property.getValue();
                    if (throwRuntimeException) {
                        throw new MapboxStyleException(str);
                    }
                    MapboxLogger.logE(TAG, str);
                    Unit unit = Unit.INSTANCE;
                }
            } catch (IllegalStateException e4) {
                if (throwRuntimeException) {
                    throw e4;
                }
                String message = e4.getMessage();
                if (message == null) {
                    message = "";
                }
                MapboxLogger.logE(TAG, message);
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    public static /* synthetic */ void updateProperty$default(Source source, PropertyValue propertyValue, boolean z14, int i14, Object obj) {
        if (obj != null) {
            e.w("Super calls with default arguments not supported in this target, function: updateProperty");
            return;
        }
        if ((i14 & 2) != 0) {
            z14 = true;
        }
        source.updateProperty(propertyValue, z14);
    }

    public Expected<String, None> addSource(MapboxStyleManager style) {
        style.getClass();
        return style.addStyleSource(this.sourceId, getCachedSourceProperties());
    }

    @Override // com.mapbox.maps.extension.style.StyleContract.StyleSourceExtension
    public void bindTo(MapboxStyleManager delegate) {
        delegate.getClass();
        this.delegate = delegate;
        String error = addSource(delegate).getError();
        if (error != null) {
            getCachedSourceProperties().toString();
            p.n("Add source failed: ".concat(error));
        } else {
            Iterator<Map.Entry<String, PropertyValue<?>>> it = getVolatileSourceProperties$extension_style_release().entrySet().iterator();
            while (it.hasNext()) {
                updateProperty$default(this, it.next().getValue(), false, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: getDelegate$extension_style_release, reason: from getter */
    public final MapboxStyleManager getDelegate() {
        return this.delegate;
    }

    public final <T> T getPropertyValue$extension_style_release(String propertyName) {
        propertyName.getClass();
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            p.n(j.m("Couldn't get ", propertyName, ": source is not added to style yet."));
            return null;
        }
        try {
            StylePropertyValue styleSourceProperty = delegate.getStyleSourceProperty(getSourceId(), propertyName);
            if (!propertyName.equals("rasterLayers") || styleSourceProperty.getKind() != StylePropertyValueKind.CONSTANT) {
                if (!propertyName.equals("tile-cache-budget") || styleSourceProperty.getKind() != StylePropertyValueKind.CONSTANT) {
                    s.l();
                    throw null;
                }
                Value value = styleSourceProperty.getValue();
                value.getClass();
                SourceUtils.unwrapToTileCacheBudget(value);
                s.l();
                throw null;
            }
            Object contents = styleSourceProperty.getValue().getContents();
            contents.getClass();
            Set setEntrySet = ((HashMap) contents).entrySet();
            setEntrySet.getClass();
            Set<Map.Entry> set = setEntrySet;
            ArrayList arrayList = new ArrayList(y.r(set, 10));
            for (Map.Entry entry : set) {
                Object key = entry.getKey();
                key.getClass();
                String str = (String) key;
                Object contents2 = ((Value) entry.getValue()).getContents();
                contents2.getClass();
                List list = (List) contents2;
                ArrayList arrayList2 = new ArrayList(y.r(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    Object contents3 = ((Value) it.next()).getContents();
                    contents3.getClass();
                    arrayList2.add((String) contents3);
                }
                arrayList.add(new RasterArraySource.RasterDataLayer(str, arrayList2));
            }
            s.l();
            throw null;
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate.getStyleSourceProperty(getSourceId(), propertyName).getValue().toJson();
            return null;
        }
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public final HashMap<String, PropertyValue<?>> getSourceProperties$extension_style_release() {
        return (HashMap) this.sourceProperties.getValue();
    }

    public abstract String getType$extension_style_release();

    public final HashMap<String, PropertyValue<?>> getVolatileSourceProperties$extension_style_release() {
        return (HashMap) this.volatileSourceProperties.getValue();
    }

    public final void setDelegate$extension_style_release(MapboxStyleManager mapboxStyleManager) {
        this.delegate = mapboxStyleManager;
    }

    public final void setProperty$extension_style_release(PropertyValue<?> property, boolean throwRuntimeException) {
        property.getClass();
        getSourceProperties$extension_style_release().put(property.getPropertyName(), property);
        updateProperty(property, throwRuntimeException);
    }

    public final void setVolatileProperty$extension_style_release(PropertyValue<?> property) {
        property.getClass();
        getVolatileSourceProperties$extension_style_release().put(property.getPropertyName(), property);
        updateProperty$default(this, property, false, 2, null);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[sourceId = ");
        sb3.append(this.sourceId);
        sb3.append(", ");
        Collection<PropertyValue<?>> collectionValues = getSourceProperties$extension_style_release().values();
        collectionValues.getClass();
        return j.o(h0.k0(collectionValues, null, null, null, AnonymousClass1.INSTANCE, 31), "}]", sb3);
    }
}
