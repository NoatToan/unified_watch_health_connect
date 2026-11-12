package ew1;

import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f66530b;

    public /* synthetic */ j0(k0 k0Var, int i14) {
        this.f66529a = i14;
        this.f66530b = k0Var;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0069  */
    /* JADX WARN: Code duplicated, block: B:46:0x013e  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        jv1.s sVarI6;
        int i14 = this.f66529a;
        k0 k0Var = this.f66530b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                k0.a aVar = k0.f66545d;
                int i15 = 1;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    boolean zR = mVar.r(k0Var);
                    Object objQ = mVar.q();
                    p3.m.a aVar2 = p3.m.f135153a;
                    if (zR) {
                        objQ = new e40.d(k0Var, 12);
                        mVar.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e40.d(k0Var, 12);
                            mVar.K(objQ);
                        }
                    }
                    e23.a aVar3 = (e23.a) objQ;
                    aw1.h hVarW6 = k0Var.w6();
                    Double dZ5 = hVarW6.Z5();
                    jv1.p pVar = null;
                    d = null;
                    Double d14 = null;
                    pVar = null;
                    gg1.o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                    new dv1.a();
                    List listA = dv1.a.a(dZ5, o0VarG);
                    if (listA != null && !listA.isEmpty()) {
                        jv1.s sVarI7 = hVarW6.i6();
                        hVarW6.k8(sVarI7 != null ? jv1.s.a(sVarI7, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, listA, null, null, null, null, null, -1, 503) : null);
                        jv1.s sVarI8 = hVarW6.i6();
                        jv1.o oVar = sVarI8 != null ? sVarI8.K : null;
                        if ((oVar instanceof jv1.o.a) && (sVarI6 = hVarW6.i6()) != null) {
                            d14 = sVarI6.L;
                        }
                        pVar = new jv1.p(listA, oVar, d14, o0VarG);
                    }
                    if (pVar != null) {
                        mVar.C(1007663674);
                        boolean zD7 = k0Var.w6().d7();
                        boolean zR2 = mVar.r(k0Var);
                        Object objQ2 = mVar.q();
                        if (zR2) {
                            objQ2 = new j0(k0Var, i15);
                            mVar.K(objQ2);
                        } else {
                            aVar2.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new j0(k0Var, i15);
                                mVar.K(objQ2);
                            }
                        }
                        cw1.f0.d(pVar, zD7, aVar3, (e23.p) objQ2, true ^ k0Var.w6().f13385r1, k0Var.w6().C5("FBTElevationProfileFragment"), k0Var.w6().Y5(), mVar, 0, 0);
                        mVar.f();
                    } else {
                        mVar.C(1008958544);
                        mVar.f();
                        aVar3.invoke();
                    }
                } else {
                    mVar.e();
                }
                break;
            default:
                jv1.o oVar2 = (jv1.o) obj;
                Double d15 = (Double) obj2;
                k0.a aVar4 = k0.f66545d;
                if (k0Var.w6().f13385r1) {
                    k0Var.w6().G7("FBTElevationProfileFragment", new cw1.g0(k0Var, 17, oVar2, d15));
                } else {
                    k0Var.w6().A6(oVar2, d15);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
