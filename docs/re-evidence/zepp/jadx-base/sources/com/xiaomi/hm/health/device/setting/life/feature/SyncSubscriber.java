package com.xiaomi.hm.health.device.setting.life.feature;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.core.sync.SyncCenterFactory;
import com.huami.device.core.sync.api.dto.WorkStatusDto;
import com.huami.device.core.sync.api.status.DeviceWorkStatus;
import com.huami.devicex.injection.basic.SyncEventApi;
import com.huami.koinstartup.KoinComponentAdapter;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.device.event.HMDeviceSyncDataEvent;
import com.xiaomi.hm.health.device.feature.sync.earbud.EarbudClashResolve;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.xiaomi.mipush.sdk.MiPushClient;
import de.greenrobot.event.EventBus;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u001d\u0010\u0017\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001b\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/feature/SyncSubscriber;", "Lcom/xiaomi/hm/health/device/setting/life/feature/BleEventSubscriber;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "e", "Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "status", "", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "Lcom/xiaomi/hm/health/device/event/HMDeviceSyncDataEvent;", "a", "", "getName", "register", MiPushClient.COMMAND_UNREGISTER, "Lcom/xiaomi/hm/health/device/feature/sync/earbud/EarbudClashResolve;", "Lkotlin/Lazy;", "b", "()Lcom/xiaomi/hm/health/device/feature/sync/earbud/EarbudClashResolve;", "earbudClashResolve", "Lcom/huami/devicex/injection/basic/SyncEventApi;", "c", "()Lcom/huami/devicex/injection/basic/SyncEventApi;", "syncEventApi", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class SyncSubscriber implements BleEventSubscriber, KoinComponentAdapter {

    @NotNull
    private static final String c = "SyncSubscriber";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy earbudClashResolve;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy syncEventApi;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HMDeviceType.values().length];
            iArr[HMDeviceType.HEADSET.ordinal()] = 1;
            iArr[HMDeviceType.SHOES.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DeviceWorkStatus.values().length];
            iArr2[DeviceWorkStatus.NORMAL.ordinal()] = 1;
            iArr2[DeviceWorkStatus.RUNNING.ordinal()] = 2;
            iArr2[DeviceWorkStatus.FINISHED.ordinal()] = 3;
            iArr2[DeviceWorkStatus.EXCEPTION.ordinal()] = 4;
            iArr2[DeviceWorkStatus.INTERVAL.ordinal()] = 5;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return this.a.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.life.feature.SyncSubscriber$register$1", f = "SyncSubscriber.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ HMBaseDevice c;
        public final /* synthetic */ SyncSubscriber d;

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
                return "There are currently tasks that are being synchronized";
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.life.feature.SyncSubscriber$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0848b extends Lambda implements Function0<String> {
            public final /* synthetic */ WorkStatusDto a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0848b(WorkStatusDto workStatusDto) {
                super(0);
                this.a = workStatusDto;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "status -> " + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HMBaseDevice hMBaseDevice, SyncSubscriber syncSubscriber, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = hMBaseDevice;
            this.d = syncSubscriber;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0054 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x0055  */
        /* JADX WARN: Code duplicated, block: B:19:0x0062  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0055 -> B:17:0x005a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.b
                r2 = 1
                if (r1 == 0) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r1 = r7.a
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                kotlin.ResultKt.throwOnFailure(r8)
                r3 = r1
                r1 = r0
                r0 = r7
                goto L5a
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                kotlin.ResultKt.throwOnFailure(r8)
                com.huami.device.core.sync.SyncCenterFactory r8 = com.huami.device.core.sync.SyncCenterFactory.INSTANCE
                com.xiaomi.hm.health.bt.device.HMBaseDevice r1 = r7.c
                r3 = 0
                r4 = 2
                r5 = 0
                com.huami.device.core.sync.api.SyncApi r8 = com.huami.device.core.sync.SyncCenterFactory.getOrCreate$default(r8, r1, r3, r4, r5)
                boolean r1 = r8.getCurrentStatus()
                if (r1 == 0) goto L40
                com.xiaomi.hm.health.device.setting.life.feature.SyncSubscriber r8 = r7.d
                java.lang.String r8 = r8.getName()
                com.xiaomi.hm.health.device.setting.life.feature.SyncSubscriber$b$a r0 = com.xiaomi.hm.health.device.setting.life.feature.SyncSubscriber.b.a.a
                com.huami.tools.log.HMLog.info(r8, r0)
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            L40:
                kotlinx.coroutines.channels.Channel r8 = r8.start()
                kotlinx.coroutines.channels.ChannelIterator r8 = r8.iterator()
                r1 = r8
                r8 = r7
            L4a:
                r8.a = r1
                r8.b = r2
                java.lang.Object r3 = r1.hasNext(r8)
                if (r3 != r0) goto L55
                return r0
            L55:
                r6 = r0
                r0 = r8
                r8 = r3
                r3 = r1
                r1 = r6
            L5a:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L81
                java.lang.Object r8 = r3.next()
                com.huami.device.core.sync.api.dto.WorkStatusDto r8 = (com.huami.device.core.sync.api.dto.WorkStatusDto) r8
                com.xiaomi.hm.health.device.setting.life.feature.SyncSubscriber r4 = r0.d
                java.lang.String r4 = r4.getName()
                com.xiaomi.hm.health.device.setting.life.feature.SyncSubscriber$b$b r5 = new com.xiaomi.hm.health.device.setting.life.feature.SyncSubscriber$b$b
                r5.<init>(r8)
                com.huami.tools.log.HMLog.info(r4, r5)
                com.xiaomi.hm.health.device.setting.life.feature.SyncSubscriber r4 = r0.d
                com.xiaomi.hm.health.bt.device.HMBaseDevice r5 = r0.c
                com.xiaomi.hm.health.device.setting.life.feature.SyncSubscriber.access$postSyncStatus(r4, r5, r8)
                r8 = r0
                r0 = r1
                r1 = r3
                goto L4a
            L81:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.hm.health.device.setting.life.feature.SyncSubscriber.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SyncSubscriber() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.earbudClashResolve = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<EarbudClashResolve>() { // from class: com.xiaomi.hm.health.device.setting.life.feature.SyncSubscriber$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.feature.sync.earbud.EarbudClashResolve, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final EarbudClashResolve getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(EarbudClashResolve.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.syncEventApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<SyncEventApi>() { // from class: com.xiaomi.hm.health.device.setting.life.feature.SyncSubscriber$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.SyncEventApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SyncEventApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SyncEventApi.class), objArr2, objArr3);
            }
        });
    }

    private final HMDeviceSyncDataEvent a(WorkStatusDto status, HMDeviceType type) {
        int i = WhenMappings.$EnumSwitchMapping$1[status.getWorkStatus().ordinal()];
        if (i == 1) {
            HMDeviceSyncDataEvent hMDeviceSyncDataEvent = new HMDeviceSyncDataEvent(type, 0, new Progress());
            hMDeviceSyncDataEvent.setShowProgress(false);
            return hMDeviceSyncDataEvent;
        }
        if (i == 2) {
            HMDeviceSyncDataEvent hMDeviceSyncDataEvent2 = new HMDeviceSyncDataEvent(type, 1, new Progress());
            hMDeviceSyncDataEvent2.setShowProgress(false);
            return hMDeviceSyncDataEvent2;
        }
        if (i == 3) {
            HMDeviceSyncDataEvent hMDeviceSyncDataEvent3 = new HMDeviceSyncDataEvent(type, 2, new Progress());
            hMDeviceSyncDataEvent3.setShowProgress(false);
            return hMDeviceSyncDataEvent3;
        }
        if (i != 4 && i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        HMDeviceSyncDataEvent hMDeviceSyncDataEvent4 = new HMDeviceSyncDataEvent(type, 2, new Progress());
        hMDeviceSyncDataEvent4.setShowProgress(false);
        hMDeviceSyncDataEvent4.setResult(false);
        hMDeviceSyncDataEvent4.setError(status.getErrorCode());
        return hMDeviceSyncDataEvent4;
    }

    private final EarbudClashResolve b() {
        return (EarbudClashResolve) this.earbudClashResolve.getValue();
    }

    private final SyncEventApi c() {
        return (SyncEventApi) this.syncEventApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(HMBaseDevice device, WorkStatusDto status) {
        if (device.getMDeviceSource() == HMDeviceSource.OTHER_HAYDN || device.getMDeviceSource() == HMDeviceSource.OTHER_LULLABY) {
            try {
                c().onSyncEventOut(device, status);
                EventBus.getDefault().post(a(status, device.getDeviceType()));
            } catch (Exception e) {
                HMLog.info(c, new a(e));
            }
        }
    }

    private final boolean e(HMBaseDevice device) {
        HMDeviceType deviceType = device.getDeviceType();
        int i = deviceType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[deviceType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return false;
            }
        } else if (b().lastBindEarbudType() != HMDeviceType.HEADSET) {
            return false;
        }
        return true;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    @NotNull
    public String getName() {
        return "Sync-Data";
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void register(@NotNull HMBaseDevice device) {
        if (e(device)) {
            e.f(GlobalScope.INSTANCE, Dispatchers.getIO().plus(ExtKt.getExceptionHandler()), null, new b(device, this, null), 2, null);
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void unregister(@NotNull HMBaseDevice device) {
        if (e(device)) {
            SyncCenterFactory.INSTANCE.cancel(device);
        }
    }
}
