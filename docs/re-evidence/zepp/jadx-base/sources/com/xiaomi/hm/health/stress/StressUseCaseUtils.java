package com.xiaomi.hm.health.stress;

import com.huami.account.HMLoginManager;
import com.huami.device.feature.health.HealthDetect;
import com.huami.devicex.injection.keeper.DeviceTimeStoreApi;
import com.huami.stress.domain.data.local.StressDatabase;
import com.huami.stress.domain.model.SingleStress;
import com.huami.stress.domain.usecase.DeleteSingleStressUseCase;
import com.huami.stress.domain.usecase.SaveStressFromDeviceUseCase;
import com.huami.stress.domain.usecase.SaveUnSyncSingleStressUseCase;
import com.huami.stress.domain.usecase.SyncStressFromServerUseCase;
import com.huami.stress.domain.usecase.SyncStressToServerUseCase;
import com.huami.stress.domain.utils.StressDataUploadUtils;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.eventbus.EventStressUpdate;
import de.greenrobot.event.EventBus;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%J.\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005J\u0016\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\tJ\u0006\u0010\u0011\u001a\u00020\rJ\u0006\u0010\u0012\u001a\u00020\tJ\u0006\u0010\u0013\u001a\u00020\rJ\u0014\u0010\u0017\u001a\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J\u000e\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u000bJ\u0006\u0010\u001a\u001a\u00020\tR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\u00020\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/stress/StressUseCaseUtils;", "Lorg/koin/core/component/KoinComponent;", "", "deviceType", "deviceSource", "", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "", "syncDeviceData", "", "time", "", "allDay", "saveStressSyncTime", "syncDataToServer", "uploadDataToServerBySync", "syncDataFromServer", "isAllDayStressEnable", "", "Lcom/huami/stress/domain/model/SingleStress;", "list", "saveSingleStressData", "timestamp", "deleteSingleStressData", "cleanDb", "Lcom/xiaomi/hm/health/stress/StressCoroutineScope;", "a", "Lcom/xiaomi/hm/health/stress/StressCoroutineScope;", "coroutineScope", "Lcom/huami/devicex/injection/keeper/DeviceTimeStoreApi;", "b", "Lkotlin/Lazy;", "()Lcom/huami/devicex/injection/keeper/DeviceTimeStoreApi;", "deviceTimeStoreApi", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class StressUseCaseUtils implements KoinComponent {

    @NotNull
    public static final StressUseCaseUtils INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final StressCoroutineScope coroutineScope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Lazy deviceTimeStoreApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.stress.StressUseCaseUtils$cleanDb$1", f = "StressUseCaseUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ StressDatabase b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(StressDatabase stressDatabase, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = stressDatabase;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.clearAllTables();
            this.b.close();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.stress.StressUseCaseUtils$deleteSingleStressData$1", f = "StressUseCaseUtils.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ DeleteSingleStressUseCase b;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DeleteSingleStressUseCase deleteSingleStressUseCase, long j, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = deleteSingleStressUseCase;
            this.c = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DeleteSingleStressUseCase deleteSingleStressUseCase = this.b;
                String huamiId = HMLoginManager.getHuamiId();
                long j = this.c;
                this.a = 1;
                if (deleteSingleStressUseCase.execute(huamiId, j, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.stress.StressUseCaseUtils$saveSingleStressData$1", f = "StressUseCaseUtils.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ SaveUnSyncSingleStressUseCase b;
        public final /* synthetic */ List<SingleStress> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SaveUnSyncSingleStressUseCase saveUnSyncSingleStressUseCase, List<SingleStress> list, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = saveUnSyncSingleStressUseCase;
            this.c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SaveUnSyncSingleStressUseCase saveUnSyncSingleStressUseCase = this.b;
                List<SingleStress> list = this.c;
                this.a = 1;
                if (saveUnSyncSingleStressUseCase.execute(list, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.stress.StressUseCaseUtils$syncDataFromServer$1", f = "StressUseCaseUtils.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ SyncStressFromServerUseCase b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SyncStressFromServerUseCase syncStressFromServerUseCase, String str, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = syncStressFromServerUseCase;
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SyncStressFromServerUseCase syncStressFromServerUseCase = this.b;
                String str = this.c;
                this.a = 1;
                if (syncStressFromServerUseCase.execute(str, false, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            EventBus.getDefault().postSticky(new EventStressUpdate());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.stress.StressUseCaseUtils$syncDeviceData$1", f = "StressUseCaseUtils.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ SaveStressFromDeviceUseCase b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class a extends FunctionReferenceImpl implements Function2<Long, Boolean, Unit> {
            public a(StressUseCaseUtils stressUseCaseUtils) {
                super(2, stressUseCaseUtils, StressUseCaseUtils.class, "saveStressSyncTime", "saveStressSyncTime(JZ)V", 0);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Long l, Boolean bool) {
                invoke(l.longValue(), bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j, boolean z) {
                ((StressUseCaseUtils) this.receiver).saveStressSyncTime(j, z);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(SaveStressFromDeviceUseCase saveStressFromDeviceUseCase, String str, int i, int i2, String str2, String str3, String str4, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = saveStressFromDeviceUseCase;
            this.c = str;
            this.d = i;
            this.e = i2;
            this.f = str2;
            this.g = str3;
            this.h = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.b, this.c, this.d, this.e, this.f, this.g, this.h, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StressUseCaseUtils stressUseCaseUtils = StressUseCaseUtils.INSTANCE;
                Calendar pressureSingleSyncTime = stressUseCaseUtils.a().getPressureSingleSyncTime();
                Calendar pressureAllDaySyncTime = stressUseCaseUtils.a().getPressureAllDaySyncTime();
                a aVar = new a(stressUseCaseUtils);
                SaveStressFromDeviceUseCase saveStressFromDeviceUseCase = this.b;
                String str = this.c;
                int i2 = this.d;
                int i3 = this.e;
                String str2 = this.f;
                String str3 = this.g;
                String str4 = this.h;
                this.a = 1;
                if (saveStressFromDeviceUseCase.execute(str, i2, i3, str2, str3, str4, pressureSingleSyncTime, pressureAllDaySyncTime, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            EventBus.getDefault().post(new EventStressUpdate());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.stress.StressUseCaseUtils$uploadDataToServerBySync$1", f = "StressUseCaseUtils.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Continuation<? super f> continuation) {
            super(2, continuation);
            this.b = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                KoinComponent koinComponent = StressUseCaseUtils.INSTANCE;
                SyncStressToServerUseCase syncStressToServerUseCase = (SyncStressToServerUseCase) (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SyncStressToServerUseCase.class), null, null);
                String str = this.b;
                this.a = 1;
                obj = syncStressToServerUseCase.execute(str, this);
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

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final StressUseCaseUtils stressUseCaseUtils = new StressUseCaseUtils();
        INSTANCE = stressUseCaseUtils;
        final Qualifier qualifier = null;
        coroutineScope = (StressCoroutineScope) StressScopeNamesKt.stressScope(stressUseCaseUtils.getKoin()).get(Reflection.getOrCreateKotlinClass(StressCoroutineScope.class), null, null);
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Object[] objArr = 0 == true ? 1 : 0;
        deviceTimeStoreApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceTimeStoreApi>() { // from class: com.xiaomi.hm.health.stress.StressUseCaseUtils$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.keeper.DeviceTimeStoreApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceTimeStoreApi invoke() {
                KoinComponent koinComponent = stressUseCaseUtils;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceTimeStoreApi.class), qualifier, objArr);
            }
        });
    }

    private StressUseCaseUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceTimeStoreApi a() {
        return (DeviceTimeStoreApi) deviceTimeStoreApi.getValue();
    }

    public final void cleanDb() {
        kotlinx.coroutines.e.f(coroutineScope, null, null, new a((StressDatabase) StressScopeNamesKt.stressScope(getKoin()).get(Reflection.getOrCreateKotlinClass(StressDatabase.class), null, null), null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void deleteSingleStressData(long timestamp) {
        kotlinx.coroutines.e.f(coroutineScope, null, null, new b((DeleteSingleStressUseCase) (this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeleteSingleStressUseCase.class), null, null), timestamp, null), 3, null);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final boolean isAllDayStressEnable() {
        return HealthDetect.INSTANCE.getUserConfig().getPressureEnable();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void saveSingleStressData(@NotNull List<SingleStress> list) {
        kotlinx.coroutines.e.f(coroutineScope, null, null, new c((SaveUnSyncSingleStressUseCase) (this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SaveUnSyncSingleStressUseCase.class), null, null), list, null), 3, null);
    }

    public final void saveStressSyncTime(long time, boolean allDay) {
        if (time > System.currentTimeMillis()) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        if (allDay) {
            a().setPressureAllDaySyncTime(calendar);
        } else {
            a().setPressureSingleSyncTime(calendar);
        }
        EventBus.getDefault().postSticky(new EventStressUpdate());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void syncDataFromServer() {
        kotlinx.coroutines.e.f(coroutineScope, null, null, new d((SyncStressFromServerUseCase) (this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SyncStressFromServerUseCase.class), null, null), String.valueOf(HMLoginManager.getValidUid()), null), 3, null);
    }

    public final void syncDataToServer() {
        StressDataUploadUtils.INSTANCE.startUploadStressData(String.valueOf(HMLoginManager.getValidUid()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void syncDeviceData(int deviceType, int deviceSource, @NotNull String deviceId, @NotNull String deviceMac, @NotNull String deviceSn) {
        kotlinx.coroutines.e.f(coroutineScope, null, null, new e((SaveStressFromDeviceUseCase) (this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SaveStressFromDeviceUseCase.class), null, null), String.valueOf(HMLoginManager.getValidUid()), deviceType, deviceSource, deviceId, deviceMac, deviceSn, null), 3, null);
    }

    public final boolean uploadDataToServerBySync() {
        return ((Boolean) kotlinx.coroutines.d.b(null, new f(String.valueOf(HMLoginManager.getValidUid()), null), 1, null)).booleanValue();
    }
}
