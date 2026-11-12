package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import defpackage.xug;
import io.sentry.android.core.r0;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final r0 f21507a;

    public e() {
        this(new r0(xug.e()));
    }

    @SuppressLint({"NewApi"})
    public void a(@NotNull ContentProvider contentProvider) {
        int iD = this.f21507a.d();
        if (iD < 26 || iD > 28) {
            return;
        }
        String callingPackage = contentProvider.getCallingPackage();
        String packageName = contentProvider.getContext().getPackageName();
        if (callingPackage == null || !callingPackage.equals(packageName)) {
            throw new SecurityException("Provider does not allow for granting of Uri permissions");
        }
    }

    public e(@NotNull r0 r0Var) {
        this.f21507a = r0Var;
    }
}
