package w53;

import o13.q;
import o13.r;
import o53.j;
import p005kotlin.Metadata;
import q03.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lw53/b;", "Lq03/t;", "kotlinx-coroutines-rx2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements t<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j<Object> f182770a;

    public b(j<Object> jVar) {
        this.f182770a = jVar;
    }

    @Override // q03.t
    public final void a(s03.b bVar) {
        this.f182770a.r(new vu1.b(bVar, 11));
    }

    @Override // q03.t
    public final void onError(Throwable th3) {
        int i14 = q.f128596b;
        this.f182770a.resumeWith(r.a(th3));
    }

    @Override // q03.t
    public final void onSuccess(Object obj) {
        int i14 = q.f128596b;
        this.f182770a.resumeWith(obj);
    }
}
