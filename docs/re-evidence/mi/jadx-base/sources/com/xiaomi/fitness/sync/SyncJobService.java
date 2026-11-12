package com.xiaomi.fitness.sync;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sync.util.MyAction0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(api = 21)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0002J\b\u0010\u0010\u001a\u00020\u000bH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sync/SyncJobService;", "Landroid/app/job/JobService;", "<init>", "()V", "mParams", "Landroid/app/job/JobParameters;", "mIsOnce", "", "mSyncEngine", "Lcom/xiaomi/fitness/sync/SyncEngine;", "onCreate", "", "onStartJob", "params", "onStopJob", "finishJob", LifecycleConstantKt.ON_DESTROY, "Companion", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SyncJobService extends JobService {

    @NotNull
    private static final String EXRA_IS_ONCE = "isOnce";
    public static final int SYNC_JOB_ID = 9999;

    @NotNull
    public static final String WEATHERTAG = "Wearable.weather";
    private static boolean isSyncServiceScheduled = false;
    public static final long sIntervalMillis = 900000;
    private boolean mIsOnce;

    @Nullable
    private JobParameters mParams;

    @Nullable
    private SyncEngine mSyncEngine;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = SyncJobService.class.getSimpleName();

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/sync/SyncJobService$Companion;", "", "<init>", "()V", "isSyncServiceScheduled", "", "()Z", "setSyncServiceScheduled", "(Z)V", "TAG", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "WEATHERTAG", "sIntervalMillis", "", "SYNC_JOB_ID", "", "scheduleOnce", "", "scheduleRefresh", "schedulePeriodic", "EXRA_IS_ONCE", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isSyncServiceScheduled() {
            return SyncJobService.isSyncServiceScheduled;
        }

        public final void scheduleOnce() {
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt(SyncJobService.EXRA_IS_ONCE, 1);
            Object systemService = ApplicationExtKt.getApplication().getSystemService("jobscheduler");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
            JobScheduler jobScheduler = (JobScheduler) systemService;
            jobScheduler.cancel(9999);
            JobInfo.Builder minimumLatency = new JobInfo.Builder(9999, new ComponentName(ApplicationExtKt.getApplication().getPackageName(), SyncJobService.class.getName())).setMinimumLatency(1L);
            minimumLatency.setExtras(persistableBundle);
            try {
                JobInfo jobInfoBuild = minimumLatency.build();
                if (jobInfoBuild != null) {
                    jobScheduler.schedule(jobInfoBuild);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public final void schedulePeriodic() {
            Object systemService = ApplicationExtKt.getApplication().getSystemService("jobscheduler");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
            JobScheduler jobScheduler = (JobScheduler) systemService;
            jobScheduler.cancel(9999);
            jobScheduler.schedule(new JobInfo.Builder(9999, new ComponentName(ApplicationExtKt.getApplication().getPackageName(), SyncJobService.class.getName())).setPeriodic(900000L).build());
        }

        public final void scheduleRefresh() {
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt(SyncJobService.EXRA_IS_ONCE, 1);
            Object systemService = ApplicationExtKt.getApplication().getSystemService("jobscheduler");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
            JobScheduler jobScheduler = (JobScheduler) systemService;
            jobScheduler.cancel(9999);
            JobInfo.Builder minimumLatency = new JobInfo.Builder(9999, new ComponentName(ApplicationExtKt.getApplication().getPackageName(), SyncJobService.class.getName())).setMinimumLatency(900000L);
            minimumLatency.setExtras(persistableBundle);
            try {
                JobInfo jobInfoBuild = minimumLatency.build();
                if (jobInfoBuild != null) {
                    jobScheduler.schedule(jobInfoBuild);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public final void setSyncServiceScheduled(boolean z) {
            SyncJobService.isSyncServiceScheduled = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishJob() {
        if (this.mIsOnce) {
            INSTANCE.scheduleRefresh();
        }
        jobFinished(this.mParams, false);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        SyncEngine syncEngine = this.mSyncEngine;
        if (syncEngine != null) {
            Intrinsics.checkNotNull(syncEngine);
            syncEngine.destroy();
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(@NotNull JobParameters params) {
        Intrinsics.checkNotNullParameter(params, "params");
        boolean z = false;
        boolean z2 = params.getExtras().getInt(EXRA_IS_ONCE) == 1;
        this.mIsOnce = z2;
        if (z2) {
            isSyncServiceScheduled = true;
        }
        this.mParams = params;
        Logger.i("Wearable.weather", "onStartJob mIsOnce:" + z2);
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        SyncEngine syncEngine = new SyncEngine(applicationContext, z, 2, null);
        this.mSyncEngine = syncEngine;
        syncEngine.syncAll(new MyAction0() { // from class: com.xiaomi.fitness.sync.SyncJobService.onStartJob.1
            @Override // com.xiaomi.fitness.sync.util.MyAction0
            public void call() {
                Logger.i(SyncJobService.TAG + " finishJob", new Object[0]);
                SyncJobService.this.finishJob();
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@NotNull JobParameters params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return false;
    }
}
