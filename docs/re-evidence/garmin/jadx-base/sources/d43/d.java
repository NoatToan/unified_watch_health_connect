package d43;

import p43.n0;
import p43.v0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends r<Byte> {
    public d(byte b14) {
        super(Byte.valueOf(b14));
    }

    @Override // d43.g
    public final n0 a(t23.c0 c0Var) {
        p005kotlin.reflect.jvm.internal.impl.builtins.d dVarE = c0Var.e();
        dVarE.getClass();
        v0 v0VarT = dVarE.t(q23.h.BYTE);
        if (v0VarT != null) {
            return v0VarT;
        }
        p005kotlin.reflect.jvm.internal.impl.builtins.d.a(57);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d43.g
    public final String toString() {
        return ((Number) this.f57481a).intValue() + ".toByte()";
    }
}
