package com.xiaomi.fitness.sport_eco.view.launch.gym;

import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import defpackage.dzi;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.sport_eco.view.launch.gym.LaunchSportVM$setEcoSettingItem$1$onError$1", f = "LaunchSportVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class LaunchSportVM$setEcoSettingItem$1$onError$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Boolean, Integer, Unit> $callback;
    final /* synthetic */ int $errorCode;
    final /* synthetic */ int $key;
    final /* synthetic */ int $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LaunchSportVM$setEcoSettingItem$1$onError$1(int i, int i2, int i3, Function2<? super Boolean, ? super Integer, Unit> function2, Continuation<? super LaunchSportVM$setEcoSettingItem$1$onError$1> continuation) {
        super(2, continuation);
        this.$key = i;
        this.$value = i2;
        this.$errorCode = i3;
        this.$callback = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LaunchSportVM$setEcoSettingItem$1$onError$1(this.$key, this.$value, this.$errorCode, this.$callback, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Logger.i("LaunchSportVM", "setSettingItem(" + this.$key + "," + this.$value + ") failure:" + this.$errorCode);
        ToastUtil.showToast(ResourceExtKt.getString(dzi.common_set_error));
        this.$callback.invoke(Boxing.boxBoolean(false), Boxing.boxInt(this.$value));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LaunchSportVM$setEcoSettingItem$1$onError$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
