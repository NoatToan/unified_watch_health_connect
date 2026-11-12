package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.service.HandleIntentService;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.device.activity.notification.data.storage.NotificationCallback;
import com.huawei.ui.device.activity.notification.data.storage.NotificationStorage;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.MagicBuild;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qyb implements NotificationStorage {
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

    public void c(boolean z, boolean z2) {
        if (MagicBuild.f36615a && !CommonUtil.v(BaseApplication.getContext())) {
            LogUtil.j("DeviceStrategy", "recordNotificationToLocal isNewHonor oversea phone return");
            return;
        }
        DeviceCapability deviceCapabilityA = eej.a(d().getDeviceIdentify());
        if (deviceCapabilityA == null || !deviceCapabilityA.isSupportMidware()) {
            return;
        }
        lzi.a().a(z, z2);
    }

    private DeviceInfo d() {
        DeviceInfo deviceInfoD = mgg.d("DeviceStrategy");
        return deviceInfoD == null ? new DeviceInfo() : deviceInfoD;
    }

    public void a(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) HandleIntentService.class);
        if (cio.e.contains(str) || cio.d.equals(str)) {
            LogUtil.a("DeviceStrategy", "enter syncDefaultSwitchStatus");
            intent.setPackage(context.getPackageName());
            intent.setAction("com.huawei.health.ACTION_NOTIFICATION_ENABLE_PUSH");
            Bundle bundle = new Bundle();
            bundle.putString("notificationEnablePushType", "notificationEnablePushSubSwitch");
            intent.putExtras(bundle);
            context.startService(intent);
        }
    }

    public void b(Context context, String str) {
        if (qxg.i()) {
            LogUtil.a("DeviceStrategy", "is support notification push icon.");
            Bundle bundle = new Bundle();
            bundle.putString("packageName", str);
            bundle.putString("notificationSwitchChangeType", "subNotificationSwitchChangeType");
            a(context, bundle);
        }
    }

    public void d(Context context) {
        Bundle bundle = new Bundle();
        bundle.putString("notificationSwitchChangeType", "notification_collaborate_switch_change");
        a(context, bundle);
    }

    private void a(Context context, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) HandleIntentService.class);
        intent.setPackage(context.getPackageName());
        intent.setAction("com.huawei.bone.ACTION_NOTIFICATION_PUSH");
        intent.putExtras(bundle);
        context.startService(intent);
    }

    public void d(boolean z) {
        DeviceCapability deviceCapabilityA = eej.a(d().getDeviceIdentify());
        if (deviceCapabilityA == null || !deviceCapabilityA.isSupportMessageAlertInfo()) {
            LogUtil.j("DeviceStrategy", "createNotificationEnableIntent currentDevice is not support notification");
            return;
        }
        boolean zD = lzi.a().d();
        LogUtil.a("DeviceStrategy", "createNotificationEnableIntent notificationStatus is ", Boolean.valueOf(zD), ",isTurnOnSwitch is.", Boolean.valueOf(z));
        try {
            BaseApplication.getContext().startService(d(z, zD));
        } catch (IllegalStateException | SecurityException e) {
            LogUtil.e("DeviceStrategy", "createNotificationEnableIntent", LogAnonymous.b(e));
            xjt.ag("createNotificationEnableIntent error");
        }
    }

    private static Intent d(boolean z, boolean z2) {
        Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) HandleIntentService.class);
        intent.setAction("com.huawei.health.ACTION_NOTIFICATION_ENABLE_PUSH");
        intent.putExtra("notificationEnablePushType", "notificationEnablePushMainSwitch");
        intent.putExtra("notificationEnableStatus", z2);
        intent.putExtra("notificationEnableTurnOnSwitch", z);
        return intent;
    }

    public void a(String str) {
        LogUtil.a("DeviceStrategy", "sendSmartSwitchStatus enter");
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("DeviceStrategy", "status is null");
            return;
        }
        DeviceInfo deviceInfoC = mgg.c("DeviceStrategy");
        if (deviceInfoC == null) {
            LogUtil.a("DeviceStrategy", "curDeviceInfo is null");
            return;
        }
        eef eefVar = new eef();
        eefVar.setSrcPkgName("hw.health.smartNotifyReminder");
        eefVar.setWearPkgName("hw.watch.message.smartNotifyReminder");
        eefVar.setCommandId(1);
        eeg eegVar = new eeg();
        eegVar.b(900500010L);
        eegVar.b(1);
        eegVar.d(eeq.c(eeq.d(1) + eeq.d(1) + eeq.d(CommonUtil.n(BaseApplication.getContext(), str))));
        eegVar.c(Long.valueOf(System.currentTimeMillis()));
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(eegVar);
        eefVar.setConfigInfoList(arrayList);
        edc.e().sendSampleConfigCommand(deviceInfoC, eefVar, "DeviceStrategy");
    }

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public void saveMainSwitch(int i, NotificationCallback<Integer> notificationCallback) {
        d(i == 1);
        e();
        if (notificationCallback != null) {
            notificationCallback.onSuccess(Integer.valueOf(i));
        }
    }

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public void saveAppSwitch(lzj lzjVar, NotificationCallback<lzj> notificationCallback) {
        if (cio.d.equals(lzjVar.f())) {
            LogUtil.a("DeviceStrategy", "enter saveAppSwitch reportAppStatus");
            c(lzi.a().d(), lzjVar.e() == 1);
        }
        a(BaseApplication.getContext(), lzjVar.f());
        if (lzjVar.e() == 1) {
            b(BaseApplication.getContext(), lzjVar.f());
        }
    }

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public void setNotifyReminderMode(int i, NotificationCallback<Boolean> notificationCallback) {
        a(String.valueOf(i));
        d(BaseApplication.getContext());
    }

    public void e() {
        if (qxg.i()) {
            LogUtil.a("DeviceStrategy", "is support notification push icon.");
            Bundle bundle = new Bundle();
            bundle.putString("notificationSwitchChangeType", "notificationSwitchChangeType");
            a(BaseApplication.getContext(), bundle);
        }
    }

    public boolean a() {
        return eey.d(d(), Constants.MAX_PRO_BOTTOM_MARGIN_PAD);
    }

    public boolean c() {
        return eey.d(d(), 33);
    }
}
