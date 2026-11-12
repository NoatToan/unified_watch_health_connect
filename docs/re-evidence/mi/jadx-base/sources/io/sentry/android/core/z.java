package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import com.xiaomi.fitness.electronic.scale.widget.banner.EcoBanner;
import defpackage.gv5;
import defpackage.psl;
import defpackage.rx5;
import defpackage.ssl;
import defpackage.tsl;
import defpackage.xzc;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.replay.DefaultReplayBreadcrumbConverter;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import java.io.File;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes2.dex */
public final class z {
    @NotNull
    public static File d(@NotNull Context context) {
        return new File(context.getCacheDir(), "sentry");
    }

    @NotNull
    public static String e(@NotNull PackageInfo packageInfo, @NotNull String str) {
        return packageInfo.packageName + gv5.CONNECT_VALUE_STR + packageInfo.versionName + Marker.ANY_NON_NULL_MARKER + str;
    }

    public static void f(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull Context context, @NotNull r0 r0Var, @NotNull f1 f1Var, @NotNull h hVar) {
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof io.sentry.transport.s)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new io.sentry.android.core.cache.b(sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getConnectionStatusProvider() instanceof io.sentry.h) {
            sentryAndroidOptions.setConnectionStatusProvider(new io.sentry.android.core.internal.util.a(context, sentryAndroidOptions.getLogger(), r0Var));
        }
        sentryAndroidOptions.addEventProcessor(new io.sentry.b(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new x0(context, r0Var, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new l1(sentryAndroidOptions, hVar));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, r0Var));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new i0(context, sentryAndroidOptions, r0Var));
        sentryAndroidOptions.setTransportGate(new e0(sentryAndroidOptions));
        synchronized (AppStartMetrics.n()) {
            try {
                xzc xzcVarF = AppStartMetrics.n().f();
                if (xzcVarF != null) {
                    sentryAndroidOptions.setTransactionProfiler(xzcVarF);
                    AppStartMetrics.n().s(null);
                } else {
                    sentryAndroidOptions.setTransactionProfiler(new d0(context, sentryAndroidOptions, r0Var, (io.sentry.android.core.internal.util.t) io.sentry.util.p.c(sentryAndroidOptions.getFrameMetricsCollector(), "options.getFrameMetricsCollector is required")));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        sentryAndroidOptions.setModulesLoader(new io.sentry.android.core.internal.modules.a(context, sentryAndroidOptions.getLogger()));
        sentryAndroidOptions.setDebugMetaLoader(new io.sentry.android.core.internal.debugmeta.a(context, sentryAndroidOptions.getLogger()));
        boolean zB = f1Var.b("androidx.core.view.ScrollingView", sentryAndroidOptions);
        boolean zB2 = f1Var.b("androidx.compose.ui.node.Owner", sentryAndroidOptions);
        if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new io.sentry.android.core.internal.gestures.a(zB));
            if (zB2 && f1Var.b("io.sentry.compose.gestures.ComposeGestureTargetLocator", sentryAndroidOptions)) {
                arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
            }
            sentryAndroidOptions.setGestureTargetLocators(arrayList);
        }
        if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && zB2 && f1Var.b("io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter", sentryAndroidOptions)) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
            sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
        }
        sentryAndroidOptions.setMainThreadChecker(io.sentry.android.core.internal.util.c.b());
        if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
            sentryAndroidOptions.addPerformanceCollector(new v());
            sentryAndroidOptions.addPerformanceCollector(new s(sentryAndroidOptions.getLogger(), r0Var));
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                sentryAndroidOptions.addPerformanceCollector(new w1(sentryAndroidOptions, (io.sentry.android.core.internal.util.t) io.sentry.util.p.c(sentryAndroidOptions.getFrameMetricsCollector(), "options.getFrameMetricsCollector is required")));
            }
        }
        sentryAndroidOptions.setTransactionPerformanceCollector(new rx5(sentryAndroidOptions));
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            if (sentryAndroidOptions.isEnableScopePersistence()) {
                sentryAndroidOptions.addScopeObserver(new io.sentry.cache.p(sentryAndroidOptions));
            }
            sentryAndroidOptions.addOptionsObserver(new io.sentry.cache.h(sentryAndroidOptions));
        }
    }

    public static void g(@NotNull Context context, @NotNull final SentryAndroidOptions sentryAndroidOptions, @NotNull r0 r0Var, @NotNull f1 f1Var, @NotNull h hVar, boolean z, boolean z2, boolean z3) {
        io.sentry.util.m mVar = new io.sentry.util.m(new io.sentry.util.m.a() { // from class: io.sentry.android.core.w
            @Override // io.sentry.util.m.a
            public final Object a() {
                return z.h(sentryAndroidOptions);
            }
        });
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new ssl(new psl() { // from class: io.sentry.android.core.x
            @Override // defpackage.psl
            public final String a() {
                return sentryAndroidOptions.getCacheDirPath();
            }
        }), mVar));
        sentryAndroidOptions.addIntegration(new NdkIntegration(f1Var.c("io.sentry.android.ndk.SentryNdk", sentryAndroidOptions.getLogger())));
        sentryAndroidOptions.addIntegration(EnvelopeFileObserverIntegration.b());
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new tsl(new psl() { // from class: io.sentry.android.core.y
            @Override // defpackage.psl
            public final String a() {
                return sentryAndroidOptions.getOutboxPath();
            }
        }), mVar));
        sentryAndroidOptions.addIntegration(new AppLifecycleIntegration());
        sentryAndroidOptions.addIntegration(h0.a(context, r0Var));
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryAndroidOptions.addIntegration(new ActivityLifecycleIntegration(application, r0Var, hVar));
            sentryAndroidOptions.addIntegration(new ActivityBreadcrumbsIntegration(application));
            sentryAndroidOptions.addIntegration(new CurrentActivityIntegration(application));
            sentryAndroidOptions.addIntegration(new UserInteractionIntegration(application, f1Var));
            if (z) {
                sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
        } else {
            sentryAndroidOptions.getLogger().c(SentryLevel.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z2) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new NetworkBreadcrumbsIntegration(context, r0Var, sentryAndroidOptions.getLogger()));
        sentryAndroidOptions.addIntegration(new TempSensorBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new PhoneStateBreadcrumbsIntegration(context));
        if (z3) {
            ReplayIntegration replayIntegration = new ReplayIntegration(context, io.sentry.transport.n.b());
            replayIntegration.setBreadcrumbConverter(new DefaultReplayBreadcrumbConverter());
            sentryAndroidOptions.addIntegration(replayIntegration);
            sentryAndroidOptions.setReplayController(replayIntegration);
        }
    }

    public static /* synthetic */ Boolean h(SentryAndroidOptions sentryAndroidOptions) {
        return Boolean.valueOf(io.sentry.android.core.cache.b.V(sentryAndroidOptions));
    }

    public static void k(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull Context context, @NotNull ILogger iLogger, @NotNull r0 r0Var) {
        io.sentry.util.p.c(context, "The context is required.");
        Context contextA = u0.a(context);
        io.sentry.util.p.c(sentryAndroidOptions, "The options object is required.");
        io.sentry.util.p.c(iLogger, "The ILogger object is required.");
        sentryAndroidOptions.setLogger(iLogger);
        sentryAndroidOptions.setDateProvider(new s1());
        sentryAndroidOptions.setFlushTimeoutMillis(EcoBanner.BANNER_CHANGE_TIME);
        sentryAndroidOptions.setFrameMetricsCollector(new io.sentry.android.core.internal.util.t(contextA, iLogger, r0Var));
        h1.a(contextA, sentryAndroidOptions, r0Var);
        sentryAndroidOptions.setCacheDirPath(d(contextA).getAbsolutePath());
        l(sentryAndroidOptions, contextA, r0Var);
    }

    public static void l(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull Context context, @NotNull r0 r0Var) {
        PackageInfo packageInfoK = u0.k(context, sentryAndroidOptions.getLogger(), r0Var);
        if (packageInfoK != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(e(packageInfoK, u0.l(packageInfoK, r0Var)));
            }
            String str = packageInfoK.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId(d1.a(context));
            } catch (RuntimeException e) {
                sentryAndroidOptions.getLogger().a(SentryLevel.ERROR, "Could not generate distinct Id.", e);
            }
        }
    }
}
