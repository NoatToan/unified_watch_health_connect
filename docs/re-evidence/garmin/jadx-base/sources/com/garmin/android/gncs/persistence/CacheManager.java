package com.garmin.android.gncs.persistence;

import android.text.TextUtils;
import com.garmin.android.gncs.GNCSNotificationInfo;
import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\u0006J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\u0006J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u0006J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0018\u001a\u00020\u000bJ\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0010\u001a\u00020\u0006J\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000bJ\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u0006J\u000e\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\tJ\u000e\u0010!\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0015J\u000e\u0010$\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\t¨\u0006%"}, d2 = {"Lcom/garmin/android/gncs/persistence/CacheManager;", "", "()V", "deleteNotifsByPackageName", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "getActiveNotifications", "", "Lcom/garmin/android/gncs/GNCSNotificationInfo;", NotificationConstants.KEY_DATA_MIME_TYPE, "Lcom/garmin/android/gncs/GNCSNotificationInfo$NotificationType;", "getActiveNotificationsOfCategory", "category", "getBlockedNotificationsOfCategory", "getGroupSummaryNotification", "groupKey", "getMaxCacheId", "", "getNotification", "cacheId", "", "cacheKey", "getNotifications", "notificationType", "getNotificationsByGroup", "getNotificationsByPackage", "getNumberOfEventsForType", "getRemovedNotifications", "groupNotificationHasChildren", "", "removeNotification", "ni", "removeNotifications", "removeStaleNotifications", "pruneDate", "saveNotification", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CacheManager {
    public static final CacheManager INSTANCE = new CacheManager();

    private CacheManager() {
    }

    public final void deleteNotifsByPackageName(String packageName) {
        packageName.getClass();
        GNCSNotificationDatabase.getInstance().notificationDAO().deleteNotifsByPackageName(packageName);
    }

    public final List<GNCSNotificationInfo> getActiveNotifications(GNCSNotificationInfo.NotificationType type) {
        type.getClass();
        List<GNCSNotificationInfo> activeNotifications = GNCSNotificationDatabase.getInstance().notificationDAO().getActiveNotifications(type);
        activeNotifications.getClass();
        return activeNotifications;
    }

    public final List<GNCSNotificationInfo> getActiveNotificationsOfCategory(String category) {
        category.getClass();
        List<GNCSNotificationInfo> activeNotificationsOfCategory = GNCSNotificationDatabase.getInstance().notificationDAO().getActiveNotificationsOfCategory(category);
        activeNotificationsOfCategory.getClass();
        return activeNotificationsOfCategory;
    }

    public final List<GNCSNotificationInfo> getBlockedNotificationsOfCategory(String category) {
        category.getClass();
        List<GNCSNotificationInfo> blockedNotificationsOfCategory = GNCSNotificationDatabase.getInstance().notificationDAO().getBlockedNotificationsOfCategory(category);
        blockedNotificationsOfCategory.getClass();
        return blockedNotificationsOfCategory;
    }

    public final GNCSNotificationInfo getGroupSummaryNotification(String groupKey) {
        Object next;
        groupKey.getClass();
        Iterator<T> it = getNotificationsByGroup(groupKey).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((GNCSNotificationInfo) next).isGroupSummary()) {
                return (GNCSNotificationInfo) next;
            }
        }
        next = null;
        return (GNCSNotificationInfo) next;
    }

    public final int getMaxCacheId() {
        return GNCSNotificationDatabase.getInstance().notificationDAO().getMaxCacheId();
    }

    public final GNCSNotificationInfo getNotification(String cacheKey) {
        cacheKey.getClass();
        return GNCSNotificationDatabase.getInstance().notificationDAO().getNotification(cacheKey);
    }

    public final List<GNCSNotificationInfo> getNotifications(GNCSNotificationInfo.NotificationType notificationType) {
        notificationType.getClass();
        List<GNCSNotificationInfo> notifications = GNCSNotificationDatabase.getInstance().notificationDAO().getNotifications(notificationType);
        notifications.getClass();
        return notifications;
    }

    public final List<GNCSNotificationInfo> getNotificationsByGroup(String groupKey) {
        groupKey.getClass();
        if (TextUtils.isEmpty(groupKey)) {
            return j0.f134944a;
        }
        List<GNCSNotificationInfo> notificationsByGroup = GNCSNotificationDatabase.getInstance().notificationDAO().getNotificationsByGroup(groupKey);
        notificationsByGroup.getClass();
        return notificationsByGroup;
    }

    public final List<GNCSNotificationInfo> getNotificationsByPackage(String packageName) {
        packageName.getClass();
        List<GNCSNotificationInfo> notificationsByPackage = GNCSNotificationDatabase.getInstance().notificationDAO().getNotificationsByPackage(packageName);
        notificationsByPackage.getClass();
        return notificationsByPackage;
    }

    public final int getNumberOfEventsForType(GNCSNotificationInfo.NotificationType type) {
        type.getClass();
        return GNCSNotificationDatabase.getInstance().notificationDAO().getNumberOfEvents(type);
    }

    public final List<GNCSNotificationInfo> getRemovedNotifications() {
        List<GNCSNotificationInfo> removedNotifications = GNCSNotificationDatabase.getInstance().notificationDAO().getRemovedNotifications();
        removedNotifications.getClass();
        return removedNotifications;
    }

    public final boolean groupNotificationHasChildren(String groupKey) {
        groupKey.getClass();
        return !TextUtils.isEmpty(groupKey) && GNCSNotificationDatabase.getInstance().notificationDAO().getNotificationCountByGroup(groupKey) >= 2;
    }

    public final void removeNotification(GNCSNotificationInfo ni3) {
        ni3.getClass();
        GNCSNotificationDatabase.getInstance().notificationDAO().removeNotification(ni3);
    }

    public final void removeNotifications(GNCSNotificationInfo.NotificationType type) {
        type.getClass();
        GNCSNotificationDatabase.getInstance().notificationDAO().removeNotifications(type);
    }

    public final void removeStaleNotifications(long pruneDate) {
        GNCSNotificationDatabase.getInstance().notificationDAO().removeStaleNotifications(pruneDate);
    }

    public final void saveNotification(GNCSNotificationInfo ni3) {
        ni3.getClass();
        GNCSNotificationDatabase.getInstance().notificationDAO().saveNotification(ni3);
    }

    public final GNCSNotificationInfo getNotification(long cacheId) {
        return GNCSNotificationDatabase.getInstance().notificationDAO().getNotification(cacheId);
    }

    public final List<GNCSNotificationInfo> getActiveNotifications() {
        List<GNCSNotificationInfo> activeNotifications = GNCSNotificationDatabase.getInstance().notificationDAO().getActiveNotifications();
        activeNotifications.getClass();
        return activeNotifications;
    }

    public final List<GNCSNotificationInfo> getNotifications() {
        List<GNCSNotificationInfo> allNotifications = GNCSNotificationDatabase.getInstance().notificationDAO().getAllNotifications();
        allNotifications.getClass();
        return allNotifications;
    }
}
