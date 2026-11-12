package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.emcom.IOneHopAppCallback;
import android.emcom.IOneHopAuthReqCallback;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.RemoteViews;
import android.widget.Toast;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.service.HandoffService;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.SmartClipManager;
import com.huawei.hwdevice.outofprocess.util.HwWatchFaceUtil;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.MetaCreativeType;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.GRSManager;
import health.compact.a.HarmonyBuild;
import health.compact.a.LocalBroadcast;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mbx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static mcf f41362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static mbx f41363b;
    private static final Object d = new Object();
    private static final List<String> e = Collections.unmodifiableList(new ArrayList<String>() { // from class: mbx.4
        {
            add("png");
            add("jpg");
            add("jpeg");
            add("bmp");
            add(MetaCreativeType.GIF);
            add("psd");
            add("svg");
            add("tif");
            add("tiff");
            add("webp");
            add("pcx");
        }
    });
    private ExtendHandler f;
    private Context i;
    private boolean j = false;
    private int k = -1;
    private Handler h = new Handler(Looper.getMainLooper()) { // from class: mbx.12
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            LogUtil.a("R_HwHandoffManager", "msg.what:", Integer.valueOf(message.what));
            switch (message.what) {
                case 1000:
                    if (message.obj instanceof List) {
                        mbx.this.a((List<Integer>) message.obj);
                    }
                    break;
                case 1001:
                    mbx.this.j();
                    break;
                case 1002:
                    mbx.this.f();
                    break;
                case 1003:
                    mbx.this.g();
                    break;
                case 1004:
                    mbx.this.r();
                    break;
                case 1005:
                    mbx.this.s();
                    break;
                case 1006:
                    if (message.obj instanceof String) {
                        HandoffService.startWatchFaceTransferService(mbx.this.i, (String) message.obj);
                    }
                    break;
                case 1007:
                    mbx.this.p();
                    break;
                case 1008:
                    mbx.this.i();
                    break;
                case 1009:
                    mbx.this.h();
                    break;
                case 1010:
                    mbx.this.m();
                    break;
                default:
                    LogUtil.a("HwHandoffManager", "Handler default");
                    break;
            }
        }
    };
    private SmartClipManager.SmartLoadPluginCallback g = new SmartClipManager.SmartLoadPluginCallback() { // from class: mbx.11
        @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.SmartClipManager.SmartLoadPluginCallback
        public void onLoadPluginResult(int i) {
            if (i != 0) {
                if (!CommonUtil.ab(BaseApplication.getContext())) {
                    LogUtil.j("HwHandoffManager", "network not connected");
                } else if (CommonUtil.o(BaseApplication.getContext()) != 1) {
                    LogUtil.a("HwHandoffManager", "send Hiai Notification");
                    mbx.this.a(0);
                } else {
                    LogUtil.a("HwHandoffManager", "network is wifi");
                }
            }
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.SmartClipManager.SmartLoadPluginCallback
        public void onLoadPluginProgress(int i) {
            LogUtil.a("HwHandoffManager", "load plugin progress =", Integer.valueOf(i));
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f41364c = new BroadcastReceiver() { // from class: mbx.14
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DeviceInfo deviceInfo;
            LogUtil.a("HwHandoffManager", "HwHandoffManager onReceive enter");
            if (context == null) {
                LogUtil.j("HwHandoffManager", "context is null");
                return;
            }
            if (intent == null) {
                LogUtil.j("HwHandoffManager", "intent is null");
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                LogUtil.j("HwHandoffManager", "action is null.");
                return;
            }
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(action)) {
                try {
                    deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
                } catch (ClassCastException unused) {
                    LogUtil.e("HwHandoffManager", "ClassCastException exception");
                    deviceInfo = null;
                }
                if (deviceInfo == null) {
                    LogUtil.j("HwHandoffManager", "deviceInfo is null");
                    return;
                }
                if (deviceInfo.getRelationship() != null && "followed_relationship".equals(deviceInfo.getRelationship())) {
                    LogUtil.a("HwHandoffManager", "This device does not have the correspond capability.");
                    return;
                }
                if (deviceInfo.getDeviceConnectState() == 2) {
                    LogUtil.a("HwHandoffManager", "mConnectStateChangedReceiver mHandoffTransferBean:", mbx.f41362a);
                    mcf mcfVar = mbx.f41362a;
                    mbx.this.l();
                    if (mcfVar != null) {
                        mbx.this.b(mcfVar);
                        return;
                    }
                    return;
                }
                LogUtil.j("HwHandoffManager", "onConnectStateChange state is not connect");
            }
        }
    };

    class c implements Handler.Callback {
        private c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1002) {
                LogUtil.a("HwHandoffManager", "DeviceConnectTimeoutHandler");
                if (mbx.f41362a != null) {
                    mbx.this.t();
                    mcf unused = mbx.f41362a = null;
                }
                mbx.this.f();
                return true;
            }
            LogUtil.j("HwHandoffManager", "DeviceConnectTimeoutHandler default");
            return false;
        }
    }

    private mbx(Context context) {
        this.i = context;
    }

    public static mbx a(Context context) {
        mbx mbxVar;
        synchronized (d) {
            if (f41363b == null) {
                f41363b = new mbx(context);
            }
            c(context);
            mbxVar = f41363b;
        }
        return mbxVar;
    }

    private static void c(Context context) {
        if (mbz.a(context).a() == 0) {
            mbz.a(context).e(0, new IBaseResponseCallback() { // from class: mbx.13
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("HwHandoffManager", "facePhotoInfo getMaxBackgroundImages:", obj, "errorCode:", Integer.valueOf(i));
                }
            });
        }
    }

    public void a() {
        if (!HwWatchFaceUtil.b()) {
            LogUtil.j("HwHandoffManager", "handoff is not support");
            return;
        }
        try {
            Class.forName("ohc");
            if (CommonUtil.bg() && CommonUtil.ch()) {
                int iB = ohc.d().b("com.huawei.health", new IOneHopAuthReqCallback.Stub() { // from class: mbx.15
                    @Override // android.emcom.IOneHopAuthReqCallback
                    public void onAuthResult(boolean z) {
                        LogUtil.a("HwHandoffManager", "onehopAuthReq, result:", Boolean.valueOf(z));
                        if (mbx.this.k != 0 && z) {
                            mbx.this.n();
                        } else {
                            LogUtil.a("HwHandoffManager", "onehopAuthReq, mOnehopAuthSuccessresult or result is false");
                        }
                    }
                });
                this.k = iB;
                LogUtil.a("HwHandoffManager", "onehopAuthReq, onehopAuthSuccess:", Integer.valueOf(iB));
                if (this.k == 0) {
                    n();
                    return;
                }
                return;
            }
            n();
        } catch (ClassNotFoundException unused) {
            LogUtil.e("HwHandoffManager", "Cannot find HwHandoffSdk");
        }
    }

    public boolean b() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        ReleaseLogUtil.d("R_HwHandoffManager", "registerHandoffService");
        int iC = ohc.d().c("com.huawei.health", 5, new IOneHopAppCallback.Stub() { // from class: mbx.20
            @Override // android.emcom.IOneHopAppCallback
            public void onOneHopReceived(final String str) {
                LogUtil.a("HwHandoffManager", "onOneHopReceived, para:", str);
                HwWatchFaceUtil.b(new HwWatchFaceUtil.TouchSupportCallback() { // from class: mbx.20.1
                    @Override // com.huawei.hwdevice.outofprocess.util.HwWatchFaceUtil.TouchSupportCallback
                    public void touchSupportResult(int i) {
                        if (i != 1) {
                            ReleaseLogUtil.e("R_HwHandoffManager", "is not support touch transfer");
                            return;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            mcf mcfVarC = mbx.this.c(str);
                            if (mcfVarC == null) {
                                LogUtil.j("HwHandoffManager", "handoffDataEvent watchFaceHandoffBean is null.");
                                return;
                            } else if (mcfVarC.a() == 5) {
                                mbx.this.d(mcfVarC);
                                return;
                            } else {
                                LogUtil.j("HwHandoffManager", "The handoff data type is:", Integer.valueOf(mcfVarC.a()));
                                return;
                            }
                        }
                        ReleaseLogUtil.e("R_HwHandoffManager", "handoffDataEvent The para is null or empty.");
                    }
                });
            }
        });
        LogUtil.a("HwHandoffManager", "registerHandoffService isRegisterSuccess =", Integer.valueOf(iC));
        if (iC == 0) {
            this.j = true;
            k();
            BroadcastManagerUtil.c(BaseApplication.getContext(), this.f41364c, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
            return;
        }
        this.j = false;
    }

    private void k() {
        String strD = GRSManager.c(BaseApplication.getContext()).d();
        String noCheckUrl = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl("domainContentcenterDbankcdnNew", strD);
        mhs.a().setSwitchSettingToDb("onehop_grs_countryCode", strD);
        mhs.a().setSwitchSettingToDb("onehop_grs_watchFaceGrsUrl", noCheckUrl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<Integer> list) {
        final int iIntValue = list.get(0).intValue();
        final int iIntValue2 = list.get(1).intValue();
        new Handler(BaseApplication.getContext().getMainLooper()).post(new Runnable() { // from class: mbx.19
            @Override // java.lang.Runnable
            public void run() {
                String string;
                ReleaseLogUtil.d("R_HwHandoffManager", "max transfer number message. maxNum = ", Integer.valueOf(iIntValue));
                if (iIntValue == 0) {
                    string = BaseApplication.getContext().getResources().getString(R.string.IDS_device_touch_transfer_over_max_limit);
                } else if (iIntValue2 == 0) {
                    string = String.format(Locale.ENGLISH, BaseApplication.getContext().getResources().getString(R.string.IDS_device_touch_transfer_max_photos_title), Integer.valueOf(iIntValue));
                } else {
                    Locale locale = Locale.ENGLISH;
                    int i = R.plurals.IDS_device_touch_transfer_photo_num;
                    int i2 = iIntValue;
                    string = String.format(locale, qre.e(i, i2, Integer.valueOf(i2)), new Object[0]);
                }
                Toast.makeText(BaseApplication.getContext(), string, 1).show();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        new Handler(BaseApplication.getContext().getMainLooper()).post(new Runnable() { // from class: mbx.18
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("HwHandoffManager", "bluetooth disconnect message");
                Toast.makeText(BaseApplication.getContext(), BaseApplication.getContext().getResources().getString(R.string.IDS_hw_health_wear_connect_device_disconnect), 1).show();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        new Handler(BaseApplication.getContext().getMainLooper()).post(new Runnable() { // from class: mbx.5
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("HwHandoffManager", "cloud image format message");
                Toast.makeText(BaseApplication.getContext(), BaseApplication.getContext().getResources().getString(R.string.IDS_device_touch_transfer_cloud_image_error), 1).show();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        new Handler(BaseApplication.getContext().getMainLooper()).post(new Runnable() { // from class: mbx.3
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("HwHandoffManager", "hiai uninstall message");
                SmartClipManager.e(BaseApplication.getContext()).e(mbx.this.g);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        new Handler(BaseApplication.getContext().getMainLooper()).post(new Runnable() { // from class: mbx.2
            @Override // java.lang.Runnable
            public void run() {
                ReleaseLogUtil.d("R_HwHandoffManager", "device not connected message");
                Toast.makeText(BaseApplication.getContext(), BaseApplication.getContext().getResources().getString(R.string.IDS_device_touch_transfer_device_disconnect_error), 1).show();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        new Handler(BaseApplication.getContext().getMainLooper()).post(new Runnable() { // from class: mbx.1
            @Override // java.lang.Runnable
            public void run() {
                mbx.this.a(1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        new Handler(BaseApplication.getContext().getMainLooper()).post(new Runnable() { // from class: mbx.7
            @Override // java.lang.Runnable
            public void run() {
                ReleaseLogUtil.d("R_HwHandoffManager", "video format message");
                Toast.makeText(BaseApplication.getContext(), BaseApplication.getContext().getResources().getString(R.string.IDS_device_touch_transfer_video_format_error), 1).show();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        new Handler(BaseApplication.getContext().getMainLooper()).post(new Runnable() { // from class: mbx.9
            @Override // java.lang.Runnable
            public void run() {
                ReleaseLogUtil.d("R_HwHandoffManager", "illegal picture message");
                Toast.makeText(BaseApplication.getContext(), BaseApplication.getContext().getResources().getString(R.string.IDS_watchface_file_is_not_support), 1).show();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        new Handler(BaseApplication.getContext().getMainLooper()).post(new Runnable() { // from class: mbx.10
            @Override // java.lang.Runnable
            public void run() {
                ReleaseLogUtil.d("R_HwHandoffManager", "transferring image message");
                Toast.makeText(BaseApplication.getContext(), BaseApplication.getContext().getResources().getString(R.string.IDS_device_touch_transfer_have_photo_transfering), 1).show();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        new Handler(BaseApplication.getContext().getMainLooper()).post(new Runnable() { // from class: mbx.6
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("HwHandoffManager", "device disconnected message");
                Toast.makeText(BaseApplication.getContext(), BaseApplication.getContext().getResources().getString(R.string.IDS_watchface_wearable_need_connect_to_use), 1).show();
            }
        });
    }

    private void o() {
        ExtendHandler extendHandlerB = HandlerCenter.b(new c(), "HwHandoffManager");
        this.f = extendHandlerB;
        extendHandlerB.sendEmptyMessage(1002, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        ExtendHandler extendHandler = this.f;
        if (extendHandler != null) {
            extendHandler.quit(false);
            this.f = null;
        }
        LogUtil.a("HwHandoffManager", "Remove DeviceConnectTimeoutHandler");
        if (f41362a != null) {
            t();
            f41362a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        try {
            BaseApplication.getContext().unregisterReceiver(this.f41364c);
        } catch (IllegalStateException unused) {
            LogUtil.e("HwHandoffManager", "unRegisterReceiver IllegalStateException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(mcf mcfVar) {
        if (mgg.c("HwHandoffManager") == null) {
            LogUtil.j("HwHandoffManager", "deviceInfo is null");
            f41362a = mcfVar;
            BroadcastManagerUtil.c(BaseApplication.getContext(), this.f41364c, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
            o();
            return;
        }
        b(mcfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(mcf mcfVar) {
        if (this.i == null) {
            this.i = BaseApplication.getContext();
        }
        if (!c()) {
            Message messageObtainMessage = this.h.obtainMessage();
            messageObtainMessage.what = 1003;
            this.h.sendMessage(messageObtainMessage);
            return;
        }
        DeviceInfo deviceInfoC = mgg.c("HwHandoffManager");
        if (deviceInfoC == null) {
            LogUtil.j("HwHandoffManager", "judgeDeviceUnusualStateTransferInfoToWatchFace deviceInfo is null");
            return;
        }
        String strReplace = deviceInfoC.getDeviceIdentify().replace(":", "");
        String upperCase = strReplace.length() > 3 ? strReplace.substring(strReplace.length() - 3, strReplace.length()).toUpperCase(Locale.ENGLISH) : "";
        if (deviceInfoC.getDeviceConnectState() != 2 || deviceInfoC.getDeviceName() == null || !upperCase.equals(mcfVar.c())) {
            ReleaseLogUtil.e("R_HwHandoffManager", "device is not connected.");
            Message messageObtainMessage2 = this.h.obtainMessage();
            messageObtainMessage2.what = 1001;
            this.h.sendMessage(messageObtainMessage2);
            return;
        }
        if (!lsg.d(this.i, PermissionUtil.c(PermissionUtil.PermissionType.MANAGE_EXTERNAL_STORAGE))) {
            if (!lsg.d(this.i, PermissionUtil.c(PermissionUtil.PermissionType.MEDIA_VIDEO_IMAGES))) {
                ReleaseLogUtil.e("R_HwHandoffManager", "has no permissions.");
                Message messageObtainMessage3 = this.h.obtainMessage();
                messageObtainMessage3.what = 1005;
                this.h.sendMessage(messageObtainMessage3);
                return;
            }
        }
        a(mcfVar);
    }

    private void a(mcf mcfVar) {
        if (SmartClipManager.b()) {
            Message messageObtainMessage = this.h.obtainMessage();
            messageObtainMessage.what = 1004;
            this.h.sendMessage(messageObtainMessage);
            return;
        }
        if (e(mcfVar.b())) {
            LogUtil.a("HwHandoffManager", "is have cloud image format: true");
            Message messageObtainMessage2 = this.h.obtainMessage();
            messageObtainMessage2.what = 1009;
            this.h.sendMessage(messageObtainMessage2);
            return;
        }
        if (d(mcfVar.b())) {
            LogUtil.a("HwHandoffManager", "is have video format: true");
            Message messageObtainMessage3 = this.h.obtainMessage();
            messageObtainMessage3.what = 1007;
            this.h.sendMessage(messageObtainMessage3);
            return;
        }
        if (!b(mcfVar.b())) {
            ReleaseLogUtil.d("R_HwHandoffManager", "is have illegal picture format: true");
            Message messageObtainMessage4 = this.h.obtainMessage();
            messageObtainMessage4.what = 1010;
            this.h.sendMessage(messageObtainMessage4);
            return;
        }
        boolean zE = SmartClipManager.e(this.i).e();
        boolean zI = SmartClipManager.e(this.i).i();
        ReleaseLogUtil.d("R_HwHandoffManager", "isPluginPrepared:", Boolean.valueOf(zE), "isSupportSmartClip:", Boolean.valueOf(zI));
        if (!Utils.o() && !CommonUtil.bd()) {
            SmartClipManager.e(this.i).h();
            if (zI && !zE) {
                Message messageObtainMessage5 = this.h.obtainMessage();
                messageObtainMessage5.what = 1008;
                this.h.sendMessage(messageObtainMessage5);
            }
        } else {
            try {
                lsb.d().e(100001);
            } catch (IllegalStateException unused) {
                LogUtil.e("HwHandoffManager", "delete health notification exception");
            }
        }
        e(mcfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        Notification notificationBuild;
        if (i == 1) {
            Notification.Builder builderC = lsb.a().c();
            builderC.setAutoCancel(true);
            builderC.setPriority(0);
            builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
            builderC.setContentTitle(BaseApplication.getContext().getString(R.string.IDS_device_touch_transfer_enter_title));
            builderC.setGroup("HwHandoffManager");
            builderC.setShowWhen(true);
            builderC.setContentIntent(lsb.a(BaseApplication.getContext()));
            builderC.setOngoing(true);
            builderC.setWhen(System.currentTimeMillis());
            notificationBuild = builderC.build();
        } else {
            Notification.Builder builderC2 = lsb.d().c();
            builderC2.setSmallIcon(R.drawable.healthlogo_ic_notification);
            builderC2.setShowWhen(true);
            builderC2.setContentIntent(lsb.a(BaseApplication.getContext()));
            builderC2.setAutoCancel(true);
            builderC2.setContentTitle(BaseApplication.getContext().getString(R.string.IDS_device_touch_transfer_enter_title));
            builderC2.setGroup("HwHandoffManager");
            builderC2.setWhen(System.currentTimeMillis());
            notificationBuild = builderC2.build();
        }
        notificationBuild.contentIntent = lsb.a(BaseApplication.getContext());
        notificationBuild.priority = 0;
        a(notificationBuild, i);
    }

    private void a(Notification notification, int i) {
        if (EnvironmentInfo.g()) {
            String string = BaseApplication.getContext().getResources().getString(R.string.IDS_device_touch_transfer_enter_title);
            Notification.Builder builderC = lsb.a().c();
            builderC.setContentTitle(string);
            builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
            builderC.setStyle(new Notification.InboxStyle());
            Intent intent = new Intent();
            if (i == 1) {
                builderC.setContentText(BaseApplication.getContext().getResources().getString(R.string.IDS_harmony_permission_torage));
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.parse("package:" + BaseApplication.getContext().getPackageName()));
            } else {
                intent.setClassName(BaseApplication.getContext(), "com.huawei.ui.device.activity.touchtransfer.TouchTransferHiaiActivity");
                builderC.setContentText(BaseApplication.getContext().getResources().getString(R.string.IDS_device_touch_transfer_hiai_content_title));
            }
            Notification notificationBuild = builderC.build();
            builderC.setAutoCancel(true);
            notificationBuild.contentIntent = PendingIntent.getActivity(BaseApplication.getContext(), 0, intent, 201326592);
            lsb.a().c(100001, notificationBuild);
            return;
        }
        RemoteViews remoteViews = new RemoteViews(BaseApplication.getContext().getPackageName(), R.layout.notification_hiai_view);
        if (Build.VERSION.SDK_INT >= 31) {
            remoteViews = new RemoteViews(BaseApplication.getContext().getPackageName(), R.layout.notification_hiai_view_large_android13);
        }
        notification.contentView = remoteViews;
        Intent intent2 = new Intent();
        if (i == 1) {
            intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent2.setData(Uri.parse("package:" + BaseApplication.getContext().getPackageName()));
            String string2 = BaseApplication.getContext().getResources().getString(R.string.IDS_hw_feedback_permission_guide_torage);
            if (Build.VERSION.SDK_INT >= 33) {
                string2 = BaseApplication.getContext().getResources().getString(R.string.IDS_hw_permission_guide_image);
            }
            if ((CommonUtil.bc() && HarmonyBuild.d > 6) || EnvironmentInfo.m()) {
                string2 = BaseApplication.getContext().getResources().getString(R.string.IDS_harmony_permission_torage);
            }
            remoteViews.setTextViewText(R.id.touch_hiai_title, string2);
        } else {
            intent2.setClassName(BaseApplication.getContext(), "com.huawei.ui.device.activity.touchtransfer.TouchTransferHiaiActivity");
            remoteViews.setTextViewText(R.id.touch_hiai_title, BaseApplication.getContext().getResources().getString(R.string.IDS_device_touch_transfer_hiai_content_title));
        }
        notification.contentIntent = PendingIntent.getActivity(BaseApplication.getContext(), 0, intent2, 201326592);
        if (i == 1) {
            lsb.a().c(100001, notification);
        } else {
            lsb.d().c(100001, notification);
        }
    }

    private void e(final mcf mcfVar) {
        if (mcfVar == null) {
            LogUtil.j("HwHandoffManager", "watchFaceHandoffBean is null");
        } else {
            mbz.a(this.i).e(0, new IBaseResponseCallback() { // from class: mbx.8
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    int size;
                    ReleaseLogUtil.d("R_HwHandoffManager", "facePhotoInfo getMaxBackgroudImages:", obj + "errorCode:" + i);
                    int iE = 5;
                    if (i == 101 && (obj instanceof mcb)) {
                        mcb mcbVar = (mcb) obj;
                        iE = mcbVar.e() > 0 ? mcbVar.e() : 5;
                        size = mcbVar.b().size();
                        LogUtil.a("HwHandoffManager", "getAlbumWatchFaceNumber albumWatchFaceNumber is,", Integer.valueOf(size));
                    } else {
                        size = 0;
                    }
                    mbx.this.c(mcfVar, size, iE);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(mcf mcfVar, int i, int i2) {
        int iD = mcfVar.d();
        LogUtil.a("HwHandoffManager", "processedTransferMessage albumWatchFaceNumber is,", Integer.valueOf(i));
        Message messageObtainMessage = this.h.obtainMessage();
        if (iD > 0 && iD + i <= i2) {
            messageObtainMessage.what = 1006;
            messageObtainMessage.obj = mcfVar.b();
        } else {
            messageObtainMessage.what = 1000;
            messageObtainMessage.obj = Arrays.asList(Integer.valueOf(i2 - i), Integer.valueOf(i));
        }
        this.h.sendMessage(messageObtainMessage);
    }

    private boolean e(String str) {
        JSONArray jSONArray;
        try {
            jSONArray = new JSONArray(str);
        } catch (JSONException unused) {
            LogUtil.e("HwHandoffManager", "isCloudImageFormat build array find JSONException");
            jSONArray = null;
        }
        if (jSONArray == null) {
            LogUtil.j("HwHandoffManager", "resultArray is null");
            return false;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                String string = jSONArray.getString(i);
                LogUtil.a("HwHandoffManager", ContentResource.FILE_NAME, string);
                if (TextUtils.isEmpty(string)) {
                    break;
                }
                if (string.contains(".photoShare")) {
                    return true;
                }
            } catch (JSONException unused2) {
                LogUtil.e("HwHandoffManager", "isCloudImageFormat find JSONException");
            }
        }
        return false;
    }

    private boolean d(String str) {
        JSONArray jSONArray;
        try {
            jSONArray = new JSONArray(str);
        } catch (JSONException unused) {
            LogUtil.e("HwHandoffManager", "isHaveVideoFormat build array find JSONException");
            jSONArray = null;
        }
        if (jSONArray == null) {
            LogUtil.j("HwHandoffManager", "resultArray is null");
            return false;
        }
        List listAsList = Arrays.asList("MP4", "MPEG", "MPG", "DAT", "AVI", "MOV", "ASF", "WMV", "NAVI", "3GP", "FLV", "RMVB");
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                String string = jSONArray.getString(i);
                LogUtil.a("HwHandoffManager", "isHaveVideoFormat fileName:", string);
                if (TextUtils.isEmpty(string)) {
                    break;
                }
                String[] strArrSplit = string.toUpperCase(Locale.ENGLISH).split("\\.");
                if (strArrSplit.length > 0 && listAsList.contains(strArrSplit[strArrSplit.length - 1])) {
                    return true;
                }
            } catch (JSONException unused2) {
                LogUtil.e("HwHandoffManager", "isHaveVideoFormat find JSONException");
            }
        }
        return false;
    }

    private String a(String str) {
        JSONArray jSONArray;
        try {
            jSONArray = new JSONArray(str);
        } catch (JSONException unused) {
            LogUtil.e("HwHandoffManager", "build array find JSONException");
            jSONArray = null;
        }
        String string = "";
        if (jSONArray == null) {
            LogUtil.j("HwHandoffManager", "resultArray is null");
            return "";
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                string = jSONArray.getString(i);
                LogUtil.a("HwHandoffManager", ContentResource.FILE_NAME, string);
            } catch (JSONException unused2) {
                LogUtil.e("HwHandoffManager", "find JSONException");
            }
        }
        return string;
    }

    private boolean b(String str) {
        String strA = a(str);
        if (TextUtils.isEmpty(strA)) {
            ReleaseLogUtil.d("R_HwHandoffManager", "isSupportPictureFormat fileName is null");
            return false;
        }
        String[] strArrSplit = strA.split("\\.");
        if (strArrSplit.length <= 0) {
            return false;
        }
        String str2 = strArrSplit[strArrSplit.length - 1];
        ReleaseLogUtil.d("R_HwHandoffManager", "fileType is:", str2);
        return e.contains(str2.toLowerCase(Locale.ENGLISH));
    }

    public boolean c() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            LogUtil.a("HwHandoffManager", "bluetooth is null");
            return false;
        }
        if (defaultAdapter.isEnabled()) {
            LogUtil.a("HwHandoffManager", "bluetooth is open");
            return true;
        }
        LogUtil.a("HwHandoffManager", "bluetooth is close");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public mcf c(String str) {
        try {
            mcf mcfVar = new mcf();
            JSONObject jSONObject = new JSONObject(str);
            int iA = mea.a(jSONObject, "handoff_data_type");
            if (iA == -1) {
                iA = mea.a(jSONObject, "onehop_data_type");
            }
            mcfVar.b(iA);
            mcfVar.b(mea.b(jSONObject, "btmac").toUpperCase(Locale.ENGLISH));
            JSONObject jSONObject2 = new JSONObject(mea.b(jSONObject, "url"));
            int iA2 = mea.a(jSONObject2, "handoff_media_file_num");
            mcfVar.d(iA2);
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            while (i < iA2) {
                StringBuilder sb = new StringBuilder();
                sb.append("handoff_media_file_path");
                i++;
                sb.append(String.valueOf(i));
                String strB = mea.b(jSONObject2, sb.toString());
                if (CommonUtil.af(BaseApplication.getContext())) {
                    File file = new File(strB);
                    int iLastIndexOf = strB.lastIndexOf("/");
                    if (file.isFile() && iLastIndexOf != -1) {
                        LogUtil.a("R_HwHandoffManager", "parse fileName:", strB.substring(iLastIndexOf));
                    }
                }
                jSONArray.put(strB);
            }
            mcfVar.a(jSONArray.toString());
            return mcfVar;
        } catch (JSONException unused) {
            LogUtil.e("HwHandoffManager", "parseHandoffJsonString find JSONException");
            return null;
        }
    }

    public boolean e() {
        if (!c()) {
            Message messageObtainMessage = this.h.obtainMessage();
            messageObtainMessage.what = 1003;
            this.h.sendMessage(messageObtainMessage);
            return false;
        }
        DeviceInfo deviceInfoC = mgg.c("HwHandoffManager");
        if (deviceInfoC != null && deviceInfoC.getDeviceConnectState() == 2) {
            return true;
        }
        Message messageObtainMessage2 = this.h.obtainMessage();
        messageObtainMessage2.what = 1002;
        this.h.sendMessage(messageObtainMessage2);
        return false;
    }
}
