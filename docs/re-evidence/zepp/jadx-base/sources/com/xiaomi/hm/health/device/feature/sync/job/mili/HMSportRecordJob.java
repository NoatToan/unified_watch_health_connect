package com.xiaomi.hm.health.device.feature.sync.job.mili;

import android.content.Context;
import com.huami.device.core.sync.impl.job.milible.SportRecordJob;
import com.huami.devicex.injection.keeper.DeviceTimeStoreApi;
import com.huami.moving.webapi.PostRunningDataToServer;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.sport.pb.PBManager;
import com.huami.watch.companion.sport.pb.PersonalBest;
import com.huami.watch.companion.sync.PBSyncApi;
import com.huami.watch.companion.sync.SyncCloudPBHelper;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsRecord;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xiaomi.hm.health.device.callback.MyGpsDataSyncCallback;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
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
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001#B\u0007¢\u0006\u0004\b!\u0010\"J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0014\u0010\r\u001a\u00020\b2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/job/mili/HMSportRecordJob;", "Lcom/huami/device/core/sync/impl/job/milible/SportRecordJob;", "Lorg/koin/core/component/KoinComponent;", "Ljava/util/Calendar;", "loadStartTime", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GpsRecord;", "outData", "", "onDataOut", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.EXCEPTION, "onError", "", "tag", "Ljava/lang/String;", "Landroid/content/Context;", "context$delegate", "Lkotlin/Lazy;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/devicex/injection/keeper/DeviceTimeStoreApi;", "deviceTimeStoreApi$delegate", "getDeviceTimeStoreApi", "()Lcom/huami/devicex/injection/keeper/DeviceTimeStoreApi;", "deviceTimeStoreApi", "Lcom/huami/watch/companion/sync/PBSyncApi;", "pbSyncApi$delegate", "getPbSyncApi", "()Lcom/huami/watch/companion/sync/PBSyncApi;", "pbSyncApi", "<init>", "()V", "HistorySyncDataCallback", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class HMSportRecordJob extends SportRecordJob implements KoinComponent {

    /* JADX INFO: renamed from: context$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy context;

    /* JADX INFO: renamed from: deviceTimeStoreApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceTimeStoreApi;

    /* JADX INFO: renamed from: pbSyncApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy pbSyncApi;

    @NotNull
    private final String tag = "SyncJob-HMSportRecordJob";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0007H\u0016R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/job/mili/HMSportRecordJob$HistorySyncDataCallback;", "Lcom/huami/moving/webapi/PostRunningDataToServer$IHistoryRecordSyncCallBack;", "", "count", "", "notifySyncBegin", "", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "unSyncedTrackRecords", "notifySyncEnd", "unSyncedTrackRecord", "notifySyncFail", "syncedTrackRecord", "notifySyncSuccess", "Lkotlinx/coroutines/channels/Channel;", "", "channel", "Lkotlinx/coroutines/channels/Channel;", "<init>", "(Lcom/xiaomi/hm/health/device/feature/sync/job/mili/HMSportRecordJob;Lkotlinx/coroutines/channels/Channel;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class HistorySyncDataCallback implements PostRunningDataToServer.IHistoryRecordSyncCallBack {

        @NotNull
        private final Channel<Boolean> channel;

        public HistorySyncDataCallback(Channel<Boolean> channel) {
            this.channel = channel;
        }

        @Override // com.huami.moving.webapi.PostRunningDataToServer.IHistoryRecordSyncCallBack
        public void notifySyncBegin(final int count) {
            HMLog.debug(HMSportRecordJob.this.tag, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMSportRecordJob$HistorySyncDataCallback$notifySyncBegin$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "HistorySyncDataCallback#notifySyncBegin(" + count + ")";
                }
            });
        }

        @Override // com.huami.moving.webapi.PostRunningDataToServer.IHistoryRecordSyncCallBack
        public void notifySyncEnd(@Nullable List<? extends Trackrecord> unSyncedTrackRecords) throws InterruptedException {
            HMLog.debug(HMSportRecordJob.this.tag, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMSportRecordJob$HistorySyncDataCallback$notifySyncEnd$1
                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "HistorySyncDataCallback#notifySyncEnd";
                }
            });
            HMLog.debug(HMSportRecordJob.this.tag, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMSportRecordJob$HistorySyncDataCallback$notifySyncEnd$2
                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "data upload cloud finish, then process PB data";
                }
            });
            d.b(null, new HMSportRecordJob$HistorySyncDataCallback$notifySyncEnd$3(this, null), 1, null);
        }

        @Override // com.huami.moving.webapi.PostRunningDataToServer.IHistoryRecordSyncCallBack
        public void notifySyncFail(@NotNull final Trackrecord unSyncedTrackRecord) {
            HMLog.warn$default(HMSportRecordJob.this.tag, null, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMSportRecordJob$HistorySyncDataCallback$notifySyncFail$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "HistorySyncDataCallback#notifySyncFail  with record size " + unSyncedTrackRecord.getSize();
                }
            }, 2, null);
        }

        @Override // com.huami.moving.webapi.PostRunningDataToServer.IHistoryRecordSyncCallBack
        public void notifySyncSuccess(@NotNull final Trackrecord syncedTrackRecord) {
            HMLog.debug(HMSportRecordJob.this.tag, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMSportRecordJob$HistorySyncDataCallback$notifySyncSuccess$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "HistorySyncDataCallback#notifySyncSuccess with record size " + syncedTrackRecord.getSize();
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.feature.sync.job.mili.HMSportRecordJob$onDataOut$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.feature.sync.job.mili.HMSportRecordJob$onDataOut$1", f = "HMSportRecordJob.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ List<GpsRecord> $outData;
        public int label;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.feature.sync.job.mili.HMSportRecordJob$onDataOut$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.feature.sync.job.mili.HMSportRecordJob$onDataOut$1$1", f = "HMSportRecordJob.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
        public static final class C08161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public final /* synthetic */ Channel<Boolean> $channel;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08161(Channel<Boolean> channel, Continuation<? super C08161> continuation) {
                super(2, continuation);
                this.$channel = channel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C08161(this.$channel, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
                return ((C08161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel<Boolean> channel = this.$channel;
                    this.label = 1;
                    obj = channel.receive(this);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(List<? extends GpsRecord> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$outData = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HMSportRecordJob.this.new AnonymousClass1(this.$outData, continuation);
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
            final boolean z = true;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel channelChannel$default = ChannelKt.Channel$default(-1, null, null, 6, null);
                    new MyGpsDataSyncCallback(HMSportRecordJob.this.getDevice().getDeviceSource(), HMSportRecordJob.this.new HistorySyncDataCallback(channelChannel$default)).onData(this.$outData);
                    C08161 c08161 = new C08161(channelChannel$default, null);
                    this.label = 1;
                    if (TimeoutKt.withTimeout(600000L, c08161, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                SyncCloudPBHelper.getHelper(HMSportRecordJob.this.getContext()).start();
                List<PersonalBest> allPBToWatch = PBManager.get().getAllPBToWatch(HMSportRecordJob.this.getContext());
                if (HMSportRecordJob.this.getPbSyncApi().supportSyncPb()) {
                    boolean zSendPBInfos = HMSportRecordJob.this.getPbSyncApi().sendPBInfos(allPBToWatch, true);
                    String str = HMSportRecordJob.this.tag;
                    if (!zSendPBInfos) {
                        z = false;
                    }
                    HMLog.info(str, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMSportRecordJob.onDataOut.1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            return "同步PB结果: " + z;
                        }
                    });
                }
            } catch (Throwable th) {
                HMLog.error(HMSportRecordJob.this.tag, "0", th, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMSportRecordJob.onDataOut.1.3
                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "process sport record with an error.";
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HMSportRecordJob() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.context = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<Context>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMSportRecordJob$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [android.content.Context, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Context invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(Context.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceTimeStoreApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceTimeStoreApi>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMSportRecordJob$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.keeper.DeviceTimeStoreApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceTimeStoreApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceTimeStoreApi.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.pbSyncApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<PBSyncApi>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMSportRecordJob$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.watch.companion.sync.PBSyncApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PBSyncApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(PBSyncApi.class), objArr4, objArr5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() {
        return (Context) this.context.getValue();
    }

    private final DeviceTimeStoreApi getDeviceTimeStoreApi() {
        return (DeviceTimeStoreApi) this.deviceTimeStoreApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PBSyncApi getPbSyncApi() {
        return (PBSyncApi) this.pbSyncApi.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob
    @NotNull
    public Calendar loadStartTime() {
        return getDeviceTimeStoreApi().getGpsSyncTime(getDevice().getDeviceSource().getType());
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob
    public void onError(@NotNull Exception exception) {
        HMLog.e(this.tag, exception);
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob
    public void onDataOut(@NotNull List<? extends GpsRecord> outData) {
        if (outData.isEmpty()) {
            return;
        }
        e.f(getScope(), null, null, new AnonymousClass1(outData, null), 3, null);
    }
}
