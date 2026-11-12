package w51;

import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f182295b;

    public /* synthetic */ l(h0 h0Var, int i14) {
        this.f182294a = i14;
        this.f182295b = h0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        Object value;
        switch (this.f182294a) {
            case 0:
                h0 h0Var = this.f182295b;
                p2 p2Var = h0Var.f182267b;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, w.a((w) p2Var.getValue(), false, false, null, null, true, 31)));
                h0Var.A4();
                break;
            default:
                this.f182295b.A4();
                break;
        }
        return Unit.INSTANCE;
    }
}
