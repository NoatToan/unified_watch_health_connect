package com.google.maps.android.compose.streetview;

import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements StreetViewPanorama.OnStreetViewPanoramaClickListener, StreetViewPanorama.OnStreetViewPanoramaLongClickListener, StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener, StreetViewPanorama.OnStreetViewPanoramaChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StreetViewPanoramaPropertiesNode f54237a;

    public /* synthetic */ b(StreetViewPanoramaPropertiesNode streetViewPanoramaPropertiesNode) {
        this.f54237a = streetViewPanoramaPropertiesNode;
    }

    @Override // com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener
    public void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        StreetViewPanoramaPropertiesNode.onAttached$lambda$2(this.f54237a, streetViewPanoramaCamera);
    }

    @Override // com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener
    public void onStreetViewPanoramaChange(StreetViewPanoramaLocation streetViewPanoramaLocation) {
        StreetViewPanoramaPropertiesNode.onAttached$lambda$3(this.f54237a, streetViewPanoramaLocation);
    }

    @Override // com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener
    public void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        StreetViewPanoramaPropertiesNode.onAttached$lambda$0(this.f54237a, streetViewPanoramaOrientation);
    }

    @Override // com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener
    public void onStreetViewPanoramaLongClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        StreetViewPanoramaPropertiesNode.onAttached$lambda$1(this.f54237a, streetViewPanoramaOrientation);
    }
}
