package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.utils.WakeLocks;
import defpackage.ppe;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemAlarmService extends LifecycleService implements d.c {
    public static final String c = ppe.i("SystemAlarmService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f3202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3203b;

    @Override // androidx.work.impl.background.systemalarm.d.c
    public void b() {
        this.f3203b = true;
        ppe.e().a(c, "All commands completed in dispatcher");
        WakeLocks.checkWakeLocks();
        stopSelf();
    }

    public final void e() {
        d dVar = new d(this);
        this.f3202a = dVar;
        dVar.m(this);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        e();
        this.f3203b = false;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f3203b = true;
        this.f3202a.k();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f3203b) {
            ppe.e().f(c, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.f3202a.k();
            e();
            this.f3203b = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f3202a.a(intent, i2);
        return 3;
    }
}
