package com.huawei.wearengine.service.api;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.wearengine.OtaManager;
import com.huawei.wearengine.common.WearEngineBiOperate;
import com.huawei.wearengine.connect.ServiceConnectCallback;
import com.huawei.wearengine.core.common.ClientBinderDied;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.ota.CheckBinderCallback;
import com.huawei.wearengine.ota.DeviceListBinderCallback;
import com.huawei.wearengine.ota.UpgradeBinderCallBack;
import com.huawei.wearengine.ota.UpgradeStatusBinderCallBack;
import defpackage.yik;
import defpackage.yiq;
import defpackage.yit;
import defpackage.yiv;
import defpackage.yiw;
import defpackage.yjb;
import defpackage.yln;
import defpackage.ylt;

/* JADX INFO: loaded from: classes46.dex */
public class OtaManagerImpl extends OtaManager.Stub implements ClientBinderDied {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yiw f30804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yik f30805c;
    private final yjb d;

    public OtaManagerImpl(yik yikVar, yiw yiwVar) {
        this.d = new yjb(yiwVar);
        this.f30805c = yikVar;
        this.f30804b = yiwVar;
    }

    @Override // com.huawei.wearengine.OtaManager
    public void getConnectedDevices(DeviceListBinderCallback deviceListBinderCallback) {
        yit.e("OtaManagerImpl", "Start getConnectedDevices");
        yiq.c(deviceListBinderCallback, "deviceListBinderCallback must not be null");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        String strE = e();
        try {
            c(yiv.e(), strE, "getConnectedDevices");
            this.d.d(deviceListBinderCallback);
            wearEngineBiOperate.biApiCalling(contextA, strE, "getConnectedDevices", String.valueOf(0));
        } catch (IllegalStateException e) {
            wearEngineBiOperate.biApiCalling(contextA, strE, "getConnectedDevices", String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    @Override // com.huawei.wearengine.OtaManager
    public void getDeviceNewVersion(Device device, CheckBinderCallback checkBinderCallback) {
        yit.e("OtaManagerImpl", "Start getDeviceNewVersion");
        yiq.c(device, "device must not be null!");
        yiq.c(checkBinderCallback, "checkBinderCallback must not be null");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        String strE = e();
        try {
            c(yiv.e(), strE, "getDeviceNewVersion");
            this.d.d(device, checkBinderCallback);
            wearEngineBiOperate.biApiCalling(contextA, strE, "getDeviceNewVersion", String.valueOf(0));
        } catch (IllegalStateException e) {
            wearEngineBiOperate.biApiCalling(contextA, strE, "getDeviceNewVersion", String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    @Override // com.huawei.wearengine.OtaManager
    public void doUpgrade(Device device, String str, UpgradeBinderCallBack upgradeBinderCallBack) {
        yit.e("OtaManagerImpl", "Start doUpgrade");
        yiq.c(device, "device must not be null!");
        if (TextUtils.isEmpty(str)) {
            yit.b("OtaManagerImpl", "doUpgrade command is null");
            throw new IllegalStateException(String.valueOf(5));
        }
        yiq.c(upgradeBinderCallBack, "upgradeBinderCallBack must not be null");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        String strE = e();
        try {
            c(yiv.e(), strE, "doUpgrade");
            this.d.b(device, str, upgradeBinderCallBack);
            wearEngineBiOperate.biApiCalling(contextA, strE, "doUpgrade", String.valueOf(0));
        } catch (IllegalStateException e) {
            wearEngineBiOperate.biApiCalling(contextA, strE, "doUpgrade", String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    @Override // com.huawei.wearengine.OtaManager
    public void getUpgradeStatus(Device device, UpgradeStatusBinderCallBack upgradeStatusBinderCallBack) {
        yit.e("OtaManagerImpl", "Start getUpgradeStatus");
        yiq.c(device, "device must not be null!");
        yiq.c(upgradeStatusBinderCallBack, "upgradeStatusBinderCallBack must not be null");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        String strE = e();
        try {
            c(yiv.e(), strE, "getUpgradeStatus");
            this.d.d(device, upgradeStatusBinderCallBack);
            wearEngineBiOperate.biApiCalling(contextA, strE, "getUpgradeStatus", String.valueOf(0));
        } catch (IllegalStateException e) {
            wearEngineBiOperate.biApiCalling(contextA, strE, "getUpgradeStatus", String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    @Override // com.huawei.wearengine.OtaManager
    public void registerUpgradeListener(Device device, UpgradeStatusBinderCallBack upgradeStatusBinderCallBack) throws RemoteException {
        yit.e("OtaManagerImpl", "Start registerUpgradeListener");
        yiq.c(device, "device must not be null!");
        yiq.c(upgradeStatusBinderCallBack, "upgradeStatusBinderCallBack must not be null");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        String strE = e();
        try {
            c(yiv.e(), strE, "registerUpgradeListener");
            upgradeStatusBinderCallBack.asBinder().linkToDeath(a(device, upgradeStatusBinderCallBack), 0);
            this.d.e(device, upgradeStatusBinderCallBack);
            wearEngineBiOperate.biApiCalling(contextA, strE, "registerUpgradeListener", String.valueOf(0));
        } catch (IllegalStateException e) {
            wearEngineBiOperate.biApiCalling(contextA, strE, "registerUpgradeListener", String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    private IBinder.DeathRecipient a(final Device device, final UpgradeStatusBinderCallBack upgradeStatusBinderCallBack) {
        return new IBinder.DeathRecipient() { // from class: com.huawei.wearengine.service.api.OtaManagerImpl.3
            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                yit.a("OtaManagerImpl", "DeathRecipient device uuid: " + device.getUuid());
                yit.e("OtaManagerImpl", "DeathRecipient unRegisterUpgradeListener start");
                try {
                    OtaManagerImpl.this.d.b(device);
                } catch (Exception unused) {
                    yit.b("OtaManagerImpl", "DeathRecipient unRegisterUpgradeListener exception");
                }
                upgradeStatusBinderCallBack.asBinder().unlinkToDeath(this, 0);
            }
        };
    }

    @Override // com.huawei.wearengine.OtaManager
    public void unRegisterUpgradeListener(Device device) {
        yit.e("OtaManagerImpl", "Start unRegisterUpgradeListener");
        yiq.c(device, "device must not be null!");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        String strE = e();
        try {
            c(yiv.e(), strE, "unRegisterUpgradeListener");
            this.d.b(device);
            wearEngineBiOperate.biApiCalling(contextA, strE, "unRegisterUpgradeListener", String.valueOf(0));
        } catch (IllegalStateException e) {
            wearEngineBiOperate.biApiCalling(contextA, strE, "unRegisterUpgradeListener", String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    @Override // com.huawei.wearengine.OtaManager
    public int registerOtaServiceConnectCallback(ServiceConnectCallback serviceConnectCallback) {
        yit.e("OtaManagerImpl", "Start registerOtaServiceConnectCallback");
        String strE = e();
        WearEngineBiOperate wearEngineBiOperateC = c();
        Context contextA = yiv.a();
        try {
            c(yiv.e(), strE, "registerOtaServiceConnectCallback");
            int iB = this.d.b(this.f30804b.e(yiv.e(), yiv.d()), serviceConnectCallback);
            wearEngineBiOperateC.biApiCalling(contextA, strE, "registerOtaServiceConnectCallback", String.valueOf(iB));
            return iB;
        } catch (IllegalStateException e) {
            int iA = ylt.a(e);
            wearEngineBiOperateC.biApiCalling(contextA, strE, "registerOtaServiceConnectCallback", String.valueOf(iA));
            return iA;
        }
    }

    @Override // com.huawei.wearengine.OtaManager
    public int unregisterOtaServiceConnectCallback(ServiceConnectCallback serviceConnectCallback) {
        yit.e("OtaManagerImpl", "Start unregisterOtaServiceConnectCallback");
        String strE = e();
        WearEngineBiOperate wearEngineBiOperateC = c();
        Context contextA = yiv.a();
        try {
            c(yiv.e(), strE, "unregisterOtaServiceConnectCallback");
            int iD = this.d.d(this.f30804b.e(yiv.e(), yiv.d()), serviceConnectCallback);
            wearEngineBiOperateC.biApiCalling(contextA, strE, "unregisterOtaServiceConnectCallback", String.valueOf(iD));
            return iD;
        } catch (IllegalStateException e) {
            int iA = ylt.a(e);
            wearEngineBiOperateC.biApiCalling(contextA, strE, "unregisterOtaServiceConnectCallback", String.valueOf(iA));
            return iA;
        }
    }

    private void c(int i, String str, String str2) {
        if (this.f30805c.d(i, str)) {
            return;
        }
        this.f30805c.c(i, str, str2);
    }

    private String e() {
        return yln.b(yiv.e(), yiv.a(), this.f30804b.getApplicationIdByPid(Integer.valueOf(yiv.d())));
    }

    private WearEngineBiOperate c() {
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        return wearEngineBiOperate;
    }

    @Override // com.huawei.wearengine.core.common.ClientBinderDied
    public void handleClientBinderDied(String str) {
        yit.e("OtaManagerImpl", "handleClientBinderDied clientPkgName is: " + str);
        if (!d()) {
            yit.b("OtaManagerImpl", "handleClientBinderDied checkPermission failed");
        } else if ("com.huawei.hms.dupdateengine".equals(str)) {
            try {
                this.d.d();
            } catch (IllegalStateException unused) {
                yit.b("OtaManagerImpl", "handleClientBinderDied disconnectOtaService exception");
            }
        }
    }

    private boolean d() {
        return Binder.getCallingUid() == getCallingUid();
    }
}
