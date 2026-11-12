package com.xiaomi.fitness.devicesettings.common.zenmode;

import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.devicesettings.utils.ZenUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.zenmode.ZenModeSettingFragment$onViewCreated$1$1", f = "ZenModeSettingFragment.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
public final class ZenModeSettingFragment$onViewCreated$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ZenModeSettingFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZenModeSettingFragment$onViewCreated$1$1(ZenModeSettingFragment zenModeSettingFragment, Continuation<? super ZenModeSettingFragment$onViewCreated$1$1> continuation) {
        super(2, continuation);
        this.this$0 = zenModeSettingFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(ZenModeSettingFragment zenModeSettingFragment, boolean z) {
        AnyExtKt.main$default(null, new ZenModeSettingFragment$onViewCreated$1$1$1$1(zenModeSettingFragment, null), 1, null);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ZenModeSettingFragment$onViewCreated$1$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ZenUtils zenUtils = ZenUtils.INSTANCE;
            final ZenModeSettingFragment zenModeSettingFragment = this.this$0;
            Function1<? super Boolean, Unit> function1 = new Function1() { // from class: com.xiaomi.fitness.devicesettings.common.zenmode.a
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return ZenModeSettingFragment$onViewCreated$1$1.invokeSuspend$lambda$0(zenModeSettingFragment, ((Boolean) obj2).booleanValue());
                }
            };
            this.label = 1;
            if (zenUtils.setZenModeSyncWithPhone(false, function1, this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ZenModeSettingFragment$onViewCreated$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
