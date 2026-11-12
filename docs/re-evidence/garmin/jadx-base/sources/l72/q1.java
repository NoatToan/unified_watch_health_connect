package l72;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b92.a f111210b;

    public /* synthetic */ q1(b92.a aVar, int i14) {
        this.f111209a = i14;
        this.f111210b = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        p5.k0 k0Var = (p5.k0) obj;
        switch (this.f111209a) {
            case 0:
                k0Var.getClass();
                b92.a aVar = this.f111210b;
                String strA = aVar != null ? aVar.a("testTag") : null;
                if (strA != null) {
                    p5.h0.A(k0Var, strA);
                }
                break;
            case 1:
                k0Var.getClass();
                b92.a aVar2 = this.f111210b;
                String strA2 = aVar2 != null ? aVar2.a("testTag") : null;
                if (strA2 != null) {
                    p5.h0.A(k0Var, strA2);
                }
                break;
            default:
                k0Var.getClass();
                b92.a aVar3 = this.f111210b;
                String strA3 = aVar3 != null ? aVar3.a("testTag") : null;
                if (strA3 != null) {
                    p5.h0.A(k0Var, strA3);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
