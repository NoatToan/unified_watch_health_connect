package com.huawei.ui.device.activity.notification.data.repository;

import com.huawei.ui.device.activity.notification.data.storage.NotificationCallback;
import defpackage.lzj;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public interface NotificationRepository {
    boolean isNotificationEnabledInSystem(String str, int i);

    void loadNotificationAppList(NotificationCallback<List<lzj>> notificationCallback);

    void loadNotificationMainSwitchStatus(NotificationCallback<Boolean> notificationCallback);

    void loadNotificationRemindMode(NotificationCallback<Integer> notificationCallback);

    int loadSwitchSyncVersion();

    void saveNotificationMainSwitchStatus(boolean z, NotificationCallback<Boolean> notificationCallback);

    void setNotificationRemindMode(int i, NotificationCallback<Boolean> notificationCallback);

    void syncSwitchStatusToCloud();

    void updateAllAppAuthorization(List<lzj> list, boolean z, NotificationCallback<Boolean> notificationCallback);

    void updateNotificationAppAuthorization(lzj lzjVar, boolean z, NotificationCallback<Boolean> notificationCallback);
}
