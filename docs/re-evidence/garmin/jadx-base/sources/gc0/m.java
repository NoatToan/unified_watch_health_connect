package gc0;

import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgc0/m;", "Ld80/b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<ArrayList<e>, Unit> f76898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f76899b;

    /* JADX WARN: Multi-variable type inference failed */
    public m(e23.l<? super ArrayList<e>, Unit> lVar, l lVar2) {
        this.f76898a = lVar;
        this.f76899b = lVar2;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        this.f76898a.invoke(new ArrayList<>());
        this.f76899b.f76882f.error("DevicesDashboardViewModel - ERROR in DeviceSharingUtil.fetchRegisteredGCDevices");
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        ArrayList<e> arrayList = new ArrayList<>();
        ArrayList<bm2.c> arrayList2 = obj instanceof ArrayList ? (ArrayList) obj : null;
        if (arrayList2 != null) {
            for (bm2.c cVar : arrayList2) {
                if (cVar != null) {
                    sd2.j jVar = new sd2.j();
                    com.garmin.android.apps.connectmobile.devices.model.l lVarF = zb0.k.f(cVar);
                    jVar.f158685b1 = lVarF.getProductDisplayName();
                    jVar.O0 = lVarF.getProductDisplayName();
                    jVar.f158688d = System.currentTimeMillis();
                    jVar.f158683a1 = lVarF.getProductDisplayName();
                    jVar.Z0 = lVarF.getPartNumberPartial();
                    jVar.Y0 = lVarF.getPartNumber();
                    jVar.L0 = lVarF.getImageUrl();
                    jVar.X0 = 1;
                    jVar.f158707m = true;
                    e eVar = new e(jVar, lVarF);
                    eVar.f76852h = lVarF.getIsPrimaryUser();
                    arrayList.add(eVar);
                }
            }
        }
        this.f76898a.invoke(arrayList);
    }
}
