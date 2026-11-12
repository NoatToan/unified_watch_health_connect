package i2;

import f5.c0;
import h4.r;
import h5.b0;
import h5.c1;
import h5.k;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li2/h;", "Lh4/r$c;", "Lm5/a;", "Lh5/b0;", "Li2/f;", "responder", "<init>", "(Li2/f;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h extends r.c implements m5.a, b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f87141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f87142b;

    public h(f fVar) {
        this.f87141a = fVar;
    }

    public static final n4.d U1(h hVar, c0 c0Var, e23.a<n4.d> aVar) {
        n4.d dVarInvoke;
        if (hVar.getIsAttached() && hVar.f87142b) {
            c1 c1VarF = k.f(hVar);
            if (!c0Var.isAttached()) {
                c0Var = null;
            }
            if (c0Var != null && (dVarInvoke = aVar.invoke()) != null) {
                return dVarInvoke.o(c1VarF.j0(c0Var, false).i());
            }
        }
        return null;
    }

    @Override // h5.b0
    public final void f(c0 c0Var) {
        this.f87142b = true;
    }

    @Override // h4.r.c
    /* JADX INFO: renamed from: getShouldAutoInvalidate */
    public final boolean getF69013b() {
        return false;
    }

    @Override // m5.a
    public final Object s1(c1 c1Var, m5.b bVar, v13.c cVar) {
        Object objE = o53.c0.e(new g(this, c1Var, bVar, new fk0.a(this, 28, c1Var, bVar), null), cVar);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : Unit.INSTANCE;
    }
}
