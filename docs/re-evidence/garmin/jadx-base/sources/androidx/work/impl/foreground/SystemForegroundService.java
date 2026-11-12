package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.q0;
import bf.c;
import ca0.j1;
import df.r;
import java.util.UUID;
import ue.a0;
import ue.d;
import ue.u;
import ve.t0;

/* JADX INFO: loaded from: classes7.dex */
public class SystemForegroundService extends q0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f11489e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f11491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NotificationManager f11492d;

    public static class a {
        private a() {
        }

        public static void a(SystemForegroundService systemForegroundService, int i14, Notification notification, int i15) {
            systemForegroundService.startForeground(i14, notification, i15);
        }
    }

    public static class b {
        private b() {
        }

        public static void a(SystemForegroundService systemForegroundService, int i14, Notification notification, int i15) {
            try {
                systemForegroundService.startForeground(i14, notification, i15);
            } catch (ForegroundServiceStartNotAllowedException unused) {
                u uVarA = u.a();
                int i16 = SystemForegroundService.f11489e;
                uVarA.getClass();
            } catch (SecurityException unused2) {
                u uVarA2 = u.a();
                int i17 = SystemForegroundService.f11489e;
                uVarA2.getClass();
            }
        }
    }

    static {
        u.b("SystemFgService");
    }

    public final void a() {
        this.f11492d = (NotificationManager) getApplicationContext().getSystemService("notification");
        c cVar = new c(getApplicationContext());
        this.f11491c = cVar;
        if (cVar.f17789i != null) {
            u.a().getClass();
        } else {
            cVar.f17789i = this;
        }
    }

    @Override // androidx.lifecycle.q0, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.q0, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f11491c.e();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i14, int i15) {
        super.onStartCommand(intent, i14, i15);
        if (this.f11490b) {
            u.a().getClass();
            this.f11491c.e();
            a();
            this.f11490b = false;
        }
        if (intent == null) {
            return 3;
        }
        c cVar = this.f11491c;
        cVar.getClass();
        int i16 = c.f17780j;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            u uVarA = u.a();
            intent.toString();
            uVarA.getClass();
            cVar.f17782b.b(new bf.b(cVar, intent.getStringExtra("KEY_WORKSPEC_ID")));
            cVar.c(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            cVar.c(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            u.a().getClass();
            SystemForegroundService systemForegroundService = cVar.f17789i;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.f11490b = true;
            u.a().getClass();
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf(i15);
            return 3;
        }
        u uVarA2 = u.a();
        intent.toString();
        uVarA2.getClass();
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        t0 t0Var = cVar.f17781a;
        UUID uuidFromString = UUID.fromString(stringExtra);
        t0Var.getClass();
        uuidFromString.getClass();
        d dVar = t0Var.f177605c.f11448n;
        r rVarD = t0Var.f177607e.d();
        rVarD.getClass();
        a0.a(dVar, "CancelWorkById", rVarD, new j1(27, t0Var, uuidFromString));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i14) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.f11491c.f(i14, 2048);
    }

    public final void onTimeout(int i14, int i15) {
        this.f11491c.f(i14, i15);
    }
}
