package com.xiaomi.fitness.training_plan.report;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.AbsViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportShareViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "mCustomizeSelectedTabPosition", "", "getMCustomizeSelectedTabPosition", "()I", "setMCustomizeSelectedTabPosition", "(I)V", "curtTabPosition", "getCurtTabPosition", "setCurtTabPosition", "userInfoLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "getUserInfoLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setUserInfoLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrainPlanReportShareViewModel extends AbsViewModel {
    private int curtTabPosition;
    private int mCustomizeSelectedTabPosition;

    @NotNull
    private MutableLiveData<AccountCoreInfo> userInfoLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.report.TrainPlanReportShareViewModel$getUserInfoLiveData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.report.TrainPlanReportShareViewModel$getUserInfoLiveData$1", f = "TrainPlanReportShareViewModel.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TrainPlanReportShareViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableLiveData mutableLiveData;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableLiveData<AccountCoreInfo> userInfoLiveData = TrainPlanReportShareViewModel.this.getUserInfoLiveData();
                UserInfoManager accountManagerExtKt = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE);
                this.L$0 = userInfoLiveData;
                this.label = 1;
                Object miAccountCoreInfo$default = UserInfoManager.getMiAccountCoreInfo$default(accountManagerExtKt, false, this, 1, null);
                if (miAccountCoreInfo$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableLiveData = userInfoLiveData;
                obj = miAccountCoreInfo$default;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableLiveData = (MutableLiveData) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            mutableLiveData.postValue(obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final int getCurtTabPosition() {
        return this.curtTabPosition;
    }

    public final int getMCustomizeSelectedTabPosition() {
        return this.mCustomizeSelectedTabPosition;
    }

    @NotNull
    public final MutableLiveData<AccountCoreInfo> getUserInfoLiveData() {
        return this.userInfoLiveData;
    }

    public final void setCurtTabPosition(int i) {
        this.curtTabPosition = i;
    }

    public final void setMCustomizeSelectedTabPosition(int i) {
        this.mCustomizeSelectedTabPosition = i;
    }

    public final void setUserInfoLiveData(@NotNull MutableLiveData<AccountCoreInfo> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.userInfoLiveData = mutableLiveData;
    }

    /* JADX INFO: renamed from: getUserInfoLiveData, reason: collision with other method in class */
    public final void m625getUserInfoLiveData() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
    }
}
