package androidx.work.multiprocess;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.ForegroundUpdater;
import androidx.work.ProgressUpdater;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;

/* JADX INFO: loaded from: classes4.dex */
public final class RemoteWorkManagerInfo {
    private static volatile RemoteWorkManagerInfo sInstance;
    private static final Object sLock = new Object();
    private final Configuration mConfiguration;
    private final ForegroundUpdater mForegroundUpdater;
    private final ProgressUpdater mProgressUpdater;
    private final TaskExecutor mTaskExecutor;

    public static RemoteWorkManagerInfo getInstance(Context context) {
        if (sInstance == null) {
            synchronized (sLock) {
                if (sInstance == null) {
                    sInstance = new RemoteWorkManagerInfo(context);
                }
            }
        }
        return sInstance;
    }

    public static void clearInstance() {
        synchronized (sLock) {
            sInstance = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private RemoteWorkManagerInfo(Context context) {
        WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance();
        if (workManagerImpl != null) {
            this.mConfiguration = workManagerImpl.getConfiguration();
            this.mTaskExecutor = workManagerImpl.getWorkTaskExecutor();
        } else {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Configuration.Provider) {
                this.mConfiguration = ((Configuration.Provider) applicationContext).getWorkManagerConfiguration();
            } else {
                this.mConfiguration = new Configuration.Builder().setDefaultProcessName(applicationContext.getPackageName()).build();
            }
            this.mTaskExecutor = new WorkManagerTaskExecutor(this.mConfiguration.getTaskExecutor());
        }
        this.mProgressUpdater = new RemoteProgressUpdater();
        this.mForegroundUpdater = new RemoteForegroundUpdater();
    }

    public Configuration getConfiguration() {
        return this.mConfiguration;
    }

    public TaskExecutor getTaskExecutor() {
        return this.mTaskExecutor;
    }

    public ProgressUpdater getProgressUpdater() {
        return this.mProgressUpdater;
    }

    public ForegroundUpdater getForegroundUpdater() {
        return this.mForegroundUpdater;
    }
}
