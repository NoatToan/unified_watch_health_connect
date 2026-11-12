package et;

import a03.h0;
import am.k1;
import c2.u;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIInReachMessaging;
import f5.z0;
import gl1.y;
import h4.r;
import h5.e0;
import l72.h3;
import l72.i3;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import wv0.v;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f65266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f65267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f65268d;

    public /* synthetic */ o(e23.a aVar, e23.a aVar2, p1 p1Var, int i14) {
        this.f65265a = i14;
        this.f65267c = aVar;
        this.f65268d = aVar2;
        this.f65266b = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0302  */
    /* JADX WARN: Code duplicated, block: B:106:0x033a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0103  */
    /* JADX WARN: Code duplicated, block: B:48:0x015e  */
    /* JADX WARN: Code duplicated, block: B:75:0x023e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0281  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        i53.c cVarB;
        int i14 = this.f65265a;
        p3.m.a aVar = p3.m.f135153a;
        e23.a aVar2 = this.f65268d;
        e23.a aVar3 = this.f65267c;
        p1 p1Var = this.f65266b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    vs.a aVar4 = ((ys.b) p1Var.getF182175a()).f199162d;
                    if ((aVar4 != null ? aVar4.f179693b : null) instanceof ys.a.C3724a) {
                        mVar.C(1568947050);
                        String strQ = y.Q(mVar, R.string.lbl_record_activity);
                        boolean zB = mVar.B(aVar3);
                        Object objQ = mVar.q();
                        if (zB) {
                            objQ = new e52.c(aVar3, 14);
                            mVar.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new e52.c(aVar3, 14);
                                mVar.K(objQ);
                            }
                        }
                        e23.a aVar5 = (e23.a) objQ;
                        i53.f fVarA = i53.a.a(new i3("HELP", y.Q(mVar, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                        boolean zB2 = mVar.B(aVar2);
                        Object objQ2 = mVar.q();
                        if (zB2) {
                            objQ2 = new h0(aVar2, 23);
                            mVar.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new h0(aVar2, 23);
                                mVar.K(objQ2);
                            }
                        }
                        z02.f.d(strQ, null, null, aVar5, fVarA, null, (e23.l) objQ2, mVar, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                        mVar.f();
                    } else {
                        mVar.C(1569457341);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    r.a aVar6 = r.S;
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC = h4.k.c(aVar6, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar7 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar7);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    u uVar = u.f22885a;
                    i53.f fVarA2 = i53.a.a(new i3("ADD", y.Q(mVar2, R.string.lbl_add), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zB3 = mVar2.B(p1Var);
                    Object objQ3 = mVar2.q();
                    if (zB3) {
                        objQ3 = new sk0.n(p1Var, 4);
                        mVar2.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new sk0.n(p1Var, 4);
                            mVar2.K(objQ3);
                        }
                    }
                    h3.a(null, fVarA2, null, null, (e23.l) objQ3, mVar2, 3520);
                    boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                    d92.b.f58623a.getClass();
                    long jG = d92.b.a(mVar2).c().g();
                    boolean zB4 = mVar2.B(p1Var);
                    Object objQ4 = mVar2.q();
                    if (zB4) {
                        objQ4 = new sg0.l(p1Var, 16);
                        mVar2.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new sg0.l(p1Var, 16);
                            mVar2.K(objQ4);
                        }
                    }
                    i3.u.a(zBooleanValue, (e23.a) objQ4, null, 0L, null, null, null, jG, 0.0f, 0.0f, z3.f.c(-448339784, new dk0.b(aVar3, p1Var, aVar2), mVar2), mVar2, 0, 48, 1916);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    if (((xh0.g) p1Var.getF182175a()).f191003d) {
                        mVar3.C(-380169096);
                        String strQ2 = y.Q(mVar3, R.string.floors_title);
                        boolean zB5 = mVar3.B(aVar3);
                        Object objQ5 = mVar3.q();
                        if (zB5) {
                            objQ5 = new v(aVar3, 14);
                            mVar3.K(objQ5);
                        } else {
                            aVar.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new v(aVar3, 14);
                                mVar3.K(objQ5);
                            }
                        }
                        e23.a aVar8 = (e23.a) objQ5;
                        if (((xh0.g) p1Var.getF182175a()).f191005f) {
                            mVar3.C(-379931667);
                            cVarB = i53.a.a(new i3("EDIT_FLOOR_GOAL", y.Q(mVar3, R.string.edit_step_goal_title), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                            mVar3.f();
                        } else {
                            mVar3.C(-379746597);
                            mVar3.f();
                            cVarB = j53.l.b();
                        }
                        i53.c cVar = cVarB;
                        boolean zB6 = mVar3.B(aVar2);
                        Object objQ6 = mVar3.q();
                        if (zB6) {
                            objQ6 = new rx1.m(aVar2, 29);
                            mVar3.K(objQ6);
                        } else {
                            aVar.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                objQ6 = new rx1.m(aVar2, 29);
                                mVar3.K(objQ6);
                            }
                        }
                        z02.f.d(strQ2, null, null, aVar8, cVar, null, (e23.l) objQ6, mVar3, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                        mVar3.f();
                    } else {
                        mVar3.C(-379418555);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    String strQ3 = y.Q(mVar4, R.string.title_photos);
                    boolean zB7 = mVar4.B(p1Var) | mVar4.B(aVar3) | mVar4.B(aVar2);
                    Object objQ7 = mVar4.q();
                    if (zB7) {
                        objQ7 = new k1(aVar3, aVar2, p1Var, 1);
                        mVar4.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new k1(aVar3, aVar2, p1Var, 1);
                            mVar4.K(objQ7);
                        }
                    }
                    e23.a aVar9 = (e23.a) objQ7;
                    i53.f fVarA3 = !((Boolean) p1Var.getF182175a()).booleanValue() ? i53.a.a(new i3("ReorderDelete", y.Q(mVar4, R.string.reorder_and_delete_photos), false, (u4.d) null, (String) null, 20, (p005kotlin.jvm.internal.j) null)) : null;
                    boolean zB8 = mVar4.B(p1Var);
                    Object objQ8 = mVar4.q();
                    if (zB8) {
                        objQ8 = new xq1.c(p1Var, 4);
                        mVar4.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new xq1.c(p1Var, 4);
                            mVar4.K(objQ8);
                        }
                    }
                    z02.f.d(strQ3, null, null, aVar9, null, fVarA3, (e23.l) objQ8, mVar4, 2097152, 54);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ o(p1 p1Var, e23.a aVar, e23.a aVar2, int i14) {
        this.f65265a = i14;
        this.f65266b = p1Var;
        this.f65267c = aVar;
        this.f65268d = aVar2;
    }
}
