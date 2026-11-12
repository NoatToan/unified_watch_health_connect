package com.xiaomi.fit.eco.device.bind;

import com.xiaomi.fit.eco.device.EcoDeviceFactory;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoLocalDevice;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J:\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u000e\u0010\u0010\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fit/eco/device/bind/EcoLocalDeviceBinder;", "Lcom/xiaomi/fit/eco/device/bind/EcoBaseDeviceBinder;", "deviceInfo", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;", "<init>", "(Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;)V", "onLocalBindSuccess", "", "model", "", "did", "mac", "sn", "appDeviceId", "appToken", "", "unbind", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "revokeAuthorization", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcoLocalDeviceBinder extends EcoBaseDeviceBinder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcoLocalDeviceBinder(@NotNull EcoDeviceInfo deviceInfo) {
        super(deviceInfo);
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        EcoDeviceFactory ecoDeviceFactory = EcoDeviceFactory.INSTANCE;
        String mac = getMDeviceInfo().getMac();
        Intrinsics.checkNotNull(mac);
        setMEcoApiCall(ecoDeviceFactory.getEcoApiCall(mac, getMDeviceInfo().getDid(), getMDeviceInfo(), false, this));
    }

    @Override // com.xiaomi.fit.eco.device.bind.EcoBaseDeviceBinder
    public void onLocalBindSuccess(@NotNull String model, @NotNull String did, @NotNull String mac, @Nullable String sn, @NotNull String appDeviceId, @NotNull byte[] appToken) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(appDeviceId, "appDeviceId");
        Intrinsics.checkNotNullParameter(appToken, "appToken");
        super.onLocalBindSuccess(model, did, mac, sn, appDeviceId, appToken);
        EcoLocalDevice ecoLocalDevice = new EcoLocalDevice(appDeviceId, null, null, null, null, 0, null, null, null, null, 1022, null);
        ecoLocalDevice.setDid(did);
        ecoLocalDevice.setModel(model);
        ecoLocalDevice.setProductId(getMDeviceInfo().getProductId());
        ecoLocalDevice.setName(getMDeviceInfo().getName());
        ecoLocalDevice.setStatus(1);
        ecoLocalDevice.setSn(sn);
        ecoLocalDevice.setMac(mac);
        ecoLocalDevice.setAppToken(ByteUtil.byteToString(appToken));
        Device.Detail detail = new Device.Detail(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        detail.setToken(ByteUtil.byteToString(appToken));
        detail.setSn(sn);
        detail.setMac(mac);
        ecoLocalDevice.setDetail(detail);
        getMDeviceInfo().device = ecoLocalDevice;
        getMEcoDeviceManager().addLocalDevice(getMDeviceInfo());
    }

    @Override // com.xiaomi.fit.eco.device.bind.EcoBaseDeviceBinder, com.xiaomi.fitness.eco.device.model.api.EcoDeviceBinder
    @Nullable
    public Object revokeAuthorization(@NotNull Continuation<? super Integer> continuation) {
        getMEcoDeviceManager().removeLocalDevice(getMDeviceInfo().getDid());
        return Boxing.boxInt(-2);
    }

    @Override // com.xiaomi.fit.eco.device.bind.EcoBaseDeviceBinder, com.xiaomi.fitness.eco.device.model.api.EcoDeviceBinder
    @Nullable
    public Object unbind(@NotNull Continuation<? super Integer> continuation) {
        getMEcoDeviceManager().removeLocalDevice(getMDeviceInfo().getDid());
        return Boxing.boxInt(-2);
    }
}
