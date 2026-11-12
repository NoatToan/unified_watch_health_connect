package com.xiaomi.fitness.active.pk.util;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"stateLaunchActivity", "", "context", "Landroid/content/Context;", "active-pk_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LaunchExtKt {
    public static final void stateLaunchActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(268468224);
            context.startActivity(launchIntentForPackage);
        }
    }
}
