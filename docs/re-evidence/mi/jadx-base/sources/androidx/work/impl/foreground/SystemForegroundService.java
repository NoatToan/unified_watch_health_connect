package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import defpackage.ppe;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemForegroundService extends LifecycleService implements androidx.work.impl.foreground.a.b {
    public static final String d = ppe.i("SystemFgService");
    public static SystemForegroundService e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.work.impl.foreground.a f3222b;
    public NotificationManager c;

    @RequiresApi(29)
    public static class a {
        public static void a(Service service, int i, Notification notification, int i2) {
            service.startForeground(i, notification, i2);
        }
    }

    @RequiresApi(31)
    public static class b {
        public static void a(Service service, int i, Notification notification, int i2) {
            try {
                service.startForeground(i, notification, i2);
            } catch (ForegroundServiceStartNotAllowedException e) {
                ppe.e().l(SystemForegroundService.d, "Unable to start foreground service", e);
            } catch (SecurityException e2) {
                ppe.e().l(SystemForegroundService.d, "Unable to start foreground service", e2);
            }
        }
    }

    private void f() {
        this.c = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f3222b = aVar;
        aVar.o(this);
    }

    @Override // androidx.work.impl.foreground.a.b
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void a(int i, Notification notification) {
        this.c.notify(i, notification);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void c(int i, int i2, Notification notification) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            b.a(this, i, notification, i2);
        } else if (i3 >= 29) {
            a.a(this, i, notification, i2);
        } else {
            startForeground(i, notification);
        }
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i) {
        this.c.cancel(i);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        e = this;
        f();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f3222b.l();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f3221a) {
            ppe.e().f(d, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f3222b.l();
            f();
            this.f3221a = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f3222b.m(intent);
        return 3;
    }

    @Override // android.app.Service
    public void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.f3222b.n(i, 2048);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void stop() {
        this.f3221a = true;
        ppe.e().a(d, "Shutting down.");
        stopForeground(true);
        e = null;
        stopSelf();
    }

    public void onTimeout(int i, int i2) {
        this.f3222b.n(i, i2);
    }
}
