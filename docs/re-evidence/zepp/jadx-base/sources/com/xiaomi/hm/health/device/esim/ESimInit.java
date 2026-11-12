package com.xiaomi.hm.health.device.esim;

import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.esim.ESimCallback;
import com.huami.watch.companion.esim.IESimDeviceManager;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/device/esim/ESimInit;", "", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ESimInit {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/device/esim/ESimInit$Companion;", "", "", "b", "", "a", PointCategory.INIT, "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:19:0x005a  */
        public final String a() {
            String strValueOf;
            HMDeviceType majorDeviceType = ManagerFunctionsKt.getDeviceManagerApi().getMajorDeviceType();
            Device bindInfo = ManagerFunctionsKt.getDeviceManagerApi().getBindInfo(majorDeviceType);
            if (bindInfo == null) {
                return "";
            }
            if (majorDeviceType == HMDeviceType.WATCH && DeviceUtil.isCurrentXihuSeries(DeviceXFunctionsKt.getContext())) {
                com.huami.watch.companion.device.Device currentDevice = DeviceManager.getManager(DeviceXFunctionsKt.getContext()).getCurrentDevice();
                if (DeviceSource.isModelXihuDisney(currentDevice)) {
                    strValueOf = "";
                } else {
                    strValueOf = currentDevice.info().getHuamiModel();
                }
            } else if (bindInfo.getProductId() == null || bindInfo.getProductId().intValue() == -1) {
                strValueOf = "";
            } else {
                strValueOf = String.valueOf(bindInfo.getProductId());
            }
            String strValueOf2 = (bindInfo.getProductVersion() == null || bindInfo.getProductVersion().intValue() == -1) ? "" : String.valueOf(bindInfo.getProductVersion());
            Integer device_type = bindInfo.getDevice_type();
            String strValueOf3 = device_type == null ? "" : String.valueOf(device_type);
            Integer device_source = bindInfo.getDevice_source();
            return strValueOf + "." + strValueOf2 + "." + strValueOf3 + "." + (device_source != null ? String.valueOf(device_source) : "");
        }

        private final void b() {
            ESimCallback.INSTANCE.setESimDeviceManager(new IESimDeviceManager() { // from class: com.xiaomi.hm.health.device.esim.ESimInit$Companion$setESimManagerCallback$eSimDeviceManagerCallback$1
                @Override // com.huami.watch.companion.esim.IESimDeviceManager
                @NotNull
                public HMBaseDevice getBoundMajorDevice() {
                    HMDeviceType majorDeviceType = ManagerFunctionsKt.getDeviceManagerApi().getMajorDeviceType();
                    HMBaseDevice device = ManagerFunctionsKt.getDeviceManagerApi().getDevice(majorDeviceType);
                    if (device != null) {
                        return device;
                    }
                    throw new NullPointerException("No device of " + majorDeviceType);
                }

                @Override // com.huami.watch.companion.esim.IESimDeviceManager
                @NotNull
                public HMDeviceType getBoundMajorDeviceType() {
                    return ManagerFunctionsKt.getDeviceManagerApi().getMajorDeviceType();
                }

                @Override // com.huami.watch.companion.esim.IESimDeviceManager
                @NotNull
                public String getMetaValue() {
                    return ESimInit.INSTANCE.a();
                }
            });
        }

        public final void init() {
            b();
        }
    }
}
