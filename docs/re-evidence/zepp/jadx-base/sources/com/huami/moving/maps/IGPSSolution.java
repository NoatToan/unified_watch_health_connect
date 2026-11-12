package com.huami.moving.maps;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.huami.mifit.sportlib.model.GPSPoint;
import com.huami.mifit.sportlib.model.RouteLineInfo;
import com.huami.moving.maps.track.GPSSportTrackLoader;
import com.huami.moving.maps.track.OnChangeListener;
import com.huami.moving.model.HeatmapData;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface IGPSSolution {

    public interface IOnMapScreenShotListener {
        void onMapScreenShot(Bitmap bitmap);
    }

    void addLineMarkerPoint(List<GPSPoint> list, List<View> list2, List<Boolean> list3, List<Boolean> list4);

    void addMarked(List<GPSPoint> list);

    void addMaskOverlay(boolean z);

    void clearMap();

    void clearTrackVideoPaly();

    void destroy();

    void destroyMap();

    void drawGPSLine(GPSPoint gPSPoint, GPSPoint gPSPoint2, RouteLineInfo routeLineInfo);

    void drawGPSLine(List<GPSPoint> list, RouteLineInfo routeLineInfo);

    void drawGPSTrackLine(List<GPSPoint> list, RouteLineInfo routeLineInfo);

    void drawHeatmap(List<HeatmapData> list);

    void drawMarkerToPoint(GPSPoint gPSPoint, Bitmap bitmap);

    void drawRouteGPSLine(List<GPSPoint> list, int i, boolean z, RouteLineInfo routeLineInfo);

    void follow();

    void locate();

    void mapScreenShot(IOnMapScreenShotListener iOnMapScreenShotListener);

    void markGPSPoint(GPSPoint gPSPoint);

    void pauseMap();

    void removeAllLineMarkerPoint();

    void resumeMap();

    void saveInstanceStateMap(Bundle bundle);

    void scrollBy(int i, int i2);

    void setAllGesturesEnabled(boolean z);

    void setCarmeraLatLngBounds(List<GPSPoint> list);

    void setCenter(GPSPoint gPSPoint);

    void setDarkBackGround();

    void setDarkBackground(List<GPSPoint> list);

    void setDarkBackgroundColor(int i);

    void setDebugMode(int i);

    void setEndPoint(GPSPoint gPSPoint);

    void setHeatmapVisible(int i);

    void setILocationChanged(GPSPoint gPSPoint);

    void setLineWidthScale(float f);

    void setLocation(GPSPoint gPSPoint);

    void setMapViewMode(int i);

    void setMarked(boolean z);

    void setOnChangeListener(OnChangeListener onChangeListener);

    void setRouteCenter(GPSPoint gPSPoint);

    void setRouteTrackVisibility(boolean z);

    void setStartPoint(GPSPoint gPSPoint);

    void setTestLocation(GPSPoint gPSPoint);

    void setTrackRectangle(GPSPoint gPSPoint, GPSPoint gPSPoint2);

    void setTrackSectionColors(SparseArray<Integer> sparseArray);

    void startCPSTrackPlay(Boolean bool, SparseArray<List<GPSPoint>> sparseArray, List<GPSPoint> list, List<GPSPoint> list2, RouteLineInfo routeLineInfo, GPSSportTrackLoader.TrackPlayCallback trackPlayCallback, int i, float f, int i2);

    void startFollow();

    void stopFollow();

    void updateEndMarkerIcon(Bitmap bitmap);

    void zoomToShowAddedTrack();

    void zoomToShowAddedTrack(IMapAnimationCallback iMapAnimationCallback);

    void zoomToShowEntireTrack(List<GPSPoint> list);

    void zoomToShowEntireTrack(List<GPSPoint> list, IMapAnimationCallback iMapAnimationCallback);
}
