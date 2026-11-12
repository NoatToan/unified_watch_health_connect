package com.huawei.hms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.maps.mai;
import com.huawei.hms.maps.model.CameraPosition;
import com.huawei.hms.maps.model.CameraUpdateParam;
import com.huawei.hms.maps.model.CircleOptions;
import com.huawei.hms.maps.model.GroundOverlayOptions;
import com.huawei.hms.maps.model.HeatMapOptions;
import com.huawei.hms.maps.model.LatLngBounds;
import com.huawei.hms.maps.model.MapStyleOptions;
import com.huawei.hms.maps.model.MarkerOptions;
import com.huawei.hms.maps.model.MyLocationStyle;
import com.huawei.hms.maps.model.PolygonOptions;
import com.huawei.hms.maps.model.PolylineOptions;
import com.huawei.hms.maps.model.TileOverlayOptions;
import com.huawei.hms.maps.model.internal.IBitmapDescriptorDelegate;
import com.huawei.hms.maps.model.internal.ICircleDelegate;
import com.huawei.hms.maps.model.internal.IGroundOverlayDelegate;
import com.huawei.hms.maps.model.internal.IHeatMapDelegate;
import com.huawei.hms.maps.model.internal.IIndoorBuildingDelegate;
import com.huawei.hms.maps.model.internal.IMarkerDelegate;
import com.huawei.hms.maps.model.internal.IPolygonDelegate;
import com.huawei.hms.maps.model.internal.IPolylineDelegate;
import com.huawei.hms.maps.model.internal.ITileOverlayDelegate;

/* JADX INFO: loaded from: classes10.dex */
public interface IHuaweiMapDelegate extends IInterface {
    ICircleDelegate addCircle(CircleOptions circleOptions);

    IGroundOverlayDelegate addGroundOverlay(GroundOverlayOptions groundOverlayOptions);

    IHeatMapDelegate addHeatMap(String str, HeatMapOptions heatMapOptions);

    IMarkerDelegate addMarker(MarkerOptions markerOptions);

    IPolygonDelegate addPolygon(PolygonOptions polygonOptions);

    IPolylineDelegate addPolyline(PolylineOptions polylineOptions);

    ITileOverlayDelegate addTileOverlay(TileOverlayOptions tileOverlayOptions);

    void animateCamera(CameraUpdateParam cameraUpdateParam);

    void animateCameraWithCallback(CameraUpdateParam cameraUpdateParam, ICancelableCallback iCancelableCallback);

    void animateCameraWithDurationAndCallback(CameraUpdateParam cameraUpdateParam, int i, ICancelableCallback iCancelableCallback);

    void clear();

    IBitmapDescriptorDelegate getBitmapDescriptor();

    CameraPosition getCameraPosition();

    String getCurrentFloor();

    IIndoorBuildingDelegate getFocusedBuilding();

    int getMapType();

    float getMaxZoomLevel();

    float getMinZoomLevel();

    IProjectionDelegate getProjection();

    float getScalePerPixel();

    IUiSettingsDelegate getUiSettings();

    boolean isBuildingsEnabled();

    boolean isDark();

    boolean isIndoorEnabled();

    boolean isMyLocationEnabled();

    boolean isTrafficEnabled();

    void moveCamera(CameraUpdateParam cameraUpdateParam);

    void previewId(String str);

    void resetMinMaxZoomPreference();

    void setBuildingsEnabled(boolean z);

    void setCameraIdleListener(IOnCameraIdleListener iOnCameraIdleListener);

    void setCameraMoveCanceledListener(IOnCameraMoveCanceledListener iOnCameraMoveCanceledListener);

    void setCameraMoveListener(IOnCameraMoveListener iOnCameraMoveListener);

    void setCameraMoveStartedListener(IOnCameraMoveStartedListener iOnCameraMoveStartedListener);

    void setCircleClickListener(IOnCircleClickListener iOnCircleClickListener);

    void setCommonDir(int i, String str);

    void setContentDescription(String str);

    void setDark(boolean z);

    void setFrameTime(int i);

    void setGcj02CoordinateEnabled(boolean z);

    void setGeoPoliticalView(String str);

    boolean setIndoorEnabled(boolean z);

    void setIndoorViewListener(IOnIndoorViewListener iOnIndoorViewListener);

