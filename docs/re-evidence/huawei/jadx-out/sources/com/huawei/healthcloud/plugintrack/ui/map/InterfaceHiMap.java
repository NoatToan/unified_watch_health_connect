package com.huawei.healthcloud.plugintrack.ui.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import com.huawei.healthcloud.plugintrack.model.MotionData;
import com.huawei.healthcloud.plugintrack.ui.map.animation.GrowAnimationBuilder;
import com.huawei.healthcloud.plugintrack.ui.map.mapdescription.MapTypeDescription;
import defpackage.jes;
import defpackage.jpg;
import defpackage.jpi;
import defpackage.jpk;
import defpackage.jrm;
import defpackage.jrp;
import defpackage.jrr;
import defpackage.jrs;
import defpackage.jrt;
import defpackage.jru;
import defpackage.jrv;
import defpackage.jrz;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceHiMap {
    public static final int MAP_TYPE_NIGHT = 3;
    public static final int MAP_TYPE_NIGHT_WITHOUT_TEXT = 5;
    public static final int MAP_TYPE_NONE = 2;
    public static final int MAP_TYPE_NORMAL = 0;
    public static final int MAP_TYPE_SATELLITE = 1;
    public static final int MAP_TYPE_WITHOUT_TEXT = 4;
    public static final int POLY_LINE_MAX_SIZE = 242;

    void addEndMarker(jpg jpgVar);

    void addEndMarker(jpg jpgVar, boolean z);

    List<Integer> addHiHealthMarkers(List<jpk> list);

    default void addLinePoint(jrt jrtVar) {
    }

    int addMarker(jrv jrvVar, GrowAnimationBuilder growAnimationBuilder);

    default void addMarkerClickListener(InterfaceMapMarkerClickCallback interfaceMapMarkerClickCallback) {
    }

    String addOverlay(jrz jrzVar);

    void addSportStartMarker(jpg jpgVar, int i);

    void addStartMarker(jpg jpgVar, int i);

    void animateCamera(jpg jpgVar, long j, InterfaceMapCallback interfaceMapCallback);

    default void animateCamera(jrr jrrVar, long j, InterfaceMapCallback interfaceMapCallback) {
    }

    void animateCamera(jru jruVar, int i);

    void cancelAnimation();

    default void changeMapType(MapTypeDescription mapTypeDescription, jes jesVar) {
    }

    void changeTrackColor(int i);

    default void clear() {
    }

    default List<MotionData> convertCoordinate(List<MotionData> list) {
        return list;
    }

    jpg convertLocationByCoordinate(Location location);

    default void disableAllGestures() {
    }

    default void disableMarkerClick() {
    }

    void drawAddMapTracking(jpg jpgVar, jpg jpgVar2);

    void drawInterrupt(jpg jpgVar, jpg jpgVar2);

    void drawLine(List<jpi> list);

    void drawLine(jpg jpgVar, jpg jpgVar2);

    default void drawLine(jrt jrtVar) {
    }

    String drawLines(jrs jrsVar);

    void forceDrawLine();

    double[] getLastLocation(Context context, Location location);

    double[] getLastLocation(Context context, double[] dArr);

    default int getMapEngineType() {
        return -1;
    }

    void getMapScreenShot(Handler handler, MotionData motionData);

    default float getMapTilt() {
        return 0.0f;
    }

    default float getMapZoom() {
        return 0.0f;
    }

    default float getMaxZoomLevel() {
        return 0.0f;
    }

    float getZoomToSpanLevel(jpg jpgVar, jpg jpgVar2);

    void hideMarker(int i, GrowAnimationBuilder growAnimationBuilder);

    void intervalTrackMarkers(int i);

    boolean isAnimationStart();

    default boolean isClockwise() {
        return false;
    }

    default void loadMapWithPreprocessData(List<jrp> list) {
    }

    void loadingEnd();

    void moveCameraByLatLng(jpg jpgVar);

    void moveCameraByZoom();

    void moveCameraByZoom(float f);

    void moveCameraLatLngBounds(List<jpg> list);

    default void moveMarker(int i, jpg jpgVar) {
    }

    void moveToCenter();

    void onCameraChangeListener();

    void onCreate(Bundle bundle, boolean z, boolean z2);

    default void onCreatePurely(Bundle bundle) {
    }

    void onDestroy();

    default void onDestroyPurely() {
    }

    void onMapLoaded();

    void onMapLoaded(List<MotionData> list);

    void onMapLoaded(jpg jpgVar, float f);

    void onPause();

    default void onPausePurely() {
    }

    void onResume();

    default void onResumePurely() {
    }

    void onSaveInstanceState(Bundle bundle);

    void onStart();

    void onStop();

    void pauseSportClear();

    void registerAnimationListener(InterfaceMapCallback interfaceMapCallback);

    void registerLoadingListener(InterfaceMapCallback interfaceMapCallback);

    default void removeLinePoint() {
    }

    List<jpg> requestSimplePoints();

    void resetTrackColor();

    void saveAddress(MotionData motionData);

    void screenShotToFile(InterfaceSnapshotCallback interfaceSnapshotCallback);

    void scrollBy(float f, float f2);

    void setAllGesturesEnabled(boolean z);

    default void setCameraChangeCallback(InterfaceMapStatusChangeCallback interfaceMapStatusChangeCallback) {
    }

    void setIsStop(boolean z);

    void setLineColor(int i, boolean z);

    void setLineVisible(String str, boolean z);

    void setLogoPadding(int i, int i2, int i3, int i4);

    default void setMapLoadedCallback(InterfaceMapLoadedCallback interfaceMapLoadedCallback) {
    }

    void setMapShowType(int i);

    default void setMapStyle(int i) {
    }

    void setMarkerIcon(int i, Bitmap bitmap);

    void setMarkerIconPath(String str, String str2);

    default void setOnMapLoadedListener(InterfaceMapLoadedCallback interfaceMapLoadedCallback) {
    }

    void setOverlayVisible(String str, boolean z);

    void setPointToCenter(int i, int i2);

    void setPointToCenterWhole(boolean z);

    default void setPreviewStatus(jrm jrmVar, int i, int i2, int i3, int i4) {
    }

    void setScaleControlsEnabled(boolean z);

    void setScreenOnOrForegrand(boolean z);

    void setShowMapEnd(boolean z);

    void setSportTabCenter(DisplayMetrics displayMetrics);

    void setZoomControlsEnabled(boolean z);

    void showMarker(int i, GrowAnimationBuilder growAnimationBuilder);

    void showOrHide(boolean z);

    default void showPureMap() {
    }

    void showSatelLiteState(boolean z, boolean z2, int i);

    void startMapAnimation(boolean z);

    default void stopAnimation() {
    }

    void updateSportMarker(jpg jpgVar, BitmapDrawable bitmapDrawable);

    default GrowAnimationBuilder getGrowAnimation() {
        return new GrowAnimationBuilder(this) { // from class: com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap.4
            @Override // com.huawei.healthcloud.plugintrack.ui.map.animation.GrowAnimationBuilder
            public void disappearAnimation() {
            }

            @Override // com.huawei.healthcloud.plugintrack.ui.map.animation.GrowAnimationBuilder
            public void displayAnimation() {
            }
        };
    }

    default jrr getMapStatus() {
        return new jrr();
    }

    default Point getScreenLocation(jpg jpgVar) {
        return new Point();
    }

    default jpg getLatLngByScreenPoint(Point point) {
        return new jpg(0.0d, 0.0d);
    }
}
