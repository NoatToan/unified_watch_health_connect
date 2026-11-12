package ca0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26353a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l90.b f26354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f26355c;

    public /* synthetic */ n0(l90.b bVar, lc.m0 m0Var) {
        this.f26354b = bVar;
        this.f26355c = m0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f26353a) {
            case 0:
                lc.y.l(this.f26355c, new b1.i(this.f26354b, (l90.k) null, 2, (p005kotlin.jvm.internal.j) null));
                break;
            default:
                l90.b bVar = this.f26354b;
                boolean z14 = bVar.f111531p.f58437c.f58414c;
                lc.m0 m0Var = this.f26355c;
                if (z14) {
                    lc.y.l(m0Var, new b1.d(bVar));
                } else if (bVar.f111517b) {
                    lc.y.l(m0Var, new b1.e(bVar, (String) null, 2, (p005kotlin.jvm.internal.j) null));
                } else {
                    lc.y.l(m0Var, new b1.l(bVar, (Long) null, 2, (p005kotlin.jvm.internal.j) null));
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ n0(lc.m0 m0Var, l90.b bVar) {
        this.f26355c = m0Var;
        this.f26354b = bVar;
    }
}
