package com.mapbox.maps.extension.style.sources;

import com.garmin.android.gncs.NotificationConstants;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.CustomGeometrySourceOptions;
import com.mapbox.maps.CustomRasterSourceOptions;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleException;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.TileCacheBudget;
import com.mapbox.maps.TileCacheBudgetInMegabytes;
import com.mapbox.maps.TileCacheBudgetInTiles;
import com.mapbox.maps.extension.style.StyleContract;
import com.mapbox.maps.extension.style.sources.generated.GeoJsonSource;
import com.mapbox.maps.extension.style.sources.generated.ImageSource;
import com.mapbox.maps.extension.style.sources.generated.RasterArraySource;
import com.mapbox.maps.extension.style.sources.generated.RasterDemSource;
import com.mapbox.maps.extension.style.sources.generated.RasterSource;
import com.mapbox.maps.extension.style.sources.generated.VectorSource;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b\u001a(\u0010\t\u001a\u0004\u0018\u0001H\n\"\n\b\u0000\u0010\n\u0018\u0001*\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0086\b¢\u0006\u0002\u0010\u000b\u001a\f\u0010\f\u001a\u00020\r*\u00020\u000eH\u0000\u001a\f\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0000¨\u0006\u0010"}, d2 = {"addSource", "", "Lcom/mapbox/maps/MapboxStyleManager;", "source", "Lcom/mapbox/maps/extension/style/StyleContract$StyleSourceExtension;", "getSource", "Lcom/mapbox/maps/extension/style/sources/Source;", "sourceId", "", "getSourceAs", "T", "(Lcom/mapbox/maps/MapboxStyleManager;Ljava/lang/String;)Lcom/mapbox/maps/extension/style/sources/Source;", "toValue", "Lcom/mapbox/bindgen/Value;", "Lcom/mapbox/maps/TileCacheBudget;", "unwrapToTileCacheBudget", "extension-style_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class SourceUtils {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TileCacheBudget.Type.values().length];
            try {
                iArr[TileCacheBudget.Type.TILE_CACHE_BUDGET_IN_MEGABYTES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TileCacheBudget.Type.TILE_CACHE_BUDGET_IN_TILES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void addSource(MapboxStyleManager mapboxStyleManager, StyleContract.StyleSourceExtension styleSourceExtension) {
        mapboxStyleManager.getClass();
        styleSourceExtension.getClass();
        styleSourceExtension.bindTo(mapboxStyleManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Source getSource(MapboxStyleManager mapboxStyleManager, String str) {
        Object objUnwrap;
        mapboxStyleManager.getClass();
        str.getClass();
        try {
            objUnwrap = TypeUtilsKt.unwrap(mapboxStyleManager.getStyleSourceProperty(str, NotificationConstants.KEY_DATA_MIME_TYPE), String.class);
        } catch (RuntimeException unused) {
            objUnwrap = null;
        }
        String str2 = (String) objUnwrap;
        if (str2 == null) {
            return null;
        }
        switch (str2.hashCode()) {
            case -1602807287:
                if (str2.equals("raster-array")) {
                    RasterArraySource rasterArraySourceBuild = new RasterArraySource.Builder(str).build();
                    rasterArraySourceBuild.setDelegate$extension_style_release(mapboxStyleManager);
                    return rasterArraySourceBuild;
                }
                break;
            case -1408217266:
                if (str2.equals("custom-geometry")) {
                    CustomGeometrySourceOptions customGeometrySourceOptionsBuild = new CustomGeometrySourceOptions.Builder().build();
                    customGeometrySourceOptionsBuild.getClass();
                    CustomGeometrySource customGeometrySource = new CustomGeometrySource(str, customGeometrySourceOptionsBuild);
                    customGeometrySource.setDelegate$extension_style_release(mapboxStyleManager);
                    return customGeometrySource;
                }
                break;
            case -938121859:
                if (str2.equals("raster")) {
                    RasterSource rasterSourceBuild = new RasterSource.Builder(str).build();
                    rasterSourceBuild.setDelegate$extension_style_release(mapboxStyleManager);
                    return rasterSourceBuild;
                }
                break;
            case -820387517:
                if (str2.equals("vector")) {
                    VectorSource vectorSourceBuild = new VectorSource.Builder(str).build();
                    vectorSourceBuild.setDelegate$extension_style_release(mapboxStyleManager);
                    return vectorSourceBuild;
                }
                break;
            case -302402727:
                if (str2.equals("custom-raster")) {
                    CustomRasterSourceOptions customRasterSourceOptionsBuild = new CustomRasterSourceOptions.Builder().build();
                    customRasterSourceOptionsBuild.getClass();
                    CustomRasterSource customRasterSource = new CustomRasterSource(str, customRasterSourceOptionsBuild);
                    customRasterSource.setDelegate$extension_style_release(mapboxStyleManager);
                    return customRasterSource;
                }
                break;
            case -79074375:
                if (str2.equals("geojson")) {
                    GeoJsonSource geoJsonSourceBuild = new GeoJsonSource.Builder(str).build();
                    geoJsonSourceBuild.setDelegate$extension_style_release(mapboxStyleManager);
                    return geoJsonSourceBuild;
                }
                break;
            case 100313435:
                if (str2.equals("image")) {
                    ImageSource imageSourceBuild = new ImageSource.Builder(str).build();
                    imageSourceBuild.setDelegate$extension_style_release(mapboxStyleManager);
                    return imageSourceBuild;
                }
                break;
            case 1272076220:
                if (str2.equals("raster-dem")) {
                    RasterDemSource rasterDemSourceBuild = new RasterDemSource.Builder(str).build();
                    rasterDemSourceBuild.setDelegate$extension_style_release(mapboxStyleManager);
                    return rasterDemSourceBuild;
                }
                break;
        }
        MapboxLogger.logE("StyleSourcePlugin", "Source type: " + str2 + " unknown.");
        return null;
    }

    public static final <T extends Source> T getSourceAs(MapboxStyleManager mapboxStyleManager, String str) {
        mapboxStyleManager.getClass();
        str.getClass();
        getSource(mapboxStyleManager, str);
        s.l();
        throw null;
    }

    public static final /* synthetic */ Value toValue(TileCacheBudget tileCacheBudget) {
        tileCacheBudget.getClass();
        HashMap map = new HashMap();
        TileCacheBudget.Type typeInfo = tileCacheBudget.getTypeInfo();
        int i14 = typeInfo == null ? -1 : WhenMappings.$EnumSwitchMapping$0[typeInfo.ordinal()];
        if (i14 == 1) {
            map.put("megabytes", new Value(tileCacheBudget.getTileCacheBudgetInMegabytes().getSize()));
        } else {
            if (i14 != 2) {
                throw new MapboxStyleException("Failed to parse TileCacheBudget: " + tileCacheBudget);
            }
            map.put("tiles", new Value(tileCacheBudget.getTileCacheBudgetInTiles().getSize()));
        }
        return new Value((HashMap<String, Value>) map);
    }

    public static final /* synthetic */ TileCacheBudget unwrapToTileCacheBudget(Value value) {
        value.getClass();
        Object contents = value.getContents();
        HashMap map = contents instanceof HashMap ? (HashMap) contents : null;
        if (map != null) {
            if (map.size() != 1) {
                throw new MapboxStyleException("Map memory budget setting must contain 'tiles' or 'megabytes' property, but was " + value);
            }
            Set setEntrySet = map.entrySet();
            setEntrySet.getClass();
            Object objA0 = h0.a0(setEntrySet);
            objA0.getClass();
            Map.Entry entry = (Map.Entry) objA0;
            if (s.g(entry.getKey(), "tiles")) {
                Object contents2 = ((Value) entry.getValue()).getContents();
                contents2.getClass();
                return new TileCacheBudget(new TileCacheBudgetInTiles(((Long) contents2).longValue()));
            }
            if (s.g(entry.getKey(), "megabytes")) {
                Object contents3 = ((Value) entry.getValue()).getContents();
                contents3.getClass();
                return new TileCacheBudget(new TileCacheBudgetInMegabytes(((Long) contents3).longValue()));
            }
        }
        throw new MapboxStyleException("Can not parse " + value + " to TileCacheBudget.");
    }
}
