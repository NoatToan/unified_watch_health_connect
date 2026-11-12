package z0;

import java.util.Objects;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes.dex */
public class z implements l0.c<g1.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f200724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f200725b;

    public z(a0 a0Var, m0 m0Var) {
        this.f200725b = a0Var;
        this.f200724a = m0Var;
    }

    @Override // l0.c
    public final void onFailure(Throwable th3) {
        Objects.toString(th3);
    }

    @Override // l0.c
    public final void onSuccess(g1.i iVar) throws Exception {
        g1.r rVar;
        g1.i iVar2 = iVar;
        Objects.toString(iVar2);
        if (iVar2 == null) {
            return;
        }
        a0 a0Var = this.f200725b;
        ScheduledFuture<?> scheduledFuture = a0Var.Z;
        if (scheduledFuture != null && scheduledFuture.cancel(false) && (rVar = a0Var.D) != null && rVar == iVar2) {
            a0.o(rVar);
        }
        a0Var.f200514b0 = this.f200724a;
        a0Var.u(null);
        a0Var.q(a0Var.n());
    }
}
