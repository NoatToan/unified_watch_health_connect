package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.FeatureLayerOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapColorScheme;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;

/* JADX INFO: loaded from: classes14.dex */
public interface IGoogleMapDelegate extends IInterface {
    com.google.android.gms.internal.maps.zzn addCircle(CircleOptions circleOptions);

    com.google.android.gms.internal.maps.zzx addGroundOverlay(GroundOverlayOptions groundOverlayOptions);

    com.google.android.gms.internal.maps.zzaj addMarker(MarkerOptions markerOptions);

    void addOnMapCapabilitiesChangedListener(zzal zzalVar);

    com.google.android.gms.internal.maps.zzao addPolygon(PolygonOptions polygonOptions);

    com.google.android.gms.internal.maps.zzar addPolyline(PolylineOptions polylineOptions);

    com.google.android.gms.internal.maps.zzaw addTileOverlay(TileOverlayOptions tileOverlayOptions);

    void animateCamera(IObjectWrapper iObjectWrapper);

    void animateCameraWithCallback(IObjectWrapper iObjectWrapper, zzd zzdVar);

    void animateCameraWithDurationAndCallback(IObjectWrapper iObjectWrapper, int i14, zzd zzdVar);

    void clear();

    CameraPosition getCameraPosition();

    com.google.android.gms.internal.maps.zzu getFeatureLayer(FeatureLayerOptions featureLayerOptions);

    com.google.android.gms.internal.maps.zzaa getFocusedBuilding();

    void getMapAsync(zzat zzatVar);

    com.google.android.gms.internal.maps.zzag getMapCapabilities();

    @MapColorScheme
    int getMapColorScheme();

    int getMapType();

    float getMaxZoomLevel();

    float getMinZoomLevel();

    Location getMyLocation();

    IProjectionDelegate getProjection();

    IUiSettingsDelegate getUiSettings();

    boolean isBuildingsEnabled();

    boolean isIndoorEnabled();

    boolean isMyLocationEnabled();

    boolean isTrafficEnabled();

    void moveCamera(IObjectWrapper iObjectWrapper);

    void onCreate(Bundle bundle);

    void onDestroy();

    void onEnterAmbient(Bundle bundle);

    void onExitAmbient();

    void onLowMemory();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onStart();

    void onStop();

    void removeOnMapCapabilitiesChangedListener(zzal zzalVar);

    void resetMinMaxZoomPreference();

    void setBuildingsEnabled(boolean z14);

    void setContentDescription(String str);

    boolean setIndoorEnabled(boolean z14);

    void setInfoWindowAdapter(zzi zziVar);

    void setLatLngBoundsForCameraTarget(LatLngBounds latLngBounds);

    void setLocationSource(ILocationSourceDelegate iLocationSourceDelegate);

    void setMapColorScheme(@MapColorScheme int i14);

    boolean setMapStyle(MapStyleOptions mapStyleOptions);

    void setMapType(int i14);

    void setMaxZoomPreference(float f14);

    void setMinZoomPreference(float f14);

    void setMyLocationEnabled(boolean z14);

    void setOnCameraChangeListener(zzn zznVar);

    void setOnCameraIdleListener(zzp zzpVar);

    void setOnCameraMoveCanceledListener(zzr zzrVar);

    void setOnCameraMoveListener(zzt zztVar);

    void setOnCameraMoveStartedListener(zzv zzvVar);

    void setOnCircleClickListener(zzx zzxVar);

    void setOnGroundOverlayClickListener(zzz zzzVar);

    void setOnIndoorStateChangeListener(zzab zzabVar);

    void setOnInfoWindowClickListener(zzad zzadVar);

    void setOnInfoWindowCloseListener(zzaf zzafVar);

    void setOnInfoWindowLongClickListener(zzah zzahVar);

    void setOnMapClickListener(zzan zzanVar);

    void setOnMapLoadedCallback(zzap zzapVar);

    void setOnMapLongClickListener(zzar zzarVar);

    void setOnMarkerClickListener(zzav zzavVar);

    void setOnMarkerDragListener(zzax zzaxVar);

    void setOnMyLocationButtonClickListener(zzaz zzazVar);

    void setOnMyLocationChangeListener(zzbb zzbbVar);

    void setOnMyLocationClickListener(zzbd zzbdVar);

    void setOnPoiClickListener(zzbf zzbfVar);

    void setOnPolygonClickListener(zzbh zzbhVar);

    void setOnPolylineClickListener(zzbj zzbjVar);

    void setPadding(int i14, int i15, int i16, int i17);

    void setTrafficEnabled(boolean z14);

    void setWatermarkEnabled(boolean z14);

    void snapshot(zzbw zzbwVar, IObjectWrapper iObjectWrapper);

    void snapshotForTest(zzbw zzbwVar);

    void stopAnimation();

    boolean useViewLifecycleWhenInFragment();
}
