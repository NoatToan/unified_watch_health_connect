package g42;

import android.location.Address;
import c22.z1;
import ds.e0;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.weather.defaultlocation.c f75811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f75812c;

    public /* synthetic */ n(com.garmin.android.apps.connectmobile.weather.defaultlocation.c cVar, String str, int i14) {
        this.f75810a = i14;
        this.f75811b = cVar;
        this.f75812c = str;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f75810a;
        String str = this.f75812c;
        com.garmin.android.apps.connectmobile.weather.defaultlocation.c cVar = this.f75811b;
        Address address = (Address) obj;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.weather.defaultlocation.c.a aVar = com.garmin.android.apps.connectmobile.weather.defaultlocation.c.f47939y;
                if (address == null) {
                    e0.u("zoomInitialMap: Could not get any address from description string [", str, "]", cVar.w6());
                    return Unit.INSTANCE;
                }
                cVar.w6().debug("zoomInitialMap: Used cached location to get address: {}", address);
                z1 z1Var = z1.f23762a;
                qe2.h hVar = cVar.f47952m;
                if (hVar == null) {
                    p005kotlin.jvm.internal.s.m("map");
                    throw null;
                }
                com.garmin.android.library.mapsdkadapter.i.d f50264r = hVar.f144584a.getF50264r();
                z1Var.getClass();
                com.garmin.android.library.mapsdkadapter.f fVarA = z1.a(address, f50264r);
                cVar.C6(address, true);
                cVar.G6(fVarA, 12.0f);
                cVar.u6(address, fVarA.f50283a);
                cVar.A6(false);
                q qVar = cVar.f47941b;
                if (qVar == null) {
                    p005kotlin.jvm.internal.s.m("viewModel");
                    throw null;
                }
                Logger logger = q.f75816h;
                qVar.C4(address, null);
                return Unit.INSTANCE;
            case 1:
                com.garmin.android.apps.connectmobile.weather.defaultlocation.c.a aVar2 = com.garmin.android.apps.connectmobile.weather.defaultlocation.c.f47939y;
                if (address == null) {
                    cVar.v6(true);
                    Unit unit = Unit.INSTANCE;
                    cVar.w6().warn("searchLocationButtonClicked: Could not get address for postalCodeText ".concat(str));
                    return Unit.INSTANCE;
                }
                cVar.w6().debug("searchLocationButtonClicked: Going to address {}", address);
                z1 z1Var2 = z1.f23762a;
                qe2.h hVar2 = cVar.f47952m;
                if (hVar2 == null) {
                    p005kotlin.jvm.internal.s.m("map");
                    throw null;
                }
                com.garmin.android.library.mapsdkadapter.i.d f50264r2 = hVar2.f144584a.getF50264r();
                z1Var2.getClass();
                cVar.G6(z1.a(address, f50264r2), 12.0f);
                cVar.u6(address, null);
                cVar.C6(address, true);
                cVar.F6(true);
                cVar.A6(false);
                q qVar2 = cVar.f47941b;
                if (qVar2 == null) {
                    p005kotlin.jvm.internal.s.m("viewModel");
                    throw null;
                }
                Logger logger2 = q.f75816h;
                qVar2.C4(address, null);
                return Unit.INSTANCE;
            default:
                if (address == null) {
                    com.garmin.android.apps.connectmobile.weather.defaultlocation.c.a aVar3 = com.garmin.android.apps.connectmobile.weather.defaultlocation.c.f47939y;
                    cVar.w6().warn("onItemSelected: Could not find a country for name=".concat(str));
                    return Unit.INSTANCE;
                }
                com.garmin.android.apps.connectmobile.weather.defaultlocation.c.a aVar4 = com.garmin.android.apps.connectmobile.weather.defaultlocation.c.f47939y;
                cVar.w6().warn("onItemSelected: Going to address " + address);
                z1 z1Var3 = z1.f23762a;
                qe2.h hVar3 = cVar.f47952m;
                if (hVar3 == null) {
                    p005kotlin.jvm.internal.s.m("map");
                    throw null;
                }
                com.garmin.android.library.mapsdkadapter.i.d f50264r3 = hVar3.f144584a.getF50264r();
                z1Var3.getClass();
                cVar.G6(z1.a(address, f50264r3), 5.0f);
                cVar.C6(address, true);
                cVar.A6(true);
                return Unit.INSTANCE;
        }
    }
}
