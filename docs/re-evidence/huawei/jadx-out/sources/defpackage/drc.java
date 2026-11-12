package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.util.ArrayUtils;
import com.huawei.devicesdk.callback.DeviceScanCallback;
import com.huawei.devicesdk.callback.DeviceStatusChangeCallback;
import com.huawei.devicesdk.callback.MessageReceiveCallback;
import com.huawei.devicesdk.entity.CharacterOperationType;
import com.huawei.devicesdk.entity.ConnectMode;
import com.huawei.devicesdk.entity.ScanMode;
import com.huawei.devicesdk.entity.SendMode;
import com.huawei.health.device.kit.wsp.task.BleTaskQueueUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.entity.UniteDevice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class drc {
    private static final byte[] d = {0, 0};
    private static final Map<String, SendMode> e = Collections.unmodifiableMap(new HashMap() { // from class: drc.1
        {
            put(dpg.aw.toString(), SendMode.PROTOCOL_TYPE_5A);
            put(dpg.j.toString(), SendMode.PROTOCOL_TYPE_FRAGMENT);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f32223a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private xgt f32224c;

    private drc() {
        this.f32223a = BaseApplication.getContext();
        xgt xgtVarB = xgt.b();
        this.f32224c = xgtVarB;
        xgtVarB.a(this.f32223a);
    }

    public static drc b() {
        return a.f32226c;
    }

    public void e(String str, DeviceStatusChangeCallback deviceStatusChangeCallback) {
        this.f32224c.registerDeviceStateListener(str, deviceStatusChangeCallback);
    }

    public void b(String str, MessageReceiveCallback messageReceiveCallback) {
        this.f32224c.registerDeviceMessageListener(str, messageReceiveCallback);
    }

    public void b(String str) {
        this.f32224c.unregisterDeviceStateListener(str);
    }

    public void a(String str) {
        this.f32224c.unregisterDeviceMessageListener(str);
    }

    public void b(ScanMode scanMode, List<cmy> list, DeviceScanCallback deviceScanCallback) {
        this.f32224c.scanDevice(scanMode, list, deviceScanCallback);
    }

    public void a(UniteDevice uniteDevice, ConnectMode connectMode) {
        this.f32224c.connectDevice(uniteDevice, false, connectMode);
    }

    public void b(UniteDevice uniteDevice, cmg cmgVar) {
        LogUtil.a("MeasureLogicBaseManager", "sendCommand : uuid = ", cmgVar.c(), " data = ", eeq.e(cmgVar.b()), " SendMode = ", Integer.valueOf(cmgVar.f().value()));
        this.f32224c.sendCommand(uniteDevice, cmgVar);
    }

    public void c(UniteDevice uniteDevice, cmg[] cmgVarArr) {
        if (cmgVarArr == null || cmgVarArr.length <= 0) {
            LogUtil.j("MeasureLogicBaseManager", "sendCommand : commands is empty");
            return;
        }
        for (cmg cmgVar : cmgVarArr) {
            b(uniteDevice, cmgVar);
        }
    }

    public void b(UniteDevice uniteDevice, String str, String str2, boolean z) {
        SendMode sendMode = e.get(str2);
        if (sendMode == null) {
            sendMode = SendMode.PROTOCOL_TYPE_D;
        }
        this.f32224c.setCharacteristicNotify(uniteDevice, str, str2, sendMode, z);
        LogUtil.a("MeasureLogicBaseManager", "setCharacteristicNotify :", str2, sendMode.toString(), Boolean.valueOf(z));
    }

    public Map<String, UniteDevice> a() {
        return this.f32224c.getDeviceList();
    }

    public void c(UniteDevice uniteDevice) {
        this.f32224c.disconnect(uniteDevice);
    }

    public static cmg[] c(dro droVar) {
        if (droVar == null) {
            LogUtil.j("MeasureLogicBaseManager", "getUdsCommand : data==null");
            return null;
        }
        UUID uuidC = dpg.al;
        UUID uuidA = dpg.f;
        dpg.e eVar = dpg.b().get(droVar.f());
        if (eVar != null) {
            uuidC = eVar.c();
            uuidA = eVar.a();
        }
        SendMode sendMode = e.get(uuidA.toString());
        if (sendMode == null) {
            sendMode = SendMode.PROTOCOL_TYPE_D;
        }
        byte[] bArrD = droVar.d();
        boolean zG = droVar.g();
        cmg.b bVar = new cmg.b();
        bVar.a(CharacterOperationType.WRITE).b(zG);
        if (sendMode == SendMode.PROTOCOL_TYPE_FRAGMENT) {
            ArrayList<byte[]> arrayListA = a(bArrD, 222);
            cmg[] cmgVarArr = new cmg[arrayListA.size()];
            for (int i = 0; i < arrayListA.size(); i++) {
                cmgVarArr[i] = bVar.a(a(uuidC, uuidA, sendMode, arrayListA.get(i)));
            }
            return cmgVarArr;
        }
        return new cmg[]{bVar.a(a(uuidC, uuidA, sendMode, bArrD))};
    }

    private static cmg a(UUID uuid, UUID uuid2, SendMode sendMode, byte[] bArr) {
        cmg cmgVar = new cmg();
        cmgVar.d(sendMode);
        cmgVar.b(uuid.toString());
        cmgVar.e(uuid2.toString());
        cmgVar.a(bArr);
        return cmgVar;
    }

    private static ArrayList<byte[]> a(byte[] bArr, int i) {
        if (bArr == null || i <= 0 || bArr.length <= i) {
            return new ArrayList<byte[]>(bArr) { // from class: drc.4

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ byte[] f32225a;

                {
                    this.f32225a = bArr;
                    add(ArrayUtils.concatByteArrays(drc.d, bArr));
                }
            };
        }
        int iCeil = (int) Math.ceil(bArr.length / i);
        int i2 = iCeil - 1;
        ArrayList<byte[]> arrayList = new ArrayList<>(iCeil);
        for (int i3 = 0; i3 < iCeil; i3++) {
            byte[] bArr2 = {(byte) i2, (byte) i3};
            int i4 = i * i3;
            int length = i4 + i;
            if (i3 == i2) {
                length = bArr.length;
            }
            arrayList.add(i3, ArrayUtils.concatByteArrays(bArr2, Arrays.copyOfRange(bArr, i4, length)));
        }
        return arrayList;
    }

    public boolean a(UniteDevice uniteDevice, String str, String str2) {
        return this.f32224c.isSupportCharactor(uniteDevice, str, str2);
    }

    public void d(UniteDevice uniteDevice) {
        b("registerDeviceStateListener");
        a("registerDeviceMessageListener");
        c(uniteDevice);
    }

    static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static drc f32226c = new drc();
    }

    public void c(String str, BleTaskQueueUtil bleTaskQueueUtil) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("MeasureLogicBaseManager", "registerUdsCallback, productId is null");
        }
        if (dxm.aq(str)) {
            LogUtil.a("MeasureLogicBaseManager", "registerUdsCallback by uds");
            e("registerDeviceStateListener", new dmi());
            b("registerDeviceMessageListener", new dmj(bleTaskQueueUtil));
        }
    }
}
