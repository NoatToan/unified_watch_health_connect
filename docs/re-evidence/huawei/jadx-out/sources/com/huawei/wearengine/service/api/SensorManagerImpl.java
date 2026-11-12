package com.huawei.wearengine.service.api;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.wearengine.SensorManager;
import com.huawei.wearengine.auth.Permission;
import com.huawei.wearengine.common.WearEngineBiOperate;
import com.huawei.wearengine.core.common.ClientBinderDied;
import com.huawei.wearengine.core.device.PowerModeChangeManager;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.sensor.AsyncReadCallback;
import com.huawei.wearengine.sensor.AsyncStopCallback;
import com.huawei.wearengine.sensor.Sensor;
import com.huawei.wearengine.utils.DeviceProcessor;
import defpackage.yik;
import defpackage.yiq;
import defpackage.yir;
import defpackage.yit;
import defpackage.yiv;
import defpackage.yiw;
import defpackage.yjb;
import defpackage.ykl;
import defpackage.ykw;
import defpackage.yln;
import defpackage.ylt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public class SensorManagerImpl extends SensorManager.Stub implements ClientBinderDied, PowerModeChangeManager.HandlePowerModeChange {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ArrayList<String> f30811c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private yik f30812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ykw f30813b;
    private yjb d;
    private yiw e;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f30811c = arrayList;
        arrayList.add(Sensor.NAME_HR);
        f30811c.add(Sensor.NAME_ECG);
        f30811c.add(Sensor.NAME_PPG);
    }

    public SensorManagerImpl(yik yikVar, yiw yiwVar) {
        this.d = new yjb(yiwVar);
        this.f30812a = yikVar;
        this.e = yiwVar;
        this.f30813b = new ykw(this.d);
    }

    @Override // com.huawei.wearengine.SensorManager
    public List<Sensor> getSensorList(Device device) throws RemoteException {
        List<Sensor> listD;
        yit.e("SensorManagerImpl", "getSensorList enter");
        yit.a("SensorManagerImpl", "getSensorList pid " + Binder.getCallingPid());
        yiq.c(device, "device must not be null!");
        yiq.c(device.getUuid(), "device must not be null!");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        String strB = yln.b(Binder.getCallingUid(), contextA, this.e.getApplicationIdByPid(Integer.valueOf(Binder.getCallingPid())));
        try {
            PowerModeChangeManager.a().e(true);
            if (yln.e(strB) <= 5) {
                this.f30812a.b(strB, "getSensorList", ykl.f53587b, Permission.SENSOR);
                wearEngineBiOperate.biApiCalling(contextA, strB, "getSensorList", String.valueOf(0));
                listD = this.f30813b.d(b(device, strB), device);
            } else {
                this.f30812a.c("getSensorList");
                this.f30812a.a("getSensorList");
                List<Sensor> listC = this.f30812a.c(strB, "getSensorList", b(device, strB), this.f30813b);
                wearEngineBiOperate.biApiCalling(contextA, strB, "getSensorList", String.valueOf(0));
                listD = this.f30813b.d(listC, device);
            }
            b(listD, strB);
            return listD;
        } catch (IllegalStateException e) {
            wearEngineBiOperate.biApiCalling(contextA, strB, "getSensorList", String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    private void b(List<Sensor> list, String str) {
        boolean zB = yik.b(yiv.e(), str);
        for (Sensor sensor : list) {
            if (!zB && sensor != null && !TextUtils.isEmpty(sensor.getExtendJson()) && sensor.getExtendJson().contains("SensorChipType")) {
                try {
                    JSONObject jSONObject = new JSONObject(sensor.getExtendJson());
                    jSONObject.remove("SensorChipType");
                    sensor.setExtendJson(jSONObject.toString());
                } catch (JSONException unused) {
                    yit.b("SensorManagerImpl", "deleteChipType JSONException");
                }
            }
        }
    }

    private List<Sensor> b(Device device, String str) throws RemoteException {
        Device deviceProcessInputDevice = DeviceProcessor.processInputDevice(str, device);
        if (!this.d.b(deviceProcessInputDevice.getUuid())) {
            yit.b("SensorManagerImpl", "getSensorList device is invalid");
            throw new IllegalStateException(String.valueOf(16));
        }
        return this.f30813b.c(deviceProcessInputDevice);
    }

    @Override // com.huawei.wearengine.SensorManager
    public int asyncRead(Device device, Sensor sensor, AsyncReadCallback asyncReadCallback) throws RemoteException {
        yit.e("SensorManagerImpl", "asyncRead enter");
        yiq.c(device, "device must not be null!");
        yiq.c(device.getUuid(), "device must not be null!");
        yiq.c(sensor, "sensor must not be null!");
        yiq.c(asyncReadCallback, "asyncReadCallback must not be null!");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        String strB = yln.b(Binder.getCallingUid(), contextA, this.e.getApplicationIdByPid(Integer.valueOf(Binder.getCallingPid())));
        try {
            PowerModeChangeManager.a().e(true);
            Permission permissionB = b(strB, sensor);
            this.f30812a.b(strB, "asyncRead", d(permissionB), permissionB);
            Device deviceProcessInputDevice = DeviceProcessor.processInputDevice(strB, device);
            if (!this.d.b(deviceProcessInputDevice.getUuid())) {
                yit.b("SensorManagerImpl", "asyncRead device is invalid");
                throw new IllegalStateException(String.valueOf(16));
            }
            if (this.f30813b.d(deviceProcessInputDevice.getUuid())) {
                yit.b("SensorManagerImpl", "asyncRead deviceDataListener is null");
                this.f30813b.c(deviceProcessInputDevice);
            }
            this.f30813b.e(deviceProcessInputDevice, sensor, asyncReadCallback, strB);
            wearEngineBiOperate.biApiCalling(contextA, strB, "asyncRead", String.valueOf(0));
            return 0;
        } catch (IllegalStateException e) {
            yit.b("SensorManagerImpl", "asyncRead illegalStateException");
            wearEngineBiOperate.biApiCalling(contextA, strB, "asyncRead", String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    @Override // com.huawei.wearengine.SensorManager
    public int asyncReadSensors(Device device, List<Sensor> list, AsyncReadCallback asyncReadCallback) throws RemoteException {
        yit.e("SensorManagerImpl", "asyncReadSensors enter");
        yit.a("SensorManagerImpl", "asyncReadSensors asyncReadCallback" + asyncReadCallback);
        yiq.c(device, "device must not be null!");
        yiq.c(device.getUuid(), "device must not be null!");
        yiq.c(list, "sensor must not be null!");
        yiq.c(asyncReadCallback, "asyncReadCallback must not be null!");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        String strB = yln.b(Binder.getCallingUid(), contextA, this.e.getApplicationIdByPid(Integer.valueOf(Binder.getCallingPid())));
        try {
            PowerModeChangeManager.a().e(true);
            for (Permission permission : d(strB, list)) {
                this.f30812a.b(strB, "asyncReadSensors", d(permission), permission);
            }
            Device deviceProcessInputDevice = DeviceProcessor.processInputDevice(strB, device);
            if (!this.d.b(deviceProcessInputDevice.getUuid())) {
                yit.b("SensorManagerImpl", "asyncReadSensors device is invalid");
                throw new IllegalStateException(String.valueOf(16));
            }
            if (this.f30813b.d(deviceProcessInputDevice.getUuid())) {
                yit.b("SensorManagerImpl", "asyncReadSensors deviceDataListener is null");
                this.f30813b.c(deviceProcessInputDevice);
            }
            List<Sensor> listA = a(list);
            if (listA.size() == 0) {
                yit.b("SensorManagerImpl", "asyncReadSensors sensors invalid argument");
                throw new IllegalStateException(String.valueOf(5));
            }
            Iterator<Sensor> it = listA.iterator();
            while (it.hasNext()) {
                this.f30813b.e(deviceProcessInputDevice, it.next(), asyncReadCallback, strB);
            }
            wearEngineBiOperate.biApiCalling(contextA, strB, "asyncReadSensors", String.valueOf(0));
            return 0;
        } catch (IllegalStateException e) {
            yit.b("SensorManagerImpl", "asyncReadSensors illegalStateException");
            wearEngineBiOperate.biApiCalling(contextA, strB, "asyncReadSensors", String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    @Override // com.huawei.wearengine.SensorManager
    public int stopAsyncRead(Device device, Sensor sensor, AsyncStopCallback asyncStopCallback) throws RemoteException {
        yit.e("SensorManagerImpl", "stopAsyncRead enter");
        yiq.c(device, "device must not be null!");
        yiq.c(device.getUuid(), "device must not be null!");
        yiq.c(sensor, "sensor must not be null!");
        yiq.c(asyncStopCallback, "asyncStopCallback must not be null!");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        String strB = yln.b(Binder.getCallingUid(), contextA, this.e.getApplicationIdByPid(Integer.valueOf(Binder.getCallingPid())));
        try {
            PowerModeChangeManager.a().e(true);
            Permission permissionB = b(strB, sensor);
            this.f30812a.b(strB, "stopAsyncRead", d(permissionB), permissionB);
            Device deviceProcessInputDevice = DeviceProcessor.processInputDevice(strB, device);
            if (!this.d.b(deviceProcessInputDevice.getUuid())) {
                yit.b("SensorManagerImpl", "stopAsyncRead device is invalid");
                throw new IllegalStateException(String.valueOf(16));
            }
            if (this.f30813b.d(deviceProcessInputDevice.getUuid())) {
                yit.b("SensorManagerImpl", "stopAsyncRead deviceDataListener is null");
                this.f30813b.c(deviceProcessInputDevice);
            }
            this.f30813b.e(deviceProcessInputDevice, sensor, asyncStopCallback, strB);
            wearEngineBiOperate.biApiCalling(contextA, strB, "stopAsyncRead", String.valueOf(0));
            return 0;
        } catch (IllegalStateException e) {
            yit.b("SensorManagerImpl", "stopAsyncRead illegalStateException");
            wearEngineBiOperate.biApiCalling(contextA, strB, "stopAsyncRead", String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    @Override // com.huawei.wearengine.SensorManager
    public int stopAsyncReadSensors(Device device, List<Sensor> list, AsyncStopCallback asyncStopCallback) throws RemoteException {
        yit.e("SensorManagerImpl", "stopAsyncReadSensors enter");
        yiq.c(device, "device must not be null!");
        yiq.c(device.getUuid(), "device must not be null!");
        yiq.c(list, "sensor must not be null!");
        yiq.c(asyncStopCallback, "asyncReadCallback must not be null!");
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        Context contextA = yiv.a();
        String strB = yln.b(Binder.getCallingUid(), contextA, this.e.getApplicationIdByPid(Integer.valueOf(Binder.getCallingPid())));
        try {
            PowerModeChangeManager.a().e(true);
            for (Permission permission : d(strB, list)) {
                this.f30812a.b(strB, "stopAsyncReadSensors", d(permission), permission);
            }
            Device deviceProcessInputDevice = DeviceProcessor.processInputDevice(strB, device);
            if (!this.d.b(deviceProcessInputDevice.getUuid())) {
                yit.b("SensorManagerImpl", "stopAsyncReadSensors device is invalid");
                throw new IllegalStateException(String.valueOf(16));
            }
            if (this.f30813b.d(deviceProcessInputDevice.getUuid())) {
                yit.b("SensorManagerImpl", "stopAsyncReadSensors deviceDataListener is null");
                this.f30813b.c(deviceProcessInputDevice);
            }
            List<Sensor> listA = a(list);
            if (listA.size() == 0) {
                yit.b("SensorManagerImpl", "stopAsyncReadSensors sensors invalid argument");
                throw new IllegalStateException(String.valueOf(5));
            }
            Iterator<Sensor> it = listA.iterator();
            while (it.hasNext()) {
                this.f30813b.e(deviceProcessInputDevice, it.next(), asyncStopCallback, strB);
            }
            wearEngineBiOperate.biApiCalling(contextA, strB, "stopAsyncReadSensors", String.valueOf(0));
            return 0;
        } catch (IllegalStateException e) {
            yit.b("SensorManagerImpl", "stopAsyncReadSensors illegalStateException");
            wearEngineBiOperate.biApiCalling(contextA, strB, "stopAsyncReadSensors", String.valueOf(ylt.a(e)));
            throw e;
        }
    }

    @Override // com.huawei.wearengine.core.common.ClientBinderDied
    public void handleClientBinderDied(String str) {
        yit.a("SensorManagerImpl", "handleClientBinderDied clientPkgName is: " + str);
        if (!d()) {
            yit.b("SensorManagerImpl", "handleClientBinderDied checkPermission failed");
        } else {
            this.f30813b.a(str);
        }
    }

    private boolean d() {
        return Binder.getCallingUid() == getCallingUid();
    }

    private List<Sensor> a(List<Sensor> list) {
        if (list == null || list.size() == 0 || list.size() > 128) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (Sensor sensor : list) {
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    arrayList.add(sensor);
                    break;
                }
            } while (sensor.getId() != ((Sensor) it.next()).getId());
        }
        return arrayList;
    }

    void a(String str) {
        if (!d()) {
            yit.b("SensorManagerImpl", "removeListener checkPermission failed");
        } else {
            this.f30813b.a(str);
        }
    }

    private void b(String str) {
        this.f30813b.b(str);
    }

    private Permission b(String str, Sensor sensor) {
        yir.d(sensor, "getSensorPermission sensor must not be null.");
        yir.d(sensor.getName(), "getSensorPermission sensor name must not be null.");
        if (yln.e(str) <= 5) {
            return Permission.SENSOR;
        }
        return f30811c.contains(sensor.getName()) ? Permission.SENSOR : Permission.MOTION_SENSOR;
    }

    private List<Permission> d(String str, List<Sensor> list) {
        yir.d(list, "getSensorPermissions sensors must not be null.");
        ArrayList arrayList = new ArrayList();
        if (yln.e(str) <= 5) {
            arrayList.add(Permission.SENSOR);
            return arrayList;
        }
        for (Sensor sensor : list) {
            yir.d(sensor, "getSensorPermissions sensor must not be null.");
            yir.d(sensor.getName(), "getSensorPermissions sensor name must not be null.");
            if (f30811c.contains(sensor.getName())) {
                if (!arrayList.contains(Permission.SENSOR)) {
                    arrayList.add(Permission.SENSOR);
                }
            } else if (!arrayList.contains(Permission.MOTION_SENSOR)) {
                arrayList.add(Permission.MOTION_SENSOR);
            }
        }
        return arrayList;
    }

    private ykl d(Permission permission) {
        yir.d(permission, "getSensorScope permission must not be null.");
        return Permission.SENSOR.getName().equals(permission.getName()) ? ykl.f53587b : ykl.f53586a;
    }

    @Override // com.huawei.wearengine.core.device.PowerModeChangeManager.HandlePowerModeChange
    public void startClearData(String str) {
        yit.e("SensorManagerImpl", "startClearData");
        yit.a("SensorManagerImpl", "startClearData deviceId is: " + str);
        b(str);
    }
}
