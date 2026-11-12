package sk;

/* JADX INFO: loaded from: classes7.dex */
public class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f159558a;

    public k(h hVar, String str) {
        this.f159558a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.C3022a c3022a = this.f159558a.f159541c.f159509c;
        if (c3022a != null) {
            a.this.f159487e = true;
            ok.d.a(a.this.f159484b.f132413a);
        }
        this.f159558a.f159539a.quit();
    }
}
