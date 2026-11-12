package io.sentry.exception;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class SentryEnvelopeException extends Exception {
    private static final long serialVersionUID = -8307801916948173232L;

    public SentryEnvelopeException(@Nullable String str) {
        super(str);
    }
}
