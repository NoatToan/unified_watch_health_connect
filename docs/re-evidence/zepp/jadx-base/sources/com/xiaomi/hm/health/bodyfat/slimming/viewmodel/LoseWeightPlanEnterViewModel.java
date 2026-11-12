package com.xiaomi.hm.health.bodyfat.slimming.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bodyfat.slimming.repo.LoseWeightPlan;
import com.xiaomi.hm.health.bodyfat.slimming.repo.LoseWeightRepo;
import com.xiaomi.hm.health.bodyfat.slimming.repo.LoseWeightWeightInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 :2\u00020\u0001:\u0001:B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b8\u00109J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0002R\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007R\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010!\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010(\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010,\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0015\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R>\u00107\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0-j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.`08\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006;"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/slimming/viewmodel/LoseWeightPlanEnterViewModel;", "Landroidx/lifecycle/ViewModel;", "", "a", "b", "loadLoseWeightSetting", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightRepo;", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightRepo;", "loseWeightRepo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightPlan;", "Landroidx/lifecycle/MutableLiveData;", "getLoseWeightPlan", "()Landroidx/lifecycle/MutableLiveData;", "loseWeightPlan", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightWeightInfo;", "c", "getLoseWeightInfo", "loseWeightInfo", "", GoogleApiAvailabilityLight.a, LogUtil.I, "getCurrentLoseWeightGoal", "()I", "setCurrentLoseWeightGoal", "(I)V", "currentLoseWeightGoal", "e", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightPlan;", "getCurrentLoseWeightPlan", "()Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightPlan;", "setCurrentLoseWeightPlan", "(Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightPlan;)V", "currentLoseWeightPlan", "f", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightWeightInfo;", "getCurrentLoseWeightInfo", "()Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightWeightInfo;", "setCurrentLoseWeightInfo", "(Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightWeightInfo;)V", "currentLoseWeightInfo", "g", "getCurrentModifyType", "setCurrentModifyType", "currentModifyType", "Ljava/util/ArrayList;", "", "Lcom/xiaomi/hm/health/bodyfat/slimming/viewmodel/LoseWeightSportDetail;", "Lkotlin/collections/ArrayList;", "h", "Ljava/util/ArrayList;", "getCurrentSportsList", "()Ljava/util/ArrayList;", "setCurrentSportsList", "(Ljava/util/ArrayList;)V", "currentSportsList", "<init>", "(Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightRepo;)V", "Companion", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class LoseWeightPlanEnterViewModel extends ViewModel {
    public static final int DEFAULT_LOSE_WEIGHT_VALUE = 5;
    public static final int NONE_MODIFY_TYPE = -1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LoseWeightRepo loseWeightRepo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private LoseWeightPlan currentLoseWeightPlan;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private LoseWeightWeightInfo currentLoseWeightInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<LoseWeightPlan> loseWeightPlan = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<LoseWeightWeightInfo> loseWeightInfo = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int currentLoseWeightGoal = 5;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int currentModifyType = -1;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private ArrayList<List<LoseWeightSportDetail>> currentSportsList = new ArrayList<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightPlanEnterViewModel$getLoseWeightInfo$1", f = "LoseWeightPlanEnterViewModel.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LoseWeightPlanEnterViewModel.this.new a(continuation);
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
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LoseWeightRepo loseWeightRepo = LoseWeightPlanEnterViewModel.this.loseWeightRepo;
                this.a = 1;
                obj = loseWeightRepo.getLoseWeightWeightInfoObject(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            LoseWeightPlanEnterViewModel.this.getLoseWeightInfo().postValue((LoseWeightWeightInfo) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightPlanEnterViewModel$getLoseWeightpPlan$1", f = "LoseWeightPlanEnterViewModel.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LoseWeightPlanEnterViewModel.this.new b(continuation);
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
                LoseWeightRepo loseWeightRepo = LoseWeightPlanEnterViewModel.this.loseWeightRepo;
                this.a = 1;
                obj = loseWeightRepo.getLoseWeightPlanObject(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            LoseWeightPlanEnterViewModel.this.getLoseWeightPlan().postValue((LoseWeightPlan) obj);
            return Unit.INSTANCE;
        }
    }

    public LoseWeightPlanEnterViewModel(@NotNull LoseWeightRepo loseWeightRepo) {
        this.loseWeightRepo = loseWeightRepo;
    }

    private final void a() {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }

    private final void b() {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(null), 2, null);
    }

    public final int getCurrentLoseWeightGoal() {
        return this.currentLoseWeightGoal;
    }

    @Nullable
    public final LoseWeightWeightInfo getCurrentLoseWeightInfo() {
        return this.currentLoseWeightInfo;
    }

    @Nullable
    public final LoseWeightPlan getCurrentLoseWeightPlan() {
        return this.currentLoseWeightPlan;
    }

    public final int getCurrentModifyType() {
        return this.currentModifyType;
    }

    @NotNull
    public final ArrayList<List<LoseWeightSportDetail>> getCurrentSportsList() {
        return this.currentSportsList;
    }

    @NotNull
    public final MutableLiveData<LoseWeightWeightInfo> getLoseWeightInfo() {
        return this.loseWeightInfo;
    }

    @NotNull
    public final MutableLiveData<LoseWeightPlan> getLoseWeightPlan() {
        return this.loseWeightPlan;
    }

    public final void loadLoseWeightSetting() {
        a();
        b();
    }

    public final void setCurrentLoseWeightGoal(int i) {
        this.currentLoseWeightGoal = i;
    }

    public final void setCurrentLoseWeightInfo(@Nullable LoseWeightWeightInfo loseWeightWeightInfo) {
        this.currentLoseWeightInfo = loseWeightWeightInfo;
    }

    public final void setCurrentLoseWeightPlan(@Nullable LoseWeightPlan loseWeightPlan) {
        this.currentLoseWeightPlan = loseWeightPlan;
    }

    public final void setCurrentModifyType(int i) {
        this.currentModifyType = i;
    }

    public final void setCurrentSportsList(@NotNull ArrayList<List<LoseWeightSportDetail>> arrayList) {
        this.currentSportsList = arrayList;
    }
}
