package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o00 implements w87 {
    @Override // defpackage.w87
    public h97 a(h97 h97Var, BigInteger bigInteger) {
        int iSignum = bigInteger.signum();
        if (iSignum == 0 || h97Var.t()) {
            return h97Var.i().t();
        }
        h97 h97VarB = b(h97Var, bigInteger.abs());
        if (iSignum <= 0) {
            h97VarB = h97VarB.x();
        }
        return v77.j(h97VarB);
    }

    public abstract h97 b(h97 h97Var, BigInteger bigInteger);
}
