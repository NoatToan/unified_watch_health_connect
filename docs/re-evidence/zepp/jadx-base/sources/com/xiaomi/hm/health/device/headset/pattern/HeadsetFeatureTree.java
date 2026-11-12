package com.xiaomi.hm.health.device.headset.pattern;

import com.facebook.appevents.integrity.IntegrityManager;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.passport.Configs;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.market.sdk.Constants;
import java.util.HashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0004J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0004J#\u0010\r\u001a\u00020\f2\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000bH\u0004¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\f2\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000bH\u0004¢\u0006\u0004\b\u000f\u0010\u000eJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010J\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bJ\u0016\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\bJ\b\u0010\u0015\u001a\u00020\fH&J\u0006\u0010\u0016\u001a\u00020\fR&\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0017j\b\u0012\u0004\u0012\u00020\u000b`\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001f¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/pattern/HeadsetFeatureTree;", "Lorg/koin/core/component/KoinComponent;", "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "findDeviceSource", "Lcom/xiaomi/hm/health/device/deviceconfig/Feature;", Constants.JSON_FEATURE, "", "isSupportDeviceFeature", "", "Lcom/xiaomi/hm/health/device/headset/pattern/HeadsetSoftFeature;", "", "putFeature", "([Lcom/xiaomi/hm/health/device/headset/pattern/HeadsetSoftFeature;)V", "removeFeature", "", "allFeatures", "isSupport", "isEnable", "setFeatureEnable", "setup", Configs.Params.RESET, "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "a", "Ljava/util/HashSet;", "supportFeatures", "Lcom/huami/devicex/manager/DeviceManagerApi;", "b", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public abstract class HeadsetFeatureTree implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HashSet<HeadsetSoftFeature> supportFeatures = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX WARN: Multi-variable type inference failed */
    public HeadsetFeatureTree() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.headset.pattern.HeadsetFeatureTree$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
    }

    private final DeviceManagerApi a() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    @NotNull
    public final Set<HeadsetSoftFeature> allFeatures() {
        return this.supportFeatures;
    }

    @Nullable
    public final HMDeviceSource findDeviceSource(@NotNull String address) {
        Device bindDevice = a().getBindDevice(HMDeviceType.HEADSET, address);
        if (bindDevice == null) {
            return null;
        }
        return HMDeviceSource.fromValue(bindDevice.getDevice_source().intValue());
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final boolean isSupport(@NotNull HeadsetSoftFeature feature) {
        boolean zContains;
        synchronized (this.supportFeatures) {
            zContains = this.supportFeatures.contains(feature);
        }
        return zContains;
    }

    public final boolean isSupportDeviceFeature(@NotNull String address, @NotNull Feature feature) {
        HMDeviceSource hMDeviceSourceFindDeviceSource = findDeviceSource(address);
        if (hMDeviceSourceFindDeviceSource == null) {
            return false;
        }
        return ConfigHelperKt.hasFeature(hMDeviceSourceFindDeviceSource, feature);
    }

    public final void putFeature(@NotNull HeadsetSoftFeature... feature) {
        h.addAll(this.supportFeatures, feature);
    }

    public final void removeFeature(@NotNull HeadsetSoftFeature... feature) {
        h.removeAll(this.supportFeatures, feature);
    }

    public final void reset() {
        synchronized (this.supportFeatures) {
            this.supportFeatures.clear();
            setup();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void setFeatureEnable(@NotNull HeadsetSoftFeature feature, boolean isEnable) {
        if (isEnable) {
            putFeature(feature);
        } else {
            removeFeature(feature);
        }
    }

    public abstract void setup();
}
