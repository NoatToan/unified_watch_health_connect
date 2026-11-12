package a3;

import p005kotlin.Unit;
import s1.b2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f642b;

    public /* synthetic */ e0(g0 g0Var, int i14) {
        this.f641a = i14;
        this.f642b = g0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        h3.b bVar;
        int i14 = this.f641a;
        g0 g0Var = this.f642b;
        switch (i14) {
            case 0:
                c1 c1Var = (c1) h5.i.a(g0Var, e1.f643a);
                h3.a aVar = g0Var.f670g;
                if (c1Var == null) {
                    if (aVar != null) {
                        g0Var.V1(aVar);
                    }
                    g0Var.f670g = null;
                } else if (aVar == null) {
                    f0 f0Var = new f0(g0Var);
                    e0 e0Var = new e0(g0Var, 1);
                    a2.i iVar = g0Var.f666c;
                    boolean z14 = g0Var.f667d;
                    float f14 = g0Var.f668e;
                    b2<Float> b2Var = h3.h.f81245a;
                    h3.a aVar2 = new h3.a(iVar, z14, f14, f0Var, e0Var, null);
                    g0Var.U1(aVar2);
                    g0Var.f670g = aVar2;
                }
                return Unit.INSTANCE;
            default:
                c1 c1Var2 = (c1) h5.i.a(g0Var, e1.f643a);
                if (c1Var2 != null && (bVar = c1Var2.f632b) != null) {
                    return bVar;
                }
                d1 d1Var = d1.f636a;
                long j8 = ((o4.d0) h5.i.a(g0Var, x.f872a)).f128833a;
                boolean zC = ((t) h5.i.a(g0Var, u.f849a)).c();
                d1Var.getClass();
                if (zC) {
                    return ((double) o4.f0.i(j8)) > 0.5d ? e1.f645c : e1.f646d;
                }
                return e1.f647e;
        }
    }
}
