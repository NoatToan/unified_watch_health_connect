package g02;

import c2.t2;
import c2.x2;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import java.math.RoundingMode;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f74366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f74367c;

    public /* synthetic */ e(float f14, float f15, int i14) {
        this.f74365a = i14;
        this.f74366b = f14;
        this.f74367c = f15;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f74365a;
        float f14 = this.f74367c;
        float f15 = this.f74366b;
        switch (i14) {
            case 0:
                f5.b1 b1Var = (f5.b1) obj;
                f5.y0 y0Var = (f5.y0) obj2;
                b1Var.getClass();
                y0Var.getClass();
                f5.v1 v1VarQ = y0Var.Q(((g6.a) obj3).f75988a);
                int iS0 = (int) b1Var.s0(f15);
                int iS1 = (int) b1Var.s0(f14);
                int iMax = Math.max(v1VarQ.f69144a + iS0, v1VarQ.f69145b);
                int i15 = v1VarQ.f69145b + iS1;
                return f5.b1.h0(b1Var, iMax, i15, new a3.q0(v1VarQ, iMax, i15, 3));
            case 1:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    c2.l.f(x2.u(x2.h(h4.r.S, f15), f14), mVar);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    c2.l.f(x2.u(x2.h(h4.r.S, f15), f14), mVar2);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 3:
                t2 t2Var = (t2) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(t2Var) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    l72.x0 x0Var = l72.x0.f111346a;
                    l3.a aVar = l3.f23124b;
                    RoundingMode roundingMode = RoundingMode.HALF_UP;
                    aVar.getClass();
                    String strC = l3.a.C(f15);
                    String strQ = gl1.y.Q(mVar3, R.string.avg_running_economy);
                    String strQ2 = gl1.y.Q(mVar3, R.string.avg_running_economy);
                    Object objQ = mVar3.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new xd2.m0(2);
                        mVar3.K(objQ);
                    }
                    b92.a aVarA = wz1.a.a(oi0.c.B(strQ2, (e23.l) objQ, mVar3));
                    int i16 = b92.a.f16960b;
                    int i17 = (iIntValue3 & 14) | (l72.x0.f111348c << 24);
                    x0Var.a(i17, 60, aVarA, t2Var, null, null, strC, strQ, null, null, mVar3);
                    x0Var.a(i17, 124, null, t2Var, null, null, l3.a.C(f14), gl1.y.Q(mVar3, R.string.best_running_economy), null, null, mVar3);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            default:
                f5.b1 b1Var2 = (f5.b1) obj;
                f5.y0 y0Var2 = (f5.y0) obj2;
                b1Var2.getClass();
                y0Var2.getClass();
                f5.v1 v1VarQ2 = y0Var2.Q(((g6.a) obj3).f75988a);
                return b1Var2.H1(v1VarQ2.f69144a, v1VarQ2.f69145b, p13.t0.b(new o13.p(f5.b.f68892a, Integer.valueOf(MathKt.c((f15 + f14) / 2.0f)))), new a03.k0(v1VarQ2, 28));
        }
    }
}
