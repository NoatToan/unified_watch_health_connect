package org.acra.reporter;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import java.util.Map;
import org.acra.ACRA;
import org.acra.ErrorReporter;
import org.acra.builder.LastActivityManager;
import org.acra.builder.ReportBuilder;
import org.acra.builder.ReportExecutor;
import org.acra.config.CoreConfiguration;
import org.acra.data.CrashReportDataFactory;
import org.acra.log.ACRALog;
import org.acra.prefs.SharedPreferencesFactory;
import org.acra.scheduler.SchedulerStarter;
import org.acra.scheduler.SenderScheduler;
import org.acra.startup.StartupProcessorExecutor;
import org.acra.util.ApplicationStartupProcessor;
import org.acra.util.InstanceCreator;
import org.acra.util.ProcessFinisher;

/* JADX INFO: loaded from: classes23.dex */
public class ErrorReporterImpl implements Thread.UncaughtExceptionHandler, SharedPreferences.OnSharedPreferenceChangeListener, ErrorReporter {
    private final boolean a;
    private final Application b;
    private final ReportExecutor c;
    private final Map<String, String> d = new HashMap();
    private final SchedulerStarter e;
    private final Thread.UncaughtExceptionHandler f;

    public ErrorReporterImpl(@NonNull Application application, @NonNull CoreConfiguration coreConfiguration, boolean z, boolean z2, boolean z3) {
        this.b = application;
        this.a = z2;
        CrashReportDataFactory crashReportDataFactory = new CrashReportDataFactory(application, coreConfiguration);
        crashReportDataFactory.collectStartUp();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.f = defaultUncaughtExceptionHandler;
        Thread.setDefaultUncaughtExceptionHandler(this);
        LastActivityManager lastActivityManager = new LastActivityManager(application);
        new InstanceCreator();
        ProcessFinisher processFinisher = new ProcessFinisher(application, coreConfiguration, lastActivityManager);
        SchedulerStarter schedulerStarter = new SchedulerStarter(application, coreConfiguration);
        this.e = schedulerStarter;
        ReportExecutor reportExecutor = new ReportExecutor(application, coreConfiguration, crashReportDataFactory, defaultUncaughtExceptionHandler, processFinisher, schedulerStarter, lastActivityManager);
        this.c = reportExecutor;
        reportExecutor.setEnabled(z);
        if (z3) {
            new StartupProcessorExecutor(application, coreConfiguration, schedulerStarter).processReports(z);
            new ApplicationStartupProcessor(application, coreConfiguration).checkReports();
        }
    }

    @Override // org.acra.ErrorReporter
    public void clearCustomData() {
        this.d.clear();
    }

    @Override // org.acra.ErrorReporter
    @Nullable
    public String getCustomData(@NonNull String str) {
        return this.d.get(str);
    }

    @Override // org.acra.ErrorReporter
    public SenderScheduler getReportScheduler() {
        return this.e.getSenderScheduler();
    }

    @Override // org.acra.ErrorReporter
    public void handleException(@Nullable Throwable th, boolean z) {
        ReportBuilder reportBuilder = new ReportBuilder();
        reportBuilder.exception(th).customData(this.d);
        if (z) {
            reportBuilder.endApplication();
        }
        reportBuilder.build(this.c);
    }

    @Override // org.acra.ErrorReporter
    public void handleSilentException(@Nullable Throwable th) {
        new ReportBuilder().exception(th).customData(this.d).sendSilently().build(this.c);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(@NonNull SharedPreferences sharedPreferences, @Nullable String str) {
        if (ACRA.PREF_DISABLE_ACRA.equals(str) || ACRA.PREF_ENABLE_ACRA.equals(str)) {
            setEnabled(SharedPreferencesFactory.shouldEnableACRA(sharedPreferences));
        }
    }

    @Override // org.acra.ErrorReporter
    public String putCustomData(@NonNull String str, @Nullable String str2) {
        return this.d.put(str, str2);
    }

    @Override // org.acra.ErrorReporter
    @Nullable
    public String removeCustomData(@NonNull String str) {
        return this.d.remove(str);
    }

    @Override // org.acra.ErrorReporter
    public void setEnabled(boolean z) {
        if (!this.a) {
            ACRA.log.w(ACRA.LOG_TAG, "ACRA requires ICS or greater. ACRA is disabled and will NOT catch crashes or send messages.");
            return;
        }
        ACRALog aCRALog = ACRA.log;
        String str = ACRA.LOG_TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("ACRA is ");
        sb.append(z ? Constants.ENABLED : "disabled");
        sb.append(" for ");
        sb.append(this.b.getPackageName());
        aCRALog.i(str, sb.toString());
        this.c.setEnabled(z);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@Nullable Thread thread, @NonNull Throwable th) {
        if (!this.c.isEnabled()) {
            this.c.handReportToDefaultExceptionHandler(thread, th);
            return;
        }
        try {
            ACRALog aCRALog = ACRA.log;
            String str = ACRA.LOG_TAG;
            aCRALog.e(str, "ACRA caught a " + th.getClass().getSimpleName() + " for " + this.b.getPackageName(), th);
            if (ACRA.DEV_LOGGING) {
                ACRA.log.d(str, "Building report");
            }
            new ReportBuilder().uncaughtExceptionThread(thread).exception(th).customData(this.d).endApplication().build(this.c);
        } catch (Exception e) {
            ACRA.log.e(ACRA.LOG_TAG, "ACRA failed to capture the error - handing off to native error reporter", e);
            this.c.handReportToDefaultExceptionHandler(thread, th);
        }
    }

    public void unregister() {
        Thread.setDefaultUncaughtExceptionHandler(this.f);
    }

    @Override // org.acra.ErrorReporter
    public void handleException(@Nullable Throwable th) {
        handleException(th, false);
    }
}
