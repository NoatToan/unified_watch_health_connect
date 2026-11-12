package com.mapbox.maps.extension.style.utils;

import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.Geometry;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.StylePropertyValueKind;
import com.mapbox.maps.TransitionOptions;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.p;
import e23.l;
import j20.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.q;
import p13.r;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001c\u0010\b\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\u0000H\u0086\b¢\u0006\u0004\b\b\u0010\u0003\u001a%\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0007*\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\b\u0010\u000b\u001a\u0011\u0010\r\u001a\u00020\f*\u00020\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u000f\u001a\u00020\u0004*\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0011\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0006\u001a\u001c\u0010\u0013\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\u0012H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a%\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0007*\u00020\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0013\u0010\u0015\u001a\u0013\u0010\u0016\u001a\u00020\u0004*\u00020\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001e\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\u0012H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0014\u001a\u0011\u0010\u001a\u001a\u00020\u0000*\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001a\u001a\u00020\u0000*\u00020\u001c¢\u0006\u0004\b\u001a\u0010\u001d\u001a\u0011\u0010\u001a\u001a\u00020\u0000*\u00020\u001e¢\u0006\u0004\b\u001a\u0010\u001f\u001a'\u0010%\u001a\u00020$2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 H\u0086\bø\u0001\u0000¢\u0006\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, d2 = {"Lcom/mapbox/bindgen/Value;", "", "unwrapToAny", "(Lcom/mapbox/bindgen/Value;)Ljava/lang/Object;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "unwrapToLiteralExpression", "(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "T", "unwrapToTyped", "Ljava/lang/Class;", "clazz", "(Lcom/mapbox/bindgen/Value;Ljava/lang/Class;)Ljava/lang/Object;", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "unwrapToStyleTransition", "(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/maps/extension/style/types/StyleTransition;", "unwrapFromLiteralArray", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "unwrapToExpression", "Lcom/mapbox/maps/StylePropertyValue;", "unwrap", "(Lcom/mapbox/maps/StylePropertyValue;)Ljava/lang/Object;", "(Lcom/mapbox/maps/StylePropertyValue;Ljava/lang/Class;)Ljava/lang/Object;", "unwrapToExpressionOrLiteralExpression", "(Lcom/mapbox/maps/StylePropertyValue;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "silentUnwrap", "Lcom/mapbox/geojson/Feature;", "toValue", "(Lcom/mapbox/geojson/Feature;)Lcom/mapbox/bindgen/Value;", "Lcom/mapbox/geojson/FeatureCollection;", "(Lcom/mapbox/geojson/FeatureCollection;)Lcom/mapbox/bindgen/Value;", "Lcom/mapbox/geojson/Geometry;", "(Lcom/mapbox/geojson/Geometry;)Lcom/mapbox/bindgen/Value;", "Lkotlin/Function1;", "Lcom/mapbox/maps/TransitionOptions$Builder;", "", "block", "Lcom/mapbox/maps/TransitionOptions;", "transition", "(Le23/l;)Lcom/mapbox/maps/TransitionOptions;", "extension-style_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class TypeUtilsKt {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StylePropertyValueKind.values().length];
            try {
                iArr[StylePropertyValueKind.CONSTANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StylePropertyValueKind.TRANSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StylePropertyValueKind.EXPRESSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StylePropertyValueKind.UNDEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final <T> T silentUnwrap(StylePropertyValue stylePropertyValue) {
        stylePropertyValue.getClass();
        try {
            s.l();
            throw null;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static final Value toValue(Feature feature) {
        feature.getClass();
        TypeUtils typeUtils = TypeUtils.INSTANCE;
        String json = feature.toJson();
        json.getClass();
        return typeUtils.wrapToValue(json);
    }

    public static final TransitionOptions transition(l<? super TransitionOptions.Builder, Unit> lVar) {
        lVar.getClass();
        TransitionOptions.Builder builder = new TransitionOptions.Builder();
        lVar.invoke(builder);
        TransitionOptions transitionOptionsBuild = builder.build();
        transitionOptionsBuild.getClass();
        return transitionOptionsBuild;
    }

    public static final <T> T unwrap(StylePropertyValue stylePropertyValue, Class<T> cls) {
        stylePropertyValue.getClass();
        cls.getClass();
        int i14 = WhenMappings.$EnumSwitchMapping$0[stylePropertyValue.getKind().ordinal()];
        if (i14 == 1) {
            Value value = stylePropertyValue.getValue();
            value.getClass();
            return (T) unwrapToTyped(value, cls);
        }
        if (i14 == 2) {
            Value value2 = stylePropertyValue.getValue();
            value2.getClass();
            T t7 = (T) unwrapToStyleTransition(value2);
            if (cls.isInstance(t7)) {
                return t7;
            }
            e.m("Requested type ", cls.getSimpleName(), " doesn't match ", t7.getClass().getSimpleName());
            return null;
        }
        if (i14 != 3) {
            if (i14 != 4) {
                p.o("parsing ", stylePropertyValue.getKind(), " is not supported yet");
                return null;
            }
            h.s("Property is undefined");
            return null;
        }
        Value value3 = stylePropertyValue.getValue();
        value3.getClass();
        T t14 = (T) unwrapToExpression(value3);
        if (cls.isInstance(t14)) {
            return t14;
        }
        e.m("Requested type ", cls.getSimpleName(), " doesn't match ", t14.getClass().getSimpleName());
        return null;
    }

    public static final Expression unwrapFromLiteralArray(Expression expression) {
        expression.getClass();
        if (!(expression.getContents() instanceof List)) {
            return expression;
        }
        Object contents = expression.getContents();
        contents.getClass();
        List list = (List) contents;
        Object contents2 = ((Value) h0.b0(list)).getContents();
        if (!"literal".equals(contents2 instanceof String ? (String) contents2 : null)) {
            return expression;
        }
        Object contents3 = ((Value) h0.m0(list)).getContents();
        return contents3 instanceof List ? new Expression((List<? extends Object>) contents3) : expression;
    }

    public static final Object unwrapToAny(Value value) {
        value.getClass();
        Object contents = value.getContents();
        if ((contents instanceof Double) || (contents instanceof Long) || (contents instanceof Boolean) || (contents instanceof String) || (contents instanceof double[]) || (contents instanceof long[]) || (contents instanceof boolean[])) {
            return contents;
        }
        if (contents instanceof List) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) contents).iterator();
            while (it.hasNext()) {
                arrayList.add(unwrapToAny((Value) it.next()));
            }
            return arrayList;
        }
        if (!(contents instanceof HashMap)) {
            StringBuilder sb3 = new StringBuilder("unable to unwrap Value of content type: ");
            Object contents2 = value.getContents();
            sb3.append(contents2 != null ? contents2.getClass().getSimpleName() : null);
            throw new UnsupportedOperationException(sb3.toString());
        }
        HashMap map = (HashMap) contents;
        HashMap map2 = new HashMap();
        Set<String> setKeySet = map.keySet();
        setKeySet.getClass();
        for (String str : setKeySet) {
            Value value2 = (Value) map.get(str);
            if (value2 != null) {
                str.getClass();
                map2.put(str, unwrapToAny(value2));
            }
        }
        return map2;
    }

    public static final Expression unwrapToExpression(Value value) {
        value.getClass();
        Object contents = value.getContents();
        if (contents instanceof Double) {
            return Expression.INSTANCE.literal(((Number) contents).doubleValue());
        }
        if (contents instanceof Long) {
            return Expression.INSTANCE.literal(((Number) contents).longValue());
        }
        if (contents instanceof Boolean) {
            return Expression.INSTANCE.literal(((Boolean) contents).booleanValue());
        }
        if (contents instanceof String) {
            return Expression.INSTANCE.literal((String) contents);
        }
        if (!(contents instanceof List)) {
            if (contents instanceof HashMap) {
                return new Expression((HashMap<String, Value>) contents);
            }
            x.k(value, "unable to unwrap to Expression: ");
            return null;
        }
        List list = (List) contents;
        Object contents2 = ((Value) h0.b0(list)).getContents();
        String str = contents2 instanceof String ? (String) contents2 : null;
        if (str == null) {
            return new Expression((List<? extends Object>) list);
        }
        if ("literal".equals(str)) {
            Object contents3 = ((Value) h0.m0(list)).getContents();
            if (contents3 instanceof List) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) contents3).iterator();
                while (it.hasNext()) {
                    arrayList.add(unwrapToExpression((Value) it.next()));
                }
                return new Expression.ExpressionBuilder("literal").addArgument(new Expression(arrayList)).build();
            }
            if (contents3 instanceof HashMap) {
                HashMap<String, Object> map = new HashMap<>();
                for (Map.Entry entry : ((HashMap) contents3).entrySet()) {
                    map.put((String) entry.getKey(), unwrapToExpression((Value) entry.getValue()));
                }
                return Expression.INSTANCE.literal$extension_style_release(map);
            }
        } else if ("image".equals(str)) {
            Expression.ImageBuilder imageBuilder = new Expression.ImageBuilder();
            Iterator it3 = h0.U(list, 1).iterator();
            while (it3.hasNext()) {
                imageBuilder.addArgument(unwrapToExpression((Value) it3.next()));
            }
            return imageBuilder.build();
        }
        List listU = h0.U(list, 1);
        Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder(str);
        Iterator it4 = listU.iterator();
        while (it4.hasNext()) {
            expressionBuilder.addArgument(unwrapToExpression((Value) it4.next()));
        }
        return expressionBuilder.build();
    }

    public static final Expression unwrapToExpressionOrLiteralExpression(StylePropertyValue stylePropertyValue) {
        stylePropertyValue.getClass();
        int i14 = WhenMappings.$EnumSwitchMapping$0[stylePropertyValue.getKind().ordinal()];
        if (i14 == 1) {
            Value value = stylePropertyValue.getValue();
            value.getClass();
            return unwrapToLiteralExpression(value);
        }
        if (i14 != 3) {
            p.o("parsing [", stylePropertyValue.getKind(), "] as an expression is not supported");
            return null;
        }
        Value value2 = stylePropertyValue.getValue();
        value2.getClass();
        return unwrapToExpression(value2);
    }

    private static final Expression unwrapToLiteralExpression(Value value) {
        Object contents = value.getContents();
        if (contents instanceof Double) {
            return Expression.INSTANCE.literal(((Number) contents).doubleValue());
        }
        if (contents instanceof Long) {
            return Expression.INSTANCE.literal(((Number) contents).longValue());
        }
        if (contents instanceof Boolean) {
            return Expression.INSTANCE.literal(((Boolean) contents).booleanValue());
        }
        if (contents instanceof String) {
            return Expression.INSTANCE.literal((String) contents);
        }
        if (contents instanceof double[]) {
            return Expression.INSTANCE.literal$extension_style_release(new q((double[]) contents));
        }
        if (contents instanceof long[]) {
            return Expression.INSTANCE.literal$extension_style_release(new p13.p((long[]) contents));
        }
        if (contents instanceof boolean[]) {
            return Expression.INSTANCE.literal$extension_style_release(new r((boolean[]) contents));
        }
        if (contents instanceof List) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) contents).iterator();
            while (it.hasNext()) {
                arrayList.add(unwrapToAny((Value) it.next()));
            }
            return Expression.INSTANCE.literal$extension_style_release(arrayList);
        }
        if (!(contents instanceof HashMap)) {
            StringBuilder sb3 = new StringBuilder("unable to unwrap Value of content type: ");
            Object contents2 = value.getContents();
            sb3.append(contents2 != null ? contents2.getClass().getSimpleName() : null);
            throw new UnsupportedOperationException(sb3.toString());
        }
        HashMap map = (HashMap) contents;
        HashMap<String, Object> map2 = new HashMap<>();
        Set<String> setKeySet = map.keySet();
        setKeySet.getClass();
        for (String str : setKeySet) {
            Value value2 = (Value) map.get(str);
            if (value2 != null) {
                str.getClass();
                map2.put(str, unwrapToAny(value2));
            }
        }
        return Expression.INSTANCE.literal$extension_style_release(map2);
    }

    public static final StyleTransition unwrapToStyleTransition(Value value) {
        value.getClass();
        Object contents = value.getContents();
        if (!(contents instanceof HashMap)) {
            if (!(contents instanceof List)) {
                x.k(value, "unable to unwrap to StyleTransition: ");
                return null;
            }
            List list = (List) contents;
            StyleTransition.Builder builder = new StyleTransition.Builder();
            Object contents2 = ((Value) list.get(0)).getContents();
            contents2.getClass();
            builder.duration(((Long) contents2).longValue());
            Object contents3 = ((Value) list.get(1)).getContents();
            contents3.getClass();
            builder.delay(((Long) contents3).longValue());
            return builder.build();
        }
        StyleTransition.Builder builder2 = new StyleTransition.Builder();
        HashMap map = (HashMap) contents;
        Value value2 = (Value) map.get("delay");
        if (value2 != null) {
            Object contents4 = value2.getContents();
            contents4.getClass();
            builder2.delay(((Long) contents4).longValue());
        }
        Value value3 = (Value) map.get("duration");
        if (value3 != null) {
            Object contents5 = value3.getContents();
            contents5.getClass();
            builder2.duration(((Long) contents5).longValue());
        }
        return builder2.build();
    }

    public static final <T> T unwrapToTyped(Value value, Class<T> cls) {
        value.getClass();
        cls.getClass();
        T t7 = (T) unwrapToAny(value);
        if (cls.isInstance(t7)) {
            return t7;
        }
        throw new UnsupportedOperationException("Requested type " + cls.getSimpleName() + " doesn't match " + t7.getClass().getSimpleName());
    }

    public static final Value toValue(FeatureCollection featureCollection) {
        featureCollection.getClass();
        TypeUtils typeUtils = TypeUtils.INSTANCE;
        String json = featureCollection.toJson();
        json.getClass();
        return typeUtils.wrapToValue(json);
    }

    public static final Value toValue(Geometry geometry) {
        geometry.getClass();
        TypeUtils typeUtils = TypeUtils.INSTANCE;
        String json = geometry.toJson();
        json.getClass();
        return typeUtils.wrapToValue(json);
    }

    public static final <T> T unwrapToTyped(Value value) {
        value.getClass();
        s.l();
        throw null;
    }

    public static final <T> T unwrap(StylePropertyValue stylePropertyValue) {
        stylePropertyValue.getClass();
        s.l();
        throw null;
    }
}
