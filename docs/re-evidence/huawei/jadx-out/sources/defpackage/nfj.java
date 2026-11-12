package defpackage;

import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SportIntensityUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class nfj {
    public static void e(DeviceInfo deviceInfo) {
        LogUtil.a("HwHeartAbility", "notifyDeviceHeartCapability enter");
        if (deviceInfo == null) {
            LogUtil.j("HwHeartAbility", "notifyDeviceHeartCapability btDeviceInfo is null");
            return;
        }
        if (deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.j("HwHeartAbility", "notifyDeviceHeartCapability device disconnected");
            return;
        }
        DeviceCapability deviceCapabilityD = d(deviceInfo);
        if (deviceCapabilityD == null || !deviceCapabilityD.isSupportWorkoutTrustHeartRate()) {
            LogUtil.j("HwHeartAbility", "device not support trust heart rate.");
            return;
        }
        String str = eeq.d(1) + eeq.b(4) + "00000003";
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(23);
        deviceCommand.setCommandID(23);
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        deviceCommand.setPriority(1);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        LogUtil.a("HwHeartAbility", "notifyDeviceHeartCapability", "sendDeviceData command", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static void a(DeviceInfo deviceInfo) {
        LogUtil.a("HwHeartAbility", "notifyDeviceNewRestHeartRateCapability enter");
        if (deviceInfo == null) {
            LogUtil.j("HwHeartAbility", "btDeviceInfo is null");
            return;
        }
        if (deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.j("HwHeartAbility", "connect status is not connected");
            return;
        }
        DeviceCapability deviceCapabilityD = d(deviceInfo);
        if (deviceCapabilityD == null || !deviceCapabilityD.isSupportRestHeartRateControls()) {
            LogUtil.j("HwHeartAbility", "device not support new rest heart rate.");
            return;
        }
        String str = eeq.d(1) + eeq.b(4) + "00000001";
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(35);
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        LogUtil.a("HwHeartAbility", "notifyDeviceNewRestHeartRateCapability", "sendDeviceData command", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static void b(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("HwHeartAbility", "sendMediumToHighStrength btDeviceInfo is null");
            return;
        }
        if (deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.j("HwHeartAbility", "sendMediumToHighStrength device not connect");
            return;
        }
        DeviceCapability deviceCapabilityD = d(deviceInfo);
        if (deviceCapabilityD == null || !deviceCapabilityD.isSupportMediumToHighStrengthPreValue()) {
            LogUtil.j("HwHeartAbility", "sendMediumToHighStrength device not support Medium To High Strength PreValue");
            return;
        }
        pqo pqoVarB = SportIntensityUtil.b();
        if (lxl.g()) {
            LogUtil.a("HwHeartAbility", "is new device");
            d(pqoVarB, deviceInfo);
        } else {
            a(pqoVarB, deviceInfo);
        }
    }

    private static void a(pqo pqoVar, DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(41);
        StringBuilder sb = new StringBuilder(16);
        StringBuilder sb2 = new StringBuilder(16);
        StringBuilder sb3 = new StringBuilder(16);
        StringBuilder sb4 = new StringBuilder(16);
        StringBuilder sb5 = new StringBuilder(16);
        StringBuilder sb6 = new StringBuilder(16);
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(sb);
        arrayList.add(sb2);
        arrayList.add(sb3);
        arrayList.add(sb4);
        arrayList.add(sb5);
        arrayList.add(sb6);
        a(arrayList, pqoVar);
        byte[] bArrC = eeq.c(sb.toString() + sb2.toString() + sb6.toString() + sb3.toString() + sb4.toString() + sb5.toString());
        deviceCommand.setDataLen(bArrC.length);
        deviceCommand.setDataContent(bArrC);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        LogUtil.a("HwHeartAbility", "sendMediumToHighStrength dataInfos:", Arrays.toString(bArrC));
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    private static void d(pqo pqoVar, DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(41);
        StringBuilder sb = new StringBuilder(16);
        StringBuilder sb2 = new StringBuilder(16);
        StringBuilder sb3 = new StringBuilder(16);
        StringBuilder sb4 = new StringBuilder(16);
        StringBuilder sb5 = new StringBuilder(16);
        StringBuilder sb6 = new StringBuilder(16);
        StringBuilder sb7 = new StringBuilder(16);
        StringBuilder sb8 = new StringBuilder(16);
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(sb);
        arrayList.add(sb2);
        arrayList.add(sb3);
        arrayList.add(sb4);
        arrayList.add(sb5);
        arrayList.add(sb6);
        arrayList.add(sb7);
        arrayList.add(sb8);
        d(arrayList, pqoVar);
        byte[] bArrC = eeq.c(sb.toString() + sb2.toString() + sb6.toString() + sb3.toString() + sb4.toString() + sb5.toString() + sb7.toString() + sb8.toString());
        deviceCommand.setDataLen(bArrC.length);
        deviceCommand.setDataContent(bArrC);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        LogUtil.a("HwHeartAbility", "sendMediumToHighStrength dataInfos:", Arrays.toString(bArrC));
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    private static void a(List<StringBuilder> list, pqo pqoVar) {
        StringBuilder sb = list.get(0);
        sb.append(eeq.d(1));
        sb.append(eeq.d(1));
        sb.append(eeq.d(pqoVar.o()));
        StringBuilder sb2 = list.get(1);
        sb2.append(eeq.d(2));
        sb2.append(eeq.d(1));
        sb2.append(eeq.d(pqoVar.a()));
        StringBuilder sb3 = list.get(2);
        sb3.append(eeq.d(3));
        sb3.append(eeq.d(1));
        sb3.append(eeq.d(pqoVar.h()));
        StringBuilder sb4 = list.get(3);
        sb4.append(eeq.d(4));
        sb4.append(eeq.d(1));
        sb4.append(eeq.d(pqoVar.c()));
        StringBuilder sb5 = list.get(4);
        sb5.append(eeq.d(5));
        sb5.append(eeq.d(1));
        sb5.append(eeq.d(pqoVar.j()));
        StringBuilder sb6 = list.get(5);
        sb6.append(eeq.d(6));
        sb6.append(eeq.d(1));
        sb6.append(eeq.d(pqoVar.b()));
    }

    private static void d(List<StringBuilder> list, pqo pqoVar) {
        StringBuilder sb = list.get(0);
        sb.append(eeq.d(1));
        sb.append(eeq.d(1));
        sb.append(eeq.d(pqoVar.l()));
        StringBuilder sb2 = list.get(1);
        sb2.append(eeq.d(2));
        sb2.append(eeq.d(1));
        sb2.append(eeq.d(pqoVar.e()));
        StringBuilder sb3 = list.get(2);
        sb3.append(eeq.d(3));
        sb3.append(eeq.d(1));
        sb3.append(eeq.d(pqoVar.g()));
        StringBuilder sb4 = list.get(3);
        sb4.append(eeq.d(4));
        sb4.append(eeq.d(1));
        sb4.append(eeq.d(pqoVar.f()));
        StringBuilder sb5 = list.get(4);
        sb5.append(eeq.d(5));
        sb5.append(eeq.d(1));
        sb5.append(eeq.d(pqoVar.i()));
        StringBuilder sb6 = list.get(5);
        sb6.append(eeq.d(6));
        sb6.append(eeq.d(1));
        sb6.append(eeq.d(pqoVar.d()));
        StringBuilder sb7 = list.get(6);
        sb7.append(eeq.d(7));
        sb7.append(eeq.d(1));
        sb7.append(eeq.d(pqoVar.k()));
        StringBuilder sb8 = list.get(7);
        sb8.append(eeq.d(8));
        sb8.append(eeq.d(1));
        sb8.append(eeq.d(pqoVar.n()));
    }

    private static DeviceCapability d(DeviceInfo deviceInfo) {
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), "HwHeartAbility");
        if (mapQueryDeviceCapability == null || mapQueryDeviceCapability.isEmpty()) {
            LogUtil.j("HwHeartAbility", "getCapability, deviceCapabilityHashMaps is empty");
            return null;
        }
        return mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify());
    }
}
