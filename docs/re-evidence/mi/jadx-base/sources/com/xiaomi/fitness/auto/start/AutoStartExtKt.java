package com.xiaomi.fitness.auto.start;

import android.content.Context;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u001b\b\u0002\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b¢\u0006\u0002\b\r\u001a\n\u0010\u000e\u001a\u00020\u0006*\u00020\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000f"}, d2 = {"canAutoStart", "", "Landroid/content/Context;", "getCanAutoStart", "(Landroid/content/Context;)Z", "setAutoStart", "", "enableByUser", "key", "", "result", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/common/extensions/PermissionBuilder;", "Lkotlin/ExtensionFunctionType;", "openAutoStartOnce", "auto-start_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AutoStartExtKt {
    public static final boolean getCanAutoStart(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return AutoStarterImpl.INSTANCE.canAutoStart(context);
    }

    public static final void openAutoStartOnce(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        AutoStarterImpl.INSTANCE.openAutoStartOnce(context);
    }

    public static final void setAutoStart(@NotNull Context context, boolean z, @NotNull String key, @Nullable Function1<? super PermissionBuilder, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        AutoStarterImpl.INSTANCE.setAutoStart(context, z, key, function1);
    }

    public static /* synthetic */ void setAutoStart$default(Context context, boolean z, String str, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        setAutoStart(context, z, str, function1);
    }
}
