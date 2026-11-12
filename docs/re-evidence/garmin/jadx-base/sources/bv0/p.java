package bv0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sc.f f21356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gv0.d f21357c;

    public /* synthetic */ p(sc.f fVar, gv0.d dVar, int i14) {
        this.f21355a = i14;
        this.f21356b = fVar;
        this.f21357c = dVar;
    }

    @Override // e23.a
    public final Object invoke() {
        sc.j jVar;
        switch (this.f21355a) {
            case 0:
                this.f21356b.a(gl.b.N((ou0.d) this.f21357c.X.f150540a.getValue()) ? a.j.INSTANCE : a.z.INSTANCE);
                break;
            default:
                gv0.d dVar = this.f21357c;
                boolean zC5 = dVar.c5();
                ou0.d dVar2 = (ou0.d) dVar.X.f150540a.getValue();
                if (zC5) {
                    jVar = a.a0.INSTANCE;
                } else {
                    jVar = gl.b.N(dVar2) ? a.j.INSTANCE : a.z.INSTANCE;
                }
                this.f21356b.a(jVar);
                break;
        }
        return Unit.INSTANCE;
    }
}
