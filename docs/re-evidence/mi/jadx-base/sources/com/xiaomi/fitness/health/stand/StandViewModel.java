package com.xiaomi.fitness.health.stand;

import android.os.Bundle;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fit.fitness.export.api.repository.IStandRepository;
import com.xiaomi.fit.fitness.export.data.item.ValidStandItem;
import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.health.stand.StandViewModel;
import defpackage.c0j;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0016\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/health/stand/StandViewModel;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "<init>", "()V", "mDataRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IStandRepository;", "getMDataRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IStandRepository;", "mDataRepo$delegate", "Lkotlin/Lazy;", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "insertStandRecord", "startTime", "", "endTime", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StandViewModel extends BasicDataViewModel {

    @NotNull
    public static final String TAG = "StandViewModel";

    /* JADX INFO: renamed from: mDataRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDataRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: cbo
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StandViewModel.mDataRepo_delegate$lambda$0(this.f5168a);
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.stand.StandViewModel$insertStandRecord$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.stand.StandViewModel$insertStandRecord$1", f = "StandViewModel.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endTime;
        final /* synthetic */ long $startTime;
        int label;
        final /* synthetic */ StandViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, long j2, StandViewModel standViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$startTime = j;
            this.$endTime = j2;
            this.this$0 = standViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$startTime, this.$endTime, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ValidStandItem validStandItem = new ValidStandItem(this.$startTime, this.$endTime);
                validStandItem.setSid("xiaomiwear_app_manually");
                IStandRepository mDataRepo = this.this$0.getMDataRepo();
                this.label = 1;
                if (mDataRepo.addRecord(validStandItem, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), c0j.kl);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IStandRepository getMDataRepo() {
        return (IStandRepository) this.mDataRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IStandRepository mDataRepo_delegate$lambda$0(StandViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (IStandRepository) this$0.getRepo(IStandRepository.class);
    }

    @Override // com.xiaomi.fitness.base.BasicDataViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void insertStandRecord(long startTime, long endTime) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(startTime, endTime, this, null), 2, null);
    }
}
