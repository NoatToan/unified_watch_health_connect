package zb0;

import android.util.Pair;

/* JADX INFO: loaded from: classes8.dex */
public class l0 extends j83.n<Pair<Boolean, sd2.f>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i1 f203564e;

    public l0(i1 i1Var) {
        this.f203564e = i1Var;
    }

    @Override // j83.f
    public final void a() {
        this.f203564e.b(n0.f203581e);
    }

    @Override // j83.f
    public final void c(Object obj) {
        Pair pair = (Pair) obj;
        Boolean bool = (Boolean) pair.first;
        sd2.f fVar = (sd2.f) pair.second;
        if (bool.booleanValue()) {
            n0.f203581e.f(fVar.getUnitID(), fVar);
        }
    }

    @Override // j83.f
    public final void onError(Throwable th3) {
        this.f203564e.a();
    }
}
