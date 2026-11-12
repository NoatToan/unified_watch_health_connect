package com.huami.module.homepage.cards.business.step;

import android.content.Context;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.homepage.cards.manager.BindingLogic;
import com.huami.module.homepage.cards.service.CardAssistService;
import com.huami.module.homepage.cards.service.CurrentStep;
import com.huami.module.homepage.cards.service.RealtimeStepService;
import com.huami.module.homepage.cards.service.ServiceManager;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.TimeExtKt;
import com.huami.step.service.StepEntry;
import com.huami.step.service.StepService;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.tools.log.StackTraceHelperKt;
import com.loc.z;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b/\u00100J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u001a\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010,\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u00061"}, d2 = {"Lcom/huami/module/homepage/cards/business/step/StepBindingLogic;", "Lcom/huami/module/homepage/cards/manager/BindingLogic;", "", "Lcom/huami/step/service/StepEntry;", "stepList", "Lcom/huami/module/homepage/cards/business/step/StepUiData;", GoogleApiAvailabilityLight.a, "data", "Lcom/huami/module/homepage/cards/service/CurrentStep;", "realtimeStep", "", "a", "e", "", "b", "c", "Lcom/huami/module/homepage/cards/business/step/StepCardView;", "getView", "bind", "close", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/huami/step/service/StepService;", "Lcom/huami/step/service/StepService;", "stepService", "Lcom/huami/module/homepage/cards/service/RealtimeStepService;", "Lcom/huami/module/homepage/cards/service/RealtimeStepService;", "realtimeStepService", "Lcom/huami/module/homepage/cards/service/CardAssistService;", "f", "Lcom/huami/module/homepage/cards/service/CardAssistService;", "assistService", "Lkotlinx/coroutines/Job;", "g", "Lkotlinx/coroutines/Job;", "job", "h", LogUtil.I, "currentSteps", "i", "currentStepGoal", z.j, "Lcom/huami/module/homepage/cards/business/step/StepCardView;", "stepCardView", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class StepBindingLogic extends BindingLogic {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final StepService stepService;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final RealtimeStepService realtimeStepService;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final CardAssistService assistService;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private Job job;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int currentSteps;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int currentStepGoal;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final StepCardView stepCardView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.step.StepBindingLogic$1", f = "StepBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return StepBindingLogic.this.new a(continuation);
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
            StepBindingLogic.this.stepCardView.initView();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous parameter 0>", "<anonymous parameter 1>", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.step.StepBindingLogic$bind$1", f = "StepBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function3<Unit, Unit, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull Unit unit, @NotNull Unit unit2, @Nullable Continuation<? super Unit> continuation) {
            return new b(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u008a@"}, d2 = {"", "Lcom/huami/step/service/StepEntry;", "stepList", "Lcom/huami/module/homepage/cards/service/CurrentStep;", "realtimeStep", "Lkotlin/Pair;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.step.StepBindingLogic$bind$2$1", f = "StepBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function3<List<? extends StepEntry>, CurrentStep, Continuation<? super Pair<? extends List<? extends StepEntry>, ? extends CurrentStep>>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public /* synthetic */ Object c;

        public c(Continuation<? super c> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull List<StepEntry> list, @Nullable CurrentStep currentStep, @Nullable Continuation<? super Pair<? extends List<StepEntry>, CurrentStep>> continuation) {
            c cVar = new c(continuation);
            cVar.b = list;
            cVar.c = currentStep;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new Pair((List) this.b, (CurrentStep) this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u001a\u0010\u0004\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000H\u008a@"}, d2 = {"Lkotlin/Pair;", "", "Lcom/huami/step/service/StepEntry;", "Lcom/huami/module/homepage/cards/service/CurrentStep;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.step.StepBindingLogic$bind$3", f = "StepBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<Pair<? extends List<? extends StepEntry>, ? extends CurrentStep>, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull Pair<? extends List<StepEntry>, CurrentStep> pair, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            d dVar = StepBindingLogic.this.new d(continuation);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Pair pair = (Pair) this.b;
            StepBindingLogic stepBindingLogic = StepBindingLogic.this;
            stepBindingLogic.a(stepBindingLogic.d((List) pair.getFirst()), (CurrentStep) pair.getSecond());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007*\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "", "Lcom/huami/step/service/StepEntry;", "Lcom/huami/module/homepage/cards/service/CurrentStep;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.step.StepBindingLogic$bind$4", f = "StepBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function3<FlowCollector<? super Pair<? extends List<? extends StepEntry>, ? extends CurrentStep>>, Throwable, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "步数数据获取异常：" + StackTraceHelperKt.getStackTraceString(this.a);
            }
        }

        public e(Continuation<? super e> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull FlowCollector<? super Pair<? extends List<StepEntry>, CurrentStep>> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
            e eVar = new e(continuation);
            eVar.b = th;
            return eVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Throwable th = (Throwable) this.b;
            HMLog.error$default("StepBindingLogic", null, null, new a(th), 6, null);
            HomeUtils.recordException(th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ StepUiData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(StepUiData stepUiData) {
            super(0);
            this.a = stepUiData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "StepUiData:" + this.a.getStepOfToday();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ CurrentStep a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(CurrentStep currentStep) {
            super(0);
            this.a = currentStep;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "realtimeStep:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ List<StepEntry> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List<StepEntry> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "step list:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ Ref.IntRef b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(long j, Ref.IntRef intRef, int i, int i2) {
            super(0);
            this.a = j;
            this.b = intRef;
            this.c = i;
            this.d = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "update today step info--> time:" + this.a + ", step:" + this.b.element + ", distance:" + this.c + ", calorie:" + this.d;
        }
    }

    public StepBindingLogic(@NotNull Context context, @NotNull CoroutineScope coroutineScope) {
        super(coroutineScope);
        this.scope = coroutineScope;
        ServiceManager serviceManager = ServiceManager.INSTANCE;
        this.stepService = serviceManager.getStepService();
        this.realtimeStepService = serviceManager.getRealTimeStepService();
        this.assistService = serviceManager.getAssistService();
        this.currentSteps = -1;
        this.currentStepGoal = -1;
        this.stepCardView = new StepCardView(context, null, 0, 6, null);
        kotlinx.coroutines.e.f(coroutineScope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(StepUiData data, CurrentStep realtimeStep) {
        HMLog.info("StepBindingLogic", new f(data));
        HMLog.info("StepBindingLogic", new g(realtimeStep));
        e(data, realtimeStep);
        this.stepCardView.updateChartView(data, realtimeStep == null ? null : Integer.valueOf(realtimeStep.getStep()));
    }

    private final int b() {
        return HMPersonInfo.getInstance().getMiliConfig().getGoalStepsCount();
    }

    private final List<StepEntry> c(List<StepEntry> list) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, -6);
        int i2 = 0;
        do {
            i2++;
            Iterator<T> it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!TimeExtKt.isSameDay(new Date(((StepEntry) next).getTime()), calendar.getTime()));
            StepEntry stepEntry = (StepEntry) next;
            arrayList.add(new StepEntry(calendar.getTimeInMillis(), stepEntry == null ? 0 : stepEntry.getStep(), stepEntry == null ? 0 : stepEntry.getDistance(), stepEntry == null ? 0 : stepEntry.getCalorie()));
            calendar.add(6, 1);
        } while (i2 <= 6);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StepUiData d(List<StepEntry> stepList) {
        List<StepEntry> listSortedWith = CollectionsKt___CollectionsKt.sortedWith(stepList, new Comparator() { // from class: com.huami.module.homepage.cards.business.step.StepBindingLogic$stepsToUiData$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((StepEntry) t2).getTime()), Long.valueOf(((StepEntry) t).getTime()));
            }
        });
        HMLog.info("StepBindingLogic", new h(listSortedWith));
        if (listSortedWith.isEmpty()) {
            return new StepUiData(new StepEntry(0L, 0, 0, 0), CollectionsKt__CollectionsKt.emptyList());
        }
        Calendar calendar = Calendar.getInstance();
        List<StepEntry> listC = c(listSortedWith);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listC, 10));
        int i2 = 0;
        for (Object obj : listC) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            StepEntry stepEntry = (StepEntry) obj;
            calendar.setTimeInMillis(stepEntry.getTime());
            arrayList.add(new Point(i2, stepEntry.getStep()));
            i2 = i3;
        }
        return new StepUiData(listSortedWith.get(0), arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0090 A[PHI: r1
      0x0090: PHI (r1v8 java.lang.Long) = (r1v7 java.lang.Long), (r1v15 java.lang.Long) binds: [B:26:0x0071, B:31:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    private final void e(StepUiData data, CurrentStep realtimeStep) {
        int iIntValue;
        long jLongValue;
        Triple triple;
        Ref.IntRef intRef = new Ref.IntRef();
        Integer numValueOf = realtimeStep == null ? null : Integer.valueOf(realtimeStep.getStep());
        if (numValueOf == null) {
            StepEntry stepOfToday = data.getStepOfToday();
            if (!TimeExtKt.isToday(stepOfToday.getTime())) {
                stepOfToday = null;
            }
            iIntValue = stepOfToday == null ? 0 : stepOfToday.getStep();
        } else {
            iIntValue = numValueOf.intValue();
        }
        intRef.element = iIntValue;
        if (realtimeStep != null || (TimeExtKt.isToday(data.getStepOfToday().getTime()) && data.getStepOfToday().getStep() != 0)) {
            Long lValueOf = realtimeStep == null ? null : Long.valueOf(realtimeStep.getTime());
            if (lValueOf == null) {
                lValueOf = Long.valueOf(this.realtimeStepService.getRealSyncTime());
                if (!TimeExtKt.isToday(lValueOf.longValue())) {
                    lValueOf = null;
                }
                if (lValueOf == null) {
                    jLongValue = System.currentTimeMillis();
                } else {
                    jLongValue = lValueOf.longValue();
                }
            } else {
                jLongValue = lValueOf.longValue();
            }
            Long lValueOf2 = Long.valueOf(jLongValue);
            Integer numValueOf2 = realtimeStep == null ? null : Integer.valueOf(realtimeStep.getDistance());
            Integer numValueOf3 = Integer.valueOf(numValueOf2 == null ? data.getStepOfToday().getDistance() : numValueOf2.intValue());
            Integer numValueOf4 = realtimeStep != null ? Integer.valueOf(realtimeStep.getCalorie()) : null;
            triple = new Triple(lValueOf2, numValueOf3, Integer.valueOf(numValueOf4 == null ? data.getStepOfToday().getCalorie() : numValueOf4.intValue()));
        } else {
            intRef.element = 0;
            triple = new Triple(0L, 0, 0);
        }
        long jLongValue2 = ((Number) triple.component1()).longValue();
        int iIntValue2 = ((Number) triple.component2()).intValue();
        int iIntValue3 = ((Number) triple.component3()).intValue();
        HMLog.info("StepBindingLogic", new i(jLongValue2, intRef, iIntValue2, iIntValue3));
        this.stepCardView.updateCurrentTimeAndData(jLongValue2, intRef.element, iIntValue2, iIntValue3);
        if (this.currentSteps == intRef.element && this.currentStepGoal == b()) {
            return;
        }
        this.currentSteps = intRef.element;
        int iB = b();
        this.currentStepGoal = iB;
        this.stepCardView.updateStepRing(iB, this.currentSteps);
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    public void bind() {
        FlowKt.launchIn(FlowKt.flowOn(FlowKt.m4456catch(ExteranelKt.onMainEach(FlowKt.transformLatest(FlowKt.flowCombine(this.assistService.unitChangeNotifier(), this.assistService.timeChangeNotifier(), new b(null)), new StepBindingLogic$bind$$inlined$flatMapLatest$1(null, this)), new d(null)), new e(null)), Dispatchers.getIO()), this.scope);
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    public void close() {
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.job = null;
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    @NotNull
    /* JADX INFO: renamed from: getView, reason: from getter */
    public StepCardView getSleepBreathView() {
        return this.stepCardView;
    }
}
