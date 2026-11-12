package com.google.maps.android.compose;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.TileOverlay;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54043a;

    public /* synthetic */ f0(int i14) {
        this.f54043a = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f54043a) {
            case 0:
                return MarkerKt.MarkerInfoWindowComposable_LZmgDss$lambda$34$lambda$33((Marker) obj);
            case 1:
                return Boolean.valueOf(MarkerKt.Marker_qld6geY$lambda$5$lambda$4((Marker) obj));
            case 2:
                return MarkerKt.Marker_qld6geY$lambda$7$lambda$6((Marker) obj);
            case 3:
                return MarkerKt.Marker_qld6geY$lambda$9$lambda$8((Marker) obj);
            case 4:
                return MarkerKt.Marker_qld6geY$lambda$11$lambda$10((Marker) obj);
            case 5:
                return MarkerKt.MarkerInfoWindowComposable_LZmgDss$lambda$36$lambda$35((Marker) obj);
            case 6:
                return MarkerKt.MarkerInfoWindowComposable_LZmgDss$lambda$38$lambda$37((Marker) obj);
            case 7:
                return MarkerState.Saver$lambda$1((LatLng) obj);
            case 8:
                return PolygonKt.Polygon_qT8xWJw$lambda$1$lambda$0((Polygon) obj);
            case 9:
                return PolylineKt.Polyline_Ut8lOTo$lambda$1$lambda$0((Polyline) obj);
            case 10:
                return PolylineKt.Polyline$lambda$4$lambda$3((Polyline) obj);
            case 11:
                return PolylineKt.PolylineImpl_LjegJe0$lambda$7$lambda$6((Polyline) obj);
            case 12:
                return TileOverlayKt.TileOverlay$lambda$1$lambda$0((TileOverlay) obj);
            default:
                return TileOverlayKt.TileOverlay$lambda$4$lambda$3((TileOverlay) obj);
        }
    }
}
