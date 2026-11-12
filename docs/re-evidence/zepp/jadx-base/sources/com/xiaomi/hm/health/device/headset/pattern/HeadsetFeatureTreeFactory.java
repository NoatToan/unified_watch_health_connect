package com.xiaomi.hm.health.device.headset.pattern;

import com.facebook.appevents.integrity.IntegrityManager;
import com.huami.devicex.manager.DeviceManagerApi;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.headset.pattern.imp.HaydnFeatureTree;
import com.xiaomi.hm.health.device.headset.pattern.imp.LullabyFeatureTree;
import com.xiaomi.hm.health.device.headset.pattern.imp.MozartFeatureTree;
import com.xiaomi.market.sdk.Constants;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006R\"\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\f\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/pattern/HeadsetFeatureTreeFactory;", "Lorg/koin/core/component/KoinComponent;", "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Lcom/xiaomi/hm/health/device/headset/pattern/HeadsetFeatureTree;", "realCreate", "Lcom/xiaomi/hm/health/device/headset/pattern/HeadsetSoftFeature;", Constants.JSON_FEATURE, "", "isSupportFeature", "Ljava/util/WeakHashMap;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "a", "Ljava/util/WeakHashMap;", "cacheMap", "b", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "hmBaseDeviceSource", "Lcom/huami/devicex/manager/DeviceManagerApi;", "c", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HeadsetFeatureTreeFactory implements KoinComponent {

    @NotNull
    public static final HeadsetFeatureTreeFactory INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final WeakHashMap<HMDeviceSource, HeadsetFeatureTree> cacheMap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static HMDeviceSource hmBaseDeviceSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final Lazy deviceManagerApi;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.OTHER_MOZART.ordinal()] = 1;
            iArr[HMDeviceSource.OTHER_HAYDN.ordinal()] = 2;
            iArr[HMDeviceSource.OTHER_LULLABY.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Feature> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Feature invoke() {
            DeviceInfo deviceInfo;
            HMBaseDevice device = HeadsetFeatureTreeFactory.INSTANCE.a().getDevice(HMDeviceType.HEADSET);
            if (device == null || (deviceInfo = device.getDeviceInfo()) == null) {
                return null;
            }
            return deviceInfo.getDeviceFeature();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final HeadsetFeatureTreeFactory headsetFeatureTreeFactory = new HeadsetFeatureTreeFactory();
        INSTANCE = headsetFeatureTreeFactory;
        cacheMap = new WeakHashMap<>();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.headset.pattern.HeadsetFeatureTreeFactory$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = headsetFeatureTreeFactory;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
    }

    private HeadsetFeatureTreeFactory() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceManagerApi a() {
        return (DeviceManagerApi) deviceManagerApi.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final boolean isSupportFeature(@NotNull String address, @NotNull HeadsetSoftFeature feature) {
        HeadsetFeatureTree headsetFeatureTreeRealCreate = realCreate(address);
        headsetFeatureTreeRealCreate.setup();
        return headsetFeatureTreeRealCreate.isSupport(feature);
    }

    @NotNull
    public final HeadsetFeatureTree realCreate(@NotNull String address) {
        Device bindDevice = a().getBindDevice(HMDeviceType.HEADSET, address);
        HMDeviceSource hMDeviceSourceFromValue = bindDevice == null ? null : HMDeviceSource.fromValue(bindDevice.getDevice_source().intValue());
        if (hMDeviceSourceFromValue == null) {
            hMDeviceSourceFromValue = HMDeviceSource.VDEVICE;
        }
        hmBaseDeviceSource = hMDeviceSourceFromValue;
        WeakHashMap<HMDeviceSource, HeadsetFeatureTree> weakHashMap = cacheMap;
        Objects.requireNonNull(hMDeviceSourceFromValue);
        HeadsetFeatureTree mozartFeatureTree = weakHashMap.get(hMDeviceSourceFromValue);
        if (mozartFeatureTree == null) {
            HMDeviceSource hMDeviceSource = hmBaseDeviceSource;
            Objects.requireNonNull(hMDeviceSource);
            int i = WhenMappings.$EnumSwitchMapping$0[hMDeviceSource.ordinal()];
            if (i == 1) {
                mozartFeatureTree = new MozartFeatureTree(a.a);
            } else if (i != 2) {
                mozartFeatureTree = i != 3 ? new EmptyHeadsetFeatureTree() : new LullabyFeatureTree();
            } else {
                mozartFeatureTree = new HaydnFeatureTree();
            }
            HMDeviceSource hMDeviceSource2 = hmBaseDeviceSource;
            Objects.requireNonNull(hMDeviceSource2);
            weakHashMap.put(hMDeviceSource2, mozartFeatureTree);
        }
        return mozartFeatureTree;
    }
}
