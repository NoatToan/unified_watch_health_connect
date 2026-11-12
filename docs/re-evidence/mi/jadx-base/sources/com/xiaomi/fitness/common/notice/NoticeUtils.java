package com.xiaomi.fitness.common.notice;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000eJ0\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/common/notice/NoticeUtils;", "", "<init>", "()V", "KEY_SHOW_BUTTON", "", "createChannelIfNeed", "", "context", "Landroid/content/Context;", "channelId", "channelName", "channelDesc", "importance", "", "cancelNotification", "notificationId", "createNotificationChannel", "Landroid/app/NotificationChannel;", "manager", "Landroid/app/NotificationManager;", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NoticeUtils {

    @NotNull
    public static final NoticeUtils INSTANCE = new NoticeUtils();

    @NotNull
    public static final String KEY_SHOW_BUTTON = "miui.showAction";

    private NoticeUtils() {
    }

    public final void cancelNotification(@NotNull Context context, int notificationId) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (notificationId > 0) {
            Object systemService = context.getSystemService("notification");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).cancel(notificationId);
        }
    }

    public final void createChannelIfNeed(@NotNull Context context, @NotNull String channelId, @NotNull String channelName, @NotNull String channelDesc, int importance) {
        NotificationChannel notificationChannelCreateNotificationChannel;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        Intrinsics.checkNotNullParameter(channelDesc, "channelDesc");
        if (TextUtils.isEmpty(channelId)) {
            throw new NullPointerException("context or channelId is null");
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
        if (notificationManager == null || (notificationChannelCreateNotificationChannel = INSTANCE.createNotificationChannel(notificationManager, channelId, channelName, channelDesc, importance)) == null) {
            return;
        }
        notificationManager.createNotificationChannel(notificationChannelCreateNotificationChannel);
    }

    @Nullable
    public final NotificationChannel createNotificationChannel(@NotNull NotificationManager manager, @NotNull String channelId, @NotNull String channelName, @NotNull String channelDesc, int importance) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        Intrinsics.checkNotNullParameter(channelDesc, "channelDesc");
        if (manager.getNotificationChannel(channelId) != null) {
            return null;
        }
        NotificationChannel notificationChannel = new NotificationChannel(channelId, channelName, importance);
        notificationChannel.setDescription(channelDesc);
        return notificationChannel;
    }
}
