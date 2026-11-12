package t21;

import kotlin.m3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class o0 implements e23.r<Boolean, o4.d0, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m4.q f161940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m3 f161941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f161942c;

    public o0(m4.q qVar, m3 m3Var, e23.a<Unit> aVar) {
        this.f161940a = qVar;
        this.f161941b = m3Var;
        this.f161942c = aVar;
    }

    @Override // e23.r
    public final Unit invoke(Boolean bool, o4.d0 d0Var, p3.m mVar, Integer num) {
        bool.getClass();
        long j8 = d0Var.f128833a;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 129) != 128)) {
            x1 x1Var = p3.n.f135158a;
            b82.c.a(null, null, z3.f.c(-1710395390, new rx1.u(this.f161940a, 21, this.f161941b, this.f161942c), mVar2), tn.k.a(d92.b.f58623a, mVar2), mVar2, 384, 3);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
