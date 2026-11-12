package com.xiaomi.fitness.notify.di;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.notify.di.NotifyModule$Companion$createBannerSettingsItem$1", f = "NotifyModule.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
public final class NotifyModule$Companion$createBannerSettingsItem$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.BooleanRef $showNotificationDelayRemind;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotifyModule$Companion$createBannerSettingsItem$1(Ref.BooleanRef booleanRef, Continuation<? super NotifyModule$Companion$createBannerSettingsItem$1> continuation) {
        super(2, continuation);
        this.$showNotificationDelayRemind = booleanRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NotifyModule$Companion$createBannerSettingsItem$1 notifyModule$Companion$createBannerSettingsItem$1 = new NotifyModule$Companion$createBannerSettingsItem$1(this.$showNotificationDelayRemind, continuation);
        notifyModule$Companion$createBannerSettingsItem$1.L$0 = obj;
        return notifyModule$Companion$createBannerSettingsItem$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, Dispatchers.getIO(), null, new NotifyModule$Companion$createBannerSettingsItem$1$ignoringBatteryOptimizations$1(null), 2, null);
            this.label = 1;
            obj = deferredAsync$default.await(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Ref.BooleanRef booleanRef = this.$showNotificationDelayRemind;
        booleanRef.element = booleanRef.element && !zBooleanValue;
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotifyModule$Companion$createBannerSettingsItem$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
