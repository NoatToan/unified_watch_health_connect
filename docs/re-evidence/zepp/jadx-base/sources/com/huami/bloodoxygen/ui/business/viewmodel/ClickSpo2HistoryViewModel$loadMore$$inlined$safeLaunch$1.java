package com.huami.bloodoxygen.ui.business.viewmodel;

import com.huami.bigdata.statistics.core.resource.Failure;
import com.huami.bigdata.statistics.core.resource.Resource;
import com.huami.bigdata.statistics.core.resource.Success;
import com.huami.bloodoxygen.core.local.database.entity.ClickMeasuredSpo2;
import com.huami.bloodoxygen.core.usecase.clickspo2.GetReverseClickSpo2UseCase;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/huami/bloodoxygen/ui/coroutines/ExtKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.bloodoxygen.ui.business.viewmodel.ClickSpo2HistoryViewModel$loadMore$$inlined$safeLaunch$1", f = "ClickSpo2HistoryViewModel.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
public final class ClickSpo2HistoryViewModel$loadMore$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ ClickSpo2HistoryViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickSpo2HistoryViewModel$loadMore$$inlined$safeLaunch$1(Continuation continuation, ClickSpo2HistoryViewModel clickSpo2HistoryViewModel) {
        super(2, continuation);
        this.c = clickSpo2HistoryViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ClickSpo2HistoryViewModel$loadMore$$inlined$safeLaunch$1 clickSpo2HistoryViewModel$loadMore$$inlined$safeLaunch$1 = new ClickSpo2HistoryViewModel$loadMore$$inlined$safeLaunch$1(continuation, this.c);
        clickSpo2HistoryViewModel$loadMore$$inlined$safeLaunch$1.b = obj;
        return clickSpo2HistoryViewModel$loadMore$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ClickSpo2HistoryViewModel$loadMore$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Exception {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.c.isLoading) {
                this.c.isLoading = true;
                GetReverseClickSpo2UseCase getReverseClickSpo2UseCase = this.c.getReverseClickSpo2UseCase;
                long j = this.c.from;
                long j2 = this.c.to;
                this.a = 1;
                obj = getReverseClickSpo2UseCase.execute(j, j2, 60, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Resource resource = (Resource) obj;
        if (resource instanceof Failure) {
            this.c.liveData.postValue(null);
            this.c.isLoading = false;
        }
        if (resource instanceof Success) {
            Success success = (Success) resource;
            Collection collection = (Collection) success.getData();
            if (collection == null || collection.isEmpty()) {
                this.c.kvKey.setClickSpo2AllFetched(Boxing.boxBoolean(true));
                this.c.liveData.postValue(Boxing.boxBoolean(true));
            } else {
                this.c.a((List) success.getData());
                this.c.to = ((ClickMeasuredSpo2) CollectionsKt.last((List) success.getData())).getTimestamp() - 1;
                boolean zBooleanValue = Boxing.boxBoolean(((List) success.getData()).size() < 60).booleanValue();
                this.c.liveData.postValue(Boxing.boxBoolean(zBooleanValue));
                if (zBooleanValue) {
                    this.c.kvKey.setClickSpo2AllFetched(Boxing.boxBoolean(true));
                }
            }
            this.c.isLoading = false;
        }
        return Unit.INSTANCE;
    }
}
