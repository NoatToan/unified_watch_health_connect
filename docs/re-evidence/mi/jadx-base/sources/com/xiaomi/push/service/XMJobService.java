package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import defpackage.cts;
import defpackage.x9s;
import defpackage.zbs;

/* JADX INFO: loaded from: classes11.dex */
public class XMJobService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static Service f14166a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private IBinder f418a = null;

    @TargetApi(21)
    public static class a extends JobService {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Binder f14167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Handler f14168b;

        /* JADX INFO: renamed from: com.xiaomi.push.service.XMJobService$a$a, reason: collision with other inner class name */
        public static class HandlerC0843a extends Handler {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public JobService f14169a;

            public HandlerC0843a(JobService jobService) {
                super(jobService.getMainLooper());
                this.f14169a = jobService;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what != 1) {
                    return;
                }
                JobParameters jobParameters = (JobParameters) message.obj;
                x9s.o("Job finished " + jobParameters.getJobId());
                this.f14169a.jobFinished(jobParameters, false);
                if (jobParameters.getJobId() == 1) {
                    cts.d(false);
                }
            }
        }

        public a(Service service) {
            this.f14167a = null;
            this.f14167a = (Binder) zbs.e(this, "onBind", new Intent());
            zbs.e(this, "attachBaseContext", service);
        }

        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            x9s.o("Job started " + jobParameters.getJobId());
            Intent intent = new Intent(this, (Class<?>) XMPushService.class);
            intent.setAction("com.xiaomi.push.timer");
            intent.setPackage(getPackageName());
            startService(intent);
            if (this.f14168b == null) {
                this.f14168b = new HandlerC0843a(this);
            }
            Handler handler = this.f14168b;
            handler.sendMessage(Message.obtain(handler, 1, jobParameters));
            return true;
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) {
            x9s.o("Job stop " + jobParameters.getJobId());
            return false;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IBinder iBinder = this.f418a;
        return iBinder != null ? iBinder : new Binder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f418a = new a(this).f14167a;
        f14166a = this;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        f14166a = null;
    }
}
