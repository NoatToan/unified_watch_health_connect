package y22;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import l72.f0;
import p005kotlin.Unit;
import p3.x1;
import v62.b8;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f194272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f194273b;

    public /* synthetic */ p(e23.a aVar, int i14) {
        this.f194272a = i14;
        this.f194273b = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0107  */
    /* JADX WARN: Code duplicated, block: B:44:0x0148  */
    /* JADX WARN: Code duplicated, block: B:51:0x0188  */
    /* JADX WARN: Code duplicated, block: B:58:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:8:0x0030  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f194272a;
        p3.m.a aVar = p3.m.f135153a;
        e23.a aVar2 = this.f194273b;
        switch (i14) {
            case 0:
                h4.r rVar = (h4.r) obj;
                p3.m mVar = (p3.m) obj2;
                v.h.y(856554448, rVar, (Integer) obj3, mVar);
                x1 x1Var = p3.n.f135158a;
                boolean zB = mVar.B(aVar2);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new wv0.v(aVar2, 26);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new wv0.v(aVar2, 26);
                        mVar.K(objQ);
                    }
                }
                h4.r rVarD = u1.w.d(rVar, false, null, null, (e23.a) objQ, 15);
                mVar.f();
                return rVarD;
            case 1:
                h4.r rVar2 = (h4.r) obj;
                p3.m mVar2 = (p3.m) obj2;
                v.h.y(-1306622035, rVar2, (Integer) obj3, mVar2);
                x1 x1Var2 = p3.n.f135158a;
                boolean zB2 = mVar2.B(aVar2);
                Object objQ2 = mVar2.q();
                if (zB2) {
                    objQ2 = new ya0.l(aVar2, 14);
                    mVar2.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new ya0.l(aVar2, 14);
                        mVar2.K(objQ2);
                    }
                }
                h4.r rVarD2 = u1.w.d(rVar2, false, null, null, (e23.a) objQ2, 15);
                mVar2.f();
                return rVarD2;
            case 2:
                h4.r rVar3 = (h4.r) obj;
                p3.m mVar3 = (p3.m) obj2;
                v.h.y(1682107679, rVar3, (Integer) obj3, mVar3);
                x1 x1Var3 = p3.n.f135158a;
                boolean zB3 = mVar3.B(aVar2);
                Object objQ3 = mVar3.q();
                if (zB3) {
                    objQ3 = new ya0.l(aVar2, 15);
                    mVar3.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new ya0.l(aVar2, 15);
                        mVar3.K(objQ3);
                    }
                }
                h4.r rVarD3 = u1.w.d(rVar3, false, null, null, (e23.a) objQ3, 15);
                mVar3.f();
                return rVarD3;
            case 3:
                h4.r rVar4 = (h4.r) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                rVar4.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar4.B(rVar4) ? 4 : 2;
                }
                if (mVar4.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var4 = p3.n.f135158a;
                    f0.a aVar3 = f0.a.f111000a;
                    String strQ = gl1.y.Q(mVar4, R.string.lbl_share);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = b8.a(t62.b.f162798a);
                    h4.r.a aVar4 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarThen = x2.f(c2.l.C(aVar4, j92.b.f97899b.f97920e, 0.0f, 0.0f, 0.0f, 14), 1.0f).then(rVar4);
                    boolean zB4 = mVar4.B(aVar2);
                    Object objQ4 = mVar4.q();
                    if (zB4) {
                        objQ4 = new ya0.l(aVar2, 20);
                        mVar4.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new ya0.l(aVar2, 20);
                            mVar4.K(objQ4);
                        }
                    }
                    aVar3.h(0, 8, (e23.a) objQ4, rVarThen, strQ, mVar4, dVarA, false);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                h4.r rVar5 = (h4.r) obj;
                p3.m mVar5 = (p3.m) obj2;
                v.h.y(-934208613, rVar5, (Integer) obj3, mVar5);
                x1 x1Var5 = p3.n.f135158a;
                boolean zB5 = mVar5.B(aVar2);
                Object objQ5 = mVar5.q();
                if (zB5) {
                    objQ5 = new ya0.l(aVar2, 24);
                    mVar5.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new ya0.l(aVar2, 24);
                        mVar5.K(objQ5);
                    }
                }
                h4.r rVarD4 = u1.w.d(rVar5, false, null, null, (e23.a) objQ5, 15);
                mVar5.f();
                return rVarD4;
            default:
                h4.r rVar6 = (h4.r) obj;
                p3.m mVar6 = (p3.m) obj2;
                v.h.y(-526516401, rVar6, (Integer) obj3, mVar6);
                x1 x1Var6 = p3.n.f135158a;
                boolean zB6 = mVar6.B(aVar2);
                Object objQ6 = mVar6.q();
                if (zB6) {
                    objQ6 = new yy1.d(aVar2, 10);
                    mVar6.K(objQ6);
                } else {
                    aVar.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new yy1.d(aVar2, 10);
                        mVar6.K(objQ6);
                    }
                }
                h4.r rVarD5 = u1.w.d(rVar6, false, null, null, (e23.a) objQ6, 15);
                mVar6.f();
                return rVarD5;
        }
    }
}
