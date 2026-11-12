package yr;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nr.g.o f198875b;

    public /* synthetic */ k0(nr.g.o oVar, int i14, int i15) {
        this.f198874a = i15;
        this.f198875b = oVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f198874a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                m0.a(this.f198875b, mVar, p3.p0.t(1));
                break;
            case 1:
                m0.b(this.f198875b, mVar, p3.p0.t(1));
                break;
            default:
                m0.c(this.f198875b, mVar, p3.p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
