package v43;

import p43.g2;
import p43.m1;
import p43.o1;
import p43.t1;
import p43.v1;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends o1 {
    @Override // p43.o1
    public final t1 g(m1 m1Var) {
        m1Var.getClass();
        c43.b bVar = m1Var instanceof c43.b ? (c43.b) m1Var : null;
        if (bVar == null) {
            return null;
        }
        return bVar.getProjection().b() ? new v1(g2.OUT_VARIANCE, bVar.getProjection().getType()) : bVar.getProjection();
    }
}
