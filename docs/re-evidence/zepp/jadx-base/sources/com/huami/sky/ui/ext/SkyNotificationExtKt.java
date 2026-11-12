package com.huami.sky.ui.ext;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.huami.sky.service.SkyPlayFromEvent;
import com.huami.sky.ui.utils.Constant;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0007"}, d2 = {"", "pendingIntentFlag", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/app/PendingIntent;", "getClickPlayPendingIntent", "getReminderClickPendingIntent", "sky-ui_release"}, k = 2, mv = {1, 5, 1})
public final class SkyNotificationExtKt {
    @NotNull
    public static final PendingIntent getClickPlayPendingIntent(@NotNull Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context.getPackageName(), Constant.PLAY_ACTIVITY_PATH));
        intent.putExtra(Constant.PLAY_FROM_EVENT_KEY, SkyPlayFromEvent.FROM_PLAY_NOTIFICATION_CLICK.getFrom());
        intent.addFlags(268435456);
        return PendingIntent.getActivity(context, 0, intent, pendingIntentFlag());
    }

    @NotNull
    public static final PendingIntent getReminderClickPendingIntent(@NotNull Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context.getPackageName(), Constant.PLAY_ACTIVITY_PATH));
        intent.putExtra(Constant.SKY_REMINDER_KEY, Constant.SKY_REMINDER_VALUE);
        intent.putExtra(Constant.PLAY_FROM_EVENT_KEY, SkyPlayFromEvent.FROM_REMINDER_NOTIFICATION_CLICK.getFrom());
        intent.addFlags(268435456);
        return PendingIntent.getActivity(context, 0, intent, pendingIntentFlag());
    }

    public static final int pendingIntentFlag() {
        if (Build.VERSION.SDK_INT >= 23) {
            return 201326592;
        }
        return AMapEngineUtils.HALF_MAX_P20_WIDTH;
    }
}
