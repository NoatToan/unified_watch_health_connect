package defpackage;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class fwo implements ILogger {
    @Override // io.sentry.ILogger
    public void a(@NotNull SentryLevel sentryLevel, @NotNull String str, @Nullable Throwable th) {
        if (th == null) {
            c(sentryLevel, str, new Object[0]);
        } else {
            System.out.println(String.format("%s: %s\n%s", sentryLevel, String.format(str, th.toString()), e(th)));
        }
    }

    @Override // io.sentry.ILogger
    public void b(@NotNull SentryLevel sentryLevel, @Nullable Throwable th, @NotNull String str, @Nullable Object... objArr) {
        if (th == null) {
            c(sentryLevel, str, objArr);
        } else {
            System.out.println(String.format("%s: %s \n %s\n%s", sentryLevel, String.format(str, objArr), th.toString(), e(th)));
        }
    }

    @Override // io.sentry.ILogger
    public void c(@NotNull SentryLevel sentryLevel, @NotNull String str, @Nullable Object... objArr) {
        System.out.println(String.format("%s: %s", sentryLevel, String.format(str, objArr)));
    }

    @Override // io.sentry.ILogger
    public boolean d(@Nullable SentryLevel sentryLevel) {
        return true;
    }

    @NotNull
    public final String e(@NotNull Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
