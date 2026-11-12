package io.sentry.cache;

import defpackage.fsd;
import defpackage.igl;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.protocol.Contexts;
import io.sentry.v;
import java.util.Collection;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends igl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SentryOptions f21691a;

    public p(@NotNull SentryOptions sentryOptions) {
        this.f21691a = sentryOptions;
    }

    public static <T> void A(@NotNull SentryOptions sentryOptions, @NotNull T t, @NotNull String str) {
        d.d(sentryOptions, t, ".scope-cache", str);
    }

    @Nullable
    public static <T> T x(@NotNull SentryOptions sentryOptions, @NotNull String str, @NotNull Class<T> cls) {
        return (T) y(sentryOptions, str, cls, null);
    }

    @Nullable
    public static <T, R> T y(@NotNull SentryOptions sentryOptions, @NotNull String str, @NotNull Class<T> cls, @Nullable fsd<R> fsdVar) {
        return (T) d.c(sentryOptions, ".scope-cache", str, cls, fsdVar);
    }

    public final <T> void B(@NotNull T t, @NotNull String str) {
        A(this.f21691a, t, str);
    }

    @Override // defpackage.igl, defpackage.xxc
    public void b(@NotNull final Map<String, String> map) {
        z(new Runnable() { // from class: io.sentry.cache.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f21679a.u(map);
            }
        });
    }

    @Override // defpackage.igl, defpackage.xxc
    public void c(@NotNull final io.sentry.protocol.p pVar) {
        z(new Runnable() { // from class: io.sentry.cache.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f21677a.t(pVar);
            }
        });
    }

    @Override // defpackage.igl, defpackage.xxc
    public void d(@NotNull final Collection<io.sentry.a> collection) {
        z(new Runnable() { // from class: io.sentry.cache.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f21681a.r(collection);
            }
        });
    }

    @Override // defpackage.igl, defpackage.xxc
    public void e(@NotNull final Contexts contexts) {
        z(new Runnable() { // from class: io.sentry.cache.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f21687a.s(contexts);
            }
        });
    }

    @Override // defpackage.igl, defpackage.xxc
    public void f(@Nullable final v vVar, @NotNull final io.sentry.e eVar) {
        z(new Runnable() { // from class: io.sentry.cache.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f21689a.v(vVar, eVar);
            }
        });
    }

    @Override // defpackage.igl, defpackage.xxc
    public void g(@Nullable final String str) {
        z(new Runnable() { // from class: io.sentry.cache.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f21683a.w(str);
            }
        });
    }

    public final void p(@NotNull String str) {
        d.a(this.f21691a, ".scope-cache", str);
    }

    public final /* synthetic */ void q(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            this.f21691a.getLogger().a(SentryLevel.ERROR, "Serialization task failed", th);
        }
    }

    public final /* synthetic */ void r(Collection collection) {
        B(collection, "breadcrumbs.json");
    }

    public final /* synthetic */ void s(Contexts contexts) {
        B(contexts, "contexts.json");
    }

    public final /* synthetic */ void t(io.sentry.protocol.p pVar) {
        B(pVar, "replay.json");
    }

    public final /* synthetic */ void u(Map map) {
        B(map, "tags.json");
    }

    public final /* synthetic */ void v(v vVar, io.sentry.e eVar) {
        if (vVar == null) {
            B(eVar.v().h(), "trace.json");
        } else {
            B(vVar, "trace.json");
        }
    }

    public final /* synthetic */ void w(String str) {
        if (str == null) {
            p("transaction.json");
        } else {
            B(str, "transaction.json");
        }
    }

    public final void z(@NotNull final Runnable runnable) {
        if (Thread.currentThread().getName().contains("SentryExecutor")) {
            runnable.run();
            return;
        }
        try {
            this.f21691a.getExecutorService().submit(new Runnable() { // from class: io.sentry.cache.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21685a.q(runnable);
                }
            });
        } catch (Throwable th) {
            this.f21691a.getLogger().a(SentryLevel.ERROR, "Serialization task could not be scheduled", th);
        }
    }
}
