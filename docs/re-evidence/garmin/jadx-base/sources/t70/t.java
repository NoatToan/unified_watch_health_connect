package t70;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class t implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f163029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f163030c;

    public /* synthetic */ t(l0 l0Var, e23.a aVar, int i14, int i15) {
        this.f163028a = i15;
        this.f163029b = l0Var;
        this.f163030c = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f163028a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                k0.b(this.f163029b, this.f163030c, mVar, p3.p0.t(49));
                break;
            default:
                k0.a(this.f163029b, this.f163030c, mVar, p3.p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
