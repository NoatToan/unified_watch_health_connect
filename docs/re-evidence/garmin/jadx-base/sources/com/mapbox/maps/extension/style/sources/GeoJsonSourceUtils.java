package com.mapbox.maps.extension.style.sources;

import com.mapbox.geojson.Feature;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.sources.generated.GeoJsonSource;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u001a$\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u0001H\u0007\u001a$\u0010\t\u001a\u00020\u0003*\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u0001H\u0007\u001a$\u0010\u000b\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u0001H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"TAG", "", "addGeoJSONSourceFeatures", "", "Lcom/mapbox/maps/extension/style/sources/generated/GeoJsonSource;", "features", "", "Lcom/mapbox/geojson/Feature;", "dataId", "removeGeoJSONSourceFeatures", "featureIds", "updateGeoJSONSourceFeatures", "extension-style_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class GeoJsonSourceUtils {
    private static final String TAG = "GeoJsonSourceUtils";

    public static final void addGeoJSONSourceFeatures(GeoJsonSource geoJsonSource, List<Feature> list, String str) {
        geoJsonSource.getClass();
        list.getClass();
        str.getClass();
        MapboxStyleManager delegate = geoJsonSource.getDelegate();
        if (delegate != null) {
            geoJsonSource.getWorkerHandler$extension_style_release().post(new a(delegate, geoJsonSource, str, list, 0));
        } else {
            MapboxLogger.logW(TAG, "GeoJsonSource.addGeoJSONSourceFeatures is ignored. Style is not loaded yet.");
        }
    }

    public static /* synthetic */ void addGeoJSONSourceFeatures$default(GeoJsonSource geoJsonSource, List list, String str, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            str = "";
        }
        addGeoJSONSourceFeatures(geoJsonSource, list, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addGeoJSONSourceFeatures$lambda$1$lambda$0(MapboxStyleManager mapboxStyleManager, GeoJsonSource geoJsonSource, String str, List list) {
        mapboxStyleManager.getClass();
        geoJsonSource.getClass();
        str.getClass();
        list.getClass();
        mapboxStyleManager.addGeoJSONSourceFeatures(geoJsonSource.getSourceId(), str, list);
    }

    public static final void removeGeoJSONSourceFeatures(GeoJsonSource geoJsonSource, List<String> list, String str) {
        geoJsonSource.getClass();
        list.getClass();
        str.getClass();
        MapboxStyleManager delegate = geoJsonSource.getDelegate();
        if (delegate != null) {
            geoJsonSource.getWorkerHandler$extension_style_release().post(new a(delegate, geoJsonSource, str, list, 2));
        } else {
            MapboxLogger.logW(TAG, "GeoJsonSource.removeGeoJSONSourceFeatures is ignored. Style is not loaded yet.");
        }
    }

    public static /* synthetic */ void removeGeoJSONSourceFeatures$default(GeoJsonSource geoJsonSource, List list, String str, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            str = "";
        }
        removeGeoJSONSourceFeatures(geoJsonSource, list, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeGeoJSONSourceFeatures$lambda$5$lambda$4(MapboxStyleManager mapboxStyleManager, GeoJsonSource geoJsonSource, String str, List list) {
        mapboxStyleManager.getClass();
        geoJsonSource.getClass();
        str.getClass();
        list.getClass();
        mapboxStyleManager.removeGeoJSONSourceFeatures(geoJsonSource.getSourceId(), str, list);
    }

    public static final void updateGeoJSONSourceFeatures(GeoJsonSource geoJsonSource, List<Feature> list, String str) {
        geoJsonSource.getClass();
        list.getClass();
        str.getClass();
        MapboxStyleManager delegate = geoJsonSource.getDelegate();
        if (delegate != null) {
            geoJsonSource.getWorkerHandler$extension_style_release().post(new a(delegate, geoJsonSource, str, list, 1));
        } else {
            MapboxLogger.logW(TAG, "GeoJsonSource.updateGeoJSONSourceFeatures is ignored. Style is not loaded yet.");
        }
    }

    public static /* synthetic */ void updateGeoJSONSourceFeatures$default(GeoJsonSource geoJsonSource, List list, String str, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            str = "";
        }
        updateGeoJSONSourceFeatures(geoJsonSource, list, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateGeoJSONSourceFeatures$lambda$3$lambda$2(MapboxStyleManager mapboxStyleManager, GeoJsonSource geoJsonSource, String str, List list) {
        mapboxStyleManager.getClass();
        geoJsonSource.getClass();
        str.getClass();
        list.getClass();
        mapboxStyleManager.updateGeoJSONSourceFeatures(geoJsonSource.getSourceId(), str, list);
    }

    public static final void addGeoJSONSourceFeatures(GeoJsonSource geoJsonSource, List<Feature> list) {
        geoJsonSource.getClass();
        list.getClass();
        addGeoJSONSourceFeatures$default(geoJsonSource, list, null, 2, null);
    }

    public static final void removeGeoJSONSourceFeatures(GeoJsonSource geoJsonSource, List<String> list) {
        geoJsonSource.getClass();
        list.getClass();
        removeGeoJSONSourceFeatures$default(geoJsonSource, list, null, 2, null);
    }

    public static final void updateGeoJSONSourceFeatures(GeoJsonSource geoJsonSource, List<Feature> list) {
        geoJsonSource.getClass();
        list.getClass();
        updateGeoJSONSourceFeatures$default(geoJsonSource, list, null, 2, null);
    }
}
