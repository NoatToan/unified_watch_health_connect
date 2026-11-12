package s53;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ls53/i;", "S", "T", "Ls53/f;", "Lr53/i;", "flow", "Lt13/g;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "capacity", "Lq53/a;", "onBufferOverflow", "<init>", "(Lr53/i;Lt13/g;ILq53/a;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class i<S, T> extends f<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r53.i<S> f157502d;

    /* JADX WARN: Multi-variable type inference failed */
    public i(r53.i<? extends S> iVar, t13.g gVar, int i14, q53.a aVar) {
        super(gVar, i14, aVar);
        this.f157502d = iVar;
    }

    @Override // s53.f, r53.i
    public final Object collect(r53.j<? super T> jVar, t13.d<? super Unit> dVar) {
        if (this.f157482b == -3) {
            t13.g f157466b = dVar.getF157466b();
            Boolean bool = Boolean.FALSE;
            o01.e eVar = new o01.e(13);
            t13.g gVar = this.f157481a;
            t13.g gVarPlus = !((Boolean) gVar.fold(bool, eVar)).booleanValue() ? f157466b.plus(gVar) : o53.y.a(f157466b, gVar, false);
            if (p005kotlin.jvm.internal.s.g(gVarPlus, f157466b)) {
                Object objL = l(jVar, dVar);
                return objL == u13.a.COROUTINE_SUSPENDED ? objL : Unit.INSTANCE;
            }
            t13.e.a aVar = t13.e.f161746w0;
            if (p005kotlin.jvm.internal.s.g(gVarPlus.get(aVar), f157466b.get(aVar))) {
                t13.g f157466b2 = dVar.getF157466b();
                if (!(jVar instanceof z) && !(jVar instanceof v)) {
                    jVar = new c0(jVar, f157466b2);
                }
                Object objA = b.a(gVarPlus, jVar, u53.z.b(gVarPlus), new h(this, null), dVar);
                return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
            }
        }
        Object objCollect = super.collect(jVar, dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }

    @Override // s53.f
    public final Object h(q53.t<? super T> tVar, t13.d<? super Unit> dVar) {
        Object objL = l(new z(tVar), dVar);
        return objL == u13.a.COROUTINE_SUSPENDED ? objL : Unit.INSTANCE;
    }

    public abstract Object l(r53.j<? super T> jVar, t13.d<? super Unit> dVar);

    @Override // s53.f
    public final String toString() {
        return this.f157502d + " -> " + super.toString();
    }
}
