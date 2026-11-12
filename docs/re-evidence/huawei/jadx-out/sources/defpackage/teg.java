package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homewear21.home.legal.WearHomeLegalInformationActivity;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Utils;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes17.dex */
public class teg {
    private static ConcurrentHashMap<String, String> d = new ConcurrentHashMap<>();

    public static boolean c(int i) {
        return i > 0 && i <= 100;
    }

    public static void a(final Activity activity) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: ted
            @Override // java.lang.Runnable
            public final void run() {
                teg.d(activity);
            }
        });
    }

    /* JADX INFO: renamed from: teg$5, reason: invalid class name */
    class AnonymousClass5 implements GrsQueryCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f49020c;

        AnonymousClass5(Activity activity) {
            this.f49020c = activity;
        }

        @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
        public void onCallBackSuccess(String str) {
            if (TextUtils.isEmpty(str)) {
                ReleaseLogUtil.d("R_DeviceDisplayUtil", "startLearnMore baseUrl is empty");
                return;
            }
            boolean zL = LanguageUtil.l(this.f49020c);
            boolean zO = Utils.o();
            final StringBuilder sb = new StringBuilder();
            sb.append(Constants.OPEN_HEALTH_SPORT_PREFIX);
            sb.append(str);
            if (!zO && zL) {
                sb.append("/hwtips/scene/deviceList?lang=zh-cn");
            } else {
                sb.append("/hwtips/scene/deviceList?lang=en-us");
            }
            sb.append("&forceDarkMode=0&maxFontScale=1&isExpandBottomArea=true&isNeedLogin=false");
            ReleaseLogUtil.c("R_DeviceDisplayUtil", "startLearnMore isChineseSimplified:", Boolean.valueOf(zL), " isOversea:", Boolean.valueOf(zO), " deeplink:", sb.toString());
            Activity activity = this.f49020c;
            if (activity == null || activity.isFinishing() || this.f49020c.isDestroyed()) {
                return;
            }
            final Activity activity2 = this.f49020c;
            activity2.runOnUiThread(new Runnable() { // from class: tei
                @Override // java.lang.Runnable
                public final void run() {
                    AppRouter.e(Uri.parse(sb.toString())).b(activity2);
                }
            });
        }

        @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
        public void onCallBackFail(int i) {
            ReleaseLogUtil.d("R_DeviceDisplayUtil", "startLearnMore resultCode:", Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Activity activity) {
        GRSManager.c(activity).d("helpCustomerUrl", new AnonymousClass5(activity));
    }

    public static String e() {
        String strF;
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        int i3 = (i * 60) + i2;
        if (i3 >= 300 && i3 < 480) {
            strF = qre.f(R.string.IDS_device_guide_title_early_morning);
        } else if (i3 >= 480 && i3 < 720) {
            strF = qre.f(R.string.IDS_device_guide_title_morning);
        } else if (i3 >= 720 && i3 < 1140) {
            strF = qre.f(R.string.IDS_device_guide_title_afternoon);
        } else {
            strF = qre.f(R.string.IDS_device_guide_title_evening);
        }
        ReleaseLogUtil.c("R_DeviceDisplayUtil", "getGreeting hour:", Integer.valueOf(i), " minute:", Integer.valueOf(i2), " greeting:", strF);
        return strF;
    }

    public static boolean c(DeviceInfo deviceInfo) {
        Objects.isNull(deviceInfo);
        if (deviceInfo == null) {
            ReleaseLogUtil.d("R_DeviceDisplayUtil", "isSupportEar deviceInfo is null");
            return false;
        }
        boolean zD = eey.d(deviceInfo, 112);
        ReleaseLogUtil.c("R_DeviceDisplayUtil", "isSupportEar: ", Boolean.valueOf(zD));
        return zD;
    }

    public static String d(DeviceInfo deviceInfo) {
        String deviceName = deviceInfo.getDeviceName();
        ReleaseLogUtil.c("R_DeviceDisplayUtil", "getDeviceName is ", deviceName);
        if (lut.a().e(deviceInfo)) {
            if (TextUtils.isEmpty(deviceName)) {
                return "";
            }
        } else {
            if (TextUtils.isEmpty(deviceName)) {
                return "";
            }
            if (deviceName.contains(com.huawei.openalliance.ad.constant.Constants.LINK)) {
                return deviceName.substring(0, deviceName.lastIndexOf(com.huawei.openalliance.ad.constant.Constants.LINK));
            }
        }
        return deviceName;
    }

    public static void e(final Activity activity, final DeviceInfo deviceInfo) {
        SimpleChain.b("DeviceDisplayUtil").e(new SimpleChain.INext() { // from class: tel
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
            public final void onNext(SimpleChain.Emitter emitter, Object[] objArr) {
                Executors.newCachedThreadPool().execute(new Runnable() { // from class: tec
                    @Override // java.lang.Runnable
                    public final void run() {
                        teg.c(deviceInfo, emitter);
                    }
                });
            }
        }).d(new SimpleChain.Emitter() { // from class: teh
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                teg.c(deviceInfo, activity, objArr);
            }
        }, new Object[0]);
    }

    static /* synthetic */ void c(DeviceInfo deviceInfo, SimpleChain.Emitter emitter) {
        String strD = tqu.e().d(deviceInfo);
        d.put(deviceInfo.getDeviceIdentify(), strD);
        if (!TextUtils.isEmpty(strD)) {
            emitter.onSuccess(new Object[0]);
        } else {
            emitter.onError("jumpPageToHelp errorCode: url is empty");
        }
    }

    static /* synthetic */ void c(DeviceInfo deviceInfo, final Activity activity, Object[] objArr) {
        final String str = d.get(deviceInfo.getDeviceIdentify());
        LogUtil.d("DeviceDisplayUtil", "openAppHelpActivity url is:", str);
        final Uri uri = Uri.parse(str);
        final boolean zEquals = "huaweischeme".equals(uri.getScheme());
        if (activity == null) {
            LogUtil.j("DeviceDisplayUtil", "startHelpActivity activity is null");
        } else {
            activity.runOnUiThread(new Runnable() { // from class: tek
                @Override // java.lang.Runnable
                public final void run() {
                    teg.e(activity, zEquals, uri, str);
                }
            });
        }
    }

    static /* synthetic */ void e(Activity activity, boolean z, Uri uri, String str) {
        if (activity.isFinishing() || activity.isDestroyed()) {
            LogUtil.j("DeviceDisplayUtil", "startHelpActivity activity can not be used");
            return;
        }
        if (z) {
            LogUtil.d("DeviceDisplayUtil", "startHelpActivity go to HwHealthBrowserActionActivity");
            AppRouter.e(uri).b(BaseApplication.getContext());
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(dmz.y);
        intent.setClassName(dmz.y, "com.huawei.operation.activity.WebViewActivity");
        intent.putExtra("url", str);
        intent.putExtra(Constants.JUMP_MODE_KEY, 0);
        iov.d(activity, intent);
    }

    public static String c(int i, boolean z) {
        if (z) {
            return i + "%";
        }
        if (!c(i)) {
            return "--";
        }
        return i + "%";
    }

    public static void c(Activity activity, String str, Bundle bundle) {
        if (activity == null) {
            LogUtil.j("DeviceDisplayUtil", "gotoWearHomeLegalInformationActivity activity is empty");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("DeviceDisplayUtil", "gotoWearHomeLegalInformationActivity subMac is empty");
            sty.e().b(bundle, activity);
            return;
        }
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "R_DeviceDisplayUtil");
        if (CollectionUtils.a(deviceList)) {
            LogUtil.a("DeviceDisplayUtil", "gotoWearHomeLegalInformationActivity deviceInfoList is empty");
            b(activity);
            qpx.e(activity, R.string.legal_information_device_not_connected);
            return;
        }
        String strReplaceAll = str.replaceAll(":", "");
        for (DeviceInfo deviceInfo2 : deviceList) {
            String strReplaceAll2 = deviceInfo2.getDeviceIdentify().replaceAll(":", "");
            if (!TextUtils.isEmpty(strReplaceAll2) && strReplaceAll2.endsWith(strReplaceAll)) {
                LogUtil.a("DeviceDisplayUtil", "gotoWearHomeLegalInformationActivity find the device");
                deviceInfo = deviceInfo2;
                break;
            }
        }
        if (deviceInfo == null) {
            LogUtil.j("DeviceDisplayUtil", "gotoWearHomeLegalInformationActivity not find the device");
            b(activity);
            qpx.e(activity, R.string.legal_information_device_not_connected);
        } else {
            LogUtil.a("DeviceDisplayUtil", "gotoWearHomeLegalInformationActivity deviceConnectStatus: ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
            a(activity, deviceInfo);
        }
    }

    private static void a(Activity activity, DeviceInfo deviceInfo) {
        if (deviceInfo.getDeviceConnectState() == 2) {
            Intent intent = new Intent();
            intent.setClass(activity, WearHomeLegalInformationActivity.class);
            intent.putExtra("device_id", deviceInfo.getDeviceIdentify());
            intent.putExtra("device_name", deviceInfo.getDeviceName());
            intent.putExtra("product_type", deviceInfo.getProductType());
            iov.d(activity, intent);
            return;
        }
        boolean zC = qst.c();
        LogUtil.a("DeviceDisplayUtil", "gotoWearHomeLegalInformationActivity isNewUi: ", Boolean.valueOf(zC));
        if (zC) {
            b(activity);
        } else {
            Intent intent2 = new Intent();
            intent2.setClassName(activity, "com.huawei.ui.homewear21.home.WearHomeActivity");
            intent2.putExtra("device_id", deviceInfo.getDeviceIdentify());
            intent2.putExtra("FROM_APP_HOME_PAGE_TYPE", true);
            iov.d(activity, intent2);
            tqp.e(activity);
        }
        qpx.e(activity, R.string.legal_information_device_not_connected);
    }

    private static void b(Activity activity) {
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.getAppPackage(), BaseApplication.getAppPackage() + ".MainActivity");
        intent.setFlags(67108864);
        intent.putExtra(Constants.HOME_TAB_NAME, Constants.HOME_TAB_DEVICE);
        intent.putExtra("SHORTCUT", "SC_DEVICE");
        iov.d(activity, intent);
    }
}
