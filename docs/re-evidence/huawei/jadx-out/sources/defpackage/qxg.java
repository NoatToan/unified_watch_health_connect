package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.systemmanager.notificationmanager.HwNotificationManagerEx;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qxg {
    private static boolean e = false;

    public static boolean a(lzj lzjVar) {
        if (lzjVar == null) {
            LogUtil.j("NotificationUiUtil", "isSystemNotificationOpen appInfo is null");
            return true;
        }
        if (lzjVar.a() != -1) {
            return d(lzjVar.f(), lzjVar.a());
        }
        return true;
    }

    public static boolean d(String str, int i) {
        boolean zAreNotificationsEnabledForPackage = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            zAreNotificationsEnabledForPackage = HwNotificationManagerEx.getNotificationManager().areNotificationsEnabledForPackage(str, i);
        } catch (RemoteException | SecurityException unused) {
            LogUtil.e("NotificationUiUtil", "checkAuthorityInSystem RemoteException exception");
        }
        LogUtil.a("NotificationUiUtil", str, " whose packageUid is: ", Integer.valueOf(i), ",status in system is: ", Boolean.valueOf(zAreNotificationsEnabledForPackage));
        return zAreNotificationsEnabledForPackage;
    }

    public static int d(PackageManager packageManager, String str) {
        if (packageManager == null || TextUtils.isEmpty(str)) {
            LogUtil.j("NotificationUiUtil", "getUidByPackageName error");
            return -1;
        }
        if (CommonUtil.at()) {
            try {
                return packageManager.getPackageUid(str, 0);
            } catch (PackageManager.NameNotFoundException unused) {
                LogUtil.e("NotificationUiUtil", "PackageManager NameNotFoundException");
            }
        }
        return -1;
    }

    public static String d(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getPackageInfo(str, 0).applicationInfo.loadLabel(packageManager).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("NotificationUiUtil", "getAppName NameNotFoundException");
            return "";
        }
    }

    public static List<lzj> c(List<lzj> list) {
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        int size = cio.f1619a.size();
        for (int i = 0; i < list.size(); i++) {
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    if (cio.f1619a.get(i2).equals(list.get(i).f())) {
                        arrayList.add(list.get(i));
                        break;
                    }
                    i2++;
                } else {
                    arrayList2.add(Integer.valueOf(i));
                    break;
                }
            }
        }
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(list.get(((Integer) arrayList2.get(i3)).intValue()));
        }
        arrayList2.clear();
        return arrayList;
    }

    public static boolean h() {
        DeviceInfo deviceInfoD = mgg.d("NotificationUiUtil");
        if (deviceInfoD == null) {
            LogUtil.j("NotificationUiUtil", "isSupportNotifyReminderCollaborate deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfoD, 33);
    }

    public static boolean j() {
        DeviceInfo deviceInfoD = mgg.d("NotificationUiUtil");
        if (deviceInfoD == null) {
            LogUtil.j("NotificationUiUtil", "isSupportNotifyReminderSwitchClose deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfoD, 121);
    }

    public static boolean i() {
        return g() || b();
    }

    public static boolean g() {
        DeviceInfo deviceInfoD = mgg.d("NotificationUiUtil");
        if (deviceInfoD == null) {
            LogUtil.j("NotificationUiUtil", "isSupportSyncIconOld deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfoD, 17);
    }

    public static boolean b() {
        DeviceInfo deviceInfoD = mgg.d("NotificationUiUtil");
        if (deviceInfoD == null) {
            LogUtil.j("NotificationUiUtil", "isSupportAddIconTimestamp deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfoD, 77);
    }

    public static boolean f() {
        DeviceInfo deviceInfoD = mgg.d("NotificationUiUtil");
        if (deviceInfoD == null) {
            LogUtil.j("NotificationUiUtil", "isSupportHarmonyNotificationCollaboration deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfoD, Constants.MAX_PRO_BOTTOM_MARGIN_PAD);
    }

    public static boolean c() {
        Intent intent = new Intent();
        intent.setAction("com.huawei.action.NOTIFICATION_DECISION_CENTER");
        List<ResolveInfo> listQueryIntentContentProviders = BaseApplication.getContext().getPackageManager().queryIntentContentProviders(intent, 0);
        if (listQueryIntentContentProviders != null && !listQueryIntentContentProviders.isEmpty()) {
            return true;
        }
        LogUtil.j("NotificationUiUtil", "isPhoneHarmonyNotificationCollaboration resolveInfoList is empty");
        return false;
    }

    public static void d() {
        e = false;
        mhs.a().getSwitchSetting("switch_silent_notify_using_phone", new IBaseResponseCallback() { // from class: qxm
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                qxg.e(i, obj);
            }
        });
    }

    static /* synthetic */ void e(int i, Object obj) {
        LogUtil.a("NotificationUiUtil", "getNotificationRedDotStatus errorCode:", Integer.valueOf(i));
        if (i == 0) {
            if (!(obj instanceof String)) {
                LogUtil.a("NotificationUiUtil", "getNotificationRedDotStatus objectData not instanceof String");
                return;
            }
            boolean zEquals = "0".equals(obj);
            LogUtil.a("NotificationUiUtil", "getNotificationRedDotStatus isNewSwitchEnable:", Boolean.valueOf(!zEquals));
            if (zEquals) {
                return;
            }
            o();
            return;
        }
        n();
    }

    private static void n() {
        mhs.a().getSwitchSetting("lock_screen_reminder_switch", new IBaseResponseCallback() { // from class: qxp
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                qxg.d(i, obj);
            }
        });
    }

    static /* synthetic */ void d(int i, Object obj) {
        LogUtil.a("NotificationUiUtil", "getReminderOldSwitch errorCode:", Integer.valueOf(i));
        if (i == 0 && (obj instanceof String)) {
            boolean zEquals = "0".equals(obj);
            LogUtil.a("NotificationUiUtil", "getReminderOldSwitch isNewSwitchEnable:", Boolean.valueOf(zEquals));
            if (zEquals) {
                o();
            }
        }
    }

    private static void o() {
        mhs.a().getSwitchSetting("switch_smart_notify_reminder", new IBaseResponseCallback() { // from class: qxo
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                qxg.a(i, obj);
            }
        });
    }

    static /* synthetic */ void a(int i, Object obj) {
        LogUtil.a("NotificationUiUtil", "getSmartSwitchStatus errorCode:", Integer.valueOf(i));
        if (i != 0) {
            e = true;
        }
    }

    public static boolean a() {
        return e && c() && f();
    }

    public static String e() {
        String str;
        String deviceIdentify;
        GRSManager gRSManagerC = GRSManager.c(BaseApplication.getContext());
        String countryCode = gRSManagerC.getCountryCode();
        String noCheckUrl = gRSManagerC.getNoCheckUrl("helpCustomerUrl", countryCode);
        String noCheckUrl2 = gRSManagerC.getNoCheckUrl("domainTipsResDbankcdn", countryCode);
        String noCheckUrl3 = gRSManagerC.getNoCheckUrl("domainTipsResDbankcdnNew", countryCode);
        if (TextUtils.isEmpty(noCheckUrl3)) {
            LogUtil.j("NotificationUiUtil", "Get URL oversea is null");
        }
        if (TextUtils.isEmpty(noCheckUrl2)) {
            LogUtil.j("NotificationUiUtil", "Get URL is null");
        }
        if (noCheckUrl2.contains("drcn")) {
            LogUtil.a("NotificationUiUtil", "The location is domestic");
        } else if (noCheckUrl2.contains("dra")) {
            noCheckUrl2 = noCheckUrl2 + "/handbook";
        } else {
            LogUtil.a("NotificationUiUtil", "Get URL completed");
        }
        int iN = CommonUtil.n(BaseApplication.getContext(), LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009));
        LogUtil.a("NotificationUiUtil", "getNotificationTipUrl siteId:", Integer.valueOf(iN));
        if (iN == 1) {
            if (LanguageUtil.l(BaseApplication.getContext())) {
                str = noCheckUrl + "/hwtips/browser?lang=zh-CN&prodId=health_help_all&title=%E5%8D%8E%E4%B8%BA%E6%88%96%E4%B8%89%E6%96%B9%E5%AE%89%E5%8D%93%E6%89%8B%E6%9C%BA%E6%B6%88%E6%81%AF%E6%97%A0%E6%B3%95%E6%8E%A8%E9%80%81%E5%88%B0%E7%A9%BF%E6%88%B4%E8%AE%BE%E5%A4%87%E6%80%8E%E4%B9%88%E5%8A%9E&url=https%3A%2F%2Fconsumer-tkb.huawei.com%2Fweknow%2Fservlet%2Fshow%2FknowContextServlet%3FknowId%3Dzh-cn15958978";
            } else {
                str = noCheckUrl + "/hwtips/browser?lang=en-US&prodId=health_help_all&title=Unable%20to%20receive%20messages%20after%20my%20wearable%20device%20is%20connected%20to%20a%20HUAWEI%20or%20third-party%20Android%20phone&url=https%3A%2F%2Fconsumer-tkb.huawei.com%2Fweknow%2Fservlet%2Fshow%2FknowContextServlet%3FknowId%3Den-us15945721";
            }
        } else if (CommonUtil.aa(BaseApplication.getContext())) {
            DeviceInfo deviceInfoC = mgg.c("NotificationUiUtil");
            if (deviceInfoC == null) {
                deviceIdentify = "";
            } else {
                deviceIdentify = deviceInfoC.getDeviceIdentify();
            }
            DeviceCapability deviceCapabilityA = eej.a(deviceIdentify);
            if (deviceCapabilityA != null && deviceCapabilityA.isAvoidDisturb()) {
                str = noCheckUrl2 + "/Android_Note_fr_FR/EMUI8.0/C001B001/fr-FR/index.html";
            } else {
                str = noCheckUrl2 + "/Android_Note_fr_FR/EMUI8.0/C001B001/fr-FR/index2.html";
            }
        } else if (c(noCheckUrl2) && LanguageUtil.p(BaseApplication.getContext())) {
            str = noCheckUrl2 + "/Android_Note_en/EMUI8.0/C001B001/de-DE/index.html";
        } else {
            str = noCheckUrl3 + "/handbook/Jumppage/EMUI8.0/C001B001/en-US/index.html?lang=%s&devicetype=Notification".replace("lang=%s", "lang=" + l());
        }
        LogUtil.a("NotificationUiUtil", "getNoPushTipUrl ", str);
        return str;
    }

    private static boolean c(String str) {
        return !TextUtils.isEmpty(str) && str.contains("dra");
    }

    private static String l() {
        String str = LanguageUtil.b(BaseApplication.getContext()) + Constants.LINK + BaseApplication.getContext().getResources().getConfiguration().locale.getCountry();
        LogUtil.a("NotificationUiUtil", "getLanguageTag languageTag is: ", str);
        return str;
    }
}
