package com.google.maps.android.ktx.utils.kml;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.GoogleMap;
import com.google.maps.android.collections.GroundOverlayManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.collections.PolygonManager;
import com.google.maps.android.collections.PolylineManager;
import com.google.maps.android.data.Renderer;
import com.google.maps.android.data.kml.KmlLayer;
import java.io.InputStream;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aW\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086\b\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086\b¨\u0006\u0014"}, d2 = {"kmlLayer", "Lcom/google/maps/android/data/kml/KmlLayer;", "map", "Lcom/google/android/gms/maps/GoogleMap;", "resourceId", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "markerManager", "Lcom/google/maps/android/collections/MarkerManager;", "polygonManager", "Lcom/google/maps/android/collections/PolygonManager;", "polylineManager", "Lcom/google/maps/android/collections/PolylineManager;", "groundOverlayManager", "Lcom/google/maps/android/collections/GroundOverlayManager;", "imagesCache", "Lcom/google/maps/android/data/Renderer$ImagesCache;", "stream", "Ljava/io/InputStream;", "maps-utils-ktx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class KmlKt {
    public static final KmlLayer kmlLayer(GoogleMap googleMap, InputStream inputStream, Context context, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager, Renderer.ImagesCache imagesCache) {
        googleMap.getClass();
        inputStream.getClass();
        context.getClass();
        markerManager.getClass();
        polygonManager.getClass();
        polylineManager.getClass();
        groundOverlayManager.getClass();
        return new KmlLayer(googleMap, inputStream, context, markerManager, polygonManager, polylineManager, groundOverlayManager, imagesCache);
    }

    public static /* synthetic */ KmlLayer kmlLayer$default(GoogleMap googleMap, InputStream inputStream, Context context, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager, Renderer.ImagesCache imagesCache, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            markerManager = new MarkerManager(googleMap);
        }
        MarkerManager markerManager2 = markerManager;
        if ((i14 & 16) != 0) {
            polygonManager = new PolygonManager(googleMap);
        }
        PolygonManager polygonManager2 = polygonManager;
        if ((i14 & 32) != 0) {
            polylineManager = new PolylineManager(googleMap);
        }
        PolylineManager polylineManager2 = polylineManager;
        if ((i14 & 64) != 0) {
            groundOverlayManager = new GroundOverlayManager(googleMap);
        }
        GroundOverlayManager groundOverlayManager2 = groundOverlayManager;
        Renderer.ImagesCache imagesCache2 = (i14 & 128) != 0 ? null : imagesCache;
        googleMap.getClass();
        inputStream.getClass();
        context.getClass();
        markerManager2.getClass();
        polygonManager2.getClass();
        polylineManager2.getClass();
        groundOverlayManager2.getClass();
        return new KmlLayer(googleMap, inputStream, context, markerManager2, polygonManager2, polylineManager2, groundOverlayManager2, imagesCache2);
    }

    public static final KmlLayer kmlLayer(GoogleMap googleMap, int i14, Context context, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager, Renderer.ImagesCache imagesCache) {
        googleMap.getClass();
        context.getClass();
        markerManager.getClass();
        polygonManager.getClass();
        polylineManager.getClass();
        groundOverlayManager.getClass();
        return new KmlLayer(googleMap, i14, context, markerManager, polygonManager, polylineManager, groundOverlayManager, imagesCache);
    }

    public static /* synthetic */ KmlLayer kmlLayer$default(GoogleMap googleMap, int i14, Context context, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager, Renderer.ImagesCache imagesCache, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            markerManager = new MarkerManager(googleMap);
        }
        MarkerManager markerManager2 = markerManager;
        if ((i15 & 16) != 0) {
            polygonManager = new PolygonManager(googleMap);
        }
        PolygonManager polygonManager2 = polygonManager;
        if ((i15 & 32) != 0) {
            polylineManager = new PolylineManager(googleMap);
        }
        PolylineManager polylineManager2 = polylineManager;
        if ((i15 & 64) != 0) {
            groundOverlayManager = new GroundOverlayManager(googleMap);
        }
        GroundOverlayManager groundOverlayManager2 = groundOverlayManager;
        Renderer.ImagesCache imagesCache2 = (i15 & 128) != 0 ? null : imagesCache;
        googleMap.getClass();
        context.getClass();
        markerManager2.getClass();
        polygonManager2.getClass();
        polylineManager2.getClass();
        groundOverlayManager2.getClass();
        return new KmlLayer(googleMap, i14, context, markerManager2, polygonManager2, polylineManager2, groundOverlayManager2, imagesCache2);
    }
}
