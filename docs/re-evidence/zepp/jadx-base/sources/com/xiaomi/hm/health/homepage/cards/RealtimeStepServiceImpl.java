package com.xiaomi.hm.health.homepage.cards;

import androidx.p008lifecycle.FlowLiveDataConversions;
import androidx.p008lifecycle.MutableLiveData;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.event.EventAccountStatus;
import com.huami.module.homepage.cards.service.CurrentStep;
import com.huami.module.homepage.cards.service.RealtimeStepService;
import com.huami.step.koin.KoinExtKt;
import com.huami.step.koin.RealTimeStepLiveData;
import com.huami.step.model.StepInfo;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.event.HMDeviceRealtimeStepEvent;
import com.xiaomi.hm.health.eventbus.EventAppInBackground;
import com.xiaomi.hm.health.eventbus.EventBluetooth;
import com.xiaomi.hm.health.eventbus.EventGoalsUpdated;
import com.xiaomi.hm.health.eventbus.EventTodaySportAnalysisJobFinished;
import de.greenrobot.event.EventBus;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b'\u0010(J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u001e\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0014J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0015J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0016J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0017J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0019J\u001b\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001aH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001e\u001a\u00020\u001dH\u0016R\u001e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lcom/xiaomi/hm/health/homepage/cards/RealtimeStepServiceImpl;", "Lcom/huami/module/homepage/cards/service/RealtimeStepService;", "Lcom/huami/module/homepage/cards/service/CurrentStep;", "currentStep", "", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/profile/base/RealtimeStep;", "realtimeStep", "", "forceRefresh", "e", "a", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "c", "b", "release", "Lcom/xiaomi/hm/health/eventbus/EventBluetooth;", "event", "onEventMainThread", "Lcom/xiaomi/hm/health/eventbus/EventTodaySportAnalysisJobFinished;", "Lcom/huami/account/event/EventAccountStatus;", "Lcom/xiaomi/hm/health/device/event/HMDeviceRealtimeStepEvent;", "Lcom/xiaomi/hm/health/eventbus/EventAppInBackground;", "onEvent", "Lcom/xiaomi/hm/health/eventbus/EventGoalsUpdated;", "Lkotlinx/coroutines/flow/Flow;", "getRealtimeStep", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getRealSyncTime", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "refreshStep", "", "Ljava/lang/Integer;", "currentSteps", "currentDistance", "currentCalories", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class RealtimeStepServiceImpl implements RealtimeStepService {

    @NotNull
    private static final a e = new a(null);

    @Deprecated
    @NotNull
    private static final String f = "RealtimeStepService";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<CurrentStep> refreshStep = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Integer currentSteps = -1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Integer currentDistance = -1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Integer currentCalories = -1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/xiaomi/hm/health/homepage/cards/RealtimeStepServiceImpl$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.ObjectRef<RealtimeStep> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref.ObjectRef<RealtimeStep> objectRef) {
            super(0);
            this.a = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            RealtimeStep realtimeStep = this.a.element;
            return "realtime step from hmdevice manager " + (realtimeStep == null ? null : realtimeStep.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.ObjectRef<RealtimeStep> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Ref.ObjectRef<RealtimeStep> objectRef) {
            super(0);
            this.a = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "totalStep " + this.a.element.getTotalStep();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getBindBaseStep" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/module/homepage/cards/service/CurrentStep;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.homepage.cards.RealtimeStepServiceImpl$getRealtimeStep$2$1", f = "RealtimeStepServiceImpl.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<FlowCollector<? super CurrentStep>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ CurrentStep c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(CurrentStep currentStep, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = currentStep;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            e eVar = new e(this.c, continuation);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super CurrentStep> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.b;
                CurrentStep currentStep = this.c;
                this.a = 1;
                if (flowCollector.emit(currentStep, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceType a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(HMDeviceType hMDeviceType, boolean z) {
            super(0);
            this.a = hMDeviceType;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Today [" + this.a + "] data synced ：" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ EventAppInBackground a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(EventAppInBackground eventAppInBackground) {
            super(0);
            this.a = eventAppInBackground;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "收到前后台切换 " + this.a.isInBackground;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ EventBluetooth a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(EventBluetooth eventBluetooth) {
            super(0);
            this.a = eventBluetooth;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "收到蓝牙连接状态信息 : " + this.a.isOn;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ EventTodaySportAnalysisJobFinished a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(EventTodaySportAnalysisJobFinished eventTodaySportAnalysisJobFinished) {
            super(0);
            this.a = eventTodaySportAnalysisJobFinished;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "收到EventTodaySportAnalysisJobFinished : " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "收到EventAccountStatus消息 ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceRealtimeStepEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(HMDeviceRealtimeStepEvent hMDeviceRealtimeStepEvent) {
            super(0);
            this.a = hMDeviceRealtimeStepEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "收到手环传过来的事实步数变化 : " + this.a.getRealtimeStep();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "return as not major device!!!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ EventGoalsUpdated a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(EventGoalsUpdated eventGoalsUpdated) {
            super(0);
            this.a = eventGoalsUpdated;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "收到运动目标变化 : " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.homepage.cards.RealtimeStepServiceImpl$refreshStep$1", f = "RealtimeStepServiceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ RealtimeStep c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(RealtimeStep realtimeStep, boolean z, Continuation<? super n> continuation) {
            super(2, continuation);
            this.c = realtimeStep;
            this.d = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RealtimeStepServiceImpl.this.new n(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CurrentStep currentStepA = RealtimeStepServiceImpl.this.a(this.c);
            if (Intrinsics.areEqual(RealtimeStepServiceImpl.this.currentSteps, currentStepA == null ? null : Boxing.boxInt(currentStepA.getStep()))) {
                if (Intrinsics.areEqual(RealtimeStepServiceImpl.this.currentDistance, currentStepA == null ? null : Boxing.boxInt(currentStepA.getDistance()))) {
                    if (Intrinsics.areEqual(RealtimeStepServiceImpl.this.currentCalories, currentStepA == null ? null : Boxing.boxInt(currentStepA.getCalorie())) && !this.d) {
                        return Unit.INSTANCE;
                    }
                }
            }
            RealtimeStepServiceImpl.this.currentSteps = currentStepA == null ? null : Boxing.boxInt(currentStepA.getStep());
            RealtimeStepServiceImpl.this.currentDistance = currentStepA == null ? null : Boxing.boxInt(currentStepA.getDistance());
            RealtimeStepServiceImpl.this.currentCalories = currentStepA != null ? Boxing.boxInt(currentStepA.getCalorie()) : null;
            RealtimeStepServiceImpl.this.d(currentStepA);
            return Unit.INSTANCE;
        }
    }

    public RealtimeStepServiceImpl() {
        EventBus.getDefault().registerSticky(this);
        f(this, null, false, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12, types: [T, com.xiaomi.hm.health.bt.profile.base.RealtimeStep] */
    public final CurrentStep a(RealtimeStep realtimeStep) {
        if (!c(b())) {
            return null;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = realtimeStep;
        HMDeviceType majorDeviceType = HMDeviceManager.getInstance().getMajorDeviceType();
        if (objectRef.element == 0) {
            objectRef.element = HMDeviceManager.getInstance().getRealtimeStep(majorDeviceType);
            HMLog.info(f, new b(objectRef));
        }
        if (objectRef.element == 0) {
            return null;
        }
        HMLog.info(f, new c(objectRef));
        if (((RealtimeStep) objectRef.element).isSupportStepExtra()) {
            return new CurrentStep(System.currentTimeMillis(), ((RealtimeStep) objectRef.element).getTotalStep(), ((RealtimeStep) objectRef.element).getTotalDis(), ((RealtimeStep) objectRef.element).getTotalCal());
        }
        int bindBaseStep = HMDeviceUtils.getBindBaseStep();
        HMLog.info(f, new d(bindBaseStep));
        int totalStep = ((RealtimeStep) objectRef.element).getTotalStep() + bindBaseStep;
        int[] disAndCalByStep = HMDeviceUtils.getDisAndCalByStep(totalStep);
        return new CurrentStep(System.currentTimeMillis(), totalStep, disAndCalByStep[0], disAndCalByStep[1]);
    }

    private final HMDeviceType b() {
        return HMDeviceManager.getInstance().getMajorDeviceType();
    }

    private final boolean c(HMDeviceType type) {
        Calendar boundDeviceSyncTime = HMDeviceManager.getInstance().getBoundDeviceSyncTime(type);
        boolean z = TimeUtils.isToday(boundDeviceSyncTime) || boundDeviceSyncTime.getTime().getTime() > SportDay.getToday().getCalendar().getTime().getTime();
        HMLog.info(f, new f(type, z));
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(CurrentStep currentStep) {
        this.refreshStep.postValue(currentStep);
    }

    private final void e(RealtimeStep realtimeStep, boolean forceRefresh) {
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new n(realtimeStep, forceRefresh, null), 2, null);
    }

    public static /* synthetic */ void f(RealtimeStepServiceImpl realtimeStepServiceImpl, RealtimeStep realtimeStep, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            realtimeStep = null;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        realtimeStepServiceImpl.e(realtimeStep, z);
    }

    @Override // com.huami.module.homepage.cards.service.RealtimeStepService
    public long getRealSyncTime() {
        return HMDeviceManager.getInstance().getBoundDeviceSyncTime(b()).getTimeInMillis();
    }

    @Override // com.huami.module.homepage.cards.service.RealtimeStepService
    @Nullable
    public Object getRealtimeStep(@NotNull Continuation<? super Flow<CurrentStep>> continuation) {
        return FlowKt.transformLatest(FlowLiveDataConversions.asFlow(this.refreshStep), new RealtimeStepServiceImpl$getRealtimeStep$$inlined$flatMapLatest$1(null));
    }

    public final void onEvent(@NotNull EventAppInBackground e2) {
        HMLog.info(f, new g(e2));
        if (e2.isInBackground) {
            return;
        }
        f(this, null, false, 3, null);
    }

    public final void onEventMainThread(@NotNull EventBluetooth event) {
        HMLog.info(f, new h(event));
        if (event.isOn) {
            return;
        }
        f(this, null, false, 3, null);
    }

    @Override // com.huami.module.homepage.cards.service.RealtimeStepService
    public void release() {
        EventBus.getDefault().unregister(this);
    }

    public final void onEventMainThread(@NotNull EventTodaySportAnalysisJobFinished event) {
        HMLog.info(f, new i(event));
        f(this, null, false, 3, null);
    }

    public final void onEventMainThread(@NotNull EventAccountStatus event) {
        int status = event.getStatus();
        if (status == 1 || status == 2) {
            HMLog.info(f, j.a);
            f(this, null, false, 3, null);
        }
    }

    public final void onEventMainThread(@NotNull HMDeviceRealtimeStepEvent event) {
        HMLog.info(f, new k(event));
        RealtimeStep realtimeStep = event.getRealtimeStep();
        if (event.getDeviceType() != HMDeviceManager.getInstance().getMajorDeviceType()) {
            HMLog.info(f, l.a);
            return;
        }
        f(this, realtimeStep, false, 2, null);
        RealtimeStep realtimeStep2 = event.getRealtimeStep();
        RealTimeStepLiveData realTimeStep = KoinExtKt.getRealTimeStep();
        if (realTimeStep == null) {
            return;
        }
        StepInfo stepInfo = new StepInfo();
        stepInfo.setSteps(realtimeStep2.getTotalStep());
        stepInfo.setDistance(realtimeStep2.getTotalDis());
        stepInfo.setCal(realtimeStep2.getTotalCal());
        Unit unit = Unit.INSTANCE;
        realTimeStep.postValue(stepInfo);
    }

    public final void onEventMainThread(@NotNull EventGoalsUpdated event) {
        HMLog.info(f, new m(event));
        f(this, null, true, 1, null);
    }
}
