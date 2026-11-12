package com.huami.device.core.sync.impl.job.hub;

import com.huami.device.core.sync.api.SyncStrategy;
import com.huami.device.core.sync.api.dto.ProgressDto;
import com.huami.device.core.sync.api.dto.WorkStatusDto;
import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.device.core.sync.api.status.DeviceWorkStatus;
import com.huami.device.core.sync.api.type.JobType;
import com.huami.device.core.sync.api.type.SyncJob;
import com.huami.device.core.sync.impl.job.hub.callback.SensorHubDtaSyncCallback;
import com.huami.device.core.sync.impl.sync.inject.InjectJobStrategy;
import com.huami.device.core.sync.impl.sync.inject.InjectScope;
import com.huami.device.core.sync.impl.sync.inject.InjectStatusChannel;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataFragment;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b.\u0010/J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000eJ\u000e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014J\b\u0010\u0017\u001a\u00020\u000bH\u0016J\b\u0010\u0019\u001a\u00020\u0018H&J\b\u0010\u001b\u001a\u00020\u001aH&J\u001c\u0010 \u001a\u00020\u000b2\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001cH&R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010$R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u001d\u0010-\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/huami/device/core/sync/impl/job/hub/SensorHubJob;", "Lcom/huami/device/core/sync/api/type/SyncJob;", "Lcom/huami/device/core/sync/impl/sync/inject/InjectScope;", "Lcom/huami/device/core/sync/impl/sync/inject/InjectJobStrategy;", "Lcom/huami/device/core/sync/impl/sync/inject/InjectStatusChannel;", "Lcom/huami/device/core/sync/api/type/JobType;", "findType", "", "maxTime", "Lkotlinx/coroutines/CoroutineScope;", "scope", "", "onInject", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "channel", "Lcom/huami/device/core/sync/api/SyncStrategy;", "strategy", "status", "sendStatus", "", "percent", "createProgress", "start", "Lcom/huami/device/core/sync/impl/job/hub/SensorHub;", "loadSensorHub", "Ljava/util/Calendar;", "loadStartTime", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/ActivityDataFragment;", "", "outData", "onDataOut", "", "tag", "Ljava/lang/String;", "Lkotlinx/coroutines/CoroutineScope;", "statusChannel", "Lkotlinx/coroutines/channels/Channel;", "jobStrategy", "Lcom/huami/device/core/sync/api/SyncStrategy;", "workStatusDto$delegate", "Lkotlin/Lazy;", "getWorkStatusDto", "()Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "workStatusDto", "<init>", "()V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public abstract class SensorHubJob implements SyncJob, InjectScope, InjectJobStrategy, InjectStatusChannel {
    private SyncStrategy jobStrategy;
    private CoroutineScope scope;
    private Channel<WorkStatusDto> statusChannel;

    @NotNull
    private final String tag = "SyncCenter-SensorHubJob";

    /* JADX INFO: renamed from: workStatusDto$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy workStatusDto = LazyKt__LazyJVMKt.lazy(new Function0<WorkStatusDto>() { // from class: com.huami.device.core.sync.impl.job.hub.SensorHubJob$workStatusDto$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final WorkStatusDto invoke() {
            return new WorkStatusDto("0", DeviceWorkStatus.RUNNING, null, 0, 8, null);
        }
    });

    /* JADX INFO: renamed from: com.huami.device.core.sync.impl.job.hub.SensorHubJob$sendStatus$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.core.sync.impl.job.hub.SensorHubJob$sendStatus$1", f = "SensorHubJob.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ WorkStatusDto $status;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WorkStatusDto workStatusDto, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$status = workStatusDto;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SensorHubJob.this.new AnonymousClass1(this.$status, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel channel = SensorHubJob.this.statusChannel;
                    if (channel == null) {
                        channel = null;
                    }
                    WorkStatusDto workStatusDto = this.$status;
                    this.label = 1;
                    if (channel.send(workStatusDto, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception unused) {
                HMLog.w(SensorHubJob.this.tag, "send status " + SensorHubJob.this.findType() + " error.", new Object[0]);
            }
            return Unit.INSTANCE;
        }
    }

    private final WorkStatusDto getWorkStatusDto() {
        return (WorkStatusDto) this.workStatusDto.getValue();
    }

    @NotNull
    public final WorkStatusDto createProgress(int percent) {
        return WorkStatusDto.copy$default(getWorkStatusDto(), null, null, new ProgressDto(findType(), percent, null, 4, null), 0, 11, null);
    }

    @Override // com.huami.device.core.sync.api.type.SyncJob
    @NotNull
    public JobType findType() {
        return JobType.INSTANCE.getActivities();
    }

    @NotNull
    public abstract SensorHub loadSensorHub();

    @NotNull
    public abstract Calendar loadStartTime();

    @Override // com.huami.device.core.sync.api.type.SyncJob
    public long maxTime() {
        return -1L;
    }

    public abstract void onDataOut(@NotNull List<ActivityDataFragment<Object>> outData);

    @Override // com.huami.device.core.sync.impl.sync.inject.InjectScope
    public void onInject(@NotNull CoroutineScope scope) {
        this.scope = scope;
    }

    public final void sendStatus(@NotNull WorkStatusDto status) {
        CoroutineScope coroutineScope = this.scope;
        e.f(coroutineScope == null ? null : coroutineScope, null, null, new AnonymousClass1(status, null), 3, null);
    }

    @Override // com.huami.device.core.sync.api.type.SyncJob
    public void start() throws SyncException {
        try {
            SensorHub sensorHubLoadSensorHub = loadSensorHub();
            SensorHubDtaSyncCallback sensorHubDtaSyncCallback = new SensorHubDtaSyncCallback(this);
            sensorHubLoadSensorHub.syncSensorHubData(loadStartTime(), sensorHubDtaSyncCallback);
            onDataOut(sensorHubDtaSyncCallback.loadResult());
        } catch (Exception e) {
            throw new SyncException(findType() + " error", e, 0, 4, null);
        }
    }

    @Override // com.huami.device.core.sync.impl.sync.inject.InjectStatusChannel
    public void onInject(@NotNull Channel<WorkStatusDto> channel) {
        this.statusChannel = channel;
    }

    @Override // com.huami.device.core.sync.impl.sync.inject.InjectJobStrategy
    public void onInject(@NotNull SyncStrategy strategy) {
        this.jobStrategy = strategy;
    }
}
