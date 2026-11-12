package com.xiaomi.fitness.rn.extetions;

import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.rn.export.bean.RNDevice;
import com.xiaomi.smarthome.device.Device;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toRNDevice", "Lcom/xiaomi/fitness/rn/export/bean/RNDevice;", "Lcom/xiaomi/smarthome/device/Device;", "sdk_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DeviceExtKt {
    @NotNull
    public static final RNDevice toRNDevice(@NotNull Device device) {
        Intrinsics.checkNotNullParameter(device, "<this>");
        String did = device.did;
        Intrinsics.checkNotNullExpressionValue(did, "did");
        int i = device.pid;
        String model = device.model;
        Intrinsics.checkNotNullExpressionValue(model, "model");
        String name = device.name;
        Intrinsics.checkNotNullExpressionValue(name, "name");
        RNDevice rNDevice = new RNDevice(did, i, model, name, null, null, 0, null, SportReportBaseParser.ReportType.avgFreq, null);
        rNDevice.setExtraJson(device.getExtraInfo());
        rNDevice.setOnline(device.isOnline);
        rNDevice.setOwner(device.isOwner());
        rNDevice.setPermitLevel(device.permitLevel);
        rNDevice.setOwnerId(device.ownerId);
        rNDevice.setOwnerName(device.ownerName);
        rNDevice.setIdentifier(device.sn);
        rNDevice.setOrderTimeJString(device.orderTimeJString);
        String mac = device.mac;
        Intrinsics.checkNotNullExpressionValue(mac, "mac");
        rNDevice.setMac(mac);
        return rNDevice;
    }
}
