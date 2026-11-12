package com.huami.module.homepage.cards.business.sportrecord;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.homepage.cards.manager.BindingLogic;
import com.huami.module.homepage.cards.service.CardAssistService;
import com.huami.module.homepage.cards.service.ServiceManager;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.TimeExtKt;
import com.huami.sport.service.SportService;
import com.huami.sport.service.model.HistoryRecord;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.tools.log.StackTraceHelperKt;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b$\u0010%J\u0014\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010#\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/huami/module/homepage/cards/business/sportrecord/SportRecordBindingLogic;", "Lcom/huami/module/homepage/cards/manager/BindingLogic;", "Lkotlin/Pair;", "Ljava/util/Date;", "a", "", "bind", "Lcom/huami/module/homepage/cards/business/sportrecord/SportRecordCardView;", "getView", "close", "Landroid/content/Context;", "c", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lkotlinx/coroutines/CoroutineScope;", GoogleApiAvailabilityLight.a, "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lcom/huami/sport/service/SportService;", "Lcom/huami/sport/service/model/HistoryRecord;", "e", "Lcom/huami/sport/service/SportService;", "sportService", "Lcom/huami/module/homepage/cards/service/CardAssistService;", "f", "Lcom/huami/module/homepage/cards/service/CardAssistService;", "assistService", "Lkotlinx/coroutines/Job;", "g", "Lkotlinx/coroutines/Job;", "sportCountAndDurationJob", "h", "sportRecordJob", "i", "Lcom/huami/module/homepage/cards/business/sportrecord/SportRecordCardView;", "sportRecordView", "<init>", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class SportRecordBindingLogic extends BindingLogic {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final SportService<HistoryRecord> sportService;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final CardAssistService assistService;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private Job sportCountAndDurationJob;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Job sportRecordJob;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private SportRecordCardView sportRecordView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@"}, d2 = {"", "count", "", "duration", "Lkotlin/Pair;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.sportrecord.SportRecordBindingLogic$bind$1$1", f = "SportRecordBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function3<Integer, Long, Continuation<? super Pair<? extends Integer, ? extends Long>>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public /* synthetic */ Object c;

        public a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable Integer num, @Nullable Long l, @Nullable Continuation<? super Pair<Integer, Long>> continuation) {
            a aVar = new a(continuation);
            aVar.b = num;
            aVar.c = l;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return TuplesKt.to((Integer) this.b, (Long) this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\u008a@"}, d2 = {"Lkotlin/Pair;", "", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.sportrecord.SportRecordBindingLogic$bind$2", f = "SportRecordBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<Pair<? extends Integer, ? extends Long>, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Pair<Integer, Long> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Pair<Integer, Long> pair) {
                super(0);
                this.a = pair;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "sportCount:" + this.a.getFirst() + ", sportTime:" + this.a.getSecond();
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull Pair<Integer, Long> pair, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = SportRecordBindingLogic.this.new b(continuation);
            bVar.b = obj;
            return bVar;
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
            HMLog.info("SportRecordBindingLogic", new a(pair));
            SportRecordCardView sportRecordCardView = SportRecordBindingLogic.this.sportRecordView;
            Integer num = (Integer) pair.getFirst();
            int iIntValue = num == null ? 0 : num.intValue();
            Long l = (Long) pair.getSecond();
            sportRecordCardView.updateSportCountAndTimes(iIntValue, l == null ? 0L : l.longValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006*\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "", "", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.sportrecord.SportRecordBindingLogic$bind$3", f = "SportRecordBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function3<FlowCollector<? super Pair<? extends Integer, ? extends Long>>, Throwable, Continuation<? super Unit>, Object> {
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
                return "七天运动次数和时长数据获取异常：" + this.a.getMessage();
            }
        }

        public c(Continuation<? super c> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull FlowCollector<? super Pair<Integer, Long>> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
            c cVar = new c(continuation);
            cVar.b = th;
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
            HMLog.error$default("SportRecordBindingLogic", null, null, new a((Throwable) this.b), 6, null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/huami/sport/service/model/HistoryRecord;", "records", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.sportrecord.SportRecordBindingLogic$bind$5", f = "SportRecordBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<List<? extends HistoryRecord>, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ List<HistoryRecord> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(List<? extends HistoryRecord> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "records:" + this.a;
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable List<? extends HistoryRecord> list, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            d dVar = SportRecordBindingLogic.this.new d(continuation);
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
            List<? extends HistoryRecord> list = (List) this.b;
            HMLog.info("SportRecordBindingLogic", new a(list));
            SportRecordBindingLogic.this.sportRecordView.updateCurrentSportRecord(list);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/huami/sport/service/model/HistoryRecord;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.sportrecord.SportRecordBindingLogic$bind$6", f = "SportRecordBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function3<FlowCollector<? super List<? extends HistoryRecord>>, Throwable, Continuation<? super Unit>, Object> {
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
                return "近两条运动记录数据获取异常：" + StackTraceHelperKt.getStackTraceString(this.a);
            }
        }

        public e(Continuation<? super e> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull FlowCollector<? super List<? extends HistoryRecord>> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
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
            HMLog.error$default("SportRecordBindingLogic", null, null, new a(th), 6, null);
            HomeUtils.recordException(th);
            return Unit.INSTANCE;
        }
    }

    public SportRecordBindingLogic(@NotNull Context context, @NotNull CoroutineScope coroutineScope) {
        super(coroutineScope);
        this.context = context;
        this.coroutineScope = coroutineScope;
        ServiceManager serviceManager = ServiceManager.INSTANCE;
        this.sportService = serviceManager.getSportService();
        this.assistService = serviceManager.getAssistService();
        this.sportRecordView = new SportRecordCardView(context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<Date, Date> a() {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(7);
        calendar.add(6, -(i == 1 ? 6 : i - 2));
        Date beginningTime = TimeExtKt.getBeginningTime(calendar);
        calendar.add(6, 6);
        return TuplesKt.to(beginningTime, TimeExtKt.getEndingTime(calendar));
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    public void bind() {
        this.sportCountAndDurationJob = FlowKt.launchIn(FlowKt.flowOn(FlowKt.m4456catch(ExteranelKt.onMainEach(FlowKt.transformLatest(this.assistService.timeChangeNotifier(), new SportRecordBindingLogic$bind$$inlined$flatMapLatest$1(null, this)), new b(null)), new c(null)), Dispatchers.getIO()), this.coroutineScope);
        this.sportRecordJob = FlowKt.launchIn(FlowKt.flowOn(FlowKt.m4456catch(ExteranelKt.onMainEach(FlowKt.transformLatest(this.assistService.unitChangeNotifier(), new SportRecordBindingLogic$bind$$inlined$flatMapLatest$2(null, this)), new d(null)), new e(null)), Dispatchers.getIO()), this.coroutineScope);
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    public void close() {
        Job job = this.sportCountAndDurationJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.sportCountAndDurationJob = null;
        Job job2 = this.sportRecordJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.sportRecordJob = null;
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    @NotNull
    /* JADX INFO: renamed from: getView, reason: from getter */
    public SportRecordCardView getSportRecordView() {
        return this.sportRecordView;
    }
}
