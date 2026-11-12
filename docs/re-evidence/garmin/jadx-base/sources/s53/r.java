package s53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Ls53/r;", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r implements r53.i<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.q f157590a;

    public r(e23.q qVar) {
        this.f157590a = qVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super Object> jVar, t13.d<? super Unit> dVar) {
        s sVar = new s(this.f157590a, jVar, null);
        q qVar = new q(dVar.getF157466b(), dVar);
        Object objV = oi0.c.V(qVar, true, qVar, sVar);
        return objV == u13.a.COROUTINE_SUSPENDED ? objV : Unit.INSTANCE;
    }
}
