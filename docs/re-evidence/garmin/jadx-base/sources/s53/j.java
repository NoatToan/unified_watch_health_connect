package s53;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ls53/j;", "T", "Ls53/i;", "Lr53/i;", "flow", "Lt13/g;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "capacity", "Lq53/a;", "onBufferOverflow", "<init>", "(Lr53/i;Lt13/g;ILq53/a;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j<T> extends i<T, T> {
    public /* synthetic */ j(r53.i iVar, t13.g gVar, int i14, q53.a aVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(iVar, (i15 & 2) != 0 ? t13.h.f161748a : gVar, (i15 & 4) != 0 ? -3 : i14, (i15 & 8) != 0 ? q53.a.SUSPEND : aVar);
    }

    @Override // s53.f
    public final f<T> i(t13.g gVar, int i14, q53.a aVar) {
        return new j(this.f157502d, gVar, i14, aVar);
    }

    @Override // s53.f
    public final r53.i<T> j() {
        return (r53.i<T>) this.f157502d;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // s53.i
    public final Object l(r53.j<? super T> jVar, t13.d<? super Unit> dVar) {
        Object objCollect = this.f157502d.collect((r53.j<? super S>) jVar, dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }

    public j(r53.i<? extends T> iVar, t13.g gVar, int i14, q53.a aVar) {
        super(iVar, gVar, i14, aVar);
    }
}
