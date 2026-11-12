package com.google.maps.android.ktx;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import o53.k;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086H¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/android/gms/maps/MapFragment;", "Lcom/google/android/gms/maps/GoogleMap;", "awaitMap", "(Lcom/google/android/gms/maps/MapFragment;Lt13/d;)Ljava/lang/Object;", "maps-ktx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class MapFragmentKt {
    public static final Object awaitMap(MapFragment mapFragment, t13.d<? super GoogleMap> dVar) throws Throwable {
        k kVar = new k(u13.f.b(dVar), 1);
        kVar.q();
        mapFragment.getMapAsync(new MapFragmentKt$awaitMap$2$1(kVar));
        Object objP = kVar.p();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }

    private static final Object awaitMap$$forInline(MapFragment mapFragment, t13.d<? super GoogleMap> dVar) throws Throwable {
        k kVar = new k(u13.f.b(dVar), 1);
        kVar.q();
        mapFragment.getMapAsync(new MapFragmentKt$awaitMap$2$1(kVar));
        Unit unit = Unit.INSTANCE;
        Object objP = kVar.p();
        if (objP == u13.a.COROUTINE_SUSPENDED) {
            dVar.getClass();
        }
        return objP;
    }
}
