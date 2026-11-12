package com.google.maps.android.ktx;

import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.SupportStreetViewPanoramaFragment;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086H¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;", "Lcom/google/android/gms/maps/StreetViewPanorama;", "awaitStreetViewPanorama", "(Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;Lt13/d;)Ljava/lang/Object;", "maps-ktx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SupportStreetViewPanoramaFragmentKt {
    public static final Object awaitStreetViewPanorama(SupportStreetViewPanoramaFragment supportStreetViewPanoramaFragment, t13.d<? super StreetViewPanorama> dVar) {
        t13.i iVar = new t13.i(u13.f.b(dVar));
        supportStreetViewPanoramaFragment.getStreetViewPanoramaAsync(new SupportStreetViewPanoramaFragmentKt$awaitStreetViewPanorama$2$1(iVar));
        Object objA = iVar.a();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objA;
    }

    private static final Object awaitStreetViewPanorama$$forInline(SupportStreetViewPanoramaFragment supportStreetViewPanoramaFragment, t13.d<? super StreetViewPanorama> dVar) {
        t13.i iVar = new t13.i(u13.f.b(dVar));
        supportStreetViewPanoramaFragment.getStreetViewPanoramaAsync(new SupportStreetViewPanoramaFragmentKt$awaitStreetViewPanorama$2$1(iVar));
        Unit unit = Unit.INSTANCE;
        Object objA = iVar.a();
        if (objA == u13.a.COROUTINE_SUSPENDED) {
            dVar.getClass();
        }
        return objA;
    }
}
