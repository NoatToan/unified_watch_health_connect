package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.eclipse.californium.core.network.Exchange;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zxa extends zwn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Logger f54714a = aaex.a((Class<?>) zxa.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile ScheduledFuture<?> f54715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f54716c;
    private final ScheduledExecutorService h;

    public zxa(Exchange exchange, ScheduledExecutorService scheduledExecutorService, long j) {
        super(exchange);
        this.h = scheduledExecutorService;
        this.f54716c = j;
        f54714a.debug("no-response observer");
    }

    @Override // org.eclipse.californium.core.coap.MessageObserverAdapter, org.eclipse.californium.core.coap.MessageObserver
    public void onSent(boolean z) {
        f54714a.debug("no-response sent");
        if (z) {
            return;
        }
        this.f54715b = this.h.schedule(new Runnable() { // from class: zxa.2
            @Override // java.lang.Runnable
            public void run() {
                zxa.this.d.d(new Runnable() { // from class: zxa.2.5
                    @Override // java.lang.Runnable
                    public void run() {
                        zxa.f54714a.debug("no-response-timeout");
                        zxa.this.d.p().setTimedOut(true);
                    }
                });
            }
        }, this.f54716c, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.zwn
    protected void c(String str) {
        ScheduledFuture<?> scheduledFuture = this.f54715b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        super.c(str);
    }
}
