package t70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class o implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1 f162936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f162937b;

    public o(b1 b1Var, q qVar) {
        this.f162936a = b1Var;
        this.f162937b = qVar;
    }

    @Override // e23.a
    public final Unit invoke() {
        b1.a aVar = (b1.a) this.f162936a;
        boolean z14 = aVar.f162812c;
        q qVar = this.f162937b;
        if (z14) {
            qVar.C4(aVar.f162811b);
        } else {
            qVar.x4(aVar.f162811b);
        }
        return Unit.INSTANCE;
    }
}
