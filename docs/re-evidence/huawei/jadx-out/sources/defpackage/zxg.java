package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.eclipse.californium.elements.util.CounterStatisticManager;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zxg extends CounterStatisticManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f54727a = aaex.a((Class<?>) zxg.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zzr f54728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zzr f54729c;
    private final zzr d;
    private final zzr e;

    public zxg(String str, int i, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        super(str, i, timeUnit, scheduledExecutorService);
        this.d = new zzr("sent-requests", this.align);
        this.e = new zzr("queue-requests", this.align);
        this.f54728b = new zzr("dequeue-requests", this.align);
        this.f54729c = new zzr("recv-responses", this.align);
        d();
    }

    private void d() {
        add(this.d);
        add(this.e);
        add(this.f54729c);
    }

    @Override // org.eclipse.californium.elements.util.CounterStatisticManager
    public boolean isEnabled() {
        return f54727a.isInfoEnabled();
    }

    @Override // org.eclipse.californium.elements.util.CounterStatisticManager
    public void dump() {
        try {
            if (isEnabled()) {
                Logger logger = f54727a;
                if (logger.isDebugEnabled() && (this.f54729c.c() || this.d.c() || this.e.c())) {
                    String strC = zzp.c();
                    String str = "   " + this.tag;
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.tag);
                    sb.append("congestion statistic:");
                    sb.append(strC);
                    sb.append(str);
                    sb.append(this.d);
                    sb.append(strC);
                    sb.append(str);
                    sb.append(this.e);
                    sb.append(strC);
                    sb.append(str);
                    sb.append(this.f54728b);
                    sb.append(strC);
                    sb.append(str);
                    sb.append(this.f54729c);
                    sb.append(strC);
                    logger.debug("{}", sb);
                }
                transferCounter();
            }
        } catch (Throwable th) {
            f54727a.error("{}", this.tag, th);
        }
    }

    public void e() {
        this.d.b();
    }

    public void c() {
        this.e.b();
    }

    public void a() {
        this.f54728b.b();
    }

    public void b(zvf zvfVar) {
        if (zvfVar.isDuplicate()) {
            return;
        }
        this.f54729c.b();
    }
}
