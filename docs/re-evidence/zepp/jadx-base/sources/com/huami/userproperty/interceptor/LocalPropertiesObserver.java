package com.huami.userproperty.interceptor;

import com.huami.userproperty.UserPropertyManager;
import com.huami.userproperty.service.interceptor.Interceptor;
import com.huami.userproperty.service.interceptor.SetInterceptor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u001c\u0010\u000b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016R\u001e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/userproperty/interceptor/LocalPropertiesObserver;", "Lcom/huami/userproperty/service/interceptor/SetInterceptor;", "", "key", "api", "Lkotlinx/coroutines/flow/Flow;", "getPropertyFlow", "Lcom/huami/userproperty/service/interceptor/Interceptor$Chain;", "Lcom/huami/userproperty/service/interceptor/SetInterceptor$Params;", "", "chain", "intercept", "Lkotlinx/coroutines/flow/MutableStateFlow;", "a", "Lkotlinx/coroutines/flow/MutableStateFlow;", "setEvent", "<init>", "()V", "userproperty_release"}, k = 1, mv = {1, 5, 1})
public final class LocalPropertiesObserver implements SetInterceptor {

    @NotNull
    public static final LocalPropertiesObserver INSTANCE = new LocalPropertiesObserver();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final MutableStateFlow<SetInterceptor.Params> setEvent = StateFlowKt.MutableStateFlow(null);

    /* JADX INFO: renamed from: com.huami.userproperty.interceptor.LocalPropertiesObserver$getPropertyFlow$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.userproperty.interceptor.LocalPropertiesObserver$getPropertyFlow$1", f = "LocalPropertiesObserver.kt", i = {0}, l = {23, 42}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super String>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, this.d, continuation);
            anonymousClass1.b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super String> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            final FlowCollector flowCollector;
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    flowCollector = (FlowCollector) this.b;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.b;
            String local = UserPropertyManager.INSTANCE.readLocal(this.c, this.d);
            this.b = flowCollector;
            this.a = 1;
            if (flowCollector.emit(local, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            final Flow flowFilterNotNull = FlowKt.filterNotNull(LocalPropertiesObserver.setEvent);
            final String str = this.c;
            final String str2 = this.d;
            Flow<SetInterceptor.Params> flow = new Flow<SetInterceptor.Params>() { // from class: com.huami.userproperty.interceptor.LocalPropertiesObserver$getPropertyFlow$1$invokeSuspend$$inlined$filter$1
                @Override // kotlinx.coroutines.flow.Flow
                @Nullable
                public Object collect(@NotNull final FlowCollector<? super SetInterceptor.Params> flowCollector2, @NotNull Continuation continuation) {
                    Object objCollect = flowFilterNotNull.collect(new FlowCollector<SetInterceptor.Params>() { // from class: com.huami.userproperty.interceptor.LocalPropertiesObserver$getPropertyFlow$1$invokeSuspend$$inlined$filter$1.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        @Nullable
                        public Object emit(SetInterceptor.Params params, @NotNull Continuation continuation2) {
                            FlowCollector flowCollector3 = flowCollector2;
                            SetInterceptor.Params params2 = params;
                            if (!Boxing.boxBoolean(Intrinsics.areEqual(params2.getKey(), str) && Intrinsics.areEqual(params2.getRegistryApi(), str2)).booleanValue()) {
                                return Unit.INSTANCE;
                            }
                            Object objEmit = flowCollector3.emit(params, continuation2);
                            return objEmit == a.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
                        }
                    }, continuation);
                    return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            FlowCollector<SetInterceptor.Params> flowCollector2 = new FlowCollector<SetInterceptor.Params>() { // from class: com.huami.userproperty.interceptor.LocalPropertiesObserver$getPropertyFlow$1$invokeSuspend$$inlined$collect$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(SetInterceptor.Params params, @NotNull Continuation continuation) {
                    Object objEmit = flowCollector.emit(params.getValue(), continuation);
                    return objEmit == a.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
                }
            };
            this.b = null;
            this.a = 2;
            if (flow.collect(flowCollector2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    private LocalPropertiesObserver() {
    }

    public static /* synthetic */ Flow getPropertyFlow$default(LocalPropertiesObserver localPropertiesObserver, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return localPropertiesObserver.getPropertyFlow(str, str2);
    }

    @NotNull
    public final Flow<String> getPropertyFlow(@NotNull String key, @Nullable String api) {
        return FlowKt.flow(new AnonymousClass1(key, api, null));
    }

    @Override // com.huami.userproperty.service.interceptor.Interceptor
    public /* bridge */ /* synthetic */ Unit intercept(Interceptor.Chain<SetInterceptor.Params, Unit> chain) {
        intercept2(chain);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: intercept, reason: avoid collision after fix types in other method */
    public void intercept2(@NotNull Interceptor.Chain<SetInterceptor.Params, Unit> chain) {
        SetInterceptor.Params params = chain.params();
        setEvent.setValue(params);
        chain.handle(params);
    }
}
