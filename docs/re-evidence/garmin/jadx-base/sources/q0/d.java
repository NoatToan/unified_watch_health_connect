package q0;

import androidx.camera.core.e;
import androidx.camera.core.impl.a0;
import androidx.camera.core.impl.c0;
import androidx.camera.core.impl.w;
import androidx.camera.core.impl.y;
import b0.m0;
import v.e0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a<e> {
    public d(int i14, b<e> bVar) {
        super(i14, bVar);
    }

    @Override // q0.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void b(e eVar) throws Exception {
        m0 m0VarA0 = eVar.A0();
        c0 c0Var = m0VarA0 instanceof m0.b ? ((m0.b) m0VarA0).f115491a : null;
        if (c0Var != null && ((c0Var.d() == y.LOCKED_FOCUSED || c0Var.d() == y.PASSIVE_FOCUSED) && c0Var.f() == w.CONVERGED && c0Var.e() == a0.CONVERGED)) {
            super.b(eVar);
        } else {
            ((e0) this.f141970d).getClass();
            eVar.close();
        }
    }
}
