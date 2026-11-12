package io.sentry.cache;

import defpackage.fsd;
import defpackage.lvc;
import io.sentry.SentryOptions;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements lvc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SentryOptions f21676a;

    public h(@NotNull SentryOptions sentryOptions) {
        this.f21676a = sentryOptions;
    }

    @Nullable
    public static <T> T i(@NotNull SentryOptions sentryOptions, @NotNull String str, @NotNull Class<T> cls) {
        return (T) j(sentryOptions, str, cls, null);
    }

    @Nullable
    public static <T, R> T j(@NotNull SentryOptions sentryOptions, @NotNull String str, @NotNull Class<T> cls, @Nullable fsd<R> fsdVar) {
        return (T) d.c(sentryOptions, ".options-cache", str, cls, fsdVar);
    }

    public final void a(@NotNull String str) {
        d.a(this.f21676a, ".options-cache", str);
    }

    @Override // defpackage.lvc
    public void b(@NotNull Map<String, String> map) {
        k(map, "tags.json");
    }

    @Override // defpackage.lvc
    public void c(@Nullable String str) {
        if (str == null) {
            a("dist.json");
        } else {
            k(str, "dist.json");
        }
    }

    @Override // defpackage.lvc
    public void d(@Nullable String str) {
        if (str == null) {
            a("environment.json");
        } else {
            k(str, "environment.json");
        }
    }

    @Override // defpackage.lvc
    public void e(@Nullable String str) {
        if (str == null) {
            a("proguard-uuid.json");
        } else {
            k(str, "proguard-uuid.json");
        }
    }

    @Override // defpackage.lvc
    public void f(@Nullable io.sentry.protocol.n nVar) {
        if (nVar == null) {
            a("sdk-version.json");
        } else {
            k(nVar, "sdk-version.json");
        }
    }

    @Override // defpackage.lvc
    public void g(@Nullable Double d) {
        if (d == null) {
            a("replay-error-sample-rate.json");
        } else {
            k(d.toString(), "replay-error-sample-rate.json");
        }
    }

    @Override // defpackage.lvc
    public void h(@Nullable String str) {
        if (str == null) {
            a("release.json");
        } else {
            k(str, "release.json");
        }
    }

    public final <T> void k(@NotNull T t, @NotNull String str) {
        d.d(this.f21676a, t, ".options-cache", str);
    }
}
