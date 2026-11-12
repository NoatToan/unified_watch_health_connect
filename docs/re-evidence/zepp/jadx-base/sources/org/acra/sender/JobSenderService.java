package org.acra.sender;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import org.acra.config.CoreConfiguration;
import org.acra.util.IOUtils;

/* JADX INFO: loaded from: classes23.dex */
@RequiresApi(api = 22)
public class JobSenderService extends JobService {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(CoreConfiguration coreConfiguration, PersistableBundle persistableBundle, JobParameters jobParameters) {
        new SendingConductor(this, coreConfiguration).sendReports(false, org.acra.util.a.e(persistableBundle));
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        final PersistableBundle extras = jobParameters.getExtras();
        final CoreConfiguration coreConfiguration = (CoreConfiguration) IOUtils.deserialize(CoreConfiguration.class, extras.getString(LegacySenderService.EXTRA_ACRA_CONFIG));
        if (coreConfiguration == null) {
            return true;
        }
        new Thread(new Runnable() { // from class: ki4
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b(coreConfiguration, extras, jobParameters);
            }
        }).start();
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
