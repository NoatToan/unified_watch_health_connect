package com.google.maps.android.ktx.utils;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Polyline;
import com.google.maps.android.PolyUtil;
import com.google.maps.android.SphericalUtil;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\u001a\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0086\b\"\u0016\u0010\u0007\u001a\u00020\u0006*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"contains", "", "Lcom/google/android/gms/maps/model/Polyline;", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "tolerance", "", "sphericalPathLength", "getSphericalPathLength", "(Lcom/google/android/gms/maps/model/Polyline;)D", "maps-utils-ktx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class PolylineKt {
    public static final boolean contains(Polyline polyline, LatLng latLng, double d14) {
        polyline.getClass();
        latLng.getClass();
        return PolyUtil.isLocationOnPath(latLng, polyline.getPoints(), polyline.isGeodesic(), d14);
    }

    public static /* synthetic */ boolean contains$default(Polyline polyline, LatLng latLng, double d14, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            d14 = 0.1d;
        }
        polyline.getClass();
        latLng.getClass();
        return PolyUtil.isLocationOnPath(latLng, polyline.getPoints(), polyline.isGeodesic(), d14);
    }

    public static final double getSphericalPathLength(Polyline polyline) {
        polyline.getClass();
        return SphericalUtil.computeLength(polyline.getPoints());
    }
}
