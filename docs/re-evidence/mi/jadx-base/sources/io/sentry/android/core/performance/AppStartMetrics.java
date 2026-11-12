package io.sentry.android.core.performance;

import android.app.Activity;
import android.app.Application;
import android.content.ContentProvider;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import defpackage.hul;
import defpackage.mvl;
import defpackage.qkp;
import defpackage.xzc;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public class AppStartMetrics extends a {
    public static long m = SystemClock.uptimeMillis();
    public static volatile AppStartMetrics n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21566b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public AppStartType f21565a = AppStartType.UNKNOWN;
    public xzc h = null;
    public qkp i = null;
    public hul j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f21567k = false;
    public boolean l = false;

    @NotNull
    public final e c = new e();

    @NotNull
    public final e d = new e();

    @NotNull
    public final e e = new e();

    @NotNull
    public final Map<ContentProvider, e> f = new HashMap();

    @NotNull
    public final List<b> g = new ArrayList();

    public enum AppStartType {
        UNKNOWN,
        COLD,
        WARM
    }

    public AppStartMetrics() {
        this.f21566b = false;
        this.f21566b = u0.n();
    }

    @NotNull
    public static AppStartMetrics n() {
        if (n == null) {
            synchronized (AppStartMetrics.class) {
                try {
                    if (n == null) {
                        n = new AppStartMetrics();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return n;
    }

    public void c(@NotNull b bVar) {
        this.g.add(bVar);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void q(@NotNull final Application application) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.performance.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f21572a.p(application);
            }
        });
    }

    @NotNull
    public List<b> e() {
        ArrayList arrayList = new ArrayList(this.g);
        Collections.sort(arrayList);
        return arrayList;
    }

    public xzc f() {
        return this.h;
    }

    public qkp g() {
        return this.i;
    }

    @NotNull
    public e h() {
        return this.c;
    }

    @NotNull
    public e i(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.isEnablePerformanceV2()) {
            e eVarH = h();
            if (eVarH.p()) {
                return v(eVarH);
            }
        }
        return v(o());
    }

    @NotNull
    public AppStartType j() {
        return this.f21565a;
    }

    @NotNull
    public e k() {
        return this.e;
    }

    public long l() {
        return m;
    }

    @NotNull
    public List<e> m() {
        ArrayList arrayList = new ArrayList(this.f.values());
        Collections.sort(arrayList);
        return arrayList;
    }

    @NotNull
    public e o() {
        return this.d;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.f21566b && this.j == null) {
            this.j = new mvl();
            if ((this.c.r() ? this.c.e() : System.currentTimeMillis()) - this.c.k() > TimeUnit.MINUTES.toMillis(1L)) {
                this.f21567k = true;
            }
        }
    }

    public final /* synthetic */ void p(Application application) {
        if (this.j == null) {
            this.f21566b = false;
            xzc xzcVar = this.h;
            if (xzcVar != null && xzcVar.isRunning()) {
                this.h.close();
                this.h = null;
            }
        }
        application.unregisterActivityLifecycleCallbacks(n);
    }

    public void r(@NotNull final Application application) {
        if (this.l) {
            return;
        }
        boolean z = true;
        this.l = true;
        if (!this.f21566b && !u0.n()) {
            z = false;
        }
        this.f21566b = z;
        application.registerActivityLifecycleCallbacks(n);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.performance.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f21570a.q(application);
            }
        });
    }

    public void s(xzc xzcVar) {
        this.h = xzcVar;
    }

    public void t(qkp qkpVar) {
        this.i = qkpVar;
    }

    public void u(@NotNull AppStartType appStartType) {
        this.f21565a = appStartType;
    }

    @NotNull
    public final e v(@NotNull e eVar) {
        return (this.f21567k || !this.f21566b) ? new e() : eVar;
    }
}
