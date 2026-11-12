package com.xiaomi.hm.health.device.feature.sync;

import android.annotation.SuppressLint;
import android.widget.Toast;
import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.core.sync.SyncCenterFactory;
import com.huami.device.core.sync.api.SyncApi;
import com.huami.device.core.sync.api.dto.WorkStatusDto;
import com.huami.device.core.sync.api.exception.NotSupportException;
import com.huami.device.core.sync.api.status.DeviceWorkStatus;
import com.huami.device.core.sync.impl.sync.hub.HmSensorHubDevice;
import com.huami.devicex.DeviceXBuilder;
import com.huami.devicex.R;
import com.huami.devicex.injection.keeper.DeviceTimeStoreApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.koinstartup.KoinComponentAdapter;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HMBaseBleDevice;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.device.agps.HMAgpsUpgradeManager;
import com.xiaomi.hm.health.device.event.HMDeviceSyncDataEvent;
import com.xiaomi.hm.health.device.feature.sync.analytic.SpeedRateAnalytic;
import com.xiaomi.hm.health.device.feature.sync.strategy.JobLoaderFilter;
import com.xiaomi.hm.health.device.feature.sync.strategy.MockProgress;
import com.xiaomi.hm.health.device.feature.sync.strategy.MockProgressApi;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import de.greenrobot.event.EventBus;
import java.io.File;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.DelicateCoroutinesApi;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.d;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bO\u0010PJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J#\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0015\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002J\u000e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0002J\u0010\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\fJ\u0006\u0010\u001d\u001a\u00020\u000eJ\u000e\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0002J\u0018\u0010\u001f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u000e\u0010 \u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fJ\u001c\u0010#\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070!R\u0016\u0010$\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020.0-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R$\u00102\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001d\u0010=\u001a\u0002088B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001d\u0010B\u001a\u00020>8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\"\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u00100R$\u0010H\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bN\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Q"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/SyncCenterManager;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", GoogleApiAvailabilityLight.a, "", "lastSyncTime", "device", "", "prepareTransferService", "", "name", "prepareReport", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "", "isBackground", "syncData", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceType;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "total", "current", "dispatchProgress", "Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "workStatus", "dispatcherStatus", "convertTypeToDevice", "isShowSyncEventProgress", "isSyncing", "hmDeviceType", "isUsingSyncCenter", "waiteForSyncDone", "start", "startSynchronized", "Lkotlin/Function0;", UserDataStore.FIRST_NAME, "invokeWhenNotSync", "tag", "Ljava/lang/String;", "halfHourMs", "J", "isInit", "Z", "Lcom/huami/device/core/sync/impl/sync/hub/HmSensorHubDevice;", "hmSensorHubDevice", "Lcom/huami/device/core/sync/impl/sync/hub/HmSensorHubDevice;", "Ljava/util/WeakHashMap;", "Lcom/xiaomi/hm/health/device/feature/sync/analytic/SpeedRateAnalytic;", "speedRateAnalyticMap", "Ljava/util/WeakHashMap;", "Lcom/xiaomi/hm/health/device/feature/sync/SyncStatusListener;", "syncDataEventListener", "Lcom/xiaomi/hm/health/device/feature/sync/SyncStatusListener;", "getSyncDataEventListener", "()Lcom/xiaomi/hm/health/device/feature/sync/SyncStatusListener;", "setSyncDataEventListener", "(Lcom/xiaomi/hm/health/device/feature/sync/SyncStatusListener;)V", "Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi$delegate", "Lkotlin/Lazy;", "getDeviceManagerApi", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/huami/devicex/injection/keeper/DeviceTimeStoreApi;", "deviceTimeStore$delegate", "getDeviceTimeStore", "()Lcom/huami/devicex/injection/keeper/DeviceTimeStoreApi;", "deviceTimeStore", "Lcom/xiaomi/hm/health/device/feature/sync/strategy/MockProgressApi;", "mockApi", "Lcom/xiaomi/hm/health/device/feature/sync/strategy/MockProgressApi;", "lastSyncTimeMap", "Lcom/xiaomi/hm/health/device/feature/sync/strategy/JobLoaderFilter;", "jobLoaderFilter", "Lcom/xiaomi/hm/health/device/feature/sync/strategy/JobLoaderFilter;", "getJobLoaderFilter", "()Lcom/xiaomi/hm/health/device/feature/sync/strategy/JobLoaderFilter;", "setJobLoaderFilter", "(Lcom/xiaomi/hm/health/device/feature/sync/strategy/JobLoaderFilter;)V", "waiteTimeOut", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class SyncCenterManager implements KoinComponentAdapter {

    @NotNull
    public static final SyncCenterManager INSTANCE;

    /* JADX INFO: renamed from: deviceManagerApi$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: deviceTimeStore$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy deviceTimeStore;
    private static final long halfHourMs = 1800000;

    @SuppressLint({"StaticFieldLeak"})
    private static HmSensorHubDevice hmSensorHubDevice = null;
    private static boolean isInit = false;

    @Nullable
    private static JobLoaderFilter jobLoaderFilter = null;

    @NotNull
    private static final WeakHashMap<HMBaseDevice, Long> lastSyncTimeMap;

    @NotNull
    private static final MockProgressApi mockApi;

    @NotNull
    private static final WeakHashMap<HMBaseDevice, SpeedRateAnalytic> speedRateAnalyticMap;

    @Nullable
    private static SyncStatusListener syncDataEventListener = null;

    @NotNull
    private static final String tag = "SyncCenterManager";
    private static final long waiteTimeOut = 30000;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceType.values().length];
            iArr[HMDeviceType.SHOES.ordinal()] = 1;
            iArr[HMDeviceType.WEIGHT.ordinal()] = 2;
            iArr[HMDeviceType.SENSORHUB.ordinal()] = 3;
            iArr[HMDeviceType.MILI.ordinal()] = 4;
            iArr[HMDeviceType.VDevice.ordinal()] = 5;
            iArr[HMDeviceType.HEADSET.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.feature.sync.SyncCenterManager$start$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.feature.sync.SyncCenterManager$start$1", f = "SyncCenterManager.kt", i = {}, l = {202}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ boolean $isBackground;
        public final /* synthetic */ HMDeviceType $type;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.feature.sync.SyncCenterManager$start$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.feature.sync.SyncCenterManager$start$1$1", f = "SyncCenterManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C08101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ HMBaseDevice $d;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08101(HMBaseDevice hMBaseDevice, Continuation<? super C08101> continuation) {
                super(2, continuation);
                this.$d = hMBaseDevice;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C08101(this.$d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C08101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                a.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HMAgpsUpgradeManager.updateAGpsDto(this.$d);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15821(HMDeviceType hMDeviceType, boolean z, Continuation<? super C15821> continuation) {
            super(2, continuation);
            this.$type = hMDeviceType;
            this.$isBackground = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C15821 c15821 = new C15821(this.$type, this.$isBackground, continuation);
            c15821.L$0 = obj;
            return c15821;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C15821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Exception {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                SyncCenterManager syncCenterManager = SyncCenterManager.INSTANCE;
                final HMBaseDevice hMBaseDeviceConvertTypeToDevice = syncCenterManager.convertTypeToDevice(this.$type);
                e.f(coroutineScope, null, null, new C08101(hMBaseDeviceConvertTypeToDevice, null), 3, null);
                if (!hMBaseDeviceConvertTypeToDevice.isConnected()) {
                    final HMDeviceType hMDeviceType = this.$type;
                    HMLog.info(SyncCenterManager.tag, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.SyncCenterManager.start.1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            DeviceInfo deviceInfo = hMBaseDeviceConvertTypeToDevice.getDeviceInfo();
                            return "设备未连接 - " + (deviceInfo == null ? null : deviceInfo.getDeviceID()) + " - " + hMDeviceType;
                        }
                    });
                    SyncCenterManager.speedRateAnalyticMap.remove(hMBaseDeviceConvertTypeToDevice);
                    return Unit.INSTANCE;
                }
                if (syncCenterManager.isSyncing(hMBaseDeviceConvertTypeToDevice)) {
                    SyncStatusListener syncDataEventListener = syncCenterManager.getSyncDataEventListener();
                    if (syncDataEventListener != null) {
                        syncDataEventListener.onSyncEventOut(hMBaseDeviceConvertTypeToDevice, new WorkStatusDto(String.valueOf(this.$type), DeviceWorkStatus.RUNNING, null, 0, 12, null));
                    }
                    HMLog.info(SyncCenterManager.tag, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.SyncCenterManager.start.1.3
                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            return "同步中心正在同步";
                        }
                    });
                    return Unit.INSTANCE;
                }
                if (hMBaseDeviceConvertTypeToDevice.isSyncingData()) {
                    HMLog.info(SyncCenterManager.tag, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.SyncCenterManager.start.1.4
                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            return "设备正忙，处理其它蓝牙任务";
                        }
                    });
                    return Unit.INSTANCE;
                }
                syncCenterManager.prepareReport(hMBaseDeviceConvertTypeToDevice.getMDeviceSource().name());
                syncCenterManager.prepareTransferService(hMBaseDeviceConvertTypeToDevice);
                HMDeviceType hMDeviceType2 = this.$type;
                boolean z = this.$isBackground;
                this.label = 1;
                if (syncCenterManager.syncData(hMDeviceType2, z, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.feature.sync.SyncCenterManager$startSynchronized$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.feature.sync.SyncCenterManager$startSynchronized$2", f = "SyncCenterManager.kt", i = {0}, l = {249}, m = "invokeSuspend", n = {"isSuccess"}, s = {"L$0"})
    public static final class C15842 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public final /* synthetic */ HMBaseDevice $device;
        public Object L$0;
        public int label;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.feature.sync.SyncCenterManager$startSynchronized$2$1, reason: invalid class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.feature.sync.SyncCenterManager$startSynchronized$2$1", f = "SyncCenterManager.kt", i = {}, l = {251}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ HMBaseDevice $device;
            public final /* synthetic */ Ref.BooleanRef $isSuccess;
            public Object L$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HMBaseDevice hMBaseDevice, Ref.BooleanRef booleanRef, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$device = hMBaseDevice;
                this.$isSuccess = booleanRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$device, this.$isSuccess, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0040 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:12:0x0041  */
            /* JADX WARN: Code duplicated, block: B:15:0x004e  */
            /* JADX WARN: Code duplicated, block: B:17:0x0066  */
            /* JADX WARN: Code duplicated, block: B:18:0x006b  */
            /* JADX WARN: Code duplicated, block: B:20:0x0073  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0041 -> B:13:0x0046). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r8.label
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L1f
                    if (r1 != r3) goto L17
                    java.lang.Object r1 = r8.L$0
                    kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                    kotlin.ResultKt.throwOnFailure(r9)
                    r4 = r1
                    r1 = r0
                    r0 = r8
                    goto L46
                L17:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L1f:
                    kotlin.ResultKt.throwOnFailure(r9)
                    com.huami.device.core.sync.SyncCenterFactory r9 = com.huami.device.core.sync.SyncCenterFactory.INSTANCE
                    com.xiaomi.hm.health.bt.device.HMBaseDevice r1 = r8.$device
                    r4 = 2
                    r5 = 0
                    com.huami.device.core.sync.api.SyncApi r9 = com.huami.device.core.sync.SyncCenterFactory.getOrCreate$default(r9, r1, r2, r4, r5)
                    kotlinx.coroutines.channels.Channel r9 = r9.start()
                    kotlinx.coroutines.channels.ChannelIterator r9 = r9.iterator()
                    r1 = r9
                    r9 = r8
                L36:
                    r9.L$0 = r1
                    r9.label = r3
                    java.lang.Object r4 = r1.hasNext(r9)
                    if (r4 != r0) goto L41
                    return r0
                L41:
                    r7 = r0
                    r0 = r9
                    r9 = r4
                    r4 = r1
                    r1 = r7
                L46:
                    java.lang.Boolean r9 = (java.lang.Boolean) r9
                    boolean r9 = r9.booleanValue()
                    if (r9 == 0) goto L7b
                    java.lang.Object r9 = r4.next()
                    com.huami.device.core.sync.api.dto.WorkStatusDto r9 = (com.huami.device.core.sync.api.dto.WorkStatusDto) r9
                    com.xiaomi.hm.health.device.feature.sync.SyncCenterManager$startSynchronized$2$1$1 r5 = new com.xiaomi.hm.health.device.feature.sync.SyncCenterManager$startSynchronized$2$1$1
                    r5.<init>()
                    java.lang.String r6 = "SyncCenterManager"
                    com.huami.tools.log.HMLog.debug(r6, r5)
                    com.huami.device.core.sync.api.status.DeviceWorkStatus r5 = r9.getWorkStatus()
                    com.huami.device.core.sync.api.status.DeviceWorkStatus r6 = com.huami.device.core.sync.api.status.DeviceWorkStatus.EXCEPTION
                    if (r5 != r6) goto L6b
                    kotlin.jvm.internal.Ref$BooleanRef r9 = r0.$isSuccess
                    r9.element = r2
                    goto L77
                L6b:
                    com.huami.device.core.sync.api.status.DeviceWorkStatus r9 = r9.getWorkStatus()
                    com.huami.device.core.sync.api.status.DeviceWorkStatus r5 = com.huami.device.core.sync.api.status.DeviceWorkStatus.FINISHED
                    if (r9 != r5) goto L77
                    kotlin.jvm.internal.Ref$BooleanRef r9 = r0.$isSuccess
                    r9.element = r3
                L77:
                    r9 = r0
                    r0 = r1
                    r1 = r4
                    goto L36
                L7b:
                    kotlin.Unit r9 = kotlin.Unit.INSTANCE
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.hm.health.device.feature.sync.SyncCenterManager.C15842.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15842(HMBaseDevice hMBaseDevice, Continuation<? super C15842> continuation) {
            super(2, continuation);
            this.$device = hMBaseDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C15842(this.$device, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((C15842) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Exception exc;
            Ref.BooleanRef booleanRef;
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                try {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$device, booleanRef2, null);
                    this.L$0 = booleanRef2;
                    this.label = 1;
                    if (TimeoutKt.withTimeout(30000L, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanRef = booleanRef2;
                } catch (Exception e) {
                    exc = e;
                    booleanRef = booleanRef2;
                    HMLog.error$default(SyncCenterManager.tag, null, exc, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.SyncCenterManager.startSynchronized.2.2
                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            return "error of startSynchronized";
                        }
                    }, 2, null);
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef = (Ref.BooleanRef) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Exception e2) {
                    exc = e2;
                    HMLog.error$default(SyncCenterManager.tag, null, exc, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.SyncCenterManager.startSynchronized.2.2
                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            return "error of startSynchronized";
                        }
                    }, 2, null);
                }
            }
            return Boxing.boxBoolean(booleanRef.element);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.feature.sync.SyncCenterManager$syncData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.feature.sync.SyncCenterManager", f = "SyncCenterManager.kt", i = {2, 2, 2, 2}, l = {284, 291, TypedValues.AttributesType.TYPE_EASING, 339}, m = "syncData", n = {"device", "itemCount", "itemIndex", "isMajorType"}, s = {"L$4", "I$1", "I$2", "I$3"})
    public static final class C15851 extends ContinuationImpl {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C15851(Continuation<? super C15851> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SyncCenterManager.this.syncData(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.feature.sync.SyncCenterManager$waiteForSyncDone$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.feature.sync.SyncCenterManager$waiteForSyncDone$1", f = "SyncCenterManager.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public final /* synthetic */ HMBaseDevice $device;
        public int label;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.feature.sync.SyncCenterManager$waiteForSyncDone$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.feature.sync.SyncCenterManager$waiteForSyncDone$1$1", f = "SyncCenterManager.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
        public static final class C08131 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ SyncApi $api;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08131(SyncApi syncApi, Continuation<? super C08131> continuation) {
                super(2, continuation);
                this.$api = syncApi;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C08131(this.$api, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C08131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i != 0 && i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                while (this.$api.getCurrentStatus()) {
                    this.label = 1;
                    if (DelayKt.delay(300L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15871(HMBaseDevice hMBaseDevice, Continuation<? super C15871> continuation) {
            super(2, continuation);
            this.$device = hMBaseDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C15871(this.$device, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((C15871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C08131 c08131 = new C08131(SyncCenterFactory.getOrCreate$default(SyncCenterFactory.INSTANCE, this.$device, false, 2, null), null);
                    this.label = 1;
                    if (TimeoutKt.withTimeout(30000L, c08131, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e) {
                HMLog.error$default(SyncCenterManager.tag, null, e, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.SyncCenterManager.waiteForSyncDone.1.2
                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "error of waite for sync done";
                    }
                }, 2, null);
            }
            return Boxing.boxBoolean(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final SyncCenterManager syncCenterManager = new SyncCenterManager();
        INSTANCE = syncCenterManager;
        speedRateAnalyticMap = new WeakHashMap<>();
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.feature.sync.SyncCenterManager$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = syncCenterManager;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        deviceTimeStore = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceTimeStoreApi>() { // from class: com.xiaomi.hm.health.device.feature.sync.SyncCenterManager$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.keeper.DeviceTimeStoreApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceTimeStoreApi invoke() {
                KoinComponent koinComponent = syncCenterManager;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceTimeStoreApi.class), objArr2, objArr3);
            }
        });
        mockApi = new MockProgress(new SyncCenterManager$mockApi$1(syncCenterManager), new SyncCenterManager$mockApi$2(syncCenterManager));
        lastSyncTimeMap = new WeakHashMap<>();
        SyncCenterFactory.INSTANCE.setSyncStrategy(new HMSyncStrategy());
        HMLog.info(tag, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.SyncCenterManager.1
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "初始化:initOnce: syncStrategy 结果: " + SyncCenterFactory.INSTANCE.getSyncStrategy();
            }
        });
        hmSensorHubDevice = new HmSensorHubDevice(DeviceXBuilder.INSTANCE.getContext());
    }

    private SyncCenterManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMBaseDevice convertTypeToDevice(HMDeviceType type) throws Exception {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 6:
                HMBaseDevice device = getDeviceManagerApi().getDevice(type);
                if (device != null) {
                    return device;
                }
                throw new Exception("Error of device");
            case 3:
            case 5:
                HmSensorHubDevice hmSensorHubDevice2 = hmSensorHubDevice;
                Objects.requireNonNull(hmSensorHubDevice2);
                return hmSensorHubDevice2;
            default:
                throw new NotSupportException("not support " + type, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchProgress(final HMDeviceType type, final int total, final int current, HMBaseDevice device) {
        if ((device instanceof HMBaseBleDevice) && ((HMBaseBleDevice) device).isHuamiOs()) {
            EventBus eventBus = EventBus.getDefault();
            HMDeviceSyncDataEvent hMDeviceSyncDataEvent = new HMDeviceSyncDataEvent(type, 1, new Progress(100, 100));
            hMDeviceSyncDataEvent.setShowProgress(false);
            Unit unit = Unit.INSTANCE;
            eventBus.post(hMDeviceSyncDataEvent);
            return;
        }
        HMLog.debug$default(null, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.SyncCenterManager.dispatchProgress.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return type + " --> 传递同步状态 " + total + " --- " + current;
            }
        }, 1, null);
        EventBus eventBus2 = EventBus.getDefault();
        if (current > total) {
            current = total;
        }
        HMDeviceSyncDataEvent hMDeviceSyncDataEvent2 = new HMDeviceSyncDataEvent(type, 1, new Progress(total, current));
        hMDeviceSyncDataEvent2.setShowProgress(INSTANCE.isShowSyncEventProgress(type));
        Unit unit2 = Unit.INSTANCE;
        eventBus2.post(hMDeviceSyncDataEvent2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatcherStatus(HMBaseDevice device, final WorkStatusDto workStatus) {
        if (syncDataEventListener == null) {
            HMLog.warn$default(tag, null, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.SyncCenterManager.dispatcherStatus.1
                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "syncDataEventListener is null when dispatcherStatus.";
                }
            }, 2, null);
        }
        SyncStatusListener syncStatusListener = syncDataEventListener;
        if (syncStatusListener != null) {
            syncStatusListener.onSyncEventOut(device, workStatus);
        }
        HMLog.debug(tag, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.SyncCenterManager.dispatcherStatus.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return workStatus.getDeviceId() + " - " + workStatus.getWorkStatus() + " - " + workStatus.getProgress();
            }
        });
    }

    private final DeviceManagerApi getDeviceManagerApi() {
        return (DeviceManagerApi) deviceManagerApi.getValue();
    }

    private final DeviceTimeStoreApi getDeviceTimeStore() {
        return (DeviceTimeStoreApi) deviceTimeStore.getValue();
    }

    private final boolean isShowSyncEventProgress(HMDeviceType type) {
        return WhenMappings.$EnumSwitchMapping$0[type.ordinal()] != 6;
    }

    private final long lastSyncTime(HMBaseDevice d) {
        WeakHashMap<HMBaseDevice, Long> weakHashMap = lastSyncTimeMap;
        if (weakHashMap.get(d) == null) {
            weakHashMap.put(d, 0L);
        }
        Long l = weakHashMap.get(d);
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareReport(String name) {
        DeviceXBuilder deviceXBuilder = DeviceXBuilder.INSTANCE;
        if (deviceXBuilder.isDebug()) {
            SyncCenterFactory syncCenterFactory = SyncCenterFactory.INSTANCE;
            syncCenterFactory.set2ReportMode();
            File file = new File(deviceXBuilder.getContext().getFilesDir().getAbsoluteFile() + "/log/sync_report_" + name + ".csv");
            if (file.exists()) {
                return;
            }
            File file2 = new File(deviceXBuilder.getContext().getCacheDir().getAbsoluteFile() + "/report");
            if (!file2.exists()) {
                file2.mkdirs();
            }
            try {
                file.createNewFile();
                syncCenterFactory.setReportFilePath(file);
            } catch (Exception e) {
                HMLog.error$default(null, null, null, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.SyncCenterManager.prepareReport.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "prepare sync report error. " + e;
                    }
                }, 7, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareTransferService(HMBaseDevice device) {
        if (DeviceXBuilder.INSTANCE.isDebug()) {
            WeakHashMap<HMBaseDevice, SpeedRateAnalytic> weakHashMap = speedRateAnalyticMap;
            if (weakHashMap.get(device) == null) {
                weakHashMap.put(device, new SpeedRateAnalytic(device));
            }
            SyncCenterFactory.INSTANCE.setTransferRateService(weakHashMap.get(device));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:187:0x0418 -> B:408:0x03d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:188:0x0423 -> B:408:0x03d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:245:0x0531 -> B:246:0x0535). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 20791. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
        */
    public final java.lang.Object syncData(com.xiaomi.hm.health.bt.device.HMDeviceType r26, boolean r27, kotlin.coroutines.Continuation<? super kotlin.Unit> r28) {
        /*
            Method dump skipped, instruction units count: 2079
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.hm.health.device.feature.sync.SyncCenterManager.syncData(com.xiaomi.hm.health.bt.device.HMDeviceType, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public final JobLoaderFilter getJobLoaderFilter() {
        return jobLoaderFilter;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }

    @Nullable
    public final SyncStatusListener getSyncDataEventListener() {
        return syncDataEventListener;
    }

    public final void invokeWhenNotSync(@NotNull HMBaseDevice d, @NotNull Function0<Unit> fn) {
        if (!isSyncing(d)) {
            fn.invoke();
        } else if (GlobalConfig.get().isBuildMidong()) {
            Toast.makeText(DeviceXBuilder.INSTANCE.getContext(), R.string.wf_sync_other_data, 0).show();
        } else {
            Toast.makeText(DeviceXBuilder.INSTANCE.getContext(), R.string.pull_to_refresh_refreshing_label, 0).show();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, com.huami.device.core.sync.api.SyncApi] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.huami.device.core.sync.api.SyncApi] */
    public final boolean isSyncing(@NotNull final HMBaseDevice device) {
        try {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            SyncCenterFactory syncCenterFactory = SyncCenterFactory.INSTANCE;
            objectRef.element = SyncCenterFactory.getOrCreate$default(syncCenterFactory, device, false, 2, null);
            if (System.currentTimeMillis() - lastSyncTime(device) > 1800000 && ((SyncApi) objectRef.element).getCurrentStatus()) {
                HMLog.warn$default(tag, null, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.SyncCenterManager.isSyncing.1
                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "因同步时间超出预期，重启同步实例";
                    }
                }, 2, null);
                syncCenterFactory.cancel(device);
                objectRef.element = SyncCenterFactory.getOrCreate$default(syncCenterFactory, device, false, 2, null);
            }
            HMLog.info(tag, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.SyncCenterManager.isSyncing.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    String simpleName = objectRef.element.getClass().getSimpleName();
                    HMDeviceSource deviceSource = device.getMDeviceSource();
                    DeviceInfo deviceInfo = device.getDeviceInfo();
                    return "call is syncing -> " + simpleName + " - [" + deviceSource + "] - sn: [" + (deviceInfo == null ? null : deviceInfo.getSerialNumber()) + "] - running: " + objectRef.element.getCurrentStatus();
                }
            });
            return ((SyncApi) objectRef.element).getCurrentStatus();
        } catch (Exception e) {
            HMLog.error$default(tag, null, e, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.SyncCenterManager.isSyncing.3
                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "error on call is syncing?";
                }
            }, 2, null);
            return false;
        }
    }

    public final boolean isUsingSyncCenter(@Nullable HMDeviceType hmDeviceType) {
        if (hmDeviceType == HMDeviceType.HEADSET) {
            return true;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[getDeviceManagerApi().getMajorDeviceTypeNew().ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    public final void setJobLoaderFilter(@Nullable JobLoaderFilter jobLoaderFilter2) {
        jobLoaderFilter = jobLoaderFilter2;
    }

    public final void setSyncDataEventListener(@Nullable SyncStatusListener syncStatusListener) {
        syncDataEventListener = syncStatusListener;
    }

    @DelicateCoroutinesApi
    public final void start(@NotNull HMDeviceType type, boolean isBackground) {
        e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), Dispatchers.getIO().plus(ExtKt.getExceptionHandler()), null, new C15821(type, isBackground, null), 2, null);
    }

    public final boolean startSynchronized(@NotNull final HMDeviceType type) {
        HMLog.debug$default(null, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.SyncCenterManager.startSynchronized.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "正在串行同步方法同步设备数据 " + type;
            }
        }, 1, null);
        HMBaseDevice device = getDeviceManagerApi().getDevice(type);
        if (device == null) {
            return false;
        }
        return ((Boolean) BuildersKt.runBlocking(Dispatchers.getIO(), new C15842(device, null))).booleanValue();
    }

    public final boolean waiteForSyncDone(@NotNull HMBaseDevice device) {
        return ((Boolean) d.b(null, new C15871(device, null), 1, null)).booleanValue();
    }

    public final boolean isUsingSyncCenter() {
        return isUsingSyncCenter(null);
    }
}
