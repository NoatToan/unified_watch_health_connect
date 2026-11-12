package et1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f65682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i3.a1 f65683c;

    public /* synthetic */ k1(o53.b0 b0Var, i3.a1 a1Var, int i14) {
        this.f65681a = i14;
        this.f65682b = b0Var;
        this.f65683c = a1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f65681a;
        i3.a1 a1Var = this.f65683c;
        o53.b0 b0Var = this.f65682b;
        switch (i14) {
            case 0:
                ge1.b.T(b0Var, null, null, new o1(a1Var, null), 3);
                break;
            default:
                q80.b bVar = q80.b.f143300a;
                ge1.b.T(b0Var, null, null, new q80.a(a1Var, null), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
