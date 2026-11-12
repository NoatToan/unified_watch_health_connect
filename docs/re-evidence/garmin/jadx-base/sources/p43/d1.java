package p43;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d1 extends o1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<m1> f135813c;

    /* JADX WARN: Multi-variable type inference failed */
    public d1(List<? extends m1> list) {
        this.f135813c = list;
    }

    @Override // p43.o1
    public final t1 g(m1 m1Var) {
        m1Var.getClass();
        if (!this.f135813c.contains(m1Var)) {
            return null;
        }
        t23.h hVarT = m1Var.t();
        hVarT.getClass();
        return d2.l((t23.d1) hVarT);
    }
}
