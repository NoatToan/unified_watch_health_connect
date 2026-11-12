package w83;

import j83.m;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public class a extends m<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f183561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f183562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f183563d;

    public a(b bVar, AtomicReference atomicReference, CountDownLatch countDownLatch, AtomicReference atomicReference2) {
        this.f183561b = atomicReference;
        this.f183562c = countDownLatch;
        this.f183563d = atomicReference2;
    }

    @Override // j83.m
    public final void b(Throwable th3) {
        this.f183563d.set(th3);
        this.f183562c.countDown();
    }

    @Override // j83.m
    public final void c(Object obj) {
        this.f183561b.set(obj);
        this.f183562c.countDown();
    }
}
