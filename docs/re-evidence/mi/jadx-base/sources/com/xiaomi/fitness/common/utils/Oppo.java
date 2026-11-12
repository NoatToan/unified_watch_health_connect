package com.xiaomi.fitness.common.utils;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.xiaomi.passport.ui.utils.OsHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0003J\u0006\u0010\u000b\u001a\u00020\u0005¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/common/utils/Oppo;", "", "<init>", "()V", "checkFloatWindowPermission", "", "context", "Landroid/content/Context;", "checkOp", "op", "", "checkIsOppoRom", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Oppo {

    @NotNull
    public static final Oppo INSTANCE = new Oppo();

    private Oppo() {
    }

    @TargetApi(19)
    private final boolean checkOp(Context context, int op) {
        Object systemService = context.getSystemService("appops");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AppOpsManager");
        AppOpsManager appOpsManager = (AppOpsManager) systemService;
        try {
            Class cls = Integer.TYPE;
            Object objInvoke = AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke(appOpsManager, Integer.valueOf(op), Integer.valueOf(Binder.getCallingUid()), context.getPackageName());
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) objInvoke).intValue() == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean checkFloatWindowPermission(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return checkOp(context, 24);
    }

    public final boolean checkIsOppoRom() {
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        if (!StringsKt__StringsKt.contains$default((CharSequence) MANUFACTURER, (CharSequence) OsHelper.ROM_OPPO, false, 2, (Object) null)) {
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            if (!StringsKt__StringsKt.contains$default((CharSequence) MANUFACTURER, (CharSequence) RomUtils.OPPO, false, 2, (Object) null)) {
                return false;
            }
        }
        return true;
    }
}
