package i3;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class mg implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u1.d2 f89016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f89017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f89018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f89019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.q<List<wf>, p3.m, Integer, Unit> f89020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f89021f;

    /* JADX WARN: Multi-variable type inference failed */
    public mg(u1.d2 d2Var, float f14, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, e23.q<? super List<wf>, ? super p3.m, ? super Integer, Unit> qVar, int i14) {
        this.f89016a = d2Var;
        this.f89017b = f14;
        this.f89018c = pVar;
        this.f89019d = pVar2;
        this.f89020e = qVar;
        this.f89021f = i14;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = mVar2.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.l0.j(t13.h.f161748a, mVar2);
                mVar2.K(objQ);
            }
            o53.b0 b0Var = (o53.b0) objQ;
            s1.f0 f0VarB = k9.b(n3.h0.DefaultSpatial, mVar2);
            u1.d2 d2Var = this.f89016a;
            boolean zB = mVar2.B(d2Var) | mVar2.B(b0Var);
            Object objQ2 = mVar2.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new nb(d2Var, b0Var, f0VarB);
                mVar2.K(objQ2);
            }
            nb nbVar = (nb) objQ2;
            h4.r rVarF = c2.x2.f(h4.r.S, 1.0f);
            h4.d.f81522a.getClass();
            h4.r rVarC = l4.k.c(g8.i.Z(u1.a2.b(c2.x2.y(rVarF, h4.d.a.f81527e, 2), d2Var, false)));
            boolean zI = mVar2.i(this.f89017b) | mVar2.B(this.f89018c) | mVar2.B(this.f89019d) | mVar2.B(this.f89020e) | mVar2.r(nbVar) | mVar2.k(this.f89021f);
            Object objQ3 = mVar2.q();
            if (zI || objQ3 == c2565a) {
                dt1.c cVar = new dt1.c(this.f89017b, this.f89018c, this.f89019d, nbVar, this.f89021f, this.f89020e);
                mVar2.K(cVar);
                objQ3 = cVar;
            }
            f5.i2.b(rVarC, (e23.p) objQ3, mVar2, 0, 0);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
