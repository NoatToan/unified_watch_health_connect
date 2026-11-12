package org.acra.startup;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.NonNull;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import org.acra.ACRA;
import org.acra.config.CoreConfiguration;
import org.acra.file.CrashReportFileNameParser;
import org.acra.file.ReportLocator;
import org.acra.interaction.ReportInteractionExecutor;
import org.acra.scheduler.SchedulerStarter;

/* JADX INFO: loaded from: classes23.dex */
public class StartupProcessorExecutor {
    private final Context a;
    private final CoreConfiguration b;
    private final ReportLocator c;
    private final SchedulerStarter d;
    private final CrashReportFileNameParser e = new CrashReportFileNameParser();

    public StartupProcessorExecutor(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull SchedulerStarter schedulerStarter) {
        this.a = context;
        this.b = coreConfiguration;
        this.c = new ReportLocator(context);
        this.d = schedulerStarter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Calendar calendar, boolean z) {
        ArrayList<Report> arrayList = new ArrayList();
        for (File file : this.c.getUnapprovedReports()) {
            arrayList.add(new Report(file, false));
        }
        for (File file2 : this.c.getApprovedReports()) {
            arrayList.add(new Report(file2, true));
        }
        Iterator it2 = this.b.pluginLoader().loadEnabled(this.b, StartupProcessor.class).iterator();
        while (it2.hasNext()) {
            ((StartupProcessor) it2.next()).processReports(this.a, this.b, arrayList);
        }
        boolean z2 = false;
        for (Report report : arrayList) {
            if (this.e.getTimestamp(report.getFile().getName()).before(calendar)) {
                if (report.b()) {
                    if (!report.getFile().delete()) {
                        ACRA.log.w(ACRA.LOG_TAG, "Could not delete report " + report.getFile());
                    }
                } else if (report.isApproved()) {
                    z2 = true;
                } else if (report.a() && z) {
                    new ReportInteractionExecutor(this.a, this.b).performInteractions(report.getFile());
                }
            }
        }
        if (z2 && z) {
            this.d.scheduleReports(null, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(final Calendar calendar, final boolean z) {
        new Thread(new Runnable() { // from class: mf7
            @Override // java.lang.Runnable
            public final void run() {
                this.a.c(calendar, z);
            }
        }).start();
    }

    public void processReports(final boolean z) {
        final Calendar calendar = Calendar.getInstance();
        new Handler(this.a.getMainLooper()).post(new Runnable() { // from class: lf7
            @Override // java.lang.Runnable
            public final void run() {
                this.a.d(calendar, z);
            }
        });
    }
}
