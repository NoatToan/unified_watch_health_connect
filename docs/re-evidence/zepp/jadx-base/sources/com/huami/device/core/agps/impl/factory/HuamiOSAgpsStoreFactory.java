package com.huami.device.core.agps.impl.factory;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.core.agps.AgpsUpgradeBuilder;
import com.huami.device.core.agps.api.AbstractAgpsUpgradeFactory;
import com.huami.device.core.agps.api.AgpsHttpClient;
import com.huami.device.core.agps.api.DownloadResourceType;
import com.huami.device.core.agps.api.MultiDependenceStore;
import com.huami.device.core.agps.api.NeedUpgradeStrategy;
import com.huami.device.core.agps.api.UpgradeTarget;
import com.huami.device.core.agps.api.bean.AppInfo;
import com.huami.device.core.agps.comm.AGPSGroup;
import com.huami.device.core.agps.impl.AgpsAnalytics;
import com.huami.device.core.agps.impl.DevicePropertyProvider;
import com.huami.device.core.agps.impl.MiFitHttpClient;
import com.huami.device.core.agps.impl.store.HmSecondaryStore;
import com.huami.device.core.agps.impl.store.HuamiOSFirmwareStore;
import com.huami.device.core.agps.impl.store.HuamiOSStore;
import com.huami.device.core.agps.impl.store.HuamiOsSonyStore;
import com.huami.device.core.agps.impl.strategy.UpgradeStrategy;
import com.huami.device.core.agps.impl.upgrade.UpgradeWithRetryTarget;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0!¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001d\u0010\u0012\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0018\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR(\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/huami/device/core/agps/impl/factory/HuamiOSAgpsStoreFactory;", "Lcom/huami/device/core/agps/api/AbstractAgpsUpgradeFactory;", "Lcom/huami/device/core/agps/api/MultiDependenceStore;", "a", "createStore", "Lcom/huami/device/core/agps/api/bean/AppInfo;", "createAppInfo", "Lcom/huami/device/core/agps/api/AgpsHttpClient;", "createHttpClient", "Lcom/huami/device/core/agps/api/NeedUpgradeStrategy;", "createUpdateStrategy", "Lcom/huami/device/core/agps/api/UpgradeTarget;", "createTarget", "Lcom/huami/device/core/agps/impl/AgpsAnalytics;", "c", "Lkotlin/Lazy;", "b", "()Lcom/huami/device/core/agps/impl/AgpsAnalytics;", "analytics", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "getDevice", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "e", "Lcom/huami/device/core/agps/api/bean/AppInfo;", "info", "", "Lcom/huami/device/core/agps/comm/AGPSGroup;", "f", "Ljava/lang/Iterable;", "aGPSTypes", "Lkotlin/Function2;", "", "", "", "g", "Lkotlin/jvm/functions/Function2;", "onMessage", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lcom/huami/device/core/agps/api/bean/AppInfo;Ljava/lang/Iterable;Lkotlin/jvm/functions/Function2;)V", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public final class HuamiOSAgpsStoreFactory extends AbstractAgpsUpgradeFactory {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy analytics;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final HMBaseDevice device;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AppInfo info;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Iterable<AGPSGroup> aGPSTypes;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Function2<String, Integer, Unit> onMessage;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DownloadResourceType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[DownloadResourceType.EPO.ordinal()] = 1;
            iArr[DownloadResourceType.LLE.ordinal()] = 2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/huami/device/core/agps/impl/AgpsAnalytics;", "a", "()Lcom/huami/device/core/agps/impl/AgpsAnalytics;"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<AgpsAnalytics> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AgpsAnalytics invoke() {
            return new AgpsAnalytics(new DevicePropertyProvider(HuamiOSAgpsStoreFactory.this.getDevice()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HuamiOSAgpsStoreFactory(@NotNull HMBaseDevice hMBaseDevice, @NotNull AppInfo appInfo, @NotNull Iterable<? extends AGPSGroup> iterable, @NotNull Function2<? super String, ? super Integer, Unit> function2) {
        super(appInfo.getFileType());
        this.device = hMBaseDevice;
        this.info = appInfo;
        this.aGPSTypes = iterable;
        this.onMessage = function2;
        this.analytics = LazyKt__LazyJVMKt.lazy(new a());
    }

    private final MultiDependenceStore a() {
        return new HmSecondaryStore(createHttpClient(), getInfo(), AgpsUpgradeBuilder.INSTANCE.getContext$agps_impl_release().getCacheDir().getAbsolutePath());
    }

    private final AgpsAnalytics b() {
        return (AgpsAnalytics) this.analytics.getValue();
    }

    @Override // com.huami.device.core.agps.api.AbstractAgpsUpgradeFactory
    @NotNull
    /* JADX INFO: renamed from: createAppInfo, reason: from getter */
    public AppInfo getInfo() {
        return this.info;
    }

    @Override // com.huami.device.core.agps.api.AbstractAgpsUpgradeFactory
    @NotNull
    public AgpsHttpClient createHttpClient() {
        AgpsHttpClient httpClient$agps_impl_release = AgpsUpgradeBuilder.INSTANCE.getHttpClient$agps_impl_release();
        return httpClient$agps_impl_release != null ? httpClient$agps_impl_release : new MiFitHttpClient(getInfo());
    }

    @Override // com.huami.device.core.agps.api.AbstractAgpsUpgradeFactory
    @NotNull
    public MultiDependenceStore createStore() {
        return new HuamiOSStore(createHttpClient(), getInfo(), AgpsUpgradeBuilder.INSTANCE.getContext$agps_impl_release().getCacheDir().getAbsolutePath());
    }

    @Override // com.huami.device.core.agps.api.AbstractAgpsUpgradeFactory
    @NotNull
    public UpgradeTarget createTarget() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.info.getFileType().ordinal()];
        if (i == 1) {
            return new UpgradeWithRetryTarget(this.device, b(), new HuamiOSFirmwareStore(b(), createStore(), this.aGPSTypes, this.onMessage), new HuamiOSFirmwareStore(b(), a(), this.aGPSTypes, this.onMessage), this.onMessage);
        }
        if (i == 2) {
            return new UpgradeWithRetryTarget(this.device, b(), new HuamiOsSonyStore(this.aGPSTypes, false), new HuamiOsSonyStore(this.aGPSTypes, true), this.onMessage);
        }
        throw new NotImplementedError("Zepp OS 中未实现这种类型的功能 " + this.info.getFileType().name());
    }

    @Override // com.huami.device.core.agps.api.AbstractAgpsUpgradeFactory
    @NotNull
    public NeedUpgradeStrategy createUpdateStrategy() {
        return new UpgradeStrategy();
    }

    @NotNull
    public final HMBaseDevice getDevice() {
        return this.device;
    }
}
