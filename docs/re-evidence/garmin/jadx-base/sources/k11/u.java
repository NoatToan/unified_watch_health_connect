package k11;

import am.j1;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import gv0.o0;
import l72.f0;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102261a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f102262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f102263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f102264d;

    public /* synthetic */ u(e23.a aVar, p1 p1Var, p1 p1Var2) {
        this.f102264d = aVar;
        this.f102262b = p1Var;
        this.f102263c = p1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0073  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c8  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f102261a;
        p3.m.a aVar = p3.m.f135153a;
        e23.a aVar2 = this.f102264d;
        p1 p1Var = this.f102263c;
        p1 p1Var2 = this.f102262b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    d.f102186a.getClass();
                    z3.e eVar = d.f102187b;
                    boolean zB = mVar.B(aVar2);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new a11.a0(aVar2, p1Var2, 22);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new a11.a0(aVar2, p1Var2, 22);
                            mVar.K(objQ);
                        }
                    }
                    i3.u.b(eVar, (e23.a) objQ, null, null, null, false, null, null, mVar, 6, 508);
                    z3.e eVar2 = d.f102188c;
                    Object objQ2 = mVar.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new j1(p1Var, p1Var2, 12);
                        mVar.K(objQ2);
                    }
                    i3.u.b(eVar2, (e23.a) objQ2, null, null, null, false, null, null, mVar, 54, 508);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    f0 f0Var = f0.f110999a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
                    String strQ = gl1.y.Q(mVar2, R.string.add_new_gear);
                    boolean zB2 = mVar2.B(p1Var2) | mVar2.B(p1Var) | mVar2.B(aVar2);
                    Object objQ3 = mVar2.q();
                    if (zB2) {
                        objQ3 = new o0(p1Var2, aVar2, p1Var, 9);
                        mVar2.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new o0(p1Var2, aVar2, p1Var, 9);
                            mVar2.K(objQ3);
                        }
                    }
                    f0Var.k(strQ, rVarY, false, (e23.a) objQ3, mVar2, 0, 4);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ u(p1 p1Var, p1 p1Var2, e23.a aVar) {
        this.f102262b = p1Var;
        this.f102263c = p1Var2;
        this.f102264d = aVar;
    }
}
