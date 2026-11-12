package com.mapbox.maps.plugin.annotation.generated;

import com.google.gson.JsonElement;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.Polygon;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.generated.FillLayer;
import com.mapbox.maps.extension.style.layers.properties.generated.FillElevationReference;
import com.mapbox.maps.extension.style.layers.properties.generated.FillTranslateAnchor;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.extension.style.utils.TypeUtils;
import com.mapbox.maps.plugin.annotation.AnnotationConfig;
import com.mapbox.maps.plugin.annotation.AnnotationManagerImpl;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import e23.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.q;
import p13.j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u008d\u000122\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0001:\u0002\u008d\u0001B\u0019\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0017\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030Z2\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001J\u0016\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030Z2\u0007\u0010\u0088\u0001\u001a\u00020\u001eJ\t\u0010\u0089\u0001\u001a\u00020\u001eH\u0016J\u0013\u0010\u008a\u0001\u001a\u00030\u008b\u00012\u0007\u0010\u008c\u0001\u001a\u00020\u001eH\u0014R(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R0\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00168G@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR.\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001e8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R.\u0010%\u001a\u0004\u0018\u00010\u001e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001e8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b&\u0010\u0019\u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R*\u0010)\u001a\u0004\u0018\u00010\u00162\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00168G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010\u001dR(\u0010,\u001a\u0004\u0018\u00010\u001e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010\"\"\u0004\b.\u0010$R.\u0010/\u001a\u0004\u0018\u00010\u001e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001e8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b0\u0010\u0019\u001a\u0004\b1\u0010\"\"\u0004\b2\u0010$R.\u00103\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u00108F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b4\u0010\u0019\u001a\u0004\b5\u0010\u0013\"\u0004\b6\u0010\u0015R.\u00108\u001a\u0004\u0018\u0001072\b\u0010\u000f\u001a\u0004\u0018\u0001078F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b9\u0010\u0019\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R(\u0010?\u001a\u0004\u0018\u00010>2\b\u0010\u000f\u001a\u0004\u0018\u00010>8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR(\u0010D\u001a\u0004\u0018\u00010>2\b\u0010\u000f\u001a\u0004\u0018\u00010>8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010A\"\u0004\bF\u0010CR*\u0010G\u001a\u0004\u0018\u00010\u00162\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00168G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010\u001b\"\u0004\bI\u0010\u001dR(\u0010J\u001a\u0004\u0018\u00010\u001e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010\"\"\u0004\bL\u0010$R.\u0010M\u001a\u0004\u0018\u00010\u001e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001e8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\bN\u0010\u0019\u001a\u0004\bO\u0010\"\"\u0004\bP\u0010$R(\u0010Q\u001a\u0004\u0018\u00010\u001e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010\"\"\u0004\bS\u0010$R(\u0010T\u001a\u0004\u0018\u00010>2\b\u0010\u000f\u001a\u0004\u0018\u00010>8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bU\u0010A\"\u0004\bV\u0010CR(\u0010W\u001a\u0004\u0018\u00010>2\b\u0010\u000f\u001a\u0004\u0018\u00010>8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010A\"\u0004\bY\u0010CR4\u0010[\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010Z2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010Z8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R(\u0010a\u001a\u0004\u0018\u00010`2\b\u0010\u000f\u001a\u0004\u0018\u00010`8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR0\u0010f\u001a\u0004\u0018\u00010\u00162\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00168G@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\bg\u0010\u0019\u001a\u0004\bh\u0010\u001b\"\u0004\bi\u0010\u001dR.\u0010j\u001a\u0004\u0018\u00010\u001e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001e8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\bk\u0010\u0019\u001a\u0004\bl\u0010\"\"\u0004\bm\u0010$R.\u0010n\u001a\u0004\u0018\u00010\u001e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001e8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\bo\u0010\u0019\u001a\u0004\bp\u0010\"\"\u0004\bq\u0010$R.\u0010r\u001a\u0004\u0018\u00010>2\b\u0010\u000f\u001a\u0004\u0018\u00010>8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\bs\u0010\u0019\u001a\u0004\bt\u0010A\"\u0004\bu\u0010CR(\u0010w\u001a\u0004\u0018\u00010v2\b\u0010\u000f\u001a\u0004\u0018\u00010v8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R(\u0010|\u001a\u0004\u0018\u00010>2\b\u0010\u000f\u001a\u0004\u0018\u00010>8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b}\u0010A\"\u0004\b~\u0010CR*\u0010\u007f\u001a\u0004\u0018\u00010>2\b\u0010\u000f\u001a\u0004\u0018\u00010>8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0080\u0001\u0010A\"\u0005\b\u0081\u0001\u0010CR+\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u001e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001e8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0083\u0001\u0010\"\"\u0005\b\u0084\u0001\u0010$¨\u0006\u008e\u0001"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/generated/PolygonAnnotationManager;", "Lcom/mapbox/maps/plugin/annotation/AnnotationManagerImpl;", "Lcom/mapbox/geojson/Polygon;", "Lcom/mapbox/maps/plugin/annotation/generated/PolygonAnnotation;", "Lcom/mapbox/maps/plugin/annotation/generated/PolygonAnnotationOptions;", "Lcom/mapbox/maps/plugin/annotation/generated/OnPolygonAnnotationDragListener;", "Lcom/mapbox/maps/plugin/annotation/generated/OnPolygonAnnotationClickListener;", "Lcom/mapbox/maps/plugin/annotation/generated/OnPolygonAnnotationLongClickListener;", "Lcom/mapbox/maps/plugin/annotation/generated/OnPolygonAnnotationInteractionListener;", "Lcom/mapbox/maps/extension/style/layers/generated/FillLayer;", "delegateProvider", "Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "annotationConfig", "Lcom/mapbox/maps/plugin/annotation/AnnotationConfig;", "(Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;Lcom/mapbox/maps/plugin/annotation/AnnotationConfig;)V", "value", "", "fillAntialias", "getFillAntialias", "()Ljava/lang/Boolean;", "setFillAntialias", "(Ljava/lang/Boolean;)V", "", "fillBridgeGuardRailColorInt", "getFillBridgeGuardRailColorInt$annotations", "()V", "getFillBridgeGuardRailColorInt", "()Ljava/lang/Integer;", "setFillBridgeGuardRailColorInt", "(Ljava/lang/Integer;)V", "", "fillBridgeGuardRailColorString", "getFillBridgeGuardRailColorString$annotations", "getFillBridgeGuardRailColorString", "()Ljava/lang/String;", "setFillBridgeGuardRailColorString", "(Ljava/lang/String;)V", "fillBridgeGuardRailColorUseTheme", "getFillBridgeGuardRailColorUseTheme$annotations", "getFillBridgeGuardRailColorUseTheme", "setFillBridgeGuardRailColorUseTheme", "fillColorInt", "getFillColorInt", "setFillColorInt", "fillColorString", "getFillColorString", "setFillColorString", "fillColorUseTheme", "getFillColorUseTheme$annotations", "getFillColorUseTheme", "setFillColorUseTheme", "fillConstructBridgeGuardRail", "getFillConstructBridgeGuardRail$annotations", "getFillConstructBridgeGuardRail", "setFillConstructBridgeGuardRail", "Lcom/mapbox/maps/extension/style/layers/properties/generated/FillElevationReference;", "fillElevationReference", "getFillElevationReference$annotations", "getFillElevationReference", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/FillElevationReference;", "setFillElevationReference", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/FillElevationReference;)V", "", "fillEmissiveStrength", "getFillEmissiveStrength", "()Ljava/lang/Double;", "setFillEmissiveStrength", "(Ljava/lang/Double;)V", "fillOpacity", "getFillOpacity", "setFillOpacity", "fillOutlineColorInt", "getFillOutlineColorInt", "setFillOutlineColorInt", "fillOutlineColorString", "getFillOutlineColorString", "setFillOutlineColorString", "fillOutlineColorUseTheme", "getFillOutlineColorUseTheme$annotations", "getFillOutlineColorUseTheme", "setFillOutlineColorUseTheme", "fillPattern", "getFillPattern", "setFillPattern", "fillPatternCrossFade", "getFillPatternCrossFade", "setFillPatternCrossFade", "fillSortKey", "getFillSortKey", "setFillSortKey", "", "fillTranslate", "getFillTranslate", "()Ljava/util/List;", "setFillTranslate", "(Ljava/util/List;)V", "Lcom/mapbox/maps/extension/style/layers/properties/generated/FillTranslateAnchor;", "fillTranslateAnchor", "getFillTranslateAnchor", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/FillTranslateAnchor;", "setFillTranslateAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/FillTranslateAnchor;)V", "fillTunnelStructureColorInt", "getFillTunnelStructureColorInt$annotations", "getFillTunnelStructureColorInt", "setFillTunnelStructureColorInt", "fillTunnelStructureColorString", "getFillTunnelStructureColorString$annotations", "getFillTunnelStructureColorString", "setFillTunnelStructureColorString", "fillTunnelStructureColorUseTheme", "getFillTunnelStructureColorUseTheme$annotations", "getFillTunnelStructureColorUseTheme", "setFillTunnelStructureColorUseTheme", "fillZOffset", "getFillZOffset$annotations", "getFillZOffset", "setFillZOffset", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "layerFilter", "getLayerFilter", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "setLayerFilter", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)V", "maxZoom", "getMaxZoom", "setMaxZoom", "minZoom", "getMinZoom", "setMinZoom", "slot", "getSlot", "setSlot", "create", "featureCollection", "Lcom/mapbox/geojson/FeatureCollection;", "json", "getAnnotationIdKey", "setDataDrivenPropertyIsUsed", "", "property", "Companion", "plugin-annotation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PolygonAnnotationManager extends AnnotationManagerImpl<Polygon, PolygonAnnotation, PolygonAnnotationOptions, OnPolygonAnnotationDragListener, OnPolygonAnnotationClickListener, OnPolygonAnnotationLongClickListener, OnPolygonAnnotationInteractionListener, FillLayer> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static AtomicLong ID_GENERATOR = new AtomicLong(0);

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.annotation.generated.PolygonAnnotationManager$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends q implements p<String, String, FillLayer> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2, FillLayer.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // e23.p
        public final FillLayer invoke(String str, String str2) {
            str.getClass();
            str2.getClass();
            return new FillLayer(str, str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolygonAnnotationManager(MapDelegateProvider mapDelegateProvider, AnnotationConfig annotationConfig) {
        super(mapDelegateProvider, annotationConfig, ID_GENERATOR.incrementAndGet(), "polygonAnnotation", AnonymousClass1.INSTANCE);
        mapDelegateProvider.getClass();
        Map<String, Boolean> dataDrivenPropertyUsageMap = getDataDrivenPropertyUsageMap();
        Boolean bool = Boolean.FALSE;
        dataDrivenPropertyUsageMap.put(PolygonAnnotationOptions.PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL, bool);
        getDataDrivenPropertyUsageMap().put(PolygonAnnotationOptions.PROPERTY_FILL_SORT_KEY, bool);
        getDataDrivenPropertyUsageMap().put(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR, bool);
        getDataDrivenPropertyUsageMap().put(PolygonAnnotationOptions.PROPERTY_FILL_COLOR, bool);
        getDataDrivenPropertyUsageMap().put(PolygonAnnotationOptions.PROPERTY_FILL_OPACITY, bool);
        getDataDrivenPropertyUsageMap().put(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR, bool);
        getDataDrivenPropertyUsageMap().put(PolygonAnnotationOptions.PROPERTY_FILL_PATTERN, bool);
        getDataDrivenPropertyUsageMap().put(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR, bool);
        getDataDrivenPropertyUsageMap().put(PolygonAnnotationOptions.PROPERTY_FILL_Z_OFFSET, bool);
        getDataDrivenPropertyUsageMap().put(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME, bool);
        getDataDrivenPropertyUsageMap().put(PolygonAnnotationOptions.PROPERTY_FILL_COLOR_USE_THEME, bool);
        getDataDrivenPropertyUsageMap().put(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR_USE_THEME, bool);
        getDataDrivenPropertyUsageMap().put(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME, bool);
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillBridgeGuardRailColorInt$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillBridgeGuardRailColorString$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillBridgeGuardRailColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillConstructBridgeGuardRail$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillElevationReference$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillOutlineColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillTunnelStructureColorInt$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillTunnelStructureColorString$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillTunnelStructureColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getFillZOffset$annotations() {
    }

    public final List<PolygonAnnotation> create(FeatureCollection featureCollection) {
        featureCollection.getClass();
        List<Feature> listFeatures = featureCollection.features();
        if (listFeatures == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        for (Feature feature : listFeatures) {
            PolygonAnnotationOptions.Companion companion = PolygonAnnotationOptions.INSTANCE;
            feature.getClass();
            PolygonAnnotationOptions polygonAnnotationOptionsFromFeature = companion.fromFeature(feature);
            if (polygonAnnotationOptionsFromFeature != null) {
                arrayList.add(polygonAnnotationOptionsFromFeature);
            }
        }
        return create(arrayList);
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManagerImpl
    public String getAnnotationIdKey() {
        return PolygonAnnotation.ID_KEY;
    }

    public final Boolean getFillAntialias() {
        return getLayer$plugin_annotation_release().getFillAntialias();
    }

    public final Integer getFillBridgeGuardRailColorInt() {
        Integer numE;
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR);
        if (jsonElement == null || (numE = com.mapbox.maps.p.e(jsonElement, ColorUtils.INSTANCE)) == null) {
            return null;
        }
        return Integer.valueOf(numE.intValue());
    }

    public final String getFillBridgeGuardRailColorString() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final String getFillBridgeGuardRailColorUseTheme() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final Integer getFillColorInt() {
        Integer numE;
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolygonAnnotationOptions.PROPERTY_FILL_COLOR);
        if (jsonElement == null || (numE = com.mapbox.maps.p.e(jsonElement, ColorUtils.INSTANCE)) == null) {
            return null;
        }
        return Integer.valueOf(numE.intValue());
    }

    public final String getFillColorString() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolygonAnnotationOptions.PROPERTY_FILL_COLOR);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final String getFillColorUseTheme() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolygonAnnotationOptions.PROPERTY_FILL_COLOR_USE_THEME);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final Boolean getFillConstructBridgeGuardRail() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolygonAnnotationOptions.PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL);
        if (jsonElement != null) {
            return Boolean.valueOf(Boolean.parseBoolean(jsonElement.getAsString()));
        }
        return null;
    }

    public final FillElevationReference getFillElevationReference() {
        return getLayer$plugin_annotation_release().getFillElevationReference();
    }

    public final Double getFillEmissiveStrength() {
        return getLayer$plugin_annotation_release().getFillEmissiveStrength();
    }

    public final Double getFillOpacity() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolygonAnnotationOptions.PROPERTY_FILL_OPACITY);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final Integer getFillOutlineColorInt() {
        Integer numE;
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR);
        if (jsonElement == null || (numE = com.mapbox.maps.p.e(jsonElement, ColorUtils.INSTANCE)) == null) {
            return null;
        }
        return Integer.valueOf(numE.intValue());
    }

    public final String getFillOutlineColorString() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final String getFillOutlineColorUseTheme() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR_USE_THEME);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final String getFillPattern() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolygonAnnotationOptions.PROPERTY_FILL_PATTERN);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final Double getFillPatternCrossFade() {
        return getLayer$plugin_annotation_release().getFillPatternCrossFade();
    }

    public final Double getFillSortKey() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolygonAnnotationOptions.PROPERTY_FILL_SORT_KEY);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    public final List<Double> getFillTranslate() {
        return getLayer$plugin_annotation_release().getFillTranslate();
    }

    public final FillTranslateAnchor getFillTranslateAnchor() {
        return getLayer$plugin_annotation_release().getFillTranslateAnchor();
    }

    public final Integer getFillTunnelStructureColorInt() {
        Integer numE;
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR);
        if (jsonElement == null || (numE = com.mapbox.maps.p.e(jsonElement, ColorUtils.INSTANCE)) == null) {
            return null;
        }
        return Integer.valueOf(numE.intValue());
    }

    public final String getFillTunnelStructureColorString() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final String getFillTunnelStructureColorUseTheme() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME);
        if (jsonElement != null) {
            return jsonElement.getAsString().toString();
        }
        return null;
    }

    public final Double getFillZOffset() {
        JsonElement jsonElement = getDataDrivenPropertyDefaultValues().get(PolygonAnnotationOptions.PROPERTY_FILL_Z_OFFSET);
        if (jsonElement != null) {
            return com.mapbox.maps.p.d(jsonElement);
        }
        return null;
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManagerImpl
    public Expression getLayerFilter() {
        return getLayer$plugin_annotation_release().getFilter();
    }

    public final Double getMaxZoom() {
        return getLayer$plugin_annotation_release().getMaxZoom();
    }

    public final Double getMinZoom() {
        return getLayer$plugin_annotation_release().getMinZoom();
    }

    public final String getSlot() {
        return getLayer$plugin_annotation_release().getSlot();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.mapbox.maps.plugin.annotation.AnnotationManagerImpl
    public void setDataDrivenPropertyIsUsed(String property) {
        property.getClass();
        switch (property.hashCode()) {
            case -2104747334:
                if (property.equals(PolygonAnnotationOptions.PROPERTY_FILL_SORT_KEY)) {
                    FillLayer layer$plugin_annotation_release = getLayer$plugin_annotation_release();
                    Expression.Companion companion = Expression.INSTANCE;
                    layer$plugin_annotation_release.fillSortKey(companion.get(PolygonAnnotationOptions.PROPERTY_FILL_SORT_KEY));
                    getDragLayer$plugin_annotation_release().fillSortKey(companion.get(PolygonAnnotationOptions.PROPERTY_FILL_SORT_KEY));
                    break;
                }
                break;
            case -1679439207:
                if (property.equals(PolygonAnnotationOptions.PROPERTY_FILL_COLOR)) {
                    FillLayer layer$plugin_annotation_release2 = getLayer$plugin_annotation_release();
                    Expression.Companion companion2 = Expression.INSTANCE;
                    layer$plugin_annotation_release2.fillColor(companion2.get(PolygonAnnotationOptions.PROPERTY_FILL_COLOR));
                    getDragLayer$plugin_annotation_release().fillColor(companion2.get(PolygonAnnotationOptions.PROPERTY_FILL_COLOR));
                    break;
                }
                break;
            case -1341964098:
                if (property.equals(PolygonAnnotationOptions.PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL)) {
                    FillLayer layer$plugin_annotation_release3 = getLayer$plugin_annotation_release();
                    Expression.Companion companion3 = Expression.INSTANCE;
                    layer$plugin_annotation_release3.fillConstructBridgeGuardRail(companion3.get(PolygonAnnotationOptions.PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL));
                    getDragLayer$plugin_annotation_release().fillConstructBridgeGuardRail(companion3.get(PolygonAnnotationOptions.PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL));
                    break;
                }
                break;
            case -1332788656:
                if (property.equals(PolygonAnnotationOptions.PROPERTY_FILL_Z_OFFSET)) {
                    FillLayer layer$plugin_annotation_release4 = getLayer$plugin_annotation_release();
                    Expression.Companion companion4 = Expression.INSTANCE;
                    layer$plugin_annotation_release4.fillZOffset(companion4.get(PolygonAnnotationOptions.PROPERTY_FILL_Z_OFFSET));
                    getDragLayer$plugin_annotation_release().fillZOffset(companion4.get(PolygonAnnotationOptions.PROPERTY_FILL_Z_OFFSET));
                    break;
                }
                break;
            case -1250124351:
                if (property.equals(PolygonAnnotationOptions.PROPERTY_FILL_OPACITY)) {
                    FillLayer layer$plugin_annotation_release5 = getLayer$plugin_annotation_release();
                    Expression.Companion companion5 = Expression.INSTANCE;
                    layer$plugin_annotation_release5.fillOpacity(companion5.get(PolygonAnnotationOptions.PROPERTY_FILL_OPACITY));
                    getDragLayer$plugin_annotation_release().fillOpacity(companion5.get(PolygonAnnotationOptions.PROPERTY_FILL_OPACITY));
                    break;
                }
                break;
            case -1206458112:
                if (property.equals(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME)) {
                    FillLayer layer$plugin_annotation_release6 = getLayer$plugin_annotation_release();
                    Expression.Companion companion6 = Expression.INSTANCE;
                    layer$plugin_annotation_release6.fillBridgeGuardRailColorUseTheme(companion6.get(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME));
                    getDragLayer$plugin_annotation_release().fillBridgeGuardRailColorUseTheme(companion6.get(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME));
                    break;
                }
                break;
            case -1093239542:
                if (property.equals(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR)) {
                    FillLayer layer$plugin_annotation_release7 = getLayer$plugin_annotation_release();
                    Expression.Companion companion7 = Expression.INSTANCE;
                    layer$plugin_annotation_release7.fillBridgeGuardRailColor(companion7.get(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR));
                    getDragLayer$plugin_annotation_release().fillBridgeGuardRailColor(companion7.get(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR));
                    break;
                }
                break;
            case -1008087089:
                if (property.equals(PolygonAnnotationOptions.PROPERTY_FILL_COLOR_USE_THEME)) {
                    FillLayer layer$plugin_annotation_release8 = getLayer$plugin_annotation_release();
                    Expression.Companion companion8 = Expression.INSTANCE;
                    layer$plugin_annotation_release8.fillColorUseTheme(companion8.get(PolygonAnnotationOptions.PROPERTY_FILL_COLOR_USE_THEME));
                    getDragLayer$plugin_annotation_release().fillColorUseTheme(companion8.get(PolygonAnnotationOptions.PROPERTY_FILL_COLOR_USE_THEME));
                    break;
                }
                break;
            case -774008506:
                if (property.equals(PolygonAnnotationOptions.PROPERTY_FILL_PATTERN)) {
                    FillLayer layer$plugin_annotation_release9 = getLayer$plugin_annotation_release();
                    Expression.Companion companion9 = Expression.INSTANCE;
                    layer$plugin_annotation_release9.fillPattern(companion9.get(PolygonAnnotationOptions.PROPERTY_FILL_PATTERN));
                    getDragLayer$plugin_annotation_release().fillPattern(companion9.get(PolygonAnnotationOptions.PROPERTY_FILL_PATTERN));
                    break;
                }
                break;
            case 293483940:
                if (property.equals(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME)) {
                    FillLayer layer$plugin_annotation_release10 = getLayer$plugin_annotation_release();
                    Expression.Companion companion10 = Expression.INSTANCE;
                    layer$plugin_annotation_release10.fillTunnelStructureColorUseTheme(companion10.get(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME));
                    getDragLayer$plugin_annotation_release().fillTunnelStructureColorUseTheme(companion10.get(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME));
                    break;
                }
                break;
            case 805371460:
                if (property.equals(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR_USE_THEME)) {
                    FillLayer layer$plugin_annotation_release11 = getLayer$plugin_annotation_release();
                    Expression.Companion companion11 = Expression.INSTANCE;
                    layer$plugin_annotation_release11.fillOutlineColorUseTheme(companion11.get(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR_USE_THEME));
                    getDragLayer$plugin_annotation_release().fillOutlineColorUseTheme(companion11.get(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR_USE_THEME));
                    break;
                }
                break;
            case 1201248078:
                if (property.equals(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR)) {
                    FillLayer layer$plugin_annotation_release12 = getLayer$plugin_annotation_release();
                    Expression.Companion companion12 = Expression.INSTANCE;
                    layer$plugin_annotation_release12.fillOutlineColor(companion12.get(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR));
                    getDragLayer$plugin_annotation_release().fillOutlineColor(companion12.get(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR));
                    break;
                }
                break;
            case 2121434798:
                if (property.equals(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR)) {
                    FillLayer layer$plugin_annotation_release13 = getLayer$plugin_annotation_release();
                    Expression.Companion companion13 = Expression.INSTANCE;
                    layer$plugin_annotation_release13.fillTunnelStructureColor(companion13.get(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR));
                    getDragLayer$plugin_annotation_release().fillTunnelStructureColor(companion13.get(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR));
                    break;
                }
                break;
        }
    }

    public final void setFillAntialias(Boolean bool) {
        setLayerProperty(bool != null ? TypeUtils.INSTANCE.wrapToValue(bool) : com.mapbox.maps.p.a("fill", "fill-antialias"), "fill-antialias");
    }

    public final void setFillBridgeGuardRailColorInt(Integer num) {
        if (num != null) {
            com.mapbox.maps.p.l(num, ColorUtils.INSTANCE, getDataDrivenPropertyDefaultValues(), PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR);
            enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR);
        }
        update(getAnnotations());
    }

    public final void setFillBridgeGuardRailColorString(String str) {
        if (str != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR, str);
            enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR);
        }
        update(getAnnotations());
    }

    public final void setFillBridgeGuardRailColorUseTheme(String str) {
        if (str != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME, str);
            enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolygonAnnotationOptions.PROPERTY_FILL_BRIDGE_GUARD_RAIL_COLOR_USE_THEME);
        }
        update(getAnnotations());
    }

    public final void setFillColorInt(Integer num) {
        if (num != null) {
            com.mapbox.maps.p.l(num, ColorUtils.INSTANCE, getDataDrivenPropertyDefaultValues(), PolygonAnnotationOptions.PROPERTY_FILL_COLOR);
            enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_COLOR);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolygonAnnotationOptions.PROPERTY_FILL_COLOR);
        }
        update(getAnnotations());
    }

    public final void setFillColorString(String str) {
        if (str != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PolygonAnnotationOptions.PROPERTY_FILL_COLOR, str);
            enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_COLOR);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolygonAnnotationOptions.PROPERTY_FILL_COLOR);
        }
        update(getAnnotations());
    }

    public final void setFillColorUseTheme(String str) {
        if (str != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PolygonAnnotationOptions.PROPERTY_FILL_COLOR_USE_THEME, str);
            enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_COLOR_USE_THEME);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolygonAnnotationOptions.PROPERTY_FILL_COLOR_USE_THEME);
        }
        update(getAnnotations());
    }

    public final void setFillConstructBridgeGuardRail(Boolean bool) {
        if (bool != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PolygonAnnotationOptions.PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL, bool);
            enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolygonAnnotationOptions.PROPERTY_FILL_CONSTRUCT_BRIDGE_GUARD_RAIL);
        }
        update(getAnnotations());
    }

    public final void setFillElevationReference(FillElevationReference fillElevationReference) {
        setLayerProperty(fillElevationReference != null ? TypeUtils.INSTANCE.wrapToValue(fillElevationReference) : com.mapbox.maps.p.a("fill", "fill-elevation-reference"), "fill-elevation-reference");
    }

    public final void setFillEmissiveStrength(Double d14) {
        setLayerProperty(d14 != null ? TypeUtils.INSTANCE.wrapToValue(d14) : com.mapbox.maps.p.a("fill", "fill-emissive-strength"), "fill-emissive-strength");
    }

    public final void setFillOpacity(Double d14) {
        if (d14 != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PolygonAnnotationOptions.PROPERTY_FILL_OPACITY, d14);
            enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_OPACITY);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolygonAnnotationOptions.PROPERTY_FILL_OPACITY);
        }
        update(getAnnotations());
    }

    public final void setFillOutlineColorInt(Integer num) {
        if (num != null) {
            com.mapbox.maps.p.l(num, ColorUtils.INSTANCE, getDataDrivenPropertyDefaultValues(), PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR);
            enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR);
        }
        update(getAnnotations());
    }

    public final void setFillOutlineColorString(String str) {
        if (str != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR, str);
            enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR);
        }
        update(getAnnotations());
    }

    public final void setFillOutlineColorUseTheme(String str) {
        if (str != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR_USE_THEME, str);
            enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR_USE_THEME);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolygonAnnotationOptions.PROPERTY_FILL_OUTLINE_COLOR_USE_THEME);
        }
        update(getAnnotations());
    }

    public final void setFillPattern(String str) {
        if (str != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PolygonAnnotationOptions.PROPERTY_FILL_PATTERN, str);
            enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_PATTERN);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolygonAnnotationOptions.PROPERTY_FILL_PATTERN);
        }
        update(getAnnotations());
    }

    public final void setFillPatternCrossFade(Double d14) {
        setLayerProperty(d14 != null ? TypeUtils.INSTANCE.wrapToValue(d14) : com.mapbox.maps.p.a("fill", "fill-pattern-cross-fade"), "fill-pattern-cross-fade");
    }

    public final void setFillSortKey(Double d14) {
        if (d14 != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PolygonAnnotationOptions.PROPERTY_FILL_SORT_KEY, d14);
            enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_SORT_KEY);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolygonAnnotationOptions.PROPERTY_FILL_SORT_KEY);
        }
        update(getAnnotations());
    }

    public final void setFillTranslate(List<Double> list) {
        setLayerProperty(list != null ? TypeUtils.INSTANCE.wrapToValue(list) : com.mapbox.maps.p.a("fill", "fill-translate"), "fill-translate");
    }

    public final void setFillTranslateAnchor(FillTranslateAnchor fillTranslateAnchor) {
        setLayerProperty(fillTranslateAnchor != null ? TypeUtils.INSTANCE.wrapToValue(fillTranslateAnchor) : com.mapbox.maps.p.a("fill", "fill-translate-anchor"), "fill-translate-anchor");
    }

    public final void setFillTunnelStructureColorInt(Integer num) {
        if (num != null) {
            com.mapbox.maps.p.l(num, ColorUtils.INSTANCE, getDataDrivenPropertyDefaultValues(), PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR);
            enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR);
        }
        update(getAnnotations());
    }

    public final void setFillTunnelStructureColorString(String str) {
        if (str != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR, str);
            enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR);
        }
        update(getAnnotations());
    }

    public final void setFillTunnelStructureColorUseTheme(String str) {
        if (str != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME, str);
            enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolygonAnnotationOptions.PROPERTY_FILL_TUNNEL_STRUCTURE_COLOR_USE_THEME);
        }
        update(getAnnotations());
    }

    public final void setFillZOffset(Double d14) {
        if (d14 != null) {
            getDataDrivenPropertyDefaultValues().addProperty(PolygonAnnotationOptions.PROPERTY_FILL_Z_OFFSET, d14);
            enableDataDrivenProperty(PolygonAnnotationOptions.PROPERTY_FILL_Z_OFFSET);
        } else {
            getDataDrivenPropertyDefaultValues().remove(PolygonAnnotationOptions.PROPERTY_FILL_Z_OFFSET);
        }
        update(getAnnotations());
    }

    @Override // com.mapbox.maps.plugin.annotation.AnnotationManagerImpl
    public void setLayerFilter(Expression expression) {
        if (expression != null) {
            getLayer$plugin_annotation_release().filter(expression);
            getDragLayer$plugin_annotation_release().filter(expression);
        }
    }

    public final void setMaxZoom(Double d14) {
        setLayerProperty(d14 != null ? TypeUtils.INSTANCE.wrapToValue(d14) : com.mapbox.maps.p.a("fill", "maxzoom"), "maxzoom");
    }

    public final void setMinZoom(Double d14) {
        setLayerProperty(d14 != null ? TypeUtils.INSTANCE.wrapToValue(d14) : com.mapbox.maps.p.a("fill", "minzoom"), "minzoom");
    }

    public final void setSlot(String str) {
        setLayerProperty(str != null ? TypeUtils.INSTANCE.wrapToValue(str) : com.mapbox.maps.p.a("fill", "slot"), "slot");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/generated/PolygonAnnotationManager$Companion;", "", "()V", "ID_GENERATOR", "Ljava/util/concurrent/atomic/AtomicLong;", "getID_GENERATOR", "()Ljava/util/concurrent/atomic/AtomicLong;", "setID_GENERATOR", "(Ljava/util/concurrent/atomic/AtomicLong;)V", "plugin-annotation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final AtomicLong getID_GENERATOR() {
            return PolygonAnnotationManager.ID_GENERATOR;
        }

        public final void setID_GENERATOR(AtomicLong atomicLong) {
            atomicLong.getClass();
            PolygonAnnotationManager.ID_GENERATOR = atomicLong;
        }

        private Companion() {
        }
    }

    public final List<PolygonAnnotation> create(String json) {
        json.getClass();
        FeatureCollection featureCollectionFromJson = FeatureCollection.fromJson(json);
        featureCollectionFromJson.getClass();
        return create(featureCollectionFromJson);
    }

    public /* synthetic */ PolygonAnnotationManager(MapDelegateProvider mapDelegateProvider, AnnotationConfig annotationConfig, int i14, j jVar) {
        this(mapDelegateProvider, (i14 & 2) != 0 ? null : annotationConfig);
    }
}
