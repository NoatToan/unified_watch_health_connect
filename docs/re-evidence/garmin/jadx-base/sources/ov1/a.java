package ov1;

import cw1.f0;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.x1;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f134134b;

    public /* synthetic */ a(b bVar, int i14) {
        this.f134133a = i14;
        this.f134134b = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e0  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        List<jv1.o> list;
        mv1.a aVar;
        fg0.k kVar;
        j61.f courseProfileDTO;
        fg0.k kVar2;
        j61.f courseProfileDTO2;
        int i14 = this.f134133a;
        b bVar = this.f134134b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                b.a aVar2 = b.f134135c;
                int i15 = 1;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    p2 p2Var = bVar.u6().N0;
                    mv1.a aVar3 = (mv1.a) p2Var.getValue();
                    jv1.p pVar = null;
                    if (aVar3 != null && (list = aVar3.f121171i) != null) {
                        mv1.a aVar4 = (mv1.a) p2Var.getValue();
                        Double elevationGainMeter = (aVar4 == null || (kVar2 = aVar4.f121169g) == null || (courseProfileDTO2 = kVar2.getCourseProfileDTO()) == null) ? null : courseProfileDTO2.getElevationGainMeter();
                        jv1.o oVarE = (p2Var == null || (aVar = (mv1.a) p2Var.getValue()) == null || (kVar = aVar.f121169g) == null || (courseProfileDTO = kVar.getCourseProfileDTO()) == null) ? null : tu1.a.e(courseProfileDTO, list);
                        if (oVarE != null) {
                            pVar = new jv1.p(list, oVarE, elevationGainMeter, ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g());
                        } else {
                            mv1.a aVar5 = (mv1.a) p2Var.getValue();
                            if ((aVar5 != null ? aVar5.f121163a : null) == tw1.k.INTERMEDIATE) {
                                pVar = new jv1.p(list, oVarE, elevationGainMeter, ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g());
                            }
                        }
                    }
                    if (pVar != null) {
                        mVar.C(-300707673);
                        boolean zR = mVar.r(bVar);
                        Object objQ = mVar.q();
                        p3.m.a aVar6 = p3.m.f135153a;
                        if (zR) {
                            objQ = new n82.i(bVar, 26);
                            mVar.K(objQ);
                        } else {
                            aVar6.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new n82.i(bVar, 26);
                                mVar.K(objQ);
                            }
                        }
                        e23.a aVar7 = (e23.a) objQ;
                        boolean zR2 = mVar.r(bVar);
                        Object objQ2 = mVar.q();
                        if (zR2) {
                            objQ2 = new a(bVar, i15);
                            mVar.K(objQ2);
                        } else {
                            aVar6.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new a(bVar, i15);
                                mVar.K(objQ2);
                            }
                        }
                        f0.d(pVar, true, aVar7, (e23.p) objQ2, false, 0, 0, mVar, 48, 112);
                        mVar.f();
                    } else {
                        mVar.C(-299806255);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            default:
                b.a aVar8 = b.f134135c;
                bVar.u6().v5("FBTEditElevationProfileFragment", new nw0.p(bVar, 12, (jv1.o) obj, (Double) obj2));
                break;
        }
        return Unit.INSTANCE;
    }
}
