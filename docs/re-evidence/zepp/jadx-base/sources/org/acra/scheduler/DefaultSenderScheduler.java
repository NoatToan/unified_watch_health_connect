package org.acra.scheduler;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import org.acra.config.CoreConfiguration;
import org.acra.sender.JobSenderService;
import org.acra.sender.LegacySenderService;
import org.acra.sender.SendingConductor;
import org.acra.util.BundleWrapper;
import org.acra.util.IOUtils;
import org.acra.util.a;

/* JADX INFO: loaded from: classes23.dex */
public class DefaultSenderScheduler implements SenderScheduler {
    public static final /* synthetic */ boolean c = false;
    private final Context a;
    private final CoreConfiguration b;

    public DefaultSenderScheduler(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration) {
        this.a = context;
        this.b = coreConfiguration;
    }

    public void configureExtras(@NonNull BundleWrapper bundleWrapper) {
    }

    @RequiresApi(api = 21)
    public void configureJob(@NonNull JobInfo.Builder builder) {
        builder.setOverrideDeadline(0L);
    }

    @Override // org.acra.scheduler.SenderScheduler
    public void scheduleReportSending(boolean z) {
        BundleWrapper.Internal internalB = a.b();
        internalB.putString(LegacySenderService.EXTRA_ACRA_CONFIG, IOUtils.serialize(this.b));
        internalB.putBoolean(LegacySenderService.EXTRA_ONLY_SEND_SILENT_REPORTS, z);
        configureExtras(internalB);
        SendingConductor sendingConductor = new SendingConductor(this.a, this.b);
        if (!sendingConductor.getSenderInstances(false).isEmpty()) {
            if (Build.VERSION.SDK_INT >= 22) {
                JobScheduler jobScheduler = (JobScheduler) this.a.getSystemService("jobscheduler");
                JobInfo.Builder extras = new JobInfo.Builder(0, new ComponentName(this.a, (Class<?>) JobSenderService.class)).setExtras(internalB.asPersistableBundle());
                configureJob(extras);
                jobScheduler.schedule(extras.build());
            } else {
                Intent intent = new Intent();
                intent.putExtras(internalB.asBundle());
                intent.setComponent(new ComponentName(this.a, (Class<?>) LegacySenderService.class));
                this.a.startService(intent);
            }
        }
        if (sendingConductor.getSenderInstances(true).isEmpty()) {
            return;
        }
        sendingConductor.sendReports(true, internalB);
    }
}
