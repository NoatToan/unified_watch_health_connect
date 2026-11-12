package pk;

import bk.l;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes7.dex */
public class a extends ok.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f138169p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CountDownLatch f138170q = new CountDownLatch(1);

    @Override // ok.e
    public final void a(l lVar, dk.a aVar) {
    }

    @Override // ok.e
    public final void c() {
        try {
            u();
            this.f138169p = false;
        } catch (InterruptedException unused) {
            int i14 = qk.b.f145071a;
            this.f138169p = true;
            Thread.currentThread().interrupt();
        }
        this.f138170q.countDown();
    }

    @Override // ok.e
    public final String f() {
        return "Channel cleanup";
    }

    @Override // ok.a, ok.e
    public final void i() {
    }

    @Override // ok.e
    public final void n() {
    }
}
