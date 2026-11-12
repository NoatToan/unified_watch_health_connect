package lg;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f112151a;

    public c(b bVar) {
        this.f112151a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b.a(this.f112151a);
        } catch (Exception e4) {
            d.i(e4);
        }
    }
}
