package com.xiaomi.push;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.SystemClock;
import com.xiaomi.push.service.XMJobService;

/* JADX INFO: loaded from: classes22.dex */
@TargetApi(21)
public class be implements bc.a {
    public Context a;
    public JobScheduler b;
    private boolean c = false;

    public be(Context context) {
        this.a = context;
        this.b = (JobScheduler) context.getSystemService("jobscheduler");
    }

    @Override // com.xiaomi.push.bc.a
    public void a() {
        this.c = false;
        this.b.cancel(1);
    }

    @Override // com.xiaomi.push.bc.a
    public void a(boolean z) {
        if (z || this.c) {
            long jB = by.b();
            if (z) {
                a();
                jB -= SystemClock.elapsedRealtime() % jB;
            }
            this.c = true;
            b(jB);
        }
    }

    @Override // com.xiaomi.push.bc.a
    /* JADX INFO: renamed from: a */
    public boolean mo3589a() {
        return this.c;
    }

    public void b(long j) {
        JobInfo.Builder builder = new JobInfo.Builder(1, new ComponentName(this.a.getPackageName(), XMJobService.class.getName()));
        builder.setMinimumLatency(j);
        builder.setOverrideDeadline(j);
        builder.setRequiredNetworkType(1);
        builder.setPersisted(false);
        com.xiaomi.channel.commonutils.logger.b.c("schedule Job = " + builder.build().getId() + " in " + j);
        this.b.schedule(builder.build());
    }
}
