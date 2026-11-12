package com.google.maps.android.compose.streetview;

import com.google.android.gms.maps.StreetViewPanorama;
import p005kotlin.Metadata;
import p3.b4;
import p3.c;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a@\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0081\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;", "cameraPositionState", "", "isPanningGesturesEnabled", "isStreetNamesEnabled", "isUserNavigationEnabled", "isZoomGesturesEnabled", "Lcom/google/maps/android/compose/streetview/StreetViewPanoramaEventListeners;", "clickListeners", "", "StreetViewUpdater", "(Lcom/google/maps/android/compose/streetview/StreetViewCameraPositionState;ZZZZLcom/google/maps/android/compose/streetview/StreetViewPanoramaEventListeners;Lp3/m;I)V", "maps-compose_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class StreetViewPanoramaUpdaterKt {
    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    public static final void StreetViewUpdater(StreetViewCameraPositionState streetViewCameraPositionState, boolean z14, boolean z15, boolean z16, boolean z17, StreetViewPanoramaEventListeners streetViewPanoramaEventListeners, m mVar, int i14) {
        streetViewCameraPositionState.getClass();
        streetViewPanoramaEventListeners.getClass();
        mVar.C(-647819622);
        c<?> cVarF = mVar.F();
        cVarF.getClass();
        StreetViewPanorama streetViewPanorama = ((StreetViewPanoramaApplier) cVarF).getStreetViewPanorama();
        mVar.C(-406642905);
        boolean zR = ((((458752 & i14) ^ 196608) > 131072 && mVar.B(streetViewPanoramaEventListeners)) || (i14 & 196608) == 131072) | mVar.r(streetViewCameraPositionState) | mVar.r(streetViewPanorama);
        Object objQ = mVar.q();
        if (zR) {
            objQ = new StreetViewPanoramaUpdaterKt$StreetViewUpdater$1$1(streetViewCameraPositionState, streetViewPanorama, streetViewPanoramaEventListeners);
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new StreetViewPanoramaUpdaterKt$StreetViewUpdater$1$1(streetViewCameraPositionState, streetViewPanorama, streetViewPanoramaEventListeners);
                mVar.K(objQ);
            }
        }
        e23.a aVar = (e23.a) objQ;
        mVar.f();
        if (!(mVar.F() instanceof StreetViewPanoramaApplier)) {
            p0.l();
            throw null;
        }
        mVar.H();
        if (mVar.getT()) {
            mVar.M(aVar);
        } else {
            mVar.c();
        }
        b4.c(new StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$1(z14), Boolean.valueOf(z14), mVar);
        b4.c(new StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$2(z15), Boolean.valueOf(z15), mVar);
        b4.c(new StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$3(z16), Boolean.valueOf(z16), mVar);
        b4.c(new StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$4(z17), Boolean.valueOf(z17), mVar);
        b4.c(StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$5.INSTANCE, streetViewPanoramaEventListeners, mVar);
        mVar.y();
        mVar.f();
    }
}
