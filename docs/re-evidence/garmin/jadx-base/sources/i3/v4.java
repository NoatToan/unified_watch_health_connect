package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class v4 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c5 f89986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l3.e0 f89987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l3 f89988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b3 f89989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m4.b0 f89990e;

    public v4(c5 c5Var, l3.e0 e0Var, l3 l3Var, b3 b3Var, m4.b0 b0Var) {
        this.f89986a = c5Var;
        this.f89987b = e0Var;
        this.f89988c = l3Var;
        this.f89989d = b3Var;
        this.f89990e = b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:17:0x0064  */
    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            c5 c5Var = this.f89986a;
            Long lK = c5Var.k();
            Long lI = c5Var.i();
            long jD = c5Var.d();
            int iF = c5Var.f();
            boolean zB = mVar2.B(c5Var);
            Object objQ = mVar2.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zB) {
                objQ = new fp0.l(c5Var, 23);
                mVar2.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new fp0.l(c5Var, 23);
                    mVar2.K(objQ);
                }
            }
            e23.p pVar = (e23.p) objQ;
            boolean zB2 = mVar2.B(c5Var);
            Object objQ2 = mVar2.q();
            if (zB2) {
                objQ2 = new t4(c5Var, 1);
                mVar2.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new t4(c5Var, 1);
                    mVar2.K(objQ2);
                }
            }
            w4.c(lK, lI, jD, iF, pVar, (e23.l) objQ2, this.f89987b, c5Var.b(), this.f89988c, c5Var.e(), this.f89989d, this.f89990e, mVar2, 0);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
