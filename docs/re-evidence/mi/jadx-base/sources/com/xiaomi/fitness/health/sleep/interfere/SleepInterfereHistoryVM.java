package com.xiaomi.fitness.health.sleep.interfere;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterferePlanListResult;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterfereRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereHistoryVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "planList", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterferePlanListResult;", "getPlanList", "()Landroidx/lifecycle/MutableLiveData;", "request", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereRequest;", "getRequest", "()Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterfereRequest;", "getPlanHistory", "", "next", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepInterfereHistoryVM extends AbsViewModel {

    @NotNull
    private final MutableLiveData<SleepInterferePlanListResult> planList = new MutableLiveData<>();

    @NotNull
    private final SleepInterfereRequest request = new SleepInterfereRequest();

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.interfere.SleepInterfereHistoryVM$getPlanHistory$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.interfere.SleepInterfereHistoryVM$getPlanHistory$1", f = "SleepInterfereHistoryVM.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $next;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$next = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepInterfereHistoryVM.this.new AnonymousClass1(this.$next, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SleepInterfereRequest request = SleepInterfereHistoryVM.this.getRequest();
                String str = this.$next;
                this.label = 1;
                obj = request.getHistoryInterferePlans(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SleepInterfereHistoryVM.this.getPlanList().postValue((SleepInterferePlanListResult) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void getPlanHistory(@Nullable String next) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(next, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<SleepInterferePlanListResult> getPlanList() {
        return this.planList;
    }

    @NotNull
    public final SleepInterfereRequest getRequest() {
        return this.request;
    }
}
