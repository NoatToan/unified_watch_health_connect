package g1;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r.b f74790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.concurrent.futures.b.a f74791c;

    public /* synthetic */ t(r.b bVar, androidx.concurrent.futures.b.a aVar, int i14) {
        this.f74789a = i14;
        this.f74790b = bVar;
        this.f74791c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f74789a) {
            case 0:
                this.f74791c.b(this.f74790b.f74755b);
                break;
            default:
                final r.b bVar = this.f74790b;
                r rVar = r.this;
                b1.c.a aVar = bVar.f74755b;
                b1.c.a aVar2 = b1.c.a.ACTIVE;
                androidx.concurrent.futures.b.a aVar3 = this.f74791c;
                if (aVar == aVar2) {
                    final ListenableFuture<y> listenableFutureA = rVar.a();
                    l0.j.g(listenableFutureA, aVar3);
                    final int i14 = 0;
                    aVar3.a(new Runnable() { // from class: g1.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i14) {
                                case 0:
                                    ListenableFuture listenableFuture = listenableFutureA;
                                    if (!listenableFuture.cancel(true)) {
                                        k7.h.f(listenableFuture.isDone(), null);
                                        try {
                                            ((y) listenableFuture.get()).cancel();
                                        } catch (InterruptedException | CancellationException | ExecutionException e4) {
                                            String str = r.this.f74727a;
                                            e4.toString();
                                            return;
                                        }
                                    }
                                    break;
                                default:
                                    bVar.f74756c.remove(listenableFutureA);
                                    break;
                            }
                        }
                    }, k0.b.a());
                    bVar.f74756c.add(listenableFutureA);
                    final int i15 = 1;
                    listenableFutureA.addListener(new Runnable() { // from class: g1.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    ListenableFuture listenableFuture = listenableFutureA;
                                    if (!listenableFuture.cancel(true)) {
                                        k7.h.f(listenableFuture.isDone(), null);
                                        try {
                                            ((y) listenableFuture.get()).cancel();
                                        } catch (InterruptedException | CancellationException | ExecutionException e4) {
                                            String str = r.this.f74727a;
                                            e4.toString();
                                            return;
                                        }
                                    }
                                    break;
                                default:
                                    bVar.f74756c.remove(listenableFutureA);
                                    break;
                            }
                        }
                    }, rVar.f74735i);
                } else if (aVar != b1.c.a.INACTIVE) {
                    aVar3.d(new IllegalStateException("Unknown state: " + bVar.f74755b));
                } else {
                    aVar3.d(new IllegalStateException("BufferProvider is not active."));
                }
                break;
        }
    }
}
