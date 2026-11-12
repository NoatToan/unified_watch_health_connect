package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.huawei.controlcenter.featureability.sdk.IAuthCallback;
import com.huawei.controlcenter.featureability.sdk.IConnectCallback;
import com.huawei.controlcenter.featureability.sdk.IRemoteRegisterService;
import com.huawei.controlcenter.featureability.sdk.model.ExtraParams;
import com.huawei.onehop.fasdk.job.PendingRequest;
import com.tencent.open.apireq.BaseResp;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes40.dex */
public class ohe implements ServiceConnection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ohe f44311c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IRemoteRegisterService f44312a;
    private final Context e;
    private final Object j = new Object();
    private final Object i = new Object();
    private final AtomicBoolean d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<PendingRequest> f44313b = new ArrayList(1);

    private ohe(Context context) {
        if (context == null) {
            this.e = null;
        } else {
            this.e = context.getApplicationContext();
        }
    }

    public static ohe e(Context context) {
        ohe oheVar;
        synchronized (ohe.class) {
            if (f44311c == null) {
                f44311c = new ohe(context);
            }
            oheVar = f44311c;
        }
        return oheVar;
    }

    public int d() {
        Log.i("FAKit: ConnectorMgr", "bindRemoteRegisterService start");
        if (this.e == null) {
            Log.e("FAKit: ConnectorMgr", "bindService, mContext is null");
            return -1101;
        }
        if (!i()) {
            Optional<IRemoteRegisterService> optionalE = e();
            if (optionalE.isPresent()) {
                this.f44312a = optionalE.get();
                this.d.set(true);
                return 0;
            }
            Log.e("FAKit: ConnectorMgr", "get system service,but service is null");
            return -1109;
        }
        if (b()) {
            return 0;
        }
        return c();
    }

    public int e(PendingRequest pendingRequest) {
        Log.i("FAKit: ConnectorMgr", "bindRemoteRegisterService with pendingRequest start");
        if (this.e == null || pendingRequest == null) {
            Log.w("FAKit: ConnectorMgr", "request task is null");
            return -1101;
        }
        if (b()) {
            Log.i("FAKit: ConnectorMgr", "bindRemoteRegisterService is connected");
            pendingRequest.execute();
            return 0;
        }
        synchronized (this.i) {
            this.f44313b.add(pendingRequest);
        }
        return d();
    }

    private Optional<IRemoteRegisterService> e() {
        IBinder iBinder = null;
        try {
            Object objInvoke = Class.forName("com.huawei.android.os.ServiceManagerEx").getMethod("getService", String.class).invoke(null, "HopTaskManagementService");
            if (objInvoke instanceof IBinder) {
                iBinder = (IBinder) objInvoke;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            Log.e("FAKit: ConnectorMgr", "invoke getService exception " + e.getMessage());
        }
        if (iBinder == null) {
            Log.e("FAKit: ConnectorMgr", "get system service,but binder is null");
            return Optional.empty();
        }
        return Optional.ofNullable(IRemoteRegisterService.Stub.asInterface(iBinder));
    }

    private int c() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.huawei.controlcenter", "com.huawei.controlcenter.fatransfer.service.FeatureAbilityRegisterService"));
        try {
            boolean zBindService = this.e.bindService(intent, this, 1);
            Log.i("FAKit: ConnectorMgr", "bindFeatureAbilityService " + zBindService);
            return !zBindService ? -1102 : 0;
        } catch (SecurityException unused) {
            return -1102;
        }
    }

    private boolean i() {
        Context context = this.e;
        if (context == null) {
            Log.e("FAKit: ConnectorMgr", "isSupportedTagService context is null");
            return false;
        }
        try {
            context.getPackageManager().getServiceInfo(new ComponentName("com.huawei.controlcenter", "com.huawei.controlcenter.fatransfer.service.FeatureAbilityRegisterService"), 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FAKit: ConnectorMgr", "can not find getServiceInfo.");
            return false;
        }
    }

    public void a() {
        Log.i("FAKit: ConnectorMgr", "unbindRemoteCardService.");
        try {
            this.e.unbindService(this);
        } catch (IllegalArgumentException e) {
            Log.w("FAKit: ConnectorMgr", "unbindService find a IllegalArgumentException." + e.getMessage());
        }
        synchronized (this.j) {
            this.d.set(false);
            this.f44312a = null;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.i("FAKit: ConnectorMgr", "onServiceConnected: component = " + componentName);
        if (iBinder == null) {
            Log.i("FAKit: ConnectorMgr", "in onServiceConnected IBinder is null");
            return;
        }
        synchronized (this.j) {
            this.f44312a = IRemoteRegisterService.Stub.asInterface(iBinder);
            this.d.set(true);
        }
        synchronized (this.i) {
            Iterator<PendingRequest> it = this.f44313b.iterator();
            while (it.hasNext()) {
                it.next().execute();
            }
            this.f44313b.clear();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        Log.i("FAKit: ConnectorMgr", "onServiceDisconnected: component = " + componentName);
        a();
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(ComponentName componentName) {
        Log.i("FAKit: ConnectorMgr", "onBindingDied: component = " + componentName);
        a();
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName componentName) {
        Log.i("FAKit: ConnectorMgr", "onNullBinding: component = " + componentName);
        a();
    }

    public boolean b() {
        boolean z;
        synchronized (this.j) {
            z = this.f44312a != null && this.d.get();
        }
        return z;
    }

    public int d(String str, IBinder iBinder, ExtraParams extraParams, IConnectCallback iConnectCallback) {
        Log.i("FAKit: ConnectorMgr", "register, packageName:" + ohg.c(str));
        if (!ohg.b(str, extraParams, iConnectCallback)) {
            return BaseResp.CODE_QQ_LOW_VERSION;
        }
        IRemoteRegisterService iRemoteRegisterService = this.f44312a;
        if (iRemoteRegisterService == null) {
            Log.e("FAKit: ConnectorMgr", "register: service is not connected!");
            return BaseResp.CODE_QQ_LOW_VERSION;
        }
        try {
            return iRemoteRegisterService.register(str, iBinder, extraParams, iConnectCallback);
        } catch (RemoteException e) {
            Log.w("FAKit: ConnectorMgr", "register find a remote exception!" + e.getMessage());
            return BaseResp.CODE_QQ_LOW_VERSION;
        }
    }

    public boolean b(int i) {
        Log.i("FAKit: ConnectorMgr", "unregister, token:" + ohg.c(String.valueOf(i)));
        IRemoteRegisterService iRemoteRegisterService = this.f44312a;
        if (iRemoteRegisterService == null) {
            Log.i("FAKit: ConnectorMgr", "unregister: service is not connected!");
            return false;
        }
        try {
            return iRemoteRegisterService.unregister(i);
        } catch (RemoteException e) {
            Log.w("FAKit: ConnectorMgr", "unregister find a remote exception!" + e.getMessage());
            return false;
        }
    }

    public boolean d(int i, String str, int i2) {
        Log.i("FAKit: ConnectorMgr", "updateDeviceStatus, token: " + ohg.c(String.valueOf(i)) + ", deviceId: " + ohg.c(str) + ", status: " + i2);
        if (!ohg.e(str)) {
            return false;
        }
        IRemoteRegisterService iRemoteRegisterService = this.f44312a;
        if (iRemoteRegisterService == null) {
            Log.i("FAKit: ConnectorMgr", "updateDeviceStatus: service is not connected!");
            return false;
        }
        try {
            return iRemoteRegisterService.updateConnectStatus(i, str, i2);
        } catch (RemoteException e) {
            Log.w("FAKit: ConnectorMgr", "updateDeviceStatus find a remote exception!" + e.getMessage());
            return false;
        }
    }

    public boolean a(int i, ExtraParams extraParams) {
        Log.i("FAKit: ConnectorMgr", "showDeviceList, token:" + ohg.c(String.valueOf(i)));
        IRemoteRegisterService iRemoteRegisterService = this.f44312a;
        if (iRemoteRegisterService == null) {
            Log.e("FAKit: ConnectorMgr", "showDeviceList: service is not connected!");
            return false;
        }
        try {
            return iRemoteRegisterService.showDeviceList(i, extraParams);
        } catch (RemoteException e) {
            Log.w("FAKit: ConnectorMgr", "showDeviceList find a remote exception!" + e.getMessage());
            return false;
        }
    }

    public boolean b(String str, IAuthCallback iAuthCallback) {
        Log.i("FAKit: ConnectorMgr", "authReq, pkgName:" + ohg.c(String.valueOf(str)));
        IRemoteRegisterService iRemoteRegisterService = this.f44312a;
        if (iRemoteRegisterService == null) {
            Log.e("FAKit: ConnectorMgr", "authReq: service is not connected!");
            return false;
        }
        try {
            return iRemoteRegisterService.authReq(str, iAuthCallback);
        } catch (RemoteException e) {
            Log.w("FAKit: ConnectorMgr", "authReq find a remote exception!" + e.getMessage());
            return false;
        }
    }
}
