package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.huawei.haf.common.security.SecurityConstant;
import com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.manager.service.TrackJobService;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes10.dex */
public class ivm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ivm f38092a;
    private static final Object d = new Object();
    private static volatile PluginSportTrackAdapter e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38094c;
    private JobScheduler f;
    private JobInfo j;
    private int h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f38093b = false;

    private ivm() {
        this.f38094c = false;
        this.f38094c = !CommonUtil.bg();
    }

    public static ivm e() {
        if (f38092a == null || e == null) {
            synchronized (d) {
                if (f38092a == null) {
                    f38092a = new ivm();
                }
                if (e == null) {
                    e = ive.c().a();
                }
            }
        }
        return f38092a;
    }

    public void c(Context context) {
        if (this.f38093b) {
            return;
        }
        LogUtil.a("Track_TrackAliveUtil", "start KeepAlive");
        this.f38093b = true;
        if (e != null) {
            this.h = 0;
            e.startTickTrackDog();
        }
        g(context);
    }

    private void g(Context context) {
        if (CommonUtil.bg()) {
            LogUtil.a("Track_TrackAliveUtil", "emui no need start JobService.");
            return;
        }
        LogUtil.a("Track_TrackAliveUtil", "track jobservice start , mIsForceCircle ", Boolean.valueOf(this.f38094c));
        try {
            if (context == null) {
                LogUtil.j("Track_TrackAliveUtil", "startJobService context is null");
                return;
            }
            JobInfo.Builder requiresDeviceIdle = new JobInfo.Builder(1, new ComponentName(context.getPackageName(), TrackJobService.class.getName())).setRequiredNetworkType(0).setRequiresDeviceIdle(false);
            if (this.f38094c) {
                this.j = requiresDeviceIdle.setOverrideDeadline(25000L).setMinimumLatency(20000L).build();
            } else {
                this.j = requiresDeviceIdle.setPeriodic(5000L).build();
            }
            if (context.getSystemService("jobscheduler") instanceof JobScheduler) {
                this.f = (JobScheduler) context.getSystemService("jobscheduler");
            }
            a();
        } catch (IllegalArgumentException e2) {
            LogUtil.a("Track_TrackAliveUtil", "startJobService ", e2.getMessage());
        }
    }

    public void a() {
        JobScheduler jobScheduler = this.f;
        if (jobScheduler != null) {
            jobScheduler.schedule(this.j);
        }
    }

    public boolean b() {
        return this.f38094c;
    }

    public void b(Context context) {
        if (this.f38093b) {
            LogUtil.a("Track_TrackAliveUtil", "stop KeepAlive");
            a(context);
            this.f38093b = false;
        }
    }

    public void a(Context context) {
        if (context != null) {
            h(context.getApplicationContext());
        }
        if (e != null) {
            e.stopTickTrackDog();
        }
    }

    private void h(Context context) {
        if (context != null) {
            LogUtil.a("Track_TrackAliveUtil", "track jobservice stop");
            Object systemService = context.getSystemService("jobscheduler");
            if (systemService instanceof JobScheduler) {
                ((JobScheduler) systemService).cancel(1);
            }
        }
    }

    public boolean c() {
        return this.f38093b;
    }

    public void d() {
        if (e == null || !this.f38093b) {
            return;
        }
        int i = this.h + 1;
        this.h = i;
        if (i == 20) {
            this.h = 0;
            e.tickTrackDog();
        }
    }

    public static void e(Context context) {
        LogUtil.a("Track_TrackAliveUtil", "restart track");
        if (context == null) {
            LogUtil.j("Track_TrackAliveUtil", "restartTrack context is null");
            return;
        }
        String packageName = context.getPackageName();
        Intent intent = new Intent();
        intent.setPackage(packageName);
        intent.setAction("com.huawei.health.track.broadcast");
        intent.putExtra("command_type", "com.huawei.track.restart");
        context.sendBroadcast(intent, SecurityConstant.f5920a);
    }

    public void a(boolean z) {
        this.f38093b = z;
    }

    public static void d(Context context) {
        if (CommonUtil.bh() || context == null) {
            return;
        }
        new CustomViewDialog.Builder(context).d(View.inflate(context, R.layout.track_crash_dialog, null)).c(R.string.IDS_hwh_motiontrack_track_crash_dialog_confirm, new View.OnClickListener() { // from class: ivm.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).d().show();
    }
}
