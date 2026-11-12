package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.devicesdk.callback.DeviceScanCallback;
import com.huawei.devicesdk.callback.DeviceStatusChangeCallback;
import com.huawei.devicesdk.callback.MessageReceiveCallback;
import com.huawei.devicesdk.entity.CharacterOperationType;
import com.huawei.devicesdk.entity.ConnectMode;
import com.huawei.devicesdk.entity.ScanMode;
import com.huawei.devicesdk.entity.SendMode;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.entity.UniteDevice;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class emk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private UniteDevice f33189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private xgt f33190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private epq f33191c;
    private int d;
    private Context e;

    private emk() {
        this.d = 3;
        this.e = BaseApplication.getContext();
        xgt xgtVarB = xgt.b();
        this.f33190b = xgtVarB;
        xgtVarB.a(this.e);
    }

    public static emk c() {
        return c.f33192b;
    }

    public void d(String str, DeviceStatusChangeCallback deviceStatusChangeCallback) {
        this.f33190b.registerDeviceStateListener(str, deviceStatusChangeCallback);
    }

    public void c(String str, MessageReceiveCallback messageReceiveCallback) {
        this.f33190b.registerDeviceMessageListener(str, messageReceiveCallback);
    }

    public void a(String str) {
        this.f33190b.unregisterDeviceStateListener(str);
    }

    public void b(String str) {
        this.f33190b.unregisterDeviceMessageListener(str);
    }

    public void c(ScanMode scanMode, List<cmy> list, DeviceScanCallback deviceScanCallback) {
        this.f33190b.scanDevice(scanMode, list, deviceScanCallback);
    }

    public List<cmy> d(String str) {
        String strA;
        cmy.a aVar = new cmy.a();
        aVar.b(2);
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD != null && elhVarD.ac() != null && njy.c(elhVarD.ac(), 0) && elhVarD.ac().get(0) != null) {
            strA = elhVarD.ac().get(0).a();
        } else {
            strA = "";
        }
        aVar.a(strA);
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(aVar.c());
        return arrayList;
    }

    public List<cmy> e() {
        ArrayList arrayList = new ArrayList(10);
        cmy.a aVar = new cmy.a();
        aVar.b(2);
        aVar.a("moredevice");
        arrayList.add(aVar.c());
        return arrayList;
    }

    public List<cmy> a(String str, String str2) {
        ArrayList arrayList = new ArrayList(10);
        cmy.a aVar = new cmy.a();
        if (!TextUtils.isEmpty(str)) {
            aVar.a(str);
            aVar.b(1);
        } else if (!TextUtils.isEmpty(str2)) {
            aVar.a(str2);
            aVar.b(5);
        } else {
            LogUtil.j("ThirdPartyDeviceManager", "getFiltersExact is empty");
            return arrayList;
        }
        arrayList.add(aVar.c());
        return arrayList;
    }

    public void d(epq epqVar, int i) {
        ArrayList<ept> arrayListE = epqVar.e();
        if (njy.c(arrayListE, i)) {
            ept eptVar = arrayListE.get(i);
            this.f33189a = new UniteDevice().build(eptVar.d(), eptVar.b(), null);
        }
    }

    public void b(ept eptVar) {
        this.f33190b.createSystemBond(new UniteDevice().build(eptVar.d(), eptVar.b(), null));
    }

    public void b(UniteDevice uniteDevice) {
        this.f33190b.createSystemBond(uniteDevice);
    }

    public void c(UniteDevice uniteDevice, ConnectMode connectMode, int i, boolean z) {
        if (uniteDevice == null || uniteDevice.getDeviceInfo() == null) {
            LogUtil.j("ThirdPartyDeviceManager", "connectDevice : device == null || deviceInfo == null");
            return;
        }
        this.f33189a = uniteDevice;
        uniteDevice.getDeviceInfo().setDeviceBtType(i);
        this.f33190b.connectDevice(uniteDevice, z, connectMode);
    }

    public void d(UniteDevice uniteDevice, cmg cmgVar) {
        this.f33190b.sendCommand(uniteDevice, cmgVar);
    }

    public void a(UniteDevice uniteDevice, String str, String str2, boolean z) {
        this.f33190b.setCharacteristicNotify(uniteDevice, str, str2, SendMode.PROTOCOL_TYPE_DIRECT, z);
    }

    public void a() {
        UniteDevice uniteDevice = this.f33189a;
        if (uniteDevice != null) {
            a(uniteDevice);
        }
    }

    public void a(UniteDevice uniteDevice) {
        this.f33190b.disconnect(uniteDevice);
    }

    public cmg e(cmm cmmVar, String str, String str2, CharacterOperationType characterOperationType) {
        cmg cmgVar = new cmg();
        if (cmmVar == null) {
            LogUtil.j("ThirdPartyDeviceManager", "getBloodPressureCommand : dataContents == null");
            return cmgVar;
        }
        cmg cmgVar2 = new cmg();
        cmgVar2.b(str);
        cmgVar2.e(str2);
        cmgVar2.a(cmmVar.d());
        cmgVar2.d(SendMode.PROTOCOL_TYPE_DIRECT);
        cmg.b bVar = new cmg.b();
        bVar.a(cmgVar2.j());
        bVar.b(false);
        bVar.a(characterOperationType);
        return bVar.a(cmgVar2);
    }

    public void e(int i) {
        this.d = i;
    }

    public int b() {
        return this.d;
    }

    public void a(epq epqVar) {
        this.f33191c = epqVar;
    }

    public epq d() {
        return this.f33191c;
    }

    static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static emk f33192b = new emk();
    }
}
