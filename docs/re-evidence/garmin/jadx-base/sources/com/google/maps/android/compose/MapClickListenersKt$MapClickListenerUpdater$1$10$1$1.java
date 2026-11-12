package com.google.maps.android.compose;

import com.google.android.gms.maps.GoogleMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public /* synthetic */ class MapClickListenersKt$MapClickListenerUpdater$1$10$1$1 extends p005kotlin.jvm.internal.q implements e23.p<GoogleMap, GoogleMap.OnMyLocationButtonClickListener, Unit> {
    public static final MapClickListenersKt$MapClickListenerUpdater$1$10$1$1 INSTANCE = new MapClickListenersKt$MapClickListenerUpdater$1$10$1$1();

    public MapClickListenersKt$MapClickListenerUpdater$1$10$1$1() {
        super(2, GoogleMap.class, "setOnMyLocationButtonClickListener", "setOnMyLocationButtonClickListener(Lcom/google/android/gms/maps/GoogleMap$OnMyLocationButtonClickListener;)V", 0);
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(GoogleMap googleMap, GoogleMap.OnMyLocationButtonClickListener onMyLocationButtonClickListener) {
        invoke2(googleMap, onMyLocationButtonClickListener);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GoogleMap googleMap, GoogleMap.OnMyLocationButtonClickListener onMyLocationButtonClickListener) {
        googleMap.getClass();
        googleMap.setOnMyLocationButtonClickListener(onMyLocationButtonClickListener);
    }
}
