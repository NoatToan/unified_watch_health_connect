package com.google.maps.android.compose;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.Polyline;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements GoogleMap.OnCircleClickListener, GoogleMap.OnGroundOverlayClickListener, GoogleMap.OnPolygonClickListener, GoogleMap.OnPolylineClickListener, GoogleMap.OnMarkerClickListener, GoogleMap.OnInfoWindowClickListener, GoogleMap.OnInfoWindowCloseListener, GoogleMap.OnInfoWindowLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapApplier f54131a;

    public /* synthetic */ k(MapApplier mapApplier) {
        this.f54131a = mapApplier;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCircleClickListener
    public void onCircleClick(Circle circle) {
        MapApplier.attachClickListeners$lambda$5(this.f54131a, circle);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener
    public void onGroundOverlayClick(GroundOverlay groundOverlay) {
        MapApplier.attachClickListeners$lambda$9(this.f54131a, groundOverlay);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
    public void onInfoWindowClick(Marker marker) {
        MapApplier.attachClickListeners$lambda$25(this.f54131a, marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener
    public void onInfoWindowClose(Marker marker) {
        MapApplier.attachClickListeners$lambda$29(this.f54131a, marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener
    public void onInfoWindowLongClick(Marker marker) {
        MapApplier.attachClickListeners$lambda$33(this.f54131a, marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    public boolean onMarkerClick(Marker marker) {
        return MapApplier.attachClickListeners$lambda$21(this.f54131a, marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnPolygonClickListener
    public void onPolygonClick(Polygon polygon) {
        MapApplier.attachClickListeners$lambda$13(this.f54131a, polygon);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnPolylineClickListener
    public void onPolylineClick(Polyline polyline) {
        MapApplier.attachClickListeners$lambda$17(this.f54131a, polyline);
    }
}
