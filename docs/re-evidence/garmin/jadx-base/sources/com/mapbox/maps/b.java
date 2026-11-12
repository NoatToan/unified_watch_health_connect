package com.mapbox.maps;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements CameraChangedCoalescedCallback, StyleDataLoadedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapController f54407a;

    public /* synthetic */ b(MapController mapController) {
        this.f54407a = mapController;
    }

    @Override // com.mapbox.maps.CameraChangedCoalescedCallback
    public void run(CameraChangedCoalesced cameraChangedCoalesced) {
        MapController._init_$lambda$0(this.f54407a, cameraChangedCoalesced);
    }

    @Override // com.mapbox.maps.StyleDataLoadedCallback
    public void run(StyleDataLoaded styleDataLoaded) {
        MapController._init_$lambda$2(this.f54407a, styleDataLoaded);
    }
}
