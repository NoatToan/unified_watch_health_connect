package com.xiaomi.hm.health.feedback;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.feedback.log.utils.LogFileUtilsKt;
import com.huami.feedback.sync.api.device.DeviceLogSyncApi;
import com.huami.feedback.sync.api.device.DeviceType;
import com.huami.feedback.sync.api.device.DevicesDataSource;
import com.huami.feedback.sync.api.device.FeedbackDevice;
import com.huami.feedback.sync.api.device.SyncLogResult;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.device.MozartDevice;
import com.xiaomi.hm.health.bt.profile.dfu.DfuState;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.HMGt2SystemUpgradeActivity;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.feature.sync.SyncCenterManager;
import com.xiaomi.hm.health.device.model.HMBrandType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010'\u001a\u00020%\u0012\u0006\u0010*\u001a\u00020(\u0012\b\b\u0002\u0010-\u001a\u00020+¢\u0006\u0004\b.\u0010/J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0011H\u0016J\u001b\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0016J\u001b\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0016J\u001b\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0014J\u001b\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0014J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0016\u0010-\u001a\u00020+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"Lcom/xiaomi/hm/health/feedback/DeviceDataSourceImpl;", "Lcom/huami/feedback/sync/api/device/DevicesDataSource;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "c", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/feedback/sync/api/device/DeviceType;", "deviceType", "Lcom/xiaomi/hm/health/databases/model/Device;", "device", "Lcom/huami/feedback/sync/api/device/FeedbackDevice;", "a", "", GoogleApiAvailabilityLight.a, "", "getActiveDevices", "hasFwUpgrade", "(Lcom/huami/feedback/sync/api/device/DeviceType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isConnected", "isFwUpgrading", "isMusicAlive", "isSupportSyncLog", "isSyncing", "isVoiceAssistantAlive", "", "startFwUpgrade", "", "rootDir", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/feedback/sync/api/device/SyncLogResult;", "syncLog", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/feedback/sync/api/device/DeviceLogSyncApi;", "Lcom/huami/feedback/sync/api/device/DeviceLogSyncApi;", "deviceLogSyncApi", "Lcom/huami/devicex/manager/DeviceManagerApi;", "Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "defaultDispatcher", "<init>", "(Landroid/content/Context;Lcom/huami/feedback/sync/api/device/DeviceLogSyncApi;Lcom/huami/devicex/manager/DeviceManagerApi;Lkotlinx/coroutines/CoroutineDispatcher;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceDataSourceImpl implements DevicesDataSource {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final DeviceLogSyncApi deviceLogSyncApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final DeviceManagerApi deviceManagerApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final CoroutineDispatcher defaultDispatcher;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeviceType.values().length];
            iArr[DeviceType.BAND.ordinal()] = 1;
            iArr[DeviceType.WATCH.ordinal()] = 2;
            iArr[DeviceType.HEAD_SET.ordinal()] = 3;
            iArr[DeviceType.EAR_BUD.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ DeviceType a;
        public final /* synthetic */ Throwable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DeviceType deviceType, Throwable th) {
            super(0);
            this.a = deviceType;
            this.b = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "判断设备是否连接时，使用DeviceManagerApi抛出异常。DeviceType：" + this.a.name() + ",异常信息:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.feedback.DeviceDataSourceImpl", f = "DeviceDataSourceImpl.kt", i = {}, l = {108}, m = "isFwUpgrading", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return DeviceDataSourceImpl.this.isFwUpgrading(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.feedback.DeviceDataSourceImpl", f = "DeviceDataSourceImpl.kt", i = {}, l = {120}, m = "isMusicAlive", n = {}, s = {})
    public static final class c extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return DeviceDataSourceImpl.this.isMusicAlive(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.feedback.DeviceDataSourceImpl$isSyncing$2", f = "DeviceDataSourceImpl.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ HMBaseDevice c;
        public final /* synthetic */ DeviceType d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.feedback.DeviceDataSourceImpl$isSyncing$2$1", f = "DeviceDataSourceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public int a;
            private /* synthetic */ Object b;
            public final /* synthetic */ HMBaseDevice c;
            public final /* synthetic */ DeviceType d;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.feedback.DeviceDataSourceImpl$d$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0954a extends Lambda implements Function0<String> {
                public final /* synthetic */ DeviceType a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0954a(DeviceType deviceType) {
                    super(0);
                    this.a = deviceType;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "检查设备是否正在同步数据发成错误：DeviceType：" + this.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HMBaseDevice hMBaseDevice, DeviceType deviceType, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = hMBaseDevice;
                this.d = deviceType;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = new a(this.c, this.d, continuation);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objM3845constructorimpl;
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HMBaseDevice hMBaseDevice = this.c;
                try {
                    Result.Companion companion = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(Boxing.boxBoolean(SyncCenterManager.INSTANCE.isSyncing(hMBaseDevice)));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
                DeviceType deviceType = this.d;
                if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
                    HMLog.warn$default("feedback", null, new C0954a(deviceType), 2, null);
                }
                return Result.m3850isFailureimpl(objM3845constructorimpl) ? Boxing.boxBoolean(false) : objM3845constructorimpl;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HMBaseDevice hMBaseDevice, DeviceType deviceType, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = hMBaseDevice;
            this.d = deviceType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceDataSourceImpl.this.new d(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher coroutineDispatcher = DeviceDataSourceImpl.this.defaultDispatcher;
                a aVar = new a(this.c, this.d, null);
                this.a = 1;
                obj = BuildersKt.withContext(coroutineDispatcher, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.feedback.DeviceDataSourceImpl", f = "DeviceDataSourceImpl.kt", i = {}, l = {147}, m = "isVoiceAssistantAlive", n = {}, s = {})
    public static final class e extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return DeviceDataSourceImpl.this.isVoiceAssistantAlive(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "跳转到固件升级界面";
        }
    }

    public DeviceDataSourceImpl(@NotNull Context context, @NotNull DeviceLogSyncApi deviceLogSyncApi, @NotNull DeviceManagerApi deviceManagerApi, @NotNull CoroutineDispatcher coroutineDispatcher) {
        this.context = context;
        this.deviceLogSyncApi = deviceLogSyncApi;
        this.deviceManagerApi = deviceManagerApi;
        this.defaultDispatcher = coroutineDispatcher;
    }

    private final FeedbackDevice a(DeviceType deviceType, Device device) {
        HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(device.getDevice_source().intValue());
        return new FeedbackDevice(deviceType, HMDeviceUtils.getDeviceDescription(hMDeviceSourceFromValue, HMBrandType.fromValue(device.getBrandType().intValue())), hMDeviceSourceFromValue.name(), Integer.valueOf(hMDeviceSourceFromValue.getValue()), device.getFirmware_version(), device.getSn(), HMDeviceConfig.hasFeatureLog(hMDeviceSourceFromValue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object b(Continuation<? super Integer> continuation) {
        HMMiLiProDevice miliProDevice = HMDeviceManager.getInstance().getMiliProDevice();
        if (miliProDevice == null) {
            return null;
        }
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        miliProDevice.getDfuState(new HMCallback<DfuState>() { // from class: com.xiaomi.hm.health.feedback.DeviceDataSourceImpl$dfuState$2$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ DfuState a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(DfuState dfuState) {
                    super(0);
                    this.a = dfuState;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "dfuState: " + this.a.getState();
                }
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onData(@NotNull DfuState dfuState) {
                super.onData(dfuState);
                HMLog.info("feedback", new a(dfuState));
                Continuation<Integer> continuation2 = safeContinuation;
                Integer numValueOf = Integer.valueOf(dfuState.getState());
                Result.Companion companion = Result.Companion;
                continuation2.resumeWith(Result.m3845constructorimpl(numValueOf));
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    private final HMBaseDevice c(HMDeviceType type) {
        return HMDeviceManager.getInstance().getDevice(type);
    }

    private final boolean d() {
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.HEADSET);
        if (device == null || !(device instanceof MozartDevice)) {
            return false;
        }
        return ((MozartDevice) device).getUpgrading();
    }

    @Override // com.huami.feedback.sync.api.device.DevicesDataSource
    @NotNull
    public List<FeedbackDevice> getActiveDevices() {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        Integer device_type;
        Integer device_type2;
        Integer device_type3;
        Integer device_type4;
        Integer device_type5;
        List<Device> activeDevices = HMDeviceManager.getActiveDevices();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = activeDevices.iterator();
        do {
            obj = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            device_type5 = ((Device) next).getDevice_type();
        } while (!(device_type5 != null && device_type5.intValue() == HMDeviceType.MILI.getValue()));
        Device device = (Device) next;
        if (device != null) {
            if (ConfigHelperKt.hasFeature(HMDeviceSource.fromValue(device.getDevice_source().intValue()), Feature.WATCH_SOURCE_S)) {
                arrayList.add(a(DeviceType.WATCH, device));
            } else {
                arrayList.add(a(DeviceType.BAND, device));
            }
        }
        Iterator<T> it3 = activeDevices.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
            device_type4 = ((Device) next2).getDevice_type();
        } while (!(device_type4 != null && device_type4.intValue() == HMDeviceType.HEADSET.getValue()));
        Device device2 = (Device) next2;
        if (device2 != null) {
            arrayList.add(a(DeviceType.HEAD_SET, device2));
        }
        Iterator<T> it4 = activeDevices.iterator();
        do {
            if (!it4.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it4.next();
            device_type3 = ((Device) next3).getDevice_type();
        } while (!(device_type3 != null && device_type3.intValue() == HMDeviceType.EARBUD.getValue()));
        Device device3 = (Device) next3;
        if (device3 != null) {
            arrayList.add(a(DeviceType.EAR_BUD, device3));
        }
        Iterator<T> it5 = activeDevices.iterator();
        do {
            if (!it5.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it5.next();
            device_type2 = ((Device) next4).getDevice_type();
        } while (!(device_type2 != null && device_type2.intValue() == HMDeviceType.WATCH.getValue()));
        Device device4 = (Device) next4;
        if (device4 != null) {
            arrayList.add(a(DeviceType.SMART_WATCH, device4));
        }
        Iterator<T> it6 = activeDevices.iterator();
        do {
            if (!it6.hasNext()) {
                next5 = null;
                break;
            }
            next5 = it6.next();
            device_type = ((Device) next5).getDevice_type();
        } while (!(device_type != null && device_type.intValue() == HMDeviceType.TREADMILL.getValue()));
        Device device5 = (Device) next5;
        if (device5 != null) {
            arrayList.add(a(DeviceType.TREADMILL, device5));
        }
        for (Object obj2 : activeDevices) {
            Integer device_type6 = ((Device) obj2).getDevice_type();
            if (device_type6 != null && device_type6.intValue() == HMDeviceType.WEIGHT.getValue()) {
                obj = obj2;
                break;
            }
        }
        Device device6 = (Device) obj;
        if (device6 != null) {
            arrayList.add(a(DeviceType.SCALE, device6));
        }
        return arrayList;
    }

    @Override // com.huami.feedback.sync.api.device.DevicesDataSource
    @Nullable
    public Object hasFwUpgrade(@NotNull DeviceType deviceType, @NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(false);
    }

    @Override // com.huami.feedback.sync.api.device.DevicesDataSource
    public boolean isConnected(@NotNull DeviceType deviceType) {
        Object objM3845constructorimpl;
        int iAsHmDeviceType = LogFileUtilsKt.asHmDeviceType(deviceType);
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(Boolean.valueOf(this.deviceManagerApi.isConnected(HMDeviceType.fromValue(iAsHmDeviceType))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.warn$default("feedback", null, new a(deviceType, thM3848exceptionOrNullimpl), 2, null);
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = bool;
        }
        return ((Boolean) objM3845constructorimpl).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.feedback.sync.api.device.DevicesDataSource
    @Nullable
    public Object isFwUpgrading(@NotNull DeviceType deviceType, @NotNull Continuation<? super Boolean> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.c = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objB = bVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = bVar.c;
        boolean zD = false;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objB);
            int i3 = WhenMappings.$EnumSwitchMapping$0[deviceType.ordinal()];
            if (i3 == 1 || i3 == 2) {
                bVar.c = 1;
                objB = b(bVar);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i3 == 3) {
                zD = d();
            }
            return Boxing.boxBoolean(zD);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objB);
        Integer num = (Integer) objB;
        if (num != null && num.intValue() == 9) {
            zD = true;
        }
        return Boxing.boxBoolean(zD);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.feedback.sync.api.device.DevicesDataSource
    @Nullable
    public Object isMusicAlive(@NotNull DeviceType deviceType, @NotNull Continuation<? super Boolean> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.c = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objB = cVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = cVar.c;
        boolean z = false;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objB);
            if (deviceType != DeviceType.BAND || deviceType != DeviceType.WATCH) {
                return Boxing.boxBoolean(false);
            }
            cVar.c = 1;
            objB = b(cVar);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objB);
        }
        Integer num = (Integer) objB;
        if (num != null && num.intValue() == 48) {
            z = true;
        }
        return Boxing.boxBoolean(z);
    }

    @Override // com.huami.feedback.sync.api.device.DevicesDataSource
    public boolean isSupportSyncLog(@NotNull DeviceType deviceType) {
        return HMDeviceConfig.hasFeatureLog(HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.fromValue(LogFileUtilsKt.asHmDeviceType(deviceType))));
    }

    @Override // com.huami.feedback.sync.api.device.DevicesDataSource
    @Nullable
    public Object isSyncing(@NotNull DeviceType deviceType, @NotNull Continuation<? super Boolean> continuation) {
        HMBaseDevice hMBaseDeviceC = c(HMDeviceType.fromValue(LogFileUtilsKt.asHmDeviceType(deviceType)));
        return hMBaseDeviceC == null ? Boxing.boxBoolean(false) : CoroutineScopeKt.coroutineScope(new d(hMBaseDeviceC, deviceType, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.feedback.sync.api.device.DevicesDataSource
    @Nullable
    public Object isVoiceAssistantAlive(@NotNull DeviceType deviceType, @NotNull Continuation<? super Boolean> continuation) {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i = eVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.c = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objB = eVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = eVar.c;
        boolean z = false;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objB);
            if (deviceType != DeviceType.BAND || deviceType != DeviceType.WATCH) {
                return Boxing.boxBoolean(false);
            }
            eVar.c = 1;
            objB = b(eVar);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objB);
        }
        Integer num = (Integer) objB;
        if (num != null && num.intValue() == 49) {
            z = true;
        }
        return Boxing.boxBoolean(z);
    }

    @Override // com.huami.feedback.sync.api.device.DevicesDataSource
    public void startFwUpgrade() {
        HMGt2SystemUpgradeActivity.INSTANCE.launch(this.context, false, false, false);
        Unit unit = Unit.INSTANCE;
        HMLog.info("feedback", f.a);
    }

    @Override // com.huami.feedback.sync.api.device.DevicesDataSource
    @NotNull
    public Flow<SyncLogResult> syncLog(@NotNull DeviceType deviceType, @NotNull String rootDir) {
        return this.deviceLogSyncApi.syncLog(deviceType, rootDir);
    }

    public /* synthetic */ DeviceDataSourceImpl(Context context, DeviceLogSyncApi deviceLogSyncApi, DeviceManagerApi deviceManagerApi, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, deviceLogSyncApi, deviceManagerApi, (i & 8) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
