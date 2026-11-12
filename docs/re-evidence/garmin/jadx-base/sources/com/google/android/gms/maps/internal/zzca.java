package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes14.dex */
public final class zzca extends com.google.android.gms.internal.maps.zza implements IUiSettingsDelegate {
    public zzca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isCompassEnabled() {
        Parcel parcelZzJ = zzJ(10, zza());
        boolean zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isIndoorLevelPickerEnabled() {
        Parcel parcelZzJ = zzJ(17, zza());
        boolean zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isMapToolbarEnabled() {
        Parcel parcelZzJ = zzJ(19, zza());
        boolean zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isMyLocationButtonEnabled() {
        Parcel parcelZzJ = zzJ(11, zza());
        boolean zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isRotateGesturesEnabled() {
        Parcel parcelZzJ = zzJ(15, zza());
        boolean zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isScrollGesturesEnabled() {
        Parcel parcelZzJ = zzJ(12, zza());
        boolean zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isScrollGesturesEnabledDuringRotateOrZoom() {
        Parcel parcelZzJ = zzJ(21, zza());
        boolean zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isTiltGesturesEnabled() {
        Parcel parcelZzJ = zzJ(14, zza());
        boolean zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isZoomControlsEnabled() {
        Parcel parcelZzJ = zzJ(9, zza());
        boolean zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final boolean isZoomGesturesEnabled() {
        Parcel parcelZzJ = zzJ(13, zza());
        boolean zZzh = com.google.android.gms.internal.maps.zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setAllGesturesEnabled(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = com.google.android.gms.internal.maps.zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(8, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setCompassEnabled(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = com.google.android.gms.internal.maps.zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(2, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setIndoorLevelPickerEnabled(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = com.google.android.gms.internal.maps.zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(16, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setMapToolbarEnabled(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = com.google.android.gms.internal.maps.zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(18, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setMyLocationButtonEnabled(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = com.google.android.gms.internal.maps.zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(3, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setRotateGesturesEnabled(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = com.google.android.gms.internal.maps.zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(7, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setScrollGesturesEnabled(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = com.google.android.gms.internal.maps.zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(4, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setScrollGesturesEnabledDuringRotateOrZoom(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = com.google.android.gms.internal.maps.zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(20, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setTiltGesturesEnabled(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = com.google.android.gms.internal.maps.zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(6, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setZoomControlsEnabled(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = com.google.android.gms.internal.maps.zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(1, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IUiSettingsDelegate
    public final void setZoomGesturesEnabled(boolean z14) {
        Parcel parcelZza = zza();
        int i14 = com.google.android.gms.internal.maps.zzc.zza;
        parcelZza.writeInt(z14 ? 1 : 0);
        zzc(5, parcelZza);
    }
}
