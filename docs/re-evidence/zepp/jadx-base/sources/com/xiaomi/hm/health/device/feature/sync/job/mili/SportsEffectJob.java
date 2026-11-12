package com.xiaomi.hm.health.device.feature.sync.job.mili;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.device.core.sync.api.dto.ProgressDto;
import com.huami.device.core.sync.api.dto.WorkStatusDto;
import com.huami.device.core.sync.api.status.DeviceWorkStatus;
import com.huami.device.core.sync.api.type.JobType;
import com.huami.device.core.sync.api.type.SyncJob;
import com.huami.device.core.sync.impl.sync.inject.InjectScope;
import com.huami.device.core.sync.impl.sync.inject.InjectStatusChannel;
import com.huami.nfc.bus.NoticesEntity;
import com.huami.proto.SportEfect;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.raw.HmGdspRawData;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.BleFirstbeatData;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import com.xiaomi.hm.health.firstbeat.SportEffectApi;
import java.util.Calendar;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b5\u00106J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u0011J\u0016\u0010\u0016\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u000e\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0014J\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00198\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001d\u0010/\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/job/mili/SportsEffectJob;", "Lcom/huami/device/core/sync/api/type/SyncJob;", "Lcom/huami/device/core/sync/impl/sync/inject/InjectStatusChannel;", "Lcom/huami/device/core/sync/impl/sync/inject/InjectScope;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/device/core/sync/api/type/JobType;", "findType", "", "maxTime", "", "start", "", "byteArray", "onRawData", "Lcom/xiaomi/hm/health/bt/profile/smartwatch/firstbeat/BleFirstbeatData;", "outData", "onDataOut", "Ljava/util/Calendar;", "loadStartTime", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "channel", "onInject", "status", "sendStatus", "", "percent", "createProgress", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "device", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "", "tag", "Ljava/lang/String;", "stateChannel", "Lkotlinx/coroutines/channels/Channel;", "dataType", LogUtil.I, "Lcom/xiaomi/hm/health/firstbeat/SportEffectApi;", "sportEffectApi", "Lcom/xiaomi/hm/health/firstbeat/SportEffectApi;", "workStatusDto$delegate", "Lkotlin/Lazy;", "getWorkStatusDto", "()Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "workStatusDto", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "setScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SportsEffectJob implements SyncJob, InjectStatusChannel, InjectScope, KoinComponent {

    @NotNull
    private final HMMiLiProDevice device;

    @Nullable
    private CoroutineScope scope;

    @NotNull
    private final SportEffectApi sportEffectApi;
    private Channel<WorkStatusDto> stateChannel;

    /* JADX INFO: renamed from: workStatusDto$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy workStatusDto;

    @NotNull
    private final String tag = "SportsEffectJob";
    private final int dataType = 59;

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.feature.sync.job.mili.SportsEffectJob$onRawData$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.feature.sync.job.mili.SportsEffectJob$onRawData$2", f = "SportsEffectJob.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ byte[] $byteArray;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(byte[] bArr, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$byteArray = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SportsEffectJob.this.new AnonymousClass2(this.$byteArray, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM3845constructorimpl;
            a.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SportsEffectJob sportsEffectJob = SportsEffectJob.this;
            final byte[] bArr = this.$byteArray;
            try {
                Result.Companion companion = Result.Companion;
                HMLog.info(sportsEffectJob.tag, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.SportsEffectJob$onRawData$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "同步到训练效果数据" + bArr.length + " ,开始解析";
                    }
                });
                HMLog.info(sportsEffectJob.tag, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.SportsEffectJob$onRawData$2$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "训练效果数据:" + ByteArrayKt.toHexString(bArr);
                    }
                });
                sportsEffectJob.onDataOut(SportsEffectJobKt.convertToBleFirstbeatData(SportEfect.SportEffectMessage.parseFrom(bArr), sportsEffectJob.loadStartTime().getTimeInMillis() / ((long) 1000)));
                objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            SportsEffectJob sportsEffectJob2 = SportsEffectJob.this;
            final Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.error$default(sportsEffectJob2.tag, null, null, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.SportsEffectJob$onRawData$2$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "解析SportEffect数据异常:" + thM3848exceptionOrNullimpl;
                    }
                }, 6, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.feature.sync.job.mili.SportsEffectJob$sendStatus$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.feature.sync.job.mili.SportsEffectJob$sendStatus$1", f = "SportsEffectJob.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ WorkStatusDto $status;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15991(WorkStatusDto workStatusDto, Continuation<? super C15991> continuation) {
            super(2, continuation);
            this.$status = workStatusDto;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SportsEffectJob.this.new C15991(this.$status, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C15991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel channel = SportsEffectJob.this.stateChannel;
                    if (channel == null) {
                        throw null;
                    }
                    if (!channel.isClosedForSend()) {
                        Channel channel2 = SportsEffectJob.this.stateChannel;
                        if (channel2 == null) {
                            throw null;
                        }
                        WorkStatusDto workStatusDto = this.$status;
                        this.label = 1;
                        if (channel2.send(workStatusDto, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Throwable th) {
                HMLog.warn(SportsEffectJob.this.tag, th, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.SportsEffectJob.sendStatus.1.1
                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "channel closed";
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SportsEffectJob(@NotNull HMMiLiProDevice hMMiLiProDevice) {
        this.device = hMMiLiProDevice;
        this.sportEffectApi = (SportEffectApi) (this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SportEffectApi.class), null, null);
        this.workStatusDto = LazyKt__LazyJVMKt.lazy(new Function0<WorkStatusDto>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.SportsEffectJob$workStatusDto$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final WorkStatusDto getA() {
                String deviceID;
                DeviceInfo deviceInfo = this.this$0.device.getDeviceInfo();
                String str = NoticesEntity.LOOP_TYPE_NONE;
                if (deviceInfo != null && (deviceID = deviceInfo.getDeviceID()) != null) {
                    str = deviceID;
                }
                return new WorkStatusDto(str, DeviceWorkStatus.RUNNING, null, 0, 8, null);
            }
        });
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
        return JobType.INSTANCE.getFIRST_BEAT();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Nullable
    public final CoroutineScope getScope() {
        return this.scope;
    }

    @NotNull
    public final Calendar loadStartTime() {
        HMLog.info(this.tag, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.SportsEffectJob.loadStartTime.1
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "ready to sync firstbeat data";
            }
        });
        long jSyncStartTime = this.sportEffectApi.syncStartTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jSyncStartTime);
        return calendar;
    }

    @Override // com.huami.device.core.sync.api.type.SyncJob
    public long maxTime() {
        return 3600000L;
    }

    public final void onDataOut(@NotNull BleFirstbeatData outData) {
        this.sportEffectApi.save(outData);
    }

    @Override // com.huami.device.core.sync.impl.sync.inject.InjectStatusChannel
    public void onInject(@NotNull Channel<WorkStatusDto> channel) {
        this.stateChannel = channel;
    }

    public final void onRawData(@Nullable byte[] byteArray) {
        if (byteArray != null) {
            if (!(byteArray.length == 0)) {
                CoroutineScope coroutineScope = this.scope;
                if (coroutineScope == null) {
                    coroutineScope = GlobalScope.INSTANCE;
                }
                e.f(coroutineScope, null, null, new AnonymousClass2(byteArray, null), 3, null);
                return;
            }
        }
        HMLog.warn$default(this.tag, null, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.SportsEffectJob.onRawData.1
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "没有同步到SportEffect数据";
            }
        }, 2, null);
    }

    public final void sendStatus(@NotNull WorkStatusDto status) {
        CoroutineScope coroutineScope = this.scope;
        if (coroutineScope == null) {
            return;
        }
        e.f(coroutineScope, null, null, new C15991(status, null), 3, null);
    }

    public final void setScope(@Nullable CoroutineScope coroutineScope) {
        this.scope = coroutineScope;
    }

    @Override // com.huami.device.core.sync.api.type.SyncJob
    public void start() throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        this.device.startSyncRawData(loadStartTime(), this.dataType, new HMCallback<HmGdspRawData>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.SportsEffectJob.start.1
            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean ret) {
                if (!ret) {
                    HMLog.w(SportsEffectJob.this.tag, "sync first beat data finished.", new Object[0]);
                }
                countDownLatch.countDown();
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onProgress(@Nullable Progress progress) {
                if (progress == null) {
                    return;
                }
                SportsEffectJob sportsEffectJob = SportsEffectJob.this;
                sportsEffectJob.sendStatus(sportsEffectJob.createProgress(progress.getPercent()));
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onStart() {
                SportsEffectJob sportsEffectJob = SportsEffectJob.this;
                sportsEffectJob.sendStatus(sportsEffectJob.createProgress(0));
                countDownLatch.countDown();
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onData(@Nullable HmGdspRawData t) {
                SportsEffectJob.this.onRawData(t == null ? null : t.getRawData());
                countDownLatch.countDown();
            }
        });
        countDownLatch.await(maxTime(), TimeUnit.MILLISECONDS);
    }

    @Override // com.huami.device.core.sync.impl.sync.inject.InjectScope
    public void onInject(@NotNull CoroutineScope scope) {
        this.scope = scope;
    }
}
