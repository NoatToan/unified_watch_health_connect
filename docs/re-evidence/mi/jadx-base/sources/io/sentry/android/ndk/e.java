package io.sentry.android.ndk;

import defpackage.igl;
import defpackage.yq5;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.util.p;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class e extends igl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SentryOptions f21628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final b f21629b;

    public e(@NotNull SentryOptions sentryOptions) {
        this(sentryOptions, new NativeScope());
    }

    @Override // defpackage.igl, defpackage.xxc
    public void a(@NotNull final String str, @NotNull final String str2) {
        try {
            this.f21628a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21626a.k(str, str2);
                }
            });
        } catch (Throwable th) {
            this.f21628a.getLogger().b(SentryLevel.ERROR, th, "Scope sync setTag(%s) has an error.", str);
        }
    }

    public final /* synthetic */ void j(io.sentry.a aVar) {
        String strF = null;
        String lowerCase = aVar.i() != null ? aVar.i().name().toLowerCase(Locale.ROOT) : null;
        String strG = yq5.g(aVar.k());
        try {
            Map<String, Object> mapH = aVar.h();
            if (!mapH.isEmpty()) {
                strF = this.f21628a.getSerializer().f(mapH);
            }
        } catch (Throwable th) {
            this.f21628a.getLogger().b(SentryLevel.ERROR, th, "Breadcrumb data is not serializable.", new Object[0]);
        }
        this.f21629b.b(lowerCase, aVar.j(), aVar.g(), aVar.l(), strG, strF);
    }

    public final /* synthetic */ void k(String str, String str2) {
        this.f21629b.a(str, str2);
    }

    @Override // defpackage.igl, defpackage.xxc
    public void m(@NotNull final io.sentry.a aVar) {
        try {
            this.f21628a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21624a.j(aVar);
                }
            });
        } catch (Throwable th) {
            this.f21628a.getLogger().b(SentryLevel.ERROR, th, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    public e(@NotNull SentryOptions sentryOptions, @NotNull b bVar) {
        this.f21628a = (SentryOptions) p.c(sentryOptions, "The SentryOptions object is required.");
        this.f21629b = (b) p.c(bVar, "The NativeScope object is required.");
    }
}
