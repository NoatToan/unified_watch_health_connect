package com.garmin.android.livesessionview.service;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import g8.i;
import o53.s0;
import of2.b;
import of2.b0;
import of2.c0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r53.p2;
import r53.q2;
import u53.d;
import vb.h;
import zg2.c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/livesessionview/service/LiveActivitySessionService;", "Landroid/app/Service;", "<init>", "()V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LiveActivitySessionService extends Service {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f50577e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f50578a = (c0) KoinJavaComponent.get$default(c0.class, null, null, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eg2.a f50579b = (eg2.a) KoinJavaComponent.get$default(eg2.a.class, null, null, 6, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f50580c = o53.c0.a(s0.f129406a.plus(i.c()));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f50581d = q2.a(null);

    public final void a() {
        p2 p2Var;
        c.f204692a.getClass();
        c.a("LiveActivitySessionService", "Starting foreground");
        b bVar = (b) this.f50578a.f131778g.getValue();
        b0 b0Var = (bVar == null || (p2Var = bVar.f131736o) == null) ? null : (b0) p2Var.getValue();
        if (b0Var == null) {
            c.b("LiveActivitySessionService", "No active session data found, stopping service");
            h.z("No active session data found");
            return;
        }
        Notification notificationA = this.f50579b.a(this, new eg2.b(eg2.c.ACTIVITY_STARTED, b0Var.f131745b.getF172494b(), b0Var.f131747d, 0L, null));
        if (Build.VERSION.SDK_INT >= 29) {
            startForeground(19871, notificationA, 16);
        } else {
            startForeground(19871, notificationA);
        }
        c.a("LiveActivitySessionService", "In foreground");
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        c.f204692a.getClass();
        c.a("LiveActivitySessionService", "onDestroy");
        c.a("LiveActivitySessionService", "Stopping foreground");
        stopForeground(1);
        o53.c0.c(this.f50580c, null);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i14, int i15) {
        c.f204692a.getClass();
        c.a("LiveActivitySessionService", "onStartCommand");
        try {
            a();
            gg2.b bVar = new gg2.b(this, null);
            d dVar = this.f50580c;
            ge1.b.T(dVar, null, null, bVar, 3);
            ge1.b.T(dVar, null, null, new gg2.a(this, null), 3);
            return 1;
        } catch (Exception e4) {
            c cVar = c.f204692a;
            String str = "Failed to start foreground: " + e4.getMessage();
            cVar.getClass();
            c.b("LiveActivitySessionService", str);
            stopSelf();
            return 2;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/livesessionview/service/LiveActivitySessionService$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "NOTIFICATION_ID", "I", "MILLIS_PER_SECOND", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
