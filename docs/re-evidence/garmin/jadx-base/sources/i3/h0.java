package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mc f88274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s1.f0 f88275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.f0 f88276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1.f0 f88277e;

    public /* synthetic */ h0(mc mcVar, s1.f0 f0Var, s1.f0 f0Var2, s1.f0 f0Var3, int i14) {
        this.f88273a = i14;
        this.f88274b = mcVar;
        this.f88275c = f0Var;
        this.f88276d = f0Var2;
        this.f88277e = f0Var3;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f88273a) {
            case 0:
                mc mcVar = this.f88274b;
                mcVar.f88997f = this.f88275c;
                mcVar.f88998g = this.f88276d;
                mcVar.f88995d = this.f88277e;
                break;
            default:
                mc mcVar2 = this.f88274b;
                mcVar2.f88997f = this.f88275c;
                mcVar2.f88998g = this.f88276d;
                mcVar2.f88995d = this.f88277e;
                break;
        }
        return Unit.INSTANCE;
    }
}
