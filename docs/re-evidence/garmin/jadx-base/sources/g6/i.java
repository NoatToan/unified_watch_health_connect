package g6;

import o53.f0;

/* JADX INFO: loaded from: classes.dex */
public interface i {
    default float H0(long j8) {
        long jC = q.c(j8);
        r.f76022b.getClass();
        if (!r.b(jC, r.f76023c)) {
            j.b("Only Sp can convert to Px");
        }
        h6.b bVar = h6.b.f82143a;
        float f69051c = getF75992b();
        bVar.getClass();
        if (f69051c < 1.03f) {
            float f69051c2 = getF75992b() * q.d(j8);
            f.a aVar = f.f75994b;
            return f69051c2;
        }
        h6.a aVarA = h6.b.a(getF75992b());
        float fD = q.d(j8);
        if (aVarA == null) {
            float f69051c3 = getF75992b() * fD;
            f.a aVar2 = f.f75994b;
            return f69051c3;
        }
        float fA = aVarA.a(fD);
        f.a aVar3 = f.f75994b;
        return fA;
    }

    default long Y(float f14) {
        h6.b bVar = h6.b.f82143a;
        float f69051c = getF75992b();
        bVar.getClass();
        if (f69051c < 1.03f) {
            return f0.H(f14 / getF75992b(), 4294967296L);
        }
        h6.a aVarA = h6.b.a(getF75992b());
        return f0.H(aVarA != null ? aVarA.b(f14) : f14 / getF75992b(), 4294967296L);
    }

    /* JADX INFO: renamed from: r0 */
    float getF75992b();
}