    void setInfoWindowAdapter(IInfoWindowAdapter iInfoWindowAdapter);

    void setLanguage(String str);

    void setLatLngBoundsForCameraTarget(LatLngBounds latLngBounds);

    void setLiteMode(boolean z);

    void setLocationSource(ILocationSourceDelegate iLocationSourceDelegate);

    boolean setMapStyle(MapStyleOptions mapStyleOptions);

    void setMapType(int i);

    void setMarkerClickListener(IOnMarkerClickListener iOnMarkerClickListener);

    void setMarkerDragListener(IOnMarkerDragListener iOnMarkerDragListener);

    void setMarkersClustering(boolean z);

    void setMaxZoomPreference(float f);

    void setMinZoomPreference(float f);

    void setMyLocationEnabled(boolean z);

    void setMyLocationStyle(MyLocationStyle myLocationStyle);

    void setOnCameraChangeListener(IOnCameraChangeListener iOnCameraChangeListener);

    void setOnGroundOverlayClickListener(IOnGroundOverlayClickListener iOnGroundOverlayClickListener);

    void setOnIndoorStateChangeListener(IOnIndoorStateChangeListener iOnIndoorStateChangeListener);

    void setOnInfoWindowClickListener(IOnInfoWindowClickListener iOnInfoWindowClickListener);

    void setOnInfoWindowCloseListener(IOnInfoWindowCloseListener iOnInfoWindowCloseListener);

    void setOnInfoWindowLongClickListener(IOnInfoWindowLongClickListener iOnInfoWindowLongClickListener);

    void setOnMapClickListener(IOnMapClickListener iOnMapClickListener);

    void setOnMapLoadedCallback(IOnMapLoadedCallback iOnMapLoadedCallback);

    void setOnMapLongClickListener(IOnMapLongClickListener iOnMapLongClickListener);

    void setOnMyLocationButtonClickListener(IOnMyLocationButtonClickListener iOnMyLocationButtonClickListener);

    void setOnMyLocationChangeListener(IOnMyLocationChangeListener iOnMyLocationChangeListener);

    void setOnMyLocationClickListener(IOnMyLocationClickListener iOnMyLocationClickListener);

    void setOnPoiClickListener(IOnPoiClickListener iOnPoiClickListener);

    void setOnPolygonClickListener(IOnPolygonClickListener iOnPolygonClickListener);

    void setOnPolylineClickListener(IOnPolylineClickListener iOnPolylineClickListener);

    void setPadding(int i, int i2, int i3, int i4);

    void setPointToCenter(int i, int i2);

    void setPolygonClickListener(IOnPolygonClickListener iOnPolygonClickListener);

    void setPolylineClickListener(IOnPolylineClickListener iOnPolylineClickListener);

    void setStyleId(String str);

    void setTrafficEnabled(boolean z);

    void setWatermarkEnabled(boolean z);

    void snapshot(ISnapshotReadyCallback iSnapshotReadyCallback, IObjectWrapper iObjectWrapper);

    void snapshotForTest(ISnapshotReadyCallback iSnapshotReadyCallback);

    void stopAnimation();

    void switchIndoorFloor(String str, String str2);

    boolean useViewLifecycleWhenInFragment();

