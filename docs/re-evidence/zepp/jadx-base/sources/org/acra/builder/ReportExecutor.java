package org.acra.builder;

import android.content.Context;
import android.os.Debug;
import android.os.Looper;
import android.os.StrictMode;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.List;
import org.acra.ACRA;
import org.acra.ACRAConstants;
import org.acra.ReportField;
import org.acra.config.CoreConfiguration;
import org.acra.config.ReportingAdministrator;
import org.acra.data.CrashReportData;
import org.acra.data.CrashReportDataFactory;
import org.acra.file.CrashReportPersister;
import org.acra.file.ReportLocator;
import org.acra.interaction.ReportInteractionExecutor;
import org.acra.log.ACRALog;
import org.acra.scheduler.SchedulerStarter;
import org.acra.util.ProcessFinisher;
import org.acra.util.ToastSender;

/* JADX INFO: loaded from: classes23.dex */
public class ReportExecutor {
    private final Context a;
    private final CoreConfiguration b;
    private final CrashReportDataFactory c;
    private final List<ReportingAdministrator> d;
    private final SchedulerStarter e;
    private final LastActivityManager f;
    private final Thread.UncaughtExceptionHandler g;
    private final ProcessFinisher h;
    private boolean i = false;

    public ReportExecutor(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull CrashReportDataFactory crashReportDataFactory, @Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler, @NonNull ProcessFinisher processFinisher, @NonNull SchedulerStarter schedulerStarter, @NonNull LastActivityManager lastActivityManager) {
        this.a = context;
        this.b = coreConfiguration;
        this.c = crashReportDataFactory;
        this.g = uncaughtExceptionHandler;
        this.h = processFinisher;
        this.d = coreConfiguration.pluginLoader().loadEnabled(coreConfiguration, ReportingAdministrator.class);
        this.e = schedulerStarter;
        this.f = lastActivityManager;
    }

    private void b(@Nullable Thread thread, Throwable th) {
        boolean zAlsoReportToAndroidFramework = this.b.alsoReportToAndroidFramework();
        if (!(thread != null) || !zAlsoReportToAndroidFramework || this.g == null) {
            this.h.endApplication();
            return;
        }
        if (ACRA.DEV_LOGGING) {
            ACRA.log.d(ACRA.LOG_TAG, "Handing Exception on to default ExceptionHandler");
        }
        this.g.uncaughtException(thread, th);
    }

