package com.mapbox.maps.extension.style.utils;

import com.google.gson.JsonPrimitive;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.TileCacheBudget;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.properties.generated.LayerProperty;
import com.mapbox.maps.extension.style.light.LightPosition;
import com.mapbox.maps.extension.style.sources.SourceUtils;
import com.mapbox.maps.extension.style.types.Formatted;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.p;
import i3.e5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p13.y;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001¨\u0006\u0006"}, d2 = {"Lcom/mapbox/maps/extension/style/utils/TypeUtils;", "", "()V", "wrapToValue", "Lcom/mapbox/bindgen/Value;", "value", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class TypeUtils {
    public static final TypeUtils INSTANCE = new TypeUtils();

    private TypeUtils() {
    }

    public final Value wrapToValue(Object value) {
        value.getClass();
        if (!(value instanceof Value) && !(value instanceof Expression)) {
            if (value instanceof Formatted) {
                return ((Formatted) value).toValue();
            }
            if (value instanceof StyleTransition) {
                return ((StyleTransition) value).toValue();
            }
            if (value instanceof LayerProperty) {
                return new Value(((LayerProperty) value).getValue());
            }
            if (value instanceof LightPosition) {
                return ((LightPosition) value).toValue();
            }
            if (value instanceof TileCacheBudget) {
                return SourceUtils.toValue((TileCacheBudget) value);
            }
            if (value instanceof Integer) {
                return new Value(((Number) value).intValue());
            }
            if (value instanceof String) {
                return new Value((String) value);
            }
            if (value instanceof Boolean) {
                return new Value(((Boolean) value).booleanValue());
            }
            if (value instanceof Double) {
                Number number = (Number) value;
                double dDoubleValue = number.doubleValue();
                if (!Double.isInfinite(dDoubleValue) && !Double.isNaN(dDoubleValue)) {
                    return new Value(number.doubleValue());
                }
                h.s("Value can not be Double.NaN, Double.POSITIVE_INFINITY or Double.NEGATIVE_INFINITY");
                return null;
            }
            if (value instanceof Float) {
                Number number2 = (Number) value;
                float fFloatValue = number2.floatValue();
                if (!Float.isInfinite(fFloatValue) && !Float.isNaN(fFloatValue)) {
                    return new Value(number2.floatValue());
                }
                h.s("Value can not be Float.NaN, Float.POSITIVE_INFINITY or Float.NEGATIVE_INFINITY");
                return null;
            }
            if (value instanceof Long) {
                return new Value(((Number) value).longValue());
            }
            int i14 = 0;
            if (value instanceof int[]) {
                int[] iArr = (int[]) value;
                ArrayList arrayList = new ArrayList(iArr.length);
                int length = iArr.length;
                while (i14 < length) {
                    arrayList.add(INSTANCE.wrapToValue(Long.valueOf(iArr[i14])));
                    i14++;
                }
                return new Value((List<Value>) arrayList);
            }
            if (value instanceof boolean[]) {
                boolean[] zArr = (boolean[]) value;
                ArrayList arrayList2 = new ArrayList(zArr.length);
                int length2 = zArr.length;
                while (i14 < length2) {
                    arrayList2.add(wrapToValue(Boolean.valueOf(zArr[i14])));
                    i14++;
                }
                return new Value((List<Value>) arrayList2);
            }
            if (value instanceof double[]) {
                double[] dArr = (double[]) value;
                ArrayList arrayList3 = new ArrayList(dArr.length);
                int length3 = dArr.length;
                while (i14 < length3) {
                    arrayList3.add(wrapToValue(Double.valueOf(dArr[i14])));
                    i14++;
                }
                return new Value((List<Value>) arrayList3);
            }
            if (value instanceof float[]) {
                float[] fArr = (float[]) value;
                ArrayList arrayList4 = new ArrayList(fArr.length);
                int length4 = fArr.length;
                while (i14 < length4) {
                    arrayList4.add(INSTANCE.wrapToValue(Double.valueOf(fArr[i14])));
                    i14++;
                }
                return new Value((List<Value>) arrayList4);
            }
            if (value instanceof long[]) {
                long[] jArr = (long[]) value;
                ArrayList arrayList5 = new ArrayList(jArr.length);
                int length5 = jArr.length;
                while (i14 < length5) {
                    arrayList5.add(wrapToValue(Long.valueOf(jArr[i14])));
                    i14++;
                }
                return new Value((List<Value>) arrayList5);
            }
            if (value instanceof Object[]) {
                Object[] objArr = (Object[]) value;
                ArrayList arrayList6 = new ArrayList(objArr.length);
                int length6 = objArr.length;
                while (i14 < length6) {
                    Object obj = objArr[i14];
                    arrayList6.add(obj != null ? INSTANCE.wrapToValue(obj) : null);
                    i14++;
                }
                return new Value((List<Value>) arrayList6);
            }
            if (value instanceof List) {
                Iterable iterable = (Iterable) value;
                ArrayList arrayList7 = new ArrayList(y.r(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    arrayList7.add(next != null ? INSTANCE.wrapToValue(next) : null);
                }
                return new Value((List<Value>) arrayList7);
            }
            if (!(value instanceof HashMap)) {
                if (!(value instanceof JsonPrimitive)) {
                    p.o("Wrapping \"", value.getClass().getSimpleName(), "\" is not supported.");
                    return null;
                }
                JsonPrimitive jsonPrimitive = (JsonPrimitive) value;
                if (jsonPrimitive.isBoolean()) {
                    return new Value(jsonPrimitive.getAsBoolean());
                }
                if (jsonPrimitive.isNumber()) {
                    return new Value(jsonPrimitive.getAsDouble());
                }
                if (jsonPrimitive.isString()) {
                    return new Value(jsonPrimitive.getAsString());
                }
                h.s(e5.f(value, "Failed to parse JsonPrimitive: "));
                return null;
            }
            HashMap map = new HashMap();
            HashMap map2 = (HashMap) value;
            Set<String> setKeySet = map2.keySet();
            setKeySet.getClass();
            for (String str : setKeySet) {
                str.getClass();
                TypeUtils typeUtils = INSTANCE;
                Object obj2 = map2.get(str);
                obj2.getClass();
                map.put(str, typeUtils.wrapToValue(obj2));
            }
            return new Value((HashMap<String, Value>) map);
        }
        return (Value) value;
    }
}
