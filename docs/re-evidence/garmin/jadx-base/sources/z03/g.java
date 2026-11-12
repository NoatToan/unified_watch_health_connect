package z03;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends q03.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f200766a;

    public g(Throwable th3) {
        this.f200766a = th3;
    }

    @Override // q03.b
    public final void j(q03.d dVar) {
        dVar.a(v03.d.INSTANCE);
        dVar.onError(this.f200766a);
    }
}
