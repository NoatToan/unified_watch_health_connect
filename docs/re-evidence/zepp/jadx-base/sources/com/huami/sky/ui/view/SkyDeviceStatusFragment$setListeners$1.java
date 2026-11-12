package com.huami.sky.ui.view;

import com.huami.sky.lib.assist.SkyDeviceStatus;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.sky.ui.view.SkyDeviceStatusFragment$setListeners$1", f = "SkyDeviceStatusFragment.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {})
public final class SkyDeviceStatusFragment$setListeners$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ SkyDeviceStatusFragment b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ SkyDeviceStatus a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SkyDeviceStatus skyDeviceStatus) {
            super(0);
            this.a = skyDeviceStatus;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "device connectStatus: " + this.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkyDeviceStatusFragment$setListeners$1(SkyDeviceStatusFragment skyDeviceStatusFragment, Continuation<? super SkyDeviceStatusFragment$setListeners$1> continuation) {
        super(2, continuation);
        this.b = skyDeviceStatusFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SkyDeviceStatusFragment$setListeners$1(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SkyDeviceStatusFragment$setListeners$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<SkyDeviceStatus> flowDeviceConnectNotifiers = this.b.b().deviceConnectNotifiers();
            final SkyDeviceStatusFragment skyDeviceStatusFragment = this.b;
            FlowCollector<SkyDeviceStatus> flowCollector = new FlowCollector<SkyDeviceStatus>() { // from class: com.huami.sky.ui.view.SkyDeviceStatusFragment$setListeners$1$invokeSuspend$$inlined$collect$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(SkyDeviceStatus skyDeviceStatus, @NotNull Continuation<? super Unit> continuation) {
                    SkyDeviceStatus skyDeviceStatus2 = skyDeviceStatus;
                    HMLog.info("SkyDeviceStatusFragment", new SkyDeviceStatusFragment$setListeners$1.a(skyDeviceStatus2));
                    skyDeviceStatusFragment.currentDeviceStatus = skyDeviceStatus2;
                    skyDeviceStatusFragment.g(skyDeviceStatus2);
                    return Unit.INSTANCE;
                }
            };
            this.a = 1;
            if (flowDeviceConnectNotifiers.collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
