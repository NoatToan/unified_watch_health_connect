package com.xiaomi.hm.health.thirdbind.wechat;

import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.third.wechat.entity.AppDeviceInfo;
import com.huami.third.wechat.ui.bind.bind.DeviceShape;
import com.huami.third.wechat.ui.bind.bind.IDeviceHelper;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.model.HMBrandType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/thirdbind/wechat/DeviceHelperImpl;", "Lcom/huami/third/wechat/ui/bind/bind/IDeviceHelper;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "", "a", "", "Lcom/huami/third/wechat/entity/AppDeviceInfo;", "getAllBoundDevices", "", "source", "Lcom/huami/third/wechat/ui/bind/bind/DeviceShape;", "getDeviceShapeBySource", "Lcom/huami/devicex/manager/DeviceManagerApi;", "Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "<init>", "(Lcom/huami/devicex/manager/DeviceManagerApi;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceHelperImpl implements IDeviceHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DeviceManagerApi deviceManagerApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "意外获取到不是腕上设备！";
        }
    }

    public DeviceHelperImpl(@NotNull DeviceManagerApi deviceManagerApi) {
        this.deviceManagerApi = deviceManagerApi;
    }

    private final boolean a(HMDeviceSource hMDeviceSource) {
        return hMDeviceSource.getType() == HMDeviceType.MILI || hMDeviceSource.getType() == HMDeviceType.WATCH;
    }

    @Override // com.huami.third.wechat.ui.bind.bind.IDeviceHelper
    @NotNull
    public List<AppDeviceInfo> getAllBoundDevices() {
        List<Device> deviceListOrdered = HMDeviceManager.getDeviceListOrdered();
        ArrayList<Device> arrayList = new ArrayList();
        for (Object obj : deviceListOrdered) {
            if (a(HMDeviceSource.fromValue(((Device) obj).getDevice_source().intValue()))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (Device device : arrayList) {
            arrayList2.add(new AppDeviceInfo(device.getSn(), device.getDevice_source().intValue(), HMDeviceUtils.getDeviceDescription(HMDeviceSource.fromValue(device.getDevice_source().intValue()), HMBrandType.fromValue(device.getBrandType().intValue())), device.getDevice_address(), this.deviceManagerApi.isActive(device)));
        }
        return arrayList2;
    }

    @Override // com.huami.third.wechat.ui.bind.bind.IDeviceHelper
    @NotNull
    public DeviceShape getDeviceShapeBySource(int source) {
        HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(source);
        if (!a(hMDeviceSourceFromValue)) {
            HMLog.error$default("wechat", null, null, a.a, 6, null);
            return DeviceShape.UNKNOWN;
        }
        if (ConfigHelperKt.hasFeature(hMDeviceSourceFromValue, Feature.SQUARE_WATCH_S)) {
            return DeviceShape.SQUARE;
        }
        return ConfigHelperKt.hasFeature(hMDeviceSourceFromValue, Feature.ROUND_WATCH_S) ? DeviceShape.CIRCULAR : DeviceShape.BAND;
    }
}
