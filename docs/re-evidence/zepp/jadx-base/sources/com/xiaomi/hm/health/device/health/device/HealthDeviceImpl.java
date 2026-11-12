package com.xiaomi.hm.health.device.health.device;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.device.init.BaseHealthInit;
import com.huami.hid.takepic.TakePicSettingActivity;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HardwareInfo;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.device.medical.MedicalUtilKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B\u0015\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b#\u0010$J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011H\u0016R\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/device/health/device/HealthDeviceImpl;", "Lcom/huami/device/feature/health/device/HealthDevice;", "Lcom/xiaomi/hm/health/bt/device/HMMiLiDevice;", "a", "", "isComoDevice", "isConnect", "isForceHrAndRemEnable", "", "source", "isGt2Source", "isHealthDetect", "isHuamiOs", "isIndiaOrHankou", "isMedicalDevice", "isMifit", TakePicSettingActivity.KEY_IS_WATCH, "Landroidx/lifecycle/LiveData;", "observeConnectStatus", "", "Lcom/huami/device/feature/health/device/init/BaseHealthInit;", "Ljava/util/List;", "getHealthList", "()Ljava/util/List;", "healthList", "", "getDeviceId", "()Ljava/lang/String;", "deviceId", "getDeviceSource", "()I", "deviceSource", "getDeviceType", "deviceType", "list", "<init>", "(Ljava/util/List;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthDeviceImpl implements HealthDevice {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final MutableLiveData<Boolean> b = new MutableLiveData<>();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<BaseHealthInit> healthList;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/health/device/HealthDeviceImpl$Companion;", "", "Landroidx/lifecycle/MutableLiveData;", "", "deviceConnectLiveData", "Landroidx/lifecycle/MutableLiveData;", "getDeviceConnectLiveData", "()Landroidx/lifecycle/MutableLiveData;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MutableLiveData<Boolean> getDeviceConnectLiveData() {
            return HealthDeviceImpl.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.MILI_COMO.ordinal()] = 1;
            iArr[HMDeviceSource.MILI_COMO_W.ordinal()] = 2;
            iArr[HMDeviceSource.MILI_COMO_L.ordinal()] = 3;
            iArr[HMDeviceSource.MILI_COMO_WL.ordinal()] = 4;
            iArr[HMDeviceSource.MILI_CRATER_W.ordinal()] = 5;
            iArr[HMDeviceSource.MILI_CRATER_WL.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HealthDeviceImpl(@NotNull List<? extends BaseHealthInit> list) {
        this.healthList = list;
    }

    private final HMMiLiDevice a() {
        HMBaseDevice miliDevice = HMDeviceManager.getInstance().getMiliDevice();
        if (miliDevice instanceof HMMiLiDevice) {
            return (HMMiLiDevice) miliDevice;
        }
        return null;
    }

    @Override // com.huami.device.feature.health.device.HealthDevice
    @NotNull
    public String getDeviceId() {
        DeviceInfo deviceInfo;
        String deviceID;
        HMMiLiDevice hMMiLiDeviceA = a();
        return (hMMiLiDeviceA == null || (deviceInfo = hMMiLiDeviceA.getDeviceInfo()) == null || (deviceID = deviceInfo.getDeviceID()) == null) ? "" : deviceID;
    }

    @Override // com.huami.device.feature.health.device.HealthDevice
    public int getDeviceSource() {
        HMDeviceSource deviceSource;
        HMMiLiDevice hMMiLiDeviceA = a();
        Integer numValueOf = null;
        if (hMMiLiDeviceA != null && (deviceSource = hMMiLiDeviceA.getMDeviceSource()) != null) {
            numValueOf = Integer.valueOf(deviceSource.getValue());
        }
        return numValueOf == null ? HMDeviceSource.MILI.getValue() : numValueOf.intValue();
    }

    @Override // com.huami.device.feature.health.device.HealthDevice
    public int getDeviceType() {
        HMDeviceType deviceType;
        HMMiLiDevice hMMiLiDeviceA = a();
        Integer numValueOf = null;
        if (hMMiLiDeviceA != null && (deviceType = hMMiLiDeviceA.getDeviceType()) != null) {
            numValueOf = Integer.valueOf(deviceType.getValue());
        }
        return numValueOf == null ? HMDeviceType.MILI.getValue() : numValueOf.intValue();
    }

    @Override // com.huami.device.feature.health.device.HealthDevice
    @NotNull
    public List<BaseHealthInit> getHealthList() {
        return this.healthList;
    }

    @Override // com.huami.device.feature.health.device.HealthDevice
    public boolean isComoDevice() {
        DeviceInfo deviceInfo;
        HMMiLiDevice hMMiLiDeviceA = a();
        if (hMMiLiDeviceA == null || (deviceInfo = hMMiLiDeviceA.getDeviceInfo()) == null) {
            return false;
        }
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        switch (deviceSource == null ? -1 : WhenMappings.$EnumSwitchMapping$0[deviceSource.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    @Override // com.huami.device.feature.health.device.HealthDevice
    public boolean isConnect() {
        HMMiLiDevice hMMiLiDeviceA = a();
        return hMMiLiDeviceA != null && hMMiLiDeviceA.isConnected();
    }

    @Override // com.huami.device.feature.health.device.HealthDevice
    public boolean isForceHrAndRemEnable() {
        return ConfigHelperKt.hasFeature(Feature.AMAZFIT_X_SOURCE_S, HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI));
    }

    @Override // com.huami.device.feature.health.device.HealthDevice
    public boolean isGt2Source(int source) {
        return ConfigHelperKt.hasFeature(Feature.G2_SOURCE_S, HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI));
    }

    @Override // com.huami.device.feature.health.device.HealthDevice
    public boolean isHealthDetect() {
        return isHuamiOs() || HMDevicePropertyCache.INSTANCE.getInstance().getMiliFeature().hasSw(34);
    }

    @Override // com.huami.device.feature.health.device.HealthDevice
    public boolean isHuamiOs() {
        Feature feature = Feature.GT3_SOURCE;
        HMMiLiDevice hMMiLiDeviceA = a();
        if (!ConfigHelperKt.hasFeature(feature, hMMiLiDeviceA == null ? null : hMMiLiDeviceA.getMDeviceSource())) {
            Feature feature2 = Feature.L66_SERIES_S;
            HMMiLiDevice hMMiLiDeviceA2 = a();
            if (!ConfigHelperKt.hasFeature(feature2, hMMiLiDeviceA2 != null ? hMMiLiDeviceA2.getMDeviceSource() : null)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.huami.device.feature.health.device.HealthDevice
    public boolean isIndiaOrHankou() {
        DeviceInfo deviceInfo;
        HMMiLiDevice hMMiLiDeviceA = a();
        if (hMMiLiDeviceA == null || (deviceInfo = hMMiLiDeviceA.getDeviceInfo()) == null || deviceInfo.getDeviceSource() != HMDeviceSource.MILI_WUHAN) {
            return false;
        }
        return HardwareInfo.isIndia(deviceInfo.getHardwareVersionStr()) || deviceInfo.isMiLiHankou();
    }

    @Override // com.huami.device.feature.health.device.HealthDevice
    public boolean isMedicalDevice() {
        return MedicalUtilKt.isMedicalDevice(getDeviceSource());
    }

    @Override // com.huami.device.feature.health.device.HealthDevice
    public boolean isMifit() {
        return false;
    }

    @Override // com.huami.device.feature.health.device.HealthDevice
    public boolean isWatch() {
        return ConfigHelperKt.hasFeature(Feature.WATCH_SOURCE_S, HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI));
    }

    @Override // com.huami.device.feature.health.device.HealthDevice
    @NotNull
    public LiveData<Boolean> observeConnectStatus() {
        return b;
    }
}
