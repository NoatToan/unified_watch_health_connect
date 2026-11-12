package com.mapbox.maps.extension.style.light;

import am.j;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.p;
import hb.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import o13.l;
import o13.m;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import p13.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 32\u00020\u0001:\u00013B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\t2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\nH ¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\t\u0018\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0080\b¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\u00062\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\u0017\u0010\bJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u0011R$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R?\u0010,\u001a&\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040&j\u0012\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004`'8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R7\u00100\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020-0&j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020-`'8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+R\u0014\u00102\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0011¨\u00064"}, d2 = {"Lcom/mapbox/maps/extension/style/light/Light;", "", "<init>", "()V", "Lcom/mapbox/maps/extension/style/layers/properties/PropertyValue;", "propertyValue", "", "updateProperty", "(Lcom/mapbox/maps/extension/style/layers/properties/PropertyValue;)V", "T", "", "propertyName", "Ljava/lang/Class;", "clazz", "getPropertyValueWithType", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "getType$extension_style_release", "()Ljava/lang/String;", "getType", "getPropertyValue$extension_style_release", "(Ljava/lang/String;)Ljava/lang/Object;", "getPropertyValue", "property", "setProperty$extension_style_release", "setProperty", "transitionName", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getTransitionProperty$extension_style_release", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getTransitionProperty", "toString", "Lcom/mapbox/maps/MapboxStyleManager;", "delegate", "Lcom/mapbox/maps/MapboxStyleManager;", "getDelegate$extension_style_release", "()Lcom/mapbox/maps/MapboxStyleManager;", "setDelegate$extension_style_release", "(Lcom/mapbox/maps/MapboxStyleManager;)V", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "lightProperties$delegate", "Lo13/l;", "getLightProperties$extension_style_release", "()Ljava/util/HashMap;", "lightProperties", "Lcom/mapbox/bindgen/Value;", "internalLightProperties$delegate", "getInternalLightProperties$extension_style_release", "internalLightProperties", "getLightId", "lightId", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class Light {
    private static final String TAG = "Mbgl-Light";
    private MapboxStyleManager delegate;

    /* JADX INFO: renamed from: lightProperties$delegate, reason: from kotlin metadata */
    private final l lightProperties = m.b(Light$lightProperties$2.INSTANCE);

    /* JADX INFO: renamed from: internalLightProperties$delegate, reason: from kotlin metadata */
    private final l internalLightProperties = m.b(new Light$internalLightProperties$2(this));

    /* JADX INFO: renamed from: com.mapbox.maps.extension.style.light.Light$toString$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "propertyValue", "Lcom/mapbox/maps/extension/style/layers/properties/PropertyValue;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements e23.l<PropertyValue<?>, CharSequence> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // e23.l
        public final CharSequence invoke(PropertyValue<?> propertyValue) {
            propertyValue.getClass();
            return propertyValue.getPropertyName() + " = " + propertyValue.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> T getPropertyValueWithType(String propertyName, Class<T> clazz) {
        MapboxStyleManager mapboxStyleManager = this.delegate;
        if (mapboxStyleManager == null) {
            p.n(j.m("Get property ", propertyName, " failed: light is not added to style yet."));
            return null;
        }
        try {
            return (T) TypeUtilsKt.unwrap(mapboxStyleManager.getStyleLightProperty(getLightId(), propertyName), clazz);
        } catch (RuntimeException e4) {
            StringBuilder sbL = a.l("Get light property ", propertyName, " failed: ");
            sbL.append(e4.getMessage());
            MapboxLogger.logE(TAG, sbL.toString());
            String string = mapboxStyleManager.getStyleLightProperty(getLightId(), propertyName).toString();
            string.getClass();
            MapboxLogger.logE(TAG, string);
            return null;
        }
    }

    private final void updateProperty(PropertyValue<?> propertyValue) {
        String error;
        MapboxStyleManager mapboxStyleManager = this.delegate;
        Expected<String, None> styleLightProperty = mapboxStyleManager != null ? mapboxStyleManager.setStyleLightProperty(getLightId(), propertyValue.getPropertyName(), propertyValue.getValue()) : null;
        if (styleLightProperty == null || (error = styleLightProperty.getError()) == null) {
            return;
        }
        p.n("Set light property failed: ".concat(error));
    }

    /* JADX INFO: renamed from: getDelegate$extension_style_release, reason: from getter */
    public final MapboxStyleManager getDelegate() {
        return this.delegate;
    }

    public final HashMap<String, Value> getInternalLightProperties$extension_style_release() {
        return (HashMap) this.internalLightProperties.getValue();
    }

    public abstract String getLightId();

    public final HashMap<String, PropertyValue<?>> getLightProperties$extension_style_release() {
        return (HashMap) this.lightProperties.getValue();
    }

    public final <T> T getPropertyValue$extension_style_release(String propertyName) {
        propertyName.getClass();
        s.l();
        throw null;
    }

    public final StyleTransition getTransitionProperty$extension_style_release(String transitionName) {
        transitionName.getClass();
        MapboxStyleManager mapboxStyleManager = this.delegate;
        if (mapboxStyleManager == null) {
            p.n(j.m("Get property ", transitionName, " failed: light is not added to style yet."));
            return null;
        }
        try {
            Object contents = mapboxStyleManager.getStyleLightProperty(getLightId(), transitionName).getValue().getContents();
            contents.getClass();
            HashMap map = (HashMap) contents;
            Value value = (Value) map.get("duration");
            Object contents2 = value != null ? value.getContents() : null;
            contents2.getClass();
            long jLongValue = ((Long) contents2).longValue();
            Value value2 = (Value) map.get("delay");
            Object contents3 = value2 != null ? value2.getContents() : null;
            contents3.getClass();
            return new StyleTransition.Builder().delay(((Long) contents3).longValue()).duration(jLongValue).build();
        } catch (RuntimeException e4) {
            MapboxLogger.logE(TAG, "Get light property failed: " + e4.getMessage());
            String string = mapboxStyleManager.getStyleLightProperty(getLightId(), transitionName).toString();
            string.getClass();
            MapboxLogger.logE(TAG, string);
            return null;
        }
    }

    public abstract String getType$extension_style_release();

    public final void setDelegate$extension_style_release(MapboxStyleManager mapboxStyleManager) {
        this.delegate = mapboxStyleManager;
    }

    public final void setProperty$extension_style_release(PropertyValue<?> property) {
        property.getClass();
        getLightProperties$extension_style_release().put(property.getPropertyName(), property);
        updateProperty(property);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[");
        HashMap<String, Value> internalLightProperties$extension_style_release = getInternalLightProperties$extension_style_release();
        ArrayList arrayList = new ArrayList(internalLightProperties$extension_style_release.size());
        for (Map.Entry<String, Value> entry : internalLightProperties$extension_style_release.entrySet()) {
            arrayList.add(entry.getKey() + " = " + entry.getValue());
        }
        sb3.append(h0.k0(arrayList, ", ", null, null, null, 62));
        sb3.append(", ");
        Collection<PropertyValue<?>> collectionValues = getLightProperties$extension_style_release().values();
        collectionValues.getClass();
        return j.o(h0.k0(collectionValues, null, null, null, AnonymousClass2.INSTANCE, 31), "}]", sb3);
    }
}
