package com.xiaomi.hm.health.homepage.manager.sync;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.event.EventAccountStatus;
import com.huami.device.core.sync.api.dto.ProgressDto;
import com.huami.device.core.sync.api.dto.WorkStatusDto;
import com.huami.device.core.sync.api.status.DeviceWorkStatus;
import com.huami.module.homepage.sync.status.AGPSUpgradedEvent;
import com.huami.module.homepage.sync.status.AGPSUpgradedFwEvent;
import com.huami.module.homepage.sync.status.AGPSUpgradingEvent;
import com.huami.module.homepage.sync.status.AccountStatusEvent;
import com.huami.module.homepage.sync.status.BatteryChangeEvent;
import com.huami.module.homepage.sync.status.BindSyncEvent;
import com.huami.module.homepage.sync.status.BluetoothEvent;
import com.huami.module.homepage.sync.status.ConnectFailSyncEvent;
import com.huami.module.homepage.sync.status.ConnectingSyncEvent;
import com.huami.module.homepage.sync.status.ErrorCode;
import com.huami.module.homepage.sync.status.MajorSyncErrorEvent;
import com.huami.module.homepage.sync.status.MajorSyncSuccessEvent;
import com.huami.module.homepage.sync.status.MajorSyncingEvent;
import com.huami.module.homepage.sync.status.SyncEvent;
import com.huami.moving.webapi.ConfigAPI;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.device.DeviceGpsHelper;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceFreeTask;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.event.HMDeviceBatteryEvent;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.event.HMDeviceFwUpgradeEvent;
import com.xiaomi.hm.health.device.event.HMDeviceSyncDataEvent;
import com.xiaomi.hm.health.device.event.HMDeviceSyncGpsDataEvent;
import com.xiaomi.hm.health.device.event.HMNeverReminderEvent;
import com.xiaomi.hm.health.device.feature.sync.SyncCenterManager;
import com.xiaomi.hm.health.device.feature.sync.SyncStatusListener;
import com.xiaomi.hm.health.eventbus.EventBluetooth;
import com.xiaomi.hm.health.locweather.LocWeatherManager;
import com.xiaomi.hm.health.mainpage.LBEResultAnalytics;
import com.xiaomi.hm.health.notification.AppNotification;
import com.xmlywind.sdk.common.mta.PointCategory;
import de.greenrobot.event.EventBus;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0002#\u001dB\u0007¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0010J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0011J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0012J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0017J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0018J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0019J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u001aJ\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u001bJ\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u001cR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u0006*\u00020\u001f8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010 ¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/homepage/manager/sync/DeviceEventListener;", "Lcom/xiaomi/hm/health/device/feature/sync/SyncStatusListener;", "", GoogleApiAvailabilityLight.a, "Lcom/huami/module/homepage/sync/status/SyncEvent;", "syncEvent", "", "isPrimaryDevice", "b", "Lcom/xiaomi/hm/health/homepage/manager/sync/DeviceSyncManagerImpl;", "deviceSyncManagerImpl", PointCategory.INIT, "release", "Lcom/xiaomi/hm/health/device/event/HMDeviceBindEvent;", "event", "onEventMainThread", "Lcom/xiaomi/hm/health/device/event/HMDeviceConnectionEvent;", "Lcom/xiaomi/hm/health/device/event/HMDeviceSyncDataEvent;", "Lcom/xiaomi/hm/health/device/event/HMDeviceBatteryEvent;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "syncStatus", "onSyncEventOut", "Lcom/xiaomi/hm/health/device/event/HMDeviceSyncGpsDataEvent;", "Lcom/xiaomi/hm/health/device/event/HMDeviceFwUpgradeEvent;", "Lcom/xiaomi/hm/health/device/event/HMNeverReminderEvent;", "Lcom/huami/account/event/EventAccountStatus;", "Lcom/xiaomi/hm/health/eventbus/EventBluetooth;", "a", "Lcom/xiaomi/hm/health/homepage/manager/sync/DeviceSyncManagerImpl;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceType;)Z", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceEventListener implements SyncStatusListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private DeviceSyncManagerImpl deviceSyncManagerImpl;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/homepage/manager/sync/DeviceEventListener$Companion;", "", "Lcom/xiaomi/hm/health/homepage/manager/sync/DeviceEventListener;", "getInstance", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final DeviceEventListener getInstance() {
            return a.a.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DeviceWorkStatus.values().length];
            iArr[DeviceWorkStatus.RUNNING.ordinal()] = 1;
            iArr[DeviceWorkStatus.NORMAL.ordinal()] = 2;
            iArr[DeviceWorkStatus.EXCEPTION.ordinal()] = 3;
            iArr[DeviceWorkStatus.INTERVAL.ordinal()] = 4;
            iArr[DeviceWorkStatus.FINISHED.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HMFirmwareType.values().length];
            iArr2[HMFirmwareType.FIRMWARE_GPS_CEP.ordinal()] = 1;
            iArr2[HMFirmwareType.FIRMWARE_GPS.ordinal()] = 2;
            iArr2[HMFirmwareType.FIRMWARE.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"com/xiaomi/hm/health/homepage/manager/sync/DeviceEventListener$a", "", "Lcom/xiaomi/hm/health/homepage/manager/sync/DeviceEventListener;", "b", "Lcom/xiaomi/hm/health/homepage/manager/sync/DeviceEventListener;", "a", "()Lcom/xiaomi/hm/health/homepage/manager/sync/DeviceEventListener;", "holder", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        @NotNull
        public static final a a = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private static final DeviceEventListener holder = new DeviceEventListener();

        private a() {
        }

        @NotNull
        public final DeviceEventListener a() {
            return holder;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "DeviceEventListener---> GPS固件升级成功,清除GPS状态";
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
            return "DeviceEventListener---> 固件升级成功,清除GPS状态";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ HMNeverReminderEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HMNeverReminderEvent hMNeverReminderEvent) {
            super(0);
            this.a = hMNeverReminderEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "固件升级处于不再提醒状态，same:" + this.a.getSame() + ", status:" + this.a.getStatus();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceBindEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(HMDeviceBindEvent hMDeviceBindEvent) {
            super(0);
            this.a = hMDeviceBindEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "DeviceEventListener---> bind event:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceConnectionEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(HMDeviceConnectionEvent hMDeviceConnectionEvent) {
            super(0);
            this.a = hMDeviceConnectionEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "DeviceEventListener---> device connect event:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceType a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(HMDeviceType hMDeviceType) {
            super(0);
            this.a = hMDeviceType;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "DeviceEventListener---> " + this.a + " 连接成功";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceSyncDataEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(HMDeviceSyncDataEvent hMDeviceSyncDataEvent) {
            super(0);
            this.a = hMDeviceSyncDataEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            HMDeviceSyncDataEvent hMDeviceSyncDataEvent = this.a;
            return "DeviceEventListener---> device syncing data:" + ((Object) ("HMDeviceSyncDataEvent{deviceType=" + hMDeviceSyncDataEvent.getDeviceType() + ", mSyncEvent=" + hMDeviceSyncDataEvent.getSyncEvent() + ", mProgress=" + hMDeviceSyncDataEvent.getProgress() + ", mResult=" + hMDeviceSyncDataEvent.getResult() + com.alipay.sdk.m.u.i.d));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "DeviceEventListener---> checkFwAndFree:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceType a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(HMDeviceType hMDeviceType) {
            super(0);
            this.a = hMDeviceType;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "DeviceEventListener---> " + this.a + " device battery change.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceSyncGpsDataEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(HMDeviceSyncGpsDataEvent hMDeviceSyncGpsDataEvent) {
            super(0);
            this.a = hMDeviceSyncGpsDataEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "DeviceEventListener---> 正在同步运动数据：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceFwUpgradeEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(HMDeviceFwUpgradeEvent hMDeviceFwUpgradeEvent) {
            super(0);
            this.a = hMDeviceFwUpgradeEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "DeviceEventListener---> device fw update:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ WorkStatusDto a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(WorkStatusDto workStatusDto) {
            super(0);
            this.a = workStatusDto;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "DeviceEventListener---> device syncing data: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "DeviceEventListener---> checkFwAndFree:" + this.a;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.homepage.manager.sync.DeviceEventListener$onEventMainThread$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.homepage.manager.sync.DeviceEventListener$onEventMainThread$2", f = "DeviceEventListener.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMDeviceBindEvent c;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.homepage.manager.sync.DeviceEventListener$onEventMainThread$2$WhenMappings */
        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HMDeviceType.values().length];
                iArr[HMDeviceType.WEIGHT.ordinal()] = 1;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HMDeviceBindEvent hMDeviceBindEvent, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.c = hMDeviceBindEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceEventListener.this.new AnonymousClass2(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.a = 1;
                if (DelayKt.delay(500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            DeviceSyncManagerImpl deviceSyncManagerImpl = DeviceEventListener.this.deviceSyncManagerImpl;
            Objects.requireNonNull(deviceSyncManagerImpl);
            deviceSyncManagerImpl.updatePrimaryDeviceType();
            DeviceSyncManagerImpl deviceSyncManagerImpl2 = DeviceEventListener.this.deviceSyncManagerImpl;
            Objects.requireNonNull(deviceSyncManagerImpl2);
            if (deviceSyncManagerImpl2.getPrimaryDeviceType() != HMDeviceType.VDevice && this.c.isBound()) {
                HMDeviceFreeTask.DeviceConfig deviceConfig = HMDeviceFreeTask.getDeviceConfig();
                deviceConfig.resetDisplayDataCode();
                HMDeviceFreeTask.saveDeviceConfig(deviceConfig);
                HMDeviceType deviceType = this.c.getDeviceType();
                int i2 = deviceType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[deviceType.ordinal()];
                DeviceSyncManagerImpl deviceSyncManagerImpl3 = DeviceEventListener.this.deviceSyncManagerImpl;
                Objects.requireNonNull(deviceSyncManagerImpl3);
                if (deviceType == deviceSyncManagerImpl3.getPrimaryDeviceType()) {
                    DeviceSyncManagerImpl deviceSyncManagerImpl4 = DeviceEventListener.this.deviceSyncManagerImpl;
                    Objects.requireNonNull(deviceSyncManagerImpl4);
                    deviceSyncManagerImpl4.startSyncDeviceData();
                } else if (i2 == 1) {
                    DeviceSyncManagerImpl deviceSyncManagerImpl5 = DeviceEventListener.this.deviceSyncManagerImpl;
                    Objects.requireNonNull(deviceSyncManagerImpl5);
                    deviceSyncManagerImpl5.syncData(this.c.getDeviceType());
                } else {
                    DeviceSyncManagerImpl deviceSyncManagerImpl6 = DeviceEventListener.this.deviceSyncManagerImpl;
                    Objects.requireNonNull(deviceSyncManagerImpl6);
                    deviceSyncManagerImpl6.checkFwUpgrade(this.c.getDeviceType());
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final boolean a(HMDeviceType hMDeviceType) {
        DeviceSyncManagerImpl deviceSyncManagerImpl = this.deviceSyncManagerImpl;
        Objects.requireNonNull(deviceSyncManagerImpl);
        return deviceSyncManagerImpl.isPrimaryDevice(hMDeviceType);
    }

    private final void b(SyncEvent syncEvent, boolean isPrimaryDevice) {
        if (isPrimaryDevice) {
            DeviceSyncManagerImpl deviceSyncManagerImpl = this.deviceSyncManagerImpl;
            Objects.requireNonNull(deviceSyncManagerImpl);
            deviceSyncManagerImpl.notify(syncEvent);
        }
    }

    public static /* synthetic */ void c(DeviceEventListener deviceEventListener, SyncEvent syncEvent, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        deviceEventListener.b(syncEvent, z);
    }

    private final void d() {
        if (EventBus.getDefault().isRegistered(this)) {
            return;
        }
        EventBus.getDefault().register(this);
    }

    @JvmStatic
    @NotNull
    public static final DeviceEventListener getInstance() {
        return INSTANCE.getInstance();
    }

    public final void init(@NotNull DeviceSyncManagerImpl deviceSyncManagerImpl) {
        this.deviceSyncManagerImpl = deviceSyncManagerImpl;
        SyncCenterManager.INSTANCE.setSyncDataEventListener(this);
        d();
    }

    public final void onEventMainThread(@NotNull HMDeviceBindEvent event) {
        HMLog.info("HomePage", new e(event));
        b(new BindSyncEvent(event.getDeviceType(), event.isBound()), a(event.getDeviceType()));
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, null, null, new AnonymousClass2(event, null), 3, null);
    }

    @Override // com.xiaomi.hm.health.device.feature.sync.SyncStatusListener
    @WorkerThread
    public void onSyncEventOut(@Nullable HMBaseDevice device, @NotNull WorkStatusDto syncStatus) {
        HMDeviceType deviceType = device == null ? null : device.getDeviceType();
        if (deviceType == null) {
            deviceType = HMDeviceType.VDevice;
        }
        HMLog.info("HomePage", new m(syncStatus));
        if (!a(deviceType)) {
            if (syncStatus.getWorkStatus() == DeviceWorkStatus.FINISHED) {
                DeviceSyncManagerImpl deviceSyncManagerImpl = this.deviceSyncManagerImpl;
                Objects.requireNonNull(deviceSyncManagerImpl);
                if (deviceSyncManagerImpl.needSyncGpsData$app_midongPlayRelease(deviceType)) {
                    return;
                }
                DeviceSyncManagerImpl deviceSyncManagerImpl2 = this.deviceSyncManagerImpl;
                Objects.requireNonNull(deviceSyncManagerImpl2);
                deviceSyncManagerImpl2.checkFwAndFree(deviceType);
                return;
            }
            return;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[syncStatus.getWorkStatus().ordinal()];
        if (i2 == 1) {
            ProgressDto progress = syncStatus.getProgress();
            if (progress == null) {
                return;
            }
            c(this, new MajorSyncingEvent(progress.getProgress()), false, 2, null);
            return;
        }
        if (i2 == 3) {
            DeviceSyncManagerImpl deviceSyncManagerImpl3 = this.deviceSyncManagerImpl;
            Objects.requireNonNull(deviceSyncManagerImpl3);
            c(this, new MajorSyncErrorEvent(deviceSyncManagerImpl3.handleErrorCode(syncStatus.getErrorCode())), false, 2, null);
            return;
        }
        if (i2 == 4) {
            c(this, new MajorSyncSuccessEvent(false), false, 2, null);
            return;
        }
        if (i2 != 5) {
            return;
        }
        DeviceSyncManagerImpl deviceSyncManagerImpl4 = this.deviceSyncManagerImpl;
        Objects.requireNonNull(deviceSyncManagerImpl4);
        if (deviceSyncManagerImpl4.needSyncGpsData$app_midongPlayRelease(deviceType)) {
            c(this, new MajorSyncingEvent(100), false, 2, null);
            return;
        }
        DeviceSyncManagerImpl deviceSyncManagerImpl5 = this.deviceSyncManagerImpl;
        Objects.requireNonNull(deviceSyncManagerImpl5);
        boolean zCheckFwAndFree = deviceSyncManagerImpl5.checkFwAndFree(deviceType);
        HMLog.info("HomePage", new n(zCheckFwAndFree));
        Unit unit = Unit.INSTANCE;
        c(this, new MajorSyncSuccessEvent(zCheckFwAndFree), false, 2, null);
    }

    public final void release() {
        SyncCenterManager.INSTANCE.setSyncDataEventListener(null);
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
    }

    public final void onEventMainThread(@NotNull HMDeviceConnectionEvent event) {
        HMDeviceType deviceType = event.getDeviceType();
        if (a(deviceType)) {
            HMLog.info("HomePage", new f(event));
        }
        if (event.isConnected()) {
            HMLog.info("HomePage", new g(deviceType));
            DeviceSyncManagerImpl deviceSyncManagerImpl = this.deviceSyncManagerImpl;
            Objects.requireNonNull(deviceSyncManagerImpl);
            deviceSyncManagerImpl.deviceConnectedExactly(deviceType);
            return;
        }
        if (event.isConnecting()) {
            DeviceSyncManagerImpl deviceSyncManagerImpl2 = this.deviceSyncManagerImpl;
            Objects.requireNonNull(deviceSyncManagerImpl2);
            if (deviceSyncManagerImpl2.bluetoothEnable()) {
                DeviceSyncManagerImpl deviceSyncManagerImpl3 = this.deviceSyncManagerImpl;
                Objects.requireNonNull(deviceSyncManagerImpl3);
                if (deviceSyncManagerImpl3.hasBluetoothPermission()) {
                    b(new ConnectingSyncEvent(deviceType), a(deviceType));
                    return;
                } else {
                    c(this, new ConnectFailSyncEvent(deviceType, ErrorCode.ERROR_NO_BLUETOOTH), false, 2, null);
                    return;
                }
            }
            c(this, new ConnectFailSyncEvent(deviceType, ErrorCode.TYPE_BLUETOOTH_OFF), false, 2, null);
            return;
        }
        if (event.isConnectingTimeout()) {
            b(new ConnectFailSyncEvent(deviceType, ErrorCode.TYPE_CONNECT_TIMEOUT), a(deviceType));
        }
    }

    public final void onEventMainThread(@NotNull HMDeviceSyncDataEvent event) {
        HMLog.info("HomePage", new h(event));
        HMDeviceType deviceType = event.getDeviceType();
        if (deviceType == HMDeviceType.HEADSET || deviceType == HMDeviceType.SHOES || deviceType == HMDeviceType.WEIGHT || deviceType == HMDeviceType.SENSORHUB || deviceType == HMDeviceType.MILI) {
            return;
        }
        if (a(deviceType)) {
            if (!event.isStop()) {
                c(this, new MajorSyncingEvent(event.getProgress().getPercent()), false, 2, null);
                return;
            }
            if (event.getResult()) {
                DeviceSyncManagerImpl deviceSyncManagerImpl = this.deviceSyncManagerImpl;
                Objects.requireNonNull(deviceSyncManagerImpl);
                if (deviceSyncManagerImpl.needSyncGpsData$app_midongPlayRelease(deviceType)) {
                    c(this, new MajorSyncingEvent(100), false, 2, null);
                    return;
                }
                DeviceSyncManagerImpl deviceSyncManagerImpl2 = this.deviceSyncManagerImpl;
                Objects.requireNonNull(deviceSyncManagerImpl2);
                boolean zCheckFwAndFree = deviceSyncManagerImpl2.checkFwAndFree(deviceType);
                HMLog.info("HomePage", new i(zCheckFwAndFree));
                Unit unit = Unit.INSTANCE;
                c(this, new MajorSyncSuccessEvent(zCheckFwAndFree), false, 2, null);
                return;
            }
            DeviceSyncManagerImpl deviceSyncManagerImpl3 = this.deviceSyncManagerImpl;
            Objects.requireNonNull(deviceSyncManagerImpl3);
            c(this, new MajorSyncErrorEvent(deviceSyncManagerImpl3.handleErrorCode(event.getError())), false, 2, null);
            return;
        }
        if (event.isStop() && event.getResult()) {
            DeviceSyncManagerImpl deviceSyncManagerImpl4 = this.deviceSyncManagerImpl;
            Objects.requireNonNull(deviceSyncManagerImpl4);
            if (deviceSyncManagerImpl4.needSyncGpsData$app_midongPlayRelease(deviceType)) {
                return;
            }
            DeviceSyncManagerImpl deviceSyncManagerImpl5 = this.deviceSyncManagerImpl;
            Objects.requireNonNull(deviceSyncManagerImpl5);
            deviceSyncManagerImpl5.checkFwAndFree(deviceType);
        }
    }

    public final void onEventMainThread(@NotNull HMDeviceBatteryEvent event) {
        HMDeviceType deviceType = event.getDeviceType();
        HMLog.info("HomePage", new j(deviceType));
        BatteryInfo batteryInfo = event.getBatteryInfo();
        if (deviceType == HMDeviceType.MILI) {
            if (batteryInfo.isCharging()) {
                AppNotification.newInstance().cancelBatteryLowNotification();
            } else if (batteryInfo.isChargeFull()) {
                AppNotification.newInstance().cancelBatteryLowNotification();
                AppNotification.newInstance().onBatteryFullNotification(!HMDeviceConfig.hasBoundWatch());
            } else if (batteryInfo.getLevel() < 10) {
                AppNotification.newInstance().cancelBatteryLowNotification();
                AppNotification.newInstance().onBatteryLowNotification(batteryInfo.getLevel(), true ^ HMDeviceConfig.hasBoundWatch());
            }
        } else if (deviceType == HMDeviceType.SHOES && HMDeviceManager.getInstance().getBoundDeviceSource(deviceType) == HMDeviceSource.SHOES_MARS) {
            int level = batteryInfo.getLevel();
            if (level >= 0 && level <= 9) {
                AppNotification.newInstance().onNormandyBatteryLowNotification();
            } else {
                AppNotification.newInstance().cancelNormandyBatteryLowNotification();
            }
        }
        b(new BatteryChangeEvent(event.getDeviceType(), event.getBatteryInfo().getLevel()), a(deviceType));
    }

    public final void onEventMainThread(@NotNull HMDeviceSyncGpsDataEvent event) {
        HMLog.info("HomePage", new k(event));
        HMDeviceType deviceType = event.getDeviceType();
        if (a(deviceType) && event.isStop()) {
            DeviceSyncManagerImpl deviceSyncManagerImpl = this.deviceSyncManagerImpl;
            Objects.requireNonNull(deviceSyncManagerImpl);
            c(this, new MajorSyncSuccessEvent(deviceSyncManagerImpl.checkFwAndFree(deviceType)), false, 2, null);
        }
    }

    public final void onEventMainThread(@NotNull HMDeviceFwUpgradeEvent event) {
        HMLog.info("HomePage", new l(event));
        HMFirmwareType firmwareType = event.getFirmwareType();
        int i2 = firmwareType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[firmwareType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3 && event.isStop() && event.getResult()) {
                    HMLog.info("HomePage", c.a);
                    DeviceGpsHelper.Companion.INSTANCE.clearLastLocSendToDevice();
                    LocWeatherManager.getInstance().requestLocationOnly();
                }
            } else if (event.isStop() && event.getResult()) {
                HMLog.info("HomePage", b.a);
                b(AGPSUpgradedFwEvent.INSTANCE, a(event.getDeviceType()));
                DeviceGpsHelper.Companion.INSTANCE.clearLastLocSendToDevice();
                LocWeatherManager.getInstance().requestLocationOnly();
            }
        } else if (event.isStop()) {
            AGPSUpgradedEvent aGPSUpgradedEvent = new AGPSUpgradedEvent(event.getResult(), event.getDeviceType());
            b(aGPSUpgradedEvent, a(event.getDeviceType()));
            LBEResultAnalytics.INSTANCE.onAGpsUpgradedEvent(aGPSUpgradedEvent);
        } else {
            b(new AGPSUpgradingEvent(event.getProgress().getPercent()), a(event.getDeviceType()));
        }
        if (event.isStop() && event.getResult() && firmwareType != HMFirmwareType.FIRMWARE) {
            DeviceSyncManagerImpl deviceSyncManagerImpl = this.deviceSyncManagerImpl;
            Objects.requireNonNull(deviceSyncManagerImpl);
            deviceSyncManagerImpl.checkFwAndFree(event.getDeviceType());
        }
    }

    public final void onEventMainThread(@NotNull HMNeverReminderEvent event) {
        HMLog.info("HomePage", new d(event));
        c(this, new AGPSUpgradedEvent(true, null, 2, null), false, 2, null);
    }

    public final void onEventMainThread(@NotNull EventAccountStatus event) {
        if (event.getStatus() == 1) {
            DeviceSyncManagerImpl deviceSyncManagerImpl = this.deviceSyncManagerImpl;
            Objects.requireNonNull(deviceSyncManagerImpl);
            deviceSyncManagerImpl.updatePrimaryDeviceType();
        } else if (event.getStatus() == 2) {
            ConfigAPI.requestRunConfig();
            DeviceSyncManagerImpl deviceSyncManagerImpl2 = this.deviceSyncManagerImpl;
            Objects.requireNonNull(deviceSyncManagerImpl2);
            deviceSyncManagerImpl2.updatePrimaryDeviceType();
        }
        c(this, new AccountStatusEvent(event.getStatus()), false, 2, null);
    }

    public final void onEventMainThread(@NotNull EventBluetooth event) {
        c(this, new BluetoothEvent(event.isOn), false, 2, null);
    }
}
