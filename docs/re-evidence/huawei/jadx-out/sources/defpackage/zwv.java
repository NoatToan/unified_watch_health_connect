package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.eclipse.californium.core.network.Exchange;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zwv extends zwn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Logger f54699a = aaex.a((Class<?>) zwv.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile ScheduledFuture<?> f54700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f54701c;
    private final ScheduledExecutorService i;

    public zwv(Exchange exchange, ScheduledExecutorService scheduledExecutorService, long j) {
        super(exchange);
        this.i = scheduledExecutorService;
        this.f54701c = j;
    }

    @Override // org.eclipse.californium.core.coap.MessageObserverAdapter, org.eclipse.californium.core.coap.MessageObserver
    public void onSent(boolean z) {
        if (z) {
            return;
        }
        this.f54700b = this.i.schedule(new Runnable() { // from class: zwv.2
            @Override // java.lang.Runnable
            public void run() {
                zwv.this.d.d(new Runnable() { // from class: zwv.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (zwv.this.d.r() == null) {
                            zwv.this.d.p().setCanceled(true);
                        } else {
                            zwv.this.d.ai();
                        }
                    }
                });
            }
        }, this.f54701c, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.zwn
    protected void c(String str) {
        ScheduledFuture<?> scheduledFuture = this.f54700b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        super.c(str);
    }
}
