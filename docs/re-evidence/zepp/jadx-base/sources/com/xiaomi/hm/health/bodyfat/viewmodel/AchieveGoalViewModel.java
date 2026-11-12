package com.xiaomi.hm.health.bodyfat.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.manager.WeightGoalManager;
import com.xiaomi.hm.health.bodyfat.utils.BFKeeper;
import com.xiaomi.hm.health.databases.model.WeightGoals;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
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

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/AchieveGoalViewModel;", "Landroidx/lifecycle/ViewModel;", "", "uid", "", "weight", "", "checkIsAchieveGoal", "(JLjava/lang/Float;)V", "Landroidx/lifecycle/MutableLiveData;", "", "a", "Lkotlin/Lazy;", "isAchieveGoal", "()Landroidx/lifecycle/MutableLiveData;", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class AchieveGoalViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy isAchieveGoal = LazyKt__LazyJVMKt.lazy(b.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.viewmodel.AchieveGoalViewModel$checkIsAchieveGoal$1", f = "AchieveGoalViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long b;
        public final /* synthetic */ Float c;
        public final /* synthetic */ AchieveGoalViewModel d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, Float f, AchieveGoalViewModel achieveGoalViewModel, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = j;
            this.c = f;
            this.d = achieveGoalViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, this.d, continuation);
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
            long weightGoalRemind = BFKeeper.getWeightGoalRemind(String.valueOf(this.b));
            if (weightGoalRemind != 0) {
                HMLog.i("checkIsAchieveGoal", "已提醒过达标,uid=" + this.b + ",提醒时间" + weightGoalRemind + ",本次触发达标时间" + System.currentTimeMillis(), new Object[0]);
                return Unit.INSTANCE;
            }
            WeightGoals weightGoalByUserId = WeightGoalManager.getInstance().getWeightGoalByUserId(this.b);
            if (weightGoalByUserId == null) {
                return Unit.INSTANCE;
            }
            if (weightGoalByUserId.getCurrentVal().floatValue() < weightGoalByUserId.getGoal().floatValue()) {
                if (this.c.floatValue() >= weightGoalByUserId.getGoal().floatValue()) {
                    BFKeeper.setWeightGoalRemind(String.valueOf(this.b), System.currentTimeMillis());
                    this.d.isAchieveGoal().postValue(Boxing.boxBoolean(true));
                }
            } else if (this.c.floatValue() <= weightGoalByUserId.getGoal().floatValue()) {
                BFKeeper.setWeightGoalRemind(String.valueOf(this.b), System.currentTimeMillis());
                this.d.isAchieveGoal().postValue(Boxing.boxBoolean(true));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<MutableLiveData<Boolean>> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>();
        }
    }

    public final void checkIsAchieveGoal(long uid, @Nullable Float weight) {
        if (weight == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(uid, weight, this, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<Boolean> isAchieveGoal() {
        return (MutableLiveData) this.isAchieveGoal.getValue();
    }
}
