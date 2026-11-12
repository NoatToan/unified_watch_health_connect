package com.huami.sky.ui.realtime.recommendelement;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.heartrate.service.HeartRateInfo;
import com.huami.heartrate.service.HeartRateStatisticalInfo;
import com.huami.heartrate.service.IHeartRateService;
import com.huami.module.ktx.TimeExtKt;
import com.huami.sleep.service.SleepService;
import com.huami.step.service.StepEntry;
import com.huami.step.service.StepService;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.Constant;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 22\u00020\u0001:\u00012B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002R\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u001b\u0010\u0010R\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u000bR\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\r8\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u000e\u001a\u0004\b!\u0010\u0010R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u000bR\u001f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001d0\r8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010\u000e\u001a\u0004\b&\u0010\u0010R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00063"}, d2 = {"Lcom/huami/sky/ui/realtime/recommendelement/RecommendElementViewModel;", "Landroidx/lifecycle/ViewModel;", "", "b", "c", "a", "Lcom/huami/sky/ui/realtime/recommendelement/RecommendServiceUsecase;", "Lcom/huami/sky/ui/realtime/recommendelement/RecommendServiceUsecase;", "recommendUseCase", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/sky/ui/realtime/recommendelement/RecommendElementStyle;", "Landroidx/lifecycle/MutableLiveData;", "_styleLiveData", "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/LiveData;", "getStyleLiveData", "()Landroidx/lifecycle/LiveData;", "styleLiveData", "", GoogleApiAvailabilityLight.a, "_restHrLiveData", "e", "getRestHrLiveData", "restHrLiveData", "f", "_stepLiveData", "g", "getStepLiveData", "stepLiveData", "", "h", "_wakeUpLiveData", "i", "getWakeUpLiveData", "wakeUpLiveData", z.j, "_sleepLiveData", hl.k, "getSleepLiveData", "sleepLiveData", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "l", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "recommendExceptionHandler", "Lkotlinx/coroutines/CoroutineScope;", "m", "Lkotlinx/coroutines/CoroutineScope;", "recommendScope", "<init>", "(Lcom/huami/sky/ui/realtime/recommendelement/RecommendServiceUsecase;)V", "Companion", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class RecommendElementViewModel extends ViewModel {

    @NotNull
    private static final String n = "Recommendelement";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final RecommendServiceUsecase recommendUseCase;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<RecommendElementStyle> _styleLiveData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LiveData<RecommendElementStyle> styleLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> _restHrLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Integer> restHrLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> _stepLiveData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Integer> stepLiveData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Long> _wakeUpLiveData;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Long> wakeUpLiveData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Long> _sleepLiveData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Long> sleepLiveData;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final CoroutineExceptionHandler recommendExceptionHandler;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope recommendScope;

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
            return "error " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", Constant.PAI_KEY_RHR, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.realtime.recommendelement.RecommendElementViewModel$startHrService$2", f = "RecommendElementViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Integer a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Integer num) {
                super(0);
                this.a = num;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "rest value " + this.a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable Integer num, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(num, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = RecommendElementViewModel.this.new b(continuation);
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
            Integer num = (Integer) this.b;
            HMLog.info(RecommendElementViewModel.n, new a(num));
            if (num != null) {
                RecommendElementViewModel recommendElementViewModel = RecommendElementViewModel.this;
                int iIntValue = num.intValue();
                if (iIntValue > 0) {
                    recommendElementViewModel._styleLiveData.postValue(ValueRecommendElementStyle.INSTANCE);
                    recommendElementViewModel._restHrLiveData.postValue(Boxing.boxInt(iIntValue));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.realtime.recommendelement.RecommendElementViewModel$startHrService$3", f = "RecommendElementViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function3<FlowCollector<? super Integer>, Throwable, Continuation<? super Unit>, Object> {
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
                return "rest error " + this.a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull FlowCollector<? super Integer> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
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
            HMLog.info(RecommendElementViewModel.n, new a((Throwable) this.b));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.realtime.recommendelement.RecommendElementViewModel$startSleepService$1", f = "RecommendElementViewModel.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Pair<Long, Long> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Pair<Long, Long> pair) {
                super(0);
                this.a = pair;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "sleep value " + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RecommendElementViewModel.this.new d(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0042  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Pair pair;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SleepService sleepService = RecommendElementViewModel.this.recommendUseCase.getSleepService();
                if (sleepService == null) {
                    pair = null;
                } else {
                    long j = this.c;
                    this.a = 1;
                    obj = sleepService.fetchMainSleepFallAndWakeTimestamp(j, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                HMLog.info(RecommendElementViewModel.n, new a(pair));
                if (pair != null) {
                    RecommendElementViewModel recommendElementViewModel = RecommendElementViewModel.this;
                    recommendElementViewModel._styleLiveData.postValue(ValueRecommendElementStyle.INSTANCE);
                    recommendElementViewModel._wakeUpLiveData.postValue(pair.getSecond());
                    recommendElementViewModel._sleepLiveData.postValue(pair.getFirst());
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            pair = (Pair) obj;
            HMLog.info(RecommendElementViewModel.n, new a(pair));
            if (pair != null) {
                RecommendElementViewModel recommendElementViewModel2 = RecommendElementViewModel.this;
                recommendElementViewModel2._styleLiveData.postValue(ValueRecommendElementStyle.INSTANCE);
                recommendElementViewModel2._wakeUpLiveData.postValue(pair.getSecond());
                recommendElementViewModel2._sleepLiveData.postValue(pair.getFirst());
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/huami/step/service/StepEntry;", "stepList", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.realtime.recommendelement.RecommendElementViewModel$startStepService$1", f = "RecommendElementViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<List<? extends StepEntry>, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ List<StepEntry> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<StepEntry> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "step value " + CollectionsKt.firstOrNull((List<? extends Object>) this.a);
            }
        }

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull List<StepEntry> list, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            e eVar = RecommendElementViewModel.this.new e(continuation);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List list = (List) this.b;
            HMLog.info(RecommendElementViewModel.n, new a(list));
            StepEntry stepEntry = (StepEntry) CollectionsKt.firstOrNull(list);
            if (stepEntry != null) {
                RecommendElementViewModel recommendElementViewModel = RecommendElementViewModel.this;
                if (stepEntry.getStep() > 0) {
                    recommendElementViewModel._styleLiveData.postValue(ValueRecommendElementStyle.INSTANCE);
                    recommendElementViewModel._stepLiveData.postValue(Boxing.boxInt(stepEntry.getStep()));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/huami/step/service/StepEntry;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.realtime.recommendelement.RecommendElementViewModel$startStepService$2", f = "RecommendElementViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function3<FlowCollector<? super List<? extends StepEntry>>, Throwable, Continuation<? super Unit>, Object> {
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
                return "step error " + this.a;
            }
        }

        public f(Continuation<? super f> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull FlowCollector<? super List<StepEntry>> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
            f fVar = new f(continuation);
            fVar.b = th;
            return fVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMLog.info(RecommendElementViewModel.n, new a((Throwable) this.b));
            return Unit.INSTANCE;
        }
    }

    public RecommendElementViewModel(@NotNull RecommendServiceUsecase recommendServiceUsecase) {
        this.recommendUseCase = recommendServiceUsecase;
        MutableLiveData<RecommendElementStyle> mutableLiveData = new MutableLiveData<>();
        this._styleLiveData = mutableLiveData;
        this.styleLiveData = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        this._restHrLiveData = mutableLiveData2;
        this.restHrLiveData = mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3 = new MutableLiveData<>();
        this._stepLiveData = mutableLiveData3;
        this.stepLiveData = mutableLiveData3;
        MutableLiveData<Long> mutableLiveData4 = new MutableLiveData<>();
        this._wakeUpLiveData = mutableLiveData4;
        this.wakeUpLiveData = mutableLiveData4;
        MutableLiveData<Long> mutableLiveData5 = new MutableLiveData<>();
        this._sleepLiveData = mutableLiveData5;
        this.sleepLiveData = mutableLiveData5;
        RecommendElementViewModel$special$$inlined$CoroutineExceptionHandler$1 recommendElementViewModel$special$$inlined$CoroutineExceptionHandler$1 = new RecommendElementViewModel$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE);
        this.recommendExceptionHandler = recommendElementViewModel$special$$inlined$CoroutineExceptionHandler$1;
        this.recommendScope = CoroutineScopeKt.CoroutineScope(ViewModelKt.getViewModelScope(this).getCoroutineContext().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)).plus(recommendElementViewModel$special$$inlined$CoroutineExceptionHandler$1));
        a();
        c();
        b();
    }

    private final void a() {
        final Flow<HeartRateInfo> flowLoadHeartRateInfo;
        Flow flowFlowOn;
        Flow flowOnEach;
        Flow flowM4456catch;
        IHeartRateService heartRateService = this.recommendUseCase.getHeartRateService();
        if (heartRateService == null || (flowLoadHeartRateInfo = heartRateService.loadHeartRateInfo(new Date())) == null || (flowFlowOn = FlowKt.flowOn(new Flow<Integer>() { // from class: com.huami.sky.ui.realtime.recommendelement.RecommendElementViewModel$startHrService$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.sky.ui.realtime.recommendelement.RecommendElementViewModel$startHrService$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<HeartRateInfo> {
                public final /* synthetic */ FlowCollector a;

                /* JADX INFO: renamed from: com.huami.sky.ui.realtime.recommendelement.RecommendElementViewModel$startHrService$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.sky.ui.realtime.recommendelement.RecommendElementViewModel$startHrService$$inlined$map$1$2", f = "RecommendElementViewModel.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(HeartRateInfo heartRateInfo, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    HeartRateStatisticalInfo heartRateStatisticalInfo;
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
                        HeartRateInfo heartRateInfo2 = heartRateInfo;
                        Integer numBoxInt = null;
                        if (heartRateInfo2 != null && (heartRateStatisticalInfo = heartRateInfo2.getHeartRateStatisticalInfo()) != null) {
                            numBoxInt = Boxing.boxInt(heartRateStatisticalInfo.getRestHeartRate());
                        }
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
                Object objCollect = flowLoadHeartRateInfo.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Dispatchers.getIO())) == null || (flowOnEach = FlowKt.onEach(flowFlowOn, new b(null))) == null || (flowM4456catch = FlowKt.m4456catch(flowOnEach, new c(null))) == null) {
            return;
        }
        FlowKt.launchIn(flowM4456catch, this.recommendScope);
    }

    private final void b() {
        kotlinx.coroutines.e.f(this.recommendScope, Dispatchers.getIO(), null, new d(System.currentTimeMillis(), null), 2, null);
    }

    private final void c() {
        Flow<List<StepEntry>> flowLoadSteps;
        Flow flowFlowOn;
        Flow flowOnEach;
        Flow flowM4456catch;
        Calendar calendar = Calendar.getInstance();
        Date beginningTime = TimeExtKt.getBeginningTime(calendar);
        Date endingTime = TimeExtKt.getEndingTime(calendar);
        StepService stepService = this.recommendUseCase.getStepService();
        if (stepService == null || (flowLoadSteps = stepService.loadSteps(beginningTime, endingTime)) == null || (flowFlowOn = FlowKt.flowOn(flowLoadSteps, Dispatchers.getIO())) == null || (flowOnEach = FlowKt.onEach(flowFlowOn, new e(null))) == null || (flowM4456catch = FlowKt.m4456catch(flowOnEach, new f(null))) == null) {
            return;
        }
        FlowKt.launchIn(flowM4456catch, this.recommendScope);
    }

    @NotNull
    public final LiveData<Integer> getRestHrLiveData() {
        return this.restHrLiveData;
    }

    @NotNull
    public final LiveData<Long> getSleepLiveData() {
        return this.sleepLiveData;
    }

    @NotNull
    public final LiveData<Integer> getStepLiveData() {
        return this.stepLiveData;
    }

    @NotNull
    public final LiveData<RecommendElementStyle> getStyleLiveData() {
        return this.styleLiveData;
    }

    @NotNull
    public final LiveData<Long> getWakeUpLiveData() {
        return this.wakeUpLiveData;
    }
}
