package com.xiaomi.hm.health.ui.smartplay.meidacontrol;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.profile.amc.HMMusicControl;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle;
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

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b \u0010!J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u001d\u0010\u001f\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u0019\u0010\u001e¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/meidacontrol/MusicDeviceLifeCycle;", "Lcom/xiaomi/hm/health/device/setting/life/DeviceLifeCycle;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", GoogleApiAvailabilityLight.a, "c", "onDeviceBind", "onDeviceUnBind", "onBoundedDeviceConnected", "", "deviceId", "onBoundedDeviceDisconnect", "Lcom/xiaomi/hm/health/databases/model/Device;", "", "status", "onDeviceStatusChange", "enable", WatchFaceApi.CUSTOMIZABLE_DISABLE, "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/devicex/manager/DeviceManagerApi;", "b", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "<init>", "(Landroid/content/Context;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MusicDeviceLifeCycle implements DeviceLifeCycle, KoinComponent {

    @NotNull
    private static final String d = "MusicDeviceLifeCycle";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ HMBaseDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMBaseDevice hMBaseDevice) {
            super(0);
            this.a = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "disable, source: " + this.a.getMDeviceSource();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ HMBaseDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HMBaseDevice hMBaseDevice) {
            super(0);
            this.a = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "enable, source: " + this.a.getMDeviceSource();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onBoundedDeviceConnected but device source is null!!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ HMBaseDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HMBaseDevice hMBaseDevice) {
            super(0);
            this.a = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onBoundedDeviceConnected, source: " + this.a.getMDeviceSource();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onBoundedDeviceDisconnect, deviceId: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ HMBaseDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(HMBaseDevice hMBaseDevice) {
            super(0);
            this.a = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onDeviceBind, source: " + this.a.getMDeviceSource();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ Device a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Device device, int i) {
            super(0);
            this.a = device;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            Device device = this.a;
            return "onDeviceStatusChange, source: " + (device == null ? null : device.getDevice_source()) + "; status: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ HMBaseDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(HMBaseDevice hMBaseDevice) {
            super(0);
            this.a = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onDeviceUnBind, source: " + this.a.getMDeviceSource();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ HMBaseDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(HMBaseDevice hMBaseDevice) {
            super(0);
            this.a = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "stopMusicControl but device source is null!! and device is " + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MusicDeviceLifeCycle(@NotNull Context context) {
        this.context = context;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.ui.smartplay.meidacontrol.MusicDeviceLifeCycle$special$$inlined$inject$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.ui.smartplay.meidacontrol.MusicDeviceLifeCycle$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceUtilsApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), objArr2, objArr3);
            }
        });
    }

    private final DeviceManagerApi a() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final DeviceUtilsApi b() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    private final void c(HMBaseDevice device) {
        if (device.getMDeviceSource() == null) {
            HMLog.info(d, c.a);
        } else if (HMDeviceConfig.supportMusicControl(device.getMDeviceSource())) {
            b().initMedia(this.context);
        }
    }

    private final void d(HMBaseDevice device) {
        if ((device == null ? null : device.getMDeviceSource()) == null) {
            HMLog.info(d, new i(device));
        } else {
            if (device.isConnected() || !HMDeviceConfig.supportMusicControl(device.getMDeviceSource())) {
                return;
            }
            b().handleDeviceCommand(HMMusicControl.DeviceCommand.STOP);
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceVisibility
    public void disable(@NotNull HMBaseDevice device) {
        HMLog.info(d, new a(device));
        d(a().getMiliDevice());
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceVisibility
    public void enable(@NotNull HMBaseDevice device) {
        HMLog.info(d, new b(device));
        c(device);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onBoundedDeviceConnected(@NotNull HMBaseDevice device) {
        HMLog.info(d, new d(device));
        c(device);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onBoundedDeviceDisconnect(@NotNull String deviceId) {
        HMLog.info(d, new e(deviceId));
        d(a().getMiliDevice());
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onDeviceBind(@NotNull HMBaseDevice device) {
        HMLog.info(d, new f(device));
        c(device);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onDeviceStatusChange(@Nullable Device device, int status) {
        HMLog.info(d, new g(device, status));
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onDeviceUnBind(@NotNull HMBaseDevice device) {
        HMLog.info(d, new h(device));
        d(a().getMiliDevice());
    }
}
