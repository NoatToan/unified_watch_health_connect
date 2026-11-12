package defpackage;

import com.huawei.ui.device.activity.notification.data.storage.NotificationCallback;
import com.huawei.ui.device.activity.notification.data.storage.NotificationStorage;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qyc implements NotificationStorage {
    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public int getAppSwitch(String str) {
        return 0;
    }

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public void getAppSwitch(List<lzj> list, NotificationCallback<List<lzj>> notificationCallback) {
    }

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public void getMainSwitch(NotificationCallback<Boolean> notificationCallback) {
    }

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public void getNotifyReminderMode(int i, NotificationCallback<Integer> notificationCallback) {
    }

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public void saveAppSwitch(lzj lzjVar, NotificationCallback<lzj> notificationCallback) {
    }

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public void saveMainSwitch(int i, NotificationCallback<Integer> notificationCallback) {
    }

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public void setNotifyReminderMode(int i, NotificationCallback<Boolean> notificationCallback) {
    }
}
