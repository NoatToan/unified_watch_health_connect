package org.acra.scheduler;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.List;
import org.acra.ACRA;
import org.acra.config.CoreConfiguration;
import org.acra.file.ReportLocator;

/* JADX INFO: loaded from: classes23.dex */
public class SchedulerStarter {
    private final ReportLocator a;
    private final SenderScheduler b;

    public SchedulerStarter(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration) {
        this.a = new ReportLocator(context);
        List listLoadEnabled = coreConfiguration.pluginLoader().loadEnabled(coreConfiguration, SenderSchedulerFactory.class);
        if (listLoadEnabled.isEmpty()) {
            this.b = new DefaultSenderScheduler(context, coreConfiguration);
            return;
        }
        SenderScheduler senderSchedulerCreate = ((SenderSchedulerFactory) listLoadEnabled.get(0)).create(context, coreConfiguration);
        this.b = senderSchedulerCreate;
        if (listLoadEnabled.size() > 1) {
            ACRA.log.w(ACRA.LOG_TAG, "More than one SenderScheduler found. Will use only " + senderSchedulerCreate.getClass().getSimpleName());
        }
    }

    public SenderScheduler getSenderScheduler() {
        return this.b;
    }

    public void scheduleReports(@Nullable File file, boolean z) {
        if (file != null) {
            if (ACRA.DEV_LOGGING) {
                ACRA.log.d(ACRA.LOG_TAG, "Mark " + file.getName() + " as approved.");
            }
            File file2 = new File(this.a.getApprovedFolder(), file.getName());
            if (!file.renameTo(file2)) {
                ACRA.log.w(ACRA.LOG_TAG, "Could not rename approved report from " + file + " to " + file2);
            }
        }
        if (ACRA.DEV_LOGGING) {
            ACRA.log.d(ACRA.LOG_TAG, "Schedule report sending");
        }
        this.b.scheduleReportSending(z);
    }
}
