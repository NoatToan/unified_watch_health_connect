package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class me implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f89000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f89001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f89002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f89003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s5.x0 f89004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f89005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f89006g;

    /* JADX WARN: Multi-variable type inference failed */
    public me(boolean z14, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, e23.p<? super p3.m, ? super Integer, Unit> pVar3, s5.x0 x0Var, long j8, long j14) {
        this.f89000a = z14;
        this.f89001b = pVar;
        this.f89002c = pVar2;
        this.f89003d = pVar3;
        this.f89004e = x0Var;
        this.f89005f = j8;
        this.f89006g = j14;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (!this.f89000a || this.f89001b == null) {
                mVar2.C(-168976609);
                le.b(this.f89002c, this.f89001b, this.f89003d, this.f89004e, this.f89005f, this.f89006g, mVar2, 0);
                mVar2.f();
            } else {
                mVar2.C(-168990288);
                le.a(this.f89002c, this.f89001b, this.f89003d, this.f89004e, this.f89005f, this.f89006g, mVar2, 0);
                mVar2.f();
            }
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
