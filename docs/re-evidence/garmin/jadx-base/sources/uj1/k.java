package uj1;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import ty1.f1;
import v62.e1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f171532b;

    public /* synthetic */ k(l lVar, int i14) {
        this.f171531a = i14;
        this.f171532b = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0136  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f171531a;
        l lVar = this.f171532b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l.a aVar = l.f171535g;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-2097324115, new k(lVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l.a aVar2 = l.f171535g;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r rVarE = u1.n.e(x2.d(h4.r.S, 1.0f), vb.h.e(d92.b.f58623a, mVar2), m1.f128891a);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarE, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    c2.u uVar = c2.u.f22885a;
                    b82.s sVar = b82.s.f16758a;
                    String strQ = gl1.y.Q(mVar2, R.string.lbl_whats_new_safety_features);
                    String strQ2 = gl1.y.Q(mVar2, R.string.lbl_fall_detection);
                    String strQ3 = gl1.y.Q(mVar2, R.string.lbl_new_name_new_functionality);
                    String strQ4 = gl1.y.Q(mVar2, R.string.msg_incident_detection_new_name);
                    s62.a.f157643a.getClass();
                    t62.b bVar2 = t62.b.f162798a;
                    i53.c<b82.s.b> cVarE = i53.a.e(p13.x.k(new b82.s.b(strQ3, strQ4, e1.a(bVar2), null, null, 24, null), new b82.s.b(gl1.y.Q(mVar2, R.string.lbl_alert_your_contacts), gl1.y.Q(mVar2, R.string.msg_contacts_notified), e1.a(bVar2), 0 == true ? 1 : 0, null, 24, null), new b82.s.b(gl1.y.Q(mVar2, R.string.lbl_detection_during_activities), gl1.y.Q(mVar2, R.string.msg_detection_during_activities), e1.a(bVar2), 0 == true ? 1 : 0, null, 24, null)));
                    String strQ5 = gl1.y.Q(mVar2, R.string.gak_lbl_continue);
                    boolean zR = mVar2.r(lVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new f1(lVar, 14);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f1(lVar, 14);
                            mVar2.K(objQ);
                        }
                    }
                    sVar.a(strQ, strQ2, strQ5, cVarE, (e23.a) objQ, mVar2, 0, 0);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
