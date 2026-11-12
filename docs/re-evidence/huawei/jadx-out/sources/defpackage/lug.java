package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.huawei.callback.BindPhoneServiceCallback;
import com.huawei.datatype.DeviceStatusParam;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.EventBusApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonservice.IServiceBinder;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.deviceside.CustomConfigWatchFaceService;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.deviceside.StickerWatchFaceService;
import com.huawei.hwdevice.phoneprocess.binder.SuggestionBinder;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IAddDeviceStateAIDLCallback;
import com.huawei.hwservicesmgr.IBaseCallback;
import com.huawei.hwservicesmgr.IDeviceStateAIDLCallback;
import com.huawei.hwservicesmgr.IWearPhoneServiceAIDL;
import com.huawei.hwservicesmgr.PhoneService;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.operation.OpAnalyticsUtil;
import defpackage.lug;
import health.compact.a.DeviceUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.ProcessUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes10.dex */
public class lug {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static BindPhoneServiceCallback f40835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static IAddDeviceStateAIDLCallback f40836c;
    private static IBinder f;
    private static IWearPhoneServiceAIDL g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static IDeviceStateAIDLCallback f40834a = new IDeviceStateAIDLCallback.Stub() { // from class: lug.2
        @Override // com.huawei.hwservicesmgr.IDeviceStateAIDLCallback
        public void onDataReceived(DeviceInfo deviceInfo, int i2, byte[] bArr) throws RemoteException {
            lun.a().c(deviceInfo, i2, bArr);
        }

        @Override // com.huawei.hwservicesmgr.IDeviceStateAIDLCallback
        public void onAckReceived(DeviceInfo deviceInfo, int i2, byte[] bArr) throws RemoteException {
            lun.a().a(deviceInfo, i2, bArr);
        }

        @Override // com.huawei.hwservicesmgr.IDeviceStateAIDLCallback
        public void onDatasReceived(DeviceInfo deviceInfo, int i2, String str) {
            lun.a().b(deviceInfo, i2, str);
        }

        @Override // com.huawei.hwservicesmgr.IDeviceStateAIDLCallback
        public void onDeviceConnectionStateChanged(DeviceInfo deviceInfo, int i2, DeviceStatusParam deviceStatusParam) {
            lun.a().d(deviceInfo, i2, deviceStatusParam);
        }
    };
    private static List<IBaseResponseCallback> e = new ArrayList(16);
    private static final List<BindPhoneServiceCallback> h = Collections.synchronizedList(new ArrayList(16));
    private static int i = 0;
    private static ServiceConnection d = new AnonymousClass1();

    /* JADX INFO: renamed from: lug$1, reason: invalid class name */
    class AnonymousClass1 implements ServiceConnection {
        private int e = 0;

