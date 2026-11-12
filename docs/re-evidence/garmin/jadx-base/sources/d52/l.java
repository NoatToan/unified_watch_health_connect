package d52;

import com.garmin.android.apps.connectmobile.R;
import cw1.p0;
import gl1.y;
import l72.i3;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;
import sg0.q0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f57582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f57583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f57584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1 f57585e;

    public /* synthetic */ l(e23.a aVar, p1 p1Var, e23.a aVar2, e23.a aVar3) {
        this.f57581a = 2;
        this.f57582b = aVar;
        this.f57585e = p1Var;
        this.f57583c = aVar2;
        this.f57584d = aVar3;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:42:0x0166  */
    /* JADX WARN: Code duplicated, block: B:60:0x01da  */
    /* JADX WARN: Code duplicated, block: B:69:0x0266  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        i53.f fVarA;
        i53.f fVarA2;
        int i14 = this.f57581a;
        p3.m.a aVar = p3.m.f135153a;
        e23.a aVar2 = this.f57584d;
        e23.a aVar3 = this.f57583c;
        p1 p1Var = this.f57585e;
        e23.a aVar4 = this.f57582b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    if (((r) p1Var.getF182175a()).f57660e) {
                        mVar.C(-19318741);
                        String strQ = y.Q(mVar, R.string.lbl_pushes);
                        boolean zB = mVar.B(aVar4);
                        Object objQ = mVar.q();
                        if (zB) {
                            objQ = new p0(aVar4, 11);
                            mVar.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new p0(aVar4, 11);
                                mVar.K(objQ);
                            }
                        }
                        e23.a aVar5 = (e23.a) objQ;
                        if (((r) p1Var.getF182175a()).f57663h) {
                            mVar.C(-19092131);
                            fVarA = i53.a.a(new i3("MENU_ITEM_EDIT_PUSHES_GOAL", y.Q(mVar, R.string.edit_step_goal_title), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null), new i3("MENU_ITEM_HELP_PUSHES", y.Q(mVar, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                            mVar.f();
                        } else {
                            mVar.C(-18746977);
                            fVarA = i53.a.a(new i3("MENU_ITEM_HELP_PUSHES", y.Q(mVar, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                            mVar.f();
                        }
                        boolean zB2 = mVar.B(aVar3) | mVar.B(aVar2);
                        Object objQ2 = mVar.q();
                        if (zB2) {
                            objQ2 = new m(aVar3, aVar2, 0);
                            mVar.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new m(aVar3, aVar2, 0);
                                mVar.K(objQ2);
                            }
                        }
                        z02.f.d(strQ, null, null, aVar5, null, fVarA, (e23.l) objQ2, mVar, 2097152, 54);
                        mVar.f();
                    } else {
                        mVar.C(-18230889);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    if (((yq1.d) p1Var.getF182175a()).f198795e) {
                        mVar2.C(-898548289);
                        String strQ2 = y.Q(mVar2, R.string.lbl_steps);
                        boolean zB3 = mVar2.B(aVar4);
                        Object objQ3 = mVar2.q();
                        if (zB3) {
                            objQ3 = new pf0.j(aVar4, 14);
                            mVar2.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new pf0.j(aVar4, 14);
                                mVar2.K(objQ3);
                            }
                        }
                        e23.a aVar6 = (e23.a) objQ3;
                        i53.f fVarA3 = null;
                        if (((yq1.d) p1Var.getF182175a()).f198798h) {
                            mVar2.C(-898199849);
                            mVar2.f();
                            fVarA2 = null;
                        } else {
                            mVar2.C(-898345797);
                            fVarA2 = i53.a.a(new i3("MENU_ITEM_HELP_STEPS", y.Q(mVar2, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                            mVar2.f();
                        }
                        if (((yq1.d) p1Var.getF182175a()).f198798h) {
                            mVar2.C(-898074361);
                            fVarA3 = i53.a.a(new i3("MENU_ITEM_HELP_STEPS", y.Q(mVar2, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null), new i3("EDIT_STEPS_GOAL", y.Q(mVar2, R.string.edit_step_goal_title), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                            mVar2.f();
                        } else {
                            mVar2.C(-897755433);
                            mVar2.f();
                        }
                        boolean zB4 = mVar2.B(aVar3) | mVar2.B(aVar2);
                        Object objQ4 = mVar2.q();
                        if (zB4) {
                            objQ4 = new m(aVar3, aVar2, 4);
                            mVar2.K(objQ4);
                        } else {
                            aVar.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new m(aVar3, aVar2, 4);
                                mVar2.K(objQ4);
                            }
                        }
                        z02.f.d(strQ2, null, null, aVar6, fVarA2, fVarA3, (e23.l) objQ4, mVar2, 2359296, 22);
                        mVar2.f();
                    } else {
                        mVar2.C(-897398933);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    String strQ3 = y.Q(mVar3, R.string.concept_gear);
                    boolean zB5 = mVar3.B(aVar4);
                    Object objQ5 = mVar3.q();
                    if (zB5) {
                        objQ5 = new q0(aVar4, 12);
                        mVar3.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new q0(aVar4, 12);
                            mVar3.K(objQ5);
                        }
                    }
                    z02.f.c(196608, 22, null, (e23.a) objQ5, z3.f.c(-1574464243, new et.o(p1Var, aVar3, aVar2, 1), mVar3), strQ3, mVar3, null);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ l(e23.a aVar, e23.a aVar2, e23.a aVar3, p1 p1Var, int i14) {
        this.f57581a = i14;
        this.f57582b = aVar;
        this.f57583c = aVar2;
        this.f57584d = aVar3;
        this.f57585e = p1Var;
    }
}
