package com.google.maps.android.data;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.Polyline;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements GoogleMap.OnPolygonClickListener, GoogleMap.OnMarkerClickListener, GoogleMap.OnPolylineClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Renderer f54318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Layer.OnFeatureClickListener f54319b;

    public /* synthetic */ a(Renderer renderer, Layer.OnFeatureClickListener onFeatureClickListener) {
        this.f54318a = renderer;
        this.f54319b = onFeatureClickListener;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    public boolean onMarkerClick(Marker marker) {
        return this.f54318a.lambda$setOnFeatureClickListener$1(this.f54319b, marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnPolygonClickListener
    public void onPolygonClick(Polygon polygon) {
        this.f54318a.lambda$setOnFeatureClickListener$0(this.f54319b, polygon);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnPolylineClickListener
    public void onPolylineClick(Polyline polyline) {
        this.f54318a.lambda$setOnFeatureClickListener$2(this.f54319b, polyline);
    }
}
