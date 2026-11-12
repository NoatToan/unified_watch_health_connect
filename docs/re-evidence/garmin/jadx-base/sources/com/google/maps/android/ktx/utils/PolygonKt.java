package com.google.maps.android.ktx.utils;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Polygon;
import com.google.maps.android.PolyUtil;
import com.google.maps.android.SphericalUtil;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b\u001a\u001f\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0086\b\"\u0016\u0010\b\u001a\u00020\u0007*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0016\u0010\u000b\u001a\u00020\u0007*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"contains", "", "Lcom/google/android/gms/maps/model/Polygon;", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "isOnEdge", "tolerance", "", "area", "getArea", "(Lcom/google/android/gms/maps/model/Polygon;)D", "signedArea", "getSignedArea", "maps-utils-ktx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class PolygonKt {
    public static final boolean contains(Polygon polygon, LatLng latLng) {
        polygon.getClass();
        latLng.getClass();
        return PolyUtil.containsLocation(latLng, polygon.getPoints(), polygon.isGeodesic());
    }

    public static final double getArea(Polygon polygon) {
        polygon.getClass();
        return SphericalUtil.computeArea(polygon.getPoints());
    }

    public static final double getSignedArea(Polygon polygon) {
        polygon.getClass();
        return SphericalUtil.computeSignedArea(polygon.getPoints());
    }

    public static final boolean isOnEdge(Polygon polygon, LatLng latLng, double d14) {
        polygon.getClass();
        latLng.getClass();
        return PolyUtil.isLocationOnEdge(latLng, polygon.getPoints(), polygon.isGeodesic(), d14);
    }

    public static /* synthetic */ boolean isOnEdge$default(Polygon polygon, LatLng latLng, double d14, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            d14 = 0.1d;
        }
        polygon.getClass();
        latLng.getClass();
        return PolyUtil.isLocationOnEdge(latLng, polygon.getPoints(), polygon.isGeodesic(), d14);
    }
}
