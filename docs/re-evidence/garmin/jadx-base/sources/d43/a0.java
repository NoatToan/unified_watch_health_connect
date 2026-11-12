package d43;

import p43.n0;
import p43.v0;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends e0<Byte> {
    public a0(byte b14) {
        super(Byte.valueOf(b14));
    }

    @Override // d43.g
    public final n0 a(t23.c0 c0Var) {
        v0 v0VarP;
        t23.e eVarA = t23.u.a(c0Var, kotlin.reflect.jvm.internal.impl.builtins.f.a.T);
        return (eVarA == null || (v0VarP = eVarA.p()) == null) ? r43.l.c(r43.k.B, "UByte") : v0VarP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d43.g
    public final String toString() {
        return ((Number) this.f57481a).intValue() + ".toUByte()";
    }
}
