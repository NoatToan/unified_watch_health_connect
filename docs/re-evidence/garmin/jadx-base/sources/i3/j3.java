package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class j3 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o4.r1 f88512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b3 f88513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f88514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.q<c2.a0, p3.m, Integer, Unit> f88515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88517f;

    /* JADX WARN: Multi-variable type inference failed */
    public j3(o4.r1 r1Var, b3 b3Var, float f14, e23.q<? super c2.a0, ? super p3.m, ? super Integer, Unit> qVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2) {
        this.f88512a = r1Var;
        this.f88513b = b3Var;
        this.f88514c = f14;
        this.f88515d = qVar;
        this.f88516e = pVar;
        this.f88517f = pVar2;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            n3.n.f123126a.getClass();
            ve.a(c2.x2.j(c2.x2.p(aVar, n3.n.f123130e), 0.0f, n3.n.f123128c, 1), this.f88512a, this.f88513b.f87537a, 0L, this.f88514c, 0.0f, null, z3.f.c(1782015378, new i3(this.f88515d, this.f88516e, this.f88517f), mVar2), mVar2, 12582918, 104);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
