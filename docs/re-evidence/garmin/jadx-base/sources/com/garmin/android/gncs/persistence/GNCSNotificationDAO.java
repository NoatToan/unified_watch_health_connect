package com.garmin.android.gncs.persistence;

import com.garmin.android.gncs.GNCSNotificationInfo;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface GNCSNotificationDAO {
    void deleteNotifsByPackageName(String str);

    List<GNCSNotificationInfo> getActiveNotifications();

    List<GNCSNotificationInfo> getActiveNotifications(GNCSNotificationInfo.NotificationType notificationType);

    List<GNCSNotificationInfo> getActiveNotificationsOfCategory(String str);

    List<GNCSNotificationInfo> getAllNotifications();

    List<GNCSNotificationInfo> getBlockedNotificationsOfCategory(String str);

    int getMaxCacheId();

    GNCSNotificationInfo getNotification(long j8);

    GNCSNotificationInfo getNotification(String str);

    int getNotificationCountByGroup(String str);

    List<GNCSNotificationInfo> getNotifications(GNCSNotificationInfo.NotificationType notificationType);

    List<GNCSNotificationInfo> getNotificationsByGroup(String str);

    List<GNCSNotificationInfo> getNotificationsByPackage(String str);

    int getNumberOfEvents(GNCSNotificationInfo.NotificationType notificationType);

    List<GNCSNotificationInfo> getRemovedNotifications();

    void removeNotification(GNCSNotificationInfo gNCSNotificationInfo);

    void removeNotifications(GNCSNotificationInfo.NotificationType notificationType);

    void removeStaleNotifications(long j8);

    void saveNotification(GNCSNotificationInfo gNCSNotificationInfo);
}
