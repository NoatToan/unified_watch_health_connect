package l0;

/* JADX INFO: loaded from: classes.dex */
public class k implements c<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.concurrent.futures.b.a f107813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p.a f107814b;

    public k(androidx.concurrent.futures.b.a aVar, p.a aVar2) {
        this.f107813a = aVar;
        this.f107814b = aVar2;
    }

    @Override // l0.c
    public final void onFailure(Throwable th3) {
        this.f107813a.d(th3);
    }

    @Override // l0.c
    public final void onSuccess(Object obj) {
        androidx.concurrent.futures.b.a aVar = this.f107813a;
        try {
            aVar.b(this.f107814b.mo330apply(obj));
        } catch (Throwable th3) {
            aVar.d(th3);
        }
    }
}
