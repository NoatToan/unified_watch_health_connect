package defpackage;

import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import androidx.media3.common.C;
import com.google.android.gms.common.util.ArrayUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.watchface.api.WebViewActivity;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.MagicBuild;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class ndk extends HwBaseManager implements ParserInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ndk f42937b;
    private boolean f;
    private ServiceConnection g;
    private Context h;
    private boolean i;
    private boolean j;
    private Handler k;
    private BroadcastReceiver l;
    private DeviceInfo n;
    private String o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f42938c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Uri f42936a = Uri.parse("content://com.huawei.dmsdp.provider/camera_remote_ctrl");
    private static final Uri e = Uri.parse("content://com.huawei.camera.remotecallconfirmProvider/device");
    private static final Map<String, Long> d = new ConcurrentHashMap(0);

    private ndk() {
        super(BaseApplication.getContext());
        this.f = false;
        this.j = false;
        this.i = false;
        this.k = new Handler(Looper.getMainLooper()) { // from class: ndk.3
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
                switch (message.what) {
                    case 20000:
                        LogUtil.a("RemotePhoto", "handleMessage what = HANDLER_ACTION_OPEN_CAMERA");
                        ndk.this.d();
                        ndk.this.c("android.media.action.STILL_IMAGE_CAMERA");
                        break;
                    case 20001:
                        LogUtil.a("RemotePhoto", "handleMessage what = HANDLER_ACTION_OPEN_CAMERA_SECURE");
                        ndk.this.d();
                        ndk.this.c("android.media.action.STILL_IMAGE_CAMERA_SECURE");
                        break;
                    case 20002:
                        LogUtil.a("RemotePhoto", "handleMessage what = HANDLER_ACTION_TAKE_PICTURE");
                        ndk.this.i();
                        break;
                    case 20003:
                        LogUtil.a("RemotePhoto", "handleMessage what = HANDLER_ACTION_UNREGISTER_CAMERA_BROADCAST");
                        ndk.this.g();
                        break;
                    case 20004:
                        LogUtil.a("RemotePhoto", "handleMessage what = HANDLER_ACTION_CAMERA_STOP");
                        ndk.this.a(2);
                        break;
                    case 20005:
                        LogUtil.a("RemotePhoto", "handleMessage what = HANDLER_ACTION_BACK_TO_HOME");
                        ndk.this.d();
                        break;
                    case 20006:
                        LogUtil.a("RemotePhoto", "handleMessage what = HANDLER_ACTION_OPEN_CAMERA_AUTH");
                        ndk ndkVar = ndk.this;
                        ndkVar.c(ndkVar.o);
                        break;
                    case 20007:
                        LogUtil.a("RemotePhoto", "handleMessage what = HANDLER_ACTION_CAMERA_FORBIDDEN");
                        ndk.this.a(3);
                        break;
                    default:
                        LogUtil.a("RemotePhoto", "other handleMessage");
                        break;
                }
            }
        };
        this.l = new BroadcastReceiver() { // from class: ndk.4
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent == null || context == null) {
                    LogUtil.j("RemotePhoto", "intent or context is null");
                    return;
                }
                LogUtil.a("RemotePhoto", "mRemotePhotoCastReceiver intent:", intent.getAction());
                String action = intent.getAction();
                if (action == null) {
                    LogUtil.j("RemotePhoto", "action is null");
                    return;
                }
                if (action.equals("com.huawei.remote.camera.open")) {
                    ndk.d.put(action, Long.valueOf(System.currentTimeMillis()));
                }
                if (action.equals("com.huawei.remotecontrol.stop")) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Long l = (Long) ndk.d.get("com.huawei.remote.camera.open");
                    if (l != null && Math.abs(jCurrentTimeMillis - l.longValue()) < 1000 && action.equals("com.huawei.remotecontrol.stop")) {
                        LogUtil.a("RemotePhoto", "The time for enabling and disabling the broadcast is less than 1s.");
                        ndk.d.remove("com.huawei.remote.camera.open");
                        return;
                    }
                }
                if (ndk.this.f) {
                    d(action);
                } else {
                    b(action);
                }
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:21:0x003b  */
            private void b(String str) {
                byte b2;
                str.hashCode();
                switch (str) {
                    case "com.hihonor.remotecontrol.start":
                        b2 = 0;
                        break;
                    case "com.huawei.remotecontrol.stop":
                        b2 = 1;
                        break;
                    case "com.huawei.remotecontrol.start":
                        b2 = 2;
                        break;
                    case "com.hihonor.remotecontrol.stop":
                        b2 = 3;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                if (b2 != 0) {
                    if (b2 != 1) {
                        if (b2 != 2) {
                            if (b2 != 3) {
                                LogUtil.j("RemotePhoto", "Other action");
                                return;
                            }
                        }
                    }
                    LogUtil.a("RemotePhoto", "Camera stop");
                    ndk.this.k.removeMessages(20004);
                    ndk.this.k.sendEmptyMessageDelayed(20004, 1000L);
                    ndk.this.k.removeMessages(20003);
                    ndk.this.k.sendEmptyMessageDelayed(20003, 10000L);
                    return;
                }
                LogUtil.a("RemotePhoto", "Camera start");
                if (ndk.this.i) {
                    ndk.this.a(1);
                }
                ndk.this.i = false;
                ndk.this.k.removeMessages(20004);
                ndk.this.k.removeMessages(20003);
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:25:0x0047  */
            private void d(String str) {
                byte b2;
                str.hashCode();
                switch (str) {
                    case "com.hihonor.remotecontrol.start":
                        b2 = 0;
                        break;
                    case "android.intent.action.FORBIDDEN":
                        b2 = 1;
                        break;
                    case "com.huawei.remotecontrol.stop":
                        b2 = 2;
                        break;
                    case "com.huawei.remotecontrol.start":
                        b2 = 3;
                        break;
                    case "com.hihonor.remotecontrol.stop":
                        b2 = 4;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                if (b2 != 0) {
                    if (b2 == 1) {
                        LogUtil.a("RemotePhoto", "Camera forbidden");
                        ndk.this.k.sendEmptyMessage(20007);
                    } else if (b2 != 2) {
                        if (b2 != 3) {
                            if (b2 != 4) {
                                LogUtil.j("RemotePhoto", "Other action");
                                return;
                            }
                        }
                    }
                    LogUtil.a("RemotePhoto", "Camera stop");
                    ndk.this.j = false;
                    ndk.this.i = false;
                    ndk.this.k.removeMessages(20004);
                    ndk.this.k.sendEmptyMessageDelayed(20004, 1000L);
                    ndk.this.k.removeMessages(20003);
                    ndk.this.k.sendEmptyMessage(20003);
                    return;
                }
                ndk ndkVar = ndk.this;
                if (!ArrayUtils.contains(new int[]{1, 0}, ndkVar.b(ndkVar.n.getDeviceUdid()))) {
                    LogUtil.a("RemotePhoto", "can not start remote camera");
                    return;
                }
                LogUtil.a("RemotePhoto", "Camera start");
                ndk.this.j = true;
                if (ndk.this.i) {
                    ndk.this.a(1);
                }
                ndk.this.i = false;
                ndk.this.k.removeMessages(20004);
                ndk.this.k.removeMessages(20003);
            }
        };
        this.g = new ServiceConnection() { // from class: ndk.2
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                LogUtil.a("RemotePhoto", "DMSDPService connect success");
                BaseApplication.getContext().unbindService(ndk.this.g);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                LogUtil.a("RemotePhoto", "DMSDPService connect fail");
            }
        };
        LogUtil.a("RemotePhoto", "enter RemoteCameraManager");
        this.h = BaseApplication.getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (CommonUtil.bp() || CommonUtil.bd()) {
            Intent intent = new Intent("android.intent.action.BLUETOOTH_BUTTON_COMMAND");
            if (MagicBuild.f36615a && MagicBuild.f36616b >= 33) {
                LogUtil.a("RemotePhoto", "new honor os");
                BaseApplication.getContext().sendBroadcast(intent, "com.hihonor.camera.permission.PRIVATE");
                return;
            } else {
                LogUtil.a("RemotePhoto", "hw os");
                BaseApplication.getContext().sendBroadcast(intent, "com.huawei.camera.permission.PRIVATE");
                return;
            }
        }
        LogUtil.a("RemotePhoto", "not more than EMUI 8.0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        LogUtil.a("RemotePhoto", "backToHome enter");
        try {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setFlags(268435456);
            intent.addCategory("android.intent.category.HOME");
            BaseApplication.getContext().startActivity(intent);
        } catch (ActivityNotFoundException | SecurityException unused) {
            LogUtil.e("RemotePhoto", "backToHome Exception");
            xjt.al("backToHome Exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        try {
            if (!CommonUtil.bp() && !CommonUtil.bd()) {
                LogUtil.a("RemotePhoto", "handleOpenCamera not more than EMUI 8.0 and no honor");
                xjt.al("handleOpenCamera not more than EMUI 8.0 and no honor");
                return;
            }
            Intent intent = new Intent(str);
            intent.addFlags(268435456);
            intent.addFlags(67108864);
            if (this.f) {
                intent.addFlags(134217728);
                Bundle bundle = new Bundle();
                bundle.putString("udid", this.n.getDeviceUdid());
                bundle.putString("device_name", this.n.getDeviceName());
                intent.putExtras(bundle);
            } else {
                intent.putExtra("startFrom", "health");
            }
            PackageManager packageManager = this.h.getPackageManager();
            if (packageManager != null) {
                ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 1048576);
                if (resolveInfoResolveActivity != null && resolveInfoResolveActivity.activityInfo != null) {
                    intent.setComponent(new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name));
                }
                LogUtil.j("RemotePhoto", "resolveInfo or resolveInfo.activityInfo is null");
                xjt.al("resolveInfo or resolveInfo.activityInfo is null");
                return;
            }
            try {
                iov.d(BaseApplication.getContext(), intent);
            } catch (NullPointerException unused) {
                LogUtil.e("RemotePhoto", "handleOpenCamera Exception");
                xjt.al("handleOpenCamera Exception");
            }
        } catch (ActivityNotFoundException | AndroidRuntimeException | SecurityException unused2) {
            LogUtil.e("RemotePhoto", "handleOpenCamera Exception");
            xjt.al("handleOpenCamera Exception");
        }
    }

    private boolean d(String str) {
        LogUtil.a("RemotePhoto", "isSupportAuthAction: ", str);
        Intent intent = new Intent(str);
        PackageManager packageManager = this.h.getPackageManager();
        if (packageManager != null) {
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 1048576);
            if (resolveInfoResolveActivity == null || resolveInfoResolveActivity.activityInfo == null) {
                LogUtil.a("RemotePhoto", "resolveInfo or resolveInfo.activityInfo is null, isSupportAuthAction is false");
                return false;
            }
            LogUtil.a("RemotePhoto", "isSupportAuthAction is true");
            return true;
        }
        LogUtil.a("RemotePhoto", "packageManager is null, isSupportAuthAction is false");
        return false;
    }

    private boolean f() {
        if (d("com.huawei.camera.intent.RemoteCall")) {
            this.o = "com.huawei.camera.intent.RemoteCall";
        } else {
            if (!d("android.intent.action.RemoteCall")) {
                return false;
            }
            this.o = "android.intent.action.RemoteCall";
        }
        return ndh.a(mgg.c("RemotePhoto"));
    }

    public static ndk b() {
        ndk ndkVar;
        synchronized (f42938c) {
            if (f42937b == null) {
                f42937b = new ndk();
            }
            ndkVar = f42937b;
        }
        return ndkVar;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 2001;
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        cpl.d("RemotePhoto", bArr, "getResult: ");
        if (deviceInfo == null || bArr == null || bArr.length < 2) {
            LogUtil.j("RemotePhoto", "device or dataContents is null");
            return;
        }
        if (!c(deviceInfo)) {
            LogUtil.j("RemotePhoto", "device not support remoteCamera.");
            return;
        }
        String strE = eeq.e(bArr);
        this.n = deviceInfo;
        if (strE == null || 4 > strE.length()) {
            return;
        }
        try {
            List<eew> listE = new eet().b(strE.substring(4, strE.length())).e();
            byte b2 = bArr[1];
            if (b2 == 41) {
                a(bArr, listE, deviceInfo);
            } else if (b2 == 42) {
                LogUtil.a("RemotePhoto", "COMMAND_ID_REMOTE_CAMERA_STATUS ");
            } else {
                LogUtil.j("RemotePhoto", "handleOtherDeviceResult default commandId :", Byte.valueOf(b2));
            }
        } catch (eeu unused) {
            LogUtil.e("RemotePhoto", "TlvException");
            xjt.al("TlvException");
        } catch (IndexOutOfBoundsException unused2) {
            LogUtil.e("RemotePhoto", "IndexOutOfBoundsException");
            xjt.al("IndexOutOfBoundsException");
        }
    }

    private void j(final DeviceInfo deviceInfo) {
        LogUtil.a("RemotePhoto", "openCamera() enter");
        this.i = true;
        boolean zF = f();
        this.f = zF;
        LogUtil.a("RemotePhoto", "isNewAppRule is ", Boolean.valueOf(zF));
        ThreadPoolManager.c().execute(new Runnable() { // from class: ndk.5
            @Override // java.lang.Runnable
            public void run() {
                ndk.this.k.removeMessages(20003);
                ndk.this.j();
                ndk.this.a(100000, deviceInfo);
                Message messageObtain = Message.obtain();
                if (ndk.this.f) {
                    Intent intent = new Intent();
                    intent.setAction("com.huawei.remote.camera.open");
                    ndk.this.h.sendBroadcast(intent, WebViewActivity.HW_SIGNATURE_OR_SYSTEM);
                    messageObtain.what = 20006;
                } else {
                    ndk ndkVar = ndk.this;
                    if (ndkVar.d(ndkVar.h)) {
                        ndk ndkVar2 = ndk.this;
                        ndkVar2.c(ndkVar2.h);
                        messageObtain.what = 20001;
                    } else {
                        messageObtain.what = 20000;
                    }
                }
                ndk.this.k.sendMessage(messageObtain);
            }
        });
    }

    private void g(final DeviceInfo deviceInfo) {
        LogUtil.a("RemotePhoto", "takePicture() enter");
        ThreadPoolManager.c().execute(new Runnable() { // from class: ndk.1
            @Override // java.lang.Runnable
            public void run() {
                ndk.this.a(100000, deviceInfo);
                Message messageObtain = Message.obtain();
                messageObtain.what = 20002;
                ndk.this.k.sendMessage(messageObtain);
            }
        });
    }

    private void e(DeviceInfo deviceInfo) {
        LogUtil.a("RemotePhoto", "closeCamera() enter");
        a(100000, deviceInfo);
        if (this.f) {
            Intent intent = new Intent();
            intent.setAction("com.huawei.remote.camera.exit");
            intent.putExtra("is_control_camera_doing", this.j);
            this.h.sendBroadcast(intent, WebViewActivity.HW_SIGNATURE_OR_SYSTEM);
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 20005;
        this.k.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (CommonUtil.bp() || CommonUtil.bd()) {
            IntentFilter intentFilter = new IntentFilter();
            if (MagicBuild.f36615a && MagicBuild.f36616b >= 33) {
                LogUtil.a("RemotePhoto", "enter new honor");
                intentFilter.addAction("com.hihonor.remotecontrol.start");
                intentFilter.addAction("com.hihonor.remotecontrol.stop");
                BroadcastManagerUtil.c(this.h, this.l, intentFilter, "com.hihonor.camera.permission.REMOTECONTROLLER", null);
                return;
            }
            LogUtil.a("RemotePhoto", "enter hw");
            intentFilter.addAction("com.huawei.remotecontrol.start");
            intentFilter.addAction("com.huawei.remotecontrol.stop");
            intentFilter.addAction("android.intent.action.FORBIDDEN");
            intentFilter.addAction("com.huawei.remote.camera.open");
            intentFilter.addAction("com.huawei.remote.camera.exit");
            BroadcastManagerUtil.c(this.h, this.l, intentFilter, "com.huawei.camera.permission.REMOTECONTROLLER", null);
            return;
        }
        LogUtil.a("RemotePhoto", "not more than EMUI 8.0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        LogUtil.a("RemotePhoto", "unregisterRemotePhotoCastBroadcast enter");
        try {
            this.h.unregisterReceiver(this.l);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("RemotePhoto", "unregisterRemotePhotoCastBroadcast exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Context context) {
        LogUtil.a("RemotePhoto", "wakeUpPhone enter");
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (!powerManager.isScreenOn()) {
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(268435466, "RemotePhoto");
            wakeLockNewWakeLock.acquire(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
            wakeLockNewWakeLock.release();
            return;
        }
        LogUtil.a("RemotePhoto", "screen On");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(Context context) {
        LogUtil.a("RemotePhoto", "isScreenClosed enter");
        return ((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }

    private void a(byte[] bArr, List<eew> list, DeviceInfo deviceInfo) {
        if (bArr == null || list == null) {
            return;
        }
        for (eew eewVar : list) {
            try {
                if (CommonUtil.v(eewVar.e()) != 1) {
                    LogUtil.j("RemotePhoto", "Invalid control types");
                } else {
                    b(eewVar, deviceInfo);
                }
            } catch (NumberFormatException unused) {
                LogUtil.e("RemotePhoto", "remoteCameraControl NumberFormatException");
                xjt.al("remoteCameraControl NumberFormatException");
            }
        }
    }

    private void b(eew eewVar, DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("DEVMGR_RemotePhoto", "cameraControl() enter");
        if (eewVar == null) {
            return;
        }
        int iV = CommonUtil.v(eewVar.b());
        if (iV == 1) {
            j(deviceInfo);
            return;
        }
        if (iV == 2) {
            g(deviceInfo);
        } else if (iV == 3) {
            e(deviceInfo);
        } else {
            LogUtil.j("RemotePhoto", "other tlv value");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, DeviceInfo deviceInfo) {
        LogUtil.a("RemotePhoto", "sendCameraControlResponse");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(1);
        deviceCommand.setCommandID(41);
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(eeq.d(127) + eeq.d(4) + eeq.d(i));
        byte[] bArrC = eeq.c(stringBuffer.toString());
        deviceCommand.setDataLen(bArrC.length);
        deviceCommand.setDataContent(bArrC);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        LogUtil.a("RemotePhoto", "sendCameraStatus :", Integer.valueOf(i));
        DeviceCapability deviceCapabilityB = b(this.n);
        if (deviceCapabilityB == null || !deviceCapabilityB.isSupportRemoteCamera()) {
            LogUtil.j("RemotePhoto", "device not support remoteCamera.");
            return;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(1);
        deviceCommand.setCommandID(42);
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(eeq.d(1) + eeq.d(1) + eeq.d(i));
        byte[] bArrC = eeq.c(stringBuffer.toString());
        deviceCommand.setDataLen(bArrC.length);
        deviceCommand.setDataContent(bArrC);
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public boolean d(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("RemotePhoto", "isSupportControlCapability deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, 28);
    }

    private boolean c(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapabilityB = b(deviceInfo);
        return deviceCapabilityB != null && deviceCapabilityB.isSupportRemoteCamera();
    }

    private DeviceCapability b(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("RemotePhoto", "getCapability, device is null");
            return null;
        }
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), "RemotePhoto");
        if (mapQueryDeviceCapability == null || mapQueryDeviceCapability.isEmpty()) {
            return null;
        }
        return mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify());
    }

    public void a(DeviceInfo deviceInfo) {
        boolean zD = ndh.d();
        LogUtil.a("RemotePhoto", "isPullCameraService: ", Boolean.valueOf(zD));
        if (zD) {
            b(deviceInfo, a());
        } else {
            b(deviceInfo, ndh.e());
        }
    }

    private boolean a() {
        boolean zBindService;
        Intent intent = new Intent();
        intent.setAction("com.huawei.dmsdp.DMSDP_CAMERA_REMOTE_CTRL");
        intent.setPackage("com.huawei.dmsdp");
        try {
            zBindService = BaseApplication.getContext().bindService(intent, this.g, 1);
        } catch (SecurityException e2) {
            LogUtil.e("RemotePhoto", "bind ServiceStatus exception ", LogAnonymous.b(e2));
            zBindService = false;
        }
        boolean zE = !zBindService ? e() : zBindService;
        LogUtil.a("RemotePhoto", "bindServiceStatus is: ", Boolean.valueOf(zBindService), "isCameraCapability is: ", Boolean.valueOf(zE));
        ndh.a(zE);
        ndh.a(ndh.b());
        return zE;
    }

    public void b(DeviceInfo deviceInfo, boolean z) {
        LogUtil.a("RemotePhoto", "camera capability is", Boolean.valueOf(z));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(1);
        deviceCommand.setCommandID(42);
        StringBuilder sb = new StringBuilder(16);
        String str = eeq.d(1) + eeq.d(1) + eeq.d(0);
        String str2 = eeq.d(2) + eeq.d(1) + eeq.d(z ? 1 : 0);
        sb.append(str);
        sb.append(str2);
        byte[] bArrC = eeq.c(sb.toString());
        deviceCommand.setDataLen(bArrC.length);
        deviceCommand.setDataContent(bArrC);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        cpl.d("RemotePhoto", deviceCommand.getDataContent(), "sendDeviceToCameraCapability command: ");
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    private boolean e() {
        try {
            Cursor cursorQuery = BaseApplication.getContext().getContentResolver().query(f42936a, null, null, null, null);
            boolean z = cursorQuery != null;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return z;
        } catch (SQLException unused) {
            LogUtil.e("RemotePhoto", "checkCameraCapability SQLException");
            return false;
        } catch (IllegalArgumentException unused2) {
            LogUtil.e("RemotePhoto", "checkCameraCapability IllegalArgumentException");
            return false;
        } catch (SecurityException unused3) {
            LogUtil.e("RemotePhoto", "checkCameraCapability SecurityException");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x0070 A[DONT_GENERATE, PHI: r0
      0x0070: PHI (r0v3 android.database.Cursor) = (r0v2 android.database.Cursor), (r0v4 android.database.Cursor) binds: [B:27:0x006e, B:18:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    public int b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("RemotePhoto", "isCameraAuthorized deviceUdid is empty");
            return -1;
        }
        Cursor cursorQuery = null;
        try {
            cursorQuery = BaseApplication.getContext().getContentResolver().query(e, null, str, null, null);
            if (cursorQuery != null && cursorQuery.getCount() != 0) {
                if (!cursorQuery.moveToNext()) {
                    return -1;
                }
                int i = cursorQuery.getInt(1);
                LogUtil.a("RemotePhoto", "getCameraAuthStatus camera status is ", Integer.valueOf(i));
                return i;
            }
            LogUtil.j("RemotePhoto", "isCameraAuthorized cursor is null");
            return -1;
        } catch (SQLException unused) {
            LogUtil.e("RemotePhoto", "isCameraAuthorized SQLException");
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }
}
