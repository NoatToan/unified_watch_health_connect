package io.sentry.android.core;

import android.content.Context;
import defpackage.ucd;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class h0 {
    @NotNull
    public static ucd a(@NotNull Context context, @NotNull r0 r0Var) {
        return r0Var.d() >= 30 ? new AnrV2Integration(context) : new AnrIntegration(context);
    }
}
