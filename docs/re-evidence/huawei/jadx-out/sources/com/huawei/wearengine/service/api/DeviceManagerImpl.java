package com.huawei.wearengine.service.api;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.huawei.wearengine.DeviceManager;
import com.huawei.wearengine.auth.Permission;
import com.huawei.wearengine.common.WearEngineBiOperate;
import com.huawei.wearengine.core.common.ClientBinderDied;
import com.huawei.wearengine.core.device.DeviceManagerCaller;
import com.huawei.wearengine.core.device.PowerModeChangeManager;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.utils.DeviceProcessor;
import defpackage.yik;
import defpackage.yiq;
import defpackage.yit;
import defpackage.yiv;
import defpackage.yiw;
import defpackage.yjb;
import defpackage.ykl;
import defpackage.ylm;
import defpackage.yln;
import defpackage.ylt;
import java.util.List;

/* JADX INFO: loaded from: classes46.dex */
public class DeviceManagerImpl extends DeviceManager.Stub implements ClientBinderDied {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private yik f30795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private yiw f30796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private yjb f30797c;

    public DeviceManagerImpl(yik yikVar, yiw yiwVar) {
        this.f30797c = new yjb(yiwVar);
        this.f30795a = yikVar;
        this.f30796b = yiwVar;
    }

    @Override // com.huawei.wearengine.DeviceManager
    public List<Device> getBondedDevices() throws RemoteException {
        yit.e("DeviceManagerImpl", "getBondedDevices enter");
        List<Device> bondedDeviceEx = getBondedDeviceEx();
        for (Device device : bondedDeviceEx) {
            device.setReservedness(device.getReservedness());
        }
        return bondedDeviceEx;
    }

    @Override // com.huawei.wearengine.DeviceManager
    public List<Device> getAllBondedDevices() throws RemoteException {
        PowerModeChangeManager.a().e(true);
        return b("getAllBondedDevices", new DeviceManagerCaller() { // from class: com.huawei.wearengine.service.api.DeviceManagerImpl.3
            @Override // com.huawei.wearengine.core.device.DeviceManagerCaller
            public List<Device> getDeviceList() throws RemoteException {
                return DeviceManagerImpl.this.f30797c.b();
            }
        });
    }

    @Override // com.huawei.wearengine.DeviceManager
    public List<Device> getCommonDevice() throws RemoteException {
        PowerModeChangeManager.a().e(true);
        return b("getCommonDevice", new DeviceManagerCaller() { // from class: com.huawei.wearengine.service.api.DeviceManagerImpl.4
            @Override // com.huawei.wearengine.core.device.DeviceManagerCaller
            public List<Device> getDeviceList() throws RemoteException {
                return DeviceManagerImpl.this.f30797c.e();
            }
        });
    }

