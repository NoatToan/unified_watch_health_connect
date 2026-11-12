package sk;

/* JADX INFO: loaded from: classes7.dex */
public class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte[] f159536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h.a f159537b;

    public g(h.a aVar, byte[] bArr) {
        this.f159537b = aVar;
        this.f159536a = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h.a aVar = this.f159537b;
        h.this.f159541c.b(aVar.f159547b, this.f159536a);
    }
}
