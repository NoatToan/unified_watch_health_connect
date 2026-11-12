package defpackage;

import com.google.android.gms.common.Scopes;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.c;
import io.sentry.cache.f;
import io.sentry.config.g;
import io.sentry.d;
import io.sentry.i;
import io.sentry.internal.modules.b;
import io.sentry.internal.modules.e;
import io.sentry.n;
import io.sentry.protocol.p;
import io.sentry.s;
import io.sentry.util.r;
import io.sentry.z;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class cul {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ThreadLocal<ftc> f14750a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static volatile ftc f14751b = vug.a();
    public static volatile boolean c = false;
    public static final Charset d = Charset.forName("UTF-8");
    public static final long e = System.currentTimeMillis();

    public interface a<T extends SentryOptions> {
        void a(@NotNull T t);
    }

    @NotNull
    public static qkp A(@NotNull SentryOptions sentryOptions) {
        owp owpVar = new owp("app.launch", Scopes.PROFILE);
        owpVar.w(true);
        return new z(sentryOptions).b(new m9l(owpVar, null));
    }

    public static void B() {
        o().k();
    }

    @NotNull
    public static wzc C(@NotNull owp owpVar, @NotNull rwp rwpVar) {
        return o().q(owpVar, rwpVar);
    }

    public static void e(@NotNull io.sentry.a aVar) {
        o().m(aVar);
    }

    public static void f(@NotNull io.sentry.a aVar, @Nullable c8c c8cVar) {
        o().o(aVar, c8cVar);
    }

    public static <T extends SentryOptions> void g(a<T> aVar, T t) {
        try {
            aVar.a(t);
        } catch (Throwable th) {
            t.getLogger().a(SentryLevel.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        }
    }

    @NotNull
    public static p h(@NotNull s sVar) {
        return o().r(sVar);
    }

    @NotNull
    public static p i(@NotNull s sVar, @Nullable c8c c8cVar) {
        return o().t(sVar, c8cVar);
    }

    public static synchronized void j() {
        ftc ftcVarO = o();
        f14751b = vug.a();
        f14750a.remove();
        ftcVarO.f(false);
    }

    public static void k(@NotNull hgl hglVar) {
        o().v(hglVar);
    }

    public static void l() {
        o().n();
    }

    public static void m(@NotNull SentryOptions sentryOptions, @NotNull ftc ftcVar) {
        try {
            sentryOptions.getExecutorService().submit(new i(sentryOptions, ftcVar));
        } catch (Throwable th) {
            sentryOptions.getLogger().a(SentryLevel.DEBUG, "Failed to finalize previous session.", th);
        }
    }

    public static void n(long j) {
        o().h(j);
    }

    @ApiStatus.Internal
    @NotNull
    public static ftc o() {
        if (c) {
            return f14751b;
        }
        ThreadLocal<ftc> threadLocal = f14750a;
        ftc ftcVar = threadLocal.get();
        if (ftcVar != null && !(ftcVar instanceof vug)) {
            return ftcVar;
        }
        ftc ftcVarClone = f14751b.m2679clone();
        threadLocal.set(ftcVarClone);
        return ftcVarClone;
    }

    public static void p(@NotNull final SentryOptions sentryOptions, @NotNull dyc dycVar) {
        try {
            dycVar.submit(new Runnable() { // from class: ztl
                @Override // java.lang.Runnable
                public final void run() {
                    cul.v(sentryOptions);
                }
            });
        } catch (Throwable th) {
            sentryOptions.getLogger().a(SentryLevel.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th);
        }
    }

    public static <T extends SentryOptions> void q(@NotNull ech<T> echVar, @NotNull a<T> aVar, boolean z) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        T tB = echVar.b();
        g(aVar, tB);
        r(tB, z);
    }

    public static synchronized void r(@NotNull final SentryOptions sentryOptions, boolean z) {
        try {
            if (t()) {
                sentryOptions.getLogger().c(SentryLevel.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
            }
            if (s(sentryOptions)) {
                try {
                    sentryOptions.getExecutorService().submit(new Runnable() { // from class: ytl
                        @Override // java.lang.Runnable
                        public final void run() {
                            sentryOptions.loadLazyFields();
                        }
                    });
                } catch (RejectedExecutionException e2) {
                    sentryOptions.getLogger().a(SentryLevel.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e2);
                }
                sentryOptions.getLogger().c(SentryLevel.INFO, "GlobalHubMode: '%s'", String.valueOf(z));
                c = z;
                ftc ftcVarO = o();
                f14751b = new d(sentryOptions);
                f14750a.set(f14751b);
                ftcVarO.f(true);
                if (sentryOptions.getExecutorService().isClosed()) {
                    sentryOptions.setExecutorService(new hvl());
                }
                Iterator<ucd> it = sentryOptions.getIntegrations().iterator();
                while (it.hasNext()) {
                    it.next().register(unc.a(), sentryOptions);
                }
                z(sentryOptions);
                m(sentryOptions, unc.a());
                p(sentryOptions, sentryOptions.getExecutorService());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean s(@NotNull SentryOptions sentryOptions) {
        if (sentryOptions.isEnableExternalConfiguration()) {
            sentryOptions.merge(c.g(g.a(), sentryOptions.getLogger()));
        }
        String dsn = sentryOptions.getDsn();
        if (!sentryOptions.isEnabled() || (dsn != null && dsn.isEmpty())) {
            j();
            return false;
        }
        if (dsn == null) {
            throw new IllegalArgumentException("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
        }
        sentryOptions.retrieveParsedDsn();
        ILogger logger = sentryOptions.getLogger();
        if (sentryOptions.isDebug() && (logger instanceof xug)) {
            sentryOptions.setLogger(new fwo());
            logger = sentryOptions.getLogger();
        }
        SentryLevel sentryLevel = SentryLevel.INFO;
        logger.c(sentryLevel, "Initializing SDK with DSN: '%s'", sentryOptions.getDsn());
        String outboxPath = sentryOptions.getOutboxPath();
        if (outboxPath != null) {
            new File(outboxPath).mkdirs();
        } else {
            logger.c(sentryLevel, "No outbox dir path is defined in options.", new Object[0]);
        }
        String cacheDirPath = sentryOptions.getCacheDirPath();
        if (cacheDirPath != null) {
            new File(cacheDirPath).mkdirs();
            if (sentryOptions.getEnvelopeDiskCache() instanceof io.sentry.transport.s) {
                sentryOptions.setEnvelopeDiskCache(f.A(sentryOptions));
            }
        }
        String profilingTracesDirPath = sentryOptions.getProfilingTracesDirPath();
        if (sentryOptions.isProfilingEnabled() && profilingTracesDirPath != null) {
            final File file = new File(profilingTracesDirPath);
            file.mkdirs();
            try {
                sentryOptions.getExecutorService().submit(new Runnable() { // from class: aul
                    @Override // java.lang.Runnable
                    public final void run() {
                        cul.x(file);
                    }
                });
            } catch (RejectedExecutionException e2) {
                sentryOptions.getLogger().a(SentryLevel.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e2);
            }
        }
        b modulesLoader = sentryOptions.getModulesLoader();
        if (!sentryOptions.isSendModules()) {
            sentryOptions.setModulesLoader(e.b());
        } else if (modulesLoader instanceof e) {
            sentryOptions.setModulesLoader(new io.sentry.internal.modules.a(Arrays.asList(new io.sentry.internal.modules.c(sentryOptions.getLogger()), new io.sentry.internal.modules.f(sentryOptions.getLogger())), sentryOptions.getLogger()));
        }
        if (sentryOptions.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            sentryOptions.setDebugMetaLoader(new io.sentry.internal.debugmeta.c(sentryOptions.getLogger()));
        }
        io.sentry.util.c.c(sentryOptions, sentryOptions.getDebugMetaLoader().a());
        if (sentryOptions.getMainThreadChecker() instanceof io.sentry.util.thread.c) {
            sentryOptions.setMainThreadChecker(io.sentry.util.thread.b.b());
        }
        if (sentryOptions.getPerformanceCollectors().isEmpty()) {
            sentryOptions.addPerformanceCollector(new wqd());
        }
        if (sentryOptions.isEnableBackpressureHandling() && r.c()) {
            sentryOptions.setBackpressureMonitor(new io.sentry.backpressure.a(sentryOptions, unc.a()));
            sentryOptions.getBackpressureMonitor().start();
        }
        return true;
    }

    public static boolean t() {
        return o().isEnabled();
    }

    public static boolean u() {
        return o().e();
    }

    public static /* synthetic */ void v(SentryOptions sentryOptions) {
        String cacheDirPathWithoutDsn = sentryOptions.getCacheDirPathWithoutDsn();
        if (cacheDirPathWithoutDsn != null) {
            File file = new File(cacheDirPathWithoutDsn, "app_start_profiling_config");
            try {
                io.sentry.util.e.a(file);
                if (sentryOptions.isEnableAppStartProfiling()) {
                    if (!sentryOptions.isTracingEnabled()) {
                        sentryOptions.getLogger().c(SentryLevel.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                        return;
                    }
                    if (file.createNewFile()) {
                        n nVar = new n(sentryOptions, A(sentryOptions));
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, d));
                            try {
                                sentryOptions.getSerializer().a(nVar, bufferedWriter);
                                bufferedWriter.close();
                                fileOutputStream.close();
                            } catch (Throwable th) {
                                try {
                                    bufferedWriter.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    }
                }
            } catch (Throwable th5) {
                sentryOptions.getLogger().a(SentryLevel.ERROR, "Unable to create app start profiling config file. ", th5);
            }
        }
    }

    public static /* synthetic */ void x(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.lastModified() < e - TimeUnit.MINUTES.toMillis(5L)) {
                io.sentry.util.e.a(file2);
            }
        }
    }

    public static /* synthetic */ void y(SentryOptions sentryOptions) {
        for (lvc lvcVar : sentryOptions.getOptionsObservers()) {
            lvcVar.h(sentryOptions.getRelease());
            lvcVar.e(sentryOptions.getProguardUuid());
            lvcVar.f(sentryOptions.getSdkVersion());
            lvcVar.c(sentryOptions.getDist());
            lvcVar.d(sentryOptions.getEnvironment());
            lvcVar.b(sentryOptions.getTags());
            lvcVar.g(sentryOptions.getExperimental().a().g());
        }
    }

    public static void z(@NotNull final SentryOptions sentryOptions) {
        try {
            sentryOptions.getExecutorService().submit(new Runnable() { // from class: bul
                @Override // java.lang.Runnable
                public final void run() {
                    cul.y(sentryOptions);
                }
            });
        } catch (Throwable th) {
            sentryOptions.getLogger().a(SentryLevel.DEBUG, "Failed to notify options observers.", th);
        }
    }
}
