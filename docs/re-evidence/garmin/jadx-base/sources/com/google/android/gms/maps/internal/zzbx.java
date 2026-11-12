package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.garmin.proto.generated.a;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.StreetViewSource;

/* JADX INFO: loaded from: classes14.dex */
public final class zzbx extends com.google.android.gms.internal.maps.zza implements IStreetViewPanoramaDelegate {
    public zzbx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void animateTo(StreetViewPanoramaCamera streetViewPanoramaCamera, long j8) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, streetViewPanoramaCamera);
        parcelZza.writeLong(j8);
        zzc(9, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void enablePanning(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = com.google.android.gms.internal.maps.zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(2, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void enableStreetNames(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = com.google.android.gms.internal.maps.zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(4, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void enableUserNavigation(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = com.google.android.gms.internal.maps.zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(3, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void enableZoom(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = com.google.android.gms.internal.maps.zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(1, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final StreetViewPanoramaCamera getPanoramaCamera() {
        Parcel parcelZzJ = zzJ(10, zza());
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) com.google.android.gms.internal.maps.zzc.zza(parcelZzJ, StreetViewPanoramaCamera.CREATOR);
        parcelZzJ.recycle();
        return streetViewPanoramaCamera;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final StreetViewPanoramaLocation getStreetViewPanoramaLocation() {
        Parcel parcelZzJ = zzJ(14, zza());
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) com.google.android.gms.internal.maps.zzc.zza(parcelZzJ, StreetViewPanoramaLocation.CREATOR);
        parcelZzJ.recycle();
        return streetViewPanoramaLocation;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final boolean isPanningGesturesEnabled() {
        Parcel parcelZzJ = zzJ(6, zza());
        boolean zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final boolean isStreetNamesEnabled() {
        Parcel parcelZzJ = zzJ(8, zza());
        boolean zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final boolean isUserNavigationEnabled() {
        Parcel parcelZzJ = zzJ(7, zza());
        boolean zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final boolean isZoomGesturesEnabled() {
        Parcel parcelZzJ = zzJ(5, zza());
        boolean zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final IObjectWrapper orientationToPoint(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, streetViewPanoramaOrientation);
        return a.b(zzJ(19, parcelZza));
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final StreetViewPanoramaOrientation pointToOrientation(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, iObjectWrapper);
        Parcel parcelZzJ = zzJ(18, parcelZza);
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) com.google.android.gms.internal.maps.zzc.zza(parcelZzJ, StreetViewPanoramaOrientation.CREATOR);
        parcelZzJ.recycle();
        return streetViewPanoramaOrientation;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setOnStreetViewPanoramaCameraChangeListener(zzbl zzblVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzblVar);
        zzc(16, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setOnStreetViewPanoramaChangeListener(zzbn zzbnVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzbnVar);
        zzc(15, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setOnStreetViewPanoramaClickListener(zzbp zzbpVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzbpVar);
        zzc(17, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setOnStreetViewPanoramaLongClickListener(zzbr zzbrVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(parcelZza, zzbrVar);
        zzc(20, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setPosition(LatLng latLng) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, latLng);
        zzc(12, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setPositionWithID(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzc(11, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setPositionWithRadius(LatLng latLng, int i14) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, latLng);
        parcelZza.writeInt(i14);
        zzc(13, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setPositionWithRadiusAndSource(LatLng latLng, int i14, StreetViewSource streetViewSource) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, latLng);
        parcelZza.writeInt(i14);
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, streetViewSource);
        zzc(22, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setPositionWithSource(LatLng latLng, StreetViewSource streetViewSource) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, latLng);
        com.google.android.gms.internal.maps.zzc.zze(parcelZza, streetViewSource);
        zzc(21, parcelZza);
    }
}
