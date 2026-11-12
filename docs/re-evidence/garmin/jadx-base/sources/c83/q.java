package c83;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t13.d<?> f25814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f25815b;

    public q(t13.d<?> dVar, Throwable th3) {
        this.f25814a = dVar;
        this.f25815b = th3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t13.d dVarB = u13.f.b(this.f25814a);
        int i14 = o13.q.f128596b;
        dVarB.resumeWith(o13.r.a(this.f25815b));
    }
}
