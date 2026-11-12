package com.huami.sky.ui.realtime.weekplan.ui;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.ktx.TimeExtKt;
import com.huami.sky.lib.cache.SkyPlayCache;
import com.huami.sky.lib.repo.weekplan.IWeekPlanRepo;
import com.huami.sky.lib.repo.weekplan.WeekPlanRepoImpl;
import com.huami.tools.log.HMLog;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0018\n\u0002\b\t\u0018\u0000 ,2\u00020\u0001:\u0001,B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0012\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002J\u0010\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u0010\u001a\u0004\u0018\u00010\fJ\u0006\u0010\u0011\u001a\u00020\nJ\u001c\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\u0014\u001a\u00020\nJ\u0006\u0010\u0015\u001a\u00020\u0002J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\nJ\u0006\u0010\u0019\u001a\u00020\nJ\u0006\u0010\u001a\u001a\u00020\u0002R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u001f\u0010)\u001a\b\u0012\u0004\u0012\u00020$0\u00168\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006-"}, d2 = {"Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanDataSource;", "", "", "a", "Ljava/util/Date;", "date", "", "getDateMarked", "day", "nextDay", "", "markDate", "", "dateStr", "addStartDate", "setStartDate", "getStartDate", "clearStartDate", "Lkotlin/Pair;", "refreshWeekList", "refreshChannel", "getProgress", "Lkotlinx/coroutines/flow/Flow;", "getProgressFlow", "refreshProgressChannel", "saveWeekPlanRound", "getWeekPlanRound", "Lcom/huami/sky/lib/repo/weekplan/IWeekPlanRepo;", "Lcom/huami/sky/lib/repo/weekplan/IWeekPlanRepo;", "iWeekPlanRepo", "Lkotlinx/coroutines/channels/Channel;", "b", "Lkotlinx/coroutines/channels/Channel;", "_weekPlanChannel", "c", "_weekPlanProgressChannel", "", GoogleApiAvailabilityLight.a, "Lkotlinx/coroutines/flow/Flow;", "getWeekPlanFlow", "()Lkotlinx/coroutines/flow/Flow;", "weekPlanFlow", "<init>", "(Lcom/huami/sky/lib/repo/weekplan/IWeekPlanRepo;)V", "Companion", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class WeekPlanDataSource {

    @NotNull
    private static final String e = "week.plan.round.key";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IWeekPlanRepo iWeekPlanRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Channel<Unit> _weekPlanChannel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Channel<Unit> _weekPlanProgressChannel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Flow<boolean[]> weekPlanFlow;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.realtime.weekplan.ui.WeekPlanDataSource$getProgressFlow$2", f = "WeekPlanDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ int b;

        /* JADX INFO: renamed from: com.huami.sky.ui.realtime.weekplan.ui.WeekPlanDataSource$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0569a extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0569a(int i) {
                super(0);
                this.a = i;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return " progress " + this.a;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Nullable
        public final Object a(int i, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(continuation);
            aVar.b = ((Number) obj).intValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return a(num.intValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMLog.info(WeekPlanRepoImpl.TAG, new C0569a(this.b));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.realtime.weekplan.ui.WeekPlanDataSource$getProgressFlow$3", f = "WeekPlanDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function3<FlowCollector<? super Integer>, Throwable, Continuation<? super Unit>, Object> {
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
                return " progress flow exception" + this.a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull FlowCollector<? super Integer> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
            b bVar = new b(continuation);
            bVar.b = th;
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
            HMLog.info(WeekPlanRepoImpl.TAG, new a((Throwable) this.b));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "DataSource progress " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "strSet " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "boolean array " + this.a;
        }
    }

    public WeekPlanDataSource(@NotNull IWeekPlanRepo iWeekPlanRepo) {
        this.iWeekPlanRepo = iWeekPlanRepo;
        Channel<Unit> channelChannel$default = ChannelKt.Channel$default(1, null, null, 6, null);
        this._weekPlanChannel = channelChannel$default;
        this._weekPlanProgressChannel = ChannelKt.Channel$default(1, null, null, 6, null);
        final Flow flowReceiveAsFlow = FlowKt.receiveAsFlow(channelChannel$default);
        final Flow<List<? extends String>> flow = new Flow<List<? extends String>>() { // from class: com.huami.sky.ui.realtime.weekplan.ui.WeekPlanDataSource$special$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.sky.ui.realtime.weekplan.ui.WeekPlanDataSource$special$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<Unit> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ WeekPlanDataSource b;

                /* JADX INFO: renamed from: com.huami.sky.ui.realtime.weekplan.ui.WeekPlanDataSource$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.sky.ui.realtime.weekplan.ui.WeekPlanDataSource$special$$inlined$map$1$2", f = "WeekPlanDataSource.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, WeekPlanDataSource weekPlanDataSource) {
                    this.a = flowCollector;
                    this.b = weekPlanDataSource;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(Unit unit, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.a;
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.b;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.a;
                        List<String> markedDate = this.b.iWeekPlanRepo.getMarkedDate();
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(markedDate, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super List<? extends String>> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowReceiveAsFlow.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        this.weekPlanFlow = new Flow<boolean[]>() { // from class: com.huami.sky.ui.realtime.weekplan.ui.WeekPlanDataSource$special$$inlined$map$2

            /* JADX INFO: renamed from: com.huami.sky.ui.realtime.weekplan.ui.WeekPlanDataSource$special$$inlined$map$2$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<List<? extends String>> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ WeekPlanDataSource b;

                /* JADX INFO: renamed from: com.huami.sky.ui.realtime.weekplan.ui.WeekPlanDataSource$special$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.sky.ui.realtime.weekplan.ui.WeekPlanDataSource$special$$inlined$map$2$2", f = "WeekPlanDataSource.kt", i = {}, l = {158}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, WeekPlanDataSource weekPlanDataSource) {
                    this.a = flowCollector;
                    this.b = weekPlanDataSource;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(List<? extends String> list, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.a;
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.b;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.a;
                        List<? extends String> list2 = list;
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            HMLog.info(WeekPlanRepoImpl.TAG, new WeekPlanDataSource.d((String) it2.next()));
                        }
                        Pair<Date, Date> pairRefreshWeekList = this.b.refreshWeekList(7);
                        boolean[] zArr = new boolean[7];
                        for (int i3 = 0; i3 < 7; i3++) {
                            zArr[i3] = false;
                        }
                        if (pairRefreshWeekList != null) {
                            Date date = new Date();
                            if (date.after(pairRefreshWeekList.getFirst()) && date.before(pairRefreshWeekList.getSecond())) {
                                Date first = pairRefreshWeekList.getFirst();
                                int i4 = 0;
                                while (true) {
                                    int i5 = i4 + 1;
                                    String timeString$default = TimeExtKt.toTimeString$default(this.b.nextDay(first, i4), (String) null, (Locale) null, 3, (Object) null);
                                    if (timeString$default != null) {
                                        zArr[i4] = list2.contains(timeString$default);
                                    }
                                    if (i5 > 6) {
                                        break;
                                    }
                                    i4 = i5;
                                }
                            }
                        }
                        for (int i6 = 0; i6 < 7; i6++) {
                            HMLog.info(WeekPlanRepoImpl.TAG, new WeekPlanDataSource.e(Boxing.boxBoolean(zArr[i6]).booleanValue()));
                        }
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(zArr, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super boolean[]> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    private final int a() {
        try {
            Result.Companion companion = Result.Companion;
            Date date = new Date();
            Pair<Date, Date> pairRefreshWeekList = refreshWeekList(7);
            if (pairRefreshWeekList == null) {
                return Integer.MIN_VALUE;
            }
            int iTimeIntervalDays = TimeExtKt.timeIntervalDays(date, pairRefreshWeekList.getFirst());
            HMLog.info(WeekPlanRepoImpl.TAG, new c(iTimeIntervalDays));
            return iTimeIntervalDays;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                objM3845constructorimpl = Integer.MIN_VALUE;
            }
            return ((Number) objM3845constructorimpl).intValue();
        }
    }

    public static /* synthetic */ void markDate$default(WeekPlanDataSource weekPlanDataSource, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            date = new Date();
        }
        weekPlanDataSource.markDate(date);
    }

    public final void addStartDate(@NotNull String dateStr) {
        String startDate = this.iWeekPlanRepo.getStartDate();
        if (startDate == null || startDate.length() == 0) {
            this.iWeekPlanRepo.addStartDate(dateStr);
        }
    }

    public final void clearStartDate() {
        this.iWeekPlanRepo.clearStartDate();
    }

    public final boolean getDateMarked(@NotNull Date date) {
        String timeString$default = TimeExtKt.toTimeString$default(date, (String) null, (Locale) null, 3, (Object) null);
        if (timeString$default == null) {
            return false;
        }
        return this.iWeekPlanRepo.getMarkedDate().contains(timeString$default);
    }

    public final int getProgress() {
        int iA = a();
        if (iA == Integer.MIN_VALUE) {
            return -1;
        }
        if (iA < 0) {
            return -2;
        }
        boolean z = false;
        if (iA >= 0 && iA <= 6) {
            z = true;
        }
        if (z) {
            return iA;
        }
        return 7;
    }

    @NotNull
    public final Flow<Integer> getProgressFlow() {
        final Flow flowReceiveAsFlow = FlowKt.receiveAsFlow(this._weekPlanProgressChannel);
        return FlowKt.m4456catch(FlowKt.onEach(new Flow<Integer>() { // from class: com.huami.sky.ui.realtime.weekplan.ui.WeekPlanDataSource$getProgressFlow$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.sky.ui.realtime.weekplan.ui.WeekPlanDataSource$getProgressFlow$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<Unit> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ WeekPlanDataSource b;

                /* JADX INFO: renamed from: com.huami.sky.ui.realtime.weekplan.ui.WeekPlanDataSource$getProgressFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.sky.ui.realtime.weekplan.ui.WeekPlanDataSource$getProgressFlow$$inlined$map$1$2", f = "WeekPlanDataSource.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, WeekPlanDataSource weekPlanDataSource) {
                    this.a = flowCollector;
                    this.b = weekPlanDataSource;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(Unit unit, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.a;
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.b;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.a;
                        Integer numBoxInt = Boxing.boxInt(this.b.getProgress());
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(numBoxInt, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super Integer> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowReceiveAsFlow.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new a(null)), new b(null));
    }

    @Nullable
    public final String getStartDate() {
        return this.iWeekPlanRepo.getStartDate();
    }

    @NotNull
    public final Flow<boolean[]> getWeekPlanFlow() {
        return this.weekPlanFlow;
    }

    public final int getWeekPlanRound() {
        return SkyPlayCache.INSTANCE.getInstance().getIntWithUserId(e, 1);
    }

    public final void markDate(@NotNull Date date) {
        this.iWeekPlanRepo.markDate(date, true);
        this._weekPlanChannel.mo4435trySendJP2dKIU(Unit.INSTANCE);
    }

    @NotNull
    public final Date nextDay(@NotNull Date date, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(6, i);
        return calendar.getTime();
    }

    public final void refreshChannel() {
        this._weekPlanChannel.mo4435trySendJP2dKIU(Unit.INSTANCE);
    }

    public final void refreshProgressChannel() {
        this._weekPlanProgressChannel.mo4435trySendJP2dKIU(Unit.INSTANCE);
    }

    @Nullable
    public final Pair<Date, Date> refreshWeekList(int day) {
        return this.iWeekPlanRepo.refreshWeekList(day);
    }

    public final void saveWeekPlanRound() {
        SkyPlayCache.INSTANCE.getInstance().saveIntWithUserId(e, getWeekPlanRound() + 1);
    }

    public final void setStartDate(@NotNull String dateStr) {
        this.iWeekPlanRepo.addStartDate(dateStr);
        refreshProgressChannel();
    }
}
