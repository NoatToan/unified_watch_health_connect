package w2;

import p005kotlin.Unit;
import z2.q2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f181308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v13.i f181309c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ c0(o53.b0 b0Var, e23.l lVar, int i14) {
        this.f181307a = i14;
        this.f181308b = b0Var;
        this.f181309c = (v13.i) lVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [e23.l, v13.i] */
    /* JADX WARN: Type inference failed for: r2v2, types: [e23.l, v13.i] */
    @Override // e23.a
    public final Object invoke() {
        switch (this.f181307a) {
            case 0:
                ge1.b.T(this.f181308b, null, o53.d0.UNDISPATCHED, new g0(this.f181309c, null), 1);
                break;
            default:
                ge1.b.T(this.f181308b, null, o53.d0.UNDISPATCHED, new q2(this.f181309c, null), 1);
                break;
        }
        return Unit.INSTANCE;
    }
}
