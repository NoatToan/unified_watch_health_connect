package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ne implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f89080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f89081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f89082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f89083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f89084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f89085f;

    /* JADX WARN: Multi-variable type inference failed */
    public ne(boolean z14, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, e23.p<? super p3.m, ? super Integer, Unit> pVar3, long j8, long j14) {
        this.f89080a = z14;
        this.f89081b = pVar;
        this.f89082c = pVar2;
        this.f89083d = pVar3;
        this.f89084e = j8;
        this.f89085f = j14;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            n3.z0.f123335a.getClass();
            p3.v.a(mh.f89022a.c(sj.a(n3.z0.f123343i, mVar2)), z3.f.c(969655473, new me(this.f89080a, this.f89081b, this.f89082c, this.f89083d, sj.a(n3.z0.f123337c, mVar2), this.f89084e, this.f89085f), mVar2), mVar2, 56);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
