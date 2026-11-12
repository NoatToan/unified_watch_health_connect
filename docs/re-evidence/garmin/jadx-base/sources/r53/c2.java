package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B1\u0012(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lr53/c2;", "T", "Lr53/a;", "Lkotlin/Function2;", "Lr53/j;", "Lt13/d;", "", "", "block", "<init>", "(Le23/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c2<T> extends a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.p<j<? super T>, t13.d<? super Unit>, Object> f150545a;

    /* JADX WARN: Multi-variable type inference failed */
    public c2(e23.p<? super j<? super T>, ? super t13.d<? super Unit>, ? extends Object> pVar) {
        this.f150545a = pVar;
    }

    @Override // r53.a
    public final Object g(s53.x xVar, a.C2827a c2827a) {
        Object objInvoke = this.f150545a.invoke(xVar, c2827a);
        return objInvoke == u13.a.COROUTINE_SUSPENDED ? objInvoke : Unit.INSTANCE;
    }
}
