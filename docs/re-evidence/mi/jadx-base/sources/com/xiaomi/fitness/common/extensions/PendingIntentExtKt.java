package com.xiaomi.fitness.common.extensions;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.TaskStackBuilder;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.mibi.sdk.component.params.SdkContants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t\u001a$\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u001a$\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u001a$\u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u001a\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0001*\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u001a\b\u0010\u0011\u001a\u00020\u0004H\u0002\u001a\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u0013\u001a\u00020\u0014*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¨\u0006\u0015"}, d2 = {"getActivityPendingIntent", "Landroid/app/PendingIntent;", "Landroid/content/Context;", AccountInteractActivity.KEY_REQUEST_CODE, "", "intent", "Landroid/content/Intent;", "flags", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "buildWidgetPendingIntent", "widgetId", "getBroadcastPendingIntent", "getForegroundServicePendingIntent", "flag", "getPendingIntentCompat", "Landroidx/core/app/TaskStackBuilder;", "defaultFlags", "compatFlags", "hasFlag", "", "common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PendingIntentExtKt {
    @NotNull
    public static final PendingIntent buildWidgetPendingIntent(@NotNull Context context, int i, @NotNull Intent intent, int i2) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(intent, "intent");
        return getActivityPendingIntent(ApplicationExtKt.getApplication(), i, intent, i2);
    }

    public static /* synthetic */ PendingIntent buildWidgetPendingIntent$default(Context context, int i, Intent intent, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = defaultFlags();
        }
        return buildWidgetPendingIntent(context, i, intent, i2);
    }

    private static final int compatFlags(int i) {
        return (Build.VERSION.SDK_INT < 31 || hasFlag(i, 67108864) || hasFlag(i, 33554432)) ? i : i | 67108864;
    }

    private static final int defaultFlags() {
        return 201326592;
    }

    @NotNull
    public static final PendingIntent getActivityPendingIntent(@NotNull Context context, int i, @NotNull Intent intent, int i2) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(intent, "intent");
        PendingIntent activity = PendingIntent.getActivity(context, i, intent, compatFlags(i2));
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }

    public static /* synthetic */ PendingIntent getActivityPendingIntent$default(Context context, int i, Intent intent, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = defaultFlags();
        }
        return getActivityPendingIntent(context, i, intent, i2);
    }

    @NotNull
    public static final PendingIntent getBroadcastPendingIntent(@NotNull Context context, int i, @NotNull Intent intent, int i2) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(intent, "intent");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, i, intent, compatFlags(i2));
        Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    public static /* synthetic */ PendingIntent getBroadcastPendingIntent$default(Context context, int i, Intent intent, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = defaultFlags();
        }
        return getBroadcastPendingIntent(context, i, intent, i2);
    }

    @NotNull
    public static final PendingIntent getForegroundServicePendingIntent(@NotNull Context context, int i, @NotNull Intent intent, int i2) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(intent, "intent");
        PendingIntent foregroundService = PendingIntent.getForegroundService(context, i, intent, i2);
        Intrinsics.checkNotNull(foregroundService);
        return foregroundService;
    }

    public static /* synthetic */ PendingIntent getForegroundServicePendingIntent$default(Context context, int i, Intent intent, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = defaultFlags();
        }
        return getForegroundServicePendingIntent(context, i, intent, i2);
    }

    @Nullable
    public static final PendingIntent getPendingIntentCompat(@NotNull TaskStackBuilder taskStackBuilder, int i, int i2) {
        Intrinsics.checkNotNullParameter(taskStackBuilder, "<this>");
        return taskStackBuilder.l(i, compatFlags(i2));
    }

    public static /* synthetic */ PendingIntent getPendingIntentCompat$default(TaskStackBuilder taskStackBuilder, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = defaultFlags();
        }
        return getPendingIntentCompat(taskStackBuilder, i, i2);
    }

    private static final boolean hasFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    @NotNull
    public static final PendingIntent getActivityPendingIntent(@NotNull Context context, int i, @NotNull Intent intent, int i2, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        PendingIntent activity = PendingIntent.getActivity(context, i, intent, compatFlags(i2), bundle);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }

    @NotNull
    public static final PendingIntent getActivityPendingIntent(@NotNull Context context, int i, @NotNull Intent intent, @NotNull Bundle bundle, int i2) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        PendingIntent activity = PendingIntent.getActivity(context, i, intent, compatFlags(i2), bundle);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }

    public static /* synthetic */ PendingIntent getActivityPendingIntent$default(Context context, int i, Intent intent, int i2, Bundle bundle, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = defaultFlags();
        }
        return getActivityPendingIntent(context, i, intent, i2, bundle);
    }

    public static /* synthetic */ PendingIntent getActivityPendingIntent$default(Context context, int i, Intent intent, Bundle bundle, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = defaultFlags();
        }
        return getActivityPendingIntent(context, i, intent, bundle, i2);
    }
}
