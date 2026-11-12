package bv0;

import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gv0.d f21337b;

    public /* synthetic */ j(gv0.d dVar, int i14) {
        this.f21336a = i14;
        this.f21337b = dVar;
    }

    @Override // e23.a
    public final Object invoke() {
        Object value;
        Object value2;
        switch (this.f21336a) {
            case 0:
                this.f21337b.G4();
                break;
            case 1:
                this.f21337b.C4();
                break;
            case 2:
                p2 p2Var = this.f21337b.f79189g;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, null));
                break;
            default:
                p2 p2Var2 = this.f21337b.f79189g;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, null));
                break;
        }
        return Unit.INSTANCE;
    }
}
