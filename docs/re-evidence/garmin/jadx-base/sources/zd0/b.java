package zd0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;
import r53.g2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzd0/b;", "Lzd0/f0;", "<init>", "()V", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e2 f203980a = g2.b(0, 0, null, 7);

    @Override // zd0.f0
    public final Object a(c80.q0 q0Var, v13.c cVar) throws Throwable {
        Object objEmit = this.f203980a.emit(q0Var, cVar);
        return objEmit == u13.a.COROUTINE_SUSPENDED ? objEmit : Unit.INSTANCE;
    }

    @Override // zd0.g0
    /* JADX INFO: renamed from: b, reason: from getter */
    public final e2 getF203980a() {
        return this.f203980a;
    }
}
