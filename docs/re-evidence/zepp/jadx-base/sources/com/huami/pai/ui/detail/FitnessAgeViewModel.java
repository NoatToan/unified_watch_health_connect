package com.huami.pai.ui.detail;

import androidx.arch.core.util.Function;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.FlowLiveDataConversions;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.pai.db.po.Pai;
import com.huami.pai.dto.Myself;
import com.huami.pai.livedata.LoadOnActiveLiveData;
import com.huami.pai.repository.Resource;
import com.huami.pai.repository.Status;
import com.huami.pai.repository.detail.FitnessAgeRepo;
import com.huami.pai.vo.AgeChangeState;
import com.huami.pai.vo.ChartDataVo;
import com.huami.pai.vo.FitnessAgeVo;
import com.huami.pai.vo.FitnessAgeVoKt;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\bI\u0010JJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0005R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0013R(\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0&0\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0013R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020#0\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0013R\u001f\u00100\u001a\b\u0012\u0004\u0012\u00020#0\u00108\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010\u0013\u001a\u0004\b.\u0010/R\u001f\u00103\u001a\b\u0012\u0004\u0012\u00020#0\u00108\u0006@\u0006¢\u0006\f\n\u0004\b1\u0010\u0013\u001a\u0004\b2\u0010/R.\u00106\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010(\u0012\u0006\u0012\u0004\u0018\u00010(\u0018\u0001040\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0013R\u001e\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0013R!\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010\u0013\u001a\u0004\b;\u0010/R!\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=0\u00108\u0006@\u0006¢\u0006\f\n\u0004\b>\u0010\u0013\u001a\u0004\b?\u0010/R'\u0010D\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010A0&0\u00108\u0006@\u0006¢\u0006\f\n\u0004\bB\u0010\u0013\u001a\u0004\bC\u0010/R\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006K"}, d2 = {"Lcom/huami/pai/ui/detail/FitnessAgeViewModel;", "Landroidx/lifecycle/ViewModel;", "", "pai", "days", "", "calculateFitnessAge", "refreshAges", "Lcom/huami/pai/dto/Myself;", "a", "Lcom/huami/pai/dto/Myself;", "myself", "Lcom/huami/pai/repository/detail/FitnessAgeRepo;", "b", "Lcom/huami/pai/repository/detail/FitnessAgeRepo;", CommonLanguageSettingFragment.KEY_REPO, "Landroidx/lifecycle/LiveData;", "Lcom/huami/pai/db/po/Pai;", "c", "Landroidx/lifecycle/LiveData;", "todayPai", "Landroidx/lifecycle/MediatorLiveData;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/MediatorLiveData;", "getPredictedFitnessAge", "()Landroidx/lifecycle/MediatorLiveData;", "predictedFitnessAge", "Lcom/huami/pai/ui/detail/FitnessAgePredictor;", "e", "Lcom/huami/pai/ui/detail/FitnessAgePredictor;", "fitnessAgePredictor", "Landroidx/lifecycle/MutableLiveData;", "f", "Landroidx/lifecycle/MutableLiveData;", "refreshAgesTrigger", "", "g", "isValidUserAgeForPai", "Lcom/huami/pai/repository/Resource;", "", "Lcom/huami/pai/vo/FitnessAgeVo;", "h", "ages", "i", "hasFilledQuestionnaire", z.j, "getShowPredictedAges", "()Landroidx/lifecycle/LiveData;", "showPredictedAges", hl.k, "getShowQuestionnaire", "showQuestionnaire", "Lkotlin/Pair;", "l", "latestTwoAges", "", "m", "latestVo2max", GoogleApiAvailabilityLight.b, "getCurrentAge", "currentAge", "Lcom/huami/pai/vo/AgeChangeState;", "o", "getAgeChange", "ageChange", "Lcom/huami/pai/vo/ChartDataVo;", com.google.android.exoplayer2.text.ttml.b.r, "getPoints", "points", "Lcom/huami/pai/ui/detail/PendingAgeParam;", DTransferConstants.SEARCH_KEY, "Lcom/huami/pai/ui/detail/PendingAgeParam;", "pendingAgeParam", "<init>", "(Lcom/huami/pai/dto/Myself;Lcom/huami/pai/repository/detail/FitnessAgeRepo;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class FitnessAgeViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Myself myself;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final FitnessAgeRepo repo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Pai> todayPai;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<Integer> predictedFitnessAge = new MediatorLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private FitnessAgePredictor fitnessAgePredictor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Unit> refreshAgesTrigger;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> isValidUserAgeForPai;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<List<FitnessAgeVo>>> ages;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> hasFilledQuestionnaire;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> showPredictedAges;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> showQuestionnaire;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Pair<FitnessAgeVo, FitnessAgeVo>> latestTwoAges;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Float> latestVo2max;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Integer> currentAge;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final LiveData<AgeChangeState> ageChange;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<ChartDataVo>> points;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    private PendingAgeParam pendingAgeParam;

    /* JADX INFO: renamed from: com.huami.pai.ui.detail.FitnessAgeViewModel$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pai.ui.detail.FitnessAgeViewModel$1", f = "FitnessAgeViewModel.kt", i = {}, l = {363}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.huami.pai.ui.detail.FitnessAgeViewModel$1$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@"}, d2 = {"Lcom/huami/pai/db/po/Pai;", "pai", "", "vo2max", "Lkotlin/Pair;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.pai.ui.detail.FitnessAgeViewModel$1$1", f = "FitnessAgeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function3<Pai, Float, Continuation<? super Pair<? extends Integer, ? extends Float>>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public /* synthetic */ Object c;

            public a(Continuation<? super a> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Nullable Pai pai, @Nullable Float f, @Nullable Continuation<? super Pair<Integer, Float>> continuation) {
                a aVar = new a(continuation);
                aVar.b = pai;
                aVar.c = f;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Integer numBoxInt;
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Pai pai = (Pai) this.b;
                Float f = (Float) this.c;
                Object pair = null;
                if (f != null) {
                    HMLog.v("FitnessAgeViewModel-rhr-vo2max", "rhr from pai: " + (pai != null ? Boxing.boxInt(pai.getRhr()) : null) + ", vo2max from fitness age: " + f, new Object[0]);
                    int iIntValue = 80;
                    if (pai != null && (numBoxInt = Boxing.boxInt(pai.getRhr())) != null) {
                        iIntValue = numBoxInt.intValue();
                    }
                    pair = new Pair(Boxing.boxInt(iIntValue), f);
                }
                return pair;
            }
        }

        /* JADX INFO: renamed from: com.huami.pai.ui.detail.FitnessAgeViewModel$1$b */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b<T> implements Observer {
            public final /* synthetic */ FitnessAgeViewModel a;

            public b(FitnessAgeViewModel fitnessAgeViewModel) {
                this.a = fitnessAgeViewModel;
            }

            @Override // androidx.p008lifecycle.Observer
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void onChanged(Integer num) {
                this.a.getPredictedFitnessAge().setValue(num);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FitnessAgeViewModel.this.new AnonymousClass1(continuation);
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
                Flow flowFlowCombine = FlowKt.flowCombine(FlowLiveDataConversions.asFlow(FitnessAgeViewModel.this.todayPai), FlowLiveDataConversions.asFlow(FitnessAgeViewModel.this.latestVo2max), new a(null));
                final FitnessAgeViewModel fitnessAgeViewModel = FitnessAgeViewModel.this;
                FlowCollector<Pair<? extends Integer, ? extends Float>> flowCollector = new FlowCollector<Pair<? extends Integer, ? extends Float>>() { // from class: com.huami.pai.ui.detail.FitnessAgeViewModel$1$invokeSuspend$$inlined$collect$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(Pair<? extends Integer, ? extends Float> pair, @NotNull Continuation continuation) {
                        Pair<? extends Integer, ? extends Float> pair2 = pair;
                        if (pair2 != null) {
                            FitnessAgePredictor fitnessAgePredictor = new FitnessAgePredictor(ViewModelKt.getViewModelScope(fitnessAgeViewModel), fitnessAgeViewModel.myself.getGetAge().getA().intValue(), fitnessAgeViewModel.myself.isMale().getA().booleanValue(), fitnessAgeViewModel.myself.getGetBmi().getA().floatValue(), pair2.getFirst().intValue(), pair2.getSecond().floatValue());
                            FitnessAgePredictor fitnessAgePredictor2 = fitnessAgeViewModel.fitnessAgePredictor;
                            LiveData<Integer> fitnessAge = fitnessAgePredictor2 == null ? null : fitnessAgePredictor2.getFitnessAge();
                            if (fitnessAge != null) {
                                fitnessAgeViewModel.getPredictedFitnessAge().removeSource(fitnessAge);
                            }
                            fitnessAgeViewModel.getPredictedFitnessAge().addSource(fitnessAgePredictor.getFitnessAge(), new FitnessAgeViewModel.AnonymousClass1.b(fitnessAgeViewModel));
                            fitnessAgeViewModel.fitnessAgePredictor = fitnessAgePredictor;
                            PendingAgeParam pendingAgeParam = fitnessAgeViewModel.pendingAgeParam;
                            if (pendingAgeParam != null) {
                                fitnessAgeViewModel.calculateFitnessAge(pendingAgeParam.getPai(), pendingAgeParam.getDays());
                                fitnessAgeViewModel.pendingAgeParam = null;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.a = 1;
                if (flowFlowCombine.collect(flowCollector, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Integer> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer getA() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return FitnessAgeViewModel.this.myself.getGetAge().getA().intValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u008a@"}, d2 = {"", "isValidUserAge", "filledQuesionnaire", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.pai.ui.detail.FitnessAgeViewModel$showQuestionnaire$1", f = "FitnessAgeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {
        public int a;
        public /* synthetic */ boolean b;
        public /* synthetic */ boolean c;

        public b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Nullable
        public final Object a(boolean z, boolean z2, @Nullable Continuation<? super Boolean> continuation) {
            b bVar = new b(continuation);
            bVar.b = z;
            bVar.c = z2;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Continuation<? super Boolean> continuation) {
            return a(bool.booleanValue(), bool2.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z = this.b;
            boolean z2 = this.c;
            Boolean boolBoxBoolean = Boxing.boxBoolean(z && !z2);
            HMLog.i("FitnessAgeViewModel", "是否健康年龄调查问卷: " + boolBoxBoolean.booleanValue() + ", isValidUserAge: " + z + ", filledQuestionnaire: " + z2, new Object[0]);
            return boolBoxBoolean;
        }
    }

    public FitnessAgeViewModel(@NotNull Myself myself, @NotNull FitnessAgeRepo fitnessAgeRepo) {
        this.myself = myself;
        this.repo = fitnessAgeRepo;
        this.todayPai = fitnessAgeRepo.loadTodayPai();
        MutableLiveData<Unit> mutableLiveData = new MutableLiveData<>();
        this.refreshAgesTrigger = mutableLiveData;
        LiveData<Boolean> map = Transformations.map(LoadOnActiveLiveData.Companion.create$default(LoadOnActiveLiveData.INSTANCE, ViewModelKt.getViewModelScope(this), null, new a(), 2, null), new Function<Integer, Boolean>() { // from class: com.huami.pai.ui.detail.FitnessAgeViewModel$special$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final Boolean apply(Integer num) {
                return Boolean.valueOf(FitnessAgeViewModelKt.a(num.intValue()));
            }
        });
        this.isValidUserAgeForPai = map;
        LiveData<Resource<List<FitnessAgeVo>>> liveDataSwitchMap = Transformations.switchMap(mutableLiveData, new Function<Unit, LiveData<Resource<? extends List<? extends FitnessAgeVo>>>>() { // from class: com.huami.pai.ui.detail.FitnessAgeViewModel$special$$inlined$switchMap$1
            @Override // androidx.arch.core.util.Function
            @NotNull
            public final LiveData<Resource<? extends List<? extends FitnessAgeVo>>> apply(Unit unit) {
                return this.a.repo.loadFitnessAges();
            }
        });
        this.ages = liveDataSwitchMap;
        final Flow flowAsFlow = FlowLiveDataConversions.asFlow(liveDataSwitchMap);
        final Flow<Resource<? extends List<? extends FitnessAgeVo>>> flow = new Flow<Resource<? extends List<? extends FitnessAgeVo>>>() { // from class: com.huami.pai.ui.detail.FitnessAgeViewModel$special$$inlined$filterNot$1

            /* JADX INFO: renamed from: com.huami.pai.ui.detail.FitnessAgeViewModel$special$$inlined$filterNot$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<Resource<? extends List<? extends FitnessAgeVo>>> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ FitnessAgeViewModel$special$$inlined$filterNot$1 b;

                /* JADX INFO: renamed from: com.huami.pai.ui.detail.FitnessAgeViewModel$special$$inlined$filterNot$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.pai.ui.detail.FitnessAgeViewModel$special$$inlined$filterNot$1$2", f = "FitnessAgeViewModel.kt", i = {}, l = {135}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;
                    public Object d;
                    public Object e;
                    public Object f;
                    public Object g;
                    public Object h;
                    public Object i;

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

                public AnonymousClass2(FlowCollector flowCollector, FitnessAgeViewModel$special$$inlined$filterNot$1 fitnessAgeViewModel$special$$inlined$filterNot$1) {
                    this.a = flowCollector;
                    this.b = fitnessAgeViewModel$special$$inlined$filterNot$1;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(Resource<? extends List<? extends FitnessAgeVo>> resource, @NotNull Continuation continuation) {
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
                        Resource<? extends List<? extends FitnessAgeVo>> resource2 = resource;
                        boolean z = false;
                        if (resource2.getStatus() == Status.LOADING) {
                            List<? extends FitnessAgeVo> data = resource2.getData();
                            if (data == null || data.isEmpty()) {
                                z = true;
                            }
                        }
                        if (Boxing.boxBoolean(z).booleanValue()) {
                            return Unit.INSTANCE;
                        }
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(resource, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull FlowCollector<? super Resource<? extends List<? extends FitnessAgeVo>>> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowAsFlow.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        LiveData<Boolean> liveDataAsLiveData$default = FlowLiveDataConversions.asLiveData$default(new Flow<Boolean>() { // from class: com.huami.pai.ui.detail.FitnessAgeViewModel$special$$inlined$map$2

            /* JADX INFO: renamed from: com.huami.pai.ui.detail.FitnessAgeViewModel$special$$inlined$map$2$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<Resource<? extends List<? extends FitnessAgeVo>>> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ FitnessAgeViewModel$special$$inlined$map$2 b;

                /* JADX INFO: renamed from: com.huami.pai.ui.detail.FitnessAgeViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.pai.ui.detail.FitnessAgeViewModel$special$$inlined$map$2$2", f = "FitnessAgeViewModel.kt", i = {}, l = {135}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;
                    public Object d;
                    public Object e;
                    public Object f;
                    public Object g;
                    public Object h;
                    public Object i;
                    public Object j;

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

                public AnonymousClass2(FlowCollector flowCollector, FitnessAgeViewModel$special$$inlined$map$2 fitnessAgeViewModel$special$$inlined$map$2) {
                    this.a = flowCollector;
                    this.b = fitnessAgeViewModel$special$$inlined$map$2;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(Resource<? extends List<? extends FitnessAgeVo>> resource, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    boolean z;
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
                        List<? extends FitnessAgeVo> data = resource.getData();
                        boolean zBooleanValue = false;
                        if (data != null) {
                            if (!data.isEmpty()) {
                                Iterator<T> it2 = data.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z = false;
                                        break;
                                    }
                                    if (Boxing.boxBoolean(!((FitnessAgeVo) it2.next()).isPredicted()).booleanValue()) {
                                        z = true;
                                        break;
                                    }
                                }
                            } else {
                                z = false;
                                break;
                            }
                            Boolean boolBoxBoolean = Boxing.boxBoolean(z);
                            if (boolBoxBoolean != null) {
                                zBooleanValue = boolBoxBoolean.booleanValue();
                            }
                        }
                        Boolean boolBoxBoolean2 = Boxing.boxBoolean(zBooleanValue);
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(boolBoxBoolean2, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull FlowCollector<? super Boolean> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, (CoroutineContext) null, 0L, 3, (Object) null);
        this.hasFilledQuestionnaire = liveDataAsLiveData$default;
        this.showPredictedAges = Transformations.map(liveDataAsLiveData$default, new Function<Boolean, Boolean>() { // from class: com.huami.pai.ui.detail.FitnessAgeViewModel$special$$inlined$map$3
            @Override // androidx.arch.core.util.Function
            public final Boolean apply(Boolean bool) {
                boolean zBooleanValue = bool.booleanValue();
                HMLog.i("FitnessAgeViewModel", "是否显示健康年龄图表和预测滑竿: " + zBooleanValue, new Object[0]);
                return Boolean.valueOf(zBooleanValue);
            }
        });
        this.showQuestionnaire = FlowLiveDataConversions.asLiveData$default(FlowKt.flowCombine(FlowLiveDataConversions.asFlow(map), FlowLiveDataConversions.asFlow(liveDataAsLiveData$default), new b(null)), (CoroutineContext) null, 0L, 3, (Object) null);
        LiveData<Pair<FitnessAgeVo, FitnessAgeVo>> map2 = Transformations.map(liveDataSwitchMap, new Function<Resource<? extends List<? extends FitnessAgeVo>>, Pair<? extends FitnessAgeVo, ? extends FitnessAgeVo>>() { // from class: com.huami.pai.ui.detail.FitnessAgeViewModel$special$$inlined$map$4
            @Override // androidx.arch.core.util.Function
            public final Pair<? extends FitnessAgeVo, ? extends FitnessAgeVo> apply(Resource<? extends List<? extends FitnessAgeVo>> resource) {
                List<? extends FitnessAgeVo> data = resource.getData();
                if (data == null) {
                    return null;
                }
                return FitnessAgeViewModelKt.latestTwoAges(data);
            }
        });
        this.latestTwoAges = map2;
        this.latestVo2max = Transformations.map(map2, new Function<Pair<? extends FitnessAgeVo, ? extends FitnessAgeVo>, Float>() { // from class: com.huami.pai.ui.detail.FitnessAgeViewModel$special$$inlined$map$5
            @Override // androidx.arch.core.util.Function
            public final Float apply(Pair<? extends FitnessAgeVo, ? extends FitnessAgeVo> pair) {
                FitnessAgeVo second;
                Pair<? extends FitnessAgeVo, ? extends FitnessAgeVo> pair2 = pair;
                if (pair2 == null || (second = pair2.getSecond()) == null) {
                    return null;
                }
                return Float.valueOf(second.getVo2max());
            }
        });
        this.currentAge = Transformations.map(map2, new Function<Pair<? extends FitnessAgeVo, ? extends FitnessAgeVo>, Integer>() { // from class: com.huami.pai.ui.detail.FitnessAgeViewModel$special$$inlined$map$6
            @Override // androidx.arch.core.util.Function
            public final Integer apply(Pair<? extends FitnessAgeVo, ? extends FitnessAgeVo> pair) {
                FitnessAgeVo second;
                Pair<? extends FitnessAgeVo, ? extends FitnessAgeVo> pair2 = pair;
                if (pair2 == null || (second = pair2.getSecond()) == null) {
                    return null;
                }
                return Integer.valueOf(FitnessAgeVoKt.getIntAge(second));
            }
        });
        this.ageChange = Transformations.map(map2, new Function<Pair<? extends FitnessAgeVo, ? extends FitnessAgeVo>, AgeChangeState>() { // from class: com.huami.pai.ui.detail.FitnessAgeViewModel$special$$inlined$map$7
            @Override // androidx.arch.core.util.Function
            public final AgeChangeState apply(Pair<? extends FitnessAgeVo, ? extends FitnessAgeVo> pair) {
                FitnessAgeVo first;
                FitnessAgeVo second;
                Pair<? extends FitnessAgeVo, ? extends FitnessAgeVo> pair2 = pair;
                Float fValueOf = (pair2 == null || (first = pair2.getFirst()) == null) ? null : Float.valueOf(first.getAge());
                Float fValueOf2 = (pair2 == null || (second = pair2.getSecond()) == null) ? null : Float.valueOf(second.getAge());
                if (fValueOf == null || fValueOf2 == null) {
                    return null;
                }
                if (fValueOf.floatValue() < fValueOf2.floatValue()) {
                    return AgeChangeState.INCREASED;
                }
                return fValueOf.floatValue() > fValueOf2.floatValue() ? AgeChangeState.DECREASED : AgeChangeState.HOLD;
            }
        });
        this.points = Transformations.map(liveDataSwitchMap, new Function<Resource<? extends List<? extends FitnessAgeVo>>, Resource<? extends ChartDataVo>>() { // from class: com.huami.pai.ui.detail.FitnessAgeViewModel$special$$inlined$map$8
            @Override // androidx.arch.core.util.Function
            public final Resource<? extends ChartDataVo> apply(Resource<? extends List<? extends FitnessAgeVo>> resource) {
                Resource<? extends List<? extends FitnessAgeVo>> resource2 = resource;
                Status status = resource2.getStatus();
                List<? extends FitnessAgeVo> data = resource2.getData();
                return new Resource<>(status, data == null ? null : FitnessAgeViewModelKt.toChartPoints(data), resource2.getMessage());
            }
        });
        e.f(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final void calculateFitnessAge(int pai, int days) {
        FitnessAgePredictor fitnessAgePredictor = this.fitnessAgePredictor;
        if (fitnessAgePredictor != null) {
            fitnessAgePredictor.predicateFitnessAge(pai, days);
        } else {
            this.pendingAgeParam = new PendingAgeParam(pai, days);
        }
    }

    @NotNull
    public final LiveData<AgeChangeState> getAgeChange() {
        return this.ageChange;
    }

    @NotNull
    public final LiveData<Integer> getCurrentAge() {
        return this.currentAge;
    }

    @NotNull
    public final LiveData<Resource<ChartDataVo>> getPoints() {
        return this.points;
    }

    @NotNull
    public final MediatorLiveData<Integer> getPredictedFitnessAge() {
        return this.predictedFitnessAge;
    }

    @NotNull
    public final LiveData<Boolean> getShowPredictedAges() {
        return this.showPredictedAges;
    }

    @NotNull
    public final LiveData<Boolean> getShowQuestionnaire() {
        return this.showQuestionnaire;
    }

    public final void refreshAges() {
        this.refreshAgesTrigger.setValue(Unit.INSTANCE);
    }
}
