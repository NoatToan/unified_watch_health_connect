package t70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class c0 implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c1 f162817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f162818b;

    public c0(c1 c1Var, l0 l0Var) {
        this.f162817a = c1Var;
        this.f162818b = l0Var;
    }

    @Override // e23.a
    public final Unit invoke() {
        c1.b bVar = (c1.b) this.f162817a;
        boolean z14 = bVar.f162823c;
        l0 l0Var = this.f162818b;
        if (z14) {
            l0Var.C4(bVar.f162822b);
        } else {
            l0Var.x4(bVar.f162822b);
        }
        return Unit.INSTANCE;
    }
}
