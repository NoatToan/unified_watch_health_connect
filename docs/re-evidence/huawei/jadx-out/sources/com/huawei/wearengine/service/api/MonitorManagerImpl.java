package com.huawei.wearengine.service.api;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import com.huawei.wearengine.MonitorManager;
import com.huawei.wearengine.auth.Permission;
import com.huawei.wearengine.common.WearEngineBiOperate;
import com.huawei.wearengine.core.common.ClientBinderDied;
import com.huawei.wearengine.core.device.PowerModeChangeManager;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.monitor.MonitorData;
import com.huawei.wearengine.monitor.MonitorDataCallback;
import com.huawei.wearengine.monitor.MonitorItem;
import com.huawei.wearengine.utils.DeviceProcessor;
import defpackage.yii;
import defpackage.yik;
import defpackage.yiq;
import defpackage.yir;
import defpackage.yit;
import defpackage.yiv;
import defpackage.yiw;
import defpackage.yjb;
import defpackage.yjn;
import defpackage.ykl;
import defpackage.yln;
import defpackage.ylt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes46.dex */
public class MonitorManagerImpl extends MonitorManager.Stub implements ClientBinderDied, PowerModeChangeManager.HandlePowerModeChange {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ArrayList<String> f30799c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private yiw f30800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IBinder.DeathRecipient f30801b = new IBinder.DeathRecipient() { // from class: com.huawei.wearengine.service.api.MonitorManagerImpl.5
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            MonitorManagerImpl.this.d.i();
        }
    };
    private yjb d;
    private yik e;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f30799c = arrayList;
        arrayList.add(MonitorItem.MONITOR_ITEM_LOW_POWER.getName());
        f30799c.add(MonitorItem.MONITOR_ITEM_CONNECTION.getName());
        f30799c.add(MonitorItem.MONITOR_POWER_STATUS.getName());
        f30799c.add(MonitorItem.MONITOR_CHARGE_STATUS.getName());
        f30799c.add(MonitorItem.MONITOR_ITEM_USER_AVAILABLE_KBYTES.getName());
        f30799c.add(MonitorItem.MONITOR_ITEM_POWER_MODE.getName());
    }

    public MonitorManagerImpl(yik yikVar, yiw yiwVar) {
        this.d = new yjb(yiwVar);
        this.e = yikVar;
        this.f30800a = yiwVar;
    }

    @Override // com.huawei.wearengine.MonitorManager
    public int registerListener(Device device, String str, MonitorItem monitorItem, MonitorDataCallback monitorDataCallback, int i) throws RemoteException {
        yit.e("MonitorManagerImpl", "start registerListener, srcPkgName:" + str + ", code is:" + i);
        yiq.c(device, "device must not be null!");
        yiq.c(str, "srcPkgName must not be null!");
        yiq.c(monitorItem, "monitorItem must not be null!");
        yiq.c(monitorDataCallback, "monitorDataCallback must not be null!");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        try {
            PowerModeChangeManager.a().e(true);
            Permission permissionB = b(str, monitorItem);
            this.e.b(str, "registerListener", a(permissionB), permissionB);
            Device deviceProcessInputDevice = DeviceProcessor.processInputDevice(str, device);
            monitorDataCallback.asBinder().linkToDeath(this.f30801b, 0);
            int iD = this.d.d(deviceProcessInputDevice, new ArrayList(Collections.singleton(monitorItem)), new yjn(Binder.getCallingPid(), i, monitorDataCallback, deviceProcessInputDevice, str));
            wearEngineBiOperate.biApiCalling(contextA, str, "registerListener", String.valueOf(iD));
            return iD;
        } catch (IllegalStateException e) {
            wearEngineBiOperate.biApiCalling(contextA, str, "registerListener", String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    @Override // com.huawei.wearengine.MonitorManager
    public int registerListListener(Device device, String str, List<MonitorItem> list, MonitorDataCallback monitorDataCallback, int i) throws RemoteException {
        yit.e("MonitorManagerImpl", "start registerListListener, srcPkgName:" + str + ", code is:" + i);
        yiq.c(device, "device must not be null!");
        yiq.c(str, "srcPkgName must not be null!");
        yiq.c(list, "monitorItemList must not be null!");
        yiq.c(monitorDataCallback, "monitorDataCallback must not be null!");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        try {
            PowerModeChangeManager.a().e(true);
            for (Permission permission : e(str, list)) {
                this.e.b(str, "registerListListener", a(permission), permission);
            }
            Device deviceProcessInputDevice = DeviceProcessor.processInputDevice(str, device);
            monitorDataCallback.asBinder().linkToDeath(this.f30801b, 0);
            int iD = this.d.d(deviceProcessInputDevice, list, new yjn(Binder.getCallingPid(), i, monitorDataCallback, deviceProcessInputDevice, str));
            wearEngineBiOperate.biApiCalling(contextA, str, "registerListListener", String.valueOf(iD));
            return iD;
        } catch (IllegalStateException e) {
            wearEngineBiOperate.biApiCalling(contextA, str, "registerListListener", String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    @Override // com.huawei.wearengine.MonitorManager
    public int unregisterListener(MonitorDataCallback monitorDataCallback, int i) {
        yit.e("MonitorManagerImpl", "start unregisterListener, code is:" + i);
        int callingPid = Binder.getCallingPid();
        yiq.c(monitorDataCallback, "unregisterListener must not be null!");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        String strB = yln.b(Binder.getCallingUid(), contextA, this.f30800a.getApplicationIdByPid(Integer.valueOf(callingPid)));
        yit.e("MonitorManagerImpl", "unregisterListener, srcPkgName:" + strB);
        PowerModeChangeManager.a().e(true);
        if (this.e.a(new yii(yiv.e(), yiv.d(), strB), wearEngineBiOperate, "unregisterListener", ykl.e, Permission.DEVICE_MANAGER) != 0) {
            this.e.b(strB, "unregisterListener", ykl.i, Permission.WEAR_USER_STATUS);
        }
        yjn yjnVarA = this.d.f().a(new yjn(callingPid, i, monitorDataCallback, null, null));
        try {
            if (yjnVarA == null) {
                yit.b("MonitorManagerImpl", "unregisterListener map do not have the listener");
                wearEngineBiOperate.biApiCalling(yiv.a(), strB, "unregisterListener", String.valueOf(0));
                return 0;
            }
            int iB = this.d.b(yjnVarA);
            if (iB == 0) {
                yjnVarA.e().asBinder().unlinkToDeath(this.f30801b, 0);
            }
            wearEngineBiOperate.biApiCalling(yiv.a(), strB, "unregisterListener", String.valueOf(iB));
            return iB;
        } catch (IllegalStateException e) {
            wearEngineBiOperate.biApiCalling(contextA, strB, "unregisterListener", String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    @Override // com.huawei.wearengine.MonitorManager
    public MonitorData query(Device device, MonitorItem monitorItem) throws RemoteException {
        yit.e("MonitorManagerImpl", "enter query");
        yiq.c(device, "device must not be null!");
        yiq.c(monitorItem, "monitorItem must not be null!");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        String strB = yln.b(Binder.getCallingUid(), contextA, this.f30800a.getApplicationIdByPid(Integer.valueOf(Binder.getCallingPid())));
        try {
            Permission permissionB = b(strB, monitorItem);
            PowerModeChangeManager.a().e(true);
            this.e.b(strB, "query", a(permissionB), permissionB);
            MonitorData monitorDataC = this.d.c(DeviceProcessor.processInputDevice(strB, device), monitorItem);
            wearEngineBiOperate.biApiCalling(contextA, strB, "query", String.valueOf(0));
            return monitorDataC;
        } catch (IllegalStateException e) {
            wearEngineBiOperate.biApiCalling(contextA, strB, "unregisterListener", String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    @Override // com.huawei.wearengine.core.common.ClientBinderDied
    public void handleClientBinderDied(String str) {
        yiq.c(str, "clientPkgName must not be null!");
        yit.e("MonitorManagerImpl", "handleClientBinderDied clientPkgName is: " + str);
        if (!a()) {
            yit.b("MonitorManagerImpl", "handleClientBinderDied checkPermission failed");
        } else {
            this.d.e(str);
        }
    }

    int b(String str) {
        if (!a()) {
            yit.b("MonitorManagerImpl", "removeListener checkPermission failed");
            return 8;
        }
        this.d.e(str);
        return 0;
    }

    void c(String str) {
        this.d.c(str);
    }

    private boolean a() {
        return Binder.getCallingUid() == getCallingUid();
    }

    private Permission b(String str, MonitorItem monitorItem) {
        yir.d(monitorItem, "getMonitorPermission monitorItem must not be null.");
        yir.d(monitorItem.getName(), "getMonitorPermission monitorItem name must not be null.");
        String name = monitorItem.getName();
        if (yln.e(str) <= 5) {
            return Permission.DEVICE_MANAGER;
        }
        return f30799c.contains(name) ? Permission.DEVICE_MANAGER : Permission.WEAR_USER_STATUS;
    }

    private List<Permission> e(String str, List<MonitorItem> list) {
        yir.d(list, "getMonitorPermissions monitorItems must not be null.");
        ArrayList arrayList = new ArrayList();
        if (yln.e(str) <= 5) {
            arrayList.add(Permission.DEVICE_MANAGER);
            return arrayList;
        }
        for (MonitorItem monitorItem : list) {
            yir.d(monitorItem, "getMonitorPermissions monitorItem must not be null.");
            yir.d(monitorItem.getName(), "getMonitorPermissions monitorItem name must not be null.");
            if (f30799c.contains(monitorItem.getName())) {
                if (!arrayList.contains(Permission.DEVICE_MANAGER)) {
                    arrayList.add(Permission.DEVICE_MANAGER);
                }
            } else if (!arrayList.contains(Permission.WEAR_USER_STATUS)) {
                arrayList.add(Permission.WEAR_USER_STATUS);
            }
        }
        return arrayList;
    }

    private ykl a(Permission permission) {
        yir.d(permission, "getMonitorScope permission must not be null.");
        return Permission.DEVICE_MANAGER.getName().equals(permission.getName()) ? ykl.e : ykl.i;
    }

    @Override // com.huawei.wearengine.core.device.PowerModeChangeManager.HandlePowerModeChange
    public void startClearData(String str) {
        yit.e("MonitorManagerImpl", "startClearData");
        yit.a("MonitorManagerImpl", "startClearData deviceId is: " + str);
        c(str);
    }
}
