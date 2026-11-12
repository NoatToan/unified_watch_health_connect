package com.xiaomi.hm.health.device.brand;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.manager.DeviceRepositoryWrapper;
import com.huami.tools.log.HMLog;
import com.huami.wallet.accessdoor.helper.DoorCardExtensionKt;
import com.huami.watch.companion.device.brand.BrandName;
import com.huami.watch.companion.device.brand.BrandNameService;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.deviceconfig.HMBaseDeviceConfig;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u00012\u00020\u0002:\u0001\u0011B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u001d\u0010\u0015\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0018\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/device/brand/BrandNameServiceIml;", "Lcom/huami/watch/companion/device/brand/BrandNameService;", "Lorg/koin/core/component/KoinComponent;", "", "Lcom/xiaomi/hm/health/databases/model/Device;", "devices", "Lcom/huami/watch/companion/device/brand/BrandName;", "e", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "", GoogleApiAvailabilityLight.a, "", "c", "getPrimaryDeviceBrand", "getDeviceBrand", "Lcom/xiaomi/hm/health/device/brand/BrandFilterRule;", "a", "Lkotlin/Lazy;", "b", "()Lcom/xiaomi/hm/health/device/brand/BrandFilterRule;", "filter", "Lcom/huami/devicex/manager/DeviceRepositoryWrapper;", "()Lcom/huami/devicex/manager/DeviceRepositoryWrapper;", "deviceRepositoryWrapper", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BrandNameServiceIml implements BrandNameService, KoinComponent {

    @Deprecated
    @NotNull
    public static final String TAG = "BrandNameService";

    @NotNull
    private static final a c = new a(null);

    @Deprecated
    @NotNull
    private static final ArrayList<HMDeviceSource> d = CollectionsKt__CollectionsKt.arrayListOf(HMDeviceSource.WEIGHT, HMDeviceSource.WEIGHT_BODYFAT, HMDeviceSource.WEIGHT_BFS, HMDeviceSource.WEIGHT_SCALE2, HMDeviceSource.WEIGHT_AMAZFIT_SCALE);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy filter = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceRepositoryWrapper;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.WEIGHT.ordinal()] = 1;
            iArr[HMDeviceSource.WEIGHT_BODYFAT.ordinal()] = 2;
            iArr[HMDeviceSource.WEIGHT_BFS.ordinal()] = 3;
            iArr[HMDeviceSource.WEIGHT_SCALE2.ordinal()] = 4;
            iArr[HMDeviceSource.WEIGHT_AMAZFIT_SCALE.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR)\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"com/xiaomi/hm/health/device/brand/BrandNameServiceIml$a", "", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "Lkotlin/collections/ArrayList;", "scaleSources", "Ljava/util/ArrayList;", "a", "()Ljava/util/ArrayList;", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ArrayList<HMDeviceSource> a() {
            return BrandNameServiceIml.d;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/brand/BrandFilterRule;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<BrandFilterRule> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BrandFilterRule invoke() {
            return new BrandFilterRule();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BrandNameServiceIml() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceRepositoryWrapper = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceRepositoryWrapper>() { // from class: com.xiaomi.hm.health.device.brand.BrandNameServiceIml$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceRepositoryWrapper, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceRepositoryWrapper invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceRepositoryWrapper.class), qualifier, objArr);
            }
        });
    }

    private final DeviceRepositoryWrapper a() {
        return (DeviceRepositoryWrapper) this.deviceRepositoryWrapper.getValue();
    }

    private final BrandFilterRule b() {
        return (BrandFilterRule) this.filter.getValue();
    }

    private final boolean c(HMDeviceSource deviceSource) {
        return d.contains(deviceSource);
    }

    private final String d(HMDeviceSource deviceSource) {
        int i = WhenMappings.$EnumSwitchMapping$0[deviceSource.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return DoorCardExtensionKt.APPLY_CHANNEL_MI;
        }
        return i != 5 ? "" : "AMAZFIT scale";
    }

    private final BrandName e(List<? extends Device> devices) {
        Object obj;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(devices, 10));
        Iterator<T> it2 = devices.iterator();
        while (it2.hasNext()) {
            arrayList.add(HMDeviceSource.fromValue(((Device) it2.next()).getDevice_source().intValue()));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(getDeviceBrand((HMDeviceSource) it3.next()));
        }
        Iterator it4 = arrayList2.iterator();
        if (it4.hasNext()) {
            Object next = it4.next();
            if (it4.hasNext()) {
                int iOrdinal = ((BrandName) next).ordinal();
                do {
                    Object next2 = it4.next();
                    int iOrdinal2 = ((BrandName) next2).ordinal();
                    if (iOrdinal > iOrdinal2) {
                        next = next2;
                        iOrdinal = iOrdinal2;
                    }
                } while (it4.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        BrandName brandName = (BrandName) obj;
        return brandName == null ? BrandName.OTHER : brandName;
    }

    @Override // com.huami.watch.companion.device.brand.BrandNameService
    @NotNull
    public BrandName getDeviceBrand(@NotNull HMDeviceSource deviceSource) {
        try {
            if (c(deviceSource)) {
                return b().matchMultiNames(CollectionsKt__CollectionsKt.arrayListOf(d(deviceSource)));
            }
            ArrayList arrayList = new ArrayList();
            HMBaseDeviceConfig deviceConfig = ConfigHelperKt.getDeviceConfig(deviceSource);
            arrayList.addAll(deviceConfig.getBtNames());
            arrayList.add(DeviceXFunctionsKt.getContext().getString(deviceConfig.getDeviceDesc()));
            return b().matchMultiNames(arrayList);
        } catch (Throwable th) {
            HMLog.e(TAG, th);
            return BrandName.OTHER;
        }
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.watch.companion.device.brand.BrandNameService
    @NotNull
    public BrandName getPrimaryDeviceBrand() {
        try {
            List<Device> deviceListOrdered = a().getDeviceListOrdered();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = deviceListOrdered.iterator();
            while (true) {
                boolean z = true;
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Integer activeStatus = ((Device) next).getActiveStatus();
                if (activeStatus == null || activeStatus.intValue() != 1) {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            if (arrayList.isEmpty()) {
                return BrandName.AMZ;
            }
            return arrayList.size() == 1 ? getDeviceBrand(HMDeviceSource.fromValue(((Device) CollectionsKt.first((List) deviceListOrdered)).getDevice_source().intValue())) : e(arrayList);
        } catch (Throwable th) {
            HMLog.e(TAG, th);
            return BrandName.OTHER;
        }
    }
}
