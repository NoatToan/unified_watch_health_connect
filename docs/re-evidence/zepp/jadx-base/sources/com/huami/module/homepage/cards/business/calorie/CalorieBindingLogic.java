package com.huami.module.homepage.cards.business.calorie;

import android.content.Context;
import com.amap.api.mapcore.util.hl;
import com.app.calorie.service.CalorieEntry;
import com.app.calorie.service.CalorieService;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.homepage.cards.helper.CurveChartPoint;
import com.huami.module.homepage.cards.manager.BindingLogic;
import com.huami.module.homepage.cards.service.CardAssistService;
import com.huami.module.homepage.cards.service.RealtimeStepService;
import com.huami.module.homepage.cards.service.ServiceManager;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.TimeExtKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.tools.log.StackTraceHelperKt;
import com.loc.z;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.k;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 32\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b1\u00102J \u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016R\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010*\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-¨\u00064"}, d2 = {"Lcom/huami/module/homepage/cards/business/calorie/CalorieBindingLogic;", "Lcom/huami/module/homepage/cards/manager/BindingLogic;", "", "Lcom/app/calorie/service/CalorieEntry;", "calorieList", "", StatEvent.EventParams.TYPE_CARD_GOAL, "", "c", "Lcom/huami/module/homepage/cards/helper/CurveChartPoint;", "a", "Lcom/huami/module/homepage/cards/business/calorie/CalorieCardView;", "getView", "bind", "close", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lkotlinx/coroutines/CoroutineScope;", GoogleApiAvailabilityLight.a, "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/app/calorie/service/CalorieService;", "e", "Lcom/app/calorie/service/CalorieService;", "service", "", "f", LogUtil.I, "goalCalorie", "Lcom/huami/module/homepage/cards/service/CardAssistService;", "g", "Lcom/huami/module/homepage/cards/service/CardAssistService;", "assistService", "Lcom/huami/module/homepage/cards/service/RealtimeStepService;", "h", "Lcom/huami/module/homepage/cards/service/RealtimeStepService;", "realtimeStepService", "i", "Lkotlin/Lazy;", "b", "()Lcom/huami/module/homepage/cards/business/calorie/CalorieCardView;", "calorieView", "Lkotlinx/coroutines/Job;", z.j, "Lkotlinx/coroutines/Job;", "finishJob", hl.k, "calorieJob", "<init>", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;)V", "l", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class CalorieBindingLogic extends BindingLogic {

    @NotNull
    private static final a l = new a(null);

    @Deprecated
    @NotNull
    private static final String m = "huami.mifit.user.settings.goal.calorie";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final CalorieService service;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int goalCalorie;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final CardAssistService assistService;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final RealtimeStepService realtimeStepService;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy calorieView;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private Job finishJob;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private Job calorieJob;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/module/homepage/cards/business/calorie/CalorieBindingLogic$a", "", "", "GOAL_CALORIE", "Ljava/lang/String;", "<init>", "()V", "homePage_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u008a@"}, d2 = {"", "Lcom/app/calorie/service/CalorieEntry;", "list", "", StatEvent.EventParams.TYPE_CARD_GOAL, "Lkotlin/Pair;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.calorie.CalorieBindingLogic$bind$2$1", f = "CalorieBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function3<List<? extends CalorieEntry>, String, Continuation<? super Pair<? extends List<? extends CalorieEntry>, ? extends String>>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public /* synthetic */ Object c;

        public b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull List<CalorieEntry> list, @Nullable String str, @Nullable Continuation<? super Pair<? extends List<CalorieEntry>, String>> continuation) {
            b bVar = new b(continuation);
            bVar.b = list;
            bVar.c = str;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return TuplesKt.to((List) this.b, (String) this.c);
        }
    }

    /* JADX INFO: renamed from: com.huami.module.homepage.cards.business.calorie.CalorieBindingLogic$bind$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.calorie.CalorieBindingLogic$bind$1", f = "CalorieBindingLogic.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.huami.module.homepage.cards.business.calorie.CalorieBindingLogic$bind$1$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "dataDownloadFinished";
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CalorieBindingLogic.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Unit> flowDataDownloadFinishedNotifier = CalorieBindingLogic.this.assistService.dataDownloadFinishedNotifier();
                final CalorieBindingLogic calorieBindingLogic = CalorieBindingLogic.this;
                FlowCollector<Unit> flowCollector = new FlowCollector<Unit>() { // from class: com.huami.module.homepage.cards.business.calorie.CalorieBindingLogic$bind$1$invokeSuspend$$inlined$collect$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(Unit unit, @NotNull Continuation<? super Unit> continuation) {
                        HMLog.info("CalorieBindingLogic", CalorieBindingLogic.AnonymousClass1.a.a);
                        Calendar calendar = Calendar.getInstance();
                        Date endingTime = TimeExtKt.getEndingTime(calendar);
                        calendar.add(6, -6);
                        calorieBindingLogic.service.checkCalorie(TimeExtKt.getBeginningTime(calendar), endingTime);
                        return Unit.INSTANCE;
                    }
                };
                this.a = 1;
                if (flowDataDownloadFinishedNotifier.collect(flowCollector, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u001a\u0010\u0004\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000H\u008a@"}, d2 = {"Lkotlin/Pair;", "", "Lcom/app/calorie/service/CalorieEntry;", "", "<name for destructuring parameter 0>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.calorie.CalorieBindingLogic$bind$3", f = "CalorieBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<Pair<? extends List<? extends CalorieEntry>, ? extends String>, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ List<CalorieEntry> a;
            public final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<CalorieEntry> list, String str) {
                super(0);
                this.a = list;
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "calorieList:" + this.a + "\ngoal:" + this.b;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull Pair<? extends List<CalorieEntry>, String> pair, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = CalorieBindingLogic.this.new c(continuation);
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
            Pair pair = (Pair) this.b;
            List list = (List) pair.component1();
            String str = (String) pair.component2();
            HMLog.info("CalorieBindingLogic", new a(list, str));
            if (!(list == null || list.isEmpty())) {
                CalorieBindingLogic.this.c(list, str);
                return Unit.INSTANCE;
            }
            CalorieCardView.setCalorieValue$default(CalorieCardView.setUpdateTime$default(CalorieBindingLogic.this.b(), 0L, 1, null), 0, 1, null).setCalorieState(CalorieCardView.State.INSUFFICIENT);
            CalorieBindingLogic.this.b().setCalorieChartView(str != null ? k.toFloatOrNull(str) : null, CollectionsKt__CollectionsKt.emptyList());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007*\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "", "Lcom/app/calorie/service/CalorieEntry;", "", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.calorie.CalorieBindingLogic$bind$4", f = "CalorieBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function3<FlowCollector<? super Pair<? extends List<? extends CalorieEntry>, ? extends String>>, Throwable, Continuation<? super Unit>, Object> {
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
                return "calorie error:" + StackTraceHelperKt.getStackTraceString(this.a);
            }
        }

        public d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull FlowCollector<? super Pair<? extends List<CalorieEntry>, String>> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
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
            HMLog.error$default("CalorieBindingLogic", null, null, new a(th), 6, null);
            HomeUtils.recordException(th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/module/homepage/cards/business/calorie/CalorieCardView;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<CalorieCardView> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CalorieCardView invoke() {
            return new CalorieCardView(CalorieBindingLogic.this.context, null, 0, 6, null);
        }
    }

    public CalorieBindingLogic(@NotNull Context context, @NotNull CoroutineScope coroutineScope) {
        super(coroutineScope);
        this.context = context;
        this.scope = coroutineScope;
        ServiceManager serviceManager = ServiceManager.INSTANCE;
        this.service = serviceManager.getCalorieService();
        this.goalCalorie = serviceManager.getGoalCalorie();
        this.assistService = serviceManager.getAssistService();
        this.realtimeStepService = serviceManager.getRealTimeStepService();
        this.calorieView = LazyKt__LazyJVMKt.lazy(new e());
    }

    private final List<CurveChartPoint> a(List<CalorieEntry> list) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, -6);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            Iterator<T> it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!TimeExtKt.isSameDay(new Date(((CalorieEntry) next).getTime()), calendar.getTime()));
            CalorieEntry calorieEntry = (CalorieEntry) next;
            arrayList.add(new CurveChartPoint(i, calorieEntry == null ? 0.0f : calorieEntry.getCalorie()));
            calendar.add(6, 1);
            if (i2 > 6) {
                return arrayList;
            }
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CalorieCardView b() {
        return (CalorieCardView) this.calorieView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0010  */
    public final void c(List<CalorieEntry> calorieList, String goal) {
        Double dValueOf;
        CalorieEntry calorieEntry;
        Integer numValueOf;
        List<CalorieEntry> list = calorieList.isEmpty() ^ true ? calorieList : null;
        if (list == null) {
            dValueOf = null;
        } else {
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(((CalorieEntry) it2.next()).getCalorie()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((float) ((Number) obj).intValue()) > 0.0f) {
                    arrayList2.add(obj);
                }
            }
            if (!(!arrayList2.isEmpty())) {
                arrayList2 = null;
            }
            if (arrayList2 == null) {
                dValueOf = null;
            } else {
                dValueOf = Double.valueOf(CollectionsKt___CollectionsKt.averageOfInt(arrayList2));
            }
        }
        CalorieEntry calorieEntry2 = (CalorieEntry) CollectionsKt.firstOrNull((List) calorieList);
        if (calorieEntry2 != null) {
            if (!TimeExtKt.isToday(calorieEntry2.getTime())) {
                calorieEntry2 = null;
            }
            if (calorieEntry2 == null) {
                calorieEntry = null;
            } else {
                calorieEntry = new CalorieEntry(this.realtimeStepService.getRealSyncTime(), calorieEntry2.getCalorie(), calorieEntry2.getActivityConsumeRatio());
            }
        } else {
            calorieEntry = null;
        }
        if (calorieEntry == null) {
            calorieEntry = new CalorieEntry(0L, 0, 0.0f);
        }
        CalorieCardView calorieValue = b().setUpdateTime(calorieEntry.getTime()).setCalorieValue(calorieEntry.getCalorie());
        if (goal == null) {
            numValueOf = null;
        } else {
            try {
                numValueOf = Integer.valueOf(Integer.parseInt(goal));
            } catch (NumberFormatException unused) {
                numValueOf = null;
            }
        }
        CalorieCardView ringProgress = calorieValue.setRingProgress(numValueOf == null ? this.goalCalorie : numValueOf.intValue(), calorieEntry.getCalorie());
        float activityConsumeRatio = calorieEntry.getActivityConsumeRatio();
        ringProgress.setCalorieState(0.0f <= activityConsumeRatio && activityConsumeRatio <= 0.15f ? CalorieCardView.State.INSUFFICIENT : 0.15f <= activityConsumeRatio && activityConsumeRatio <= 0.3f ? CalorieCardView.State.STANDARD : CalorieCardView.State.MORE).setSevenDayTips(dValueOf != null ? kotlin.math.c.roundToInt(dValueOf.doubleValue()) : 0);
        b().setCalorieChartView(dValueOf != null ? Float.valueOf((float) dValueOf.doubleValue()) : null, a(calorieList));
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    public void bind() {
        this.finishJob = kotlinx.coroutines.e.f(this.scope, Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
        this.calorieJob = FlowKt.launchIn(FlowKt.flowOn(FlowKt.m4456catch(ExteranelKt.onMainEach(FlowKt.transformLatest(this.assistService.timeChangeNotifier(), new CalorieBindingLogic$bind$$inlined$flatMapLatest$1(null, this)), new c(null)), new d(null)), Dispatchers.getIO()), this.scope);
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    public void close() {
        Job job = this.finishJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.finishJob = null;
        Job job2 = this.calorieJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.calorieJob = null;
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    @NotNull
    /* JADX INFO: renamed from: getView */
    public CalorieCardView getStepCardView() {
        return b();
    }
}
