package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes14.dex */
public final class CameraUpdateFactory {
    private static ICameraUpdateFactoryDelegate zza;

    private CameraUpdateFactory() {
    }

    public static CameraUpdate newCameraPosition(CameraPosition cameraPosition) {
        Preconditions.checkNotNull(cameraPosition, "cameraPosition must not be null");
        try {
            return new CameraUpdate(zzb().newCameraPosition(cameraPosition));
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public static CameraUpdate newLatLng(LatLng latLng) {
        Preconditions.checkNotNull(latLng, "latLng must not be null");
        try {
            return new CameraUpdate(zzb().newLatLng(latLng));
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public static CameraUpdate newLatLngBounds(LatLngBounds latLngBounds, int i14) {
        Preconditions.checkNotNull(latLngBounds, "bounds must not be null");
        try {
            return new CameraUpdate(zzb().newLatLngBounds(latLngBounds, i14));
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public static CameraUpdate newLatLngZoom(LatLng latLng, float f14) {
        Preconditions.checkNotNull(latLng, "latLng must not be null");
        try {
            return new CameraUpdate(zzb().newLatLngZoom(latLng, f14));
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public static CameraUpdate scrollBy(float f14, float f15) {
        try {
            return new CameraUpdate(zzb().scrollBy(f14, f15));
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public static CameraUpdate zoomBy(float f14, Point point) {
        Preconditions.checkNotNull(point, "focus must not be null");
        try {
            return new CameraUpdate(zzb().zoomByWithFocus(f14, point.x, point.y));
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public static CameraUpdate zoomIn() {
        try {
            return new CameraUpdate(zzb().zoomIn());
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public static CameraUpdate zoomOut() {
        try {
            return new CameraUpdate(zzb().zoomOut());
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public static CameraUpdate zoomTo(float f14) {
        try {
            return new CameraUpdate(zzb().zoomTo(f14));
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public static void zza(ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate) {
        zza = (ICameraUpdateFactoryDelegate) Preconditions.checkNotNull(iCameraUpdateFactoryDelegate);
    }

    private static ICameraUpdateFactoryDelegate zzb() {
        return (ICameraUpdateFactoryDelegate) Preconditions.checkNotNull(zza, "CameraUpdateFactory is not initialized");
    }

    public static CameraUpdate newLatLngBounds(LatLngBounds latLngBounds, int i14, int i15, int i16) {
        Preconditions.checkNotNull(latLngBounds, "bounds must not be null");
        try {
            return new CameraUpdate(zzb().newLatLngBoundsWithSize(latLngBounds, i14, i15, i16));
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public static CameraUpdate zoomBy(float f14) {
        try {
            return new CameraUpdate(zzb().zoomBy(f14));
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }
}
