package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.outofprocess.util.NotificationContentProviderUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lzi extends HwBaseManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static lzi f41196c;
    private static final Object d = new Object();
    private Context e;

    private lzi(Context context) {
        super(context);
        this.e = context;
    }

    public static lzi a() {
        lzi lziVar;
        synchronized (d) {
            if (f41196c == null) {
                f41196c = new lzi(BaseApplication.getContext());
            }
            lziVar = f41196c;
        }
        return lziVar;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 2;
    }

    public void a(String str, int i, boolean z) {
        ReleaseLogUtil.d("R_DEVMGR_HwNotificationManager", "setAuthorizeStatus: ", Integer.valueOf(i), " isHarmonyOS30SendNotify:", Boolean.valueOf(z));
        mhs.a().setSwitchSettingToLocal(str, String.valueOf(i), 10035);
        NotificationContentProviderUtil.b(i, z);
    }

    public boolean d() {
        String switchSettingFromLocal = mhs.a().getSwitchSettingFromLocal("notificationStatus", 10035);
        boolean zA = mir.a();
        if (CommonUtil.ap()) {
            LogUtil.a("HwNotificationManager", "isAuthorizeEnabled value is null, isEnabled: ", Boolean.valueOf(zA));
        }
        if (!TextUtils.isEmpty(switchSettingFromLocal)) {
            ReleaseLogUtil.d("R_DEVMGR_HwNotificationManager", "isAuthorizeEnabled value is: ", switchSettingFromLocal);
            try {
                return Integer.parseInt(switchSettingFromLocal) == 1;
            } catch (NumberFormatException unused) {
                LogUtil.e("HwNotificationManager", "isAuthorizeEnabled NumberFormatException");
                return false;
            }
        }
        ReleaseLogUtil.d("R_DEVMGR_HwNotificationManager", "isAuthorizeEnabled value is null, isEnabled:", Boolean.valueOf(zA));
        if (zA) {
            a("notificationStatus", 1, false);
            return true;
        }
        a("notificationStatus", 0, false);
        return false;
    }

    public int c(String str) {
        String switchSettingFromLocal = mhs.a().getSwitchSettingFromLocal(str, 10001);
        LogUtil.a("HwNotificationManager", "getAppPushEnable packageName: ", str, ", value: ", switchSettingFromLocal);
        if (TextUtils.isEmpty(switchSettingFromLocal)) {
            return 0;
        }
        return CommonUtil.n(BaseApplication.getContext(), switchSettingFromLocal);
    }

    public void d(String str, int i) {
        if (TextUtils.equals("com.tencent.mm", str) || TextUtils.equals("com.android.mms", str) || TextUtils.equals("com.tencent.mobileqq", str) || TextUtils.equals(cio.d, str)) {
            ReleaseLogUtil.d("R_DEVMGR_HwNotificationManager", "setAppPushEnable packageName:", str, " closeStatus:", Integer.valueOf(i));
        }
        mhs.a().setSwitchSettingToLocal(str, String.valueOf(i), 10001);
        if (!d()) {
            LogUtil.j("HwNotificationManager", "setAppPushEnable not authorizeEnabled so return ", str);
        } else {
            NotificationContentProviderUtil.a(str, i);
        }
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public boolean onDataMigrate() {
        int i;
        LogUtil.a("HwNotificationManager", "onDataMigrate enter");
        SharedPreferences sharedPreferences = this.e.getSharedPreferences("notification_setting_preferences", 0);
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        PackageManager packageManager = this.e.getPackageManager();
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        Collections.sort(listQueryIntentActivities, new ResolveInfo.DisplayNameComparator(packageManager));
        for (int i2 = 0; i2 < listQueryIntentActivities.size(); i2++) {
            ActivityInfo activityInfo = listQueryIntentActivities.get(i2).activityInfo;
            String str = activityInfo.packageName;
            String string = activityInfo.loadLabel(packageManager).toString();
            if (!TextUtils.equals(str, string) && (i = sharedPreferences.getInt(str, 0)) == 1) {
                LogUtil.d("HwNotificationManager", "onDataMigrate:", string, ",", str, ",", Integer.valueOf(i2));
                d(str, i);
            }
        }
        return true;
    }

    public void a(boolean z, boolean z2) {
        LogUtil.a("HwNotificationManager", "reportAppStatus isNotification:", Boolean.valueOf(z), " isPrompt:", Boolean.valueOf(z2));
        mhs.a().sendSetSwitchSettingCmd(c(z, z2), "", 33, 1);
    }

    public byte[] c(boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder(16);
        sb.append(eeq.d(2));
        sb.append(eeq.d(2));
        sb.append(eeq.d(1));
        sb.append(eeq.d(z ? 1 : 0));
        sb.append(eeq.d(2));
        sb.append(eeq.d(2));
        sb.append(eeq.d(2));
        sb.append(eeq.d(1));
        sb.append(eeq.d(2));
        sb.append(eeq.d(2));
        sb.append(eeq.d(3));
        sb.append(eeq.d(z2 ? 1 : 0));
        String str = eeq.d(129) + eeq.d(sb.toString().length() / 2) + sb.toString();
        LogUtil.a("HwNotificationManager", "packageCommand: ", str);
        return eeq.c(str);
    }

    public boolean b() {
        if (lvb.e() != null) {
            return mev.d().b();
        }
        return true;
    }

    public void b(boolean z, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HwNotificationManager", "setWearPushSwitchStatus isEnable: ", Boolean.valueOf(z));
        mev.d().c(z, iBaseResponseCallback);
    }

    public void e(DeviceInfo deviceInfo) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
            LogUtil.j("HwNotificationManager", "autoSetUp deviceInfo is invalid");
            return;
        }
        DeviceCapability deviceCapabilityA = eej.a(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityA == null || !deviceCapabilityA.isSupportMessageAlertInfo()) {
            LogUtil.a("HwNotificationManager", "autoSetUp currentDevice is not support notification");
            return;
        }
        boolean zD = d();
        LogUtil.a("HwNotificationManager", "autoSetUp isAuthorizeEnabled: ", Boolean.valueOf(zD));
        DeviceCommand deviceCommandA = mir.a(zD, "HwNotificationManager");
        deviceCommandA.setmIdentify(deviceInfo.getDeviceIdentify());
        lvb.e().c(deviceCommandA);
    }

    public void a(String str) {
        LogUtil.a("HwNotificationManager", "sendSmartSwitchStatus enter");
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("HwNotificationManager", "status is null");
            return;
        }
        DeviceInfo deviceInfoC = mgg.c("HwNotificationManager");
        if (deviceInfoC == null) {
            LogUtil.a("HwNotificationManager", "curDeviceInfo is null");
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
        edc.e().sendSampleConfigCommand(deviceInfoC, eefVar, "HwNotificationManager");
    }
}
