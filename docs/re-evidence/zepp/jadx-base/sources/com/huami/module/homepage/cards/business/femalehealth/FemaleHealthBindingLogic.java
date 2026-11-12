package com.huami.module.homepage.cards.business.femalehealth;

import android.content.Context;
import androidx.p008lifecycle.LifecycleOwner;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.fhservice.FemaleHealthService;
import com.huami.fhservice.ZeppCalendarStatus;
import com.huami.module.homepage.cards.manager.BindingLogic;
import com.huami.module.homepage.cards.service.CardAssistService;
import com.huami.module.homepage.cards.service.ServiceManager;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.tools.log.StackTraceHelperKt;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010#J\u001c\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/huami/module/homepage/cards/business/femalehealth/FemaleHealthBindingLogic;", "Lcom/huami/module/homepage/cards/manager/BindingLogic;", "Lkotlin/Function1;", "Landroidx/lifecycle/LifecycleOwner;", "", "observer", "a", "bind", "Lcom/huami/module/homepage/cards/business/femalehealth/FemaleHealthCardView;", "getView", "close", "Landroid/content/Context;", "c", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lkotlinx/coroutines/CoroutineScope;", GoogleApiAvailabilityLight.a, "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/huami/fhservice/FemaleHealthService;", "e", "Lcom/huami/fhservice/FemaleHealthService;", "femaleHealthService", "Lcom/huami/module/homepage/cards/service/CardAssistService;", "f", "Lcom/huami/module/homepage/cards/service/CardAssistService;", "assistService", "g", "Lcom/huami/module/homepage/cards/business/femalehealth/FemaleHealthCardView;", "femaleHealthView", "Lkotlinx/coroutines/Job;", "h", "Lkotlinx/coroutines/Job;", "job", "<init>", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class FemaleHealthBindingLogic extends BindingLogic {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final FemaleHealthService femaleHealthService;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final CardAssistService assistService;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final FemaleHealthCardView femaleHealthView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Job job;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/LifecycleOwner;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<LifecycleOwner, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull LifecycleOwner lifecycleOwner) {
            FemaleHealthBindingLogic.this.femaleHealthService.setTriggerLifecycle(4);
            FemaleHealthBindingLogic.this.femaleHealthService.addObserver(lifecycleOwner);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LifecycleOwner lifecycleOwner) {
            a(lifecycleOwner);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\n\u001a\u00020\t2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u008a@"}, d2 = {"", "state", "", "content", "", "Lcom/huami/fhservice/ZeppCalendarStatus;", "calendarState", "", "hasData", "Lcom/huami/module/homepage/cards/business/femalehealth/FemaleHealthEntry;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.femalehealth.FemaleHealthBindingLogic$bind$2$1$1", f = "FemaleHealthBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function5<Integer, String, List<? extends ZeppCalendarStatus>, Boolean, Continuation<? super FemaleHealthEntry>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public /* synthetic */ Object c;
        public /* synthetic */ Object d;
        public /* synthetic */ boolean e;

        public b(Continuation<? super b> continuation) {
            super(5, continuation);
        }

        @Nullable
        public final Object a(@Nullable Integer num, @NotNull String str, @NotNull List<ZeppCalendarStatus> list, boolean z, @Nullable Continuation<? super FemaleHealthEntry> continuation) {
            b bVar = new b(continuation);
            bVar.b = num;
            bVar.c = str;
            bVar.d = list;
            bVar.e = z;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Object invoke(Integer num, String str, List<? extends ZeppCalendarStatus> list, Boolean bool, Continuation<? super FemaleHealthEntry> continuation) {
            return a(num, str, list, bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new FemaleHealthEntry((Integer) this.b, (String) this.c, (List) this.d, this.e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/huami/module/homepage/cards/business/femalehealth/FemaleHealthEntry;", "entry", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.femalehealth.FemaleHealthBindingLogic$bind$3", f = "FemaleHealthBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<FemaleHealthEntry, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ FemaleHealthEntry a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FemaleHealthEntry femaleHealthEntry) {
                super(0);
                this.a = femaleHealthEntry;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "entry:" + this.a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull FemaleHealthEntry femaleHealthEntry, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(femaleHealthEntry, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = FemaleHealthBindingLogic.this.new c(continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FemaleHealthEntry femaleHealthEntry = (FemaleHealthEntry) this.b;
            HMLog.info("FemaleHealthBindingLogic", new a(femaleHealthEntry));
            FemaleHealthBindingLogic.this.femaleHealthView.updateFemaleHealthData(femaleHealthEntry);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/module/homepage/cards/business/femalehealth/FemaleHealthEntry;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.femalehealth.FemaleHealthBindingLogic$bind$4", f = "FemaleHealthBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function3<FlowCollector<? super FemaleHealthEntry>, Throwable, Continuation<? super Unit>, Object> {
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
                return "女性健康数据获取异常：" + StackTraceHelperKt.getStackTraceString(this.a);
            }
        }

        public d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull FlowCollector<? super FemaleHealthEntry> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
            d dVar = new d(continuation);
            dVar.b = th;
            return dVar.invokeSuspend(Unit.INSTANCE);
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
            HMLog.error$default("FemaleHealthBindingLogic", null, null, new a(th), 6, null);
            HomeUtils.recordException(th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/LifecycleOwner;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<LifecycleOwner, Unit> {
        public e() {
            super(1);
        }

        public final void a(@NotNull LifecycleOwner lifecycleOwner) {
            FemaleHealthBindingLogic.this.femaleHealthService.removeObserver(lifecycleOwner);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LifecycleOwner lifecycleOwner) {
            a(lifecycleOwner);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.femalehealth.FemaleHealthBindingLogic$executeObserver$1$1", f = "FemaleHealthBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function1<LifecycleOwner, Unit> b;
        public final /* synthetic */ LifecycleOwner c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super LifecycleOwner, Unit> function1, LifecycleOwner lifecycleOwner, Continuation<? super f> continuation) {
            super(2, continuation);
            this.b = function1;
            this.c = lifecycleOwner;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.invoke(this.c);
            return Unit.INSTANCE;
        }
    }

    public FemaleHealthBindingLogic(@NotNull Context context, @NotNull CoroutineScope coroutineScope) {
        super(coroutineScope);
        this.context = context;
        this.scope = coroutineScope;
        ServiceManager serviceManager = ServiceManager.INSTANCE;
        this.femaleHealthService = serviceManager.getFemaleService();
        this.assistService = serviceManager.getAssistService();
        this.femaleHealthView = new FemaleHealthCardView(context, null, 0, 6, null);
    }

    private final void a(Function1<? super LifecycleOwner, Unit> observer) {
        Object obj = this.context;
        LifecycleOwner lifecycleOwner = obj instanceof LifecycleOwner ? (LifecycleOwner) obj : null;
        if (lifecycleOwner == null) {
            return;
        }
        kotlinx.coroutines.e.f(this.scope, Dispatchers.getMain(), null, new f(observer, lifecycleOwner, null), 2, null);
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    public void bind() {
        a(new a());
        this.job = FlowKt.launchIn(FlowKt.flowOn(FlowKt.m4456catch(ExteranelKt.onMainEach(FlowKt.transformLatest(this.assistService.timeChangeNotifier(), new FemaleHealthBindingLogic$bind$$inlined$flatMapLatest$1(null, this)), new c(null)), new d(null)), Dispatchers.getIO()), this.scope);
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    public void close() {
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.job = null;
        a(new e());
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    @NotNull
    /* JADX INFO: renamed from: getView, reason: from getter */
    public FemaleHealthCardView getFemaleHealthView() {
        return this.femaleHealthView;
    }
}
