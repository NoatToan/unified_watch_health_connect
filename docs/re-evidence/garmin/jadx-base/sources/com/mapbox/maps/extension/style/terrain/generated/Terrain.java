package com.mapbox.maps.extension.style.terrain.generated;

import am.j;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.StyleContract;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.p;
import e23.l;
import java.util.HashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u0002:\u00016B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\t2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000bJ\"\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u000e\u0018\u00012\u0006\u0010\u000f\u001a\u00020\u0003H\u0082\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001a\u001a\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\t0\u001cH\u0016¢\u0006\u0004\b\u001a\u0010\u001fJ\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020 H\u0016¢\u0006\u0004\b\u0017\u0010!J\u0017\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&R$\u0010#\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010%R8\u0010-\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070+j\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007`,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u00105\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/mapbox/maps/extension/style/terrain/generated/Terrain;", "Lcom/mapbox/maps/extension/style/terrain/generated/TerrainDslReceiver;", "Lcom/mapbox/maps/extension/style/StyleContract$StyleTerrainExtension;", "", "sourceId", "<init>", "(Ljava/lang/String;)V", "Lcom/mapbox/maps/extension/style/layers/properties/PropertyValue;", "property", "", "setProperty", "(Lcom/mapbox/maps/extension/style/layers/properties/PropertyValue;)V", "propertyValue", "updateProperty", "T", "propertyName", "getPropertyValue", "(Ljava/lang/String;)Ljava/lang/Object;", "transitionName", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getTransitionProperty", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/types/StyleTransition;", "", "exaggeration", "(D)Lcom/mapbox/maps/extension/style/terrain/generated/Terrain;", "options", "exaggerationTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/terrain/generated/Terrain;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/terrain/generated/Terrain;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/terrain/generated/Terrain;", "Lcom/mapbox/maps/MapboxStyleManager;", "delegate", "bindTo", "(Lcom/mapbox/maps/MapboxStyleManager;)V", "Ljava/lang/String;", "Lcom/mapbox/maps/MapboxStyleManager;", "getDelegate$extension_style_release", "()Lcom/mapbox/maps/MapboxStyleManager;", "setDelegate$extension_style_release", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "properties", "Ljava/util/HashMap;", "getExaggeration", "()Ljava/lang/Double;", "getExaggerationTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getExaggerationAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "exaggerationAsExpression", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Terrain implements TerrainDslReceiver, StyleContract.StyleTerrainExtension {
    private static final String TAG = "Mbgl-Terrain";
    private MapboxStyleManager delegate;
    private final HashMap<String, PropertyValue<?>> properties;
    private final String sourceId;

    public Terrain(String str) {
        str.getClass();
        this.sourceId = str;
        this.properties = new HashMap<>();
    }

    private final <T> T getPropertyValue(String propertyName) {
        MapboxStyleManager mapboxStyleManager = this.delegate;
        if (mapboxStyleManager == null) {
            p.n(j.m("Get property ", propertyName, " failed: terrain is not added to style yet."));
            return null;
        }
        try {
            mapboxStyleManager.getStyleTerrainProperty(propertyName);
            s.l();
            throw null;
        } catch (RuntimeException e4) {
            e4.getMessage();
            mapboxStyleManager.getStyleTerrainProperty(propertyName).toString();
            return null;
        }
    }

    private final StyleTransition getTransitionProperty(String transitionName) {
        MapboxStyleManager mapboxStyleManager = this.delegate;
        if (mapboxStyleManager == null) {
            p.n(j.m("Get property ", transitionName, " failed: terrain is not added to style yet."));
            return null;
        }
        try {
            Object contents = mapboxStyleManager.getStyleTerrainProperty(transitionName).getValue().getContents();
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
            e4.getMessage();
            mapboxStyleManager.getStyleTerrainProperty(transitionName).toString();
            return null;
        }
    }

    private final void setProperty(PropertyValue<?> property) {
        this.properties.put(property.getPropertyName(), property);
        updateProperty(property);
    }

    private final void updateProperty(PropertyValue<?> propertyValue) {
        String error;
        MapboxStyleManager mapboxStyleManager = this.delegate;
        Expected<String, None> styleTerrainProperty = mapboxStyleManager != null ? mapboxStyleManager.setStyleTerrainProperty(propertyValue.getPropertyName(), propertyValue.getValue()) : null;
        if (styleTerrainProperty == null || (error = styleTerrainProperty.getError()) == null) {
            return;
        }
        p.n("Set terrain property failed: ".concat(error));
    }

    @Override // com.mapbox.maps.extension.style.StyleContract.StyleTerrainExtension
    public void bindTo(MapboxStyleManager delegate) {
        delegate.getClass();
        this.delegate = delegate;
        HashMap map = new HashMap();
        map.put("source", new Value(this.sourceId));
        for (Map.Entry<String, PropertyValue<?>> entry : this.properties.entrySet()) {
            map.put(entry.getKey(), entry.getValue().getValue());
        }
        String error = delegate.setStyleTerrain(new Value((HashMap<String, Value>) map)).getError();
        if (error == null) {
            return;
        }
        p.n("Set terrain failed: ".concat(error));
    }

    @Override // com.mapbox.maps.extension.style.terrain.generated.TerrainDslReceiver
    public Terrain exaggeration(double exaggeration) {
        setProperty(new PropertyValue<>("exaggeration", Double.valueOf(exaggeration)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.terrain.generated.TerrainDslReceiver
    public Terrain exaggerationTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        exaggerationTransition(builder.build());
        return this;
    }

    /* JADX INFO: renamed from: getDelegate$extension_style_release, reason: from getter */
    public final MapboxStyleManager getDelegate() {
        return this.delegate;
    }

    public final Double getExaggeration() {
        Object objUnwrap;
        MapboxStyleManager mapboxStyleManager = this.delegate;
        if (mapboxStyleManager == null) {
            p.n("Get property exaggeration failed: terrain is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(mapboxStyleManager.getStyleTerrainProperty("exaggeration"), Double.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            mapboxStyleManager.getStyleTerrainProperty("exaggeration").toString();
            objUnwrap = null;
        }
        return (Double) objUnwrap;
    }

    public final Expression getExaggerationAsExpression() {
        Object objUnwrap;
        MapboxStyleManager mapboxStyleManager = this.delegate;
        if (mapboxStyleManager == null) {
            p.n("Get property exaggeration failed: terrain is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(mapboxStyleManager.getStyleTerrainProperty("exaggeration"), Expression.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            mapboxStyleManager.getStyleTerrainProperty("exaggeration").toString();
            objUnwrap = null;
        }
        Expression expression = (Expression) objUnwrap;
        if (expression != null) {
            return expression;
        }
        Double exaggeration = getExaggeration();
        if (exaggeration == null) {
            return null;
        }
        return Expression.INSTANCE.literal(exaggeration.doubleValue());
    }

    public final StyleTransition getExaggerationTransition() {
        return getTransitionProperty("exaggeration-transition");
    }

    public final void setDelegate$extension_style_release(MapboxStyleManager mapboxStyleManager) {
        this.delegate = mapboxStyleManager;
    }

    @Override // com.mapbox.maps.extension.style.terrain.generated.TerrainDslReceiver
    public Terrain exaggeration(Expression exaggeration) {
        setProperty(p.c("exaggeration", exaggeration, exaggeration));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.terrain.generated.TerrainDslReceiver
    public Terrain exaggerationTransition(StyleTransition options) {
        setProperty(p.b(options, "exaggeration-transition", options));
        return this;
    }
}
