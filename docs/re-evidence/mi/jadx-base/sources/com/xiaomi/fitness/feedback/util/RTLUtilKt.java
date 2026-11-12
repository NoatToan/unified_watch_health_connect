package com.xiaomi.fitness.feedback.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"isRTL", "", "context", "Landroid/content/Context;", "feedback_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RTLUtilKt {
    public static final boolean isRTL(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
        return ((applicationInfo.flags & 4194304) == 4194304) && (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1);
    }
}
