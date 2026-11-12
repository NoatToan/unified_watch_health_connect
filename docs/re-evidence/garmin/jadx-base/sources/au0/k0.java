package au0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f12955b;

    public /* synthetic */ k0(m0 m0Var, int i14) {
        this.f12954a = i14;
        this.f12955b = m0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f12954a) {
            case 0:
                m0.c cVar = this.f12955b.f12968a;
                if (cVar != null) {
                    cVar.a(false);
                }
                break;
            case 1:
                m0.c cVar2 = this.f12955b.f12968a;
                if (cVar2 != null) {
                    cVar2.a(false);
                }
                break;
            default:
                m0 m0Var = this.f12955b;
                m0.c cVar3 = m0Var.f12968a;
                if (cVar3 != null) {
                    cVar3.a(true);
                }
                m0Var.dismiss();
                break;
        }
        return Unit.INSTANCE;
    }
}
