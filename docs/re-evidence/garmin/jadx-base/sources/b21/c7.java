package b21;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c7 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f14578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f14579c;

    public /* synthetic */ c7(lc.m0 m0Var, p3.p1 p1Var, int i14) {
        this.f14577a = i14;
        this.f14578b = m0Var;
        this.f14579c = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        s21.k kVar = (s21.k) obj;
        switch (this.f14577a) {
            case 0:
                kVar.getClass();
                lc.y.l(this.f14578b, new c.d(kVar.f156137a, ((u21.s) this.f14579c.getF182175a()).f168114c == s21.c.TIMELINE));
                break;
            default:
                kVar.getClass();
                lc.y.l(this.f14578b, new c.d(kVar.f156137a, ((u21.s) this.f14579c.getF182175a()).f168114c == s21.c.TIMELINE));
                break;
        }
        return Unit.INSTANCE;
    }
}
