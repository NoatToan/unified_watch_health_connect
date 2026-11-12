package com.xiaomi.hm.health.feedback;

import android.content.Context;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.device.HeadsetDevice;
import com.huami.bluetooth.device.function.log.SwitchRoleCallback;
import com.huami.bluetooth.profile.ecf.data.MultiDeviceState;
import com.huami.feedback.log.utils.ConstantsKt;
import com.huami.feedback.log.utils.DateUtilKt;
import com.huami.feedback.log.utils.LogFileUtilsKt;
import com.huami.feedback.sync.api.DeviceLogSyncError;
import com.huami.feedback.sync.api.device.DeviceLogSyncApi;
import com.huami.feedback.sync.api.device.DeviceType;
import com.huami.feedback.sync.api.device.SyncLogResult;
import com.huami.feedback.sync.api.device.SyncLogState;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HmBaseEarbudDevice;
import com.xiaomi.hm.health.bt.device.HmEarbudDevice;
import com.xiaomi.hm.health.bt.device.MozartDevice;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.lab.webapi.HMUploadDeviceLogAPI;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 12\u00020\u0001:\u00011B\u000f\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b/\u00100J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\f\u001a\u00020\u000b*\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\u000f\u001a\u00020\u000b*\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0010\u001a\u00020\u000b*\u00020\bH\u0002J\f\u0010\u0012\u001a\u00020\u0011*\u00020\bH\u0002J\"\u0010\u0013\u001a\u00020\u000b*\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0015\u001a\u00020\u0014*\u00020\bH\u0002J\u0014\u0010\u0018\u001a\u00020\u0017*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002J&\u0010\u001b\u001a\u00020\u000b*\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\f\u0010!\u001a\u00020\u000b*\u00020 H\u0002J\u001a\u0010$\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00172\b\u0010#\u001a\u0004\u0018\u00010\u0017H\u0002J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010+R\u0016\u0010.\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010-¨\u00062"}, d2 = {"Lcom/xiaomi/hm/health/feedback/DeviceLogSyncApiImpl;", "Lcom/huami/feedback/sync/api/device/DeviceLogSyncApi;", "", "fileDir", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/feedback/sync/api/device/SyncLogResult;", com.google.android.exoplayer2.text.ttml.b.r, "m", "Lcom/xiaomi/hm/health/bt/device/MozartDevice;", "Lkotlinx/coroutines/channels/Channel;", "channel", "", "o", "l", "Lcom/xiaomi/hm/health/bt/device/HmBaseEarbudDevice;", GoogleApiAvailabilityLight.b, "h", "", "a", hl.k, "Lcom/xiaomi/hm/health/feedback/HeadSetDeviceLabel;", "e", "logDirection", "Ljava/io/File;", "c", "Lcom/huami/feedback/sync/api/DeviceLogSyncError;", "error", "i", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "f", "g", "Lcom/xiaomi/hm/health/bt/device/HmEarbudDevice;", GoogleApiAvailabilityLight.a, HMUploadDeviceLogAPI.a.b, "tempFile", "b", "Lcom/huami/feedback/sync/api/device/DeviceType;", "deviceType", "syncLog", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "copyEarBudLog", "Landroid/content/Context;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isSubDeviceSync", "<init>", "(Landroid/content/Context;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceLogSyncApiImpl implements DeviceLogSyncApi {
    private static final int c = 10485760;
    private static final int d = 50;

    @NotNull
    private static final String e = "earbugLog";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private AtomicBoolean isSubDeviceSync = new AtomicBoolean(false);

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
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "准备拷贝EarBug日志文件到日志文件夹，但是获取设备失败！";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "拷贝EarBud的日志到日志文件夹失败：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "copy ear bud temp file to log file error. " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "当前设备日志文件：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Unit> {
        public static final e a = new e();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "释放了同步莫扎特设备的锁";
            }
        }

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HMLog.info("feedback", a.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/feedback/sync/api/device/SyncLogResult;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.feedback.DeviceLogSyncApiImpl$syncEarBudDeviceLog$hmDevice$1", f = "DeviceLogSyncApiImpl.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<FlowCollector<? super SyncLogResult>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            f fVar = new f(continuation);
            fVar.b = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super SyncLogResult> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.b;
                SyncLogResult syncLogResult = new SyncLogResult(SyncLogState.ON_STOP, 0, DeviceLogSyncError.UNKNOWN_DEVICE, 2, null);
                this.a = 1;
                if (flowCollector.emit(syncLogResult, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/feedback/sync/api/device/SyncLogResult;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.feedback.DeviceLogSyncApiImpl$syncHeadsetDeviceLog$hmDevice$1", f = "DeviceLogSyncApiImpl.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<FlowCollector<? super SyncLogResult>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            g gVar = new g(continuation);
            gVar.b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super SyncLogResult> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.b;
                SyncLogResult syncLogResult = new SyncLogResult(SyncLogState.ON_STOP, 0, DeviceLogSyncError.UNKNOWN_DEVICE, 2, null);
                this.a = 1;
                if (flowCollector.emit(syncLogResult, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/feedback/sync/api/device/SyncLogResult;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.feedback.DeviceLogSyncApiImpl$syncLog$1", f = "DeviceLogSyncApiImpl.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<FlowCollector<? super SyncLogResult>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            h hVar = new h(continuation);
            hVar.b = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super SyncLogResult> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.b;
                SyncLogResult syncLogResult = new SyncLogResult(SyncLogState.ON_STOP, 0, DeviceLogSyncError.UN_SUPPORT_SYNC_LOG, 2, null);
                this.a = 1;
                if (flowCollector.emit(syncLogResult, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/feedback/sync/api/device/SyncLogResult;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.feedback.DeviceLogSyncApiImpl$syncMILIDeviceLog$hmDevice$1", f = "DeviceLogSyncApiImpl.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<FlowCollector<? super SyncLogResult>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            i iVar = new i(continuation);
            iVar.b = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super SyncLogResult> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((i) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.b;
                SyncLogResult syncLogResult = new SyncLogResult(SyncLogState.ON_STOP, 0, DeviceLogSyncError.UNKNOWN_DEVICE, 2, null);
                this.a = 1;
                if (flowCollector.emit(syncLogResult, this) == coroutine_suspended) {
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

    public DeviceLogSyncApiImpl(@NotNull Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a(MozartDevice mozartDevice) {
        HeadsetDevice.HeadsetDeviceState headsetState = mozartDevice.getHeadsetState();
        if (headsetState == null) {
            return false;
        }
        return headsetState.isDualConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(File logFile, File tempFile) {
        if (tempFile == null) {
            return;
        }
        try {
            if (logFile.exists() && logFile.length() > 10485760) {
                logFile.delete();
            }
            if (!logFile.exists()) {
                logFile.createNewFile();
            }
            kotlin.io.c.appendBytes(logFile, kotlin.io.c.readBytes(tempFile));
            tempFile.delete();
        } catch (Exception e2) {
            HMLog.warn$default("feedback", null, new c(e2), 2, null);
        }
    }

    private final File c(MozartDevice mozartDevice, String str) throws IOException {
        String strName;
        HMDeviceSource mDeviceSource = mozartDevice.getMDeviceSource();
        String str2 = "";
        if (mDeviceSource != null && (strName = mDeviceSource.name()) != null) {
            str2 = strName;
        }
        String str3 = str2 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + e(mozartDevice).name() + "}-" + DateUtilKt.getFormatTimeDisplay() + ConstantsKt.LOG_FILE_SUFFIX;
        String str4 = str + File.separator + str3;
        File file = new File(str4);
        file.createNewFile();
        HMLog.info("feedback", new d(str4));
        return file;
    }

    private final void d(HmEarbudDevice hmEarbudDevice) {
        try {
            File fileF = f(hmEarbudDevice);
            File fileF2 = f(hmEarbudDevice.getRightDevice());
            if (fileF.exists()) {
                fileF.delete();
            }
            if (fileF2.exists()) {
                fileF2.delete();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final HeadSetDeviceLabel e(MozartDevice mozartDevice) {
        HeadsetDevice.HeadsetDeviceState headsetState = mozartDevice.getHeadsetState();
        MultiDeviceState.Host host = headsetState == null ? null : headsetState.getHost();
        if (host == null) {
            return HeadSetDeviceLabel.UNKNOWN;
        }
        return host instanceof MultiDeviceState.Host.Right ? HeadSetDeviceLabel.RIGHT : HeadSetDeviceLabel.LEFT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File f(HMBaseDevice device) throws IOException {
        String strName;
        String deviceID;
        HMDeviceSource mDeviceSource = device.getMDeviceSource();
        String str = "";
        if (mDeviceSource == null || (strName = mDeviceSource.name()) == null) {
            strName = "";
        }
        DeviceInfo deviceInfo = device.getDeviceInfo();
        if (deviceInfo != null && (deviceID = deviceInfo.getDeviceID()) != null) {
            str = deviceID;
        }
        File file = new File(FileUtils.getAppFileDir(this.context, e), strName + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str + ConstantsKt.LOG_FILE_SUFFIX);
        if (!file.exists()) {
            file.createNewFile();
        }
        return file;
    }

    private final File g(HMBaseDevice device) {
        String strName;
        HMDeviceSource mDeviceSource = device.getMDeviceSource();
        String str = "";
        if (mDeviceSource != null && (strName = mDeviceSource.name()) != null) {
            str = strName;
        }
        return FileUtils.getAppCacheDir(this.context, e, str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + DateUtilKt.getFormatTimeDisplay() + ConstantsKt.LOG_FILE_SUFFIX);
    }

    private final void h(MozartDevice mozartDevice) {
        mozartDevice.unLockGpsSync();
        mozartDevice.lockGpsSync(3600000L, e.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(MozartDevice mozartDevice, Channel<SyncLogResult> channel, DeviceLogSyncError deviceLogSyncError) throws InterruptedException {
        ChannelsKt.trySendBlocking(channel, new SyncLogResult(SyncLogState.ON_STOP, 0, deviceLogSyncError, 2, null));
        SendChannel.DefaultImpls.close$default(channel, null, 1, null);
        mozartDevice.unLockGpsSync();
    }

    public static /* synthetic */ void j(DeviceLogSyncApiImpl deviceLogSyncApiImpl, MozartDevice mozartDevice, Channel channel, DeviceLogSyncError deviceLogSyncError, int i2, Object obj) throws InterruptedException {
        if ((i2 & 2) != 0) {
            deviceLogSyncError = null;
        }
        deviceLogSyncApiImpl.i(mozartDevice, channel, deviceLogSyncError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(final MozartDevice mozartDevice, final Channel<SyncLogResult> channel, final String str) {
        mozartDevice.doSwitchRole(new SwitchRoleCallback() { // from class: com.xiaomi.hm.health.feedback.DeviceLogSyncApiImpl$switchDeviceAndSyncLog$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ boolean a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(boolean z) {
                    super(0);
                    this.a = z;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "switch era bud:" + this.a;
                }
            }

            @Override // com.huami.bluetooth.device.function.log.SwitchRoleCallback
            public void onSwitchRoleResult(boolean result) throws InterruptedException, IOException {
                HMLog.info("feedback", new a(result));
                this.a.isSubDeviceSync.set(result);
                if (result) {
                    if (((MozartDevice) HMDeviceManager.getInstance().getDevice(HMDeviceType.HEADSET)) == null) {
                        this.a.i(mozartDevice, channel, DeviceLogSyncError.UNKNOWN_DEVICE);
                        return;
                    } else {
                        this.a.o(mozartDevice, channel, str);
                        return;
                    }
                }
                Channel<SyncLogResult> channel2 = channel;
                SyncLogState syncLogState = SyncLogState.ON_SWITCH_RESULT;
                DeviceLogSyncError deviceLogSyncError = DeviceLogSyncError.DEVICE_SWITCH_FAILED;
                ChannelsKt.trySendBlocking(channel2, new SyncLogResult(syncLogState, 0, deviceLogSyncError, 2, null));
                this.a.i(mozartDevice, channel, deviceLogSyncError);
            }
        });
    }

    private final Flow<SyncLogResult> l(String fileDir) {
        Channel<SyncLogResult> channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.EARBUD);
        if (device == null) {
            return FlowKt.flow(new f(null));
        }
        n((HmBaseEarbudDevice) device, channelChannel$default, fileDir);
        return FlowKt.consumeAsFlow(channelChannel$default);
    }

    private final Flow<SyncLogResult> m(String fileDir) throws IOException {
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.HEADSET);
        if (device == null) {
            return FlowKt.flow(new g(null));
        }
        MozartDevice mozartDevice = (MozartDevice) device;
        h(mozartDevice);
        Channel<SyncLogResult> channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
        o(mozartDevice, channelChannel$default, fileDir);
        return FlowKt.consumeAsFlow(channelChannel$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(final HmBaseEarbudDevice hmBaseEarbudDevice, final Channel<SyncLogResult> channel, final String str) {
        hmBaseEarbudDevice.getDeviceLog(g(hmBaseEarbudDevice), new IHMDataCallback<File>() { // from class: com.xiaomi.hm.health.feedback.DeviceLogSyncApiImpl.syncLog.3

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private int tempProgress;

            public final int getTempProgress() {
                return this.tempProgress;
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
            public void onProgress(@Nullable Progress progress) {
                if (progress == null) {
                    return;
                }
                DeviceLogSyncApiImpl deviceLogSyncApiImpl = DeviceLogSyncApiImpl.this;
                Channel<SyncLogResult> channel2 = channel;
                setTempProgress(progress.getPercent() / 2);
                if (deviceLogSyncApiImpl.isSubDeviceSync.get()) {
                    setTempProgress(getTempProgress() + 50);
                }
                ChannelResult.m4440boximpl(ChannelsKt.trySendBlocking(channel2, new SyncLogResult(SyncLogState.ON_PROGRESS, getTempProgress(), null, 4, null)));
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
            public void onStart() throws InterruptedException {
                ChannelsKt.trySendBlocking(channel, new SyncLogResult(SyncLogState.ON_START, 0, null, 6, null));
            }

            public final void setTempProgress(int i2) {
                this.tempProgress = i2;
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
            public void onStop(@Nullable File data, @Nullable HMDeviceError error) throws InterruptedException, IOException {
                DeviceLogSyncApiImpl.this.b(DeviceLogSyncApiImpl.this.f(hmBaseEarbudDevice), data);
                DeviceLogSyncError deviceLogSyncErrorConvertError = LogFileUtilsKt.convertError(error);
                DeviceLogSyncError deviceLogSyncError = DeviceLogSyncError.SYNC_SUCCESS;
                if (deviceLogSyncErrorConvertError != deviceLogSyncError) {
                    ChannelsKt.trySendBlocking(channel, new SyncLogResult(SyncLogState.ON_STOP, 0, deviceLogSyncErrorConvertError, 2, null));
                    SendChannel.DefaultImpls.close$default(channel, null, 1, null);
                    return;
                }
                if (DeviceLogSyncApiImpl.this.isSubDeviceSync.compareAndSet(false, true)) {
                    DeviceLogSyncApiImpl.this.n(((HmEarbudDevice) hmBaseEarbudDevice).getRightDevice(), channel, str);
                    return;
                }
                if (DeviceLogSyncApiImpl.this.isSubDeviceSync.get() && deviceLogSyncErrorConvertError == deviceLogSyncError && this.tempProgress != 100) {
                    ChannelsKt.trySendBlocking(channel, new SyncLogResult(SyncLogState.ON_PROGRESS, 100, null, 4, null));
                }
                DeviceLogSyncApiImpl deviceLogSyncApiImpl = DeviceLogSyncApiImpl.this;
                deviceLogSyncApiImpl.copyEarBudLog(deviceLogSyncApiImpl.context);
                ChannelsKt.trySendBlocking(channel, new SyncLogResult(SyncLogState.ON_STOP, 0, deviceLogSyncErrorConvertError, 2, null));
                SendChannel.DefaultImpls.close$default(channel, null, 1, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(final MozartDevice mozartDevice, final Channel<SyncLogResult> channel, final String str) throws IOException {
        File fileC = c(mozartDevice, str);
        final Ref.IntRef intRef = new Ref.IntRef();
        mozartDevice.getDeviceLog(fileC, new IHMDataCallback<File>() { // from class: com.xiaomi.hm.health.feedback.DeviceLogSyncApiImpl.syncLog.2

            /* JADX INFO: renamed from: com.xiaomi.hm.health.feedback.DeviceLogSyncApiImpl$syncLog$2$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "sync device stop with error";
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.feedback.DeviceLogSyncApiImpl$syncLog$2$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public static final b a = new b();

                public b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "sync first device stop,signal to switch!";
                }
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
            public void onProgress(@Nullable Progress progress) throws InterruptedException {
                intRef.element = progress == null ? 0 : progress.getPercent();
                ChannelsKt.trySendBlocking(channel, new SyncLogResult(SyncLogState.ON_PROGRESS, intRef.element, null, 4, null));
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
            public void onStart() throws InterruptedException {
                intRef.element = 0;
                ChannelsKt.trySendBlocking(channel, new SyncLogResult(SyncLogState.ON_START, 0, null, 6, null));
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
            public void onStop(@Nullable File data, @Nullable HMDeviceError error) throws InterruptedException {
                DeviceLogSyncError deviceLogSyncErrorConvertError = LogFileUtilsKt.convertError(error);
                DeviceLogSyncError deviceLogSyncError = DeviceLogSyncError.SYNC_SUCCESS;
                if (deviceLogSyncErrorConvertError == deviceLogSyncError) {
                    Ref.IntRef intRef2 = intRef;
                    if (intRef2.element != 100) {
                        intRef2.element = 100;
                        ChannelsKt.trySendBlocking(channel, new SyncLogResult(SyncLogState.ON_PROGRESS, 100, null, 4, null));
                    }
                }
                if (deviceLogSyncErrorConvertError != deviceLogSyncError) {
                    HMLog.info("feedback", a.a);
                    this.i(mozartDevice, channel, deviceLogSyncErrorConvertError);
                } else {
                    if (intRef.element != 100 || this.isSubDeviceSync.get() || !this.a(mozartDevice)) {
                        DeviceLogSyncApiImpl.j(this, mozartDevice, channel, null, 2, null);
                        return;
                    }
                    HMLog.info("feedback", b.a);
                    ChannelsKt.trySendBlocking(channel, new SyncLogResult(SyncLogState.ON_SWITCH, 0, null, 6, null));
                    this.k(mozartDevice, channel, str);
                }
            }
        });
    }

    private final Flow<SyncLogResult> p(String fileDir) throws IOException {
        HMBaseDevice miliDevice = HMDeviceManager.getInstance().getMiliDevice();
        if (miliDevice == null) {
            return FlowKt.flow(new i(null));
        }
        String str = miliDevice.getMDeviceSource().name() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + DateUtilKt.getFormatTimeDisplay() + ConstantsKt.LOG_FILE_SUFFIX;
        File file = new File(fileDir + File.separator + str);
        file.createNewFile();
        final Ref.IntRef intRef = new Ref.IntRef();
        final Channel channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
        miliDevice.getDeviceLog(file, new IHMDataCallback<File>() { // from class: com.xiaomi.hm.health.feedback.DeviceLogSyncApiImpl$syncMILIDeviceLog$1
            @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
            public void onProgress(@Nullable Progress progress) throws InterruptedException {
                intRef.element = progress == null ? 0 : progress.getPercent();
                ChannelsKt.trySendBlocking(channelChannel$default, new SyncLogResult(SyncLogState.ON_PROGRESS, intRef.element, null, 4, null));
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
            public void onStart() throws InterruptedException {
                intRef.element = 0;
                ChannelsKt.trySendBlocking(channelChannel$default, new SyncLogResult(SyncLogState.ON_START, 0, null, 6, null));
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
            public void onStop(@Nullable File data, @Nullable HMDeviceError error) throws InterruptedException {
                DeviceLogSyncError deviceLogSyncErrorConvertError = LogFileUtilsKt.convertError(error);
                if (deviceLogSyncErrorConvertError == DeviceLogSyncError.SYNC_SUCCESS && intRef.element != 100) {
                    ChannelsKt.trySendBlocking(channelChannel$default, new SyncLogResult(SyncLogState.ON_PROGRESS, 100, null, 4, null));
                }
                ChannelsKt.trySendBlocking(channelChannel$default, new SyncLogResult(SyncLogState.ON_STOP, 0, deviceLogSyncErrorConvertError, 2, null));
                SendChannel.DefaultImpls.close$default(channelChannel$default, null, 1, null);
            }
        });
        return FlowKt.consumeAsFlow(channelChannel$default);
    }

    public final void copyEarBudLog(@NotNull Context context) {
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.EARBUD);
        if (device == null) {
            HMLog.error$default("feedback", null, null, a.a, 6, null);
            return;
        }
        try {
            File fileF = f(device);
            FileUtils.copyFile(fileF, new File(FileUtils.getLogRootDir(context), fileF.getName()));
            File fileF2 = f(((HmEarbudDevice) device).getRightDevice());
            FileUtils.copyFile(fileF2, new File(FileUtils.getLogRootDir(context), fileF2.getName()));
            d((HmEarbudDevice) device);
        } catch (Exception e2) {
            HMLog.info("feedback", new b(e2));
        }
    }

    @Override // com.huami.feedback.sync.api.device.DeviceLogSyncApi
    @NotNull
    public Flow<SyncLogResult> syncLog(@NotNull DeviceType deviceType, @NotNull String fileDir) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[deviceType.ordinal()];
        if (i2 == 1 || i2 == 2) {
            return p(fileDir);
        }
        if (i2 != 3) {
            return i2 != 4 ? FlowKt.flow(new h(null)) : l(fileDir);
        }
        return m(fileDir);
    }
}
