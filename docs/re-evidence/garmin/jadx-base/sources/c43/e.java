package c43;

import p43.n0;
import p43.t1;
import p43.w1;
import p43.x;
import t23.d1;
import t23.h;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f24444c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(w1 w1Var, boolean z14) {
        super(w1Var);
        this.f24444c = z14;
    }

    @Override // p43.x, p43.w1
    public final boolean b() {
        return this.f24444c;
    }

    @Override // p43.x, p43.w1
    public final t1 d(n0 n0Var) {
        t1 t1VarD = this.f135939b.d(n0Var);
        if (t1VarD == null) {
            return null;
        }
        h hVarT = n0Var.F0().t();
        return dh.b.q(t1VarD, hVarT instanceof d1 ? (d1) hVarT : null);
    }
}
