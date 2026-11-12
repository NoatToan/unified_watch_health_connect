package org.acra.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import org.acra.ACRA;
import org.acra.builder.LastActivityManager;
import org.acra.config.CoreConfiguration;
import org.acra.sender.JobSenderService;
import org.acra.sender.LegacySenderService;
import org.acra.util.ProcessFinisher;

/* JADX INFO: loaded from: classes23.dex */
public final class ProcessFinisher {
    private final Context a;
    private final CoreConfiguration b;
    private final LastActivityManager c;

    public ProcessFinisher(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull LastActivityManager lastActivityManager) {
        this.a = context;
        this.b = coreConfiguration;
        this.c = lastActivityManager;
    }

    private void b() {
        Process.killProcess(Process.myPid());
        System.exit(10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Activity activity) {
        activity.finish();
        if (ACRA.DEV_LOGGING) {
            ACRA.log.d(ACRA.LOG_TAG, "Finished " + activity.getClass());
        }
    }

    private void d() {
        if (this.b.stopServicesOnCrash()) {
            try {
                List<ActivityManager.RunningServiceInfo> runningServices = SystemServices.getActivityManager(this.a).getRunningServices(Integer.MAX_VALUE);
                int iMyPid = Process.myPid();
                for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
                    if (runningServiceInfo.pid == iMyPid && !LegacySenderService.class.getName().equals(runningServiceInfo.service.getClassName()) && !JobSenderService.class.getName().equals(runningServiceInfo.service.getClassName())) {
                        try {
                            Intent intent = new Intent();
                            intent.setComponent(runningServiceInfo.service);
                            this.a.stopService(intent);
                        } catch (SecurityException unused) {
                            if (ACRA.DEV_LOGGING) {
                                ACRA.log.d(ACRA.LOG_TAG, "Unable to stop Service " + runningServiceInfo.service.getClassName() + ". Permission denied");
                            }
                        }
                    }
                }
            } catch (SystemServices.a e) {
                ACRA.log.e(ACRA.LOG_TAG, "Unable to stop services", e);
            }
        }
    }

    public void endApplication() {
        d();
        b();
    }

    public void finishLastActivity(@Nullable Thread thread) {
        if (ACRA.DEV_LOGGING) {
            ACRA.log.d(ACRA.LOG_TAG, "Finishing activities prior to killing the Process");
        }
        boolean z = false;
        for (final Activity activity : this.c.getLastActivities()) {
            boolean z2 = thread == activity.getMainLooper().getThread();
            Runnable runnable = new Runnable() { // from class: u36
                @Override // java.lang.Runnable
                public final void run() {
                    ProcessFinisher.c(activity);
                }
            };
            if (z2) {
                runnable.run();
            } else {
                activity.runOnUiThread(runnable);
                z = true;
            }
        }
        if (z) {
            this.c.waitForAllActivitiesDestroy(100);
        }
        this.c.clearLastActivities();
    }
}
