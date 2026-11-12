package com.mapbox.maps.extension.style.sources.generated;

import android.os.Handler;
import android.os.HandlerThread;
import at0.c;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.GeoJson;
import com.mapbox.geojson.Geometry;
import com.mapbox.maps.GeoJSONSourceData;
import com.mapbox.maps.MapLoadingError;
import com.mapbox.maps.MapLoadingErrorType;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.StyleManager;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.StylePropertyValueKind;
import com.mapbox.maps.TileCacheBudget;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.sources.Source;
import com.mapbox.maps.extension.style.sources.SourceUtils;
import com.mapbox.maps.extension.style.types.PromoteId;
import com.mapbox.maps.extension.style.types.SourceDsl;
import com.mapbox.maps.extension.style.utils.TypeUtils;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.p;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kg.f;
import o13.e;
import o13.l;
import o13.m;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 f2\u00020\u0001:\u0002gfB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u001a2\b\b\u0002\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u001d2\b\b\u0002\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020 2\b\b\u0002\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020#2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020&2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u001b\u00108\u001a\u0002038@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001b\u0010;\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u00107R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b<\u0010\rR\u0013\u0010?\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0013\u0010A\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b@\u0010\rR\u0013\u0010C\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bB\u0010>R\u0013\u0010G\u001a\u0004\u0018\u00010D8F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0013\u0010K\u001a\u0004\u0018\u00010H8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0013\u0010M\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bL\u0010>R\u0013\u0010O\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bN\u0010>R\u0013\u0010Q\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bP\u0010>R\u001f\u0010V\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020S\u0018\u00010R8F¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0013\u0010X\u001a\u0004\u0018\u00010H8F¢\u0006\u0006\u001a\u0004\bW\u0010JR\u0013\u0010Z\u001a\u0004\u0018\u00010H8F¢\u0006\u0006\u001a\u0004\bY\u0010JR\u0013\u0010^\u001a\u0004\u0018\u00010[8F¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u001c\u0010b\u001a\u0004\u0018\u00010H8FX\u0087\u0004¢\u0006\f\u0012\u0004\b`\u0010a\u001a\u0004\b_\u0010JR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\bc\u0010>R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\bd\u0010e¨\u0006h"}, d2 = {"Lcom/mapbox/maps/extension/style/sources/generated/GeoJsonSource;", "Lcom/mapbox/maps/extension/style/sources/Source;", "Lcom/mapbox/maps/extension/style/sources/generated/GeoJsonSource$Builder;", "builder", "<init>", "(Lcom/mapbox/maps/extension/style/sources/generated/GeoJsonSource$Builder;)V", "Lcom/mapbox/maps/MapboxStyleManager;", "delegate", "", "bindTo", "(Lcom/mapbox/maps/MapboxStyleManager;)V", "", "getType$extension_style_release", "()Ljava/lang/String;", "getType", "value", "dataId", "data", "(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/extension/style/sources/generated/GeoJsonSource;", "url", "", "prefetchZoomDelta", "(J)Lcom/mapbox/maps/extension/style/sources/generated/GeoJsonSource;", "Lcom/mapbox/maps/TileCacheBudget;", "tileCacheBudget", "(Lcom/mapbox/maps/TileCacheBudget;)Lcom/mapbox/maps/extension/style/sources/generated/GeoJsonSource;", "Lcom/mapbox/geojson/Feature;", "feature", "(Lcom/mapbox/geojson/Feature;Ljava/lang/String;)Lcom/mapbox/maps/extension/style/sources/generated/GeoJsonSource;", "Lcom/mapbox/geojson/FeatureCollection;", "featureCollection", "(Lcom/mapbox/geojson/FeatureCollection;Ljava/lang/String;)Lcom/mapbox/maps/extension/style/sources/generated/GeoJsonSource;", "Lcom/mapbox/geojson/Geometry;", "geometry", "(Lcom/mapbox/geojson/Geometry;Ljava/lang/String;)Lcom/mapbox/maps/extension/style/sources/generated/GeoJsonSource;", "Lcom/mapbox/maps/GeoJSONSourceData;", "setDataAsync", "(Lcom/mapbox/maps/GeoJSONSourceData;Ljava/lang/String;)V", "Lcom/mapbox/geojson/GeoJson;", "geoJson", "setGeoJson", "(Lcom/mapbox/geojson/GeoJson;Ljava/lang/String;)V", "setData", "(Ljava/lang/String;Ljava/lang/String;)V", "applyGeoJsonData", "(Lcom/mapbox/geojson/GeoJson;Ljava/lang/String;)Lcom/mapbox/maps/extension/style/sources/generated/GeoJsonSource;", "currentGeoJson", "Lcom/mapbox/geojson/GeoJson;", "currentData", "Ljava/lang/String;", "currentDataId", "Landroid/os/Handler;", "workerHandler$delegate", "Lo13/l;", "getWorkerHandler$extension_style_release", "()Landroid/os/Handler;", "workerHandler", "mainHandler$delegate", "getMainHandler", "mainHandler", "getData", "getMaxzoom", "()Ljava/lang/Long;", "maxzoom", "getAttribution", "attribution", "getBuffer", "buffer", "", "getTolerance", "()Ljava/lang/Double;", "tolerance", "", "getCluster", "()Ljava/lang/Boolean;", "cluster", "getClusterRadius", "clusterRadius", "getClusterMaxZoom", "clusterMaxZoom", "getClusterMinPoints", "clusterMinPoints", "Ljava/util/HashMap;", "", "getClusterProperties", "()Ljava/util/HashMap;", "clusterProperties", "getLineMetrics", "lineMetrics", "getGenerateId", "generateId", "Lcom/mapbox/maps/extension/style/types/PromoteId;", "getPromoteId", "()Lcom/mapbox/maps/extension/style/types/PromoteId;", "promoteId", "getAutoMaxZoom", "getAutoMaxZoom$annotations", "()V", "autoMaxZoom", "getPrefetchZoomDelta", "getTileCacheBudget", "()Lcom/mapbox/maps/TileCacheBudget;", "Companion", "Builder", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GeoJsonSource extends Source {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "GeoJsonSource";
    private static final HandlerThread workerThread;
    private String currentData;
    private String currentDataId;
    private GeoJson currentGeoJson;

    /* JADX INFO: renamed from: mainHandler$delegate, reason: from kotlin metadata */
    private final l mainHandler;

    /* JADX INFO: renamed from: workerHandler$delegate, reason: from kotlin metadata */
    private final l workerHandler;

    static {
        HandlerThread handlerThread = new HandlerThread("GEOJSON_PARSER", 0);
        handlerThread.start();
        workerThread = handlerThread;
    }

    private GeoJsonSource(Builder builder) {
        super(builder.getSourceId());
        getSourceProperties$extension_style_release().putAll(builder.getProperties$extension_style_release());
        getVolatileSourceProperties$extension_style_release().putAll(builder.getVolatileProperties$extension_style_release());
        this.currentGeoJson = builder.getGeoJson();
        this.currentData = builder.getData();
        this.currentDataId = builder.getDataId();
        this.workerHandler = m.b(GeoJsonSource$workerHandler$2.INSTANCE);
        this.mainHandler = m.b(GeoJsonSource$mainHandler$2.INSTANCE);
    }

    private final GeoJsonSource applyGeoJsonData(GeoJson data, String dataId) {
        setGeoJson(data, dataId);
        return this;
    }

    public static /* synthetic */ GeoJsonSource data$default(GeoJsonSource geoJsonSource, String str, String str2, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            str2 = "";
        }
        return geoJsonSource.data(str, str2);
    }

    public static /* synthetic */ GeoJsonSource feature$default(GeoJsonSource geoJsonSource, Feature feature, String str, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            str = "";
        }
        return geoJsonSource.feature(feature, str);
    }

    public static /* synthetic */ GeoJsonSource featureCollection$default(GeoJsonSource geoJsonSource, FeatureCollection featureCollection, String str, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            str = "";
        }
        return geoJsonSource.featureCollection(featureCollection, str);
    }

    public static /* synthetic */ GeoJsonSource geometry$default(GeoJsonSource geoJsonSource, Geometry geometry, String str, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            str = "";
        }
        return geoJsonSource.geometry(geometry, str);
    }

    @MapboxExperimental
    public static /* synthetic */ void getAutoMaxZoom$annotations() {
    }

    private final Handler getMainHandler() {
        return (Handler) this.mainHandler.getValue();
    }

    public static /* synthetic */ GeoJsonSource prefetchZoomDelta$default(GeoJsonSource geoJsonSource, long j8, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            j8 = 4;
        }
        return geoJsonSource.prefetchZoomDelta(j8);
    }

    private final void setData(String data, String dataId) {
        GeoJSONSourceData geoJSONSourceDataValueOf = GeoJSONSourceData.valueOf(data);
        geoJSONSourceDataValueOf.getClass();
        setDataAsync(geoJSONSourceDataValueOf, dataId);
        this.currentData = data;
        this.currentDataId = dataId;
        this.currentGeoJson = null;
    }

    private final void setDataAsync(GeoJSONSourceData data, String dataId) {
        MapboxStyleManager delegate$extension_style_release = getDelegate();
        if (delegate$extension_style_release != null) {
            getWorkerHandler$extension_style_release().removeCallbacksAndMessages(null);
            getWorkerHandler$extension_style_release().post(new c(delegate$extension_style_release, this, dataId, data, 8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDataAsync$lambda$3$lambda$2(MapboxStyleManager mapboxStyleManager, GeoJsonSource geoJsonSource, String str, GeoJSONSourceData geoJSONSourceData) throws JSONException {
        Throwable th3;
        Expected<String, None> styleGeoJSONSourceData;
        String error;
        mapboxStyleManager.getClass();
        geoJsonSource.getClass();
        str.getClass();
        geoJSONSourceData.getClass();
        String message = null;
        try {
            styleGeoJSONSourceData = mapboxStyleManager.setStyleGeoJSONSourceData(geoJsonSource.getSourceId(), str, geoJSONSourceData);
            th3 = null;
        } catch (Throwable th4) {
            th3 = th4;
            styleGeoJSONSourceData = null;
        }
        if ((styleGeoJSONSourceData == null || !styleGeoJSONSourceData.isError()) && th3 == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("dataId", str);
        StringBuilder sb3 = new StringBuilder("setStyleGeoJSONSourceData error: ");
        if (styleGeoJSONSourceData != null && (error = styleGeoJSONSourceData.getError()) != null) {
            message = error;
        } else if (th3 != null) {
            message = th3.getMessage();
        }
        sb3.append(message);
        jSONObject.put("message", sb3.toString());
        String string = jSONObject.toString();
        string.getClass();
        Date date = new Date();
        MapboxLogger.logE(TAG, string);
        geoJsonSource.getMainHandler().post(new c(mapboxStyleManager, string, geoJsonSource, date, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDataAsync$lambda$3$lambda$2$lambda$1(MapboxStyleManager mapboxStyleManager, String str, GeoJsonSource geoJsonSource, Date date) {
        mapboxStyleManager.getClass();
        str.getClass();
        geoJsonSource.getClass();
        date.getClass();
        mapboxStyleManager.getMapLoadingErrorDelegate().sendMapLoadingError(new MapLoadingError(MapLoadingErrorType.SOURCE, str, geoJsonSource.getSourceId(), null, date));
    }

    private final void setGeoJson(GeoJson geoJson, String dataId) {
        setDataAsync(INSTANCE.toGeoJsonData$extension_style_release(geoJson), dataId);
        this.currentGeoJson = geoJson;
        this.currentDataId = dataId;
        this.currentData = null;
    }

    public static /* synthetic */ GeoJsonSource url$default(GeoJsonSource geoJsonSource, String str, String str2, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            str2 = "";
        }
        return geoJsonSource.url(str, str2);
    }

    @Override // com.mapbox.maps.extension.style.sources.Source, com.mapbox.maps.extension.style.StyleContract.StyleSourceExtension
    public void bindTo(MapboxStyleManager delegate) {
        delegate.getClass();
        super.bindTo(delegate);
        GeoJson geoJson = this.currentGeoJson;
        if (geoJson != null) {
            setGeoJson(geoJson, this.currentDataId);
        }
        String str = this.currentData;
        if (str != null) {
            setData(str, this.currentDataId);
        }
    }

    public final GeoJsonSource data(String str) {
        str.getClass();
        return data$default(this, str, null, 2, null);
    }

    public final GeoJsonSource feature(Feature value, String dataId) {
        value.getClass();
        dataId.getClass();
        return applyGeoJsonData(value, dataId);
    }

    public final GeoJsonSource featureCollection(FeatureCollection value, String dataId) {
        value.getClass();
        dataId.getClass();
        return applyGeoJsonData(value, dataId);
    }

    public final GeoJsonSource geometry(Geometry value, String dataId) {
        value.getClass();
        dataId.getClass();
        return applyGeoJsonData(value, dataId);
    }

    public final String getAttribution() {
        Object objUnwrap;
        MapboxStyleManager delegate$extension_style_release = getDelegate();
        if (delegate$extension_style_release == null) {
            p.n("Couldn't get attribution: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "attribution"), String.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "attribution").getValue().toJson();
            objUnwrap = null;
        }
        return (String) objUnwrap;
    }

    public final Boolean getAutoMaxZoom() {
        Object objUnwrap;
        MapboxStyleManager delegate$extension_style_release = getDelegate();
        if (delegate$extension_style_release == null) {
            p.n("Couldn't get autoMaxZoom: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "autoMaxZoom"), Boolean.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "autoMaxZoom").getValue().toJson();
            objUnwrap = null;
        }
        return (Boolean) objUnwrap;
    }

    public final Long getBuffer() {
        Object objUnwrap;
        MapboxStyleManager delegate$extension_style_release = getDelegate();
        if (delegate$extension_style_release == null) {
            p.n("Couldn't get buffer: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "buffer"), Long.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "buffer").getValue().toJson();
            objUnwrap = null;
        }
        return (Long) objUnwrap;
    }

    public final Boolean getCluster() {
        Object objUnwrap;
        MapboxStyleManager delegate$extension_style_release = getDelegate();
        if (delegate$extension_style_release == null) {
            p.n("Couldn't get cluster: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "cluster"), Boolean.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "cluster").getValue().toJson();
            objUnwrap = null;
        }
        return (Boolean) objUnwrap;
    }

    public final Long getClusterMaxZoom() {
        Object objUnwrap;
        MapboxStyleManager delegate$extension_style_release = getDelegate();
        if (delegate$extension_style_release == null) {
            p.n("Couldn't get clusterMaxZoom: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "clusterMaxZoom"), Long.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "clusterMaxZoom").getValue().toJson();
            objUnwrap = null;
        }
        return (Long) objUnwrap;
    }

    public final Long getClusterMinPoints() {
        Object objUnwrap;
        MapboxStyleManager delegate$extension_style_release = getDelegate();
        if (delegate$extension_style_release == null) {
            p.n("Couldn't get clusterMinPoints: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "clusterMinPoints"), Long.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "clusterMinPoints").getValue().toJson();
            objUnwrap = null;
        }
        return (Long) objUnwrap;
    }

    public final HashMap<String, Object> getClusterProperties() {
        Object objUnwrap;
        MapboxStyleManager delegate$extension_style_release = getDelegate();
        if (delegate$extension_style_release == null) {
            p.n("Couldn't get clusterProperties: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "clusterProperties"), HashMap.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "clusterProperties").getValue().toJson();
            objUnwrap = null;
        }
        return (HashMap) objUnwrap;
    }

    public final Long getClusterRadius() {
        Object objUnwrap;
        MapboxStyleManager delegate$extension_style_release = getDelegate();
        if (delegate$extension_style_release == null) {
            p.n("Couldn't get clusterRadius: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "clusterRadius"), Long.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "clusterRadius").getValue().toJson();
            objUnwrap = null;
        }
        return (Long) objUnwrap;
    }

    public final String getData() {
        Object objUnwrap;
        MapboxStyleManager delegate$extension_style_release = getDelegate();
        if (delegate$extension_style_release == null) {
            p.n("Couldn't get data: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "data"), String.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "data").getValue().toJson();
            objUnwrap = null;
        }
        return (String) objUnwrap;
    }

    public final Boolean getGenerateId() {
        Object objUnwrap;
        MapboxStyleManager delegate$extension_style_release = getDelegate();
        if (delegate$extension_style_release == null) {
            p.n("Couldn't get generateId: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "generateId"), Boolean.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "generateId").getValue().toJson();
            objUnwrap = null;
        }
        return (Boolean) objUnwrap;
    }

    public final Boolean getLineMetrics() {
        Object objUnwrap;
        MapboxStyleManager delegate$extension_style_release = getDelegate();
        if (delegate$extension_style_release == null) {
            p.n("Couldn't get lineMetrics: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "lineMetrics"), Boolean.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "lineMetrics").getValue().toJson();
            objUnwrap = null;
        }
        return (Boolean) objUnwrap;
    }

    public final Long getMaxzoom() {
        Object objUnwrap;
        MapboxStyleManager delegate$extension_style_release = getDelegate();
        if (delegate$extension_style_release == null) {
            p.n("Couldn't get maxzoom: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "maxzoom"), Long.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "maxzoom").getValue().toJson();
            objUnwrap = null;
        }
        return (Long) objUnwrap;
    }

    public final Long getPrefetchZoomDelta() {
        Object objUnwrap;
        MapboxStyleManager delegate$extension_style_release = getDelegate();
        if (delegate$extension_style_release == null) {
            p.n("Couldn't get prefetch-zoom-delta: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "prefetch-zoom-delta"), Long.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "prefetch-zoom-delta").getValue().toJson();
            objUnwrap = null;
        }
        return (Long) objUnwrap;
    }

    public final PromoteId getPromoteId() {
        Object objUnwrap;
        MapboxStyleManager delegate$extension_style_release = getDelegate();
        if (delegate$extension_style_release == null) {
            p.n("Couldn't get promoteId: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "promoteId"), Object.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "promoteId").getValue().toJson();
            objUnwrap = null;
        }
        if (objUnwrap != null) {
            return PromoteId.INSTANCE.fromProperty$extension_style_release(objUnwrap);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.mapbox.maps.MapboxStyleManager] */
    public final TileCacheBudget getTileCacheBudget() {
        ?? Unwrap = "tile-cache-budget";
        ?? delegate$extension_style_release = getDelegate();
        if (delegate$extension_style_release == 0) {
            p.n("Couldn't get tile-cache-budget: source is not added to style yet.");
            return null;
        }
        try {
            StylePropertyValue styleSourceProperty = delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "tile-cache-budget");
            if (styleSourceProperty.getKind() == StylePropertyValueKind.CONSTANT) {
                Value value = styleSourceProperty.getValue();
                value.getClass();
                Unwrap = SourceUtils.unwrapToTileCacheBudget(value);
            } else {
                Unwrap = TypeUtilsKt.unwrap(styleSourceProperty, TileCacheBudget.class);
            }
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate$extension_style_release.getStyleSourceProperty(getSourceId(), Unwrap).getValue().toJson();
            Unwrap = 0;
        }
        return (TileCacheBudget) Unwrap;
    }

    public final Double getTolerance() {
        Object objUnwrap;
        MapboxStyleManager delegate$extension_style_release = getDelegate();
        if (delegate$extension_style_release == null) {
            p.n("Couldn't get tolerance: source is not added to style yet.");
            return null;
        }
        try {
            objUnwrap = TypeUtilsKt.unwrap(delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "tolerance"), Double.class);
        } catch (RuntimeException e4) {
            e4.getMessage();
            delegate$extension_style_release.getStyleSourceProperty(getSourceId(), "tolerance").getValue().toJson();
            objUnwrap = null;
        }
        return (Double) objUnwrap;
    }

    @Override // com.mapbox.maps.extension.style.sources.Source
    public String getType$extension_style_release() {
        return "geojson";
    }

    public final Handler getWorkerHandler$extension_style_release() {
        return (Handler) this.workerHandler.getValue();
    }

    public final GeoJsonSource prefetchZoomDelta(long value) {
        setVolatileProperty$extension_style_release(new PropertyValue<>("prefetch-zoom-delta", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value))));
        return this;
    }

    public final GeoJsonSource tileCacheBudget(TileCacheBudget value) {
        value.getClass();
        setVolatileProperty$extension_style_release(new PropertyValue<>("tile-cache-budget", TypeUtils.INSTANCE.wrapToValue(value)));
        return this;
    }

    @e
    public final GeoJsonSource url(String str) {
        str.getClass();
        return url$default(this, str, null, 2, null);
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\b(R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\bR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\bR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\fR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\bR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\bR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u00020 8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0002\u001a\u0004\b\"\u0010#¨\u0006)"}, d2 = {"Lcom/mapbox/maps/extension/style/sources/generated/GeoJsonSource$Companion;", "", "()V", "TAG", "", "defaultBuffer", "", "getDefaultBuffer", "()Ljava/lang/Long;", "defaultCluster", "", "getDefaultCluster", "()Ljava/lang/Boolean;", "defaultClusterMaxZoom", "getDefaultClusterMaxZoom", "defaultClusterMinPoints", "getDefaultClusterMinPoints", "defaultClusterRadius", "getDefaultClusterRadius", "defaultGenerateId", "getDefaultGenerateId", "defaultLineMetrics", "getDefaultLineMetrics", "defaultMaxzoom", "getDefaultMaxzoom", "defaultPrefetchZoomDelta", "getDefaultPrefetchZoomDelta", "defaultTolerance", "", "getDefaultTolerance", "()Ljava/lang/Double;", "workerThread", "Landroid/os/HandlerThread;", "getWorkerThread$extension_style_release$annotations", "getWorkerThread$extension_style_release", "()Landroid/os/HandlerThread;", "toGeoJsonData", "Lcom/mapbox/maps/GeoJSONSourceData;", "geoJson", "Lcom/mapbox/geojson/GeoJson;", "toGeoJsonData$extension_style_release", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public static /* synthetic */ void getWorkerThread$extension_style_release$annotations() {
        }

        public final Long getDefaultBuffer() {
            Object objUnwrap;
            StylePropertyValue styleSourcePropertyDefaultValue = StyleManager.getStyleSourcePropertyDefaultValue("geojson", "buffer");
            styleSourcePropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleSourcePropertyDefaultValue, Long.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Long) objUnwrap;
        }

        public final Boolean getDefaultCluster() {
            Object objUnwrap;
            StylePropertyValue styleSourcePropertyDefaultValue = StyleManager.getStyleSourcePropertyDefaultValue("geojson", "cluster");
            styleSourcePropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleSourcePropertyDefaultValue, Boolean.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Boolean) objUnwrap;
        }

        public final Long getDefaultClusterMaxZoom() {
            Object objUnwrap;
            StylePropertyValue styleSourcePropertyDefaultValue = StyleManager.getStyleSourcePropertyDefaultValue("geojson", "clusterMaxZoom");
            styleSourcePropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleSourcePropertyDefaultValue, Long.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Long) objUnwrap;
        }

        public final Long getDefaultClusterMinPoints() {
            Object objUnwrap;
            StylePropertyValue styleSourcePropertyDefaultValue = StyleManager.getStyleSourcePropertyDefaultValue("geojson", "clusterMinPoints");
            styleSourcePropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleSourcePropertyDefaultValue, Long.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Long) objUnwrap;
        }

        public final Long getDefaultClusterRadius() {
            Object objUnwrap;
            StylePropertyValue styleSourcePropertyDefaultValue = StyleManager.getStyleSourcePropertyDefaultValue("geojson", "clusterRadius");
            styleSourcePropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleSourcePropertyDefaultValue, Long.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Long) objUnwrap;
        }

        public final Boolean getDefaultGenerateId() {
            Object objUnwrap;
            StylePropertyValue styleSourcePropertyDefaultValue = StyleManager.getStyleSourcePropertyDefaultValue("geojson", "generateId");
            styleSourcePropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleSourcePropertyDefaultValue, Boolean.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Boolean) objUnwrap;
        }

        public final Boolean getDefaultLineMetrics() {
            Object objUnwrap;
            StylePropertyValue styleSourcePropertyDefaultValue = StyleManager.getStyleSourcePropertyDefaultValue("geojson", "lineMetrics");
            styleSourcePropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleSourcePropertyDefaultValue, Boolean.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Boolean) objUnwrap;
        }

        public final Long getDefaultMaxzoom() {
            Object objUnwrap;
            StylePropertyValue styleSourcePropertyDefaultValue = StyleManager.getStyleSourcePropertyDefaultValue("geojson", "maxzoom");
            styleSourcePropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleSourcePropertyDefaultValue, Long.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Long) objUnwrap;
        }

        public final Long getDefaultPrefetchZoomDelta() {
            Object objUnwrap;
            StylePropertyValue styleSourcePropertyDefaultValue = StyleManager.getStyleSourcePropertyDefaultValue("geojson", "prefetch-zoom-delta");
            styleSourcePropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleSourcePropertyDefaultValue, Long.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Long) objUnwrap;
        }

        public final Double getDefaultTolerance() {
            Object objUnwrap;
            StylePropertyValue styleSourcePropertyDefaultValue = StyleManager.getStyleSourcePropertyDefaultValue("geojson", "tolerance");
            styleSourcePropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleSourcePropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final HandlerThread getWorkerThread$extension_style_release() {
            return GeoJsonSource.workerThread;
        }

        public final GeoJSONSourceData toGeoJsonData$extension_style_release(GeoJson geoJson) {
            geoJson.getClass();
            if (geoJson instanceof Feature) {
                GeoJSONSourceData geoJSONSourceDataValueOf = GeoJSONSourceData.valueOf((Feature) geoJson);
                geoJSONSourceDataValueOf.getClass();
                return geoJSONSourceDataValueOf;
            }
            if (geoJson instanceof Geometry) {
                GeoJSONSourceData geoJSONSourceDataValueOf2 = GeoJSONSourceData.valueOf((Geometry) geoJson);
                geoJSONSourceDataValueOf2.getClass();
                return geoJSONSourceDataValueOf2;
            }
            if (!(geoJson instanceof FeatureCollection)) {
                f.n("Incorrect GeoJson data format");
                return null;
            }
            List<Feature> listFeatures = ((FeatureCollection) geoJson).features();
            listFeatures.getClass();
            GeoJSONSourceData geoJSONSourceDataValueOf3 = GeoJSONSourceData.valueOf(listFeatures);
            geoJSONSourceDataValueOf3.getClass();
            return geoJSONSourceDataValueOf3;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0003J\u0012\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u001dH\u0007J\u0010\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020!J\u0010\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u001dJ\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001fJ\u000e\u0010$\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001fJ\u001a\u0010%\u001a\u00020\u00002\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0013J\u0016\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020)J\u001e\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00032\u0006\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020)J\u0010\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u001fJ\u001a\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003H\u0007J\u001a\u0010,\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020-2\b\b\u0002\u0010\t\u001a\u00020\u0003H\u0007J\u001a\u0010.\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020/2\b\b\u0002\u0010\t\u001a\u00020\u0003H\u0007J\u0010\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u001dJ\u0018\u0010\f\u001a\u0002012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u001a\u00102\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u0002032\b\b\u0002\u0010\t\u001a\u00020\u0003H\u0007J\u0010\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u001dJ\u0010\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u001fJ\u0010\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u001fJ\u000e\u00107\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u000208J\u000e\u00109\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020:J\u0010\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020<J\u001a\u0010=\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003H\u0007R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u001a\u0010\t\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R$\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016¨\u0006>"}, d2 = {"Lcom/mapbox/maps/extension/style/sources/generated/GeoJsonSource$Builder;", "", "sourceId", "", "(Ljava/lang/String;)V", "data", "getData$extension_style_release", "()Ljava/lang/String;", "setData$extension_style_release", "dataId", "getDataId$extension_style_release", "setDataId$extension_style_release", "geoJson", "Lcom/mapbox/geojson/GeoJson;", "getGeoJson$extension_style_release", "()Lcom/mapbox/geojson/GeoJson;", "setGeoJson$extension_style_release", "(Lcom/mapbox/geojson/GeoJson;)V", "properties", "Ljava/util/HashMap;", "Lcom/mapbox/maps/extension/style/layers/properties/PropertyValue;", "getProperties$extension_style_release", "()Ljava/util/HashMap;", "getSourceId", "volatileProperties", "getVolatileProperties$extension_style_release", "attribution", "value", "autoMaxZoom", "", "buffer", "", "build", "Lcom/mapbox/maps/extension/style/sources/generated/GeoJsonSource;", "cluster", "clusterMaxZoom", "clusterMinPoints", "clusterProperties", "clusterProperty", "propertyName", "mapExpr", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "operatorExpr", "clusterRadius", "feature", "Lcom/mapbox/geojson/Feature;", "featureCollection", "Lcom/mapbox/geojson/FeatureCollection;", "generateId", "", "geometry", "Lcom/mapbox/geojson/Geometry;", "lineMetrics", "maxzoom", "prefetchZoomDelta", "promoteId", "Lcom/mapbox/maps/extension/style/types/PromoteId;", "tileCacheBudget", "Lcom/mapbox/maps/TileCacheBudget;", "tolerance", "", "url", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @SourceDsl
    public static final class Builder {
        private String data;
        private String dataId;
        private GeoJson geoJson;
        private final HashMap<String, PropertyValue<?>> properties;
        private final String sourceId;
        private final HashMap<String, PropertyValue<?>> volatileProperties;

        public Builder(String str) {
            str.getClass();
            this.sourceId = str;
            this.properties = new HashMap<>();
            this.volatileProperties = new HashMap<>();
            this.dataId = "";
        }

        public static /* synthetic */ Builder autoMaxZoom$default(Builder builder, boolean z14, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                z14 = false;
            }
            return builder.autoMaxZoom(z14);
        }

        public static /* synthetic */ Builder buffer$default(Builder builder, long j8, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                j8 = 128;
            }
            return builder.buffer(j8);
        }

        public static /* synthetic */ Builder cluster$default(Builder builder, boolean z14, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                z14 = false;
            }
            return builder.cluster(z14);
        }

        public static /* synthetic */ Builder clusterRadius$default(Builder builder, long j8, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                j8 = 50;
            }
            return builder.clusterRadius(j8);
        }

        public static /* synthetic */ Builder data$default(Builder builder, String str, String str2, int i14, Object obj) {
            if ((i14 & 2) != 0) {
                str2 = "";
            }
            return builder.data(str, str2);
        }

        public static /* synthetic */ Builder feature$default(Builder builder, Feature feature, String str, int i14, Object obj) {
            if ((i14 & 2) != 0) {
                str = "";
            }
            return builder.feature(feature, str);
        }

        public static /* synthetic */ Builder featureCollection$default(Builder builder, FeatureCollection featureCollection, String str, int i14, Object obj) {
            if ((i14 & 2) != 0) {
                str = "";
            }
            return builder.featureCollection(featureCollection, str);
        }

        public static /* synthetic */ Builder generateId$default(Builder builder, boolean z14, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                z14 = false;
            }
            return builder.generateId(z14);
        }

        private final void geoJson(GeoJson geoJson, String dataId) {
            this.geoJson = geoJson;
            this.dataId = dataId;
            this.data = null;
        }

        public static /* synthetic */ Builder geometry$default(Builder builder, Geometry geometry, String str, int i14, Object obj) {
            if ((i14 & 2) != 0) {
                str = "";
            }
            return builder.geometry(geometry, str);
        }

        public static /* synthetic */ Builder lineMetrics$default(Builder builder, boolean z14, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                z14 = false;
            }
            return builder.lineMetrics(z14);
        }

        public static /* synthetic */ Builder maxzoom$default(Builder builder, long j8, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                j8 = 18;
            }
            return builder.maxzoom(j8);
        }

        public static /* synthetic */ Builder prefetchZoomDelta$default(Builder builder, long j8, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                j8 = 4;
            }
            return builder.prefetchZoomDelta(j8);
        }

        public static /* synthetic */ Builder tolerance$default(Builder builder, double d14, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                d14 = 0.375d;
            }
            return builder.tolerance(d14);
        }

        public static /* synthetic */ Builder url$default(Builder builder, String str, String str2, int i14, Object obj) {
            if ((i14 & 2) != 0) {
                str2 = "";
            }
            return builder.url(str, str2);
        }

        public final Builder attribution(String value) {
            value.getClass();
            PropertyValue<?> propertyValue = new PropertyValue<>("attribution", TypeUtils.INSTANCE.wrapToValue(value));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        @MapboxExperimental
        public final Builder autoMaxZoom(boolean value) {
            PropertyValue<?> propertyValue = new PropertyValue<>("autoMaxZoom", TypeUtils.INSTANCE.wrapToValue(Boolean.valueOf(value)));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        public final Builder buffer(long value) {
            PropertyValue<?> propertyValue = new PropertyValue<>("buffer", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value)));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        public final GeoJsonSource build() {
            PropertyValue<?> propertyValue = new PropertyValue<>("data", TypeUtils.INSTANCE.wrapToValue(""));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return new GeoJsonSource(this, null);
        }

        public final Builder cluster(boolean value) {
            PropertyValue<?> propertyValue = new PropertyValue<>("cluster", TypeUtils.INSTANCE.wrapToValue(Boolean.valueOf(value)));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        public final Builder clusterMaxZoom(long value) {
            PropertyValue<?> propertyValue = new PropertyValue<>("clusterMaxZoom", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value)));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        public final Builder clusterMinPoints(long value) {
            PropertyValue<?> propertyValue = new PropertyValue<>("clusterMinPoints", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value)));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        public final Builder clusterProperties(HashMap<String, Object> value) {
            value.getClass();
            PropertyValue<?> propertyValue = new PropertyValue<>("clusterProperties", TypeUtils.INSTANCE.wrapToValue(value));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        public final Builder clusterProperty(String propertyName, Expression operatorExpr, Expression mapExpr) {
            Value value;
            propertyName.getClass();
            operatorExpr.getClass();
            mapExpr.getClass();
            PropertyValue<?> propertyValue = this.properties.get("clusterProperties");
            Object contents = (propertyValue == null || (value = propertyValue.getValue()) == null) ? null : value.getContents();
            HashMap map = contents instanceof HashMap ? (HashMap) contents : null;
            if (map == null) {
                map = new HashMap();
            }
            map.put(propertyName, new Value((List<Value>) x.k(operatorExpr, mapExpr)));
            PropertyValue<?> propertyValue2 = new PropertyValue<>("clusterProperties", TypeUtils.INSTANCE.wrapToValue(map));
            this.properties.put(propertyValue2.getPropertyName(), propertyValue2);
            return this;
        }

        public final Builder clusterRadius(long value) {
            PropertyValue<?> propertyValue = new PropertyValue<>("clusterRadius", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value)));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        public final Builder data(String value, String dataId) {
            value.getClass();
            dataId.getClass();
            this.geoJson = null;
            this.data = value;
            this.dataId = dataId;
            return this;
        }

        public final Builder feature(Feature feature) {
            feature.getClass();
            return feature$default(this, feature, null, 2, null);
        }

        public final Builder featureCollection(FeatureCollection featureCollection) {
            featureCollection.getClass();
            return featureCollection$default(this, featureCollection, null, 2, null);
        }

        public final Builder generateId(boolean value) {
            PropertyValue<?> propertyValue = new PropertyValue<>("generateId", TypeUtils.INSTANCE.wrapToValue(Boolean.valueOf(value)));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        public final Builder geometry(Geometry geometry) {
            geometry.getClass();
            return geometry$default(this, geometry, null, 2, null);
        }

        /* JADX INFO: renamed from: getData$extension_style_release, reason: from getter */
        public final String getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: getDataId$extension_style_release, reason: from getter */
        public final String getDataId() {
            return this.dataId;
        }

        /* JADX INFO: renamed from: getGeoJson$extension_style_release, reason: from getter */
        public final GeoJson getGeoJson() {
            return this.geoJson;
        }

        public final HashMap<String, PropertyValue<?>> getProperties$extension_style_release() {
            return this.properties;
        }

        public final String getSourceId() {
            return this.sourceId;
        }

        public final HashMap<String, PropertyValue<?>> getVolatileProperties$extension_style_release() {
            return this.volatileProperties;
        }

        public final Builder lineMetrics(boolean value) {
            PropertyValue<?> propertyValue = new PropertyValue<>("lineMetrics", TypeUtils.INSTANCE.wrapToValue(Boolean.valueOf(value)));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        public final Builder maxzoom(long value) {
            PropertyValue<?> propertyValue = new PropertyValue<>("maxzoom", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value)));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        public final Builder prefetchZoomDelta(long value) {
            PropertyValue<?> propertyValue = new PropertyValue<>("prefetch-zoom-delta", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value)));
            this.volatileProperties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        public final Builder promoteId(PromoteId value) {
            value.getClass();
            PropertyValue<?> propertyValue = new PropertyValue<>("promoteId", value.toValue$extension_style_release());
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        public final void setData$extension_style_release(String str) {
            this.data = str;
        }

        public final void setDataId$extension_style_release(String str) {
            str.getClass();
            this.dataId = str;
        }

        public final void setGeoJson$extension_style_release(GeoJson geoJson) {
            this.geoJson = geoJson;
        }

        public final Builder tileCacheBudget(TileCacheBudget value) {
            value.getClass();
            PropertyValue<?> propertyValue = new PropertyValue<>("tile-cache-budget", TypeUtils.INSTANCE.wrapToValue(value));
            this.volatileProperties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        public final Builder tolerance(double value) {
            PropertyValue<?> propertyValue = new PropertyValue<>("tolerance", TypeUtils.INSTANCE.wrapToValue(Double.valueOf(value)));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        @e
        public final Builder url(String str) {
            str.getClass();
            return url$default(this, str, null, 2, null);
        }

        public final Builder feature(Feature value, String dataId) {
            value.getClass();
            dataId.getClass();
            geoJson(value, dataId);
            return this;
        }

        public final Builder featureCollection(FeatureCollection value, String dataId) {
            value.getClass();
            dataId.getClass();
            geoJson(value, dataId);
            return this;
        }

        public final Builder geometry(Geometry value, String dataId) {
            value.getClass();
            dataId.getClass();
            geoJson(value, dataId);
            return this;
        }

        @e
        public final Builder url(String value, String dataId) {
            value.getClass();
            dataId.getClass();
            data(value, dataId);
            return this;
        }

        public final Builder data(String str) {
            str.getClass();
            return data$default(this, str, null, 2, null);
        }

        public final Builder clusterProperty(String propertyName, Expression mapExpr) {
            Value value;
            propertyName.getClass();
            mapExpr.getClass();
            PropertyValue<?> propertyValue = this.properties.get("clusterProperties");
            Object contents = (propertyValue == null || (value = propertyValue.getValue()) == null) ? null : value.getContents();
            HashMap map = contents instanceof HashMap ? (HashMap) contents : null;
            if (map == null) {
                map = new HashMap();
            }
            map.put(propertyName, mapExpr);
            PropertyValue<?> propertyValue2 = new PropertyValue<>("clusterProperties", TypeUtils.INSTANCE.wrapToValue(map));
            this.properties.put(propertyValue2.getPropertyName(), propertyValue2);
            return this;
        }
    }

    public final GeoJsonSource data(String value, String dataId) {
        value.getClass();
        dataId.getClass();
        setData(value, dataId);
        return this;
    }

    @e
    public final GeoJsonSource url(String value, String dataId) {
        value.getClass();
        dataId.getClass();
        data(value, dataId);
        return this;
    }

    public final GeoJsonSource feature(Feature feature) {
        feature.getClass();
        return feature$default(this, feature, null, 2, null);
    }

    public final GeoJsonSource featureCollection(FeatureCollection featureCollection) {
        featureCollection.getClass();
        return featureCollection$default(this, featureCollection, null, 2, null);
    }

    public final GeoJsonSource geometry(Geometry geometry) {
        geometry.getClass();
        return geometry$default(this, geometry, null, 2, null);
    }

    public /* synthetic */ GeoJsonSource(Builder builder, j jVar) {
        this(builder);
    }
}
