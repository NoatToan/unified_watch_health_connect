package n12;

import androidx.lifecycle.y0;
import java.util.ArrayList;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f122293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.editimage.a f122294c;

    public /* synthetic */ q(v0 v0Var, com.garmin.android.apps.connectmobile.userprofile.editimage.a aVar, int i14) {
        this.f122292a = i14;
        this.f122293b = v0Var;
        this.f122294c = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        com.garmin.android.apps.connectmobile.userprofile.editimage.g gVar;
        int i14 = this.f122292a;
        com.garmin.android.apps.connectmobile.userprofile.editimage.a aVar = this.f122294c;
        v0 v0Var = this.f122293b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.userprofile.model.p pVar = (com.garmin.android.apps.connectmobile.userprofile.model.p) obj;
                int i15 = com.garmin.android.apps.connectmobile.userprofile.editimage.a.f46642h;
                ArrayList arrayList = v0Var.f122319a;
                String strG = pVar != null ? pVar.g() : null;
                int i16 = 1;
                boolean zH = pVar != null ? pVar.h() : true;
                arrayList.clear();
                arrayList.add(v0.c.a.f122326a);
                arrayList.add(v0.c.b.f122327a);
                if (pVar != null && strG != null && !zH) {
                    arrayList.add(new v0.c.C2310c(pVar, true));
                }
                v0Var.notifyItemRangeChanged(0, arrayList.size());
                v0Var.f122320b = new com.garmin.android.apps.connectmobile.userprofile.editimage.b(aVar, v0Var);
                y0 y0Var = aVar.w6().f46605j;
                androidx.lifecycle.n0 viewLifecycleOwner = aVar.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                dh.b.L(y0Var, viewLifecycleOwner, new com.garmin.android.apps.connectmobile.userprofile.editimage.a.b(new q(v0Var, aVar, i16)));
                y0 y0Var2 = aVar.w6().f46607k0;
                androidx.lifecycle.n0 viewLifecycleOwner2 = aVar.getViewLifecycleOwner();
                viewLifecycleOwner2.getClass();
                dh.b.L(y0Var2, viewLifecycleOwner2, new com.garmin.android.apps.connectmobile.userprofile.editimage.a.b(new p(aVar, 2)));
                break;
            default:
                com.garmin.android.apps.connectmobile.userprofile.editimage.f fVar = (com.garmin.android.apps.connectmobile.userprofile.editimage.f) obj;
                int i17 = com.garmin.android.apps.connectmobile.userprofile.editimage.a.f46642h;
                fVar.getClass();
                v0Var.r(fVar.getF46701a());
                if ((fVar instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.c) && (gVar = aVar.f46648f) != null) {
                    gVar.r(-1);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
