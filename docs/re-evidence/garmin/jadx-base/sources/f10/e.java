package f10;

import c22.b1;
import c22.l3;
import c22.q3;
import p005kotlin.Unit;
import p3.n1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f67815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f67816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1 f67817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1 f67818d;

    public /* synthetic */ e(e23.l lVar, n1 n1Var, n1 n1Var2, int i14) {
        this.f67815a = i14;
        this.f67816b = lVar;
        this.f67817c = n1Var;
        this.f67818d = n1Var2;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f67815a) {
            case 0:
                this.f67816b.invoke(Long.valueOf(this.f67818d.getIntValue() + (this.f67817c.getIntValue() * 60)));
                break;
            default:
                double dA = b1.a(this.f67817c.getIntValue() + "." + this.f67818d.getIntValue());
                q3 q3Var = mg0.b.c() ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                l3.a aVar = l3.f23124b;
                q3 q3Var2 = q3.METERS_PER_SECOND;
                aVar.getClass();
                this.f67816b.invoke(Double.valueOf(l3.a.w(dA, q3Var, q3Var2)));
                break;
        }
        return Unit.INSTANCE;
    }
}
