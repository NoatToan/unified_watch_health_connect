package w53;

import o13.q;
import o13.r;
import o53.j;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lw53/a;", "Lq03/d;", "kotlinx-coroutines-rx2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements q03.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j<Unit> f182769a;

    /* JADX WARN: Multi-variable type inference failed */
    public a(j<? super Unit> jVar) {
        this.f182769a = jVar;
    }

    @Override // q03.d
    public final void a(s03.b bVar) {
        this.f182769a.r(new vu1.b(bVar, 11));
    }

    @Override // q03.d
    public final void onComplete() {
        int i14 = q.f128596b;
        this.f182769a.resumeWith(Unit.INSTANCE);
    }

    @Override // q03.d
    public final void onError(Throwable th3) {
        int i14 = q.f128596b;
        this.f182769a.resumeWith(r.a(th3));
    }
}
