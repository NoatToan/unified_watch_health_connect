package com.huawei.ui.device.activity.notification.data.storage;

import defpackage.lzj;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public interface NotificationStorage {
    int getAppSwitch(String str);

    void getAppSwitch(List<lzj> list, NotificationCallback<List<lzj>> notificationCallback);

    void getMainSwitch(NotificationCallback<Boolean> notificationCallback);

    void getNotifyReminderMode(int i, NotificationCallback<Integer> notificationCallback);

    void saveAppSwitch(lzj lzjVar, NotificationCallback<lzj> notificationCallback);

    void saveMainSwitch(int i, NotificationCallback<Integer> notificationCallback);

    void setNotifyReminderMode(int i, NotificationCallback<Boolean> notificationCallback);
}
