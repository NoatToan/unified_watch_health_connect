package sk;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f159538h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HandlerThread f159539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f159540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f159541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pj2.k f159542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f159543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CountDownLatch f159544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f159545g;

    public class a implements FutureCallback<byte[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f159546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ UUID f159547b;

        public a(CountDownLatch countDownLatch, UUID uuid) {
            this.f159546a = countDownLatch;
            this.f159547b = uuid;
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public final void onFailure(Throwable th3) {
            this.f159546a.countDown();
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public final void onSuccess(byte[] bArr) {
            this.f159546a.countDown();
            h.this.f159540b.post(new g(this, bArr));
        }
    }

    public class b implements FutureCallback<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f159549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ UUID f159550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ UUID f159551c;

        public b(CountDownLatch countDownLatch, UUID uuid, UUID uuid2) {
            this.f159549a = countDownLatch;
            this.f159550b = uuid;
            this.f159551c = uuid2;
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public final void onFailure(Throwable th3) {
            this.f159549a.countDown();
            h.this.f159540b.post(new i(this, false));
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public final void onSuccess(Void r14) {
            this.f159549a.countDown();
            h.this.f159540b.post(new i(this, true));
        }
    }

    public h(d dVar, pj2.k kVar) {
        HandlerThread handlerThread = new HandlerThread("ant-ble-callbacks");
        this.f159539a = handlerThread;
        this.f159541c = dVar;
        this.f159542d = kVar;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f159540b = handler;
        this.f159543e = handler;
    }

    public final void a(UUID uuid, UUID uuid2) {
        synchronized (this.f159543e) {
            try {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                this.f159544f = countDownLatch;
                if (this.f159545g) {
                    return;
                }
                long jNanoTime = System.nanoTime() + 30000000000L;
                while (jNanoTime - System.nanoTime() > 0) {
                    Futures.addCallback(this.f159542d.v(uuid, uuid2), new a(countDownLatch, uuid2), MoreExecutors.directExecutor());
                    try {
                        if (countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
                            return;
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void b(UUID uuid, UUID uuid2) {
        synchronized (this.f159543e) {
            try {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                this.f159544f = countDownLatch;
                if (this.f159545g) {
                    return;
                }
                long jNanoTime = System.nanoTime() + 30000000000L;
                while (jNanoTime - System.nanoTime() > 0) {
                    Futures.addCallback(this.f159542d.s(uuid, uuid2, true), new f(this, countDownLatch), MoreExecutors.directExecutor());
                    try {
                        if (countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
                            return;
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void c(UUID uuid, UUID uuid2, byte[] bArr) {
        synchronized (this.f159543e) {
            try {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                this.f159544f = countDownLatch;
                if (this.f159545g) {
                    return;
                }
                long jNanoTime = System.nanoTime() + 30000000000L;
                while (jNanoTime - System.nanoTime() > 0) {
                    Futures.addCallback(this.f159542d.j(uuid, uuid2, bArr), new b(countDownLatch, uuid, uuid2), MoreExecutors.directExecutor());
                    try {
                        if (countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
                            return;
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
