package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import org.eclipse.californium.elements.util.CounterStatisticManager;
import org.eclipse.californium.scandium.DTLSConnector;
import org.eclipse.californium.scandium.DtlsHealth;
import org.eclipse.californium.scandium.DtlsHealthExtended;
import org.eclipse.californium.scandium.DtlsHealthExtended2;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zzv extends CounterStatisticManager implements DtlsHealth, DtlsHealthExtended, DtlsHealthExtended2 {
    private static final Logger e = aaex.a(DTLSConnector.class.getCanonicalName() + ".health");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zzr f54847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zzr f54848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final zzr.d f54849c;
    private final zzr d;
    private final AtomicInteger f;
    private final zzr g;
    private final zzr h;
    private final zzr i;
    private final zzr j;
    private final zzr k;
    private final zzr l;
    private final zzr m;
    private final zzr n;
    private final zzr o;

    protected void a(String str, StringBuilder sb) {
    }

    public zzv() {
        this("");
    }

    public zzv(String str) {
        super(str);
        this.f = new AtomicInteger();
        zzr.d dVar = new zzr.d();
        this.f54849c = dVar;
        this.f54848b = new zzr("connections", dVar);
        this.m = new zzr("handshakes succeeded", dVar);
        this.j = new zzr("handshakes failed", dVar);
        this.n = new zzr("received records", dVar);
        this.i = new zzr("dropped received records", dVar);
        this.d = new zzr("dropped received mac-errors", dVar);
        this.k = new zzr("sending records", dVar);
        this.g = new zzr("dropped sending records", dVar);
        this.f54847a = new zzr("dropped udp messages", dVar);
        this.l = new zzr("pending in jobs", dVar);
        this.o = new zzr("pending out jobs", dVar);
        this.h = new zzr("pending handshake jobs", dVar);
        a();
    }

    private void a() {
        add(this.f54848b);
        add(this.m);
        add(this.j);
        add(this.n);
        add(this.i);
        add(this.d);
        add(this.k);
        add(this.g);
        add(this.f54847a);
        add(this.l);
        add(this.o);
        add(this.h);
    }

    @Override // org.eclipse.californium.elements.util.CounterStatisticManager
    public void dump() {
        try {
            if (isEnabled()) {
                if (d()) {
                    Logger logger = e;
                    if (logger.isDebugEnabled()) {
                        String strC = zzp.c();
                        String str = "   " + this.tag;
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.tag);
                        sb.append("dtls statistic:");
                        sb.append(strC);
                        sb.append(str);
                        sb.append(this.f54848b);
                        sb.append(strC);
                        sb.append(str);
                        sb.append(this.m);
                        sb.append(strC);
                        sb.append(str);
                        sb.append(this.j);
                        sb.append(strC);
                        sb.append(str);
                        sb.append(this.k);
                        sb.append(strC);
                        sb.append(str);
                        sb.append(this.g);
                        sb.append(strC);
                        sb.append(str);
                        sb.append(this.n);
                        sb.append(strC);
                        sb.append(str);
                        sb.append(this.i);
                        sb.append(strC);
                        sb.append(str);
                        sb.append(this.d);
                        if (this.f54847a.e()) {
                            sb.append(strC);
                            sb.append(str);
                            sb.append(this.f54847a);
                        }
                        sb.append(strC);
                        sb.append(str);
                        sb.append(this.l);
                        sb.append(strC);
                        sb.append(str);
                        sb.append(this.o);
                        sb.append(strC);
                        sb.append(str);
                        sb.append(this.h);
                        a(str, sb);
                        logger.debug("{}", sb);
                    }
                }
                transferCounter();
            }
        } catch (Throwable th) {
            e.error("{}", this.tag, th);
        }
    }

    @Override // org.eclipse.californium.scandium.DtlsHealth
    public void dump(String str, int i, int i2, int i3) {
        try {
            if (isEnabled()) {
                this.f54848b.h();
                long j = i - i2;
                this.f54848b.c(j);
                if (d()) {
                    Logger logger = e;
                    if (logger.isDebugEnabled()) {
                        String strC = zzp.c();
                        String str2 = "   " + str;
                        this.f54849c.c("associations");
                        this.f54849c.c("handshakes pending");
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append("dtls statistic:");
                        sb.append(strC);
                        String strE = zzr.e(this.f54849c.b(), "associations", j);
                        sb.append(str2);
                        sb.append(strE);
                        sb.append(" (");
                        sb.append(i2);
                        sb.append(" remaining capacity).");
                        sb.append(strC);
                        String strE2 = zzr.e(this.f54849c.b(), "handshakes pending", this.f.get());
                        sb.append(str2);
                        sb.append(strE2);
                        sb.append(" (");
                        sb.append(i3);
                        sb.append(" without verify).");
                        sb.append(strC);
                        sb.append(str2);
                        sb.append(this.m);
                        sb.append(strC);
                        sb.append(str2);
                        sb.append(this.j);
                        sb.append(strC);
                        sb.append(str2);
                        sb.append(this.k);
                        sb.append(strC);
                        sb.append(str2);
                        sb.append(this.g);
                        sb.append(strC);
                        sb.append(str2);
                        sb.append(this.n);
                        sb.append(strC);
                        sb.append(str2);
                        sb.append(this.i);
                        sb.append(strC);
                        sb.append(str2);
                        sb.append(this.d);
                        if (this.f54847a.e()) {
                            sb.append(strC);
                            sb.append(str2);
                            sb.append(this.f54847a);
                        }
                        sb.append(strC);
                        sb.append(str2);
                        sb.append(this.l);
                        sb.append(strC);
                        sb.append(str2);
                        sb.append(this.o);
                        sb.append(strC);
                        sb.append(str2);
                        sb.append(this.h);
                        a(str2, sb);
                        logger.debug("{}", sb);
                    }
                }
                transferCounter();
            }
        } catch (Throwable th) {
            e.error("{}", str, th);
        }
    }

    protected boolean d() {
        return this.n.c() || this.k.c();
    }

    @Override // org.eclipse.californium.elements.util.CounterStatisticManager
    public boolean isEnabled() {
        return e.isInfoEnabled();
    }

    @Override // org.eclipse.californium.scandium.DtlsHealth
    public void startHandshake() {
        this.f.incrementAndGet();
    }

    @Override // org.eclipse.californium.scandium.DtlsHealth
    public void endHandshake(boolean z) {
        this.f.decrementAndGet();
        if (z) {
            this.m.b();
        } else {
            this.j.b();
        }
    }

    @Override // org.eclipse.californium.scandium.DtlsHealth
    public void receivingRecord(boolean z) {
        if (z) {
            this.i.b();
        } else {
            this.n.b();
        }
    }

    @Override // org.eclipse.californium.scandium.DtlsHealth
    public void sendingRecord(boolean z) {
        if (z) {
            this.g.b();
        } else {
            this.k.b();
        }
    }

    @Override // org.eclipse.californium.scandium.DtlsHealthExtended2
    public void receivingMacError() {
        this.d.b();
    }

    @Override // org.eclipse.californium.scandium.DtlsHealthExtended
    public void setConnections(int i) {
        this.f54848b.c(i);
    }

    @Override // org.eclipse.californium.scandium.DtlsHealthExtended2
    public void setPendingIncomingJobs(int i) {
        this.l.c(i);
    }

    @Override // org.eclipse.californium.scandium.DtlsHealthExtended2
    public void setPendingOutgoingJobs(int i) {
        this.o.c(i);
    }

    @Override // org.eclipse.californium.scandium.DtlsHealthExtended2
    public void setPendingHandshakeJobs(int i) {
        this.h.c(i);
    }
}
