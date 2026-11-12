package fs;

import e23.l;
import i3.mc;
import o53.b0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73395a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f73396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f73397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mc f73398d;

    public /* synthetic */ h(l lVar, b0 b0Var, mc mcVar) {
        this.f73396b = lVar;
        this.f73397c = b0Var;
        this.f73398d = mcVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f73395a) {
            case 0:
                mc mcVar = this.f73398d;
                return ge1.b.T(this.f73397c, null, null, new j.e(mcVar, null), 3).J(new e52.b(23, mcVar, this.f73396b));
            default:
                this.f73396b.invoke(null);
                ge1.b.T(this.f73397c, null, null, new xr.g(this.f73398d, null), 3);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ h(b0 b0Var, mc mcVar, l lVar) {
        this.f73397c = b0Var;
        this.f73398d = mcVar;
        this.f73396b = lVar;
    }
}
