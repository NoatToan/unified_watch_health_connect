package com.huawei.openalliance.ad.download.ag;

import android.content.Context;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.hw;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes12.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AppDownloadTask f18471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Timer f18472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f18473c;

    static class a extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AppDownloadTask f18474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f18475b;

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (this.f18475b != null) {
                hw.a("TaskDelTimer", "del task");
                d.a(this.f18475b).b(this.f18474a);
            }
        }

        public a(Context context, AppDownloadTask appDownloadTask) {
            this.f18474a = appDownloadTask;
            this.f18475b = context;
        }
    }

    public void a() {
        if (this.f18472b == null) {
            this.f18472b = new Timer();
        }
        hw.a("TaskDelTimer", "start timer");
        this.f18472b.schedule(new a(this.f18473c, this.f18471a), 2000L);
    }

    public g(Context context, AppDownloadTask appDownloadTask) {
        this.f18471a = appDownloadTask;
        this.f18473c = context.getApplicationContext();
    }
}
