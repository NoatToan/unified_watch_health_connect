package t30;

import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import e23.p;
import java.util.List;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.n;
import p3.p1;
import p3.x1;
import s70.b0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f162145b;

    public /* synthetic */ a(c cVar, int i14) {
        this.f162144a = i14;
        this.f162145b = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0040  */
    /* JADX WARN: Code duplicated, block: B:28:0x0097  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f162144a;
        c cVar = this.f162145b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                c.b bVar = c.f162148z;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-905471438, new a(cVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                c.b bVar2 = c.f162148z;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    p1 p1VarC = s9.c.c(cVar.f162157t, mVar2);
                    boolean z14 = cVar.f162155q;
                    boolean z15 = cVar.f162156r;
                    boolean zR = mVar2.r(cVar);
                    Object objQ = mVar2.q();
                    p3.m.a aVar = p3.m.f135153a;
                    if (zR) {
                        objQ = new b(cVar, 2);
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new b(cVar, 2);
                            mVar2.K(objQ);
                        }
                    }
                    x30.c cVar2 = new x30.c(z14, z15, (e23.a) objQ);
                    if (cVar.f162152n <= 1 || cVar.f162151m == -1) {
                        mVar2.C(1790541075);
                        x30.a aVar2 = (x30.a) p1VarC.getF182175a();
                        if (aVar2 == null) {
                            mVar2.C(1790541074);
                            mVar2.f();
                        } else {
                            mVar2.C(1790541075);
                            ClimbDTO climbDTO = cVar.f162150l;
                            if (climbDTO == null) {
                                s.m("climbDTO");
                                throw null;
                            }
                            i.c(climbDTO, aVar2, cVar2, mVar2, ClimbDTO.f32776p);
                            mVar2.f();
                            Unit unit = Unit.INSTANCE;
                        }
                        mVar2.f();
                    } else {
                        mVar2.C(1790904891);
                        x30.a aVar3 = (x30.a) p1VarC.getF182175a();
                        if (aVar3 == null) {
                            mVar2.C(1790904890);
                            mVar2.f();
                        } else {
                            mVar2.C(1790904891);
                            List<ClimbDTO> list = cVar.f162149k;
                            if (list == null) {
                                s.m("climbs");
                                throw null;
                            }
                            x30.b bVar3 = new x30.b(i53.a.j(list), cVar.f162151m, cVar.f162152n);
                            boolean zR2 = mVar2.r(cVar);
                            Object objQ2 = mVar2.q();
                            if (zR2) {
                                objQ2 = new b0(cVar, 15);
                                mVar2.K(objQ2);
                            } else {
                                aVar.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new b0(cVar, 15);
                                    mVar2.K(objQ2);
                                }
                            }
                            v30.d.a(bVar3, aVar3, cVar2, (e23.l) objQ2, mVar2, 0);
                            mVar2.f();
                            Unit unit2 = Unit.INSTANCE;
                        }
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
