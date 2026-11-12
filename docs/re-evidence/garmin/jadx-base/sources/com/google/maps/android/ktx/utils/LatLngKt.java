package com.google.maps.android.ktx.utils;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.PolyUtil;
import com.google.maps.android.SphericalUtil;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0010\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0086\n\u001a-\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0086\b\u001a-\u0010\n\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0086\b\u001a#\u0010\u000b\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0086\b\u001a!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\t\u001a\u00020\u0001H\u0086\b\u001a\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006*\u00020\u000eH\u0086\b\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0086\b\u001a\u0013\u0010\u0010\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0086\b\u001a\u0013\u0010\u0011\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0086\b\u001a\u0013\u0010\u0012\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0086\b\u001a\u0013\u0010\u0013\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0086\b\u001a\u0015\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0086\b\u001a\u001d\u0010\u0016\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0001H\u0086\b\u001a\u001f\u0010\u0019\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0001H\u0086\b\u001a\u001d\u0010\u001a\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\u001d\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0086\b¨\u0006\u001e"}, d2 = {"component1", "", "Lcom/google/android/gms/maps/model/LatLng;", "component2", "isLocationOnPath", "", "", "latLng", "geodesic", "tolerance", "isOnEdge", "containsLocation", "simplify", "toLatLngList", "", "latLngListEncode", "isClosedPolygon", "sphericalPathLength", "sphericalPolygonArea", "sphericalPolygonSignedArea", "sphericalHeading", "toLatLng", "withSphericalOffset", "distance", "heading", "computeSphericalOffsetOrigin", "withSphericalLinearInterpolation", "to", "fraction", "sphericalDistance", "maps-utils-ktx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LatLngKt {
    public static final double component1(LatLng latLng) {
        latLng.getClass();
        return latLng.latitude;
    }

    public static final double component2(LatLng latLng) {
        latLng.getClass();
        return latLng.longitude;
    }

    public static final LatLng computeSphericalOffsetOrigin(LatLng latLng, double d14, double d15) {
        latLng.getClass();
        return SphericalUtil.computeOffsetOrigin(latLng, d14, d15);
    }

    public static final boolean containsLocation(List<LatLng> list, LatLng latLng, boolean z14) {
        list.getClass();
        latLng.getClass();
        return PolyUtil.containsLocation(latLng, list, z14);
    }

    public static final boolean isClosedPolygon(List<LatLng> list) {
        list.getClass();
        return PolyUtil.isClosedPolygon(list);
    }

    public static final boolean isLocationOnPath(List<LatLng> list, LatLng latLng, boolean z14, double d14) {
        list.getClass();
        latLng.getClass();
        return PolyUtil.isLocationOnPath(latLng, list, z14, d14);
    }

    public static /* synthetic */ boolean isLocationOnPath$default(List list, LatLng latLng, boolean z14, double d14, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            d14 = 0.1d;
        }
        list.getClass();
        latLng.getClass();
        return PolyUtil.isLocationOnPath(latLng, list, z14, d14);
    }

    public static final boolean isOnEdge(List<LatLng> list, LatLng latLng, boolean z14, double d14) {
        list.getClass();
        latLng.getClass();
        return PolyUtil.isLocationOnEdge(latLng, list, z14, d14);
    }

    public static /* synthetic */ boolean isOnEdge$default(List list, LatLng latLng, boolean z14, double d14, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            d14 = 0.1d;
        }
        list.getClass();
        latLng.getClass();
        return PolyUtil.isLocationOnEdge(latLng, list, z14, d14);
    }

    public static final String latLngListEncode(List<LatLng> list) {
        list.getClass();
        String strEncode = PolyUtil.encode(list);
        strEncode.getClass();
        return strEncode;
    }

    public static final List<LatLng> simplify(List<LatLng> list, double d14) {
        list.getClass();
        List<LatLng> listSimplify = PolyUtil.simplify(list, d14);
        listSimplify.getClass();
        return listSimplify;
    }

    public static final double sphericalDistance(LatLng latLng, LatLng latLng2) {
        latLng.getClass();
        latLng2.getClass();
        return SphericalUtil.computeDistanceBetween(latLng, latLng2);
    }

    public static final double sphericalHeading(LatLng latLng, LatLng latLng2) {
        latLng.getClass();
        latLng2.getClass();
        return SphericalUtil.computeHeading(latLng, latLng2);
    }

    public static final double sphericalPathLength(List<LatLng> list) {
        list.getClass();
        return SphericalUtil.computeLength(list);
    }

    public static final double sphericalPolygonArea(List<LatLng> list) {
        list.getClass();
        return SphericalUtil.computeArea(list);
    }

    public static final double sphericalPolygonSignedArea(List<LatLng> list) {
        list.getClass();
        return SphericalUtil.computeSignedArea(list);
    }

    public static final List<LatLng> toLatLngList(String str) {
        str.getClass();
        List<LatLng> listDecode = PolyUtil.decode(str);
        listDecode.getClass();
        return listDecode;
    }

    public static final LatLng withSphericalLinearInterpolation(LatLng latLng, LatLng latLng2, double d14) {
        latLng.getClass();
        latLng2.getClass();
        LatLng latLngInterpolate = SphericalUtil.interpolate(latLng, latLng2, d14);
        latLngInterpolate.getClass();
        return latLngInterpolate;
    }

    public static final LatLng withSphericalOffset(LatLng latLng, double d14, double d15) {
        latLng.getClass();
        LatLng latLngComputeOffset = SphericalUtil.computeOffset(latLng, d14, d15);
        latLngComputeOffset.getClass();
        return latLngComputeOffset;
    }
}
