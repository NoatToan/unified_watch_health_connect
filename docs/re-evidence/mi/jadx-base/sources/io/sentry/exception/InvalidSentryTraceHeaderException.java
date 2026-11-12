package io.sentry.exception;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class InvalidSentryTraceHeaderException extends Exception {
    private static final long serialVersionUID = -8353316997083420940L;

    @NotNull
    private final String sentryTraceHeader;

    public InvalidSentryTraceHeaderException(@NotNull String str) {
        this(str, null);
    }

    @NotNull
    public String getSentryTraceHeader() {
        return this.sentryTraceHeader;
    }

    public InvalidSentryTraceHeaderException(@NotNull String str, @Nullable Throwable th) {
        super("sentry-trace header does not conform to expected format: " + str, th);
        this.sentryTraceHeader = str;
    }
}
