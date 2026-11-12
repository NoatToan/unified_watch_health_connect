package com.google.maps.android.ktx;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import q53.t;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements GoogleMap.OnCameraMoveCanceledListener, GoogleMap.OnCameraMoveListener, GoogleMap.OnCameraMoveStartedListener, GoogleMap.OnCircleClickListener, GoogleMap.OnGroundOverlayClickListener, GoogleMap.OnInfoWindowClickListener, GoogleMap.OnInfoWindowCloseListener, GoogleMap.OnInfoWindowLongClickListener, GoogleMap.OnMarkerClickListener, GoogleMap.OnPolygonClickListener, GoogleMap.OnPolylineClickListener, StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener, StreetViewPanorama.OnStreetViewPanoramaChangeListener, StreetViewPanorama.OnStreetViewPanoramaClickListener, StreetViewPanorama.OnStreetViewPanoramaLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f54325b;

    public /* synthetic */ b(t tVar, int i14) {
        this.f54324a = i14;
        this.f54325b = tVar;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveListener
    public void onCameraMove() {
        switch (this.f54324a) {
            case 1:
                GoogleMapKt.AnonymousClass1.invokeSuspend$lambda$2(this.f54325b);
                break;
            default:
                GoogleMapKt.C39281.invokeSuspend$lambda$0(this.f54325b);
                break;
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener
    public void onCameraMoveCanceled() {
        switch (this.f54324a) {
            case 0:
                GoogleMapKt.AnonymousClass1.invokeSuspend$lambda$1(this.f54325b);
                break;
            default:
                GoogleMapKt.C39271.invokeSuspend$lambda$0(this.f54325b);
                break;
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener
    public void onCameraMoveStarted(int i14) {
        switch (this.f54324a) {
            case 2:
                GoogleMapKt.AnonymousClass1.invokeSuspend$lambda$3(this.f54325b, i14);
                break;
            default:
                GoogleMapKt.C39291.invokeSuspend$lambda$0(this.f54325b, i14);
                break;
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCircleClickListener
    public void onCircleClick(Circle circle) {
        GoogleMapKt.C39301.invokeSuspend$lambda$0(this.f54325b, circle);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener
    public void onGroundOverlayClick(GroundOverlay groundOverlay) {
        GoogleMapKt.C39311.invokeSuspend$lambda$0(this.f54325b, groundOverlay);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
    public void onInfoWindowClick(Marker marker) {
        GoogleMapKt.C39331.invokeSuspend$lambda$0(this.f54325b, marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener
    public void onInfoWindowClose(Marker marker) {
        GoogleMapKt.C39341.invokeSuspend$lambda$0(this.f54325b, marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener
    public void onInfoWindowLongClick(Marker marker) {
        GoogleMapKt.C39351.invokeSuspend$lambda$0(this.f54325b, marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    public boolean onMarkerClick(Marker marker) {
        return GoogleMapKt.C39381.invokeSuspend$lambda$0(this.f54325b, marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnPolygonClickListener
    public void onPolygonClick(Polygon polygon) {
        GoogleMapKt.C39431.invokeSuspend$lambda$0(this.f54325b, polygon);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnPolylineClickListener
    public void onPolylineClick(Polyline polyline) {
        GoogleMapKt.C39441.invokeSuspend$lambda$0(this.f54325b, polyline);
    }

    @Override // com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener
    public void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        StreetViewPanoramaViewKt.AnonymousClass1.invokeSuspend$lambda$0(this.f54325b, streetViewPanoramaCamera);
    }

    @Override // com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener
    public void onStreetViewPanoramaChange(StreetViewPanoramaLocation streetViewPanoramaLocation) {
        StreetViewPanoramaViewKt.C39451.invokeSuspend$lambda$0(this.f54325b, streetViewPanoramaLocation);
    }

    @Override // com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener
    public void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        StreetViewPanoramaViewKt.C39461.invokeSuspend$lambda$0(this.f54325b, streetViewPanoramaOrientation);
    }

    @Override // com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener
    public void onStreetViewPanoramaLongClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        StreetViewPanoramaViewKt.C39471.invokeSuspend$lambda$0(this.f54325b, streetViewPanoramaOrientation);
    }
}
