package com.xiaomi.hm.health.bodyfat.slimming.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.algo.bodyIndex.BodyIndexAnalysis;
import com.huami.algo.bodyIndex.BodyIndexAnalysisImpl;
import com.huami.algo.bodyIndex.LoseWeightSportType;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.UserScaleInfoRepository;
import com.xiaomi.hm.health.bodyfat.slimming.constants.SportTypeContants;
import com.xiaomi.hm.health.bodyfat.slimming.repo.LoseWeightRepo;
import com.xiaomi.hm.health.bodyfat.slimming.repo.LoseWeightWeightInfo;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.UserScaleInfo;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 62\u00020\u0001:\u00016B\u000f\u0012\u0006\u0010!\u001a\u00020\u001f¢\u0006\u0004\b4\u00105J6\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J6\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J6\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0006\u0010\u0014\u001a\u00020\u0013J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015J:\u0010\u001d\u001a$\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u001bj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n`\u001c0\u00152\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\bJ*\u0010\u001d\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u001bj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n`\u001c2\u0006\u0010\u001e\u001a\u00020\u0018R\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010 R\u001d\u0010&\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\"\u0010,\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u00103\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00067"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/slimming/viewmodel/LoseWeightViewModel;", "Landroidx/lifecycle/ViewModel;", "", "loseWeightInKg", "", "gender", "age", "personMode", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "currentWeightInfos", "", "Lcom/xiaomi/hm/health/bodyfat/slimming/viewmodel/LoseWeightSportDetail;", "b", "a", "f", "Lcom/huami/algo/bodyIndex/LoseWeightSportType;", "algoSportType", "", "e", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "getOwnerUserInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/bodyfat/slimming/viewmodel/WeightInfoStatus;", "loadCurrentUserWeightInfo", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightWeightInfo;", "getLoseWeightWeightInfo", "currentSelectInfos", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getLoseWeightPlan", "weightInfo", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightRepo;", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightRepo;", "loseWeightRepo", "Lcom/huami/algo/bodyIndex/BodyIndexAnalysis;", "Lkotlin/Lazy;", "c", "()Lcom/huami/algo/bodyIndex/BodyIndexAnalysis;", "bodyIndexAnalysis", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "getCurrentInfos", "()Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "setCurrentInfos", "(Lcom/xiaomi/hm/health/databases/model/WeightInfos;)V", "currentInfos", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightWeightInfo;", "getCurrentLoseWeightWeightInfo", "()Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightWeightInfo;", "setCurrentLoseWeightWeightInfo", "(Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightWeightInfo;)V", "currentLoseWeightWeightInfo", "<init>", "(Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightRepo;)V", "Companion", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class LoseWeightViewModel extends ViewModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LoseWeightRepo loseWeightRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy bodyIndexAnalysis = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private WeightInfos currentInfos = new WeightInfos();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private LoseWeightWeightInfo currentLoseWeightWeightInfo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/slimming/viewmodel/LoseWeightViewModel$Companion;", "", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "weightInfos", "", "loseWeightInKg", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightWeightInfo;", "getLoseWeightWeightInofs", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LoseWeightWeightInfo getLoseWeightWeightInofs(@NotNull WeightInfos weightInfos, int loseWeightInKg) {
            UserInfos info = UserInfoManager.getManager().getInfo(-1L);
            int weightAge = BodyParamsUtils.getWeightAge(weightInfos.getTimestamp().longValue(), info.getBirthday());
            UserScaleInfo userScaleInfoById = UserScaleInfoRepository.INSTANCE.getInstance().getUserScaleInfoById(info.getUserId());
            Integer numValueOf = userScaleInfoById == null ? null : Integer.valueOf(userScaleInfoById.getMeasureMode());
            return new LoseWeightWeightInfo(weightInfos.getWeight().floatValue(), info.getHeight().intValue(), weightInfos.getEncryptImpedance().intValue(), weightAge, info.getGender().intValue(), numValueOf == null ? info.getMeasureMode() : numValueOf.intValue(), loseWeightInKg);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoseWeightSportType.values().length];
            iArr[LoseWeightSportType.WALKING.ordinal()] = 1;
            iArr[LoseWeightSportType.RUNNING.ordinal()] = 2;
            iArr[LoseWeightSportType.SKIPPING.ordinal()] = 3;
            iArr[LoseWeightSportType.BIKE.ordinal()] = 4;
            iArr[LoseWeightSportType.AEROBICS.ordinal()] = 5;
            iArr[LoseWeightSportType.BADMINTON.ordinal()] = 6;
            iArr[LoseWeightSportType.GATEBALL.ordinal()] = 7;
            iArr[LoseWeightSportType.BOUNCY_BALL.ordinal()] = 8;
            iArr[LoseWeightSportType.TABLE_TENNIS.ordinal()] = 9;
            iArr[LoseWeightSportType.FOOTBALL.ordinal()] = 10;
            iArr[LoseWeightSportType.SQUASH.ordinal()] = 11;
            iArr[LoseWeightSportType.BASKETBALL.ordinal()] = 12;
            iArr[LoseWeightSportType.TENNIS.ordinal()] = 13;
            iArr[LoseWeightSportType.HIKING.ordinal()] = 14;
            iArr[LoseWeightSportType.SWIM.ordinal()] = 15;
            iArr[LoseWeightSportType.FENCING.ordinal()] = 16;
            iArr[LoseWeightSportType.TAE_KWON_DO.ordinal()] = 17;
            iArr[LoseWeightSportType.GOLF.ordinal()] = 18;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/algo/bodyIndex/BodyIndexAnalysisImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<BodyIndexAnalysisImpl> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BodyIndexAnalysisImpl invoke() {
            return new BodyIndexAnalysisImpl();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ LoseWeightSportType a;
        public final /* synthetic */ Ref.FloatRef b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LoseWeightSportType loseWeightSportType, Ref.FloatRef floatRef) {
            super(0);
            this.a = loseWeightSportType;
            this.b = floatRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Sport type is >> " + this.a + ", time is >>" + this.b.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ LoseWeightSportType a;
        public final /* synthetic */ Ref.FloatRef b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LoseWeightSportType loseWeightSportType, Ref.FloatRef floatRef) {
            super(0);
            this.a = loseWeightSportType;
            this.b = floatRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Sport type is >> " + this.a + ", time is >>" + this.b.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightViewModel$getLoseWeightPlan$1", f = "LoseWeightViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ WeightInfos b;
        public final /* synthetic */ LoseWeightViewModel c;
        public final /* synthetic */ float d;
        public final /* synthetic */ MutableLiveData<ArrayList<List<LoseWeightSportDetail>>> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(WeightInfos weightInfos, LoseWeightViewModel loseWeightViewModel, float f, MutableLiveData<ArrayList<List<LoseWeightSportDetail>>> mutableLiveData, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = weightInfos;
            this.c = loseWeightViewModel;
            this.d = f;
            this.e = mutableLiveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WeightInfos currentInfos = this.b;
            if (currentInfos == null) {
                currentInfos = this.c.getCurrentInfos();
            }
            UserInfos info = UserInfoManager.getManager().getInfo(-1L);
            int weightAge = BodyParamsUtils.getWeightAge(currentInfos.getTimestamp().longValue(), info.getBirthday());
            UserScaleInfo userScaleInfoById = UserScaleInfoRepository.INSTANCE.getInstance().getUserScaleInfoById(info.getUserId());
            Integer numBoxInt = userScaleInfoById == null ? null : Boxing.boxInt(userScaleInfoById.getMeasureMode());
            int measureMode = numBoxInt == null ? info.getMeasureMode() : numBoxInt.intValue();
            this.c.setCurrentLoseWeightWeightInfo(new LoseWeightWeightInfo(currentInfos.getWeight().floatValue(), info.getHeight().intValue(), currentInfos.getEncryptImpedance().intValue(), weightAge, info.getGender().intValue(), measureMode, (int) this.d));
            WeightInfos weightInfos = currentInfos;
            this.e.postValue(CollectionsKt__CollectionsKt.arrayListOf(this.c.b(this.d, info.getGender().intValue(), weightAge, measureMode, weightInfos), this.c.a(this.d, info.getGender().intValue(), weightAge, measureMode, weightInfos), this.c.f(this.d, info.getGender().intValue(), weightAge, measureMode, weightInfos)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightViewModel$getLoseWeightWeightInfo$1", f = "LoseWeightViewModel.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ Ref.ObjectRef<MutableLiveData<LoseWeightWeightInfo>> c;
        public final /* synthetic */ LoseWeightViewModel d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Ref.ObjectRef<MutableLiveData<LoseWeightWeightInfo>> objectRef, LoseWeightViewModel loseWeightViewModel, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = objectRef;
            this.d = loseWeightViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MutableLiveData mutableLiveData;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableLiveData<LoseWeightWeightInfo> mutableLiveData2 = this.c.element;
                LoseWeightRepo loseWeightRepo = this.d.loseWeightRepo;
                this.a = mutableLiveData2;
                this.b = 1;
                Object loseWeightWeightInfoObject = loseWeightRepo.getLoseWeightWeightInfoObject(this);
                if (loseWeightWeightInfoObject == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableLiveData = mutableLiveData2;
                obj = loseWeightWeightInfoObject;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableLiveData = (MutableLiveData) this.a;
                ResultKt.throwOnFailure(obj);
            }
            mutableLiveData.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ LoseWeightSportType a;
        public final /* synthetic */ Ref.FloatRef b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(LoseWeightSportType loseWeightSportType, Ref.FloatRef floatRef) {
            super(0);
            this.a = loseWeightSportType;
            this.b = floatRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Sport type is >> " + this.a + ", time is >>" + this.b.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightViewModel$loadCurrentUserWeightInfo$1", f = "LoseWeightViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ MutableLiveData<WeightInfoStatus> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(MutableLiveData<WeightInfoStatus> mutableLiveData, Continuation<? super g> continuation) {
            super(2, continuation);
            this.c = mutableLiveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LoseWeightViewModel.this.new g(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WeightInfos weightInfosSearchCurrentUserWeightInfos = LoseWeightViewModel.this.loseWeightRepo.searchCurrentUserWeightInfos();
            MutableLiveData<WeightInfoStatus> mutableLiveData = this.c;
            LoseWeightViewModel loseWeightViewModel = LoseWeightViewModel.this;
            if (weightInfosSearchCurrentUserWeightInfos == null) {
                mutableLiveData.postValue(WeightInfoStatus.NO_WEIGHT_INFO);
            } else if (weightInfosSearchCurrentUserWeightInfos.getWeight().floatValue() < 40.0f) {
                mutableLiveData.postValue(WeightInfoStatus.SMALLER__WEIGHT);
            } else {
                Integer source = weightInfosSearchCurrentUserWeightInfos.getSource();
                int value = HMDeviceSource.WEIGHT_AMAZFIT_SCALE.getValue();
                if (source != null && source.intValue() == value && weightInfosSearchCurrentUserWeightInfos.getEncryptImpedance() != null && HMWeightUtils.isValidImpedance(weightInfosSearchCurrentUserWeightInfos.getEncryptImpedance().intValue())) {
                    loseWeightViewModel.setCurrentInfos(weightInfosSearchCurrentUserWeightInfos);
                    mutableLiveData.postValue(WeightInfoStatus.VALID);
                } else {
                    mutableLiveData.postValue(WeightInfoStatus.NO_ENCRYPTED_IMPEDANCE);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public LoseWeightViewModel(@NotNull LoseWeightRepo loseWeightRepo) {
        this.loseWeightRepo = loseWeightRepo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<LoseWeightSportDetail> a(float loseWeightInKg, int gender, int age, int personMode, WeightInfos currentWeightInfos) {
        ArrayList<LoseWeightSportType> arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf(LoseWeightSportType.BADMINTON, LoseWeightSportType.GATEBALL, LoseWeightSportType.BOUNCY_BALL, LoseWeightSportType.TABLE_TENNIS, LoseWeightSportType.FOOTBALL, LoseWeightSportType.SQUASH, LoseWeightSportType.BASKETBALL, LoseWeightSportType.TENNIS);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayListArrayListOf, 10));
        for (LoseWeightSportType loseWeightSportType : arrayListArrayListOf) {
            Ref.FloatRef floatRef = new Ref.FloatRef();
            float fLoseWeightPlan = c().loseWeightPlan(loseWeightInKg, currentWeightInfos.getWeight().floatValue(), currentWeightInfos.getHeight().intValue(), gender, age, currentWeightInfos.getEncryptImpedance().intValue(), personMode, loseWeightSportType);
            floatRef.element = fLoseWeightPlan;
            if (fLoseWeightPlan > 1440.0f) {
                floatRef.element = 1440.0f;
            }
            HMLog.debug$default(null, new b(loseWeightSportType, floatRef), 1, null);
            arrayList.add(new LoseWeightSportDetail(loseWeightSportType, e(loseWeightSportType), (int) floatRef.element));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<LoseWeightSportDetail> b(float loseWeightInKg, int gender, int age, int personMode, WeightInfos currentWeightInfos) {
        ArrayList<LoseWeightSportType> arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf(LoseWeightSportType.WALKING, LoseWeightSportType.RUNNING, LoseWeightSportType.SKIPPING, LoseWeightSportType.BIKE, LoseWeightSportType.AEROBICS);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayListArrayListOf, 10));
        for (LoseWeightSportType loseWeightSportType : arrayListArrayListOf) {
            Ref.FloatRef floatRef = new Ref.FloatRef();
            float fLoseWeightPlan = c().loseWeightPlan(loseWeightInKg, currentWeightInfos.getWeight().floatValue(), currentWeightInfos.getHeight().intValue(), gender, age, currentWeightInfos.getEncryptImpedance().intValue(), personMode, loseWeightSportType);
            floatRef.element = fLoseWeightPlan;
            if (fLoseWeightPlan > 1440.0f) {
                floatRef.element = 1440.0f;
            }
            HMLog.debug$default(null, new c(loseWeightSportType, floatRef), 1, null);
            arrayList.add(new LoseWeightSportDetail(loseWeightSportType, e(loseWeightSportType), (int) floatRef.element));
        }
        return arrayList;
    }

    private final BodyIndexAnalysis c() {
        return (BodyIndexAnalysis) this.bodyIndexAnalysis.getValue();
    }

    private final String e(LoseWeightSportType algoSportType) {
        switch (WhenMappings.$EnumSwitchMapping$0[algoSportType.ordinal()]) {
            case 1:
                return "jianzou";
            case 2:
                return SportTypeContants.MAN_PAO;
            case 3:
                return SportTypeContants.TIAO_SHENG;
            case 4:
                return SportTypeContants.QI_CHE;
            case 5:
                return SportTypeContants.YOU_YANG_CAO;
            case 6:
                return SportTypeContants.YU_MAO_QIU;
            case 7:
                return SportTypeContants.MEN_QIU;
            case 8:
                return SportTypeContants.TAN_LI_QIU;
            case 9:
                return SportTypeContants.PING_PANG_QIU;
            case 10:
                return SportTypeContants.ZU_QIU;
            case 11:
                return SportTypeContants.BI_QIU;
            case 12:
                return SportTypeContants.LAN_QIU;
            case 13:
                return SportTypeContants.WANG_QIU;
            case 14:
                return SportTypeContants.PA_SHAN;
            case 15:
                return SportTypeContants.YOU_YONG;
            case 16:
                return SportTypeContants.JI_JIAN;
            case 17:
                return SportTypeContants.TAI_QUAN_DAO;
            case 18:
                return SportTypeContants.GAO_ER_FU;
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<LoseWeightSportDetail> f(float loseWeightInKg, int gender, int age, int personMode, WeightInfos currentWeightInfos) {
        ArrayList<LoseWeightSportType> arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf(LoseWeightSportType.HIKING, LoseWeightSportType.SWIM, LoseWeightSportType.FENCING, LoseWeightSportType.TAE_KWON_DO, LoseWeightSportType.GOLF);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayListArrayListOf, 10));
        for (LoseWeightSportType loseWeightSportType : arrayListArrayListOf) {
            Ref.FloatRef floatRef = new Ref.FloatRef();
            float fLoseWeightPlan = c().loseWeightPlan(loseWeightInKg, currentWeightInfos.getWeight().floatValue(), currentWeightInfos.getHeight().intValue(), gender, age, currentWeightInfos.getEncryptImpedance().intValue(), personMode, loseWeightSportType);
            floatRef.element = fLoseWeightPlan;
            if (fLoseWeightPlan > 1440.0f) {
                floatRef.element = 1440.0f;
            }
            HMLog.debug$default(null, new f(loseWeightSportType, floatRef), 1, null);
            arrayList.add(new LoseWeightSportDetail(loseWeightSportType, e(loseWeightSportType), (int) floatRef.element));
        }
        return arrayList;
    }

    @NotNull
    public final WeightInfos getCurrentInfos() {
        return this.currentInfos;
    }

    @Nullable
    public final LoseWeightWeightInfo getCurrentLoseWeightWeightInfo() {
        return this.currentLoseWeightWeightInfo;
    }

    @NotNull
    public final MutableLiveData<ArrayList<List<LoseWeightSportDetail>>> getLoseWeightPlan(float loseWeightInKg, @Nullable WeightInfos currentSelectInfos) {
        MutableLiveData<ArrayList<List<LoseWeightSportDetail>>> mutableLiveData = new MutableLiveData<>();
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new d(currentSelectInfos, this, loseWeightInKg, mutableLiveData, null), 2, null);
        return mutableLiveData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.lifecycle.MutableLiveData] */
    @NotNull
    public final MutableLiveData<LoseWeightWeightInfo> getLoseWeightWeightInfo() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new MutableLiveData();
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new e(objectRef, this, null), 2, null);
        return (MutableLiveData) objectRef.element;
    }

    @NotNull
    public final UserInfos getOwnerUserInfo() {
        return UserInfoManager.getManager().getInfo(-1L);
    }

    @NotNull
    public final MutableLiveData<WeightInfoStatus> loadCurrentUserWeightInfo() {
        MutableLiveData<WeightInfoStatus> mutableLiveData = new MutableLiveData<>();
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new g(mutableLiveData, null), 2, null);
        return mutableLiveData;
    }

    public final void setCurrentInfos(@NotNull WeightInfos weightInfos) {
        this.currentInfos = weightInfos;
    }

    public final void setCurrentLoseWeightWeightInfo(@Nullable LoseWeightWeightInfo loseWeightWeightInfo) {
        this.currentLoseWeightWeightInfo = loseWeightWeightInfo;
    }

    @NotNull
    public final ArrayList<List<LoseWeightSportDetail>> getLoseWeightPlan(@NotNull LoseWeightWeightInfo weightInfo) {
        WeightInfos weightInfos = new WeightInfos();
        weightInfos.setHeight(Integer.valueOf((int) weightInfo.getHeight()));
        weightInfos.setWeight(Float.valueOf(weightInfo.getWeight()));
        weightInfos.setEncryptImpedance(Integer.valueOf(weightInfo.getEncryptImpedance()));
        return CollectionsKt__CollectionsKt.arrayListOf(b(weightInfo.getLoseWeight(), weightInfo.getGender(), weightInfo.getAge(), weightInfo.getIdentity(), weightInfos), a(weightInfo.getLoseWeight(), weightInfo.getGender(), weightInfo.getAge(), weightInfo.getIdentity(), weightInfos), f(weightInfo.getLoseWeight(), weightInfo.getGender(), weightInfo.getAge(), weightInfo.getIdentity(), weightInfos));
    }
}
