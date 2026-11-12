package io.sentry;

import java.util.Locale;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Experimental
public enum CheckInStatus {
    IN_PROGRESS,
    OK,
    ERROR;

    @NotNull
    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
