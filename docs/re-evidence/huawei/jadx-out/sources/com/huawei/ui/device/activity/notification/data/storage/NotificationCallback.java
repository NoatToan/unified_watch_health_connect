package com.huawei.ui.device.activity.notification.data.storage;

/* JADX INFO: loaded from: classes16.dex */
public interface NotificationCallback<T> {
    void onError(NotificationResult notificationResult, String str);

    void onSuccess(T t);
}
