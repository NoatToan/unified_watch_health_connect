package r53;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BO\u0012(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lr53/f;", "T", "Ls53/f;", "Lkotlin/Function2;", "Lq53/t;", "Lt13/d;", "", "", "block", "Lt13/g;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "capacity", "Lq53/a;", "onBufferOverflow", "<init>", "(Le23/p;Lt13/g;ILq53/a;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class f<T> extends s53.f<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.p<q53.t<? super T>, t13.d<? super Unit>, Object> f150594d;

    public /* synthetic */ f(e23.p pVar, t13.g gVar, int i14, q53.a aVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(pVar, (i15 & 2) != 0 ? t13.h.f161748a : gVar, (i15 & 4) != 0 ? -2 : i14, (i15 & 8) != 0 ? q53.a.SUSPEND : aVar);
    }

    @Override // s53.f
    public Object h(q53.t<? super T> tVar, t13.d<? super Unit> dVar) {
        Object objInvoke = this.f150594d.invoke(tVar, dVar);
        return objInvoke == u13.a.COROUTINE_SUSPENDED ? objInvoke : Unit.INSTANCE;
    }

    @Override // s53.f
    public s53.f<T> i(t13.g gVar, int i14, q53.a aVar) {
        return new f(this.f150594d, gVar, i14, aVar);
    }

    @Override // s53.f
    public final String toString() {
        return "block[" + this.f150594d + "] -> " + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(e23.p<? super q53.t<? super T>, ? super t13.d<? super Unit>, ? extends Object> pVar, t13.g gVar, int i14, q53.a aVar) {
        super(gVar, i14, aVar);
        this.f150594d = pVar;
    }
}
