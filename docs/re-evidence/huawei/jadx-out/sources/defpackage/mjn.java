package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.bluetooth.BluetoothAdapter;
import android.companion.CompanionDeviceManager;
import android.content.ComponentName;
import android.content.pm.PackageInfo;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.media3.common.C;
import com.google.gson.Gson;
import com.hihonor.assistant.cardmgrsdk.CardMgrSdkConst;
import com.huawei.callback.DeviceStatusCallback;
import com.huawei.datatype.DeviceStatusParam;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.WatchFaceUtil;
import com.huawei.hwdevice.outofprocess.mgr.device.ProfileAgent;
import com.huawei.hwdevice.outofprocess.util.NotificationContentProviderUtil;
import com.huawei.hwdevice.phoneprocess.hihealthkit.KitWearBinder;
import com.huawei.hwdevice.phoneprocess.mgr.btproxy.BtProxyNetworkChangeReceiver;
import com.huawei.hwdevice.phoneprocess.mgr.hwdevicestatusmgr.HwDeviceStatusNotificationUtil;
import com.huawei.hwdevice.phoneprocess.mgr.hwdevicestatusmgr.HwDeviceStatusPushManager;
import com.huawei.hwdevice.phoneprocess.mgr.hwmenstrualmanager.bean.MenstrualSwitchStatus;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.PhoneJobService;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import com.huawei.openalliance.ad.constant.OsType;
import com.huawei.profile.client.connect.ServiceConnectCallback;
import com.huawei.syncmgr.SyncOption;
import com.huawei.ui.commonui.R;
import com.huawei.unitedevice.hwwifip2ptransfermgr.HwWifiP2pTransferManager;
import com.tencent.connect.common.Constants;
import health.compact.a.CloudUtils;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class mjn {
    private static BtProxyNetworkChangeReceiver e;
    public static final List<String> d = Collections.unmodifiableList(Arrays.asList("jp.naver.line.android", "com.gbox.jp.naver.line.android", "com.vkontakte.android", "com.facebook.orca", "com.skype.raider", "org.thoughtcrime.securesms", "com.zing.zalo", "com.discord", "com.microsoft.teams", "com.viber.voip", "org.telegram.messenger.beta", "org.telegram.messenger.web", "com.whatsapp.w4b", "com.gbox.com.whatsapp", "com.gbox.com.instagram.android", "com.gbox.com.facebook.orca", "com.facebook.katana", "com.android.email", "com.hihonor.email", "com.kakao.talk"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f41757a = Collections.unmodifiableList(Arrays.asList("com.tencent.eim", "com.tencent.mobileqq", Constants.PACKAGE_QQ_SPEED, "org.telegram.messenger", "com.instagram.android", "com.twitter.android", "com.tencent.mobileqqi", Constants.PACKAGE_QQ_PAD, "com.tencent.mqq", "com.huawei.email", "com.google.android.gm", "com.microsoft.office.outlook", "com.android.calendar", "com.huawei.calendar", "com.android.mms", "com.google.android.calendar", "com.google.android.apps.messaging", "com.htc.sense.mms", "com.hihonor.mms", "com.hihonor.calendar", "com.hihonor.notepad", CardMgrSdkConst.Recommend.PKG_YOYO, "com.oneplus.mms", "com.samsung.android.messaging", "com.samsung.android.calendar", "com.hihonor.suggestion", "com.bbk.calendar", "app.huawei.auto", "com.huawei.meetime", "com.coloros.calendar", "com.umetrip.android.msky.app", "com.eg.android.AlipayGphone", "com.huawei.smarthome", "com.whatsapp"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f41758b = false;
    private static Map<String, DeviceStatusCallback> g = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f41759c = "";

    public static void d(String str, DeviceStatusCallback deviceStatusCallback) {
        LogUtil.a("ConnectManager", "Enter registerLocalDeviceStatusCallback method. moduleName: ", str);
        if (str == null || deviceStatusCallback == null) {
            LogUtil.j("ConnectManager", "registerLocalDeviceStatusCallback empty parameter");
        } else {
            g.put(str, deviceStatusCallback);
        }
    }

    public static void e(String str) {
        LogUtil.a("ConnectManager", "Enter unregisterLocalDeviceConnectedCallback method. moduleName: ", str);
        if (str == null) {
            LogUtil.j("ConnectManager", "unregisterLocalDeviceConnectedCallback empty parameter");
        } else {
            g.remove(str);
        }
    }

    public static void d(DeviceInfo deviceInfo, DeviceStatusParam deviceStatusParam) {
        boolean z;
        if (deviceInfo == null) {
            LogUtil.j("ConnectManager", "deviceInfo is null");
            return;
        }
        boolean zD = eey.d(deviceInfo, 183);
        LogUtil.a("ConnectManager", "initDeviceConnectInfo isSupportActivate: ", Boolean.valueOf(zD));
        if (deviceInfo.getDeviceConnectState() == 3) {
            mnd.c().d();
            mvz.d().b();
            moi.c().c(deviceInfo);
            ncd.e().c();
            boolean zD2 = eey.d(deviceInfo, 60, MachineControlPointResponse.OP_CODE_EXTENSION_MULTI_DATA);
            LogUtil.a("ConnectManager", "device not connect isSupportBtproxy: ", Boolean.valueOf(zD2));
            Iterator<DeviceInfo> it = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "btproxy").iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                DeviceInfo next = it.next();
                if (next.getDeviceConnectState() == 2 && (eey.d(next, 60, MachineControlPointResponse.OP_CODE_EXTENSION_MULTI_DATA) || next.getProductType() == 57)) {
                    z = false;
                    break;
                }
            }
            LogUtil.a("ConnectManager", "isNeedStopService: ", Boolean.valueOf(z));
            if (z && (deviceInfo.getProductType() == 57 || zD2)) {
                o();
            }
            ncp.s();
            ndb.b().e(deviceInfo.getDeviceIdentify(), 20230830);
        }
        d(deviceInfo, deviceStatusParam, zD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k() {
        mma.b().d();
        l();
    }

    private static void o() {
        if (CommonUtil.af(BaseApplication.getContext())) {
            k();
        } else {
            new Thread(new Runnable() { // from class: mjt
                @Override // java.lang.Runnable
                public final void run() {
                    mjn.k();
                }
            }).start();
        }
    }

    public static void d(DeviceInfo deviceInfo, DeviceStatusParam deviceStatusParam, boolean z) throws Throwable {
        mpg.d().b(deviceInfo);
        c(deviceInfo, deviceStatusParam);
        if (deviceInfo.getDeviceConnectState() == 1) {
            mmx.f(deviceInfo.getProductType());
        }
        c(deviceInfo);
        l(deviceInfo);
        h(deviceInfo);
        i(deviceInfo);
        mzb.e().b();
        mqn.d();
        o(deviceInfo);
        HwDeviceStatusNotificationUtil.b(deviceInfo);
        if (deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.j("ConnectManager", "initMenstrualCapability deviceInfo not connected");
            mio.a(false);
            mzj.b().c();
            g(deviceInfo);
            s(deviceInfo);
            return;
        }
        if (eey.d(deviceInfo, 134)) {
            mnd.c().e();
        }
        mxs.a().e();
        mvz.d().e();
        nau.c().e();
        ncd.e().a();
        n(deviceInfo);
        e(deviceInfo);
        WatchFaceUtil.deleteWatchFaceAlbumBackgroundDir();
        HwWifiP2pTransferManager.a();
        i();
        if (z && !TextUtils.isEmpty(deviceInfo.getPsiSignature())) {
            ndb.b().b(deviceInfo);
        }
        q(deviceInfo);
        ReleaseLogUtil.d("Notify_ConnectManager", " initDeviceConnectInfoOther isAgreeWhite: ", Boolean.valueOf(nzz.c(BaseApplication.getContext())));
    }

    private static void q(DeviceInfo deviceInfo) {
        String strB = SharedPreferenceManager.b("SENSITIVE_PERMISSION_STATUS", "SENSITIVE_PERMISSION_STATUS", "");
        boolean zB = SharedPreferenceManager.b("HEARTBEAT_INFO", "companion_device_manager_flag", false);
        ReleaseLogUtil.d("Notify_ConnectManager", "sensitivePermissionStatus is ", strB, ",companionFlag is ", Boolean.valueOf(zB));
        if ("".equals(strB) || zB) {
            return;
        }
        CompanionDeviceManager companionDeviceManager = (CompanionDeviceManager) BaseApplication.getContext().getSystemService("companiondevice");
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (deviceIdentify != null) {
            BluetoothAdapter.getDefaultAdapter();
            if (BluetoothAdapter.checkBluetoothAddress(deviceIdentify)) {
                ReleaseLogUtil.d("Notify_ConnectManager", "startObservingDevicePresence");
                companionDeviceManager.startObservingDevicePresence(deviceIdentify);
                SharedPreferenceManager.a("HEARTBEAT_INFO", "companion_device_manager_flag", true);
                return;
            }
        }
        ReleaseLogUtil.d("Notify_ConnectManager", "startObservingDevicePresence deviceIdentify: " + deviceIdentify + " is invalid.");
    }

    private static void o(DeviceInfo deviceInfo) {
        int deviceConnectState = deviceInfo.getDeviceConnectState();
        if (deviceConnectState == 1) {
            mlf.a().b();
            return;
        }
        if (deviceConnectState == 3 || deviceConnectState == 4) {
            mlf.a().c();
            mng.b().e();
            HwDeviceStatusPushManager.b().a();
        } else if (deviceConnectState == 2) {
            mng.b().a();
            mng.b().d(deviceInfo);
            HwDeviceStatusPushManager.b().d();
            nfh.e();
        }
    }

    private static void g(DeviceInfo deviceInfo) {
        if (Utils.n() || deviceInfo.getIsDemoWatch() != 1 || Utils.o() || deviceInfo.getDeviceConnectState() != 4) {
            return;
        }
        new Handler(BaseApplication.getContext().getMainLooper()).post(new Runnable() { // from class: mjs
            @Override // java.lang.Runnable
            public final void run() {
                Toast.makeText(BaseApplication.getContext(), com.huawei.haf.application.BaseApplication.b().getResources().getString(R.string.IDS_device_mgr_demo_watch_connect_failed), 1).show();
            }
        });
    }

    private static void i() {
        if (f41758b) {
            return;
        }
        f41758b = true;
        LogUtil.a("ConnectManager", "initChargingService start");
        try {
            JobInfo.Builder requiresDeviceIdle = new JobInfo.Builder(10009, new ComponentName(BaseApplication.getContext(), (Class<?>) PhoneJobService.class)).setRequiresCharging(true).setRequiresDeviceIdle(false);
            if (BaseApplication.getContext().getSystemService("jobscheduler") instanceof JobScheduler) {
                LogUtil.a("ConnectManager", "initChargingService schedule ", Integer.valueOf(((JobScheduler) BaseApplication.getContext().getSystemService("jobscheduler")).schedule(requiresDeviceIdle.build())));
            }
        } catch (IllegalArgumentException e2) {
            LogUtil.e("ConnectManager", "initChargingService ", ExceptionUtils.c(e2));
        }
    }

    private static void h(DeviceInfo deviceInfo) {
        if (deviceInfo.getDeviceConnectState() == 3) {
            mmi.d(deviceInfo.getDeviceIdentify());
            return;
        }
        if (deviceInfo.getDeviceConnectState() == 2) {
            String strA = mkl.d().a(deviceInfo.getDeviceIdentify());
            ReleaseLogUtil.d("ConnectManager", "initCommonManagerModule deviceRelation = ", strA);
            if ("main_relationship".equals(strA)) {
                mmi.d(deviceInfo);
            }
        }
    }

    private static void l(DeviceInfo deviceInfo) {
        if (Utils.h() && eey.d(deviceInfo, 169)) {
            LogUtil.a("ConnectManager", "DEVICE_SUPPORT_LOSE_WEIGHT");
            if (deviceInfo.getDeviceConnectState() == 3) {
                nag.e();
            } else if (deviceInfo.getDeviceConnectState() == 2) {
                nag.c();
            }
        }
    }

    private static void i(DeviceInfo deviceInfo) {
        LogUtil.a("ConnectManager", "initHealthGlanceManagerModule");
        if (deviceInfo.getDeviceConnectState() == 3) {
            mwc.e();
        } else if (deviceInfo.getDeviceConnectState() == 2) {
            mwc.d();
        }
    }

    private static void e(final DeviceInfo deviceInfo) {
        LogUtil.a("ConnectManager", "connectStartSyncData enter.");
        ThreadPoolManager.c().execute(new Runnable() { // from class: mjn.1
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("ConnectManager", " Disconnected and reconnected trigger Sync CoreSleep");
                if (CommonUtil.ap() || CommonUtil.ao()) {
                    qec.h().startSynWorkOut();
                }
                qec.e().startSynCoreSleep(SyncOption.builder().a(true).c(true).c(), new IBaseResponseCallback() { // from class: mjn.1.4
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        LogUtil.a("ConnectManager", "handleConnectStateChanged errorCode=", Integer.valueOf(i));
                        if (i == 0) {
                            mjn.y(deviceInfo);
                        }
                    }
                });
                qec.f().syncStressDetailData();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("ConnectManager", "syncBasicData deviceInfo is null");
        } else {
            mpg.d().a(false, deviceInfo, new IBaseResponseCallback() { // from class: mjn.3
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (i != 0) {
                        LogUtil.j("ConnectManager", "syncBasicData errorCode: ", Integer.valueOf(i));
                    } else {
                        ThreadPoolManager.c().execute(new Runnable() { // from class: mjn.3.4
                            @Override // java.lang.Runnable
                            public void run() {
                                LogUtil.a("ConnectManager", "syncCloud start");
                                HiSyncOption hiSyncOption = new HiSyncOption();
                                hiSyncOption.setSyncModel(2);
                                hiSyncOption.setSyncAction(0);
                                hiSyncOption.setSyncDataType(20000);
                                hiSyncOption.setSyncMethod(2);
                                hiSyncOption.setSyncScope(1);
                                HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, null);
                                LogUtil.a("ConnectManager", "syncCloud end");
                            }
                        });
                    }
                }
            });
        }
    }

    private static void c(DeviceInfo deviceInfo) {
        if (Utils.o() || !yln.d(BaseApplication.getContext())) {
            return;
        }
        if (deviceInfo.getDeviceConnectState() != 2 && deviceInfo.getDeviceConnectState() != 3) {
            LogUtil.j("ConnectManager", "deviceUpload device not connected or disconnect.");
        } else {
            ProfileAgent.PROFILE_AGENT.connectProfile(new AnonymousClass5(deviceInfo));
        }
    }

    /* JADX INFO: renamed from: mjn$5, reason: invalid class name */
    class AnonymousClass5 implements ServiceConnectCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DeviceInfo f41763c;

        AnonymousClass5(DeviceInfo deviceInfo) {
            this.f41763c = deviceInfo;
        }

        @Override // com.huawei.profile.client.connect.ServiceConnectCallback
        public void onConnect() {
            LogUtil.a("ConnectManager", "deviceUpload profile connected");
            ProfileAgent.PROFILE_AGENT.setConnected(true);
            ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
            final DeviceInfo deviceInfo = this.f41763c;
            threadPoolManagerC.execute(new Runnable() { // from class: mjv
                @Override // java.lang.Runnable
                public final void run() {
                    mjn.AnonymousClass5.a(deviceInfo);
                }
            });
        }

        static /* synthetic */ void a(DeviceInfo deviceInfo) {
            if (deviceInfo != null) {
                mgz mgzVar = new mgz();
                mgzVar.d(deviceInfo, mgzVar.c());
                ProfileAgent.PROFILE_AGENT.disconnectProfile();
            }
        }

        @Override // com.huawei.profile.client.connect.ServiceConnectCallback
        public void onDisconnect() {
            ProfileAgent.PROFILE_AGENT.setConnected(false);
            LogUtil.a("ConnectManager", "deviceUpload profile disconnected");
        }
    }

    private static void n(DeviceInfo deviceInfo) {
        m(deviceInfo);
        u(deviceInfo);
        if ("main_relationship".equals(deviceInfo.getRelationship())) {
            mll.d(deviceInfo);
        }
        s(deviceInfo);
        p(deviceInfo);
        f(deviceInfo);
        if (eey.d(deviceInfo, 96)) {
            naa.e().a();
        }
        DeviceCapability deviceCapabilityC = mkb.c(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityC != null && deviceCapabilityC.isSupportSyncWifi() && CommonUtil.at()) {
            naf.e().b();
        }
        if (deviceCapabilityC != null && deviceInfo.getDeviceConnectState() == 2) {
            LogUtil.a("ConnectManager", "device：" + deviceInfo.getDeviceName() + "btType：" + deviceInfo.getDeviceBluetoothType() + "getDeviceCapability：", new Gson().toJson(deviceCapabilityC, DeviceCapability.class));
        }
        LogUtil.a("ConnectManager", "initProcessAfterDeviceConnect triggerByDeviceConnect");
        mzz.c().b();
        mjh.b(deviceInfo);
        if (EnvironmentInfo.l()) {
            n();
        }
        if (nvd.a(deviceInfo)) {
            ndb.b().a(deviceInfo);
        }
        k(deviceInfo);
        g();
    }

    private static void k(DeviceInfo deviceInfo) {
        nbt.b().d(deviceInfo);
        ncp.s();
        LogUtil.a("ConnectManager", "connected success save connect_wear is true");
        NotificationContentProviderUtil.a("connect_wear", 1);
        ncl.d(BaseApplication.getContext()).b(ncp.d(deviceInfo), deviceInfo);
        SharedPreferenceManager.a("SUPPORT_NOTIFY_LIVE_TYPE", "SUPPORT_NOTIFY_LIVE_TYPE", eey.d(deviceInfo, 176));
        boolean zD = eey.d(deviceInfo, 257);
        LogUtil.a("ConnectManager", "notificationServiceHandle supportNotifySubTextBigText=", Boolean.valueOf(zD));
        SharedPreferenceManager.a("SUPPORT_NOTIFY_SUB_TEXT_BIG_TEXT", "SUPPORT_NOTIFY_SUB_TEXT_BIG_TEXT", zD);
        SharedPreferenceManager.a("SUPPORT_NOTIFY_ICON", "SUPPORT_NOTIFY_ICON", eey.d(deviceInfo, 260));
        SharedPreferenceManager.a("SUPPORT_NOTIFY_LIVE_LEVEL_CAPABILITY", "SUPPORT_NOTIFY_LIVE_LEVEL_CAPABILITY", eey.d(deviceInfo, 219));
        SharedPreferenceManager.a("NOTIFY_PICTURE", "SUPPORT_NOTIFY_PICTURE_CAPABILITY", eey.d(deviceInfo, 256));
        m();
        LogUtil.a("ConnectManager", "notificationServiceHandle save capability data!");
    }

    public static void b() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        LogUtil.a("ConnectManager", "202407091030-master syncSampleConfig device connected successfully enter");
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(900000000);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setForceSync(true);
        HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, new HiCommonListener() { // from class: mjn.2
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                LogUtil.e("ConnectManager", "syncSampleConfig success");
                countDownLatch.countDown();
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("ConnectManager", "getNotifyStatus exception");
        }
        LogUtil.a("ConnectManager", "202407091030-master syncSampleConfig device connected successfully end");
    }

    private static void m() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: mjn.4
            @Override // java.lang.Runnable
            public void run() {
                if (CloudUtils.a()) {
                    mjn.b();
                }
                mjn.j();
                mjn.h();
                mjn.f();
                mjn.e();
            }
        });
    }

    private static String a(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() >= 1) {
            return jSONArray.toString().replace("[", "").replace("]", "").replace("\"", "");
        }
        LogUtil.a("ConnectManager", "array is null");
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<lzj> a(File file) {
        ArrayList arrayList = new ArrayList();
        String strE = phw.e(file);
        ReleaseLogUtil.d("Notify_ConnectManager", "parseAppPackageName jsonResult is,", strE);
        if (TextUtils.isEmpty(strE) || com.huawei.operation.utils.Constants.NULL.equalsIgnoreCase(strE)) {
            ReleaseLogUtil.d("Notify_ConnectManager", "parseLegalHolidayInfo jsonResult is empty");
            return arrayList;
        }
        try {
            JSONArray jSONArray = new JSONObject(strE).getJSONArray("package_mappings");
            if (jSONArray.length() == 0) {
                ReleaseLogUtil.d("Notify_ConnectManager", "packageMappingsArray length is 0");
                return arrayList;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null && !jSONObject.isNull("appid") && !jSONObject.isNull(OsType.ANDROID)) {
                    lzj lzjVar = new lzj();
                    lzjVar.e(a(jSONObject.getJSONArray(OsType.ANDROID)));
                    lzjVar.d(jSONObject.getString("appid"));
                    arrayList.add(lzjVar);
                }
            }
            return arrayList;
        } catch (JSONException e2) {
            ReleaseLogUtil.e("Notify_ConnectManager", "parseAppPackageName e: ", ExceptionUtils.c(e2));
        }
    }

    private static void b(lzh lzhVar, String str, int i, List<String> list) {
        String[] strArrB = lzhVar.b();
        if (strArrB == null || strArrB.length == 0) {
            ReleaseLogUtil.e("ConnectManager", "saveAppSwitchToDataBase switchStatus is empty");
            return;
        }
        String str2 = strArrB[i];
        LogUtil.a("ConnectManager", "appSwitchUnderCloud installAppName=", str, ",status=", str2);
        if (TextUtils.isEmpty(str2) || "2".equals(str2)) {
            return;
        }
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10001), str, str2, new StorageParams(0));
        NotificationContentProviderUtil.a(str, CommonUtil.b(str2, 10));
        if (list.contains(str) || !"1".equals(str2)) {
            return;
        }
        nby.a().d(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(List<lzj> list, lzh lzhVar) {
        List<String> listJ = NotificationContentProviderUtil.j();
        if (lua.a(String.valueOf(10001), "package_name_tencent", -1) != 1) {
            b(lzhVar, "com.tencent.mm", 1, listJ);
            lua.e(String.valueOf(10001), "package_name_tencent", 1);
        }
        c(list, lzhVar, listJ);
        Iterator<PackageInfo> it = BaseApplication.getContext().getPackageManager().getInstalledPackages(0).iterator();
        while (it.hasNext()) {
            String str = it.next().packageName;
            for (int i = 0; i < list.size(); i++) {
                String strF = list.get(i).f();
                List arrayList = new ArrayList();
                if (strF.contains(",")) {
                    arrayList = Arrays.asList(strF.split(","));
                }
                if (arrayList.size() > 1) {
                    if (arrayList.contains(str)) {
                        b(lzhVar, str, i, listJ);
                    }
                } else if (!TextUtils.isEmpty(strF) && strF.equals(str)) {
                    b(lzhVar, str, i, listJ);
                }
            }
        }
    }

    private static void c(List<lzj> list, lzh lzhVar, List<String> list2) {
        try {
            if (lua.a(String.valueOf(10001), "package_name_platform_app", -1) != 1) {
                for (String str : f41757a) {
                    int iE = e(list, str);
                    if (iE != -1) {
                        LogUtil.a("ConnectManager", "restorePlatformAppStatus packageName: ", str);
                        b(lzhVar, str, iE, list2);
                    }
                }
            }
            ReleaseLogUtil.d("Notify_ConnectManager", "restorePlatformAppStatus finish:");
            lua.e(String.valueOf(10001), "package_name_platform_app", 1);
        } catch (Exception unused) {
            ReleaseLogUtil.d("Notify_ConnectManager", "restorePlatformAppStatus Exception");
        }
    }

    private static int e(List<lzj> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).f().contains(str)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f() {
        try {
            if (lua.a(String.valueOf(10001), "package_name_sp_app", -1) != 1) {
                for (String str : d) {
                    String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10001), str);
                    if ("1".equals(strE)) {
                        int iN = CommonUtil.n(BaseApplication.getContext(), strE);
                        LogUtil.a("ConnectManager", "restoreSPAppStatus packageName: ", str);
                        NotificationContentProviderUtil.a(str, iN);
                    }
                }
            }
            ReleaseLogUtil.d("Notify_ConnectManager", "restoreSPAppStatus finish");
            lua.e(String.valueOf(10001), "package_name_sp_app", 1);
        } catch (Exception unused) {
            ReleaseLogUtil.d("Notify_ConnectManager", "restorePlatformAppStatus Exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(lzh lzhVar) {
        if (lzhVar == null) {
            ReleaseLogUtil.d("Notify_ConnectManager", "printAppSwitchStatus switchInfo is null");
            return;
        }
        String[] strArrB = lzhVar.b();
        if (strArrB == null || strArrB.length == 0) {
            ReleaseLogUtil.d("Notify_ConnectManager", "printAppSwitchStatus switchStatus is empty");
        } else {
            ReleaseLogUtil.d("Notify_ConnectManager", "printAppSwitchStatus modifiedTime=", lzhVar.d(), ", appSwitchStatus=", Arrays.toString(strArrB));
        }
    }

    public static void e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("900500035");
        qhq.b("9005", arrayList, new HiDataReadResultListener() { // from class: mjn.9
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                List<HiSampleConfig> list = (List) obj;
                if (njy.b(obj, HiSampleConfig.class) && !njy.e(list)) {
                    String configData = "";
                    for (HiSampleConfig hiSampleConfig : list) {
                        if (hiSampleConfig != null && !TextUtils.isEmpty(hiSampleConfig.getConfigData())) {
                            configData = hiSampleConfig.getConfigData();
                        }
                    }
                    final lzh lzhVar = (lzh) HiJsonUtil.d(configData, lzh.class);
                    mjn.a(lzhVar);
                    HashMap map = new HashMap();
                    map.put("deviceType", "notificationMonitor");
                    fdy.d(new fda("com.huawei.health_common_config", map), "message_notification_switch", 1, new DownloadCallback<File>() { // from class: mjn.9.3
                        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
                        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                        public void onFinish(File file) {
                            List listA = mjn.a(file);
                            if (lzhVar == null || njy.e(listA)) {
                                return;
                            }
                            mjn.c((List<lzj>) listA, lzhVar);
                        }

                        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
                        public void onProgress(long j, long j2, boolean z, String str) {
                            LogUtil.a("ConnectManager", "downloadAppPackageNameConfig onProgress, already: ", Long.valueOf(j), ", total: " + j2, ", fileId: ", str);
                        }

                        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
                        public void onFail(int i3, Throwable th) {
                            LogUtil.a("ConnectManager", "downloadAppPackageNameConfig fail");
                        }
                    });
                    return;
                }
                ReleaseLogUtil.d("Notify_ConnectManager", "getAppSwitch onResult failed ");
            }
        });
    }

    public static void h() {
        ncg.b().d();
    }

    public static void j() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("900500009");
        qhq.b("9005", arrayList, new HiDataReadResultListener() { // from class: mjn.10
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a("ConnectManager", "updateNotificationMainSwitch onResult errorCode: ", Integer.valueOf(i), ", data: ", obj);
                if (njy.b(obj, HiSampleConfig.class)) {
                    List list = (List) obj;
                    if (!njy.e(list)) {
                        String strA = ffv.a(((HiSampleConfig) list.get(0)).getConfigData(), "device_notify_switch");
                        ReleaseLogUtil.d("Notify_ConnectManager", "updateNotificationMainSwitch cloudNotificationMainSwitch: ", strA);
                        if (TextUtils.isEmpty(strA)) {
                            return;
                        }
                        boolean zEquals = "1".equals(strA);
                        LogUtil.a("ConnectManager", "updateNotificationMainSwitch finalMainSwitch: ", Boolean.valueOf(zEquals));
                        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10035), "notificationStatus", String.valueOf(zEquals ? 1 : 0), new StorageParams(0));
                        NotificationContentProviderUtil.b(zEquals ? 1 : 0, true);
                        return;
                    }
                }
                ReleaseLogUtil.d("Notify_ConnectManager", "updateNotificationMainSwitch onResult failed.");
            }
        });
    }

    private static void f(DeviceInfo deviceInfo) {
        moi.c().e(deviceInfo);
    }

    private static void g() {
        mrt.a();
    }

    private static void n() {
        LogUtil.a("ConnectManager", "sendUpdateTimeToDevice start.");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        String str = simpleDateFormat.format(new Date());
        if ("".equals(f41759c)) {
            LogUtil.a("ConnectManager", "sLastSyncTime is empty string.");
            f41759c = str;
            t();
            return;
        }
        try {
            Date date = simpleDateFormat2.parse(str);
            Date date2 = simpleDateFormat2.parse(f41759c);
            long time = date.getTime() - date2.getTime();
            LogUtil.a("ConnectManager", "currentTime:", date, ",mLaterTime:", date2, ",timeTap:", Long.valueOf(time));
            if ((time / 1000) / 60 <= 25) {
                LogUtil.j("ConnectManager", "the interval is less than 25 minutes.");
                f41759c = str;
            } else {
                f41759c = str;
                t();
            }
        } catch (ParseException unused) {
            f41759c = str;
        }
    }

    private static void t() {
        long jA = nft.a();
        if (jA <= 0 || jA > k.b.m) {
            return;
        }
        nft.c(jA);
    }

    private static void l() {
        BtProxyNetworkChangeReceiver btProxyNetworkChangeReceiver = e;
        if (btProxyNetworkChangeReceiver != null) {
            btProxyNetworkChangeReceiver.j();
        }
    }

    private static void p(final DeviceInfo deviceInfo) {
        boolean zD = eey.d(deviceInfo, 60, MachineControlPointResponse.OP_CODE_EXTENSION_MULTI_DATA);
        LogUtil.a("ConnectManager", "isSupportBtproxy: ", Boolean.valueOf(zD));
        if (deviceInfo.getDeviceConnectState() != 2 || deviceInfo.getPowerSaveModel() == 1) {
            return;
        }
        LogUtil.a("ConnectManager", "deviceInfo.getProductType: ", Integer.valueOf(deviceInfo.getProductType()));
        if (deviceInfo.getProductType() == 57 || zD) {
            if (CommonUtil.af(BaseApplication.getContext())) {
                x(deviceInfo);
            } else {
                new Thread(new Runnable() { // from class: mjr
                    @Override // java.lang.Runnable
                    public final void run() {
                        mjn.x(deviceInfo);
                    }
                }).start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void x(DeviceInfo deviceInfo) {
        mma.b().d();
        l();
        BtProxyNetworkChangeReceiver btProxyNetworkChangeReceiverA = BtProxyNetworkChangeReceiver.a();
        e = btProxyNetworkChangeReceiverA;
        btProxyNetworkChangeReceiverA.a(deviceInfo);
    }

    private static void m(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapabilityC = mkb.c(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityC == null || !deviceCapabilityC.isSupportMenstrual()) {
            return;
        }
        LogUtil.a("ConnectManager", "initMenstrualCapability sendMenstrualCapability");
        new miq().e(new IBaseResponseCallback() { // from class: mjn.6
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("ConnectManager", "queryMenstrualSwitch errorCode:", Integer.valueOf(i));
                if (i == 0 && (obj instanceof MenstrualSwitchStatus)) {
                    LogUtil.a("ConnectManager", "device connected sendMenstrualSwitch");
                    mwt.c().a((MenstrualSwitchStatus) obj);
                }
            }
        });
        mwt.c().e();
    }

    private static void u(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapabilityC = mkb.c(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityC == null || !deviceCapabilityC.isSupportSosTransmission()) {
            return;
        }
        LogUtil.a("ConnectManager", "capability supportSosTransmission");
        mxw.e().d(deviceInfo);
    }

    private static void c(DeviceInfo deviceInfo, DeviceStatusParam deviceStatusParam) {
        t(deviceInfo);
        r(deviceInfo);
        j(deviceInfo);
        ndm.b().b(deviceInfo);
        e(deviceInfo, deviceStatusParam);
        a(deviceInfo);
    }

    private static void t(DeviceInfo deviceInfo) {
        LogUtil.a("ConnectManager", "notifyContactSyncMgr: ");
        DeviceCapability deviceCapabilityC = mkb.c(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityC == null || !deviceCapabilityC.isSupportSyncContacts() || !deviceCapabilityC.isSupportSyncHiCall()) {
            LogUtil.j("ConnectManager", "notifyContactSyncMgr: not support sync contacts");
            return;
        }
        mrx mrxVarD = mrx.d();
        if (deviceInfo.getDeviceConnectState() == 2) {
            mrxVarD.d(deviceInfo);
        } else {
            mrxVarD.a(deviceInfo);
        }
    }

    private static void r(DeviceInfo deviceInfo) {
        LogUtil.a("ConnectManager", "notifyCloudFileConfigManager ");
        if (!eey.d(deviceInfo, 104)) {
            LogUtil.j("ConnectManager", "not support CloudFileConfigManager");
            return;
        }
        mru mruVarE = mru.e();
        if (deviceInfo.getDeviceConnectState() != 2) {
            mruVarE.c(deviceInfo);
        }
    }

    private static void s(DeviceInfo deviceInfo) {
        LogUtil.a("ConnectManager", "enter sendToThemeConnectInfo");
        if (mkb.c(deviceInfo.getDeviceIdentify()).isSupportWatchFaceAppId()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("mDeviceConnectState", deviceInfo.getDeviceConnectState());
                jSONObject.put("mDeviceName", deviceInfo.getDeviceName());
            } catch (JSONException unused) {
                LogUtil.e("ConnectManager", "onDeviceConnectionStateChangedMethod, JSONException");
            }
            KitWearBinder.handleConnectStateReceive(jSONObject.toString());
        }
    }

    private static void j(DeviceInfo deviceInfo) {
        if (deviceInfo.getDeviceConnectState() == 2 && eey.d(deviceInfo, 112)) {
            mvv.d();
        }
    }

    private static void e(DeviceInfo deviceInfo, DeviceStatusParam deviceStatusParam) {
        Iterator<Map.Entry<String, DeviceStatusCallback>> it = g.entrySet().iterator();
        if (it == null) {
            LogUtil.a("ConnectManager", "notifyConnectStateViaCallback iterator is null.");
            return;
        }
        while (it.hasNext()) {
            DeviceStatusCallback value = it.next().getValue();
            if (value != null) {
                value.onDeviceConnectedChanged(deviceInfo, deviceInfo.getDeviceConnectState(), deviceStatusParam);
            }
        }
    }

    private static void a(DeviceInfo deviceInfo) {
        LogUtil.a("ConnectManager", "enter checkHeathActiveStatus");
        if (deviceInfo.getDeviceConnectState() != 2) {
            return;
        }
        if (mbt.a().b(deviceInfo)) {
            dyb.b(deviceInfo, null);
        }
        if (grt.e(deviceInfo)) {
            dyb.d(deviceInfo, null);
        }
        boolean z = false;
        boolean z2 = eey.d(deviceInfo, 226) && eey.d(deviceInfo, 106) && fxn.d();
        if (eey.d(deviceInfo, 106) && fej.a("com.huawei.health_deviceFeature_config", "txt", "com.huawei.health.h5.ecgce")) {
            z = true;
        }
        if (z2 || z) {
            dyb.a(deviceInfo, (IBaseResponseCallback) null);
        }
        if (eey.d(deviceInfo, 75) && fej.a("com.huawei.health_deviceFeature_config", "txt", "com.huawei.health.h5.vascular-health")) {
            dyb.e(deviceInfo, (IBaseResponseCallback) null);
        }
    }
}
