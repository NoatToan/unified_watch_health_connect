package ig1;

import bs2.gf;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class i0 implements fb2.b0.a<gf> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f93344a;

    public i0(j0 j0Var) {
        this.f93344a = j0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fb2.b0.a
    public final void e(gf gfVar) {
        gf gfVar2 = gfVar;
        HashMap map = j0.f93347d;
        j0 j0Var = this.f93344a;
        com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) j0Var.f70344b;
        if (fVar == null) {
            vb.h.s("Model is required");
        } else {
            if (gfVar2 == null) {
                vb.h.s("Invalid value: [null].");
                return;
            }
            fVar.y1("gpsMode", Integer.valueOf(gfVar2.f20164a));
            j0Var.setChanged();
            j0Var.notifyObservers(gfVar2);
        }
    }
}
