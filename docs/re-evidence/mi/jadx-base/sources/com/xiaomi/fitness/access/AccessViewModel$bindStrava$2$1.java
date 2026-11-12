package com.xiaomi.fitness.access;

import com.xiaomi.fitness.access.request.MiscModel;
import com.xiaomi.fitness.access.util.ThirdPartyAccessExtKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.access.AccessViewModel$bindStrava$2$1", f = "AccessViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AccessViewModel$bindStrava$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MiscModel.StravaBindResult $it;
    int label;
    final /* synthetic */ AccessViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessViewModel$bindStrava$2$1(AccessViewModel accessViewModel, MiscModel.StravaBindResult stravaBindResult, Continuation<? super AccessViewModel$bindStrava$2$1> continuation) {
        super(2, continuation);
        this.this$0 = accessViewModel;
        this.$it = stravaBindResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccessViewModel$bindStrava$2$1(this.this$0, this.$it, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.getMStravaBindStateChange().setValue(this.$it);
        this.this$0.getMStravaStartLoading().setValue(Boxing.boxBoolean(false));
        this.this$0.getMStravaRequestBindStateChange().setValue(Boxing.boxBoolean(true));
        this.this$0.getBindStatusLiveData().setValue(Boxing.boxInt(1));
        ThirdPartyAccessExtKt.showOperationToast(0);
        this.this$0.isLoadingLiveData().setValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccessViewModel$bindStrava$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
