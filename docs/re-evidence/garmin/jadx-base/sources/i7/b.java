package i7;

/* JADX INFO: loaded from: classes.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f91901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f91902b;

    public b(c cVar, m mVar, int i14) {
        this.f91901a = mVar;
        this.f91902b = i14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f91901a.a(this.f91902b);
    }
}
