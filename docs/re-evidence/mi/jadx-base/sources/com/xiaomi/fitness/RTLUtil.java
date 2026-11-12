package com.xiaomi.fitness;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/RTLUtil;", "", "<init>", "()V", "isRtl", "", "context", "Landroid/content/Context;", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RTLUtil {

    @NotNull
    public static final RTLUtil INSTANCE = new RTLUtil();

    private RTLUtil() {
    }

    public final boolean isRtl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
        return ((applicationInfo.flags & 4194304) == 4194304) && (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1);
    }
}
