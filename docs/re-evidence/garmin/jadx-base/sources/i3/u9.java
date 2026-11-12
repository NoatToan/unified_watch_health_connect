package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class u9 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m9 f89889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f89890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f89891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.f0<o4.d0> f89892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f89893e;

    /* JADX WARN: Multi-variable type inference failed */
    public u9(m9 m9Var, boolean z14, boolean z15, s1.f0<o4.d0> f0Var, e23.p<? super p3.m, ? super Integer, Unit> pVar) {
        this.f89889a = m9Var;
        this.f89890b = z14;
        this.f89891c = z15;
        this.f89892d = f0Var;
        this.f89893e = pVar;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        long j8;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            n3.j0.f122993a.getClass();
            s5.x0 x0VarA = sj.a(n3.j0.f123001i, mVar2);
            boolean z14 = this.f89891c;
            m9 m9Var = this.f89889a;
            if (z14) {
                j8 = this.f89890b ? m9Var.f88959b : m9Var.f88962e;
            } else {
                j8 = m9Var.f88964g;
            }
            l3.k.b(((o4.d0) r1.f2.a(j8, this.f89892d, mVar2).getF182175a()).f128833a, x0VarA, this.f89893e, mVar2, 0);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
