package com.huami.heartrate.viewmodel;

import android.content.Context;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/huami/heartrate/utils/CoroutinueExtKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.heartrate.viewmodel.MeasureHrViewModel$fetchMeasureHrByPaging$$inlined$safeLaunch$1", f = "MeasureHrViewModel.kt", i = {}, l = {45, 46, 49}, m = "invokeSuspend", n = {}, s = {})
public final class MeasureHrViewModel$fetchMeasureHrByPaging$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ MeasureHrViewModel c;
    public final /* synthetic */ Context d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeasureHrViewModel$fetchMeasureHrByPaging$$inlined$safeLaunch$1(Continuation continuation, MeasureHrViewModel measureHrViewModel, Context context) {
        super(2, continuation);
        this.c = measureHrViewModel;
        this.d = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        MeasureHrViewModel$fetchMeasureHrByPaging$$inlined$safeLaunch$1 measureHrViewModel$fetchMeasureHrByPaging$$inlined$safeLaunch$1 = new MeasureHrViewModel$fetchMeasureHrByPaging$$inlined$safeLaunch$1(continuation, this.c, this.d);
        measureHrViewModel$fetchMeasureHrByPaging$$inlined$safeLaunch$1.b = obj;
        return measureHrViewModel$fetchMeasureHrByPaging$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MeasureHrViewModel$fetchMeasureHrByPaging$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MeasureHrViewModel measureHrViewModel;
        Context context;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                measureHrViewModel = this.c;
                context = this.d;
                this.a = 2;
                if (measureHrViewModel.f(context, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HMLog.debug("MeasureHrViewModel", MeasureHrViewModel.c.a);
                this.c.isLoading = false;
            }
            HMLog.debug("MeasureHrViewModel", MeasureHrViewModel.b.a);
            this.c.isLoading = false;
        } else {
            ResultKt.throwOnFailure(obj);
            if (!this.c.isLoading) {
                this.c.isLoading = true;
                Long lastSyncSeconds = this.c.b().getLastSyncSeconds();
                if (lastSyncSeconds != null && lastSyncSeconds.longValue() == 0) {
                    MeasureHrViewModel measureHrViewModel2 = this.c;
                    Context context2 = this.d;
                    this.a = 3;
                    if (measureHrViewModel2.k(context2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    HMLog.debug("MeasureHrViewModel", MeasureHrViewModel.c.a);
                    this.c.isLoading = false;
                } else {
                    MeasureHrViewModel measureHrViewModel3 = this.c;
                    this.a = 1;
                    if (measureHrViewModel3.m(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    measureHrViewModel = this.c;
                    context = this.d;
                    this.a = 2;
                    if (measureHrViewModel.f(context, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    HMLog.debug("MeasureHrViewModel", MeasureHrViewModel.b.a);
                    this.c.isLoading = false;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
