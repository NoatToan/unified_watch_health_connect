package t70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class m implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f162929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f162930b;

    public m(q qVar, b1 b1Var) {
        this.f162929a = qVar;
        this.f162930b = b1Var;
    }

    @Override // e23.a
    public final Unit invoke() {
        this.f162929a.x4(((b1.a) this.f162930b).f162811b);
        return Unit.INSTANCE;
    }
}
