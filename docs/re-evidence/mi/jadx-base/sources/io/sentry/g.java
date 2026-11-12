package io.sentry;

import defpackage.dyc;
import defpackage.evg;
import defpackage.iul;
import defpackage.ztc;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class g implements ztc, Runnable, Closeable {
    public static final Charset j = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ILogger f21712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final io.sentry.metrics.c f21713b;

    @NotNull
    public final iul c;

    @NotNull
    public volatile dyc d;
    public volatile boolean e;
    public volatile boolean f;

    @NotNull
    public final NavigableMap<Long, Map<String, io.sentry.metrics.e>> g;

    @NotNull
    public final AtomicInteger h;
    public final int i;

    /* JADX WARN: Illegal instructions before constructor call */
    public g(@NotNull SentryOptions sentryOptions, @NotNull io.sentry.metrics.c cVar) {
        ILogger logger = sentryOptions.getLogger();
        iul dateProvider = sentryOptions.getDateProvider();
        sentryOptions.getBeforeEmitMetricCallback();
        this(cVar, logger, dateProvider, 100000, null, evg.e());
    }

    public static int b(@NotNull Map<String, io.sentry.metrics.e> map) {
        Iterator<io.sentry.metrics.e> it = map.values().iterator();
        int iE = 0;
        while (it.hasNext()) {
            iE += it.next().e();
        }
        return iE;
    }

    public void a(boolean z) {
        if (!z && d()) {
            this.f21712a.c(SentryLevel.INFO, "Metrics: total weight exceeded, flushing all buckets", new Object[0]);
            z = true;
        }
        this.f = false;
        Set<Long> setC = c(z);
        if (setC.isEmpty()) {
            this.f21712a.c(SentryLevel.DEBUG, "Metrics: nothing to flush", new Object[0]);
            return;
        }
        this.f21712a.c(SentryLevel.DEBUG, "Metrics: flushing " + setC.size() + " buckets", new Object[0]);
        HashMap map = new HashMap();
        int size = 0;
        for (Long l : setC) {
            l.longValue();
            Map<String, io.sentry.metrics.e> mapRemove = this.g.remove(l);
            if (mapRemove != null) {
                synchronized (mapRemove) {
                    this.h.addAndGet(-b(mapRemove));
                    size += mapRemove.size();
                    map.put(l, mapRemove);
                }
            }
        }
        if (size == 0) {
            this.f21712a.c(SentryLevel.DEBUG, "Metrics: only empty buckets found", new Object[0]);
        } else {
            this.f21712a.c(SentryLevel.DEBUG, "Metrics: capturing metrics", new Object[0]);
            this.f21713b.i(new io.sentry.metrics.a(map));
        }
    }

    @NotNull
    public final Set<Long> c(boolean z) {
        if (z) {
            return this.g.keySet();
        }
        return this.g.headMap(Long.valueOf(io.sentry.metrics.g.c(io.sentry.metrics.g.b(l()))), true).keySet();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this) {
            this.e = true;
            this.d.b(0L);
        }
        a(true);
    }

    public final boolean d() {
        return this.g.size() + this.h.get() >= this.i;
    }

    public final long l() {
        return TimeUnit.NANOSECONDS.toMillis(this.c.now().h());
    }

    @Override // java.lang.Runnable
    public void run() {
        a(false);
        synchronized (this) {
            try {
                if (!this.e && !this.g.isEmpty()) {
                    this.d.a(this, 5000L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @TestOnly
    public g(@NotNull io.sentry.metrics.c cVar, @NotNull ILogger iLogger, @NotNull iul iulVar, int i, @Nullable SentryOptions.b bVar, @NotNull dyc dycVar) {
        this.e = false;
        this.f = false;
        this.g = new ConcurrentSkipListMap();
        this.h = new AtomicInteger();
        this.f21713b = cVar;
        this.f21712a = iLogger;
        this.c = iulVar;
        this.i = i;
        this.d = dycVar;
    }
}
