package com.xiaomi.hm.health.device.feature.sync.progress;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.devicex.manager.IDeviceStatusChanged;
import com.huami.devicex.manager.IRefreshingFinishedListener;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.event.HMDeviceSyncDataEvent;
import com.xiaomi.hm.health.device.feature.sync.progress.WatchDispatcher;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001b\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\rH\u0014J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010 \u001a\u00020\u001f8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\t8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/progress/WatchDispatcher;", "Lcom/xiaomi/hm/health/device/feature/sync/progress/ProgressDispatcher;", "Lkotlinx/coroutines/CoroutineScope;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/device/event/HMDeviceSyncDataEvent;", "event", "", "observeForFinish", "mockProgress", "", "percent", "dispatchProgress", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "targetType", "showProgress", "Lcom/huami/devicex/manager/IDeviceStatusChanged;", "iDeviceStatusChangedListener", "Lcom/huami/devicex/manager/IDeviceStatusChanged;", "Lcom/xiaomi/hm/health/device/feature/sync/progress/FreeCheck;", "checkFree", "Lcom/xiaomi/hm/health/device/feature/sync/progress/FreeCheck;", "", "tag", "Ljava/lang/String;", "Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi$delegate", "Lkotlin/Lazy;", "getDeviceManagerApi", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "totalCount", LogUtil.I, "current", "<init>", "(Lcom/huami/devicex/manager/IDeviceStatusChanged;Lcom/xiaomi/hm/health/device/feature/sync/progress/FreeCheck;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class WatchDispatcher implements ProgressDispatcher, CoroutineScope, KoinComponent {

    @NotNull
    private final FreeCheck checkFree;

    @NotNull
    private final CoroutineContext coroutineContext;
    private int current;

    /* JADX INFO: renamed from: deviceManagerApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    @NotNull
    private final IDeviceStatusChanged iDeviceStatusChangedListener;

    @NotNull
    private final String tag = "WatchDispatcher";
    private final int totalCount;

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.feature.sync.progress.WatchDispatcher$dispatchProgress$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.feature.sync.progress.WatchDispatcher$dispatchProgress$2", f = "WatchDispatcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $percent;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$percent = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        public static final void m3439invokeSuspend$lambda0() {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WatchDispatcher.this.new AnonymousClass2(this.$percent, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WatchDispatcher.this.iDeviceStatusChangedListener.onMajorDeviceSyncingData(this.$percent, new IRefreshingFinishedListener() { // from class: com.xiaomi.hm.health.device.feature.sync.progress.a
                @Override // com.huami.devicex.manager.IRefreshingFinishedListener
                public final void onRefreshingDone() {
                    WatchDispatcher.AnonymousClass2.m3439invokeSuspend$lambda0();
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.feature.sync.progress.WatchDispatcher$mockProgress$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.feature.sync.progress.WatchDispatcher$mockProgress$1", f = "WatchDispatcher.kt", i = {0, 1, 2, 3}, l = {83, 84, 91, 92, 95, 95}, m = "invokeSuspend", n = {"i", "i", "i", "i"}, s = {"I$2", "I$2", "I$2", "I$2"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ HMDeviceSyncDataEvent $event;
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public int label;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.feature.sync.progress.WatchDispatcher$mockProgress$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.feature.sync.progress.WatchDispatcher$mockProgress$1$1", f = "WatchDispatcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C08181 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ WatchDispatcher this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08181(WatchDispatcher watchDispatcher, Continuation<? super C08181> continuation) {
                super(2, continuation);
                this.this$0 = watchDispatcher;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C08181(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C08181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.iDeviceStatusChangedListener.onMajorDeviceSyncDataDone(false);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HMDeviceSyncDataEvent hMDeviceSyncDataEvent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$event = hMDeviceSyncDataEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WatchDispatcher.this.new AnonymousClass1(this.$event, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x007d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:28:0x007e  */
        /* JADX WARN: Code duplicated, block: B:31:0x0091 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:32:0x0092  */
        /* JADX WARN: Code duplicated, block: B:36:0x009f A[ADDED_TO_REGION] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0092 -> B:66:0x0096). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00e9 -> B:52:0x00ec). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 312
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.hm.health.device.feature.sync.progress.WatchDispatcher.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.feature.sync.progress.WatchDispatcher$showProgress$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.feature.sync.progress.WatchDispatcher$showProgress$1", f = "WatchDispatcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C16021 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ HMDeviceSyncDataEvent $event;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16021(HMDeviceSyncDataEvent hMDeviceSyncDataEvent, Continuation<? super C16021> continuation) {
            super(2, continuation);
            this.$event = hMDeviceSyncDataEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WatchDispatcher.this.new C16021(this.$event, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C16021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WatchDispatcher.this.observeForFinish(this.$event);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WatchDispatcher(@NotNull IDeviceStatusChanged iDeviceStatusChanged, @NotNull FreeCheck freeCheck) {
        this.iDeviceStatusChangedListener = iDeviceStatusChanged;
        this.checkFree = freeCheck;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.feature.sync.progress.WatchDispatcher$special$$inlined$inject$default$1
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
        this.coroutineContext = Dispatchers.getIO();
        this.totalCount = 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object dispatchProgress(int i, Continuation<? super Unit> continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(i, null), continuation);
        return objWithContext == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    private final DeviceManagerApi getDeviceManagerApi() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final void mockProgress(HMDeviceSyncDataEvent event) {
        if (event.getDeviceType() == HMDeviceType.WATCH && !event.isProgress()) {
            this.current += 2;
            e.f(this, Dispatchers.getIO(), null, new AnonymousClass1(event, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeForFinish(HMDeviceSyncDataEvent event) {
        if (event.isStop() && event.getResult()) {
            getDeviceManagerApi().startSyncGpsData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showProgress$lambda-0, reason: not valid java name */
    public static final void m3438showProgress$lambda0(WatchDispatcher watchDispatcher, HMDeviceSyncDataEvent hMDeviceSyncDataEvent, final HMDeviceType hMDeviceType) {
        HMLog.debug(watchDispatcher.tag, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.progress.WatchDispatcher$showProgress$2$1
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "onRefreshingDone..";
            }
        });
        watchDispatcher.iDeviceStatusChangedListener.onMajorDeviceSyncDataDone(false);
        if (hMDeviceSyncDataEvent.getResult()) {
            HMLog.debug(watchDispatcher.tag, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.progress.WatchDispatcher$showProgress$2$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    HMDeviceType hMDeviceType2 = hMDeviceType;
                    return "同步" + hMDeviceType2 + " 数据成功" + hMDeviceType2.hashCode();
                }
            });
            watchDispatcher.iDeviceStatusChangedListener.onMajorDeviceSyncDataSuccess(false);
            if (watchDispatcher.getDeviceManagerApi().startSyncGpsData()) {
                HMLog.debug(watchDispatcher.tag, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.progress.WatchDispatcher$showProgress$2$3
                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "start sync gps data";
                    }
                });
            } else {
                watchDispatcher.checkFree.checkFree(hMDeviceType);
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.feature.sync.progress.ProgressDispatcher
    public void showProgress(@NotNull final HMDeviceSyncDataEvent event) {
        final HMDeviceType deviceType = event.getDeviceType();
        if (targetType() != deviceType) {
            return;
        }
        e.f(this, Dispatchers.getMain(), null, new C16021(event, null), 2, null);
        if (event.isStop()) {
            return;
        }
        this.iDeviceStatusChangedListener.onMajorDeviceSyncingData(event.getProgress().getPercent(), new IRefreshingFinishedListener() { // from class: ke8
            @Override // com.huami.devicex.manager.IRefreshingFinishedListener
            public final void onRefreshingDone() {
                WatchDispatcher.m3438showProgress$lambda0(this.a, event, deviceType);
            }
        });
        if (event.isStart()) {
            mockProgress(event);
        }
    }

    @NotNull
    public HMDeviceType targetType() {
        return HMDeviceType.WATCH;
    }
}
