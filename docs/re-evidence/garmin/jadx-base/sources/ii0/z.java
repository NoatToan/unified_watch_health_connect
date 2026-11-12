package ii0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class z implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zc.d f93762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ li0.f f93763c;

    public /* synthetic */ z(zc.d dVar, li0.f fVar, int i14) {
        this.f93761a = i14;
        this.f93762b = dVar;
        this.f93763c = fVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        e2.f0 f0Var = (e2.f0) obj;
        switch (this.f93761a) {
            case 0:
                f0Var.getClass();
                zc.d dVar = this.f93762b;
                e2.f0.f(f0Var, dVar.b(), new zc.a(new ig2.d(7), dVar), new z3.e(692342274, true, new v(dVar, this.f93763c, 1)), 4);
                break;
            default:
                f0Var.getClass();
                zc.d dVar2 = this.f93762b;
                e2.f0.f(f0Var, dVar2.b(), new zc.a(new ig2.d(8), dVar2), new z3.e(49446801, true, new v(dVar2, this.f93763c, 2)), 4);
                break;
        }
        return Unit.INSTANCE;
    }
}
