package com.xiaomi.fitness.health.curse.vm;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fit.fitness.export.api.CurseApi;
import com.xiaomi.fit.fitness.export.data.aggregation.Record;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.health.curse.data.CurseExtKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000f\u001a\u00020\u0010J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/health/curse/vm/CurseLatestVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "api", "Lcom/xiaomi/fit/fitness/export/api/CurseApi;", "getApi", "()Lcom/xiaomi/fit/fitness/export/api/CurseApi;", "setApi", "(Lcom/xiaomi/fit/fitness/export/api/CurseApi;)V", "recordEmitter", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/health/curse/vm/HistoryRet;", "getRecordEmitter", "()Landroidx/lifecycle/MutableLiveData;", "getLatestRecord", "", "attach", "savedInstanceState", "Landroid/os/Bundle;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CurseLatestVM extends AbsViewModel {
    public CurseApi api;

    @NotNull
    private final MutableLiveData<HistoryRet> recordEmitter = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseLatestVM$getLatestRecord$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseLatestVM$getLatestRecord$1", f = "CurseLatestVM.kt", i = {0}, l = {27}, m = "invokeSuspend", n = {"period"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseLatestVM$getLatestRecord$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseLatestVM$getLatestRecord$1$1", f = "CurseLatestVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05841 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ HistoryRet $period;
            int label;
            final /* synthetic */ CurseLatestVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05841(CurseLatestVM curseLatestVM, HistoryRet historyRet, Continuation<? super C05841> continuation) {
                super(2, continuation);
                this.this$0 = curseLatestVM;
                this.$period = historyRet;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05841(this.this$0, this.$period, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Record record = (Record) CollectionsKt___CollectionsKt.firstOrNull((List) this.this$0.getApi().getLatestRecord(0L, 1));
                if (record == null) {
                    return Unit.INSTANCE;
                }
                this.$period.setPeriod(record);
                this.$period.setSymptoms(this.this$0.getApi().getSymptom(record.getStartMills(), Math.min(record.getEndMills(), CurseExtKt.getTodayZeroMills())));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CurseLatestVM.this.new AnonymousClass1(continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            HistoryRet historyRet;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HistoryRet historyRet2 = new HistoryRet(null, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05841 c05841 = new C05841(CurseLatestVM.this, historyRet2, null);
                this.L$0 = historyRet2;
                this.label = 1;
                if (BuildersKt.withContext(io2, c05841, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                historyRet = historyRet2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                historyRet = (HistoryRet) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            CurseLatestVM.this.getRecordEmitter().setValue(historyRet);
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

    public final void getLatestRecord() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    @NotNull
    public final MutableLiveData<HistoryRet> getRecordEmitter() {
        return this.recordEmitter;
    }

    public final void setApi(@NotNull CurseApi curseApi) {
        Intrinsics.checkNotNullParameter(curseApi, "<set-?>");
        this.api = curseApi;
    }
}
