package dk0;

import a11.a0;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import gl1.y;
import i3.u;
import i3.v5;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;
import r1.e0;
import r1.q2;
import sk0.j0;
import v62.f2;
import v62.o2;
import w52.q1;
import w52.r;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f60158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f60159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f60160d;

    public /* synthetic */ b(e23.a aVar, p1 p1Var, e23.a aVar2) {
        this.f60157a = 1;
        this.f60158b = aVar;
        this.f60159c = p1Var;
        this.f60160d = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005f  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:38:0x013e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0194  */
    /* JADX WARN: Code duplicated, block: B:57:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:66:0x023a  */
    /* JADX WARN: Code duplicated, block: B:71:0x025f  */
    /* JADX WARN: Code duplicated, block: B:76:0x027d  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f60157a;
        p3.m.a aVar = p3.m.f135153a;
        p1 p1Var = this.f60159c;
        e23.a aVar2 = this.f60160d;
        e23.a aVar3 = this.f60158b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((e0) obj).getClass();
                x1 x1Var = p3.n.f135158a;
                g82.c cVar = g82.c.f76436a;
                String strQ = y.Q(mVar, R.string.get_notified_about_your_subscription);
                String strQ2 = y.Q(mVar, R.string.allow_push_notifications_in_garmin_connect);
                String strQ3 = y.Q(mVar, R.string.go_to_settings);
                boolean zB = mVar.B(aVar3) | mVar.B(aVar2);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new at1.e(aVar3, aVar2, 3);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new at1.e(aVar3, aVar2, 3);
                        mVar.K(objQ);
                    }
                }
                e23.a aVar4 = (e23.a) objQ;
                String strQ4 = y.Q(mVar, R.string.not_now_lbl);
                boolean zB2 = mVar.B(aVar2);
                Object objQ2 = mVar.q();
                if (zB2) {
                    objQ2 = new a0(aVar2, p1Var, 7);
                    mVar.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new a0(aVar2, p1Var, 7);
                        mVar.K(objQ2);
                    }
                }
                e23.a aVar5 = (e23.a) objQ2;
                boolean zB3 = mVar.B(aVar2);
                Object objQ3 = mVar.q();
                if (zB3) {
                    objQ3 = new a0(aVar2, p1Var, 8);
                    mVar.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new a0(aVar2, p1Var, 8);
                        mVar.K(objQ3);
                    }
                }
                cVar.c(null, strQ, strQ2, 0, strQ3, aVar4, strQ4, aVar5, false, (e23.a) objQ3, mVar, 100663296, 9);
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    j0.f159697a.getClass();
                    z3.e eVar = j0.f159698b;
                    boolean zB4 = mVar2.B(aVar3) | mVar2.B(p1Var);
                    Object objQ4 = mVar2.q();
                    if (zB4) {
                        objQ4 = new p40.j0(aVar3, p1Var, 12);
                        mVar2.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new p40.j0(aVar3, p1Var, 12);
                            mVar2.K(objQ4);
                        }
                    }
                    u.b(eVar, (e23.a) objQ4, null, j0.f159699c, null, false, null, null, mVar2, 3078, 500);
                    z3.e eVar2 = j0.f159700d;
                    boolean zB5 = mVar2.B(aVar2) | mVar2.B(p1Var);
                    Object objQ5 = mVar2.q();
                    if (zB5) {
                        objQ5 = new p40.j0(aVar2, p1Var, 13);
                        mVar2.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new p40.j0(aVar2, p1Var, 13);
                            mVar2.K(objQ5);
                        }
                    }
                    u.b(eVar2, (e23.a) objQ5, null, j0.f159701e, null, false, null, null, mVar2, 3078, 500);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    String strQ5 = y.Q(mVar3, R.string.workout_lbl_duplicate);
                    s62.a.f157643a.getClass();
                    t62.b bVar = t62.b.f162798a;
                    u4.d dVarA = f2.a(bVar);
                    boolean zB6 = mVar3.B(aVar3);
                    Object objQ6 = mVar3.q();
                    if (zB6) {
                        objQ6 = new p40.j0(aVar3, p1Var, 28);
                        mVar3.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new p40.j0(aVar3, p1Var, 28);
                            mVar3.K(objQ6);
                        }
                    }
                    r.e(strQ5, dVarA, (e23.a) objQ6, mVar3);
                    g6.f.a aVar6 = g6.f.f75994b;
                    v5.a(0.0f, 6, 2, q2.e(d92.b.f58623a, mVar3), x2.f(x2.h(h4.r.S, 1), 1.0f), mVar3);
                    String strQ6 = y.Q(mVar3, R.string.lbl_remove);
                    u4.d dVarA2 = o2.a(bVar);
                    boolean zB7 = mVar3.B(aVar2);
                    Object objQ7 = mVar3.q();
                    if (zB7) {
                        objQ7 = new p40.j0(aVar2, p1Var, 29);
                        mVar3.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new p40.j0(aVar2, p1Var, 29);
                            mVar3.K(objQ7);
                        }
                    }
                    r.e(strQ6, dVarA2, (e23.a) objQ7, mVar3);
                } else {
                    mVar3.e();
                }
                break;
            default:
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var4 = p3.n.f135158a;
                    String strQ7 = y.Q(mVar4, R.string.workout_lbl_duplicate);
                    s62.a.f157643a.getClass();
                    t62.b bVar2 = t62.b.f162798a;
                    u4.d dVarA3 = f2.a(bVar2);
                    boolean zB8 = mVar4.B(aVar3);
                    Object objQ8 = mVar4.q();
                    if (zB8) {
                        objQ8 = new w52.p1(aVar3, p1Var, 0);
                        mVar4.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new w52.p1(aVar3, p1Var, 0);
                            mVar4.K(objQ8);
                        }
                    }
                    q1.i(strQ7, dVarA3, (e23.a) objQ8, mVar4);
                    g6.f.a aVar7 = g6.f.f75994b;
                    v5.a(0.0f, 6, 2, q2.e(d92.b.f58623a, mVar4), x2.f(x2.h(h4.r.S, 1), 1.0f), mVar4);
                    String strQ8 = y.Q(mVar4, R.string.lbl_remove);
                    u4.d dVarA4 = o2.a(bVar2);
                    boolean zB9 = mVar4.B(aVar2);
                    Object objQ9 = mVar4.q();
                    if (zB9) {
                        objQ9 = new w52.p1(aVar2, p1Var, 1);
                        mVar4.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new w52.p1(aVar2, p1Var, 1);
                            mVar4.K(objQ9);
                        }
                    }
                    q1.i(strQ8, dVarA4, (e23.a) objQ9, mVar4);
                } else {
                    mVar4.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(e23.a aVar, e23.a aVar2, p1 p1Var, int i14) {
        this.f60157a = i14;
        this.f60158b = aVar;
        this.f60160d = aVar2;
        this.f60159c = p1Var;
    }
}
