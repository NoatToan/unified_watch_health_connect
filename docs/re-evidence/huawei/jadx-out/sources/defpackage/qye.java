package defpackage;

import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.device.activity.notification.data.storage.NotificationCallback;
import com.huawei.ui.device.activity.notification.data.storage.NotificationResult;
import com.huawei.ui.device.activity.notification.data.storage.NotificationStorage;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qye implements NotificationStorage {
    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public void getAppSwitch(List<lzj> list, NotificationCallback<List<lzj>> notificationCallback) {
    }

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public void getNotifyReminderMode(int i, NotificationCallback<Integer> notificationCallback) {
    }

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public void setNotifyReminderMode(int i, NotificationCallback<Boolean> notificationCallback) {
    }

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public int getAppSwitch(String str) {
        return lzi.a().c(str);
    }

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public void saveAppSwitch(lzj lzjVar, NotificationCallback<lzj> notificationCallback) {
        mhs.a().setSwitchSettingToLocal(lzjVar.f(), String.valueOf(lzjVar.e()), 10001);
    }

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public void saveMainSwitch(int i, NotificationCallback<Integer> notificationCallback) {
        mhs.a().setSwitchSettingToLocal("notificationStatus", String.valueOf(i), 10035);
        if (notificationCallback != null) {
            notificationCallback.onSuccess(Integer.valueOf(i));
        }
    }

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public void getMainSwitch(NotificationCallback<Boolean> notificationCallback) {
        String switchSettingFromLocal = mhs.a().getSwitchSettingFromLocal("notificationStatus", 10035);
        if (!TextUtils.isEmpty(switchSettingFromLocal)) {
            ReleaseLogUtil.d("R_LocalStrategy", "isAuthorizeEnabled value is: ", switchSettingFromLocal);
            try {
                boolean z = true;
                if (Integer.parseInt(switchSettingFromLocal) != 1) {
                    z = false;
                }
                notificationCallback.onSuccess(Boolean.valueOf(z));
                return;
            } catch (NumberFormatException unused) {
                LogUtil.j("LocalStrategy", "isAuthorizeEnabled NumberFormatException");
                notificationCallback.onError(NotificationResult.MAIN_LOCAL_ERROR, "");
                return;
            }
        }
        LogUtil.j("LocalStrategy", "getMainSwitch value is empty");
        notificationCallback.onError(NotificationResult.MAIN_LOCAL_ERROR, "");
    }

    public String a(String str) {
        return mhs.a().getSwitchSettingFromLocal(str, 10001);
    }

    public void c() {
        lzl.a(BaseApplication.getContext()).c(true, true);
    }

    public void d() {
        mhs.a().setSwitchSettingToLocal("KEY_NOTIFICATION_SETTINGS_FIRST_OPEN_FLAG", "true", 10001);
    }

    public void e() {
        mhs.a().setSwitchSettingToLocal("KEY_NOTIFICATION_SETTINGS_FIRST_OPEN_FLAG_ADD", "true", 10001);
    }
}
