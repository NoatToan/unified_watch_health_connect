package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lr53/m;", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m implements i<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f150728a;

    public m(Object obj) {
        this.f150728a = obj;
    }

    @Override // r53.i
    public final Object collect(j<? super Object> jVar, t13.d<? super Unit> dVar) {
        Object objEmit = jVar.emit(this.f150728a, dVar);
        return objEmit == u13.a.COROUTINE_SUSPENDED ? objEmit : Unit.INSTANCE;
    }
}
