package com.google.maps.android.clustering.view;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements GoogleMap.OnInfoWindowLongClickListener, GoogleMap.OnMarkerClickListener, GoogleMap.OnInfoWindowClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultAdvancedMarkersClusterRenderer f53861b;

    public /* synthetic */ c(DefaultAdvancedMarkersClusterRenderer defaultAdvancedMarkersClusterRenderer, int i14) {
        this.f53860a = i14;
        this.f53861b = defaultAdvancedMarkersClusterRenderer;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
    public void onInfoWindowClick(Marker marker) {
        this.f53861b.lambda$onAdd$2(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener
    public void onInfoWindowLongClick(Marker marker) {
        switch (this.f53860a) {
            case 0:
                this.f53861b.lambda$onAdd$0(marker);
                break;
            default:
                this.f53861b.lambda$onAdd$3(marker);
                break;
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    public boolean onMarkerClick(Marker marker) {
        return this.f53861b.lambda$onAdd$1(marker);
    }
}
