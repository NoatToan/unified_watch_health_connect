package defpackage;

import com.huawei.hwdevice.outofprocess.util.NotificationContentProviderUtil;
import com.huawei.ui.device.activity.notification.data.storage.NotificationCallback;
import com.huawei.ui.device.activity.notification.data.storage.NotificationResult;
import com.huawei.ui.device.activity.notification.data.storage.NotificationStorage;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qya implements NotificationStorage {
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
    public void setNotifyReminderMode(int i, NotificationCallback<Boolean> notificationCallback) {
    }

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public void saveAppSwitch(lzj lzjVar, NotificationCallback<lzj> notificationCallback) {
        try {
            NotificationContentProviderUtil.a(lzjVar.f(), lzjVar.e());
            if (notificationCallback != null) {
                notificationCallback.onSuccess(lzjVar);
            }
        } catch (Exception e) {
            if (notificationCallback != null) {
                notificationCallback.onError(NotificationResult.GENERAL_ERROR, "保存应用开关失败: " + e.getMessage());
            }
        }
    }

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public void saveMainSwitch(int i, NotificationCallback<Integer> notificationCallback) {
        NotificationContentProviderUtil.b(i, true);
        if (notificationCallback != null) {
            notificationCallback.onSuccess(Integer.valueOf(i));
        }
    }
}
