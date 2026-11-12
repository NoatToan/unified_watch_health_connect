package ca0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class r1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f26441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f26442c;

    public /* synthetic */ r1(lc.m0 m0Var, e23.l lVar, int i14) {
        this.f26440a = i14;
        this.f26441b = m0Var;
        this.f26442c = lVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f26440a) {
            case 0:
                ((p3.i0) obj).getClass();
                v1 v1Var = new v1(this.f26442c, 0);
                lc.m0 m0Var = this.f26441b;
                m0Var.a(v1Var);
                return new y1(m0Var, v1Var);
            default:
                ys.a aVar = (ys.a) obj;
                if (p005kotlin.jvm.internal.s.g(aVar, ys.a.C3724a.f199152a)) {
                    this.f26441b.n();
                } else {
                    this.f26442c.invoke(Boolean.valueOf(p005kotlin.jvm.internal.s.g(aVar, ys.a.f.f199157a)));
                }
                return Unit.INSTANCE;
        }
    }
}
