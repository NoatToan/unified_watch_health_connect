package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.model.AdvancedMarker;
import com.google.android.gms.maps.model.AdvancedMarkerOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.FeatureLayer;
import com.google.android.gms.maps.model.FeatureLayerOptions;
import com.google.android.gms.maps.model.FeatureType;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.IndoorBuilding;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapCapabilities;
import com.google.android.gms.maps.model.MapColorScheme;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PointOfInterest;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class GoogleMap {
    public static final String DEMO_MAP_ID = "demo_map_id";
    public static final int MAP_TYPE_HYBRID = 4;
    public static final int MAP_TYPE_NONE = 0;
    public static final int MAP_TYPE_NORMAL = 1;
    public static final int MAP_TYPE_SATELLITE = 2;
    public static final int MAP_TYPE_TERRAIN = 3;
    private final IGoogleMapDelegate zza;
    private MapCapabilities zzb;
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private UiSettings zze;

    public interface CancelableCallback {
        void onCancel();

        void onFinish();
    }

    public interface InfoWindowAdapter {
        View getInfoContents(Marker marker);

        View getInfoWindow(Marker marker);
    }

    @Deprecated
    public interface OnCameraChangeListener {
        void onCameraChange(CameraPosition cameraPosition);
    }

    public interface OnCameraIdleListener {
        void onCameraIdle();
    }

    public interface OnCameraMoveCanceledListener {
        void onCameraMoveCanceled();
    }

    public interface OnCameraMoveListener {
        void onCameraMove();
    }

    public interface OnCameraMoveStartedListener {
        public static final int REASON_API_ANIMATION = 2;
        public static final int REASON_DEVELOPER_ANIMATION = 3;
        public static final int REASON_GESTURE = 1;

        void onCameraMoveStarted(int i14);
    }

    public interface OnCircleClickListener {
        void onCircleClick(Circle circle);
    }

    public interface OnGroundOverlayClickListener {
        void onGroundOverlayClick(GroundOverlay groundOverlay);
    }

    public interface OnIndoorStateChangeListener {
        void onIndoorBuildingFocused();

        void onIndoorLevelActivated(IndoorBuilding indoorBuilding);
    }

    public interface OnInfoWindowClickListener {
        void onInfoWindowClick(Marker marker);
    }

    public interface OnInfoWindowCloseListener {
        void onInfoWindowClose(Marker marker);
    }

    public interface OnInfoWindowLongClickListener {
        void onInfoWindowLongClick(Marker marker);
    }

    public interface OnMapCapabilitiesChangedListener {
        void onMapCapabilitiesChanged(MapCapabilities mapCapabilities);
    }

    public interface OnMapClickListener {
        void onMapClick(LatLng latLng);
    }

    public interface OnMapLoadedCallback {
        void onMapLoaded();
    }

    public interface OnMapLongClickListener {
        void onMapLongClick(LatLng latLng);
    }

    public interface OnMarkerClickListener {
        boolean onMarkerClick(Marker marker);
    }

    public interface OnMarkerDragListener {
        void onMarkerDrag(Marker marker);

        void onMarkerDragEnd(Marker marker);

        void onMarkerDragStart(Marker marker);
    }

    public interface OnMyLocationButtonClickListener {
        boolean onMyLocationButtonClick();
    }

    @Deprecated
    public interface OnMyLocationChangeListener {
        void onMyLocationChange(Location location);
    }

    public interface OnMyLocationClickListener {
        void onMyLocationClick(Location location);
    }

    public interface OnPoiClickListener {
        void onPoiClick(PointOfInterest pointOfInterest);
    }

    public interface OnPolygonClickListener {
        void onPolygonClick(Polygon polygon);
    }

    public interface OnPolylineClickListener {
        void onPolylineClick(Polyline polyline);
    }

    public interface SnapshotReadyCallback {
        void onSnapshotReady(Bitmap bitmap);
    }

    public GoogleMap(IGoogleMapDelegate iGoogleMapDelegate) {
        this.zza = (IGoogleMapDelegate) Preconditions.checkNotNull(iGoogleMapDelegate);
    }

    public final Circle addCircle(CircleOptions circleOptions) {
        try {
            Preconditions.checkNotNull(circleOptions, "CircleOptions must not be null.");
            return new Circle(this.zza.addCircle(circleOptions));
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public final GroundOverlay addGroundOverlay(GroundOverlayOptions groundOverlayOptions) {
        try {
            Preconditions.checkNotNull(groundOverlayOptions, "GroundOverlayOptions must not be null.");
            com.google.android.gms.internal.maps.zzx zzxVarAddGroundOverlay = this.zza.addGroundOverlay(groundOverlayOptions);
            if (zzxVarAddGroundOverlay != null) {
                return new GroundOverlay(zzxVarAddGroundOverlay);
            }
            return null;
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public final Marker addMarker(MarkerOptions markerOptions) {
        if (markerOptions instanceof AdvancedMarkerOptions) {
            markerOptions.zzf(1);
        }
        try {
            Preconditions.checkNotNull(markerOptions, "MarkerOptions must not be null.");
            com.google.android.gms.internal.maps.zzaj zzajVarAddMarker = this.zza.addMarker(markerOptions);
            if (zzajVarAddMarker != null) {
                return markerOptions.zzb() == 1 ? new AdvancedMarker(zzajVarAddMarker) : new Marker(zzajVarAddMarker);
            }
            return null;
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public final void addOnMapCapabilitiesChangedListener(OnMapCapabilitiesChangedListener onMapCapabilitiesChangedListener) {
        try {
            zzs zzsVar = new zzs(this, onMapCapabilitiesChangedListener);
            this.zzc.put(onMapCapabilitiesChangedListener, zzsVar);
            this.zza.addOnMapCapabilitiesChangedListener(zzsVar);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final Polygon addPolygon(PolygonOptions polygonOptions) {
        try {
            Preconditions.checkNotNull(polygonOptions, "PolygonOptions must not be null");
            return new Polygon(this.zza.addPolygon(polygonOptions));
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public final Polyline addPolyline(PolylineOptions polylineOptions) {
        try {
            Preconditions.checkNotNull(polylineOptions, "PolylineOptions must not be null");
            return new Polyline(this.zza.addPolyline(polylineOptions));
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public final TileOverlay addTileOverlay(TileOverlayOptions tileOverlayOptions) {
        try {
            Preconditions.checkNotNull(tileOverlayOptions, "TileOverlayOptions must not be null.");
            com.google.android.gms.internal.maps.zzaw zzawVarAddTileOverlay = this.zza.addTileOverlay(tileOverlayOptions);
            if (zzawVarAddTileOverlay != null) {
                return new TileOverlay(zzawVarAddTileOverlay);
            }
            return null;
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public final void animateCamera(CameraUpdate cameraUpdate, int i14, CancelableCallback cancelableCallback) {
        try {
            Preconditions.checkNotNull(cameraUpdate, "CameraUpdate must not be null.");
            this.zza.animateCameraWithDurationAndCallback(cameraUpdate.zza(), i14, cancelableCallback == null ? null : new zzab(cancelableCallback));
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void clear() {
        try {
            this.zza.clear();
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final CameraPosition getCameraPosition() {
        try {
            return this.zza.getCameraPosition();
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public FeatureLayer getFeatureLayer(FeatureLayerOptions featureLayerOptions) {
        String featureType = featureLayerOptions.getFeatureType();
        String datasetId = featureLayerOptions.getDatasetId();
        boolean zEquals = featureType.equals(FeatureType.DATASET);
        Map map = this.zzd;
        FeatureLayer featureLayer = zEquals ? (FeatureLayer) map.get(datasetId) : (FeatureLayer) map.get(featureType);
        if (featureLayer != null) {
            return featureLayer;
        }
        try {
            FeatureLayer featureLayer2 = new FeatureLayer(this.zza.getFeatureLayer(featureLayerOptions));
            Map map2 = this.zzd;
            if (zEquals) {
                map2.put(datasetId, featureLayer2);
                return featureLayer2;
            }
            map2.put(featureType, featureLayer2);
            return featureLayer2;
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public IndoorBuilding getFocusedBuilding() {
        try {
            com.google.android.gms.internal.maps.zzaa focusedBuilding = this.zza.getFocusedBuilding();
            if (focusedBuilding != null) {
                return new IndoorBuilding(focusedBuilding);
            }
            return null;
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public MapCapabilities getMapCapabilities() {
        if (this.zzb == null) {
            try {
                this.zzb = new MapCapabilities(this.zza.getMapCapabilities());
            } catch (RemoteException e4) {
                a.i(e4);
                return null;
            }
        }
        return this.zzb;
    }

    @MapColorScheme
    public int getMapColorScheme() {
        try {
            return this.zza.getMapColorScheme();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0;
        }
    }

    public final int getMapType() {
        try {
            return this.zza.getMapType();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0;
        }
    }

    public final float getMaxZoomLevel() {
        try {
            return this.zza.getMaxZoomLevel();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0.0f;
        }
    }

    public final float getMinZoomLevel() {
        try {
            return this.zza.getMinZoomLevel();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0.0f;
        }
    }

    @Deprecated
    public final Location getMyLocation() {
        try {
            return this.zza.getMyLocation();
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public final Projection getProjection() {
        try {
            return new Projection(this.zza.getProjection());
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public final UiSettings getUiSettings() {
        try {
            if (this.zze == null) {
                this.zze = new UiSettings(this.zza.getUiSettings());
            }
            return this.zze;
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public final boolean isBuildingsEnabled() {
        try {
            return this.zza.isBuildingsEnabled();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public final boolean isIndoorEnabled() {
        try {
            return this.zza.isIndoorEnabled();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public final boolean isMyLocationEnabled() {
        try {
            return this.zza.isMyLocationEnabled();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public final boolean isTrafficEnabled() {
        try {
            return this.zza.isTrafficEnabled();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public final void moveCamera(CameraUpdate cameraUpdate) {
        try {
            Preconditions.checkNotNull(cameraUpdate, "CameraUpdate must not be null.");
            this.zza.moveCamera(cameraUpdate.zza());
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void removeOnMapCapabilitiesChangedListener(OnMapCapabilitiesChangedListener onMapCapabilitiesChangedListener) {
        try {
            Map map = this.zzc;
            if (map.containsKey(onMapCapabilitiesChangedListener)) {
                this.zza.removeOnMapCapabilitiesChangedListener((com.google.android.gms.maps.internal.zzal) map.get(onMapCapabilitiesChangedListener));
                map.remove(onMapCapabilitiesChangedListener);
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void resetMinMaxZoomPreference() {
        try {
            this.zza.resetMinMaxZoomPreference();
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void setBuildingsEnabled(boolean z14) {
        try {
            this.zza.setBuildingsEnabled(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void setContentDescription(String str) {
        try {
            this.zza.setContentDescription(str);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final boolean setIndoorEnabled(boolean z14) {
        try {
            return this.zza.setIndoorEnabled(z14);
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public final void setInfoWindowAdapter(InfoWindowAdapter infoWindowAdapter) {
        IGoogleMapDelegate iGoogleMapDelegate = this.zza;
        try {
            if (infoWindowAdapter == null) {
                iGoogleMapDelegate.setInfoWindowAdapter(null);
            } else {
                iGoogleMapDelegate.setInfoWindowAdapter(new zzf(this, infoWindowAdapter));
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setLatLngBoundsForCameraTarget(LatLngBounds latLngBounds) {
        try {
            this.zza.setLatLngBoundsForCameraTarget(latLngBounds);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void setLocationSource(LocationSource locationSource) {
        IGoogleMapDelegate iGoogleMapDelegate = this.zza;
        try {
            if (locationSource == null) {
                iGoogleMapDelegate.setLocationSource(null);
            } else {
                iGoogleMapDelegate.setLocationSource(new zzt(this, locationSource));
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setMapColorScheme(@MapColorScheme int i14) {
        try {
            this.zza.setMapColorScheme(i14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public boolean setMapStyle(MapStyleOptions mapStyleOptions) {
        try {
            return this.zza.setMapStyle(mapStyleOptions);
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public final void setMapType(int i14) {
        try {
            this.zza.setMapType(i14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setMaxZoomPreference(float f14) {
        try {
            this.zza.setMaxZoomPreference(f14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setMinZoomPreference(float f14) {
        try {
            this.zza.setMinZoomPreference(f14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void setMyLocationEnabled(boolean z14) {
        try {
            this.zza.setMyLocationEnabled(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    @Deprecated
    public final void setOnCameraChangeListener(OnCameraChangeListener onCameraChangeListener) {
        IGoogleMapDelegate iGoogleMapDelegate = this.zza;
        try {
            if (onCameraChangeListener == null) {
                iGoogleMapDelegate.setOnCameraChangeListener(null);
            } else {
                iGoogleMapDelegate.setOnCameraChangeListener(new zzu(this, onCameraChangeListener));
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void setOnCameraIdleListener(OnCameraIdleListener onCameraIdleListener) {
        IGoogleMapDelegate iGoogleMapDelegate = this.zza;
        try {
            if (onCameraIdleListener == null) {
                iGoogleMapDelegate.setOnCameraIdleListener(null);
            } else {
                iGoogleMapDelegate.setOnCameraIdleListener(new zzy(this, onCameraIdleListener));
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void setOnCameraMoveCanceledListener(OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        IGoogleMapDelegate iGoogleMapDelegate = this.zza;
        try {
            if (onCameraMoveCanceledListener == null) {
                iGoogleMapDelegate.setOnCameraMoveCanceledListener(null);
            } else {
                iGoogleMapDelegate.setOnCameraMoveCanceledListener(new zzx(this, onCameraMoveCanceledListener));
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void setOnCameraMoveListener(OnCameraMoveListener onCameraMoveListener) {
        IGoogleMapDelegate iGoogleMapDelegate = this.zza;
        try {
            if (onCameraMoveListener == null) {
                iGoogleMapDelegate.setOnCameraMoveListener(null);
            } else {
                iGoogleMapDelegate.setOnCameraMoveListener(new zzw(this, onCameraMoveListener));
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void setOnCameraMoveStartedListener(OnCameraMoveStartedListener onCameraMoveStartedListener) {
        IGoogleMapDelegate iGoogleMapDelegate = this.zza;
        try {
            if (onCameraMoveStartedListener == null) {
                iGoogleMapDelegate.setOnCameraMoveStartedListener(null);
            } else {
                iGoogleMapDelegate.setOnCameraMoveStartedListener(new zzv(this, onCameraMoveStartedListener));
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void setOnCircleClickListener(OnCircleClickListener onCircleClickListener) {
        IGoogleMapDelegate iGoogleMapDelegate = this.zza;
        try {
            if (onCircleClickListener == null) {
                iGoogleMapDelegate.setOnCircleClickListener(null);
            } else {
                iGoogleMapDelegate.setOnCircleClickListener(new zzn(this, onCircleClickListener));
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void setOnGroundOverlayClickListener(OnGroundOverlayClickListener onGroundOverlayClickListener) {
        IGoogleMapDelegate iGoogleMapDelegate = this.zza;
        try {
            if (onGroundOverlayClickListener == null) {
                iGoogleMapDelegate.setOnGroundOverlayClickListener(null);
            } else {
                iGoogleMapDelegate.setOnGroundOverlayClickListener(new zzm(this, onGroundOverlayClickListener));
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void setOnIndoorStateChangeListener(OnIndoorStateChangeListener onIndoorStateChangeListener) {
        IGoogleMapDelegate iGoogleMapDelegate = this.zza;
        try {
            if (onIndoorStateChangeListener == null) {
                iGoogleMapDelegate.setOnIndoorStateChangeListener(null);
            } else {
                iGoogleMapDelegate.setOnIndoorStateChangeListener(new zzk(this, onIndoorStateChangeListener));
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void setOnInfoWindowClickListener(OnInfoWindowClickListener onInfoWindowClickListener) {
        IGoogleMapDelegate iGoogleMapDelegate = this.zza;
        try {
            if (onInfoWindowClickListener == null) {
                iGoogleMapDelegate.setOnInfoWindowClickListener(null);
            } else {
                iGoogleMapDelegate.setOnInfoWindowClickListener(new zzc(this, onInfoWindowClickListener));
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void setOnInfoWindowCloseListener(OnInfoWindowCloseListener onInfoWindowCloseListener) {
        IGoogleMapDelegate iGoogleMapDelegate = this.zza;
        try {
            if (onInfoWindowCloseListener == null) {
                iGoogleMapDelegate.setOnInfoWindowCloseListener(null);
            } else {
                iGoogleMapDelegate.setOnInfoWindowCloseListener(new zze(this, onInfoWindowCloseListener));
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void setOnInfoWindowLongClickListener(OnInfoWindowLongClickListener onInfoWindowLongClickListener) {
        IGoogleMapDelegate iGoogleMapDelegate = this.zza;
        try {
            if (onInfoWindowLongClickListener == null) {
                iGoogleMapDelegate.setOnInfoWindowLongClickListener(null);
            } else {
                iGoogleMapDelegate.setOnInfoWindowLongClickListener(new zzd(this, onInfoWindowLongClickListener));
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void setOnMapClickListener(OnMapClickListener onMapClickListener) {
        IGoogleMapDelegate iGoogleMapDelegate = this.zza;
        try {
            if (onMapClickListener == null) {
                iGoogleMapDelegate.setOnMapClickListener(null);
            } else {
                iGoogleMapDelegate.setOnMapClickListener(new zzz(this, onMapClickListener));
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setOnMapLoadedCallback(OnMapLoadedCallback onMapLoadedCallback) {
        IGoogleMapDelegate iGoogleMapDelegate = this.zza;
        try {
            if (onMapLoadedCallback == null) {
                iGoogleMapDelegate.setOnMapLoadedCallback(null);
            } else {
                iGoogleMapDelegate.setOnMapLoadedCallback(new zzj(this, onMapLoadedCallback));
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void setOnMapLongClickListener(OnMapLongClickListener onMapLongClickListener) {
        IGoogleMapDelegate iGoogleMapDelegate = this.zza;
        try {
            if (onMapLongClickListener == null) {
                iGoogleMapDelegate.setOnMapLongClickListener(null);
            } else {
                iGoogleMapDelegate.setOnMapLongClickListener(new zzaa(this, onMapLongClickListener));
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void setOnMarkerClickListener(OnMarkerClickListener onMarkerClickListener) {
        IGoogleMapDelegate iGoogleMapDelegate = this.zza;
        try {
            if (onMarkerClickListener == null) {
                iGoogleMapDelegate.setOnMarkerClickListener(null);
            } else {
                iGoogleMapDelegate.setOnMarkerClickListener(new zza(this, onMarkerClickListener));
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void setOnMarkerDragListener(OnMarkerDragListener onMarkerDragListener) {
        IGoogleMapDelegate iGoogleMapDelegate = this.zza;
        try {
            if (onMarkerDragListener == null) {
                iGoogleMapDelegate.setOnMarkerDragListener(null);
            } else {
                iGoogleMapDelegate.setOnMarkerDragListener(new zzb(this, onMarkerDragListener));
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void setOnMyLocationButtonClickListener(OnMyLocationButtonClickListener onMyLocationButtonClickListener) {
        IGoogleMapDelegate iGoogleMapDelegate = this.zza;
        try {
            if (onMyLocationButtonClickListener == null) {
                iGoogleMapDelegate.setOnMyLocationButtonClickListener(null);
            } else {
                iGoogleMapDelegate.setOnMyLocationButtonClickListener(new zzh(this, onMyLocationButtonClickListener));
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    @Deprecated
    public final void setOnMyLocationChangeListener(OnMyLocationChangeListener onMyLocationChangeListener) {
        IGoogleMapDelegate iGoogleMapDelegate = this.zza;
        try {
            if (onMyLocationChangeListener == null) {
                iGoogleMapDelegate.setOnMyLocationChangeListener(null);
            } else {
                iGoogleMapDelegate.setOnMyLocationChangeListener(new zzg(this, onMyLocationChangeListener));
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void setOnMyLocationClickListener(OnMyLocationClickListener onMyLocationClickListener) {
        IGoogleMapDelegate iGoogleMapDelegate = this.zza;
        try {
            if (onMyLocationClickListener == null) {
                iGoogleMapDelegate.setOnMyLocationClickListener(null);
            } else {
                iGoogleMapDelegate.setOnMyLocationClickListener(new zzi(this, onMyLocationClickListener));
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void setOnPoiClickListener(OnPoiClickListener onPoiClickListener) {
        IGoogleMapDelegate iGoogleMapDelegate = this.zza;
        try {
            if (onPoiClickListener == null) {
                iGoogleMapDelegate.setOnPoiClickListener(null);
            } else {
                iGoogleMapDelegate.setOnPoiClickListener(new zzr(this, onPoiClickListener));
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void setOnPolygonClickListener(OnPolygonClickListener onPolygonClickListener) {
        IGoogleMapDelegate iGoogleMapDelegate = this.zza;
        try {
            if (onPolygonClickListener == null) {
                iGoogleMapDelegate.setOnPolygonClickListener(null);
            } else {
                iGoogleMapDelegate.setOnPolygonClickListener(new zzo(this, onPolygonClickListener));
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void setOnPolylineClickListener(OnPolylineClickListener onPolylineClickListener) {
        IGoogleMapDelegate iGoogleMapDelegate = this.zza;
        try {
            if (onPolylineClickListener == null) {
                iGoogleMapDelegate.setOnPolylineClickListener(null);
            } else {
                iGoogleMapDelegate.setOnPolylineClickListener(new zzp(this, onPolylineClickListener));
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void setPadding(int i14, int i15, int i16, int i17) {
        try {
            this.zza.setPadding(i14, i15, i16, i17);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void setTrafficEnabled(boolean z14) {
        try {
            this.zza.setTrafficEnabled(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void snapshot(SnapshotReadyCallback snapshotReadyCallback, Bitmap bitmap) {
        Preconditions.checkNotNull(snapshotReadyCallback, "Callback must not be null.");
        try {
            this.zza.snapshot(new zzq(this, snapshotReadyCallback), (ObjectWrapper) (bitmap != null ? ObjectWrapper.wrap(bitmap) : null));
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void stopAnimation() {
        try {
            this.zza.stopAnimation();
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void animateCamera(CameraUpdate cameraUpdate) {
        try {
            Preconditions.checkNotNull(cameraUpdate, "CameraUpdate must not be null.");
            this.zza.animateCamera(cameraUpdate.zza());
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public final void snapshot(SnapshotReadyCallback snapshotReadyCallback) {
        Preconditions.checkNotNull(snapshotReadyCallback, "Callback must not be null.");
        snapshot(snapshotReadyCallback, null);
    }

    public final void animateCamera(CameraUpdate cameraUpdate, CancelableCallback cancelableCallback) {
        try {
            Preconditions.checkNotNull(cameraUpdate, "CameraUpdate must not be null.");
            this.zza.animateCameraWithCallback(cameraUpdate.zza(), cancelableCallback == null ? null : new zzab(cancelableCallback));
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }
}
