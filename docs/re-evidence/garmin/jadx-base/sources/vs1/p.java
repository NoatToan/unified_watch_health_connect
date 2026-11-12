package vs1;

import o53.s0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f179874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pt1.t f179875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f179876d;

    public /* synthetic */ p(t tVar, pt1.t tVar2, e23.l lVar, int i14) {
        this.f179873a = i14;
        this.f179874b = tVar;
        this.f179875c = tVar2;
        this.f179876d = lVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f179873a) {
            case 0:
                t tVar = this.f179874b;
                o53.b0 b0Var = tVar.f179893b;
                x53.c cVar = s0.f129406a;
                ge1.b.T(b0Var, x53.b.f189152a, null, new s(tVar, this.f179875c, false, this.f179876d, null), 2);
                break;
            default:
                t tVar2 = this.f179874b;
                o53.b0 b0Var2 = tVar2.f179893b;
                x53.c cVar2 = s0.f129406a;
                ge1.b.T(b0Var2, x53.b.f189152a, null, new q(tVar2, this.f179875c, false, this.f179876d, null), 2);
                break;
        }
        return Unit.INSTANCE;
    }
}
