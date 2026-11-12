package rx1;

import p005kotlin.Unit;
import p3.n1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dy1.q f154989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1 f154990c;

    public /* synthetic */ i(dy1.q qVar, n1 n1Var, int i14) {
        this.f154988a = i14;
        this.f154989b = qVar;
        this.f154990c = n1Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f154988a;
        ((Boolean) obj).getClass();
        switch (i14) {
            case 0:
                this.f154990c.t(this.f154989b.f61605a.f23006b);
                break;
            default:
                this.f154990c.t(this.f154989b.f61605a.f23006b);
                break;
        }
        return Unit.INSTANCE;
    }
}
