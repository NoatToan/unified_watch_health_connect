package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.FeatureLayerOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;

/* JADX INFO: loaded from: classes14.dex */
public final class zzg extends com.google.android.gms.internal.maps.zza implements IGoogleMapDelegate {
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzn addCircle(CircleOptions circleOptions) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, circleOptions);
        Parcel parcelZzJ = zzJ(35, parcelZza);
        com.google.android.gms.internal.maps.zzn zznVarZzb = com.google.android.gms.internal.maps.zzm.zzb(parcelZzJ.readStrongBinder());
        parcelZzJ.recycle();
        return zznVarZzb;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzx addGroundOverlay(GroundOverlayOptions groundOverlayOptions) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, groundOverlayOptions);
        Parcel parcelZzJ = zzJ(12, parcelZza);
        com.google.android.gms.internal.maps.zzx zzxVarZzb = com.google.android.gms.internal.maps.zzw.zzb(parcelZzJ.readStrongBinder());
        parcelZzJ.recycle();
        return zzxVarZzb;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzaj addMarker(MarkerOptions markerOptions) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, markerOptions);
        Parcel parcelZzJ = zzJ(11, parcelZza);
        com.google.android.gms.internal.maps.zzaj zzajVarZzb = com.google.android.gms.internal.maps.zzai.zzb(parcelZzJ.readStrongBinder());
        parcelZzJ.recycle();
        return zzajVarZzb;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void addOnMapCapabilitiesChangedListener(zzal zzalVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzalVar);
        zzc(110, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzao addPolygon(PolygonOptions polygonOptions) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, polygonOptions);
        Parcel parcelZzJ = zzJ(10, parcelZza);
        com.google.android.gms.internal.maps.zzao zzaoVarZzb = com.google.android.gms.internal.maps.zzan.zzb(parcelZzJ.readStrongBinder());
        parcelZzJ.recycle();
        return zzaoVarZzb;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzar addPolyline(PolylineOptions polylineOptions) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, polylineOptions);
        Parcel parcelZzJ = zzJ(9, parcelZza);
        com.google.android.gms.internal.maps.zzar zzarVarZzb = com.google.android.gms.internal.maps.zzaq.zzb(parcelZzJ.readStrongBinder());
        parcelZzJ.recycle();
        return zzarVarZzb;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzaw addTileOverlay(TileOverlayOptions tileOverlayOptions) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, tileOverlayOptions);
        Parcel parcelZzJ = zzJ(13, parcelZza);
        com.google.android.gms.internal.maps.zzaw zzawVarZzb = com.google.android.gms.internal.maps.zzav.zzb(parcelZzJ.readStrongBinder());
        parcelZzJ.recycle();
        return zzawVarZzb;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void animateCamera(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, iObjectWrapper);
        zzc(5, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void animateCameraWithCallback(IObjectWrapper iObjectWrapper, zzd zzdVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzdVar);
        zzc(6, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void animateCameraWithDurationAndCallback(IObjectWrapper iObjectWrapper, int i14, zzd zzdVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, iObjectWrapper);
        parcelZza.writeInt(i14);
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzdVar);
        zzc(7, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void clear() {
        zzc(14, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final CameraPosition getCameraPosition() {
        Parcel parcelZzJ = zzJ(1, zza());
        CameraPosition cameraPosition = (CameraPosition) com.google.android.gms.internal.maps.zzc.zza(parcelZzJ, CameraPosition.CREATOR);
        parcelZzJ.recycle();
        return cameraPosition;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzu getFeatureLayer(FeatureLayerOptions featureLayerOptions) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, featureLayerOptions);
        Parcel parcelZzJ = zzJ(112, parcelZza);
        com.google.android.gms.internal.maps.zzu zzuVarZzb = com.google.android.gms.internal.maps.zzt.zzb(parcelZzJ.readStrongBinder());
        parcelZzJ.recycle();
        return zzuVarZzb;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzaa getFocusedBuilding() {
        Parcel parcelZzJ = zzJ(44, zza());
        com.google.android.gms.internal.maps.zzaa zzaaVarZzb = com.google.android.gms.internal.maps.zzz.zzb(parcelZzJ.readStrongBinder());
        parcelZzJ.recycle();
        return zzaaVarZzb;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void getMapAsync(zzat zzatVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzatVar);
        zzc(53, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzag getMapCapabilities() {
        Parcel parcelZzJ = zzJ(109, zza());
        com.google.android.gms.internal.maps.zzag zzagVarZzb = com.google.android.gms.internal.maps.zzaf.zzb(parcelZzJ.readStrongBinder());
        parcelZzJ.recycle();
        return zzagVarZzb;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final int getMapColorScheme() {
        Parcel parcelZzJ = zzJ(114, zza());
        int i14 = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i14;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final int getMapType() {
        Parcel parcelZzJ = zzJ(15, zza());
        int i14 = parcelZzJ.readInt();
        parcelZzJ.recycle();
        return i14;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final float getMaxZoomLevel() {
        Parcel parcelZzJ = zzJ(2, zza());
        float f14 = parcelZzJ.readFloat();
        parcelZzJ.recycle();
        return f14;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final float getMinZoomLevel() {
        Parcel parcelZzJ = zzJ(3, zza());
        float f14 = parcelZzJ.readFloat();
        parcelZzJ.recycle();
        return f14;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final Location getMyLocation() {
        Parcel parcelZzJ = zzJ(23, zza());
        Location location = (Location) com.google.android.gms.internal.maps.zzc.zza(parcelZzJ, Location.CREATOR);
        parcelZzJ.recycle();
        return location;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final IProjectionDelegate getProjection() {
        IProjectionDelegate zzbuVar;
        Parcel parcelZzJ = zzJ(26, zza());
        IBinder strongBinder = parcelZzJ.readStrongBinder();
        if (strongBinder == null) {
            zzbuVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            zzbuVar = iInterfaceQueryLocalInterface instanceof IProjectionDelegate ? (IProjectionDelegate) iInterfaceQueryLocalInterface : new zzbu(strongBinder);
        }
        parcelZzJ.recycle();
        return zzbuVar;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final IUiSettingsDelegate getUiSettings() {
        IUiSettingsDelegate zzcaVar;
        Parcel parcelZzJ = zzJ(25, zza());
        IBinder strongBinder = parcelZzJ.readStrongBinder();
        if (strongBinder == null) {
            zzcaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            zzcaVar = iInterfaceQueryLocalInterface instanceof IUiSettingsDelegate ? (IUiSettingsDelegate) iInterfaceQueryLocalInterface : new zzca(strongBinder);
        }
        parcelZzJ.recycle();
        return zzcaVar;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean isBuildingsEnabled() {
        Parcel parcelZzJ = zzJ(40, zza());
        boolean zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean isIndoorEnabled() {
        Parcel parcelZzJ = zzJ(19, zza());
        boolean zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean isMyLocationEnabled() {
        Parcel parcelZzJ = zzJ(21, zza());
        boolean zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean isTrafficEnabled() {
        Parcel parcelZzJ = zzJ(17, zza());
        boolean zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void moveCamera(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, iObjectWrapper);
        zzc(4, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onCreate(Bundle bundle) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, bundle);
        zzc(54, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onDestroy() {
        zzc(57, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onEnterAmbient(Bundle bundle) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, bundle);
        zzc(81, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onExitAmbient() {
        zzc(82, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onLowMemory() {
        zzc(58, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onPause() {
        zzc(56, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onResume() {
        zzc(55, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onSaveInstanceState(Bundle bundle) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, bundle);
        Parcel parcelZzJ = zzJ(60, parcelZza);
        if (parcelZzJ.readInt() != 0) {
            bundle.readFromParcel(parcelZzJ);
        }
        parcelZzJ.recycle();
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onStart() {
        zzc(101, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onStop() {
        zzc(102, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void removeOnMapCapabilitiesChangedListener(zzal zzalVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzalVar);
        zzc(111, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void resetMinMaxZoomPreference() {
        zzc(94, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setBuildingsEnabled(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = com.google.android.gms.internal.maps.zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(41, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setContentDescription(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzc(61, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean setIndoorEnabled(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = com.google.android.gms.internal.maps.zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        Parcel parcelZzJ = zzJ(20, parcelZza);
        boolean zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setInfoWindowAdapter(zzi zziVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zziVar);
        zzc(33, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setLatLngBoundsForCameraTarget(LatLngBounds latLngBounds) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, latLngBounds);
        zzc(95, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setLocationSource(ILocationSourceDelegate iLocationSourceDelegate) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, iLocationSourceDelegate);
        zzc(24, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setMapColorScheme(int i14) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i14);
        zzc(113, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean setMapStyle(MapStyleOptions mapStyleOptions) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, mapStyleOptions);
        Parcel parcelZzJ = zzJ(91, parcelZza);
        boolean zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setMapType(int i14) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i14);
        zzc(16, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setMaxZoomPreference(float f14) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f14);
        zzc(93, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setMinZoomPreference(float f14) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f14);
        zzc(92, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setMyLocationEnabled(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = com.google.android.gms.internal.maps.zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(22, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraChangeListener(zzn zznVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zznVar);
        zzc(27, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraIdleListener(zzp zzpVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzpVar);
        zzc(99, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraMoveCanceledListener(zzr zzrVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzrVar);
        zzc(98, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraMoveListener(zzt zztVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zztVar);
        zzc(97, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraMoveStartedListener(zzv zzvVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzvVar);
        zzc(96, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCircleClickListener(zzx zzxVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzxVar);
        zzc(89, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnGroundOverlayClickListener(zzz zzzVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzzVar);
        zzc(83, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnIndoorStateChangeListener(zzab zzabVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzabVar);
        zzc(45, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnInfoWindowClickListener(zzad zzadVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzadVar);
        zzc(32, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnInfoWindowCloseListener(zzaf zzafVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzafVar);
        zzc(86, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnInfoWindowLongClickListener(zzah zzahVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzahVar);
        zzc(84, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMapClickListener(zzan zzanVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzanVar);
        zzc(28, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMapLoadedCallback(zzap zzapVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzapVar);
        zzc(42, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMapLongClickListener(zzar zzarVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzarVar);
        zzc(29, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMarkerClickListener(zzav zzavVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzavVar);
        zzc(30, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMarkerDragListener(zzax zzaxVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzaxVar);
        zzc(31, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMyLocationButtonClickListener(zzaz zzazVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzazVar);
        zzc(37, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMyLocationChangeListener(zzbb zzbbVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzbbVar);
        zzc(36, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMyLocationClickListener(zzbd zzbdVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzbdVar);
        zzc(107, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnPoiClickListener(zzbf zzbfVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzbfVar);
        zzc(80, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnPolygonClickListener(zzbh zzbhVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzbhVar);
        zzc(85, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnPolylineClickListener(zzbj zzbjVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzbjVar);
        zzc(87, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setPadding(int i14, int i15, int i16, int i17) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i14);
        parcelZza.writeInt(i15);
        parcelZza.writeInt(i16);
        parcelZza.writeInt(i17);
        zzc(39, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setTrafficEnabled(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = com.google.android.gms.internal.maps.zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(18, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setWatermarkEnabled(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = com.google.android.gms.internal.maps.zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(51, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void snapshot(zzbw zzbwVar, IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzbwVar);
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, iObjectWrapper);
        zzc(38, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void snapshotForTest(zzbw zzbwVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzbwVar);
        zzc(71, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void stopAnimation() {
        zzc(8, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean useViewLifecycleWhenInFragment() {
        Parcel parcelZzJ = zzJ(59, zza());
        boolean zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }
}
