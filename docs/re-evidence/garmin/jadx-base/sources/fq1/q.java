package fq1;

import android.content.Context;
import c22.d2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfq1/q;", "Lfq1/s;", "Lc22/d2;", "onDemandStringInstaller", "<init>", "(Lc22/d2;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2 f73281a;

    public q(d2 d2Var) {
        d2Var.getClass();
        this.f73281a = d2Var;
    }

    @Override // fq1.s
    public final Object b(Context context, t13.d<? super Unit> dVar) {
        Object objC = this.f73281a.c((v13.i) dVar);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
    }
}
