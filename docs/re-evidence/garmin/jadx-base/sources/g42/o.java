package g42;

import android.location.Location;
import c22.z1;
import com.garmin.android.apps.connectmobile.map.GCMMapView;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.weather.defaultlocation.c f75814b;

    public /* synthetic */ o(com.garmin.android.apps.connectmobile.weather.defaultlocation.c cVar, int i14) {
        this.f75813a = i14;
        this.f75814b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f75813a) {
            case 0:
                o13.p pVar = (o13.p) obj;
                com.garmin.android.apps.connectmobile.weather.defaultlocation.c.a aVar = com.garmin.android.apps.connectmobile.weather.defaultlocation.c.f47939y;
                com.garmin.android.apps.connectmobile.weather.defaultlocation.c cVar = this.f75814b;
                if (pVar == null) {
                    cVar.w6().warn("zoomInitialMap: Could not get any location from the viewModel");
                    return Unit.INSTANCE;
                }
                Location location = (Location) pVar.f128594a;
                boolean zBooleanValue = ((Boolean) pVar.f128595b).booleanValue();
                Logger loggerW6 = cVar.w6();
                z1.f23762a.getClass();
                loggerW6.debug("zoomInitialMap: Using location ".concat(z1.b(location)));
                com.garmin.android.library.mapsdkadapter.f fVarC = com.garmin.android.library.mapsdkadapter.n.c(location);
                q qVar = cVar.f47941b;
                if (qVar == null) {
                    p005kotlin.jvm.internal.s.m("viewModel");
                    throw null;
                }
                cVar.G6(fVarC, (qVar.f75820d && zBooleanValue) ? 12.0f : 5.0f);
                cVar.A6(!zBooleanValue);
                if (zBooleanValue) {
                    cVar.u6(null, fVarC.f50283a);
                }
                if (cVar.f47941b != null) {
                    androidx.lifecycle.m.a(null, new r(fVarC, null), 3).f(cVar.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.weather.defaultlocation.c.b(new dt1.d(cVar, location, fVarC, zBooleanValue, 1)));
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("viewModel");
                throw null;
            default:
                vc2.b bVar = (vc2.b) obj;
                com.garmin.android.apps.connectmobile.weather.defaultlocation.c.a aVar2 = com.garmin.android.apps.connectmobile.weather.defaultlocation.c.f47939y;
                com.garmin.android.apps.connectmobile.weather.defaultlocation.c cVar2 = this.f75814b;
                cVar2.w6().debug("monitorInternetConnection update: networkConnectionState = {}", bVar);
                if (bVar instanceof vc2.b.C3312b) {
                    cVar2.requireActivity().getWindow().clearFlags(16);
                    GCMMapView gCMMapView = cVar2.f47951l;
                    if (gCMMapView == null) {
                        p005kotlin.jvm.internal.s.m("mapView");
                        throw null;
                    }
                    gCMMapView.setEnabled(true);
                } else {
                    cVar2.w6().debug("monitorInternetConnection: Disabling mapView");
                    GCMMapView gCMMapView2 = cVar2.f47951l;
                    if (gCMMapView2 == null) {
                        p005kotlin.jvm.internal.s.m("mapView");
                        throw null;
                    }
                    gCMMapView2.setEnabled(false);
                }
                return Unit.INSTANCE;
        }
    }
}
