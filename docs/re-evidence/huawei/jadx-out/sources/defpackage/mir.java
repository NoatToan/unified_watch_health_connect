package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.outofprocess.util.NotificationContentProviderUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.AiCoreSdkConstant;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.ui.commonui.R;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.MagicBuild;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class mir {
    private static boolean d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f41722a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<String, ArrayList<Long>> f41723c = new ConcurrentHashMap(16);
    private static Handler e = new Handler(Looper.getMainLooper()) { // from class: mir.5
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 10) {
                return;
            }
            LogUtil.a("HwNotificationUtil", "handleMessage negotiate again");
            if (message.obj instanceof DeviceInfo) {
                LogUtil.a("HwNotificationUtil", "handleMessage negotiate autoSetup");
                nbt.b().c((DeviceInfo) message.obj, false);
            }
        }
    };

    public static boolean b() {
        return d;
    }

    public static void a(boolean z) {
        d = z;
    }

    private mir() {
    }

    public static DeviceCommand a(boolean z, String str) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(2);
        deviceCommand.setCommandID(4);
        byte[] bArrC = eeq.c((eeq.d(129) + eeq.d(6)) + (eeq.d(2) + eeq.d(1) + eeq.d(z ? 1 : 0)) + (eeq.d(3) + eeq.d(1) + eeq.d(z ? 1 : 0)));
        deviceCommand.setDataLen(bArrC.length);
        deviceCommand.setDataContent(bArrC);
        LogUtil.a(str, "NotificationEable deviceCommand," + ((eeq.d(deviceCommand.getServiceID()) + eeq.d(deviceCommand.getCommandID())) + eeq.e(deviceCommand.getDataContent())));
        return deviceCommand;
    }

    public static ContentResolver b(Context context, String str) {
        String str2;
        if (CommonUtil.bj() || (!CommonUtil.v(context) && MagicBuild.f36615a)) {
            str2 = "com.hihonor.settings.action.OPEN_TO_EXTERNAL_APPS_PROVIDER";
        } else {
            str2 = "com.huawei.settings.action.OPEN_TO_EXTERNAL_APPS_PROVIDER";
        }
        LogUtil.a(str, "getNotificationEnableContentResolver action:", str2);
        Intent intent = new Intent(str2);
        intent.setPackage("com.android.settings");
        List<ResolveInfo> listQueryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(intent, 0);
        if (listQueryIntentContentProviders == null || listQueryIntentContentProviders.size() == 0) {
            LogUtil.a(str, "getNotificationEnableContentResolver no providers");
            xjt.ag("getNotificationEnableContentResolver no providers");
            return null;
        }
        Iterator<ResolveInfo> it = listQueryIntentContentProviders.iterator();
        while (it.hasNext()) {
            if (it.next().providerInfo.authority.equals("com.android.settings.open_to_externalapps")) {
                ContentResolver contentResolver = context.getContentResolver();
                LogUtil.a(str, "getNotificationEnableContentResolver find matched providers");
                return contentResolver;
            }
        }
        LogUtil.a(str, "getNotificationEnableContentResolver no matched providers");
        xjt.ag("getNotificationEnableContentResolver no matched providers");
        return null;
    }

    public static boolean d(ContentResolver contentResolver, boolean z, String str) {
        LogUtil.a(str, "setNotificationEnable,isOpen = " + z);
        if (contentResolver == null) {
            return false;
        }
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putString("operation", k.g);
        } else {
            bundle.putString("operation", "disable");
        }
        try {
            Bundle bundleCall = contentResolver.call(Uri.parse("content://com.android.settings.open_to_externalapps"), "changeNotificationAccessSettings", BaseApplication.getAppPackage(), bundle);
            if (bundleCall != null && bundleCall.getBoolean("is_operation_succ")) {
                return true;
            }
            LogUtil.a(str, "openNotification failed.");
            return false;
        } catch (IllegalArgumentException e2) {
            LogUtil.a(str, "some error in openNotificationEnable！" + e2.getMessage());
            xjt.ag("some error in openNotificationEnable");
            return false;
        } catch (SecurityException e3) {
            LogUtil.a(str, "some error in openNotificationEnable！" + e3.getMessage());
            xjt.ag("some error in openNotificationEnable");
            return false;
        }
    }

    public static Bitmap d(Context context, String str) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "mipmap", applicationInfo.packageName);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 2;
        return BitmapFactory.decodeResource(resources, identifier, options);
    }

    public static String c(String str) {
        try {
            PackageManager packageManager = BaseApplication.getContext().getPackageManager();
            return packageManager.getPackageInfo(str, 0).applicationInfo.loadLabel(packageManager).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("HwNotificationUtil", "getAppName NameNotFoundException");
            return "";
        }
    }

    public static PackageInfo b(String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = BaseApplication.getContext().getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("HwNotificationUtil", "getPackageInfo, NameNotFoundException.");
            packageInfo = null;
        }
        LogUtil.d("HwNotificationUtil", "getPackageInfo completed.");
        return packageInfo;
    }

    public static byte[] e(String str, Drawable drawable) {
        if (drawable == null && !TextUtils.isEmpty(str)) {
            LogUtil.j("HwNotificationUtil", "getBitmapByteArray iconDrawable is null. pkgName:", str);
            drawable = a(str);
        }
        if (!(drawable instanceof BitmapDrawable)) {
            LogUtil.j("HwNotificationUtil", "getBitmapByteArray, instanceof fail.");
            return new byte[0];
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        if (bitmap == null) {
            LogUtil.j("HwNotificationUtil", "getBitmapByteArray, bitmap is null.");
            return new byte[0];
        }
        return qqf.b(qqf.b(bitmap, 100, 100), true);
    }

    public static Drawable a(String str) {
        PackageManager packageManager = BaseApplication.getContext().getPackageManager();
        if (packageManager == null) {
            LogUtil.j("HwNotificationUtil", "getDrawableByPkgName packageManager is null");
            return null;
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo == null) {
                LogUtil.j("HwNotificationUtil", "getDrawableByPkgName packageInfo is null");
                return null;
            }
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null) {
                LogUtil.j("HwNotificationUtil", "getDrawableByPkgName applicationInfo is null");
                return null;
            }
            return packageManager.getApplicationIcon(applicationInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("HwNotificationUtil", "getDrawableByPkgName NameNotFoundException");
            return null;
        }
    }

    public static boolean a() {
        return d(BaseApplication.getContext().getPackageName());
    }

    public static boolean d(String str) {
        LogUtil.a("HwNotificationUtil", "packageName:", str);
        String string = Settings.Secure.getString(BaseApplication.getContext().getContentResolver(), "enabled_notification_listeners");
        if (TextUtils.isEmpty(string)) {
            if (CommonUtil.ap()) {
                OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("getFlagError", "Model:" + Build.MODEL + ", notificationAuthorizeEnable flag is empty, isHuaweiSystem " + CommonUtil.bg());
            }
            ReleaseLogUtil.e("DEVMGR_HwNotificationUtil", "notificationAuthorizeEnable flag is empty");
            return false;
        }
        for (String str2 : string.split(":")) {
            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str2);
            if (componentNameUnflattenFromString != null && TextUtils.equals(str, componentNameUnflattenFromString.getPackageName())) {
                LogUtil.a("HwNotificationUtil", "isNotificationAuthorizeEnabled packageName:", componentNameUnflattenFromString.getPackageName());
                return true;
            }
        }
        return false;
    }

    public static void b(StatusBarNotification statusBarNotification, String str) {
        int i;
        if (statusBarNotification == null) {
            LogUtil.j("HwNotificationUtil", "deviceReply StatusBarNotification is null");
            return;
        }
        Notification.Action[] actionArr = statusBarNotification.getNotification().actions;
        String str2 = "deviceReply: " + statusBarNotification.getPackageName();
        String str3 = "deviceReply: " + statusBarNotification.getKey();
        if (actionArr == null || actionArr.length == 0) {
            ReleaseLogUtil.e("DEVMGR_HwNotificationUtil", str2, " has no action button so that deviceReply INCAPABLE!");
            return;
        }
        int i2 = 0;
        while (i2 < actionArr.length) {
            Notification.Action action = actionArr[i2];
            if (action == null) {
                i = i2;
            } else if (action.getRemoteInputs() == null) {
                LogUtil.a("HwNotificationUtil", str2, " has ", Integer.valueOf(actionArr.length), " actions,and No.", Integer.valueOf(i2 + 1), " actionButton named ", actionArr[i2].title, " deviceReply INCAPABLE!");
                i = i2;
            } else {
                i = i2;
                LogUtil.a("HwNotificationUtil", str2, " has ", Integer.valueOf(actionArr.length), " actionButtons,and No.", Integer.valueOf(i2 + 1), " actionButton named ", actionArr[i2].title, " deviceReply SUPPORT! key: ", str3);
                Bundle bundle = new Bundle();
                RemoteInput[] remoteInputs = actionArr[i].getRemoteInputs();
                for (RemoteInput remoteInput : remoteInputs) {
                    bundle.putCharSequence(remoteInput.getResultKey(), str);
                }
                Intent intent = new Intent();
                intent.addFlags(268435456);
                RemoteInput.addResultsToIntent(remoteInputs, intent, bundle);
                ReleaseLogUtil.d("DEVMGR_HwNotificationUtil", str2, " deviceReply start to send");
                try {
                    actionArr[i].actionIntent.send(BaseApplication.getContext(), 0, intent);
                } catch (PendingIntent.CanceledException e2) {
                    ReleaseLogUtil.a("DEVMGR_HwNotificationUtil", "deviceReply function CanceledException: ", ExceptionUtils.c(e2));
                }
            }
            i2 = i + 1;
        }
        ReleaseLogUtil.d("DEVMGR_HwNotificationUtil", str2, " deviceReply finished");
    }

    public static void c(byte[] bArr, DeviceInfo deviceInfo) {
        eet eetVar = new eet();
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() <= 4) {
            LogUtil.a("HwNotificationUtil", "processMiddleWearResult info.length() less than 4");
            return;
        }
        if (bArr[2] == 127) {
            LogUtil.j("HwNotificationUtil", "processMiddleWearResult dataInfos is invalid");
            return;
        }
        if (bArr[1] != 2) {
            LogUtil.j("HwNotificationUtil", "processMiddleWearResult not is 5.33.2");
            return;
        }
        String strSubstring = strE.substring(4);
        LogUtil.a("HwNotificationUtil", "processMiddleWearResult tlvString: ", strSubstring);
        try {
            boolean zE = e(eetVar.b(strSubstring).b(), deviceInfo);
            LogUtil.a("HwNotificationUtil", "processMiddleWearResult isMiddleWearSupportHealth: ", Boolean.valueOf(zE));
            if (!zE) {
                LogUtil.j("HwNotificationUtil", "processMiddleWearResult middleWear is not Support Health");
                return;
            }
        } catch (eeu unused) {
            LogUtil.e("HwNotificationUtil", "processMiddleWearResult TlvException");
            xjt.ac("processMiddleWearResult TlvException");
        }
        b(deviceInfo);
    }

    private static boolean e(List<ees> list, DeviceInfo deviceInfo) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("HwNotificationUtil", "processData tlvFatherList is null");
            return true;
        }
        Iterator<ees> it = list.iterator();
        while (it.hasNext()) {
            List<eew> listE = it.next().e();
            LogUtil.a("HwNotificationUtil", "tlvList.size = ", Integer.valueOf(listE.size()));
            if (listE.size() >= 3) {
                d = true;
                LogUtil.a("HwNotificationUtil", "processData 2102 ");
            }
            for (eew eewVar : listE) {
                if (CommonUtil.v(eewVar.e()) != 2) {
                    LogUtil.a("HwNotificationUtil", "processData command id is not MiddleWear");
                    return true;
                }
                LogUtil.a("HwNotificationUtil", "processData callback result value:" + CommonUtil.v(eewVar.b()));
                int iV = CommonUtil.v(eewVar.b()) / 256;
                int iV2 = CommonUtil.v(eewVar.b()) % 256;
                ReleaseLogUtil.d("DEVMGR_HwNotificationUtil", "processData callback result type:", Integer.valueOf(iV), " value:", Integer.valueOf(iV2));
                if (iV == 1) {
                    c(iV2 == 0);
                    b(iV, iV2);
                } else if (iV == 2) {
                    e(iV2 == 0);
                    d(deviceInfo, iV2);
                    d(iV2);
                } else if (iV == 3) {
                    b(iV2 == 0);
                } else if (iV == 4) {
                    LogUtil.a("HwNotificationUtil", "processData alarm clock featureInfoValue:", Integer.valueOf(iV2));
                } else {
                    LogUtil.a("HwNotificationUtil", "The featureInfoType is invalid");
                }
            }
        }
        return true;
    }

    private static void d(int i) {
        if (i == 0) {
            lng.b(2);
        } else {
            lng.b(1);
        }
    }

    private static void b(int i, int i2) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(2);
        linkedHashMap.put("negotiateType", String.valueOf(i));
        if (i2 == 0) {
            linkedHashMap.put("negotiateResult", "true");
        } else {
            linkedHashMap.put("negotiateResult", "false");
        }
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap);
    }

    private static void d(DeviceInfo deviceInfo, int i) {
        if (i == 0) {
            f41723c.remove(deviceInfo.getDeviceIdentify());
        }
        if (i != 0) {
            c(deviceInfo);
            boolean zE = e(deviceInfo.getDeviceIdentify());
            LogUtil.a("HwNotificationUtil", "processData isAllowNegotiateAgain: ", Boolean.valueOf(zE));
            if (zE) {
                LogUtil.a("HwNotificationUtil", "processData negotiate again msg.");
                Message messageObtain = Message.obtain();
                messageObtain.what = 10;
                messageObtain.obj = deviceInfo;
                e.sendMessageDelayed(messageObtain, 60000L);
            }
        }
    }

    private static void c(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            ReleaseLogUtil.e("DEVMGR_HwNotificationUtil", "addDeviceInfo deviceInfo is null");
            return;
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (TextUtils.isEmpty(deviceIdentify)) {
            ReleaseLogUtil.e("DEVMGR_HwNotificationUtil", "addDeviceInfo deviceIdentify is null");
            return;
        }
        ArrayList<Long> arrayList = f41723c.get(deviceIdentify);
        if (arrayList == null) {
            LogUtil.j("HwNotificationUtil", "addDeviceInfo deviceInfo is not exist.");
            ArrayList<Long> arrayList2 = new ArrayList<>(16);
            arrayList2.add(Long.valueOf(System.currentTimeMillis()));
            f41723c.put(deviceIdentify, arrayList2);
            return;
        }
        synchronized (f41722a) {
            arrayList.add(Long.valueOf(System.currentTimeMillis()));
            LogUtil.j("HwNotificationUtil", "addDeviceInfo deviceInfo is exist:", Integer.valueOf(arrayList.size()));
        }
    }

    private static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("DEVMGR_HwNotificationUtil", "addDeviceInfo deviceIdentify is null");
            return false;
        }
        ArrayList<Long> arrayList = f41723c.get(str);
        if (arrayList == null) {
            ReleaseLogUtil.e("DEVMGR_HwNotificationUtil", "isAllowNegotiateChannel list is null");
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            synchronized (f41722a) {
                Iterator<Long> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (jCurrentTimeMillis - it.next().longValue() > AiCoreSdkConstant.CHECK_SUPPORT_INTERVAL) {
                        it.remove();
                    }
                }
            }
        } catch (NullPointerException e2) {
            LogUtil.e("HwNotificationUtil", "isAllowNegotiateChannel NullPointerException: ", ExceptionUtils.c(e2));
        } catch (ConcurrentModificationException e3) {
            LogUtil.e("HwNotificationUtil", "isAllowNegotiateChannel ConcurrentModificationException: ", ExceptionUtils.c(e3));
        }
        if (arrayList.size() <= 2) {
            return true;
        }
        ReleaseLogUtil.e("DEVMGR_HwNotificationUtil", "isAllowNegotiateChannel remainCount is more than 2.");
        return false;
    }

    private static void b(DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(33);
        deviceCommand.setCommandID(2);
        byte[] bArrC = eeq.c(eeq.d(127) + eeq.d(4) + eeq.c(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US));
        deviceCommand.setDataLen(bArrC.length);
        deviceCommand.setDataContent(bArrC);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static void c(boolean z) {
        LogUtil.a("HwNotificationUtil", "setForbidden:", Boolean.valueOf(z));
        NotificationContentProviderUtil.a(z);
    }

    public static void e(boolean z) {
        LogUtil.a("HwNotificationUtil", "setForbiddenPhone:", Boolean.valueOf(z));
        Intent intent = new Intent("midware_phone_flag");
        intent.putExtra("phone_flag", z);
        BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    public static void b(boolean z) {
        LogUtil.a("HwNotificationUtil", "setForbiddenPrompt:", Boolean.valueOf(z));
        Intent intent = new Intent("com.huawei.intelligent.action.NOTIFY_MSG");
        intent.putExtra("phone_flag", z);
        BaseApplication.getContext().sendBroadcast(intent, "com.huawei.permission.INTELLIGENT_NOTIFICATION_MSG_BRACELET");
    }

    public static void d(boolean z) {
        SharedPreferenceManager.a("KEEP_APP_ALIVE_MODULE", "DELAYED_RECEIVE_NOTIFICATION", z);
    }

    public static boolean c() {
        return SharedPreferenceManager.b("KEEP_APP_ALIVE_MODULE", "DELAYED_RECEIVE_NOTIFICATION", false);
    }

    public static void c(Context context, String str) {
        synchronized (mir.class) {
            LogUtil.a("HwNotificationUtil", "notifyKeepAppAlive tag:", str);
            if (context == null) {
                LogUtil.j("HwNotificationUtil", "notifyKeepAppAlive context == null");
                return;
            }
            if (!nzz.c()) {
                LogUtil.j("HwNotificationUtil", "notifyKeepAppAlive no KeepAlive");
                return;
            }
            if (nzz.c(context)) {
                LogUtil.j("HwNotificationUtil", "notifyKeepAppAlive isAgreeWhite");
                return;
            }
            long jD = SharedPreferenceManager.d("KEEP_APP_ALIVE_MODULE", "KEY_NOTIFY_KEEP_APP_ALIVE_TIME", 0L);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - jD < 604800000) {
                LogUtil.j("HwNotificationUtil", "notifyKeepAppAlive < timeout");
                return;
            }
            SharedPreferenceManager.c("KEEP_APP_ALIVE_MODULE", "KEY_NOTIFY_KEEP_APP_ALIVE_TIME", jCurrentTimeMillis);
            String string = context.getResources().getString(R.string.IDS_keep_app_alive_notice_message);
            Notification.Builder builderC = lsb.d().c();
            builderC.setContentTitle(context.getResources().getString(R.string.IDS_keep_app_alive_notice_title));
            builderC.setContentText(string);
            builderC.setSmallIcon(com.huawei.hwdevicemgr.R.drawable.healthlogo_ic_notification);
            builderC.setStyle(new Notification.BigTextStyle().bigText(string));
            builderC.setAutoCancel(true);
            Intent intent = new Intent();
            intent.setClassName(context, "com.huawei.health.browseraction.HwSchemeBasicHealthActivity");
            intent.putExtra("notification_keep_app_alive", "notification_keep_app_alive");
            builderC.setContentIntent(PendingIntent.getActivity(BaseApplication.getContext(), 0, intent, 67108864));
            lsb.d().c(20240720, builderC.build());
        }
    }

    public static boolean d(Intent intent) throws Exception {
        if (intent == null) {
            LogUtil.j("HwNotificationUtil", "checkKeepAppAliveArgument  intent is null");
            return false;
        }
        if (!intent.hasExtra("notification_keep_app_alive")) {
            return false;
        }
        String stringExtra = intent.getStringExtra("notification_keep_app_alive");
        if ("notification_keep_app_alive".equals(stringExtra)) {
            return true;
        }
        throw new Exception("NOTIFICATION_KEEP_APP_ALIVE_VALUE not equals, notifyValue:" + stringExtra);
    }
}
