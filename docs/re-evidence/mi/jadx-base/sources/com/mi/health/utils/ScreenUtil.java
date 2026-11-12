package com.mi.health.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/mi/health/utils/ScreenUtil;", "", "<init>", "()V", "logScreenMessage", "", "context", "Landroid/content/Context;", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScreenUtil {

    @NotNull
    public static final ScreenUtil INSTANCE = new ScreenUtil();

    private ScreenUtil() {
    }

    public final void logScreenMessage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "getConfiguration(...)");
        int i = configuration.smallestScreenWidthDp;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        Logger.d("ScreenUtil", "screen sw:" + i + ",config:" + configuration);
        StringBuilder sb = new StringBuilder();
        sb.append("displayMetrics:");
        sb.append(displayMetrics);
        Logger.d("ScreenUtil", sb.toString());
    }
}
