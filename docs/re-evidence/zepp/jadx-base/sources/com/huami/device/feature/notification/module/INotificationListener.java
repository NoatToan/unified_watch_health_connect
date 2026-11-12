package com.huami.device.feature.notification.module;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u001c\u0010\t\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&J\u001c\u0010\n\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/huami/device/feature/notification/module/INotificationListener;", "", "", "onInit", "onDeInit", "Landroid/service/notification/StatusBarNotification;", "sbn", "Landroid/service/notification/NotificationListenerService$RankingMap;", "ranking", "onNotificationPosted", "onNotificationRemoved", "notification_release"}, k = 1, mv = {1, 5, 1})
public interface INotificationListener {
    void onDeInit();

    void onInit();

    void onNotificationPosted(@Nullable StatusBarNotification sbn, @Nullable NotificationListenerService.RankingMap ranking);

    void onNotificationRemoved(@Nullable StatusBarNotification sbn, @Nullable NotificationListenerService.RankingMap ranking);
}
