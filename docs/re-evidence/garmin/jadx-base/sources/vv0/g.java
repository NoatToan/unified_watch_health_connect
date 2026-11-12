package vv0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180444a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f180445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f180446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f180447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b.u f180448e;

    public /* synthetic */ g(lc.m0 m0Var, boolean z14, e23.a aVar, b.u uVar) {
        this.f180447d = m0Var;
        this.f180445b = z14;
        this.f180446c = aVar;
        this.f180448e = uVar;
    }

    @Override // e23.a
    public final Object invoke() {
        b.u uVar;
        switch (this.f180444a) {
            case 0:
                if (!this.f180447d.m()) {
                    if (this.f180445b) {
                        this.f180446c.invoke();
                    } else {
                        b.u uVar2 = this.f180448e;
                        if (uVar2 != null) {
                            uVar2.d();
                        }
                    }
                }
                break;
            default:
                if (this.f180445b) {
                    this.f180446c.invoke();
                } else if (!this.f180447d.n() && (uVar = this.f180448e) != null) {
                    uVar.d();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g(boolean z14, e23.a aVar, lc.m0 m0Var, b.u uVar) {
        this.f180445b = z14;
        this.f180446c = aVar;
        this.f180447d = m0Var;
        this.f180448e = uVar;
    }
}
