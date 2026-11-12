package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.gesture;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.device.feature.gesture.api.GestureTypeFactory;
import com.huami.device.feature.gesture.impl.GestureProtocolApiImpl;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tR\u001d\u0010\u0012\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R%\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R!\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/gesture/GestureViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/gesture/GestureType;", "type", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/gesture/GestureTrainState;", "state", "", "updateGestureTrainState", "", "gestureType", "queryGestureTrainState", "queryAllGestureState", "disableGesture", "Lcom/huami/devicex/manager/DeviceManagerApi;", "a", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/gesture/GestureStatusVo;", "b", "Landroidx/lifecycle/MutableLiveData;", "getSwitchStateLiveData", "()Landroidx/lifecycle/MutableLiveData;", "switchStateLiveData", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/gesture/GestureTrainStateVo;", "c", "getGestureTrainState", "gestureTrainState", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class GestureViewModel extends ViewModel implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<GestureStatusVo>> switchStateLiveData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<GestureTrainStateVo> gestureTrainState;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.gesture.GestureViewModel$disableGesture$1", f = "GestureViewModel.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.gesture.GestureViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0857a extends Lambda implements Function0<String> {
            public static final C0857a a = new C0857a();

            public C0857a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "获取手势Module失败";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GestureViewModel.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            Object obj2 = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMBaseDevice device = GestureViewModel.this.a().getDevice(HMDeviceType.MILI);
                GestureProtocolApiImpl gestureProtocolApiImpl = device == null ? null : (GestureProtocolApiImpl) device.getChannelModule(GestureProtocolApiImpl.class);
                if (gestureProtocolApiImpl == null) {
                    HMLog.error$default(null, null, null, C0857a.a, 7, null);
                    return Unit.INSTANCE;
                }
                int i2 = this.c;
                this.a = 1;
                obj = gestureProtocolApiImpl.disableGesture(i2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                return Unit.INSTANCE;
            }
            List<GestureStatusVo> value = GestureViewModel.this.getSwitchStateLiveData().getValue();
            if (value == null) {
                return Unit.INSTANCE;
            }
            int i3 = this.c;
            for (Object obj3 : value) {
                if (Boxing.boxBoolean(((GestureStatusVo) obj3).getGesture().getType() == i3).booleanValue()) {
                    obj2 = obj3;
                    break;
                }
            }
            GestureStatusVo gestureStatusVo = (GestureStatusVo) obj2;
            if (gestureStatusVo != null) {
                gestureStatusVo.setStatus(false);
            }
            GestureViewModel.this.getSwitchStateLiveData().postValue(value);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.gesture.GestureViewModel$queryAllGestureState$1", f = "GestureViewModel.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "获取手势Module失败";
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GestureViewModel.this.new b(continuation);
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
            List<GestureStatusVo> listEmptyList = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMBaseDevice device = GestureViewModel.this.a().getDevice(HMDeviceType.MILI);
                GestureProtocolApiImpl gestureProtocolApiImpl = device == null ? null : (GestureProtocolApiImpl) device.getChannelModule(GestureProtocolApiImpl.class);
                if (gestureProtocolApiImpl == null) {
                    HMLog.error$default(null, null, null, a.a, 7, null);
                    return Unit.INSTANCE;
                }
                this.a = 1;
                obj = gestureProtocolApiImpl.queryAllGestureState(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List<GestureTypeFactory.GestureState> list = (List) obj;
            if (list != null) {
                listEmptyList = new ArrayList<>(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (GestureTypeFactory.GestureState gestureState : list) {
                    listEmptyList.add(new GestureStatusVo(GestureType.INSTANCE.fromValue(gestureState.getType()), gestureState.getState() == ByteUtilsKt.toInt(true)));
                }
            }
            MutableLiveData<List<GestureStatusVo>> switchStateLiveData = GestureViewModel.this.getSwitchStateLiveData();
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            switchStateLiveData.postValue(listEmptyList);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.gesture.GestureViewModel$queryGestureTrainState$1", f = "GestureViewModel.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "获取手势Module失败";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GestureViewModel.this.new c(this.c, continuation);
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
                HMBaseDevice device = GestureViewModel.this.a().getDevice(HMDeviceType.MILI);
                GestureProtocolApiImpl gestureProtocolApiImpl = device == null ? null : (GestureProtocolApiImpl) device.getChannelModule(GestureProtocolApiImpl.class);
                if (gestureProtocolApiImpl == null) {
                    HMLog.error$default(null, null, null, a.a, 7, null);
                    return Unit.INSTANCE;
                }
                int i2 = this.c;
                this.a = 1;
                obj = gestureProtocolApiImpl.queryStatus(i2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            GestureTypeFactory.GestureState gestureState = (GestureTypeFactory.GestureState) obj;
            if (gestureState == null) {
                GestureViewModel.this.getGestureTrainState().postValue(null);
            } else {
                GestureViewModel.this.getGestureTrainState().postValue(new GestureTrainStateVo(GestureType.INSTANCE.fromValue(gestureState.getType()), GestureTrainState.INSTANCE.fromValue(gestureState.getState())));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.gesture.GestureViewModel$updateGestureTrainState$1", f = "GestureViewModel.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        private /* synthetic */ Object c;
        public final /* synthetic */ GestureType e;
        public final /* synthetic */ GestureTrainState f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "获取手势Module失败";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.gesture.GestureViewModel$updateGestureTrainState$1$2", f = "GestureViewModel.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ GestureProtocolApiImpl b;
            public final /* synthetic */ GestureViewModel c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(GestureProtocolApiImpl gestureProtocolApiImpl, GestureViewModel gestureViewModel, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = gestureProtocolApiImpl;
                this.c = gestureViewModel;
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
                    Channel<GestureTypeFactory.GestureState> channelListenResult = this.b.listenResult();
                    this.a = 1;
                    obj = channelListenResult.receive(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                GestureTypeFactory.GestureState gestureState = (GestureTypeFactory.GestureState) obj;
                this.c.getGestureTrainState().postValue(new GestureTrainStateVo(GestureType.INSTANCE.fromValue(gestureState.getType()), GestureTrainState.INSTANCE.fromValue(gestureState.getState())));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(GestureType gestureType, GestureTrainState gestureTrainState, Continuation<? super d> continuation) {
            super(2, continuation);
            this.e = gestureType;
            this.f = gestureTrainState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            d dVar = GestureViewModel.this.new d(this.e, this.f, continuation);
            dVar.c = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineScope coroutineScope;
            GestureProtocolApiImpl gestureProtocolApiImpl;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.c;
                HMBaseDevice device = GestureViewModel.this.a().getDevice(HMDeviceType.MILI);
                GestureProtocolApiImpl gestureProtocolApiImpl2 = device == null ? null : (GestureProtocolApiImpl) device.getChannelModule(GestureProtocolApiImpl.class);
                if (gestureProtocolApiImpl2 == null) {
                    HMLog.error$default(null, null, null, a.a, 7, null);
                    return Unit.INSTANCE;
                }
                int type = this.e.getType();
                int statusCode = this.f.getStatusCode();
                this.c = coroutineScope;
                this.a = gestureProtocolApiImpl2;
                this.b = 1;
                if (gestureProtocolApiImpl2.updateTrainStatus(type, statusCode, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                gestureProtocolApiImpl = gestureProtocolApiImpl2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gestureProtocolApiImpl = (GestureProtocolApiImpl) this.a;
                coroutineScope = (CoroutineScope) this.c;
                ResultKt.throwOnFailure(obj);
            }
            e.f(coroutineScope, null, null, new b(gestureProtocolApiImpl, GestureViewModel.this, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GestureViewModel() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.gesture.GestureViewModel$special$$inlined$inject$default$1
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
        this.switchStateLiveData = new MutableLiveData<>();
        this.gestureTrainState = new MutableLiveData<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceManagerApi a() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    public final void disableGesture(int gestureType) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(gestureType, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<GestureTrainStateVo> getGestureTrainState() {
        return this.gestureTrainState;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final MutableLiveData<List<GestureStatusVo>> getSwitchStateLiveData() {
        return this.switchStateLiveData;
    }

    public final void queryAllGestureState() {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(null), 2, null);
    }

    public final void queryGestureTrainState(int gestureType) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new c(gestureType, null), 2, null);
    }

    public final void updateGestureTrainState(@NotNull GestureType type, @NotNull GestureTrainState state) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new d(type, state, null), 2, null);
    }
}
