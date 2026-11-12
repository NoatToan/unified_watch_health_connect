package com.huami.moving.maps;

import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.View;
import com.huami.mifit.sportlib.model.GPSPoint;
import com.huami.mifit.sportlib.model.RouteLineInfo;
import com.huami.moving.model.HeatmapData;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface IGPSPainter<Polyline, LatLngBounds> {
    public static final double LAT_RANGE_NORTH = 89.0d;
    public static final double LAT_RANGE_SOUTH = -89.0d;
    public static final double LNG_RANGE_CENTER = 0.0d;
    public static final double LNG_RANGE_EAST = 179.0d;
    public static final double LNG_RANGE_WEST = -179.0d;

    void addDarkOverlay(int i);

    void addDarkOverlay(GPSPoint gPSPoint);

    void addDarkOverlay(List<GPSPoint> list);

    Polyline addDottedPolyline(List<GPSPoint> list, RouteLineInfo routeLineInfo);

    void addLineMarkerPoint(List<GPSPoint> list, List<View> list2, List<Boolean> list3, List<Boolean> list4);

    void addMarked(List<GPSPoint> list);

    void addMaskOverlay(boolean z);

    Polyline addPolyline(GPSPoint gPSPoint, GPSPoint gPSPoint2, RouteLineInfo routeLineInfo);

    Polyline addPolyline(List<GPSPoint> list, RouteLineInfo routeLineInfo);

    void addRoutePolyline(List<GPSPoint> list, RouteLineInfo routeLineInfo);

    void addWhiteOverLayer(int i, GPSPoint gPSPoint);

    void clearMap();

    void clearPolylines();

    void clearRouteTracker();

    void destroy();

    void drawHeatmap(List<HeatmapData> list);

    void drawMarkerToPoint(GPSPoint gPSPoint, Bitmap bitmap);

    void drawPolyline(List<GPSPoint> list, RouteLineInfo routeLineInfo);

    LatLngBounds getBoundsByTarget(int i, GPSPoint gPSPoint);

    void hideOverLayer(int i);

    void markGPSPoint(GPSPoint gPSPoint);

    void moveRouteToCenter(GPSPoint gPSPoint);

    void moveToCenter(GPSPoint gPSPoint);

    void removeAllLineMarkerPoint();

    void resetOverlayer();

    void setDebugMode(int i);

    void setEndPoint(GPSPoint gPSPoint);

    void setHeatmapVisible(int i);

    void setLineWidth(float f);

    void setLocation(GPSPoint gPSPoint);

    void setMapViewType(int i);

    void setMarked(boolean z);

    void setPausePoint(GPSPoint gPSPoint);

    void setRouteTrackerVisibility(boolean z);

    void setStartPoint(GPSPoint gPSPoint);

    void setTestLocation(GPSPoint gPSPoint);

    void setTrackISectionColors(SparseArray<Integer> sparseArray);

    void setTrackRectangle(GPSPoint gPSPoint, GPSPoint gPSPoint2);

    void startFollow();

    void stopFollow();

    void updateEndMarkerIcon(Bitmap bitmap);

    void updatePolyline(GPSPoint gPSPoint, GPSPoint gPSPoint2, RouteLineInfo routeLineInfo);

    void updatePolyline(List<GPSPoint> list, RouteLineInfo routeLineInfo);

    void updateRoutePolyline(List<GPSPoint> list, int i, boolean z, RouteLineInfo routeLineInfo);

    void zoomBy(int i);

    void zoomToShowEntireTrack();

    void zoomToShowEntireTrack(IMapAnimationCallback iMapAnimationCallback);

    void zoomToShowEntireTrack(List<GPSPoint> list, IMapAnimationCallback iMapAnimationCallback);
}
