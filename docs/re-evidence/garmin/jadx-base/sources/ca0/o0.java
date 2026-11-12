package ca0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o1 f26393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f26394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f26395d;

    public /* synthetic */ o0(o1 o1Var, lc.m0 m0Var, e23.a aVar) {
        this.f26392a = 1;
        this.f26393b = o1Var;
        this.f26394c = m0Var;
        this.f26395d = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f26392a) {
            case 0:
                lc.m0 m0Var = this.f26394c;
                try {
                    try {
                        p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                        m0Var.c(t0Var.b(b1.m.class));
                        return Boolean.valueOf(m0Var.o(t0Var.b(b1.m.class), false));
                    } catch (IllegalArgumentException unused) {
                        p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                        m0Var.c(t0Var2.b(b1.g.class));
                        return Boolean.valueOf(m0Var.o(t0Var2.b(b1.g.class), false));
                    }
                } catch (IllegalArgumentException unused2) {
                    int i14 = y0.a.f26538a[this.f26393b.ordinal()];
                    if (i14 != 1 && i14 != 2) {
                        this.f26395d.invoke();
                        return Unit.INSTANCE;
                    }
                    m0Var.h(new k(16), b1.g.INSTANCE);
                    return Unit.INSTANCE;
                }
            case 1:
                int i15 = y0.a.f26538a[this.f26393b.ordinal()];
                if (i15 == 1 || i15 == 2) {
                    b1.g gVar = b1.g.INSTANCE;
                    this.f26394c.h(new k(16), gVar);
                } else {
                    this.f26395d.invoke();
                }
                return Unit.INSTANCE;
            default:
                lc.m0 m0Var2 = this.f26394c;
                try {
                    p005kotlin.jvm.internal.t0 t0Var3 = p005kotlin.jvm.internal.s0.f105811a;
                    m0Var2.c(t0Var3.b(b1.g.class));
                    m0Var2.o(t0Var3.b(b1.g.class), false);
                } catch (IllegalArgumentException unused3) {
                    int i16 = x1.d.f26532a[this.f26393b.ordinal()];
                    if (i16 == 1 || i16 == 2) {
                        lc.y.l(m0Var2, b1.g.INSTANCE);
                    } else {
                        if (i16 != 3) {
                            lc.u0.r();
                            return null;
                        }
                        this.f26395d.invoke();
                    }
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ o0(lc.m0 m0Var, o1 o1Var, e23.a aVar, int i14) {
        this.f26392a = i14;
        this.f26394c = m0Var;
        this.f26393b = o1Var;
        this.f26395d = aVar;
    }
}
