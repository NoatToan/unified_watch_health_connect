package d43;

import p43.n0;
import p43.v0;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends g<Float> {
    public m(float f14) {
        super(Float.valueOf(f14));
    }

    @Override // d43.g
    public final n0 a(t23.c0 c0Var) {
        p005kotlin.reflect.jvm.internal.impl.builtins.d dVarE = c0Var.e();
        dVarE.getClass();
        v0 v0VarT = dVarE.t(q23.h.FLOAT);
        if (v0VarT != null) {
            return v0VarT;
        }
        p005kotlin.reflect.jvm.internal.impl.builtins.d.a(61);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d43.g
    public final String toString() {
        return ((Number) this.f57481a).floatValue() + ".toFloat()";
    }
}
