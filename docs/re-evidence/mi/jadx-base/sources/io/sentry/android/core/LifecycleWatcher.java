package io.sentry.android.core;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.react.modules.appstate.AppStateModule;
import defpackage.ftc;
import defpackage.hgl;
import io.sentry.SentryLevel;
import io.sentry.Session;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class LifecycleWatcher implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f21390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f21391b;
    public final long c;

    @Nullable
    public TimerTask d;

    @NotNull
    public final Timer e;

    @NotNull
    public final Object f;

    @NotNull
    public final ftc g;
    public final boolean h;
    public final boolean i;

    @NotNull
    public final io.sentry.transport.p j;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (LifecycleWatcher.this.h) {
                LifecycleWatcher.this.g.n();
            }
            LifecycleWatcher.this.g.i().getReplayController().stop();
        }
    }

    public LifecycleWatcher(@NotNull ftc ftcVar, long j, boolean z, boolean z2) {
        this(ftcVar, j, z, z2, io.sentry.transport.n.b());
    }

    public final void d(@NotNull String str) {
        if (this.i) {
            io.sentry.a aVar = new io.sentry.a();
            aVar.q("navigation");
            aVar.n("state", str);
            aVar.m("app.lifecycle");
            aVar.o(SentryLevel.INFO);
            this.g.m(aVar);
        }
    }

    public final void e() {
        synchronized (this.f) {
            try {
                TimerTask timerTask = this.d;
                if (timerTask != null) {
                    timerTask.cancel();
                    this.d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void f(io.sentry.e eVar) {
        Session sessionI;
        if (this.f21390a.get() != 0 || (sessionI = eVar.i()) == null || sessionI.k() == null) {
            return;
        }
        this.f21390a.set(sessionI.k().getTime());
        this.f21391b.set(true);
    }

    public final void g() {
        synchronized (this.f) {
            try {
                e();
                if (this.e != null) {
                    a aVar = new a();
                    this.d = aVar;
                    this.e.schedule(aVar, this.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        e();
        long jA = this.j.a();
        this.g.v(new hgl() { // from class: io.sentry.android.core.e1
            @Override // defpackage.hgl
            public final void a(io.sentry.e eVar) {
                this.f21458a.f(eVar);
            }
        });
        long j = this.f21390a.get();
        if (j == 0 || j + this.c <= jA) {
            if (this.h) {
                this.g.k();
            }
            this.g.i().getReplayController().start();
        } else if (!this.f21391b.get()) {
            this.g.i().getReplayController().resume();
        }
        this.f21391b.set(false);
        this.f21390a.set(jA);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull LifecycleOwner lifecycleOwner) {
        h();
        d("foreground");
        q0.a().c(false);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull LifecycleOwner lifecycleOwner) {
        this.f21390a.set(this.j.a());
        this.g.i().getReplayController().pause();
        g();
        q0.a().c(true);
        d(AppStateModule.APP_STATE_BACKGROUND);
    }

    public LifecycleWatcher(@NotNull ftc ftcVar, long j, boolean z, boolean z2, @NotNull io.sentry.transport.p pVar) {
        this.f21390a = new AtomicLong(0L);
        this.f21391b = new AtomicBoolean(false);
        this.e = new Timer(true);
        this.f = new Object();
        this.c = j;
        this.h = z;
        this.i = z2;
        this.g = ftcVar;
        this.j = pVar;
    }
}