        AnonymousClass1() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ReleaseLogUtil.d("R_PhoneServiceManager", "ServiceConnection callback");
            if (lug.c() == null) {
                int i = this.e + 1;
                this.e = i;
                LogUtil.a("PhoneServiceManager", "bind phoneservice times count = ", Integer.valueOf(i));
            }
            lug.d(iBinder);
            lxg.a(true);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            LogUtil.a("PhoneServiceManager", "remote onServiceDisconnected");
            HwVersionManager.b(BaseApplication.getContext()).a(false);
            if (lug.e != null) {
                Iterator it = lug.e.iterator();
                while (it.hasNext()) {
                    ((IBaseResponseCallback) it.next()).a(-1, null);
                }
                lug.e.clear();
            }
            maq.b().j();
            if (lug.f40836c != null) {
                try {
                    lug.f40836c.onAddDeviceState(4);
                } catch (RemoteException e) {
                    LogUtil.e("PhoneServiceManager", "remote exception:", e.getMessage());
                }
                IAddDeviceStateAIDLCallback unused = lug.f40836c = null;
            }
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: luf
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.e();
                }
            });
            executorServiceNewSingleThreadExecutor.shutdown();
            lxg.a(false);
            Intent intent = new Intent();
            intent.setAction("com.huawei.health.phone_service_dead");
            intent.setPackage(BaseApplication.getContext().getPackageName());
            BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
        }

        /* synthetic */ void e() {
            int i = this.e;
            boolean zC = mga.c();
            if (i != this.e) {
                return;
            }
            int iH = BTDeviceMgrUtil.c().h();
            LogUtil.a("PhoneServiceManager", "switchState:", Integer.valueOf(iH), ";isHasDevice:", Boolean.valueOf(zC));
            if (iH != 3 || !zC) {
                lug.d(BaseApplication.getContext());
            }
            lug.b((IWearPhoneServiceAIDL) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(IBinder iBinder) {
        try {
            b(IWearPhoneServiceAIDL.Stub.asInterface(IServiceBinder.Stub.asInterface(iBinder).getServiceBinder(BaseApplication.getAppPackage(), 0)));
            BindPhoneServiceCallback bindPhoneServiceCallback = f40835b;
            if (bindPhoneServiceCallback != null) {
                bindPhoneServiceCallback.onBind();
            }
            ReleaseLogUtil.d("R_PhoneServiceManager", "sLinkageBinder: ", f);
            f();
            oav.d().initReverseLinkage(oav.e());
            g();
            CustomConfigWatchFaceService.getInstance().registerDeviceSampleListener();
            StickerWatchFaceService.getInstance().registerDeviceSampleListener();
            BaseApplication.getContext().sendBroadcast(new Intent("com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS"), LocalBroadcast.f36595c);
            IWearPhoneServiceAIDL iWearPhoneServiceAIDL = g;
            if (iWearPhoneServiceAIDL != null) {
                try {
                    iWearPhoneServiceAIDL.registerDeviceStateCallBack(f40834a);
                    ReleaseLogUtil.d("R_PhoneServiceManager", "processOnServiceConnected is success.");
                } catch (RemoteException e2) {
                    LogUtil.e("PhoneServiceManager", "remote exception:", e2.getMessage());
                }
            }
            o();
            h();
        } catch (RemoteException e3) {
            LogUtil.e("PhoneServiceManager", "system remote exception:", e3.getMessage());
        }
    }

    private static void g() {
        if (ProcessUtil.b()) {
            cjw.b().a();
        }
    }

    private static void o() {
        ThreadPoolManager.c().a("processOnServiceConnected", new Runnable() { // from class: lug.5
            @Override // java.lang.Runnable
            public void run() {
                lvb.e().j();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(IWearPhoneServiceAIDL iWearPhoneServiceAIDL) {
        g = iWearPhoneServiceAIDL;
    }

    private static void h() {
        List<BindPhoneServiceCallback> list = h;
        if (list.isEmpty()) {
            return;
        }
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            ((BindPhoneServiceCallback) it.next()).onBind();
        }
    }

    public static void e(BindPhoneServiceCallback bindPhoneServiceCallback) {
        h.add(bindPhoneServiceCallback);
    }

    public static void d(BindPhoneServiceCallback bindPhoneServiceCallback) {
        h.remove(bindPhoneServiceCallback);
    }

    public static void d(IBaseResponseCallback iBaseResponseCallback) {
        e.add(iBaseResponseCallback);
    }

    public static IWearPhoneServiceAIDL c() {
        return g;
    }

    public static void a(IBinder iBinder) {
        ReleaseLogUtil.d("R_PhoneServiceManager", "binder: ", iBinder, ", sLinkageBinder: ", f);
        f = iBinder;
        f();
    }

    public static void e() {
        j();
        IWearPhoneServiceAIDL iWearPhoneServiceAIDL = g;
        if (iWearPhoneServiceAIDL != null) {
            try {
                iWearPhoneServiceAIDL.registerDeviceStateCallBack(f40834a);
                ReleaseLogUtil.d("R_PhoneServiceManager", "registerDeviceManagerCallback is success");
            } catch (RemoteException e2) {
                LogUtil.e("PhoneServiceManager", "RemoteException = ", e2.getMessage());
            }
        }
    }

    public static void c(IAddDeviceStateAIDLCallback iAddDeviceStateAIDLCallback) {
        f40836c = iAddDeviceStateAIDLCallback;
    }

    public static void e(final Context context) {
        j();
        ((EventBusApi) Services.b("PluginDevice", EventBusApi.class)).subscribeAm16Bind();
        ThreadPoolManager.c().b("PhoneServiceManager", new Runnable() { // from class: com.huawei.hwdevice.mainprocess.PhoneServiceManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                lug.b(context);
            }
        });
    }

    public static /* synthetic */ void b(Context context) {
        if (mga.c()) {
            c(context);
        } else {
            LogUtil.j("PhoneServiceManager", "no device, do nothing");
        }
    }

    private static void j() {
        if (i < 5 && !ProcessUtil.b()) {
            String strD = DfxUtils.d(Thread.currentThread(), null);
            ReleaseLogUtil.d("R_PhoneServiceManager", "callPidError stackTraceInfo= ", strD);
            OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("callPidError", strD);
            i++;
        }
    }

    private static void c(Context context) {
        if (context == null || c() != null) {
            return;
        }
        DeviceUtil.b(context);
        LogUtil.a("PhoneServiceManager", "bindService result is mConnection:", d);
        LogUtil.a("PhoneServiceManager", "bindService result is ", Boolean.valueOf(context.getApplicationContext().bindService(new Intent(context, (Class<?>) PhoneService.class), d, 1)));
    }

    public static void b(Context context, BindPhoneServiceCallback bindPhoneServiceCallback) {
        c(context);
        if (bindPhoneServiceCallback != null) {
            f40835b = bindPhoneServiceCallback;
        }
    }

    public static void d(Context context) {
        if (context == null || c() == null) {
            return;
        }
        try {
            context.getApplicationContext().unbindService(d);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("PhoneServiceManager", "finish IllegalArgumentException");
        } finally {
            b((IWearPhoneServiceAIDL) null);
        }
    }

    private static void f() {
        final IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = c();
        if (iWearPhoneServiceAIDLC == null) {
            LogUtil.j("PhoneServiceManager", "initLinkageBinder binder is null.");
        } else if (f != null) {
            mit.b("PhoneServiceManager", new Runnable() { // from class: lug.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ReleaseLogUtil.d("R_PhoneServiceManager", "sLinkageBinder: ", lug.f);
                        iWearPhoneServiceAIDLC.setBinder("PhoneServiceManager", lug.f, new IBaseCallback.Stub() { // from class: lug.4.3
                            @Override // com.huawei.hwservicesmgr.IBaseCallback
                            public void onResponse(int i2, String str) throws RemoteException {
                                LogUtil.a("PhoneServiceManager", "setBinder result:", Integer.valueOf(i2), "; reason:", str);
                            }
                        });
                    } catch (RemoteException e2) {
                        LogUtil.e("PhoneServiceManager", "initLinkageBinder RemoteException：", ExceptionUtils.c(e2));
                    }
                }
            });
        } else {
            ReleaseLogUtil.d("R_PhoneServiceManager", "sLinkageBinder is null");
        }
    }

    public static void i() {
        LogUtil.a("PhoneServiceManager", "setSuggestionAidl");
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = c();
        if (iWearPhoneServiceAIDLC == null) {
            LogUtil.e("PhoneServiceManager", "phoneServiceBinder == null");
            return;
        }
        try {
            iWearPhoneServiceAIDLC.setSuggestionBinder(new SuggestionBinder());
        } catch (RemoteException unused) {
            LogUtil.e("PhoneServiceManager", "action = ", "com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS", ", RemoteException");
        }
    }
}