    @Override // com.huawei.wearengine.DeviceManager
    public boolean hasAvailableDevices() throws RemoteException {
        yit.e("DeviceManagerImpl", "hasAvailableDevices enter");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        String strB = yln.b(Binder.getCallingUid(), contextA, this.f30796b.getApplicationIdByPid(Integer.valueOf(Binder.getCallingPid())));
        try {
            PowerModeChangeManager.a().e(true);
            if (ylm.c(yln.c(contextA))) {
                wearEngineBiOperate.biApiCalling(contextA, strB, "hasAvailableDevices", String.valueOf(0));
                return this.f30797c.h();
            }
            yit.b("DeviceManagerImpl", "hasAvailableDevices not login in Huawei Health!");
            throw new IllegalStateException(String.valueOf(3));
        } catch (IllegalStateException e) {
            wearEngineBiOperate.biApiCalling(contextA, strB, "hasAvailableDevices", String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    @Override // com.huawei.wearengine.DeviceManager
    public String getHiLinkDeviceId(Device device) throws RemoteException {
        yit.e("DeviceManagerImpl", "getHiLinkDeviceId enter");
        yiq.c(device, "device must not be null!");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        String strB = yln.b(Binder.getCallingUid(), contextA, this.f30796b.getApplicationIdByPid(Integer.valueOf(Binder.getCallingPid())));
        try {
            PowerModeChangeManager.a().e(true);
            this.f30795a.b(strB, "getHiLinkDeviceId", ykl.e, Permission.DEVICE_MANAGER);
            Device deviceProcessInputDevice = DeviceProcessor.processInputDevice(strB, device);
            wearEngineBiOperate.biApiCalling(contextA, strB, "getHiLinkDeviceId", String.valueOf(0));
            return this.f30797c.d(deviceProcessInputDevice);
        } catch (IllegalStateException e) {
            wearEngineBiOperate.biApiCalling(contextA, strB, "getHiLinkDeviceId", String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    @Override // com.huawei.wearengine.DeviceManager
    public List<Device> getBondedDeviceEx() throws RemoteException {
        PowerModeChangeManager.a().e(true);
        return b("getBondedDevices", new DeviceManagerCaller() { // from class: com.huawei.wearengine.service.api.DeviceManagerImpl.5
            @Override // com.huawei.wearengine.core.device.DeviceManagerCaller
            public List<Device> getDeviceList() throws RemoteException {
                return DeviceManagerImpl.this.f30797c.a();
            }
        });
    }

    @Override // com.huawei.wearengine.core.common.ClientBinderDied
    public void handleClientBinderDied(String str) {
        yit.e("DeviceManagerImpl", "handleClientBinderDied clientPkgName is: " + str);
    }

    private List<Device> b(String str, DeviceManagerCaller deviceManagerCaller) throws RemoteException {
        yit.e("DeviceManagerImpl", str + " entry");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        yit.e("DeviceManagerImpl", "getDeviceListApiName :" + str + " getCallingUid :" + Binder.getCallingUid() + " getCallingPid :" + Binder.getCallingPid());
        String strB = yln.b(Binder.getCallingUid(), contextA, this.f30796b.getApplicationIdByPid(Integer.valueOf(Binder.getCallingPid())));
        try {
            if (!this.f30795a.d(Binder.getCallingUid(), strB)) {
                this.f30795a.b(strB, str, ykl.e, Permission.DEVICE_MANAGER);
            }
            if (deviceManagerCaller == null) {
                yit.b("DeviceManagerImpl", str + " caller is null");
                throw new IllegalStateException(String.valueOf(12));
            }
            List<Device> listProcessOutputDevice = DeviceProcessor.processOutputDevice(strB, deviceManagerCaller.getDeviceList());
            wearEngineBiOperate.biApiCalling(contextA, strB, str, String.valueOf(0));
            return listProcessOutputDevice;
        } catch (IllegalStateException e) {
            wearEngineBiOperate.biApiCalling(contextA, strB, str, String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    @Override // com.huawei.wearengine.DeviceManager
    public int queryDeviceCapability(Device device, int i) throws RemoteException {
        yit.e("DeviceManagerImpl", "queryDeviceCapability enter");
        yiq.c(device, "device must not be null!");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        String strB = yln.b(Binder.getCallingUid(), contextA, this.f30796b.getApplicationIdByPid(Integer.valueOf(Binder.getCallingPid())));
        try {
            PowerModeChangeManager.a().e(true);
            if (!this.f30795a.d(Binder.getCallingUid(), strB)) {
                this.f30795a.b(strB, "queryDeviceCapability", ykl.e, Permission.DEVICE_MANAGER);
            }
            Device deviceProcessInputDevice = DeviceProcessor.processInputDevice(strB, device);
            wearEngineBiOperate.biApiCalling(contextA, strB, "queryDeviceCapability", String.valueOf(0));
            return this.f30797c.a(deviceProcessInputDevice, i);
        } catch (IllegalStateException e) {
            wearEngineBiOperate.biApiCalling(contextA, strB, "queryDeviceCapability", String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    @Override // com.huawei.wearengine.DeviceManager
    public String getDeviceSn(Device device) throws RemoteException {
        yit.e("DeviceManagerImpl", "getDeviceSn enter");
        yiq.c(device, "device must not be null!");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        String strB = yln.b(Binder.getCallingUid(), contextA, this.f30796b.getApplicationIdByPid(Integer.valueOf(Binder.getCallingPid())));
        try {
            PowerModeChangeManager.a().e(true);
            this.f30795a.a(strB, "getDeviceSn", ykl.d, Permission.DEVICE_SN);
            Device deviceProcessInputDevice = DeviceProcessor.processInputDevice(strB, device);
            wearEngineBiOperate.biApiCalling(contextA, strB, "getDeviceSn", String.valueOf(0));
            return this.f30797c.c(deviceProcessInputDevice);
        } catch (IllegalStateException e) {
            wearEngineBiOperate.biApiCalling(contextA, strB, "getDeviceSn", String.valueOf(ylt.a(e)));
            throw e;
        }
    }
}
