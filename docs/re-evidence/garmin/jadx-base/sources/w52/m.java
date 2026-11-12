package w52;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f182629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f182630c;

    public /* synthetic */ m(v0 v0Var, int i14, int i15) {
        this.f182628a = i15;
        this.f182629b = v0Var;
        this.f182630c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f182628a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                o.b(this.f182629b, mVar, p3.p0.t(this.f182630c | 1));
                break;
            default:
                d0.a(this.f182629b, mVar, p3.p0.t(this.f182630c | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
