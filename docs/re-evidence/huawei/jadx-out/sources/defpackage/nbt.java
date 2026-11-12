package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.outofprocess.util.NotificationContentProviderUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.MagicBuild;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class nbt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static nbt f42846b;
    private static final Object d = new Object();
    static int e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f42847a = new Handler(Looper.getMainLooper()) { // from class: nbt.4
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 100) {
                LogUtil.a("HwMiddleWearHelper", "MSG_ACTION_CONNECTED_NEGOTIATE_SEND enter");
                if (message.obj instanceof DeviceInfo) {
                    nbt.this.c((DeviceInfo) message.obj, true);
                    return;
                }
                return;
            }
            if (i != 101) {
                return;
            }
            boolean zB = mir.b();
            LogUtil.a("HwMiddleWearHelper", "handle MSG_ACTION_RETRY_NEGOTIATE_SEND isReceive=", Boolean.valueOf(zB));
            nbt.this.a(message, zB);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message, boolean z) {
        if (z) {
            LogUtil.a("HwMiddleWearHelper", "handle 101 2102 already receive");
            this.f42847a.removeMessages(101);
            mir.a(false);
            e = 0;
            LogUtil.a("HwMiddleWearHelper", "handle 101 2102 already receive negotiateCount=", 0);
            return;
        }
        mir.a(false);
        LogUtil.a("HwMiddleWearHelper", "handle 101 start negotiateCount=", Integer.valueOf(e));
        if (e >= 4) {
            LogUtil.a("HwMiddleWearHelper", "handle 101 start negotiateCount is 4");
            this.f42847a.removeMessages(101);
            mir.a(false);
            mir.c(false);
            mir.e(false);
            e = 0;
            LogUtil.a("HwMiddleWearHelper", "handle 101 start negotiateCount negotiateCount=", 0);
            return;
        }
        LogUtil.a("HwMiddleWearHelper", "handle 101 middle negotiateCount is not 4");
        if (message.obj instanceof DeviceInfo) {
            DeviceInfo deviceInfo = (DeviceInfo) message.obj;
            DeviceCapability deviceCapability = mkn.e().queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), "HwMiddleWearHelper").get(deviceInfo.getDeviceIdentify());
            if (deviceCapability != null && deviceCapability.isSupportMidware() && eei.a()) {
                int i = e + 1;
                e = i;
                LogUtil.a("HwMiddleWearHelper", "handle 101 send count negotiateCount=", Integer.valueOf(i));
                e(deviceInfo, false);
                LogUtil.a("HwMiddleWearHelper", "handle 101 center start send 101");
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                messageObtain.obj = deviceInfo;
                this.f42847a.sendMessageDelayed(messageObtain, 10000L);
                LogUtil.a("HwMiddleWearHelper", "handle 101 center end send 101");
            }
        }
    }

    private nbt() {
    }

    public static nbt b() {
        nbt nbtVar;
        synchronized (d) {
            if (f42846b == null) {
                f42846b = new nbt();
            }
            nbtVar = f42846b;
        }
        return nbtVar;
    }

    private void e(DeviceInfo deviceInfo, boolean z) {
        boolean zA = a();
        int iE = e(cio.d);
        String strE = nio.e(deviceInfo.getDeviceIdentify());
        int iD = eei.d(strE);
        LogUtil.a("HwMiddleWearHelper", "enter middleware isClosed: ", Boolean.valueOf(zA), " intelligentStatus: ", Integer.valueOf(iE), " clockState: ", Integer.valueOf(iD), " isSetDefaultChannel: ", Boolean.valueOf(z));
        if (iD == -1) {
            eei.b(strE, true);
            iD = 1;
        }
        if (z) {
            e(true);
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
            linkedHashMap.put("negotiateDefaultChannel", "true");
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap);
        }
        ncl.d(BaseApplication.getContext()).c(zA, iE == 1, iD == 1, true);
    }

    private int e(String str) {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10001), str);
        LogUtil.a("HwMiddleWearHelper", "getAppPushEnable packageName: ", str, ", value: ", strE);
        if (TextUtils.isEmpty(strE)) {
            return 0;
        }
        return CommonUtil.n(BaseApplication.getContext(), strE);
    }

    private boolean a() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10035), "notificationStatus");
        if (!TextUtils.isEmpty(strE)) {
            LogUtil.a("HwMiddleWearHelper", "isAuthorizeEnabled value is: ", strE);
            try {
                return CommonUtil.j(strE) == 1;
            } catch (NumberFormatException unused) {
                LogUtil.e("HwMiddleWearHelper", "isAuthorizeEnabled NumberFormatException");
                return false;
            }
        }
        boolean zA = mir.a();
        LogUtil.a("HwMiddleWearHelper", "isAuthorizeEnabled value is null, isEnabled:", Boolean.valueOf(zA));
        if (zA) {
            if (!CommonUtil.ap()) {
                e("notificationStatus", 1, false);
            }
            return true;
        }
        if (!CommonUtil.ap()) {
            e("notificationStatus", 0, false);
        }
        return false;
    }

    private void e(String str, int i, boolean z) {
        LogUtil.a("HwMiddleWearHelper", "setAuthorizeStatus: ", Integer.valueOf(i), ",isHarmonyOS30SendNotify:", Boolean.valueOf(z));
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10035), str, String.valueOf(i), new StorageParams(0));
        NotificationContentProviderUtil.b(i, z);
    }

    private void e(boolean z) {
        LogUtil.d("HwMiddleWearHelper", "enter setMiddleWearEnabled isEnabled ", Boolean.valueOf(z));
        mir.c(z);
        mir.e(z);
        mir.b(z);
    }

    public void d(final DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("DEVMGR_HwMiddleWearHelper", "initProcessAfterDeviceConnect delivered 2101 by phoneService process");
        ThreadPoolManager.c().execute(new Runnable() { // from class: nbt.5
            @Override // java.lang.Runnable
            public void run() {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.obj = deviceInfo;
                nbt.this.f42847a.sendMessageDelayed(messageObtain, 1000L);
            }
        });
    }

    public void c(DeviceInfo deviceInfo, boolean z) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
            LogUtil.j("HwMiddleWearHelper", "autoSendSynergyCommand deviceInfo is null");
            return;
        }
        boolean z2 = true;
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkn.e().queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), "HwMiddleWearHelper");
        DeviceCapability deviceCapability = (mapQueryDeviceCapability == null || mapQueryDeviceCapability.isEmpty()) ? null : mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify());
        if (deviceCapability == null) {
            LogUtil.j("HwMiddleWearHelper", "autoSendSynergyCommand() deviceCapability is null");
            return;
        }
        boolean zV = CommonUtil.v(BaseApplication.getContext());
        LogUtil.a("HwMiddleWearHelper", "autoSetUp isSupportMidWare isGooglePlay:", false, ", isNewHonor:", Boolean.valueOf(MagicBuild.f36615a), ", isChinaRom:", Boolean.valueOf(zV), ", deviceCapability isSupportMidware:", Boolean.valueOf(deviceCapability.isSupportMidware()));
        if (MagicBuild.f36615a && !zV) {
            LogUtil.j("HwMiddleWearHelper", "autoSetUp isSupportMidWare isNewHonor oversea phone return");
            b().e(false);
            return;
        }
        if (deviceCapability.isSupportMidware() && eei.a()) {
            ReleaseLogUtil.d("DEVMGR_HwMiddleWearHelper", "autoSendCommend() Support middle wear");
            if (z) {
                e();
                e++;
            }
            LogUtil.a("HwMiddleWearHelper", "autoSendCommend support negotiateCount=", Integer.valueOf(e));
            e(deviceInfo, z);
            Message messageObtain = Message.obtain();
            messageObtain.what = 101;
            messageObtain.obj = deviceInfo;
            this.f42847a.sendMessageDelayed(messageObtain, 10000L);
            LogUtil.a("HwMiddleWearHelper", "autoSendCommend support handle 101 sendMsg");
            return;
        }
        ReleaseLogUtil.d("DEVMGR_HwMiddleWearHelper", "autoSendCommend() not Support middle wear");
        e(false);
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
        linkedHashMap.put("negotiateDefaultChannel", "false");
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap);
        boolean zA = eei.a();
        boolean zE = ncp.e();
        boolean zD = d();
        LogUtil.a("HwMiddleWearHelper", " autoSetUp not Support midwareSupportHealth: ", Boolean.valueOf(zA), " deviceSupportClockStateDeal: ", Boolean.valueOf(zE), " isSupportSynergyEscape: ", Boolean.valueOf(zD));
        if (zA && zE && zD) {
            String deviceIdentify = deviceInfo.getDeviceIdentify();
            String strE = nio.e(deviceIdentify);
            int iD = eei.d(strE);
            if (iD == -1) {
                eei.b(strE, true);
            } else if (iD != 1) {
                z2 = false;
            }
            LogUtil.a("HwMiddleWearHelper", "autoSetUp not Support middleWear deviceMac: ", cpl.e(deviceIdentify), " encryptDeviceMac: ", strE, " clockStateSend: ", Boolean.valueOf(z2));
            ncl.d(BaseApplication.getContext()).c(false, false, z2, false);
        }
    }

    public void e() {
        LogUtil.a("HwMiddleWearHelper", "resetNegotiateData start");
        this.f42847a.removeMessages(101);
        e = 0;
        mir.a(false);
    }

    private boolean d() {
        PackageInfo packageInfo;
        PackageManager packageManager = BaseApplication.getContext().getPackageManager();
        try {
            if (MagicBuild.f36615a) {
                packageInfo = packageManager.getPackageInfo("com.hihonor.synergy", 128);
            } else {
                packageInfo = packageManager.getPackageInfo("com.huawei.synergy", 128);
            }
            if (packageInfo == null) {
                ReleaseLogUtil.e("DEVMGR_HwMiddleWearHelper", "isMiddleWearSupportHealth packageInfo is null");
                return false;
            }
            String str = packageInfo.versionName;
            ReleaseLogUtil.d("DEVMGR_HwMiddleWearHelper", "deviceVersion is,", str);
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length < 4) {
                return false;
            }
            boolean z = CommonUtils.j(strArrSplit[0]) == 14 && CommonUtils.j(strArrSplit[1]) == 0;
            boolean z2 = CommonUtils.j(strArrSplit[0]) == 14 && CommonUtils.j(strArrSplit[1]) == 1;
            boolean z3 = CommonUtils.j(strArrSplit[0]) == 14 && CommonUtils.j(strArrSplit[1]) >= 2;
            if (z) {
                return CommonUtils.j(strArrSplit[3]) >= 11;
            }
            if (z2) {
                return CommonUtils.j(strArrSplit[3]) >= 2;
            }
            return z3 && CommonUtils.j(strArrSplit[3]) >= 1;
        } catch (PackageManager.NameNotFoundException unused) {
            ReleaseLogUtil.a("DEVMGR_HwMiddleWearHelper", "isMiddleWearSupportHealth not exist");
            return false;
        }
    }
}
