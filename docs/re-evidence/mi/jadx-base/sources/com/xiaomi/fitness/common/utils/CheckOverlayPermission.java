package com.xiaomi.fitness.common.utils;

import android.content.Context;
import android.provider.Settings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/common/utils/CheckOverlayPermission;", "", "<init>", "()V", "checkFloatPermission", "", "context", "Landroid/content/Context;", "checkPermission", "checkCommonOverlayPermission", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckOverlayPermission {

    @NotNull
    public static final CheckOverlayPermission INSTANCE = new CheckOverlayPermission();

    private CheckOverlayPermission() {
    }

    private final boolean checkCommonOverlayPermission(Context context) {
        try {
            Object objInvoke = Settings.class.getDeclaredMethod("canDrawOverlays", Context.class).invoke(null, context);
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            return ((Boolean) objInvoke).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    private final boolean checkPermission(Context context) {
        return checkCommonOverlayPermission(context);
    }

    public final boolean checkFloatPermission(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return checkPermission(applicationContext);
    }
}
