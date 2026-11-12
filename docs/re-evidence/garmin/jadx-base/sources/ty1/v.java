package ty1;

import android.content.Context;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class v implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.e f167249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fg0.k f167250c;

    public /* synthetic */ v(com.garmin.android.apps.connectmobile.traininginitiative.ui.e eVar, fg0.k kVar, int i14) {
        this.f167248a = i14;
        this.f167249b = eVar;
        this.f167250c = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:45:0x013f  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        List<com.garmin.android.apps.connectmobile.workouts.data.model.c> listH;
        int i14 = this.f167248a;
        fg0.k kVar = this.f167250c;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.e eVar = this.f167249b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.e.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.e.f45928o;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1493481256, new v(eVar, kVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.e.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.e.f45928o;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar2, h4.d.a.f81536n, mVar2, 6);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    p3.i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarF, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    c2.b0 b0Var = c2.b0.f22601a;
                    String string = eVar.getString(R.string.event_goal);
                    string.getClass();
                    String string2 = eVar.getString(R.string.lbl_edit);
                    string2.getClass();
                    boolean zR = mVar2.r(eVar) | mVar2.r(kVar);
                    Object objQ = mVar2.q();
                    p3.m.a aVar4 = p3.m.f135153a;
                    if (zR) {
                        objQ = new tb0.d(14, eVar, kVar);
                        mVar2.K(objQ);
                    } else {
                        aVar4.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new tb0.d(14, eVar, kVar);
                            mVar2.K(objQ);
                        }
                    }
                    l72.r1.c(string, string2, (e23.a) objQ, false, null, null, mVar2, 0, 56);
                    List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listH2 = kVar.h();
                    if (listH2 == null) {
                        listH2 = p13.j0.f134944a;
                    }
                    fg0.j eventCustomization = kVar.getEventCustomization();
                    if (eventCustomization == null || (listH = eventCustomization.h()) == null) {
                        listH = p13.j0.f134944a;
                    }
                    if (listH2.isEmpty() || listH.isEmpty()) {
                        mVar2.C(-203220444);
                        mVar2.f();
                    } else {
                        mVar2.C(-204785913);
                        Context contextRequireContext = eVar.requireContext();
                        contextRequireContext.getClass();
                        for (mg0.a aVar5 : mg0.b.b(contextRequireContext, listH2, listH, kVar.n0())) {
                            ng0.b bVar2 = ng0.b.f125905a;
                            boolean zR2 = mVar2.r(eVar) | mVar2.r(kVar);
                            Object objQ2 = mVar2.q();
                            if (zR2) {
                                objQ2 = new ry0.g(24, eVar, kVar);
                                mVar2.K(objQ2);
                            } else {
                                aVar4.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new ry0.g(24, eVar, kVar);
                                    mVar2.K(objQ2);
                                }
                            }
                            int i16 = mg0.a.f118363g;
                            bVar2.a(aVar5, (e23.q) objQ2, mVar2, 0);
                        }
                        mVar2.f();
                    }
                    mVar2.y();
                    p3.x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