    public static abstract class Stub extends Binder implements IHuaweiMapDelegate {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        static class Proxy implements IHuaweiMapDelegate {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f14167a;

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public boolean useViewLifecycleWhenInFragment() {
                return mai.a(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 21);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void switchIndoorFloor(String str, String str2) {
                mai.a(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 76, str, str2);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void stopAnimation() {
                mai.j(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 66);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void snapshotForTest(ISnapshotReadyCallback iSnapshotReadyCallback) {
                mai.a(iSnapshotReadyCallback != null ? iSnapshotReadyCallback.asBinder() : null, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 65);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void snapshot(ISnapshotReadyCallback iSnapshotReadyCallback, IObjectWrapper iObjectWrapper) {
                mai.a(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 64, iSnapshotReadyCallback != null ? iSnapshotReadyCallback.asBinder() : null, iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setWatermarkEnabled(boolean z) {
                mai.a(z, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 20);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setTrafficEnabled(boolean z) {
                mai.a(z, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 19);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setStyleId(String str) {
                mai.a(str, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 71);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setPolylineClickListener(IOnPolylineClickListener iOnPolylineClickListener) {
                mai.a(iOnPolylineClickListener != null ? iOnPolylineClickListener.asBinder() : null, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 44);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setPolygonClickListener(IOnPolygonClickListener iOnPolygonClickListener) {
                mai.a(iOnPolygonClickListener != null ? iOnPolygonClickListener.asBinder() : null, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 43);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setPointToCenter(int i, int i2) {
                mai.a(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 70, Integer.valueOf(i), Integer.valueOf(i2));
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setPadding(int i, int i2, int i3, int i4) {
                mai.a(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 18, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setOnPolylineClickListener(IOnPolylineClickListener iOnPolylineClickListener) {
                mai.a(iOnPolylineClickListener != null ? iOnPolylineClickListener.asBinder() : null, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 63);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setOnPolygonClickListener(IOnPolygonClickListener iOnPolygonClickListener) {
                mai.a(iOnPolygonClickListener != null ? iOnPolygonClickListener.asBinder() : null, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 62);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setOnPoiClickListener(IOnPoiClickListener iOnPoiClickListener) {
                mai.a(iOnPoiClickListener != null ? iOnPoiClickListener.asBinder() : null, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 61);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setOnMyLocationClickListener(IOnMyLocationClickListener iOnMyLocationClickListener) {
                mai.a(iOnMyLocationClickListener != null ? iOnMyLocationClickListener.asBinder() : null, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 57);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setOnMyLocationChangeListener(IOnMyLocationChangeListener iOnMyLocationChangeListener) {
                mai.a(iOnMyLocationChangeListener != null ? iOnMyLocationChangeListener.asBinder() : null, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 56);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setOnMyLocationButtonClickListener(IOnMyLocationButtonClickListener iOnMyLocationButtonClickListener) {
                mai.a(iOnMyLocationButtonClickListener != null ? iOnMyLocationButtonClickListener.asBinder() : null, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 55);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setOnMapLongClickListener(IOnMapLongClickListener iOnMapLongClickListener) {
                mai.a(iOnMapLongClickListener != null ? iOnMapLongClickListener.asBinder() : null, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 53);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setOnMapLoadedCallback(IOnMapLoadedCallback iOnMapLoadedCallback) {
                mai.a(iOnMapLoadedCallback != null ? iOnMapLoadedCallback.asBinder() : null, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 30);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setOnMapClickListener(IOnMapClickListener iOnMapClickListener) {
                mai.a(iOnMapClickListener != null ? iOnMapClickListener.asBinder() : null, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 54);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setOnInfoWindowLongClickListener(IOnInfoWindowLongClickListener iOnInfoWindowLongClickListener) {
                mai.a(iOnInfoWindowLongClickListener != null ? iOnInfoWindowLongClickListener.asBinder() : null, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 50);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setOnInfoWindowCloseListener(IOnInfoWindowCloseListener iOnInfoWindowCloseListener) {
                mai.a(iOnInfoWindowCloseListener != null ? iOnInfoWindowCloseListener.asBinder() : null, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 49);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setOnInfoWindowClickListener(IOnInfoWindowClickListener iOnInfoWindowClickListener) {
                mai.a(iOnInfoWindowClickListener != null ? iOnInfoWindowClickListener.asBinder() : null, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 46);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setOnIndoorStateChangeListener(IOnIndoorStateChangeListener iOnIndoorStateChangeListener) {
                mai.a(iOnIndoorStateChangeListener != null ? iOnIndoorStateChangeListener.asBinder() : null, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 48);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setOnGroundOverlayClickListener(IOnGroundOverlayClickListener iOnGroundOverlayClickListener) {
                mai.a(iOnGroundOverlayClickListener != null ? iOnGroundOverlayClickListener.asBinder() : null, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 47);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setOnCameraChangeListener(IOnCameraChangeListener iOnCameraChangeListener) {
                mai.a(iOnCameraChangeListener != null ? iOnCameraChangeListener.asBinder() : null, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 84);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setMyLocationStyle(MyLocationStyle myLocationStyle) {
                mai.a(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 81, myLocationStyle);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setMyLocationEnabled(boolean z) {
                mai.a(z, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 8);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setMinZoomPreference(float f) {
                mai.a(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 17, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setMaxZoomPreference(float f) {
                mai.a(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 16, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setMarkersClustering(boolean z) {
                mai.a(z, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 60);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setMarkerDragListener(IOnMarkerDragListener iOnMarkerDragListener) {
                mai.a(iOnMarkerDragListener != null ? iOnMarkerDragListener.asBinder() : null, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 52);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setMarkerClickListener(IOnMarkerClickListener iOnMarkerClickListener) {
                mai.a(iOnMarkerClickListener != null ? iOnMarkerClickListener.asBinder() : null, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 51);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setMapType(int i) {
                mai.a(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 7, Integer.valueOf(i));
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public boolean setMapStyle(MapStyleOptions mapStyleOptions) {
                return mai.a(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 59, 0, mapStyleOptions).intValue() != 0;
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setLocationSource(ILocationSourceDelegate iLocationSourceDelegate) {
                mai.a(iLocationSourceDelegate != null ? iLocationSourceDelegate.asBinder() : null, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 58);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setLiteMode(boolean z) {
                mai.a(z, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 31);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setLatLngBoundsForCameraTarget(LatLngBounds latLngBounds) {
                mai.a(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 23, latLngBounds);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setLanguage(String str) {
                mai.a(str, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 69);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setInfoWindowAdapter(IInfoWindowAdapter iInfoWindowAdapter) {
                mai.a(iInfoWindowAdapter != null ? iInfoWindowAdapter.asBinder() : null, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 45);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setIndoorViewListener(IOnIndoorViewListener iOnIndoorViewListener) {
                mai.a(iOnIndoorViewListener != null ? iOnIndoorViewListener.asBinder() : null, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 77);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public boolean setIndoorEnabled(boolean z) {
                return mai.a(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 15, z);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setGeoPoliticalView(String str) {
                mai.a(str, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 67);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setGcj02CoordinateEnabled(boolean z) {
                mai.a(z, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 73);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setFrameTime(int i) {
                mai.a(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 83, Integer.valueOf(i));
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setDark(boolean z) {
                mai.a(z, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 78);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setContentDescription(String str) {
                mai.a(str, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 14);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setCommonDir(int i, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.maps.internal.IHuaweiMapDelegate");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    this.f14167a.transact(82, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setCircleClickListener(IOnCircleClickListener iOnCircleClickListener) {
                mai.a(iOnCircleClickListener != null ? iOnCircleClickListener.asBinder() : null, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 42);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setCameraMoveStartedListener(IOnCameraMoveStartedListener iOnCameraMoveStartedListener) {
                mai.a(iOnCameraMoveStartedListener != null ? iOnCameraMoveStartedListener.asBinder() : null, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 37);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setCameraMoveListener(IOnCameraMoveListener iOnCameraMoveListener) {
                mai.a(iOnCameraMoveListener != null ? iOnCameraMoveListener.asBinder() : null, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 38);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setCameraMoveCanceledListener(IOnCameraMoveCanceledListener iOnCameraMoveCanceledListener) {
                mai.a(iOnCameraMoveCanceledListener != null ? iOnCameraMoveCanceledListener.asBinder() : null, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 39);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setCameraIdleListener(IOnCameraIdleListener iOnCameraIdleListener) {
                mai.a(iOnCameraIdleListener != null ? iOnCameraIdleListener.asBinder() : null, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 40);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void setBuildingsEnabled(boolean z) {
                mai.a(z, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 6);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void resetMinMaxZoomPreference() {
                mai.j(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 13);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void previewId(String str) {
                mai.a(str, this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 72);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void moveCamera(CameraUpdateParam cameraUpdateParam) {
                mai.a(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 34, cameraUpdateParam);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public boolean isTrafficEnabled() {
                return mai.a(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 12);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public boolean isMyLocationEnabled() {
                return mai.a(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 9);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public boolean isIndoorEnabled() {
                return mai.a(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 11);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public boolean isDark() {
                return mai.a(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 79);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public boolean isBuildingsEnabled() {
                return mai.a(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 5);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public IUiSettingsDelegate getUiSettings() {
                return IUiSettingsDelegate.Stub.asInterface(mai.i(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 22));
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public float getScalePerPixel() {
                return mai.b(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 80);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public IProjectionDelegate getProjection() {
                return IProjectionDelegate.Stub.asInterface(mai.i(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 29));
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public float getMinZoomLevel() {
                return mai.b(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 4);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public float getMaxZoomLevel() {
                return mai.b(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 3);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public int getMapType() {
                return mai.c(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 10);
            }

            public String getInterfaceDescriptor() {
                return "com.huawei.hms.maps.internal.IHuaweiMapDelegate";
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public IIndoorBuildingDelegate getFocusedBuilding() {
                return IIndoorBuildingDelegate.Stub.asInterface(mai.i(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 2));
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public String getCurrentFloor() {
                return mai.h(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 75);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public CameraPosition getCameraPosition() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.maps.internal.IHuaweiMapDelegate");
                    this.f14167a.transact(41, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? CameraPosition.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public IBitmapDescriptorDelegate getBitmapDescriptor() {
                return IBitmapDescriptorDelegate.Stub.asInterface(mai.i(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 68));
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void clear() {
                mai.j(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 32);
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14167a;
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void animateCameraWithDurationAndCallback(CameraUpdateParam cameraUpdateParam, int i, ICancelableCallback iCancelableCallback) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.maps.internal.IHuaweiMapDelegate");
                    if (cameraUpdateParam != null) {
                        parcelObtain.writeInt(1);
                        cameraUpdateParam.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongBinder(iCancelableCallback != null ? iCancelableCallback.asBinder() : null);
                    this.f14167a.transact(36, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void animateCameraWithCallback(CameraUpdateParam cameraUpdateParam, ICancelableCallback iCancelableCallback) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.maps.internal.IHuaweiMapDelegate");
                    if (cameraUpdateParam != null) {
                        parcelObtain.writeInt(1);
                        cameraUpdateParam.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iCancelableCallback != null ? iCancelableCallback.asBinder() : null);
                    this.f14167a.transact(35, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public void animateCamera(CameraUpdateParam cameraUpdateParam) {
                mai.a(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 33, cameraUpdateParam);
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public ITileOverlayDelegate addTileOverlay(TileOverlayOptions tileOverlayOptions) {
                return ITileOverlayDelegate.Stub.asInterface(mai.a(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 1, tileOverlayOptions));
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public IPolylineDelegate addPolyline(PolylineOptions polylineOptions) {
                return IPolylineDelegate.Stub.asInterface(mai.a(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 27, polylineOptions));
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public IPolygonDelegate addPolygon(PolygonOptions polygonOptions) {
                return IPolygonDelegate.Stub.asInterface(mai.a(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 26, polygonOptions));
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public IMarkerDelegate addMarker(MarkerOptions markerOptions) {
                return IMarkerDelegate.Stub.asInterface(mai.a(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 24, markerOptions));
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public IHeatMapDelegate addHeatMap(String str, HeatMapOptions heatMapOptions) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.maps.internal.IHuaweiMapDelegate");
                    parcelObtain.writeString(str);
                    if (heatMapOptions != null) {
                        parcelObtain.writeInt(1);
                        heatMapOptions.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f14167a.transact(74, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return IHeatMapDelegate.Stub.asInterface(parcelObtain2.readStrongBinder());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public IGroundOverlayDelegate addGroundOverlay(GroundOverlayOptions groundOverlayOptions) {
                return IGroundOverlayDelegate.Stub.asInterface(mai.a(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 28, groundOverlayOptions));
            }

            @Override // com.huawei.hms.maps.internal.IHuaweiMapDelegate
            public ICircleDelegate addCircle(CircleOptions circleOptions) {
                return ICircleDelegate.Stub.asInterface(mai.a(this.f14167a, "com.huawei.hms.maps.internal.IHuaweiMapDelegate", 25, circleOptions));
            }

            Proxy(IBinder iBinder) {
                this.f14167a = iBinder;
            }
        }

        public static IHuaweiMapDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.internal.IHuaweiMapDelegate");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IHuaweiMapDelegate)) ? new Proxy(iBinder) : (IHuaweiMapDelegate) iInterfaceQueryLocalInterface;
        }

        public Stub() {
            attachInterface(this, "com.huawei.hms.maps.internal.IHuaweiMapDelegate");
        }
    }
}
