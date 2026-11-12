package c2;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f22788a = new n0(0, 0, 0, 0);

    public static n0 a(int i14, int i15) {
        if ((i15 & 2) != 0) {
            i14 = 0;
        }
        return new n0(0, i14, 0, 0);
    }

    public static m0 b(float f14, float f15, float f16, float f17, int i14) {
        if ((i14 & 1) != 0) {
            f14 = 0;
            g6.f.a aVar = g6.f.f75994b;
        }
        float f18 = f14;
        if ((i14 & 2) != 0) {
            f15 = 0;
            g6.f.a aVar2 = g6.f.f75994b;
        }
        float f19 = f15;
        if ((i14 & 4) != 0) {
            f16 = 0;
            g6.f.a aVar3 = g6.f.f75994b;
        }
        float f22 = f16;
        if ((i14 & 8) != 0) {
            f17 = 0;
            g6.f.a aVar4 = g6.f.f75994b;
        }
        return new m0(f18, f19, f22, f17, null);
    }

    public static final l1 c(k3 k3Var, p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        return new l1(k3Var, (g6.c) mVar.A(kotlin.t1.f91490h));
    }

    public static final x1 d(k3 k3Var, int i14) {
        return new x1(k3Var, i14, null);
    }
}
