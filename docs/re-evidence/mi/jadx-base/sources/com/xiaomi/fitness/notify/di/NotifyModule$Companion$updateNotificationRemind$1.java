package com.xiaomi.fitness.notify.di;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.notify.util.NotifyPreference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.notify.di.NotifyModule$Companion$updateNotificationRemind$1", f = "NotifyModule.kt", i = {}, l = {400}, m = "invokeSuspend", n = {}, s = {})
public final class NotifyModule$Companion$updateNotificationRemind$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WearableDeviceModel $currentModel;
    final /* synthetic */ boolean $inCallEnabled;
    final /* synthetic */ boolean $notifyEnabled;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotifyModule$Companion$updateNotificationRemind$1(boolean z, boolean z2, WearableDeviceModel wearableDeviceModel, Continuation<? super NotifyModule$Companion$updateNotificationRemind$1> continuation) {
        super(2, continuation);
        this.$notifyEnabled = z;
        this.$inCallEnabled = z2;
        this.$currentModel = wearableDeviceModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NotifyModule$Companion$updateNotificationRemind$1 notifyModule$Companion$updateNotificationRemind$1 = new NotifyModule$Companion$updateNotificationRemind$1(this.$notifyEnabled, this.$inCallEnabled, this.$currentModel, continuation);
        notifyModule$Companion$updateNotificationRemind$1.L$0 = obj;
        return notifyModule$Companion$updateNotificationRemind$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, Dispatchers.getIO(), null, new NotifyModule$Companion$updateNotificationRemind$1$ignoringBatteryOptimizations$1(null), 2, null);
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
        NotifyPreference notifyPreference = NotifyPreference.INSTANCE;
        boolean z = false;
        boolean z2 = notifyPreference.getNotificationDelayTime() > 0 && System.currentTimeMillis() - notifyPreference.getNotificationDelayCloseTime() > 172800000 && !zBooleanValue;
        if (System.currentTimeMillis() - notifyPreference.getRemindUnLimitCloseTime() > 86400000 && !zBooleanValue) {
            z = true;
        }
        Logger.i(NotifyModule.TAG, "updateNotificationRemind notifyEnabled = " + this.$notifyEnabled + " inCallEnabled = " + this.$inCallEnabled + " showNotificationDelayRemind = " + z2 + " showLimitRemind = " + z);
        if (z2 || z) {
            notifyPreference.setNeedShowRemind(this.$currentModel.getDid(), true);
        }
        NotifyModule.INSTANCE.updateRemindType(Boxing.boxBoolean(this.$notifyEnabled), Boxing.boxBoolean(this.$inCallEnabled), Boxing.boxBoolean(z2), Boxing.boxBoolean(z));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotifyModule$Companion$updateNotificationRemind$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
