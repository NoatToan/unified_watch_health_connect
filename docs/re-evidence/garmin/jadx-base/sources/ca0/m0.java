package ca0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ta0.x f26344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f26345c;

    public /* synthetic */ m0(ta0.x xVar, lc.m0 m0Var, int i14) {
        this.f26343a = i14;
        this.f26344b = xVar;
        this.f26345c = m0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f26343a) {
            case 0:
                lc.m0 m0Var = this.f26345c;
                this.f26344b.y4(l90.c.REJECT);
                try {
                    p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                    m0Var.c(t0Var.b(b1.g.class));
                    m0Var.o(t0Var.b(b1.g.class), false);
                } catch (IllegalArgumentException unused) {
                    m0Var.h(new k(16), b1.g.INSTANCE);
                }
                break;
            default:
                lc.m0 m0Var2 = this.f26345c;
                this.f26344b.y4(l90.c.REJECT);
                try {
                    p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                    m0Var2.c(t0Var2.b(b1.l.class));
                    m0Var2.o(t0Var2.b(b1.l.class), false);
                } catch (IllegalArgumentException unused2) {
                    m0Var2.h(new k(16), b1.g.INSTANCE);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
