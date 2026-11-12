package hl1;

import android.content.Context;
import g2.m1;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements s5.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f84410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f84411c;

    public /* synthetic */ k(int i14, Object obj, Object obj2) {
        this.f84409a = i14;
        this.f84410b = obj;
        this.f84411c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s5.n
    public final void a(s5.m mVar) {
        int i14 = this.f84409a;
        Object obj = this.f84411c;
        Object obj2 = this.f84410b;
        switch (i14) {
            case 0:
                m1 m1Var = (m1) obj;
                mVar.getClass();
                sd2.f fVar = ((f) ((p1) obj2).getF182175a()).f84386c;
                if (fVar != null) {
                    m1Var.invoke(fVar);
                }
                break;
            case 1:
                Context context = (Context) obj2;
                mVar.getClass();
                context.startActivity(((gi0.a) obj).g(context));
                break;
            case 2:
                mVar.getClass();
                ((wd2.l) obj2).getF104144a().a((Context) obj);
                break;
            case 3:
                e23.l lVar = (e23.l) obj;
                mVar.getClass();
                qu0.f fVar2 = ((qu0.e) obj2).f147891e;
                if (fVar2 != null) {
                    lVar.invoke(fVar2);
                }
                break;
            default:
                ny1.e eVar = (ny1.e) obj2;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.k kVar = (com.garmin.android.apps.connectmobile.traininginitiative.ui.k) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.k.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.k.f46110c;
                mVar.getClass();
                ny1.e eVar2 = ny1.e.DISTANCE;
                if (eVar != eVar2) {
                    kVar.C6().G6(eVar2);
                    kVar.C6().C6(null);
                } else {
                    ht.a.f85464a.getClass();
                    ht.a.a(null, "EventTimeBasedTargetTapped");
                    kVar.C6().G6(ny1.e.TIME);
                    kVar.C6().D6(null);
                }
                break;
        }
    }
}
