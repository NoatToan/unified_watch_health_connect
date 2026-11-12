package q53;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobCancellationException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B-\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lq53/j;", "E", "Lo53/a;", "", "Lq53/i;", "Lt13/g;", "parentContext", "_channel", "", "initParentJob", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "<init>", "(Lt13/g;Lq53/i;ZZ)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class j<E> extends o53.a<Unit> implements i<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i<E> f142997d;

    public j(t13.g gVar, i<E> iVar, boolean z14, boolean z15) {
        super(gVar, z14, z15);
        this.f142997d = iVar;
    }

    @Override // o53.p1
    public final void H(CancellationException cancellationException) {
        this.f142997d.c(cancellationException);
        D(cancellationException);
    }

    @Override // q53.v
    public final Object b(v13.i iVar) {
        Object objB = this.f142997d.b(iVar);
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objB;
    }

    @Override // o53.p1, o53.l1
    public final void c(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(M(), null, this);
        }
        H(cancellationException);
    }

    @Override // q53.w
    public final boolean d() {
        return this.f142997d.d();
    }

    @Override // q53.v
    public final Object g(t13.d<? super E> dVar) {
        return this.f142997d.g(dVar);
    }

    @Override // q53.w
    public final Object h(E e4, t13.d<? super Unit> dVar) {
        return this.f142997d.h(e4, dVar);
    }

    @Override // q53.w
    public final Object i(E e4) {
        return this.f142997d.i(e4);
    }

    @Override // q53.v
    public final k<E> iterator() {
        return this.f142997d.iterator();
    }

    @Override // q53.v
    public final y53.d j() {
        return this.f142997d.j();
    }

    @Override // q53.v
    public final Object k() {
        return this.f142997d.k();
    }

    @Override // q53.w
    public final void m(e23.l<? super Throwable, Unit> lVar) {
        this.f142997d.m(lVar);
    }

    @Override // q53.w
    public final boolean q(Throwable th3) {
        return this.f142997d.q(th3);
    }
}
