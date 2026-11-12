package li;

import e23.l;
import java.util.concurrent.CancellationException;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q53.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lli/b;", "E", "Lq53/i;", "wrapped", "<init>", "(Lq53/i;)V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class b<E> implements q53.i<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q53.i<E> f112562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public pi.b f112563b;

    public b(q53.i<E> iVar) {
        iVar.getClass();
        this.f112562a = iVar;
    }

    @Override // q53.v
    public final Object b(v13.i iVar) {
        Object objB = this.f112562a.b(iVar);
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objB;
    }

    @Override // q53.v
    public final void c(CancellationException cancellationException) {
        this.f112562a.c(cancellationException);
    }

    @Override // q53.w
    public final boolean d() {
        return this.f112562a.d();
    }

    @Override // q53.v
    public final Object g(t13.d<? super E> dVar) {
        return this.f112562a.g(dVar);
    }

    @Override // q53.w
    public final Object h(E e4, t13.d<? super Unit> dVar) {
        return this.f112562a.h(e4, dVar);
    }

    @Override // q53.w
    public final Object i(E e4) {
        return this.f112562a.i(e4);
    }

    @Override // q53.v
    public final k<E> iterator() {
        return this.f112562a.iterator();
    }

    @Override // q53.v
    public final y53.d j() {
        return this.f112562a.j();
    }

    @Override // q53.v
    public final Object k() {
        return this.f112562a.k();
    }

    @Override // q53.w
    public final void m(l<? super Throwable, Unit> lVar) {
        this.f112562a.m(lVar);
    }

    @Override // q53.w
    public final boolean q(Throwable th3) {
        pi.b bVar;
        boolean zQ = this.f112562a.q(th3);
        if (zQ && (bVar = this.f112563b) != null) {
            bVar.invoke(th3);
        }
        this.f112563b = null;
        return zQ;
    }
}
