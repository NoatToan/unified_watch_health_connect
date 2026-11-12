package com.xiaomi.hm.health.play.health;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoRepository;
import com.xiaomi.hm.health.databases.LiveDataSupportKt;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.goal.GoalFunctionsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$J\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\tR\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012R\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012R\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u0010\u001a\u0004\b!\u0010\u0012¨\u0006%"}, d2 = {"Lcom/xiaomi/hm/health/play/health/HealthViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "getScaleBalanceWeightInfo", "", "getUserAge", "", "friendStr", "", "loadFriendListData", "userId", "removeFriendData", "requestGoalValue", "Landroidx/lifecycle/MutableLiveData;", "a", "Landroidx/lifecycle/MutableLiveData;", "getFriendsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "friendsLiveData", "b", "getRemoveFriendLiveData", "removeFriendLiveData", "c", "getGoalSleepValue", "goalSleepValue", GoogleApiAvailabilityLight.a, "getGoalStepValue", "goalStepValue", "e", "getGoalCalorieValue", "goalCalorieValue", "f", "getGoalWeightValue", "goalWeightValue", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> friendsLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> removeFriendLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> goalSleepValue = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> goalStepValue = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> goalCalorieValue = new MutableLiveData<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> goalWeightValue = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0000H\n"}, d2 = {"", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<List<? extends WeightInfos>> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final List<? extends WeightInfos> invoke() {
            return WeightInfoRepository.INSTANCE.getInstance().getOftInfos(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Integer> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(HMPersonInfo.getInstance().getUserInfo().getAge());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.play.health.HealthViewModel$requestGoalValue$1", f = "HealthViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HealthViewModel.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HealthViewModel.this.getGoalSleepValue().postValue(Boxing.boxInt(GoalFunctionsKt.getGoalSleepValue()));
            HealthViewModel.this.getGoalStepValue().postValue(Boxing.boxInt(GoalFunctionsKt.getGoalStepValue()));
            HealthViewModel.this.getGoalCalorieValue().postValue(Boxing.boxInt(GoalFunctionsKt.getGoalCalorieValue()));
            HealthViewModel.this.getGoalWeightValue().postValue(Boxing.boxInt((int) GoalFunctionsKt.getGoalWeightValue()));
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final MutableLiveData<String> getFriendsLiveData() {
        return this.friendsLiveData;
    }

    @NotNull
    public final MutableLiveData<Integer> getGoalCalorieValue() {
        return this.goalCalorieValue;
    }

    @NotNull
    public final MutableLiveData<Integer> getGoalSleepValue() {
        return this.goalSleepValue;
    }

    @NotNull
    public final MutableLiveData<Integer> getGoalStepValue() {
        return this.goalStepValue;
    }

    @NotNull
    public final MutableLiveData<Integer> getGoalWeightValue() {
        return this.goalWeightValue;
    }

    @NotNull
    public final MutableLiveData<String> getRemoveFriendLiveData() {
        return this.removeFriendLiveData;
    }

    @NotNull
    public final LiveData<WeightInfos> getScaleBalanceWeightInfo() {
        return Transformations.map(LiveDataSupportKt.queryByLiveData(new String[]{"WEIGHT_INFOS"}, new a(Long.parseLong(HMPersonInfo.getInstance().getUserInfo().getUserid()))), new Function<List<? extends WeightInfos>, WeightInfos>() { // from class: com.xiaomi.hm.health.play.health.HealthViewModel$getScaleBalanceWeightInfo$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final WeightInfos apply(List<? extends WeightInfos> list) {
                int size;
                List<? extends WeightInfos> list2 = list;
                if (list2 != null && (size = list2.size()) > 0) {
                    return list2.get(size - 1);
                }
                return null;
            }
        });
    }

    @NotNull
    public final LiveData<Integer> getUserAge() {
        return LiveDataSupportKt.queryByLiveData(new String[]{"USER_INFOS"}, b.a);
    }

    public final void loadFriendListData(@NotNull String friendStr) {
        this.friendsLiveData.postValue(friendStr);
    }

    public final void removeFriendData(@NotNull String userId) {
        this.removeFriendLiveData.postValue(userId);
    }

    public final void requestGoalValue() {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new c(null), 2, null);
    }
}
