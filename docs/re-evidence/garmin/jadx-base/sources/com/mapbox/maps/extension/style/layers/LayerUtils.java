package com.mapbox.maps.extension.style.layers;

import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.bindgen.Expected;
import com.mapbox.maps.CustomLayerHost;
import com.mapbox.maps.CustomLayerRenderParameters;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.StyleContract;
import com.mapbox.maps.extension.style.layers.generated.BackgroundLayer;
import com.mapbox.maps.extension.style.layers.generated.CircleLayer;
import com.mapbox.maps.extension.style.layers.generated.ClipLayer;
import com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayer;
import com.mapbox.maps.extension.style.layers.generated.FillLayer;
import com.mapbox.maps.extension.style.layers.generated.HeatmapLayer;
import com.mapbox.maps.extension.style.layers.generated.HillshadeLayer;
import com.mapbox.maps.extension.style.layers.generated.LineLayer;
import com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayer;
import com.mapbox.maps.extension.style.layers.generated.ModelLayer;
import com.mapbox.maps.extension.style.layers.generated.RasterLayer;
import com.mapbox.maps.extension.style.layers.generated.RasterParticleLayer;
import com.mapbox.maps.extension.style.layers.generated.SkyLayer;
import com.mapbox.maps.extension.style.layers.generated.SlotLayer;
import com.mapbox.maps.extension.style.layers.generated.SymbolLayer;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import o13.l;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\u001c\u0010\t\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u001a!\u0010\u000b\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000e\u001a\u001c\u0010\u000f\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u001a \u0010\u0011\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007\u001a\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u0012*\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0001\u001a(\u0010\u0017\u001a\u0004\u0018\u0001H\u0018\"\n\b\u0000\u0010\u0018\u0018\u0001*\u00020\u0012*\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0001H\u0086\b¢\u0006\u0002\u0010\u0019\u001a\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u001b*\u00020\u0012¢\u0006\u0002\u0010\u001c\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u0006\u001d²\u0006\n\u0010\u001e\u001a\u00020\u0001X\u008a\u0084\u0002"}, d2 = {"TAG", "", "getTAG$annotations", "()V", "addLayer", "", "Lcom/mapbox/maps/MapboxStyleManager;", "layer", "Lcom/mapbox/maps/extension/style/StyleContract$StyleLayerExtension;", "addLayerAbove", "above", "addLayerAt", FirebaseAnalytics.Param.INDEX, "", "(Lcom/mapbox/maps/MapboxStyleManager;Lcom/mapbox/maps/extension/style/StyleContract$StyleLayerExtension;Ljava/lang/Integer;)V", "addLayerBelow", "below", "addPersistentLayer", "Lcom/mapbox/maps/extension/style/layers/Layer;", ModelSourceWrapper.POSITION, "Lcom/mapbox/maps/LayerPosition;", "getLayer", "layerId", "getLayerAs", "T", "(Lcom/mapbox/maps/MapboxStyleManager;Ljava/lang/String;)Lcom/mapbox/maps/extension/style/layers/Layer;", "isPersistent", "", "(Lcom/mapbox/maps/extension/style/layers/Layer;)Ljava/lang/Boolean;", "extension-style_release", "source"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class LayerUtils {
    public static final String TAG = "Mbgl-LayerUtils";

    public static final void addLayer(MapboxStyleManager mapboxStyleManager, StyleContract.StyleLayerExtension styleLayerExtension) {
        mapboxStyleManager.getClass();
        styleLayerExtension.getClass();
        StyleContract.StyleLayerExtension.DefaultImpls.bindTo$default(styleLayerExtension, mapboxStyleManager, null, 2, null);
    }

    public static final void addLayerAbove(MapboxStyleManager mapboxStyleManager, StyleContract.StyleLayerExtension styleLayerExtension, String str) {
        mapboxStyleManager.getClass();
        styleLayerExtension.getClass();
        styleLayerExtension.bindTo(mapboxStyleManager, new LayerPosition(str, null, null));
    }

    public static final void addLayerAt(MapboxStyleManager mapboxStyleManager, StyleContract.StyleLayerExtension styleLayerExtension, Integer num) {
        mapboxStyleManager.getClass();
        styleLayerExtension.getClass();
        styleLayerExtension.bindTo(mapboxStyleManager, new LayerPosition(null, null, num));
    }

    public static final void addLayerBelow(MapboxStyleManager mapboxStyleManager, StyleContract.StyleLayerExtension styleLayerExtension, String str) {
        mapboxStyleManager.getClass();
        styleLayerExtension.getClass();
        styleLayerExtension.bindTo(mapboxStyleManager, new LayerPosition(null, str, null));
    }

    public static final void addPersistentLayer(MapboxStyleManager mapboxStyleManager, Layer layer) {
        mapboxStyleManager.getClass();
        layer.getClass();
        addPersistentLayer$default(mapboxStyleManager, layer, null, 2, null);
    }

    public static /* synthetic */ void addPersistentLayer$default(MapboxStyleManager mapboxStyleManager, Layer layer, LayerPosition layerPosition, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            layerPosition = null;
        }
        addPersistentLayer(mapboxStyleManager, layer, layerPosition);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:76:0x0161  */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0161, please report this as an issue */
    public static final Layer getLayer(MapboxStyleManager mapboxStyleManager, String str) {
        Object objUnwrap;
        Layer customLayer;
        Layer circleLayer;
        mapboxStyleManager.getClass();
        str.getClass();
        t tVarB = m.b(new LayerUtils$getLayer$source$2(mapboxStyleManager, str));
        try {
            objUnwrap = TypeUtilsKt.unwrap(mapboxStyleManager.getStyleLayerProperty(str, NotificationConstants.KEY_DATA_MIME_TYPE), String.class);
        } catch (RuntimeException unused) {
            objUnwrap = null;
        }
        String str2 = (String) objUnwrap;
        if (str2 != null) {
            switch (str2) {
                case "circle":
                    circleLayer = new CircleLayer(str, getLayer$lambda$0(tVarB));
                    customLayer = circleLayer;
                    break;
                case "custom":
                    customLayer = new CustomLayer(str, new CustomLayerHost() { // from class: com.mapbox.maps.extension.style.layers.LayerUtils.getLayer.1
                        @Override // com.mapbox.maps.CustomLayerHost
                        public void contextLost() {
                        }

                        @Override // com.mapbox.maps.CustomLayerHost
                        public void deinitialize() {
                        }

                        @Override // com.mapbox.maps.CustomLayerHost
                        public void initialize() {
                        }

                        @Override // com.mapbox.maps.CustomLayerHost
                        public void render(CustomLayerRenderParameters parameters) {
                            parameters.getClass();
                        }
                    });
                    break;
                case "background":
                    customLayer = new BackgroundLayer(str);
                    break;
                case "fill-extrusion":
                    circleLayer = new FillExtrusionLayer(str, getLayer$lambda$0(tVarB));
                    customLayer = circleLayer;
                    break;
                case "raster":
                    circleLayer = new RasterLayer(str, getLayer$lambda$0(tVarB));
                    customLayer = circleLayer;
                    break;
                case "symbol":
                    circleLayer = new SymbolLayer(str, getLayer$lambda$0(tVarB));
                    customLayer = circleLayer;
                    break;
                case "hillshade":
                    circleLayer = new HillshadeLayer(str, getLayer$lambda$0(tVarB));
                    customLayer = circleLayer;
                    break;
                case "sky":
                    customLayer = new SkyLayer(str);
                    break;
                case "clip":
                    circleLayer = new ClipLayer(str, getLayer$lambda$0(tVarB));
                    customLayer = circleLayer;
                    break;
                case "fill":
                    circleLayer = new FillLayer(str, getLayer$lambda$0(tVarB));
                    customLayer = circleLayer;
                    break;
                case "line":
                    circleLayer = new LineLayer(str, getLayer$lambda$0(tVarB));
                    customLayer = circleLayer;
                    break;
                case "slot":
                    customLayer = new SlotLayer(str);
                    break;
                case "model":
                    circleLayer = new ModelLayer(str, getLayer$lambda$0(tVarB));
                    customLayer = circleLayer;
                    break;
                case "raster-particle":
                    circleLayer = new RasterParticleLayer(str, getLayer$lambda$0(tVarB));
                    customLayer = circleLayer;
                    break;
                case "heatmap":
                    circleLayer = new HeatmapLayer(str, getLayer$lambda$0(tVarB));
                    customLayer = circleLayer;
                    break;
                case "location-indicator":
                    customLayer = new LocationIndicatorLayer(str);
                    break;
                default:
                    MapboxLogger.logE(TAG, "Layer type: " + str2 + " unknown.");
                    customLayer = null;
                    break;
            }
        } else {
            MapboxLogger.logE(TAG, "Layer type: " + str2 + " unknown.");
            customLayer = null;
        }
        if (customLayer == null) {
            return null;
        }
        customLayer.setDelegate$extension_style_release(mapboxStyleManager);
        customLayer.setAppliedLayerPropertiesValue$extension_style_release(mapboxStyleManager.getStyleLayerProperties(str).getValue());
        return customLayer;
    }

    private static final String getLayer$lambda$0(l<String> lVar) {
        return lVar.getValue();
    }

    public static final <T extends Layer> T getLayerAs(MapboxStyleManager mapboxStyleManager, String str) {
        mapboxStyleManager.getClass();
        str.getClass();
        getLayer(mapboxStyleManager, str);
        s.l();
        throw null;
    }

    public static /* synthetic */ void getTAG$annotations() {
    }

    public static final Boolean isPersistent(Layer layer) {
        Expected<String, Boolean> expectedIsStyleLayerPersistent;
        layer.getClass();
        MapboxStyleManager delegate = layer.getDelegate();
        if (delegate == null || (expectedIsStyleLayerPersistent = delegate.isStyleLayerPersistent(layer.getLayerId())) == null) {
            return null;
        }
        return expectedIsStyleLayerPersistent.getValue();
    }

    public static final void addPersistentLayer(MapboxStyleManager mapboxStyleManager, Layer layer, LayerPosition layerPosition) {
        mapboxStyleManager.getClass();
        layer.getClass();
        layer.bindPersistentlyTo$extension_style_release(mapboxStyleManager, layerPosition);
    }
}
