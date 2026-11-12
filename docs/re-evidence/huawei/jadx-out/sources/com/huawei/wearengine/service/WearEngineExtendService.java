package com.huawei.wearengine.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.wearengine.BinderService;
import com.huawei.wearengine.ClientToken;
import com.huawei.wearengine.HwWearEngineNativeBinder;
import com.huawei.wearengine.IdentityStoreCallback;
import com.huawei.wearengine.auth.AuthListener;
import com.huawei.wearengine.auth.AuthListenerManager;
import com.huawei.wearengine.auth.Permission;
import com.huawei.wearengine.core.device.VirtualDevice;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.p2p.IdentityInfo;
import com.huawei.wearengine.repository.AuthInfoRepositoryImpl;
import com.huawei.wearengine.repository.api.AuthInfoRepository;
import com.huawei.wearengine.service.api.AuthManagerImpl;
import com.huawei.wearengine.service.api.DeviceManagerImpl;
import com.huawei.wearengine.service.api.MonitorManagerImpl;
import com.huawei.wearengine.service.api.NotifyManagerImpl;
import com.huawei.wearengine.service.api.OtaManagerImpl;
import com.huawei.wearengine.service.api.P2pManagerImpl;
import com.huawei.wearengine.service.api.SensorManagerImpl;
import com.huawei.wearengine.service.api.WearEngineManagerImpl;
import defpackage.oql;
import defpackage.yia;
import defpackage.yic;
import defpackage.yik;
import defpackage.yit;
import defpackage.yiv;
import defpackage.yiw;
import defpackage.yix;
import defpackage.ylm;
import defpackage.yln;
import defpackage.ylo;
import defpackage.ylz;
import defpackage.yma;
import defpackage.ymd;
import defpackage.ymi;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes46.dex */
public class WearEngineExtendService extends Service {
    private static ConcurrentHashMap<Integer, IBinder> e = new ConcurrentHashMap<>(8);
    private yiw f = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile AuthInfoRepository f30782c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile yik f30780a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f30781b = new Object();
    private String g = null;
    private String j = UUID.randomUUID().toString();
    private IBinder i = new BinderService.Stub() { // from class: com.huawei.wearengine.service.WearEngineExtendService.1
        @Override // com.huawei.wearengine.BinderService
        public IBinder getBinder(int i) throws RemoteException {
            yit.e("WearEngineExtendService", "BinderService getBinder");
            return WearEngineExtendService.this.a(yiv.e(), yiv.d(), i);
        }

        @Override // com.huawei.wearengine.BinderService
        public IBinder getBinderProxy(int i, int i2, int i3) throws RemoteException {
            return WearEngineExtendService.this.a(i, i2, i3);
        }

        @Override // com.huawei.wearengine.BinderService
        public void registerToken(String str, ClientToken clientToken) throws RemoteException {
            WearEngineExtendService.this.c(yiv.e(), yiv.d(), str, clientToken);
        }

        @Override // com.huawei.wearengine.BinderService
        public void registerTokenProxy(int i, int i2, String str, ClientToken clientToken) throws RemoteException {
            WearEngineExtendService.this.c(i, i2, str, clientToken);
        }

        @Override // com.huawei.wearengine.BinderService
        public void checkPermissionIdentity(String str, String str2, IdentityStoreCallback identityStoreCallback) throws RemoteException {
            if (checkPermission()) {
                WearEngineExtendService.this.a(yiv.e(), yiv.d(), str, str2, identityStoreCallback);
            }
        }

        @Override // com.huawei.wearengine.BinderService
        public void checkPermissionIdentityProxy(int i, int i2, String str, String str2, IdentityStoreCallback identityStoreCallback) throws RemoteException {
            yit.e("WearEngineExtendService", "BinderService checkPermissionIdentityProxy");
            WearEngineExtendService.this.a(i, i2, str, str2, identityStoreCallback);
        }

        @Override // com.huawei.wearengine.BinderService
        public int exchangeApiLevel(int i) {
            yit.e("WearEngineExtendService", "BinderService exchangeApiLevel, sdkApiLevel:" + i);
            if (!checkPermission()) {
                return 0;
            }
            WearEngineExtendService.this.e(yiv.e(), yiv.d(), i);
            return yma.b();
        }

        @Override // com.huawei.wearengine.BinderService
        public int exchangeApiLevelProxy(int i, int i2, int i3) {
            yit.e("WearEngineExtendService", "BinderService exchangeApiLevelProxy, sdkApiLevel:" + i3);
            if (!checkPermission()) {
                return 0;
            }
            WearEngineExtendService.this.e(i, i2, i3);
            return exchangeApiLevel(i3);
        }

        private boolean checkPermission() {
            return Binder.getCallingUid() == getCallingUid();
        }
    };
    private IBinder h = new HwWearEngineNativeBinder.Stub() { // from class: com.huawei.wearengine.service.WearEngineExtendService.2
        @Override // com.huawei.wearengine.HwWearEngineNativeBinder
        public void setBinder(String str, IBinder iBinder) throws RemoteException {
            if (TextUtils.isEmpty(str)) {
                yit.b("WearEngineExtendService", "setBinder tag is null");
                return;
            }
            if (iBinder == null) {
                yit.b("WearEngineExtendService", "setBinder binder is null");
                return;
            }
            if (!ylo.c()) {
                yit.b("WearEngineExtendService", "setBinder is not InnerInvoke");
                return;
            }
            if (str.equals("WearEngine")) {
                yix.b().e(str, iBinder);
            }
            if (str.equals("WearEnginePhdkit")) {
                oql.d(yiv.a()).b(iBinder);
            }
        }

        @Override // com.huawei.wearengine.HwWearEngineNativeBinder
        public boolean isP2pReceiverExist(Device device, IdentityInfo identityInfo, IdentityInfo identityInfo2) {
            if (device == null || identityInfo == null || identityInfo2 == null) {
                yit.b("WearEngineExtendService", "isP2pReceiverExist argument is invalid");
                return false;
            }
            yit.e("WearEngineExtendService", "enter isP2pReceiverExist");
            VirtualDevice virtualDeviceE = yix.b().e(device);
            if (virtualDeviceE == null) {
                yit.b("WearEngineExtendService", "isP2pReceiverExist virtualDevice is null");
                return false;
            }
            return virtualDeviceE.isP2pReceiverExist(device.getUuid(), identityInfo, identityInfo2);
        }
    };
    private IBinder d = new AuthListenerManager.Stub() { // from class: com.huawei.wearengine.service.WearEngineExtendService.4
        @Override // com.huawei.wearengine.auth.AuthListenerManager
        public void authListenerOnOk(String str, Permission[] permissionArr) throws RemoteException {
            yit.e("WearEngineExtendService", "authListenerOnOk key:" + str);
            if (!TextUtils.isEmpty(str)) {
                synchronized (WearEngineExtendService.this.f30781b) {
                    if (WearEngineExtendService.this.f30782c != null) {
                        WearEngineExtendService.this.f30782c.updateCache(str);
                    }
                }
                AuthListener authListenerD = yia.c().d(str);
                if (authListenerD == null) {
                    yit.c("WearEngineExtendService", "authListenerOnOk authListener is null");
                    return;
                }
                try {
                    authListenerD.onOk(permissionArr);
                    yit.e("WearEngineExtendService", "authListener.onOk");
                    return;
                } catch (Exception unused) {
                    yit.b("WearEngineExtendService", "authListener.onOk has exception");
                    return;
                }
            }
            yit.b("WearEngineExtendService", "authListenerOnOk key is empty");
        }

        @Override // com.huawei.wearengine.auth.AuthListenerManager
        public void authListenerOnCancel(String str) throws RemoteException {
            yit.e("WearEngineExtendService", "authListenerOnCancel key:" + str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            AuthListener authListenerD = yia.c().d(str);
            if (authListenerD == null) {
                yit.e("WearEngineExtendService", "authListenerOnCancel authListener is null");
                return;
            }
            try {
                authListenerD.onCancel();
                yit.e("WearEngineExtendService", "authListener.onCancel");
            } catch (Exception unused) {
                yit.b("WearEngineExtendService", "authListener.onCancel has exception");
            }
        }

        @Override // com.huawei.wearengine.auth.AuthListenerManager
        public List<String> getAllPackageName() throws RemoteException {
            Set<String> setC = ylz.c(yiv.a());
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(setC);
            return arrayList;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, int i2, int i3) {
        synchronized (this.f30781b) {
            yiw yiwVar = this.f;
            if (yiwVar == null) {
                yit.b("WearEngineExtendService", "mClientManager is null in saveSdkApiLevel.");
            } else {
                yiwVar.b(i, i2, i3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IBinder a(int i, int i2, int i3) {
        String strB;
        IBinder iBinderE;
        yit.e("WearEngineExtendService", this.j + " queryBinder apiType: " + i3);
        Context contextA = yiv.a();
        if (!ylm.c(yln.c(contextA))) {
            yit.c("WearEngineExtendService", "getBinder account not login!");
            throw new IllegalStateException(String.valueOf(3));
        }
        if (!yln.d(contextA)) {
            yit.c("WearEngineExtendService", "getBinder not authorized");
            throw new IllegalStateException(String.valueOf(7));
        }
        yit.a("WearEngineExtendService", "BinderService getBinder:" + i3);
        if (i3 == 1 && !yln.d()) {
            yit.b("WearEngineExtendService", "get DeviceManagerImpl no device");
            throw new IllegalStateException(String.valueOf(4));
        }
        yit.a("WearEngineExtendService", "BinderService getBinder uid: " + i);
        yit.a("WearEngineExtendService", "BinderService getBinder pid: " + i2);
        synchronized (this.f30781b) {
            if (this.f == null) {
                yit.b("WearEngineExtendService", "mClientManager is null in queryBinder.");
                throw new IllegalStateException(String.valueOf(12));
            }
            strB = yln.b(i, yiv.a(), this.f.getApplicationIdByPid(Integer.valueOf(i2)));
        }
        b(i, strB);
        int iB = b(i, strB, contextA);
        if (iB != 0) {
            yit.c("WearEngineExtendService", "preGrantPermission failed, ret:" + iB);
            throw new IllegalStateException(String.valueOf(iB));
        }
        synchronized (this.f30781b) {
            iBinderE = e.get(Integer.valueOf(i3));
            if (iBinderE == null) {
                iBinderE = e(i3);
            }
        }
        return iBinderE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, int i2, String str, ClientToken clientToken) throws RemoteException {
        yit.e("WearEngineExtendService", this.j + " BinderService registerToken");
        if (TextUtils.isEmpty(str)) {
            yit.b("WearEngineExtendService", "BinderService registerToken clientPkgName is null");
            return;
        }
        if (clientToken == null) {
            yit.b("WearEngineExtendService", "BinderService registerToken token is null");
            return;
        }
        if (TextUtils.isEmpty(this.g)) {
            String strC = yln.c(yiv.a());
            boolean zD = yln.d(yiv.a());
            if (ylm.c(strC) && zD) {
                this.g = yln.b(yiv.a());
            }
        }
        synchronized (this.f30781b) {
            if (this.f == null) {
                yit.b("WearEngineExtendService", "mClientManager is null in startRegisterToken.");
                return;
            }
            yit.e("WearEngineExtendService", "BinderService setApplicationId pid:" + i2);
            yit.e("WearEngineExtendService", "BinderService setApplicationId clientPkgName:" + str);
            this.f.setApplicationId(Integer.valueOf(i2), str);
            this.f.d(i, clientToken, str);
            clientToken.asBinder().linkToDeath(this.f.a(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2, String str, String str2, IdentityStoreCallback identityStoreCallback) throws RemoteException {
        if (identityStoreCallback == null) {
            yit.c("WearEngineExtendService", "BinderService handleCheck callback == null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            yit.c("WearEngineExtendService", "BinderService handleCheck packageName isEmpty");
            identityStoreCallback.storePermissionIdentity(null);
            return;
        }
        String strC = c(i, str);
        if (TextUtils.isEmpty(strC)) {
            yit.b("WearEngineExtendService", "BinderService handleCheck generatePermissionIdentity error");
            identityStoreCallback.storePermissionIdentity(null);
        } else {
            if (strC.equals(str2)) {
                return;
            }
            yit.e("WearEngineExtendService", "BinderService need clear permission data");
            identityStoreCallback.storePermissionIdentity(strC);
            d(i, str);
        }
    }

    private String c(int i, String str) {
        StringBuffer stringBuffer = new StringBuffer(128);
        stringBuffer.append(i);
        stringBuffer.append("_");
        stringBuffer.append(str);
        stringBuffer.append("_wearEngine");
        return ymi.c(stringBuffer.toString(), "SHA-256");
    }

    private void d(int i, String str) {
        yit.a("WearEngineExtendService", "BinderService clearPermissionData");
        Context contextA = yiv.a();
        if (TextUtils.isEmpty(str)) {
            yit.c("WearEngineExtendService", "BinderService clearPermissionData packageName isEmpty");
            return;
        }
        int iJ = yln.j(contextA, str);
        if (iJ == 0) {
            yit.c("WearEngineExtendService", "BinderService clearPermissionData appId == 0");
            return;
        }
        String strC = yln.c(contextA);
        if (TextUtils.isEmpty(strC)) {
            yit.c("WearEngineExtendService", "BinderService clearPermissionData userId isEmpty");
            return;
        }
        synchronized (this.f30781b) {
            if (this.f30782c == null) {
                this.f30782c = new AuthInfoRepositoryImpl(contextA);
            }
            this.f30782c.deleteAuth(i, strC, iJ);
        }
    }

    private void b(int i, String str) {
        String strB = yln.b(i, yiv.a(), str);
        new yik(this.f30782c, this.g);
        if (yik.b(i, strB)) {
            return;
        }
        ylz.a(yiv.a(), strB);
        if (TextUtils.isEmpty(yln.c(yiv.a()))) {
            throw new IllegalStateException(String.valueOf(3));
        }
        yln.a(yiv.a(), strB);
    }

    private int b(int i, String str, Context context) {
        synchronized (this.f30781b) {
            if (this.f30782c == null) {
                this.f30782c = new AuthInfoRepositoryImpl(yiv.a());
            }
        }
        String strB = yln.b(i, context, str);
        new yik(this.f30782c, this.g);
        if (yik.b(i, strB)) {
            yit.e("WearEngineExtendService", "preGrantPermission isSuperCaller");
            return 0;
        }
        return yic.b(this.f30782c).c(context, i, strB);
    }

    private IBinder e(int i) {
        yit.e("WearEngineExtendService", "makeClientManager:" + i);
        if (this.f == null) {
            yit.c("WearEngineExtendService", "makeClientManager mClientManager is null");
            throw new IllegalStateException(String.valueOf(6));
        }
        if (this.f30782c == null) {
            this.f30782c = new AuthInfoRepositoryImpl(yiv.a());
        }
        if (this.f30780a == null) {
            this.f30780a = new yik(this.f30782c, this.g);
        }
        return b(i);
    }

    private IBinder b(int i) {
        switch (i) {
            case 1:
                DeviceManagerImpl deviceManagerImpl = new DeviceManagerImpl(this.f30780a, this.f);
                e.put(Integer.valueOf(i), deviceManagerImpl);
                return deviceManagerImpl;
            case 2:
                P2pManagerImpl p2pManagerImpl = new P2pManagerImpl(this.f30780a, this.f);
                e.put(Integer.valueOf(i), p2pManagerImpl);
                return p2pManagerImpl;
            case 3:
                MonitorManagerImpl monitorManagerImpl = new MonitorManagerImpl(this.f30780a, this.f);
                e.put(Integer.valueOf(i), monitorManagerImpl);
                return monitorManagerImpl;
            case 4:
                NotifyManagerImpl notifyManagerImpl = new NotifyManagerImpl(this.f30780a, this.f);
                e.put(Integer.valueOf(i), notifyManagerImpl);
                return notifyManagerImpl;
            case 5:
                AuthManagerImpl authManagerImpl = new AuthManagerImpl(this.f30782c, this.f);
                e.put(Integer.valueOf(i), authManagerImpl);
                return authManagerImpl;
            case 6:
                return new WearEngineManagerImpl(this.f30780a, this.f, e);
            case 7:
                SensorManagerImpl sensorManagerImpl = new SensorManagerImpl(this.f30780a, this.f);
                e.put(Integer.valueOf(i), sensorManagerImpl);
                return sensorManagerImpl;
            case 8:
                OtaManagerImpl otaManagerImpl = new OtaManagerImpl(this.f30780a, this.f);
                e.put(Integer.valueOf(i), otaManagerImpl);
                return otaManagerImpl;
            default:
                return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        yit.e("WearEngineExtendService", this.j + " onCreate!");
        yiv.c(getApplicationContext());
        ymd.a();
        e.clear();
        this.f = new yiw(e);
        super.onCreate();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        yit.e("WearEngineExtendService", this.j + " onBind!");
        if (intent != null) {
            if ("com.huawei.wearengine.action.PHONE_SERVICE".equals(intent.getAction())) {
                yit.e("WearEngineExtendService", "onBind return HwWearEngineNativeBinder");
                return this.h;
            }
            if ("com.huawei.wearengine.action.AUTH_LISTENER_MANAGER".equals(intent.getAction())) {
                yit.e("WearEngineExtendService", "onBind return AuthListenerManagerBinder");
                return this.d;
            }
        }
        yit.e("WearEngineExtendService", "onBind return BinderService");
        return this.i;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        yit.e("WearEngineExtendService", this.j + " onUnbind!");
        return super.onUnbind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        yit.e("WearEngineExtendService", this.j + " onStartCommand!");
        if (intent == null || !"com.huawei.bone.action.DELETE_AUTH_CACHE".equals(intent.getAction())) {
            return 2;
        }
        c(intent);
        super.onStartCommand(intent, i, i2);
        return 2;
    }

    private void c(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra("third_party_package_name");
            synchronized (this.f30781b) {
                try {
                    if (this.f30782c != null && !TextUtils.isEmpty(stringExtra)) {
                        this.f30782c.deleteAuthFromCache(stringExtra);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (BadParcelableException unused) {
            yit.b("WearEngineExtendService", "getStringExtra catch an BadParcelableException");
        } catch (RuntimeException unused2) {
            yit.b("WearEngineExtendService", "getStringExtra catch an RuntimeException");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        yit.e("WearEngineExtendService", this.j + " onDestroy!");
        synchronized (this.f30781b) {
            e.clear();
            this.f = null;
            this.f30782c = null;
            this.f30780a = null;
        }
        this.g = null;
        super.onDestroy();
    }
}
