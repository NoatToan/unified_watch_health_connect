package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class c8 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w7 f87725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f87726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c2.t2 f87728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87729f;

    /* JADX WARN: Multi-variable type inference failed */
    public c8(e23.p<? super p3.m, ? super Integer, Unit> pVar, w7 w7Var, boolean z14, e23.p<? super p3.m, ? super Integer, Unit> pVar2, c2.t2 t2Var, e23.p<? super p3.m, ? super Integer, Unit> pVar3) {
        this.f87724a = pVar;
        this.f87725b = w7Var;
        this.f87726c = z14;
        this.f87727d = pVar2;
        this.f87728e = t2Var;
        this.f87729f = pVar3;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            boolean z14 = this.f87726c;
            w7 w7Var = this.f87725b;
            e23.p<p3.m, Integer, Unit> pVar = this.f87724a;
            if (pVar != null) {
                mVar2.C(-864613220);
                p3.v.a(s2.f89590a.c(o4.d0.a(z14 ? w7Var.f90101b : w7Var.f90104e)), z3.f.c(1241781204, new z7(pVar), mVar2), mVar2, 56);
                mVar2.f();
            } else {
                mVar2.C(-864293207);
                mVar2.f();
            }
            p3.j0 j0Var = s2.f89590a;
            p3.n2 n2VarC = j0Var.c(o4.d0.a(z14 ? w7Var.f90100a : w7Var.f90103d));
            c2.t2 t2Var = this.f87728e;
            e23.p<p3.m, Integer, Unit> pVar2 = this.f87729f;
            e23.p<p3.m, Integer, Unit> pVar3 = this.f87727d;
            p3.v.a(n2VarC, z3.f.c(-893579015, new a8(t2Var, pVar, pVar3, pVar2), mVar2), mVar2, 56);
            if (pVar3 != null) {
                mVar2.C(-863394951);
                p3.v.a(j0Var.c(o4.d0.a(z14 ? w7Var.f90102c : w7Var.f90105f)), z3.f.c(-782441013, new b8(pVar3), mVar2), mVar2, 56);
                mVar2.f();
            } else {
                mVar2.C(-863072055);
                mVar2.f();
            }
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
