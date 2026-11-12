package defpackage;

import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.util.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class rx5 implements swp {
    public final boolean f;

    @NotNull
    public final SentryOptions g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Object f33024a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public volatile Timer f33025b = null;

    @NotNull
    public final Map<String, List<sqh>> c = new ConcurrentHashMap();

    @NotNull
    public final AtomicBoolean h = new AtomicBoolean(false);
    public long i = 0;

    @NotNull
    public final List<vvc> d = new ArrayList();

    @NotNull
    public final List<uvc> e = new ArrayList();

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Iterator it = rx5.this.d.iterator();
            while (it.hasNext()) {
                ((vvc) it.next()).c();
            }
        }
    }

    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - rx5.this.i < 10) {
                return;
            }
            rx5.this.i = jCurrentTimeMillis;
            sqh sqhVar = new sqh();
            Iterator it = rx5.this.d.iterator();
            while (it.hasNext()) {
                ((vvc) it.next()).d(sqhVar);
            }
            Iterator it2 = rx5.this.c.values().iterator();
            while (it2.hasNext()) {
                ((List) it2.next()).add(sqhVar);
            }
        }
    }

    public rx5(@NotNull SentryOptions sentryOptions) {
        boolean z = false;
        this.g = (SentryOptions) p.c(sentryOptions, "The options object is required.");
        for (tvc tvcVar : sentryOptions.getPerformanceCollectors()) {
            if (tvcVar instanceof vvc) {
                this.d.add((vvc) tvcVar);
            }
            if (tvcVar instanceof uvc) {
                this.e.add((uvc) tvcVar);
            }
        }
        if (this.d.isEmpty() && this.e.isEmpty()) {
            z = true;
        }
        this.f = z;
    }

    @Override // defpackage.swp
    public void a(@NotNull qyc qycVar) {
        Iterator<uvc> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().a(qycVar);
        }
    }

    @Override // defpackage.swp
    public void b(@NotNull qyc qycVar) {
        Iterator<uvc> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().b(qycVar);
        }
    }

    @Override // defpackage.swp
    public void c(@NotNull final wzc wzcVar) {
        if (this.f) {
            this.g.getLogger().c(SentryLevel.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        Iterator<uvc> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().a(wzcVar);
        }
        if (!this.c.containsKey(wzcVar.i().toString())) {
            this.c.put(wzcVar.i().toString(), new ArrayList());
            try {
                this.g.getExecutorService().a(new Runnable() { // from class: qx5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f31928a.j(wzcVar);
                    }
                }, 30000L);
            } catch (RejectedExecutionException e) {
                this.g.getLogger().a(SentryLevel.ERROR, "Failed to call the executor. Performance collector will not be automatically finished. Did you call Sentry.close()?", e);
            }
        }
        if (this.h.getAndSet(true)) {
            return;
        }
        synchronized (this.f33024a) {
            try {
                if (this.f33025b == null) {
                    this.f33025b = new Timer(true);
                }
                this.f33025b.schedule(new a(), 0L);
                this.f33025b.scheduleAtFixedRate(new b(), 100L, 100L);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.swp
    public void close() {
        this.g.getLogger().c(SentryLevel.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.c.clear();
        Iterator<uvc> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        if (this.h.getAndSet(false)) {
            synchronized (this.f33024a) {
                try {
                    if (this.f33025b != null) {
                        this.f33025b.cancel();
                        this.f33025b = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.swp
    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public List<sqh> j(@NotNull wzc wzcVar) {
        this.g.getLogger().c(SentryLevel.DEBUG, "stop collecting performance info for transactions %s (%s)", wzcVar.getName(), wzcVar.d().k().toString());
        List<sqh> listRemove = this.c.remove(wzcVar.i().toString());
        Iterator<uvc> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().b(wzcVar);
        }
        if (this.c.isEmpty()) {
            close();
        }
        return listRemove;
    }
}
