package com.xiaomi.fitness.training_plan.report;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.training_plan.common.TrainReport;
import com.xiaomi.fitness.training_plan.net.TrainingPlanRequest;
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
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0006\u0010\u0011\u001a\u00020\nR\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\"\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "mTrainReport", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/training_plan/common/TrainReport;", "getMTrainReport", "()Landroidx/lifecycle/MutableLiveData;", "getReport", "", "planID", "", "nextKey", "", "userInfoLiveData", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "getUserInfoLiveData", "setUserInfoLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrainPlanReportViewModel extends AbsViewModel {

    @NotNull
    public static final String TAG = "TrainPlanReportViewModel";

    @NotNull
    private final MutableLiveData<TrainReport> mTrainReport = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<AccountCoreInfo> userInfoLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.report.TrainPlanReportViewModel$getReport$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.report.TrainPlanReportViewModel$getReport$1", f = "TrainPlanReportViewModel.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $nextKey;
        final /* synthetic */ long $planID;
        int label;
        final /* synthetic */ TrainPlanReportViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, String str, TrainPlanReportViewModel trainPlanReportViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$planID = j;
            this.$nextKey = str;
            this.this$0 = trainPlanReportViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$planID, this.$nextKey, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TrainingPlanRequest trainingPlanRequest = new TrainingPlanRequest();
                long j = this.$planID;
                String str = this.$nextKey;
                this.label = 1;
                obj = trainingPlanRequest.getTrainPlanReport(j, str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            TrainReport trainReport = (TrainReport) obj;
            Logger.i(TrainPlanReportViewModel.TAG, "getTrainPlanReport:" + trainReport);
            this.this$0.getMTrainReport().postValue(trainReport);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.report.TrainPlanReportViewModel$getUserInfoLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.report.TrainPlanReportViewModel$getUserInfoLiveData$1", f = "TrainPlanReportViewModel.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public C32811(Continuation<? super C32811> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TrainPlanReportViewModel.this.new C32811(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableLiveData mutableLiveData;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableLiveData<AccountCoreInfo> userInfoLiveData = TrainPlanReportViewModel.this.getUserInfoLiveData();
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
            return ((C32811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @NotNull
    public final MutableLiveData<TrainReport> getMTrainReport() {
        return this.mTrainReport;
    }

    public final void getReport(long planID, @Nullable String nextKey) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(planID, nextKey, this, null), 3, null);
    }

    @NotNull
    public final MutableLiveData<AccountCoreInfo> getUserInfoLiveData() {
        return this.userInfoLiveData;
    }

    public final void setUserInfoLiveData(@NotNull MutableLiveData<AccountCoreInfo> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.userInfoLiveData = mutableLiveData;
    }

    /* JADX INFO: renamed from: getUserInfoLiveData, reason: collision with other method in class */
    public final void m626getUserInfoLiveData() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C32811(null), 2, null);
    }
}
