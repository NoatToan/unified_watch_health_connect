package defpackage;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface rsl {
    static /* synthetic */ void e(ILogger iLogger, String str, ay6 ay6Var, File file) {
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        iLogger.c(sentryLevel, "Started processing cached files from %s", str);
        ay6Var.e(file);
        iLogger.c(sentryLevel, "Finished processing cached files from %s", str);
    }

    default boolean a(@Nullable String str, @NotNull ILogger iLogger) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        iLogger.c(SentryLevel.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }

    @NotNull
    default osl b(@NotNull final ay6 ay6Var, @NotNull final String str, @NotNull final ILogger iLogger) {
        final File file = new File(str);
        return new osl() { // from class: qsl
            @Override // defpackage.osl
            public final void a() {
                rsl.e(iLogger, str, ay6Var, file);
            }
        };
    }

    @Nullable
    osl c(@NotNull ftc ftcVar, @NotNull SentryOptions sentryOptions);
}
