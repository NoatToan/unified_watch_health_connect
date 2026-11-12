package com.xiaomi.fitness.health.curse.vm;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fit.fitness.export.api.CurseApi;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.health.curse.data.DayData;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/health/curse/vm/CurseMonthVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "api", "Lcom/xiaomi/fit/fitness/export/api/CurseApi;", "getApi", "()Lcom/xiaomi/fit/fitness/export/api/CurseApi;", "setApi", "(Lcom/xiaomi/fit/fitness/export/api/CurseApi;)V", "recordsObs", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/HashMap;", "", "Lcom/xiaomi/fitness/health/curse/data/DayData;", "getRecordsObs", "()Landroidx/lifecycle/MutableLiveData;", "reqMonthPeriod", "", "localDate", "Lorg/joda/time/LocalDate;", "attach", "savedInstanceState", "Landroid/os/Bundle;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CurseMonthVM extends AbsViewModel {
    public CurseApi api;

    @NotNull
    private final MutableLiveData<HashMap<Long, DayData>> recordsObs = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseMonthVM$reqMonthPeriod$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseMonthVM$reqMonthPeriod$1", f = "CurseMonthVM.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LocalDate $localDate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LocalDate localDate, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$localDate = localDate;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CurseMonthVM.this.new AnonymousClass1(this.$localDate, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                CurseMonthVM$reqMonthPeriod$1$dataRecords$1 curseMonthVM$reqMonthPeriod$1$dataRecords$1 = new CurseMonthVM$reqMonthPeriod$1$dataRecords$1(this.$localDate, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, curseMonthVM$reqMonthPeriod$1$dataRecords$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CurseMonthVM.this.getRecordsObs().setValue((LinkedHashMap) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final CurseApi getApi() {
        CurseApi curseApi = this.api;
        if (curseApi != null) {
            return curseApi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("api");
        return null;
    }

    @NotNull
    public final MutableLiveData<HashMap<Long, DayData>> getRecordsObs() {
        return this.recordsObs;
    }

    public final void reqMonthPeriod(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(localDate, null), 3, null);
    }

    public final void setApi(@NotNull CurseApi curseApi) {
        Intrinsics.checkNotNullParameter(curseApi, "<set-?>");
        this.api = curseApi;
    }
}
