package f5;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf5/u0;", "", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u0 implements j2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f69120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f69121b;

    public u0(q0 q0Var, Object obj) {
        this.f69120a = q0Var;
        this.f69121b = obj;
    }

    @Override // f5.j2.a
    public final boolean a(com.google.android.exoplayer2.analytics.q qVar) {
        q0.b bVarB = b();
        p3.f2 f2Var = bVarB != null ? bVarB.f69046f : null;
        if (f2Var == null || f2Var.isComplete()) {
            return true;
        }
        f4.f.f68735e.getClass();
        f4.f fVarA = f4.f.a.a();
        e23.l<Object, Unit> f68793s = fVarA != null ? fVarA.getF68733f() : null;
        f4.f fVarB = f4.f.a.b(fVarA);
        try {
            boolean zA = f2Var.a(qVar);
            f4.f.a.e(fVarA, fVarB, f68793s);
            return zA;
        } catch (Throwable th3) {
            try {
                bVarB.getClass();
                throw th3;
            } catch (Throwable th4) {
                f4.f.a.e(fVarA, fVarB, f68793s);
                throw th4;
            }
        }
    }

    @Override // f5.j2.a
    public final j2.b apply() {
        q0.b bVarB = b();
        q0 q0Var = this.f69120a;
        if (bVarB != null) {
            q0Var.c(bVarB, false);
        }
        return q0Var.f(this.f69121b);
    }

    public final q0.b b() {
        q0 q0Var = this.f69120a;
        h5.e0 e0VarD = q0Var.f69032j.d(this.f69121b);
        if (e0VarD != null) {
            return q0Var.f69028f.d(e0VarD);
        }
        return null;
    }

    @Override // f5.j2.a
    public final void cancel() {
        q0.b bVarB = b();
        if ((bVarB != null ? bVarB.f69046f : null) != null) {
            q0.b(this.f69120a, this.f69121b);
        }
    }

    @Override // f5.j2.a
    public final boolean isComplete() {
        p3.f2 f2Var;
        q0.b bVarB = b();
        if (bVarB == null || (f2Var = bVarB.f69046f) == null) {
            return true;
        }
        return f2Var.isComplete();
    }
}
