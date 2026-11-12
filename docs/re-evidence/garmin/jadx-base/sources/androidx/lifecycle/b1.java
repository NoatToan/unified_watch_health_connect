package androidx.lifecycle;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/b1;", "Lo53/z;", "<init>", "()V", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b1 extends o53.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f7839a = new p();

    @Override // o53.z
    public final void dispatch(t13.g gVar, Runnable runnable) {
        gVar.getClass();
        runnable.getClass();
        p pVar = this.f7839a;
        pVar.getClass();
        x53.c cVar = o53.s0.f129406a;
        o53.t1 t1VarH = u53.o.f168762a.H();
        if (t1VarH.isDispatchNeeded(gVar) || pVar.f7984b || !pVar.f7983a) {
            t1VarH.dispatch(gVar, new ab.j(10, pVar, runnable));
        } else if (pVar.f7986d.offer(runnable)) {
            pVar.a();
        } else {
            vb.h.z("cannot enqueue any more runnables");
        }
    }

    @Override // o53.z
    public final boolean isDispatchNeeded(t13.g gVar) {
        gVar.getClass();
        x53.c cVar = o53.s0.f129406a;
        if (u53.o.f168762a.H().isDispatchNeeded(gVar)) {
            return true;
        }
        p pVar = this.f7839a;
        return !(pVar.f7984b || !pVar.f7983a);
    }
}
