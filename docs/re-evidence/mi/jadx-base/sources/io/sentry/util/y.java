package io.sentry.util;

import defpackage.ftc;
import defpackage.hgl;
import defpackage.idi;
import defpackage.ox1;
import io.sentry.SentryOptions;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class y {
    public static /* synthetic */ void d(SentryOptions sentryOptions, io.sentry.e eVar, idi idiVar) {
        ox1 ox1VarB = idiVar.b();
        if (ox1VarB == null) {
            ox1VarB = new ox1(sentryOptions.getLogger());
            idiVar.g(ox1VarB);
        }
        if (ox1VarB.r()) {
            ox1VarB.F(eVar, sentryOptions);
            ox1VarB.a();
        }
    }

    public static /* synthetic */ void e(io.sentry.e eVar, idi idiVar) {
        eVar.u(new idi());
    }

    public static /* synthetic */ void f(final io.sentry.e eVar) {
        eVar.x(new io.sentry.m.a() { // from class: io.sentry.util.x
            @Override // io.sentry.m.a
            public final void a(idi idiVar) {
                y.e(eVar, idiVar);
            }
        });
    }

    @NotNull
    public static idi g(@NotNull final io.sentry.e eVar, @NotNull final SentryOptions sentryOptions) {
        return eVar.x(new io.sentry.m.a() { // from class: io.sentry.util.v
            @Override // io.sentry.m.a
            public final void a(idi idiVar) {
                y.d(sentryOptions, eVar, idiVar);
            }
        });
    }

    public static void h(@NotNull ftc ftcVar) {
        ftcVar.v(new hgl() { // from class: io.sentry.util.w
            @Override // defpackage.hgl
            public final void a(io.sentry.e eVar) {
                y.f(eVar);
            }
        });
    }
}
