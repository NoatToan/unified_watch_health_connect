package com.xiaomi.ai.android.core;

import com.xiaomi.ai.android.capability.ConnectionCapability;
import com.xiaomi.ai.api.Sys;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Event;
import com.xiaomi.ai.api.common.Instruction;
import defpackage.wpe;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ScheduledExecutorService f10879a = Executors.newScheduledThreadPool(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ScheduledFuture<?> f10880b;
    private ScheduledFuture<?> c;
    private e d;
    private volatile String e;
    private final int f;
    private int g;

    /* JADX INFO: renamed from: com.xiaomi.ai.android.core.b$b, reason: collision with other inner class name */
    public class RunnableC0345b implements Runnable {
        public RunnableC0345b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.c();
            wpe.b("ClientPingManager", "PingIntervalRunnable Ping id = " + b.this.e);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            wpe.h("ClientPingManager", "PingTimeoutRunnable: timeout");
            ConnectionCapability connectionCapability = (ConnectionCapability) b.this.d.a(ConnectionCapability.class);
            if (connectionCapability != null) {
                connectionCapability.onPingTimeout();
            }
        }
    }

    public b(e eVar) {
        this.d = eVar;
        this.f = eVar.i().e("connection.client_ping_timeout");
        this.g = this.d.i().e("connection.client_ping_interval");
    }

    private void d() {
        wpe.b("ClientPingManager", "updatePingTimeoutTask");
        synchronized (this) {
            try {
                if (this.f10880b != null) {
                    wpe.b("ClientPingManager", "updatePingTimeoutTask: PingTimeoutTask cancel");
                    this.f10880b.cancel(true);
                    this.f10880b = null;
                }
                if (this.c != null) {
                    wpe.b("ClientPingManager", "updatePingTimeoutTask: PingIntervalTask cancel");
                    this.c.cancel(true);
                    this.c = null;
                }
                this.f10880b = this.f10879a.schedule(new c(), this.f, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        wpe.b("ClientPingManager", "startPingTask");
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Event eventBuildEvent = APIUtils.buildEvent(new Sys.ClientPing());
        this.e = eventBuildEvent.getId();
        wpe.h("ClientPingManager", "send client ping" + this.e);
        this.d.postEvent(eventBuildEvent);
        d();
    }

    public void a() {
        wpe.h("ClientPingManager", "release");
        synchronized (this) {
            try {
                ScheduledFuture<?> scheduledFuture = this.c;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                    this.c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this) {
            try {
                ScheduledFuture<?> scheduledFuture2 = this.f10880b;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(true);
                    this.f10880b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void a(Instruction instruction) {
        if (!instruction.getDialogId().c()) {
            wpe.h("ClientPingManager", "updateStatus: dialog is null");
            return;
        }
        String strB = instruction.getDialogId().b();
        wpe.b("ClientPingManager", "updateStatus: CurrentId= " + this.e + ", instructionId= " + strB);
        if (strB.equals(this.e)) {
            if (this.f10880b != null) {
                wpe.b("ClientPingManager", "updateStatus: PingTimeoutTask cancel");
                this.f10880b.cancel(true);
                this.f10880b = null;
            }
            if (this.c != null) {
                wpe.b("ClientPingManager", "updateStatus: PingIntervalTask cancel");
                this.c.cancel(true);
                this.c = null;
            }
            this.c = this.f10879a.schedule(new RunnableC0345b(), this.g, TimeUnit.SECONDS);
        } else {
            wpe.h("ClientPingManager", "updateStatus: fail. instruction Id=" + strB + " , currPingId=" + this.e);
        }
    }
}
