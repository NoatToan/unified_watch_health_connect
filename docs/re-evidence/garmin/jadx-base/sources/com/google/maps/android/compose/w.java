package com.google.maps.android.compose;

import com.google.android.gms.maps.GoogleMap;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w implements GoogleMap.OnCameraMoveCanceledListener, GoogleMap.OnCameraMoveStartedListener, GoogleMap.OnCameraMoveListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapPropertiesNode f54250a;

    public /* synthetic */ w(MapPropertiesNode mapPropertiesNode) {
        this.f54250a = mapPropertiesNode;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveListener
    public void onCameraMove() {
        MapPropertiesNode.onAttached$lambda$3(this.f54250a);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener
    public void onCameraMoveCanceled() {
        MapPropertiesNode.onAttached$lambda$1(this.f54250a);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener
    public void onCameraMoveStarted(int i14) {
        MapPropertiesNode.onAttached$lambda$2(this.f54250a, i14);
    }
}
