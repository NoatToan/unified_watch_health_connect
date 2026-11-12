package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import defpackage.kvl;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class h1 {
    public static void a(@NotNull Context context, @NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull r0 r0Var) {
        io.sentry.util.p.c(context, "The application context is required.");
        io.sentry.util.p.c(sentryAndroidOptions, "The options object is required.");
        try {
            Bundle bundleB = b(context, sentryAndroidOptions.getLogger(), r0Var);
            ILogger logger = sentryAndroidOptions.getLogger();
            if (bundleB != null) {
                sentryAndroidOptions.setDebug(d(bundleB, logger, "io.sentry.debug", sentryAndroidOptions.isDebug()));
                if (sentryAndroidOptions.isDebug()) {
                    String strName = sentryAndroidOptions.getDiagnosticLevel().name();
                    Locale locale = Locale.ROOT;
                    String strI = i(bundleB, logger, "io.sentry.debug.level", strName.toLowerCase(locale));
                    if (strI != null) {
                        sentryAndroidOptions.setDiagnosticLevel(SentryLevel.valueOf(strI.toUpperCase(locale)));
                    }
                }
                sentryAndroidOptions.setAnrEnabled(d(bundleB, logger, "io.sentry.anr.enable", sentryAndroidOptions.isAnrEnabled()));
                sentryAndroidOptions.setEnableAutoSessionTracking(d(bundleB, logger, "io.sentry.auto-session-tracking.enable", d(bundleB, logger, "io.sentry.session-tracking.enable", sentryAndroidOptions.isEnableAutoSessionTracking())));
                if (sentryAndroidOptions.getSampleRate() == null) {
                    Double dF = f(bundleB, logger, "io.sentry.sample-rate");
                    if (dF.doubleValue() != -1.0d) {
                        sentryAndroidOptions.setSampleRate(dF);
                    }
                }
                sentryAndroidOptions.setAnrReportInDebug(d(bundleB, logger, "io.sentry.anr.report-debug", sentryAndroidOptions.isAnrReportInDebug()));
                sentryAndroidOptions.setAnrTimeoutIntervalMillis(h(bundleB, logger, "io.sentry.anr.timeout-interval-millis", sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                sentryAndroidOptions.setAttachAnrThreadDump(d(bundleB, logger, "io.sentry.anr.attach-thread-dumps", sentryAndroidOptions.isAttachAnrThreadDump()));
                String strI2 = i(bundleB, logger, "io.sentry.dsn", sentryAndroidOptions.getDsn());
                boolean zD = d(bundleB, logger, "io.sentry.enabled", sentryAndroidOptions.isEnabled());
                if (!zD || (strI2 != null && strI2.isEmpty())) {
                    sentryAndroidOptions.getLogger().c(SentryLevel.DEBUG, "Sentry enabled flag set to false or DSN is empty: disabling sentry-android", new Object[0]);
                } else if (strI2 == null) {
                    sentryAndroidOptions.getLogger().c(SentryLevel.FATAL, "DSN is required. Use empty string to disable SDK.", new Object[0]);
                }
                sentryAndroidOptions.setEnabled(zD);
                sentryAndroidOptions.setDsn(strI2);
                sentryAndroidOptions.setEnableNdk(d(bundleB, logger, "io.sentry.ndk.enable", sentryAndroidOptions.isEnableNdk()));
                sentryAndroidOptions.setEnableScopeSync(d(bundleB, logger, "io.sentry.ndk.scope-sync.enable", sentryAndroidOptions.isEnableScopeSync()));
                sentryAndroidOptions.setRelease(i(bundleB, logger, "io.sentry.release", sentryAndroidOptions.getRelease()));
                sentryAndroidOptions.setEnvironment(i(bundleB, logger, "io.sentry.environment", sentryAndroidOptions.getEnvironment()));
                sentryAndroidOptions.setSessionTrackingIntervalMillis(h(bundleB, logger, "io.sentry.session-tracking.timeout-interval-millis", sentryAndroidOptions.getSessionTrackingIntervalMillis()));
                sentryAndroidOptions.setMaxBreadcrumbs((int) h(bundleB, logger, "io.sentry.max-breadcrumbs", sentryAndroidOptions.getMaxBreadcrumbs()));
                sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(d(bundleB, logger, "io.sentry.breadcrumbs.activity-lifecycle", sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(d(bundleB, logger, "io.sentry.breadcrumbs.app-lifecycle", sentryAndroidOptions.isEnableAppLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableSystemEventBreadcrumbs(d(bundleB, logger, "io.sentry.breadcrumbs.system-events", sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
                sentryAndroidOptions.setEnableAppComponentBreadcrumbs(d(bundleB, logger, "io.sentry.breadcrumbs.app-components", sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(d(bundleB, logger, "io.sentry.breadcrumbs.user-interaction", sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
                sentryAndroidOptions.setEnableNetworkEventBreadcrumbs(d(bundleB, logger, "io.sentry.breadcrumbs.network-events", sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
                sentryAndroidOptions.setEnableUncaughtExceptionHandler(d(bundleB, logger, "io.sentry.uncaught-exception-handler.enable", sentryAndroidOptions.isEnableUncaughtExceptionHandler()));
                sentryAndroidOptions.setAttachThreads(d(bundleB, logger, "io.sentry.attach-threads", sentryAndroidOptions.isAttachThreads()));
                sentryAndroidOptions.setAttachScreenshot(d(bundleB, logger, "io.sentry.attach-screenshot", sentryAndroidOptions.isAttachScreenshot()));
                sentryAndroidOptions.setAttachViewHierarchy(d(bundleB, logger, "io.sentry.attach-view-hierarchy", sentryAndroidOptions.isAttachViewHierarchy()));
                sentryAndroidOptions.setSendClientReports(d(bundleB, logger, "io.sentry.send-client-reports", sentryAndroidOptions.isSendClientReports()));
                sentryAndroidOptions.setCollectAdditionalContext(d(bundleB, logger, "io.sentry.additional-context", sentryAndroidOptions.isCollectAdditionalContext()));
                if (sentryAndroidOptions.getEnableTracing() == null) {
                    sentryAndroidOptions.setEnableTracing(e(bundleB, logger, "io.sentry.traces.enable", null));
                }
                if (sentryAndroidOptions.getTracesSampleRate() == null) {
                    Double dF2 = f(bundleB, logger, "io.sentry.traces.sample-rate");
                    if (dF2.doubleValue() != -1.0d) {
                        sentryAndroidOptions.setTracesSampleRate(dF2);
                    }
                }
                sentryAndroidOptions.setTraceSampling(d(bundleB, logger, "io.sentry.traces.trace-sampling", sentryAndroidOptions.isTraceSampling()));
                sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(d(bundleB, logger, "io.sentry.traces.activity.enable", sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
                sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(d(bundleB, logger, "io.sentry.traces.activity.auto-finish.enable", sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
                sentryAndroidOptions.setProfilingEnabled(d(bundleB, logger, "io.sentry.traces.profiling.enable", sentryAndroidOptions.isProfilingEnabled()));
                if (sentryAndroidOptions.getProfilesSampleRate() == null) {
                    Double dF3 = f(bundleB, logger, "io.sentry.traces.profiling.sample-rate");
                    if (dF3.doubleValue() != -1.0d) {
                        sentryAndroidOptions.setProfilesSampleRate(dF3);
                    }
                }
                sentryAndroidOptions.setEnableUserInteractionTracing(d(bundleB, logger, "io.sentry.traces.user-interaction.enable", sentryAndroidOptions.isEnableUserInteractionTracing()));
                sentryAndroidOptions.setEnableTimeToFullDisplayTracing(d(bundleB, logger, "io.sentry.traces.time-to-full-display.enable", sentryAndroidOptions.isEnableTimeToFullDisplayTracing()));
                long jH = h(bundleB, logger, "io.sentry.traces.idle-timeout", -1L);
                if (jH != -1) {
                    sentryAndroidOptions.setIdleTimeout(Long.valueOf(jH));
                }
                List<String> listG = g(bundleB, logger, "io.sentry.traces.trace-propagation-targets");
                if (!bundleB.containsKey("io.sentry.traces.trace-propagation-targets") && (listG == null || listG.isEmpty())) {
                    listG = g(bundleB, logger, "io.sentry.traces.tracing-origins");
                }
                if ((bundleB.containsKey("io.sentry.traces.trace-propagation-targets") || bundleB.containsKey("io.sentry.traces.tracing-origins")) && listG == null) {
                    sentryAndroidOptions.setTracePropagationTargets(Collections.emptyList());
                } else if (listG != null) {
                    sentryAndroidOptions.setTracePropagationTargets(listG);
                }
                sentryAndroidOptions.setEnableFramesTracking(d(bundleB, logger, "io.sentry.traces.frames-tracking", true));
                sentryAndroidOptions.setProguardUuid(i(bundleB, logger, "io.sentry.proguard-uuid", sentryAndroidOptions.getProguardUuid()));
                io.sentry.protocol.n sdkVersion = sentryAndroidOptions.getSdkVersion();
                if (sdkVersion == null) {
                    sdkVersion = new io.sentry.protocol.n("", "");
                }
                sdkVersion.h(j(bundleB, logger, "io.sentry.sdk.name", sdkVersion.e()));
                sdkVersion.j(j(bundleB, logger, "io.sentry.sdk.version", sdkVersion.g()));
                sentryAndroidOptions.setSdkVersion(sdkVersion);
                sentryAndroidOptions.setSendDefaultPii(d(bundleB, logger, "io.sentry.send-default-pii", sentryAndroidOptions.isSendDefaultPii()));
                List<String> listG2 = g(bundleB, logger, "io.sentry.gradle-plugin-integrations");
                if (listG2 != null) {
                    Iterator<String> it = listG2.iterator();
                    while (it.hasNext()) {
                        kvl.c().a(it.next());
                    }
                }
                sentryAndroidOptions.setEnableRootCheck(d(bundleB, logger, "io.sentry.enable-root-check", sentryAndroidOptions.isEnableRootCheck()));
                sentryAndroidOptions.setSendModules(d(bundleB, logger, "io.sentry.send-modules", sentryAndroidOptions.isSendModules()));
                sentryAndroidOptions.setEnablePerformanceV2(d(bundleB, logger, "io.sentry.performance-v2.enable", sentryAndroidOptions.isEnablePerformanceV2()));
                sentryAndroidOptions.setEnableAppStartProfiling(d(bundleB, logger, "io.sentry.profiling.enable-app-start", sentryAndroidOptions.isEnableAppStartProfiling()));
                sentryAndroidOptions.setEnableScopePersistence(d(bundleB, logger, "io.sentry.enable-scope-persistence", sentryAndroidOptions.isEnableScopePersistence()));
                sentryAndroidOptions.setEnableMetrics(d(bundleB, logger, "io.sentry.enable-metrics", sentryAndroidOptions.isEnableMetrics()));
                if (sentryAndroidOptions.getExperimental().a().j() == null) {
                    Double dF4 = f(bundleB, logger, "io.sentry.session-replay.session-sample-rate");
                    if (dF4.doubleValue() != -1.0d) {
                        sentryAndroidOptions.getExperimental().a().s(dF4);
                    }
                }
                if (sentryAndroidOptions.getExperimental().a().g() == null) {
                    Double dF5 = f(bundleB, logger, "io.sentry.session-replay.on-error-sample-rate");
                    if (dF5.doubleValue() != -1.0d) {
                        sentryAndroidOptions.getExperimental().a().r(dF5);
                    }
                }
                sentryAndroidOptions.getExperimental().a().q(d(bundleB, logger, "io.sentry.session-replay.mask-all-text", true));
                sentryAndroidOptions.getExperimental().a().p(d(bundleB, logger, "io.sentry.session-replay.mask-all-images", true));
            }
            sentryAndroidOptions.getLogger().c(SentryLevel.INFO, "Retrieving configuration from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().a(SentryLevel.ERROR, "Failed to read configuration from android manifest metadata.", th);
        }
    }

    @Nullable
    public static Bundle b(@NotNull Context context, @NotNull ILogger iLogger, @Nullable r0 r0Var) throws PackageManager.NameNotFoundException {
        if (r0Var == null) {
            r0Var = new r0(iLogger);
        }
        return u0.b(context, 128L, r0Var).metaData;
    }

    public static boolean c(@NotNull Context context, @NotNull ILogger iLogger) {
        io.sentry.util.p.c(context, "The application context is required.");
        try {
            Bundle bundleB = b(context, iLogger, null);
            if (bundleB != null) {
                return d(bundleB, iLogger, "io.sentry.auto-init", true);
            }
            return true;
        } catch (Throwable th) {
            iLogger.a(SentryLevel.ERROR, "Failed to read auto-init from android manifest metadata.", th);
            return true;
        }
    }

    public static boolean d(@NotNull Bundle bundle, @NotNull ILogger iLogger, @NotNull String str, boolean z) {
        boolean z2 = bundle.getBoolean(str, z);
        iLogger.c(SentryLevel.DEBUG, str + " read: " + z2, new Object[0]);
        return z2;
    }

    @Nullable
    public static Boolean e(@NotNull Bundle bundle, @NotNull ILogger iLogger, @NotNull String str, @Nullable Boolean bool) {
        if (bundle.getSerializable(str) == null) {
            iLogger.c(SentryLevel.DEBUG, str + " used default " + bool, new Object[0]);
            return bool;
        }
        boolean z = bundle.getBoolean(str, bool != null);
        iLogger.c(SentryLevel.DEBUG, str + " read: " + z, new Object[0]);
        return Boolean.valueOf(z);
    }

    @NotNull
    public static Double f(@NotNull Bundle bundle, @NotNull ILogger iLogger, @NotNull String str) {
        Double dValueOf = Double.valueOf(Float.valueOf(bundle.getFloat(str, bundle.getInt(str, -1))).doubleValue());
        iLogger.c(SentryLevel.DEBUG, str + " read: " + dValueOf, new Object[0]);
        return dValueOf;
    }

    @Nullable
    public static List<String> g(@NotNull Bundle bundle, @NotNull ILogger iLogger, @NotNull String str) {
        String string = bundle.getString(str);
        iLogger.c(SentryLevel.DEBUG, str + " read: " + string, new Object[0]);
        if (string != null) {
            return Arrays.asList(string.split(",", -1));
        }
        return null;
    }

    public static long h(@NotNull Bundle bundle, @NotNull ILogger iLogger, @NotNull String str, long j) {
        long j2 = bundle.getInt(str, (int) j);
        iLogger.c(SentryLevel.DEBUG, str + " read: " + j2, new Object[0]);
        return j2;
    }

    @Nullable
    public static String i(@NotNull Bundle bundle, @NotNull ILogger iLogger, @NotNull String str, @Nullable String str2) {
        String string = bundle.getString(str, str2);
        iLogger.c(SentryLevel.DEBUG, str + " read: " + string, new Object[0]);
        return string;
    }

    @NotNull
    public static String j(@NotNull Bundle bundle, @NotNull ILogger iLogger, @NotNull String str, @NotNull String str2) {
        String string = bundle.getString(str, str2);
        iLogger.c(SentryLevel.DEBUG, str + " read: " + string, new Object[0]);
        return string;
    }
}