    @NonNull
    private File c(@NonNull CrashReportData crashReportData) {
        String string = crashReportData.getString(ReportField.USER_CRASH_DATE);
        String string2 = crashReportData.getString(ReportField.IS_SILENT);
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append((string2 == null || !Boolean.parseBoolean(string2)) ? "" : ACRAConstants.SILENT_SUFFIX);
        sb.append(ACRAConstants.REPORTFILE_EXTENSION);
        return new File(new ReportLocator(this.a).getUnapprovedFolder(), sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        Looper.prepare();
        ToastSender.sendToast(this.a, "Warning: Acra may behave differently with a debugger attached", 1);
        Looper.loop();
    }

    private void e(@NonNull File file, @NonNull CrashReportData crashReportData) {
        try {
            if (ACRA.DEV_LOGGING) {
                ACRA.log.d(ACRA.LOG_TAG, "Writing crash report file " + file);
            }
            new CrashReportPersister().store(crashReportData, file);
        } catch (Exception e) {
            ACRA.log.e(ACRA.LOG_TAG, "An error occurred while writing the report file...", e);
        }
    }

    private void f(@NonNull File file, boolean z) {
        if (this.i) {
            this.e.scheduleReports(file, z);
        } else {
            ACRA.log.w(ACRA.LOG_TAG, "Would be sending reports, but ACRA is disabled");
        }
    }

    public final void execute(@NonNull ReportBuilder reportBuilder) {
        if (!this.i) {
            ACRA.log.v(ACRA.LOG_TAG, "ACRA is disabled. Report not sent.");
            return;
        }
        CrashReportData crashReportDataCreateCrashData = null;
        ReportingAdministrator reportingAdministrator = null;
        for (ReportingAdministrator reportingAdministrator2 : this.d) {
            try {
                if (!reportingAdministrator2.shouldStartCollecting(this.a, this.b, reportBuilder)) {
                    reportingAdministrator = reportingAdministrator2;
                }
            } catch (Exception e) {
                ACRA.log.w(ACRA.LOG_TAG, "ReportingAdministrator " + reportingAdministrator2.getClass().getName() + " threw exception", e);
            }
        }
        if (reportingAdministrator == null) {
            crashReportDataCreateCrashData = this.c.createCrashData(reportBuilder);
            for (ReportingAdministrator reportingAdministrator3 : this.d) {
                try {
                    if (!reportingAdministrator3.shouldSendReport(this.a, this.b, crashReportDataCreateCrashData)) {
                        reportingAdministrator = reportingAdministrator3;
                    }
                } catch (Exception e2) {
                    ACRA.log.w(ACRA.LOG_TAG, "ReportingAdministrator " + reportingAdministrator3.getClass().getName() + " threw exception", e2);
                }
            }
        } else if (ACRA.DEV_LOGGING) {
            ACRA.log.d(ACRA.LOG_TAG, "Not collecting crash report because of ReportingAdministrator " + reportingAdministrator.getClass().getName());
        }
        boolean z = true;
        if (reportBuilder.isEndApplication()) {
            boolean z2 = true;
            for (ReportingAdministrator reportingAdministrator4 : this.d) {
                try {
                    if (!reportingAdministrator4.shouldFinishActivity(this.a, this.b, this.f)) {
                        z2 = false;
                    }
                } catch (Exception e3) {
                    ACRA.log.w(ACRA.LOG_TAG, "ReportingAdministrator " + reportingAdministrator4.getClass().getName() + " threw exception", e3);
                }
            }
            if (z2) {
                this.h.finishLastActivity(reportBuilder.getUncaughtExceptionThread());
            }
        }
        if (reportingAdministrator == null) {
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
            File fileC = c(crashReportDataCreateCrashData);
            e(fileC, crashReportDataCreateCrashData);
            ReportInteractionExecutor reportInteractionExecutor = new ReportInteractionExecutor(this.a, this.b);
            if (reportBuilder.isSendSilently()) {
                f(fileC, reportInteractionExecutor.hasInteractions());
            } else if (reportInteractionExecutor.performInteractions(fileC)) {
                f(fileC, false);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
        } else {
            if (ACRA.DEV_LOGGING) {
                ACRA.log.d(ACRA.LOG_TAG, "Not sending crash report because of ReportingAdministrator " + reportingAdministrator.getClass().getName());
            }
            try {
                reportingAdministrator.notifyReportDropped(this.a, this.b);
            } catch (Exception e4) {
                ACRA.log.w(ACRA.LOG_TAG, "ReportingAdministrator " + reportingAdministrator.getClass().getName() + " threw exeption", e4);
            }
        }
        if (ACRA.DEV_LOGGING) {
            ACRA.log.d(ACRA.LOG_TAG, "Wait for Interactions + worker ended. Kill Application ? " + reportBuilder.isEndApplication());
        }
        if (reportBuilder.isEndApplication()) {
            for (ReportingAdministrator reportingAdministrator5 : this.d) {
                try {
                    if (!reportingAdministrator5.shouldKillApplication(this.a, this.b, reportBuilder, crashReportDataCreateCrashData)) {
                        z = false;
                    }
                } catch (Exception e5) {
                    ACRA.log.w(ACRA.LOG_TAG, "ReportingAdministrator " + reportingAdministrator5.getClass().getName() + " threw exception", e5);
                }
            }
            if (z) {
                if (!Debug.isDebuggerConnected()) {
                    b(reportBuilder.getUncaughtExceptionThread(), reportBuilder.getException());
                } else {
                    new Thread(new Runnable() { // from class: cc6
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.d();
                        }
                    }).start();
                    ACRA.log.w(ACRA.LOG_TAG, "Warning: Acra may behave differently with a debugger attached");
                }
            }
        }
    }

    public void handReportToDefaultExceptionHandler(@Nullable Thread thread, @NonNull Throwable th) {
        if (this.g != null) {
            ACRA.log.i(ACRA.LOG_TAG, "ACRA is disabled for " + this.a.getPackageName() + " - forwarding uncaught Exception on to default ExceptionHandler");
            this.g.uncaughtException(thread, th);
            return;
        }
        ACRALog aCRALog = ACRA.log;
        String str = ACRA.LOG_TAG;
        aCRALog.e(str, "ACRA is disabled for " + this.a.getPackageName() + " - no default ExceptionHandler");
        ACRA.log.e(str, "ACRA caught a " + th.getClass().getSimpleName() + " for " + this.a.getPackageName(), th);
    }

    public boolean isEnabled() {
        return this.i;
    }

    public void setEnabled(boolean z) {
        this.i = z;
    }
}
