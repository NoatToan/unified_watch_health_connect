package h5;

import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lh5/k0;", "Lh5/a;", "Lh5/b;", "alignmentLinesOwner", "<init>", "(Lh5/b;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k0 extends a {
    public k0(b bVar) {
        super(bVar, null);
    }

    @Override // h5.a
    public final long b(c1 c1Var, long j8) {
        m0 m0VarD1 = c1Var.D1();
        m0VarD1.getClass();
        long j14 = m0VarD1.f81890q;
        g6.k.a aVar = g6.k.f76003b;
        return n4.c.j((((long) Float.floatToRawIntBits((int) (j14 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j14 & 4294967295L))) & 4294967295L), j8);
    }

    @Override // h5.a
    public final Map<f5.a, Integer> c(c1 c1Var) {
        m0 m0VarD1 = c1Var.D1();
        m0VarD1.getClass();
        return m0VarD1.Q0().p();
    }

    @Override // h5.a
    public final int d(c1 c1Var, f5.a aVar) {
        m0 m0VarD1 = c1Var.D1();
        m0VarD1.getClass();
        return m0VarD1.E(aVar);
    }
}
