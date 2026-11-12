package com.amap.api.maps.interfaces;

import android.os.RemoteException;
import android.view.MotionEvent;
import com.amap.api.mapcore.util.df;
import com.amap.api.mapcore.util.w;
import com.amap.api.maps.model.BaseOptions;
import com.amap.api.maps.model.BaseOverlay;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.CircleOptions;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MultiPointItem;
import com.amap.api.maps.model.PolygonOptions;
import com.amap.api.maps.model.Polyline;
import com.amap.api.maps.model.PolylineOptions;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.mapcore.FPoint;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface IGlOverlayLayer {
    boolean IsCircleContainPoint(CircleOptions circleOptions, LatLng latLng);

    boolean IsPolygonContainsPoint(PolygonOptions polygonOptions, LatLng latLng);

    BaseOverlay addOverlayObject(String str, BaseOverlay baseOverlay, BaseOptions baseOptions);

    void addRecycleTextureIds(w wVar);

    void changeOverlayIndex();

    boolean checkInBounds(String str);

    void clear(String... strArr);

    void clearTileCache();

    String createId(String str);

    void destroy();

    boolean draw(int i, int i2, boolean z);

    int getCurrentParticleNum(String str);

    float[] getFinalMatrix();

    df getGLShaderManager();

    BaseOverlay getHitBaseOverlay(MotionEvent motionEvent);

    BaseOverlay getHitBaseOverlay(LatLng latLng);

    Polyline getHitOverlay(LatLng latLng);

    IAMapDelegate getMap();

    List<Marker> getMapScreenMarkers();

    void getMarkerInfoWindowOffset(String str, FPoint fPoint);

    void getMultiPointItem(LatLng latLng, MultiPointItem multiPointItem);

    Object getNativeProperties(String str, String str2, Object[] objArr);

    LatLng getNearestLatLng(PolylineOptions polylineOptions, LatLng latLng);

    void getOverlayScreenPos(String str, FPoint fPoint);

    w getTextureItem(BitmapDescriptor bitmapDescriptor);

    void hideInfoWindow(String str);

    void onCreateAMapInstance();

    void processCircleHoleOption(CircleOptions circleOptions);

    void processPolygonHoleOption(PolygonOptions polygonOptions);

    boolean removeOverlay(String str) throws RemoteException;

    boolean removeOverlay(String str, boolean z) throws RemoteException;

    void set2Top(String str);

    void setFlingState(boolean z);

    void setGlShaderManager(df dfVar);

    void setRunLowFrame(boolean z);

    void showInfoWindow(String str);

    void updateOption(String str, BaseOptions baseOptions);
}
