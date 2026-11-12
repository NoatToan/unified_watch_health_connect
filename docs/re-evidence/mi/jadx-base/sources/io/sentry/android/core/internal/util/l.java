package io.sentry.android.core.internal.util;

import android.content.Context;
import android.os.Process;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class l {
    public static boolean a(@NotNull Context context, @NotNull String str) {
        io.sentry.util.p.c(context, "The application context is required.");
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }
}
