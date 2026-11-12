package com.google.maps.android.ktx;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086H¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/android/gms/maps/MapView;", "Lcom/google/android/gms/maps/GoogleMap;", "awaitMap", "(Lcom/google/android/gms/maps/MapView;Lt13/d;)Ljava/lang/Object;", "maps-ktx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class MapViewKt {
    public static final Object awaitMap(MapView mapView, t13.d<? super GoogleMap> dVar) {
        t13.i iVar = new t13.i(u13.f.b(dVar));
        mapView.getMapAsync(new MapViewKt$awaitMap$2$1(iVar));
        Object objA = iVar.a();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objA;
    }

    private static final Object awaitMap$$forInline(MapView mapView, t13.d<? super GoogleMap> dVar) {
        t13.i iVar = new t13.i(u13.f.b(dVar));
        mapView.getMapAsync(new MapViewKt$awaitMap$2$1(iVar));
        Unit unit = Unit.INSTANCE;
        Object objA = iVar.a();
        if (objA == u13.a.COROUTINE_SUSPENDED) {
            dVar.getClass();
        }
        return objA;
    }
}
