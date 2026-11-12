package com.google.maps.android.ktx.utils.geojson;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.GoogleMap;
import com.google.maps.android.collections.GroundOverlayManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.collections.PolygonManager;
import com.google.maps.android.collections.PolylineManager;
import com.google.maps.android.data.geojson.GeoJsonLayer;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aI\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0086\b\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0086\b¨\u0006\u0012"}, d2 = {"geoJsonLayer", "Lcom/google/maps/android/data/geojson/GeoJsonLayer;", "map", "Lcom/google/android/gms/maps/GoogleMap;", "geoJsonFile", "Lorg/json/JSONObject;", "markerManager", "Lcom/google/maps/android/collections/MarkerManager;", "polygonManager", "Lcom/google/maps/android/collections/PolygonManager;", "polylineManager", "Lcom/google/maps/android/collections/PolylineManager;", "groundOverlayManager", "Lcom/google/maps/android/collections/GroundOverlayManager;", "resourceId", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "maps-utils-ktx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class GeoJsonKt {
    public static final GeoJsonLayer geoJsonLayer(GoogleMap googleMap, int i14, Context context, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager) {
        googleMap.getClass();
        context.getClass();
        return new GeoJsonLayer(googleMap, i14, context, markerManager, polygonManager, polylineManager, groundOverlayManager);
    }

    public static /* synthetic */ GeoJsonLayer geoJsonLayer$default(GoogleMap googleMap, int i14, Context context, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            markerManager = null;
        }
        if ((i15 & 16) != 0) {
            polygonManager = null;
        }
        if ((i15 & 32) != 0) {
            polylineManager = null;
        }
        GroundOverlayManager groundOverlayManager2 = (i15 & 64) != 0 ? null : groundOverlayManager;
        googleMap.getClass();
        context.getClass();
        return new GeoJsonLayer(googleMap, i14, context, markerManager, polygonManager, polylineManager, groundOverlayManager2);
    }

    public static final GeoJsonLayer geoJsonLayer(GoogleMap googleMap, JSONObject jSONObject, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager) {
        googleMap.getClass();
        jSONObject.getClass();
        return new GeoJsonLayer(googleMap, jSONObject, markerManager, polygonManager, polylineManager, groundOverlayManager);
    }

    public static /* synthetic */ GeoJsonLayer geoJsonLayer$default(GoogleMap googleMap, JSONObject jSONObject, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            markerManager = null;
        }
        if ((i14 & 8) != 0) {
            polygonManager = null;
        }
        if ((i14 & 16) != 0) {
            polylineManager = null;
        }
        GroundOverlayManager groundOverlayManager2 = (i14 & 32) != 0 ? null : groundOverlayManager;
        googleMap.getClass();
        jSONObject.getClass();
        return new GeoJsonLayer(googleMap, jSONObject, markerManager, polygonManager, polylineManager, groundOverlayManager2);
    }
}
