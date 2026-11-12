package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "", "Landroidx/paging/SimpleProducerScope;", "Landroidx/paging/PageEvent;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", f = "CachedPageEventFlow.kt", i = {0}, l = {83, 117}, m = "invokeSuspend", n = {"$this$simpleChannelFlow"}, s = {"L$0"})
public final class CachedPageEventFlow$downstreamFlow$1<T> extends SuspendLambda implements Function2<SimpleProducerScope<PageEvent<T>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CachedPageEventFlow this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$downstreamFlow$1(CachedPageEventFlow cachedPageEventFlow, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cachedPageEventFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        CachedPageEventFlow$downstreamFlow$1 cachedPageEventFlow$downstreamFlow$1 = new CachedPageEventFlow$downstreamFlow$1(this.this$0, completion);
        cachedPageEventFlow$downstreamFlow$1.L$0 = obj;
        return cachedPageEventFlow$downstreamFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return ((CachedPageEventFlow$downstreamFlow$1) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        SimpleProducerScope simpleProducerScope;
        Object objCreateTemporaryDownstream;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                simpleProducerScope = (SimpleProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                objCreateTemporaryDownstream = obj;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        simpleProducerScope = (SimpleProducerScope) this.L$0;
        FlattenedPageController flattenedPageController = this.this$0.pageController;
        this.L$0 = simpleProducerScope;
        this.label = 1;
        objCreateTemporaryDownstream = flattenedPageController.createTemporaryDownstream(this);
        if (objCreateTemporaryDownstream == coroutine_suspended) {
            return coroutine_suspended;
        }
        SimpleProducerScope simpleProducerScope2 = simpleProducerScope;
        TemporaryDownstream temporaryDownstream = (TemporaryDownstream) objCreateTemporaryDownstream;
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = Integer.MIN_VALUE;
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(simpleProducerScope2, null, null, new CachedPageEventFlow$downstreamFlow$1$historyCollection$1(simpleProducerScope2, temporaryDownstream, intRef, null), 3, null);
        Job[] jobArr = {BuildersKt__Builders_commonKt.launch$default(simpleProducerScope2, null, null, new CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1(this, simpleProducerScope2, temporaryDownstream, jobLaunch$default, intRef, null), 3, null), jobLaunch$default};
        this.L$0 = null;
        this.label = 2;
        if (AwaitKt.joinAll(jobArr, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
