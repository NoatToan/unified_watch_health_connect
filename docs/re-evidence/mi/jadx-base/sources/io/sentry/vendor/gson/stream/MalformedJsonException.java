package io.sentry.vendor.gson.stream;

import java.io.IOException;
import org.jetbrains.annotations.ApiStatus;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class MalformedJsonException extends IOException {
    private static final long serialVersionUID = 1;

    public MalformedJsonException(String str) {
        super(str);
    }

    public MalformedJsonException(String str, Throwable th) {
        super(str);
        initCause(th);
    }

    public MalformedJsonException(Throwable th) {
        initCause(th);
    }
}
